package com.bawei.myanimation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageview);


    }

    public void btn01(View view) {
        //移动动画
        TranslateAnimation ta = new TranslateAnimation(Animation.RELATIVE_TO_PARENT, 0.2f,
                Animation.RELATIVE_TO_PARENT, 0.8f, Animation.RELATIVE_TO_PARENT, 0.2f, Animation.RELATIVE_TO_PARENT, 0.8f);
        ta.setDuration(2000);
        imageView.startAnimation(ta);
        ta.setFillAfter(true);
        Toast.makeText(this, "执行了移动动画", Toast.LENGTH_SHORT).show();
    }

    public void btn02(View view) {
        //缩放动画
        ScaleAnimation sa = new ScaleAnimation(Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        sa.setDuration(2000);
        imageView.startAnimation(sa);
        Toast.makeText(this, "执行了缩放动画", Toast.LENGTH_SHORT).show();
    }

    public void btn03(View view) {
        //旋转动画

        RotateAnimation ra = new RotateAnimation(0f, 360f, Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        ra.setDuration(2000);
        imageView.startAnimation(ra);
        Toast.makeText(this, "执行了旋转动画", Toast.LENGTH_SHORT).show();
    }

    public void btn04(View view) {
        //透明动画
        AlphaAnimation aa = new AlphaAnimation(0f, 1f);
        aa.setDuration(2000);
        imageView.startAnimation(aa);
        Toast.makeText(this, "执行了透明动画", Toast.LENGTH_SHORT).show();
    }
}

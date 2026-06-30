package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public abstract class WelcomeView extends android.widget.LinearLayout {
    public WelcomeView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void a(android.view.View view, long j17) {
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new android.view.animation.LinearInterpolator());
        alphaAnimation.setDuration(j17);
        alphaAnimation.setAnimationListener(new com.tencent.mm.plugin.account.ui.wj(this));
        view.startAnimation(alphaAnimation);
    }
}

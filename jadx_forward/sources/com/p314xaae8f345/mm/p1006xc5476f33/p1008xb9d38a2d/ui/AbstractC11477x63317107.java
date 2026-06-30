package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* renamed from: com.tencent.mm.plugin.account.ui.WelcomeView */
/* loaded from: classes14.dex */
public abstract class AbstractC11477x63317107 extends android.widget.LinearLayout {
    public AbstractC11477x63317107(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void a(android.view.View view, long j17) {
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new android.view.animation.LinearInterpolator());
        alphaAnimation.setDuration(j17);
        alphaAnimation.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.wj(this));
        view.startAnimation(alphaAnimation);
    }
}

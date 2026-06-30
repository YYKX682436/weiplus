package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class k5 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f226929a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.animation.ScaleAnimation f226930b;

    public k5(android.view.View view, android.view.animation.ScaleAnimation scaleAnimation) {
        this.f226929a = view;
        this.f226930b = scaleAnimation;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        this.f226929a.startAnimation(this.f226930b);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}

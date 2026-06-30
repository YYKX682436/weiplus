package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed;

/* loaded from: classes15.dex */
public class f implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.C2720x269bcc07 f126154d;

    public f(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.C2720x269bcc07 c2720x269bcc07) {
        this.f126154d = c2720x269bcc07;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f126154d.f126122z1.m(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}

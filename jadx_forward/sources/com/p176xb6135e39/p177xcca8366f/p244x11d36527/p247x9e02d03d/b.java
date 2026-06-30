package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p247x9e02d03d;

/* loaded from: classes15.dex */
public class b implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.p244x11d36527.p247x9e02d03d.C2685x7132985d f125907d;

    public b(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p247x9e02d03d.C2685x7132985d c2685x7132985d) {
        this.f125907d = c2685x7132985d;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p247x9e02d03d.C2685x7132985d c2685x7132985d = this.f125907d;
        c2685x7132985d.f125898x0.f125921e = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        c2685x7132985d.f125896p0.invalidateSelf();
    }
}

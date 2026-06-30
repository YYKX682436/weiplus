package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes13.dex */
public final class r1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.C12640x8cdfe408 f171507d;

    public r1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.C12640x8cdfe408 c12640x8cdfe408) {
        this.f171507d = c12640x8cdfe408;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        float m52890x2d258f88;
        float m52890x2d258f882;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        long currentPlayTime = animation.getCurrentPlayTime();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.C12640x8cdfe408 c12640x8cdfe408 = this.f171507d;
        c12640x8cdfe408.f170880t = currentPlayTime;
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        m52890x2d258f88 = c12640x8cdfe408.m52890x2d258f88();
        double d17 = floatValue;
        c12640x8cdfe408.f170881u = m52890x2d258f88 * ((float) java.lang.Math.cos(d17));
        m52890x2d258f882 = c12640x8cdfe408.m52890x2d258f88();
        c12640x8cdfe408.f170882v = m52890x2d258f882 * ((float) java.lang.Math.sin(d17));
        c12640x8cdfe408.f170883w = (float) ((floatValue * 360.0f) / 6.283185307179586d);
        c12640x8cdfe408.invalidate();
    }
}

package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class t0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v0 f272192d;

    public t0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v0 v0Var) {
        this.f272192d = v0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v0 v0Var = this.f272192d;
        v0Var.f272221d.L4.setAlpha(floatValue);
        v0Var.f272221d.K4.setAlpha(floatValue);
        v0Var.f272221d.F4.setAlpha(floatValue);
    }
}

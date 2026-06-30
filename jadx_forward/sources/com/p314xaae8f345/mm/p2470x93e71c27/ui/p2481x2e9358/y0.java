package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class y0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f272289d;

    public y0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33) {
        this.f272289d = c19666xfd6e2f33;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f272289d;
        c19666xfd6e2f33.Z3.setBackground(c19666xfd6e2f33.s0(c19666xfd6e2f33.Y5 - ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue(), c19666xfd6e2f33.Z5 - ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue()));
    }
}

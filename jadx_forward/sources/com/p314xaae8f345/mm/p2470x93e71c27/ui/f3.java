package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes13.dex */
public class f3 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.g3 f272367d;

    public f3(com.p314xaae8f345.mm.p2470x93e71c27.ui.g3 g3Var) {
        this.f272367d = g3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.g3 g3Var = this.f272367d;
        g3Var.getClass();
        g3Var.invalidateSelf();
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes10.dex */
public final class x implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.a0 f233516d;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.a0 a0Var) {
        this.f233516d = a0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.a0 a0Var = this.f233516d;
        int i17 = a0Var.f233301p;
        if (i17 == 1) {
            a0Var.f233295g.setAlpha((int) (floatValue * 255));
        } else if (i17 != 2) {
            a0Var.f233296h.setAlpha((int) (floatValue * 255));
        } else {
            a0Var.f233294f.setAlpha((int) (floatValue * 255));
        }
        a0Var.f233293e.invalidate();
    }
}

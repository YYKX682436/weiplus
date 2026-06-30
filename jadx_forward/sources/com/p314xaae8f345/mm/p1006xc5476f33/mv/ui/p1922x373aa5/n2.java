package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes10.dex */
public final class n2 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16692x9f29da01 f233442d;

    public n2(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16692x9f29da01 c16692x9f29da01) {
        this.f233442d = c16692x9f29da01;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16692x9f29da01 c16692x9f29da01 = this.f233442d;
        int i17 = c16692x9f29da01.f233206n;
        if (i17 == 1) {
            c16692x9f29da01.f233200e.setAlpha((int) (floatValue * 255));
        } else if (i17 != 2) {
            c16692x9f29da01.f233201f.setAlpha((int) (floatValue * 255));
        } else {
            c16692x9f29da01.f233199d.setAlpha((int) (floatValue * 255));
        }
        c16692x9f29da01.invalidate();
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes3.dex */
public final class l7 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a f210993d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15037x1b952727 f210994e;

    public l7(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15037x1b952727 activityC15037x1b952727) {
        this.f210993d = c21524xecd57b9a;
        this.f210994e = activityC15037x1b952727;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15037x1b952727 activityC15037x1b952727 = this.f210994e;
        float f17 = 1 - floatValue;
        float f18 = activityC15037x1b952727.E * f17;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a = this.f210993d;
        c21524xecd57b9a.setTranslationX(f18);
        c21524xecd57b9a.setTranslationY(activityC15037x1b952727.F * f17);
        c21524xecd57b9a.setScaleX((activityC15037x1b952727.C * f17) + floatValue);
        c21524xecd57b9a.setScaleY((f17 * activityC15037x1b952727.D) + floatValue);
    }
}

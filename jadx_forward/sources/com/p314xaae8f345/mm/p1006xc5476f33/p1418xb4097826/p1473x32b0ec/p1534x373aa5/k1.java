package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class k1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f197961d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14300xaa703dd8 f197962e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f197963f;

    public k1(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14300xaa703dd8 c14300xaa703dd8, int i18) {
        this.f197961d = i17;
        this.f197962e = c14300xaa703dd8;
        this.f197963f = i18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        int animatedFraction = (int) (it.getAnimatedFraction() * this.f197961d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14300xaa703dd8 c14300xaa703dd8 = this.f197962e;
        c14300xaa703dd8.getLayoutParams().height = this.f197963f + animatedFraction;
        c14300xaa703dd8.requestLayout();
    }
}

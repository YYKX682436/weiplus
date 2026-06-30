package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic;

/* loaded from: classes3.dex */
public final class j0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.c1 f183429d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f183430e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f183431f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f183432g;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.c1 c1Var, int i17, int i18, int i19) {
        this.f183429d = c1Var;
        this.f183430e = i17;
        this.f183431f = i18;
        this.f183432g = i19;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f183429d.f183377f;
        if (c22621x7603e017 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descEdit");
            throw null;
        }
        c22621x7603e017.setPadding(this.f183430e, this.f183431f, this.f183432g, intValue);
    }
}

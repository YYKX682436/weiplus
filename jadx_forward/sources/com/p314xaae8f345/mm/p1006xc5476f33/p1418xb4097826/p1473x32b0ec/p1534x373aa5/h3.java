package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class h3 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14303x54da38a2 f197876d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f197877e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f197878f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f197879g;

    public h3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14303x54da38a2 c14303x54da38a2, int i17, int i18, int i19) {
        this.f197876d = c14303x54da38a2;
        this.f197877e = i17;
        this.f197878f = i18;
        this.f197879g = i19;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14303x54da38a2.a(this.f197876d, this.f197877e, this.f197878f, this.f197879g, ((java.lang.Float) animatedValue).floatValue());
    }
}

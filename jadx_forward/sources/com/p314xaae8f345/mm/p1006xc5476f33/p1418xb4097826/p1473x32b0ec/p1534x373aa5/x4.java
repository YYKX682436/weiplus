package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class x4 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f198326d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f198327e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f198328f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f198329g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14314xae44553 f198330h;

    public x4(float f17, float f18, float f19, float f27, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14314xae44553 c14314xae44553) {
        this.f198326d = f17;
        this.f198327e = f18;
        this.f198328f = f19;
        this.f198329g = f27;
        this.f198330h = c14314xae44553;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        float floatValue = f17 != null ? f17.floatValue() : 1.0f;
        float f18 = this.f198327e;
        float f19 = this.f198326d;
        float f27 = f19 + ((f18 - f19) * floatValue);
        float f28 = this.f198329g;
        float f29 = this.f198328f;
        float f37 = f29 + ((f28 - f29) * floatValue);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14314xae44553.D;
        this.f198330h.j(f27, f37);
    }
}

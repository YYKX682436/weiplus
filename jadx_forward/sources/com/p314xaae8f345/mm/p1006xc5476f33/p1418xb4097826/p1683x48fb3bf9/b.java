package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9;

/* loaded from: classes8.dex */
public final class b implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.AbstractC15490x816864c7 f218377d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f218378e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f218379f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f218380g;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.AbstractC15490x816864c7 abstractC15490x816864c7, boolean z17, float f17, float f18, float f19) {
        this.f218377d = abstractC15490x816864c7;
        this.f218378e = z17;
        this.f218379f = f17;
        this.f218380g = f18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.AbstractC15490x816864c7.f218316x0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.AbstractC15490x816864c7 abstractC15490x816864c7 = this.f218377d;
        android.view.View view = abstractC15490x816864c7.f218324m;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dialogContainer");
            throw null;
        }
        view.setTranslationY(floatValue);
        android.widget.LinearLayout linearLayout = abstractC15490x816864c7.f218327p;
        if (linearLayout != null) {
            linearLayout.setTranslationY(floatValue - 0);
        }
        float f17 = (this.f218378e ? abstractC15490x816864c7.W : abstractC15490x816864c7.V).f218356b;
        abstractC15490x816864c7.getClass();
        float f18 = this.f218379f;
        abstractC15490x816864c7.m63315x461dcb18(0.0f + ((((floatValue - f18) * 1.0f) / (this.f218380g - f18)) * (f17 - 0.0f)));
    }
}

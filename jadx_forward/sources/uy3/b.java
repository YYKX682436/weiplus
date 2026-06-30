package uy3;

/* loaded from: classes8.dex */
public final class b implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.box.AbstractC17267x816864c7 f513456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f513457e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f513458f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f513459g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f513460h;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.box.AbstractC17267x816864c7 abstractC17267x816864c7, boolean z17, float f17, float f18, float f19) {
        this.f513456d = abstractC17267x816864c7;
        this.f513457e = z17;
        this.f513458f = f17;
        this.f513459g = f18;
        this.f513460h = f19;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.box.AbstractC17267x816864c7.F1;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.box.AbstractC17267x816864c7 abstractC17267x816864c7 = this.f513456d;
        android.view.View view = abstractC17267x816864c7.f240223n;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dialogContainer");
            throw null;
        }
        view.setTranslationY(floatValue);
        abstractC17267x816864c7.i(floatValue);
        float f17 = (this.f513457e ? abstractC17267x816864c7.B1 : abstractC17267x816864c7.A1).f513454b;
        abstractC17267x816864c7.getClass();
        float f18 = this.f513458f;
        float f19 = ((floatValue - f18) * 1.0f) / (this.f513459g - f18);
        float f27 = this.f513460h;
        abstractC17267x816864c7.m68532x461dcb18(f27 + (f19 * (f17 - f27)));
    }
}

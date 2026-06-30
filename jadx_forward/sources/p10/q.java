package p10;

/* loaded from: classes8.dex */
public final class q implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f432510d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f432511e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f432512f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f432513g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.C10541x905158a3 f432514h;

    public q(float f17, float f18, float f19, float f27, com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.C10541x905158a3 c10541x905158a3) {
        this.f432510d = f17;
        this.f432511e = f18;
        this.f432512f = f19;
        this.f432513g = f27;
        this.f432514h = c10541x905158a3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        float f17 = this.f432511e;
        float f18 = this.f432510d;
        float f19 = f18 + ((f17 - f18) * floatValue);
        float f27 = this.f432513g;
        float f28 = this.f432512f;
        float f29 = f28 + ((f27 - f28) * floatValue);
        int i17 = com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.C10541x905158a3.G;
        this.f432514h.c(2, f19, f29);
    }
}

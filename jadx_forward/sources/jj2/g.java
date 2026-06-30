package jj2;

/* loaded from: classes10.dex */
public final class g implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f381516d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f381517e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f381518f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f381519g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ jj2.a f381520h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 f381521i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f381522m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v65.n f381523n;

    public g(float f17, int i17, int i18, int i19, int i27, int i28, jj2.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 c14246xaa893502, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, v65.n nVar) {
        this.f381516d = f17;
        this.f381517e = i17;
        this.f381518f = i18;
        this.f381519g = i27;
        this.f381520h = aVar;
        this.f381521i = c14246xaa893502;
        this.f381522m = c0Var;
        this.f381523n = nVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        float f17 = this.f381517e;
        float f18 = this.f381516d - ((int) ((r1 - f17) * floatValue));
        int i17 = this.f381518f - ((int) ((r0 - 1) * floatValue));
        int i18 = this.f381519g - ((int) ((r0 + 0) * floatValue));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 c14246xaa893502 = this.f381521i;
        jj2.d dVar = c14246xaa893502.f193253f;
        if (dVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("initData");
            throw null;
        }
        this.f381520h.b(new jj2.d(i17, dVar.f381508b, f18, i18, android.graphics.Paint.Style.STROKE));
        if (floatValue > 0.3f) {
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f381522m;
            if (c0Var.f391645d || !c14246xaa893502.f193256i) {
                return;
            }
            c0Var.f391645d = true;
            this.f381523n.a(jz5.f0.f384359a);
        }
    }
}

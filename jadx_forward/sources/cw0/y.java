package cw0;

/* loaded from: classes5.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw0.w0 f304228d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw0.l0 f304229e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f304230f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Float f304231g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Float f304232h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(cw0.w0 w0Var, cw0.l0 l0Var, float f17, java.lang.Float f18, java.lang.Float f19) {
        super(1);
        this.f304228d = w0Var;
        this.f304229e = l0Var;
        this.f304230f = f17;
        this.f304231g = f18;
        this.f304232h = f19;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        this.f304228d.H();
        float f17 = this.f304230f;
        cw0.l0 l0Var = this.f304229e;
        l0Var.T7(f17, this.f304231g, this.f304232h);
        p3325xe03a0797.p3326xc267989b.l.d(l0Var.m158345xefc66565(), null, null, new cw0.x(l0Var, null), 3, null);
        return java.lang.Boolean.TRUE;
    }
}

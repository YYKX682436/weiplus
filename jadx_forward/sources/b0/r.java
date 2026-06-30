package b0;

/* loaded from: classes14.dex */
public final class r implements b0.f3 {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.l f98019a;

    /* renamed from: b, reason: collision with root package name */
    public final b0.p2 f98020b;

    /* renamed from: c, reason: collision with root package name */
    public final a0.n2 f98021c;

    /* renamed from: d, reason: collision with root package name */
    public final n0.v2 f98022d;

    public r(yz5.l onDelta) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onDelta, "onDelta");
        this.f98019a = onDelta;
        this.f98020b = new b0.q(this);
        this.f98021c = new a0.n2();
        this.f98022d = n0.s4.c(java.lang.Boolean.FALSE, null, 2, null);
    }

    @Override // b0.f3
    public boolean a() {
        return ((java.lang.Boolean) ((n0.q4) this.f98022d).mo128745x754a37bb()).booleanValue();
    }

    @Override // b0.f3
    public float b(float f17) {
        return ((java.lang.Number) this.f98019a.mo146xb9724478(java.lang.Float.valueOf(f17))).floatValue();
    }

    @Override // b0.f3
    public java.lang.Object c(a0.k2 k2Var, yz5.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object f17 = p3325xe03a0797.p3326xc267989b.z0.f(new b0.p(this, k2Var, pVar, null), interfaceC29045xdcb5ca57);
        return f17 == pz5.a.f440719d ? f17 : jz5.f0.f384359a;
    }
}

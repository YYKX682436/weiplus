package a0;

/* loaded from: classes14.dex */
public final class m3 implements b0.f3 {

    /* renamed from: f, reason: collision with root package name */
    public static final w0.x f81759f = w0.b0.a(a0.j3.f81724d, a0.k3.f81735d);

    /* renamed from: a, reason: collision with root package name */
    public final n0.v2 f81760a;

    /* renamed from: b, reason: collision with root package name */
    public final c0.o f81761b;

    /* renamed from: c, reason: collision with root package name */
    public final n0.v2 f81762c;

    /* renamed from: d, reason: collision with root package name */
    public float f81763d;

    /* renamed from: e, reason: collision with root package name */
    public final b0.f3 f81764e;

    public m3(int i17) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        n0.h5 h5Var = n0.h5.f415062a;
        this.f81760a = n0.s4.b(valueOf, h5Var);
        this.f81761b = new c0.p();
        this.f81762c = n0.s4.b(Integer.MAX_VALUE, h5Var);
        this.f81764e = new b0.r(new a0.l3(this));
    }

    @Override // b0.f3
    public boolean a() {
        return ((b0.r) this.f81764e).a();
    }

    @Override // b0.f3
    public float b(float f17) {
        return ((b0.r) this.f81764e).b(f17);
    }

    @Override // b0.f3
    public java.lang.Object c(a0.k2 k2Var, yz5.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object c17 = ((b0.r) this.f81764e).c(k2Var, pVar, interfaceC29045xdcb5ca57);
        return c17 == pz5.a.f440719d ? c17 : jz5.f0.f384359a;
    }

    public final int d() {
        return ((java.lang.Number) this.f81760a.mo128745x754a37bb()).intValue();
    }
}

package vz0;

/* loaded from: classes14.dex */
public final class d0 implements b0.f3 {

    /* renamed from: g, reason: collision with root package name */
    public static final w0.x f523126g = w0.b.a(vz0.z.f523186d, vz0.a0.f523109d);

    /* renamed from: a, reason: collision with root package name */
    public final e0.f1 f523127a;

    /* renamed from: b, reason: collision with root package name */
    public final n0.v2 f523128b;

    /* renamed from: c, reason: collision with root package name */
    public final n0.e5 f523129c = n0.s4.a(new vz0.c0(this));

    /* renamed from: d, reason: collision with root package name */
    public final n0.e5 f523130d = n0.s4.a(new vz0.b0(this));

    /* renamed from: e, reason: collision with root package name */
    public final n0.v2 f523131e = n0.s4.c(null, null, 2, null);

    /* renamed from: f, reason: collision with root package name */
    public final n0.v2 f523132f = n0.s4.c(null, null, 2, null);

    public d0(int i17) {
        this.f523127a = new e0.f1(i17, 0);
        this.f523128b = n0.s4.c(java.lang.Integer.valueOf(i17), null, 2, null);
    }

    @Override // b0.f3
    public boolean a() {
        return this.f523127a.a();
    }

    @Override // b0.f3
    public float b(float f17) {
        return this.f523127a.b(f17);
    }

    @Override // b0.f3
    public java.lang.Object c(a0.k2 k2Var, yz5.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object c17 = this.f523127a.c(k2Var, pVar, interfaceC29045xdcb5ca57);
        return c17 == pz5.a.f440719d ? c17 : jz5.f0.f384359a;
    }

    public final e0.n d() {
        java.lang.Object obj;
        java.util.List b17 = this.f523127a.f().b();
        java.util.ListIterator listIterator = b17.listIterator(b17.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((e0.q0) ((e0.n) obj)).f327211a <= 0) {
                break;
            }
        }
        return (e0.n) obj;
    }

    public final int e() {
        return ((java.lang.Number) this.f523128b.mo128745x754a37bb()).intValue();
    }

    /* renamed from: toString */
    public java.lang.String m172992x9616526c() {
        return "PagerState(pageCount=" + ((java.lang.Number) ((n0.x1) this.f523129c).mo128745x754a37bb()).intValue() + ", currentPage=" + e() + ", currentPageOffset=" + ((java.lang.Number) ((n0.x1) this.f523130d).mo128745x754a37bb()).floatValue() + ')';
    }
}

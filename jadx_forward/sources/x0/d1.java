package x0;

/* loaded from: classes14.dex */
public final class d1 extends x0.e {

    /* renamed from: m, reason: collision with root package name */
    public final x0.e f532406m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f532407n;

    public d1(x0.e eVar, yz5.l lVar, yz5.l lVar2, boolean z17) {
        super(0, x0.s.f532472h, x0.z.j(lVar, (eVar == null || (r1 = eVar.f532408f) == null) ? ((x0.d) x0.z.f532502h.get()).f532408f : r1, z17), x0.z.b(lVar2, (eVar == null || (r1 = eVar.f532409g) == null) ? ((x0.d) x0.z.f532502h.get()).f532409g : r1));
        yz5.l lVar3;
        yz5.l lVar4;
        this.f532406m = eVar;
        this.f532407n = z17;
    }

    public final x0.e A() {
        x0.e eVar = this.f532406m;
        if (eVar != null) {
            return eVar;
        }
        java.lang.Object obj = x0.z.f532502h.get();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "currentGlobalSnapshot.get()");
        return (x0.e) obj;
    }

    @Override // x0.e, x0.m
    public void c() {
        this.f532443c = true;
    }

    @Override // x0.m
    public int d() {
        return A().d();
    }

    @Override // x0.m
    public x0.s e() {
        return A().e();
    }

    @Override // x0.e, x0.m
    public boolean g() {
        return A().g();
    }

    @Override // x0.e, x0.m
    public void j(x0.m snapshot) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshot, "snapshot");
        x0.m0.a();
        throw null;
    }

    @Override // x0.e, x0.m
    public void k(x0.m snapshot) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshot, "snapshot");
        x0.m0.a();
        throw null;
    }

    @Override // x0.e, x0.m
    public void l() {
        A().l();
    }

    @Override // x0.e, x0.m
    public void m(x0.z0 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        A().m(state);
    }

    @Override // x0.m
    public void p(int i17) {
        x0.m0.a();
        throw null;
    }

    @Override // x0.m
    public void q(x0.s value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        x0.m0.a();
        throw null;
    }

    @Override // x0.e, x0.m
    public x0.m r(yz5.l lVar) {
        return !this.f532407n ? x0.z.g(A().r(null), lVar) : A().r(x0.z.j(lVar, this.f532408f, true));
    }

    @Override // x0.e
    public x0.p t() {
        return A().t();
    }

    @Override // x0.e
    public java.util.Set u() {
        return A().u();
    }

    @Override // x0.e
    public void x(java.util.Set set) {
        x0.m0.a();
        throw null;
    }

    @Override // x0.e
    public x0.e y(yz5.l lVar, yz5.l lVar2) {
        yz5.l j17 = x0.z.j(lVar, this.f532408f, true);
        yz5.l b17 = x0.z.b(lVar2, this.f532409g);
        return !this.f532407n ? new x0.d1(A().y(null, b17), j17, b17, false) : A().y(j17, b17);
    }
}

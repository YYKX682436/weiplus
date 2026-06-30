package x0;

/* loaded from: classes14.dex */
public final class e1 extends x0.m {

    /* renamed from: f, reason: collision with root package name */
    public final x0.m f532415f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f532416g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.l f532417h;

    public e1(x0.m mVar, yz5.l lVar, boolean z17) {
        super(0, x0.s.f532472h, null);
        yz5.l f17;
        this.f532415f = mVar;
        this.f532416g = z17;
        this.f532417h = x0.z.j(lVar, (mVar == null || (f17 = mVar.f()) == null) ? ((x0.d) x0.z.f532502h.get()).f532408f : f17, z17);
    }

    @Override // x0.m
    public void c() {
        this.f532443c = true;
    }

    @Override // x0.m
    public int d() {
        return s().d();
    }

    @Override // x0.m
    public x0.s e() {
        return s().e();
    }

    @Override // x0.m
    public yz5.l f() {
        return this.f532417h;
    }

    @Override // x0.m
    public boolean g() {
        return s().g();
    }

    @Override // x0.m
    public yz5.l h() {
        return null;
    }

    @Override // x0.m
    public void j(x0.m snapshot) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshot, "snapshot");
        x0.m0.a();
        throw null;
    }

    @Override // x0.m
    public void k(x0.m snapshot) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshot, "snapshot");
        x0.m0.a();
        throw null;
    }

    @Override // x0.m
    public void l() {
        s().l();
    }

    @Override // x0.m
    public void m(x0.z0 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        s().m(state);
    }

    @Override // x0.m
    public x0.m r(yz5.l lVar) {
        return !this.f532416g ? x0.z.g(s().r(null), lVar) : s().r(x0.z.j(lVar, this.f532417h, true));
    }

    public final x0.m s() {
        x0.m mVar = this.f532415f;
        if (mVar != null) {
            return mVar;
        }
        java.lang.Object obj = x0.z.f532502h.get();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "currentGlobalSnapshot.get()");
        return (x0.m) obj;
    }
}

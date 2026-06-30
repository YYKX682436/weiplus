package x0;

/* loaded from: classes14.dex */
public final class h extends x0.m {

    /* renamed from: f, reason: collision with root package name */
    public final x0.m f532426f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f532427g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i17, x0.s invalid, yz5.l lVar, x0.m parent) {
        super(i17, invalid, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invalid, "invalid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        this.f532426f = parent;
        parent.j(this);
        if (lVar != null) {
            yz5.l f17 = parent.f();
            if (f17 != null) {
                lVar = new x0.g(lVar, f17);
            }
        } else {
            lVar = parent.f();
        }
        this.f532427g = lVar;
    }

    @Override // x0.m
    public void c() {
        if (this.f532443c) {
            return;
        }
        int i17 = this.f532442b;
        x0.m mVar = this.f532426f;
        if (i17 != mVar.d()) {
            a();
        }
        mVar.k(this);
        this.f532443c = true;
        synchronized (x0.z.f532496b) {
            int i18 = this.f532444d;
            if (i18 >= 0) {
                x0.z.s(i18);
                this.f532444d = -1;
            }
        }
    }

    @Override // x0.m
    public yz5.l f() {
        return this.f532427g;
    }

    @Override // x0.m
    public boolean g() {
        return true;
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
    }

    @Override // x0.m
    public void m(x0.z0 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        n0.c5 c5Var = x0.z.f532495a;
        throw new java.lang.IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    @Override // x0.m
    public x0.m r(yz5.l lVar) {
        return new x0.h(this.f532442b, this.f532441a, lVar, this.f532426f);
    }
}

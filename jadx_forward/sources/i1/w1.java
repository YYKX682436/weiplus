package i1;

/* loaded from: classes14.dex */
public final class w1 extends h1.c {

    /* renamed from: i, reason: collision with root package name */
    public final n0.v2 f368595i;

    /* renamed from: m, reason: collision with root package name */
    public final n0.v2 f368596m;

    /* renamed from: n, reason: collision with root package name */
    public final i1.i0 f368597n;

    /* renamed from: o, reason: collision with root package name */
    public n0.f1 f368598o;

    /* renamed from: p, reason: collision with root package name */
    public final n0.v2 f368599p;

    /* renamed from: q, reason: collision with root package name */
    public float f368600q;

    /* renamed from: r, reason: collision with root package name */
    public e1.z f368601r;

    public w1() {
        int i17 = d1.k.f307176d;
        this.f368595i = n0.s4.c(new d1.k(d1.k.f307174b), null, 2, null);
        this.f368596m = n0.s4.c(java.lang.Boolean.FALSE, null, 2, null);
        i1.i0 i0Var = new i1.i0();
        i0Var.f368464e = new i1.v1(this);
        this.f368597n = i0Var;
        this.f368599p = n0.s4.c(java.lang.Boolean.TRUE, null, 2, null);
        this.f368600q = 1.0f;
    }

    @Override // h1.c
    public boolean a(float f17) {
        this.f368600q = f17;
        return true;
    }

    @Override // h1.c
    public boolean e(e1.z zVar) {
        this.f368601r = zVar;
        return true;
    }

    @Override // h1.c
    public long h() {
        return ((d1.k) ((n0.q4) this.f368595i).mo128745x754a37bb()).f307177a;
    }

    @Override // h1.c
    public void i(g1.i iVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iVar, "<this>");
        e1.z zVar = this.f368601r;
        i1.i0 i0Var = this.f368597n;
        if (zVar == null) {
            zVar = (e1.z) ((n0.q4) i0Var.f368465f).mo128745x754a37bb();
        }
        if (((java.lang.Boolean) ((n0.q4) this.f368596m).mo128745x754a37bb()).booleanValue() && iVar.mo130620x6fcfed3f() == p2.s.Rtl) {
            long r17 = iVar.r();
            g1.b bVar = (g1.b) iVar.p();
            long b17 = bVar.b();
            bVar.a().c();
            ((g1.d) bVar.f349037a).d(-1.0f, 1.0f, r17);
            i0Var.e(iVar, this.f368600q, zVar);
            bVar.a().b();
            bVar.c(b17);
        } else {
            i0Var.e(iVar, this.f368600q, zVar);
        }
        n0.v2 v2Var = this.f368599p;
        if (((java.lang.Boolean) ((n0.q4) v2Var).mo128745x754a37bb()).booleanValue()) {
            ((n0.q4) v2Var).mo148714x53d8522f(java.lang.Boolean.FALSE);
        }
    }

    public final void j(java.lang.String name, float f17, float f18, yz5.r content, n0.o oVar, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        java.lang.Object obj = n0.e1.f415025a;
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(1264894527);
        i1.i0 i0Var = this.f368597n;
        i0Var.getClass();
        i1.b bVar = i0Var.f368461b;
        bVar.getClass();
        bVar.f368356i = name;
        bVar.c();
        if (!(i0Var.f368466g == f17)) {
            i0Var.f368466g = f17;
            i0Var.f368462c = true;
            i0Var.f368464e.mo152xb9724478();
        }
        if (!(i0Var.f368467h == f18)) {
            i0Var.f368467h = f18;
            i0Var.f368462c = true;
            i0Var.f368464e.mo152xb9724478();
        }
        n0.g1 b17 = n0.l.b(y0Var, 0);
        n0.f1 f1Var = this.f368598o;
        if (f1Var == null || f1Var.a()) {
            f1Var = n0.k1.a(new i1.e0(bVar), b17);
        }
        this.f368598o = f1Var;
        f1Var.b(u0.j.c(-1916507005, true, new i1.u1(content, this)));
        n0.d2.c(f1Var, new i1.s1(f1Var), y0Var, 8);
        n0.f4 q17 = y0Var.q();
        if (q17 == null) {
            return;
        }
        ((n0.l3) q17).f415141d = new i1.t1(this, name, f17, f18, content, i17);
    }
}

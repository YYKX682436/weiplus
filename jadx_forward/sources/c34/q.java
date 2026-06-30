package c34;

/* loaded from: classes11.dex */
public class q extends c34.z implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: e, reason: collision with root package name */
    public float f119757e;

    /* renamed from: f, reason: collision with root package name */
    public float f119758f;

    /* renamed from: g, reason: collision with root package name */
    public int f119759g;

    /* renamed from: h, reason: collision with root package name */
    public int f119760h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f119761i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f119762m;

    /* renamed from: n, reason: collision with root package name */
    public i11.e f119763n;

    /* renamed from: o, reason: collision with root package name */
    public c34.n f119764o;

    /* renamed from: p, reason: collision with root package name */
    public c34.m f119765p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f119766q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.Runnable f119767r;

    /* renamed from: s, reason: collision with root package name */
    public final i11.c f119768s;

    public q(android.content.Context context, c34.x xVar) {
        super(xVar);
        this.f119757e = -85.0f;
        this.f119758f = -1000.0f;
        this.f119759g = 1;
        this.f119760h = -1000;
        this.f119761i = false;
        this.f119762m = true;
        this.f119766q = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        this.f119767r = new c34.o(this);
        this.f119768s = new c34.p(this);
    }

    @Override // c34.z
    public void a() {
        g();
        this.f119780d = null;
        c01.d9.e().q(161, this);
        c01.d9.e().q(162, this);
        c01.d9.e().q(1251, this);
        i11.e eVar = this.f119763n;
        if (eVar != null) {
            ((i11.h) eVar).m(this.f119768s);
        }
    }

    @Override // c34.z
    public void b() {
        c01.d9.e().a(161, this);
        c01.d9.e().a(162, this);
        c01.d9.e().a(1251, this);
        f();
    }

    @Override // c34.z
    public void c() {
        i11.e eVar = this.f119763n;
        if (eVar != null) {
            ((i11.h) eVar).m(this.f119768s);
        }
    }

    @Override // c34.z
    public void d() {
        i11.e eVar = this.f119763n;
        if (eVar != null) {
            ((i11.h) eVar).l(this.f119768s, true, false, false);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b1.f(22, 10);
        }
    }

    @Override // c34.z
    public void e() {
        g();
        b();
        this.f119764o = new c34.n(0, this.f119758f, this.f119757e, this.f119760h, this.f119759g, "", "");
        c01.d9.e().g(this.f119764o);
        if (this.f119761i) {
            return;
        }
        if (this.f119763n == null) {
            f();
        }
        ((i11.h) this.f119763n).j(this.f119768s, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b1.f(22, 10);
    }

    public final void f() {
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h e17 = i11.h.e();
        this.f119763n = e17;
        this.f119762m = true;
        e17.l(this.f119768s, true, false, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b1.f(22, 10);
    }

    public void g() {
        java.lang.Runnable runnable;
        if (this.f119764o != null) {
            c01.d9.e().d(this.f119764o);
        }
        if (this.f119765p != null) {
            c01.d9.e().d(this.f119765p);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f119766q;
        if (n3Var == null || (runnable = this.f119767r) == null) {
            return;
        }
        n3Var.mo50300x3fa464aa(runnable);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (this.f119780d == null) {
            return;
        }
        int mo808xfb85f7b0 = m1Var.mo808xfb85f7b0();
        if (mo808xfb85f7b0 == 161) {
            c34.n nVar = (c34.n) m1Var;
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = nVar.f119752e.f152243a.f152217a;
            if (((r45.u36) fVar).f468532o == 3 || ((r45.u36) fVar).f468532o == 4) {
                return;
            }
            if (i18 == 0 && i17 == 0 && nVar.f119754g == 0) {
                this.f119766q.mo50297x7c4d7ca2(this.f119767r, 3000L);
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShakeFriendService", "onSceneEnd reprot failed");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17671x63665fce) this.f119780d).a7(null, 3L);
                return;
            }
        }
        if (mo808xfb85f7b0 != 162) {
            if (mo808xfb85f7b0 != 1251) {
                return;
            }
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(m1Var);
            if (i18 == 0 && i17 == 0) {
                if (this.f119780d != null) {
                    throw null;
                }
                return;
            } else {
                c34.x xVar = this.f119780d;
                if (xVar != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17671x63665fce) xVar).Z6(1251, null, 2L);
                    return;
                }
                return;
            }
        }
        c34.m mVar = (c34.m) m1Var;
        if (i18 != 0 || i17 != 0 || mVar.f119750h != 0) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17671x63665fce) this.f119780d).a7(null, 3L);
            return;
        }
        java.util.LinkedList linkedList = (java.util.LinkedList) mVar.f119748f;
        if (linkedList.size() != 0) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17671x63665fce) this.f119780d).a7(linkedList, 1L);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeFriendService", "empty shake get list");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17671x63665fce) this.f119780d).a7(null, 3L);
        }
    }
}

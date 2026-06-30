package c34;

/* loaded from: classes11.dex */
public class q extends c34.z implements com.tencent.mm.modelbase.u0 {

    /* renamed from: e, reason: collision with root package name */
    public float f38224e;

    /* renamed from: f, reason: collision with root package name */
    public float f38225f;

    /* renamed from: g, reason: collision with root package name */
    public int f38226g;

    /* renamed from: h, reason: collision with root package name */
    public int f38227h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f38228i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f38229m;

    /* renamed from: n, reason: collision with root package name */
    public i11.e f38230n;

    /* renamed from: o, reason: collision with root package name */
    public c34.n f38231o;

    /* renamed from: p, reason: collision with root package name */
    public c34.m f38232p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f38233q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.Runnable f38234r;

    /* renamed from: s, reason: collision with root package name */
    public final i11.c f38235s;

    public q(android.content.Context context, c34.x xVar) {
        super(xVar);
        this.f38224e = -85.0f;
        this.f38225f = -1000.0f;
        this.f38226g = 1;
        this.f38227h = -1000;
        this.f38228i = false;
        this.f38229m = true;
        this.f38233q = new com.tencent.mm.sdk.platformtools.n3();
        this.f38234r = new c34.o(this);
        this.f38235s = new c34.p(this);
    }

    @Override // c34.z
    public void a() {
        g();
        this.f38247d = null;
        c01.d9.e().q(161, this);
        c01.d9.e().q(162, this);
        c01.d9.e().q(1251, this);
        i11.e eVar = this.f38230n;
        if (eVar != null) {
            ((i11.h) eVar).m(this.f38235s);
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
        i11.e eVar = this.f38230n;
        if (eVar != null) {
            ((i11.h) eVar).m(this.f38235s);
        }
    }

    @Override // c34.z
    public void d() {
        i11.e eVar = this.f38230n;
        if (eVar != null) {
            ((i11.h) eVar).l(this.f38235s, true, false, false);
            com.tencent.mm.plugin.report.service.b1.f(22, 10);
        }
    }

    @Override // c34.z
    public void e() {
        g();
        b();
        this.f38231o = new c34.n(0, this.f38225f, this.f38224e, this.f38227h, this.f38226g, "", "");
        c01.d9.e().g(this.f38231o);
        if (this.f38228i) {
            return;
        }
        if (this.f38230n == null) {
            f();
        }
        ((i11.h) this.f38230n).j(this.f38235s, true);
        com.tencent.mm.plugin.report.service.b1.f(22, 10);
    }

    public final void f() {
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h e17 = i11.h.e();
        this.f38230n = e17;
        this.f38229m = true;
        e17.l(this.f38235s, true, false, false);
        com.tencent.mm.plugin.report.service.b1.f(22, 10);
    }

    public void g() {
        java.lang.Runnable runnable;
        if (this.f38231o != null) {
            c01.d9.e().d(this.f38231o);
        }
        if (this.f38232p != null) {
            c01.d9.e().d(this.f38232p);
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f38233q;
        if (n3Var == null || (runnable = this.f38234r) == null) {
            return;
        }
        n3Var.removeCallbacks(runnable);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (this.f38247d == null) {
            return;
        }
        int type = m1Var.getType();
        if (type == 161) {
            c34.n nVar = (c34.n) m1Var;
            com.tencent.mm.protobuf.f fVar = nVar.f38219e.f70710a.f70684a;
            if (((r45.u36) fVar).f386999o == 3 || ((r45.u36) fVar).f386999o == 4) {
                return;
            }
            if (i18 == 0 && i17 == 0 && nVar.f38221g == 0) {
                this.f38233q.postDelayed(this.f38234r, 3000L);
                return;
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.ShakeFriendService", "onSceneEnd reprot failed");
                ((com.tencent.mm.plugin.shake.ui.ShakeReportUI) this.f38247d).a7(null, 3L);
                return;
            }
        }
        if (type != 162) {
            if (type != 1251) {
                return;
            }
            android.support.v4.media.f.a(m1Var);
            if (i18 == 0 && i17 == 0) {
                if (this.f38247d != null) {
                    throw null;
                }
                return;
            } else {
                c34.x xVar = this.f38247d;
                if (xVar != null) {
                    ((com.tencent.mm.plugin.shake.ui.ShakeReportUI) xVar).Z6(1251, null, 2L);
                    return;
                }
                return;
            }
        }
        c34.m mVar = (c34.m) m1Var;
        if (i18 != 0 || i17 != 0 || mVar.f38217h != 0) {
            ((com.tencent.mm.plugin.shake.ui.ShakeReportUI) this.f38247d).a7(null, 3L);
            return;
        }
        java.util.LinkedList linkedList = (java.util.LinkedList) mVar.f38215f;
        if (linkedList.size() != 0) {
            ((com.tencent.mm.plugin.shake.ui.ShakeReportUI) this.f38247d).a7(linkedList, 1L);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShakeFriendService", "empty shake get list");
            ((com.tencent.mm.plugin.shake.ui.ShakeReportUI) this.f38247d).a7(null, 3L);
        }
    }
}

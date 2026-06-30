package om4;

/* loaded from: classes11.dex */
public class e implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final om4.d f427947d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f427948e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f427950g;

    /* renamed from: h, reason: collision with root package name */
    public final int f427951h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Runnable f427952i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Runnable f427953m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f427954n = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f427949f = null;

    public e(android.content.Context context, int i17, om4.d dVar) {
        this.f427948e = context;
        this.f427947d = dVar;
        this.f427951h = i17;
    }

    public void a() {
        if (this.f427950g) {
            om4.c cVar = new om4.c(this);
            this.f427953m = cVar;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(cVar, 200L);
        }
        om4.a aVar = new om4.a(this);
        this.f427952i = aVar;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(aVar, 60000L);
        gm0.j1.n().f354821b.a(4071, this);
        gm0.j1.n().f354821b.g(new om4.j(this.f427951h));
    }

    public final void b(boolean z17, r45.wv6 wv6Var) {
        om4.d dVar = this.f427947d;
        if (dVar != null) {
            om4.v vVar = ((om4.u) dVar).f427977a;
            if (wv6Var == null || !z17) {
                vVar.a();
            } else {
                vVar.b(wv6Var);
            }
        }
    }

    public final void c() {
        if (this.f427950g) {
            java.lang.Runnable runnable = this.f427953m;
            if (runnable != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(runnable);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f427949f;
            if (u3Var != null) {
                u3Var.dismiss();
                this.f427949f = null;
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.f427952i);
        gm0.j1.n().f354821b.q(4071, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckFinderManagerSwithFun", "onSceneEnd, errType = " + i17 + ", errCode = " + i18 + "," + str);
        if (!(m1Var instanceof om4.j) || m1Var.mo808xfb85f7b0() != 4071) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CheckFinderManagerSwithFun", "not expected action,  type = " + m1Var.mo808xfb85f7b0());
            return;
        }
        c();
        if (i17 == 0 && i18 == 0) {
            b(true, (r45.wv6) ((om4.j) m1Var).f427959e.f152244b.f152233a);
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            db5.e1.s(this.f427948e, str, "");
        }
        b(false, null);
    }
}

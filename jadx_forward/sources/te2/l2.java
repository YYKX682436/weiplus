package te2;

/* loaded from: classes14.dex */
public final class l2 implements te2.b2, x91.a {

    /* renamed from: d, reason: collision with root package name */
    public final gk2.e f499724d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f499725e;

    /* renamed from: f, reason: collision with root package name */
    public final int f499726f;

    /* renamed from: g, reason: collision with root package name */
    public final int f499727g;

    /* renamed from: h, reason: collision with root package name */
    public int f499728h;

    /* renamed from: i, reason: collision with root package name */
    public te2.c2 f499729i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f499730m;

    /* renamed from: n, reason: collision with root package name */
    public final x91.i f499731n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f499732o;

    public l2(gk2.e liveData, qo0.c statusMonitor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f499724d = liveData;
        this.f499725e = "Finder.FinderLiveCastScreenPresenter";
        this.f499726f = 7;
        this.f499727g = 10;
        this.f499730m = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper(), new te2.f2(this));
        this.f499731n = new te2.k2(this);
        this.f499732o = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4("finder_live_device_search", (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new te2.e2(this), true);
    }

    @Override // x91.a
    public void C2(x91.h hVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f499725e, "onAddDevice " + hVar);
        te2.c2 c2Var = this.f499729i;
        if (c2Var != null) {
            pm0.v.X(new te2.r2(hVar, (te2.a3) c2Var));
        }
    }

    @Override // x91.a
    public void K4(x91.h hVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f499725e, "onUpdateDevice " + hVar);
        te2.c2 c2Var = this.f499729i;
        if (c2Var != null) {
            pm0.v.X(new te2.x2(hVar, (te2.a3) c2Var));
        }
    }

    public void c() {
        x91.h hVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("breakDevice: ");
        gk2.e eVar = this.f499724d;
        sb6.append(eVar);
        sb6.append(".business(LiveCastScreenSlice::class.java).selectedDevice");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f499725e, sb6.toString());
        if (((je2.i) eVar.a(je2.i.class)).f380768f == null || (hVar = ((je2.i) eVar.a(je2.i.class)).f380768f) == null) {
            return;
        }
        hVar.e(new te2.j2(this));
    }

    public void f() {
        java.lang.String str = this.f499725e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "cleanUp");
        try {
            this.f499732o.d();
            x91.b b17 = x91.b.b();
            b17.f534163a = true;
            for (x91.h hVar : ((java.util.HashMap) b17.f534164b).values()) {
                hVar.h();
                hVar.i();
                hVar.f534187h = null;
            }
            b17.e(this);
            b17.a();
            try {
                int i17 = y91.i0.f541814h;
                y91.h0.f541810a.a();
            } catch (ba1.a unused) {
            }
            y91.n.f541835a.a();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "Error happen while cleaning up " + e17.getMessage());
        }
    }

    public void g() {
        java.lang.String str = this.f499725e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "prepare");
        try {
            int i17 = y91.i0.f541814h;
            y91.h0.f541810a.b();
            y91.n.f541835a.b();
            x91.b.b().c(this);
        } catch (ba1.a e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "RouterException: " + e17.getMessage());
        }
    }

    @Override // fs2.a
    /* renamed from: onAttach */
    public void mo56536x3b13c504(java.lang.Object obj) {
        te2.c2 callback = (te2.c2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f499725e, "onAttach");
        this.f499729i = callback;
    }

    @Override // fs2.a
    /* renamed from: onDetach */
    public void mo979x3f5eee52() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f499725e, "onDetach");
        f();
        this.f499729i = null;
    }

    @Override // x91.a
    public void q2(x91.h hVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f499725e, "onRemoveDevice " + hVar);
        te2.c2 c2Var = this.f499729i;
        if (c2Var != null) {
            pm0.v.X(new te2.v2(hVar, (te2.a3) c2Var));
        }
    }
}

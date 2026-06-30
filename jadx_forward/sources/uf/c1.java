package uf;

/* loaded from: classes7.dex */
public final class c1 {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f508514m = {p3321xbce91901.jvm.p3324x21ffc6bd.i0.d(new p3321xbce91901.jvm.p3324x21ffc6bd.u(uf.c1.class, "currentSelectedDevice", "getCurrentSelectedDevice()Lcom/tencent/mm/plugin/appbrand/dlna/device/MRDevice;", 0))};

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f508515a;

    /* renamed from: b, reason: collision with root package name */
    public final b06.d f508516b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f508517c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f508518d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.a f508519e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f508520f;

    /* renamed from: g, reason: collision with root package name */
    public final a66.c f508521g;

    /* renamed from: h, reason: collision with root package name */
    public final uf.v0 f508522h;

    /* renamed from: i, reason: collision with root package name */
    public final uf.q0 f508523i;

    /* renamed from: j, reason: collision with root package name */
    public r56.e f508524j;

    /* renamed from: k, reason: collision with root package name */
    public final ku5.f f508525k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f508526l;

    public c1(java.lang.String category, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        category = (i17 & 1) != 0 ? "" : category;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(category, "category");
        this.f508515a = category;
        this.f508516b = new uf.a1(new x91.h(null), this);
        this.f508517c = new java.util.ArrayList();
        this.f508518d = new java.util.ArrayList();
        this.f508521g = new a66.c();
        this.f508522h = new uf.v0(this);
        this.f508523i = new uf.q0(this);
        this.f508525k = ((ku5.t0) ku5.t0.f394148d).p("MicroMsg.MediaCastDeviceManager");
        this.f508526l = jz5.h.b(uf.s0.f508632d);
    }

    public final void a() {
        try {
            this.f508521g.d();
            b();
            this.f508518d.clear();
            this.f508517c.clear();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(x56.m.f533666f, this.f508524j)) {
                x56.m.f533666f = null;
                this.f508524j = null;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MediaCastDeviceManager", "clear, clearRxIOScheduler fail: scheduler instance is changed");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaCastDeviceManager", "clear, Error happen while cleaning up " + e17.getMessage());
        }
    }

    public final void b() {
        x91.b b17 = x91.b.b();
        b17.f534163a = true;
        for (x91.h hVar : ((java.util.HashMap) b17.f534164b).values()) {
            hVar.h();
            hVar.i();
            hVar.f534187h = null;
        }
        b17.e(this.f508523i);
        b17.e(this.f508522h);
        b17.a();
        try {
            int i17 = y91.i0.f541814h;
            y91.h0.f541810a.a();
        } catch (ba1.a e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MediaCastDeviceManager", e17, "deinitDlna, RouterException = " + e17.getMessage(), new java.lang.Object[0]);
        }
        y91.n.f541835a.a();
    }

    public final x91.h c() {
        return (x91.h) ((b06.b) this.f508516b).b(this, f508514m[0]);
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 d() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) this.f508526l).mo141623x754a37bb();
    }

    public final void e() {
        java.lang.String a17 = nf.s.a();
        java.lang.String b17 = nf.s.b();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.a2.b(a17) && com.p314xaae8f345.mm.sdk.p2603x2137b148.a2.b(b17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCastDeviceManager", "search, selfIp = [%s], wifiIp = [%s], ipv6 = [%b]", a17, b17, java.lang.Boolean.valueOf(z17));
        this.f508521g.a(p56.l.b(new s56.k(p56.l.b(new s56.q(0L, 1000L, java.util.concurrent.TimeUnit.MILLISECONDS, rx.p3379xd70c5718.C30149x4dde3338.m163346xca889c7())).f433627d, new s56.g0(10))).c(ca1.a.a()).f(new uf.y0(z17)));
    }

    public final boolean f() {
        boolean z17;
        if (x56.m.f533666f == null) {
            uf.b1 b1Var = new uf.b1(this);
            this.f508524j = b1Var;
            x56.m.f533666f = b1Var;
        }
        try {
            uf.r0 r0Var = new uf.r0();
            v91.b.f515684b = "MicroMsg.MediaCazt.";
            v91.b.f515683a = r0Var;
            int i17 = y91.i0.f541814h;
            y91.h0.f541810a.b();
            y91.n.f541835a.b();
            z17 = false;
        } catch (ba1.a e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MediaCastDeviceManager", e17, "initDlna, RouterException = " + e17.getMessage(), new java.lang.Object[0]);
            z17 = true;
        }
        return !z17;
    }
}

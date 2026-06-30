package gg1;

/* loaded from: classes7.dex */
public final class k1 {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f353120k = {p3321xbce91901.jvm.p3324x21ffc6bd.i0.d(new p3321xbce91901.jvm.p3324x21ffc6bd.u(gg1.k1.class, "currentSelectedDevice", "getCurrentSelectedDevice()Lcom/tencent/mm/plugin/appbrand/dlna/device/MRDevice;", 0))};

    /* renamed from: b, reason: collision with root package name */
    public r56.e f353122b;

    /* renamed from: f, reason: collision with root package name */
    public yz5.a f353126f;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f353128h;

    /* renamed from: a, reason: collision with root package name */
    public final ku5.f f353121a = ((ku5.t0) ku5.t0.f394148d).p("MicroMsg.VideoCast.VideoCastDeviceManager");

    /* renamed from: c, reason: collision with root package name */
    public final b06.d f353123c = new gg1.h1(new x91.h(null), this);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f353124d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f353125e = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final a66.c f353127g = new a66.c();

    /* renamed from: i, reason: collision with root package name */
    public final gg1.e1 f353129i = new gg1.e1(this);

    /* renamed from: j, reason: collision with root package name */
    public final gg1.d1 f353130j = new gg1.d1(this);

    public final void a() {
        try {
            this.f353127g.d();
            this.f353125e.clear();
            this.f353124d.clear();
            x91.b b17 = x91.b.b();
            b17.f534163a = true;
            for (x91.h hVar : ((java.util.HashMap) b17.f534164b).values()) {
                hVar.h();
                hVar.i();
                hVar.f534187h = null;
            }
            b17.e(this.f353130j);
            b17.e(this.f353129i);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(x56.m.f533666f, this.f353122b)) {
                x56.m.f533666f = null;
                this.f353122b = null;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VideoCast.VideoCastDeviceManager", "clearRxIOScheduler fail: scheduler instance is changed");
            }
            b17.a();
            try {
                int i17 = y91.i0.f541814h;
                y91.h0.f541810a.a();
            } catch (ba1.a unused) {
            }
            y91.n.f541835a.a();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoCast.VideoCastDeviceManager", "Error happen while cleaning up " + e17.getMessage());
        }
    }

    public final x91.h b() {
        return (x91.h) ((b06.b) this.f353123c).b(this, f353120k[0]);
    }

    public final void c() {
        java.lang.String a17 = nf.s.a();
        java.lang.String b17 = nf.s.b();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.a2.b(a17) && com.p314xaae8f345.mm.sdk.p2603x2137b148.a2.b(b17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCast.VideoCastDeviceManager", "searchDevice: selfIp = [%s], wifiIp = [%s], ipv6 = [%b]", a17, b17, java.lang.Boolean.valueOf(z17));
        this.f353127g.a(p56.l.b(new s56.k(p56.l.b(new s56.q(0L, 1000L, java.util.concurrent.TimeUnit.MILLISECONDS, rx.p3379xd70c5718.C30149x4dde3338.m163346xca889c7())).f433627d, new s56.g0(10))).c(ca1.a.a()).f(new gg1.f1(z17)));
    }

    public final boolean d() {
        if (x56.m.f533666f == null) {
            gg1.i1 i1Var = new gg1.i1(this);
            this.f353122b = i1Var;
            x56.m.f533666f = i1Var;
        }
        try {
            gg1.j1 j1Var = new gg1.j1();
            v91.b.f515684b = "MicroMsg.VideoCast.";
            v91.b.f515683a = j1Var;
            int i17 = y91.i0.f541814h;
            y91.h0.f541810a.b();
            y91.n.f541835a.b();
            return true;
        } catch (ba1.a e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoCast.VideoCastDeviceManager", "prepareAndSearchDevice: RouterException = " + e17.getMessage());
            return false;
        }
    }
}

package gg1;

/* loaded from: classes7.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final sf.f f353068a;

    /* renamed from: b, reason: collision with root package name */
    public final dg.a f353069b;

    /* renamed from: c, reason: collision with root package name */
    public final fg1.u f353070c;

    /* renamed from: d, reason: collision with root package name */
    public int f353071d;

    /* renamed from: e, reason: collision with root package name */
    public final gg1.k1 f353072e;

    /* renamed from: f, reason: collision with root package name */
    public gg1.w f353073f;

    /* renamed from: g, reason: collision with root package name */
    public final gg1.g f353074g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f353075h;

    /* renamed from: i, reason: collision with root package name */
    public int f353076i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f353077j;

    /* renamed from: k, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f353078k;

    /* renamed from: l, reason: collision with root package name */
    public yz5.a f353079l;

    /* renamed from: m, reason: collision with root package name */
    public final gg1.b1 f353080m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f353081n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f353082o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f353083p;

    public c1(sf.f invokeContext, dg.a eventHandler, fg1.u videoCastHandler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeContext, "invokeContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventHandler, "eventHandler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoCastHandler, "videoCastHandler");
        this.f353068a = invokeContext;
        this.f353069b = eventHandler;
        this.f353070c = videoCastHandler;
        this.f353071d = -1;
        this.f353072e = new gg1.k1();
        this.f353074g = (gg1.g) i95.n0.c(gg1.g.class);
        this.f353078k = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new gg1.l0(this), false);
        this.f353080m = new gg1.b1(this);
        this.f353081n = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new gg1.m0(this), true);
        this.f353083p = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new gg1.d0(this), true);
    }

    public static final void a(gg1.c1 c1Var, gg1.x xVar) {
        c1Var.getClass();
        synchronized (gg1.c1.class) {
            p56.l c17 = s56.f.f484740d.c(ca1.a.a());
            gg1.x0 x0Var = new gg1.x0(c1Var, xVar);
            r56.c cVar = r56.d.f474275a;
            p56.l.b(new s56.k(c17.f433627d, new s56.s(new u56.a(cVar, cVar, x0Var)))).d();
        }
    }

    public final void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCast.VideoCastController", "onDestroy");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new gg1.z(this));
        gg1.k1 k1Var = this.f353072e;
        k1Var.b().h();
        k1Var.b().i();
        k1Var.b().f534187h = null;
        this.f353081n.d();
        k1Var.a();
        f();
        this.f353078k.d();
    }

    public final void c(int i17, int i18) {
        this.f353071d = i18;
        this.f353077j = false;
        gg1.k1 k1Var = this.f353072e;
        x91.j jVar = k1Var.b().f534184e.f534196a;
        x91.j jVar2 = x91.j.Paused;
        dg.a aVar = this.f353069b;
        if (jVar == jVar2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCast.VideoCastController", "play: continue");
            k1Var.b().c(new gg1.g0(this, i17, i18));
            ((fg1.g) aVar).c();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCast.VideoCastController", "play: playNew");
            k1Var.b().e(new gg1.j0(this, i17, i18));
            ((fg1.g) aVar).c();
        }
    }

    public final void d(boolean z17, boolean z18) {
        android.net.NetworkInfo networkInfo;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new gg1.s0(this, z18, z17));
        if (!z18) {
            this.f353072e.a();
        }
        this.f353072e.f353126f = new gg1.u0(this);
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("connectivity");
        if (!((connectivityManager == null || (networkInfo = connectivityManager.getNetworkInfo(1)) == null) ? false : networkInfo.isConnected())) {
            ((ku5.t0) ku5.t0.f394148d).B(new gg1.v0(this));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VideoCast.VideoCastController", "searchDevice: wifi is not connected");
        }
        gg1.k1 k1Var = this.f353072e;
        k1Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCast.VideoCastDeviceManager", "prepare");
        if (k1Var.d()) {
            x91.b.b().c(k1Var.f353130j);
            k1Var.c();
            k1Var.f353127g.a(p56.l.b(new s56.o(10L, java.util.concurrent.TimeUnit.SECONDS, rx.p3379xd70c5718.C30149x4dde3338.m163346xca889c7())).f(new gg1.g1(k1Var)));
        }
    }

    public final void e(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCast.VideoCastController", "setVolume: " + i17);
        x91.h b17 = this.f353072e.b();
        gg1.y0 y0Var = new gg1.y0(this);
        x91.l lVar = b17.f534183d;
        if (lVar != null) {
            b17.f534181b.g(new w91.l(b17.a(lVar), b17.f534183d.f534197a, i17), y0Var);
        }
    }

    public final void f() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f353083p;
        if (b4Var.e()) {
            return;
        }
        b4Var.d();
        this.f353082o = true;
    }
}

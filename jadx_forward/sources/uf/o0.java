package uf;

/* loaded from: classes7.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final uf.f f508591a;

    /* renamed from: b, reason: collision with root package name */
    public final uf.j f508592b;

    /* renamed from: c, reason: collision with root package name */
    public final uf.l f508593c;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f508594d;

    /* renamed from: e, reason: collision with root package name */
    public final uf.c1 f508595e;

    /* renamed from: f, reason: collision with root package name */
    public uf.c2 f508596f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f508597g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f508598h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f508599i;

    /* renamed from: j, reason: collision with root package name */
    public final uf.q f508600j;

    /* renamed from: k, reason: collision with root package name */
    public uf.a f508601k;

    /* renamed from: l, reason: collision with root package name */
    public yz5.a f508602l;

    /* renamed from: m, reason: collision with root package name */
    public int f508603m;

    public o0(uf.f castContext, uf.j castListener, uf.l castReportHandler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(castContext, "castContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(castListener, "castListener");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(castReportHandler, "castReportHandler");
        this.f508591a = castContext;
        this.f508592b = castListener;
        this.f508593c = castReportHandler;
        this.f508594d = ((uf.o1) castContext).f508606e.mo50272x76847179();
        this.f508595e = new uf.c1(null, 1, null);
        this.f508598h = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new uf.u(this), true);
        this.f508599i = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new uf.c0(this), true);
        this.f508600j = new uf.q(this);
    }

    public static final void a(uf.o0 o0Var, uf.m mVar) {
        o0Var.getClass();
        synchronized (uf.o0.class) {
            p56.l c17 = s56.f.f484740d.c(ca1.a.a());
            uf.k0 k0Var = new uf.k0(o0Var, mVar);
            r56.c cVar = r56.d.f474275a;
            p56.l.b(new s56.k(c17.f433627d, new s56.s(new u56.a(cVar, cVar, k0Var)))).d();
        }
    }

    public final void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCastController", "onDestroy");
        ((ku5.t0) ku5.t0.f394148d).B(new uf.p(this));
        f();
        this.f508599i.d();
        this.f508598h.d();
        this.f508595e.a();
    }

    public final void c(int i17, uf.a aVar) {
        this.f508601k = aVar;
        uf.c1 c1Var = this.f508595e;
        if (c1Var.c().f534184e.f534196a == x91.j.Paused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCastController", "play: continue");
            c1Var.c().c(new uf.x(this, i17));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCastController", "play: playNew");
            c1Var.c().e(new uf.a0(this, i17));
        }
        this.f508592b.m();
    }

    public final void d(boolean z17, boolean z18) {
        android.net.NetworkInfo networkInfo;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
        if (!((connectivityManager == null || (networkInfo = connectivityManager.getNetworkInfo(1)) == null) ? false : networkInfo.isConnected())) {
            ((ku5.t0) ku5.t0.f394148d).B(new uf.e0(context));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MediaCastController", "searchDevice: wifi is not connected");
        }
        if (!z18) {
            this.f508595e.a();
        }
        uf.c1 c1Var = this.f508595e;
        c1Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCastDeviceManager", "prepareAndSearchDevice");
        if (c1Var.f()) {
            x91.b.b().c(c1Var.f508523i);
            c1Var.e();
            c1Var.f508521g.a(p56.l.b(new s56.o(10L, java.util.concurrent.TimeUnit.SECONDS, rx.p3379xd70c5718.C30149x4dde3338.m163346xca889c7())).f(new uf.z0(c1Var)));
        }
        ((ku5.t0) ku5.t0.f394148d).B(new uf.i0(this, z18, z17));
    }

    public final void e(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCastController", "setVolume: " + i17);
        x91.h c17 = this.f508595e.c();
        uf.l0 l0Var = new uf.l0();
        x91.l lVar = c17.f534183d;
        if (lVar != null) {
            c17.f534181b.g(new w91.l(c17.a(lVar), c17.f534183d.f534197a, i17), l0Var);
        }
    }

    public final void f() {
        uf.c1 c1Var = this.f508595e;
        c1Var.c().h();
        c1Var.c().i();
        c1Var.c().f534187h = null;
    }
}

package dr4;

/* loaded from: classes14.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f324208a;

    /* renamed from: b, reason: collision with root package name */
    public final int f324209b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.p f324210c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f324211d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f324212e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f324213f;

    /* renamed from: g, reason: collision with root package name */
    public dr4.q f324214g;

    /* renamed from: h, reason: collision with root package name */
    public dr4.q f324215h;

    /* renamed from: i, reason: collision with root package name */
    public dr4.q f324216i;

    /* renamed from: j, reason: collision with root package name */
    public dr4.q f324217j;

    /* renamed from: k, reason: collision with root package name */
    public rs0.h f324218k;

    /* renamed from: l, reason: collision with root package name */
    public dr4.r1 f324219l;

    /* renamed from: m, reason: collision with root package name */
    public is0.c f324220m;

    /* renamed from: n, reason: collision with root package name */
    public int f324221n;

    /* renamed from: o, reason: collision with root package name */
    public int f324222o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.SurfaceTexture f324223p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.Surface f324224q;

    /* renamed from: r, reason: collision with root package name */
    public final int f324225r;

    /* renamed from: s, reason: collision with root package name */
    public yz5.q f324226s;

    public o(boolean z17, int i17, yz5.p queueScope) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(queueScope, "queueScope");
        this.f324208a = z17;
        this.f324209b = i17;
        this.f324210c = queueScope;
        this.f324211d = "MicroMsg.WindowSurfaceRenderer@" + hashCode();
        this.f324213f = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f324212e = false;
        this.f324225r = !z17 ? 1 : 0;
    }

    public static /* synthetic */ void c(dr4.o oVar, yz5.l lVar, dr4.c0 c0Var, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkInit");
        }
        if ((i17 & 1) != 0) {
            lVar = null;
        }
        if ((i17 & 2) != 0) {
            c0Var = null;
        }
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        oVar.b(lVar, c0Var, z17);
    }

    public static void k(dr4.o oVar, dr4.q qVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopRender");
        }
        if ((i17 & 1) != 0) {
            qVar = null;
        }
        oVar.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(oVar.f324211d, "stopRender, surface:" + qVar, new java.lang.Object[0]);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(qVar, oVar.f324214g) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(qVar, oVar.f324215h) || qVar == null) {
            oVar.d(new dr4.n(oVar));
        }
    }

    public final void a(dr4.q qVar, int i17) {
        java.lang.String str = this.f324211d;
        if (qVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "add a null surface");
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(str, "add render surface renderSide " + i17 + " and :" + qVar, new java.lang.Object[0]);
        if (i17 == 0) {
            this.f324214g = qVar;
        } else {
            this.f324215h = qVar;
        }
    }

    public abstract void b(yz5.l lVar, dr4.c0 c0Var, boolean z17);

    public abstract void d(yz5.a aVar);

    public void e() {
        java.lang.String str = this.f324211d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onSurfaceTextureDestroyed");
        if (!this.f324213f.compareAndSet(false, true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "release already release");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "continue release " + this.f324209b);
        d(new dr4.j(this));
    }

    public void f() {
    }

    public final void g(dr4.q qVar, int i17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(this.f324211d, "remove render surface :" + qVar, new java.lang.Object[0]);
        this.f324210c.mo149xb9724478(this.f324208a ? "CAMERA" : "DECODE", new dr4.k(new dr4.l(qVar, this, i17)));
    }

    public abstract void h();

    public final void i(is0.c texture) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(texture, "texture");
        if (this.f324212e) {
            dr4.r1 r1Var = this.f324219l;
            if (r1Var != null) {
                r1Var.D = texture;
                r1Var.C = texture.f375928e;
            }
            h();
        }
    }

    public final void j() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(this.f324211d, "startRender", new java.lang.Object[0]);
        this.f324212e = true;
    }

    public void l(android.util.Size renderSize) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderSize, "renderSize");
        this.f324221n = renderSize.getWidth();
        this.f324222o = renderSize.getHeight();
        dr4.r1 r1Var = this.f324219l;
        if (r1Var != null) {
            r1Var.w(renderSize.getWidth(), renderSize.getHeight());
        }
    }
}

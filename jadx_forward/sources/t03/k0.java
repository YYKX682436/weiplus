package t03;

/* loaded from: classes11.dex */
public final class k0 implements um5.e, t03.a {
    public static final /* synthetic */ int B = 0;
    public yz5.p A;

    /* renamed from: d, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer f495995d;

    /* renamed from: e, reason: collision with root package name */
    public final t03.g f495996e;

    /* renamed from: f, reason: collision with root package name */
    public final s03.f f495997f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f495998g;

    /* renamed from: h, reason: collision with root package name */
    public final long f495999h;

    /* renamed from: i, reason: collision with root package name */
    public final um5.p f496000i;

    /* renamed from: m, reason: collision with root package name */
    public t03.r0 f496001m;

    /* renamed from: n, reason: collision with root package name */
    public t03.e f496002n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f496003o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.Surface f496004p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f496005q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.HashMap f496006r;

    /* renamed from: s, reason: collision with root package name */
    public yz5.a f496007s;

    /* renamed from: t, reason: collision with root package name */
    public nk4.s f496008t;

    /* renamed from: u, reason: collision with root package name */
    public f25.l0 f496009u;

    /* renamed from: v, reason: collision with root package name */
    public yz5.a f496010v;

    /* renamed from: w, reason: collision with root package name */
    public yz5.a f496011w;

    /* renamed from: x, reason: collision with root package name */
    public yz5.a f496012x;

    /* renamed from: y, reason: collision with root package name */
    public yz5.a f496013y;

    /* renamed from: z, reason: collision with root package name */
    public yz5.a f496014z;

    static {
        ((cf0.z) ((df0.s) i95.n0.c(df0.s.class))).getClass();
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.m97812xedc5400c(new p05.f2());
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.m97811x534d5c42(2);
        xm5.b.f536931a = new p05.g2();
    }

    public k0(io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surface, t03.g eventSinkProvider, s03.f fVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventSinkProvider, "eventSinkProvider");
        this.f495995d = surface;
        this.f495996e = eventSinkProvider;
        this.f495997f = fVar;
        java.lang.String str = "MicroMsg.FlutterTPEffectPlayer@" + hashCode();
        this.f495998g = str;
        long id6 = surface.id();
        this.f495999h = id6;
        this.f496000i = new um5.p();
        this.f496006r = new java.util.HashMap();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "create FlutterTPEffectPlayer,textureId:" + id6);
    }

    @Override // um5.e
    public void a(android.graphics.SurfaceTexture surfaceTexture) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f495998g, "onSurfaceDestroy");
        this.f496004p = null;
        t03.r0 r0Var = this.f496001m;
        if (r0Var != null) {
            r0Var.mo143591x360802();
        }
    }

    @Override // um5.e
    public void b(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f495998g, "onSurfaceAvailable size:[" + i17 + ", " + i18 + ']');
        android.view.Surface surface = new android.view.Surface(surfaceTexture);
        this.f496004p = surface;
        t03.r0 r0Var = this.f496001m;
        if (r0Var != null) {
            r0Var.J(surface, this.f496005q);
        }
    }

    @Override // um5.e
    public void c(android.graphics.SurfaceTexture surfaceTexture) {
    }

    public final void d() {
        t03.r0 r0Var = this.f496001m;
        if (r0Var != null) {
            r0Var.R();
        }
        t03.r0 r0Var2 = this.f496001m;
        if (r0Var2 != null) {
            kk4.b.e(r0Var2, null, 1, null);
        }
        t03.r0 r0Var3 = this.f496001m;
        if (r0Var3 != null) {
            r0Var3.P();
        }
        t03.r0 r0Var4 = this.f496001m;
        if (r0Var4 != null) {
            r0Var4.mo143590x408b7293();
        }
        this.f496001m = null;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        t03.r0 r0Var5 = new t03.r0(context);
        this.f496001m = r0Var5;
        r0Var5.E(new t03.h(this));
        t03.r0 r0Var6 = this.f496001m;
        if (r0Var6 != null) {
            r0Var6.f390128t = new t03.i(this);
        }
        if (r0Var6 != null) {
            r0Var6.f390108J = new t03.j(this);
        }
        if (r0Var6 != null) {
            r0Var6.K = new t03.k(this);
        }
        if (r0Var6 != null) {
            r0Var6.f390129u = new t03.l(this);
        }
        if (r0Var6 != null) {
            r0Var6.f390130v = new t03.m(this);
        }
        t03.r0 r0Var7 = r0Var6 instanceof kk4.v ? r0Var6 : null;
        if (r0Var7 == null) {
            return;
        }
        r0Var7.f390121m = this.f496008t;
    }

    public final void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f495998g, "release");
        this.f496005q = false;
        t03.r0 r0Var = this.f496001m;
        if (r0Var != null) {
            r0Var.R();
        }
        t03.r0 r0Var2 = this.f496001m;
        if (r0Var2 != null) {
            kk4.b.e(r0Var2, null, 1, null);
        }
        t03.r0 r0Var3 = this.f496001m;
        if (r0Var3 != null) {
            r0Var3.mo143591x360802();
        }
        t03.r0 r0Var4 = this.f496001m;
        if (r0Var4 != null) {
            r0Var4.mo143590x408b7293();
        }
        this.f496001m = null;
        this.f495995d.mo138094x41012807();
        um5.p pVar = this.f496000i;
        pVar.g();
        pVar.b();
        t03.e eVar = this.f496002n;
        if (eVar != null) {
            pm0.v.X(new t03.b(eVar));
        }
    }

    public void f(boolean z17, boolean z18) {
        if (!z18) {
            if (z17) {
                t03.e eVar = this.f496002n;
                if (eVar != null) {
                    pm0.v.X(new t03.b(eVar));
                }
            } else {
                t03.e eVar2 = this.f496002n;
                if (eVar2 != null) {
                    pm0.v.X(new t03.d(eVar2));
                }
            }
        }
        this.f496003o = z17;
        t03.r0 r0Var = this.f496001m;
        if (r0Var != null) {
            r0Var.C(z17);
        }
    }
}

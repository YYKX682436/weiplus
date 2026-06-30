package gk4;

/* loaded from: classes10.dex */
public final class h0 implements gk4.b {
    public boolean B;
    public yz5.l D;
    public volatile boolean E;
    public volatile boolean F;
    public yz5.l G;

    /* renamed from: b, reason: collision with root package name */
    public gk4.a f354090b;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.SurfaceTexture f354092d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f354093e;

    /* renamed from: f, reason: collision with root package name */
    public android.os.HandlerThread f354094f;

    /* renamed from: g, reason: collision with root package name */
    public rs0.h f354095g;

    /* renamed from: h, reason: collision with root package name */
    public volatile int f354096h;

    /* renamed from: i, reason: collision with root package name */
    public volatile int f354097i;

    /* renamed from: j, reason: collision with root package name */
    public volatile int f354098j;

    /* renamed from: k, reason: collision with root package name */
    public volatile int f354099k;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc f354101m;

    /* renamed from: n, reason: collision with root package name */
    public is0.c f354102n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.SurfaceTexture f354103o;

    /* renamed from: p, reason: collision with root package name */
    public os0.e f354104p;

    /* renamed from: q, reason: collision with root package name */
    public is0.c f354105q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f354106r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f354107s;

    /* renamed from: t, reason: collision with root package name */
    public int f354108t;

    /* renamed from: u, reason: collision with root package name */
    public int f354109u;

    /* renamed from: w, reason: collision with root package name */
    public uq5.m f354111w;

    /* renamed from: y, reason: collision with root package name */
    public dk4.a f354113y;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f354089a = "MicroMsg.TPPlayerEffector@" + hashCode();

    /* renamed from: c, reason: collision with root package name */
    public final jk4.b f354091c = new jk4.b();

    /* renamed from: l, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2825x7e128009.C22965x6f780cba f354100l = new com.p314xaae8f345.mm.p2825x7e128009.C22965x6f780cba();

    /* renamed from: v, reason: collision with root package name */
    public final int f354110v = 1;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.ArrayList f354112x = new java.util.ArrayList();

    /* renamed from: z, reason: collision with root package name */
    public int f354114z = -1;
    public long A = -1;
    public float C = -1.0f;

    static {
        android.graphics.Color.parseColor("#4c4c4c");
        p05.l4.R.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(gk4.h0 r25, long r26) {
        /*
            Method dump skipped, instructions count: 1047
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gk4.h0.b(gk4.h0, long):void");
    }

    public void c(android.graphics.SurfaceTexture surface) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        java.lang.String str = "attachSurface:" + surface.hashCode();
        java.lang.String str2 = this.f354089a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        rs0.h hVar = this.f354095g;
        if (hVar != null) {
            e(new gk4.v(this, surface, hVar));
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "attach surface current not create GLEnvironment now");
            this.f354092d = surface;
        }
    }

    public void d(yz5.a aVar) {
        java.lang.String str = this.f354089a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "init without surfaceTexture");
        if (this.f354095g == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "createEGLThread");
            int i17 = pu5.i.f440006b;
            android.os.HandlerThread a17 = pu5.f.a("TPPlayerEffector", -4);
            a17.start();
            this.f354093e = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(a17.getLooper());
            this.f354094f = a17;
            e(new gk4.x(null, this));
            e(new gk4.d0(this, aVar));
        }
    }

    public void e(final yz5.a r17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r17, "r");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f354093e;
        if (n3Var != null) {
            n3Var.mo50293x3498a0(new java.lang.Runnable(r17) { // from class: gk4.g0

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ yz5.a f354086d;

                {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r17, "function");
                    this.f354086d = r17;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f354086d.mo152xb9724478();
                }
            });
        }
    }

    public void f(int i17, int i18) {
        if (i17 != this.f354096h || i18 != this.f354097i) {
            this.f354107s = true;
        }
        this.f354096h = i17;
        this.f354097i = i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f354089a, "updateSize:[" + i17 + ',' + i18 + "], outputSizeChanged:" + this.f354107s + ", surface:" + this.f354092d);
        if (this.f354107s) {
            if (this.f354096h > this.f354097i && this.f354096h > 1080) {
                this.f354108t = 1080;
                this.f354109u = (int) (1080 * ((this.f354097i * 1.0f) / this.f354096h));
            } else if (this.f354097i <= this.f354096h || this.f354097i <= 1920) {
                this.f354108t = this.f354096h;
                this.f354109u = this.f354097i;
            } else {
                this.f354109u = 1920;
                this.f354108t = (int) (1920 * ((this.f354096h * 1.0f) / this.f354097i));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f354089a, "calcOutputTexSize:[" + this.f354108t + ',' + this.f354109u + ']');
        }
    }
}

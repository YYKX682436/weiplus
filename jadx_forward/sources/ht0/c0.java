package ht0;

/* loaded from: classes10.dex */
public class c0 implements ht0.b {
    public ei3.k B;
    public final ls0.k F;
    public final android.opengl.EGLContext G;
    public final ms0.c H;
    public final int I;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f366197b;

    /* renamed from: h, reason: collision with root package name */
    public ht0.a f366203h;

    /* renamed from: i, reason: collision with root package name */
    public gs0.w f366204i;

    /* renamed from: j, reason: collision with root package name */
    public long f366205j;

    /* renamed from: k, reason: collision with root package name */
    public int f366206k;

    /* renamed from: l, reason: collision with root package name */
    public int f366207l;

    /* renamed from: q, reason: collision with root package name */
    public int f366212q;

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d f366219x;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f366196a = new java.lang.Object();

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f366198c = "";

    /* renamed from: d, reason: collision with root package name */
    public int f366199d = 0;

    /* renamed from: e, reason: collision with root package name */
    public float f366200e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public int f366201f = -1;

    /* renamed from: g, reason: collision with root package name */
    public float f366202g = -1.0f;

    /* renamed from: m, reason: collision with root package name */
    public int f366208m = 1600000;

    /* renamed from: n, reason: collision with root package name */
    public int f366209n = 480;

    /* renamed from: o, reason: collision with root package name */
    public int f366210o = 640;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h f366213r = null;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f366214s = null;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f366215t = null;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f366216u = null;

    /* renamed from: v, reason: collision with root package name */
    public final di3.c f366217v = new di3.c("yuvRecorderWriteData");

    /* renamed from: w, reason: collision with root package name */
    public final di3.c f366218w = new di3.c("frameCountCallback");

    /* renamed from: y, reason: collision with root package name */
    public boolean f366220y = false;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f366221z = "";
    public boolean A = false;
    public java.lang.Runnable C = null;
    public boolean D = false;
    public boolean E = false;

    /* renamed from: J, reason: collision with root package name */
    public boolean f366195J = false;
    public di3.o K = new ht0.u(this);

    /* renamed from: p, reason: collision with root package name */
    public final ei3.e1 f366211p = new ei3.e1();

    public c0(com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d, ms0.c cVar, android.opengl.EGLContext eGLContext, int i17) {
        this.f366206k = 480;
        this.f366207l = 640;
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = -1;
        this.f366219x = c11120x15dce88d;
        this.f366206k = c11120x15dce88d.f152724d;
        this.f366207l = c11120x15dce88d.f152725e;
        this.G = eGLContext;
        this.H = cVar;
        this.I = i17;
        this.F = new ls0.k(cVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markX264Capture");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(985L, 30L, 1L);
    }

    public static void A(ht0.c0 c0Var, android.graphics.Bitmap bitmap) {
        c0Var.getClass();
        if (bitmap == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Media.X264MP4MuxRecorder", "saveVideoThumbImpl with null bitmap");
            return;
        }
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.JPEG, c0Var.f366215t, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "saveVideoThumb to: %s, cameraOrientation: %s, width: %s, height: %s %s", c0Var.f366215t, java.lang.Integer.valueOf(c0Var.f366212q), java.lang.Integer.valueOf(bitmap.getWidth()), java.lang.Integer.valueOf(bitmap.getHeight()), java.lang.Long.valueOf(com.p314xaae8f345.mm.vfs.w6.k(c0Var.f366215t)));
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Media.X264MP4MuxRecorder", e17, "", new java.lang.Object[0]);
        }
    }

    public static boolean z(ht0.c0 c0Var) {
        c0Var.getClass();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        gs0.w wVar = c0Var.f366204i;
        if (wVar == null) {
            return false;
        }
        int i17 = wVar.f356578o;
        c0Var.f366200e = (i17 * 1000.0f) / c0Var.f366199d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "stop, frameCount: %s, fps: %s, duration: %s, file: %s handlerrunning %s, overrideDurationMs: %s, overrideFps: %s", java.lang.Integer.valueOf(i17), java.lang.Float.valueOf(c0Var.f366200e), java.lang.Integer.valueOf(c0Var.f366199d), c0Var.f366198c, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), java.lang.Integer.valueOf(c0Var.f366201f), java.lang.Float.valueOf(c0Var.f366202g));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "frameCountCallback %s", c0Var.f366218w.c());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "yuvRecorderWriteDataCallback %s", c0Var.f366217v.c());
        java.lang.String m66807x1efd7235 = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29.BinderC16530x6b2d3ec8.m66802x9cf0d20b() != null ? com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29.BinderC16530x6b2d3ec8.m66802x9cf0d20b().m66807x1efd7235() : !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c0Var.f366198c) ? new com.p314xaae8f345.mm.vfs.r6(c0Var.f366198c).s().o() : null;
        java.lang.String l17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m66807x1efd7235) ? ai3.d.l(m66807x1efd7235) : c0Var.f366198c;
        int i18 = c0Var.f366199d;
        int i19 = c0Var.f366201f;
        int i27 = i19 > 0 ? i19 : i18;
        float f17 = c0Var.f366200e;
        float f18 = c0Var.f366202g;
        float f19 = f18 > 0.0f ? f18 : f17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "muxResultPath : " + l17);
        ei3.l0 l0Var = new ei3.l0(c0Var.f366213r, l17, f19, c0Var.f366208m, i27, c0Var.f366219x.f152732o, c0Var.E, true, false);
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
        boolean a17 = l0Var.a(c0Var.f366195J);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "mux used %sms, success: %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime2), java.lang.Boolean.valueOf(a17));
        if (!a17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Media.X264MP4MuxRecorder", "mux failed!");
            di3.x.e();
            return false;
        }
        c0Var.f366213r.c();
        c0Var.f366211p.a(ei3.l.Stop);
        c0Var.f366221z = com.p314xaae8f345.mm.vfs.w6.p(l17);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l17) && !l17.equals(c0Var.f366198c)) {
            com.p314xaae8f345.mm.vfs.w6.w(l17, c0Var.f366198c);
            com.p314xaae8f345.mm.vfs.w6.h(l17);
        }
        return true;
    }

    public final boolean B(int i17) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d = this.f366219x;
        this.f366208m = c11120x15dce88d.f152727g;
        int i18 = this.f366206k;
        if (i18 % 2 != 0) {
            this.f366206k = i18 + 1;
        }
        int i19 = this.f366207l;
        if (i19 % 2 != 0) {
            this.f366207l = i19 + 1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "real width:%d, height:%d", java.lang.Integer.valueOf(this.f366206k), java.lang.Integer.valueOf(this.f366207l));
        boolean a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.c.a(true, c11120x15dce88d.K == 1);
        this.f366195J = a17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "init useFFmpeg muxer:%s", java.lang.Boolean.valueOf(a17));
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h a18 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h.a(this.f366206k, this.f366207l, this.f366208m, c11120x15dce88d.f152726f, c11120x15dce88d.K == 1, this.f366195J);
        this.f366213r = a18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "init, bufId: %s", a18);
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h hVar = this.f366213r;
        if (hVar == null || hVar.f243948a < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Media.X264MP4MuxRecorder", "init failed!");
            return false;
        }
        this.f366212q = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "mTargetRate " + this.f366208m + "  videoParams.fps: " + c11120x15dce88d.f152726f + " mTargetHeight:" + this.f366207l + " mTargetWidth:" + this.f366206k);
        this.f366204i = new gs0.w(this.f366213r, this.f366206k, this.f366207l);
        android.opengl.EGLContext eGLContext = this.G;
        int i27 = this.f366206k;
        int i28 = this.f366207l;
        ht0.v vVar = new ht0.v(this);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ls0.k kVar = this.F;
        sb6.append(kVar.hashCode());
        sb6.append(" initWithSize, eglContext: ");
        sb6.append(eGLContext);
        sb6.append(", callback: ");
        sb6.append(false);
        sb6.append(", width:");
        sb6.append(i27);
        sb6.append(", height:");
        sb6.append(i28);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(kVar.f402381b, sb6.toString());
        kVar.d(new ls0.b(eGLContext, kVar, i27, i28, vVar));
        kVar.f402385f = new ht0.x(this);
        C();
        ht0.a aVar = new ht0.a(c11120x15dce88d.f152732o, c11120x15dce88d.f152731n, c11120x15dce88d.f152733p, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.c.a(true, c11120x15dce88d.K == 1));
        this.f366203h = aVar;
        aVar.f334667k = this.D;
        int n17 = aVar.n(this.f366213r, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.a(this.f366198c));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "initImpl used %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        if (n17 == 0) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markX264AACRecorderInitFailed");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(985L, 33L, 1L);
        return false;
    }

    public final void C() {
        int i17 = this.f366206k;
        int i18 = this.f366207l;
        ls0.k kVar = this.F;
        kVar.f402380a.t(i17, i18);
        int i19 = this.f366212q;
        ms0.c cVar = kVar.f402380a;
        cVar.r(i19);
        cVar.u(this.f366209n, this.f366210o);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "outputWidth: %s, outputHeight: %s, cameraPreviewWidth: %s, cameraPreviewHeight: %s, getDataRotate: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(this.f366209n), java.lang.Integer.valueOf(this.f366210o), java.lang.Integer.valueOf(this.f366212q));
    }

    @Override // ei3.m
    public java.lang.String a() {
        return this.f366197b;
    }

    @Override // ei3.m
    public java.lang.String b() {
        return this.f366215t;
    }

    @Override // ei3.m
    public float c() {
        return this.f366200e;
    }

    @Override // ei3.m
    /* renamed from: cancel */
    public void mo127742xae7a2e7a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "cancel record");
        synchronized (this.f366196a) {
            if (this.f366204i != null && (this.f366203h != null || this.E)) {
                this.f366211p.a(ei3.l.WaitStop);
                this.f366204i.d();
                ht0.a aVar = this.f366203h;
                if (aVar != null) {
                    aVar.f(new ht0.b0(this));
                }
                this.f366213r.c();
                this.f366211p.a(ei3.l.Stop);
                mo127748x6761d4f();
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Media.X264MP4MuxRecorder", "error, yuvRecorder or aacRecorder is null");
        }
    }

    @Override // ei3.m
    /* renamed from: clear */
    public void mo127743x5a5b64d() {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "clear");
            ht0.a aVar = this.f366203h;
            if (aVar != null) {
                aVar.mo127741x5a5b64d();
            }
            ls0.k kVar = this.F;
            if (kVar != null) {
                kVar.e();
            }
            this.f366213r.c();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Media.X264MP4MuxRecorder", e17, "clear error: %s", e17.getMessage());
        }
    }

    @Override // ei3.m
    public int d() {
        return java.lang.Math.round(this.f366199d / 1000.0f);
    }

    @Override // ei3.m
    public void e(float f17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "overrideFps: %s", java.lang.Float.valueOf(f17));
        this.f366202g = f17;
    }

    @Override // ei3.m
    public void f(java.lang.String str) {
        this.f366198c = str;
    }

    @Override // ei3.m
    public void g(java.lang.Runnable runnable) {
        synchronized (this.f366196a) {
            this.C = runnable;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "!!!!!stop, stopCallback: %s!!!", runnable);
            if (this.f366204i != null && (this.f366203h != null || this.E)) {
                ei3.e1 e1Var = this.f366211p;
                if (e1Var != null && e1Var.f334572a == ei3.l.Stop) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "stop, already in stop videoRecordStatus");
                    ht0.a aVar = this.f366203h;
                    if (aVar != null) {
                        aVar.mo127741x5a5b64d();
                    }
                    if (runnable != null) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(runnable);
                    }
                    return;
                }
                this.K = null;
                long j17 = this.f366205j;
                if (j17 > 0) {
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    this.f366199d = (int) (android.os.SystemClock.elapsedRealtime() - j17);
                }
                if (this.f366211p != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markX264StartWait");
                    boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    rs0.p.f480844b = android.os.SystemClock.elapsedRealtime();
                    this.f366211p.a(ei3.l.PrepareStop);
                }
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "error, yuvRecorder or aacRecorder is null");
            if (runnable != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(runnable);
            }
        }
    }

    @Override // ei3.m
    /* renamed from: getFilePath */
    public java.lang.String mo127744x5000ed37() {
        return this.f366198c;
    }

    @Override // ei3.m
    /* renamed from: getFrameDataCallback */
    public di3.o mo127745x89bef366() {
        return this.K;
    }

    @Override // ei3.m
    /* renamed from: getMd5 */
    public java.lang.String mo127746xb5885648() {
        java.lang.String str = this.f366221z;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return str == null ? "" : str;
    }

    @Override // ei3.m
    public boolean h() {
        return this.A;
    }

    @Override // ei3.m
    public void i(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "overrideDurationMs: %s", java.lang.Integer.valueOf(i17));
        this.f366201f = i17;
    }

    @Override // ei3.m
    public boolean j() {
        return false;
    }

    @Override // ei3.m
    public boolean k(int i17) {
        if (this.f366220y) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markX264InitFailed");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(985L, 31L, 1L);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "preInit, cameraOrientation");
        boolean B = B(i17);
        this.f366220y = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "initImpl result: %s", java.lang.Boolean.valueOf(B));
        return B;
    }

    @Override // ei3.m
    public void l(int i17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "resume, cameraOrientation: %s", java.lang.Integer.valueOf(i17));
        this.f366212q = i17;
        this.f366209n = i18;
        this.f366210o = i19;
        this.F.f402380a.r(i17);
        C();
        ei3.e1 e1Var = this.f366211p;
        if (e1Var == null || e1Var.f334572a != ei3.l.Pause) {
            return;
        }
        e1Var.a(ei3.l.Start);
    }

    @Override // ei3.m
    public android.graphics.Point m() {
        return new android.graphics.Point(this.f366209n, this.f366210o);
    }

    @Override // ei3.m
    public long n() {
        synchronized (this.f366196a) {
            long j17 = this.f366205j;
            if (j17 <= 0) {
                return 0L;
            }
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            return android.os.SystemClock.elapsedRealtime() - j17;
        }
    }

    @Override // ht0.b
    public void o() {
        if (this.I < 0) {
            return;
        }
        ei3.e1 e1Var = this.f366211p;
        ei3.l lVar = e1Var.f334572a;
        ei3.l lVar2 = ei3.l.Start;
        ei3.l lVar3 = ei3.l.PrepareStop;
        if (lVar == lVar2 || lVar == lVar3) {
            if (lVar == lVar3) {
                e1Var.f334572a = ei3.l.WaitStop;
            }
            this.f366218w.a(1L);
            ht0.a aVar = this.f366203h;
            if (aVar != null) {
                aVar.f334666j = true;
            }
            int i17 = this.I;
            long nanoTime = java.lang.System.nanoTime();
            ls0.k kVar = this.F;
            kVar.getClass();
            kVar.d(new ls0.g(kVar, i17, false, 0L, false, nanoTime));
            this.f366217v.a(1L);
        }
    }

    @Override // ei3.m
    public tl.c p() {
        ht0.a aVar = this.f366203h;
        if (aVar != null) {
            return aVar.I;
        }
        return null;
    }

    @Override // ei3.m
    /* renamed from: pause */
    public void mo127747x65825f6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "pause");
        ei3.e1 e1Var = this.f366211p;
        if (e1Var == null || e1Var.f334572a != ei3.l.Start) {
            return;
        }
        e1Var.a(ei3.l.Pause);
    }

    @Override // ei3.m
    public java.lang.String q() {
        return this.f366216u;
    }

    @Override // ei3.m
    public void r(int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "setSize, width: %s, height: %s, targetWidth: %s, targetHeight: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        if (i19 % 16 != 0) {
            i19 = ai3.d.a(i19);
        }
        if (i27 % 16 != 0) {
            i27 = ai3.d.a(i27);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "setSize, after align, targetWidth: %d, targetHeight: %d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        this.f366209n = i17;
        this.f366210o = i18;
    }

    @Override // ei3.m
    /* renamed from: reset */
    public void mo127748x6761d4f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "reset, yuvRecorder: %s, aacRecorder: %s, muxer: %s", this.f366204i, this.f366203h, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "reset, yuvRecorder: %s, aacRecorder: %s", this.f366204i, this.f366203h);
        synchronized (this.f366196a) {
            this.f366204i = null;
        }
        this.f366203h = null;
        this.f366220y = false;
    }

    @Override // ei3.m
    public void s(java.lang.String str) {
        this.f366216u = str;
    }

    @Override // ei3.m
    /* renamed from: setMirror */
    public void mo127753x1849c2c1(boolean z17) {
    }

    @Override // ei3.m
    /* renamed from: setMute */
    public void mo127749x764d819b(boolean z17) {
        this.E = z17;
    }

    @Override // ei3.m
    public ei3.l t() {
        return this.f366211p.f334572a;
    }

    @Override // ei3.m
    public void u(ei3.k kVar) {
        this.B = kVar;
    }

    @Override // ei3.m
    public void v(boolean z17) {
        this.D = z17;
    }

    @Override // ei3.m
    public void w(java.lang.String str) {
        this.f366215t = str;
    }

    @Override // ei3.m
    public int x() {
        return this.f366212q;
    }

    @Override // ei3.m
    public int y(int i17, boolean z17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "start, cameraOrientation: %s, isLandscape: %s, degree: %s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i18));
        this.f366217v.d();
        int i19 = 0;
        this.f366199d = 0;
        this.f366218w.d();
        this.A = z17;
        this.f366211p.a(ei3.l.WaitStart);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f366198c)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Media.X264MP4MuxRecorder", "start error, mCurRecordPath is null!!");
            return -1;
        }
        try {
            this.f366197b = com.p314xaae8f345.mm.vfs.w6.q(this.f366198c);
            java.lang.String r17 = com.p314xaae8f345.mm.vfs.w6.r(this.f366198c);
            if (!r17.endsWith("/")) {
                r17 = r17.concat("/");
            }
            this.f366214s = r17 + "tempRotate.mp4";
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Media.X264MP4MuxRecorder", "retrieve file name error: %s", e17.getMessage());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "mCurRecordPath: %s, tempRotateFilePath: %s", this.f366198c, this.f366214s);
        this.f366212q = i17;
        if (!this.f366220y) {
            B(i17);
            this.f366220y = true;
        }
        synchronized (this.f366196a) {
            rs0.h hVar = this.F.f402384e;
            is0.c g17 = this.H.g();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "start videoEncoder, environment:%s, videoTexture:%s", hVar, java.lang.Integer.valueOf(this.I));
            if (hVar != null && g17 != null) {
                this.f366204i.c(hVar, g17.f375928e, this.f366206k, this.f366207l);
            }
            this.f366205j = android.os.SystemClock.elapsedRealtime();
        }
        if (this.E || this.D) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "start yuvRecorder with mute");
            this.f366211p.a(ei3.l.Start);
        } else {
            i19 = this.f366203h.b(new ht0.y(this));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "start aacRecorder ret: %s", java.lang.Integer.valueOf(i19));
            ei3.e1 e1Var = this.f366211p;
            if (i19 != 0) {
                e1Var.a(ei3.l.Error);
            } else {
                e1Var.a(ei3.l.Initialized);
            }
        }
        return i19;
    }
}

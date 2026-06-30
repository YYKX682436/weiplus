package ei3;

/* loaded from: classes10.dex */
public class w0 implements ei3.m {
    public final com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d B;
    public ei3.k H;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f334695b;

    /* renamed from: h, reason: collision with root package name */
    public ei3.j f334701h;

    /* renamed from: i, reason: collision with root package name */
    public volatile ei3.z0 f334702i;

    /* renamed from: j, reason: collision with root package name */
    public ei3.l0 f334703j;

    /* renamed from: k, reason: collision with root package name */
    public int f334704k;

    /* renamed from: l, reason: collision with root package name */
    public int f334705l;

    /* renamed from: m, reason: collision with root package name */
    public final int f334706m;

    /* renamed from: p, reason: collision with root package name */
    public final ei3.e1 f334709p;

    /* renamed from: q, reason: collision with root package name */
    public int f334710q;

    /* renamed from: r, reason: collision with root package name */
    public int f334711r;

    /* renamed from: s, reason: collision with root package name */
    public android.os.HandlerThread f334712s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f334713t;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f334694a = new java.lang.Object();

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f334696c = "";

    /* renamed from: d, reason: collision with root package name */
    public int f334697d = 0;

    /* renamed from: e, reason: collision with root package name */
    public float f334698e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public int f334699f = -1;

    /* renamed from: g, reason: collision with root package name */
    public float f334700g = -1.0f;

    /* renamed from: n, reason: collision with root package name */
    public int f334707n = 480;

    /* renamed from: o, reason: collision with root package name */
    public int f334708o = 640;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f334714u = null;

    /* renamed from: v, reason: collision with root package name */
    public boolean f334715v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f334716w = false;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f334717x = null;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f334718y = null;

    /* renamed from: z, reason: collision with root package name */
    public final di3.c f334719z = new di3.c("yuvRecorderWriteData");
    public final di3.c A = new di3.c("frameCountCallback");
    public boolean C = false;
    public boolean D = false;
    public java.lang.String E = "";
    public boolean F = false;
    public int G = 0;
    public java.lang.Runnable I = null;

    /* renamed from: J, reason: collision with root package name */
    public boolean f334693J = false;
    public final boolean K = true;
    public boolean L = false;
    public di3.o M = new ei3.m0(this);

    public w0(com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d) {
        this.f334704k = 480;
        this.f334705l = 640;
        this.f334706m = 1600000;
        this.B = c11120x15dce88d;
        this.f334704k = c11120x15dce88d.f152724d;
        this.f334705l = c11120x15dce88d.f152725e;
        int i17 = c11120x15dce88d.f152727g;
        this.f334706m = i17;
        int i18 = di3.w.f314303d.f314236d;
        if (i18 == -1) {
            this.f334706m = i17;
        } else {
            this.f334706m = i18;
        }
        this.f334709p = new ei3.e1();
    }

    @Override // ei3.m
    public java.lang.String a() {
        return this.f334695b;
    }

    @Override // ei3.m
    public java.lang.String b() {
        return this.f334717x;
    }

    @Override // ei3.m
    public float c() {
        return this.f334698e;
    }

    @Override // ei3.m
    /* renamed from: cancel */
    public void mo127742xae7a2e7a() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "cancel record");
        if (this.f334702i == null || (this.f334701h == null && !this.L)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "error, yuvRecorder or aacRecorder is null");
            return;
        }
        this.f334709p.a(ei3.l.WaitStop);
        this.f334702i.f(null);
        ei3.j jVar = this.f334701h;
        if (jVar != null) {
            jVar.f(new ei3.u0(this));
        }
        if (this.f334712s != null && (n3Var = this.f334713t) != null) {
            n3Var.mo50303x856b99f0(0);
            this.f334712s.quit();
            this.f334713t = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69225x381fab99(this.f334711r);
        this.f334709p.a(ei3.l.Stop);
        mo127748x6761d4f();
    }

    @Override // ei3.m
    /* renamed from: clear */
    public void mo127743x5a5b64d() {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "clear");
            ei3.j jVar = this.f334701h;
            if (jVar != null) {
                jVar.mo127741x5a5b64d();
            }
            if (this.f334702i != null) {
                ei3.z0 z0Var = this.f334702i;
                z0Var.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightYUVMediaCodecRecorder", "clear");
                z0Var.b();
                com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69225x381fab99(z0Var.D);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMSightMediaCodecMP4MuxRecorder", e17, "clear error: %s", e17.getMessage());
        }
    }

    @Override // ei3.m
    public int d() {
        return java.lang.Math.round(this.f334697d / 1000.0f);
    }

    @Override // ei3.m
    public void e(float f17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "overrideFps: %s", java.lang.Float.valueOf(f17));
        this.f334700g = f17;
    }

    @Override // ei3.m
    public void f(java.lang.String str) {
        this.f334696c = str;
    }

    @Override // ei3.m
    public void g(java.lang.Runnable runnable) {
        this.I = runnable;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "!!!!!stop, stopCallback: %s!!!", runnable);
        if (this.f334702i == null || (this.f334701h == null && !this.L)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "error, yuvRecorder or aacRecorder is null");
            if (runnable != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(runnable);
                return;
            }
            return;
        }
        ei3.e1 e1Var = this.f334709p;
        if (e1Var != null && e1Var.f334572a == ei3.l.Stop) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "stop, already in stop status");
            ei3.j jVar = this.f334701h;
            if (jVar != null) {
                jVar.mo127741x5a5b64d();
            }
            if (this.f334702i != null) {
                ei3.z0 z0Var = this.f334702i;
                z0Var.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightYUVMediaCodecRecorder", "clear");
                z0Var.b();
                com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69225x381fab99(z0Var.D);
            }
            if (runnable != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(runnable);
                return;
            }
            return;
        }
        this.M = null;
        ei3.z0 z0Var2 = this.f334702i;
        long j17 = 0;
        if (z0Var2.f334539h <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSightYUVMediaCodecRecorder", "do not start record");
        } else {
            j17 = (java.lang.System.nanoTime() - z0Var2.f334539h) / 1000000;
        }
        this.f334697d = (int) j17;
        ei3.e1 e1Var2 = this.f334709p;
        if (e1Var2 != null) {
            e1Var2.a(ei3.l.PrepareStop);
        }
        if (this.f334702i != null) {
            this.f334702i.f(new ei3.p0(this));
        }
        ei3.j jVar2 = this.f334701h;
        if (jVar2 != null) {
            jVar2.f(new ei3.q0(this));
        }
    }

    @Override // ei3.m
    /* renamed from: getFilePath */
    public java.lang.String mo127744x5000ed37() {
        return this.f334696c;
    }

    @Override // ei3.m
    /* renamed from: getFrameDataCallback */
    public di3.o mo127745x89bef366() {
        return this.M;
    }

    @Override // ei3.m
    /* renamed from: getMd5 */
    public java.lang.String mo127746xb5885648() {
        java.lang.String str = this.E;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return str == null ? "" : str;
    }

    @Override // ei3.m
    public boolean h() {
        return this.F;
    }

    @Override // ei3.m
    public void i(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "overrideDurationMs: %s", java.lang.Integer.valueOf(i17));
        this.f334699f = i17;
    }

    @Override // ei3.m
    public boolean j() {
        return this.D;
    }

    @Override // ei3.m
    public boolean k(int i17) {
        if (this.C) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "preInit, cameraOrientation");
        boolean z17 = z(i17);
        this.C = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "initImpl result: %s", java.lang.Boolean.valueOf(z17));
        return z17;
    }

    @Override // ei3.m
    public void l(int i17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "resume, cameraOrientation: %s", java.lang.Integer.valueOf(i17));
        ei3.e1 e1Var = this.f334709p;
        if (e1Var == null || e1Var.f334572a != ei3.l.Pause) {
            return;
        }
        if (this.f334702i != null) {
            ei3.z0 z0Var = this.f334702i;
            z0Var.f334550s = i17;
            z0Var.f334551t = i18;
            z0Var.f334552u = i19;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightYUVMediaCodecRecorder", "resume, newRotation: %s, newFrameWidth: %s, newFrameHeight: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        }
        this.f334709p.a(ei3.l.Start);
    }

    @Override // ei3.m
    public android.graphics.Point m() {
        return new android.graphics.Point(this.f334707n, this.f334708o);
    }

    @Override // ei3.m
    public long n() {
        if (this.f334702i == null) {
            return 0L;
        }
        ei3.z0 z0Var = this.f334702i;
        if (z0Var.f334539h > 0) {
            return (java.lang.System.nanoTime() - z0Var.f334539h) / 1000000;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSightYUVMediaCodecRecorder", "do not start record");
        return 0L;
    }

    @Override // ei3.m
    public tl.c p() {
        ei3.j jVar = this.f334701h;
        if (jVar != null) {
            return jVar.e();
        }
        return null;
    }

    @Override // ei3.m
    /* renamed from: pause */
    public void mo127747x65825f6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "pause");
        ei3.e1 e1Var = this.f334709p;
        if (e1Var == null || e1Var.f334572a != ei3.l.Start) {
            return;
        }
        e1Var.a(ei3.l.Pause);
    }

    @Override // ei3.m
    public java.lang.String q() {
        return this.f334718y;
    }

    @Override // ei3.m
    public void r(int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "setSize, width: %s, height: %s, targetWidth: %s, targetHeight: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "setSize, after align, targetWidth: %d, targetHeight: %d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        this.f334704k = i19;
        this.f334705l = i27;
        this.f334707n = i17;
        this.f334708o = i18;
        ei3.x.f334720d.m(java.lang.Integer.valueOf(((i17 * i18) * 3) / 2));
    }

    @Override // ei3.m
    /* renamed from: reset */
    public void mo127748x6761d4f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "reset, yuvRecorder: %s, aacRecorder: %s, muxer: %s", this.f334702i, this.f334701h, this.f334703j);
        synchronized (this.f334694a) {
            this.f334702i = null;
        }
        this.f334701h = null;
        this.f334703j = null;
        this.C = false;
        this.D = false;
    }

    @Override // ei3.m
    public void s(java.lang.String str) {
        this.f334718y = str;
    }

    @Override // ei3.m
    /* renamed from: setMute */
    public void mo127749x764d819b(boolean z17) {
        this.L = z17;
    }

    @Override // ei3.m
    public ei3.l t() {
        return this.f334709p.f334572a;
    }

    @Override // ei3.m
    public void u(ei3.k kVar) {
        this.H = kVar;
    }

    @Override // ei3.m
    public void v(boolean z17) {
        this.f334693J = z17;
    }

    @Override // ei3.m
    public void w(java.lang.String str) {
        this.f334717x = str;
    }

    @Override // ei3.m
    public int x() {
        return this.f334710q;
    }

    @Override // ei3.m
    public int y(int i17, boolean z17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "start, cameraOrientation: %s, isLandscape: %s, degree: %s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i18));
        this.f334719z.d();
        this.f334697d = 0;
        this.A.d();
        this.f334716w = false;
        this.F = z17;
        this.G = i18;
        this.f334709p.a(ei3.l.WaitStart);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f334696c)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "start error, mCurRecordPath is null!!");
            return -1;
        }
        try {
            this.f334695b = com.p314xaae8f345.mm.vfs.w6.q(this.f334696c);
            java.lang.String r17 = com.p314xaae8f345.mm.vfs.w6.r(this.f334696c);
            if (!r17.endsWith("/")) {
                r17 = r17.concat("/");
            }
            this.f334714u = r17 + "tempRotate.mp4";
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "retrieve file name error: %s", e17.getMessage());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "mCurRecordPath: %s, tempRotateFilePath: %s", this.f334696c, this.f334714u);
        this.f334710q = i17;
        java.lang.String str = "BigSightMediaCodecMP4MuxRecorder_writeYuvData_" + hashCode();
        int i19 = pu5.i.f440006b;
        android.os.HandlerThread a17 = pu5.f.a(str, -1);
        this.f334712s = a17;
        a17.start();
        this.f334713t = new ei3.n0(this, this.f334712s.getLooper());
        if (!this.C) {
            z(i17);
            this.C = true;
        }
        if (this.L || this.f334693J) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "start yuvRecorder with mute");
            this.f334702i.e();
            this.f334709p.a(ei3.l.Start);
            this.D = false;
            di3.x.a();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRecorderIDKeyStat", "markMediaCodecCapture");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(440L, 2L, 1L, false);
            return 0;
        }
        int b17 = this.f334701h.b(new ei3.o0(this));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "start aacRecorder ret: %s", java.lang.Integer.valueOf(b17));
        this.D = false;
        ei3.e1 e1Var = this.f334709p;
        if (b17 != 0) {
            e1Var.a(ei3.l.Error);
        } else {
            e1Var.a(ei3.l.Initialized);
        }
        di3.x.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRecorderIDKeyStat", "markMediaCodecCapture");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(440L, 2L, 1L, false);
        return b17;
    }

    public final boolean z(int i17) {
        int i18;
        int i19;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        this.f334715v = di3.w.f314303d.f314237e;
        int i27 = this.f334706m;
        int i28 = this.f334707n;
        int i29 = this.f334708o;
        int i37 = this.f334704k;
        int i38 = this.f334705l;
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d = this.B;
        int m69200x909fa699 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69200x909fa699(i28, i29, i17, i37, i38, c11120x15dce88d.f152726f, i27, c11120x15dce88d.f152735r, 8, c11120x15dce88d.f152734q, 23.0f, c11120x15dce88d.N, 0, false, false, c11120x15dce88d.f152728h, false, false, false);
        this.f334711r = m69200x909fa699;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "init, bufId: %s", java.lang.Integer.valueOf(m69200x909fa699));
        if (this.f334711r < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "init failed!");
            di3.x.d();
            return false;
        }
        this.f334710q = i17;
        int i39 = this.f334707n;
        int i47 = this.f334708o;
        int i48 = this.f334704k;
        int i49 = this.f334705l;
        int i57 = this.f334706m;
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d2 = this.B;
        this.f334702i = new ei3.z0(i39, i47, i48, i49, i57, c11120x15dce88d2.f152730m, c11120x15dce88d2.f152726f, this.f334715v);
        ei3.z0 z0Var = this.f334702i;
        z0Var.D = this.f334711r;
        try {
            z0Var.f334549r = i17;
            i18 = z0Var.d();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightYUVMediaCodecRecorder", "init error: %s, try to re-init again", e17.getMessage());
            try {
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29.BinderC16530x6b2d3ec8.m66802x9cf0d20b() != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29.BinderC16530x6b2d3ec8.m66802x9cf0d20b().set(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MMSIGHT_MEDIACODEC_COLORFORMAT_INT, -1);
                }
                i18 = z0Var.d();
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightYUVMediaCodecRecorder", "re-init again error: %s", e18.getMessage());
                di3.x.f();
                i18 = -1;
            }
        }
        if (!this.L) {
            int m66817xb58848b9 = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29.BinderC16530x6b2d3ec8.m66802x9cf0d20b() != null ? com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29.BinderC16530x6b2d3ec8.m66802x9cf0d20b().m66817xb58848b9(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOCAL_SIGHT_AUDIO_RECORDER_TYPE_INT_SYNC, -1) : -1;
            if (m66817xb58848b9 < 0) {
                com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d3 = this.B;
                ei3.p pVar = new ei3.p(c11120x15dce88d3.f152732o, c11120x15dce88d3.f152731n, c11120x15dce88d3.f152733p, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.c.a(false, c11120x15dce88d3.K == 1));
                this.f334701h = pVar;
                pVar.a(this.f334693J);
                int c17 = this.f334701h.c(this.f334711r, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.a(this.f334696c));
                if (i18 < 0 || c17 < 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "init yuv or aac recorder error!! %d %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(c17));
                    if (c17 < 0 && i18 >= 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "aac init error, try mediarecorder now");
                        this.f334701h.mo127741x5a5b64d();
                        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d4 = this.B;
                        ei3.w wVar = new ei3.w(c11120x15dce88d4.f152732o, c11120x15dce88d4.f152731n, c11120x15dce88d4.f152733p);
                        this.f334701h = wVar;
                        wVar.a(this.f334693J);
                        int c18 = this.f334701h.c(this.f334711r, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.a(this.f334696c));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "MMSightAACMediaRecorder init ret: %s", java.lang.Integer.valueOf(c18));
                        if (c18 >= 0) {
                            return true;
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69225x381fab99(this.f334711r);
                    di3.x.d();
                    return false;
                }
            } else {
                if (m66817xb58848b9 == 1) {
                    com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d5 = this.B;
                    ei3.p pVar2 = new ei3.p(c11120x15dce88d5.f152732o, c11120x15dce88d5.f152731n, c11120x15dce88d5.f152733p, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.c.a(false, c11120x15dce88d5.K == 1));
                    this.f334701h = pVar2;
                    pVar2.a(this.f334693J);
                    i19 = this.f334701h.c(this.f334711r, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.a(this.f334696c));
                } else if (m66817xb58848b9 == 2) {
                    com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d6 = this.B;
                    ei3.w wVar2 = new ei3.w(c11120x15dce88d6.f152732o, c11120x15dce88d6.f152731n, c11120x15dce88d6.f152733p);
                    this.f334701h = wVar2;
                    wVar2.a(this.f334693J);
                    i19 = this.f334701h.c(this.f334711r, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.a(this.f334696c));
                } else {
                    i19 = 0;
                }
                if (i18 < 0 || i19 < 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "init yuv or aac recorder error!! %d %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
                    com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69225x381fab99(this.f334711r);
                    di3.x.d();
                    return false;
                }
            }
        } else if (i18 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "mute init yuv recorder error!! %d %d", java.lang.Integer.valueOf(i18), 0);
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69225x381fab99(this.f334711r);
            di3.x.d();
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "initImpl used %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        return true;
    }
}

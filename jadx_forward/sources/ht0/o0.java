package ht0;

/* loaded from: classes10.dex */
public class o0 implements ht0.b {
    public final com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d B;
    public boolean C;
    public ei3.k I;
    public final boolean N;

    /* renamed from: a, reason: collision with root package name */
    public ht0.a f366256a;

    /* renamed from: b, reason: collision with root package name */
    public ei3.y0 f366257b;

    /* renamed from: c, reason: collision with root package name */
    public final ei3.e1 f366258c;

    /* renamed from: e, reason: collision with root package name */
    public ei3.n f366260e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f366261f;

    /* renamed from: l, reason: collision with root package name */
    public final int f366267l;

    /* renamed from: m, reason: collision with root package name */
    public final int f366268m;

    /* renamed from: n, reason: collision with root package name */
    public final int f366269n;

    /* renamed from: d, reason: collision with root package name */
    public ht0.n0 f366259d = null;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f366262g = "";

    /* renamed from: h, reason: collision with root package name */
    public int f366263h = 0;

    /* renamed from: i, reason: collision with root package name */
    public float f366264i = 0.0f;

    /* renamed from: j, reason: collision with root package name */
    public int f366265j = -1;

    /* renamed from: k, reason: collision with root package name */
    public float f366266k = -1.0f;

    /* renamed from: o, reason: collision with root package name */
    public int f366270o = 480;

    /* renamed from: p, reason: collision with root package name */
    public int f366271p = 640;

    /* renamed from: q, reason: collision with root package name */
    public int f366272q = 0;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f366273r = null;

    /* renamed from: s, reason: collision with root package name */
    public android.os.HandlerThread f366274s = null;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f366275t = null;

    /* renamed from: u, reason: collision with root package name */
    public int f366276u = -1;

    /* renamed from: v, reason: collision with root package name */
    public int f366277v = -1;

    /* renamed from: w, reason: collision with root package name */
    public boolean f366278w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f366279x = false;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f366280y = null;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f366281z = null;
    public boolean A = false;
    public com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h D = null;
    public boolean E = false;
    public java.lang.String F = "";
    public boolean G = false;
    public int H = 0;

    /* renamed from: J, reason: collision with root package name */
    public boolean f366255J = false;
    public long K = 0;
    public long L = 0;
    public boolean M = false;
    public final di3.o O = new ht0.d0(this);

    public o0(com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d) {
        boolean fj6;
        this.f366267l = 480;
        this.f366268m = 640;
        this.f366269n = 1600000;
        this.C = false;
        this.N = false;
        this.B = c11120x15dce88d;
        int i17 = c11120x15dce88d.f152724d;
        this.f366267l = i17;
        int i18 = c11120x15dce88d.f152725e;
        this.f366268m = i18;
        int i19 = c11120x15dce88d.f152727g;
        this.f366269n = i19;
        this.f366258c = new ei3.e1();
        this.C = false;
        if (c11120x15dce88d.K == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WechatSight.PacketMuxerController", "x264YUVMP4MuxRecorderUseFFMpeg hevc");
            fj6 = true;
        } else {
            fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_face_use_ffmpeg_muxer, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WechatSight.PacketMuxerController", "x264YUVMP4MuxRecorderUseFFMpeg:%s", java.lang.Boolean.valueOf(fj6));
        }
        this.N = fj6;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "create X264YUVMP4MuxRecorder, targetWidth: %s, targetHeight: %s, targetRate: %s, enableHevc:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(c11120x15dce88d.K));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markX264Capture");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.C(985L, 30L, 1L);
        if (c11120x15dce88d.K == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markCaptureUseSwHevc");
            g0Var.mo68477x336bdfd8(985L, 182L, 1L, false);
        }
    }

    public final void A() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "ashutest::pcm ready");
        ht0.n0 n0Var = this.f366259d;
        if (n0Var != null && !n0Var.f366250o) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.X264YUVMP4MuxRecorder", "ashutest::OnPcmReady, last encode thread[%s] status error!!! MUST NOT BE HERE", n0Var);
            synchronized (this.f366259d.f366251p) {
                C(this.f366259d.f366243e);
            }
        }
        ei3.e1 e1Var = this.f366258c;
        if (e1Var.f334572a != ei3.l.Initialized) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.X264YUVMP4MuxRecorder", "ashutest::not MediaStatus.Initialized, maybe canceled by user");
            return;
        }
        e1Var.a(ei3.l.Start);
        ht0.n0 n0Var2 = new ht0.n0(this);
        this.f366259d = n0Var2;
        n0Var2.f366243e = this.D.f243948a;
        ((ku5.t0) ku5.t0.f394148d).g(this.f366259d);
    }

    public final void B() {
        int i17;
        ei3.y0 y0Var = this.f366257b;
        if (y0Var != null) {
            i17 = y0Var.f334724a;
            if (i17 < 0) {
                return;
            } else {
                y0Var.b();
            }
        } else {
            i17 = -1;
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        boolean z17 = false;
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Boolean.valueOf(this.f366259d == null);
        ht0.n0 n0Var = this.f366259d;
        if (n0Var != null && n0Var.f366249n) {
            z17 = true;
        }
        objArr[2] = java.lang.Boolean.valueOf(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "ashutest::clear bufID %d, encodeRunnable null ? %B, markCancel %B", objArr);
        if (i17 >= 0 && !C(i17)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69228xfcdb9a19("clear");
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69225x381fab99(i17);
        }
        ht0.a aVar = this.f366256a;
        if (aVar != null) {
            aVar.f(null);
        }
        android.os.HandlerThread handlerThread = this.f366274s;
        if (handlerThread != null) {
            handlerThread.quit();
        }
    }

    public final boolean C(int i17) {
        ht0.n0 n0Var = this.f366259d;
        if (n0Var == null || n0Var.f366250o) {
            return false;
        }
        if (!n0Var.f366247i) {
            n0Var.f366252q = null;
            n0Var.f366249n = true;
            n0Var.f366248m = true;
            n0Var.b();
        }
        synchronized (this.f366259d.f366251p) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69225x381fab99(i17);
            int i18 = this.f366259d.f366243e;
            if (i18 != i17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69225x381fab99(i18);
            }
        }
        return true;
    }

    @Override // ei3.m
    public java.lang.String a() {
        return this.f366261f;
    }

    @Override // ei3.m
    public java.lang.String b() {
        return this.f366280y;
    }

    @Override // ei3.m
    public float c() {
        return this.f366264i;
    }

    @Override // ei3.m
    /* renamed from: cancel */
    public void mo127742xae7a2e7a() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.X264YUVMP4MuxRecorder", "cancel", new java.lang.Object[0]);
        ei3.l lVar = ei3.l.WaitStop;
        ei3.e1 e1Var = this.f366258c;
        e1Var.a(lVar);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f366275t;
        if (n3Var != null) {
            n3Var.mo50303x856b99f0(1);
        }
        mo127743x5a5b64d();
        e1Var.a(ei3.l.Stop);
    }

    @Override // ei3.m
    /* renamed from: clear */
    public void mo127743x5a5b64d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "clear, hasWriteCameraData:%s", java.lang.Boolean.valueOf(this.E));
        if (this.E) {
            ((ku5.t0) ku5.t0.f394148d).g(new ht0.e0(this));
        } else {
            B();
        }
        this.K = 0L;
        this.L = 0L;
    }

    @Override // ei3.m
    public int d() {
        return java.lang.Math.round(this.f366263h / 1000.0f);
    }

    @Override // ei3.m
    public void e(float f17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "overrideFps: %s", java.lang.Float.valueOf(f17));
        this.f366266k = f17;
    }

    @Override // ei3.m
    public void f(java.lang.String str) {
        this.f366262g = str;
    }

    @Override // ei3.m
    public void g(java.lang.Runnable runnable) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Boolean.valueOf(this.f366259d == null);
        ht0.n0 n0Var = this.f366259d;
        objArr[1] = java.lang.Boolean.valueOf(n0Var != null && n0Var.f366247i);
        ht0.n0 n0Var2 = this.f366259d;
        objArr[2] = java.lang.Boolean.valueOf(n0Var2 != null && n0Var2.f366248m);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "stop, encodeThread null ? %B, has trigger finish ? %B, has finish callback ? %B", objArr);
        ht0.n0 n0Var3 = this.f366259d;
        if (n0Var3 == null || !n0Var3.f366247i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "stopOnCameraDataThread: %s, writeCameraDataHandler: %s", java.lang.Boolean.FALSE, this.f366275t);
            ((ku5.t0) ku5.t0.f394148d).g(new ht0.f0(this, runnable));
        } else {
            synchronized (n0Var3.f366251p) {
                mo127748x6761d4f();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(runnable);
            }
        }
    }

    @Override // ei3.m
    /* renamed from: getFilePath */
    public java.lang.String mo127744x5000ed37() {
        return this.f366262g;
    }

    @Override // ei3.m
    /* renamed from: getFrameDataCallback */
    public di3.o mo127745x89bef366() {
        return this.O;
    }

    @Override // ei3.m
    /* renamed from: getMd5 */
    public java.lang.String mo127746xb5885648() {
        java.lang.String str = this.F;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return str == null ? "" : str;
    }

    @Override // ei3.m
    public boolean h() {
        return this.G;
    }

    @Override // ei3.m
    public void i(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "overrideDurationMs: %s", java.lang.Integer.valueOf(i17));
        this.f366265j = i17;
    }

    @Override // ei3.m
    public boolean j() {
        return this.E;
    }

    @Override // ei3.m
    public boolean k(int i17) {
        if (this.C) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "preInit, cameraOrientation: %s", java.lang.Integer.valueOf(i17));
        boolean z17 = z(i17);
        this.C = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "initImpl result: %s", java.lang.Boolean.valueOf(z17));
        return z17;
    }

    @Override // ei3.m
    public void l(int i17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "resume, cameraOrientation: %s, lastPauseTimeMs:%s", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(this.L));
        ei3.e1 e1Var = this.f366258c;
        if (e1Var == null || e1Var.f334572a != ei3.l.Pause) {
            return;
        }
        ei3.y0 y0Var = this.f366257b;
        if (y0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightX264YUVRecorder", "resume, newRotate: %s, frameWidth: %s, frameHeight: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
            y0Var.f334732i = i17;
        }
        e1Var.a(ei3.l.Start);
        if (this.L > 0) {
            this.K += java.lang.System.currentTimeMillis() - this.L;
        }
    }

    @Override // ei3.m
    public android.graphics.Point m() {
        return new android.graphics.Point(this.f366270o, this.f366271p);
    }

    @Override // ei3.m
    public long n() {
        return this.f366257b.a();
    }

    @Override // ht0.b
    public void o() {
    }

    @Override // ei3.m
    public tl.c p() {
        ht0.a aVar = this.f366256a;
        if (aVar != null) {
            return aVar.I;
        }
        return null;
    }

    @Override // ei3.m
    /* renamed from: pause */
    public void mo127747x65825f6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "pause");
        ei3.e1 e1Var = this.f366258c;
        if (e1Var == null || e1Var.f334572a != ei3.l.Start) {
            return;
        }
        e1Var.a(ei3.l.Pause);
        this.L = java.lang.System.currentTimeMillis();
    }

    @Override // ei3.m
    public java.lang.String q() {
        return this.f366281z;
    }

    @Override // ei3.m
    public void r(int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "setSize, width: %s, height: %s, targetWidth: %s, targetHeight: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        this.f366270o = i17;
        this.f366271p = i18;
        ei3.x.f334720d.m(java.lang.Integer.valueOf(((i17 * i18) * 3) / 2));
    }

    @Override // ei3.m
    /* renamed from: reset */
    public void mo127748x6761d4f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "reset");
        this.f366258c.f334572a = ei3.l.Stop;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f366275t;
        if (n3Var != null) {
            n3Var.mo50303x856b99f0(1);
        }
        ht0.a aVar = this.f366256a;
        if (aVar != null) {
            aVar.mo127741x5a5b64d();
        }
        ei3.y0 y0Var = this.f366257b;
        if (y0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69225x381fab99(y0Var.f334724a);
            y0Var.f334724a = -1;
            synchronized (ei3.y0.class) {
                y0Var.f334725b = 0;
            }
            y0Var.f334726c = 0L;
        }
        mo127743x5a5b64d();
        this.E = false;
    }

    @Override // ei3.m
    public void s(java.lang.String str) {
        this.f366281z = str;
    }

    @Override // ei3.m
    /* renamed from: setMirror */
    public void mo127753x1849c2c1(boolean z17) {
        this.f366279x = z17;
        ei3.y0 y0Var = this.f366257b;
        if (y0Var != null) {
            y0Var.f334730g = z17;
        }
    }

    @Override // ei3.m
    /* renamed from: setMute */
    public void mo127749x764d819b(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "setMute:%s", java.lang.Boolean.valueOf(z17));
        this.M = z17;
    }

    @Override // ei3.m
    public ei3.l t() {
        return this.f366258c.f334572a;
    }

    @Override // ei3.m
    public void u(ei3.k kVar) {
        this.I = kVar;
    }

    @Override // ei3.m
    public void v(boolean z17) {
        this.f366255J = z17;
    }

    @Override // ei3.m
    public void w(java.lang.String str) {
        this.f366280y = str;
    }

    @Override // ei3.m
    public int x() {
        return this.f366272q;
    }

    @Override // ei3.m
    public int y(int i17, boolean z17, int i18) {
        ht0.a aVar;
        ei3.e1 e1Var = this.f366258c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "request start, last status %s, cameraOrientation: %s, isLandscape: %s, degree: %s, bufId:%S", e1Var.f334572a, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i18), this.D);
        this.G = z17;
        this.K = 0L;
        this.L = 0L;
        this.f366263h = 0;
        this.H = i18;
        e1Var.a(ei3.l.WaitStart);
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = this.f366262g;
        objArr[1] = java.lang.Boolean.valueOf(this.f366259d == null);
        ht0.n0 n0Var = this.f366259d;
        objArr[2] = java.lang.Boolean.valueOf(n0Var == null || n0Var.f366250o);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "initialize: filePath[%s], encodeThread null[%B], encodeThreadFinish[%B]", objArr);
        ht0.n0 n0Var2 = this.f366259d;
        if (n0Var2 != null && !n0Var2.f366250o) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.X264YUVMP4MuxRecorder", "ERROR, status, wait last encode thread finish!!! MUST NOT BE HERE");
            return -1;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f366262g)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.X264YUVMP4MuxRecorder", "start error, mCurRecordPath is null!!");
            return -1;
        }
        this.f366261f = com.p314xaae8f345.mm.vfs.w6.q(this.f366262g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "mCurRecordPath: %s", this.f366262g);
        this.f366272q = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "start, cameraOrientation: %s, mute:%s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(this.M));
        if (!this.C) {
            z(i17);
            this.C = true;
        }
        ei3.y0 y0Var = this.f366257b;
        if (0 == y0Var.f334726c) {
            y0Var.f334726c = java.lang.System.currentTimeMillis();
        }
        int b17 = (this.f366255J || (aVar = this.f366256a) == null) ? 0 : aVar.b(new ht0.h0(this));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "start aac recorder ret: %d", java.lang.Integer.valueOf(b17));
        int i19 = pu5.i.f440006b;
        android.os.HandlerThread a17 = pu5.f.a("BigSightWriteCameraData", 5);
        this.f366274s = a17;
        a17.start();
        this.f366275t = new ht0.i0(this, this.f366274s.getLooper());
        this.E = false;
        if (b17 != 0) {
            e1Var.a(ei3.l.Error);
        } else {
            e1Var.a(ei3.l.Initialized);
        }
        if (this.f366255J || this.M) {
            A();
        }
        return b17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r25 != 270) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0037, code lost:
    
        if (r25 != 270) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean z(int r25) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ht0.o0.z(int):boolean");
    }
}

package ht0;

/* loaded from: classes10.dex */
public class s implements ht0.b {

    /* renamed from: a0, reason: collision with root package name */
    public static final java.lang.Object f366284a0 = new java.lang.Object();
    public java.lang.String A;
    public boolean B;
    public int C;
    public ei3.k D;
    public java.lang.Runnable E;
    public boolean F;
    public boolean G;
    public final h90.z H;
    public final ls0.k I;

    /* renamed from: J, reason: collision with root package name */
    public final android.opengl.EGLContext f366285J;
    public int K;
    public long L;
    public long M;
    public boolean N;
    public double O;
    public long P;
    public long Q;
    public long R;
    public boolean S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public yz5.a X;
    public final java.lang.Runnable Y;
    public final di3.o Z;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f366286a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f366287b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f366288c;

    /* renamed from: d, reason: collision with root package name */
    public int f366289d;

    /* renamed from: e, reason: collision with root package name */
    public float f366290e;

    /* renamed from: f, reason: collision with root package name */
    public int f366291f;

    /* renamed from: g, reason: collision with root package name */
    public float f366292g;

    /* renamed from: h, reason: collision with root package name */
    public ht0.a f366293h;

    /* renamed from: i, reason: collision with root package name */
    public gs0.b f366294i;

    /* renamed from: j, reason: collision with root package name */
    public int f366295j;

    /* renamed from: k, reason: collision with root package name */
    public int f366296k;

    /* renamed from: l, reason: collision with root package name */
    public int f366297l;

    /* renamed from: m, reason: collision with root package name */
    public int f366298m;

    /* renamed from: n, reason: collision with root package name */
    public int f366299n;

    /* renamed from: o, reason: collision with root package name */
    public ei3.e1 f366300o;

    /* renamed from: p, reason: collision with root package name */
    public int f366301p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h f366302q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f366303r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f366304s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f366305t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f366306u;

    /* renamed from: v, reason: collision with root package name */
    public final di3.c f366307v;

    /* renamed from: w, reason: collision with root package name */
    public final di3.c f366308w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d f366309x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f366310y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f366311z;

    public s(com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d, ms0.c cVar, android.opengl.EGLContext eGLContext, int i17, h90.z zVar) {
        this.f366286a = new java.lang.Object();
        this.f366288c = "";
        this.f366289d = 0;
        this.f366290e = 0.0f;
        this.f366291f = -1;
        this.f366292g = -1.0f;
        this.f366295j = 480;
        this.f366296k = 640;
        this.f366297l = 1600000;
        this.f366298m = 480;
        this.f366299n = 640;
        this.f366302q = null;
        this.f366303r = false;
        this.f366304s = null;
        this.f366305t = null;
        this.f366306u = null;
        this.f366307v = new di3.c("yuvRecorderWriteData");
        this.f366308w = new di3.c("frameCountCallback");
        this.f366310y = false;
        this.f366311z = false;
        this.A = "";
        this.B = false;
        this.C = 0;
        this.E = null;
        this.F = false;
        this.G = false;
        this.H = null;
        this.I = null;
        this.f366285J = null;
        this.K = -1;
        this.L = 0L;
        this.M = 0L;
        this.N = false;
        this.O = 0.0d;
        this.P = 0L;
        this.Q = 0L;
        this.R = 0L;
        this.S = false;
        new java.util.LinkedList();
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.Y = new ht0.f(this);
        this.Z = new ht0.g(this);
        z(c11120x15dce88d);
        this.H = zVar;
        this.f366285J = eGLContext;
        this.I = new ls0.k(cVar);
        this.K = i17;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] textureId : " + i17, new java.lang.Object[0]);
    }

    public boolean A() {
        ei3.e1 e1Var = this.f366300o;
        ei3.l lVar = e1Var.f334572a;
        ei3.l lVar2 = ei3.l.Start;
        ei3.l lVar3 = ei3.l.PrepareStop;
        if (lVar != lVar2 && lVar != lVar3) {
            return false;
        }
        if (lVar == lVar3) {
            e1Var.f334572a = ei3.l.WaitStop;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] forward one more frame", new java.lang.Object[0]);
        }
        ht0.a aVar = this.f366293h;
        if (aVar != null) {
            aVar.f334666j = true;
        }
        this.f366308w.a(1L);
        this.f366307v.a(1L);
        return true;
    }

    public final boolean B(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h hVar;
        this.W = false;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d = this.f366309x;
        this.f366297l = c11120x15dce88d.f152727g;
        es0.d dVar = new es0.d(c11120x15dce88d.f152723J == 1);
        if (dVar.f337852i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] encodeConfig  InitError");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markMediaCodecYUVInitError");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(985L, 26L, 1L);
            return false;
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar.f337857n, "video/hevc");
        this.f366303r = b17;
        if (b17) {
            j62.e g17 = j62.e.g();
            e42.c0 c0Var = e42.c0.clicfg_mb_reward_ad_log_max_length_android;
            java.lang.String a17 = g17.a("clicfg_c2c_capture_hevc_bitrate_ratio", "0.75", true, true);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
                try {
                    this.f366297l = (int) (this.f366297l * java.lang.Float.parseFloat(a17));
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] init failed, stringRatio: " + a17 + " error: " + e17.getMessage());
                }
            }
        }
        int i18 = this.f366295j;
        int i19 = this.f366296k;
        int i27 = this.f366297l;
        float f17 = this.f366309x.f152726f;
        boolean a18 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.c.a(false, this.f366303r);
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h.f243947c) {
            hVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h(com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69196xa9b2bf97(i18, i19, false, i27, f17, -1, -1, -1, -1.0f, -1, 0, false, false, a18, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.c.b()));
        }
        this.f366302q = hVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] init, bufId: %s", this.f366302q);
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h hVar2 = this.f366302q;
        if (hVar2 != null) {
            if (hVar2.f243948a >= 0) {
                this.f366301p = i17;
                this.f366296k = ai3.d.a(this.f366296k);
                this.f366295j = ai3.d.a(this.f366295j);
                if (this.f366303r && dVar.f337857n.equals("video/hevc")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markCaptureUseHwHevc");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(985L, 181L, 1L, false);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] mTargetRate " + this.f366297l + "  videoParams.fps: " + this.f366309x.f152726f + " mTargetHeight:" + this.f366296k + " mTargetWidth:" + this.f366295j + ", minQP:" + this.f366309x.D + ", maxQP:" + this.f366309x.E);
                dVar.f337847d = this.f366297l;
                com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d2 = this.f366309x;
                dVar.f337848e = c11120x15dce88d2.f152726f;
                dVar.f337846c = this.f366296k;
                dVar.f337845b = this.f366295j;
                dVar.f337855l = c11120x15dce88d2.E;
                dVar.f337854k = c11120x15dce88d2.D;
                try {
                    gs0.l lVar = new gs0.l(dVar, new ht0.j(this, 1000 / r9));
                    this.f366294i = lVar;
                    this.V = false;
                    this.I.c(lVar.c(), this.f366285J, false, new ht0.k(this));
                    java.lang.Object obj = f366284a0;
                    synchronized (obj) {
                        try {
                            if (!this.V) {
                                obj.wait(500L);
                            }
                        } catch (java.lang.Exception e18) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Media.MediaCodecMP4MuxRecorder", e18, "[" + hashCode() + "] initSurfaceLock wait error", new java.lang.Object[0]);
                        }
                    }
                    this.I.f402385f = new ht0.m(this);
                    D();
                    com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d3 = this.f366309x;
                    ht0.a aVar = new ht0.a(c11120x15dce88d3.f152732o, c11120x15dce88d3.f152731n, c11120x15dce88d3.f152733p, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.c.a(false, this.f366303r));
                    this.f366293h = aVar;
                    aVar.f334667k = this.F;
                    int n17 = aVar.n(this.f366302q, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.a(this.f366288c));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] initImpl used %sms, ret:%s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), java.lang.Integer.valueOf(n17));
                    if (n17 == 0) {
                        return true;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markMediaCodecAACRecorderInitFailed");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(985L, 16L, 1L);
                    return false;
                } catch (java.lang.Exception e19) {
                    C();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Media.MediaCodecMP4MuxRecorder", e19, "[" + hashCode() + "] init encoder error", new java.lang.Object[0]);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putBoolean("mediacodec_create_error", true);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markMediaCodecInitFailed");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(985L, 14L, 1L);
                    return false;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] init failed!");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markMediaCodecInitFailed");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(985L, 14L, 1L);
        return false;
    }

    public final void C() {
        if (this.W) {
            return;
        }
        this.W = true;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] start release recorder");
            this.E = null;
            this.f366300o.a(ei3.l.WaitStop);
            synchronized (this.f366286a) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] start release videoEncoder");
                gs0.b bVar = this.f366294i;
                if (bVar != null) {
                    bVar.b();
                    this.f366294i.f();
                    this.f366294i = null;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(985L, 160L, 1L, false);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] end release videoEncoder");
            }
            ht0.a aVar = this.f366293h;
            if (aVar != null) {
                aVar.f(new ht0.r(this));
                this.f366293h.mo127741x5a5b64d();
                this.f366293h = null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] release buf-id ? %s", this.f366302q);
            this.f366302q.c();
            this.f366300o.a(ei3.l.Stop);
            ls0.k kVar = this.I;
            if (kVar != null) {
                kVar.e();
            }
            this.L = 0L;
            this.M = 0L;
            this.O = 0.0d;
            this.P = 0L;
            this.Q = 0L;
            this.R = 0L;
            this.N = false;
            this.f366310y = false;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Media.MediaCodecMP4MuxRecorder", e17, "[" + hashCode() + "] clear error: %s", e17.getMessage());
        }
    }

    public final void D() {
        int i17 = this.f366295j;
        int i18 = this.f366296k;
        ls0.k kVar = this.I;
        kVar.f402380a.t(i17, i18);
        int i19 = this.f366301p;
        ms0.c cVar = kVar.f402380a;
        cVar.r(i19);
        cVar.u(this.f366298m, this.f366299n);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] outputWidth: %s, outputHeight: %s, cameraPreviewWidth: %s, cameraPreviewHeight: %s, getDataRotate: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(this.f366298m), java.lang.Integer.valueOf(this.f366299n), java.lang.Integer.valueOf(this.f366301p));
    }

    public final void E(boolean z17, boolean z18, boolean z19, long j17) {
        if (this.K >= 0) {
            if (A() || !z18) {
                android.util.Pair F = F();
                if (((java.lang.Boolean) F.second).booleanValue()) {
                    int i17 = this.K;
                    long longValue = ((java.lang.Long) F.first).longValue();
                    ls0.k kVar = this.I;
                    kVar.getClass();
                    kVar.d(new ls0.g(kVar, i17, z19, j17, z17, longValue));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair F() {
        /*
            r12 = this;
            long r0 = r12.Q
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L22
            long r0 = java.lang.System.nanoTime()
            long r4 = r12.Q
            long r0 = r0 - r4
            long r4 = r12.P
            long r4 = r4 + r0
            r12.P = r4
            long r4 = r12.R
            float r4 = (float) r4
            float r0 = (float) r0
            r1 = 1232348160(0x49742400, float:1000000.0)
            float r0 = r0 / r1
            float r4 = r4 + r0
            long r0 = (long) r4
            r12.R = r0
            r12.Q = r2
        L22:
            long r0 = r12.M
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L38
            long r0 = java.lang.System.nanoTime()
            long r4 = r12.M
            long r0 = r0 - r4
            long r4 = r12.L
            long r0 = r0 + r4
            long r4 = r12.P
            long r0 = r0 - r4
            r12.P = r2
            goto L39
        L38:
            r0 = r2
        L39:
            boolean r4 = r12.N
            r5 = 1
            if (r4 == 0) goto L67
            ei3.e1 r4 = r12.f366300o
            ei3.l r4 = r4.f334572a
            ei3.l r6 = ei3.l.WaitStop
            if (r4 == r6) goto L5e
            long r6 = r12.L
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 == 0) goto L5e
            long r6 = r0 - r6
            double r6 = (double) r6
            double r8 = r12.O
            r10 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r8 = r8 * r10
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 < 0) goto L5c
            goto L5e
        L5c:
            r4 = 0
            goto L70
        L5e:
            r12.L = r0
            long r6 = java.lang.System.nanoTime()
            r12.M = r6
            goto L6f
        L67:
            r12.L = r0
            long r6 = java.lang.System.nanoTime()
            r12.M = r6
        L6f:
            r4 = r5
        L70:
            r6 = 1000(0x3e8, double:4.94E-321)
            long r8 = r0 / r6
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 != 0) goto L92
            int r2 = r12.T
            int r2 = r2 + r5
            r12.T = r2
            com.tencent.mm.plugin.sight.base.h r2 = r12.f366302q
            com.tencent.mm.modelcontrol.VideoTransPara r3 = r12.f366309x
            int r3 = r3.f152726f
            float r3 = (float) r3
            r10 = 1148846080(0x447a0000, float:1000.0)
            float r10 = r10 / r3
            int r3 = java.lang.Math.round(r10)
            int r3 = r3 * (-1)
            long r10 = (long) r3
            long r10 = r10 * r6
            r2.f(r10)
        L92:
            int r2 = r12.T
            int r2 = r2 + r5
            r12.T = r2
            if (r4 == 0) goto L9e
            com.tencent.mm.plugin.sight.base.h r2 = r12.f366302q
            r2.f(r8)
        L9e:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            r2.<init>(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ht0.s.F():android.util.Pair");
    }

    @Override // ei3.m
    public java.lang.String a() {
        return this.f366287b;
    }

    @Override // ei3.m
    public java.lang.String b() {
        return this.f366305t;
    }

    @Override // ei3.m
    public float c() {
        return this.f366290e;
    }

    @Override // ei3.m
    /* renamed from: cancel */
    public void mo127742xae7a2e7a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] cancel");
        C();
    }

    @Override // ei3.m
    /* renamed from: clear */
    public void mo127743x5a5b64d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] clear");
        C();
    }

    @Override // ei3.m
    public int d() {
        return java.lang.Math.round(this.f366289d / 1000.0f);
    }

    @Override // ei3.m
    public void e(float f17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] overrideFps: %s", java.lang.Float.valueOf(f17));
        this.f366292g = f17;
    }

    @Override // ei3.m
    public void f(java.lang.String str) {
        this.f366288c = str;
    }

    @Override // ei3.m
    public void g(java.lang.Runnable runnable) {
        this.E = runnable;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] !!!!!stop, stopCallback: %s !!!", runnable);
        if (this.f366294i == null || (this.f366293h == null && !this.G)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] error, yuvRecorder or aacRecorder is null");
            if (runnable != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(runnable);
                return;
            }
            return;
        }
        ei3.e1 e1Var = this.f366300o;
        if (e1Var != null && e1Var.f334572a == ei3.l.Stop) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] stop, already in stop videoRecordStatus");
            ht0.a aVar = this.f366293h;
            if (aVar != null) {
                aVar.mo127741x5a5b64d();
            }
            if (runnable != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(runnable);
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markMediaCodecStartWait");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        rs0.p.f480844b = android.os.SystemClock.elapsedRealtime();
        if (this.f366300o != null) {
            ku5.u0 u0Var = ku5.t0.f394148d;
            java.lang.Runnable runnable2 = this.Y;
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            java.util.Objects.requireNonNull(runnable2);
            t0Var.w(runnable2, 1500L, "record_stop_timeout");
            this.f366300o.a(ei3.l.PrepareStop);
        }
        if (this.Q > 0) {
            this.R = ((float) this.R) + (((float) (java.lang.System.nanoTime() - this.Q)) / 1000000.0f);
        }
        this.f366289d = (int) this.f366294i.d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] stop, mDurationMS:%s, accumulatePauseTime:%s", java.lang.Integer.valueOf(this.f366289d), java.lang.Long.valueOf(this.R));
        long j17 = this.R;
        if (j17 > 0) {
            this.f366289d = (int) (this.f366289d - j17);
        }
    }

    @Override // ei3.m
    /* renamed from: getFilePath */
    public java.lang.String mo127744x5000ed37() {
        return this.f366288c;
    }

    @Override // ei3.m
    /* renamed from: getFrameDataCallback */
    public di3.o mo127745x89bef366() {
        return this.Z;
    }

    @Override // ei3.m
    /* renamed from: getMd5 */
    public java.lang.String mo127746xb5885648() {
        java.lang.String str = this.A;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return str == null ? "" : str;
    }

    @Override // ei3.m
    public boolean h() {
        return this.B;
    }

    @Override // ei3.m
    public void i(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] overrideDurationMs: %s", java.lang.Integer.valueOf(i17));
        this.f366291f = i17;
    }

    @Override // ei3.m
    public boolean j() {
        return false;
    }

    @Override // ei3.m
    public boolean k(int i17) {
        if (this.f366310y) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] preInit, cameraOrientation %d", java.lang.Integer.valueOf(i17));
        boolean B = B(i17);
        this.f366310y = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] initImpl result: %s", java.lang.Boolean.valueOf(B));
        return B;
    }

    @Override // ei3.m
    public void l(int i17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] resume, cameraOrientation: %s, cameraPreviewWidth:%s, cameraPreviewHeight:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        this.f366301p = i17;
        this.f366298m = i18;
        this.f366299n = i19;
        this.I.f402380a.r(i17);
        D();
        ei3.e1 e1Var = this.f366300o;
        if (e1Var == null || e1Var.f334572a != ei3.l.Pause) {
            return;
        }
        e1Var.a(ei3.l.Start);
        ht0.a aVar = this.f366293h;
        if (aVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightAACMediaCodecRecorder", "resume, pauseTime:%s", java.lang.Long.valueOf(aVar.D));
            aVar.B = false;
            long j17 = aVar.D;
            if (j17 > 0) {
                long j18 = aVar.C;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                aVar.C = j18 + (android.os.SystemClock.elapsedRealtime() - j17);
            }
            aVar.D = 0L;
            aVar.f334666j = true;
        }
    }

    @Override // ei3.m
    public android.graphics.Point m() {
        return new android.graphics.Point(this.f366298m, this.f366299n);
    }

    @Override // ei3.m
    public long n() {
        gs0.b bVar = this.f366294i;
        if (bVar != null) {
            return bVar.d();
        }
        return 0L;
    }

    @Override // ht0.b
    public void o() {
        E(true, true, false, 0L);
    }

    @Override // ei3.m
    public tl.c p() {
        ht0.a aVar = this.f366293h;
        if (aVar != null) {
            return aVar.I;
        }
        return null;
    }

    @Override // ei3.m
    /* renamed from: pause */
    public void mo127747x65825f6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] pause");
        ei3.e1 e1Var = this.f366300o;
        if (e1Var == null || e1Var.f334572a != ei3.l.Start) {
            return;
        }
        e1Var.a(ei3.l.Pause);
        ht0.a aVar = this.f366293h;
        if (aVar != null) {
            aVar.f334666j = false;
            aVar.B = true;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            aVar.D = elapsedRealtime;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightAACMediaCodecRecorder", "pause, time:%s", java.lang.Long.valueOf(elapsedRealtime));
        }
        this.Q = java.lang.System.nanoTime();
    }

    @Override // ei3.m
    public java.lang.String q() {
        return this.f366306u;
    }

    @Override // ei3.m
    public void r(int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] setSize, width: %s, height: %s, targetWidth: %s, targetHeight: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        if (i19 % 16 != 0) {
            i19 = ai3.d.a(i19);
        }
        if (i27 % 16 != 0) {
            i27 = ai3.d.a(i27);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] setSize, after align, targetWidth: %d, targetHeight: %d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        this.f366298m = i17;
        this.f366299n = i18;
        ei3.x.f334720d.m(java.lang.Integer.valueOf(((i17 * i18) * 3) / 2));
    }

    @Override // ei3.m
    /* renamed from: reset */
    public void mo127748x6761d4f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] reset");
        C();
    }

    @Override // ei3.m
    public void s(java.lang.String str) {
        this.f366306u = str;
    }

    @Override // ei3.m
    /* renamed from: setMirror */
    public void mo127753x1849c2c1(boolean z17) {
        this.I.f402380a.m(z17);
    }

    @Override // ei3.m
    /* renamed from: setMute */
    public void mo127749x764d819b(boolean z17) {
        this.G = z17;
    }

    @Override // ei3.m
    public ei3.l t() {
        return this.f366300o.f334572a;
    }

    @Override // ei3.m
    public void u(ei3.k kVar) {
        this.D = kVar;
    }

    @Override // ei3.m
    public void v(boolean z17) {
        this.F = z17;
    }

    @Override // ei3.m
    public void w(java.lang.String str) {
        this.f366305t = str;
    }

    @Override // ei3.m
    public int x() {
        return this.f366301p;
    }

    @Override // ei3.m
    public int y(int i17, boolean z17, int i18) {
        ht0.a aVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] start, cameraOrientation: %s, isLandscape: %s, degree: %s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i18));
        this.f366307v.d();
        int i19 = 0;
        this.f366289d = 0;
        this.L = 0L;
        this.f366311z = true;
        this.f366308w.d();
        this.B = z17;
        this.C = i18;
        this.L = 0L;
        this.M = 0L;
        this.O = 0.0d;
        this.P = 0L;
        this.Q = 0L;
        this.R = 0L;
        this.O = 1000.0f / this.f366309x.f152726f;
        this.f366300o.a(ei3.l.WaitStart);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] start, checkDropFrameByPts: %s, perFrmaeDuration:%s", java.lang.Boolean.valueOf(this.N), java.lang.Double.valueOf(this.O));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f366288c)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] start error, mCurRecordPath is null!!");
            return -1;
        }
        try {
            this.f366287b = com.p314xaae8f345.mm.vfs.w6.q(this.f366288c);
            java.lang.String r17 = com.p314xaae8f345.mm.vfs.w6.r(this.f366288c);
            if (!r17.endsWith("/")) {
                r17 = r17.concat("/");
            }
            this.f366304s = r17 + hashCode() + "tempRotate.mp4";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] tempRotateFilePath:" + this.f366304s);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] retrieve file name error: %s", e17.getMessage());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] mCurRecordPath: %s, tempRotateFilePath: %s", this.f366288c, this.f366304s);
        this.f366301p = i17;
        D();
        if (!this.f366310y) {
            B(i17);
            this.f366310y = true;
        }
        D();
        if (this.G || this.F || (aVar = this.f366293h) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] start yuvRecorder with mute");
            this.f366300o.a(ei3.l.Start);
        } else {
            i19 = aVar.b(new ht0.n(this));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] start aacRecorder ret: %s", java.lang.Integer.valueOf(i19));
            if (i19 != 0) {
                this.f366300o.a(ei3.l.Error);
            } else {
                this.f366300o.a(ei3.l.Initialized);
            }
        }
        return i19;
    }

    public final void z(com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d) {
        this.f366309x = c11120x15dce88d;
        this.f366295j = c11120x15dce88d.f152724d;
        this.f366296k = c11120x15dce88d.f152725e;
        this.f366300o = new ei3.e1();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markMediaCodecCapture");
        rs0.p.f480844b = -1L;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(985L, 13L, 1L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] create MediaCodecMP4MuxRecorder, targetWidth: %s, targetHeight: %s", java.lang.Integer.valueOf(this.f366295j), java.lang.Integer.valueOf(this.f366296k));
    }

    public s(com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d, ms0.c cVar, android.opengl.EGLContext eGLContext, int i17) {
        this.f366286a = new java.lang.Object();
        this.f366288c = "";
        this.f366289d = 0;
        this.f366290e = 0.0f;
        this.f366291f = -1;
        this.f366292g = -1.0f;
        this.f366295j = 480;
        this.f366296k = 640;
        this.f366297l = 1600000;
        this.f366298m = 480;
        this.f366299n = 640;
        this.f366302q = null;
        this.f366303r = false;
        this.f366304s = null;
        this.f366305t = null;
        this.f366306u = null;
        this.f366307v = new di3.c("yuvRecorderWriteData");
        this.f366308w = new di3.c("frameCountCallback");
        this.f366310y = false;
        this.f366311z = false;
        this.A = "";
        this.B = false;
        this.C = 0;
        this.E = null;
        this.F = false;
        this.G = false;
        this.H = null;
        this.I = null;
        this.f366285J = null;
        this.K = -1;
        this.L = 0L;
        this.M = 0L;
        this.N = false;
        this.O = 0.0d;
        this.P = 0L;
        this.Q = 0L;
        this.R = 0L;
        this.S = false;
        new java.util.LinkedList();
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.Y = new ht0.f(this);
        this.Z = new ht0.g(this);
        z(c11120x15dce88d);
        this.f366285J = eGLContext;
        this.I = new ls0.k(cVar);
        this.K = i17;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] textureId : " + i17, new java.lang.Object[0]);
    }
}

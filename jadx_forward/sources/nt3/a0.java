package nt3;

/* loaded from: classes10.dex */
public final class a0 extends ls0.n implements ls0.l {
    public yz5.l A;
    public ls0.w0 B;
    public long C;
    public final rs0.a D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f421242J;
    public volatile boolean K;
    public volatile boolean L;
    public final java.lang.Runnable M;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f421243a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f421244b;

    /* renamed from: c, reason: collision with root package name */
    public final int f421245c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f421246d;

    /* renamed from: e, reason: collision with root package name */
    public final int f421247e;

    /* renamed from: f, reason: collision with root package name */
    public final int f421248f;

    /* renamed from: g, reason: collision with root package name */
    public final int f421249g;

    /* renamed from: h, reason: collision with root package name */
    public final int f421250h;

    /* renamed from: i, reason: collision with root package name */
    public final int f421251i;

    /* renamed from: j, reason: collision with root package name */
    public final int f421252j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f421253k;

    /* renamed from: l, reason: collision with root package name */
    public final yz5.l f421254l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f421255m;

    /* renamed from: n, reason: collision with root package name */
    public final int f421256n;

    /* renamed from: o, reason: collision with root package name */
    public final long f421257o;

    /* renamed from: p, reason: collision with root package name */
    public final long f421258p;

    /* renamed from: q, reason: collision with root package name */
    public nt3.k f421259q;

    /* renamed from: r, reason: collision with root package name */
    public gs0.b f421260r;

    /* renamed from: s, reason: collision with root package name */
    public gs0.r f421261s;

    /* renamed from: t, reason: collision with root package name */
    public ds0.d0 f421262t;

    /* renamed from: u, reason: collision with root package name */
    public final ls0.b1 f421263u;

    /* renamed from: v, reason: collision with root package name */
    public hs0.a f421264v;

    /* renamed from: w, reason: collision with root package name */
    public android.os.HandlerThread f421265w;

    /* renamed from: x, reason: collision with root package name */
    public android.os.HandlerThread f421266x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f421267y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f421268z;

    /* JADX WARN: Multi-variable type inference failed */
    public a0(java.lang.String str, java.util.ArrayList imageList, int i17, java.lang.String outputFilePath, int i18, int i19, int i27, int i28, int i29, int i37, long j17, long j18, boolean z17, yz5.l lVar) {
        boolean z18;
        java.lang.String str2;
        ls0.b1 b1Var;
        java.lang.String str3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageList, "imageList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outputFilePath, "outputFilePath");
        this.f421243a = str;
        this.f421244b = imageList;
        this.f421245c = i17;
        this.f421246d = outputFilePath;
        this.f421247e = i18;
        this.f421248f = i19;
        this.f421249g = i27;
        this.f421250h = i28;
        this.f421251i = i29;
        this.f421252j = i37;
        this.f421253k = z17;
        this.f421254l = lVar;
        this.f421255m = "MicroMsg.MediaCodecRemuxerFake";
        this.f421257o = j17;
        this.f421258p = -1L;
        this.D = new rs0.a("remuxCost");
        java.util.Iterator it = imageList.iterator();
        while (true) {
            if (!it.hasNext()) {
                z18 = true;
                break;
            } else if (!com.p314xaae8f345.mm.vfs.w6.j((java.lang.String) it.next())) {
                z18 = false;
                break;
            }
        }
        if (!z18 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f421246d) || this.f421247e <= 0 || this.f421248f <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f421255m, "create MediaCodecRemuxer error, outputFilePath:" + this.f421246d + ", outputWidth:" + this.f421247e + ", outputHeight:" + this.f421248f + ", videoFps:" + this.f421256n + ", outputFps:" + this.f421252j);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxVideoParaError");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(986L, 10L, 1L);
            throw new java.lang.IllegalArgumentException("create MediaCodecRemuxer error");
        }
        rs0.p.f480843a.c(this.f421245c);
        com.p314xaae8f345.mm.vfs.w6.u(com.p314xaae8f345.mm.vfs.w6.r(this.f421246d));
        st3.o.f494090a.c();
        int i38 = st3.o.f494092c;
        int i39 = st3.o.f494093d;
        this.f421256n = 15;
        if (j18 == 0) {
            this.f421258p = 15000;
        } else {
            this.f421258p = j18;
        }
        boolean z19 = this.f421253k;
        if (z19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f421255m, "mixMuxerController init useX264Encode, bitrate %s, width %s, height %s, fps %s", java.lang.Integer.valueOf(this.f421249g), java.lang.Integer.valueOf(this.f421247e), java.lang.Integer.valueOf(this.f421248f), java.lang.Integer.valueOf(this.f421252j));
            str2 = "MicroMsg.MediaEditorIDKeyStat";
            b1Var = new ls0.b1(this.f421257o, this.f421258p, this.f421249g, this.f421247e, this.f421248f, this.f421253k, this.f421252j, false, null);
        } else {
            str2 = "MicroMsg.MediaEditorIDKeyStat";
            b1Var = new ls0.b1(this.f421257o, this.f421258p, this.f421249g, z19, false, null, 48, null);
        }
        this.f421263u = b1Var;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(this.f421255m, "create MediaCodecRemuxer, outputFilePath: " + this.f421246d + ", inputWidth: " + i38 + ", inputHeight: " + i39 + ", videoFps: 15 ,outputBitrate :" + this.f421249g + ", outputAudioBitrate:" + this.f421250h + " , outputWidth: " + this.f421247e + ", outputHeight: " + this.f421248f + ", startTimeMs: " + j17 + ", endTimeMs: " + j18 + " , outputFps: " + this.f421252j + " , videoDuration: 15000 , remuxStartTime: " + this.f421257o + " ,remuxEndTime: " + this.f421258p, new java.lang.Object[0]);
        java.lang.String str4 = this.f421255m;
        this.B = new ls0.w0(b1Var, null, this.f421246d, this.f421245c, this.f421251i, 1);
        java.lang.String str5 = this.f421243a;
        if (com.p314xaae8f345.mm.vfs.w6.j(str5)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str5);
            hs0.a aVar = new hs0.a(str5);
            if (aVar.f366090k) {
                str3 = str2;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "markRemuxMusicMediaExtractorCreateFailed");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(986L, 15L, 1L);
            } else {
                str3 = str2;
            }
            this.f421264v = aVar;
        } else {
            str3 = str2;
        }
        try {
            int i47 = this.f421252j;
            int min = i47 > 0 ? java.lang.Math.min(i47, 15) : 15;
            es0.d dVar = new es0.d(false, 1, 0 == true ? 1 : 0);
            dVar.f337847d = this.f421249g;
            dVar.f337848e = min;
            dVar.f337846c = this.f421248f;
            dVar.f337845b = this.f421247e;
            dVar.f337853j = true;
            nt3.w wVar = new nt3.w(this);
            nt3.x xVar = new nt3.x(this);
            try {
                if (this.f421253k) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "useX264Encode");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h hVar = b1Var.f402337e;
                    gs0.r rVar = new gs0.r(hVar != null ? hVar.f243948a : -1, dVar.f337845b, dVar.f337846c);
                    this.f421261s = rVar;
                    rVar.a();
                } else {
                    this.f421260r = fp.h.c(23) ? new gs0.p(dVar, new nt3.o(wVar, xVar)) : new gs0.l(dVar, new nt3.p(wVar, xVar));
                }
            } catch (java.lang.Exception e17) {
                if (dVar.f337853j) {
                    dVar.f337853j = false;
                    try {
                        this.f421260r = fp.h.c(23) ? new gs0.p(dVar, new nt3.q(wVar, xVar)) : new gs0.l(dVar, new nt3.r(wVar, xVar));
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1092L, 12L, 1L);
                    } catch (java.lang.Exception unused) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str4, e17, "create encoder again error", new java.lang.Object[0]);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "markRemuxH264EncoderInitFailed");
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                        g0Var.C(986L, 16L, 1L);
                        h(false);
                        g0Var.C(1092L, 11L, 1L);
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str4, e17, "create encoder error", new java.lang.Object[0]);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "markRemuxH264EncoderInitFailed");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                    g0Var2.C(986L, 16L, 1L);
                    h(false);
                    g0Var2.C(1092L, 11L, 1L);
                }
            }
            if (this.f421261s != null || this.f421260r != null) {
                gs0.b bVar = this.f421260r;
                this.f421259q = new nt3.k(this.f421244b, this.f421257o, this.f421258p, null, bVar != null ? bVar.c() : null, this.f421247e, this.f421248f, this.f421253k, this.f421252j, new nt3.v(this, dVar));
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str4, e18, "remux impl error", new java.lang.Object[0]);
        }
        this.M = new nt3.l(this);
    }

    public static final void e(nt3.a0 a0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a0Var.f421255m, "checkFinishEncode, encodeFrameCount:" + a0Var.I + ", drawFrameCount:" + a0Var.f421242J + ", isFinishEncode:" + a0Var.L + ", isDecodeEnd:" + a0Var.K);
        if (a0Var.I >= a0Var.f421242J && a0Var.K) {
            a0Var.f();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxEndWithFrameNumberMatch");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(986L, 90L, 1L);
        } else if (a0Var.K) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(a0Var.M);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(a0Var.M, 1000L);
        }
    }

    @Override // ls0.l
    public void a(yz5.l blendBitmapProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(blendBitmapProvider, "blendBitmapProvider");
        this.A = blendBitmapProvider;
    }

    @Override // ls0.n, ls0.l
    public int b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f421255m, "start remux, initFinish:" + this.f421267y);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.C = android.os.SystemClock.elapsedRealtime();
        this.D.f480821b.b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016();
        if (this.f421267y) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1092L, 2L, 1L);
            android.os.HandlerThread handlerThread = this.f421265w;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            this.f421265w = pm0.v.m("MediaCodecRemux_audioMix", false, new nt3.m(this));
            android.os.HandlerThread handlerThread2 = this.f421266x;
            if (handlerThread2 != null) {
                handlerThread2.quit();
            }
            if (this.f421259q != null) {
                this.f421266x = pm0.v.m("MediaCodecRemux_videoMix", false, new nt3.n(this));
            }
        } else {
            this.f421268z = true;
        }
        return 0;
    }

    @Override // ls0.l
    public void c(yz5.l blurBgProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(blurBgProvider, "blurBgProvider");
    }

    @Override // ls0.n
    public void d(android.graphics.Bitmap bitmap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
    }

    public final void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f421255m, "finishEncode %s", java.lang.Boolean.valueOf(this.f421253k));
        if (this.f421253k) {
            gs0.r rVar = this.f421261s;
            if (rVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264TransEncoder", "stop isCancel:false");
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                synchronized (rVar.f356549f) {
                    rVar.f356547d = true;
                    rVar.f356548e = false;
                    rVar.f356546c.mo50299x35224f();
                    ru5.i iVar = rVar.f356545b;
                    if (iVar != null) {
                        iVar.g();
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264TransEncoder", "stop finish, cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
                }
            }
            g(true);
        } else {
            gs0.b bVar = this.f421260r;
            if (bVar != null) {
                bVar.b();
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.M);
        this.L = true;
    }

    public final synchronized void g(boolean z17) {
        yz5.l lVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f421255m, "finishRemux, isVideo: " + z17 + ", isAudioRemuxFinish:" + this.G + ", isVideoRemuxFinish:" + this.F + ", isInvokeEndCallback:" + this.E);
        if (z17) {
            this.F = true;
        } else {
            this.G = true;
        }
        if (this.G && this.F && !this.E) {
            this.D.a();
            this.E = true;
            ls0.w0 w0Var = this.B;
            if (w0Var != null && (lVar = w0Var.f402487n) != null) {
                ((ls0.u0) lVar).mo146xb9724478(this.f421254l);
            }
            android.os.HandlerThread handlerThread = this.f421265w;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            android.os.HandlerThread handlerThread2 = this.f421266x;
            if (handlerThread2 != null) {
                handlerThread2.quitSafely();
            }
            long j17 = this.C;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f421255m, "remux used " + elapsedRealtime + " decodeFrame:" + this.H + ", encodeFrame:" + this.I + ", drawFrameCount:" + this.f421242J);
            try {
                if (com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(this.f421246d, true) != null) {
                    rs0.p pVar = rs0.p.f480843a;
                    pVar.d(this.f421245c, elapsedRealtime);
                    pVar.e(r14.f243916b, r14.f243919e, this.f421256n);
                    if (this.H / this.I >= 1.5d) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxFrameCountDiffError");
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(986L, 53L, 1L);
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public final synchronized void h(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f421255m, "onDecoderEncoderFailed, isDecoder:" + z17);
        if (!this.E) {
            this.D.a();
            this.E = true;
            try {
                android.os.HandlerThread handlerThread = this.f421265w;
                if (handlerThread != null) {
                    handlerThread.quit();
                }
                android.os.HandlerThread handlerThread2 = this.f421266x;
                if (handlerThread2 != null) {
                    handlerThread2.quit();
                }
                com.p314xaae8f345.mm.vfs.w6.h(this.f421246d);
                long j17 = this.C;
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f421255m, "onDecoderEncoderFailed, finish, costTime:" + elapsedRealtime);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f421255m, e17, "onDecoderEncoderFailed error:" + e17.getMessage(), new java.lang.Object[0]);
            }
            yz5.l lVar = this.f421254l;
            if (lVar != null) {
                lVar.mo146xb9724478(null);
            }
        }
    }
}

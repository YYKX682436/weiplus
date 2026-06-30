package com.p314xaae8f345.mm.p961x7eb7aaf2;

@java.lang.Deprecated
/* renamed from: com.tencent.mm.modelvideo.MMVideoView */
/* loaded from: classes4.dex */
public class C11149x9c6f800 extends com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5 implements t21.h0 {
    public static final /* synthetic */ int N1 = 0;
    public int A1;
    public int B1;
    public boolean C1;
    public boolean D1;
    public int E1;
    public int F1;
    public boolean G1;
    public boolean H1;
    public boolean I1;
    public t21.n0 J1;
    public boolean K1;
    public boolean L1;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 M1;

    /* renamed from: l1, reason: collision with root package name */
    public java.lang.String f153178l1;

    /* renamed from: p0, reason: collision with root package name */
    public java.lang.String f153179p0;

    /* renamed from: p1, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.a1 f153180p1;

    /* renamed from: x0, reason: collision with root package name */
    public t21.i0 f153181x0;

    /* renamed from: x1, reason: collision with root package name */
    public int f153182x1;

    /* renamed from: y0, reason: collision with root package name */
    public java.lang.String f153183y0;

    /* renamed from: y1, reason: collision with root package name */
    public int f153184y1;

    /* renamed from: z1, reason: collision with root package name */
    public d61.f f153185z1;

    public C11149x9c6f800(android.content.Context context) {
        super(context);
        this.f153182x1 = 0;
        this.f153184y1 = 0;
        this.E1 = 0;
        this.G1 = false;
        this.H1 = false;
        this.I1 = false;
        this.K1 = false;
        this.M1 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new t21.m0(this), true);
    }

    /* renamed from: getRootPath */
    private java.lang.String m48225x71e6559d() {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f153179p0)) {
            return this.f153179p0;
        }
        return lp0.b.D() + "video/";
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5, com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 C(android.content.Context context) {
        this.f271290z = 1;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 c19745xad58a1a4 = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4(context, null);
        c19745xad58a1a4.m75832xcbe8d3cd(true);
        return c19745xad58a1a4;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5, com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e
    public void I() {
        super.I();
        this.f271272e = "MicroMsg.MMVideoView";
        this.f271271d = "VideoView.MMVideoView";
        this.f153185z1 = c0();
        this.J1 = new t21.n0();
        f0();
        i0();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e
    public void U(boolean z17) {
        N();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.M1;
        b4Var.d();
        b4Var.c(10L, 500L);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e
    public void V() {
        this.M1.d();
    }

    public boolean Z(int i17, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2) {
        c19767x257d7f.f38864x6ac9171 = java.lang.Math.max(i17, this.E1);
        int i18 = this.f153184y1;
        if (i18 == 1) {
            c19767x257d7f.f38864x6ac9171 = i17;
            c19767x257d7f2.f38864x6ac9171 = this.F1 + i17;
        }
        if (i18 == 2) {
            int i19 = i17 - 8;
            c19767x257d7f.f38864x6ac9171 = i19;
            if (i19 < 0) {
                c19767x257d7f.f38864x6ac9171 = 0;
            }
            c19767x257d7f2.f38864x6ac9171 = c19767x257d7f.f38864x6ac9171 + this.F1 + 8;
        }
        if (i18 == 3 || i18 == 4) {
            c19767x257d7f.f38864x6ac9171 = this.E1;
            c19767x257d7f2.f38864x6ac9171 = this.F1 + i17 + 1 + this.J1.f496374b;
        }
        int i27 = c19767x257d7f2.f38864x6ac9171;
        int i28 = this.A1;
        if (i27 >= i28 + 1) {
            c19767x257d7f2.f38864x6ac9171 = i28 + 1;
        }
        int i29 = c19767x257d7f2.f38864x6ac9171;
        int i37 = c19767x257d7f.f38864x6ac9171;
        if (i29 >= i37) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "%s calcDownloadRange range[%d, %d] playTime[%d] playStatus[%d] cache[%d, %d] [%s]", N(), java.lang.Integer.valueOf(c19767x257d7f.f38864x6ac9171), java.lang.Integer.valueOf(c19767x257d7f2.f38864x6ac9171), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f153184y1), java.lang.Integer.valueOf(this.E1), java.lang.Integer.valueOf(this.F1), this.f153183y0);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VideoView.MMVideoView", "calcDownloadRange ret is false, range[%d, %d] playTime[%d] playStatus[%d] cache[%d, %d] [%s]", java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(c19767x257d7f2.f38864x6ac9171), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f153184y1), java.lang.Integer.valueOf(this.E1), java.lang.Integer.valueOf(this.F1), this.f153183y0);
        c19767x257d7f2.f38864x6ac9171 = c19767x257d7f.f38864x6ac9171 + this.J1.f496374b;
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5, com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    public boolean a(double d17, boolean z17) {
        return j0((int) d17, z17);
    }

    public boolean a0(int i17) {
        if (this.f153182x1 == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271271d, "checkCanPlay true, downloadStatus is download finish");
            return true;
        }
        int i18 = this.E1;
        if (i18 - i17 <= 1 && i18 < this.A1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271271d, "checkCanPlay false, cachePlayTime is " + this.E1 + ", playTime is " + i17 + ", MIN_CAN_PLAY_CACHE is 1, timeDuration is " + this.A1);
            return false;
        }
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        try {
            if (this.f153185z1.b(i17, i17 + 1, c19767x257d7f, c19767x257d7f2)) {
                t21.i0 i0Var = this.f153181x0;
                r5 = i0Var != null ? i0Var.e(this.f153183y0, c19767x257d7f.f38864x6ac9171, c19767x257d7f2.f38864x6ac9171) : false;
                if (!r5) {
                    this.E1 = i17;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271271d, "checkCanPlay ret is " + r5 + ", cachePlayTime is " + this.E1 + ", playTime is " + i17);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271271d, "checkCanPlay false, parser videoTimeToFilePos return false");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f271272e, "%s check video data error %s ", N(), e17.toString());
        }
        return r5;
    }

    public boolean b0(int i17) {
        boolean z17;
        int i18 = this.B1;
        if (i18 == -1) {
            i18 = i17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, N() + " check timer playCurrPos " + i17 + " playTime " + i18 + " cachePlayTime " + this.E1 + " timeDuration " + this.A1 + " playStatus " + this.f153184y1 + " downloadStatus " + this.f153182x1 + " cdnMediaId " + this.f153183y0 + " isPrepareVideo[" + this.G1 + "], isPrepared[" + this.E + "]");
        int i19 = this.f153182x1;
        if (i19 != 1) {
            if (i19 == 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271271d, "checkTimer, downloadStatus is download error, playCurrPos is " + i17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f271272e, "%s download error.", N());
            } else {
                if (i19 == 3) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271271d, "checkTimer, downloadStatus is download finish, playCurrPos is " + i17 + ", playTime is " + i18);
                    if (!this.E) {
                        if (this.f153184y1 == 5) {
                            this.f153184y1 = 1;
                        }
                        g0();
                        return true;
                    }
                    if (this.D1) {
                        int i27 = this.B1;
                        if (i27 != -1) {
                            j0(i27, true);
                            this.B1 = -1;
                            this.D1 = false;
                        } else {
                            this.D1 = !mo48232x348b34();
                        }
                    }
                    this.f153184y1 = 3;
                    W(i18);
                    return true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271271d, "checkTimer, downloadStatus is default, playCurrPos is " + i17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f271272e, "%s check time default.", N());
            }
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271271d, "checkTimer, downloadStatus is downloading, playCurrPos is " + i17 + ", playTime is " + i18);
        boolean a07 = a0(i18);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.e3 e3Var = this.R;
        if (a07) {
            if (this.G1) {
                W(i18);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "resumeByDataGain, playStatus:%s, isPlaying:%s, pauseByLoadData:%s", java.lang.Integer.valueOf(this.f153184y1), java.lang.Boolean.valueOf(this.f271281q.mo69311xc00617a4()), java.lang.Boolean.valueOf(this.D1));
                if (this.D1) {
                    boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    e3Var.f272332f = currentTimeMillis;
                    long j17 = e3Var.f272331e;
                    if (j17 > 0) {
                        e3Var.f272333g += currentTimeMillis - j17;
                    }
                    R();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "%s resume by data gain cdnMediaId %s", N(), this.f153183y0);
                    int i28 = this.B1;
                    if (i28 != -1) {
                        j0(i28, this.C1);
                        this.B1 = -1;
                        this.D1 = false;
                    } else {
                        this.D1 = !mo48232x348b34();
                    }
                    this.f153184y1 = 3;
                } else if (this.f153184y1 != 3 || !this.f271281q.mo69311xc00617a4()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "%s start to play video playStatus[%d]", N(), java.lang.Integer.valueOf(this.f153184y1));
                    this.f153184y1 = mo48232x348b34() ? 3 : this.f153184y1;
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "%s prepare cdnMediaId [%s]", N(), this.f153183y0);
                if (this.f153184y1 == 5) {
                    this.f153184y1 = 1;
                }
                g0();
            }
            z17 = true;
        } else {
            this.D1 = true;
            if (this.E1 > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "%s pause by load data cdnMediaId %s, playStatus %d", N(), this.f153183y0, java.lang.Integer.valueOf(this.f153184y1));
                boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                e3Var.f272331e = java.lang.System.currentTimeMillis();
                int i29 = this.f153184y1;
                if (i29 != 2 && i29 != 4) {
                    int i37 = this.F1 + this.J1.f496373a;
                    this.F1 = i37;
                    this.F1 = java.lang.Math.min(i37, 60);
                    e3Var.f272334h++;
                    this.f153184y1 = 4;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "%s pauseByDataBlock ", N());
                T();
                mo48231x65825f6();
            } else if (this.B1 == -1) {
                this.f153184y1 = 1;
            } else {
                this.f153184y1 = 2;
            }
            z17 = false;
        }
        W(i18);
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        if (!Z(i18, c19767x257d7f, c19767x257d7f2)) {
            N();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VideoView.MMVideoView", "%s can not calc download.", N());
        } else if (h0(c19767x257d7f.f38864x6ac9171, c19767x257d7f2.f38864x6ac9171, false)) {
            this.E1 = java.lang.Math.max(this.E1, c19767x257d7f2.f38864x6ac9171);
            return true;
        }
        return z17;
    }

    public d61.f c0() {
        return new d61.j();
    }

    public void d0() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.T)) {
            return;
        }
        this.f153183y0 = "MMVideo_" + this.T.hashCode();
        java.lang.String str = m48225x71e6559d() + "MMVideo_" + this.T.hashCode() + ".mp4";
        this.f153178l1 = str;
        com.p314xaae8f345.mm.vfs.w6.u(com.p314xaae8f345.mm.vfs.w6.r(str));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "%s set video path [%s %s]", N(), this.f153183y0, this.f153178l1);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5, com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    public void e() {
        super.e();
        if (this.K1) {
            this.I1 = true;
            mo48239x360802();
        }
    }

    public void e0(java.lang.String str, long j17, long j18, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271271d, "onMoovReady");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "%s deal moov ready moovPos %d, timeDuration %d, cdnMediaId %s", N(), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(this.A1), this.f153183y0);
        if (this.A1 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f271272e, "moov had callback, do nothing.");
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.e3 e3Var = this.R;
        if (e3Var.f272339m == 0) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            e3Var.f272339m = java.lang.System.currentTimeMillis();
        }
        try {
            d61.f fVar = this.f153185z1;
            if (fVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f271272e, "%s parser is null, thread is error.", N());
                return;
            }
            if (!fVar.a(this.f153178l1, j17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f271272e, "%s mp4 parse moov error. cdnMediaId %s", N(), this.f153183y0);
                t21.i0 i0Var = this.f153181x0;
                if (i0Var != null) {
                    i0Var.a(this.f153183y0, 0, -1);
                    return;
                }
                return;
            }
            this.A1 = this.f153185z1.c();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "%s mp4 parse moov success. duration %d cdnMediaId %s ", N(), java.lang.Integer.valueOf(this.A1), this.f153183y0);
            if (b0(0)) {
                g0();
            }
            if (this.B1 == -1) {
                this.f153184y1 = 1;
            } else {
                this.f153184y1 = 2;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f271272e, e17, "%s deal moov ready error [%s]", N(), this.f153183y0);
        }
    }

    @Override // t21.h0
    public void f(java.lang.String str, long j17, long j18) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(this.f153183y0, str)) {
            N();
        }
    }

    public void f0() {
        t21.n0 n0Var = this.J1;
        n0Var.f496373a = 5;
        n0Var.f496374b = 2;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5, com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    public void g() {
        super.g();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "%s onUIResume stopDownloadByUiPause[%b] currTimeOnUiPause[%d] isPlayOnUiPause[%b]", N(), java.lang.Boolean.valueOf(this.I1), java.lang.Integer.valueOf(this.f271282r), java.lang.Boolean.valueOf(this.f271283s));
        if (this.I1) {
            j0(this.f271282r, this.f271283s);
            return;
        }
        if (this.f271281q == null || !fp.h.c(24)) {
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f271281q;
        if (f4Var instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4) {
            ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4) f4Var).E();
        }
    }

    public void g0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271271d, "prepareVideo and set video path to VideoPlayerTextureView");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(this.f271272e, "%s prepareVideo", N());
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f271281q;
        if (f4Var != null) {
            this.G1 = true;
            f4Var.mo69327xab3268fe(this.f153178l1);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5, com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: getCacheTimeSec */
    public int mo48226x8a3f46d8() {
        return this.f153182x1 == 3 ? mo61527x6d590e18() : this.E1;
    }

    /* renamed from: getInnerVideoView */
    public android.view.View mo48227xab066d00() {
        java.lang.Object obj = this.f271281q;
        if (obj instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4) {
            return (android.view.View) obj;
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e
    /* renamed from: getMediaId */
    public java.lang.String mo48228x75e04be9() {
        return this.f153183y0;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5, com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e
    /* renamed from: getReportIdkey */
    public int mo48229xc9e6d95a() {
        return 100;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5, com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    public void h(boolean z17, java.lang.String str, int i17) {
        super.h(z17, str, i17);
        d0();
    }

    public final boolean h0(int i17, int i18, boolean z17) {
        t21.i0 i0Var;
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        boolean z18 = false;
        try {
            if (this.f153185z1.b(i17, i18, c19767x257d7f, c19767x257d7f2) && (i0Var = this.f153181x0) != null) {
                z18 = i0Var.e(this.f153183y0, c19767x257d7f.f38864x6ac9171, c19767x257d7f2.f38864x6ac9171);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f271272e, "%s check video data error[%s] ", N(), e17.toString());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271271d, "requestVideoData ret is " + z18 + ", cdnMediaId is " + this.f153183y0 + ", offset is " + c19767x257d7f.f38864x6ac9171 + ", length is " + c19767x257d7f2.f38864x6ac9171 + ", isRequestNow is " + this.H1 + ", isSeek is " + z17);
        if (z18) {
            N();
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(this.f153183y0);
            sb6.append("_");
            sb6.append(c19767x257d7f.f38864x6ac9171);
            sb6.append("_");
            sb6.append(c19767x257d7f2.f38864x6ac9171);
            if (!this.H1 || z17) {
                this.H1 = true;
                t21.i0 i0Var2 = this.f153181x0;
                if (i0Var2 != null) {
                    i0Var2.a(this.f153183y0, c19767x257d7f.f38864x6ac9171, c19767x257d7f2.f38864x6ac9171);
                }
            } else {
                N();
            }
        }
        return z18;
    }

    public void i0() {
        this.B1 = -1;
        this.E1 = 0;
        this.A1 = 0;
        this.f153184y1 = 0;
        this.f153182x1 = 0;
        this.D1 = false;
        this.G1 = false;
        this.H1 = false;
        t21.n0 n0Var = this.J1;
        if (n0Var != null) {
            this.F1 = n0Var.f496373a;
        }
    }

    public boolean j0(int i17, boolean z17) {
        int i18 = this.f153182x1;
        boolean z18 = true;
        if (i18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271271d, "seekTo, downloadStatus is download default, isPrepared is " + L());
            if (!L()) {
                if (this.D) {
                    this.A = z17;
                    this.C1 = z17;
                    this.B = i17;
                    this.B1 = i17;
                } else {
                    this.A = z17;
                    if (i17 > 0) {
                        this.B = i17;
                    } else {
                        this.B = this.f271282r;
                    }
                }
                mo48238x68ac462();
            }
        } else if (i18 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271271d, "seekTo, downloadStatus is downloading");
            this.f153184y1 = 2;
            com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
            com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
            Z(i17, c19767x257d7f, c19767x257d7f2);
            if (h0(c19767x257d7f.f38864x6ac9171, c19767x257d7f2.f38864x6ac9171, true)) {
                this.B1 = -1;
                this.D1 = false;
                this.E1 = c19767x257d7f2.f38864x6ac9171;
                this.f153184y1 = 3;
                super.a(i17, z17);
            } else {
                this.B1 = i17;
                this.C1 = z17;
                this.D1 = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "%s pauseByDataBlock ", N());
                T();
                mo48231x65825f6();
                z18 = false;
            }
        } else if (i18 == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271271d, "seekTo, downloadStatus is download error");
        } else if (i18 == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271271d, "seekTo, downloadStatus is download finish");
            super.a(i17, z17);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(this.f271272e, "%s seek video time %d, download status %d playStatus %d", N(), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f153182x1), java.lang.Integer.valueOf(this.f153184y1));
        return z18;
    }

    public void o(java.lang.String str, int i17) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(this.f153183y0, str) || this.f153182x1 == 3) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "%s download finish [%d]", N(), java.lang.Integer.valueOf(i17));
        if (i17 == 0) {
            this.f153182x1 = 3;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.a1 a1Var = this.f153180p1;
        if (a1Var != null) {
            a1Var.r(this.f153178l1, this.f153184y1 > 0);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271271d, "onFinish, startTimer");
        U(true);
        this.H1 = false;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5, com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onCompletion */
    public void mo9755xa6db431b() {
        t21.i0 i0Var;
        if (this.L1) {
            j0(0, true);
            Y();
        } else {
            super.mo9755xa6db431b();
            java.lang.String str = this.f153183y0;
            if (str != null && (i0Var = this.f153181x0) != null) {
                i0Var.c(str);
            }
            i0();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f271281q;
            if (f4Var != null) {
                f4Var.mo69303x360802();
            }
        }
        this.f153185z1.mo123590x41012807();
    }

    /* renamed from: onDataAvailable */
    public void mo48220x9bb59ea0(java.lang.String str, long j17, long j18) {
        this.H1 = false;
        if (j17 <= -1 || j18 <= -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f271272e, "%s deal data available error offset[%d], length[%d]", N(), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(this.f153183y0, str)) {
            try {
                this.E1 = this.f153185z1.d((int) j17, (int) j18);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f271272e, "%s deal data available file pos to video time error[%s] ", N(), e17.toString());
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "%s deal data available. offset[%d] length[%d] cachePlayTime[%d]", N(), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(this.E1));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271271d, "onDataAvailable, startTimer");
            U(true);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.d4
    /* renamed from: onSurfaceAvailable */
    public void mo48230xe037649b() {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: pause */
    public boolean mo48231x65825f6() {
        boolean mo48231x65825f6 = super.mo48231x65825f6();
        if (mo48231x65825f6) {
            this.H1 = false;
            this.f153184y1 = 4;
        }
        return mo48231x65825f6;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: play */
    public boolean mo48232x348b34() {
        boolean mo48232x348b34 = super.mo48232x348b34();
        if (mo48232x348b34) {
            this.f153184y1 = 3;
        }
        return mo48232x348b34;
    }

    /* renamed from: setDownloadStatus */
    public void m48233xdcf5339c(int i17) {
        this.f153182x1 = i17;
    }

    /* renamed from: setFilepath */
    public void mo48234x4ac7da23(java.lang.String str) {
        this.f153178l1 = str;
    }

    /* renamed from: setIMMDownloadFinish */
    public void mo48221xf83edb22(com.p314xaae8f345.mm.p2470x93e71c27.ui.a1 a1Var) {
        this.f153180p1 = a1Var;
    }

    /* renamed from: setIOnlineVideoProxy */
    public void m48235xbc2f47ad(t21.i0 i0Var) {
        this.f153181x0 = i0Var;
        i0Var.d(this);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5, com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: setLoop */
    public void mo48236x764cf626(boolean z17) {
        this.L1 = z17;
    }

    /* renamed from: setRootPath */
    public void mo48224x6c9eb6a9(java.lang.String str) {
        this.f153179p0 = str;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5, com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: setScaleType */
    public void mo48237xebd28962(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1 e1Var) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f271281q;
        if (f4Var instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4) {
            ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4) f4Var).m75834xebd28962(e1Var);
            H(600L, mo48229xc9e6d95a() + 14, 1L, false);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5, com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: start */
    public void mo48238x68ac462() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "%s start cdnMediaId[%s] timeDuration[%d]", N(), this.f153183y0, java.lang.Integer.valueOf(this.A1));
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f271281q;
        if (f4Var != null) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f4Var.getF256131m())) {
                T();
                this.K1 = true;
                this.A1 = 0;
                this.f153182x1 = 1;
                t21.i0 i0Var = this.f153181x0;
                if (i0Var != null) {
                    i0Var.b(this.f153183y0, this.f153178l1, this.T);
                    this.f153181x0.d(this);
                }
                Q();
            } else {
                mo48232x348b34();
            }
            H(600L, mo48229xc9e6d95a() + 1, 1L, false);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: stop */
    public void mo48239x360802() {
        t21.i0 i0Var = this.f153181x0;
        if (i0Var != null) {
            i0Var.c(this.f153183y0);
        }
        i0();
        super.mo48239x360802();
        this.f153185z1.mo123590x41012807();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.c4
    public void z(boolean z17) {
        super.z(z17);
        D();
    }

    public C11149x9c6f800(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f153182x1 = 0;
        this.f153184y1 = 0;
        this.E1 = 0;
        this.G1 = false;
        this.H1 = false;
        this.I1 = false;
        this.K1 = false;
        this.M1 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new t21.m0(this), true);
    }

    public C11149x9c6f800(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f153182x1 = 0;
        this.f153184y1 = 0;
        this.E1 = 0;
        this.G1 = false;
        this.H1 = false;
        this.I1 = false;
        this.K1 = false;
        this.M1 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new t21.m0(this), true);
    }

    public C11149x9c6f800(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(context, attributeSet, i17, i18);
        this.f153182x1 = 0;
        this.f153184y1 = 0;
        this.E1 = 0;
        this.G1 = false;
        this.H1 = false;
        this.I1 = false;
        this.K1 = false;
        this.M1 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new t21.m0(this), true);
    }
}

package com.tencent.mm.modelvideo;

@java.lang.Deprecated
/* loaded from: classes4.dex */
public class MMVideoView extends com.tencent.mm.pluginsdk.ui.CommonVideoView implements t21.h0 {
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
    public final com.tencent.mm.sdk.platformtools.b4 M1;

    /* renamed from: l1, reason: collision with root package name */
    public java.lang.String f71645l1;

    /* renamed from: p0, reason: collision with root package name */
    public java.lang.String f71646p0;

    /* renamed from: p1, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.a1 f71647p1;

    /* renamed from: x0, reason: collision with root package name */
    public t21.i0 f71648x0;

    /* renamed from: x1, reason: collision with root package name */
    public int f71649x1;

    /* renamed from: y0, reason: collision with root package name */
    public java.lang.String f71650y0;

    /* renamed from: y1, reason: collision with root package name */
    public int f71651y1;

    /* renamed from: z1, reason: collision with root package name */
    public d61.f f71652z1;

    public MMVideoView(android.content.Context context) {
        super(context);
        this.f71649x1 = 0;
        this.f71651y1 = 0;
        this.E1 = 0;
        this.G1 = false;
        this.H1 = false;
        this.I1 = false;
        this.K1 = false;
        this.M1 = new com.tencent.mm.sdk.platformtools.b4(new t21.m0(this), true);
    }

    private java.lang.String getRootPath() {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f71646p0)) {
            return this.f71646p0;
        }
        return lp0.b.D() + "video/";
    }

    @Override // com.tencent.mm.pluginsdk.ui.CommonVideoView, com.tencent.mm.pluginsdk.ui.AbstractVideoView
    public com.tencent.mm.pluginsdk.ui.tools.f4 C(android.content.Context context) {
        this.f189757z = 1;
        com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView = new com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView(context, null);
        videoPlayerTextureView.setNeedResetExtractor(true);
        return videoPlayerTextureView;
    }

    @Override // com.tencent.mm.pluginsdk.ui.CommonVideoView, com.tencent.mm.pluginsdk.ui.AbstractVideoView
    public void I() {
        super.I();
        this.f189739e = "MicroMsg.MMVideoView";
        this.f189738d = "VideoView.MMVideoView";
        this.f71652z1 = c0();
        this.J1 = new t21.n0();
        f0();
        i0();
    }

    @Override // com.tencent.mm.pluginsdk.ui.AbstractVideoView
    public void U(boolean z17) {
        N();
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.M1;
        b4Var.d();
        b4Var.c(10L, 500L);
    }

    @Override // com.tencent.mm.pluginsdk.ui.AbstractVideoView
    public void V() {
        this.M1.d();
    }

    public boolean Z(int i17, com.tencent.mm.pointers.PInt pInt, com.tencent.mm.pointers.PInt pInt2) {
        pInt.value = java.lang.Math.max(i17, this.E1);
        int i18 = this.f71651y1;
        if (i18 == 1) {
            pInt.value = i17;
            pInt2.value = this.F1 + i17;
        }
        if (i18 == 2) {
            int i19 = i17 - 8;
            pInt.value = i19;
            if (i19 < 0) {
                pInt.value = 0;
            }
            pInt2.value = pInt.value + this.F1 + 8;
        }
        if (i18 == 3 || i18 == 4) {
            pInt.value = this.E1;
            pInt2.value = this.F1 + i17 + 1 + this.J1.f414841b;
        }
        int i27 = pInt2.value;
        int i28 = this.A1;
        if (i27 >= i28 + 1) {
            pInt2.value = i28 + 1;
        }
        int i29 = pInt2.value;
        int i37 = pInt.value;
        if (i29 >= i37) {
            com.tencent.mars.xlog.Log.i(this.f189739e, "%s calcDownloadRange range[%d, %d] playTime[%d] playStatus[%d] cache[%d, %d] [%s]", N(), java.lang.Integer.valueOf(pInt.value), java.lang.Integer.valueOf(pInt2.value), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f71651y1), java.lang.Integer.valueOf(this.E1), java.lang.Integer.valueOf(this.F1), this.f71650y0);
            return true;
        }
        com.tencent.mars.xlog.Log.i("VideoView.MMVideoView", "calcDownloadRange ret is false, range[%d, %d] playTime[%d] playStatus[%d] cache[%d, %d] [%s]", java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(pInt2.value), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f71651y1), java.lang.Integer.valueOf(this.E1), java.lang.Integer.valueOf(this.F1), this.f71650y0);
        pInt2.value = pInt.value + this.J1.f414841b;
        return false;
    }

    @Override // com.tencent.mm.pluginsdk.ui.CommonVideoView, com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.f1
    public boolean a(double d17, boolean z17) {
        return j0((int) d17, z17);
    }

    public boolean a0(int i17) {
        if (this.f71649x1 == 3) {
            com.tencent.mars.xlog.Log.i(this.f189738d, "checkCanPlay true, downloadStatus is download finish");
            return true;
        }
        int i18 = this.E1;
        if (i18 - i17 <= 1 && i18 < this.A1) {
            com.tencent.mars.xlog.Log.i(this.f189738d, "checkCanPlay false, cachePlayTime is " + this.E1 + ", playTime is " + i17 + ", MIN_CAN_PLAY_CACHE is 1, timeDuration is " + this.A1);
            return false;
        }
        com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
        com.tencent.mm.pointers.PInt pInt2 = new com.tencent.mm.pointers.PInt();
        try {
            if (this.f71652z1.b(i17, i17 + 1, pInt, pInt2)) {
                t21.i0 i0Var = this.f71648x0;
                r5 = i0Var != null ? i0Var.e(this.f71650y0, pInt.value, pInt2.value) : false;
                if (!r5) {
                    this.E1 = i17;
                }
                com.tencent.mars.xlog.Log.i(this.f189738d, "checkCanPlay ret is " + r5 + ", cachePlayTime is " + this.E1 + ", playTime is " + i17);
            } else {
                com.tencent.mars.xlog.Log.i(this.f189738d, "checkCanPlay false, parser videoTimeToFilePos return false");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.f189739e, "%s check video data error %s ", N(), e17.toString());
        }
        return r5;
    }

    public boolean b0(int i17) {
        boolean z17;
        int i18 = this.B1;
        if (i18 == -1) {
            i18 = i17;
        }
        com.tencent.mars.xlog.Log.i(this.f189739e, N() + " check timer playCurrPos " + i17 + " playTime " + i18 + " cachePlayTime " + this.E1 + " timeDuration " + this.A1 + " playStatus " + this.f71651y1 + " downloadStatus " + this.f71649x1 + " cdnMediaId " + this.f71650y0 + " isPrepareVideo[" + this.G1 + "], isPrepared[" + this.E + "]");
        int i19 = this.f71649x1;
        if (i19 != 1) {
            if (i19 == 2) {
                com.tencent.mars.xlog.Log.i(this.f189738d, "checkTimer, downloadStatus is download error, playCurrPos is " + i17);
                com.tencent.mars.xlog.Log.w(this.f189739e, "%s download error.", N());
            } else {
                if (i19 == 3) {
                    com.tencent.mars.xlog.Log.i(this.f189738d, "checkTimer, downloadStatus is download finish, playCurrPos is " + i17 + ", playTime is " + i18);
                    if (!this.E) {
                        if (this.f71651y1 == 5) {
                            this.f71651y1 = 1;
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
                            this.D1 = !play();
                        }
                    }
                    this.f71651y1 = 3;
                    W(i18);
                    return true;
                }
                com.tencent.mars.xlog.Log.i(this.f189738d, "checkTimer, downloadStatus is default, playCurrPos is " + i17);
                com.tencent.mars.xlog.Log.w(this.f189739e, "%s check time default.", N());
            }
            return false;
        }
        com.tencent.mars.xlog.Log.i(this.f189738d, "checkTimer, downloadStatus is downloading, playCurrPos is " + i17 + ", playTime is " + i18);
        boolean a07 = a0(i18);
        com.tencent.mm.pluginsdk.ui.e3 e3Var = this.R;
        if (a07) {
            if (this.G1) {
                W(i18);
                com.tencent.mars.xlog.Log.i(this.f189739e, "resumeByDataGain, playStatus:%s, isPlaying:%s, pauseByLoadData:%s", java.lang.Integer.valueOf(this.f71651y1), java.lang.Boolean.valueOf(this.f189748q.isPlaying()), java.lang.Boolean.valueOf(this.D1));
                if (this.D1) {
                    boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    e3Var.f190799f = currentTimeMillis;
                    long j17 = e3Var.f190798e;
                    if (j17 > 0) {
                        e3Var.f190800g += currentTimeMillis - j17;
                    }
                    R();
                    com.tencent.mars.xlog.Log.i(this.f189739e, "%s resume by data gain cdnMediaId %s", N(), this.f71650y0);
                    int i28 = this.B1;
                    if (i28 != -1) {
                        j0(i28, this.C1);
                        this.B1 = -1;
                        this.D1 = false;
                    } else {
                        this.D1 = !play();
                    }
                    this.f71651y1 = 3;
                } else if (this.f71651y1 != 3 || !this.f189748q.isPlaying()) {
                    com.tencent.mars.xlog.Log.i(this.f189739e, "%s start to play video playStatus[%d]", N(), java.lang.Integer.valueOf(this.f71651y1));
                    this.f71651y1 = play() ? 3 : this.f71651y1;
                }
            } else {
                com.tencent.mars.xlog.Log.i(this.f189739e, "%s prepare cdnMediaId [%s]", N(), this.f71650y0);
                if (this.f71651y1 == 5) {
                    this.f71651y1 = 1;
                }
                g0();
            }
            z17 = true;
        } else {
            this.D1 = true;
            if (this.E1 > 0) {
                com.tencent.mars.xlog.Log.i(this.f189739e, "%s pause by load data cdnMediaId %s, playStatus %d", N(), this.f71650y0, java.lang.Integer.valueOf(this.f71651y1));
                boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                e3Var.f190798e = java.lang.System.currentTimeMillis();
                int i29 = this.f71651y1;
                if (i29 != 2 && i29 != 4) {
                    int i37 = this.F1 + this.J1.f414840a;
                    this.F1 = i37;
                    this.F1 = java.lang.Math.min(i37, 60);
                    e3Var.f190801h++;
                    this.f71651y1 = 4;
                }
                com.tencent.mars.xlog.Log.i(this.f189739e, "%s pauseByDataBlock ", N());
                T();
                pause();
            } else if (this.B1 == -1) {
                this.f71651y1 = 1;
            } else {
                this.f71651y1 = 2;
            }
            z17 = false;
        }
        W(i18);
        com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
        com.tencent.mm.pointers.PInt pInt2 = new com.tencent.mm.pointers.PInt();
        if (!Z(i18, pInt, pInt2)) {
            N();
            com.tencent.mars.xlog.Log.i("VideoView.MMVideoView", "%s can not calc download.", N());
        } else if (h0(pInt.value, pInt2.value, false)) {
            this.E1 = java.lang.Math.max(this.E1, pInt2.value);
            return true;
        }
        return z17;
    }

    public d61.f c0() {
        return new d61.j();
    }

    public void d0() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.T)) {
            return;
        }
        this.f71650y0 = "MMVideo_" + this.T.hashCode();
        java.lang.String str = getRootPath() + "MMVideo_" + this.T.hashCode() + ".mp4";
        this.f71645l1 = str;
        com.tencent.mm.vfs.w6.u(com.tencent.mm.vfs.w6.r(str));
        com.tencent.mars.xlog.Log.i(this.f189739e, "%s set video path [%s %s]", N(), this.f71650y0, this.f71645l1);
    }

    @Override // com.tencent.mm.pluginsdk.ui.CommonVideoView, com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.f1
    public void e() {
        super.e();
        if (this.K1) {
            this.I1 = true;
            stop();
        }
    }

    public void e0(java.lang.String str, long j17, long j18, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i(this.f189738d, "onMoovReady");
        com.tencent.mars.xlog.Log.i(this.f189739e, "%s deal moov ready moovPos %d, timeDuration %d, cdnMediaId %s", N(), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(this.A1), this.f71650y0);
        if (this.A1 != 0) {
            com.tencent.mars.xlog.Log.w(this.f189739e, "moov had callback, do nothing.");
            return;
        }
        com.tencent.mm.pluginsdk.ui.e3 e3Var = this.R;
        if (e3Var.f190806m == 0) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            e3Var.f190806m = java.lang.System.currentTimeMillis();
        }
        try {
            d61.f fVar = this.f71652z1;
            if (fVar == null) {
                com.tencent.mars.xlog.Log.w(this.f189739e, "%s parser is null, thread is error.", N());
                return;
            }
            if (!fVar.a(this.f71645l1, j17)) {
                com.tencent.mars.xlog.Log.w(this.f189739e, "%s mp4 parse moov error. cdnMediaId %s", N(), this.f71650y0);
                t21.i0 i0Var = this.f71648x0;
                if (i0Var != null) {
                    i0Var.a(this.f71650y0, 0, -1);
                    return;
                }
                return;
            }
            this.A1 = this.f71652z1.c();
            com.tencent.mars.xlog.Log.i(this.f189739e, "%s mp4 parse moov success. duration %d cdnMediaId %s ", N(), java.lang.Integer.valueOf(this.A1), this.f71650y0);
            if (b0(0)) {
                g0();
            }
            if (this.B1 == -1) {
                this.f71651y1 = 1;
            } else {
                this.f71651y1 = 2;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f189739e, e17, "%s deal moov ready error [%s]", N(), this.f71650y0);
        }
    }

    @Override // t21.h0
    public void f(java.lang.String str, long j17, long j18) {
        if (com.tencent.mm.sdk.platformtools.t8.D0(this.f71650y0, str)) {
            N();
        }
    }

    public void f0() {
        t21.n0 n0Var = this.J1;
        n0Var.f414840a = 5;
        n0Var.f414841b = 2;
    }

    @Override // com.tencent.mm.pluginsdk.ui.CommonVideoView, com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.f1
    public void g() {
        super.g();
        com.tencent.mars.xlog.Log.i(this.f189739e, "%s onUIResume stopDownloadByUiPause[%b] currTimeOnUiPause[%d] isPlayOnUiPause[%b]", N(), java.lang.Boolean.valueOf(this.I1), java.lang.Integer.valueOf(this.f189749r), java.lang.Boolean.valueOf(this.f189750s));
        if (this.I1) {
            j0(this.f189749r, this.f189750s);
            return;
        }
        if (this.f189748q == null || !fp.h.c(24)) {
            return;
        }
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f189748q;
        if (f4Var instanceof com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView) {
            ((com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView) f4Var).E();
        }
    }

    public void g0() {
        com.tencent.mars.xlog.Log.i(this.f189738d, "prepareVideo and set video path to VideoPlayerTextureView");
        com.tencent.mm.sdk.platformtools.Log.c(this.f189739e, "%s prepareVideo", N());
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f189748q;
        if (f4Var != null) {
            this.G1 = true;
            f4Var.setVideoPath(this.f71645l1);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.CommonVideoView, com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.f1
    public int getCacheTimeSec() {
        return this.f71649x1 == 3 ? getVideoDurationSec() : this.E1;
    }

    public android.view.View getInnerVideoView() {
        java.lang.Object obj = this.f189748q;
        if (obj instanceof com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView) {
            return (android.view.View) obj;
        }
        return null;
    }

    @Override // com.tencent.mm.pluginsdk.ui.AbstractVideoView
    public java.lang.String getMediaId() {
        return this.f71650y0;
    }

    @Override // com.tencent.mm.pluginsdk.ui.CommonVideoView, com.tencent.mm.pluginsdk.ui.AbstractVideoView
    public int getReportIdkey() {
        return 100;
    }

    @Override // com.tencent.mm.pluginsdk.ui.CommonVideoView, com.tencent.mm.pluginsdk.ui.f1
    public void h(boolean z17, java.lang.String str, int i17) {
        super.h(z17, str, i17);
        d0();
    }

    public final boolean h0(int i17, int i18, boolean z17) {
        t21.i0 i0Var;
        com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
        com.tencent.mm.pointers.PInt pInt2 = new com.tencent.mm.pointers.PInt();
        boolean z18 = false;
        try {
            if (this.f71652z1.b(i17, i18, pInt, pInt2) && (i0Var = this.f71648x0) != null) {
                z18 = i0Var.e(this.f71650y0, pInt.value, pInt2.value);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.f189739e, "%s check video data error[%s] ", N(), e17.toString());
        }
        com.tencent.mars.xlog.Log.i(this.f189738d, "requestVideoData ret is " + z18 + ", cdnMediaId is " + this.f71650y0 + ", offset is " + pInt.value + ", length is " + pInt2.value + ", isRequestNow is " + this.H1 + ", isSeek is " + z17);
        if (z18) {
            N();
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(this.f71650y0);
            sb6.append("_");
            sb6.append(pInt.value);
            sb6.append("_");
            sb6.append(pInt2.value);
            if (!this.H1 || z17) {
                this.H1 = true;
                t21.i0 i0Var2 = this.f71648x0;
                if (i0Var2 != null) {
                    i0Var2.a(this.f71650y0, pInt.value, pInt2.value);
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
        this.f71651y1 = 0;
        this.f71649x1 = 0;
        this.D1 = false;
        this.G1 = false;
        this.H1 = false;
        t21.n0 n0Var = this.J1;
        if (n0Var != null) {
            this.F1 = n0Var.f414840a;
        }
    }

    public boolean j0(int i17, boolean z17) {
        int i18 = this.f71649x1;
        boolean z18 = true;
        if (i18 == 0) {
            com.tencent.mars.xlog.Log.i(this.f189738d, "seekTo, downloadStatus is download default, isPrepared is " + L());
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
                        this.B = this.f189749r;
                    }
                }
                start();
            }
        } else if (i18 == 1) {
            com.tencent.mars.xlog.Log.i(this.f189738d, "seekTo, downloadStatus is downloading");
            this.f71651y1 = 2;
            com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
            com.tencent.mm.pointers.PInt pInt2 = new com.tencent.mm.pointers.PInt();
            Z(i17, pInt, pInt2);
            if (h0(pInt.value, pInt2.value, true)) {
                this.B1 = -1;
                this.D1 = false;
                this.E1 = pInt2.value;
                this.f71651y1 = 3;
                super.a(i17, z17);
            } else {
                this.B1 = i17;
                this.C1 = z17;
                this.D1 = true;
                com.tencent.mars.xlog.Log.i(this.f189739e, "%s pauseByDataBlock ", N());
                T();
                pause();
                z18 = false;
            }
        } else if (i18 == 2) {
            com.tencent.mars.xlog.Log.i(this.f189738d, "seekTo, downloadStatus is download error");
        } else if (i18 == 3) {
            com.tencent.mars.xlog.Log.i(this.f189738d, "seekTo, downloadStatus is download finish");
            super.a(i17, z17);
        }
        com.tencent.mm.sdk.platformtools.Log.c(this.f189739e, "%s seek video time %d, download status %d playStatus %d", N(), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f71649x1), java.lang.Integer.valueOf(this.f71651y1));
        return z18;
    }

    public void o(java.lang.String str, int i17) {
        if (!com.tencent.mm.sdk.platformtools.t8.D0(this.f71650y0, str) || this.f71649x1 == 3) {
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f189739e, "%s download finish [%d]", N(), java.lang.Integer.valueOf(i17));
        if (i17 == 0) {
            this.f71649x1 = 3;
        }
        com.tencent.mm.pluginsdk.ui.a1 a1Var = this.f71647p1;
        if (a1Var != null) {
            a1Var.r(this.f71645l1, this.f71651y1 > 0);
        }
        com.tencent.mars.xlog.Log.i(this.f189738d, "onFinish, startTimer");
        U(true);
        this.H1 = false;
    }

    @Override // com.tencent.mm.pluginsdk.ui.CommonVideoView, com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.tools.a4
    public void onCompletion() {
        t21.i0 i0Var;
        if (this.L1) {
            j0(0, true);
            Y();
        } else {
            super.onCompletion();
            java.lang.String str = this.f71650y0;
            if (str != null && (i0Var = this.f71648x0) != null) {
                i0Var.c(str);
            }
            i0();
            com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f189748q;
            if (f4Var != null) {
                f4Var.stop();
            }
        }
        this.f71652z1.release();
    }

    public void onDataAvailable(java.lang.String str, long j17, long j18) {
        this.H1 = false;
        if (j17 <= -1 || j18 <= -1) {
            com.tencent.mars.xlog.Log.w(this.f189739e, "%s deal data available error offset[%d], length[%d]", N(), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(this.f71650y0, str)) {
            try {
                this.E1 = this.f71652z1.d((int) j17, (int) j18);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e(this.f189739e, "%s deal data available file pos to video time error[%s] ", N(), e17.toString());
            }
            com.tencent.mars.xlog.Log.i(this.f189739e, "%s deal data available. offset[%d] length[%d] cachePlayTime[%d]", N(), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(this.E1));
            com.tencent.mars.xlog.Log.i(this.f189738d, "onDataAvailable, startTimer");
            U(true);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.tools.d4
    public void onSurfaceAvailable() {
    }

    @Override // com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.f1
    public boolean pause() {
        boolean pause = super.pause();
        if (pause) {
            this.H1 = false;
            this.f71651y1 = 4;
        }
        return pause;
    }

    @Override // com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.f1
    public boolean play() {
        boolean play = super.play();
        if (play) {
            this.f71651y1 = 3;
        }
        return play;
    }

    public void setDownloadStatus(int i17) {
        this.f71649x1 = i17;
    }

    public void setFilepath(java.lang.String str) {
        this.f71645l1 = str;
    }

    public void setIMMDownloadFinish(com.tencent.mm.pluginsdk.ui.a1 a1Var) {
        this.f71647p1 = a1Var;
    }

    public void setIOnlineVideoProxy(t21.i0 i0Var) {
        this.f71648x0 = i0Var;
        i0Var.d(this);
    }

    @Override // com.tencent.mm.pluginsdk.ui.CommonVideoView, com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.f1
    public void setLoop(boolean z17) {
        this.L1 = z17;
    }

    public void setRootPath(java.lang.String str) {
        this.f71646p0 = str;
    }

    @Override // com.tencent.mm.pluginsdk.ui.CommonVideoView, com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.f1
    public void setScaleType(com.tencent.mm.pluginsdk.ui.e1 e1Var) {
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f189748q;
        if (f4Var instanceof com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView) {
            ((com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView) f4Var).setScaleType(e1Var);
            H(600L, getReportIdkey() + 14, 1L, false);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.CommonVideoView, com.tencent.mm.pluginsdk.ui.f1
    public void start() {
        com.tencent.mars.xlog.Log.i(this.f189739e, "%s start cdnMediaId[%s] timeDuration[%d]", N(), this.f71650y0, java.lang.Integer.valueOf(this.A1));
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f189748q;
        if (f4Var != null) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(f4Var.getF174598m())) {
                T();
                this.K1 = true;
                this.A1 = 0;
                this.f71649x1 = 1;
                t21.i0 i0Var = this.f71648x0;
                if (i0Var != null) {
                    i0Var.b(this.f71650y0, this.f71645l1, this.T);
                    this.f71648x0.d(this);
                }
                Q();
            } else {
                play();
            }
            H(600L, getReportIdkey() + 1, 1L, false);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.f1
    public void stop() {
        t21.i0 i0Var = this.f71648x0;
        if (i0Var != null) {
            i0Var.c(this.f71650y0);
        }
        i0();
        super.stop();
        this.f71652z1.release();
    }

    @Override // com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.tools.c4
    public void z(boolean z17) {
        super.z(z17);
        D();
    }

    public MMVideoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f71649x1 = 0;
        this.f71651y1 = 0;
        this.E1 = 0;
        this.G1 = false;
        this.H1 = false;
        this.I1 = false;
        this.K1 = false;
        this.M1 = new com.tencent.mm.sdk.platformtools.b4(new t21.m0(this), true);
    }

    public MMVideoView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f71649x1 = 0;
        this.f71651y1 = 0;
        this.E1 = 0;
        this.G1 = false;
        this.H1 = false;
        this.I1 = false;
        this.K1 = false;
        this.M1 = new com.tencent.mm.sdk.platformtools.b4(new t21.m0(this), true);
    }

    public MMVideoView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(context, attributeSet, i17, i18);
        this.f71649x1 = 0;
        this.f71651y1 = 0;
        this.E1 = 0;
        this.G1 = false;
        this.H1 = false;
        this.I1 = false;
        this.K1 = false;
        this.M1 = new com.tencent.mm.sdk.platformtools.b4(new t21.m0(this), true);
    }
}

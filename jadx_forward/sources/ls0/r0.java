package ls0;

/* loaded from: classes10.dex */
public class r0 extends ls0.n implements ls0.l {
    public final long A;
    public fs0.g B;
    public gs0.b C;
    public gs0.w D;
    public ds0.d0 E;
    public ls0.k F;
    public final hs0.a G;
    public final ls0.b1 H;
    public hs0.a I;

    /* renamed from: J, reason: collision with root package name */
    public hs0.a f402419J;
    public android.os.HandlerThread K;
    public android.os.HandlerThread L;
    public boolean M;
    public boolean N;
    public yz5.l O;
    public android.graphics.Bitmap P;
    public ls0.w0 Q;
    public yz5.l R;
    public long S;
    public final rs0.a T;
    public volatile boolean U;
    public boolean V;
    public boolean W;
    public int X;
    public int Y;
    public int Z;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f402420a;

    /* renamed from: a0, reason: collision with root package name */
    public long f402421a0;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f402422b;

    /* renamed from: b0, reason: collision with root package name */
    public int f402423b0;

    /* renamed from: c, reason: collision with root package name */
    public final int f402424c;

    /* renamed from: c0, reason: collision with root package name */
    public final int f402425c0;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f402426d;

    /* renamed from: d0, reason: collision with root package name */
    public final int f402427d0;

    /* renamed from: e, reason: collision with root package name */
    public int f402428e;

    /* renamed from: e0, reason: collision with root package name */
    public volatile boolean f402429e0;

    /* renamed from: f, reason: collision with root package name */
    public int f402430f;

    /* renamed from: f0, reason: collision with root package name */
    public volatile boolean f402431f0;

    /* renamed from: g, reason: collision with root package name */
    public final int f402432g;

    /* renamed from: g0, reason: collision with root package name */
    public volatile boolean f402433g0;

    /* renamed from: h, reason: collision with root package name */
    public final int f402434h;

    /* renamed from: h0, reason: collision with root package name */
    public volatile boolean f402435h0;

    /* renamed from: i, reason: collision with root package name */
    public final int f402436i;

    /* renamed from: i0, reason: collision with root package name */
    public final ls0.q0 f402437i0;

    /* renamed from: j, reason: collision with root package name */
    public int f402438j;

    /* renamed from: j0, reason: collision with root package name */
    public final java.lang.Runnable f402439j0;

    /* renamed from: k, reason: collision with root package name */
    public final int f402440k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f402441l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f402442m;

    /* renamed from: n, reason: collision with root package name */
    public final int f402443n;

    /* renamed from: o, reason: collision with root package name */
    public final int f402444o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f402445p;

    /* renamed from: q, reason: collision with root package name */
    public final int f402446q;

    /* renamed from: r, reason: collision with root package name */
    public final yz5.l f402447r;

    /* renamed from: s, reason: collision with root package name */
    public final yz5.l f402448s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f402449t;

    /* renamed from: u, reason: collision with root package name */
    public final int f402450u;

    /* renamed from: v, reason: collision with root package name */
    public final int f402451v;

    /* renamed from: w, reason: collision with root package name */
    public final int f402452w;

    /* renamed from: x, reason: collision with root package name */
    public final int f402453x;

    /* renamed from: y, reason: collision with root package name */
    public final int f402454y;

    /* renamed from: z, reason: collision with root package name */
    public long f402455z;

    /* JADX WARN: Removed duplicated region for block: B:193:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0402  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r0(java.lang.String r22, java.lang.String r23, int r24, java.lang.String r25, android.graphics.Rect r26, int r27, int r28, int r29, int r30, int r31, int r32, int r33, int r34, int r35, long r36, long r38, boolean r40, boolean r41, int r42, int r43, boolean r44, int r45, yz5.l r46, yz5.l r47, int r48, p3321xbce91901.jvm.p3324x21ffc6bd.i r49) {
        /*
            Method dump skipped, instructions count: 1922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ls0.r0.<init>(java.lang.String, java.lang.String, int, java.lang.String, android.graphics.Rect, int, int, int, int, int, int, int, int, int, long, long, boolean, boolean, int, int, boolean, int, yz5.l, yz5.l, int, kotlin.jvm.internal.i):void");
    }

    public static final void e(ls0.r0 r0Var) {
        int i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0Var.f402449t, "checkFinishEncode, encodeFrameCount:" + r0Var.Y + ", drawFrameCount:" + r0Var.Z + ", useRequestDraw:" + r0Var.f402433g0 + ", isFinishEncode:" + r0Var.f402435h0 + ", isDecodeEnd:" + r0Var.f402429e0);
        int i18 = r0Var.Y;
        if (i18 > 0 && (i17 = r0Var.Z) > 0 && i18 >= i17 && r0Var.f402429e0) {
            r0Var.f();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxEndWithFrameNumberMatch");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(986L, 90L, 1L);
        } else if (r0Var.f402429e0) {
            ((ku5.t0) ku5.t0.f394148d).A("DECODE_END_FINISH_ENCODE_CHECK");
            ((ku5.t0) ku5.t0.f394148d).l(r0Var.f402439j0, 1000L, "DECODE_END_FINISH_ENCODE_CHECK");
        }
    }

    @Override // ls0.l
    public void a(yz5.l blendBitmapProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(blendBitmapProvider, "blendBitmapProvider");
        this.O = blendBitmapProvider;
        ls0.k kVar = this.F;
        if (kVar != null) {
            kVar.f(blendBitmapProvider);
        }
    }

    @Override // ls0.n, ls0.l
    public int b() {
        int i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f402449t, "start remux, initFinish:" + this.M);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.S = android.os.SystemClock.elapsedRealtime();
        android.graphics.Bitmap bitmap = this.P;
        if (bitmap != null && (i17 = this.f402452w) > 0) {
            this.P = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(bitmap, -i17);
        }
        this.T.f480821b.b();
        if (this.M) {
            android.os.HandlerThread handlerThread = this.K;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            this.K = pm0.v.m("MediaCodecRemux_audioMix", false, new ls0.y(this));
            android.os.HandlerThread handlerThread2 = this.L;
            if (handlerThread2 != null) {
                handlerThread2.quit();
            }
            if (this.B != null) {
                this.L = pm0.v.m("MediaCodecRemux_videoMix", false, new ls0.z(this));
            }
        } else {
            this.N = true;
        }
        return 0;
    }

    @Override // ls0.l
    public void c(yz5.l blurBgProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(blurBgProvider, "blurBgProvider");
        this.R = blurBgProvider;
        ls0.k kVar = this.F;
        if (kVar != null) {
            kVar.g(blurBgProvider);
        }
    }

    @Override // ls0.n
    public void d(android.graphics.Bitmap bitmap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        this.P = bitmap;
        ls0.k kVar = this.F;
        if (kVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(kVar.f402381b, "setDrawBlendBitmap:" + bitmap.hashCode());
            kVar.f402392m = bitmap;
        }
    }

    public final void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f402449t, "finishEncode");
        if (this.f402441l) {
            gs0.w wVar = this.D;
            if (wVar != null) {
                wVar.d();
            }
            g(true);
        } else {
            gs0.b bVar = this.C;
            if (bVar != null) {
                bVar.b();
            }
        }
        ((ku5.t0) ku5.t0.f394148d).A("DECODE_END_FINISH_ENCODE_CHECK");
        this.f402435h0 = true;
    }

    public final synchronized void g(boolean z17) {
        yz5.l lVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f402449t, "finishRemux, isVideo: " + z17 + ", isAudioRemuxFinish:" + this.W + ", isVideoRemuxFinish:" + this.V + ", isInvokeEndCallback:" + this.U);
        if (z17) {
            this.V = true;
        } else {
            this.W = true;
        }
        if (this.W && this.V && !this.U) {
            ls0.k kVar = this.F;
            if (kVar != null) {
                kVar.e();
            }
            this.T.a();
            this.U = true;
            try {
                com.p314xaae8f345.mm.vfs.w6.h(ls0.d1.f402349a.a(this.f402422b));
            } catch (java.lang.Exception unused) {
            }
            this.f402437i0.b();
            this.G.d();
            hs0.a aVar = this.f402419J;
            if (aVar != null) {
                aVar.d();
            }
            ls0.w0 w0Var = this.Q;
            if (w0Var != null && (lVar = w0Var.f402487n) != null) {
                ((ls0.u0) lVar).mo146xb9724478(this.f402448s);
            }
            android.os.HandlerThread handlerThread = this.K;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            android.os.HandlerThread handlerThread2 = this.L;
            if (handlerThread2 != null) {
                handlerThread2.quit();
            }
            long j17 = this.S;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f402449t, "remux used " + elapsedRealtime + " decodeFrame:" + this.X + ", encodeFrame:" + this.Y + ", drawFrameCount:" + this.Z + ", writeDtsCount:" + this.f402423b0);
            try {
                if (com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(this.f402426d, true) != null) {
                    rs0.p pVar = rs0.p.f480843a;
                    pVar.d(this.f402424c, elapsedRealtime);
                    pVar.e(r14.f243916b, r14.f243919e, this.f402454y);
                    if (this.X / this.Y >= 1.5d) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxFrameCountDiffError");
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(986L, 53L, 1L);
                    }
                    pVar.b(this.f402426d);
                }
            } catch (java.lang.Exception unused2) {
            }
        }
    }

    public final es0.d h() {
        int i17 = this.f402454y;
        int i18 = this.f402440k;
        if (i18 > 0) {
            i17 = java.lang.Math.min(i18, i17);
        }
        es0.d dVar = new es0.d(this.f402442m);
        dVar.f337847d = this.f402432g;
        dVar.f337848e = i17;
        dVar.f337846c = this.f402430f;
        dVar.f337845b = this.f402428e;
        int i19 = this.f402443n;
        dVar.f337854k = i19;
        int i27 = this.f402444o;
        dVar.f337855l = i27;
        int i28 = this.f402446q;
        if (i28 > 0) {
            dVar.f337850g = i28;
        }
        while (true) {
            int i29 = dVar.f337848e;
            int i37 = (dVar.f337850g * i29) - 1;
            java.lang.String str = this.f402449t;
            if (i37 > 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "steve: hardcoder qp:" + i19 + ", " + i27);
                return dVar;
            }
            dVar.f337848e = i29 + 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "encodeConfig.frameRate + 1");
        }
    }

    public final synchronized void i(boolean z17, boolean z18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f402449t, "onDecoderEncoderFailed, isDecoder:" + z17 + " isEncoder:" + z18);
        this.f402437i0.b();
        if (z17) {
            fs0.g gVar = this.B;
            if (gVar != null) {
                gVar.c();
            }
            this.B = null;
        }
        if (z18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(985L, 162L, 1L, false);
            gs0.b bVar = this.C;
            if (bVar != null) {
                bVar.f();
            }
            this.C = null;
        }
        if (!this.U) {
            this.H.b();
            ls0.k kVar = this.F;
            if (kVar != null) {
                kVar.e();
            }
            this.T.a();
            this.U = true;
            try {
                com.p314xaae8f345.mm.vfs.w6.h(ls0.d1.f402349a.a(this.f402422b));
                this.G.d();
                hs0.a aVar = this.f402419J;
                if (aVar != null) {
                    aVar.d();
                }
                android.os.HandlerThread handlerThread = this.K;
                if (handlerThread != null) {
                    handlerThread.quit();
                }
                android.os.HandlerThread handlerThread2 = this.L;
                if (handlerThread2 != null) {
                    handlerThread2.quit();
                }
                com.p314xaae8f345.mm.vfs.w6.h(this.f402426d);
                long j17 = this.S;
                boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f402449t, "onDecoderEncoderFailed, finish, costTime:" + elapsedRealtime);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f402449t, e17, "onDecoderEncoderFailed error:" + e17.getMessage(), new java.lang.Object[0]);
            }
            yz5.l lVar = this.f402448s;
            if (lVar != null) {
                lVar.mo146xb9724478(null);
            }
        }
    }

    public final int j(int i17, int i18) {
        if (i17 <= i18) {
            return i18;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf((i18 - 1) & i17);
        if (!(valueOf.intValue() != 0)) {
            valueOf = null;
        }
        if (valueOf == null) {
            return i17;
        }
        int intValue = valueOf.intValue();
        return intValue * 2 > i18 ? (i17 - intValue) + i18 : i17 - intValue;
    }
}

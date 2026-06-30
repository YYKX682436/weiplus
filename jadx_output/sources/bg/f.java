package bg;

/* loaded from: classes7.dex */
public class f extends eg.a implements tf.q {
    public static final tf.n Y1 = tf.f0.b(tf.g0.f418808d);
    public boolean A;
    public volatile boolean B;
    public int E;
    public final bg.a E1;
    public int F;
    public final com.tencent.mm.plugin.appbrand.jsapi.media.x7 G1;
    public bg.y0 H1;
    public int I;
    public boolean I1;

    /* renamed from: J, reason: collision with root package name */
    public int f19762J;
    public final tf.c J1;
    public int K;
    public final tf.d K1;
    public int L;
    public bg.z0 L1;
    public java.lang.String M;
    public bg.b M1;
    public java.lang.String N;
    public tf.m0 N1;
    public float O1;
    public boolean P;
    public float P1;
    public boolean Q;
    public boolean Q1;
    public boolean R;
    public boolean R1;
    public boolean S;
    public final tf.q S1;
    public final java.util.concurrent.atomic.AtomicBoolean T1;
    public volatile java.lang.String U1;
    public volatile java.lang.String V1;
    public volatile tf.m W1;
    public final boolean X;
    public volatile android.graphics.Bitmap X1;

    /* renamed from: g, reason: collision with root package name */
    public android.view.Surface f19763g;

    /* renamed from: h, reason: collision with root package name */
    public ye1.e f19764h;

    /* renamed from: i, reason: collision with root package name */
    public dg.e f19765i;

    /* renamed from: m, reason: collision with root package name */
    public dg.a f19767m;

    /* renamed from: n, reason: collision with root package name */
    public dg.d f19768n;

    /* renamed from: o, reason: collision with root package name */
    public dg.f f19769o;

    /* renamed from: p, reason: collision with root package name */
    public dg.g f19770p;

    /* renamed from: q, reason: collision with root package name */
    public dg.b f19773q;

    /* renamed from: r, reason: collision with root package name */
    public volatile fg1.u f19774r;

    /* renamed from: s, reason: collision with root package name */
    public sf.f f19775s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f19776t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f19777u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f19778v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f19779w;

    /* renamed from: x, reason: collision with root package name */
    public long f19780x;

    /* renamed from: x1, reason: collision with root package name */
    public final tf.o f19782x1;

    /* renamed from: y, reason: collision with root package name */
    public boolean f19783y;

    /* renamed from: y1, reason: collision with root package name */
    public final qu5.a f19785y1;

    /* renamed from: z, reason: collision with root package name */
    public boolean f19786z;
    public boolean C = false;
    public boolean D = false;
    public int G = 0;
    public int H = 0;
    public boolean T = false;
    public java.util.concurrent.atomic.AtomicBoolean U = null;
    public boolean V = false;
    public boolean W = false;
    public boolean Y = false;
    public boolean Z = false;

    /* renamed from: p0, reason: collision with root package name */
    public java.lang.String f19771p0 = "";

    /* renamed from: x0, reason: collision with root package name */
    public java.lang.String f19781x0 = "";

    /* renamed from: y0, reason: collision with root package name */
    public java.lang.String f19784y0 = "";

    /* renamed from: l1, reason: collision with root package name */
    public org.json.JSONObject f19766l1 = null;

    /* renamed from: p1, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f19772p1 = new java.util.concurrent.ConcurrentLinkedQueue();

    /* renamed from: z1, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f19787z1 = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
    public volatile sf.f A1 = null;
    public sd1.c B1 = null;
    public java.lang.String C1 = null;
    public android.view.Surface D1 = null;
    public long F1 = 0;

    public f(boolean z17, bg.a aVar) {
        yz5.a aVar2 = new yz5.a() { // from class: bg.f$$a
            @Override // yz5.a
            public final java.lang.Object invoke() {
                sf.f fVar = bg.f.this.f19775s;
                if (fVar != null) {
                    return fVar.m();
                }
                return null;
            }
        };
        this.G1 = new com.tencent.mm.plugin.appbrand.jsapi.media.x7(new com.tencent.mm.plugin.appbrand.jsapi.media.v7(aVar2), new bg.p(this));
        this.H1 = null;
        this.I1 = false;
        this.J1 = new bg.g0(this, this, new bg.f0(this));
        this.K1 = new bg.h0(this);
        this.L1 = null;
        this.M1 = null;
        this.N1 = null;
        this.O1 = 1.0f;
        this.P1 = 1.0f;
        this.Q1 = false;
        this.R1 = false;
        this.S1 = new tf.l0();
        this.T1 = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.U1 = null;
        this.V1 = null;
        this.W1 = null;
        this.X1 = null;
        tf.o a17 = ((tf.f0) Y1).a();
        this.f19782x1 = a17;
        a17.start();
        this.f19785y1 = a17.getHandler();
        this.X = z17;
        this.E1 = aVar;
    }

    public java.lang.String A() {
        return java.lang.String.format("%s(%s)", "MicroMsg.SameLayer.VideoPluginHandler", q());
    }

    public final int B() {
        ye1.e eVar = this.f19764h;
        if (eVar != null) {
            return eVar.getVideoHeight();
        }
        return 0;
    }

    public int C() {
        int i17 = (int) (this.G + (((1.0f - this.O1) * this.E) / 2.0f));
        A();
        return i17;
    }

    public int D() {
        int i17 = (int) (this.H + (((1.0f - this.P1) * this.F) / 2.0f));
        A();
        return i17;
    }

    public final int E(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return 0;
        }
        java.lang.String optString = jSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_FORMAT, "");
        com.tencent.mars.xlog.Log.i(A(), "getVideoType, format:%s", optString);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString) || !optString.equalsIgnoreCase("mp4")) {
            return (com.tencent.mm.sdk.platformtools.t8.K0(optString) || !optString.equalsIgnoreCase("m3u8")) ? 0 : 2;
        }
        return 1;
    }

    public void F(dg.b bVar) {
        this.f19773q = bVar;
        if (bVar != null) {
            ((fg1.z) bVar).f261921b = this;
            this.f19770p = new fg1.r0();
            ((fg1.z) bVar).getClass();
            this.f19769o = new fg1.q0();
            ((fg1.z) this.f19773q).getClass();
            this.f19767m = new fg1.g();
            ((fg1.z) this.f19773q).getClass();
            fg1.b0 b0Var = new fg1.b0();
            this.f19765i = b0Var;
            b0Var.f261842a = this;
            bg.b bVar2 = this.M1;
            synchronized (b0Var) {
                b0Var.f261849h = bVar2;
            }
            dg.e eVar = this.f19765i;
            tf.m0 m0Var = this.N1;
            fg1.b0 b0Var2 = (fg1.b0) eVar;
            synchronized (b0Var2) {
                b0Var2.f261850i = m0Var;
            }
            ((fg1.z) this.f19773q).getClass();
            fg1.a0 a0Var = new fg1.a0();
            this.f19768n = a0Var;
            a0Var.f261839a = new bg.u0(this);
        }
    }

    public boolean G() {
        if (this.f19764h == null) {
            return false;
        }
        com.tencent.mars.xlog.Log.i(A(), "currentState:%d", java.lang.Integer.valueOf(this.f19764h.getState()));
        return this.f19764h.isPlaying();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x04ab, code lost:
    
        if (r0 == false) goto L148;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x00ed. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0296  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(sf.f r21) {
        /*
            Method dump skipped, instructions count: 1616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bg.f.H(sf.f):void");
    }

    public final void I(sf.f fVar) {
        if (this.f19764h == null) {
            com.tencent.mars.xlog.Log.w(A(), "operateBackground, media player is null");
            fVar.g("fail");
            return;
        }
        java.lang.String optString = fVar.c().optString("type");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            return;
        }
        com.tencent.mars.xlog.Log.i(A(), "operateBackground, type:%s", optString);
        if (!optString.equalsIgnoreCase("pause") && !optString.equalsIgnoreCase("stop")) {
            if (optString.equalsIgnoreCase(com.tencent.tav.core.AssetExtension.SCENE_PLAY)) {
                this.W = true;
            }
            com.tencent.mars.xlog.Log.i(A(), "call operate");
            H(fVar);
            return;
        }
        com.tencent.mars.xlog.Log.i(A(), "operateBackground call backgroundManager:".concat(optString));
        tf1.f a17 = tf.k.a(fVar);
        if (a17 == null) {
            com.tencent.mars.xlog.Log.w(A(), "operateBackground PAUSE, audioOfVideoBackgroundPlayManager is null");
            H(fVar);
            return;
        }
        a17.u(optString);
        com.tencent.mars.xlog.Log.i(A(), "operateBackground pauseBackgroundAudioPlay:".concat(optString));
        dg.e eVar = this.f19765i;
        if (eVar != null) {
            ((fg1.b0) eVar).d(false);
        }
        if (this.T) {
            com.tencent.mars.xlog.Log.i(A(), "operateBackground, isRuntimeInBackground, setPlayingWhenEnterBackground false");
            this.U = new java.util.concurrent.atomic.AtomicBoolean(false);
        }
        fVar.a(jc1.f.f298912a);
    }

    public final boolean J(boolean z17) {
        ye1.e eVar = this.f19764h;
        if (eVar == null) {
            return false;
        }
        if (!this.f19786z) {
            com.tencent.mars.xlog.Log.i(A(), "video pause, video not prepared yet, pause video when prepared");
            this.f19779w = false;
            return true;
        }
        if (!eVar.isPlaying()) {
            com.tencent.mars.xlog.Log.i(A(), "video pause, video is not playing");
            return true;
        }
        com.tencent.mars.xlog.Log.i(A(), "video pause, passive: %b, mWebViewInBackground: %b, isRuntimeInBackground: %b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.S), java.lang.Boolean.valueOf(this.T));
        if (!z17) {
            this.G1.a();
        }
        this.f19764h.pause();
        if (U()) {
            ((fg1.b0) this.f19765i).f(false);
        }
        return true;
    }

    public final boolean K(boolean z17, boolean z18) {
        boolean z19;
        ye1.e eVar = this.f19764h;
        if (eVar == null) {
            return false;
        }
        if (this.f19786z && eVar.isPlaying()) {
            com.tencent.mars.xlog.Log.i(A(), "video play, video is playing");
            if (U()) {
                ((fg1.b0) this.f19765i).g(z17);
            }
            return true;
        }
        ye1.e eVar2 = this.f19764h;
        if (eVar2 != null && !this.f19786z) {
            com.tencent.mars.xlog.Log.i(A(), "video play, video not prepared yet, start until prepared");
            this.f19779w = true;
            return true;
        }
        if (eVar2 != null && eVar2.getState() == 5) {
            if (!z18) {
                com.tencent.mars.xlog.Log.i(A(), "video has ended playing, do not restart");
                return false;
            }
            com.tencent.mars.xlog.Log.i(A(), "video play, video has stopped now, try prepare and start when prepared");
            L(true);
            this.f19779w = true;
            return true;
        }
        if (!this.R) {
            com.tencent.mars.xlog.Log.i(A(), "video play");
            if (this.f19764h != null) {
                A();
                if (this.S || this.T || this.D) {
                    z19 = true;
                } else {
                    com.tencent.mars.xlog.Log.i(A(), "video play, requestFocus");
                    z19 = this.G1.requestFocus();
                }
                com.tencent.mars.xlog.Log.i(A(), "video play, canStart: %b", java.lang.Boolean.valueOf(z19));
                if (!z19) {
                    return false;
                }
                if (U()) {
                    ((fg1.b0) this.f19765i).g(z17);
                }
                com.tencent.mars.xlog.Log.i(A(), "applyPluginTextureScaleIfNeed");
                if (!this.I1) {
                    com.tencent.mars.xlog.Log.i(A(), "applyPluginTextureScaleIfNeed, TextureScale is not sticky");
                } else if (!this.S || this.D1 == null) {
                    sf.i.c(this.f252499f, this.f252498e, this.f252497d, this.O1, this.P1);
                } else {
                    com.tencent.mars.xlog.Log.i(A(), "applyPluginTextureScaleIfNeed, in PIP mode");
                }
                this.f19764h.start();
                if (this.S && this.T) {
                    this.U = new java.util.concurrent.atomic.AtomicBoolean(true);
                }
                com.tencent.mars.xlog.Log.i(A(), "applySurface mJustPlayAudio:%b, mWebViewInBackground:%b", java.lang.Boolean.valueOf(this.T1.get()), java.lang.Boolean.valueOf(this.S));
                Q(new bg.m0(this));
            }
            return true;
        }
        if (!z18) {
            com.tencent.mars.xlog.Log.i(A(), "video has ended playing, do not restart");
            return false;
        }
        com.tencent.mars.xlog.Log.i(A(), "video play, video has ended playing, clear surface and start again");
        this.R = false;
        try {
            if (this.f19763g != null && this.f19786z) {
                com.tencent.mars.xlog.Log.i(A(), "clearSurfaceFrame");
                v(this.f19763g);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(A(), e17, "clearSurfaceFrame error", new java.lang.Object[0]);
        }
        P(this.f19775s);
        if (this.f19764h != null) {
            java.lang.String w17 = w(this.f19775s, this.M);
            V();
            java.lang.String str = com.tencent.mm.sdk.platformtools.t8.K0(this.f19771p0) ? null : this.f19771p0;
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.t8.K0(this.f19781x0) ? null : this.f19781x0;
            boolean z27 = this.Z;
            com.tencent.mars.xlog.Log.i(A(), "play, isDrm, provisionUrl:%s, licenseUrl:%s, isLive: %b", str, str2, java.lang.Boolean.valueOf(z27));
            if (com.tencent.mm.sdk.platformtools.t8.K0(w17)) {
                if (this.Y) {
                    this.f19764h.t(this.M, str, str2, z27);
                } else {
                    this.f19764h.m(this.M, this.C1);
                }
            } else if (this.Y) {
                this.f19764h.t(w17, str, str2, z27);
            } else {
                this.f19764h.m(w17, this.C1);
            }
            com.tencent.mars.xlog.Log.i(A(), "video play, media player state:%s", java.lang.Integer.valueOf(this.f19764h.getState()));
            L(false);
            this.f19779w = true;
        }
        return true;
    }

    public final void L(boolean z17) {
        if (this.f19764h != null) {
            com.tencent.mars.xlog.Log.i(A(), "video prepare async");
            if (z17 && U()) {
                ((fg1.b0) this.f19765i).i();
            }
            this.f19786z = false;
            this.f19779w = false;
            dg.b bVar = this.f19773q;
            if (bVar != null) {
                ye1.e eVar = this.f19764h;
                fg1.z zVar = (fg1.z) bVar;
                dg.f b17 = zVar.b();
                ig1.a aVar = zVar.f261922c;
                aVar.getClass();
                if (eVar != null && b17 != null) {
                    boolean z18 = 4 == eVar.getPlayerType();
                    ig1.c cVar = aVar.f291341a;
                    if (z18) {
                        cVar.f291344b = 3;
                    } else if (aVar.b(eVar)) {
                        cVar.f291344b = 2;
                    } else if (oe1.x1.c(eVar)) {
                        cVar.f291344b = 1;
                    } else if (oe1.x1.d(eVar)) {
                        cVar.f291344b = 0;
                    }
                    if (cVar.f291348f <= 0) {
                        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        cVar.f291348f = java.lang.System.currentTimeMillis();
                        fg1.q0 q0Var = (fg1.q0) b17;
                        q0Var.a(1234L, 20L, 1L, false);
                        if (oe1.x1.c(eVar)) {
                            q0Var.a(1234L, 45L, 1L, false);
                        } else if (aVar.b(eVar)) {
                            q0Var.a(1234L, 92L, 1L, false);
                        } else if (oe1.x1.d(eVar)) {
                            q0Var.a(1234L, 40L, 1L, false);
                        }
                    }
                }
            }
            this.f19764h.prepareAsync();
        }
    }

    public final void M() {
        com.tencent.mars.xlog.Log.i(A(), "video release");
        dg.b bVar = this.f19773q;
        if (bVar != null) {
            sf.f fVar = this.f19775s;
            fg1.z zVar = (fg1.z) bVar;
            if (fVar instanceof com.tencent.mm.plugin.appbrand.extendplugin.b) {
                com.tencent.mm.plugin.appbrand.jsapi.l m17 = fVar.m();
                com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = m17 instanceof com.tencent.mm.plugin.appbrand.e9 ? ((com.tencent.mm.plugin.appbrand.e9) m17).t3() : m17 instanceof com.tencent.mm.plugin.appbrand.page.v5 ? ((com.tencent.mm.plugin.appbrand.page.v5) m17).t3() : null;
                if (t37 != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "removeOnRunningStateChangedListener");
                    t37.N.c(zVar.f261924e);
                    if (zVar.f261921b == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "markVideoPlayerRelease, pluginHandler is null");
                    } else {
                        tf1.f fVar2 = (tf1.f) t37.k(tf1.f.class);
                        if (fVar2 == null) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "markVideoPlayerRelease, audioOfVideoBackgroundPlayManager is null");
                        } else {
                            fVar2.o(zVar.f261921b);
                        }
                    }
                }
            }
        }
        W();
        V();
        N();
        dg.e eVar = this.f19765i;
        if (eVar != null) {
            ((fg1.b0) eVar).k();
            this.f19765i = null;
            this.f19767m = null;
        }
        if (this.f19774r != null) {
            fg1.u uVar = this.f19774r;
            uVar.b().b();
            uVar.f261901g = false;
            uVar.c(false);
            uVar.b().f();
            this.f19774r = null;
        }
        u();
        sf.f fVar3 = this.f19775s;
        if (fVar3 != null) {
            fVar3.f();
        }
        com.tencent.mars.xlog.Log.i(A(), "video release handler thread");
        this.f19785y1.removeCallbacksAndMessages(null);
        this.f19782x1.a();
        gg.c cVar = this.f252499f;
        if (cVar == null) {
            return;
        }
        ((gg.a) cVar).i(this.f252498e, this.f252497d);
    }

    public final void N() {
        if (this.f19764h != null) {
            com.tencent.mars.xlog.Log.i(A(), "releaseMediaPlayer");
            this.f19764h.p(null);
            this.f19764h.r(null);
            this.f19764h.B(null);
            this.f19764h.z(null);
            this.f19764h.h(null);
            this.f19764h.g(null);
            this.f19764h.stop();
            this.f19764h.reset();
            this.f19764h.release();
        }
        this.f19764h = null;
        this.B = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean O(sf.f r9) {
        /*
            r8 = this;
            java.lang.String r0 = r8.A()
            java.lang.String r1 = "requestFullscreen"
            com.tencent.mars.xlog.Log.i(r0, r1)
            dg.b r0 = r8.f19773q
            r1 = 0
            if (r0 == 0) goto L7e
            fg1.z r0 = (fg1.z) r0
            r0.getClass()
            boolean r2 = r9 instanceof com.tencent.mm.plugin.appbrand.extendplugin.b
            r3 = 1
            if (r2 != 0) goto L1b
        L18:
            r9 = r1
            goto L7b
        L1b:
            org.json.JSONObject r2 = r9.c()
            com.tencent.mm.plugin.appbrand.extendplugin.b r9 = (com.tencent.mm.plugin.appbrand.extendplugin.b) r9
            com.tencent.mm.plugin.appbrand.jsapi.l r9 = r9.m()
            boolean r4 = r9 instanceof com.tencent.mm.plugin.appbrand.page.v5
            if (r4 == 0) goto L2d
            r4 = r9
            com.tencent.mm.plugin.appbrand.page.v5 r4 = (com.tencent.mm.plugin.appbrand.page.v5) r4
            goto L3a
        L2d:
            boolean r4 = r9 instanceof com.tencent.mm.plugin.appbrand.e9
            if (r4 == 0) goto L39
            r4 = r9
            com.tencent.mm.plugin.appbrand.e9 r4 = (com.tencent.mm.plugin.appbrand.e9) r4
            com.tencent.mm.plugin.appbrand.page.v5 r4 = r4.V0()
            goto L3a
        L39:
            r4 = 0
        L3a:
            java.lang.String r5 = "MicroMsg.SameLayer.AppBrandVideoCustomHandler"
            if (r4 != 0) goto L44
            java.lang.String r9 = "requestFullscreen, page view is null"
            com.tencent.mars.xlog.Log.w(r5, r9)
            goto L18
        L44:
            if (r2 == 0) goto L18
            java.lang.String r6 = "data"
            boolean r7 = r2.has(r6)
            if (r7 == 0) goto L18
            org.json.JSONArray r2 = r2.optJSONArray(r6)
            if (r2 == 0) goto L75
            int r6 = r2.length()
            if (r6 != 0) goto L5b
            goto L75
        L5b:
            r5 = 90
            int r2 = r2.optInt(r1, r5)
            r6 = -90
            if (r2 == r6) goto L6a
            if (r2 == 0) goto L68
            goto L6b
        L68:
            r5 = r1
            goto L6b
        L6a:
            r5 = r6
        L6b:
            fg1.v r2 = new fg1.v
            r2.<init>(r0, r4, r9, r5)
            r4.m(r2)
            r9 = r3
            goto L7b
        L75:
            java.lang.String r9 = "requestFullscreen, data array is null"
            com.tencent.mars.xlog.Log.w(r5, r9)
            goto L18
        L7b:
            if (r9 == 0) goto L7e
            r1 = r3
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bg.f.O(sf.f):boolean");
    }

    public final void P(sf.f fVar) {
        android.view.Surface surface;
        N();
        x(fVar);
        ye1.e eVar = this.f19764h;
        if (eVar != null) {
            eVar.setMute(this.D);
            if (this.f19763g != null) {
                boolean z17 = this.T1.get();
                if (!this.S && !z17) {
                    com.tencent.mars.xlog.Log.i(A(), "applyMediaPlayerParams, setSurface");
                    this.f19764h.setSurface(this.f19763g);
                    return;
                }
                java.lang.String A = A();
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = java.lang.Boolean.valueOf(this.S);
                objArr[1] = java.lang.Boolean.valueOf(z17);
                objArr[2] = java.lang.Boolean.valueOf(this.D1 != null);
                com.tencent.mars.xlog.Log.i(A, "applyMediaPlayerParams, setSurface, WebViewInBackground: %b, JustPlayAudio: %b, SurfacePipSet exist: %b", objArr);
                if (!this.S || (surface = this.D1) == null) {
                    return;
                }
                this.f19764h.setSurface(surface);
            }
        }
    }

    public final boolean Q(java.lang.Runnable runnable) {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        qu5.a aVar = this.f19785y1;
        if (myLooper == null || myLooper != aVar.getLooper()) {
            aVar.post(runnable);
            return true;
        }
        runnable.run();
        return true;
    }

    public final void R(long j17) {
        if (!this.f19786z || this.f19764h == null) {
            this.f19780x = j17;
            return;
        }
        if (U()) {
            ((fg1.b0) this.f19765i).i();
        }
        if (this.f19764h != null) {
            this.f19777u = G();
            long min = java.lang.Math.min(this.f19764h != null ? r0.getDuration() : 0, java.lang.Math.max(0L, j17));
            com.tencent.mars.xlog.Log.i(A(), "seek, position:%s, isPlaying:%s, videoEndPlaying:%s", java.lang.Long.valueOf(min), java.lang.Boolean.valueOf(this.f19777u), java.lang.Boolean.valueOf(this.R));
            this.R = false;
            this.f19764h.seekTo(min);
        }
    }

    public void S(java.lang.Class cls, tf.r rVar) {
        com.tencent.mars.xlog.Log.i(A(), "setAddOn for ".concat(cls.getSimpleName()));
        java.util.Map map = ((tf.l0) this.S1).f418836d;
        if (rVar == null) {
            ((java.util.concurrent.ConcurrentHashMap) map).remove(cls);
        } else {
            ((java.util.concurrent.ConcurrentHashMap) map).put(cls, rVar);
        }
    }

    public boolean T(android.view.Surface surface) {
        if (this.f19764h == null) {
            com.tencent.mars.xlog.Log.w(A(), "setSurface, MediaPlayer is null");
            return false;
        }
        com.tencent.mars.xlog.Log.i(A(), "setSurface, JustPlayAudio");
        this.f19764h.setSurface(surface);
        if (this.f19763g == surface) {
            this.D1 = null;
        } else {
            this.D1 = surface;
        }
        java.lang.String A = A();
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(this.D1 != null);
        com.tencent.mars.xlog.Log.i(A, "setSurface, SurfacePipSet exist: %b", objArr);
        return true;
    }

    public final synchronized boolean U() {
        boolean z17;
        if (this.A) {
            z17 = this.f19765i != null;
        }
        return z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0023, code lost:
    
        if (r1.Y == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V() {
        /*
            r22 = this;
            r0 = r22
            ye1.e r1 = r0.f19764h
            if (r1 != 0) goto L7
            return
        L7:
            java.lang.Class<af1.x> r2 = af1.x.class
            ye1.e r1 = r1.l(r2)
            af1.x r1 = (af1.x) r1
            if (r1 == 0) goto L6b
            boolean r2 = r1.X
            r3 = 0
            if (r2 == 0) goto L26
            int r2 = r1.U
            r4 = 1
            if (r2 <= 0) goto L21
            r21 = r4
            r4 = r3
            r3 = r21
            goto L27
        L21:
            boolean r1 = r1.Y
            if (r1 != 0) goto L26
            goto L27
        L26:
            r4 = r3
        L27:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            java.lang.String r2 = "MicroMsg.SameLayer.ExoMediaPlayer"
            java.lang.String r5 = "statErrorPlayerNotFound, hasLoadError: %b, hasOtherError: %b"
            com.tencent.mars.xlog.Log.i(r2, r5, r1)
            dg.b r1 = r0.f19773q
            if (r1 == 0) goto L6b
            fg1.z r1 = (fg1.z) r1
            dg.f r2 = r1.b()
            ig1.a r1 = r1.f261922c
            r1.getClass()
            if (r2 == 0) goto L6b
            if (r3 == 0) goto L5b
            r6 = 1234(0x4d2, double:6.097E-321)
            r8 = 134(0x86, double:6.6E-322)
            r10 = 1
            r12 = 0
            r5 = r2
            fg1.q0 r5 = (fg1.q0) r5
            r5.a(r6, r8, r10, r12)
        L5b:
            if (r4 == 0) goto L6b
            r14 = 1234(0x4d2, double:6.097E-321)
            r16 = 135(0x87, double:6.67E-322)
            r18 = 1
            r20 = 0
            r13 = r2
            fg1.q0 r13 = (fg1.q0) r13
            r13.a(r14, r16, r18, r20)
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bg.f.V():void");
    }

    public final boolean W() {
        ye1.e eVar = this.f19764h;
        if (eVar == null) {
            return false;
        }
        dg.b bVar = this.f19773q;
        if (bVar != null) {
            sf.f fVar = this.f19775s;
            fg1.z zVar = (fg1.z) bVar;
            dg.f b17 = zVar.b();
            ig1.a aVar = zVar.f261922c;
            if (b17 != null) {
                ig1.c cVar = aVar.f291341a;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(cVar.f291343a) && cVar.f291348f > 0) {
                    cVar.f291355m = java.lang.System.currentTimeMillis();
                    aVar.c(b17, fVar, eVar, "onMediaPlayerVideoStop");
                }
            } else {
                aVar.getClass();
            }
        }
        if (!this.f19786z) {
            com.tencent.mars.xlog.Log.i(A(), "video stop, video not prepared yet, stop video when prepared");
            this.f19779w = false;
            return true;
        }
        com.tencent.mars.xlog.Log.i(A(), "video stop");
        A();
        com.tencent.mars.xlog.Log.i(A(), "video stop, abandonFocus");
        this.G1.a();
        this.f19764h.stop();
        if (U()) {
            ((fg1.b0) this.f19765i).f(true);
        }
        return true;
    }

    public final void X(sf.f fVar, org.json.JSONObject jSONObject) {
        if (jSONObject.has("subtitleSrc")) {
            java.lang.String optString = jSONObject.optString("subtitleSrc", "");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(optString) && !optString.equalsIgnoreCase(this.f19784y0)) {
                this.f19784y0 = optString;
                this.f19764h.w(optString);
                com.tencent.mars.xlog.Log.i(A(), "showSubtitle show:%b", java.lang.Boolean.TRUE);
                ye1.e eVar = this.f19764h;
                if (eVar == null) {
                    com.tencent.mars.xlog.Log.w(A(), "showSubtitle, mMediaPlayer is null");
                } else {
                    eVar.j(true);
                }
            }
        }
        com.tencent.mars.xlog.Log.i(A(), "update, mSubtitleSrc:%s", this.f19784y0);
    }

    @Override // eg.b
    public boolean b(sf.f fVar) {
        return true;
    }

    @Override // eg.a, eg.b
    public void e() {
        Q(new bg.s0(this));
    }

    @Override // eg.b
    public java.lang.String f(sf.f fVar) {
        Q(new bg.t0(this, fVar));
        return null;
    }

    @Override // tf.q
    public java.lang.String getName() {
        return z();
    }

    @Override // tf.q
    public tf.r h(java.lang.Class cls) {
        com.tencent.mars.xlog.Log.i(A(), "getAddOn for ".concat(cls.getSimpleName()));
        return ((tf.l0) this.S1).h(cls);
    }

    @Override // eg.a, eg.b
    public void i(android.view.Surface surface) {
        Q(new bg.a0(this, surface));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x015d  */
    @Override // eg.a, eg.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(android.graphics.Bitmap r18) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bg.f.k(android.graphics.Bitmap):void");
    }

    @Override // eg.b
    public void p(android.graphics.SurfaceTexture surfaceTexture) {
        i(new android.view.Surface(surfaceTexture));
    }

    public final void r(boolean z17) {
        dg.g gVar;
        bg.y0 y0Var;
        float f17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.N)) {
            com.tencent.mars.xlog.Log.i(A(), "adjust objectFit, no video objectFit");
            return;
        }
        if (this.f252499f == null || (gVar = this.f19770p) == null) {
            com.tencent.mars.xlog.Log.i(A(), "adjust objectFit, video not prepared");
            return;
        }
        float f18 = this.O1;
        float f19 = this.P1;
        if (((fg1.r0) gVar).a(this.N, this.E, this.F, this.I, this.f19762J)) {
            dg.g gVar2 = this.f19770p;
            this.O1 = ((fg1.r0) gVar2).f261888h;
            this.P1 = ((fg1.r0) gVar2).f261889i;
            com.tencent.mars.xlog.Log.i(A(), "adjust objectFit:%s, scale:[%s, %s]", this.N, java.lang.Float.valueOf(this.O1), java.lang.Float.valueOf(this.P1));
            boolean z18 = true;
            if (!this.S || this.D1 == null) {
                sf.i.c(this.f252499f, this.f252498e, this.f252497d, this.O1, this.P1);
                this.I1 = false;
            } else {
                this.I1 = true;
                com.tencent.mars.xlog.Log.i(A(), "adjust objectFit, TextureScale sticky");
            }
            float f27 = this.O1;
            if ((f27 == f18 && this.P1 == f19) || (y0Var = this.H1) == null) {
                return;
            }
            float f28 = this.P1;
            bg.d dVar = (bg.d) y0Var;
            dVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TextureScaleLogic", "onTextureScale, justTextureSizeChanged: %b, widthScale: %f, heightScale: %f", java.lang.Boolean.valueOf(z17), java.lang.Float.valueOf(f27), java.lang.Float.valueOf(f28));
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TextureScaleLogic", "onTextureScale, justTextureSizeChanged");
                return;
            }
            if (((com.tencent.luggage.xweb_ext.extendplugin.component.video.TextureImageViewLikeImpl) dVar.f19752c.get()) == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TextureScaleLogic", "onTextureScale, textureImageViewLike already release");
                return;
            }
            float f29 = f27 / dVar.f19750a;
            float f37 = f28 / dVar.f19751b;
            float f38 = 1.0f;
            if (f29 >= f37) {
                f17 = (f37 / f29) * 1.0f;
                z18 = false;
            } else {
                f38 = (f29 / f37) * 1.0f;
                f17 = 1.0f;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TextureScaleLogic", "onTextureScale, fixedWidthScale: %f, fixedHeightScale: %f, finalWidthScale: %f, finalHeightScale: %f, willScaleWidth: %b", java.lang.Float.valueOf(f29), java.lang.Float.valueOf(f37), java.lang.Float.valueOf(f38), java.lang.Float.valueOf(f17), java.lang.Boolean.valueOf(z18));
            ((ku5.t0) ku5.t0.f312615d).B(new bg.c(dVar, z18, f38, f17));
        }
    }

    public final boolean s() {
        sf.f fVar = this.f19775s;
        if (fVar == null) {
            com.tencent.mars.xlog.Log.w(A(), "amIBackgroundAudioPlayer, mInsertInvokeContext is null");
            return false;
        }
        tf1.f a17 = tf.k.a(fVar);
        if (a17 != null) {
            return a17.a(this);
        }
        com.tencent.mars.xlog.Log.w(A(), "amIBackgroundAudioPlayer, audioOfVideoBackgroundPlayManager is null");
        return false;
    }

    public final boolean t() {
        sf.f fVar = this.f19775s;
        if (!(fVar instanceof com.tencent.mm.plugin.appbrand.extendplugin.b)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.l m17 = fVar.m();
        com.tencent.mm.plugin.appbrand.page.v5 V0 = m17 instanceof com.tencent.mm.plugin.appbrand.page.v5 ? (com.tencent.mm.plugin.appbrand.page.v5) m17 : m17 instanceof com.tencent.mm.plugin.appbrand.e9 ? ((com.tencent.mm.plugin.appbrand.e9) m17).V0() : null;
        if (V0 == null) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = V0.t3();
        com.tencent.mars.xlog.Log.i(A(), "cancelResumePlayingWhenRelaunch:%s", java.lang.Boolean.valueOf(t37.f74806p0));
        return t37.f74806p0;
    }

    public final void u() {
        ae.r rVar;
        bg.a aVar = this.E1;
        if (aVar != null) {
            lm1.t tVar = (lm1.t) aVar;
            if (tVar.f319360b) {
                java.lang.ref.WeakReference weakReference = tVar.f319362d;
                com.tencent.mm.plugin.appbrand.page.n7 n7Var = weakReference != null ? (com.tencent.mm.plugin.appbrand.page.n7) weakReference.get() : null;
                if (n7Var == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.VideoCanvasExtTextureProducerMBImpl", "onSameLayerSurfacePreRelease, insertComponent is null");
                } else {
                    com.tencent.mm.plugin.appbrand.service.c0 U1 = n7Var.U1();
                    com.tencent.magicbrush.MagicBrush w17 = (U1 == null || (rVar = (ae.r) U1.z1(ae.r.class)) == null) ? null : rVar.w();
                    if (w17 == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.VideoCanvasExtTextureProducerMBImpl", "onSameLayerSurfacePreRelease, magicBrush is null");
                    } else {
                        com.tencent.magicbrush.ext_texture.MBExternalTexturePlugin mBExternalTexturePlugin = w17.f48582f;
                        bg.f fVar = tVar.f319359a;
                        if (fVar == null) {
                            kotlin.jvm.internal.o.o("videoPluginHandler");
                            throw null;
                        }
                        mBExternalTexturePlugin.b("video", fVar.f252497d);
                        android.view.Surface surface = tVar.f319364f;
                        if (surface != null) {
                            surface.release();
                        }
                        tVar.f319360b = false;
                    }
                }
            }
        }
        android.view.Surface surface2 = this.f19763g;
        if (surface2 != null) {
            surface2.release();
            this.f19763g = null;
        }
    }

    public final void v(android.view.Surface surface) {
        javax.microedition.khronos.egl.EGL10 egl10 = (javax.microedition.khronos.egl.EGL10) javax.microedition.khronos.egl.EGLContext.getEGL();
        javax.microedition.khronos.egl.EGLDisplay eglGetDisplay = egl10.eglGetDisplay(javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY);
        egl10.eglInitialize(eglGetDisplay, null);
        javax.microedition.khronos.egl.EGLConfig[] eGLConfigArr = new javax.microedition.khronos.egl.EGLConfig[1];
        egl10.eglChooseConfig(eglGetDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344, 0, 12344}, eGLConfigArr, 1, new int[1]);
        javax.microedition.khronos.egl.EGLConfig eGLConfig = eGLConfigArr[0];
        javax.microedition.khronos.egl.EGLContext eglCreateContext = egl10.eglCreateContext(eglGetDisplay, eGLConfig, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
        javax.microedition.khronos.egl.EGLSurface eglCreateWindowSurface = egl10.eglCreateWindowSurface(eglGetDisplay, eGLConfig, surface, new int[]{12344});
        egl10.eglMakeCurrent(eglGetDisplay, eglCreateWindowSurface, eglCreateWindowSurface, eglCreateContext);
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        android.opengl.GLES20.glClear(16384);
        egl10.eglSwapBuffers(eglGetDisplay, eglCreateWindowSurface);
        egl10.eglDestroySurface(eglGetDisplay, eglCreateWindowSurface);
        javax.microedition.khronos.egl.EGLSurface eGLSurface = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
        egl10.eglMakeCurrent(eglGetDisplay, eGLSurface, eGLSurface, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT);
        egl10.eglDestroyContext(eglGetDisplay, eglCreateContext);
        egl10.eglTerminate(eglGetDisplay);
    }

    public final java.lang.String w(sf.f fVar, java.lang.String str) {
        oe1.q1 q1Var;
        dg.b bVar = this.f19773q;
        if (bVar == null) {
            return str;
        }
        ((fg1.z) bVar).getClass();
        if (!(fVar instanceof com.tencent.mm.plugin.appbrand.extendplugin.b)) {
            return str;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && str.startsWith("cloud://")) {
            return null;
        }
        com.tencent.mm.plugin.appbrand.jsapi.l m17 = fVar.m();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || m17 == null || m17.getFileSystem() == null || !m17.getFileSystem().accept(str)) {
            return (com.tencent.mm.sdk.platformtools.t8.K0(str) || (q1Var = (oe1.q1) i95.n0.c(oe1.q1.class)) == null) ? str : q1Var.z7(str);
        }
        com.tencent.mm.vfs.r6 absoluteFile = m17.getFileSystem().getAbsoluteFile(str);
        if (absoluteFile != null) {
            str = "file://" + absoluteFile.o();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "convertVideoPath, videoPath:%s", str);
        return str;
    }

    public final void x(sf.f fVar) {
        ye1.e e0Var;
        boolean z17;
        com.tencent.mars.xlog.Log.i(A(), "createMediaPlayer");
        dg.b bVar = this.f19773q;
        if (bVar != null) {
            android.os.Handler b17 = this.f19782x1.b();
            fg1.z zVar = (fg1.z) bVar;
            if (fVar instanceof com.tencent.mm.plugin.appbrand.extendplugin.b) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                fg1.w0 w0Var = (fg1.w0) i95.n0.c(fg1.w0.class);
                e0Var = w0Var == null ? new ye1.e0() : w0Var.r2(fVar, b17);
                long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                ig1.a aVar = zVar.f261922c;
                dg.f b18 = zVar.b();
                aVar.getClass();
                if (e0Var != null && b18 != null) {
                    if (4 == e0Var.getPlayerType()) {
                        fg1.q0 q0Var = (fg1.q0) b18;
                        q0Var.a(1234L, 140L, 1L, false);
                        z17 = false;
                        q0Var.a(1234L, 141L, currentTimeMillis2, false);
                        aVar.f291341a.f291344b = 3;
                    } else {
                        z17 = false;
                        if (aVar.b(e0Var)) {
                            fg1.q0 q0Var2 = (fg1.q0) b18;
                            q0Var2.a(1234L, 87L, 1L, false);
                            q0Var2.a(1234L, 88L, currentTimeMillis2, false);
                            aVar.f291341a.f291344b = 2;
                        } else if (oe1.x1.c(e0Var)) {
                            fg1.q0 q0Var3 = (fg1.q0) b18;
                            q0Var3.a(1234L, 3L, 1L, false);
                            q0Var3.a(1234L, 4L, currentTimeMillis2, false);
                            aVar.f291341a.f291344b = 1;
                        } else if (oe1.x1.d(e0Var)) {
                            fg1.q0 q0Var4 = (fg1.q0) b18;
                            q0Var4.a(1234L, 0L, 1L, false);
                            q0Var4.a(1234L, 1L, currentTimeMillis2, false);
                            aVar.f291341a.f291344b = 0;
                        }
                    }
                    ((fg1.q0) b18).a(1234L, 6L, 1L, false);
                    aVar.f291341a.f291345c = currentTimeMillis2;
                    af1.i0 i0Var = (af1.i0) e0Var.l(af1.i0.class);
                    if (i0Var != null) {
                        ig1.c cVar = aVar.f291341a;
                        af1.l0 l0Var = i0Var.f4481b0;
                        if (l0Var == null) {
                            int i17 = i0Var.Z;
                            jz5.g gVar = af1.g.f4470a;
                            af1.l0 l0Var2 = new af1.l0(i17, z17, z17, ((java.lang.Boolean) ((jz5.n) af1.g.f4470a).getValue()).booleanValue());
                            com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.ExoMediaPlayer", "getExtraInfo, extraInfo: " + l0Var2);
                            i0Var.f4481b0 = l0Var2;
                            l0Var = l0Var2;
                        }
                        cVar.f291360r = l0Var;
                        i0Var.f4482c0 = new ig1.a$$a(aVar);
                    }
                }
            } else {
                e0Var = null;
            }
            this.f19764h = e0Var;
        }
        if (this.f19764h == null) {
            com.tencent.mars.xlog.Log.e(A(), "createMediaPlayer, create media player fail");
            return;
        }
        this.B = true;
        this.f19764h.p(new bg.v(this));
        this.f19764h.r(new bg.w(this));
        this.f19764h.B(new bg.x(this));
        this.f19764h.z(new bg.y(this));
        this.f19764h.h(new bg.z(this));
        this.f19764h.g(new bg.b0(this));
        this.f19764h.d(new bg.c0(this));
        bg.z0 z0Var = this.L1;
        if (z0Var != null) {
            ((fg1.e1) z0Var).a(this.f19786z);
        }
        this.f19764h.i(new bg.e0(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean y(sf.f r6) {
        /*
            r5 = this;
            java.lang.String r0 = r5.A()
            java.lang.String r1 = "exitFullscreen"
            com.tencent.mars.xlog.Log.i(r0, r1)
            dg.b r0 = r5.f19773q
            r1 = 0
            if (r0 == 0) goto L4b
            fg1.z r0 = (fg1.z) r0
            r0.getClass()
            boolean r2 = r6 instanceof com.tencent.mm.plugin.appbrand.extendplugin.b
            r3 = 1
            if (r2 != 0) goto L1a
        L18:
            r6 = r1
            goto L48
        L1a:
            com.tencent.mm.plugin.appbrand.extendplugin.b r6 = (com.tencent.mm.plugin.appbrand.extendplugin.b) r6
            com.tencent.mm.plugin.appbrand.jsapi.l r6 = r6.m()
            boolean r2 = r6 instanceof com.tencent.mm.plugin.appbrand.page.v5
            if (r2 == 0) goto L28
            r2 = r6
            com.tencent.mm.plugin.appbrand.page.v5 r2 = (com.tencent.mm.plugin.appbrand.page.v5) r2
            goto L35
        L28:
            boolean r2 = r6 instanceof com.tencent.mm.plugin.appbrand.e9
            if (r2 == 0) goto L34
            r2 = r6
            com.tencent.mm.plugin.appbrand.e9 r2 = (com.tencent.mm.plugin.appbrand.e9) r2
            com.tencent.mm.plugin.appbrand.page.v5 r2 = r2.V0()
            goto L35
        L34:
            r2 = 0
        L35:
            if (r2 != 0) goto L3f
            java.lang.String r6 = "MicroMsg.SameLayer.AppBrandVideoCustomHandler"
            java.lang.String r0 = "exitFullscreen, page view is null"
            com.tencent.mars.xlog.Log.w(r6, r0)
            goto L18
        L3f:
            fg1.w r4 = new fg1.w
            r4.<init>(r0, r2, r6)
            r2.m(r4)
            r6 = r3
        L48:
            if (r6 == 0) goto L4b
            r1 = r3
        L4b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bg.f.y(sf.f):boolean");
    }

    public java.lang.String z() {
        return q() + "@" + hashCode();
    }
}

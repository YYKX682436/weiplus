package wf;

/* loaded from: classes7.dex */
public class b extends eg.a implements tf.w, tf.q, p012xc85e97e9.p093xedfae76a.y {
    public volatile boolean A;
    public volatile boolean B;
    public volatile boolean C;
    public final tf.o D;
    public final qu5.a E;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 F;
    public boolean G;
    public volatile boolean H;
    public java.util.concurrent.atomic.AtomicBoolean I;

    /* renamed from: J, reason: collision with root package name */
    public volatile sf.f f526948J;
    public final tf.c K;
    public final tf.d L;
    public java.lang.String M;
    public tf.m0 N;
    public int P;
    public volatile boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public final tf.q U;
    public final java.util.concurrent.atomic.AtomicBoolean V;
    public volatile java.lang.String W;
    public volatile java.lang.String X;
    public volatile tf.m Y;
    public volatile android.graphics.Bitmap Z;

    /* renamed from: g, reason: collision with root package name */
    public android.view.Surface f526949g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.Surface f526950h;

    /* renamed from: i, reason: collision with root package name */
    public wf.a f526951i;

    /* renamed from: m, reason: collision with root package name */
    public xf.c f526952m;

    /* renamed from: n, reason: collision with root package name */
    public xf.b f526953n;

    /* renamed from: o, reason: collision with root package name */
    public xf.a f526954o;

    /* renamed from: p, reason: collision with root package name */
    public sf.f f526955p;

    /* renamed from: p0, reason: collision with root package name */
    public volatile uf.o1 f526956p0;

    /* renamed from: q, reason: collision with root package name */
    public int f526957q;

    /* renamed from: r, reason: collision with root package name */
    public int f526958r;

    /* renamed from: u, reason: collision with root package name */
    public boolean f526961u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f526962v;

    /* renamed from: x0, reason: collision with root package name */
    public volatile boolean f526965x0;

    /* renamed from: z, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.x7 f526967z;

    /* renamed from: y0, reason: collision with root package name */
    public static final tf.n f526947y0 = tf.f0.b(tf.g0.f500342e);

    /* renamed from: l1, reason: collision with root package name */
    public static uf.i f526946l1 = zf1.a.f554159a;

    /* renamed from: s, reason: collision with root package name */
    public int f526959s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f526960t = 0;

    /* renamed from: w, reason: collision with root package name */
    public sd1.c f526963w = null;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f526964x = null;

    /* renamed from: y, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.b0 f526966y = new p012xc85e97e9.p093xedfae76a.b0(this, true);

    public b() {
        yz5.a aVar = new yz5.a() { // from class: wf.b$$j
            @Override // yz5.a
            /* renamed from: invoke */
            public final java.lang.Object mo152xb9724478() {
                sf.f fVar = wf.b.this.f526955p;
                if (fVar != null) {
                    return fVar.m();
                }
                return null;
            }
        };
        this.f526967z = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.x7(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.v7(aVar), new wf.i(this));
        this.A = false;
        this.F = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.G = false;
        this.H = false;
        this.I = null;
        this.f526948J = null;
        this.K = new wf.o(this, this, new wf.n(this));
        this.L = new wf.p(this);
        this.M = "";
        this.N = null;
        this.P = -1;
        this.Q = false;
        this.R = false;
        this.S = false;
        this.T = false;
        this.U = new tf.l0();
        this.V = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.W = null;
        this.X = null;
        this.Y = null;
        this.Z = null;
        this.f526956p0 = null;
        this.f526965x0 = false;
        ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: wf.b$$k
            @Override // java.lang.Runnable
            public final void run() {
                wf.b.this.f526966y.i(p012xc85e97e9.p093xedfae76a.n.STARTED);
            }
        });
        tf.o a17 = ((tf.f0) f526947y0).a();
        this.D = a17;
        a17.mo166400x68ac462();
        this.E = a17.mo166399x67189314();
        sc1.m1.a();
        wf.r rVar = new wf.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        this.f526951i = rVar;
        rVar.mo164242xbdb2cd8a(new wf.j(this));
        ((wf.r) this.f526951i).h(new wf.k(this));
    }

    public static void r(final wf.b bVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(bVar.w(), "muteIfIsUnMuted");
        if (bVar.y()) {
            return;
        }
        bVar.C("mute", new java.lang.Runnable() { // from class: wf.b$$q
            @Override // java.lang.Runnable
            public final void run() {
                wf.b bVar2 = wf.b.this;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(bVar2.w(), "muteIfIsUnMuted, set passive mute");
                bVar2.A = true;
            }
        });
    }

    public final void A(boolean z17, boolean z18) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.V;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.LivePlayerPluginHandler", "JustPlayAudio set: false");
            atomicBoolean.set(false);
            wf.a aVar = this.f526951i;
            if (aVar != null) {
                aVar.mo173672x42c875eb(this.f526949g);
            }
            this.T = false;
            xf.b bVar = this.f526953n;
            if (bVar != null) {
                ((yf1.k) bVar).b(this.f334030d, false);
                return;
            }
            return;
        }
        wf.a aVar2 = this.f526951i;
        if (aVar2 != null && !aVar2.mo173671xc00617a4()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.LivePlayerPluginHandler", "JustPlayAudio set: true");
            atomicBoolean.set(true);
            this.f526951i.mo173672x42c875eb(null);
        } else if (z18) {
            atomicBoolean.set(true);
        }
        this.T = true;
        xf.b bVar2 = this.f526953n;
        if (bVar2 != null) {
            ((yf1.k) bVar2).b(this.f334030d, true);
        }
    }

    public final void B(java.lang.String str) {
        boolean z17 = true;
        if (str.equalsIgnoreCase("pause")) {
            tf.m0 m0Var = this.N;
            if (m0Var != null) {
                m0Var.mo129541xb01dfb57();
            } else {
                this.P = 4;
            }
            xf.a aVar = this.f526954o;
            if (aVar != null) {
                ((yf1.e) aVar).c(this.f334030d, com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46357xe9bcaf57, null);
            }
        } else if (str.equalsIgnoreCase("stop")) {
            tf.m0 m0Var2 = this.N;
            if (m0Var2 != null) {
                m0Var2.mo129542xc39f8281();
            } else {
                this.P = 6;
            }
            xf.a aVar2 = this.f526954o;
            if (aVar2 != null) {
                ((yf1.e) aVar2).c(this.f334030d, com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46357xe9bcaf57, null);
            }
        } else {
            z17 = false;
            if (str.equalsIgnoreCase("mute")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w(), "operate, reset passive mute");
                this.A = false;
            }
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w(), "operate " + str + ", abandonFocus");
            this.f526967z.a();
        }
    }

    public final void C(final java.lang.String str, final java.lang.Runnable runnable) {
        L(new java.lang.Runnable() { // from class: wf.b$$b
            @Override // java.lang.Runnable
            public final void run() {
                wf.b bVar = wf.b.this;
                wf.a aVar = bVar.f526951i;
                if (aVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(bVar.w(), "run#operate, adapter is null");
                    return;
                }
                java.lang.String str2 = str;
                aVar.n(str2, null);
                bVar.B(str2);
                java.lang.Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013c, code lost:
    
        if (r0 == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0195, code lost:
    
        if (r0 == false) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0458  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(sf.f r25) {
        /*
            Method dump skipped, instructions count: 1448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wf.b.D(sf.f):void");
    }

    public final void E(sf.f fVar) {
        java.lang.String optString = fVar.c().optString("type");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w(), "operateBackground, type:%s", optString);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) || this.f526951i == null) {
            fVar.a(jc1.f.f380448d);
            return;
        }
        boolean z17 = false;
        if (optString.equals("stop")) {
            u(fVar, false);
            if (this.G) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w(), "operateBackground, isRuntimeInBackground, setPlayingWhenEnterBackground false");
                this.I = new java.util.concurrent.atomic.AtomicBoolean(false);
                return;
            }
            return;
        }
        if (!optString.equalsIgnoreCase("pause") && !optString.equalsIgnoreCase("resume") && !optString.equalsIgnoreCase(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w(), "call operate");
            D(fVar);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w(), "operateBackground call backgroundManager:".concat(optString));
        tf1.f a17 = tf.k.a(fVar);
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(w(), "operateBackground PAUSE, audioOfVideoBackgroundPlayManager is null. use demote logic.");
            D(fVar);
            return;
        }
        if (optString.equalsIgnoreCase("pause")) {
            a17.u(optString);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w(), "operateBackground pauseBackgroundAudioPlay:".concat(optString));
            A(false, true);
        } else {
            boolean mo173671xc00617a4 = ((wf.r) this.f526951i).mo173671xc00617a4();
            boolean i17 = ((wf.r) this.f526951i).i();
            if ((optString.equalsIgnoreCase("resume") && mo173671xc00617a4) || (optString.equalsIgnoreCase(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27) && !i17)) {
                z17 = true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w(), "operateBackground startBackgroundAudioPlay:%s, isPlaying:%b, isPause:%b", optString, java.lang.Boolean.valueOf(mo173671xc00617a4), java.lang.Boolean.valueOf(i17));
            if (z17) {
                a17.w(optString);
                A(true, true);
            } else {
                D(fVar);
            }
        }
        fVar.a(jc1.f.f380445a);
    }

    public final void F(org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject;
        if (!jSONObject.has("position") || (optJSONObject = jSONObject.optJSONObject("position")) == null) {
            return;
        }
        this.f526957q = ik1.w.c(optJSONObject.optInt("width", 0));
        this.f526958r = ik1.w.c(optJSONObject.optInt("height", 0));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w(), "parseHtmlPosition, size:[%d, %d]", java.lang.Integer.valueOf(this.f526957q), java.lang.Integer.valueOf(this.f526958r));
        s();
    }

    public final void G(sf.f fVar, org.json.JSONObject jSONObject) {
        if (jSONObject.has("needEvent")) {
            jSONObject.optBoolean("needEvent", false);
            xf.b bVar = this.f526953n;
            if (bVar != null) {
                yf1.k kVar = (yf1.k) bVar;
                kVar.getClass();
                if (fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b) {
                    kVar.f543177a = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b) fVar;
                }
            }
        }
    }

    public void H() {
        wf.a aVar = this.f526951i;
        if (aVar == null || aVar.mo173671xc00617a4()) {
            return;
        }
        C(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, null);
    }

    public final void I(org.json.JSONObject jSONObject) {
        if (!this.H || this.L.a(this.f526955p)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w(), "insert, webView in background");
        try {
            jSONObject.put(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15486x7e8b3a17, false);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(w(), "insert, put isInForeground fail since " + e17.toString());
        }
        this.I = new java.util.concurrent.atomic.AtomicBoolean(jSONObject.optBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15485x340d78e6, false));
    }

    public final void J() {
        ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: wf.b$$p
            @Override // java.lang.Runnable
            public final void run() {
                wf.b.this.f526966y.i(p012xc85e97e9.p093xedfae76a.n.DESTROYED);
            }
        });
        xf.a aVar = this.f526954o;
        if (aVar != null) {
            yf1.e eVar = (yf1.e) aVar;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 a17 = tf1.h.a(this.f526955p);
            if (a17 != null) {
                a17.N.c(eVar.f543176f);
                xf1.i iVar = (xf1.i) a17.k(xf1.i.class);
                if (iVar != null) {
                    wf.b bVar = eVar.f543171a;
                    iVar.f535773g.remove(bVar);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(iVar.f535770d, "unregisterLivePlayer:%s", bVar.g());
                }
                if (eVar.f543174d) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "markVideoPlayerRelease, is voip mode");
                } else if (eVar.f543171a == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "markVideoPlayerRelease, pluginHandler is null");
                } else {
                    tf1.f fVar = (tf1.f) a17.k(tf1.f.class);
                    if (fVar == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "markVideoPlayerRelease, audioOfVideoBackgroundPlayManager is null");
                    } else {
                        fVar.o(eVar.f543171a);
                    }
                }
            }
            eVar.f543175e = true;
        }
        wf.a aVar2 = this.f526951i;
        if (aVar2 != null) {
            ((wf.r) aVar2).e();
            this.f526951i = null;
        }
        uf.o1 o1Var = this.f526956p0;
        this.f526956p0 = null;
        if (o1Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCastHandler", "handleDestroy");
            uf.o0 q17 = o1Var.q();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = q17.f508598h;
            if (!b4Var.e()) {
                b4Var.d();
                q17.f508597g = true;
            }
            o1Var.q().b();
            o1Var.s(uf.b.f508504d);
        }
        android.view.Surface surface = this.f526949g;
        if (surface != null) {
            surface.release();
            this.f526949g = null;
        }
        sf.f fVar2 = this.f526955p;
        if (fVar2 != null) {
            fVar2.f();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w(), "LivePlayer release handler thread");
        this.E.mo50302x6b17ad39(null);
        this.D.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w(), "release, abandonFocus");
        this.f526967z.a();
        gg.c cVar = this.f334032f;
        if (cVar == null) {
            return;
        }
        ((gg.a) cVar).i(this.f334031e, this.f334030d);
    }

    public final void K(int i17) {
        if (this.f526952m != null) {
            ((ch1.c) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a.class, true))).c(976L, i17, 1L, false);
        }
    }

    public final void L(java.lang.Runnable runnable) {
        this.E.mo50293x3498a0(runnable);
    }

    public void M(java.lang.Class cls, tf.r rVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w(), "setAddOn for ".concat(cls.getSimpleName()));
        java.util.Map map = ((tf.l0) this.U).f500369d;
        if (rVar == null) {
            ((java.util.concurrent.ConcurrentHashMap) map).remove(cls);
        } else {
            ((java.util.concurrent.ConcurrentHashMap) map).put(cls, rVar);
        }
    }

    public final boolean N(android.view.Surface surface) {
        wf.a aVar = this.f526951i;
        if (aVar != null) {
            aVar.mo173672x42c875eb(surface);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(w(), "setSurface, Adapter is null");
        return false;
    }

    public final void O(sf.f fVar, org.json.JSONObject jSONObject) {
        boolean optBoolean = jSONObject.optBoolean("enableCasting", this.f526965x0);
        this.f526965x0 = optBoolean;
        uf.o1 o1Var = this.f526956p0;
        if (optBoolean && o1Var == null) {
            o1Var = f526946l1.a(this.f334030d, fVar);
            this.f526956p0 = o1Var;
        }
        if (o1Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCastHandler", "toggleCastEnableState, enable: " + optBoolean);
            o1Var.s(optBoolean ? uf.b.f508505e : uf.b.f508504d);
            java.lang.String value = this.M;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
            java.lang.String str = o1Var.f508609h;
            o1Var.f508609h = value;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCastHandler", "onVideoPathUpdate, old: " + str + ", new: " + value);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(value, str) || r26.n0.N(value) || uf.b.f508506f != o1Var.r()) {
                return;
            }
            o1Var.s(uf.b.f508507g);
            uf.o0 q17 = o1Var.q();
            uf.i1 i1Var = new uf.i1(o1Var);
            q17.getClass();
            q17.f508595e.c().e(new uf.n0(q17, i1Var));
            uf.o0 q18 = o1Var.q();
            if (q18.f508601k != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCastController", "onCastSrcChange, curAction not null");
            } else {
                q18.f508601k = uf.a.f508497n;
            }
        }
    }

    public final void P() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w(), "unMuteIfIsMuted");
        if (y()) {
            C("mute", null);
        }
    }

    @Override // eg.b
    public boolean b(sf.f fVar) {
        return true;
    }

    @Override // eg.a, eg.b
    public void e() {
        L(new java.lang.Runnable() { // from class: wf.b$$m
            @Override // java.lang.Runnable
            public final void run() {
                wf.b bVar = wf.b.this;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(bVar.w(), "*** handler(%s) handlePluginDestroy", bVar.q());
            }
        });
    }

    @Override // eg.b
    public java.lang.String f(final sf.f fVar) {
        L(new java.lang.Runnable() { // from class: wf.b$$a
            /* JADX WARN: Code restructure failed: missing block: B:172:0x00dc, code lost:
            
                if (r5.equalsIgnoreCase("pause") == false) goto L48;
             */
            /* JADX WARN: Removed duplicated region for block: B:18:0x00e8  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x043a  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 1130
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: wf.RunnableC30679x2d183f.run():void");
            }
        });
        return null;
    }

    @Override // tf.w
    public java.lang.String g() {
        return java.lang.String.format("%s_%s", this.f334031e, java.lang.Integer.valueOf(this.f334030d));
    }

    @Override // p012xc85e97e9.p093xedfae76a.y
    /* renamed from: getLifecycle */
    public p012xc85e97e9.p093xedfae76a.o mo273xed6858b4() {
        return this.f526966y;
    }

    @Override // tf.q
    /* renamed from: getName */
    public java.lang.String mo10361xfb82e301() {
        return v();
    }

    @Override // tf.q
    public tf.r h(java.lang.Class cls) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w(), "getAddOn for ".concat(cls.getSimpleName()));
        return ((tf.l0) this.U).h(cls);
    }

    @Override // eg.a, eg.b
    public void i(final android.view.Surface surface) {
        L(new java.lang.Runnable() { // from class: wf.b$$l
            @Override // java.lang.Runnable
            public final void run() {
                wf.b bVar = wf.b.this;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(bVar.w(), "*** handler(%s) handlePluginReady", bVar.q());
                bVar.f526949g = surface;
                if (bVar.f526951i != null) {
                    if (bVar.V.get()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(bVar.w(), "setSurface, JustPlayAudio");
                    } else {
                        bVar.f526951i.mo173672x42c875eb(bVar.f526949g);
                    }
                    bVar.s();
                }
            }
        });
    }

    @Override // eg.a, eg.b
    public void k(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w(), "*** handler(%s) handlePluginScreenshotTaken", q());
        sf.f fVar = this.f526948J;
        if (fVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(w(), "handlePluginScreenshotTaken4JsApiCall, invokeContext is null");
            return;
        }
        this.f526948J = null;
        xf.a aVar = this.f526954o;
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(w(), "handlePluginScreenshotTaken4JsApiCall, customHandler is null");
        } else {
            ((yf1.e) aVar).d(fVar, bitmap);
        }
    }

    @Override // tf.w
    public void m() {
        L(new java.lang.Runnable() { // from class: wf.b$$e
            @Override // java.lang.Runnable
            public final void run() {
                wf.b bVar = wf.b.this;
                wf.a aVar = bVar.f526951i;
                if (aVar != null) {
                    aVar.n("stop", null);
                    bVar.B("stop");
                    bVar.f526951i.a();
                }
            }
        });
    }

    @Override // tf.w
    public boolean o() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w(), "startIfForeground");
        if (this.H || this.G) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w(), "startIfForeground, not in foregound");
            return false;
        }
        L(new java.lang.Runnable() { // from class: wf.b$$d
            @Override // java.lang.Runnable
            public final void run() {
                wf.b bVar = wf.b.this;
                if (bVar.f526951i != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(bVar.w(), "startIfForeground, do start");
                    bVar.f526951i.n(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, null);
                    bVar.B(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27);
                }
            }
        });
        return true;
    }

    @Override // eg.b
    public void p(android.graphics.SurfaceTexture surfaceTexture) {
        i(new android.view.Surface(surfaceTexture));
    }

    public final void s() {
        if (this.f526957q == 0 || this.f526958r == 0 || this.f526951i == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w(), "adjustHtmlSize, size:[%d, %d]", java.lang.Integer.valueOf(this.f526957q), java.lang.Integer.valueOf(this.f526958r));
        if (this.L.a(this.f526955p) && this.H) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w(), "adjustHtmlSize, i am pip player, isWebViewInBackground");
            return;
        }
        ((wf.r) this.f526951i).mo173673x1c9cdc8c(this.f526957q, this.f526958r);
    }

    public final boolean t() {
        sf.f fVar = this.f526955p;
        if (fVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(w(), "amIBackgroundAudioPlayer, mInsertInvokeContext is null");
            return false;
        }
        tf1.f a17 = tf.k.a(fVar);
        if (a17 != null) {
            return a17.a(this);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(w(), "amIBackgroundAudioPlayer, audioOfVideoBackgroundPlayManager is null");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(sf.f r4, boolean r5) {
        /*
            r3 = this;
            r3.w()
            boolean r0 = r3.R
            if (r0 == 0) goto L16
            java.lang.String r5 = r3.w()
            java.lang.String r0 = "disableBackgroundPlayAudio, mIsRTCMode"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r5, r0)
            jc1.d r5 = jc1.g.f380472k
            r4.a(r5)
            return
        L16:
            r3.w()
            r0 = 1
            r1 = 0
            if (r4 != 0) goto L28
            java.lang.String r5 = r3.w()
            java.lang.String r2 = "disableBackgroundPlayAudioInternal, invokeContext is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r5, r2)
        L26:
            r5 = r1
            goto L3c
        L28:
            tf1.f r2 = tf.k.a(r4)
            if (r2 != 0) goto L38
            java.lang.String r5 = r3.w()
            java.lang.String r2 = "disableBackgroundPlayAudio, audioOfVideoBackgroundPlayManager is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r5, r2)
            goto L26
        L38:
            r2.c(r3, r5)
            r5 = r0
        L3c:
            if (r5 == 0) goto L42
            r3.A(r1, r0)
            goto L43
        L42:
            r0 = r1
        L43:
            java.lang.String r5 = r3.w()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "disableBackgroundPlayAudio, result:%s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r2, r1)
            if (r0 == 0) goto L59
            jc1.d r5 = jc1.f.f380445a
            goto L5b
        L59:
            jc1.d r5 = jc1.f.f380448d
        L5b:
            r4.a(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wf.b.u(sf.f, boolean):void");
    }

    public java.lang.String v() {
        return q() + "@" + hashCode();
    }

    public final java.lang.String w() {
        return java.lang.String.format("%s(%s)", "MicroMsg.SameLayer.LivePlayerPluginHandler", q());
    }

    public final void x(tf.m mVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w(), "getSnapshotAsync");
        if (this.f526951i == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(w(), "getSnapshotAsync, mAdapter is null");
            mVar.a(null);
        } else {
            this.Y = mVar;
            this.f526951i.l(true, new wf.f(this));
        }
    }

    public final boolean y() {
        wf.a aVar = this.f526951i;
        return aVar != null && aVar.mo173670x7b1f9e61();
    }

    public final boolean z() {
        wf.a aVar = this.f526951i;
        return aVar != null && aVar.mo173671xc00617a4();
    }
}

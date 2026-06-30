package tf1;

/* loaded from: classes7.dex */
public class f extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.g1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f500391d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f500392e;

    /* renamed from: f, reason: collision with root package name */
    public final tf1.i f500393f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f500394g;

    /* renamed from: h, reason: collision with root package name */
    public volatile tf1.e f500395h = null;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f500396i = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f500397m = true;

    /* renamed from: n, reason: collision with root package name */
    public volatile tf.q f500398n = null;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Object f500399o = new java.lang.Object();

    /* renamed from: p, reason: collision with root package name */
    public boolean f500400p = false;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Set f500401q = new java.util.HashSet(8);

    /* renamed from: r, reason: collision with root package name */
    public boolean f500402r = true;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Map f500403s = new android.util.ArrayMap();

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f500404t = new java.util.ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final java.util.List f500405u = new java.util.ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public final java.util.LinkedList f500406v = new java.util.LinkedList();

    /* renamed from: w, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f500407w = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: x, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f500408x = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: y, reason: collision with root package name */
    public android.view.Surface f500409y = null;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        this.f500391d = c11510xdd90c2f2;
        java.lang.String str = c11510xdd90c2f2.f156336n;
        this.f500392e = str;
        this.f500393f = new tf1.i(this);
        this.f500394g = !c11510xdd90c2f2.V;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.a(str, new tf1.a(this));
    }

    public final void A(tf.q qVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "playVideo, videoPlayer:" + qVar.mo10361xfb82e301());
        tf.u uVar = (tf.u) qVar.h(tf.u.class);
        if (uVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "playVideo, videoPlayerAddOnPlayAudio is null");
        } else {
            uVar.h();
            n(qVar);
        }
    }

    public boolean a(tf.q qVar) {
        boolean z17;
        boolean z18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "amIBackgroundAudioPlayer, videoPlayer: " + qVar.mo10361xfb82e301() + ", pauseType: " + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.d(this.f500392e));
        synchronized (this.f500399o) {
            z17 = false;
            z18 = !this.f500406v.isEmpty() && qVar == this.f500406v.getFirst();
        }
        if (z18 && this.f500408x.getAndSet(false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "amIBackgroundAudioPlayer, ignore");
        } else {
            z17 = z18;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "amIBackgroundAudioPlayer, amIBackgroundAudioPlayer: " + z17);
        return z17;
    }

    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "disableAppBrandBackgroundRun");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1128x6f7d720f.p1129x32b0ec.C12295xd16fc59e c12295xd16fc59e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1128x6f7d720f.p1129x32b0ec.C12295xd16fc59e();
        java.lang.String str = this.f500392e;
        xf1.a aVar = c12295xd16fc59e.f165456g;
        aVar.f535755a = str;
        aVar.f535756b = 64;
        aVar.f535757c = 2;
        c12295xd16fc59e.e();
    }

    public void c(tf.q qVar, boolean z17) {
        boolean z18;
        boolean z19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "disableBackgroundPlayAudio, videoPlayer:" + qVar.mo10361xfb82e301() + ", isExitBackgroundPlay: " + z17);
        synchronized (this.f500399o) {
            ((android.util.ArrayMap) this.f500403s).remove(qVar);
            tf.q g17 = g();
            if (!this.f500406v.contains(qVar) && g17 != qVar) {
                ((java.util.ArrayList) this.f500404t).remove(qVar);
                z19 = false;
                z18 = false;
            }
            if (!this.f500394g) {
                this.f500406v.remove(qVar);
            }
            z18 = true;
            if (g17 == qVar) {
                z19 = false;
            } else {
                z19 = true;
                z18 = false;
            }
        }
        if (z18) {
            x();
            if (!this.f500394g) {
                b();
                this.f500398n = null;
            }
            this.f500393f.a();
        }
        if (z17) {
            this.f500400p = false;
            ((java.util.HashSet) this.f500401q).clear();
        }
        if (!z19 || this.f500394g) {
            return;
        }
        A(qVar);
    }

    public final void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "enableAppBrandBackgroundRun");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1128x6f7d720f.p1129x32b0ec.C12295xd16fc59e c12295xd16fc59e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1128x6f7d720f.p1129x32b0ec.C12295xd16fc59e();
        java.lang.String str = this.f500392e;
        xf1.a aVar = c12295xd16fc59e.f165456g;
        aVar.f535755a = str;
        aVar.f535756b = 64;
        aVar.f535757c = 1;
        c12295xd16fc59e.e();
        r(true);
    }

    public boolean e(tf.q qVar) {
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "enableBackgroundPlayAudio, videoPlayer: %s", qVar.mo10361xfb82e301());
        if (this.f500394g && !this.f500400p) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "enableBackgroundPlayAudio, current is in background and not enable float ball");
            return true;
        }
        this.f500400p = true;
        synchronized (this.f500399o) {
            ((java.util.HashSet) this.f500401q).add(qVar);
            ((android.util.ArrayMap) this.f500403s).put(qVar, java.lang.Boolean.TRUE);
            if (((java.util.ArrayList) this.f500405u).contains(qVar)) {
                ((java.util.ArrayList) this.f500405u).remove(qVar);
                this.f500406v.remove(qVar);
                this.f500406v.addFirst(qVar);
                tf.v vVar = (tf.v) qVar.h(tf.v.class);
                z17 = vVar != null ? vVar.mo10363xc00617a4() : true;
            } else {
                ((java.util.ArrayList) this.f500404t).remove(qVar);
                ((java.util.ArrayList) this.f500404t).add(qVar);
                z17 = false;
            }
        }
        if (z17) {
            z(qVar);
        }
        return true;
    }

    public void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "exitBackgroundPlay");
        this.f500400p = false;
        tf.q g17 = g();
        if (g17 != null && !this.f500406v.isEmpty() && g17 == this.f500406v.getFirst()) {
            this.f500406v.removeFirst();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "remove background player success");
        }
        ((java.util.HashSet) this.f500401q).clear();
        tf1.e eVar = this.f500395h;
        if (eVar != null) {
            eVar.d();
        }
        java.util.Iterator it = new java.util.ArrayList(this.f500396i).iterator();
        while (it.hasNext()) {
            ((tf1.e) it.next()).d();
        }
    }

    public tf.q g() {
        tf.q qVar = this.f500398n;
        if (qVar == null || !this.f500408x.get()) {
            return qVar;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "getBackgroundAudioPlayer, ignore");
        return null;
    }

    public java.lang.String h() {
        tf.q g17 = g();
        if (g17 == null) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "getPosterPath, videoPlayer:" + g17.mo10361xfb82e301());
        tf.t tVar = (tf.t) g17.h(tf.t.class);
        if (tVar != null) {
            return tVar.e();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "getPosterPath, playerAddOnInfo is null");
        return null;
    }

    public java.lang.String i() {
        tf.q g17 = g();
        if (g17 == null) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "getTitle, videoPlayer:" + g17.mo10361xfb82e301());
        tf.t tVar = (tf.t) g17.h(tf.t.class);
        if (tVar != null) {
            return tVar.mo10366x7531c8a2();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "getTitle, playerAddOnInfo is null");
        return null;
    }

    public float j() {
        tf.q g17 = g();
        if (g17 == null) {
            return 1.0f;
        }
        tf.v vVar = (tf.v) g17.h(tf.v.class);
        if (vVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "getVideoAspectRatio, playerAddOnVideoController is null");
            return 1.0f;
        }
        float b17 = vVar.b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "ljd getVideoAspectRatio aspectRatio:%f", java.lang.Float.valueOf(b17));
        return b17;
    }

    public void k(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "ignoreRuntimeResumePauseOnce, ignoreBackgroundAudioPlayer: " + z17);
        this.f500407w.set(true);
        this.f500408x.set(z17);
    }

    public boolean l() {
        tf.q g17 = g();
        if (g17 == null) {
            return true;
        }
        tf.v vVar = (tf.v) g17.h(tf.v.class);
        if (vVar != null) {
            return vVar.mo10363xc00617a4();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "startPlay, playerAddOnVideoController is null");
        return true;
    }

    public void m(tf.q qVar, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "markVideoPlayPauseOrStop, videoPlayer:" + qVar.mo10361xfb82e301());
        synchronized (this.f500399o) {
            if (z17) {
                if (this.f500406v.contains(qVar)) {
                    this.f500406v.remove(qVar);
                    if (this.f500400p) {
                        ((java.util.ArrayList) this.f500404t).add(qVar);
                    }
                } else {
                    ((java.util.ArrayList) this.f500405u).remove(qVar);
                }
            } else if (this.f500400p) {
                ((java.util.ArrayList) this.f500404t).add(qVar);
            }
        }
        if (g() == qVar) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "markVideoPlayPauseOrStop, disableAppBrandBackgroundRun");
            if (this.f500397m) {
                return;
            }
            this.f500393f.a();
        }
    }

    public void n(tf.q qVar) {
        boolean z17;
        boolean z18;
        tf.v vVar;
        java.lang.Boolean bool;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "markVideoPlayStart, videoPlayer:" + qVar.mo10361xfb82e301());
        synchronized (this.f500399o) {
            z17 = false;
            if (((java.util.ArrayList) this.f500404t).contains(qVar)) {
                ((java.util.ArrayList) this.f500404t).remove(qVar);
                this.f500406v.remove(qVar);
                this.f500406v.addFirst(qVar);
                z18 = true;
            } else {
                ((java.util.ArrayList) this.f500405u).remove(qVar);
                ((java.util.ArrayList) this.f500405u).add(qVar);
                z18 = false;
            }
        }
        if (this.f500394g && z18) {
            synchronized (this.f500399o) {
                bool = (java.lang.Boolean) ((android.util.ArrayMap) this.f500403s).get(qVar);
            }
            if (bool != null && bool.booleanValue()) {
                z17 = true;
            }
            if (z17) {
                z(qVar);
            }
        }
        boolean z19 = this.f500400p;
        if (this.f500394g && g() != null && !z19) {
            d();
        }
        if (this.f500394g) {
            tf.v vVar2 = (tf.v) qVar.h(tf.v.class);
            if (vVar2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "markVideoPlayStart, playerAddOnVideoController is null");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "ljd markVideoPlayStart onSetPlaybackSurface");
            tf.q qVar2 = this.f500398n;
            if (qVar2 != qVar && qVar2 != null && (vVar = (tf.v) qVar2.h(tf.v.class)) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "ljd markVideoPlayStart set prePlayer surface null");
                vVar.a(null);
                vVar.i();
            }
            if (this.f500409y != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "ljd markVideoPlayStart set current player surface");
                vVar2.a(this.f500409y);
            }
            this.f500398n = qVar;
            r(true);
        }
    }

    public void o(tf.q qVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "markVideoPlayerRelease, videoPlayer:" + qVar.mo10361xfb82e301());
        synchronized (this.f500399o) {
            ((java.util.ArrayList) this.f500404t).remove(qVar);
            ((java.util.ArrayList) this.f500405u).remove(qVar);
            this.f500406v.remove(qVar);
        }
        if (g() == qVar) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "markVideoPlayerRelease, disableAppBrandBackgroundRun");
            b();
            if (this.f500397m) {
                return;
            }
            this.f500393f.a();
            this.f500398n = null;
        }
    }

    public final void p() {
        tf1.e eVar = this.f500395h;
        if (eVar != null) {
            eVar.e();
        }
        java.util.Iterator it = new java.util.ArrayList(this.f500396i).iterator();
        while (it.hasNext()) {
            ((tf1.e) it.next()).e();
        }
    }

    public final void q() {
        tf1.e eVar = this.f500395h;
        if (eVar != null) {
            eVar.b();
        }
        java.util.Iterator it = new java.util.ArrayList(this.f500396i).iterator();
        while (it.hasNext()) {
            ((tf1.e) it.next()).b();
        }
    }

    public void r(boolean z17) {
        tf.q g17 = g();
        if (g17 == null) {
            return;
        }
        tf.v vVar = (tf.v) g17.h(tf.v.class);
        if (vVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "onBackgroundPlaybackChange, playerAddOnVideoController is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "onBackgroundPlaybackChange playInBackground:%b", java.lang.Boolean.valueOf(z17));
        vVar.f(z17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new tf1.d(this), 1000L);
    }

    public void s(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0 w0Var) {
        java.lang.String wi6;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "onRuntimeBackground, pauseType: " + w0Var);
        this.f500394g = true;
        tf.q g17 = g();
        if (g17 != null) {
            q();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "onRuntimeBackground, backgroundAudioPlayer: " + g17.mo10361xfb82e301());
            return;
        }
        synchronized (this.f500399o) {
            if (!this.f500406v.isEmpty()) {
                g17 = (tf.q) this.f500406v.getFirst();
            }
            if (g17 == null && this.f500400p && !((java.util.ArrayList) this.f500404t).isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "onRuntimeBackground, has BackgroundAudioPlayEnabledPlayers");
                g17 = (tf.q) ((java.util.ArrayList) this.f500404t).get(0);
            }
            if (g17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "onRuntimeBackground, backgroundAudioPlayer is null");
                return;
            }
            this.f500398n = g17;
            bg1.v vVar = (bg1.v) this.f500391d.k(bg1.v.class);
            if (vVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "getBanBackgroundRunHint, helper is null");
                wi6 = null;
            } else {
                wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t0) vVar).wi(this.f500391d.f156336n, this.f500391d.f156338p.f158814g);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "getBanBackgroundRunHint, banHint: ", wi6);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wi6)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "onRuntimeBackground, ban");
                x();
                ((ku5.t0) ku5.t0.f394148d).B(new tf1.b(this, wi6));
                return;
            }
            this.f500397m = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "isEnableFloatBall:%b", java.lang.Boolean.valueOf(this.f500400p));
            if (!this.f500400p) {
                x();
                return;
            }
            if (l()) {
                if (z(g17)) {
                    this.f500393f.f500416b.mo51100x4c4bb389();
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "playAudio fail");
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "onRuntimeBackground, enableAppBrandBackgroundRun");
            d();
        }
    }

    public void t(android.view.Surface surface) {
        tf.q g17 = g();
        if (g17 == null) {
            return;
        }
        tf.v vVar = (tf.v) g17.h(tf.v.class);
        if (vVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "onSetPlaybackSurface, playerAddOnVideoController is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "ljd onSetPlaybackSurface surface:%d", java.lang.Integer.valueOf(surface.hashCode()));
        vVar.a(surface);
        this.f500409y = surface;
    }

    public void u(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "pauseBackgroundAudioPlay");
        tf.q g17 = g();
        if (g17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "pauseBackgroundAudioPlay, mBackgroundAudioPlayer is null");
        } else if (v(g17, str)) {
            this.f500397m = true;
            p();
        }
    }

    public final boolean v(tf.q qVar, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "pausePlay, videoPlayer:" + qVar.mo10361xfb82e301());
        tf.v vVar = (tf.v) qVar.h(tf.v.class);
        if (vVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "pausePlay, playerAddOnVideoController is null");
            return false;
        }
        if (str == null) {
            vVar.mo10364x65825f6();
            return true;
        }
        vVar.c(str);
        return true;
    }

    public void w(java.lang.String str) {
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "startBackgroundAudioPlay");
        tf.q g17 = g();
        if (g17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "startBackgroundAudioPlay, backgroundAudioPlayer is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "startPlay, videoPlayer:" + g17.mo10361xfb82e301());
        tf.v vVar = (tf.v) g17.h(tf.v.class);
        if (vVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "startPlay, playerAddOnVideoController is null");
            z17 = false;
        } else {
            if (str == null) {
                vVar.mo10365x68ac462();
            } else {
                vVar.c(str);
            }
            z17 = true;
        }
        if (z17) {
            this.f500397m = false;
            this.f500393f.f500416b.mo51100x4c4bb389();
            tf1.e eVar = this.f500395h;
            if (eVar != null) {
                eVar.a();
            }
            java.util.Iterator it = new java.util.ArrayList(this.f500396i).iterator();
            while (it.hasNext()) {
                ((tf1.e) it.next()).a();
            }
        }
        this.f500402r = true;
    }

    public void x() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "stopBackgroundAudioPlay");
        tf.q g17 = g();
        if (g17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "stopBackgroundAudioPlay, backgroundAudioPlayer is null");
            return;
        }
        if (v(g17, null)) {
            this.f500397m = false;
            this.f500393f.a();
        }
        p();
    }

    public final boolean z(tf.q qVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "playAudio, videoPlayer:" + qVar.mo10361xfb82e301());
        tf.u uVar = (tf.u) qVar.h(tf.u.class);
        if (uVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "playAudio, videoPlayerAddOnPlayAudio is null");
            return false;
        }
        uVar.j();
        n(qVar);
        return true;
    }
}

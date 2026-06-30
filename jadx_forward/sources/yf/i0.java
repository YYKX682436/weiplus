package yf;

/* loaded from: classes7.dex */
public class i0 extends eg.a implements tf.w, p012xc85e97e9.p093xedfae76a.y {
    public static ag.f T = ag.b.f86200g;
    public static boolean U = true;
    public static final tf.n V = tf.f0.b(tf.g0.f500343f);
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.h4 B;
    public final tf.o D;
    public final qu5.a E;
    public volatile boolean I;

    /* renamed from: J, reason: collision with root package name */
    public volatile boolean f542892J;

    /* renamed from: g, reason: collision with root package name */
    public final ag.g f542893g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.Surface f542894h;

    /* renamed from: i, reason: collision with root package name */
    public yf.o f542895i;

    /* renamed from: m, reason: collision with root package name */
    public zf.e f542896m;

    /* renamed from: n, reason: collision with root package name */
    public zf.d f542897n;

    /* renamed from: o, reason: collision with root package name */
    public zf.c f542898o;

    /* renamed from: p, reason: collision with root package name */
    public sf.f f542899p;

    /* renamed from: q, reason: collision with root package name */
    public int f542900q;

    /* renamed from: r, reason: collision with root package name */
    public int f542901r;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f542903t;

    /* renamed from: u, reason: collision with root package name */
    public int f542904u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f542905v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f542906w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.ScaleGestureDetector f542907x;

    /* renamed from: z, reason: collision with root package name */
    public final android.os.Handler f542909z;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f542902s = "";

    /* renamed from: y, reason: collision with root package name */
    public final yf.e1 f542908y = new yf.e1(this, null);
    public int A = 0;
    public final yf.c1 C = new yf.c1(this);
    public final p012xc85e97e9.p093xedfae76a.b0 F = new p012xc85e97e9.p093xedfae76a.b0(this, true);
    public volatile boolean G = false;
    public boolean H = false;
    public volatile sf.f K = null;
    public final android.view.ScaleGestureDetector.OnScaleGestureListener L = new yf.q0(this);
    public final android.view.ScaleGestureDetector.OnScaleGestureListener M = new yf.r0(this);
    public volatile boolean N = false;
    public java.lang.String P = "";
    public int Q = 0;
    public int R = 0;
    public final tf.d S = new yf.s0(this);

    public i0() {
        ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: yf.i0$$k
            @Override // java.lang.Runnable
            public final void run() {
                yf.i0.this.F.i(p012xc85e97e9.p093xedfae76a.n.STARTED);
            }
        });
        tf.o a17 = ((tf.f0) V).a();
        this.D = a17;
        a17.mo166400x68ac462();
        this.E = a17.mo166399x67189314();
        android.os.Handler handler = new android.os.Handler(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getMainLooper());
        this.f542909z = handler;
        sc1.m1.a();
        yf.n1 n1Var = new yf.n1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        this.f542895i = n1Var;
        n1Var.mo164243x4e5bab70(new yf.t0(this));
        this.f542895i.j(new yf.u0(this));
        this.f542895i.l(new yf.v0(this));
        this.f542893g = T.a(this, this.f542895i);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.h4 h4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.h4(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, new yf.w0(this));
        this.B = h4Var;
        h4Var.enable();
        z(y());
        handler.post(new java.lang.Runnable() { // from class: yf.i0$$l
            @Override // java.lang.Runnable
            public final void run() {
                yf.i0 i0Var = yf.i0.this;
                i0Var.getClass();
                i0Var.f542907x = new android.view.ScaleGestureDetector(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, yf.i0.U ? i0Var.M : i0Var.L);
            }
        });
    }

    public final void A(float f17, float f18) {
        yf.o oVar = this.f542895i;
        if (oVar != null) {
            sc1.k1 mo176946xb39e1cdf = oVar.mo176946xb39e1cdf(f17, f18);
            this.f542893g.j().m(new android.graphics.PointF(f17, f18));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x(), "onTouchFocusPosition, set focus(%s, %s), code:%d, info:%s", java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18), java.lang.Integer.valueOf(mo176946xb39e1cdf.f487221a), mo176946xb39e1cdf.f487222b);
        }
    }

    public final void B(org.json.JSONObject jSONObject) {
        if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15515x140e67ac)) {
            this.f542902s = jSONObject.optString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15515x140e67ac, this.f542902s);
            this.f542903t = jSONObject.optString("filterImageMd5", null);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f542902s)) {
                try {
                    jSONObject.put(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15515x140e67ac, "");
                    return;
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(x(), "parseFilterImage, ignore exception:%s", e17);
                    return;
                }
            }
            if (this.f542902s.startsWith("http://") || this.f542902s.startsWith("https://")) {
                jSONObject.remove(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15515x140e67ac);
            }
        }
    }

    public final void C(org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject;
        if (!jSONObject.has("position") || (optJSONObject = jSONObject.optJSONObject("position")) == null) {
            return;
        }
        this.f542900q = ik1.w.c(optJSONObject.optInt("width", 0));
        this.f542901r = ik1.w.c(optJSONObject.optInt("height", 0));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x(), "parseHtmlPosition, size:[%d, %d]", java.lang.Integer.valueOf(this.f542900q), java.lang.Integer.valueOf(this.f542901r));
        r();
    }

    public final void D(sf.f fVar, org.json.JSONObject jSONObject) {
        if (jSONObject.has("needEvent")) {
            jSONObject.optBoolean("needEvent", false);
            if (H()) {
                bg1.q qVar = (bg1.q) this.f542897n;
                qVar.getClass();
                if (fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b) {
                    qVar.f101435a = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b) fVar;
                }
            }
        }
    }

    public final void E() {
        this.G = true;
        ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: yf.i0$$m
            @Override // java.lang.Runnable
            public final void run() {
                yf.i0.this.F.i(p012xc85e97e9.p093xedfae76a.n.DESTROYED);
            }
        });
        zf.c cVar = this.f542898o;
        if (cVar != null) {
            ((bg1.h) cVar).f(this, this.f542899p);
            bg1.h hVar = (bg1.h) this.f542898o;
            xf1.i d17 = hVar.d(this.f542899p);
            if (d17 != null && d17.f535772f == this) {
                d17.f535772f = null;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d17.f535770d, "unregisterLivePusher:%s", g());
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "clearVoipPageBackgroundButNotPipState");
            hVar.f101426d = false;
        }
        yf.o oVar = this.f542895i;
        if (oVar != null) {
            ((yf.n1) oVar).k();
            this.f542895i = null;
        }
        if (this.f542894h != null) {
            this.f542893g.k();
            this.f542894h.release();
            this.f542894h = null;
        }
        sf.f fVar = this.f542899p;
        if (fVar != null) {
            fVar.f();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x(), "LivePusher release handler thread");
        this.E.mo50302x6b17ad39(null);
        this.D.a();
        gg.c cVar2 = this.f334032f;
        if (cVar2 == null) {
            return;
        }
        ((gg.a) cVar2).i(this.f334031e, this.f334030d);
    }

    public final void F(int i17) {
        if (this.f542896m != null) {
            ((ch1.c) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a.class, true))).c(976L, i17, 1L, false);
        }
    }

    public final void G(java.lang.Runnable runnable) {
        this.E.mo50293x3498a0(runnable);
    }

    public final boolean H() {
        return this.f542897n != null;
    }

    @Override // eg.b
    public boolean b(sf.f fVar) {
        return true;
    }

    @Override // eg.a, eg.b
    public void c(final android.view.MotionEvent motionEvent) {
        G(new java.lang.Runnable() { // from class: yf.i0$$h
            @Override // java.lang.Runnable
            public final void run() {
                android.view.ScaleGestureDetector scaleGestureDetector;
                yf.i0 i0Var = yf.i0.this;
                java.lang.String x17 = i0Var.x();
                java.lang.String q17 = i0Var.q();
                android.view.MotionEvent motionEvent2 = motionEvent;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x17, "*** handler(%s) handlePluginTouch(%s)", q17, motionEvent2);
                if (i0Var.f542905v || i0Var.f542906w) {
                    int pointerCount = motionEvent2.getPointerCount();
                    yf.e1 e1Var = i0Var.f542908y;
                    if (pointerCount == 1 && motionEvent2.getAction() == 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.x(), "handlePluginTouch, 1 pointer action down");
                        e1Var.f542873d = motionEvent2;
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(e1Var, 100L);
                    } else {
                        if (motionEvent2.getPointerCount() <= 1 || motionEvent2.getAction() != 2) {
                            return;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.x(), "handlePluginTouch, 2 pointer action move");
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(e1Var);
                        i0Var.A(-1.0f, -1.0f);
                        if (!i0Var.f542906w || (scaleGestureDetector = i0Var.f542907x) == null) {
                            return;
                        }
                        scaleGestureDetector.onTouchEvent(motionEvent2);
                    }
                }
            }
        });
    }

    @Override // eg.a, eg.b
    public void e() {
        G(new java.lang.Runnable() { // from class: yf.i0$$j
            @Override // java.lang.Runnable
            public final void run() {
                yf.i0 i0Var = yf.i0.this;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.x(), "*** handler(%s) handlePluginDestroy", i0Var.q());
            }
        });
    }

    @Override // eg.b
    public java.lang.String f(final sf.f fVar) {
        if (this.f542893g.d(fVar)) {
            return null;
        }
        G(new java.lang.Runnable() { // from class: yf.i0$$a
            @Override // java.lang.Runnable
            public final void run() {
                java.lang.String[] strArr;
                java.lang.String[] strArr2;
                java.lang.String[] strArr3;
                int length;
                zf.c cVar;
                yf.i0 i0Var = yf.i0.this;
                sf.f fVar2 = fVar;
                i0Var.getClass();
                java.lang.String l17 = fVar2.l();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l17)) {
                    return;
                }
                org.json.JSONObject c17 = fVar2.c();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.x(), "*** handler(%s) handleJsApi(%s), data:%s", i0Var.q(), l17, c17.toString());
                c17.toString();
                if (fVar2.m().q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q2.class) != null && ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q2) fVar2.m().q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q2.class)).g4()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.LivePusherPluginHandler", "wx assistant is enabled");
                    fVar2.g("fail");
                    return;
                }
                boolean contains = l17.contains("insert");
                jc1.d dVar = jc1.f.f380448d;
                if (contains) {
                    i0Var.F(5);
                    i0Var.f542893g.f(fVar2);
                    android.content.Context mo50272x76847179 = fVar2.mo50272x76847179();
                    if (mo50272x76847179 instanceof android.app.Activity) {
                        i0Var.f542904u = 0;
                        i0Var.v((android.app.Activity) mo50272x76847179, fVar2);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SameLayer.LivePusherPluginHandler", "invokeInsertAfterRequestPermission, pageContext not activity");
                        fVar2.d("fail:internal error invalid android context", dVar);
                        si1.e1.c(fVar2.mo50271x74292566());
                    }
                } else {
                    boolean contains2 = l17.contains("update");
                    jc1.d dVar2 = jc1.f.f380445a;
                    boolean z17 = true;
                    if (contains2) {
                        i0Var.F(6);
                        i0Var.f542893g.l(fVar2);
                        if (i0Var.f542895i == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.x(), "update, adapter is null");
                        } else {
                            org.json.JSONObject c18 = fVar2.c();
                            i0Var.D(fVar2, c18);
                            i0Var.C(c18);
                            if (c18.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15516x6a3cecc2)) {
                                i0Var.f542905v = c18.optInt(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15516x6a3cecc2, 0) != 0;
                            }
                            if (c18.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15537x4680a1cb)) {
                                i0Var.f542906w = c18.optBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15537x4680a1cb, false);
                            }
                            i0Var.B(c18);
                            android.os.Bundle b17 = vf.a.b(c18);
                            if (i0Var.I) {
                                i0Var.f542892J = !b17.getBoolean("muted", false);
                                b17.putBoolean("muted", true);
                            }
                            sc1.k1 g17 = ((yf.n1) i0Var.f542895i).g(b17);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.x(), "update, code:%d info:%s", java.lang.Integer.valueOf(g17.f487221a), g17.f487222b);
                            if (g17.f487221a == 0) {
                                dVar = dVar2;
                            }
                            fVar2.b(dVar, g17.f487223c);
                            i0Var.s(fVar2);
                            i0Var.t(fVar2);
                            if (g17.f487221a == 0 && (cVar = i0Var.f542898o) != null) {
                                ((bg1.h) cVar).g(i0Var, i0Var.f542899p, b17);
                                zf.c cVar2 = i0Var.f542898o;
                                sf.f fVar3 = i0Var.f542899p;
                                bg1.h hVar = (bg1.h) cVar2;
                                hVar.f101423a = b17.getBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15514x177e2563, hVar.f101423a);
                                hVar.f101424b = b17.getBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15512xcf452269, hVar.f101424b);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "updateForBackgroundVOIPIfNeed enableMic:%b, enableCamera:%b", java.lang.Boolean.valueOf(hVar.f101423a), java.lang.Boolean.valueOf(hVar.f101424b));
                                hVar.a();
                                xf1.i d17 = hVar.d(fVar3);
                                if (d17 != null) {
                                    d17.b(tf1.h.a(fVar3), hVar.f101423a);
                                }
                            }
                        }
                    } else if (l17.contains("operate")) {
                        i0Var.F(7);
                        if (i0Var.f542895i == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.x(), "operate, adapter is null");
                        } else {
                            org.json.JSONObject c19 = fVar2.c();
                            java.lang.String optString = c19.optString("type");
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.x(), "operate, type:%s", optString);
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                                fVar2.d("fail:missing operateType", dVar);
                            } else if (i0Var.f542895i == null) {
                                fVar2.a(dVar);
                            } else if (optString.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j0.f159978f)) {
                                ((yf.n1) i0Var.f542895i).e(new yf.k0(i0Var, fVar2));
                                sc1.k1 h17 = ((yf.n1) i0Var.f542895i).h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j0.f159978f, fVar2.c());
                                if (h17.f487221a != 0) {
                                    fVar2.b(dVar, h17.f487223c);
                                }
                            } else if (optString.equals("snapshotView")) {
                                if (i0Var.f542895i == null) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(i0Var.x(), "operateSnapshotView, adapter is null");
                                    fVar2.a(dVar);
                                } else {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.x(), "takeScreenshot");
                                    i0Var.K = fVar2;
                                    sf.i.b(i0Var.f334032f, i0Var.f334031e, i0Var.f334030d);
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.x(), "operateSnapshotView, success");
                                }
                            } else if (optString.equalsIgnoreCase("exitPictureInPicture")) {
                                i0Var.S.b(fVar2);
                            } else {
                                boolean equals = optString.equals("playBGM");
                                jc1.d dVar3 = jc1.f.f380452h;
                                if (equals) {
                                    zf.c cVar3 = i0Var.f542898o;
                                    if (cVar3 != null) {
                                        yf.l0 l0Var = new yf.l0(i0Var, c19);
                                        bg1.h hVar2 = (bg1.h) cVar3;
                                        if (fVar2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b) {
                                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b bVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b) fVar2;
                                            org.json.JSONObject c27 = bVar.c();
                                            java.lang.String optString2 = c27.has("url") ? c27.optString("url") : null;
                                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "operatePlayBgm, url is nil");
                                                fVar2.d("fail:url is nil", dVar3);
                                            } else {
                                                xf1.f.e(bVar.m(), optString2, false, null, new bg1.f(hVar2, l0Var, optString2));
                                            }
                                        }
                                        fVar2.a(dVar2);
                                    } else {
                                        fVar2.a(dVar);
                                    }
                                } else {
                                    if (!optString.equalsIgnoreCase("applyFilter") && !optString.equalsIgnoreCase("applySticker") && !optString.equalsIgnoreCase("applyMakeup")) {
                                        z17 = false;
                                    }
                                    if (!z17) {
                                        sc1.k1 h18 = ((yf.n1) i0Var.f542895i).h(optString, c19);
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.x(), "operate, type:%s, error:[%s, %s]", optString, java.lang.Integer.valueOf(h18.f487221a), h18.f487222b);
                                        if (h18.f487221a == 0) {
                                            dVar = dVar2;
                                        }
                                        fVar2.b(dVar, h18.f487223c);
                                        if (optString.equalsIgnoreCase("stop") && h18.f487221a == 0) {
                                            i0Var.S.k(fVar2);
                                            zf.c cVar4 = i0Var.f542898o;
                                            if (cVar4 != null) {
                                                ((bg1.h) cVar4).f(i0Var, i0Var.f542899p);
                                            }
                                        }
                                    } else if (i0Var.f542898o == null) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(i0Var.x(), "convertResourcePathAndOperateLivePusher, customHandler is null");
                                        fVar2.a(dVar);
                                    } else {
                                        boolean equalsIgnoreCase = optString.equalsIgnoreCase("applyFilter");
                                        java.lang.String str = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714;
                                        if (equalsIgnoreCase) {
                                            java.lang.String optString3 = c19.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, null);
                                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString3)) {
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.x(), "convertResourcePathAndOperateLivePusher, resourcePath is empty");
                                            } else {
                                                ((bg1.h) i0Var.f542898o).c(fVar2, optString3, c19.optString("md5", null), optString.equalsIgnoreCase("applySticker"), new yf.y0(i0Var, c19, fVar2, optString));
                                            }
                                        } else {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.x(), "convertResourcePathWorkaroundAndOperateLivePusher");
                                            if (optString.equalsIgnoreCase("applySticker")) {
                                                org.json.JSONArray optJSONArray = c19.optJSONArray("stickers");
                                                if (optJSONArray == null || (length = optJSONArray.length()) == 0) {
                                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(i0Var.x(), "convertResourcePathWorkaroundAndOperateLivePusher, stickersJsonArr is empty");
                                                    fVar2.d("fail:stickers is empty", dVar3);
                                                } else {
                                                    yf.d1 d1Var = new yf.d1(null);
                                                    d1Var.f542868a = length;
                                                    int i17 = 0;
                                                    while (true) {
                                                        if (i17 >= length) {
                                                            break;
                                                        }
                                                        org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
                                                        if (optJSONObject == null) {
                                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(i0Var.x(), "convertResourcePathWorkaroundAndOperateLivePusher1, stickerJsonObj(%d) is null", java.lang.Integer.valueOf(i17));
                                                            fVar2.d("fail:stickers is illegal", dVar3);
                                                            break;
                                                        }
                                                        java.lang.String optString4 = optJSONObject.optString(str, null);
                                                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString4)) {
                                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.x(), "convertResourcePathWorkaroundAndOperateLivePusher1, resourcePath(%d) is empty", java.lang.Integer.valueOf(i17));
                                                            fVar2.d("fail:stickers is illegal", dVar3);
                                                            break;
                                                        }
                                                        yf.d1 d1Var2 = d1Var;
                                                        ((bg1.h) i0Var.f542898o).c(fVar2, optString4, optJSONObject.optString("md5", null), true, new yf.z0(i0Var, i17, optJSONObject, fVar2, d1Var2, c19));
                                                        i17++;
                                                        str = str;
                                                        d1Var = d1Var2;
                                                        length = length;
                                                    }
                                                }
                                            } else if (optString.equalsIgnoreCase("applyMakeup")) {
                                                java.lang.String optString5 = c19.optString("makeupType", null);
                                                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString5)) {
                                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(i0Var.x(), "convertResourcePathWorkaroundAndOperateLivePusher2, makeupTypeStr is empty");
                                                    fVar2.d("fail:makeupType is empty", dVar3);
                                                } else {
                                                    org.json.JSONObject optJSONObject2 = c19.optJSONObject("makeup");
                                                    if (optJSONObject2 == null) {
                                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(i0Var.x(), "convertResourcePathWorkaroundAndOperateLivePusher2, makeupJsonObj is null");
                                                        fVar2.d("fail:makeup is null or undefined", dVar3);
                                                    } else if (optString5.equalsIgnoreCase("lipStick")) {
                                                        sc1.k1 h19 = ((yf.n1) i0Var.f542895i).h("applyMakeup", c19);
                                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.x(), "convertResourcePathWorkaroundAndOperateLivePusher2, type:applyMakeup, error:[%s, %s]", java.lang.Integer.valueOf(h19.f487221a), h19.f487222b);
                                                        if (h19.f487221a == 0) {
                                                            dVar = dVar2;
                                                        }
                                                        fVar2.b(dVar, h19.f487223c);
                                                    } else if (optString5.equalsIgnoreCase("eyeShadow")) {
                                                        java.lang.String optString6 = optJSONObject2.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, null);
                                                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString6)) {
                                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(i0Var.x(), "convertResourcePathWorkaroundAndOperateLivePusher2, path is empty");
                                                            fVar2.d("fail:path is empty", dVar3);
                                                        } else {
                                                            java.lang.String optString7 = optJSONObject2.optString("pathMd5", null);
                                                            java.lang.String optString8 = optJSONObject2.optString("shimmerPosition", null);
                                                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString8)) {
                                                                strArr = new java.lang.String[]{optString6};
                                                                strArr2 = new java.lang.String[]{optString7};
                                                                strArr3 = new java.lang.String[]{com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714};
                                                            } else {
                                                                strArr = new java.lang.String[]{optString6, optString8};
                                                                strArr2 = new java.lang.String[]{optString7, optJSONObject2.optString("shimmerPositionMD5", null)};
                                                                strArr3 = new java.lang.String[]{com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, "shimmerPosition"};
                                                            }
                                                            i0Var.u(strArr, strArr2, strArr3, optJSONObject2, fVar2, c19);
                                                        }
                                                    } else if (optString5.equalsIgnoreCase("blusherStick") || optString5.equalsIgnoreCase("faceContour") || optString5.equalsIgnoreCase("eyeBrow")) {
                                                        java.lang.String optString9 = optJSONObject2.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, null);
                                                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString9)) {
                                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(i0Var.x(), "convertResourcePathWorkaroundAndOperateLivePusher2, path is empty");
                                                            fVar2.d("fail:path is empty", dVar3);
                                                        } else {
                                                            i0Var.u(new java.lang.String[]{optString9}, new java.lang.String[]{optJSONObject2.optString("pathMd5", null)}, new java.lang.String[]{com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714}, optJSONObject2, fVar2, c19);
                                                        }
                                                    } else {
                                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(i0Var.x(), "convertResourcePathWorkaroundAndOperateLivePusher2, makeupTypeStr is illegal");
                                                        fVar2.d("fail:makeupType is illegal", dVar3);
                                                    }
                                                }
                                            } else {
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(i0Var.x(), "convertResourcePathWorkaroundAndOperateLivePusher, type is illegal");
                                                fVar2.a(dVar);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (l17.contains("remove")) {
                        i0Var.F(8);
                        i0Var.E();
                        fVar2.a(dVar2);
                        i0Var.S.k(fVar2);
                    }
                }
                if (i0Var.f542898o != null) {
                    org.json.JSONObject c28 = fVar2.c();
                    if (c28 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(i0Var.x(), "handleAutoPlay, dataJsonObj is null");
                    } else if (c28.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15504xe60534b2)) {
                        ((bg1.h) i0Var.f542898o).f101434l = c28.optBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15504xe60534b2, false);
                    }
                }
                org.json.JSONObject c29 = fVar2.c();
                if (c29 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(i0Var.x(), "handlePusherUrl, dataJsonObj is null");
                } else {
                    i0Var.P = c29.optString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15527x23c7cca2, i0Var.P);
                }
                i0Var.S.j(fVar2, i0Var.P);
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
        return this.F;
    }

    @Override // eg.a, eg.b
    public void i(final android.view.Surface surface) {
        G(new java.lang.Runnable() { // from class: yf.i0$$i
            @Override // java.lang.Runnable
            public final void run() {
                yf.i0 i0Var = yf.i0.this;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.x(), "*** handler(%s) handlePluginReady", i0Var.q());
                android.view.Surface surface2 = surface;
                i0Var.f542894h = surface2;
                yf.o oVar = i0Var.f542895i;
                if (oVar != null) {
                    oVar.mo176947x42c875eb(surface2);
                    i0Var.f542893g.h(surface2);
                    i0Var.r();
                }
            }
        });
    }

    @Override // eg.a, eg.b
    public void k(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x(), "*** handler(%s) handlePluginScreenshotTaken", q());
        sf.f fVar = this.K;
        if (fVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(x(), "handlePluginScreenshotTaken4JsApiCall, invokeContext is null");
            return;
        }
        this.K = null;
        zf.c cVar = this.f542898o;
        if (cVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(x(), "handlePluginScreenshotTaken4JsApiCall, customHandler is null");
        } else {
            ((bg1.h) cVar).e(fVar, bitmap);
        }
    }

    @Override // tf.w
    public void m() {
        G(new java.lang.Runnable() { // from class: yf.i0$$e
            @Override // java.lang.Runnable
            public final void run() {
                yf.i0 i0Var = yf.i0.this;
                yf.o oVar = i0Var.f542895i;
                if (oVar != null) {
                    ((yf.n1) oVar).h("stop", new org.json.JSONObject());
                    ((yf.n1) i0Var.f542895i).a();
                }
            }
        });
    }

    @Override // tf.w
    public boolean o() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x(), "startIfForeground");
        if (this.N) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x(), "startIfForeground, not in foregound");
            return false;
        }
        G(new java.lang.Runnable() { // from class: yf.i0$$g
            @Override // java.lang.Runnable
            public final void run() {
                yf.i0 i0Var = yf.i0.this;
                if (i0Var.f542895i != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.x(), "startIfForeground, do start");
                    i0Var.f542895i.h("start", new org.json.JSONObject());
                }
            }
        });
        return true;
    }

    @Override // eg.b
    public void p(android.graphics.SurfaceTexture surfaceTexture) {
        i(new android.view.Surface(surfaceTexture));
    }

    public final void r() {
        if (this.f542900q == 0 || this.f542901r == 0 || this.f542895i == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x(), "adjustHtmlSize, size:[%d, %d]", java.lang.Integer.valueOf(this.f542900q), java.lang.Integer.valueOf(this.f542901r));
        if (this.S.a(this.f542899p) && this.N) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x(), "adjustHtmlSize, i am pip player, isWebViewInBackground");
            return;
        }
        ((yf.n1) this.f542895i).mo176948x1c9cdc8c(this.f542900q, this.f542901r);
        this.f542893g.g(new android.util.Size(this.f542900q, this.f542901r));
    }

    public final void s(sf.f fVar) {
        zf.c cVar = this.f542898o;
        if (cVar != null) {
            yf.b1 b1Var = new yf.b1(this);
            bg1.h hVar = (bg1.h) cVar;
            hVar.getClass();
            if (fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b bVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b) fVar;
                org.json.JSONObject c17 = bVar.c();
                java.lang.String optString = c17.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15505x57568ce2) ? c17.optString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15505x57568ce2) : null;
                java.lang.String optString2 = c17.optString("backgroundMD5");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                    xf1.f.e(bVar.m(), optString, false, optString2, new bg1.c(hVar, b1Var, optString));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "convertBackgroundImageToLocalPath, url is null");
                    b1Var.b(optString, "");
                }
            }
        }
    }

    public final void t(sf.f fVar) {
        if (this.f542898o == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f542902s)) {
            return;
        }
        zf.c cVar = this.f542898o;
        java.lang.String str = this.f542902s;
        java.lang.String str2 = this.f542903t;
        yf.j0 j0Var = new yf.j0(this);
        bg1.h hVar = (bg1.h) cVar;
        hVar.getClass();
        if (fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b bVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b) fVar;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "convertFilterImageToLocalPath, url is null");
            } else {
                xf1.f.e(bVar.m(), str, false, str2, new bg1.d(hVar, j0Var, str));
            }
        }
    }

    public final void u(java.lang.String[] strArr, java.lang.String[] strArr2, java.lang.String[] strArr3, org.json.JSONObject jSONObject, sf.f fVar, org.json.JSONObject jSONObject2) {
        int length = strArr.length;
        yf.d1 d1Var = new yf.d1(null);
        d1Var.f542868a = length;
        for (int i17 = 0; i17 < length; i17++) {
            ((bg1.h) this.f542898o).c(fVar, strArr[i17], strArr2[i17], false, new yf.a1(this, i17, jSONObject, strArr3, fVar, d1Var, jSONObject2));
        }
    }

    public final void v(android.app.Activity activity, final sf.f fVar) {
        zf.c cVar;
        int i17 = this.f542904u;
        this.f542904u = i17 + 1;
        if (i17 > 5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x(), "doInvokeInsertAfterRequestPermission, avoid dead loop");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x(), "doInvokeInsertAfterRequestPermission, invoke insertInternal");
            fVar.a(jc1.g.f380475n);
            return;
        }
        si1.e1.a(fVar.mo50271x74292566(), new yf.n0(this, activity, fVar));
        si1.e1.a(fVar.mo50271x74292566(), new yf.p0(this, activity, fVar));
        if (!nf.t.a(activity, fVar.m(), "android.permission.CAMERA", 117, "", "")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x(), "doInvokeInsertAfterRequestPermission, no Camera Permission");
            return;
        }
        if (!nf.t.a(activity, fVar.m(), "android.permission.RECORD_AUDIO", 118, "", "")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x(), "doInvokeInsertAfterRequestPermission, no Microphone Permission");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x(), "doInvokeInsertAfterRequestPermission, invoke insertInternal");
        if (this.f542895i == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x(), "insert, adapter is null");
            return;
        }
        com.p314xaae8f345.p2926x359365.C25481x77f18081.m94465x74dac979(java.lang.String.format("weixin_%s", fVar.mo50271x74292566()));
        this.f542899p = fVar;
        if (fVar.m() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) {
            this.N = !((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) r10).l2();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(x(), "insert, component is not AppBrandPageView");
        }
        fVar.e(new yf.x0(this));
        org.json.JSONObject c17 = fVar.c();
        D(fVar, c17);
        C(c17);
        if (c17.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15516x6a3cecc2)) {
            this.f542905v = c17.optInt(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15516x6a3cecc2, 0) != 0;
        }
        if (c17.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15537x4680a1cb)) {
            this.f542906w = c17.optBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15537x4680a1cb, false);
        }
        B(c17);
        android.os.Bundle b17 = vf.a.b(c17);
        if (this.f542898o != null) {
            if (c17.optBoolean("muteOnAudioConflict", false)) {
                java.lang.String b18 = ((bg1.h) this.f542898o).b(true, this, this);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b18)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(x(), "mutePlayInHighPriorityTask|" + b18);
                    this.I = true;
                    this.f542892J = b17.getBoolean("muted", false) ^ true;
                    b17.putBoolean("muted", true);
                }
            } else {
                final java.lang.String b19 = ((bg1.h) this.f542898o).b(false, this, this);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b19)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x(), "insert fail, message:%s", b19);
                    fVar.d("fail: can not insert LivePusher now", jc1.g.f380466e);
                    ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: yf.i0$$o
                        @Override // java.lang.Runnable
                        public final void run() {
                            dp.a.m125854x26a183b(sf.f.this.mo50272x76847179(), b19, 0).show();
                        }
                    });
                    return;
                }
            }
        }
        sc1.k1 i18 = ((yf.n1) this.f542895i).i(b17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x(), "insert, code:%d info:%s", java.lang.Integer.valueOf(i18.f487221a), i18.f487222b);
        fVar.b(i18.f487221a == 0 ? jc1.f.f380445a : jc1.f.f380448d, i18.f487223c);
        s(fVar);
        t(fVar);
        if (i18.f487221a != 0 || (cVar = this.f542898o) == null) {
            return;
        }
        ((bg1.h) cVar).g(this, this.f542899p, b17);
    }

    public java.lang.String w() {
        return q() + "@" + hashCode();
    }

    public final java.lang.String x() {
        return java.lang.String.format("%s(%s)", "MicroMsg.SameLayer.LivePusherPluginHandler", q());
    }

    public final int y() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("window") != null) {
            return ((android.view.WindowManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("window")).getDefaultDisplay().getRotation();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(x(), "getRotationAngle, window service is null");
        return 0;
    }

    public final boolean z(int i17) {
        if (i17 == this.A) {
            return false;
        }
        this.A = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.LivePusherPluginHandler", "notifyOrientationChanged, new angle:%s", java.lang.Integer.valueOf(i17));
        yf.o oVar = this.f542895i;
        if (oVar == null) {
            return false;
        }
        oVar.m(i17);
        this.f542893g.o().i(i17);
        return true;
    }
}

package of1;

/* loaded from: classes7.dex */
public final class w1 extends android.widget.FrameLayout implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o, of1.y1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.s {
    public static final /* synthetic */ int H = 0;
    public final jz5.g A;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.s0 B;
    public final jz5.g C;
    public final of1.g1 D;
    public final java.lang.Runnable E;
    public final jz5.g F;
    public java.util.ArrayList G;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f426566d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 f426567e;

    /* renamed from: f, reason: collision with root package name */
    public final int f426568f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f426569g;

    /* renamed from: h, reason: collision with root package name */
    public int f426570h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f426571i;

    /* renamed from: m, reason: collision with root package name */
    public volatile java.lang.String f426572m;

    /* renamed from: n, reason: collision with root package name */
    public volatile java.lang.String f426573n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f426574o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l2 f426575p;

    /* renamed from: q, reason: collision with root package name */
    public final of1.i1 f426576q;

    /* renamed from: r, reason: collision with root package name */
    public final of1.t1 f426577r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 f426578s;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2642x2e06d1.C21488x3b5d0f43 f426579t;

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.p3210x3857dc.o0 f426580u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f426581v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f426582w;

    /* renamed from: x, reason: collision with root package name */
    public final x.d f426583x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.Object f426584y;

    /* renamed from: z, reason: collision with root package name */
    public int f426585z;

    static {
        ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
        nw4.d.f422348a.a();
    }

    public w1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.z6 z6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(z6Var);
        boolean z17;
        this.f426566d = o6Var;
        this.f426567e = n7Var;
        try {
            z17 = o6Var.E0().f128833z ? o6Var.E0().f128832y : o6Var.E0().f128829w;
        } catch (java.lang.NullPointerException unused) {
            z17 = false;
        }
        this.f426568f = z17 ? 55 : 49;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var2 = this.f426566d;
        try {
            if (o6Var2.E0().f128833z) {
                boolean z18 = o6Var2.E0().f128832y;
            } else {
                boolean z19 = o6Var2.E0().f128829w;
            }
        } catch (java.lang.NullPointerException unused2) {
        }
        this.f426571i = true;
        this.f426574o = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f426576q = new of1.i1(this);
        this.f426577r = new of1.t1(this);
        this.f426582w = jz5.h.b(new of1.v1(this));
        of1.q1 q1Var = new of1.q1(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.HTMLWebViewWithBWC", "<init> start hash[" + hashCode() + ']');
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 a17 = al5.l2.a(z6Var);
        this.f426578s = a17;
        if (o6Var.N0()) {
            a17.mo120128x74041feb(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.cdp.f3(), "__AndroidPromiseBridge");
        }
        a17.setBackgroundColor(0);
        com.p314xaae8f345.p3210x3857dc.z0 mo120153xd15cf999 = a17.mo120153xd15cf999();
        mo120153xd15cf999.z(true);
        mo120153xd15cf999.E(true);
        mo120153xd15cf999.I(false);
        mo120153xd15cf999.J(0);
        a17.mo120519x347eaca1(false);
        a17.mo120520x57c53c73(false);
        mo120153xd15cf999.r(true);
        mo120153xd15cf999.G(true);
        mo120153xd15cf999.M(false);
        mo120153xd15cf999.L(false);
        mo120153xd15cf999.C(true);
        mo120153xd15cf999.D(true);
        mo120153xd15cf999.k(true);
        mo120153xd15cf999.t(true);
        mo120153xd15cf999.p(true);
        a17.mo120190xd6bb225d(q1Var);
        mo120153xd15cf999.R(2);
        java.lang.String g17 = mo120153xd15cf999.g();
        ik1.k0 k0Var = (ik1.k0) nd.f.a(ik1.k0.class);
        if (k0Var == null) {
            ((yg0.e4) ((zg0.g3) i95.n0.c(zg0.g3.class))).getClass();
            k0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1146x600e8c43.y(z6Var);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g17);
        if (!r26.n0.B(g17, " MicroMessenger/", false)) {
            mo120153xd15cf999.Q(ik1.l0.a(z6Var, g17, k0Var) + " miniProgram/" + o6Var.f156336n);
        }
        a17.mo120177x7619e5de(new of1.x0(this));
        this.f426580u = a17.m0(new of1.y0(this));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.HTMLWebViewWithBWC", "<init> end WebView construct hash[" + hashCode() + ']');
        addView(a17, new android.widget.FrameLayout.LayoutParams(-1, -1));
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21488x3b5d0f43 c21488x3b5d0f43 = new com.p314xaae8f345.mm.ui.p2642x2e06d1.C21488x3b5d0f43(z6Var);
        c21488x3b5d0f43.setProgressDrawable(i65.a.i(z6Var, com.p314xaae8f345.mm.R.C30861xcebc809e.f563515ap4));
        this.f426579t = c21488x3b5d0f43;
        addView(c21488x3b5d0f43, new android.widget.FrameLayout.LayoutParams(-1, i65.a.b(z6Var, 3)));
        n7Var.w(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w() { // from class: of1.z0
            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w
            /* renamed from: onDestroy */
            public final void mo32094xac79a11b() {
                of1.w1.this.m151217x5cd39ffa();
            }
        });
        android.util.SparseArray sparseArray = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.a.f165403a;
        synchronized (sparseArray) {
            sparseArray.put(m151220xb3e199bb(), this);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.HTMLWebViewWithBWC", "<init> end hash[" + hashCode() + "], supportOrientationControl[" + m151215xc937cd5b() + ']');
        this.f426583x = new x.d(0);
        this.f426584y = new java.lang.Object();
        this.A = jz5.h.b(of1.o1.f426517d);
        this.B = o6Var.x0().mo51924x62662257().k();
        this.C = jz5.h.b(new of1.d1(this));
        this.D = new of1.g1();
        this.E = new of1.r1(this);
        this.F = jz5.h.b(new of1.f1(this));
    }

    /* renamed from: getEnableAutoPlay */
    private final boolean m151209x58d6911c() {
        return ((java.lang.Boolean) ((jz5.n) this.F).mo141623x754a37bb()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getEventContext */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l m151210xcfccac2b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = this.f426567e;
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11539x905d5b94.c(n7Var)) {
            return n7Var;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 U1 = n7Var.U1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(U1, "getService(...)");
        return U1;
    }

    /* renamed from: getMPullDown */
    private final ni1.h m151211x8285b55e() {
        return (ni1.h) this.f426567e.B1(ni1.h.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getPageLoadingListenerList */
    public final java.util.ArrayList<java.lang.Object> m151212x3906f789() {
        return (java.util.ArrayList) ((jz5.n) this.A).mo141623x754a37bb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getREPORTER */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.m m151213x8d31ae37() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.m) ((jz5.n) this.C).mo141623x754a37bb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getWebViewController */
    public final of1.x1 m151214xc72aebdf() {
        return (of1.x1) ((jz5.n) this.f426582w).mo141623x754a37bb();
    }

    /* renamed from: getXwVideoOrientationControlSupported */
    private final boolean m151215xc937cd5b() {
        com.p314xaae8f345.p3210x3857dc.o0 o0Var = this.f426580u;
        return o0Var != null && o0Var.d();
    }

    /* renamed from: setCurrentUrl */
    private final void m151216xdb7c7738(java.lang.String str) {
        this.f426572m = str;
        if (str == null || str.length() == 0) {
            ni1.h m151211x8285b55e = m151211x8285b55e();
            if (m151211x8285b55e != null) {
                m151211x8285b55e.g("");
                return;
            }
            return;
        }
        try {
            java.lang.String host = android.net.Uri.parse(str).getHost();
            if (host == null || host.length() == 0) {
                ni1.h m151211x8285b55e2 = m151211x8285b55e();
                if (m151211x8285b55e2 != null) {
                    m151211x8285b55e2.g("");
                    return;
                }
                return;
            }
            ni1.h m151211x8285b55e3 = m151211x8285b55e();
            if (m151211x8285b55e3 != null) {
                m151211x8285b55e3.g(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l6m, host));
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public void F(org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("htmlId", this.f426570h);
            } catch (org.json.JSONException unused) {
            }
        }
        if (jSONObject != null) {
            jSONObject.put("webviewId", hashCode());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.b bVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.b();
        java.lang.String jSONObject2 = jSONObject != null ? jSONObject.toString() : null;
        if (jSONObject2 == null) {
            jSONObject2 = "";
        }
        bVar.f163907f = jSONObject2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = this.f426567e;
        n7Var.i(bVar, new int[]{n7Var.U1().mo50260x9f1221c2()});
    }

    public void I() {
        android.view.View view = this.f426581v;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/webview/bwc/HTMLWebViewWithBWC", "hideScreenshotCover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/jsapi/webview/bwc/HTMLWebViewWithBWC", "hideScreenshotCover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setBackground(null);
            removeView(view);
        }
        this.f426581v = null;
    }

    @Override // ni1.f
    public void P() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.HTMLWebViewWithBWC", "restoreRendering hash[%d]", java.lang.Integer.valueOf(hashCode()));
        this.f426578s.mo81406xc39f557c();
    }

    public final void S() {
        boolean N0 = this.f426566d.N0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.HTMLWebViewWithBWC", "injectWxAssistantJs isWxAssistEnable:" + N0);
        if (N0) {
            this.f426578s.mo14660x738236e6(ik1.f.e("wxa_library/wx_assistant_page_info.js"), of1.h1.f426465a);
        }
    }

    public boolean T() {
        return m151209x58d6911c();
    }

    @Override // ni1.f
    public void V() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.HTMLWebViewWithBWC", "pauseRendering hash[%d]", java.lang.Integer.valueOf(hashCode()));
        this.f426578s.mo81405xc39a57c1();
    }

    public void a0(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.HTMLWebViewWithBWC", "onPageCommitVisible url[%s] hash[%d] destroyed[%b]", str, java.lang.Integer.valueOf(hashCode()), java.lang.Boolean.valueOf(this.f426569g));
        if (this.f426569g) {
            return;
        }
        m151216xdb7c7738(str);
        S();
        this.f426578s.mo14660x738236e6("window.__wxjs_environment = \"miniprogram\";", null);
        synchronized (this.f426584y) {
            this.f426585z = 2;
            if (this.f426566d.N0()) {
                w0(new of1.l1(str));
            }
        }
    }

    public void c0(java.lang.String str) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode());
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(this.f426569g);
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.HTMLWebViewWithBWC", "onPageFinished url[%s] hash[%d] destroyed[%b] attached[%b]", str, valueOf, valueOf2, java.lang.Boolean.valueOf(n3.x0.b(this)));
        if (this.f426569g) {
            return;
        }
        m151216xdb7c7738(str);
        S();
        this.f426578s.mo14660x738236e6("window.__wxjs_environment = \"miniprogram\";", null);
        of1.g1 g1Var = this.D;
        if (!g1Var.f426453b && !g1Var.f426452a) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.r0 m151226x80c49695 = m151226x80c49695();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = this.f426567e;
            java.lang.String str2 = g1Var.f426454c;
            java.util.LinkedList linkedList = m151226x80c49695.f169606c;
            m151226x80c49695.f169619p = (java.lang.String) linkedList.peekFirst();
            m151226x80c49695.f169620q = 2;
            m151226x80c49695.f169621r = str;
            linkedList.push(str2);
            m151226x80c49695.b(n7Var);
        }
        g1Var.f426453b = false;
        g1Var.f426452a = false;
        g1Var.f426454c = str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.p pVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.p();
        pVar.u(m151210xcfccac2b());
        pVar.s("src", str);
        pVar.s("htmlId", java.lang.Integer.valueOf(this.f426570h));
        pVar.m();
        synchronized (this.f426584y) {
            this.f426585z = 1;
            w0(new of1.m1(str));
        }
        postDelayed(this.E, 1000L);
        this.f426573n = null;
        t0(str);
    }

    /* renamed from: destroy */
    public void m151217x5cd39ffa() {
        removeCallbacks(this.E);
        of1.e1 e1Var = new of1.e1(this);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
            e1Var.run();
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(e1Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent ev6) {
        ni1.h m151211x8285b55e;
        ni1.h m151211x8285b55e2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        if (this.f426569g) {
            return false;
        }
        int actionMasked = ev6.getActionMasked();
        if (actionMasked == 0) {
            ni1.h m151211x8285b55e3 = m151211x8285b55e();
            if (m151211x8285b55e3 != null) {
                m151211x8285b55e3.mo52194x8f093973(true);
            }
        } else if ((actionMasked == 1 || actionMasked == 3) && (m151211x8285b55e2 = m151211x8285b55e()) != null) {
            m151211x8285b55e2.mo52194x8f093973(false);
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(ev6);
        if (!dispatchTouchEvent && (m151211x8285b55e = m151211x8285b55e()) != null) {
            m151211x8285b55e.mo52194x8f093973(false);
        }
        return dispatchTouchEvent;
    }

    /* renamed from: getAndroidContext */
    public android.content.Context m151218x3af91936() {
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return context;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o
    /* renamed from: getAndroidView */
    public android.view.View mo51532x11b85c7e() {
        return this;
    }

    /* renamed from: getAppId */
    public java.lang.String m151219x74292566() {
        java.lang.String str = this.f426566d.f156336n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        return str;
    }

    /* renamed from: getBinderID */
    public int m151220xb3e199bb() {
        return ((of1.v0) m151222x143f1b92()).U();
    }

    /* renamed from: getBizDomainList */
    public java.util.ArrayList<java.lang.String> m151221x550c113f() {
        return this.G;
    }

    /* renamed from: getCoverViewId */
    public int m151224xd4bfd001() {
        return this.f426570h;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o
    /* renamed from: getCurrentUrl */
    public java.lang.String mo51533xad58292c() {
        return this.f426572m;
    }

    /* renamed from: getEnterScene */
    public int m151225xbcc8608a() {
        return this.f426566d.g2();
    }

    /* renamed from: getExitReporter */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.r0 m151226x80c49695() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.r0 n17 = this.f426566d.x0().mo51924x62662257().n();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "getHTMLWebViewUrlExitReporter(...)");
        return n17;
    }

    /* renamed from: getHtmlId */
    public final int m151227x1d24f51c() {
        return this.f426570h;
    }

    /* renamed from: getJsApiReportArgs */
    public java.lang.String[] m151228x788f70ec() {
        if (this.f426569g) {
            return new java.lang.String[0];
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = this.f426567e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 mo32091x9a3f0ba2 = n7Var.mo32091x9a3f0ba2();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 l27 = mo32091x9a3f0ba2.l2();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07 = mo32091x9a3f0ba2.u0();
        of1.w1 s37 = n7Var.s3();
        java.lang.String[] strArr = new java.lang.String[19];
        strArr[0] = "" + l27.f169323f;
        strArr[1] = l27.f169324g;
        strArr[2] = mo32091x9a3f0ba2.f156336n;
        strArr[3] = "" + mo32091x9a3f0ba2.E0().f387385r.f33456x1c82a56c;
        strArr[4] = u07.f128809v;
        strArr[5] = "" + (mo32091x9a3f0ba2.E0().f387385r.f156932d + 1);
        strArr[6] = "" + l27.f169325h;
        strArr[7] = n7Var.X1();
        strArr[8] = s37 == null ? "" : s37.mo51534x86b9ebe3().mo120156xb5887639();
        strArr[9] = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.q2.b(n7Var.mo50352x76847179());
        strArr[10] = "";
        strArr[11] = "";
        strArr[12] = "";
        strArr[13] = "";
        strArr[14] = "";
        strArr[15] = "";
        strArr[16] = "" + l27.f169321d;
        strArr[17] = "" + l27.f169322e;
        strArr[18] = "" + (mo32091x9a3f0ba2.u0().f128817z + 1000);
        return strArr;
    }

    /* renamed from: getLifecycleOwner */
    public p012xc85e97e9.p093xedfae76a.y m151229x95c7fa5f() {
        return m151232xaf156f4a().O1();
    }

    /* renamed from: getPageLoadingStatus */
    public int m151230xa57ef549() {
        int i17;
        synchronized (this.f426584y) {
            i17 = this.f426585z;
        }
        return i17;
    }

    /* renamed from: getReporter */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.m m151233x62662257() {
        return m151213x8d31ae37();
    }

    /* renamed from: getUrl */
    public java.lang.String m151234xb5887639() {
        return mo51534x86b9ebe3().mo120156xb5887639();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o
    /* renamed from: getWebView */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 mo51534x86b9ebe3() {
        return this.f426578s;
    }

    public void i(android.content.Context context) {
        if (context == null) {
            return;
        }
        android.content.Context context2 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.ui.AppBrandRuntimePersistentContextWrapper");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.z6) context2).setBaseContext(context);
        try {
            this.f426578s.i(context);
        } catch (java.lang.Exception unused) {
        }
        of1.v0 v0Var = (of1.v0) m151222x143f1b92();
        v0Var.getClass();
        of1.m mVar = v0Var.X1;
        if (mVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewScanHelper");
            throw null;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636) mVar.f426505s).f240180d = context;
        com.p314xaae8f345.mm.ui.p2740x696c9db.s6 s6Var = mVar.f426497h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o oVar = mVar.f426413d;
        if (s6Var != null) {
            try {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = s6Var.f292254e;
                if (k0Var.i()) {
                    k0Var.u();
                }
            } catch (java.lang.Exception unused2) {
            } catch (java.lang.Throwable th6) {
                ((of1.w1) oVar).mo51534x86b9ebe3().setOnLongClickListener(null);
                mVar.f426497h = null;
                throw th6;
            }
            ((of1.w1) oVar).mo51534x86b9ebe3().setOnLongClickListener(null);
            mVar.f426497h = null;
        }
        if (context instanceof android.app.Activity) {
            com.p314xaae8f345.mm.ui.p2740x696c9db.s6 s6Var2 = new com.p314xaae8f345.mm.ui.p2740x696c9db.s6(mVar.a());
            mVar.f426497h = s6Var2;
            s6Var2.c(((of1.w1) oVar).mo51534x86b9ebe3(), mVar, null);
        }
        if (q75.a.a(getContext()) == null) {
            this.f426575p = null;
        } else {
            if (q75.a.a(getContext()) == null) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l2 e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1.e(this);
            if (e17 != null) {
                e17.a(this.f426576q);
            }
            this.f426575p = e17;
        }
    }

    public void m0(java.lang.String str) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode());
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(this.f426569g);
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.HTMLWebViewWithBWC", "onPageStarted url[%s] hash[%d] destroyed[%b] attached[%b]", str, valueOf, valueOf2, java.lang.Boolean.valueOf(n3.x0.b(this)));
        if (this.f426569g) {
            return;
        }
        boolean z17 = !u46.l.c(this.f426573n, str) && android.webkit.URLUtil.isNetworkUrl(str);
        this.f426573n = str;
        this.f426574o.set(false);
        S();
        this.f426578s.mo14660x738236e6("window.__wxjs_environment = \"miniprogram\";", null);
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.q qVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.q();
            qVar.u(m151210xcfccac2b());
            qVar.s("src", str);
            qVar.s("htmlId", java.lang.Integer.valueOf(this.f426570h));
            qVar.s("isMainFrame", java.lang.Boolean.TRUE);
            qVar.m();
        }
        synchronized (this.f426584y) {
            this.f426585z = 0;
            w0(new of1.n1(str));
        }
    }

    public void n0(java.lang.String str, int i17, java.lang.String str2) {
        java.lang.String str3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.HTMLWebViewWithBWC", "onReceivedError url:" + str + ", errorCode:" + i17 + ", message:" + str2);
        if ((str == null || str.length() == 0) || !android.webkit.URLUtil.isNetworkUrl(str)) {
            return;
        }
        java.lang.String a17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h9.a(str);
        if (!u46.l.c(a17, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h9.a(this.f426572m))) {
            java.lang.String str4 = null;
            try {
                str3 = this.f426578s.mo120156xb5887639();
            } catch (java.lang.Exception unused) {
                str3 = null;
            }
            if (!u46.l.c(a17, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h9.a(str3))) {
                try {
                    str4 = this.f426578s.mo120149x410b6ca8();
                } catch (java.lang.Exception unused2) {
                }
                if (!u46.l.c(a17, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h9.a(str4))) {
                    return;
                }
            }
        }
        x0(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.r rVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.r();
        rVar.u(m151210xcfccac2b());
        rVar.s("htmlId", java.lang.Integer.valueOf(this.f426570h));
        rVar.s(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993, java.lang.Integer.valueOf(i17));
        rVar.s("description", str2);
        rVar.s("src", str);
        rVar.m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (q75.a.a(getContext()) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l2 e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1.e(this);
            if (e17 != null) {
                e17.a(this.f426576q);
            }
            this.f426575p = e17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = this.f426567e;
        of1.t1 t1Var = this.f426577r;
        n7Var.U(t1Var);
        n7Var.R(t1Var);
        if (n7Var.l2()) {
            t1Var.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = this.f426567e;
        boolean mo50262x39e05d35 = n7Var.mo50262x39e05d35();
        of1.t1 t1Var = this.f426577r;
        if (!mo50262x39e05d35) {
            t1Var.c();
            m151217x5cd39ffa();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l2 l2Var = this.f426575p;
        if (l2Var != null) {
            l2Var.g(this.f426576q);
        }
        n7Var.I(t1Var);
        n7Var.O(t1Var);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        if (getParent() instanceof android.view.ViewGroup) {
            android.view.ViewParent parent = getParent();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
            int mode = android.view.View.MeasureSpec.getMode(i18);
            if (mode == Integer.MIN_VALUE) {
                i18 = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(0, java.lang.Math.min(viewGroup.getMeasuredHeight(), android.view.View.MeasureSpec.getSize(i18))), Integer.MIN_VALUE);
            } else if (mode == 0) {
                i18 = android.view.View.MeasureSpec.makeMeasureSpec(viewGroup.getMeasuredHeight(), Integer.MIN_VALUE);
            } else if (mode == 1073741824 && android.view.View.MeasureSpec.getSize(i18) > viewGroup.getMeasuredHeight()) {
                i18 = android.view.View.MeasureSpec.makeMeasureSpec(viewGroup.getMeasuredHeight(), 1073741824);
            }
        }
        super.onMeasure(i17, i18);
    }

    public void q0(com.p314xaae8f345.p3210x3857dc.x0 x0Var, com.p314xaae8f345.p3210x3857dc.y0 y0Var) {
        if (x0Var == null || y0Var == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.HTMLWebViewWithBWC", "onReceivedHttpError url:" + x0Var.mo120512xb5887639() + ", isForMainFrame:" + x0Var.mo120514xa25f36b5() + ", statusCode:" + y0Var.f302156c + ", reason:" + y0Var.f302157d);
        if (x0Var.mo120514xa25f36b5()) {
            java.lang.String uri = x0Var.mo120512xb5887639().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uri, "toString(...)");
            x0(uri);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.r rVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.r();
            rVar.u(m151210xcfccac2b());
            rVar.s("htmlId", java.lang.Integer.valueOf(this.f426570h));
            rVar.s("httpCode", java.lang.Integer.valueOf(y0Var.f302156c));
            rVar.s("description", y0Var.f302157d);
            rVar.s("src", uri);
            rVar.m();
        }
    }

    public void r0(android.net.http.SslError sslError) {
        java.lang.String str;
        if (sslError == null) {
            return;
        }
        java.lang.String url = sslError.getUrl();
        java.lang.String a17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h9.a(url);
        if (!u46.l.c(a17, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h9.a(this.f426572m))) {
            java.lang.String str2 = null;
            try {
                str = this.f426578s.mo120156xb5887639();
            } catch (java.lang.Exception unused) {
                str = null;
            }
            if (!u46.l.c(a17, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h9.a(str))) {
                try {
                    str2 = this.f426578s.mo120149x410b6ca8();
                } catch (java.lang.Exception unused2) {
                }
                if (!u46.l.c(a17, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h9.a(str2))) {
                    return;
                }
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(url);
        x0(url);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.r rVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.r();
        rVar.u(m151210xcfccac2b());
        rVar.s("htmlId", java.lang.Integer.valueOf(this.f426570h));
        rVar.s(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993, java.lang.Integer.valueOf(sslError.getPrimaryError()));
        rVar.s("description", sslError.toString());
        rVar.s("src", url);
        rVar.m();
    }

    /* renamed from: setAdjustResizeOnKeyboardStateChanged */
    public void m151235xadcefbee(boolean z17) {
        this.f426571i = z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o
    /* renamed from: setAndroidViewId */
    public void mo51536x17e9a4ad(int i17) {
        mo51532x11b85c7e().setId(i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o
    /* renamed from: setAudioMuted */
    public void mo51537x77c16137(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.HTMLWebViewWithBWC", "setAudioMuted " + z17);
        this.f426578s.mo120175x77c16137(z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o
    /* renamed from: setBizDomainList */
    public void mo51538xe7e277b3(java.util.ArrayList<java.lang.String> arrayList) {
        this.G = arrayList;
    }

    /* renamed from: setCoverViewId */
    public void m151236x6b254375(int i17) {
        this.f426570h = i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t0(java.lang.String r17) {
        /*
            r16 = this;
            r0 = r16
            java.lang.String r1 = r0.f426573n
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L11
            int r1 = r1.length()
            if (r1 != 0) goto Lf
            goto L11
        Lf:
            r1 = r2
            goto L12
        L11:
            r1 = r3
        L12:
            if (r1 != 0) goto L15
            return
        L15:
            com.tencent.mm.plugin.appbrand.page.n7 r1 = r16.m151232xaf156f4a()
            com.tencent.mm.plugin.appbrand.o6 r1 = r1.mo32091x9a3f0ba2()
            if (r1 == 0) goto La6
            java.lang.Class<zd1.c> r4 = zd1.c.class
            com.tencent.mm.plugin.appbrand.jsapi.g0 r1 = r1.b(r4)
            zd1.c r1 = (zd1.c) r1
            if (r1 == 0) goto La6
            boolean r4 = r1.f553061d
            if (r4 != 0) goto L2e
            return
        L2e:
            java.util.concurrent.atomic.AtomicBoolean r4 = r0.f426574o
            boolean r4 = r4.getAndSet(r3)
            if (r4 == 0) goto L37
            return
        L37:
            int r4 = r0.f426570h
            java.lang.String[] r5 = r1.f553062e
            if (r5 == 0) goto L48
            int r1 = r5.length
            if (r1 != 0) goto L42
            r1 = r3
            goto L43
        L42:
            r1 = r2
        L43:
            if (r1 == 0) goto L46
            goto L48
        L46:
            r1 = r2
            goto L49
        L48:
            r1 = r3
        L49:
            r15 = 0
            if (r1 == 0) goto L4e
            r1 = r15
            goto L8c
        L4e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r6 = "\n            ;\n            (function (window) {\n                var htmlId = "
            r1.<init>(r6)
            r1.append(r4)
            java.lang.String r4 = "\n                var types = \""
            r1.append(r4)
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>()
            java.lang.String r7 = "|"
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 124(0x7c, float:1.74E-43)
            r14 = 0
            r6 = r4
            kz5.z.Z(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1.append(r4)
            java.lang.String r4 = "\"\n                var webviewUrl = \""
            r1.append(r4)
            if (r17 != 0) goto L7e
            java.lang.String r4 = ""
            goto L80
        L7e:
            r4 = r17
        L80:
            r1.append(r4)
            java.lang.String r4 = "\"\n                var result = {}\n                result['htmlId'] = htmlId\n                result['webviewUrl'] = webviewUrl\n                types.split('|').forEach(function (type) {\n                    if ('textContent' === type) {\n                        result[type] = window.document.documentElement.textContent\n                    } else if ('innerHTML' === type) {\n                        result[type] = window.document.documentElement.innerHTML\n                    } else if ('innerText' === type) {\n                        result[type] = window.document.documentElement.innerText\n                    }\n                })\n                return JSON.stringify(result)\n            })(this)\n            ;\n        "
            r1.append(r4)
            java.lang.String r1 = r1.toString()
        L8c:
            if (r1 == 0) goto La6
            int r4 = r1.length()
            if (r4 <= 0) goto L95
            r2 = r3
        L95:
            if (r2 == 0) goto L98
            r15 = r1
        L98:
            if (r15 == 0) goto La6
            com.tencent.mm.ui.widget.MMWebView r1 = r16.mo51534x86b9ebe3()
            of1.s1 r2 = new of1.s1
            r2.<init>(r0)
            r1.mo14660x738236e6(r15, r2)
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: of1.w1.t0(java.lang.String):void");
    }

    public void u0(java.lang.String str, com.p314xaae8f345.p3210x3857dc.x0 x0Var) {
        android.net.Uri mo120512xb5887639;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.q qVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.q();
        qVar.u(m151210xcfccac2b());
        qVar.s("src", (x0Var == null || (mo120512xb5887639 = x0Var.mo120512xb5887639()) == null) ? null : mo120512xb5887639.toString());
        qVar.s("htmlId", java.lang.Integer.valueOf(this.f426570h));
        qVar.s("isMainFrame", java.lang.Boolean.FALSE);
        qVar.m();
    }

    public boolean v0() {
        return !m151215xc937cd5b();
    }

    public final void w0(yz5.l lVar) {
        synchronized (this.f426584y) {
            java.util.Iterator<java.lang.Object> it = m151212x3906f789().iterator();
            if (it.hasNext()) {
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(null);
                throw null;
            }
        }
    }

    public final void x0(java.lang.String str) {
        java.lang.String str2 = this.f426573n;
        if (str2 == null || str2.length() == 0) {
            this.f426573n = str;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.q qVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.q();
            qVar.u(m151210xcfccac2b());
            qVar.s("src", str);
            qVar.s("htmlId", java.lang.Integer.valueOf(this.f426570h));
            qVar.s("isMainFrame", java.lang.Boolean.TRUE);
            qVar.m();
        }
    }

    /* renamed from: getController, reason: merged with bridge method [inline-methods] */
    public of1.x1 m151222x143f1b92() {
        return m151214xc72aebdf();
    }

    /* renamed from: getPageView, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 m151232xaf156f4a() {
        return this.f426567e;
    }
}

package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public abstract class a extends re.a implements com.tencent.luggage.sdk.jsapi.component.o, ni1.d {

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f86371f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.fb f86372g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f86373h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f86374i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f86375m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.p8 f86376n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.ib f86377o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.ia f86378p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.bd f86379q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f86380r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.l f86381s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.hb f86382t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.i f86383u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.ob f86384v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f86385w;

    public a(com.tencent.luggage.sdk.jsapi.component.b bVar) {
        super(bVar);
        this.f86373h = false;
        this.f86374i = false;
        this.f86385w = false;
    }

    public static int K(k91.f fVar, boolean z17, k91.z3 z3Var, boolean z18) {
        k91.z3 z3Var2 = k91.z3.TRANSPARENT;
        int i17 = 0;
        int i18 = z3Var == z3Var2 ? 0 : z17 ? -15132391 : -1;
        try {
            i18 = ik1.w.l(fVar.f305719h);
        } catch (java.lang.Exception unused) {
        }
        if (z3Var != z3Var2 && !z18) {
            i17 = -16777216;
        }
        return i17 | i18;
    }

    @Override // ni1.d
    public final com.tencent.mm.plugin.appbrand.page.fb D(android.content.Context context) {
        if (context == null) {
            context = I();
        }
        this.f86372g = S(context);
        if (java.lang.System.currentTimeMillis() % 1000 == 1 || z65.c.a()) {
            com.tencent.mars.xlog.Log.i("Luggage.AbstractMPPageViewRenderer", "do observeLongTask");
            this.f86372g.addJavascriptInterface(M(), "PageLongTaskReporter");
            this.f86380r = true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
        com.tencent.mm.plugin.appbrand.page.fb fbVar = this.f86372g;
        com.tencent.mm.plugin.appbrand.page.l lVar = new com.tencent.mm.plugin.appbrand.page.l(this, context);
        this.f86381s = lVar;
        fbVar.addJavascriptInterface(lVar, "__deviceInfo");
        return this.f86372g;
    }

    public com.tencent.mm.plugin.appbrand.performance.v M() {
        return new com.tencent.mm.plugin.appbrand.page.f(this);
    }

    public final com.tencent.mm.plugin.appbrand.page.i N(java.lang.String str) {
        if (this.f86383u == null) {
            this.f86383u = T();
            this.f86384v = U();
            com.tencent.mars.xlog.Log.i("Luggage.AbstractMPPageViewRenderer", "getInjectionMode created mode name = %s, appId = %s, reason = %s", this.f86383u.name(), H(), str);
        }
        return this.f86383u;
    }

    public final com.tencent.mm.plugin.appbrand.page.hb O() {
        if (this.f86382t == null) {
            com.tencent.mm.plugin.appbrand.page.hb R = R();
            this.f86382t = R;
            if (R == null) {
                this.f86382t = new com.tencent.mm.plugin.appbrand.page.pb(this);
            }
        }
        return this.f86382t;
    }

    public final void P(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str2)) {
            com.tencent.mars.xlog.Log.e("Luggage.AbstractMPPageViewRenderer", "[!]injectScript appId[%s] name[%s] url[%s] hash[%d] source EMPTY", H(), str, this.f86375m, java.lang.Integer.valueOf(hashCode()));
            return;
        }
        com.tencent.luggage.sdk.jsapi.component.n nVar = new com.tencent.luggage.sdk.jsapi.component.n();
        nVar.f47352i = str;
        nVar.f47353j = str2;
        nVar.f47354k = str2.length();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int f17 = sj1.l.f(H(), "public:inject", "代码注入-" + str);
        com.tencent.mars.xlog.Log.i("Luggage.AbstractMPPageViewRenderer", "injectScript start, appId[%s] name[%s] url[%s] hash[%d]", H(), str, this.f86375m, java.lang.Integer.valueOf(hashCode()));
        java.net.URL url = null;
        try {
            if (android.text.TextUtils.isEmpty(str)) {
                com.tencent.mars.xlog.Log.w("Luggage.AbstractMPPageViewRenderer", "[!] injectScript, valid name is required, appId:%s, url:%s", H(), this.f86375m);
            } else {
                url = new java.net.URL("https", com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyj), str);
            }
        } catch (java.lang.Exception unused) {
        }
        com.tencent.mm.plugin.appbrand.utils.d3.b(((com.tencent.luggage.sdk.jsapi.component.b) F()).getF147808e(), url, str2, new com.tencent.mm.plugin.appbrand.page.g(this, nVar, currentTimeMillis, f17));
    }

    public final boolean Q() {
        com.tencent.luggage.sdk.jsapi.component.b bVar = (com.tencent.luggage.sdk.jsapi.component.b) F();
        return bVar != null && bVar.isRunning();
    }

    public com.tencent.mm.plugin.appbrand.page.hb R() {
        return null;
    }

    public abstract com.tencent.mm.plugin.appbrand.page.fb S(android.content.Context context);

    public com.tencent.mm.plugin.appbrand.page.i T() {
        return ((com.tencent.mm.plugin.appbrand.page.u5) ((com.tencent.luggage.sdk.jsapi.component.b) F()).b(com.tencent.mm.plugin.appbrand.page.u5.class)).a() ? new com.tencent.mm.plugin.appbrand.page.j(this, null) : new com.tencent.mm.plugin.appbrand.page.k(this, null);
    }

    public com.tencent.mm.plugin.appbrand.page.ob U() {
        com.tencent.mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap wxaRuntimeModulePluginListMap;
        com.tencent.mm.plugin.appbrand.jsapi.l F = F();
        kotlin.jvm.internal.o.d(F);
        com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo wxaPkgWrappingInfo = ((com.tencent.luggage.sdk.config.AppBrandSysConfigLU) ((com.tencent.luggage.sdk.jsapi.component.b) F).b(com.tencent.luggage.sdk.config.AppBrandSysConfigLU.class)).f305852r;
        if (((wxaPkgWrappingInfo == null || (wxaRuntimeModulePluginListMap = wxaPkgWrappingInfo.f75404i) == null) ? 0 : wxaRuntimeModulePluginListMap.f75406d.size()) <= 0) {
            return new com.tencent.mm.plugin.appbrand.page.nb();
        }
        com.tencent.mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap wxaRuntimeModulePluginListMap2 = wxaPkgWrappingInfo.f75404i;
        kotlin.jvm.internal.o.d(wxaRuntimeModulePluginListMap2);
        return new com.tencent.mm.plugin.appbrand.page.mb(this, wxaRuntimeModulePluginListMap2);
    }

    public void V(java.lang.String str) {
        ((com.tencent.luggage.sdk.jsapi.component.b) F()).H2(str);
    }

    public void W() {
        ((com.tencent.luggage.sdk.jsapi.component.b) F()).t();
    }

    public void X(com.tencent.luggage.sdk.jsapi.component.n nVar, boolean z17, long j17, long j18, java.lang.Object obj) {
    }

    public boolean Y(com.tencent.mm.plugin.appbrand.page.wd wdVar) {
        return (F() == null || !((com.tencent.luggage.sdk.jsapi.component.b) F()).j2()) && ((com.tencent.luggage.sdk.jsapi.component.b) F()).t3().u0().r() != k91.z3.TRANSPARENT && com.tencent.mm.plugin.appbrand.page.wd.AUTO_RE_LAUNCH == wdVar;
    }

    public boolean Z() {
        return true;
    }

    public boolean a(int i17, java.lang.String str) {
        return false;
    }

    @Override // ni1.d
    public boolean d(java.lang.String str, java.lang.String str2, int[] iArr) {
        return false;
    }

    @Override // ni1.d
    public boolean e(java.lang.String str, java.lang.String str2, int i17) {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.d7
    public android.view.View f(android.view.LayoutInflater layoutInflater) {
        return new android.widget.FrameLayout(layoutInflater.getContext().getApplicationContext());
    }

    @Override // com.tencent.mm.plugin.appbrand.page.d7
    public boolean g() {
        if (android.text.TextUtils.isEmpty(this.f86375m)) {
            this.f86375m = ((com.tencent.luggage.sdk.jsapi.component.b) F()).X1();
            ((com.tencent.luggage.sdk.jsapi.component.b) F()).Y1();
        } else {
            java.lang.String str = this.f86375m;
            java.lang.String X1 = ((com.tencent.luggage.sdk.jsapi.component.b) F()).X1();
            if ((str != null || X1 != null) && (str == null || !str.equals(X1))) {
                throw new iz5.d("", str, X1);
            }
        }
        return !((com.tencent.luggage.sdk.jsapi.component.b) F()).M0().c(this.f86375m, true);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.d7
    public final com.tencent.mm.plugin.appbrand.page.ia getCustomViewContainer() {
        return this.f86378p;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.d7
    public final com.tencent.mm.plugin.appbrand.page.ib i() {
        return this.f86377o;
    }

    public boolean j(java.lang.String str, com.tencent.mm.plugin.appbrand.page.wd wdVar) {
        this.f86375m = ((com.tencent.luggage.sdk.jsapi.component.b) F()).X1();
        ((com.tencent.luggage.sdk.jsapi.component.b) F()).Y1();
        if (Z()) {
            com.tencent.mm.plugin.appbrand.page.p8 p8Var = this.f86376n;
            java.util.Objects.requireNonNull(p8Var);
            G(ni1.h.class, new com.tencent.mm.plugin.appbrand.page.e(this, (com.tencent.mm.plugin.appbrand.page.v5) F(), p8Var));
        }
        this.f86378p.v(new com.tencent.mm.plugin.appbrand.page.c(this));
        ((com.tencent.luggage.sdk.jsapi.component.b) F()).Z0(wdVar);
        if (Q()) {
            java.util.Objects.requireNonNull((com.tencent.luggage.sdk.jsapi.component.b) F());
            java.util.Objects.requireNonNull(((com.tencent.luggage.sdk.jsapi.component.b) F()).M1());
            java.util.Objects.requireNonNull(((com.tencent.luggage.sdk.jsapi.component.b) F()).t3());
            this.f86372g.setBackgroundColor(K(((com.tencent.luggage.sdk.jsapi.component.b) F()).M1(), ((com.tencent.luggage.sdk.jsapi.component.b) F()).t3().m0().g(), ((com.tencent.luggage.sdk.jsapi.component.b) F()).t3().u0().r(), false));
        }
        com.tencent.mm.plugin.appbrand.page.tb tbVar = new com.tencent.mm.plugin.appbrand.page.tb((com.tencent.mm.plugin.appbrand.page.v5) F());
        G(ni1.a.class, tbVar);
        al1.b r17 = tbVar.f87126a.r1();
        kotlin.jvm.internal.o.f(r17, "getActionBar(...)");
        tbVar.a(r17);
        if (g()) {
            com.tencent.mars.xlog.Log.e("Luggage.AbstractMPPageViewRenderer", "Empty page content, appId[%s] url[%s], abort inject", H(), str);
            V(str);
            return false;
        }
        if (Y(wdVar)) {
            this.f86379q = new com.tencent.mm.plugin.appbrand.page.bd(J().f74795d, (com.tencent.mm.plugin.appbrand.page.v5) F());
        }
        W();
        if (!this.f86373h) {
            try {
                N("injectAppSharedPageFrameScript").d();
                this.f86373h = true;
            } catch (com.tencent.mm.plugin.appbrand.appcache.t6 unused) {
            }
        }
        java.lang.String str2 = this.f86375m;
        try {
            N(java.lang.String.format(java.util.Locale.ENGLISH, "injectModuleSharedPageFrameScript(%s)", str2)).a(str2);
        } catch (com.tencent.mm.plugin.appbrand.appcache.t6 unused2) {
            com.tencent.mars.xlog.Log.e("Luggage.AbstractMPPageViewRenderer", "injectModuleSharedPageFrameScript appId[%s] path[%s] ScriptNotFoundException", H(), str2);
        }
        java.lang.String str3 = this.f86375m;
        try {
            N(java.lang.String.format(java.util.Locale.ENGLISH, "injectPageScript(%s)", str3)).b(str3);
        } catch (com.tencent.mm.plugin.appbrand.appcache.t6 unused3) {
            com.tencent.mars.xlog.Log.e("Luggage.AbstractMPPageViewRenderer", "injectPageScript appId[%s] url[%s] ScriptNotFoundException", H(), str3);
        }
        return true;
    }

    @Override // re.a, com.tencent.mm.plugin.appbrand.page.d7
    public void k() {
        super.k();
        this.f86372g.c();
    }

    @Override // re.a, com.tencent.mm.plugin.appbrand.page.d7
    public void m() {
        super.m();
        this.f86377o.l(this.f86372g);
        this.f86372g.destroy();
        this.f86372g = null;
        this.f86371f.removeAllViewsInLayout();
        com.tencent.mm.plugin.appbrand.page.p8 p8Var = this.f86376n;
        if (p8Var != null) {
            p8Var.removeAllViewsInLayout();
            this.f86376n = null;
        }
        this.f86377o = null;
    }

    @Override // re.a, com.tencent.mm.plugin.appbrand.page.d7
    public void n() {
        com.tencent.mm.plugin.appbrand.page.bd bdVar;
        com.tencent.mars.xlog.Log.i("Luggage.AbstractMPPageViewRenderer", "dispatchForeground appId:%s, url:%s, mIsPageReady:%b", H(), this.f86375m, java.lang.Boolean.valueOf(this.f86374i));
        super.n();
        this.f86372g.b();
        ((com.tencent.luggage.sdk.jsapi.component.b) F()).B3();
        if (this.f86374i || (bdVar = this.f86379q) == null) {
            return;
        }
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) this.f86371f;
        if (bdVar.getParent() != frameLayout) {
            android.view.View view = ((com.tencent.luggage.sdk.jsapi.component.b) F()).r1().f5740q;
            boolean z17 = view != null && view.getVisibility() == 0;
            ((com.tencent.luggage.sdk.jsapi.component.b) F()).r1().setLoadingIconVisibility(true);
            ((com.tencent.luggage.sdk.jsapi.component.b) F()).r1().setNavLoadingIconVisibilityResetListener(this.f86379q);
            com.tencent.mm.plugin.appbrand.page.bd bdVar2 = this.f86379q;
            bdVar2.f86445g = z17;
            if (bdVar2.getParent() instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) this.f86379q.getParent()).removeView(this.f86379q);
            }
            frameLayout.addView(this.f86379q, new android.widget.FrameLayout.LayoutParams(-1, -1));
        }
        com.tencent.mm.plugin.appbrand.page.bd bdVar3 = this.f86379q;
        android.content.Context I = I();
        al1.l lVar = bdVar3.f86443e;
        if (lVar != null) {
            lVar.D(I);
        }
        this.f86379q.b();
        this.f86379q.bringToFront();
        com.tencent.mars.xlog.Log.i("Luggage.AbstractMPPageViewRenderer", "revealWaitingReadyCover appId:%s, url:%s", H(), this.f86375m);
    }

    public java.util.Map p() {
        le.a aVar = new le.a();
        aVar.a(new com.tencent.mm.plugin.appbrand.jsapi.o9());
        aVar.a(new qc1.v());
        aVar.a(new qc1.e());
        aVar.a(new qc1.c());
        aVar.a(new qc1.x());
        aVar.a(new qc1.n());
        aVar.a(new qc1.i());
        aVar.a(new qc1.y());
        aVar.a(new qc1.k());
        aVar.a(new qc1.m());
        aVar.a(new be1.f0());
        aVar.a(new be1.g0());
        aVar.a(new be1.d0());
        aVar.a(new be1.a0());
        aVar.a(new nd1.n());
        aVar.a(new nd1.h0());
        aVar.a(new nd1.g0());
        aVar.a(new com.tencent.mm.plugin.appbrand.jsapi.oe());
        aVar.a(new com.tencent.mm.plugin.appbrand.jsapi.picker.l());
        aVar.a(new com.tencent.mm.plugin.appbrand.jsapi.picker.z());
        aVar.a(new nd1.d());
        aVar.a(new com.tencent.mm.plugin.appbrand.jsapi.f6());
        aVar.a(new com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.a());
        aVar.a(new com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.m());
        aVar.a(new com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.l());
        aVar.a(new com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.h());
        aVar.a(new com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.g());
        aVar.a(new com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.j());
        aVar.a(new vb1.m());
        aVar.a(new vb1.p());
        aVar.a(new vb1.w());
        aVar.a(new vb1.y());
        aVar.a(new nd1.c());
        aVar.a(new cb1.m0());
        aVar.a(new cb1.a1());
        aVar.a(new cb1.g());
        aVar.a(new cb1.y0());
        aVar.a(new com.tencent.mm.plugin.appbrand.jsapi.qe());
        aVar.a(new be1.a1());
        aVar.a(new ac1.b());
        aVar.a(new ac1.g());
        aVar.a(new ac1.c());
        aVar.a(new cb1.j0());
        aVar.a(new com.tencent.mm.plugin.appbrand.jsapi.picker.y());
        aVar.a(new com.tencent.mm.plugin.appbrand.jsapi.picker.c0());
        aVar.a(new com.tencent.mm.plugin.appbrand.jsapi.pe());
        aVar.a(new com.tencent.mm.plugin.appbrand.jsapi.coverview.e0());
        aVar.a(new com.tencent.mm.plugin.appbrand.jsapi.coverview.p0());
        aVar.a(new com.tencent.mm.plugin.appbrand.jsapi.coverview.k0());
        aVar.a(new com.tencent.mm.plugin.appbrand.jsapi.coverview.u());
        aVar.a(new com.tencent.mm.plugin.appbrand.jsapi.coverview.m0());
        aVar.a(new com.tencent.mm.plugin.appbrand.jsapi.coverview.i0());
        aVar.a(new tb1.k0());
        aVar.a(new tb1.t0());
        aVar.a(new tb1.s0());
        aVar.a(new com.tencent.mm.plugin.appbrand.debugger.l0());
        aVar.a(new com.tencent.mm.plugin.appbrand.jsapi.coverview.n());
        aVar.a(new nd1.r0());
        aVar.a(new com.tencent.mm.plugin.appbrand.jsapi.coverview.x());
        aVar.a(new com.tencent.mm.plugin.appbrand.jsapi.coverview.o0());
        aVar.a(new com.tencent.mm.plugin.appbrand.jsapi.coverview.j0());
        aVar.a(new nd1.j1());
        aVar.a(new nd1.d1());
        aVar.a(new nd1.c2());
        aVar.a(new nd1.j());
        aVar.a(new nd1.t0());
        aVar.a(new nd1.s0());
        java.util.ArrayList arrayList = (java.util.ArrayList) uc1.h2.a();
        if (arrayList.size() > 0) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                aVar.a((com.tencent.mm.plugin.appbrand.jsapi.k0) it.next());
            }
        }
        aVar.a(new le1.i());
        aVar.a(new le1.c());
        aVar.a(new nd1.a2());
        aVar.a(new nd1.h());
        aVar.a(new le1.k());
        aVar.a(new le1.f());
        aVar.a(new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.s());
        aVar.a(new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.n());
        aVar.a(new nd1.h1());
        aVar.a(new com.tencent.mm.plugin.appbrand.jsapi.storage.l());
        aVar.a(new com.tencent.mm.plugin.appbrand.jsapi.storage.z());
        aVar.a(new com.tencent.mm.plugin.appbrand.jsapi.storage.e0());
        aVar.a(new com.tencent.mm.plugin.appbrand.jsapi.storage.m());
        aVar.a(new be1.b0());
        aVar.a(new be1.w0());
        aVar.a(new be1.j0());
        aVar.a(new be1.x0());
        aVar.a(new nd1.i2());
        aVar.a(new ud1.b());
        aVar.a(new com.tencent.mm.plugin.appbrand.jsapi.file.x0());
        aVar.a(new nd1.k2());
        aVar.a(new nd1.k1());
        aVar.a(new nd1.j0());
        aVar.a(new com.tencent.mm.plugin.appbrand.jsapi.d6());
        aVar.a(new com.tencent.mm.plugin.appbrand.jsapi.e6());
        aVar.a(new com.tencent.mm.plugin.appbrand.jsapi.webrtc.i());
        aVar.a(new com.tencent.mm.plugin.appbrand.jsapi.webrtc.v());
        aVar.a(new com.tencent.mm.plugin.appbrand.jsapi.webrtc.n());
        aVar.a(new com.tencent.mm.plugin.appbrand.jsapi.file.b1());
        return aVar.f318110a;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.d7
    public android.widget.RelativeLayout.LayoutParams q(android.view.View view, android.view.View view2) {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        if (view2 != null) {
            if (view2.getId() == -1) {
                view2.setId(com.tencent.mm.R.id.f483178yr);
            }
            layoutParams.addRule(2, view2.getId());
        }
        return layoutParams;
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.a
    public java.lang.Object r(java.lang.Class cls) {
        return com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader.class.equals(cls) ? cls.cast(((com.tencent.luggage.sdk.jsapi.component.b) F()).x()) : cls.isInstance(this) ? cls.cast(this) : super.r(cls);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.d7
    public boolean t() {
        return false;
    }

    @Override // re.a, com.tencent.mm.plugin.appbrand.page.d7
    public void v() {
        G(ni1.e.class, new com.tencent.mm.plugin.appbrand.page.dc((com.tencent.mm.plugin.appbrand.page.v5) F()));
        G(ni1.j.class, new com.tencent.mm.plugin.appbrand.page.ad((com.tencent.mm.plugin.appbrand.page.v5) F()));
        G(ni1.h.class, (ni1.h) java.lang.reflect.Proxy.newProxyInstance(ni1.h.class.getClassLoader(), new java.lang.Class[]{ni1.h.class}, new com.tencent.mm.plugin.appbrand.page.h()));
        com.tencent.mm.plugin.appbrand.page.v5 pv6 = (com.tencent.mm.plugin.appbrand.page.v5) F();
        kotlin.jvm.internal.o.g(pv6, "pv");
        re.b bVar = new re.b(pv6, null);
        pv6.U(bVar);
        pv6.R(bVar);
        pv6.w(bVar);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.d7
    public void x() {
        com.tencent.mars.xlog.Log.i("Luggage.AbstractMPPageViewRenderer", "dispatchPageReady appId:%s, url:%s", H(), this.f86375m);
        this.f86374i = true;
        com.tencent.mm.plugin.appbrand.page.bd bdVar = this.f86379q;
        if (bdVar != null) {
            bdVar.setVisibility(8);
            com.tencent.mm.plugin.appbrand.page.bd bdVar2 = this.f86379q;
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            if (n3.x0.b(bdVar2)) {
                ((com.tencent.luggage.sdk.jsapi.component.b) F()).r1().setNavLoadingIconVisibilityResetListener(null);
                ((com.tencent.luggage.sdk.jsapi.component.b) F()).r1().setLoadingIconVisibility(this.f86379q.f86445g);
                ((android.view.ViewGroup) this.f86379q.getParent()).removeView(this.f86379q);
                com.tencent.mars.xlog.Log.i("Luggage.AbstractMPPageViewRenderer", "dismissWaitingReadyCover appId:%s, url:%s", H(), this.f86375m);
            }
            com.tencent.mm.plugin.appbrand.page.bd bdVar3 = this.f86379q;
            bdVar3.removeAllViews();
            al1.b bVar = bdVar3.f86444f;
            if (bVar != null) {
                bVar.f();
            }
            this.f86379q = null;
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.d7
    public void z(android.view.View view) {
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view;
        this.f86371f = frameLayout;
        frameLayout.addOnAttachStateChangeListener(new com.tencent.mm.plugin.appbrand.page.b(this));
        this.f86377o = new com.tencent.mm.plugin.appbrand.widget.input.t5((com.tencent.mm.plugin.appbrand.page.v5) F());
        if (this.f86372g == null) {
            ((com.tencent.luggage.sdk.jsapi.component.b) F()).n0();
        }
        this.f86372g.i(I());
        this.f86372g.setFullscreenImpl(((com.tencent.luggage.sdk.jsapi.component.b) F()).C1());
        this.f86372g.setOnScrollChangedListener(this.f86377o);
        this.f86372g.setWebViewLayoutListener(this.f86377o);
        ((com.tencent.mm.plugin.appbrand.widget.input.t5) this.f86377o).b(this.f86372g);
        if (Z()) {
            com.tencent.mm.plugin.appbrand.page.p8 p8Var = new com.tencent.mm.plugin.appbrand.page.p8(J() != null ? J().f74795d : I(), this.f86372g);
            this.f86376n = p8Var;
            p8Var.addView(((com.tencent.mm.plugin.appbrand.widget.input.t5) this.f86377o).f91665e);
            this.f86376n.setOnPullDownOffsetListener(this.f86377o);
            this.f86376n.setOnPullDownListener(new com.tencent.mm.plugin.appbrand.page.a$$a(this));
            this.f86371f.addView(this.f86376n);
        } else {
            this.f86376n = null;
            this.f86371f.addView(this.f86372g.getWrapperView());
            this.f86371f.addView(((com.tencent.mm.plugin.appbrand.widget.input.t5) this.f86377o).f91665e);
        }
        com.tencent.mm.plugin.appbrand.page.ia iaVar = new com.tencent.mm.plugin.appbrand.page.ia(((com.tencent.mm.plugin.appbrand.widget.input.t5) this.f86377o).f91665e);
        this.f86378p = iaVar;
        xi1.m C1 = ((com.tencent.luggage.sdk.jsapi.component.b) F()).C1();
        iaVar.f86764h = C1;
        C1.d(new com.tencent.mm.plugin.appbrand.page.z9(iaVar));
    }
}

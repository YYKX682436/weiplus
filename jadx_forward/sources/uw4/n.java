package uw4;

/* loaded from: classes8.dex */
public class n extends com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 implements pf.b {
    public final android.os.Handler G;
    public sd.o0 H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f513278J;
    public java.lang.ref.WeakReference K;
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.r1 L;
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.d0 M;
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.q1 N;

    public n(android.content.Context context) {
        super(context, null);
        this.f513278J = false;
        this.L = new uw4.l(this);
        this.M = new uw4.m(this);
        this.N = new uw4.e(this);
        new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.d(null);
        this.G = new android.os.Handler(android.os.Looper.getMainLooper());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageMMWebViewCoreImpl", "config, xweb check update");
        ((th0.a0) ((sh0.e) i95.n0.c(sh0.e.class))).wi(getContext());
        if (!fp.h.c(19)) {
            try {
                java.lang.Object a17 = new yo.b(new yo.b(new yo.b(new yo.b(new yo.b(new yo.b(this, "mSysWebView", null).a(), "mProvider", null).a(), "mWebViewCore", null).a(), "sWebCoreHandler", null).a(), "mLooper", null).a(), "mThread", null).a();
                if (a17 instanceof java.lang.Thread) {
                    java.lang.Thread thread = (java.lang.Thread) a17;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageMMWebViewCoreImpl", "tryInterruptAwaitingWebCoreThread, webCoreThread.getState = %s", thread.getState());
                    if (thread.getState() == java.lang.Thread.State.WAITING) {
                        thread.interrupt();
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuggageMMWebViewCoreImpl", "tryInterruptAwaitingWebCoreThread, exception = %s", e17);
            }
        }
        mo120153xd15cf999().P(true);
        mo120153xd15cf999().G(true);
        mo120153xd15cf999().z(true);
        mo120153xd15cf999().M(false);
        mo120153xd15cf999().L(false);
        mo120153xd15cf999().C(true);
        mo120153xd15cf999().D(true);
        mo120153xd15cf999().E(true);
        mo120153xd15cf999().J(0);
        mo120153xd15cf999().l(10485760L);
        mo120153xd15cf999().m(getContext().getDir("webviewcache", 0).getAbsolutePath());
        mo120153xd15cf999().k(true);
        mo120153xd15cf999().t(true);
        mo120153xd15cf999().u(lp0.b.X() + "databases/");
        com.p314xaae8f345.p3210x3857dc.d.g().d(true);
        com.p314xaae8f345.p3210x3857dc.d.g().f(this, true);
        mo120153xd15cf999().Q(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.b(getContext(), mo120153xd15cf999().g()) + " Luggage");
        mo120158xfb86a31b().setHorizontalScrollBarEnabled(false);
        mo120158xfb86a31b().setVerticalScrollBarEnabled(false);
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        super.mo74800x23d27c02(this.L);
        super.mo81410x6fd49b97(this.M);
        super.mo120190xd6bb225d(this.N);
        F0();
    }

    public void M0() {
        if (m170656x86b160dd().f488169o != null) {
            m170656x86b160dd().f488169o.a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.c0());
            m170656x86b160dd().f488169o.a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.y(ik1.f.e("luggage_mm_adapter.js")));
        }
    }

    public void N0(java.lang.Runnable runnable) {
        if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            this.G.post(runnable);
        }
    }

    public void a0(pf.a aVar) {
        N0(new uw4.g(this, aVar));
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27816xac2547f9, tx5.f
    /* renamed from: addJavascriptInterface */
    public void mo120128x74041feb(java.lang.Object obj, java.lang.String str) {
        super.mo120128x74041feb(obj, str);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27816xac2547f9, tx5.f
    /* renamed from: canGoBack */
    public boolean mo120129xed1a21df() {
        return super.mo120129xed1a21df();
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59, com.p314xaae8f345.p3210x3857dc.C27816xac2547f9, tx5.f
    /* renamed from: destroy */
    public void mo52095x5cd39ffa() {
        if (this.f513278J) {
            return;
        }
        try {
            try {
                super.mo52095x5cd39ffa();
            } catch (java.lang.NullPointerException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LuggageMMWebViewCoreImpl", e17, "destroy()", new java.lang.Object[0]);
            }
        } finally {
            this.f513278J = true;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59, com.p314xaae8f345.p3210x3857dc.C27816xac2547f9, tx5.f, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0
    /* renamed from: evaluateJavascript */
    public void mo14660x738236e6(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        N0(new uw4.f(this, str, valueCallback));
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27816xac2547f9, tx5.f
    /* renamed from: getTitle */
    public java.lang.String mo64579x7531c8a2() {
        return super.mo64579x7531c8a2();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27816xac2547f9, tx5.f
    /* renamed from: getUrl */
    public java.lang.String mo120156xb5887639() {
        return super.mo120156xb5887639();
    }

    @Override // od.p
    /* renamed from: getUserAgent */
    public java.lang.String mo32054x11fd7f44() {
        return mo120153xd15cf999().g();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27816xac2547f9, tx5.f
    /* renamed from: getView */
    public android.view.View mo120158xfb86a31b() {
        return this;
    }

    /* renamed from: getWebCore */
    public sd.o0 m170656x86b160dd() {
        return this.H;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27816xac2547f9, tx5.f
    /* renamed from: goBack */
    public void mo120168xb5fed1ef() {
        super.mo120168xb5fed1ef();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27816xac2547f9, tx5.f
    /* renamed from: loadData */
    public void mo74798x6dfa45b0(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        uw4.j jVar = new uw4.j(this, str, str2, str3);
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            jVar.run();
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(jVar);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59, com.p314xaae8f345.p3210x3857dc.C27816xac2547f9, tx5.f, pf.b
    /* renamed from: loadUrl */
    public void mo32265x141096a9(java.lang.String str) {
        uw4.h hVar = new uw4.h(this, str);
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            hVar.run();
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(hVar);
        }
    }

    @Override // pf.b
    /* renamed from: setContext */
    public void mo32267xe9f5beed(android.content.Context context) {
        if (getContext() instanceof android.content.MutableContextWrapper) {
            ((android.content.MutableContextWrapper) getContext()).setBaseContext(context);
        }
    }

    /* renamed from: setPage */
    public void m170657x764e9211(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var) {
        this.K = new java.lang.ref.WeakReference(e0Var);
    }

    /* renamed from: setSource */
    public void m170658x22dcbf1d(java.lang.String str) {
        this.I = str;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59, com.p314xaae8f345.p3210x3857dc.C27816xac2547f9, tx5.f
    /* renamed from: setWebChromeClient */
    public void mo81410x6fd49b97(com.p314xaae8f345.p3210x3857dc.s0 s0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.d0 d0Var = this.M;
        if (s0Var != null) {
            d0Var.f263696a = s0Var;
        } else {
            d0Var.getClass();
        }
    }

    /* renamed from: setWebChromeClientProxy */
    public void m170659xda1ce517(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.d0 d0Var) {
        if (d0Var != null) {
            this.M.f263696a = d0Var;
            this.M = d0Var;
        }
    }

    @Override // pf.b
    /* renamed from: setWebCore */
    public void mo32268xfa22ae51(sd.o0 o0Var) {
        this.H = o0Var;
        M0();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27816xac2547f9, tx5.f
    /* renamed from: setWebViewClient */
    public void mo74800x23d27c02(com.p314xaae8f345.p3210x3857dc.h1 h1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.r1 r1Var = this.L;
        if (h1Var != null) {
            r1Var.f264145a = h1Var;
        } else {
            r1Var.getClass();
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27816xac2547f9, tx5.f
    /* renamed from: setWebViewClientExtension */
    public void mo120190xd6bb225d(com.p314xaae8f345.p3210x3857dc.p3215x21ffc6bd.C27839xa92bc749 c27839xa92bc749) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.q1 q1Var = this.N;
        if (c27839xa92bc749 != null) {
            q1Var.f264135a = c27839xa92bc749;
        } else {
            q1Var.getClass();
        }
    }

    /* renamed from: setWebViewClientExtensionProxy */
    public void m170660xce39aa11(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.q1 q1Var) {
        if (q1Var != null) {
            this.N.f264135a = q1Var;
            this.N = q1Var;
        }
    }

    /* renamed from: setWebViewClientProxy */
    public void m170661x10618f8c(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.r1 r1Var) {
        if (r1Var != null) {
            this.L.f264145a = r1Var;
            this.L = r1Var;
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27816xac2547f9, tx5.f
    /* renamed from: stopLoading */
    public void mo120194xc77ccada() {
        super.mo120194xc77ccada();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27816xac2547f9, tx5.f, pf.b
    /* renamed from: loadUrl */
    public void mo32266x141096a9(java.lang.String str, java.util.Map map) {
        uw4.i iVar = new uw4.i(this, str, map);
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            iVar.run();
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(iVar);
        }
    }
}

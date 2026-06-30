package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public final class ed extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.na implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.dd {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f168112e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.cd f168113f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.x9 f168114g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f168115h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f168116i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f168117m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f168118n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f168119o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f168120p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f168121q;

    /* renamed from: r, reason: collision with root package name */
    public long f168122r;

    public ed(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb fbVar) {
        super(fbVar);
        this.f168115h = false;
        this.f168116i = false;
        this.f168117m = new java.util.LinkedList();
        this.f168118n = false;
        this.f168119o = false;
        this.f168120p = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f168121q = null;
        this.f168122r = 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fd fdVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fd(this, null);
        this.f168114g = fdVar;
        fbVar.mo52160xdeb845bc(fdVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb fbVar2 = this.f168460d;
        if (fbVar2.h0(ni1.f.class) != null) {
            return;
        }
        fbVar2.mo14675x9d811b77(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.gd(this));
    }

    public static void s(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ed edVar) {
        edVar.f168460d.mo14659x5cd39ffa();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.dd
    public void D() {
        this.f168118n = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.x9 x9Var = this.f168114g;
        java.lang.String a17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.uc) this.f168113f).a();
        this.f168121q = a17;
        x9Var.f168788c = a17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb fbVar = this.f168460d;
        if (fbVar.h0(ni1.f.class) == null) {
            fbVar.mo14675x9d811b77(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.gd(this));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.MPWebViewRenderEngineLegacyImpl", "dispatchInit %s, mPageFrameReady %b, mPageFrameLoaded %b", this.f168121q, java.lang.Boolean.valueOf(this.f168115h), java.lang.Boolean.valueOf(this.f168116i));
        t(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ld ldVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ld(this);
        if (!this.f168115h) {
            this.f168117m.addLast(ldVar);
        } else {
            u();
            ldVar.run();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.dd
    public void J(java.lang.Runnable runnable) {
        if (!this.f168115h) {
            this.f168117m.addLast(runnable);
        } else {
            u();
            runnable.run();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t
    public final void R(java.net.URL url, java.lang.String str, android.webkit.ValueCallback valueCallback) {
        if (!android.text.TextUtils.isEmpty(str) && !this.f168120p.get()) {
            ik1.h0.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.id(this, url, str, valueCallback));
        } else if (valueCallback != null) {
            valueCallback.onReceiveValue("FATAL");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.dd
    public void X(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        if (this.f168115h) {
            this.f168460d.mo14660x738236e6(str, valueCallback);
        } else {
            this.f168117m.addLast(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.jd(this, str, valueCallback));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.dd
    public boolean Y() {
        return this.f168118n;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    public void b() {
        this.f168460d.b();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    public void c() {
        this.f168460d.c();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t
    /* renamed from: destroy */
    public void mo14659x5cd39ffa() {
        if (this.f168120p.getAndSet(true)) {
            return;
        }
        boolean z17 = this.f168112e.t3() instanceof ze.n;
        java.util.LinkedList linkedList = this.f168117m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb fbVar = this.f168460d;
        if (z17 && ((ze.n) this.f168112e.t3()).b2()) {
            linkedList.clear();
            fbVar.mo14660x738236e6("\n        ;(function() {\n            let data = (globalThis || {}).__coverage__ || new Function(\"return this\")().__coverage__;\n            if (typeof data === 'string' || typeof data === 'undefined') {\n                return data;\n            } else {\n                return JSON.stringify(data);\n            }\n        })();\n    ", new android.webkit.ValueCallback() { // from class: com.tencent.mm.plugin.appbrand.page.ed$$a
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(java.lang.Object obj) {
                    final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ed edVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ed.this;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.x1.a(edVar.f168112e, edVar, (java.lang.String) obj);
                    ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.page.ed$$b
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ed.s(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ed.this);
                        }
                    });
                }
            });
        } else {
            fbVar.mo14659x5cd39ffa();
            linkedList.clear();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0
    /* renamed from: evaluateJavascript */
    public final void mo14660x738236e6(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        R(null, str, valueCallback);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    /* renamed from: getPageView */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 mo52157xaf156f4a() {
        return this.f168112e;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.dd
    public boolean i0() {
        return this.f168119o;
    }

    @Override // se.a
    public boolean m() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.dd
    public boolean q() {
        return this.f168115h;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    /* renamed from: setAppBrandInfo */
    public void mo14670xce3b1136(java.util.Map map) {
        this.f168460d.mo14670xce3b1136(map);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    /* renamed from: setDisableContextMenuItems */
    public void mo52158xb80428f8(int i17) {
        this.f168460d.mo52158xb80428f8(i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    /* renamed from: setOnTrimListener */
    public void mo14675x9d811b77(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ka kaVar) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final void t(boolean z17) {
        java.lang.String str;
        if (this.f168116i) {
            return;
        }
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f168122r = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.uc ucVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.uc) this.f168113f;
        if (z17) {
            ucVar.getClass();
            str = com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.o.f128890i0 + "preload/page-frame.html";
        } else {
            str = ucVar.a() + "page-frame.html";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wc wcVar = ucVar.f168683d;
        java.lang.String M = ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) wcVar.F()).x().M("WAPageFrame.html");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.MPPageViewRenderer", "loadPageFrame url[%s] preload[%b]", str, java.lang.Boolean.valueOf(z17));
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.g(wcVar.H(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35228x2691f522);
            wcVar.f0().J(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.tc(ucVar));
        }
        wcVar.f0().g0(str, M);
        this.f168116i = true;
        if (z17) {
            this.f168118n = true;
        }
    }

    public final void u() {
        java.util.LinkedList linkedList = this.f168117m;
        java.util.LinkedList linkedList2 = new java.util.LinkedList(linkedList);
        linkedList.clear();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.MPWebViewRenderEngineLegacyImpl", "executeDeferredEvaluations %s size %d, hash[%d]", this.f168121q, java.lang.Integer.valueOf(linkedList2.size()), java.lang.Integer.valueOf(hashCode()));
        cf.i.b("executeDeferredEvaluations", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.hd(this, linkedList2));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.dd
    public void x() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.MPWebViewRenderEngineLegacyImpl", "dispatchPreload");
        t(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.kd kdVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.kd(this);
        if (!this.f168115h) {
            this.f168117m.addLast(kdVar);
        } else {
            u();
            kdVar.run();
        }
    }
}

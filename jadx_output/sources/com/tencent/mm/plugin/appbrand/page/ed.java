package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class ed extends com.tencent.mm.plugin.appbrand.page.na implements com.tencent.mm.plugin.appbrand.page.dd {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.v5 f86579e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.cd f86580f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.page.x9 f86581g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f86582h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f86583i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f86584m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f86585n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f86586o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f86587p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f86588q;

    /* renamed from: r, reason: collision with root package name */
    public long f86589r;

    public ed(com.tencent.mm.plugin.appbrand.page.fb fbVar) {
        super(fbVar);
        this.f86582h = false;
        this.f86583i = false;
        this.f86584m = new java.util.LinkedList();
        this.f86585n = false;
        this.f86586o = false;
        this.f86587p = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f86588q = null;
        this.f86589r = 0L;
        com.tencent.mm.plugin.appbrand.page.fd fdVar = new com.tencent.mm.plugin.appbrand.page.fd(this, null);
        this.f86581g = fdVar;
        fbVar.setAppBrandWebViewClient(fdVar);
        com.tencent.mm.plugin.appbrand.page.fb fbVar2 = this.f86927d;
        if (fbVar2.h0(ni1.f.class) != null) {
            return;
        }
        fbVar2.setOnTrimListener(new com.tencent.mm.plugin.appbrand.page.gd(this));
    }

    public static void s(com.tencent.mm.plugin.appbrand.page.ed edVar) {
        edVar.f86927d.destroy();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.dd
    public void D() {
        this.f86585n = false;
        com.tencent.mm.plugin.appbrand.page.x9 x9Var = this.f86581g;
        java.lang.String a17 = ((com.tencent.mm.plugin.appbrand.page.uc) this.f86580f).a();
        this.f86588q = a17;
        x9Var.f87255c = a17;
        com.tencent.mm.plugin.appbrand.page.fb fbVar = this.f86927d;
        if (fbVar.h0(ni1.f.class) == null) {
            fbVar.setOnTrimListener(new com.tencent.mm.plugin.appbrand.page.gd(this));
        }
        com.tencent.mars.xlog.Log.i("Luggage.MPWebViewRenderEngineLegacyImpl", "dispatchInit %s, mPageFrameReady %b, mPageFrameLoaded %b", this.f86588q, java.lang.Boolean.valueOf(this.f86582h), java.lang.Boolean.valueOf(this.f86583i));
        t(false);
        com.tencent.mm.plugin.appbrand.page.ld ldVar = new com.tencent.mm.plugin.appbrand.page.ld(this);
        if (!this.f86582h) {
            this.f86584m.addLast(ldVar);
        } else {
            u();
            ldVar.run();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.dd
    public void J(java.lang.Runnable runnable) {
        if (!this.f86582h) {
            this.f86584m.addLast(runnable);
        } else {
            u();
            runnable.run();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public final void R(java.net.URL url, java.lang.String str, android.webkit.ValueCallback valueCallback) {
        if (!android.text.TextUtils.isEmpty(str) && !this.f86587p.get()) {
            ik1.h0.b(new com.tencent.mm.plugin.appbrand.page.id(this, url, str, valueCallback));
        } else if (valueCallback != null) {
            valueCallback.onReceiveValue("FATAL");
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.dd
    public void X(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        if (this.f86582h) {
            this.f86927d.evaluateJavascript(str, valueCallback);
        } else {
            this.f86584m.addLast(new com.tencent.mm.plugin.appbrand.page.jd(this, str, valueCallback));
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.dd
    public boolean Y() {
        return this.f86585n;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void b() {
        this.f86927d.b();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void c() {
        this.f86927d.c();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb, com.tencent.mm.plugin.appbrand.jsruntime.t
    public void destroy() {
        if (this.f86587p.getAndSet(true)) {
            return;
        }
        boolean z17 = this.f86579e.t3() instanceof ze.n;
        java.util.LinkedList linkedList = this.f86584m;
        com.tencent.mm.plugin.appbrand.page.fb fbVar = this.f86927d;
        if (z17 && ((ze.n) this.f86579e.t3()).b2()) {
            linkedList.clear();
            fbVar.evaluateJavascript("\n        ;(function() {\n            let data = (globalThis || {}).__coverage__ || new Function(\"return this\")().__coverage__;\n            if (typeof data === 'string' || typeof data === 'undefined') {\n                return data;\n            } else {\n                return JSON.stringify(data);\n            }\n        })();\n    ", new android.webkit.ValueCallback() { // from class: com.tencent.mm.plugin.appbrand.page.ed$$a
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(java.lang.Object obj) {
                    final com.tencent.mm.plugin.appbrand.page.ed edVar = com.tencent.mm.plugin.appbrand.page.ed.this;
                    com.tencent.mm.plugin.appbrand.jsapi.x1.a(edVar.f86579e, edVar, (java.lang.String) obj);
                    ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.page.ed$$b
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.tencent.mm.plugin.appbrand.page.ed.s(com.tencent.mm.plugin.appbrand.page.ed.this);
                        }
                    });
                }
            });
        } else {
            fbVar.destroy();
            linkedList.clear();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.c0
    public final void evaluateJavascript(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        R(null, str, valueCallback);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public com.tencent.mm.plugin.appbrand.page.v5 getPageView() {
        return this.f86579e;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.dd
    public boolean i0() {
        return this.f86586o;
    }

    @Override // se.a
    public boolean m() {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.dd
    public boolean q() {
        return this.f86582h;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void setAppBrandInfo(java.util.Map map) {
        this.f86927d.setAppBrandInfo(map);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void setDisableContextMenuItems(int i17) {
        this.f86927d.setDisableContextMenuItems(i17);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void setOnTrimListener(com.tencent.mm.plugin.appbrand.page.ka kaVar) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final void t(boolean z17) {
        java.lang.String str;
        if (this.f86583i) {
            return;
        }
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f86589r = android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.plugin.appbrand.page.uc ucVar = (com.tencent.mm.plugin.appbrand.page.uc) this.f86580f;
        if (z17) {
            ucVar.getClass();
            str = com.tencent.luggage.sdk.jsapi.component.o.f47357i0 + "preload/page-frame.html";
        } else {
            str = ucVar.a() + "page-frame.html";
        }
        com.tencent.mm.plugin.appbrand.page.wc wcVar = ucVar.f87150d;
        java.lang.String M = ((com.tencent.luggage.sdk.jsapi.component.b) wcVar.F()).x().M("WAPageFrame.html");
        com.tencent.mars.xlog.Log.i("Luggage.MPPageViewRenderer", "loadPageFrame url[%s] preload[%b]", str, java.lang.Boolean.valueOf(z17));
        if (!z17) {
            com.tencent.mm.plugin.appbrand.keylogger.w.g(wcVar.H(), com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepInjectWAPageFrameHtml);
            wcVar.f0().J(new com.tencent.mm.plugin.appbrand.page.tc(ucVar));
        }
        wcVar.f0().g0(str, M);
        this.f86583i = true;
        if (z17) {
            this.f86585n = true;
        }
    }

    public final void u() {
        java.util.LinkedList linkedList = this.f86584m;
        java.util.LinkedList linkedList2 = new java.util.LinkedList(linkedList);
        linkedList.clear();
        com.tencent.mars.xlog.Log.i("Luggage.MPWebViewRenderEngineLegacyImpl", "executeDeferredEvaluations %s size %d, hash[%d]", this.f86588q, java.lang.Integer.valueOf(linkedList2.size()), java.lang.Integer.valueOf(hashCode()));
        cf.i.b("executeDeferredEvaluations", new com.tencent.mm.plugin.appbrand.page.hd(this, linkedList2));
    }

    @Override // com.tencent.mm.plugin.appbrand.page.dd
    public void x() {
        com.tencent.mars.xlog.Log.i("Luggage.MPWebViewRenderEngineLegacyImpl", "dispatchPreload");
        t(true);
        com.tencent.mm.plugin.appbrand.page.kd kdVar = new com.tencent.mm.plugin.appbrand.page.kd(this);
        if (!this.f86582h) {
            this.f86584m.addLast(kdVar);
        } else {
            u();
            kdVar.run();
        }
    }
}

package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public abstract class w9 extends com.tencent.xweb.WebView implements com.tencent.mm.plugin.appbrand.page.fb, sf.g, ni1.f, cf.h {
    public gg.c A;
    public boolean B;
    public com.tencent.mm.plugin.appbrand.page.oa C;
    public final java.util.LinkedList D;
    public final com.tencent.xweb.h1 E;
    public final com.tencent.xweb.s0 F;
    public final com.tencent.xweb.g1 G;
    public final com.tencent.xweb.internal.ProxyWebViewClientExtension H;
    public java.lang.Boolean I;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.ma f87202s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.ja f87203t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.la f87204u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.x9 f87205v;

    /* renamed from: w, reason: collision with root package name */
    public xi1.m f87206w;

    /* renamed from: x, reason: collision with root package name */
    public android.animation.Animator f87207x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f87208y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f87209z;

    static {
        hm1.b[] bVarArr = hm1.b.f282193d;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandXWebSameLayerPluginInstaller", "<clinit>");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w9(android.content.Context r7) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.page.w9.<init>(android.content.Context):void");
    }

    public static com.tencent.xweb.y0 E0(com.tencent.mm.plugin.appbrand.page.w9 w9Var, java.lang.String str) {
        android.webkit.WebResourceResponse a17;
        w9Var.getClass();
        if (android.text.TextUtils.isEmpty(str) || (a17 = w9Var.f87205v.a(str)) == null) {
            return null;
        }
        return new com.tencent.xweb.y0(a17.getMimeType(), a17.getEncoding(), a17.getStatusCode(), a17.getReasonPhrase(), a17.getResponseHeaders(), a17.getData());
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public boolean A() {
        return this.B;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void E(int i17, long j17) {
        android.animation.Animator animator = this.f87207x;
        if (animator != null) {
            animator.cancel();
            this.f87207x = null;
        }
        if (u(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_PROGRESS)) {
            smoothScroll(getWebScrollX(), i17, j17);
            return;
        }
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(getWebScrollY(), i17);
        ofInt.addUpdateListener(new com.tencent.mm.plugin.appbrand.page.q9(this));
        ofInt.setInterpolator(new android.view.animation.DecelerateInterpolator());
        ofInt.setDuration(j17);
        ofInt.start();
        this.f87207x = ofInt;
    }

    public final void F0(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        try {
            super.evaluateJavascript(str, valueCallback);
        } catch (java.lang.IllegalStateException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandWebView", "evaluateJavascript get exception:%s", e17);
        }
    }

    @Override // cf.h
    public final java.lang.String I() {
        return java.lang.String.format(java.util.Locale.ENGLISH, "AppBrandWebView(%s)@%d", com.tencent.mm.plugin.appbrand.report.l1.a(null), java.lang.Integer.valueOf(hashCode()));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public void M(java.net.URL url, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, android.webkit.ValueCallback valueCallback) {
        evaluateJavascript(str3, valueCallback);
    }

    @Override // ni1.f
    public final void P() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWebView", "restoreRendering hash[%d]", java.lang.Integer.valueOf(hashCode()));
        onShow();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public void R(java.net.URL url, java.lang.String str, android.webkit.ValueCallback valueCallback) {
        evaluateJavascript(str, valueCallback);
    }

    @Override // ni1.f
    public final void V() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWebView", "pauseRendering hash[%d]", java.lang.Integer.valueOf(hashCode()));
        onHide();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public boolean b0() {
        java.lang.Boolean bool = this.I;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            if (com.tencent.xweb.WebView.y0()) {
                try {
                    com.tencent.xweb.b3.f220213a = com.tencent.xweb.q2.a("remote-debugging");
                } catch (java.lang.Exception e17) {
                    by5.c4.d("XWebSdkInternal", "getEnableRemoteDebug, xweb error:", e17);
                }
            }
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(com.tencent.xweb.b3.f220213a);
            this.I = valueOf;
            return valueOf.booleanValue();
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    @Override // pq5.a
    public boolean c0(android.graphics.Canvas canvas) {
        if (isXWalkKernel()) {
            s0(canvas);
            return true;
        }
        draw(canvas);
        return true;
    }

    @Override // com.tencent.xweb.WebView, tx5.f
    public void destroy() {
        if (this.f87208y) {
            return;
        }
        java.util.LinkedList linkedList = this.D;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWebView", "fireAllPendingReRenderedTasks size=%d", java.lang.Integer.valueOf(linkedList.size()));
        while (!linkedList.isEmpty()) {
            ((com.tencent.mm.plugin.appbrand.page.v9) linkedList.pollFirst()).run();
        }
        try {
            super.destroy();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandWebView", e17, "[CAUGHT CRASH]", new java.lang.Object[0]);
        }
        android.animation.Animator animator = this.f87207x;
        if (animator != null) {
            animator.cancel();
            this.f87207x = null;
        }
        xi1.m mVar = this.f87206w;
        if (mVar != null) {
            mVar.b(null);
            this.f87206w.release();
        }
        this.f87206w = null;
        try {
            i(getContext().getApplicationContext());
        } catch (java.lang.Exception unused) {
        }
        if (getParent() instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) getParent()).removeView(this);
        }
        this.f87208y = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWebView", "destroyed hash[%d]", java.lang.Integer.valueOf(hashCode()));
    }

    @Override // com.tencent.xweb.WebView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        try {
            super.dispatchDraw(canvas);
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandWebView", "dispatchDraw %s", android.util.Log.getStackTraceString(new java.lang.Throwable()));
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void e0(java.lang.Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (this.f87208y) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandWebView", "postOnReRendered webview destroyed, stack=%s", android.util.Log.getStackTraceString(new java.lang.Throwable()));
            return;
        }
        com.tencent.mm.plugin.appbrand.page.v9 v9Var = new com.tencent.mm.plugin.appbrand.page.v9(this, runnable, null);
        if (isXWalkKernel()) {
            postDelayed(v9Var, 200L);
        } else {
            postOnAnimation(v9Var);
        }
    }

    @Override // com.tencent.xweb.WebView, tx5.f, com.tencent.mm.plugin.appbrand.jsruntime.c0
    public void evaluateJavascript(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            F0(str, valueCallback);
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.page.p9(this, str, valueCallback));
        }
    }

    @Override // com.tencent.xweb.WebView, tx5.f, com.tencent.mm.plugin.appbrand.page.fb
    public android.graphics.Bitmap f() {
        return super.f();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void g0(java.lang.String str, java.lang.String str2) {
        loadDataWithBaseURL(str, str2, "text/html", com.tencent.mapsdk.internal.rv.f51270c, null);
    }

    public com.tencent.mm.plugin.appbrand.page.x9 getAppBrandWebViewClient() {
        return this.f87205v;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public android.view.View getContentView() {
        return super.getView();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public xi1.m getFullscreenImpl() {
        return this.f87206w;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public /* bridge */ /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 getPageView() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public java.lang.String getUserAgentString() {
        return this.f87209z;
    }

    @Override // sf.g
    public gg.c getWebViewPluginClientProxy() {
        return this.A;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public android.view.View getWrapperView() {
        return this;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public final com.tencent.mm.plugin.appbrand.jsruntime.u h0(java.lang.Class cls) {
        if (cls != ni1.f.class) {
            if (cls.isInstance(this)) {
                return (com.tencent.mm.plugin.appbrand.jsruntime.u) cls.cast(this);
            }
            return null;
        }
        hm1.m mVar = hm1.m.f282203a;
        if (u(1040)) {
            return (com.tencent.mm.plugin.appbrand.jsruntime.u) cls.cast(this);
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public abstract void i(android.content.Context context);

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void n(java.lang.String str, com.tencent.mm.plugin.appbrand.page.db dbVar) {
        boolean k17 = com.tencent.xweb.a3.k(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_GET_METADATA);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWebView", "getImageFromDiskCache, url = %s, supportFeature = %b", str, java.lang.Boolean.valueOf(k17));
        if (k17) {
            getImageFromDiskCache(str, new com.tencent.mm.plugin.appbrand.page.k9(this, dbVar, str));
        } else {
            ((com.tencent.mm.plugin.appbrand.jsapi.media.l6) dbVar).a(str, null);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void o0() {
        getView().scrollTo(getWebScrollX(), 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
        } catch (java.lang.SecurityException unused) {
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        com.tencent.mm.plugin.appbrand.page.ja jaVar = this.f87203t;
        if (jaVar != null) {
            jaVar.j(z17, i17, i18, i19, i27);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public boolean p0() {
        return (!isXWalkKernel() || org.xwalk.core.XWalkEnvironment.d() < 472) ? getWebScrollY() == 0 : y();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void setAppBrandInfo(java.util.Map<java.lang.String, java.lang.String> map) {
        com.tencent.mm.plugin.appbrand.page.o9 o9Var = new com.tencent.mm.plugin.appbrand.page.o9(this, map);
        if (android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread()) {
            o9Var.run();
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(o9Var);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void setAppBrandWebViewClient(com.tencent.mm.plugin.appbrand.page.x9 x9Var) {
        this.f87205v = x9Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public /* bridge */ /* synthetic */ void setAppBrandWebViewContentsSizeLogEnabled(boolean z17) {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void setDisableContextMenuItems(int i17) {
        getSettings().x(i17);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void setFullscreenImpl(xi1.m mVar) {
        this.f87206w = mVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public void setJsExceptionHandler(com.tencent.mm.plugin.appbrand.jsruntime.s sVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void setOnScrollChangedListener(com.tencent.mm.plugin.appbrand.page.ma maVar) {
        this.f87202s = maVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void setOnTrimListener(com.tencent.mm.plugin.appbrand.page.ka kaVar) {
    }

    public void setOverScrolledListener(com.tencent.mm.plugin.appbrand.page.la laVar) {
        this.f87204u = laVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void setWebViewLayoutListener(com.tencent.mm.plugin.appbrand.page.ja jaVar) {
        this.f87203t = jaVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void setXWebKeyboardImpl(com.tencent.mm.plugin.appbrand.page.oa oaVar) {
        this.C = oaVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public boolean w() {
        return true;
    }
}

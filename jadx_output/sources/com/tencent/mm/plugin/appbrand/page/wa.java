package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class wa extends android.webkit.WebView implements com.tencent.mm.plugin.appbrand.page.fb {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f87210d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.x9 f87211e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.ma f87212f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.ja f87213g;

    /* renamed from: h, reason: collision with root package name */
    public xi1.m f87214h;

    /* renamed from: i, reason: collision with root package name */
    public android.animation.Animator f87215i;

    public wa(android.content.Context context, com.tencent.mm.plugin.appbrand.page.x9 x9Var) {
        super(context);
        com.tencent.mm.plugin.appbrand.page.va vaVar = new com.tencent.mm.plugin.appbrand.page.va(this);
        android.webkit.WebChromeClient webChromeClient = new android.webkit.WebChromeClient(this) { // from class: com.tencent.mm.plugin.appbrand.page.DefaultWebViewImpl$4
        };
        this.f87211e = x9Var;
        getSettings().setDomStorageEnabled(true);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        getSettings().setMixedContentMode(0);
        getSettings().setUserAgentString(getSettings().getUserAgentString() + "/ DEMO");
        this.f87210d = getSettings().getUserAgentString();
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setWebViewClient(vaVar);
        setWebChromeClient(webChromeClient);
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void E(int i17, long j17) {
        android.animation.Animator animator = this.f87215i;
        if (animator != null) {
            animator.cancel();
            this.f87215i = null;
        }
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(getContentView().getScrollY(), i17);
        ofInt.addUpdateListener(new com.tencent.mm.plugin.appbrand.page.ua(this));
        ofInt.setInterpolator(new android.view.animation.DecelerateInterpolator());
        ofInt.setDuration(j17);
        ofInt.start();
        this.f87215i = ofInt;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public void M(java.net.URL url, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, android.webkit.ValueCallback valueCallback) {
        evaluateJavascript(str3, valueCallback);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void N(int i17, int i18) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public void R(java.net.URL url, java.lang.String str, android.webkit.ValueCallback valueCallback) {
        evaluateJavascript(str, valueCallback);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void b() {
        onResume();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public boolean b0() {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void c() {
        onPause();
    }

    @Override // pq5.a
    public boolean c0(android.graphics.Canvas canvas) {
        draw(canvas);
        return true;
    }

    @Override // android.webkit.WebView, com.tencent.mm.plugin.appbrand.page.fb, com.tencent.mm.plugin.appbrand.jsruntime.t
    public void destroy() {
        super.destroy();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void e0(java.lang.Runnable runnable) {
        if (runnable != null) {
            postOnAnimation(runnable);
        }
    }

    @Override // android.webkit.WebView, com.tencent.mm.plugin.appbrand.jsruntime.c0
    public void evaluateJavascript(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        com.tencent.mm.plugin.appbrand.page.ta taVar = new com.tencent.mm.plugin.appbrand.page.ta(this, str, valueCallback);
        if (android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread()) {
            taVar.run();
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(taVar);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public android.graphics.Bitmap f() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void g0(java.lang.String str, java.lang.String str2) {
        loadDataWithBaseURL(str, str2, "text/html", com.tencent.mapsdk.internal.rv.f51270c, null);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public android.view.View getContentView() {
        return this;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public xi1.m getFullscreenImpl() {
        return this.f87214h;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public /* bridge */ /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 getPageView() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public java.lang.String getUserAgentString() {
        return this.f87210d;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public int getWebScrollX() {
        return getScrollX();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public int getWebScrollY() {
        return getScrollY();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public android.view.View getWrapperView() {
        return this;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public com.tencent.mm.plugin.appbrand.jsruntime.u h0(java.lang.Class cls) {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void i(android.content.Context context) {
        if (getContext() instanceof android.content.MutableContextWrapper) {
            ((android.content.MutableContextWrapper) getContext()).setBaseContext(context);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void n(java.lang.String str, com.tencent.mm.plugin.appbrand.page.db dbVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.DefaultWebViewImpl", "getImageFromDiskCache url:%s", str);
        ((com.tencent.mm.plugin.appbrand.jsapi.media.l6) dbVar).a(str, null);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void o0() {
        scrollTo(getScrollX(), 0);
    }

    @Override // android.widget.AbsoluteLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        com.tencent.mm.plugin.appbrand.page.ja jaVar = this.f87213g;
        if (jaVar != null) {
            jaVar.j(z17, i17, i18, i19, i27);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i17, int i18, int i19, int i27) {
        super.onScrollChanged(i17, i18, i19, i27);
        com.tencent.mm.plugin.appbrand.page.ma maVar = this.f87212f;
        if (maVar != null) {
            maVar.d(i17, i18, i19, i27, this);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public boolean p0() {
        return getWebScrollY() == 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void setAppBrandInfo(java.util.Map<java.lang.String, java.lang.String> map) {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void setAppBrandWebViewClient(com.tencent.mm.plugin.appbrand.page.x9 x9Var) {
        this.f87211e = x9Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public /* bridge */ /* synthetic */ void setAppBrandWebViewContentsSizeLogEnabled(boolean z17) {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public /* bridge */ /* synthetic */ void setDisableContextMenuItems(int i17) {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void setFullscreenImpl(xi1.m mVar) {
        this.f87214h = mVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public void setJsExceptionHandler(com.tencent.mm.plugin.appbrand.jsruntime.s sVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void setOnScrollChangedListener(com.tencent.mm.plugin.appbrand.page.ma maVar) {
        this.f87212f = maVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void setOnTrimListener(com.tencent.mm.plugin.appbrand.page.ka kaVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void setWebViewLayoutListener(com.tencent.mm.plugin.appbrand.page.ja jaVar) {
        this.f87213g = jaVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void setXWebKeyboardImpl(com.tencent.mm.plugin.appbrand.page.oa oaVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public boolean w() {
        return false;
    }
}

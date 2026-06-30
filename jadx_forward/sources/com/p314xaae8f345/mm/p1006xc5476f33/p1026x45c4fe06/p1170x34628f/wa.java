package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class wa extends android.webkit.WebView implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f168743d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.x9 f168744e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ma f168745f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ja f168746g;

    /* renamed from: h, reason: collision with root package name */
    public xi1.m f168747h;

    /* renamed from: i, reason: collision with root package name */
    public android.animation.Animator f168748i;

    public wa(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.x9 x9Var) {
        super(context);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.va vaVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.va(this);
        android.webkit.WebChromeClient webChromeClient = new android.webkit.WebChromeClient(this) { // from class: com.tencent.mm.plugin.appbrand.page.DefaultWebViewImpl$4
        };
        this.f168744e = x9Var;
        getSettings().setDomStorageEnabled(true);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        getSettings().setMixedContentMode(0);
        getSettings().setUserAgentString(getSettings().getUserAgentString() + "/ DEMO");
        this.f168743d = getSettings().getUserAgentString();
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setWebViewClient(vaVar);
        setWebChromeClient(webChromeClient);
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    public void E(int i17, long j17) {
        android.animation.Animator animator = this.f168748i;
        if (animator != null) {
            animator.cancel();
            this.f168748i = null;
        }
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(mo14662xc2a54588().getScrollY(), i17);
        ofInt.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ua(this));
        ofInt.setInterpolator(new android.view.animation.DecelerateInterpolator());
        ofInt.setDuration(j17);
        ofInt.start();
        this.f168748i = ofInt;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t
    public void M(java.net.URL url, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, android.webkit.ValueCallback valueCallback) {
        mo14660x738236e6(str3, valueCallback);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    public void N(int i17, int i18) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t
    public void R(java.net.URL url, java.lang.String str, android.webkit.ValueCallback valueCallback) {
        mo14660x738236e6(str, valueCallback);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    public void b() {
        onResume();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    public boolean b0() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    public void c() {
        onPause();
    }

    @Override // pq5.a
    public boolean c0(android.graphics.Canvas canvas) {
        draw(canvas);
        return true;
    }

    @Override // android.webkit.WebView, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t
    /* renamed from: destroy */
    public void mo14659x5cd39ffa() {
        super.destroy();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    public void e0(java.lang.Runnable runnable) {
        if (runnable != null) {
            postOnAnimation(runnable);
        }
    }

    @Override // android.webkit.WebView, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0
    /* renamed from: evaluateJavascript */
    public void mo14660x738236e6(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ta taVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ta(this, str, valueCallback);
        if (android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread()) {
            taVar.run();
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(taVar);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    public android.graphics.Bitmap f() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    public void g0(java.lang.String str, java.lang.String str2) {
        loadDataWithBaseURL(str, str2, "text/html", com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    /* renamed from: getContentView */
    public android.view.View mo14662xc2a54588() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    /* renamed from: getFullscreenImpl */
    public xi1.m mo14663xe55fc971() {
        return this.f168747h;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    /* renamed from: getPageView */
    public /* bridge */ /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 mo52157xaf156f4a() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    /* renamed from: getUserAgentString */
    public java.lang.String mo14665xb9044875() {
        return this.f168743d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    /* renamed from: getWebScrollX */
    public int mo14666x95a6d12d() {
        return getScrollX();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    /* renamed from: getWebScrollY */
    public int mo14667x95a6d12e() {
        return getScrollY();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    /* renamed from: getWrapperView */
    public android.view.View mo14669x50cdf8a2() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.u h0(java.lang.Class cls) {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    public void i(android.content.Context context) {
        if (getContext() instanceof android.content.MutableContextWrapper) {
            ((android.content.MutableContextWrapper) getContext()).setBaseContext(context);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    public void n(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.db dbVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DefaultWebViewImpl", "getImageFromDiskCache url:%s", str);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.l6) dbVar).a(str, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    public void o0() {
        scrollTo(getScrollX(), 0);
    }

    @Override // android.widget.AbsoluteLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ja jaVar = this.f168746g;
        if (jaVar != null) {
            jaVar.j(z17, i17, i18, i19, i27);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i17, int i18, int i19, int i27) {
        super.onScrollChanged(i17, i18, i19, i27);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ma maVar = this.f168745f;
        if (maVar != null) {
            maVar.d(i17, i18, i19, i27, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    public boolean p0() {
        return mo14667x95a6d12e() == 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    /* renamed from: setAppBrandInfo */
    public void mo14670xce3b1136(java.util.Map<java.lang.String, java.lang.String> map) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    /* renamed from: setAppBrandWebViewClient */
    public void mo52160xdeb845bc(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.x9 x9Var) {
        this.f168744e = x9Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    /* renamed from: setAppBrandWebViewContentsSizeLogEnabled */
    public /* bridge */ /* synthetic */ void mo52161x9ae7be9(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    /* renamed from: setDisableContextMenuItems */
    public /* bridge */ /* synthetic */ void mo52158xb80428f8(int i17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    /* renamed from: setFullscreenImpl */
    public void mo14672xad56317d(xi1.m mVar) {
        this.f168747h = mVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t
    /* renamed from: setJsExceptionHandler */
    public void mo14673x29497b66(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.s sVar) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    /* renamed from: setOnScrollChangedListener */
    public void mo14674x6fa959a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ma maVar) {
        this.f168745f = maVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    /* renamed from: setOnTrimListener */
    public void mo14675x9d811b77(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ka kaVar) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    /* renamed from: setWebViewLayoutListener */
    public void mo14677x7f6cbb35(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ja jaVar) {
        this.f168746g = jaVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    /* renamed from: setXWebKeyboardImpl */
    public void mo14678x12a97505(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.oa oaVar) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    public boolean w() {
        return false;
    }
}

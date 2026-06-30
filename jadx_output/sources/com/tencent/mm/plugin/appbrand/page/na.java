package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public abstract class na implements com.tencent.mm.plugin.appbrand.page.fb {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.page.fb f86927d;

    public na(com.tencent.mm.plugin.appbrand.page.fb webview) {
        kotlin.jvm.internal.o.g(webview, "webview");
        this.f86927d = webview;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void E(int i17, long j17) {
        this.f86927d.E(i17, j17);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public void M(java.net.URL url, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, android.webkit.ValueCallback valueCallback) {
        this.f86927d.M(url, str, str2, i17, str3, valueCallback);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void N(int i17, int i18) {
        this.f86927d.N(i17, i18);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public void addJavascriptInterface(java.lang.Object obj, java.lang.String str) {
        this.f86927d.addJavascriptInterface(obj, str);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public boolean b0() {
        return this.f86927d.b0();
    }

    @Override // pq5.a
    public boolean c0(android.graphics.Canvas p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        return this.f86927d.c0(p07);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void e0(java.lang.Runnable runnable) {
        this.f86927d.e0(runnable);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public android.graphics.Bitmap f() {
        return this.f86927d.f();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void g0(java.lang.String str, java.lang.String str2) {
        this.f86927d.g0(str, str2);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public int getContentHeight() {
        return this.f86927d.getContentHeight();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public android.view.View getContentView() {
        return this.f86927d.getContentView();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public xi1.m getFullscreenImpl() {
        return this.f86927d.getFullscreenImpl();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public int getHeight() {
        return this.f86927d.getHeight();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public java.lang.String getUserAgentString() {
        return this.f86927d.getUserAgentString();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public int getWebScrollX() {
        return this.f86927d.getWebScrollX();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public int getWebScrollY() {
        return this.f86927d.getWebScrollY();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public int getWidth() {
        return this.f86927d.getWidth();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public android.view.View getWrapperView() {
        return this.f86927d.getWrapperView();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public com.tencent.mm.plugin.appbrand.jsruntime.u h0(java.lang.Class cls) {
        return this.f86927d.h0(cls);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void i(android.content.Context context) {
        this.f86927d.i(context);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void n(java.lang.String str, com.tencent.mm.plugin.appbrand.page.db dbVar) {
        this.f86927d.n(str, dbVar);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void o0() {
        this.f86927d.o0();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public boolean p0() {
        return this.f86927d.p0();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void setBackgroundColor(int i17) {
        this.f86927d.setBackgroundColor(i17);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void setFullscreenImpl(xi1.m mVar) {
        this.f86927d.setFullscreenImpl(mVar);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public void setJsExceptionHandler(com.tencent.mm.plugin.appbrand.jsruntime.s sVar) {
        this.f86927d.setJsExceptionHandler(sVar);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void setOnScrollChangedListener(com.tencent.mm.plugin.appbrand.page.ma maVar) {
        this.f86927d.setOnScrollChangedListener(maVar);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void setVerticalScrollBarEnabled(boolean z17) {
        this.f86927d.setVerticalScrollBarEnabled(z17);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void setWebViewLayoutListener(com.tencent.mm.plugin.appbrand.page.ja jaVar) {
        this.f86927d.setWebViewLayoutListener(jaVar);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void setXWebKeyboardImpl(com.tencent.mm.plugin.appbrand.page.oa oaVar) {
        this.f86927d.setXWebKeyboardImpl(oaVar);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public boolean w() {
        return this.f86927d.w();
    }
}

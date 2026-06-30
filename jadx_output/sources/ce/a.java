package ce;

/* loaded from: classes7.dex */
public class a implements com.tencent.mm.plugin.appbrand.page.fb {

    /* renamed from: d, reason: collision with root package name */
    public android.view.ViewGroup f40668d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f40669e;

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void E(int i17, long j17) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public void M(java.net.URL url, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, android.webkit.ValueCallback valueCallback) {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void N(int i17, int i18) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public void R(java.net.URL url, java.lang.String str, android.webkit.ValueCallback valueCallback) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public void addJavascriptInterface(java.lang.Object obj, java.lang.String str) {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void b() {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public boolean b0() {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void c() {
    }

    @Override // pq5.a
    public boolean c0(android.graphics.Canvas canvas) {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb, com.tencent.mm.plugin.appbrand.jsruntime.t
    public void destroy() {
        this.f40668d = null;
        this.f40669e = null;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void e0(java.lang.Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.c0
    public void evaluateJavascript(java.lang.String str, android.webkit.ValueCallback valueCallback) {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public android.graphics.Bitmap f() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void g0(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public int getContentHeight() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public android.view.View getContentView() {
        return this.f40669e;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public xi1.m getFullscreenImpl() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public int getHeight() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public java.lang.String getUserAgentString() {
        return "MiniGame";
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public int getWebScrollX() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public int getWebScrollY() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public int getWidth() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public android.view.View getWrapperView() {
        return this.f40668d;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public com.tencent.mm.plugin.appbrand.jsruntime.u h0(java.lang.Class cls) {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void i(android.content.Context context) {
        if (this.f40668d == null) {
            this.f40668d = new android.widget.FrameLayout(context);
        }
        if (this.f40669e == null) {
            this.f40669e = new android.widget.FrameLayout(context);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void n(java.lang.String str, com.tencent.mm.plugin.appbrand.page.db dbVar) {
        ((com.tencent.mm.plugin.appbrand.jsapi.media.l6) dbVar).a(str, null);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void o0() {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public boolean p0() {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void setAppBrandInfo(java.util.Map map) {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void setBackgroundColor(int i17) {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void setFullscreenImpl(xi1.m mVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public void setJsExceptionHandler(com.tencent.mm.plugin.appbrand.jsruntime.s sVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void setOnScrollChangedListener(com.tencent.mm.plugin.appbrand.page.ma maVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void setOnTrimListener(com.tencent.mm.plugin.appbrand.page.ka kaVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void setVerticalScrollBarEnabled(boolean z17) {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void setWebViewLayoutListener(com.tencent.mm.plugin.appbrand.page.ja jaVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void setXWebKeyboardImpl(com.tencent.mm.plugin.appbrand.page.oa oaVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public boolean w() {
        return false;
    }
}

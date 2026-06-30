package com.p3263xee53b379;

/* loaded from: classes13.dex */
public class b implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final android.webkit.WebView f302233d;

    /* renamed from: e, reason: collision with root package name */
    public final android.app.Activity f302234e;

    /* renamed from: h, reason: collision with root package name */
    public boolean f302237h = false;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f302235f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f302236g = new java.util.HashMap();

    public b(android.app.Activity activity, android.webkit.WebView webView, com.p3263xee53b379.f fVar) {
        this.f302234e = activity;
        this.f302233d = webView;
        android.webkit.WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        settings.setAllowFileAccess(false);
        settings.setDomStorageEnabled(true);
        try {
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
        } catch (java.lang.Throwable unused) {
        }
        this.f302233d.addJavascriptInterface(this, "_WebViewJavascriptBridge");
        this.f302233d.setWebViewClient(new com.p3263xee53b379.e(this, (byte) 0));
        this.f302233d.setWebChromeClient(new com.p3263xee53b379.ab(this, (byte) 0));
    }

    @android.webkit.JavascriptInterface
    /* renamed from: _handleMessageFromJs */
    public void m122337x8519f973(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        if (str2 != null) {
            java.util.HashMap hashMap = (java.util.HashMap) this.f302236g;
            ((com.p3263xee53b379.d) ((com.p3263xee53b379.g) hashMap.get(str2))).a(str3);
            hashMap.remove(str2);
            return;
        }
        com.p3263xee53b379.f fVar = null;
        com.p3263xee53b379.d dVar = str4 != null ? new com.p3263xee53b379.d(this, str4) : null;
        if (str5 != null && (fVar = (com.p3263xee53b379.f) ((java.util.HashMap) this.f302235f).get(str5)) == null) {
            "WVJB Warning: No handler for ".concat(str5);
            return;
        }
        try {
            this.f302234e.runOnUiThread(new com.p3263xee53b379.c0(this, fVar, str, dVar));
        } catch (java.lang.Exception e17) {
            e17.getMessage();
        }
    }

    public void a(java.lang.String str, com.p3263xee53b379.f fVar) {
        ((java.util.HashMap) this.f302235f).put(str, fVar);
    }
}

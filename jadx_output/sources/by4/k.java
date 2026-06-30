package by4;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public boolean f36400a;

    /* renamed from: b, reason: collision with root package name */
    public org.json.JSONObject f36401b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f36403d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Runnable f36405f;

    /* renamed from: h, reason: collision with root package name */
    public long f36407h;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f36402c = new java.util.HashSet();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f36404e = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f36406g = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    public final boolean a() {
        org.json.JSONObject jSONObject;
        if (j62.e.g().c(new com.tencent.mm.repairer.config.webview.RepairerConfigThirdPartyDisclaimer()) != 1 || (jSONObject = this.f36401b) == null) {
            return false;
        }
        return jSONObject != null ? jSONObject.optBoolean("EnableWebHostShow", false) : false;
    }

    public final void b(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, java.lang.String str, java.lang.String rawUrl, java.lang.String str2) {
        kotlin.jvm.internal.o.g(webViewUI, "webViewUI");
        kotlin.jvm.internal.o.g(rawUrl, "rawUrl");
        if (android.webkit.URLUtil.isHttpsUrl(str) || android.webkit.URLUtil.isHttpUrl(str)) {
            java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(webViewUI);
            java.lang.Runnable runnable = this.f36405f;
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f36406g;
            if (runnable != null) {
                n3Var.removeCallbacks(runnable);
            }
            java.lang.String host = android.net.Uri.parse(str == null ? "" : str).getHost();
            boolean z17 = host != null && ((java.util.HashSet) this.f36402c).contains(host);
            this.f36405f = new by4.j(weakReference, str2, this, str, z17, host, rawUrl);
            long j17 = 0;
            if (!z17) {
                long currentTimeMillis = 2000 - (java.lang.System.currentTimeMillis() - this.f36407h);
                if (currentTimeMillis >= 0) {
                    j17 = currentTimeMillis;
                }
            }
            java.lang.Runnable runnable2 = this.f36405f;
            kotlin.jvm.internal.o.d(runnable2);
            n3Var.postDelayed(runnable2, j17);
        }
    }
}

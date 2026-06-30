package by4;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public boolean f117933a;

    /* renamed from: b, reason: collision with root package name */
    public org.json.JSONObject f117934b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f117936d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Runnable f117938f;

    /* renamed from: h, reason: collision with root package name */
    public long f117940h;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f117935c = new java.util.HashSet();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f117937e = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f117939g = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    public final boolean a() {
        org.json.JSONObject jSONObject;
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2582x48fb3bf9.C20823x581fcfd6()) != 1 || (jSONObject = this.f117934b) == null) {
            return false;
        }
        return jSONObject != null ? jSONObject.optBoolean("EnableWebHostShow", false) : false;
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d webViewUI, java.lang.String str, java.lang.String rawUrl, java.lang.String str2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webViewUI, "webViewUI");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rawUrl, "rawUrl");
        if (android.webkit.URLUtil.isHttpsUrl(str) || android.webkit.URLUtil.isHttpUrl(str)) {
            java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(webViewUI);
            java.lang.Runnable runnable = this.f117938f;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f117939g;
            if (runnable != null) {
                n3Var.mo50300x3fa464aa(runnable);
            }
            java.lang.String host = android.net.Uri.parse(str == null ? "" : str).getHost();
            boolean z17 = host != null && ((java.util.HashSet) this.f117935c).contains(host);
            this.f117938f = new by4.j(weakReference, str2, this, str, z17, host, rawUrl);
            long j17 = 0;
            if (!z17) {
                long currentTimeMillis = 2000 - (java.lang.System.currentTimeMillis() - this.f117940h);
                if (currentTimeMillis >= 0) {
                    j17 = currentTimeMillis;
                }
            }
            java.lang.Runnable runnable2 = this.f117938f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(runnable2);
            n3Var.mo50297x7c4d7ca2(runnable2, j17);
        }
    }
}

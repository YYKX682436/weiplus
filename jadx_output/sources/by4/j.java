package by4;

/* loaded from: classes8.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f36393d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f36394e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ by4.k f36395f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f36396g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f36397h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f36398i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f36399m;

    public j(java.lang.ref.WeakReference weakReference, java.lang.String str, by4.k kVar, java.lang.String str2, boolean z17, java.lang.String str3, java.lang.String str4) {
        this.f36393d = weakReference;
        this.f36394e = str;
        this.f36395f = kVar;
        this.f36396g = str2;
        this.f36397h = z17;
        this.f36398i = str3;
        this.f36399m = str4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        int i17;
        java.lang.String str2;
        java.lang.String decode;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = (com.tencent.mm.plugin.webview.ui.tools.WebViewUI) this.f36393d.get();
        if (webViewUI != null) {
            java.lang.String str3 = this.f36394e;
            by4.k kVar = this.f36395f;
            java.lang.String str4 = this.f36396g;
            if (str3 == null) {
                str3 = (java.lang.String) ((java.util.HashMap) kVar.f36404e).get(str4);
            }
            str = "";
            java.lang.String str5 = null;
            boolean z17 = this.f36397h;
            java.lang.String str6 = this.f36398i;
            java.lang.String str7 = this.f36399m;
            if (z17) {
                i17 = 1;
            } else {
                org.json.JSONObject jSONObject = kVar.f36401b;
                org.json.JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject("TencentHostList") : null;
                if (optJSONObject != null) {
                    str2 = optJSONObject.optString(str6, "");
                    kotlin.jvm.internal.o.f(str2, "optString(...)");
                } else {
                    str2 = "";
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    java.lang.String c17 = xw4.b.c(str4);
                    decode = java.net.URLDecoder.decode(c17 != null ? c17 : "");
                    i17 = 3;
                } else {
                    decode = webViewUI.getString(com.tencent.mm.R.string.n3d, str2);
                    i17 = 2;
                }
                str = decode;
                if (!hy4.i.q(str7)) {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                        str3 = str;
                    } else {
                        if (!(str == null || str.length() == 0)) {
                            str5 = str;
                        }
                    }
                }
            }
            webViewUI.setMMTitle(str3);
            webViewUI.setMMSubTitle(str5);
            webViewUI.setMMSubTitleEllipsize(android.text.TextUtils.TruncateAt.START);
            webViewUI.setMMSubTitleColor(webViewUI.getColor(com.tencent.mm.R.color.ann));
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("webview_display_type", 1);
            hashMap.put("webview_statement", str);
            hashMap.put("webview_url_type", java.lang.Integer.valueOf(i17));
            hashMap.put("webview_url_domain", str6);
            hashMap.put("webview_url", str7);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("chat_webview_display_statement", hashMap, 32337);
        }
    }
}

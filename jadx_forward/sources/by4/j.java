package by4;

/* loaded from: classes8.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f117926d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f117927e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ by4.k f117928f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f117929g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f117930h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f117931i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f117932m;

    public j(java.lang.ref.WeakReference weakReference, java.lang.String str, by4.k kVar, java.lang.String str2, boolean z17, java.lang.String str3, java.lang.String str4) {
        this.f117926d = weakReference;
        this.f117927e = str;
        this.f117928f = kVar;
        this.f117929g = str2;
        this.f117930h = z17;
        this.f117931i = str3;
        this.f117932m = str4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        int i17;
        java.lang.String str2;
        java.lang.String decode;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) this.f117926d.get();
        if (viewOnCreateContextMenuListenerC19337x37f3384d != null) {
            java.lang.String str3 = this.f117927e;
            by4.k kVar = this.f117928f;
            java.lang.String str4 = this.f117929g;
            if (str3 == null) {
                str3 = (java.lang.String) ((java.util.HashMap) kVar.f117937e).get(str4);
            }
            str = "";
            java.lang.String str5 = null;
            boolean z17 = this.f117930h;
            java.lang.String str6 = this.f117931i;
            java.lang.String str7 = this.f117932m;
            if (z17) {
                i17 = 1;
            } else {
                org.json.JSONObject jSONObject = kVar.f117934b;
                org.json.JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject("TencentHostList") : null;
                if (optJSONObject != null) {
                    str2 = optJSONObject.optString(str6, "");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "optString(...)");
                } else {
                    str2 = "";
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    java.lang.String c17 = xw4.b.c(str4);
                    decode = java.net.URLDecoder.decode(c17 != null ? c17 : "");
                    i17 = 3;
                } else {
                    decode = viewOnCreateContextMenuListenerC19337x37f3384d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n3d, str2);
                    i17 = 2;
                }
                str = decode;
                if (!hy4.i.q(str7)) {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                        str3 = str;
                    } else {
                        if (!(str == null || str.length() == 0)) {
                            str5 = str;
                        }
                    }
                }
            }
            viewOnCreateContextMenuListenerC19337x37f3384d.mo54450xbf7c1df6(str3);
            viewOnCreateContextMenuListenerC19337x37f3384d.mo54449x3f86539a(str5);
            viewOnCreateContextMenuListenerC19337x37f3384d.m78574x6f33f413(android.text.TextUtils.TruncateAt.START);
            viewOnCreateContextMenuListenerC19337x37f3384d.m78573x31241be9(viewOnCreateContextMenuListenerC19337x37f3384d.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.ann));
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

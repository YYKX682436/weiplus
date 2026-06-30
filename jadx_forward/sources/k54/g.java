package k54;

/* loaded from: classes7.dex */
public final class g extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1 implements com.p314xaae8f345.p3210x3857dc.g1 {

    /* renamed from: a, reason: collision with root package name */
    public final k54.h f385958a;

    public g(k54.h webViewData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webViewData, "webViewData");
        this.f385958a = webViewData;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.g1
    public boolean a(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, boolean z17, android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("overScrollBy", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewClientListener");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("overScrollBy", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewClientListener");
        return false;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.g1
    public void b(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onContentHeightChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewClientListener");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onContentHeightChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewClientListener");
    }

    @Override // com.p314xaae8f345.p3210x3857dc.g1
    public void d(int i17, int i18, int i19, int i27, android.view.View view) {
        k54.h hVar = this.f385958a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrollChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewClientListener");
        boolean z17 = true;
        char c17 = (i27 != 0 || i18 <= 0) ? (i27 <= 0 || i18 != 0) ? (char) 0 : (char) 2 : (char) 1;
        if (c17 > 0) {
            try {
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                linkedHashMap.put("event", "onWebViewScrolled");
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put(dm.i4.f66865x76d1ec5a, hVar.c());
                jSONObject.put("componentId", hVar.b());
                if (c17 != 1) {
                    z17 = false;
                }
                jSONObject.put("scrolled", z17);
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                linkedHashMap.put("params", jSONObject2);
                hVar.e(linkedHashMap);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.WebViewClientListener", "the event error: " + e17.getMessage());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrollChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewClientListener");
    }

    @Override // com.p314xaae8f345.p3210x3857dc.g1
    public void e(int i17, int i18, boolean z17, boolean z18, android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onOverScrolled", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewClientListener");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onOverScrolled", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewClientListener");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1
    public void g(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        k54.h hVar = this.f385958a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPageFinished", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewClientListener");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.WebViewClientListener", "onPageFinished, url is " + str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(dm.i4.f66865x76d1ec5a, hVar.c());
            jSONObject.put("componentId", hVar.b());
            jSONObject.put("url", str);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("event", "onWebViewLoadFinish");
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            linkedHashMap.put("params", jSONObject2);
            hVar.e(linkedHashMap);
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPageFinished", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewClientListener");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1
    public void h(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        k54.h hVar = this.f385958a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPageStarted", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewClientListener");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.WebViewClientListener", "onPageStarted, url is " + str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(dm.i4.f66865x76d1ec5a, hVar.c());
            jSONObject.put("componentId", hVar.b());
            jSONObject.put("url", str);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("event", "onWebViewLoadStart");
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            linkedHashMap.put("params", jSONObject2);
            hVar.e(linkedHashMap);
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPageStarted", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewClientListener");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1
    public void i(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, int i17, java.lang.String str, java.lang.String str2) {
        k54.h hVar = this.f385958a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onReceivedError", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewClientListener");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.WebViewClientListener", "onReceivedError, url is " + str2);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(dm.i4.f66865x76d1ec5a, hVar.c());
            jSONObject.put("componentId", hVar.b());
            jSONObject.put("url", str2);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("event", "onWebViewLoadError");
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            linkedHashMap.put("params", jSONObject2);
            hVar.e(linkedHashMap);
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onReceivedError", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewClientListener");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1
    public void j(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, com.p314xaae8f345.p3210x3857dc.x0 x0Var, com.p314xaae8f345.p3210x3857dc.w0 w0Var) {
        android.net.Uri mo120512xb5887639;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onReceivedError", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewClientListener");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onReceivedError, url is ");
        java.lang.String str = null;
        sb6.append(x0Var != null ? x0Var.mo120512xb5887639() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.WebViewClientListener", sb6.toString());
        if (x0Var != null && (mo120512xb5887639 = x0Var.mo120512xb5887639()) != null) {
            str = mo120512xb5887639.toString();
        }
        m(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onReceivedError", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewClientListener");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1
    public void k(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, com.p314xaae8f345.p3210x3857dc.x0 x0Var, com.p314xaae8f345.p3210x3857dc.y0 y0Var) {
        android.net.Uri mo120512xb5887639;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onReceivedHttpError", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewClientListener");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onReceivedHttpError, url is ");
        java.lang.String str = null;
        sb6.append(x0Var != null ? x0Var.mo120512xb5887639() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.WebViewClientListener", sb6.toString());
        if (x0Var != null && (mo120512xb5887639 = x0Var.mo120512xb5887639()) != null) {
            str = mo120512xb5887639.toString();
        }
        m(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onReceivedHttpError", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewClientListener");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1
    public void l(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, com.p314xaae8f345.p3210x3857dc.l0 l0Var, android.net.http.SslError sslError) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onReceivedSslError", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewClientListener");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onReceivedSslError, url is ");
        sb6.append(c27816xac2547f9 != null ? c27816xac2547f9.mo120156xb5887639() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.WebViewClientListener", sb6.toString());
        m(c27816xac2547f9 != null ? c27816xac2547f9.mo120156xb5887639() : null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onReceivedSslError", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewClientListener");
    }

    public final void m(java.lang.String str) {
        java.lang.Object m143895xf1229813;
        jz5.f0 f0Var;
        k54.h hVar = this.f385958a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onError", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewClientListener");
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            if (str != null) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put(dm.i4.f66865x76d1ec5a, hVar.c());
                jSONObject.put("componentId", hVar.b());
                jSONObject.put("url", str);
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                linkedHashMap.put("event", "onWebViewLoadError");
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                linkedHashMap.put("params", jSONObject2);
                hVar.e(linkedHashMap);
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            ca4.q.c("SnsAd.WebViewClientListener", p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813));
        }
        p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onError", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewClientListener");
    }
}

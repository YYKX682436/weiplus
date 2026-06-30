package h54;

/* loaded from: classes4.dex */
public final class f implements com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.y1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 f360624a;

    /* renamed from: b, reason: collision with root package name */
    public final h54.a f360625b;

    /* renamed from: c, reason: collision with root package name */
    public final m54.l f360626c;

    /* renamed from: d, reason: collision with root package name */
    public zg0.v2 f360627d;

    public f(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 webView, h54.a formData, m54.l lVar) {
        java.lang.Object m143895xf1229813;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webView, "webView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(formData, "formData");
        this.f360624a = webView;
        this.f360625b = formData;
        this.f360626c = lVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onInit", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            f();
            webView.setTag(com.p314xaae8f345.mm.R.id.r8r, this);
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            ca4.q.c("SnsAd.FormView", p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813));
        }
        p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onInit", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.y1
    public void a(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59, java.lang.String str) {
        h54.a aVar = this.f360625b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPageStarted", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.FormView", "onPageStarted, url is " + str);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            aVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getId", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getId", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
            jSONObject.put(dm.i4.f66865x76d1ec5a, aVar.f360604a);
            jSONObject.put("componentId", aVar.a());
            if (str == null) {
                str = "";
            }
            jSONObject.put("url", str);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("event", "onWebViewLoadStart");
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            linkedHashMap.put("params", jSONObject2);
            aVar.c(linkedHashMap);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.FormView", "form view page started exception: " + e17.getMessage());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPageStarted", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.y1
    public boolean b(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("closeWindow", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("closeWindow", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.y1
    public boolean c(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleUrlLoading", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleUrlLoading", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x1
    /* renamed from: callback */
    public boolean mo70210xf5bc2045(int i17, android.os.Bundle bundle) {
        java.lang.Object m143895xf1229813;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.FormView", "the action code is " + i17);
        f();
        if (this.f360627d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.FormView", "the jsApi handler is null, can't call!!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
            return false;
        }
        if (bundle == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.FormView", "the data is null, please check it!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
            return false;
        }
        if (i17 == 151) {
            try {
                e(bundle);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.FormView", "do jump url exception: " + th6.getMessage());
            }
        } else if (i17 == 152) {
            h54.a aVar = this.f360625b;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAdH5Fun", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
            java.lang.String k17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.k(bundle, "callbackId");
            java.lang.String str = k17 == null ? "" : k17;
            java.lang.String k18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.k(bundle, "sns_landing_pages_h5_params");
            if (k18 == null) {
                k18 = "";
            }
            if (str.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.FormView", "the callback id is empty!!!!");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAdH5Fun", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
            } else {
                zg0.v2 v2Var = this.f360627d;
                if (v2Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.FormView", "the jsApiCallback is null");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAdH5Fun", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
                } else {
                    try {
                        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                        org.json.JSONObject jSONObject = new org.json.JSONObject(k18);
                        aVar.getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getQrExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getQrExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
                        jSONObject.put("qrExtInfo", aVar.f360608e);
                        java.lang.String optString = jSONObject.optString("funcName", "");
                        h54.e eVar = h54.e.f360622a;
                        h54.d dVar = new h54.d(v2Var, str, this.f360626c, aVar.b(), this.f360624a.getContext(), this.f360625b);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                        eVar.a(dVar, optString, jSONObject);
                        m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
                    } catch (java.lang.Throwable th7) {
                        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                        m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th7));
                    }
                    if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
                        ca4.q.c("SnsAd.FormView", p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813));
                    }
                    p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAdH5Fun", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.y1
    public void d(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59, java.lang.String str) {
        h54.a aVar = this.f360625b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPageFinished", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.FormView", "onPageFinished, url is " + str);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            aVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getId", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getId", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
            jSONObject.put(dm.i4.f66865x76d1ec5a, aVar.f360604a);
            jSONObject.put("componentId", aVar.a());
            if (str == null) {
                str = "";
            }
            jSONObject.put("url", str);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("event", "onWebViewLoadFinish");
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            linkedHashMap.put("params", jSONObject2);
            aVar.c(linkedHashMap);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.FormView", "form view page started exception: " + e17.getMessage());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPageFinished", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
    }

    public final void e(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doJumpUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
        java.lang.String k17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.k(bundle, "sns_landing_pages_ad_jumpurl");
        if (k17 == null) {
            k17 = "";
        }
        m54.l lVar = this.f360626c;
        java.lang.String m17 = lVar != null ? lVar.m() : null;
        if (m17 == null) {
            m17 = "";
        }
        java.lang.String concat = "traceid=".concat(m17);
        java.lang.String c17 = lVar != null ? lVar.c() : null;
        if (c17 == null) {
            c17 = "";
        }
        java.lang.String b17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.ka.b(k17, concat, "aid=".concat(c17));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "appendUri(...)");
        java.lang.String a17 = lVar != null ? a54.h.a(lVar) : "";
        java.lang.String b18 = ca4.z0.b(b17, a17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b18, "appendAdUxInfo(...)");
        android.content.Intent intent = new android.content.Intent();
        ca4.z0.c(intent, a17);
        intent.putExtra("rawUrl", b18);
        intent.putExtra("useJs", true);
        intent.putExtra("type", 4294967041L);
        ca4.z0.a(intent, 84);
        j45.l.j(this.f360624a.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doJumpUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
    }

    public final void f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("ensureJsApiHandler", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
        if (this.f360627d == null) {
            nw4.n nVar = null;
            if (((zg0.g3) i95.n0.c(zg0.g3.class)) != null) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = this.f360624a;
                ((cw4.v0) ((qk.j9) i95.n0.c(qk.j9.class))).getClass();
                try {
                    if (c22633x83752a59 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.C19486x36f27892) {
                        nVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.C19486x36f27892) c22633x83752a59).m74797x74a9227b();
                    }
                } catch (java.lang.Throwable unused) {
                }
            }
            this.f360627d = nVar;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("ensureJsApiHandler", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
    }
}

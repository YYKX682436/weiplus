package m54;

/* loaded from: classes4.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final m54.c0 f405783a = new m54.c0();

    public final boolean a(android.content.Context context, java.lang.String canvasKey, m54.l pageParameter) {
        java.lang.String optString;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doDowngradeWithCanvasKey", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvasKey, "canvasKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageParameter, "pageParameter");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46369x2e1760d, 40);
        m54.y c17 = m54.j.f405815a.c(canvasKey);
        boolean z17 = false;
        if (!m54.j.h(c17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.VangoghDowngrade", "there is no vangogh page with the canvas key, ".concat(canvasKey));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doDowngradeWithCanvasKey", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport");
            return false;
        }
        java.lang.String a17 = c17.a();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("analyzeVangoghData", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport");
        java.lang.String str = "";
        m54.b0 b0Var = new m54.b0(0, "");
        try {
            org.json.JSONObject optJSONObject = new org.json.JSONObject(a17).optJSONObject("fallback");
            if (optJSONObject != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseDowngradeConfig", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport");
                int optInt = optJSONObject.optInt("type", 0);
                if (optInt == 1 && (optString = optJSONObject.optString("url")) != null) {
                    str = optString;
                }
                m54.b0 b0Var2 = new m54.b0(optInt, str);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseDowngradeConfig", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport");
                b0Var = b0Var2;
            }
        } catch (org.json.JSONException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.VangoghDowngrade", "the vangogh data is invalid json object, please check it!");
            if (ca4.m0.c0()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.VangoghDowngrade", "the vangogh data is " + a17);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("analyzeVangoghData", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doDowngradeAction", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getType", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport$VangoghDowngradeData");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getType", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport$VangoghDowngradeData");
        if (b0Var.f405781a == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("downgradeToWeb", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getValue", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport$VangoghDowngradeData");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getValue", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport$VangoghDowngradeData");
            java.lang.Object obj = b0Var.f405782b;
            if (obj instanceof java.lang.String) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getValue", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport$VangoghDowngradeData");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getValue", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport$VangoghDowngradeData");
                if (((java.lang.CharSequence) obj).length() > 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getValue", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport$VangoghDowngradeData");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getValue", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport$VangoghDowngradeData");
                    a84.a0.b(context, (java.lang.String) obj, pageParameter, pageParameter.l(), 0L, "", true);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downgradeToWeb", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport");
                    z17 = true;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downgradeToWeb", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doDowngradeAction", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport");
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46369x2e1760d, 41);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doDowngradeWithCanvasKey", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport");
        return z17;
    }

    public final void b(android.content.Context context, java.lang.String query, android.os.Bundle extraData) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doDowngradeWithQuery", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraData, "extraData");
        try {
            str = new org.json.JSONObject(query).optString("canvasKey");
        } catch (org.json.JSONException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.VangoghDowngrade", "the query is invalid!!!");
            str = "";
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        if (str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.VangoghDowngrade", "the canvas key is empty!!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doDowngradeWithQuery", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport");
            return;
        }
        m54.l lVar = new m54.l();
        m54.i0.c(lVar, extraData);
        m54.i0.a(lVar);
        if (!a(context, str, lVar)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.VangoghDowngrade", "the canvasKey's downgrade don't be handled.");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doDowngradeWithQuery", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport");
    }
}

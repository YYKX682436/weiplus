package x44;

/* loaded from: classes4.dex */
public final class h3 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        da4.a aVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.StartAppMarket");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        org.json.JSONArray optJSONArray = data.optJSONArray("marketTag");
        boolean optBoolean = data.optBoolean("prompt", false);
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.AppMarket", "the market info is empty!!!");
            b(g("the market object is empty"));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.StartAppMarket");
            return;
        }
        android.app.Activity a17 = env.a();
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.AppMarket", "the activity is null");
            b(g("the activity is null"));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.StartAppMarket");
            return;
        }
        int i17 = optBoolean ? 0 : 2;
        android.app.Activity a18 = env.a();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("newInstance", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        jz5.f0 f0Var = null;
        try {
            aVar = new da4.a(a18, optJSONArray);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("newInstance", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MICROMSG.AdAppMarketHelper", "create aAdAppMarketHelper failed, with json");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("newInstance", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
            aVar = null;
        }
        android.content.Intent i18 = aVar != null ? aVar.i() : null;
        if (i18 != null) {
            if (da4.a.e(i18)) {
                java.lang.String l17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(i18, "market_app_name");
                if (l17 == null) {
                    l17 = "";
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.ka.d(a17, i18.getPackage(), "", i18, l17, x44.g3.f533365a, i17);
                b(l());
            } else {
                b(w44.d.k(this, -1, "there is not valid intent!!!", null, 4, null));
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            b(w44.d.k(this, -1, "there is not valid intent!!!", null, 4, null));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.StartAppMarket");
    }
}

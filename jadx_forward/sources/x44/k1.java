package x44;

/* loaded from: classes4.dex */
public final class k1 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenWebView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("url", "");
        int optInt = data.optInt("jumpAnimationType", 0);
        boolean optBoolean = data.optBoolean("openInHalfScreen", false);
        if (optString == null || optString.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.OpenWebView", "the web view url is empty!!!");
            b(g("the url is empty!!"));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenWebView");
            return;
        }
        if (env.a() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.OpenWebView", "the activity is null");
            b(g("the activity is null!!"));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenWebView");
            return;
        }
        long F1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F1(env.b().j(), 0L);
        if (optBoolean && env.b().s()) {
            ((ku5.t0) ku5.t0.f394148d).B(new x44.j1(env, optString, F1));
        } else {
            a84.a0.b(env.a(), optString, env.b(), env.b().l(), F1, "", !data.optBoolean("notAppendParamsToActionLink", false));
            if (optInt == 1) {
                env.a().overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
            } else {
                env.a().overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea, com.p314xaae8f345.mm.R.C30854x2dc211.f559415e6);
            }
        }
        b(l());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenWebView");
    }
}

package x44;

/* loaded from: classes4.dex */
public final class v1 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderLivingState");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("finderUsername");
        if (optString == null) {
            optString = "";
        }
        java.lang.String optString2 = data.optString("finderLiveId");
        java.lang.String str = optString2 != null ? optString2 : "";
        if (!(optString.length() == 0)) {
            if (!(str.length() == 0)) {
                java.lang.String j17 = env.b().j();
                if (j17 == null) {
                    j17 = "0";
                }
                d44.h.d(j17, optString, str, new x44.u1(this));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderLivingState");
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.QueryFinderLivingState", "finderUsername or finderLiveId is empty!!!");
        b(g("finderUsername or finderLiveId is empty!!!"));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderLivingState");
    }
}

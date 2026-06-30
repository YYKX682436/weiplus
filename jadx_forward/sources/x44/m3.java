package x44;

/* loaded from: classes4.dex */
public final class m3 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.SubscribeFinderLivingNotice");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("finderUsername");
        java.lang.String optString2 = data.optString("finderLiveNoticeId");
        if (!(optString == null || r26.n0.N(optString))) {
            if (!(optString2 == null || r26.n0.N(optString2))) {
                if (f()) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
                    x44.j3 j3Var = new x44.j3(this);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("subscribeLivingNotice", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.SubscribeFinderLivingNotice");
                    d44.h.f(java.lang.String.valueOf(java.lang.System.currentTimeMillis()), optString, optString2, new x44.l3(j3Var));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("subscribeLivingNotice", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.SubscribeFinderLivingNotice");
                } else {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString(dm.i4.f66875xa013b0d5, optString);
                    bundle.putString("noticeId", optString2);
                    i(bundle);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.SubscribeFinderLivingNotice");
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdJs.FinderNotice", "finder user name or notice id are empty!!!");
        b(g("finder user name or notice id are empty!!!"));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.SubscribeFinderLivingNotice");
    }

    @Override // w44.d
    public void n(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClientRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.SubscribeFinderLivingNotice");
        p(com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.f(bundle, com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993, -1));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClientRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.SubscribeFinderLivingNotice");
    }

    @Override // w44.d
    public android.os.Bundle o(q64.b bVar, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onServerRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.SubscribeFinderLivingNotice");
        java.lang.String k17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.k(bundle, dm.i4.f66875xa013b0d5);
        java.lang.String k18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.k(bundle, "noticeId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k18);
        x44.k3 k3Var = new x44.k3(bVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("subscribeLivingNotice", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.SubscribeFinderLivingNotice");
        d44.h.f(java.lang.String.valueOf(java.lang.System.currentTimeMillis()), k17, k18, new x44.l3(k3Var));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("subscribeLivingNotice", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.SubscribeFinderLivingNotice");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onServerRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.SubscribeFinderLivingNotice");
        return null;
    }

    public final void p(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resultToJS", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.SubscribeFinderLivingNotice");
        if (i17 == -1) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("noticeResult", i17);
            b(j(600004, "fail: jump finder profile ui: errorCode is " + i17, jSONObject));
        } else {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("noticeResult", i17);
            m(jSONObject2);
            b(jSONObject2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resultToJS", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.SubscribeFinderLivingNotice");
    }
}

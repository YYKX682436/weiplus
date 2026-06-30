package x44;

/* loaded from: classes4.dex */
public final class z extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetAdChannelAppInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("appId");
        java.lang.String optString2 = data.optString("pkg");
        java.lang.String optString3 = data.optString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56315xfd38653e);
        boolean optBoolean = data.optBoolean("useGameDownloadWidget", false);
        if (f()) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString3);
            p(optString, optString2, optString3, optBoolean, new x44.w(this));
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("appId", optString);
            bundle.putString("pkg", optString2);
            bundle.putString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56315xfd38653e, optString3);
            bundle.putBoolean("useGameDownloadWidget", optBoolean);
            i(bundle);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetAdChannelAppInfo");
    }

    @Override // w44.d
    public void n(android.os.Bundle bundle) {
        org.json.JSONObject jSONObject;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClientRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetAdChannelAppInfo");
        int i17 = -1;
        int f17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.f(bundle, "error", -1);
        java.lang.String k17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.k(bundle, "pkgInfo");
        if (k17 == null) {
            k17 = "{}";
        }
        try {
            jSONObject = new org.json.JSONObject(k17);
            i17 = f17;
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.GetAdChannelApp", "the parse json failed");
            jSONObject = new org.json.JSONObject();
        }
        q(i17, jSONObject);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClientRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetAdChannelAppInfo");
    }

    @Override // w44.d
    public android.os.Bundle o(q64.b bVar, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onServerRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetAdChannelAppInfo");
        java.lang.String k17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.k(bundle, "appId");
        java.lang.String str = k17 == null ? "" : k17;
        java.lang.String k18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.k(bundle, "pkg");
        java.lang.String str2 = k18 == null ? "" : k18;
        java.lang.String k19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.k(bundle, com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56315xfd38653e);
        p(str, str2, k19 == null ? "" : k19, com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.b(bundle, "useGameDownloadWidget", false), new x44.x(bVar));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onServerRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetAdChannelAppInfo");
        return null;
    }

    public final void p(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, yz5.p pVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("request", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetAdChannelAppInfo");
        gm0.j1.d().g(new ib4.b(str, str2, str3, z17));
        gm0.j1.d().a(1210, new x44.y(pVar, str2));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("request", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetAdChannelAppInfo");
    }

    public final void q(int i17, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toJS", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetAdChannelAppInfo");
        if (i17 != 0 || jSONObject.length() <= 0) {
            b(w44.d.k(this, -1, "get ad channel app info failed!", null, 4, null));
        } else {
            m(jSONObject);
            b(jSONObject);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toJS", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetAdChannelAppInfo");
    }
}

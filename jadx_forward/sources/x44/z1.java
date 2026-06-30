package x44;

/* loaded from: classes4.dex */
public final class z1 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderUserInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("finderUsername");
        if (android.text.TextUtils.isEmpty(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.FinderUser", "the user name is empty!");
            b(g("the user name is empty!"));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderUserInfo");
            return;
        }
        if (f()) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            p(optString, new x44.w1(this));
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(dm.i4.f66875xa013b0d5, optString);
            i(bundle);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderUserInfo");
    }

    @Override // w44.d
    public void n(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClientRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderUserInfo");
        java.lang.String k17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.k(bundle, "result");
        if (k17 == null) {
            k17 = "";
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(k17);
            if (jSONObject.optInt("errCode", 1) != 0) {
                b(w44.d.k(this, 600005, "fail: query finder user info failed!", null, 4, null));
            } else {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("followType", 1);
                jSONObject2.put("followFlag", jSONObject.optInt("followFlg"));
                jSONObject2.put("followerCount", jSONObject.optInt("followNum"));
                jSONObject2.put("feedCount", jSONObject.optInt("feedNum"));
                m(jSONObject2);
                b(jSONObject2);
            }
        } catch (java.lang.Throwable unused) {
            b(w44.d.k(this, 600005, "fail: query finder user info failed!", null, 4, null));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClientRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderUserInfo");
    }

    @Override // w44.d
    public android.os.Bundle o(q64.b bVar, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onServerRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderUserInfo");
        java.lang.String k17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.k(bundle, dm.i4.f66875xa013b0d5);
        if (k17 == null) {
            k17 = "";
        }
        p(k17, new x44.x1(bVar));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onServerRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderUserInfo");
        return null;
    }

    public final void p(java.lang.String str, yz5.l lVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("queryFinderContact", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderUserInfo");
        zy2.e6 e6Var = (zy2.e6) i95.n0.c(zy2.e6.class);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("errCode", 1);
        if (e6Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.s1) e6Var).Ui(str, new x44.y1(jSONObject, lVar), 4);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("queryFinderContact", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderUserInfo");
    }
}

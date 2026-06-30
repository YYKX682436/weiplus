package x44;

/* loaded from: classes4.dex */
public final class d2 extends w44.d {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f533347e = "";

    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryHbCoverState");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("hbCoverId");
        if (android.text.TextUtils.isEmpty(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.HBState", "the hb cover id is empty!!");
            g("the hb cover id is empty!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryHbCoverState");
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        this.f533347e = optString;
        if (f()) {
            p(optString, new x44.a2(this, optString));
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("hbCoverId", optString);
            i(bundle);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryHbCoverState");
    }

    @Override // w44.d
    public void n(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClientRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryHbCoverState");
        int f17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.f(bundle, com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993, -1);
        int f18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.f(bundle, "state", -1);
        java.lang.String k17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.k(bundle, "hbCoverId");
        if (k17 == null) {
            k17 = this.f533347e;
        }
        q(f17, k17, f18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClientRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryHbCoverState");
    }

    @Override // w44.d
    public android.os.Bundle o(q64.b bVar, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onServerRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryHbCoverState");
        java.lang.String k17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.k(bundle, "hbCoverId");
        if (k17 == null) {
            k17 = "";
        }
        p(k17, new x44.b2(bVar, k17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onServerRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryHbCoverState");
        return null;
    }

    public final void p(java.lang.String str, yz5.p pVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("queryHbCoverState", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryHbCoverState");
        gm0.j1.d().g(new ib4.d(str));
        gm0.j1.d().a(2944, new x44.c2(pVar));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("queryHbCoverState", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryHbCoverState");
    }

    public final void q(int i17, java.lang.String str, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resultToJS", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryHbCoverState");
        if (i17 != 0 || i18 == -1) {
            b(w44.d.k(this, 600011, "query hb cover failed!", null, 4, null));
        } else {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("hbCoverId", str);
            jSONObject.put("state", i18);
            m(jSONObject);
            b(jSONObject);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resultToJS", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryHbCoverState");
    }
}

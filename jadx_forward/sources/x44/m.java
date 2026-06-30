package x44;

/* loaded from: classes4.dex */
public final class m extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.DrawCoupon");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("couponAppId", "");
        java.lang.String optString2 = data.optString("couponStockId", "");
        java.lang.String optString3 = data.optString("compId", "");
        java.lang.String a17 = a54.h.a(env.b());
        if (!(optString == null || r26.n0.N(optString))) {
            if (!(optString2 == null || r26.n0.N(optString2))) {
                if (f()) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString3);
                    p(optString, optString2, optString3, a17, new x44.j(this));
                } else {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString("COUPON_APP_ID", optString);
                    bundle.putString("COUPON_STOCK_ID", optString2);
                    bundle.putString("COMP_ID", optString3);
                    bundle.putString("UX_INFO", a17);
                    i(bundle);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.DrawCoupon");
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.DrawCoupon", "the input param is invalid!");
        b(g("app id or stock id is null!"));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.DrawCoupon");
    }

    @Override // w44.d
    public void n(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClientRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.DrawCoupon");
        int f17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.f(bundle, "error", -1);
        int f18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.f(bundle, "ret", -1);
        java.lang.String k17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.k(bundle, "msg");
        if (k17 == null) {
            k17 = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdJs.DrawCoupon", "responseTo the msg is " + k17 + ", the ret is " + f18);
        q(f17, f18, k17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClientRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.DrawCoupon");
    }

    @Override // w44.d
    public android.os.Bundle o(q64.b bVar, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onServerRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.DrawCoupon");
        java.lang.String k17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.k(bundle, "COUPON_APP_ID");
        java.lang.String k18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.k(bundle, "COUPON_STOCK_ID");
        java.lang.String k19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.k(bundle, "COMP_ID");
        java.lang.String k27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.k(bundle, "UX_INFO");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k19);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k27);
        p(k17, k18, k19, k27, new x44.l(bVar));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onServerRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.DrawCoupon");
        return null;
    }

    public final void p(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, yz5.q qVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("draw", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.DrawCoupon");
        com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
        d17.a(4743, new x44.k(qVar));
        d17.g(new k64.p(str, str2, str4, str3));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("draw", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.DrawCoupon");
    }

    public final void q(int i17, int i18, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toJs", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.DrawCoupon");
        if (i17 == 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("promptCode", i18);
            jSONObject.put("promptMsg", str);
            m(jSONObject);
            b(jSONObject);
        } else {
            b(w44.d.k(this, 600000, "fail: draw coupon error", null, 4, null));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toJs", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.DrawCoupon");
    }
}

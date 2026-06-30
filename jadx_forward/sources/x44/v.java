package x44;

/* loaded from: classes4.dex */
public final class v extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowFinderUser");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("finderUsername");
        int optInt = data.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 102);
        if (f()) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            d44.j.a(optString, optInt, new x44.t(this));
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(dm.i4.f66875xa013b0d5, optString);
            bundle.putInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, optInt);
            i(bundle);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowFinderUser");
    }

    @Override // w44.d
    public void n(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClientRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowFinderUser");
        if (bundle == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.FollowFinder", "the result is null");
            b(w44.d.h(this, null, 1, null));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClientRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowFinderUser");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.f(bundle, "error", -1) == 0) {
            boolean b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.b(bundle, "followed", false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdJs.FollowFinder", "follow finder user result is " + b17);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("followed", b17);
            m(jSONObject);
            b(jSONObject);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.FollowFinder", "follow finder user error");
            b(w44.d.k(this, 600006, "fail:follow finder user failed!", null, 4, null));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClientRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowFinderUser");
    }

    @Override // w44.d
    public android.os.Bundle o(q64.b bVar, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onServerRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowFinderUser");
        java.lang.String k17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.k(bundle, dm.i4.f66875xa013b0d5);
        int f17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.f(bundle, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 102);
        if (!(k17 == null || r26.n0.N(k17))) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k17);
            d44.j.a(k17, f17, new x44.u(bVar));
        } else if (bVar != null) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putInt("error", -1);
            ((r64.b) bVar).e(bundle2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onServerRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowFinderUser");
        return null;
    }
}

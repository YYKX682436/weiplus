package x44;

/* loaded from: classes4.dex */
public final class f1 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenFinderProfileUI");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("finderUsername");
        int optInt = data.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 9);
        java.lang.String a17 = a54.h.a(env.b());
        java.lang.String j17 = env.b().j();
        if (env.a() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.FinderProfile", "activity is null");
            b(g("activity is null!!"));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenFinderProfileUI");
            return;
        }
        if (optString == null || r26.n0.N(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.FinderProfile", "username is empty!!");
            b(g("username is empty!!"));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenFinderProfileUI");
        } else {
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69818x1e004a23(env.a(), optString, a17, j17, optInt)) {
                b(l());
            } else {
                b(w44.d.k(this, 600003, "fail: jump finder profile ui", null, 4, null));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenFinderProfileUI");
        }
    }
}

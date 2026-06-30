package x44;

/* loaded from: classes4.dex */
public final class c1 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70346x10413e67;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenFinderDetailUI");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("finderUsername");
        java.lang.String optString2 = data.optString("finderExportId");
        java.lang.String optString3 = data.optString("finderObjectNonceId");
        boolean z17 = false;
        if (!(optString == null || r26.n0.N(optString))) {
            if (!(optString2 == null || r26.n0.N(optString2))) {
                if (!(optString3 == null || r26.n0.N(optString3))) {
                    if (env.a() == null) {
                        b(g("activity is null"));
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenFinderDetailUI");
                        return;
                    }
                    java.lang.String a17 = a54.h.a(env.b());
                    java.lang.String k17 = env.b().k();
                    int l17 = env.b().l();
                    if (f()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 b17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().b1(k17);
                        if (b17 != null && (m70346x10413e67 = b17.m70346x10413e67()) != null) {
                            z17 = m70346x10413e67.f38099x947561cd;
                        }
                        if (l44.s4.f(env.a(), a17, optString, optString3, optString2, ca4.m0.D0(k17), z17, 5)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdJs.FinderDetail", "open finder feed detail ui successfully!");
                            b(l());
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.FinderDetail", ":open finder feed detail ui failed!");
                            b(w44.d.k(this, 600009, "open finder feed detail ui failed", null, 4, null));
                        }
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69816x89fa1980(optString, optString3, optString2, a17, k17, l17, 5);
                        b(l());
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenFinderDetailUI");
                    return;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.FinderDetail", "input param is invalid!");
        b(w44.d.h(this, null, 1, null));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenFinderDetailUI");
    }
}

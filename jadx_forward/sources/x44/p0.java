package x44;

/* loaded from: classes4.dex */
public final class p0 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.MakeSmartPhone");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        m54.l b17 = env.b();
        long E1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(b17 != null ? b17.c() : null);
        m54.l b18 = env.b();
        java.lang.String m17 = b18 != null ? b18.m() : null;
        java.lang.String str = m17 == null ? "" : m17;
        m54.l b19 = env.b();
        java.lang.String a17 = b19 != null ? a54.h.a(b19) : "";
        m54.l b27 = env.b();
        java.lang.String i17 = b27 != null ? b27.i() : null;
        java.lang.String str2 = i17 == null ? "" : i17;
        int optInt = data.optInt("compid");
        int optInt2 = data.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54540x542b1a21);
        android.app.Activity a18 = env.a();
        if (a18 == null) {
            b(g("activity is null!"));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.MakeSmartPhone");
            return;
        }
        if (f()) {
            p(E1, optInt, str, a17, optInt2, str2, new x44.m0(this, a18));
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong("aid", E1);
            bundle.putString("traceId", str);
            bundle.putString("uxInfo", a17);
            bundle.putString("pageId", str2);
            bundle.putInt("compId", optInt);
            bundle.putInt("sId", optInt2);
            i(bundle);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.MakeSmartPhone");
    }

    @Override // w44.d
    public void n(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClientRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.MakeSmartPhone");
        int f17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.f(bundle, "error", -1);
        java.lang.String k17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.k(bundle, "phone");
        if (k17 == null) {
            k17 = "";
        }
        android.app.Activity a17 = d().a();
        if (f17 == 0) {
            if (k17.length() > 0) {
                b(l());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69787x3c09f1a8(a17, k17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClientRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.MakeSmartPhone");
            }
        }
        b(w44.d.k(this, 600008, "fail:obtain smart phone number failed!", null, 4, null));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClientRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.MakeSmartPhone");
    }

    @Override // w44.d
    public android.os.Bundle o(q64.b bVar, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onServerRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.MakeSmartPhone");
        long h17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.h(bundle, "aid", 0L);
        java.lang.String k17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.k(bundle, "traceId");
        java.lang.String str = k17 == null ? "" : k17;
        java.lang.String k18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.k(bundle, "uxInfo");
        java.lang.String str2 = k18 == null ? "" : k18;
        java.lang.String k19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.k(bundle, "pageId");
        p(h17, com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.f(bundle, "compId", 0), str, str2, com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.f(bundle, "sId", 0), k19 == null ? "" : k19, new x44.o0(bVar));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onServerRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.MakeSmartPhone");
        return null;
    }

    public final void p(long j17, int i17, java.lang.String str, java.lang.String str2, int i18, java.lang.String str3, yz5.p pVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPhoneNumber", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.MakeSmartPhone");
        com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
        d17.a(2605, new x44.n0(pVar));
        d17.g(new ib4.e(j17, i17, str, str2, i18, str3));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPhoneNumber", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.MakeSmartPhone");
    }
}

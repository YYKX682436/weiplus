package x44;

/* loaded from: classes4.dex */
public final class i1 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenScanner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("bgImage");
        java.lang.String optString2 = data.optString("desc");
        java.lang.String optString3 = data.optString("descIcon");
        java.lang.String optString4 = data.optString("detectSucIcon");
        int optInt = data.optInt("scanGestureType");
        java.lang.String a17 = a54.h.a(env.b());
        if (!(optString == null || r26.n0.N(optString))) {
            if (!(optString3 == null || r26.n0.N(optString3))) {
                if (!(optString4 == null || r26.n0.N(optString4)) && optInt > 0) {
                    if (env.a() == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.OpenScanner", "the activity is null");
                        b(g("the activity is null"));
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenScanner");
                        return;
                    }
                    android.app.Activity a18 = env.a();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.h hVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.h();
                    hVar.f247540a = optString2;
                    hVar.f38332xfc43bd79 = optString;
                    hVar.f38333x1607d665 = optString3;
                    hVar.f38334x5c2163b8 = optString4;
                    hVar.f247541b = optInt;
                    l44.o5.a(a18, hVar, a17, 8);
                    b(l());
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenScanner");
                    return;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.OpenScanner", "the input param is invalid");
        b(g("the input param is invalid"));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenScanner");
    }
}

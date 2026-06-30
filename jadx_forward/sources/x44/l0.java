package x44;

/* loaded from: classes4.dex */
public final class l0 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.LaunchApp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("deeplink");
        java.lang.String optString2 = data.optString("pkg");
        java.lang.String optString3 = data.optString("appId", "");
        java.lang.String optString4 = data.optString("appName", "");
        boolean optBoolean = data.optBoolean("prompt", false);
        if (optString2 == null || optString2.length() == 0) {
            if (optString == null || optString.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.LaunchApp", "the pkg name and deeplink are all empty!!");
                b(g("the pkg name and deeplink are all empty!!"));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.LaunchApp");
                return;
            }
        }
        if (env.a() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.LaunchApp", "activity is null!!");
            b(g("activity is null!!"));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.LaunchApp");
            return;
        }
        java.lang.String a17 = a54.h.a(env.b());
        java.lang.String a18 = env.b().a();
        env.b().j();
        int i17 = optBoolean ? 0 : 2;
        java.lang.String j17 = env.b().j();
        java.lang.String c17 = env.b().c();
        java.lang.String str = c17 == null ? "" : c17;
        java.lang.String m17 = env.b().m();
        java.lang.String str2 = m17 == null ? "" : m17;
        java.lang.String q17 = env.b().q();
        i64.p0 p0Var = new i64.p0(j17, a17, a18, 1, str, str2, q17 == null ? "" : q17);
        if (android.text.TextUtils.isEmpty(optString2)) {
            if (!android.text.TextUtils.isEmpty(optString)) {
                java.util.List w17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.w1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(optString)));
                if (w17 == null || w17.isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.LaunchApp", "the app is not installed!");
                    b(w44.d.k(this, -1, "the app is not installed!!!", null, 4, null));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.LaunchApp");
                    return;
                } else {
                    lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
                    android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo) w17.get(0);
                    ((kt.c) i0Var).getClass();
                    optString2 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.o(resolveInfo);
                    if (optString2 == null) {
                        optString2 = "";
                    }
                }
            }
        } else if (ik1.b.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, optString2) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.LaunchApp", "the app is not installed!");
            b(w44.d.k(this, -1, "the app is not installed!!!", null, 4, null));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.LaunchApp");
            return;
        }
        if (ca4.m0.o0(env.a(), optString3, optString2, optString4, optString, i17, p0Var)) {
            b(l());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.LaunchApp", "launch app failed!!! pkg is " + optString2 + ", deeplink is " + optString);
            b(w44.d.k(this, -1, "launch app failed!!! pkg is " + optString2 + ", deeplink is " + optString, null, 4, null));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.LaunchApp");
    }
}

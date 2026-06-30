package x44;

/* loaded from: classes4.dex */
public final class e1 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenFinderLiveUI");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("finderUsername");
        java.lang.String str = optString == null ? "" : optString;
        java.lang.String optString2 = data.optString("finderLiveId");
        java.lang.String str2 = optString2 == null ? "" : optString2;
        java.lang.String optString3 = data.optString("finderLiveFeedExportId");
        java.lang.String str3 = optString3 == null ? "" : optString3;
        java.lang.String optString4 = data.optString("finderLiveFeedNonceId");
        java.lang.String str4 = optString4 == null ? "" : optString4;
        boolean optBoolean = data.optBoolean("openShopShelf", false);
        if (!(str.length() == 0)) {
            if (!(str2.length() == 0)) {
                if (!(str3.length() == 0)) {
                    if (!(str4.length() == 0)) {
                        android.app.Activity a17 = env.a();
                        if (a17 == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.OpenFinderLiveUI", "the activity is null, are you sure??");
                            b(g("the activity is null"));
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenFinderLiveUI");
                            return;
                        }
                        java.lang.String a18 = a54.h.a(env.b());
                        java.lang.String j17 = env.b().j();
                        if (j17 == null) {
                            j17 = "0";
                        }
                        java.lang.String m17 = l44.s4.m(a18, j17, 9);
                        if (m17 == null || m17.length() == 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.OpenFinderLiveUI", "the ad info to finder is invalid!!");
                            b(g("the sns ad info to finder is invalid!!"));
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenFinderLiveUI");
                            return;
                        } else {
                            p52.h.f433549a.f(m17, str);
                            jz5.l lVar = new jz5.l("is_from_ad", java.lang.Boolean.TRUE);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m17);
                            d44.h.e(a17, str, str2, str3, str4, kz5.c1.k(lVar, new jz5.l("key_extra_info", m17), new jz5.l("key_auto_open_shopping_list", java.lang.Boolean.valueOf(optBoolean)), new jz5.l("key_comment_scene_for_ad", java.lang.Integer.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.C26524xd6f088f0.f54457x5e52d6e7))), "0", new x44.d1(this));
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenFinderLiveUI");
                            return;
                        }
                    }
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.OpenFinderLiveUI", "the necessary params are empty, please check them!!");
        b(g("the input params are invalid!!"));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenFinderLiveUI");
    }
}

package x44;

/* loaded from: classes4.dex */
public final class z2 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ShareToFriend");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("shareTitle");
        java.lang.String optString2 = data.optString("shareDesc");
        java.lang.String optString3 = data.optString("shareThumbUrl");
        java.lang.String optString4 = data.optString("shareWebUrl");
        java.lang.String optString5 = data.optString("canvasDynamicExtInfo");
        java.lang.String optString6 = data.optString("canvasDynamicLoadExtInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdJs.ToFriend", "canvasDynamicExtInfo is " + optString5 + ", canvasDynamicLoadExtInfo is " + optString6);
        if (!(optString == null || optString.length() == 0)) {
            if (!(optString2 == null || optString2.length() == 0)) {
                if (!(optString3 == null || optString3.length() == 0)) {
                    if (!(optString4 == null || optString4.length() == 0)) {
                        if (env.a() == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.ToFriend", "the activity is null!!!");
                            b(g("the activity is null"));
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ShareToFriend");
                            return;
                        }
                        java.lang.String b17 = ca4.z0.b(optString4, a54.h.a(env.b()));
                        m54.t tVar = m54.t.f405839a;
                        m54.l b18 = env.b();
                        m54.u uVar = new m54.u(null, null, null, null, null, null, null, 0, null, null, 1023, null);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setShareTitle", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
                        uVar.f405841b = optString;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setShareTitle", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setShareDesc", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
                        uVar.f405842c = optString2;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setShareDesc", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString3);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setShareThumbUrl", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
                        uVar.f405840a = optString3;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setShareThumbUrl", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString4);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setShareWebUrl", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
                        uVar.f405843d = optString4;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setShareWebUrl", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString5);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCanvasDynamicExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
                        uVar.f405844e = optString5;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCanvasDynamicExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString6);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCanvasDynamicLoadExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
                        uVar.f405845f = optString6;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCanvasDynamicLoadExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
                        java.lang.String a17 = tVar.a(b18, uVar);
                        java.lang.String b19 = tVar.b(env.b());
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e m69779x9cf0d20b = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b();
                        android.app.Activity a18 = env.a();
                        java.lang.String a19 = a54.h.a(env.b());
                        java.lang.String i17 = env.b().i();
                        if (i17 == null) {
                            i17 = "";
                        }
                        m69779x9cf0d20b.m69826x68f79d3(a18, a17, optString, optString3, optString2, b17, b19, a19, i17);
                        b(l());
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ShareToFriend");
                        return;
                    }
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.ToFriend", "the share info is invalid!!!");
        b(g("the share info is invalid!!!"));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ShareToFriend");
    }
}

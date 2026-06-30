package x44;

/* loaded from: classes4.dex */
public final class a3 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ShareToTimeline");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (env.a() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.ToTimeline", "the activity is null in share method");
            b(g("the activity is null in share method"));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ShareToTimeline");
            return;
        }
        java.lang.String optString = data.optString("shareTitle");
        java.lang.String optString2 = data.optString("shareDesc");
        java.lang.String optString3 = data.optString("shareThumbUrl");
        java.lang.String optString4 = data.optString("shareWebUrl");
        java.lang.String optString5 = data.optString("canvasDynamicExtInfo");
        java.lang.String optString6 = data.optString("canvasDynamicLoadExtInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdJs.ToTimeline", "canvasDynamicExtInfo is " + optString5 + ", canvasDynamicLoadExtInfo is " + optString6);
        if (!(optString == null || optString.length() == 0)) {
            if (!(optString2 == null || optString2.length() == 0)) {
                if (!(optString3 == null || optString3.length() == 0)) {
                    if (!(optString4 == null || optString4.length() == 0)) {
                        java.lang.String b17 = ca4.z0.b(optString4, a54.h.a(env.b()));
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
                        m54.t tVar = m54.t.f405839a;
                        java.lang.String a17 = tVar.a(env.b(), uVar);
                        java.lang.String b18 = tVar.b(env.b());
                        int l17 = env.b().l();
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("Ksnsupload_link", b17);
                        intent.putExtra("Ksnsupload_title", optString);
                        intent.putExtra("Ksnsupload_imgurl", optString3);
                        intent.putExtra("Ksnsupload_canvas_info", a17);
                        intent.putExtra("Ksnsupload_contentattribute", 0);
                        intent.putExtra("Ksnsupload_source", 1);
                        intent.putExtra("Ksnsupload_type", 1);
                        intent.putExtra("key_snsad_statextstr", b18);
                        intent.putExtra("need_result", true);
                        switch (l17) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 9:
                            case 10:
                            case 11:
                                str = "sns_0";
                                break;
                            case 5:
                            case 6:
                                str = "msg_" + com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.g(intent, "msg_id", Integer.MIN_VALUE);
                                break;
                            case 7:
                                java.lang.String l18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, "sns_landing_favid");
                                if (l18 == null) {
                                    l18 = "";
                                }
                                str = "fav_".concat(l18);
                                break;
                            case 8:
                            default:
                                str = "sns_";
                                break;
                        }
                        java.lang.String a18 = c01.n2.a(str);
                        c01.n2.d().c(a18, true).i("prePublishId", str);
                        intent.putExtra("reportSessionId", a18);
                        intent.putExtra("KSnsIsUploadAdLandingPage", true);
                        j45.l.o(env.a(), "sns", ".ui.SnsUploadUI", intent, 2001, false);
                        android.app.Activity a19 = env.a();
                        if (a19 != null) {
                            a19.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea, com.p314xaae8f345.mm.R.C30854x2dc211.f559415e6);
                        }
                        b(l());
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ShareToTimeline");
                        return;
                    }
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.ToFriend", "the share info is invalid!!!");
        b(g("the share info is invalid!!!"));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ShareToTimeline");
    }
}

package m54;

/* loaded from: classes4.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final m54.j0 f405820a = new m54.j0();

    public final void a(int i17, int i18, m54.l pageParam) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportPageEvent", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageReporter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageParam, "pageParam");
        try {
            ca4.f fVar = new ca4.f();
            fVar.m(i17);
            fVar.o(a54.h.a(pageParam));
            fVar.q(ca4.m0.L(a54.h.a(pageParam)));
            java.lang.String c17 = pageParam.c();
            java.lang.String str = "";
            if (c17 == null) {
                c17 = "";
            }
            fVar.p(c17);
            java.lang.String m17 = pageParam.m();
            if (m17 != null) {
                str = m17;
            }
            fVar.n(str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLpType", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            fVar.f121423s = 10;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLpType", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setServiceType", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            fVar.f121406b = 14;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setServiceType", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            java.lang.String b17 = m54.i0.b(pageParam);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setVangoghId", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            fVar.f121426v = b17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setVangoghId", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            fVar.l(pageParam.l());
            java.lang.String e17 = m54.j.e();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setJSBundleVersion", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            fVar.f121427w = e17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setJSBundleVersion", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            if (i18 > 0) {
                fVar.g(i18);
            }
            if (i17 == 4003056) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFrontPageStateInfo", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
                java.lang.String str2 = pageParam.K;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFrontPageStateInfo", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPageExitAction", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
                fVar.f121424t = str2;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPageExitAction", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46369x2e1760d, 3);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var.A(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46369x2e1760d, 2);
                if (!pageParam.s()) {
                    g0Var.A(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46369x2e1760d, 4);
                } else if (pageParam.E() == 1) {
                    g0Var.A(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46369x2e1760d, 5);
                } else {
                    g0Var.A(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46369x2e1760d, 6);
                }
            }
            a84.t0.b("sns_ad_vangogh_page", fVar.a().j());
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.VangoghPageReporter", "VangoghPageReporter::reportPageEvent error : " + th6.getMessage());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportPageEvent", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageReporter");
    }

    public final void b(android.os.Bundle data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportPageFailed", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageReporter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        try {
            java.lang.String k17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.k(data, "sns_landing_pages_traceid");
            java.lang.String str = "";
            if (k17 == null) {
                k17 = "";
            }
            java.lang.String k18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.k(data, "sns_landing_pages_aid");
            if (k18 == null) {
                k18 = "";
            }
            java.lang.String k19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.k(data, "sns_landing_pages_ux_info");
            if (k19 == null) {
                k19 = "";
            }
            java.lang.String k27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.k(data, "sns_landing_page_canvas_dynamicinfo");
            if (k27 == null) {
                k27 = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVangoghId", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghIdUtil");
            if (k27.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.PageParameter", "dynamic canvas info is empty, it can't obtain vangogh id!!!");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVangoghId", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghIdUtil");
            } else {
                try {
                    java.lang.String optString = new org.json.JSONObject(k27).optString("vangogh_id");
                    if (optString != null) {
                        str = optString;
                    }
                } catch (org.json.JSONException unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.PageParameter", "the dynamicCanvasInfo isn't a json string???");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVangoghId", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghIdUtil");
            }
            java.lang.String e17 = m54.j.e();
            ca4.f fVar = new ca4.f();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLpType", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            fVar.f121423s = 10;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLpType", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setServiceType", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            fVar.f121406b = 14;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setServiceType", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setVangoghId", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            fVar.f121426v = str;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setVangoghId", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            fVar.m(4003009);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOriginErrorCode", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            fVar.f121425u = 50100;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOriginErrorCode", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            fVar.p(k18);
            fVar.n(k17);
            fVar.q(ca4.m0.L(k19));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setJSBundleVersion", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            fVar.f121427w = e17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setJSBundleVersion", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            a84.t0.b("sns_ad_vangogh_page", fVar.a().j());
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.VangoghPageReporter", "VangoghPageReporter::reportPageFailed error : " + th6.getMessage());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportPageFailed", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageReporter");
    }

    public final void c(int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 adInfo, java.lang.String dynamicCanvasInfo, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportVangoghPreload", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageReporter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adInfo, "adInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dynamicCanvasInfo, "dynamicCanvasInfo");
        java.lang.String str = adInfo.f38104xce64ddf1;
        java.lang.String str2 = "";
        if (str == null) {
            str = "";
        }
        ca4.f fVar = new ca4.f();
        fVar.m(i17);
        fVar.o(str);
        java.lang.String str3 = adInfo.pId;
        if (str3 == null) {
            str3 = "";
        }
        fVar.q(str3);
        java.lang.String str4 = adInfo.aid;
        if (str4 == null) {
            str4 = "";
        }
        fVar.p(str4);
        java.lang.String str5 = adInfo.f38103xc060c120;
        if (str5 == null) {
            str5 = "";
        }
        fVar.n(str5);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLpType", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
        fVar.f121423s = 10;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLpType", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setServiceType", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
        fVar.f121406b = 14;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setServiceType", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVangoghId", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghIdUtil");
        if (dynamicCanvasInfo.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.PageParameter", "dynamic canvas info is empty, it can't obtain vangogh id!!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVangoghId", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghIdUtil");
        } else {
            try {
                java.lang.String optString = new org.json.JSONObject(dynamicCanvasInfo).optString("vangogh_id");
                if (optString != null) {
                    str2 = optString;
                }
            } catch (org.json.JSONException unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.PageParameter", "the dynamicCanvasInfo isn't a json string???");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVangoghId", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghIdUtil");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setVangoghId", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
        fVar.f121426v = str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setVangoghId", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
        fVar.l(0);
        java.lang.String e17 = m54.j.e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setJSBundleVersion", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
        fVar.f121427w = e17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setJSBundleVersion", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
        fVar.g(i18);
        a84.t0.b("sns_ad_vangogh_page", fVar.a().j());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportVangoghPreload", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageReporter");
    }
}

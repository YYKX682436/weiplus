package l44;

/* loaded from: classes4.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.ArrayList f397961a;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        f397961a = arrayList;
        java.util.Collections.addAll(arrayList, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 20, 24);
    }

    public static ca4.c a(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdCommonData", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdConversionOnlineReportHelper", str + ": adReportParams is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdCommonData", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            return null;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
            if (jSONObject.has("bizInfo") && jSONObject.has("sourceInfo")) {
                java.lang.String optString = jSONObject.optString("bizInfo");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdConversionOnlineReportHelper", str + ": uxInfo is isNullOrNil");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdCommonData", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                    return null;
                }
                java.lang.String optString2 = jSONObject.optString("sourceInfo");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdConversionOnlineReportHelper", str + ": sourceInfo is isNullOrNil");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdCommonData", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                    return null;
                }
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(optString2);
                if (!jSONObject2.has("wxad") && !jSONObject2.has("xjad")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdConversionOnlineReportHelper", str + ": sourceParams not has wxad or xjad");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdCommonData", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                    return null;
                }
                org.json.JSONObject optJSONObject = jSONObject2.has("wxad") ? jSONObject2.optJSONObject("wxad") : jSONObject2.has("xjad") ? jSONObject2.optJSONObject("xjad") : null;
                if (optJSONObject == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdConversionOnlineReportHelper", str + ": sourceJsonObj is null");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdCommonData", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                    return null;
                }
                ca4.c x17 = ca4.m0.x(optString);
                x17.f121377a = optString;
                x17.f121378b = jSONObject2;
                x17.f121379c = optJSONObject;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdCommonData", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                return x17;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdConversionOnlineReportHelper", str + ": adReportJsonParams not has bizInfo or sourceInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdCommonData", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            return null;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdConversionOnlineReportHelper", str + ": exp is " + th6);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdCommonData", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            return null;
        }
    }

    public static void b(int i17, java.lang.String str) {
        ca4.c a17;
        da4.i a18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportAdDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdConversionOnlineReportHelper", "reportAdDownload: adReportParams is " + str);
            a17 = a("reportAdDownload", str);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdConversionOnlineReportHelper", "reportAdDownload: exp is " + th6);
        }
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdConversionOnlineReportHelper", "reportAdDownload: adCommonData is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportAdDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            return;
        }
        org.json.JSONObject jSONObject = a17.f121378b;
        org.json.JSONObject jSONObject2 = a17.f121379c;
        if (jSONObject != null && jSONObject2 != null) {
            if (jSONObject.has("xjad") && jSONObject2.opt(ya.b.f77502x92235c1b) != null) {
                ca4.f fVar = new ca4.f();
                fVar.m(i17);
                fVar.o(a17.f121377a);
                fVar.p(a17.f121380d);
                fVar.n(a17.f121381e);
                fVar.q(a17.f121382f);
                fVar.k(4);
                fVar.d(str);
                a84.t0.a(fVar.a());
                if (i17 == 4001010 && (a18 = da4.i.a(jSONObject2.optString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1), 1, 1, "", a17.f121377a, "", null, false, str)) != null) {
                    da4.h.i(a18);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportAdDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdConversionOnlineReportHelper", "reportAdDownload: sourceParams or sourceJsonObj is null");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportAdDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
    }

    public static void c(ca4.d dVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportAppMarketDialogConfirm", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        try {
            ca4.f fVar = new ca4.f();
            fVar.m(4001002);
            fVar.o(dVar.f121384a);
            fVar.c(dVar.f121387d);
            fVar.p(dVar.f121389f);
            fVar.n(dVar.f121390g);
            fVar.q(dVar.f121391h);
            fVar.k(1);
            fVar.j(dVar.f121396m);
            a84.t0.a(fVar.a());
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdConversionOnlineReportHelper", "reportAppMarketDialogConfirm, exp is " + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportAppMarketDialogConfirm", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
    }

    public static void d(ca4.d dVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportAppMarketDialogShow", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        try {
            ca4.f fVar = new ca4.f();
            fVar.m(4001018);
            fVar.o(dVar.f121384a);
            fVar.c(dVar.f121387d);
            fVar.p(dVar.f121389f);
            fVar.n(dVar.f121390g);
            fVar.q(dVar.f121391h);
            fVar.k(1);
            fVar.j(dVar.f121396m);
            a84.t0.a(fVar.a());
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdConversionOnlineReportHelper", "reportAppMarketDialogShow, exp is " + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportAppMarketDialogShow", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
    }

    public static void e(ca4.d dVar, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportAppMarketInstallComplete", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        try {
            ca4.f fVar = new ca4.f();
            fVar.m(4001017);
            fVar.k(i17);
            fVar.o(dVar.f121384a);
            fVar.c(dVar.f121387d);
            fVar.p(dVar.f121389f);
            fVar.n(dVar.f121390g);
            fVar.q(dVar.f121391h);
            fVar.g(dVar.f121392i);
            fVar.j(dVar.f121396m);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(dVar.f121388e)) {
                fVar.d(dVar.f121388e);
            }
            if (i17 == 3) {
                fVar.f(dVar.f121385b);
                fVar.l(dVar.f121386c);
            }
            a84.t0.a(fVar.a());
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdConversionOnlineReportHelper", "reportAppMarketInstallComplete, exp is " + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportAppMarketInstallComplete", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
    }

    public static void f(ca4.d dVar, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportAppMarketOpen", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        try {
            ca4.f fVar = new ca4.f();
            fVar.m(4001016);
            fVar.k(i17);
            fVar.o(dVar.f121384a);
            fVar.c(dVar.f121387d);
            fVar.p(dVar.f121389f);
            fVar.n(dVar.f121390g);
            fVar.q(dVar.f121391h);
            fVar.j(dVar.f121396m);
            if (i17 == 3) {
                fVar.f(dVar.f121385b);
                fVar.l(dVar.f121386c);
            }
            a84.t0.a(fVar.a());
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdConversionOnlineReportHelper", "reportAppMarketOpen, exp is " + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportAppMarketOpen", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
    }

    public static void g(ca4.d dVar, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportAppMarketStart", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        try {
            ca4.f fVar = new ca4.f();
            fVar.m(4001014);
            fVar.k(i17);
            fVar.o(dVar.f121384a);
            fVar.c(dVar.f121387d);
            fVar.p(dVar.f121389f);
            fVar.n(dVar.f121390g);
            fVar.q(dVar.f121391h);
            fVar.j(dVar.f121396m);
            if (i17 == 3) {
                fVar.f(dVar.f121385b);
                fVar.l(dVar.f121386c);
            }
            a84.t0.a(fVar.a());
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdConversionOnlineReportHelper", "reportAppMarketStart, exp is " + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportAppMarketStart", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
    }

    public static void h(ca4.d dVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportCancelDownloadTaskStart", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        if (dVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdConversionOnlineReportHelper", "reportCancelDownloadTaskStart but params is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportCancelDownloadTaskStart", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            return;
        }
        ca4.f fVar = new ca4.f();
        fVar.m(4001074);
        fVar.o(dVar.f121384a);
        fVar.f(dVar.f121385b);
        fVar.l(dVar.f121386c);
        fVar.c(dVar.f121387d);
        fVar.p(dVar.f121389f);
        fVar.n(dVar.f121390g);
        fVar.q(dVar.f121391h);
        fVar.k(dVar.f121393j);
        a84.t0.a(fVar.a());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportCancelDownloadTaskStart", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
    }

    public static void i(ca4.d dVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportDeepLinkDialogConfirm", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        try {
            ca4.f fVar = new ca4.f();
            fVar.m(4002009);
            fVar.o(dVar.f121384a);
            fVar.f(dVar.f121385b);
            fVar.l(dVar.f121386c);
            fVar.c(dVar.f121387d);
            fVar.p(dVar.f121389f);
            fVar.n(dVar.f121390g);
            fVar.q(dVar.f121391h);
            fVar.h(dVar.f121394k);
            fVar.j(dVar.f121396m);
            fVar.i(1);
            a84.t0.a(fVar.a());
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdConversionOnlineReportHelper", "reportDeepLinkDialogConfirm, exp is " + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportDeepLinkDialogConfirm", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
    }

    public static void j(ca4.d dVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportDeepLinkDialogShow", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        try {
            ca4.f fVar = new ca4.f();
            fVar.m(4002007);
            fVar.o(dVar.f121384a);
            fVar.f(dVar.f121385b);
            fVar.l(dVar.f121386c);
            fVar.c(dVar.f121387d);
            fVar.p(dVar.f121389f);
            fVar.n(dVar.f121390g);
            fVar.q(dVar.f121391h);
            fVar.h(dVar.f121394k);
            fVar.j(dVar.f121396m);
            fVar.i(1);
            a84.t0.a(fVar.a());
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdConversionOnlineReportHelper", "reportDeepLinkDialogShow, exp is " + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportDeepLinkDialogShow", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
    }

    public static void k(ca4.d dVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportDeepLinkStart", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        try {
            ca4.f fVar = new ca4.f();
            fVar.m(4002001);
            fVar.o(dVar.f121384a);
            fVar.f(dVar.f121385b);
            fVar.l(dVar.f121386c);
            fVar.c(dVar.f121387d);
            fVar.p(dVar.f121389f);
            fVar.n(dVar.f121390g);
            fVar.q(dVar.f121391h);
            fVar.h(dVar.f121394k);
            fVar.j(dVar.f121396m);
            fVar.i(1);
            a84.t0.a(fVar.a());
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdConversionOnlineReportHelper", "reportDeepLinkStart, exp is " + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportDeepLinkStart", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
    }

    public static void l(ca4.d dVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportDialogConfirm", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        try {
            ca4.f fVar = new ca4.f();
            fVar.m(4001002);
            fVar.o(dVar.f121384a);
            fVar.f(dVar.f121385b);
            fVar.l(dVar.f121386c);
            fVar.c(dVar.f121387d);
            fVar.p(dVar.f121389f);
            fVar.n(dVar.f121390g);
            fVar.q(dVar.f121391h);
            fVar.k(4);
            fVar.e(dVar.f121395l);
            fVar.j(dVar.f121396m);
            a84.t0.a(fVar.a());
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdConversionOnlineReportHelper", "reportDialogConfirm, exp is " + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportDialogConfirm", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
    }

    public static void m(ca4.d dVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportDialogShow", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        try {
            ca4.f fVar = new ca4.f();
            fVar.m(4001018);
            fVar.o(dVar.f121384a);
            fVar.f(dVar.f121385b);
            fVar.l(dVar.f121386c);
            fVar.c(dVar.f121387d);
            fVar.p(dVar.f121389f);
            fVar.n(dVar.f121390g);
            fVar.q(dVar.f121391h);
            fVar.k(4);
            fVar.e(dVar.f121395l);
            fVar.j(dVar.f121396m);
            a84.t0.a(fVar.a());
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdConversionOnlineReportHelper", "reportDialogShow, exp is " + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportDialogShow", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
    }

    public static void n(ca4.d dVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportHalfScreenClose", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        try {
            ca4.f fVar = new ca4.f();
            fVar.m(4001071);
            fVar.o(dVar.f121384a);
            fVar.f(dVar.f121385b);
            fVar.l(dVar.f121386c);
            fVar.c(dVar.f121387d);
            fVar.p(dVar.f121389f);
            fVar.n(dVar.f121390g);
            fVar.q(dVar.f121391h);
            fVar.k(5);
            fVar.g(dVar.f121392i);
            a84.t0.a(fVar.a());
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdConversionOnlineReportHelper", "reportHalfScreenClose, exp is " + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportHalfScreenClose", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
    }

    public static void o(ca4.d dVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportHalfScreenOpenStart", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        try {
            ca4.f fVar = new ca4.f();
            fVar.m(4001065);
            fVar.o(dVar.f121384a);
            fVar.f(dVar.f121385b);
            fVar.l(dVar.f121386c);
            fVar.c(dVar.f121387d);
            fVar.p(dVar.f121389f);
            fVar.n(dVar.f121390g);
            fVar.q(dVar.f121391h);
            fVar.k(5);
            a84.t0.a(fVar.a());
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdConversionOnlineReportHelper", "reportHalfScreenOpenStart, exp is " + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportHalfScreenOpenStart", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
    }

    public static void p(ca4.d dVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportHalfScreenOpenStartFinish", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        try {
            ca4.f fVar = new ca4.f();
            fVar.m(4001066);
            fVar.o(dVar.f121384a);
            fVar.f(dVar.f121385b);
            fVar.l(dVar.f121386c);
            fVar.c(dVar.f121387d);
            fVar.p(dVar.f121389f);
            fVar.n(dVar.f121390g);
            fVar.q(dVar.f121391h);
            fVar.k(5);
            fVar.g(dVar.f121392i);
            a84.t0.a(fVar.a());
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdConversionOnlineReportHelper", "reportHalfScreenOpenStartFinish, exp is " + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportHalfScreenOpenStartFinish", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
    }

    public static void q(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17) {
        ca4.f fVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportInstallStatusBeforeDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdConversionOnlineReportHelper", "reportInstallStatusBeforeDownload, snsInfo is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportInstallStatusBeforeDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = c17933xe8d1b226.m70354x74235b3e();
        if (m70354x74235b3e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdConversionOnlineReportHelper", "reportInstallStatusBeforeDownload, adXml is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportInstallStatusBeforeDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            return;
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70347x10413e67 = c17933xe8d1b226.m70347x10413e67(i17);
            if (z17) {
                fVar = new ca4.f();
                fVar.m(4001019);
            } else {
                fVar = new ca4.f();
                fVar.m(4001020);
            }
            fVar.o(m70347x10413e67.f38104xce64ddf1);
            fVar.c(m70354x74235b3e.f38172xd73c98cc);
            fVar.p(m70347x10413e67.aid);
            fVar.n(m70347x10413e67.f38103xc060c120);
            fVar.q(m70347x10413e67.pId);
            a84.t0.a(fVar.a());
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdConversionOnlineReportHelper", "reportInstallStatusBeforeDownload, exp is " + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportInstallStatusBeforeDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
    }

    public static void r(boolean z17, k94.a aVar) {
        ca4.f fVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportInstallStatusBeforeDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        try {
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdConversionOnlineReportHelper", "reportInstallStatusBeforeDownload, exp is " + th6.toString());
        }
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdConversionOnlineReportHelper", "reportInstallStatusBeforeDownload, deeplinkReportInfo is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportInstallStatusBeforeDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            return;
        }
        if (z17) {
            fVar = new ca4.f();
            fVar.m(4001019);
        } else {
            fVar = new ca4.f();
            fVar.m(4001020);
        }
        fVar.o(aVar.f387465a);
        fVar.c("");
        fVar.p(aVar.f387466b);
        fVar.n(aVar.f387467c);
        fVar.q(aVar.f387468d);
        a84.t0.a(fVar.a());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportInstallStatusBeforeDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
    }

    public static void s(boolean z17, java.lang.String str) {
        ca4.c a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportLaunchApplicationAppInstallStatus", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdConversionOnlineReportHelper", "reportLaunchApplicationAppInstallStatus: adReportParams is " + str);
            a17 = a("reportLaunchApplicationAppInstallStatus", str);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdConversionOnlineReportHelper", "reportLaunchApplicationAppInstallStatus: exp is " + th6);
        }
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdConversionOnlineReportHelper", "reportLaunchApplicationAppInstallStatus: adCommonData is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportLaunchApplicationAppInstallStatus", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            return;
        }
        org.json.JSONObject jSONObject = a17.f121378b;
        org.json.JSONObject jSONObject2 = a17.f121379c;
        if (jSONObject != null && jSONObject2 != null) {
            ca4.f fVar = new ca4.f();
            fVar.o(a17.f121377a);
            fVar.p(a17.f121380d);
            fVar.n(a17.f121381e);
            fVar.q(a17.f121382f);
            fVar.d(str);
            if (z17) {
                fVar.m(4001019);
            } else {
                fVar.m(4001020);
            }
            if (jSONObject.has("wxad")) {
                if (jSONObject2.optInt(ya.b.f77502x92235c1b) == 4) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdConversionOnlineReportHelper", "source is wxad market download");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportLaunchApplicationAppInstallStatus", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                    return;
                } else if (jSONObject2.opt(ya.b.f77502x92235c1b) != null) {
                    fVar.h(1);
                    fVar.i(1);
                    a84.t0.a(fVar.a());
                }
            } else if (jSONObject.has("xjad") && jSONObject2.opt(ya.b.f77502x92235c1b) != null) {
                fVar.h(3);
                fVar.i(1);
                a84.t0.a(fVar.a());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportLaunchApplicationAppInstallStatus", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdConversionOnlineReportHelper", "reportLaunchApplicationAppInstallStatus: sourceParams or sourceJsonObj is null");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportLaunchApplicationAppInstallStatus", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
    }

    public static void t(i64.a aVar, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportTimelineAdClick", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdConversionOnlineReportHelper", "reportTimelineAdClick, params is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportTimelineAdClick", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            return;
        }
        com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad = aVar.f370585j;
        if (c11137xb05b06ad == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdConversionOnlineReportHelper", "reportTimelineAdClick, snsAdClick is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportTimelineAdClick", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            return;
        }
        try {
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdConversionOnlineReportHelper", "reportTimelineAdClick, eventId is " + i17 + ", exp is " + th6.toString());
        }
        if (f397961a.contains(java.lang.Integer.valueOf(c11137xb05b06ad.f153002g))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdConversionOnlineReportHelper", "reportTimelineAdClick, except current click pos, the pos is " + c11137xb05b06ad.f153002g);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportTimelineAdClick", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            return;
        }
        ca4.f fVar = new ca4.f();
        fVar.m(i17);
        fVar.o(aVar.f370586k);
        fVar.c(aVar.f370587l);
        fVar.p(aVar.f370588m);
        fVar.n(aVar.f370589n);
        fVar.q(aVar.f370590o);
        a84.t0.a(fVar.a());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportTimelineAdClick", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
    }
}

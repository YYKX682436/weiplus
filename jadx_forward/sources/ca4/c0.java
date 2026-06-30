package ca4;

/* loaded from: classes4.dex */
public abstract class c0 {
    public static java.lang.String a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("encodeParams", "com.tencent.mm.plugin.sns.data.SnsAdReportAnalyseUtils");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("encodeParams", "com.tencent.mm.plugin.sns.data.SnsAdReportAnalyseUtils");
            return "";
        }
        try {
            str = java.net.URLEncoder.encode(str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdReportAnalyseUtils", e17.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("encodeParams", "com.tencent.mm.plugin.sns.data.SnsAdReportAnalyseUtils");
        return str;
    }

    public static void b(int i17, long j17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 c17902x72cc1771, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 c17903x3b438f4) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportAdDel", "com.tencent.mm.plugin.sns.data.SnsAdReportAnalyseUtils");
        c(i17, j17, c17902x72cc1771, c17903x3b438f4, "");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportAdDel", "com.tencent.mm.plugin.sns.data.SnsAdReportAnalyseUtils");
    }

    public static void c(int i17, long j17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 c17902x72cc1771, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 c17903x3b438f4, java.lang.String str) {
        int i18;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportAdDel", "com.tencent.mm.plugin.sns.data.SnsAdReportAnalyseUtils");
        switch (i17) {
            case -1:
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportAdDel", "com.tencent.mm.plugin.sns.data.SnsAdReportAnalyseUtils");
                return;
            case 0:
                i18 = 2;
                break;
            case 1:
                i18 = 3;
                break;
            case 2:
                i18 = 4;
                break;
            case 3:
                i18 = 5;
                break;
            case 4:
                i18 = 6;
                break;
            case 5:
                i18 = 7;
                break;
            case 6:
                i18 = 9;
                break;
            case 7:
                i18 = 10;
                break;
            case 8:
                i18 = 12;
                break;
            case 9:
                i18 = 13;
                break;
            default:
                i18 = -1;
                break;
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.A(1907, i18);
            i64.u1.b(22, 1, i18);
            java.lang.String str3 = "";
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? "" : str;
            java.lang.String a17 = c17902x72cc1771 != null ? a(c17902x72cc1771.f38104xce64ddf1) : "";
            if (c17903x3b438f4 != null && (str2 = c17903x3b438f4.f38172xd73c98cc) != null) {
                str3 = str2;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdReportAnalyseUtils", "reportAdDel: snsId = " + ca4.z0.t0(j17) + ", uxInfo = " + a17 + ", adExtInfo = " + str3 + ", reportType = " + i18 + ", extInfo = " + str4);
            g0Var.d(19553, java.lang.Long.valueOf(j17), a17, str3, java.lang.Integer.valueOf(i18), str4);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdReportAnalyseUtils", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportAdDel", "com.tencent.mm.plugin.sns.data.SnsAdReportAnalyseUtils");
    }

    public static void d(long j17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportAdPull", "com.tencent.mm.plugin.sns.data.SnsAdReportAnalyseUtils");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 c17902x72cc1771 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771(str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 c17903x3b438f4 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4(str2);
            java.lang.String a17 = a(c17902x72cc1771.f38104xce64ddf1);
            java.lang.String str3 = c17903x3b438f4.f38172xd73c98cc;
            if (str3 == null) {
                str3 = "";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdReportAnalyseUtils", "reportAdPull: snsId = " + j17 + ", uxInfo = " + a17 + ", adExtInfo = " + str3 + ", reportType = 1, extInfo = ");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(19553, java.lang.Long.valueOf(j17), a17, str3, 1, "");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdReportAnalyseUtils", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportAdPull", "com.tencent.mm.plugin.sns.data.SnsAdReportAnalyseUtils");
    }

    public static void e(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, java.lang.String str4, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportOpenApp", "com.tencent.mm.plugin.sns.data.SnsAdReportAnalyseUtils");
        try {
            f(str, str2, i17, i18, str3, str4, i19, 0);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdReportAnalyseUtils", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportOpenApp", "com.tencent.mm.plugin.sns.data.SnsAdReportAnalyseUtils");
    }

    public static void f(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, java.lang.String str4, int i19, int i27) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportOpenApp", "com.tencent.mm.plugin.sns.data.SnsAdReportAnalyseUtils");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdReportAnalyseUtils", "snsId = " + str + ", uxInfo = " + str3 + ", adExtInfo = " + str4 + ", appId = " + str2 + ", reportType = " + i17 + ", reportScene = " + i18 + ", reportOrigin = " + i19 + ", dialogType = " + i27);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(19693, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), str, a(str3), str4, str2, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdReportAnalyseUtils", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportOpenApp", "com.tencent.mm.plugin.sns.data.SnsAdReportAnalyseUtils");
    }
}

package ca4;

/* loaded from: classes4.dex */
public abstract class e0 {
    public static void a(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("adTecReport", "com.tencent.mm.plugin.sns.data.SnsAdTecReportUtil");
        try {
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdTecReportUtil", "adTecReport exp=" + th6.toString());
        }
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adTecReport", "com.tencent.mm.plugin.sns.data.SnsAdTecReportUtil");
            return;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        if (str3 == null) {
            str3 = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdTecReportUtil", "adTecReport, actName=" + str + ", actValue=" + str2 + ", subType=" + i17 + ", subValue=" + i18 + ", extra=" + str3);
        if (str.equals("ad_common_exception_report")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.E(19789, str, str2, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str3);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(19789, str, str2, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str3);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adTecReport", "com.tencent.mm.plugin.sns.data.SnsAdTecReportUtil");
    }

    public static void b(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("adTecReportOnSubThread", "com.tencent.mm.plugin.sns.data.SnsAdTecReportUtil");
        ((ku5.t0) ku5.t0.f394148d).q(new ca4.d0(str, str2, i17, i18, str3));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adTecReportOnSubThread", "com.tencent.mm.plugin.sns.data.SnsAdTecReportUtil");
    }
}

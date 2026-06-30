package o94;

/* loaded from: classes4.dex */
public abstract class a {
    public static java.lang.String a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("appendShareReportParams", "com.tencent.mm.plugin.sns.adutils.AntiCheatingReportUtils");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String valueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        java.lang.String a17 = ca4.c0.a(str3);
        sb6.append(valueOf);
        sb6.append(",");
        sb6.append(str);
        sb6.append(",");
        sb6.append(str2);
        sb6.append(",");
        sb6.append(a17);
        sb6.append(",,,,");
        sb6.append(str4);
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendShareReportParams", "com.tencent.mm.plugin.sns.adutils.AntiCheatingReportUtils");
        return sb7;
    }

    public static void b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doShareReport", "com.tencent.mm.plugin.sns.adutils.AntiCheatingReportUtils");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("shareTo", "com.tencent.mm.plugin.sns.adutils.AntiCheatingReportUtils");
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shareTo", "com.tencent.mm.plugin.sns.adutils.AntiCheatingReportUtils");
                i17 = 2;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shareTo", "com.tencent.mm.plugin.sns.adutils.AntiCheatingReportUtils");
                i17 = 1;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AntiCheatingReportUtils", "shareType = " + i17);
            java.lang.String a17 = a(java.lang.String.valueOf(i17), str, str2, str3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AntiCheatingReportUtils", "reportScreenShotParams = " + a17);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(19214, a17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AntiCheatingReportUtils", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doShareReport", "com.tencent.mm.plugin.sns.adutils.AntiCheatingReportUtils");
    }
}

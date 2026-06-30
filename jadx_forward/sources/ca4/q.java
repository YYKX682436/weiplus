package ca4;

/* loaded from: classes4.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final ca4.q f121537a = new ca4.q();

    public static final void a(java.lang.String str, java.lang.String str2, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportErrorInfo", "com.tencent.mm.plugin.sns.data.SnsAdErrorUtils");
        java.lang.String str3 = "msg=" + str2;
        ca4.e0.b("ad_common_error_info_report", str, i17, 0, str3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("" + str, str3);
        if (i17 != -1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2023, i17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportErrorInfo", "com.tencent.mm.plugin.sns.data.SnsAdErrorUtils");
    }

    public static final void c(java.lang.String str, java.lang.Throwable th6) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("throwOrReportErrorInfoToKv", "com.tencent.mm.plugin.sns.data.SnsAdErrorUtils");
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdErrorUtils", "throwOrReportErrorInfoToKv msg=" + str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("SnsAdErrorUtils", th6, "kv_error_msg:", new java.lang.Object[0]);
        f121537a.b(str, th6);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("throwOrReportErrorInfoToKv", "com.tencent.mm.plugin.sns.data.SnsAdErrorUtils");
    }

    public static final void d(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, java.lang.Throwable th6) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("throwOrReportErrorInfoToKvWithSnsInfo", "com.tencent.mm.plugin.sns.data.SnsAdErrorUtils");
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        ca4.q qVar = f121537a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append("|aid=");
        sb6.append(c17933xe8d1b226 != null ? c17933xe8d1b226.m70355xb5882a06() : null);
        sb6.append("|snsId=");
        sb6.append(c17933xe8d1b226 != null ? java.lang.Long.valueOf(c17933xe8d1b226.f68891x29d1292e) : null);
        qVar.b(sb6.toString(), th6);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("throwOrReportErrorInfoToKvWithSnsInfo", "com.tencent.mm.plugin.sns.data.SnsAdErrorUtils");
    }

    public final void b(java.lang.String str, java.lang.Throwable th6) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportErrorInfoToKv", "com.tencent.mm.plugin.sns.data.SnsAdErrorUtils");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("err=");
        sb6.append(th6 != null ? jz5.a.b(th6) : null);
        ca4.e0.b("ad_common_exception_report", str, 0, 0, r26.p0.E0(r26.i0.v(sb6.toString(), ",", ";", false, 4, null), 1500));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportErrorInfoToKv", "com.tencent.mm.plugin.sns.data.SnsAdErrorUtils");
    }
}

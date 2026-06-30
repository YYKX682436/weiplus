package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123;

/* loaded from: classes4.dex */
public abstract class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.u0 f246520a = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.u0();

    public static void a(int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cdnCallback", "com.tencent.mm.plugin.sns.statistics.SnsUploadReportManager");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long longValue = f246520a.f246515d.get(java.lang.Integer.valueOf(i17)) == null ? 0L : ((java.lang.Long) f246520a.f246515d.get(java.lang.Integer.valueOf(i17))).longValue();
        if (longValue > 0) {
            f246520a.f246512a.f142295r = currentTimeMillis - longValue;
        } else {
            f246520a.f246512a.f142295r = -1L;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.u0 u0Var = f246520a;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6911x9d13da42 c6911x9d13da42 = u0Var.f246512a;
        c6911x9d13da42.f142287j = i17;
        c6911x9d13da42.f142286i = 4L;
        c6911x9d13da42.f142288k = i18;
        c6911x9d13da42.f142289l = i19;
        b(u0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cdnCallback", "com.tencent.mm.plugin.sns.statistics.SnsUploadReportManager");
    }

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.u0 u0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("report", "com.tencent.mm.plugin.sns.statistics.SnsUploadReportManager");
        u0Var.f246512a.k();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("report", "com.tencent.mm.plugin.sns.statistics.SnsUploadReportManager");
    }

    public static void c(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startUploadCDN", "com.tencent.mm.plugin.sns.statistics.SnsUploadReportManager");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        f246520a.f246515d.put(java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(currentTimeMillis));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.u0 u0Var = f246520a;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6911x9d13da42 c6911x9d13da42 = u0Var.f246512a;
        c6911x9d13da42.f142294q = currentTimeMillis - u0Var.f246514c;
        c6911x9d13da42.f142287j = i17;
        c6911x9d13da42.f142295r = 0L;
        c6911x9d13da42.f142286i = 3L;
        b(u0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startUploadCDN", "com.tencent.mm.plugin.sns.statistics.SnsUploadReportManager");
    }
}

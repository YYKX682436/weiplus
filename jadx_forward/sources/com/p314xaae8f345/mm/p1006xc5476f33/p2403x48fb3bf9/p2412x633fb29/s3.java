package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes.dex */
public final class s3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.s3 f264637a = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.s3();

    /* renamed from: b, reason: collision with root package name */
    public static final kk.j f264638b = new kk.l(10);

    public final java.lang.String a(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.t3 t3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.t3) ((com.p314xaae8f345.mm.sdk.p2603x2137b148.r2) f264638b).get(java.lang.Long.valueOf(j17));
        if (t3Var == null) {
            return null;
        }
        return b(t3Var.f264654a, t3Var.f264655b);
    }

    public final java.lang.String b(java.lang.String str, java.lang.String str2) {
        if (str == null || r26.n0.N(str)) {
            if (str2 == null || r26.n0.N(str2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewAdReportHelper", "getAdReportParams null");
                return null;
            }
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("bizInfo", str);
        jSONObject.put("sourceInfo", str2);
        return jSONObject.toString();
    }

    public final void c(long j17, boolean z17) {
        java.lang.String a17 = a(j17);
        if (a17 == null) {
            return;
        }
        ((ee0.c) ((fe0.k3) i95.n0.c(fe0.k3.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportAddDownloadTaskStraightComplete", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
        l44.z.b(4001009, a17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportAddDownloadTaskStraightComplete", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
        if (z17) {
            ((ee0.c) ((fe0.k3) i95.n0.c(fe0.k3.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportAddDownloadTaskStraightInstallStart", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
            l44.z.b(4001010, a17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportAddDownloadTaskStraightInstallStart", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
        }
    }
}

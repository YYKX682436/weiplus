package b84;

/* loaded from: classes4.dex */
public abstract class b {
    public static final void a(int i17, java.util.List list, long j17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportExpose", "com.tencent.mm.plugin.sns.ad.utils.collectedad.CollectedAdReport");
        if (list == null || list.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportExpose", "com.tencent.mm.plugin.sns.ad.utils.collectedad.CollectedAdReport");
            return;
        }
        r45.p3 p3Var = new r45.p3();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p2495xc50a8b8b.g c17 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.c(v34.b.e());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.CollectedAdReport", "exposureType: " + i17 + ", subAdInfoList size: " + list.size() + ", reportTimeStamp: " + currentTimeMillis);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            s34.v1 v1Var = (s34.v1) it.next();
            r45.x2 x2Var = new r45.x2();
            x2Var.f471203d = 1;
            x2Var.f471215s = i17;
            x2Var.f471212p = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
            x2Var.f471208i = c17;
            x2Var.B = currentTimeMillis;
            v1Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getReportExtraData", "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
            java.lang.String str = v1Var.f484328h;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getReportExtraData", "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
            x2Var.A = str;
            x2Var.f471214r = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(v1Var.a());
            x2Var.f471206g = com.p314xaae8f345.mm.p2495xc50a8b8b.g.c(v1Var.c());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGroupId", "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
            java.lang.String str2 = v1Var.f484323c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGroupId", "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
            x2Var.f471205f = com.p314xaae8f345.mm.p2495xc50a8b8b.g.c(str2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdPosId", "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
            java.lang.String str3 = v1Var.f484326f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdPosId", "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
            x2Var.f471217u = str3;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getExposureReportUrl", "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
            java.lang.String str4 = v1Var.f484325e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getExposureReportUrl", "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
            x2Var.f471207h = com.p314xaae8f345.mm.p2495xc50a8b8b.g.c(str4);
            x2Var.f471218v = (int) j17;
            x2Var.F = i18;
            java.util.LinkedList linkedList = p3Var.f464227e;
            if (linkedList != null) {
                linkedList.add(x2Var);
            }
            v1Var.a();
            v1Var.c();
        }
        p3Var.b().l();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportExpose", "com.tencent.mm.plugin.sns.ad.utils.collectedad.CollectedAdReport");
    }
}

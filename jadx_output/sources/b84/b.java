package b84;

/* loaded from: classes4.dex */
public abstract class b {
    public static final void a(int i17, java.util.List list, long j17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportExpose", "com.tencent.mm.plugin.sns.ad.utils.collectedad.CollectedAdReport");
        if (list == null || list.isEmpty()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportExpose", "com.tencent.mm.plugin.sns.ad.utils.collectedad.CollectedAdReport");
            return;
        }
        r45.p3 p3Var = new r45.p3();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.protobuf.g c17 = com.tencent.mm.protobuf.g.c(v34.b.e());
        com.tencent.mars.xlog.Log.i("SnsAd.CollectedAdReport", "exposureType: " + i17 + ", subAdInfoList size: " + list.size() + ", reportTimeStamp: " + currentTimeMillis);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            s34.v1 v1Var = (s34.v1) it.next();
            r45.x2 x2Var = new r45.x2();
            x2Var.f389670d = 1;
            x2Var.f389682s = i17;
            x2Var.f389679p = com.tencent.mm.sdk.platformtools.z.f193112h;
            x2Var.f389675i = c17;
            x2Var.B = currentTimeMillis;
            v1Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getReportExtraData", "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
            java.lang.String str = v1Var.f402795h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReportExtraData", "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
            x2Var.A = str;
            x2Var.f389681r = com.tencent.mm.sdk.platformtools.t8.E1(v1Var.a());
            x2Var.f389673g = com.tencent.mm.protobuf.g.c(v1Var.c());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGroupId", "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
            java.lang.String str2 = v1Var.f402790c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGroupId", "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
            x2Var.f389672f = com.tencent.mm.protobuf.g.c(str2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdPosId", "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
            java.lang.String str3 = v1Var.f402793f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdPosId", "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
            x2Var.f389684u = str3;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExposureReportUrl", "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
            java.lang.String str4 = v1Var.f402792e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExposureReportUrl", "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
            x2Var.f389674h = com.tencent.mm.protobuf.g.c(str4);
            x2Var.f389685v = (int) j17;
            x2Var.F = i18;
            java.util.LinkedList linkedList = p3Var.f382694e;
            if (linkedList != null) {
                linkedList.add(x2Var);
            }
            v1Var.a();
            v1Var.c();
        }
        p3Var.b().l();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportExpose", "com.tencent.mm.plugin.sns.ad.utils.collectedad.CollectedAdReport");
    }
}

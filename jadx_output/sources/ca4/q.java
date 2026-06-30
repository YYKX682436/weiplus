package ca4;

/* loaded from: classes4.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final ca4.q f40004a = new ca4.q();

    public static final void a(java.lang.String str, java.lang.String str2, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportErrorInfo", "com.tencent.mm.plugin.sns.data.SnsAdErrorUtils");
        java.lang.String str3 = "msg=" + str2;
        ca4.e0.b("ad_common_error_info_report", str, i17, 0, str3);
        com.tencent.mars.xlog.Log.e("" + str, str3);
        if (i17 != -1) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2023, i17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportErrorInfo", "com.tencent.mm.plugin.sns.data.SnsAdErrorUtils");
    }

    public static final void c(java.lang.String str, java.lang.Throwable th6) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("throwOrReportErrorInfoToKv", "com.tencent.mm.plugin.sns.data.SnsAdErrorUtils");
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mars.xlog.Log.e("SnsAdErrorUtils", "throwOrReportErrorInfoToKv msg=" + str);
        com.tencent.mars.xlog.Log.printErrStackTrace("SnsAdErrorUtils", th6, "kv_error_msg:", new java.lang.Object[0]);
        f40004a.b(str, th6);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("throwOrReportErrorInfoToKv", "com.tencent.mm.plugin.sns.data.SnsAdErrorUtils");
    }

    public static final void d(java.lang.String str, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, java.lang.Throwable th6) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("throwOrReportErrorInfoToKvWithSnsInfo", "com.tencent.mm.plugin.sns.data.SnsAdErrorUtils");
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        ca4.q qVar = f40004a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append("|aid=");
        sb6.append(snsInfo != null ? snsInfo.getAid() : null);
        sb6.append("|snsId=");
        sb6.append(snsInfo != null ? java.lang.Long.valueOf(snsInfo.field_snsId) : null);
        qVar.b(sb6.toString(), th6);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("throwOrReportErrorInfoToKvWithSnsInfo", "com.tencent.mm.plugin.sns.data.SnsAdErrorUtils");
    }

    public final void b(java.lang.String str, java.lang.Throwable th6) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportErrorInfoToKv", "com.tencent.mm.plugin.sns.data.SnsAdErrorUtils");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("err=");
        sb6.append(th6 != null ? jz5.a.b(th6) : null);
        ca4.e0.b("ad_common_exception_report", str, 0, 0, r26.p0.E0(r26.i0.v(sb6.toString(), ",", ";", false, 4, null), 1500));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportErrorInfoToKv", "com.tencent.mm.plugin.sns.data.SnsAdErrorUtils");
    }
}

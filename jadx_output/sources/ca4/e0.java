package ca4;

/* loaded from: classes4.dex */
public abstract class e0 {
    public static void a(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adTecReport", "com.tencent.mm.plugin.sns.data.SnsAdTecReportUtil");
        try {
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdTecReportUtil", "adTecReport exp=" + th6.toString());
        }
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adTecReport", "com.tencent.mm.plugin.sns.data.SnsAdTecReportUtil");
            return;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        if (str3 == null) {
            str3 = "";
        }
        com.tencent.mars.xlog.Log.i("SnsAdTecReportUtil", "adTecReport, actName=" + str + ", actValue=" + str2 + ", subType=" + i17 + ", subValue=" + i18 + ", extra=" + str3);
        if (str.equals("ad_common_exception_report")) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.E(19789, str, str2, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str3);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19789, str, str2, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str3);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adTecReport", "com.tencent.mm.plugin.sns.data.SnsAdTecReportUtil");
    }

    public static void b(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adTecReportOnSubThread", "com.tencent.mm.plugin.sns.data.SnsAdTecReportUtil");
        ((ku5.t0) ku5.t0.f312615d).q(new ca4.d0(str, str2, i17, i18, str3));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adTecReportOnSubThread", "com.tencent.mm.plugin.sns.data.SnsAdTecReportUtil");
    }
}

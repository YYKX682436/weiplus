package ca4;

/* loaded from: classes4.dex */
public abstract class c0 {
    public static java.lang.String a(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("encodeParams", "com.tencent.mm.plugin.sns.data.SnsAdReportAnalyseUtils");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("encodeParams", "com.tencent.mm.plugin.sns.data.SnsAdReportAnalyseUtils");
            return "";
        }
        try {
            str = java.net.URLEncoder.encode(str, com.tencent.mapsdk.internal.rv.f51270c);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("SnsAdReportAnalyseUtils", e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("encodeParams", "com.tencent.mm.plugin.sns.data.SnsAdReportAnalyseUtils");
        return str;
    }

    public static void b(int i17, long j17, com.tencent.mm.plugin.sns.storage.ADInfo aDInfo, com.tencent.mm.plugin.sns.storage.ADXml aDXml) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportAdDel", "com.tencent.mm.plugin.sns.data.SnsAdReportAnalyseUtils");
        c(i17, j17, aDInfo, aDXml, "");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportAdDel", "com.tencent.mm.plugin.sns.data.SnsAdReportAnalyseUtils");
    }

    public static void c(int i17, long j17, com.tencent.mm.plugin.sns.storage.ADInfo aDInfo, com.tencent.mm.plugin.sns.storage.ADXml aDXml, java.lang.String str) {
        int i18;
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportAdDel", "com.tencent.mm.plugin.sns.data.SnsAdReportAnalyseUtils");
        switch (i17) {
            case -1:
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportAdDel", "com.tencent.mm.plugin.sns.data.SnsAdReportAnalyseUtils");
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
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.A(1907, i18);
            i64.u1.b(22, 1, i18);
            java.lang.String str3 = "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.t8.K0(str) ? "" : str;
            java.lang.String a17 = aDInfo != null ? a(aDInfo.uxInfo) : "";
            if (aDXml != null && (str2 = aDXml.adExtInfo) != null) {
                str3 = str2;
            }
            com.tencent.mars.xlog.Log.i("SnsAdReportAnalyseUtils", "reportAdDel: snsId = " + ca4.z0.t0(j17) + ", uxInfo = " + a17 + ", adExtInfo = " + str3 + ", reportType = " + i18 + ", extInfo = " + str4);
            g0Var.d(19553, java.lang.Long.valueOf(j17), a17, str3, java.lang.Integer.valueOf(i18), str4);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdReportAnalyseUtils", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportAdDel", "com.tencent.mm.plugin.sns.data.SnsAdReportAnalyseUtils");
    }

    public static void d(long j17, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportAdPull", "com.tencent.mm.plugin.sns.data.SnsAdReportAnalyseUtils");
        try {
            com.tencent.mm.plugin.sns.storage.ADInfo aDInfo = new com.tencent.mm.plugin.sns.storage.ADInfo(str);
            com.tencent.mm.plugin.sns.storage.ADXml aDXml = new com.tencent.mm.plugin.sns.storage.ADXml(str2);
            java.lang.String a17 = a(aDInfo.uxInfo);
            java.lang.String str3 = aDXml.adExtInfo;
            if (str3 == null) {
                str3 = "";
            }
            com.tencent.mars.xlog.Log.i("SnsAdReportAnalyseUtils", "reportAdPull: snsId = " + j17 + ", uxInfo = " + a17 + ", adExtInfo = " + str3 + ", reportType = 1, extInfo = ");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19553, java.lang.Long.valueOf(j17), a17, str3, 1, "");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdReportAnalyseUtils", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportAdPull", "com.tencent.mm.plugin.sns.data.SnsAdReportAnalyseUtils");
    }

    public static void e(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, java.lang.String str4, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportOpenApp", "com.tencent.mm.plugin.sns.data.SnsAdReportAnalyseUtils");
        try {
            f(str, str2, i17, i18, str3, str4, i19, 0);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdReportAnalyseUtils", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportOpenApp", "com.tencent.mm.plugin.sns.data.SnsAdReportAnalyseUtils");
    }

    public static void f(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, java.lang.String str4, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportOpenApp", "com.tencent.mm.plugin.sns.data.SnsAdReportAnalyseUtils");
        try {
            com.tencent.mars.xlog.Log.i("SnsAdReportAnalyseUtils", "snsId = " + str + ", uxInfo = " + str3 + ", adExtInfo = " + str4 + ", appId = " + str2 + ", reportType = " + i17 + ", reportScene = " + i18 + ", reportOrigin = " + i19 + ", dialogType = " + i27);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19693, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), str, a(str3), str4, str2, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdReportAnalyseUtils", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportOpenApp", "com.tencent.mm.plugin.sns.data.SnsAdReportAnalyseUtils");
    }
}

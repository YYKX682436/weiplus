package com.tencent.mm.feature.performance;

/* loaded from: classes9.dex */
public class a implements jk.a {
    public java.lang.String a() {
        try {
            return android.util.Log.getStackTraceString(new java.lang.Throwable());
        } catch (java.lang.IllegalStateException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AlarmHelperReportCrashImpl", "getStack() %s", e17.getMessage());
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            return com.tencent.mm.sdk.platformtools.z3.b(true);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AlarmHelperReportCrashImpl", "getStack() %s", e18.getMessage());
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            return com.tencent.mm.sdk.platformtools.z3.b(true);
        }
    }

    public void b(int i17, int i18, java.lang.String str) {
        try {
            com.tencent.mm.autogen.mmdata.rpt.AlarmCrashStatisticsStruct alarmCrashStatisticsStruct = new com.tencent.mm.autogen.mmdata.rpt.AlarmCrashStatisticsStruct();
            alarmCrashStatisticsStruct.f55033e = alarmCrashStatisticsStruct.b("ProcessName", bm5.f1.a(), true);
            alarmCrashStatisticsStruct.f55032d = i17;
            alarmCrashStatisticsStruct.f55034f = i18;
            alarmCrashStatisticsStruct.f55035g = alarmCrashStatisticsStruct.b("Stack", a(), true);
            alarmCrashStatisticsStruct.k();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AlarmHelperReportCrashImpl", "AlarmHelper.IReportCrash Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
        }
    }
}

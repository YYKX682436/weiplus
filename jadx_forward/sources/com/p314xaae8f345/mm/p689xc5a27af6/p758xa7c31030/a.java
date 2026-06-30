package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030;

/* loaded from: classes9.dex */
public class a implements jk.a {
    public java.lang.String a() {
        try {
            return android.util.Log.getStackTraceString(new java.lang.Throwable());
        } catch (java.lang.IllegalStateException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AlarmHelperReportCrashImpl", "getStack() %s", e17.getMessage());
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AlarmHelperReportCrashImpl", "getStack() %s", e18.getMessage());
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
        }
    }

    public void b(int i17, int i18, java.lang.String str) {
        try {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6296xe2cbaee c6296xe2cbaee = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6296xe2cbaee();
            c6296xe2cbaee.f136566e = c6296xe2cbaee.b("ProcessName", bm5.f1.a(), true);
            c6296xe2cbaee.f136565d = i17;
            c6296xe2cbaee.f136567f = i18;
            c6296xe2cbaee.f136568g = c6296xe2cbaee.b("Stack", a(), true);
            c6296xe2cbaee.k();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AlarmHelperReportCrashImpl", "AlarmHelper.IReportCrash Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
        }
    }
}

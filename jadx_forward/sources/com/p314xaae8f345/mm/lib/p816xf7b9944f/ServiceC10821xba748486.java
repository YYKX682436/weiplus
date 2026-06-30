package com.p314xaae8f345.mm.lib.p816xf7b9944f;

/* renamed from: com.tencent.mm.lib.riskscanner.RiskScannerReqBufferService */
/* loaded from: classes13.dex */
public class ServiceC10821xba748486 extends com.p314xaae8f345.mm.p2770x36f002.AbstractServiceC22729xf7d3da8d {
    @Override // com.p314xaae8f345.mm.p2770x36f002.AbstractServiceC22729xf7d3da8d
    public void b(int i17, android.os.Bundle bundle, android.os.Bundle bundle2) {
        java.io.PrintWriter printWriter;
        java.io.PrintWriter printWriter2;
        if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RiskScannerReqBufferService", "invoke with op: %s, with arg: %s", java.lang.Integer.valueOf(i17), bundle);
            android.content.Context applicationContext = getApplicationContext();
            try {
                java.lang.ThreadLocal threadLocal = vm0.a.f519510a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RiskScannerReportService", "Report scan triggering.");
                jx3.f.INSTANCE.mo68477x336bdfd8(590L, 0L, 1L, true);
                java.lang.ThreadLocal threadLocal2 = vm0.a.f519510a;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                threadLocal2.set(java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
                ft5.c.a(applicationContext, new vm0.b(this, bundle2));
            } catch (java.lang.Throwable th6) {
                java.lang.ThreadLocal threadLocal3 = vm0.a.f519510a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RiskScannerReportService", "Report an exception with message: %s", th6.getMessage());
                vm0.a.f519510a.remove();
                jx3.f fVar = jx3.f.INSTANCE;
                fVar.mo68477x336bdfd8(590L, 4L, 1L, true);
                java.io.StringWriter stringWriter = null;
                java.io.PrintWriter printWriter3 = null;
                try {
                    java.io.StringWriter stringWriter2 = new java.io.StringWriter();
                    try {
                        printWriter2 = new java.io.PrintWriter(stringWriter2);
                        try {
                            th6.printStackTrace(printWriter2);
                            printWriter2.flush();
                            fVar.f(14177, "-1," + stringWriter2.toString().replace(",", "##"), false, true);
                            try {
                                stringWriter2.close();
                            } catch (java.lang.Throwable unused) {
                            }
                        } catch (java.lang.Throwable unused2) {
                            printWriter3 = printWriter2;
                            printWriter = printWriter3;
                            stringWriter = stringWriter2;
                            if (stringWriter != null) {
                                try {
                                    stringWriter.close();
                                } catch (java.lang.Throwable unused3) {
                                }
                            }
                            if (printWriter != null) {
                                printWriter2 = printWriter;
                                printWriter2.close();
                            }
                            return;
                        }
                    } catch (java.lang.Throwable unused4) {
                    }
                } catch (java.lang.Throwable unused5) {
                    printWriter = null;
                }
                try {
                    printWriter2.close();
                } catch (java.lang.Throwable unused6) {
                }
            }
        }
    }
}

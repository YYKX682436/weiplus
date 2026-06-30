package com.tencent.mm.lib.riskscanner;

/* loaded from: classes13.dex */
public class RiskScannerReqBufferService extends com.tencent.mm.util.HotpotService {
    @Override // com.tencent.mm.util.HotpotService
    public void b(int i17, android.os.Bundle bundle, android.os.Bundle bundle2) {
        java.io.PrintWriter printWriter;
        java.io.PrintWriter printWriter2;
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RiskScannerReqBufferService", "invoke with op: %s, with arg: %s", java.lang.Integer.valueOf(i17), bundle);
            android.content.Context applicationContext = getApplicationContext();
            try {
                java.lang.ThreadLocal threadLocal = vm0.a.f437977a;
                com.tencent.mars.xlog.Log.i("MicroMsg.RiskScannerReportService", "Report scan triggering.");
                jx3.f.INSTANCE.idkeyStat(590L, 0L, 1L, true);
                java.lang.ThreadLocal threadLocal2 = vm0.a.f437977a;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                threadLocal2.set(java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
                ft5.c.a(applicationContext, new vm0.b(this, bundle2));
            } catch (java.lang.Throwable th6) {
                java.lang.ThreadLocal threadLocal3 = vm0.a.f437977a;
                com.tencent.mars.xlog.Log.i("MicroMsg.RiskScannerReportService", "Report an exception with message: %s", th6.getMessage());
                vm0.a.f437977a.remove();
                jx3.f fVar = jx3.f.INSTANCE;
                fVar.idkeyStat(590L, 4L, 1L, true);
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

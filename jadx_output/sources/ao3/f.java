package ao3;

/* loaded from: classes7.dex */
public class f implements java.lang.Runnable {
    public f(ao3.g gVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences.b(com.tencent.mm.sdk.platformtools.x2.f193071a, "system_config_prefs", 4);
        if (android.os.SystemClock.elapsedRealtime() - o4Var.getLong("NFC_REPORT_TIME", 0L) > 86400000) {
            int a17 = yn3.a.c().a(com.tencent.mm.sdk.platformtools.x2.f193071a);
            int i17 = a17 == 0 ? 0 : 1;
            boolean a18 = fd1.d.a();
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreCpuCard", "NFC report isSupportNFC: %d, isSupportHCE: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(a18 ? 1 : 0));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12779, wo.w0.g(true), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(a18 ? 1 : 0));
            o4Var.putLong("NFC_REPORT_TIME", android.os.SystemClock.elapsedRealtime());
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreCpuCard", "doNFCReport status = " + a17);
        }
    }
}

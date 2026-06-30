package ao3;

/* loaded from: classes7.dex */
public class f implements java.lang.Runnable {
    public f(ao3.g gVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) com.p314xaae8f345.mm.sdk.p2603x2137b148.SharedPreferencesC20998x2b0514dd.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "system_config_prefs", 4);
        if (android.os.SystemClock.elapsedRealtime() - o4Var.getLong("NFC_REPORT_TIME", 0L) > 86400000) {
            int a17 = yn3.a.c().a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            int i17 = a17 == 0 ? 0 : 1;
            boolean a18 = fd1.d.a();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreCpuCard", "NFC report isSupportNFC: %d, isSupportHCE: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(a18 ? 1 : 0));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12779, wo.w0.g(true), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(a18 ? 1 : 0));
            o4Var.putLong("NFC_REPORT_TIME", android.os.SystemClock.elapsedRealtime());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreCpuCard", "doNFCReport status = " + a17);
        }
    }
}

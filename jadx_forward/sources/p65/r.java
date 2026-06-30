package p65;

/* loaded from: classes12.dex */
public class r implements vx5.m0 {
    public r(p65.s sVar) {
    }

    public void a(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XWeb.IsolatedStartupRoutine", "setupChildProcessCrashDumpFiles, crashDumpFileSuffix:" + str2);
        try {
            com.p314xaae8f345.mm.app.s4.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, android.os.ParcelFileDescriptor.open(new java.io.File(com.p314xaae8f345.mm.app.t4.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str, str2)), 939524096), android.os.ParcelFileDescriptor.open(new java.io.File(com.p314xaae8f345.mm.app.t4.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str, str2)), 939524096));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.XWeb.IsolatedStartupRoutine", "setupChildProcessCrashDumpFiles, error:" + e17);
        }
    }
}

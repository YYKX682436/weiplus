package x73;

/* loaded from: classes11.dex */
public class g implements x73.h {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f533980a;

    /* renamed from: b, reason: collision with root package name */
    public android.content.ServiceConnection f533981b;

    public g(android.content.Context context) {
        this.f533980a = context;
    }

    public int a(java.lang.String str, oq1.n nVar, boolean z17) {
        android.content.Context context = this.f533980a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.c()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMdiffPatchListener", "[-] In GP version, skip onPachReceived logic.");
            return 0;
        }
        try {
            this.f533981b = new x73.f(this);
            context.bindService(new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.hp.p1778xc02f49a5.ServiceC16109x5524a4d6.class), this.f533981b, 1);
        } catch (java.lang.Throwable unused) {
        }
        if (z17) {
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = com.p314xaae8f345.mm.p1006xc5476f33.hp.p1778xc02f49a5.IntentServiceC16111xacef6e0e.f223934d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.MergeHdiffApkService.HdiffApk", "preLoadPatchProcess...");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.hp.p1778xc02f49a5.IntentServiceC16111xacef6e0e.class);
            intent.putExtra("is_preload_patch_process", true);
            try {
                context.startService(intent);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Tinker.MergeHdiffApkService.HdiffApk", "run patch service fail, exception:" + th6);
            }
        } else {
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean2 = com.p314xaae8f345.mm.p1006xc5476f33.hp.p1778xc02f49a5.IntentServiceC16111xacef6e0e.f223934d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.MergeHdiffApkService.HdiffApk", "run patch service...");
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = ak0.n.f87074a;
            ak0.o.b();
            com.p314xaae8f345.p3076xcbed6b1f.lib.p3079x7643c6b5.IntentServiceC26594x4aa6a22c.a(ak0.o.a());
            android.os.Bundle bundle = new android.os.Bundle();
            android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.hp.p1778xc02f49a5.IntentServiceC16111xacef6e0e.class);
            bundle.putString("patch_path_extra", str);
            bundle.putParcelable("patch_syncresponse_extra", (com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb) nVar);
            intent2.putExtra("result_bundle_extra", bundle);
            try {
                context.startService(intent2);
            } catch (java.lang.Throwable th7) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Tinker.MergeHdiffApkService.HdiffApk", "run patch service fail, exception:" + th7);
            }
        }
        return 0;
    }
}

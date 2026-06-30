package aw1;

/* loaded from: classes11.dex */
public final class k1 {
    public k1(kotlin.jvm.internal.i iVar) {
    }

    public final int a() {
        l75.k0 k0Var = gm0.j1.u().f273153f;
        long e17 = k0Var.e();
        long h17 = k0Var.h(e17);
        long k17 = k0Var.k();
        if (h17 > com.tencent.tmassistantsdk.downloadservice.DownloadHelper.SAVE_LENGTH || e17 < h17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VacuumTask", "Threshold not matched, skip vacuum (freelist: " + e17 + ", remain: " + h17 + ')');
            return 0;
        }
        aw1.m1.f14609a = true;
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.d(25824, "EnMicroMsg.db", k0Var.getPath(), java.lang.Long.valueOf(k17), 0, java.lang.Long.valueOf(e17), "c2-before", 0, java.lang.Long.valueOf(h17), 0, 0, 0, 1, 0);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean u17 = k0Var.u();
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        fVar.d(25824, "EnMicroMsg.db", k0Var.getPath(), java.lang.Long.valueOf(k17), 0, java.lang.Long.valueOf(e17), "c2-" + u17, java.lang.Long.valueOf(k0Var.k()), java.lang.Long.valueOf(h17), java.lang.Long.valueOf(k17 - k0Var.k()), java.lang.Long.valueOf(currentTimeMillis2), 0, 1, java.lang.Long.valueOf(h17 / currentTimeMillis2));
        aw1.m1.f14609a = false;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Vacuum ");
        sb6.append(u17 ? "done" : com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED);
        sb6.append('.');
        com.tencent.mars.xlog.Log.i("MicroMsg.VacuumTask", sb6.toString());
        return u17 ? 1 : -1;
    }
}

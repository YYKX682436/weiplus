package com.tencent.mm.booter;

/* loaded from: classes12.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.booter.CoreService f63359d;

    public g(com.tencent.mm.booter.CoreService coreService) {
        this.f63359d = coreService;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.booter.l lVar = com.tencent.mm.booter.CoreService.f63234v;
        this.f63359d.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.CoreService", "initOther");
        com.tencent.mm.booter.l lVar2 = com.tencent.mm.booter.CoreService.f63234v;
        if (lVar2 != null) {
            ((com.tencent.mm.app.k0) lVar2).a(com.tencent.mm.sdk.platformtools.x2.f193071a);
            com.tencent.mm.app.k0 k0Var = (com.tencent.mm.app.k0) com.tencent.mm.booter.CoreService.f63234v;
            k0Var.getClass();
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.sdk.platformtools.x2.f193071a.getFilesDir(), com.google.android.gms.measurement.AppMeasurement.CRASH_ORIGIN);
            com.tencent.mm.app.k0.f53475h = r6Var.o();
            if (!r6Var.m()) {
                r6Var.J();
            }
            if (k0Var.f53481f == null) {
                com.tencent.mm.app.j0 j0Var = new com.tencent.mm.app.j0(com.tencent.mm.app.k0.f53475h);
                k0Var.f53481f = j0Var;
                j0Var.startWatching();
            }
            k0Var.f53479d.postDelayed(k0Var.f53480e, 3600000L);
        }
    }
}

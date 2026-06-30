package com.tencent.mm.plugin.appbrand.v8_snapshot;

/* loaded from: classes7.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.v8_snapshot.AndroidWxaCommLibV8SnapshotService f90729d;

    public i(com.tencent.mm.plugin.appbrand.v8_snapshot.AndroidWxaCommLibV8SnapshotService androidWxaCommLibV8SnapshotService) {
        this.f90729d = androidWxaCommLibV8SnapshotService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.plugin.appbrand.v8_snapshot.AndroidWxaCommLibV8SnapshotService.f90649e;
        com.tencent.mm.plugin.appbrand.v8_snapshot.AndroidWxaCommLibV8SnapshotService androidWxaCommLibV8SnapshotService = this.f90729d;
        androidWxaCommLibV8SnapshotService.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AndroidWxaCommLibV8SnapshotService", "exitIfCan");
        if (androidWxaCommLibV8SnapshotService.f90650d.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AndroidWxaCommLibV8SnapshotService", "exitIfCan, do exit");
            androidWxaCommLibV8SnapshotService.stopSelf();
        }
    }
}

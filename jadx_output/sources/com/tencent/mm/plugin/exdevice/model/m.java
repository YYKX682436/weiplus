package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes13.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.model.o3 f98991d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.model.o f98992e;

    public m(com.tencent.mm.plugin.exdevice.model.o oVar, com.tencent.mm.plugin.exdevice.model.o3 o3Var) {
        this.f98992e = oVar;
        this.f98991d = o3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.exdevice.model.o oVar = this.f98992e;
        boolean z17 = true;
        if (oVar.f99006a == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.exdevice.ExDeviceTaskService", "dispathcer is null, now try to reset it");
            if (oVar.f99007b != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExDeviceTaskService", "prepare dispatcher is not null. not prepare it");
                com.tencent.mm.plugin.exdevice.model.d0 d0Var = ((com.tencent.mm.plugin.exdevice.model.t) oVar.f99007b).f99063a;
                if (d0Var.f98865a == null) {
                    u32.r rVar = new u32.r();
                    d0Var.f98865a = rVar;
                    rVar.f424356d = null;
                }
                d0Var.f98865a.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
                new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.exdevice.model.l(oVar), true).c(100L, 100L);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExDeviceTaskService", "prepare dispatcher is null");
            }
            z17 = false;
        }
        com.tencent.mm.plugin.exdevice.model.o3 o3Var = this.f98991d;
        if (z17) {
            o3Var.a(oVar.f99006a, oVar);
        } else {
            oVar.f99008c.add(o3Var);
        }
    }
}

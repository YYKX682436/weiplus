package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes13.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f98996d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.model.o0 f98997e;

    public n0(com.tencent.mm.plugin.exdevice.model.o0 o0Var, java.util.List list) {
        this.f98997e = o0Var;
        this.f98996d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceEventManager", "Wifi device heart beat");
        java.util.List<v32.b> list = this.f98996d;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (v32.b bVar : list) {
            u32.h1.c().b(new w32.k(bVar.field_brandName, bVar.field_deviceType, bVar.field_deviceID, 1));
        }
        this.f98997e.U.postDelayed(this, 300000L);
    }
}

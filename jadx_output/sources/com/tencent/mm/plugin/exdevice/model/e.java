package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes9.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.model.k f98879d;

    public e(com.tencent.mm.plugin.exdevice.model.k kVar) {
        this.f98879d = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.exdevice.model.k kVar = this.f98879d;
        for (java.lang.String str : kVar.f98950g.keySet()) {
            com.tencent.mars.xlog.Log.i("ExDeviceSendIotLogic", "start send pending " + str);
            com.tencent.mm.feature.exdevice.NetworkDeviceInfo networkDeviceInfo = (com.tencent.mm.feature.exdevice.NetworkDeviceInfo) kVar.f98950g.get(str);
            if (networkDeviceInfo != null) {
                kVar.b(kVar.f98951h, networkDeviceInfo, kVar.f98956m);
            }
        }
        kVar.f98950g.clear();
    }
}

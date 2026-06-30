package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes9.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.model.k f98863d;

    public d(com.tencent.mm.plugin.exdevice.model.k kVar) {
        this.f98863d = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.exdevice.model.k kVar = this.f98863d;
        for (java.lang.String str : kVar.f98950g.keySet()) {
            com.tencent.mars.xlog.Log.i("ExDeviceSendIotLogic", "start send pending " + str);
            com.tencent.mm.plugin.exdevice.model.p.l(str, "send_data_failed");
        }
        kVar.f98950g.clear();
    }
}

package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes13.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.i f99450d;

    public f(com.tencent.mm.plugin.exdevice.ui.i iVar) {
        this.f99450d = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI exdeviceAddDataSourceUI = this.f99450d.f99499a;
        int i17 = com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI.f99162s;
        exdeviceAddDataSourceUI.T6(1);
        com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceAddDataSourceUI", "Stop scan...");
    }
}

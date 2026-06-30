package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes13.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.i f99460d;

    public g(com.tencent.mm.plugin.exdevice.ui.i iVar) {
        this.f99460d = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean e17 = lq1.a.e();
        com.tencent.mm.plugin.exdevice.ui.i iVar = this.f99460d;
        if (!e17) {
            com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI exdeviceAddDataSourceUI = iVar.f99499a;
            int i17 = com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI.f99162s;
            exdeviceAddDataSourceUI.T6(1);
        } else {
            com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI exdeviceAddDataSourceUI2 = iVar.f99499a;
            int i18 = com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI.f99162s;
            exdeviceAddDataSourceUI2.T6(3);
            com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceAddDataSourceUI", "Start scan...");
        }
    }
}

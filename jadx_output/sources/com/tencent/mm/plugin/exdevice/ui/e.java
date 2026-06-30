package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes13.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.i f99434d;

    public e(com.tencent.mm.plugin.exdevice.ui.i iVar) {
        this.f99434d = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.exdevice.ui.i iVar = this.f99434d;
        if (iVar.f99499a.f99171o && !com.tencent.mm.sdk.platformtools.n2.a()) {
            iVar.f99499a.T6(4);
        } else {
            iVar.f99499a.T6(3);
            com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceAddDataSourceUI", "Start scan...");
        }
    }
}

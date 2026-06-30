package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes13.dex */
public class i extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI f99499a;

    public i(com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI exdeviceAddDataSourceUI) {
        this.f99499a = exdeviceAddDataSourceUI;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceAddDataSourceUI", "Receive action broadcast failed...");
            return;
        }
        java.lang.String action = intent.getAction();
        boolean equals = "android.bluetooth.adapter.action.STATE_CHANGED".equals(action);
        com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI exdeviceAddDataSourceUI = this.f99499a;
        if (equals) {
            if (intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE) == 12) {
                if (lq1.a.e()) {
                    exdeviceAddDataSourceUI.runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.e(this));
                    if (!exdeviceAddDataSourceUI.f99171o || com.tencent.mm.sdk.platformtools.n2.a()) {
                        com.tencent.mm.plugin.exdevice.model.l3.Di().f();
                    }
                }
            } else if (intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE) == 10 && !lq1.a.e()) {
                exdeviceAddDataSourceUI.runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.f(this));
                com.tencent.mm.plugin.exdevice.model.l3.Ni().e();
            }
        }
        if (exdeviceAddDataSourceUI.f99171o && "android.location.MODE_CHANGED".equals(action)) {
            if (!com.tencent.mm.sdk.platformtools.n2.a()) {
                exdeviceAddDataSourceUI.runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.h(this));
                com.tencent.mm.plugin.exdevice.model.l3.Ni().e();
            } else {
                exdeviceAddDataSourceUI.runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.g(this));
                if (lq1.a.e()) {
                    com.tencent.mm.plugin.exdevice.model.l3.Di().f();
                }
            }
        }
    }
}

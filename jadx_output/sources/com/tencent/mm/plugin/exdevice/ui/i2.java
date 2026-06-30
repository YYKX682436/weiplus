package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes15.dex */
public class i2 implements db5.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI f99501a;

    public i2(com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI exdeviceDeviceProfileUI) {
        this.f99501a = exdeviceDeviceProfileUI;
    }

    @Override // db5.a1
    public boolean onFinish(java.lang.CharSequence charSequence) {
        java.lang.String charSequence2 = charSequence != null ? charSequence.toString() : "";
        com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI exdeviceDeviceProfileUI = this.f99501a;
        if (exdeviceDeviceProfileUI.f99270v) {
            exdeviceDeviceProfileUI.f99265q = charSequence2;
            exdeviceDeviceProfileUI.runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.h2(this));
            v32.b L0 = com.tencent.mm.plugin.exdevice.model.l3.Ui().L0(exdeviceDeviceProfileUI.f99261m, exdeviceDeviceProfileUI.f99262n);
            if (L0 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceDeviceProfileUI", "hard device info is null.(deviceId:%s, deviceType:%s)", exdeviceDeviceProfileUI.f99261m, exdeviceDeviceProfileUI.f99262n);
                return false;
            }
            L0.f237106y = exdeviceDeviceProfileUI.f99265q;
            L0.f237101t = true;
            com.tencent.mm.plugin.exdevice.model.l3.Ui().update(L0, new java.lang.String[0]);
        } else {
            com.tencent.mm.plugin.exdevice.model.s2 s2Var = new com.tencent.mm.plugin.exdevice.model.s2(exdeviceDeviceProfileUI.f99261m, exdeviceDeviceProfileUI.f99262n, charSequence2, 0);
            exdeviceDeviceProfileUI.runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.e2(exdeviceDeviceProfileUI, s2Var));
            gm0.j1.n().f273288b.a(1263, exdeviceDeviceProfileUI);
            gm0.j1.n().f273288b.g(s2Var);
        }
        return true;
    }
}

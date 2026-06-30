package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes15.dex */
public class y1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI f99726d;

    public y1(com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI exdeviceDeviceProfileUI) {
        this.f99726d = exdeviceDeviceProfileUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI exdeviceDeviceProfileUI = this.f99726d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = exdeviceDeviceProfileUI.f99256e;
        if (u3Var != null && u3Var.isShowing()) {
            exdeviceDeviceProfileUI.f99256e.dismiss();
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var2 = exdeviceDeviceProfileUI.f99255d;
        if (u3Var2 == null || !u3Var2.isShowing()) {
            return;
        }
        exdeviceDeviceProfileUI.f99255d.dismiss();
    }
}

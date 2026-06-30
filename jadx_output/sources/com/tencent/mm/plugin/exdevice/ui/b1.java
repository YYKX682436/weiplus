package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes15.dex */
public class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI f99406d;

    public b1(com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI exdeviceConnectWifiUI) {
        this.f99406d = exdeviceConnectWifiUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI exdeviceConnectWifiUI = this.f99406d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = exdeviceConnectWifiUI.f99220m;
        if (u3Var == null || !u3Var.isShowing()) {
            return;
        }
        exdeviceConnectWifiUI.f99220m.dismiss();
    }
}

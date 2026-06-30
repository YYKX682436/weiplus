package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes15.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI f99437d;

    public e1(com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI exdeviceConnectWifiUI) {
        this.f99437d = exdeviceConnectWifiUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI.I;
        com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI exdeviceConnectWifiUI = this.f99437d;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(exdeviceConnectWifiUI.X6())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "User has input password.");
            return;
        }
        exdeviceConnectWifiUI.f99217g.setText(exdeviceConnectWifiUI.f99222o.f334475f);
        android.text.Editable text = exdeviceConnectWifiUI.f99217g.getText();
        if (text != null) {
            android.text.Selection.setSelection(text, text.length());
        }
    }
}

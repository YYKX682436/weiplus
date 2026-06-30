package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes15.dex */
public class m1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI f99562d;

    public m1(com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI exdeviceConnectWifiUI) {
        this.f99562d = exdeviceConnectWifiUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI exdeviceConnectWifiUI = this.f99562d;
        if (!exdeviceConnectWifiUI.f99224q) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("is_wifi_connected", exdeviceConnectWifiUI.C != com.tencent.mm.plugin.exdevice.ui.s1.NO_WIFI_CONNECTED);
            exdeviceConnectWifiUI.setResult(0, intent);
            exdeviceConnectWifiUI.finish();
        }
        return false;
    }
}

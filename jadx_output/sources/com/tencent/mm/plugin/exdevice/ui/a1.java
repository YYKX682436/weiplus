package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes15.dex */
public class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI f99397d;

    public a1(com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI exdeviceConnectWifiUI) {
        this.f99397d = exdeviceConnectWifiUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI exdeviceConnectWifiUI = this.f99397d;
        exdeviceConnectWifiUI.f99220m = db5.e1.Q(exdeviceConnectWifiUI.getContext(), exdeviceConnectWifiUI.getString(com.tencent.mm.R.string.f490573yv), exdeviceConnectWifiUI.getString(com.tencent.mm.R.string.f491152c53), true, true, new com.tencent.mm.plugin.exdevice.ui.z0(this));
    }
}

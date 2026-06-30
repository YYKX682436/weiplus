package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes15.dex */
public class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f99698d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f99699e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI f99700f;

    public v0(com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI exdeviceConnectWifiUI, java.lang.String str, java.lang.String str2) {
        this.f99700f = exdeviceConnectWifiUI;
        this.f99698d = str;
        this.f99699e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI exdeviceConnectWifiUI = this.f99700f;
        exdeviceConnectWifiUI.F.acquire();
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "Start AirKiss result (%d). input ssid = %s", java.lang.Integer.valueOf(com.tencent.mm.plugin.exdevice.jni.Java2CExDevice.startAirKissWithInterV2(this.f99698d, this.f99699e, exdeviceConnectWifiUI.f99226s, 60000L, exdeviceConnectWifiUI.f99227t, exdeviceConnectWifiUI.f99228u)), this.f99699e);
    }
}

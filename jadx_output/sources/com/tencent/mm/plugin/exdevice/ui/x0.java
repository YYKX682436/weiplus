package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes15.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI f99717d;

    public x0(com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI exdeviceConnectWifiUI) {
        this.f99717d = exdeviceConnectWifiUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI exdeviceConnectWifiUI = this.f99717d;
        try {
            byte[] N = com.tencent.mm.vfs.w6.N(gm0.j1.u().d() + "exdevice_wifi_infos", 0, Integer.MAX_VALUE);
            if (N != null) {
                exdeviceConnectWifiUI.B.parseFrom(N);
                exdeviceConnectWifiUI.V6();
            }
        } catch (java.lang.Exception e17) {
            e17.getMessage();
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.ExdeviceConnectWifiUI", e17, "", new java.lang.Object[0]);
        }
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.exdevice.ui.w0(this), 500L);
    }
}

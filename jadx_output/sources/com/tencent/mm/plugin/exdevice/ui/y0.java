package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes15.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI f99725d;

    public y0(com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI exdeviceConnectWifiUI) {
        this.f99725d = exdeviceConnectWifiUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI exdeviceConnectWifiUI = this.f99725d;
        java.lang.String str = exdeviceConnectWifiUI.f99221n;
        java.lang.String X6 = exdeviceConnectWifiUI.X6();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (X6 == null) {
            X6 = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "ssid is null or nil.");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(exdeviceConnectWifiUI.f99222o.f334474e) || (str.equals(exdeviceConnectWifiUI.f99222o.f334474e) && !X6.equals(exdeviceConnectWifiUI.f99222o.f334475f))) {
            n32.a W6 = exdeviceConnectWifiUI.W6(exdeviceConnectWifiUI.f99225r, str);
            if (W6 == null) {
                W6 = new n32.a();
                W6.f334474e = str;
                W6.f334473d = exdeviceConnectWifiUI.f99225r;
                exdeviceConnectWifiUI.B.f334476d.add(W6);
            }
            ae0.h hVar = (ae0.h) i95.n0.c(ae0.h.class);
            java.lang.String a17 = com.tencent.mm.plugin.exdevice.ui.r1.a(exdeviceConnectWifiUI.f99225r, str);
            ((zd0.e) hVar).getClass();
            W6.f334475f = xp1.c.h(X6, a17);
        } else if (!exdeviceConnectWifiUI.f99223p) {
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "password hasn't changed, so do not need to save.");
            return;
        }
        java.lang.String str2 = gm0.j1.u().d() + "exdevice_wifi_infos";
        try {
            byte[] byteArray = exdeviceConnectWifiUI.B.toByteArray();
            com.tencent.mm.vfs.w6.S(str2, byteArray, 0, byteArray.length);
        } catch (java.io.IOException e17) {
            e17.getMessage();
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.ExdeviceConnectWifiUI", e17, "", new java.lang.Object[0]);
        }
    }
}

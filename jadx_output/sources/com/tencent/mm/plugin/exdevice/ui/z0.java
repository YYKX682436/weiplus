package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes15.dex */
public class z0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.a1 f99733d;

    public z0(com.tencent.mm.plugin.exdevice.ui.a1 a1Var) {
        this.f99733d = a1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "On progress cancel, stop airkiss");
        com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI exdeviceConnectWifiUI = this.f99733d.f99397d;
        if (exdeviceConnectWifiUI.C != com.tencent.mm.plugin.exdevice.ui.s1.FINISH) {
            exdeviceConnectWifiUI.getClass();
            com.tencent.mm.plugin.exdevice.jni.Java2CExDevice.stopAirKissV2();
            exdeviceConnectWifiUI.Z6(true);
            if (exdeviceConnectWifiUI.F.isHeld()) {
                exdeviceConnectWifiUI.F.release();
            }
        }
    }
}

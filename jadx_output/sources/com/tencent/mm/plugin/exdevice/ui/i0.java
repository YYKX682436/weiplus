package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes13.dex */
public class i0 implements java.lang.Runnable {
    public i0(com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI exdeviceBindDeviceUI) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.exdevice.jni.Java2CExDevice.stopScanWCLanDeviceV2();
        com.tencent.mm.plugin.exdevice.jni.Java2CExDevice.releaseWCLanDeviceLibV2();
    }
}

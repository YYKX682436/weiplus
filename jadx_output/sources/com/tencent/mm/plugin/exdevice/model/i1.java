package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes13.dex */
public class i1 implements java.lang.Runnable {
    public i1(com.tencent.mm.plugin.exdevice.model.j1 j1Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "releaseWCLanDeviceLib...");
        com.tencent.mm.plugin.exdevice.jni.Java2CExDevice.releaseWCLanDeviceLibV2();
    }
}

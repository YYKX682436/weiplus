package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes13.dex */
public class y0 implements java.lang.Runnable {
    public y0(com.tencent.mm.plugin.exdevice.model.z0 z0Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "releaseWCLanDeviceLib...");
        com.tencent.mm.plugin.exdevice.jni.Java2CExDevice.releaseWCLanDeviceLibV2();
    }
}

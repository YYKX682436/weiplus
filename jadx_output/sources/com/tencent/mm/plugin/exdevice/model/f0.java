package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes13.dex */
public class f0 implements com.tencent.mm.plugin.exdevice.model.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.model.o0 f98885a;

    public f0(com.tencent.mm.plugin.exdevice.model.o0 o0Var) {
        this.f98885a = o0Var;
    }

    public void a(java.lang.String str, byte[] bArr, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceEventManager", "OnScanDevice %s", str);
        this.f98885a.getClass();
        if (bArr == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceEventManager", "notifyOnScanDeviceResult. deviceId=%s, isCompleted=%s", str, java.lang.Boolean.valueOf(z17));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceEventManager", "notifyOnScanDeviceResult. deviceId=%s, base64(broadcastData)=%s, isCompleted=%s", str, android.util.Base64.encodeToString(bArr, 0), java.lang.Boolean.valueOf(z17));
        }
        com.tencent.mm.autogen.events.ExDeviceOnScanDeviceResultEvent exDeviceOnScanDeviceResultEvent = new com.tencent.mm.autogen.events.ExDeviceOnScanDeviceResultEvent();
        am.n6 n6Var = exDeviceOnScanDeviceResultEvent.f54153g;
        n6Var.f7404b = bArr;
        n6Var.f7403a = str;
        n6Var.f7405c = z17;
        exDeviceOnScanDeviceResultEvent.b(android.os.Looper.getMainLooper());
    }
}

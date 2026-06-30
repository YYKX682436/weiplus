package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes13.dex */
public class f0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o0 f180418a;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o0 o0Var) {
        this.f180418a = o0Var;
    }

    public void a(java.lang.String str, byte[] bArr, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceEventManager", "OnScanDevice %s", str);
        this.f180418a.getClass();
        if (bArr == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceEventManager", "notifyOnScanDeviceResult. deviceId=%s, isCompleted=%s", str, java.lang.Boolean.valueOf(z17));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceEventManager", "notifyOnScanDeviceResult. deviceId=%s, base64(broadcastData)=%s, isCompleted=%s", str, android.util.Base64.encodeToString(bArr, 0), java.lang.Boolean.valueOf(z17));
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5360x6adc0762 c5360x6adc0762 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5360x6adc0762();
        am.n6 n6Var = c5360x6adc0762.f135686g;
        n6Var.f88937b = bArr;
        n6Var.f88936a = str;
        n6Var.f88938c = z17;
        c5360x6adc0762.b(android.os.Looper.getMainLooper());
    }
}

package u32;

/* loaded from: classes13.dex */
public final class i implements u32.a1 {

    /* renamed from: h, reason: collision with root package name */
    public static u32.i f505836h;

    /* renamed from: e, reason: collision with root package name */
    public final u32.x f505838e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f505837d = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f505839f = new u32.b(this, u32.i1.a().f505843b.mo50284xdd3e8650());

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f505840g = new java.lang.Object();

    public i(u32.x xVar) {
        this.f505838e = null;
        this.f505838e = xVar;
        f505836h = this;
    }

    public static boolean d(u32.i iVar, long j17) {
        iVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BTDeviceManager", "startChannelImp deviceId = %d", java.lang.Long.valueOf(j17));
        if (v32.a.c("conneted_device", j17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.BTDeviceManager", "This deviceId is not call stop channel before startChannel, Call it");
            iVar.f(j17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.jni.C13411x69f9c21c.LongWrapper longWrapper = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.jni.C13411x69f9c21c.LongWrapper();
        longWrapper.f35464x6ac9171 = -1L;
        int m54993xffcc2d43 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.jni.C13411x69f9c21c.m54993xffcc2d43(j17, longWrapper);
        u32.x xVar = iVar.f505838e;
        if (m54993xffcc2d43 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BTDeviceManager", "Java2CExDevice.createChannelV2 Failed, ret = " + m54993xffcc2d43);
            ((u32.a2) xVar).g(j17, 1, 4, -1);
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BTDeviceManager", "Create channel id is ok, deviceId = %d, channelId = %d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(longWrapper.f35464x6ac9171));
        iVar.f505837d.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(longWrapper.f35464x6ac9171));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BTDeviceManager", "add the device to connected devices : [%d]", java.lang.Long.valueOf(j17));
        if (!v32.a.a("conneted_device", j17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BTDeviceManager", "addToSharedPreferences failed!!!");
            ((u32.a2) xVar).g(j17, 1, 4, -1);
            return false;
        }
        int m55030xc49a92d0 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.jni.C13411x69f9c21c.m55030xc49a92d0(longWrapper.f35464x6ac9171);
        if (m55030xc49a92d0 == 0) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BTDeviceManager", "Java2CExDevice.startChannelServiceV2 Failed, ret = " + m55030xc49a92d0);
        ((u32.a2) xVar).g(j17, 1, 4, -1);
        return false;
    }

    @Override // u32.a1
    public void a(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BTDeviceManager", "------onScanError------ error code = %d, error msg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i17));
        if (this.f505839f.mo50293x3498a0(new u32.a(this))) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BTDeviceManager", "onScanError: mHandler.post failed!!!");
    }

    @Override // u32.a1
    public void b(java.lang.String str, java.lang.String str2, int i17, int i18, byte[] bArr) {
        u32.d dVar = new u32.d(str, str2, i18, bArr);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f505839f;
        iz5.a.g(null, n3Var.mo50308x2936bf5f(n3Var.mo50291x733c63a2(1, 0, 0, dVar)));
    }

    @Override // u32.a1
    public void c(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BTDeviceManager", "******onScanFinished******aBluetoothVersion = " + i17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f505839f;
        iz5.a.g(null, n3Var.mo50308x2936bf5f(n3Var.mo50291x733c63a2(2, 0, 0, null)));
    }

    public final long e(long j17) {
        java.util.HashMap hashMap = this.f505837d;
        if (!hashMap.containsValue(java.lang.Long.valueOf(j17))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BTDeviceManager", "Cannot find DeviceInfo by channelId");
            return -1L;
        }
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            if (j17 == ((java.lang.Long) entry.getValue()).longValue()) {
                return ((java.lang.Long) entry.getKey()).longValue();
            }
        }
        iz5.a.g(null, false);
        return -1L;
    }

    public final boolean f(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BTDeviceManager", "stopChannelImp deviceId = " + j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BTDeviceManager", "remove the device from connected devices : [%d]", java.lang.Long.valueOf(j17));
        if (!v32.a.d("conneted_device", j17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BTDeviceManager", "removeFromSharedPreferences failed!!!");
        }
        java.util.HashMap hashMap = this.f505837d;
        if (!hashMap.containsKey(java.lang.Long.valueOf(j17))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BTDeviceManager", "Cannot find deviceId in the map");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.jni.C13411x69f9c21c.m55038xe78a9670(((java.lang.Long) hashMap.get(java.lang.Long.valueOf(j17))).longValue());
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.jni.C13411x69f9c21c.m54995x5c1a2c05(((java.lang.Long) hashMap.get(java.lang.Long.valueOf(j17))).longValue());
        return true;
    }
}

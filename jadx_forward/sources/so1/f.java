package so1;

/* loaded from: classes5.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ po1.d f491769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ro1.h f491770e;

    public f(po1.d dVar, ro1.h hVar) {
        this.f491769d = dVar;
        this.f491770e = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        po1.d device = this.f491769d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        java.lang.String e17 = so1.b.f491759a.e(device.f438833f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DirectDiskDeviceDelegate", "Try save new device. device=" + device + ", accessRoot=" + e17);
        boolean z17 = false;
        if (e17 == null || e17.length() == 0) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        } else {
            z17 = ro1.v.f479547a.h(device, new so1.d(e17));
        }
        nf.e.f(new so1.e(device, z17, this.f491770e));
    }
}

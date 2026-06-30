package yn1;

/* loaded from: classes11.dex */
public final class b1 implements vn1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yn1.r2 f545148a;

    public b1(yn1.r2 r2Var) {
        this.f545148a = r2Var;
    }

    @Override // vn1.a
    public void a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationPlatformImpl", "[BLE] Scanning started: " + z17);
    }

    @Override // vn1.a
    public void b(java.lang.String deviceId, byte[] data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceId, "deviceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationPlatformImpl", "[BLE] Message received from " + deviceId + ", length: " + data.length);
        yn1.r2 r2Var = this.f545148a;
        if (r2Var.f545345c == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MM.Mig.MigrationPlatformImpl", "[BLE] bleAuthKey is null");
            return;
        }
        bw5.l2 mo11468x92b714fd = new bw5.l2().mo11468x92b714fd(data);
        try {
            byte[] bArr = r2Var.f545345c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bArr);
            byte[] m46283x8bf68b4b = com.p314xaae8f345.mm.jni.p802x6a710b1.C10775x2f6aed54.m46283x8bf68b4b(bArr, (mo11468x92b714fd.f111142f[2] ? mo11468x92b714fd.f111141e : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b).g());
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.g gVar = r2Var.f545343a;
            if (gVar != null) {
                gVar.d(deviceId, (mo11468x92b714fd.f111142f[1] ? mo11468x92b714fd.f111140d : bw5.m2.BLENotifyLoginAndConnectReq).f111584d, m46283x8bf68b4b);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("callback");
                throw null;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MM.Mig.MigrationPlatformImpl", "[BLE] Error decrypting message: " + e17);
        }
    }

    @Override // vn1.a
    public void c(java.lang.String deviceId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceId, "deviceId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationPlatformImpl", "[BLE] Device disconnected: ".concat(deviceId));
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.g gVar = this.f545148a.f545343a;
        if (gVar != null) {
            gVar.J(deviceId);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("callback");
            throw null;
        }
    }

    @Override // vn1.a
    public void d(java.lang.String deviceId, java.lang.String deviceName, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceId, "deviceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceName, "deviceName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationPlatformImpl", "[BLE] Device discovered: " + deviceId + ", name: " + deviceName + ", rssi: " + i17);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.g gVar = this.f545148a.f545343a;
        if (gVar != null) {
            gVar.w(deviceId, deviceName, i17);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("callback");
            throw null;
        }
    }

    @Override // vn1.a
    public void e(java.lang.String deviceId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceId, "deviceId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationPlatformImpl", "[BLE] Device connected: ".concat(deviceId));
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.g gVar = this.f545148a.f545343a;
        if (gVar != null) {
            gVar.A(deviceId);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("callback");
            throw null;
        }
    }

    @Override // vn1.a
    public void f(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationPlatformImpl", "[BLE] Advertising started: " + z17);
    }
}

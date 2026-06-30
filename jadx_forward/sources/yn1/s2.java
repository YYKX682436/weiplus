package yn1;

/* loaded from: classes11.dex */
public final class s2 implements vn1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yn1.a4 f545362a;

    public s2(yn1.a4 a4Var) {
        this.f545362a = a4Var;
    }

    @Override // vn1.a
    public void a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f545362a.f545139a, "[BLE] Scanning started: " + z17);
    }

    @Override // vn1.a
    public void b(java.lang.String deviceId, byte[] data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceId, "deviceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        yn1.a4 a4Var = this.f545362a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a4Var.f545139a, "[BLE] Message received from " + deviceId + ", length: " + data.length);
        byte[] bArr = a4Var.f545143e;
        java.lang.String str = a4Var.f545139a;
        if (bArr == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "[BLE] bleAuthKey is null");
            return;
        }
        try {
            bw5.l2 mo11468x92b714fd = new bw5.l2().mo11468x92b714fd(data);
            byte[] bArr2 = a4Var.f545143e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bArr2);
            byte[] m46283x8bf68b4b = com.p314xaae8f345.mm.jni.p802x6a710b1.C10775x2f6aed54.m46283x8bf68b4b(bArr2, (mo11468x92b714fd.f111142f[2] ? mo11468x92b714fd.f111141e : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b).g());
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.a aVar = a4Var.f545142d;
            if (aVar != null) {
                aVar.d(deviceId, (mo11468x92b714fd.f111142f[1] ? mo11468x92b714fd.f111140d : bw5.m2.BLENotifyLoginAndConnectReq).f111584d, m46283x8bf68b4b);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "[BLE] Error decrypting message: " + e17);
        }
    }

    @Override // vn1.a
    public void c(java.lang.String deviceId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceId, "deviceId");
        yn1.a4 a4Var = this.f545362a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a4Var.f545139a, "[BLE] Device disconnected: ".concat(deviceId));
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.a aVar = a4Var.f545142d;
        if (aVar != null) {
            aVar.J(deviceId);
        }
    }

    @Override // vn1.a
    public void d(java.lang.String deviceId, java.lang.String deviceName, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceId, "deviceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceName, "deviceName");
        yn1.a4 a4Var = this.f545362a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a4Var.f545139a, "[BLE] Device discovered: " + deviceId + ", name: " + deviceName + ", rssi: " + i17);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.a aVar = a4Var.f545142d;
        if (aVar != null) {
            aVar.w(deviceId, deviceName, i17);
        }
    }

    @Override // vn1.a
    public void e(java.lang.String deviceId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceId, "deviceId");
        yn1.a4 a4Var = this.f545362a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a4Var.f545139a, "[BLE] Device connected: ".concat(deviceId));
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.a aVar = a4Var.f545142d;
        if (aVar != null) {
            aVar.A(deviceId);
        }
    }

    @Override // vn1.a
    public void f(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f545362a.f545139a, "[BLE] Advertising started: " + z17);
    }
}

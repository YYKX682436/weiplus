package jb1;

/* loaded from: classes7.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f380276d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jb1.s f380277e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f380278f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f380279g;

    public r(org.json.JSONObject jSONObject, jb1.s sVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        this.f380276d = jSONObject;
        this.f380277e = sVar;
        this.f380278f = i17;
        this.f380279g = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jb1.a0 b17 = jb1.d0.f380238a.b(this.f380276d.optInt("serverId"));
        if (b17 == null) {
            qb1.a.a(this.f380277e, this.f380278f, this.f380279g, 10020, "fail: no server", null, 16, null);
            return;
        }
        android.bluetooth.BluetoothAdapter d17 = qb1.b.d();
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BLE.JsApiStopBlePeripheralAdvertising", "invoke: adapter is null");
            qb1.a.a(this.f380277e, this.f380278f, this.f380279g, 10001, "fail:not available", null, 16, null);
        } else {
            b17.d(d17);
            qb1.a.b(this.f380277e, this.f380278f, this.f380279g, null);
        }
    }
}

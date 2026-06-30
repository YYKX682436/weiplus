package u32;

/* loaded from: classes13.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u32.p f505868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f505869e;

    public o(u32.p pVar, long j17) {
        this.f505868d = pVar;
        this.f505869e = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        u32.p pVar = this.f505868d;
        long j17 = this.f505869e;
        if (!pVar.f505875c.containsKey(java.lang.Long.valueOf(j17))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.BluetoothSDKAdapter", "the session not exist");
            return;
        }
        kq1.n nVar = pVar.f505873a;
        int intValue = ((java.lang.Integer) pVar.f505876d.get(java.lang.Long.valueOf(j17))).intValue();
        nVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothSDKManager", "***Destroy Session*** aSessionId = " + j17 + " aBluetoothVersion" + intValue);
        if (intValue == 0) {
            hq1.j jVar = nVar.f392788b;
            if (jVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothSDKManager", "mMrgBLE == null");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothLEManager", "------destroySession------ sessionId = %d", java.lang.Long.valueOf(j17));
            iz5.a.g(null, jVar.f364674g);
            if (!jVar.c()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLEManager", "BLE Unsupport");
                return;
            }
            hq1.t tVar = (hq1.t) jVar.f364670c.remove(java.lang.String.valueOf(j17));
            if (tVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLEManager", "Cannot find BluetoothLESession by sessionId(%d)", java.lang.Long.valueOf(j17));
                return;
            } else {
                tVar.a();
                return;
            }
        }
        if (intValue != 1) {
            iz5.a.g(null, false);
            return;
        }
        jq1.e eVar = nVar.f392789c;
        if (eVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothSDKManager", "mMrgBC == null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothChatManager", "------destroySession------ sessionId = %d", java.lang.Long.valueOf(j17));
        iz5.a.g(null, eVar.f382600g);
        if (!eVar.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothChatManager", "BC Unsupport!!!");
            return;
        }
        jq1.f fVar = (jq1.f) eVar.f382596c.remove(java.lang.Long.valueOf(j17));
        iz5.a.g(null, fVar != null);
        fVar.a();
    }
}

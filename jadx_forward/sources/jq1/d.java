package jq1;

/* loaded from: classes13.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final long f382589d;

    /* renamed from: e, reason: collision with root package name */
    public final long f382590e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jq1.e f382591f;

    public d(jq1.e eVar, long j17, long j18) {
        this.f382591f = eVar;
        this.f382589d = 0L;
        this.f382590e = 0L;
        this.f382589d = j17;
        this.f382590e = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17 = this.f382589d;
        jq1.e eVar = this.f382591f;
        eVar.getClass();
        jq1.f fVar = new jq1.f(j17);
        java.util.HashMap hashMap = eVar.f382596c;
        jq1.f fVar2 = (jq1.f) hashMap.remove(java.lang.Long.valueOf(j17));
        if (fVar2 != null) {
            fVar2.a();
        }
        hashMap.put(java.lang.Long.valueOf(j17), fVar);
        jq1.c cVar = eVar.f382594a;
        if (cVar != null) {
            long j18 = this.f382589d;
            long j19 = this.f382590e;
            kq1.d dVar = (kq1.d) cVar;
            dVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothSDKManager", "***BC onSessionCreate*** sessionID = " + j17 + " deviceID = " + j18);
            iz5.a.g(null, kq1.n.a(dVar.f392772a, 6, 1, 0, new kq1.g(j17, j18, j19)));
        }
    }
}

package hq1;

/* loaded from: classes13.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq1.j f364625d;

    public b(hq1.j jVar) {
        this.f364625d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f364625d.f364673f = false;
        this.f364625d.b(false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothLEManager", "Time out for discovering. Stop it");
        this.f364625d.e();
        hq1.h hVar = this.f364625d.f364668a;
        if (hVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothSDKManager", "***BLE onDiscoverFinished***");
            kq1.n nVar = ((kq1.e) hVar).f392773a;
            nVar.f392791e.clear();
            iz5.a.g(null, kq1.n.a(nVar, 2, 0, 0, null));
        }
    }
}

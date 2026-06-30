package hq1;

/* loaded from: classes13.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq1.t f364710d;

    public r(hq1.t tVar) {
        this.f364710d = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLESession", "Connected timeout!!!");
        hq1.t tVar = this.f364710d;
        if (3 == tVar.f364727p) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.BluetoothLESession", "Bluetooth device is aready disconnet or close, just leave");
            return;
        }
        tVar.f364720i.mo50300x3fa464aa(tVar.f364722k);
        tVar.f364727p = 2;
        hq1.j jVar = tVar.f364716e;
        if (jVar != null) {
            jVar.f364668a.a(tVar.f364712a, false);
        }
    }
}

package hq1;

/* loaded from: classes13.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq1.t f364708d;

    public p(hq1.t tVar) {
        this.f364708d = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLESession", "Write data timeout");
        hq1.t tVar = this.f364708d;
        hq1.j jVar = tVar.f364716e;
        if (jVar != null) {
            jVar.f364668a.b(tVar.f364712a, false);
        }
        tVar.c();
    }
}

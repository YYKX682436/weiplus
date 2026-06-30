package hq1;

/* loaded from: classes13.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq1.a0 f364735d;

    public x(hq1.a0 a0Var) {
        this.f364735d = a0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        hq1.a0 a0Var = this.f364735d;
        a0Var.f364614a.b(false, a0Var.f364620g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothLESimpleManager", "Time out for discovering. Stop it");
    }
}

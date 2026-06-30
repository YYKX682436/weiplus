package hq1;

/* loaded from: classes13.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f364736d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hq1.a0 f364737e;

    public y(hq1.a0 a0Var, long j17) {
        this.f364737e = a0Var;
        this.f364736d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        hq1.a0 a0Var = this.f364737e;
        java.util.HashMap hashMap = a0Var.f364622i;
        long j17 = this.f364736d;
        hq1.h0 h0Var = (hq1.h0) hashMap.remove(java.lang.Long.valueOf(j17));
        if (h0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.BluetoothLESimpleManager", "session not found! maybe ui don't handle session disconnect event correctly.");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------close------, mac=%s, name=%s", a42.i.f(h0Var.f364643a), lq1.a.c(h0Var.f364644b));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = h0Var.f364649g;
        if (!n3Var.mo50308x2936bf5f(n3Var.mo50289x733c63a2(2))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLESimpleSession", "SendMessage Failed!!! MessageWhat = %d", 2);
        }
        a0Var.f364623j.put(java.lang.Long.valueOf(j17), java.lang.Boolean.TRUE);
    }
}

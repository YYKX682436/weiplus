package hq1;

/* loaded from: classes13.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq1.h0 f364631d;

    public c0(hq1.h0 h0Var) {
        this.f364631d = h0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        hq1.h0 h0Var = this.f364631d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLESimpleSession", "Write data timeout, mac=%s, name=%s", a42.i.f(h0Var.f364643a), lq1.a.c(h0Var.f364644b));
        hq1.f0 f0Var = h0Var.f364647e;
        if (f0Var != null) {
            f0Var.b(h0Var.f364643a, false);
        }
        h0Var.f();
    }
}

package hq1;

/* loaded from: classes13.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq1.h0 f364633d;

    public d0(hq1.h0 h0Var) {
        this.f364633d = h0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLESimpleSession", "Connected timeout!!!, mac=%s, name=%s", a42.i.f(this.f364633d.f364643a), lq1.a.c(this.f364633d.f364644b));
        if (3 == this.f364633d.f364656n) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.BluetoothLESimpleSession", "Bluetooth device is already disconnet or close, just leave");
        } else if (this.f364633d.f364656n == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothLESimpleSession", "Bluetooth device is already connected, just leave.");
        } else {
            this.f364633d.c();
        }
    }
}

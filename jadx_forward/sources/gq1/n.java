package gq1;

/* loaded from: classes13.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f356047d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.bluetooth.BluetoothDevice f356048e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gq1.d f356049f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gq1.o f356050g;

    public n(gq1.o oVar, int i17, android.bluetooth.BluetoothDevice bluetoothDevice, gq1.d dVar) {
        this.f356050g = oVar;
        this.f356047d = i17;
        this.f356048e = bluetoothDevice;
        this.f356049f = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f356050g.f356053d.a(null, this.f356047d, this.f356048e.getAddress(), this.f356049f);
    }
}

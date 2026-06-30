package hq1;

/* loaded from: classes7.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.bluetooth.BluetoothDevice f364680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f364681e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f364682f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hq1.m0 f364683g;

    public j0(hq1.m0 m0Var, android.bluetooth.BluetoothDevice bluetoothDevice, int i17, byte[] bArr) {
        this.f364683g = m0Var;
        this.f364680d = bluetoothDevice;
        this.f364681e = i17;
        this.f364682f = bArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = 0;
        while (true) {
            hq1.m0 m0Var = this.f364683g;
            if (i17 >= m0Var.f364695b.size()) {
                return;
            }
            hq1.g gVar = (hq1.g) ((hq1.l0) m0Var.f364695b.get(i17));
            gVar.getClass();
            android.bluetooth.BluetoothDevice bluetoothDevice = this.f364680d;
            bluetoothDevice.getName();
            bluetoothDevice.getAddress();
            a42.i.h(bluetoothDevice.getAddress());
            gVar.f364640a.f364671d.mo50293x3498a0(new hq1.e(gVar, bluetoothDevice, this.f364681e, this.f364682f));
            i17++;
        }
    }
}

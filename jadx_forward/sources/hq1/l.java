package hq1;

/* loaded from: classes7.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.bluetooth.BluetoothDevice f364689d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f364690e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f364691f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hq1.n f364692g;

    public l(hq1.n nVar, android.bluetooth.BluetoothDevice bluetoothDevice, int i17, byte[] bArr) {
        this.f364692g = nVar;
        this.f364689d = bluetoothDevice;
        this.f364690e = i17;
        this.f364691f = bArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = 0;
        while (true) {
            hq1.n nVar = this.f364692g;
            if (i17 >= nVar.f364702e.size()) {
                return;
            }
            ((hq1.m) nVar.f364702e.get(i17)).b(this.f364689d, this.f364690e, this.f364691f);
            i17++;
        }
    }
}

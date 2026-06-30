package hq1;

/* loaded from: classes13.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.bluetooth.BluetoothDevice f364627d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f364628e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f364629f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hq1.d f364630g;

    public c(hq1.d dVar, android.bluetooth.BluetoothDevice bluetoothDevice, int i17, byte[] bArr) {
        this.f364630g = dVar;
        this.f364627d = bluetoothDevice;
        this.f364628e = i17;
        this.f364629f = bArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        hq1.j.a(this.f364630g.f364632a, this.f364627d, this.f364628e, this.f364629f);
    }
}

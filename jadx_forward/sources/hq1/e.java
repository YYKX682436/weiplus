package hq1;

/* loaded from: classes7.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.bluetooth.BluetoothDevice f364634d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f364635e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f364636f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hq1.g f364637g;

    public e(hq1.g gVar, android.bluetooth.BluetoothDevice bluetoothDevice, int i17, byte[] bArr) {
        this.f364637g = gVar;
        this.f364634d = bluetoothDevice;
        this.f364635e = i17;
        this.f364636f = bArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        hq1.j.a(this.f364637g.f364640a, this.f364634d, this.f364635e, this.f364636f);
    }
}

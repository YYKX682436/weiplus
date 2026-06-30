package hq1;

/* loaded from: classes13.dex */
public class d implements hq1.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hq1.j f364632a;

    public d(hq1.j jVar) {
        this.f364632a = jVar;
    }

    @Override // hq1.m
    public void a() {
    }

    @Override // hq1.m
    public void b(android.bluetooth.BluetoothDevice bluetoothDevice, int i17, byte[] bArr) {
        bluetoothDevice.getName();
        bluetoothDevice.getAddress();
        a42.i.h(bluetoothDevice.getAddress());
        this.f364632a.f364671d.mo50293x3498a0(new hq1.c(this, bluetoothDevice, i17, bArr));
    }
}

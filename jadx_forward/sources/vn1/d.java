package vn1;

/* loaded from: classes7.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vn1.m f519733d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(vn1.m mVar) {
        super(0);
        this.f519733d = mVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.bluetooth.BluetoothManager bluetoothManager = (android.bluetooth.BluetoothManager) ((jz5.n) this.f519733d.f519750e).mo141623x754a37bb();
        if (bluetoothManager != null) {
            return bluetoothManager.getAdapter();
        }
        return null;
    }
}

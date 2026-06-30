package vn1;

/* loaded from: classes7.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vn1.m f519736d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(vn1.m mVar) {
        super(0);
        this.f519736d = mVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object systemService = this.f519736d.f519746a.getSystemService("bluetooth");
        if (systemService instanceof android.bluetooth.BluetoothManager) {
            return (android.bluetooth.BluetoothManager) systemService;
        }
        return null;
    }
}

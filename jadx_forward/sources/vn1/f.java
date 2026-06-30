package vn1;

/* loaded from: classes7.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vn1.m f519735d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(vn1.m mVar) {
        super(0);
        this.f519735d = mVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.bluetooth.BluetoothAdapter e17 = this.f519735d.e();
        if (e17 != null) {
            return e17.getBluetoothLeScanner();
        }
        return null;
    }
}

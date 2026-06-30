package c13;

/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f37888d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(boolean z17) {
        super(1);
        this.f37888d = z17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object value = ((kotlin.Result) obj).getValue();
        boolean m528isSuccessimpl = kotlin.Result.m528isSuccessimpl(value);
        boolean z17 = this.f37888d;
        if (m528isSuccessimpl) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipService", "callback onModeChanged: " + z17);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterVoipService", "callback onModeChanged: " + z17 + " error " + kotlin.Result.m524exceptionOrNullimpl(value));
        }
        return jz5.f0.f302826a;
    }
}

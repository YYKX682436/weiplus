package c13;

/* loaded from: classes.dex */
public final class b implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f37859d;

    public b(java.lang.String msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        this.f37859d = msg;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object value = ((kotlin.Result) obj).getValue();
        boolean m528isSuccessimpl = kotlin.Result.m528isSuccessimpl(value);
        java.lang.String str = this.f37859d;
        if (m528isSuccessimpl) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipService", str);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterVoipService", str + " error " + kotlin.Result.m524exceptionOrNullimpl(value));
        }
        return jz5.f0.f302826a;
    }
}

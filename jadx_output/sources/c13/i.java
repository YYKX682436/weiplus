package c13;

/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final c13.i f37882d = new c13.i();

    public i() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object value = ((kotlin.Result) obj).getValue();
        if (kotlin.Result.m528isSuccessimpl(value)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipService", "callback onError");
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterVoipService", "callback onError " + kotlin.Result.m524exceptionOrNullimpl(value));
        }
        return jz5.f0.f302826a;
    }
}

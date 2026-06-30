package c13;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final c13.l f37887d = new c13.l();

    public l() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (kotlin.Result.m528isSuccessimpl(((kotlin.Result) obj).getValue())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipService", "callback onMinimized");
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterVoipService", "callback onMinimized error");
        }
        return jz5.f0.f302826a;
    }
}

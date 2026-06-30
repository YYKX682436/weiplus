package c13;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f37881d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i17) {
        super(1);
        this.f37881d = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean m528isSuccessimpl = kotlin.Result.m528isSuccessimpl(((kotlin.Result) obj).getValue());
        int i17 = this.f37881d;
        if (m528isSuccessimpl) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipService", "callback onConnected(" + i17 + ')');
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterVoipService", "callback onConnected(" + i17 + ") error");
        }
        return jz5.f0.f302826a;
    }
}

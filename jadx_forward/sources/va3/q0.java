package va3;

/* loaded from: classes15.dex */
public class q0 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ va3.v0 f515870a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(va3.v0 v0Var, android.os.Looper looper) {
        super(looper);
        this.f515870a = v0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        if (message == null) {
            return;
        }
        va3.v0 v0Var = this.f515870a;
        v0Var.getClass();
        if (message.what != 1) {
            return;
        }
        v0Var.e();
    }
}

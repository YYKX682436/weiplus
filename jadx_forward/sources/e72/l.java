package e72;

/* loaded from: classes14.dex */
public class l extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e72.v f331451a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(e72.v vVar, android.os.Looper looper) {
        super(looper);
        this.f331451a = vVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        if (message.what != 0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NumberFaceMotion", "hy: refresh number");
        this.f331451a.o();
    }
}

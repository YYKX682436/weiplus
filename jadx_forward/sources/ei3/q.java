package ei3;

/* loaded from: classes14.dex */
public class q extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ei3.u f334650a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ei3.u uVar, android.os.Looper looper) {
        super(looper);
        this.f334650a = uVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        ei3.u uVar = this.f334650a;
        ei3.h hVar = uVar.f334668l;
        if (hVar != null) {
            hVar.a();
            uVar.f334668l = null;
        }
    }
}

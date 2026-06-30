package z21;

/* loaded from: classes12.dex */
public class g extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z21.h f551106a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(z21.h hVar, android.os.Looper looper) {
        super(looper);
        this.f551106a = hVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        if (message.what != 291) {
            return;
        }
        z21.h hVar = this.f551106a;
        if (hVar.P()) {
            gm0.j1.d().g(hVar);
        }
    }
}

package s50;

/* loaded from: classes8.dex */
public final class e1 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s50.l1 f484577a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(s50.l1 l1Var, android.os.Looper looper) {
        super(looper);
        this.f484577a = l1Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        if (!(message != null && message.what == 101)) {
            if (!(message != null && message.what == 102)) {
                return;
            }
        }
        s50.l1 l1Var = this.f484577a;
        java.util.Objects.toString(l1Var.f484618i);
        if (l1Var.f484618i != s50.x0.f484673g) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleMessage, what: ");
        sb6.append(message != null ? java.lang.Integer.valueOf(message.what) : null);
        sb6.append(", currVoiceStatus: ");
        sb6.append(l1Var.f484618i);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.VoiceSearchService", sb6.toString());
        l1Var.Bi();
    }
}

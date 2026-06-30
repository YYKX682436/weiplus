package nw4;

/* loaded from: classes8.dex */
public class y extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.n f422540a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(nw4.n nVar, android.os.Looper looper) {
        super(looper);
        this.f422540a = nVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        int i17 = message.what;
        if (i17 != 1) {
            if (i17 != 2) {
                return;
            }
            java.util.Objects.toString(message.obj);
        } else {
            java.lang.String str = (java.lang.String) message.obj;
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
            nw4.n nVar = this.f422540a;
            if (!K0) {
                ((java.util.LinkedList) nVar.f422423d).add(str);
            }
            nw4.n.h(nVar);
        }
    }
}

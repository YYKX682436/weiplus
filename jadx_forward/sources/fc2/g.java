package fc2;

/* loaded from: classes2.dex */
public final class g extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fc2.o f342477a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(fc2.o oVar, android.os.Looper looper) {
        super(looper);
        this.f342477a = oVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4;
        fc2.o oVar = this.f342477a;
        fc2.o.b(oVar);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleMessage ");
        sb6.append(message != null ? java.lang.Integer.valueOf(message.what) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedFlowEventSubscriber", sb6.toString());
        if (message != null) {
            int i17 = message.what;
            if (i17 != 0) {
                if (i17 == 1 && (c1163xf1deaba4 = oVar.f342501m) != null) {
                    oVar.g(c1163xf1deaba4, 9);
                    return;
                }
                return;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = oVar.f342501m;
            if (c1163xf1deaba42 != null) {
                oVar.g(c1163xf1deaba42, 5);
            }
        }
    }
}

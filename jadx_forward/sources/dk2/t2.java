package dk2;

/* loaded from: classes.dex */
public final class t2 implements js4.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f315630a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f315631b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.p f315632c;

    public t2(dk2.r4 r4Var, yz5.l lVar, yz5.p pVar) {
        this.f315630a = r4Var;
        this.f315631b = lVar;
        this.f315632c = pVar;
    }

    @Override // js4.o
    public void a(int i17, int i18, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f315630a.f315542d, "[WeCoin] initEngine onFailed");
        yz5.p pVar = this.f315632c;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        }
    }

    @Override // js4.o
    /* renamed from: onSuccess */
    public void mo14245xe05b4124(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f315630a.f315542d, "[WeCoin] initEngine onSuccess");
        yz5.l lVar = this.f315631b;
        if (lVar != null) {
            lVar.mo146xb9724478(bool);
        }
    }
}

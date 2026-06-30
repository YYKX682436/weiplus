package sg0;

/* loaded from: classes8.dex */
public final class e3 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ su4.h2 f489236a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sg0.h3 f489237b;

    public e3(su4.h2 h2Var, sg0.h3 h3Var) {
        this.f489236a = h2Var;
        this.f489237b = h3Var;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearchLiteAppJsApiFeatureService", "createStore fail");
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("create w1w liteapp store appid:");
        su4.h2 h2Var = this.f489236a;
        sb6.append(h2Var);
        sb6.append(".liteAppId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearchLiteAppJsApiFeatureService", sb6.toString());
        this.f489237b.wi(h2Var);
    }
}

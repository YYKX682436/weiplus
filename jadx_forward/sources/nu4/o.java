package nu4;

/* loaded from: classes7.dex */
public final class o implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nu4.b0 f421798a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f421799b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r f421800c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f421801d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f421802e;

    public o(nu4.b0 b0Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r rVar, java.lang.String str2, java.lang.String str3, yz5.l lVar) {
        this.f421798a = b0Var;
        this.f421799b = str;
        this.f421800c = rVar;
        this.f421801d = str2;
        this.f421802e = lVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        nu4.b0 b0Var = this.f421798a;
        java.util.HashMap hashMap = b0Var.H;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r rVar = this.f421800c;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(rVar.o());
        java.lang.String str = this.f421799b;
        hashMap.put(str, valueOf);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b0Var.C, "createPrefetcherJsContext end prefetcherId: " + str + ", " + this.f421801d + ", /prefetcher.js, contextId: " + rVar.o() + ", " + rVar.hashCode());
        yz5.l lVar = this.f421802e;
        if (lVar != null) {
            lVar.mo146xb9724478(rVar);
        }
    }
}

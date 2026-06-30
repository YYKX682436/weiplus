package y00;

/* loaded from: classes8.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y00.a f540041d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y00.s f540042e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f540043f;

    public d(y00.a aVar, y00.s sVar, int i17) {
        this.f540041d = aVar;
        this.f540042e = sVar;
        this.f540043f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a10.f a17 = a10.e.f82023a.a();
            y00.a aVar = this.f540041d;
            a17.y0(aVar.f540023a, aVar.f540024b, aVar.f540025c, this.f540042e.f540078a);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.EcsKfProductCardFetcher", th6, "write storage fail msgSvrId=" + this.f540041d.f540023a, new java.lang.Object[0]);
        }
        y00.a aVar2 = this.f540041d;
        java.util.Map a18 = y00.a0.a(aVar2.f540024b, aVar2.f540023a, "MicroMsg.EcsKfProductCardFetcher");
        if (a18 != null) {
            ((ku5.t0) ku5.t0.f394148d).B(new y00.c(this.f540043f, this.f540041d, this.f540042e, a18));
        }
    }
}

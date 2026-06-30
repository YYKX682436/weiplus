package pi0;

/* loaded from: classes11.dex */
public final class d implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e.EngineLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e f436076a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pi0.q f436077b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pi0.u f436078c;

    public d(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e, pi0.q qVar, pi0.u uVar) {
        this.f436076a = c28580x69eec95e;
        this.f436077b = qVar;
        this.f436078c = uVar;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e.EngineLifecycleListener
    /* renamed from: onEngineWillDestroy */
    public void mo9535x8a6a5407() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("destroy engine ");
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e = this.f436076a;
        sb6.append(c28580x69eec95e);
        io.p3284xd2ae381c.Log.i("MicroMsg.CachedFlutterEngineGroup", sb6.toString());
        pi0.q qVar = this.f436077b;
        qVar.f436236g.remove(this.f436078c);
        qVar.f(c28580x69eec95e);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e.EngineLifecycleListener
    /* renamed from: onPreEngineRestart */
    public void mo9536x89b45f89() {
    }
}

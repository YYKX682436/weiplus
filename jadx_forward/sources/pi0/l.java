package pi0;

/* loaded from: classes11.dex */
public final class l implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e.EngineLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pi0.q f436173a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pi0.u0 f436174b;

    public l(pi0.q qVar, pi0.u0 u0Var) {
        this.f436173a = qVar;
        this.f436174b = u0Var;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e.EngineLifecycleListener
    /* renamed from: onEngineWillDestroy */
    public void mo9535x8a6a5407() {
        pi0.q qVar = this.f436173a;
        qVar.f436235f.remove(this.f436174b);
        qVar.getClass();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e.EngineLifecycleListener
    /* renamed from: onPreEngineRestart */
    public void mo9536x89b45f89() {
    }
}

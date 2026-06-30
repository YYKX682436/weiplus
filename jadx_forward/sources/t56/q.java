package t56;

/* loaded from: classes16.dex */
public final class q extends p56.q {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.Executor f497463e;

    public q(java.util.concurrent.Executor executor) {
        this.f497463e = executor;
    }

    @Override // p56.q
    /* renamed from: createWorker */
    public p56.p mo157871x6217339a() {
        return new t56.p(this.f497463e);
    }
}

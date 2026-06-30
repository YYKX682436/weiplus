package s56;

/* loaded from: classes16.dex */
public final class o implements p56.i {

    /* renamed from: d, reason: collision with root package name */
    public final long f484759d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.TimeUnit f484760e;

    /* renamed from: f, reason: collision with root package name */
    public final p56.q f484761f;

    public o(long j17, java.util.concurrent.TimeUnit timeUnit, p56.q qVar) {
        this.f484759d = j17;
        this.f484760e = timeUnit;
        this.f484761f = qVar;
    }

    @Override // r56.b
    /* renamed from: call */
    public void mo131526x2e7a5e(java.lang.Object obj) {
        p56.r rVar = (p56.r) obj;
        p56.p mo157871x6217339a = this.f484761f.mo157871x6217339a();
        rVar.d(mo157871x6217339a);
        mo157871x6217339a.e(new s56.n(this, rVar), this.f484759d, this.f484760e);
    }
}

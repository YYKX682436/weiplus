package s56;

/* loaded from: classes16.dex */
public final class q implements p56.i {

    /* renamed from: d, reason: collision with root package name */
    public final long f484765d;

    /* renamed from: e, reason: collision with root package name */
    public final long f484766e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.TimeUnit f484767f;

    /* renamed from: g, reason: collision with root package name */
    public final p56.q f484768g;

    public q(long j17, long j18, java.util.concurrent.TimeUnit timeUnit, p56.q qVar) {
        this.f484765d = j17;
        this.f484766e = j18;
        this.f484767f = timeUnit;
        this.f484768g = qVar;
    }

    @Override // r56.b
    /* renamed from: call */
    public void mo131526x2e7a5e(java.lang.Object obj) {
        p56.r rVar = (p56.r) obj;
        p56.p mo157871x6217339a = this.f484768g.mo157871x6217339a();
        rVar.d(mo157871x6217339a);
        s56.p pVar = new s56.p(this, rVar, mo157871x6217339a);
        mo157871x6217339a.getClass();
        long j17 = this.f484766e;
        java.util.concurrent.TimeUnit timeUnit = this.f484767f;
        long nanos = timeUnit.toNanos(j17);
        long nanos2 = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(mo157871x6217339a.a());
        long j18 = this.f484765d;
        long nanos3 = nanos2 + timeUnit.toNanos(j18);
        a66.e eVar = new a66.e();
        p56.o oVar = new p56.o(mo157871x6217339a, nanos2, nanos3, pVar, eVar, nanos);
        a66.e eVar2 = new a66.e();
        eVar.a(eVar2);
        eVar2.a(mo157871x6217339a.e(oVar, j18, timeUnit));
    }
}

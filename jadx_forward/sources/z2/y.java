package z2;

/* loaded from: classes13.dex */
public final class y extends android.app.job.JobServiceEngine implements z2.t {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p075x2eaf9f.app.AbstractServiceC1084x6c6d53dc f551067a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f551068b;

    /* renamed from: c, reason: collision with root package name */
    public android.app.job.JobParameters f551069c;

    public y(p012xc85e97e9.p075x2eaf9f.app.AbstractServiceC1084x6c6d53dc abstractServiceC1084x6c6d53dc) {
        super(abstractServiceC1084x6c6d53dc);
        this.f551068b = new java.lang.Object();
        this.f551067a = abstractServiceC1084x6c6d53dc;
    }

    @Override // android.app.job.JobServiceEngine
    public boolean onStartJob(android.app.job.JobParameters jobParameters) {
        this.f551069c = jobParameters;
        this.f551067a.a(false);
        return true;
    }

    @Override // android.app.job.JobServiceEngine
    public boolean onStopJob(android.app.job.JobParameters jobParameters) {
        z2.s sVar = this.f551067a.f92559f;
        if (sVar != null) {
            sVar.cancel(false);
        }
        synchronized (this.f551068b) {
            this.f551069c = null;
        }
        return true;
    }
}

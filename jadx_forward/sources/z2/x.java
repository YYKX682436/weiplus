package z2;

/* loaded from: classes13.dex */
public final class x implements z2.w {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.job.JobWorkItem f551065a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z2.y f551066b;

    public x(z2.y yVar, android.app.job.JobWorkItem jobWorkItem) {
        this.f551066b = yVar;
        this.f551065a = jobWorkItem;
    }

    @Override // z2.w
    /* renamed from: complete */
    public void mo178324xdc453139() {
        synchronized (this.f551066b.f551068b) {
            android.app.job.JobParameters jobParameters = this.f551066b.f551069c;
            if (jobParameters != null) {
                jobParameters.completeWork(this.f551065a);
            }
        }
    }

    @Override // z2.w
    /* renamed from: getIntent */
    public android.content.Intent mo178325x1e885992() {
        return this.f551065a.getIntent();
    }
}

package com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e;

/* loaded from: classes13.dex */
public final class h implements com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.g {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.job.JobWorkItem f134481a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.i f134482b;

    public h(com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.i iVar, android.app.job.JobWorkItem jobWorkItem) {
        this.f134482b = iVar;
        this.f134481a = jobWorkItem;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.g
    /* renamed from: complete */
    public void mo41234xdc453139() {
        synchronized (this.f134482b.f134484b) {
            android.app.job.JobParameters jobParameters = this.f134482b.f134485c;
            if (jobParameters != null) {
                jobParameters.completeWork(this.f134481a);
            }
        }
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.g
    /* renamed from: getIntent */
    public android.content.Intent mo41235x1e885992() {
        return this.f134481a.getIntent();
    }
}

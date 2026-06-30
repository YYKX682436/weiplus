package com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e;

/* loaded from: classes13.dex */
public final class i extends android.app.job.JobServiceEngine implements com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.d {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.AbstractServiceC4704xa345f5bd f134483a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f134484b;

    /* renamed from: c, reason: collision with root package name */
    public android.app.job.JobParameters f134485c;

    public i(com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.AbstractServiceC4704xa345f5bd abstractServiceC4704xa345f5bd) {
        super(abstractServiceC4704xa345f5bd);
        this.f134484b = new java.lang.Object();
        this.f134483a = abstractServiceC4704xa345f5bd;
    }

    @Override // android.app.job.JobServiceEngine
    public boolean onStartJob(android.app.job.JobParameters jobParameters) {
        synchronized (this.f134484b) {
            this.f134485c = jobParameters;
        }
        this.f134483a.b(false);
        return true;
    }

    @Override // android.app.job.JobServiceEngine
    public boolean onStopJob(android.app.job.JobParameters jobParameters) {
        com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.c cVar = this.f134483a.f134463f;
        if (cVar != null) {
            cVar.cancel(false);
        }
        synchronized (this.f134484b) {
            this.f134485c = null;
        }
        return true;
    }
}

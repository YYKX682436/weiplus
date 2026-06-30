package com.tencent.matrix.resource;

/* loaded from: classes13.dex */
public final class i extends android.app.job.JobServiceEngine implements com.tencent.matrix.resource.d {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.matrix.resource.MatrixJobIntentService f52950a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f52951b;

    /* renamed from: c, reason: collision with root package name */
    public android.app.job.JobParameters f52952c;

    public i(com.tencent.matrix.resource.MatrixJobIntentService matrixJobIntentService) {
        super(matrixJobIntentService);
        this.f52951b = new java.lang.Object();
        this.f52950a = matrixJobIntentService;
    }

    @Override // android.app.job.JobServiceEngine
    public boolean onStartJob(android.app.job.JobParameters jobParameters) {
        synchronized (this.f52951b) {
            this.f52952c = jobParameters;
        }
        this.f52950a.b(false);
        return true;
    }

    @Override // android.app.job.JobServiceEngine
    public boolean onStopJob(android.app.job.JobParameters jobParameters) {
        com.tencent.matrix.resource.c cVar = this.f52950a.f52930f;
        if (cVar != null) {
            cVar.cancel(false);
        }
        synchronized (this.f52951b) {
            this.f52952c = null;
        }
        return true;
    }
}

package com.tencent.matrix.resource;

/* loaded from: classes13.dex */
public final class h implements com.tencent.matrix.resource.g {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.job.JobWorkItem f52948a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.resource.i f52949b;

    public h(com.tencent.matrix.resource.i iVar, android.app.job.JobWorkItem jobWorkItem) {
        this.f52949b = iVar;
        this.f52948a = jobWorkItem;
    }

    @Override // com.tencent.matrix.resource.g
    public void complete() {
        synchronized (this.f52949b.f52951b) {
            android.app.job.JobParameters jobParameters = this.f52949b.f52952c;
            if (jobParameters != null) {
                jobParameters.completeWork(this.f52948a);
            }
        }
    }

    @Override // com.tencent.matrix.resource.g
    public android.content.Intent getIntent() {
        return this.f52948a.getIntent();
    }
}

package com.tencent.matrix.resource;

/* loaded from: classes13.dex */
public final class j extends com.tencent.matrix.resource.k {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.job.JobInfo f52953d;

    /* renamed from: e, reason: collision with root package name */
    public final android.app.job.JobScheduler f52954e;

    public j(android.content.Context context, android.content.ComponentName componentName, int i17) {
        super(componentName);
        b(i17);
        this.f52953d = new android.app.job.JobInfo.Builder(i17, componentName).setOverrideDeadline(0L).build();
        this.f52954e = (android.app.job.JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
    }

    @Override // com.tencent.matrix.resource.k
    public void a(android.content.Intent intent) {
        this.f52954e.enqueue(this.f52953d, new android.app.job.JobWorkItem(intent));
    }
}

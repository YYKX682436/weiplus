package com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e;

/* loaded from: classes13.dex */
public final class j extends com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.k {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.job.JobInfo f134486d;

    /* renamed from: e, reason: collision with root package name */
    public final android.app.job.JobScheduler f134487e;

    public j(android.content.Context context, android.content.ComponentName componentName, int i17) {
        super(componentName);
        b(i17);
        this.f134486d = new android.app.job.JobInfo.Builder(i17, componentName).setOverrideDeadline(0L).build();
        this.f134487e = (android.app.job.JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.k
    public void a(android.content.Intent intent) {
        this.f134487e.enqueue(this.f134486d, new android.app.job.JobWorkItem(intent));
    }
}

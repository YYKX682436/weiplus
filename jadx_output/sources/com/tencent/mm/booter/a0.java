package com.tencent.mm.booter;

/* loaded from: classes13.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.job.JobParameters f63295d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.booter.KeepAliveService f63296e;

    public a0(com.tencent.mm.booter.KeepAliveService keepAliveService, android.app.job.JobParameters jobParameters) {
        this.f63296e = keepAliveService;
        this.f63295d = jobParameters;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.KeepAliveService", "onStartJob() delay");
        com.tencent.mm.booter.KeepAliveService.a();
        try {
            this.f63296e.jobFinished(this.f63295d, false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.KeepAliveService", "onStartJob() jobFinished() Exception=%s", e17.getMessage());
        }
    }
}

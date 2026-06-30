package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes13.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.job.JobParameters f144828d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p642xad8b531f.JobServiceC10288x22b4596d f144829e;

    public a0(com.p314xaae8f345.mm.p642xad8b531f.JobServiceC10288x22b4596d jobServiceC10288x22b4596d, android.app.job.JobParameters jobParameters) {
        this.f144829e = jobServiceC10288x22b4596d;
        this.f144828d = jobParameters;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KeepAliveService", "onStartJob() delay");
        com.p314xaae8f345.mm.p642xad8b531f.JobServiceC10288x22b4596d.a();
        try {
            this.f144829e.jobFinished(this.f144828d, false);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.KeepAliveService", "onStartJob() jobFinished() Exception=%s", e17.getMessage());
        }
    }
}

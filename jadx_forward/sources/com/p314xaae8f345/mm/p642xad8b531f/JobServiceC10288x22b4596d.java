package com.p314xaae8f345.mm.p642xad8b531f;

/* renamed from: com.tencent.mm.booter.KeepAliveService */
/* loaded from: classes13.dex */
public class JobServiceC10288x22b4596d extends android.app.job.JobService {

    /* renamed from: d, reason: collision with root package name */
    public static final long f144784d;

    static {
        if (fp.h.c(23)) {
            f144784d = 590000L;
        } else {
            f144784d = 50000L;
        }
    }

    public static boolean a() {
        android.app.job.JobInfo.Builder builder;
        android.app.job.JobScheduler jobScheduler;
        if (!gm0.m.v().getBoolean("keepaliveserviceswitch", false)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KeepAliveService", "scheduleCoreScheduleJob(), time = %d", java.lang.Long.valueOf(f144784d));
        try {
            builder = new android.app.job.JobInfo.Builder(1, new android.content.ComponentName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.p642xad8b531f.JobServiceC10288x22b4596d.class));
            builder.setMinimumLatency(0L);
            builder.setOverrideDeadline(10L);
            builder.setRequiredNetworkType(1);
            builder.setRequiresDeviceIdle(false);
            builder.setRequiresCharging(false);
            jobScheduler = (android.app.job.JobScheduler) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("jobscheduler");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.KeepAliveService", "scheduleKeepAliveJob() Exception:%s" + e17.getMessage());
        }
        if (jobScheduler == null) {
            throw new java.lang.Exception("Can not get JOB_SCHEDULER_SERVICE");
        }
        int schedule = jobScheduler.schedule(builder.build());
        if (schedule == 1) {
            return true;
        }
        throw new java.lang.Exception("scheduleCoreScheduleJob fail, result = " + schedule);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(android.app.job.JobParameters jobParameters) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KeepAliveService", "onStartJob()");
        if (com.p314xaae8f345.mm.p971x6de15a2e.x2.c() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KeepAliveService", "onStarJob() MMPushCore.getAutoAuth() == null");
            com.p314xaae8f345.mm.p642xad8b531f.n.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "jobservice", true);
        }
        new android.os.Handler().postDelayed(new com.p314xaae8f345.mm.p642xad8b531f.a0(this, jobParameters), f144784d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KeepAliveService", "onReceive() delay publish PushKeepAliveEvent");
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.p642xad8b531f.b0 b0Var = new com.p314xaae8f345.mm.p642xad8b531f.b0(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(b0Var, 60000L, false);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(android.app.job.JobParameters jobParameters) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KeepAliveService", "onStopJob()");
        return false;
    }
}

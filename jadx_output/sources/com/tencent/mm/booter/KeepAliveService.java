package com.tencent.mm.booter;

/* loaded from: classes13.dex */
public class KeepAliveService extends android.app.job.JobService {

    /* renamed from: d, reason: collision with root package name */
    public static final long f63251d;

    static {
        if (fp.h.c(23)) {
            f63251d = 590000L;
        } else {
            f63251d = 50000L;
        }
    }

    public static boolean a() {
        android.app.job.JobInfo.Builder builder;
        android.app.job.JobScheduler jobScheduler;
        if (!gm0.m.v().getBoolean("keepaliveserviceswitch", false)) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.KeepAliveService", "scheduleCoreScheduleJob(), time = %d", java.lang.Long.valueOf(f63251d));
        try {
            builder = new android.app.job.JobInfo.Builder(1, new android.content.ComponentName(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.booter.KeepAliveService.class));
            builder.setMinimumLatency(0L);
            builder.setOverrideDeadline(10L);
            builder.setRequiredNetworkType(1);
            builder.setRequiresDeviceIdle(false);
            builder.setRequiresCharging(false);
            jobScheduler = (android.app.job.JobScheduler) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("jobscheduler");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.KeepAliveService", "scheduleKeepAliveJob() Exception:%s" + e17.getMessage());
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
        com.tencent.mars.xlog.Log.i("MicroMsg.KeepAliveService", "onStartJob()");
        if (com.tencent.mm.network.x2.c() == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.KeepAliveService", "onStarJob() MMPushCore.getAutoAuth() == null");
            com.tencent.mm.booter.n.a(com.tencent.mm.sdk.platformtools.x2.f193071a, "jobservice", true);
        }
        new android.os.Handler().postDelayed(new com.tencent.mm.booter.a0(this, jobParameters), f63251d);
        com.tencent.mars.xlog.Log.i("MicroMsg.KeepAliveService", "onReceive() delay publish PushKeepAliveEvent");
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.booter.b0 b0Var = new com.tencent.mm.booter.b0(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(b0Var, 60000L, false);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(android.app.job.JobParameters jobParameters) {
        com.tencent.mars.xlog.Log.i("MicroMsg.KeepAliveService", "onStopJob()");
        return false;
    }
}

package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zzjn extends com.google.android.gms.internal.measurement.zzjq {
    private byte _hellAccFlag_;
    private final com.google.android.gms.internal.measurement.zzem zzapy;
    private final android.app.AlarmManager zzyi;
    private java.lang.Integer zzyj;

    public zzjn(com.google.android.gms.internal.measurement.zzjr zzjrVar) {
        super(zzjrVar);
        this.zzyi = (android.app.AlarmManager) getContext().getSystemService("alarm");
        this.zzapy = new com.google.android.gms.internal.measurement.zzjo(this, zzjrVar.zzla(), zzjrVar);
    }

    private final int getJobId() {
        if (this.zzyj == null) {
            java.lang.String valueOf = java.lang.String.valueOf(getContext().getPackageName());
            this.zzyj = java.lang.Integer.valueOf((valueOf.length() != 0 ? "measurement".concat(valueOf) : new java.lang.String("measurement")).hashCode());
        }
        return this.zzyj.intValue();
    }

    private final android.app.PendingIntent zzek() {
        android.content.Intent className = new android.content.Intent().setClassName(getContext(), "com.google.android.gms.measurement.AppMeasurementReceiver");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        return android.app.PendingIntent.getBroadcast(getContext(), 0, className, 0);
    }

    private final void zzkl() {
        android.app.job.JobScheduler jobScheduler = (android.app.job.JobScheduler) getContext().getSystemService("jobscheduler");
        zzge().zzit().zzg("Cancelling job. JobID", java.lang.Integer.valueOf(getJobId()));
        jobScheduler.cancel(getJobId());
    }

    public final void cancel() {
        zzch();
        android.app.AlarmManager alarmManager = this.zzyi;
        android.app.PendingIntent zzek = zzek();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(zzek);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(alarmManager, arrayList.toArray(), "com/google/android/gms/internal/measurement/zzjn", "cancel", "()V", "android/app/AlarmManager_EXEC_", "cancel", "(Landroid/app/PendingIntent;)V");
        alarmManager.cancel((android.app.PendingIntent) arrayList.get(0));
        yj0.a.f(alarmManager, "com/google/android/gms/internal/measurement/zzjn", "cancel", "()V", "android/app/AlarmManager_EXEC_", "cancel", "(Landroid/app/PendingIntent;)V");
        this.zzapy.cancel();
        zzkl();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, com.google.android.gms.internal.measurement.zzec
    public final /* bridge */ /* synthetic */ android.content.Context getContext() {
        return super.getContext();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ void zzab() {
        super.zzab();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, com.google.android.gms.internal.measurement.zzec
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.Clock zzbt() {
        return super.zzbt();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ void zzfr() {
        super.zzfr();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ void zzfs() {
        super.zzfs();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzdu zzft() {
        return super.zzft();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzhk zzfu() {
        return super.zzfu();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzfb zzfv() {
        return super.zzfv();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzeo zzfw() {
        return super.zzfw();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzii zzfx() {
        return super.zzfx();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzif zzfy() {
        return super.zzfy();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzfc zzfz() {
        return super.zzfz();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzfe zzga() {
        return super.zzga();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzka zzgb() {
        return super.zzgb();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzjh zzgc() {
        return super.zzgc();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, com.google.android.gms.internal.measurement.zzec
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzgg zzgd() {
        return super.zzgd();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, com.google.android.gms.internal.measurement.zzec
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzfg zzge() {
        return super.zzge();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzfr zzgf() {
        return super.zzgf();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzef zzgg() {
        return super.zzgg();
    }

    public final void zzh(long j17) {
        zzch();
        if (!com.google.android.gms.internal.measurement.zzgb.zza(getContext())) {
            zzge().zzis().log("Receiver not registered/enabled");
        }
        if (!com.google.android.gms.internal.measurement.zzjc.zza(getContext(), false)) {
            zzge().zzis().log("Service not registered/enabled");
        }
        cancel();
        zzbt().elapsedRealtime();
        if (j17 < java.lang.Math.max(0L, com.google.android.gms.internal.measurement.zzew.zzahf.get().longValue()) && !this.zzapy.zzef()) {
            zzge().zzit().log("Scheduling upload with DelayedRunnable");
            this.zzapy.zzh(j17);
        }
        zzge().zzit().log("Scheduling upload with JobScheduler");
        android.content.ComponentName componentName = new android.content.ComponentName(getContext(), "com.google.android.gms.measurement.AppMeasurementJobService");
        android.app.job.JobScheduler jobScheduler = (android.app.job.JobScheduler) getContext().getSystemService("jobscheduler");
        android.app.job.JobInfo.Builder builder = new android.app.job.JobInfo.Builder(getJobId(), componentName);
        builder.setMinimumLatency(j17);
        builder.setOverrideDeadline(j17 << 1);
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        builder.setExtras(persistableBundle);
        android.app.job.JobInfo build = builder.build();
        zzge().zzit().zzg("Scheduling job. JobID", java.lang.Integer.valueOf(getJobId()));
        jobScheduler.schedule(build);
    }

    @Override // com.google.android.gms.internal.measurement.zzjq
    public final boolean zzhf() {
        android.app.AlarmManager alarmManager = this.zzyi;
        android.app.PendingIntent zzek = zzek();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(zzek);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(alarmManager, arrayList.toArray(), "com/google/android/gms/internal/measurement/zzjn", "zzhf", "()Z", "android/app/AlarmManager_EXEC_", "cancel", "(Landroid/app/PendingIntent;)V");
        alarmManager.cancel((android.app.PendingIntent) arrayList.get(0));
        yj0.a.f(alarmManager, "com/google/android/gms/internal/measurement/zzjn", "zzhf", "()Z", "android/app/AlarmManager_EXEC_", "cancel", "(Landroid/app/PendingIntent;)V");
        zzkl();
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzjp
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzeb zziw() {
        return super.zziw();
    }

    @Override // com.google.android.gms.internal.measurement.zzjp
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzei zzix() {
        return super.zzix();
    }
}

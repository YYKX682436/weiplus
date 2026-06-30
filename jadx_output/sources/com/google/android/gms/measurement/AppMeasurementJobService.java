package com.google.android.gms.measurement;

/* loaded from: classes13.dex */
public final class AppMeasurementJobService extends android.app.job.JobService implements com.google.android.gms.internal.measurement.zzjg {
    private com.google.android.gms.internal.measurement.zzjc<com.google.android.gms.measurement.AppMeasurementJobService> zzade;

    private final com.google.android.gms.internal.measurement.zzjc<com.google.android.gms.measurement.AppMeasurementJobService> zzfq() {
        if (this.zzade == null) {
            this.zzade = new com.google.android.gms.internal.measurement.zzjc<>(this);
        }
        return this.zzade;
    }

    @Override // com.google.android.gms.internal.measurement.zzjg
    public final boolean callServiceStopSelfResult(int i17) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        zzfq().onCreate();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        zzfq().onDestroy();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(android.content.Intent intent) {
        zzfq().onRebind(intent);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(android.app.job.JobParameters jobParameters) {
        return zzfq().onStartJob(jobParameters);
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(android.app.job.JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(android.content.Intent intent) {
        return zzfq().onUnbind(intent);
    }

    @Override // com.google.android.gms.internal.measurement.zzjg
    public final void zza(android.app.job.JobParameters jobParameters, boolean z17) {
        jobFinished(jobParameters, false);
    }

    @Override // com.google.android.gms.internal.measurement.zzjg
    public final void zzb(android.content.Intent intent) {
    }
}

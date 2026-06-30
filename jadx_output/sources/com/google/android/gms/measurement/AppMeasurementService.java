package com.google.android.gms.measurement;

/* loaded from: classes13.dex */
public final class AppMeasurementService extends android.app.Service implements com.google.android.gms.internal.measurement.zzjg {
    private com.google.android.gms.internal.measurement.zzjc<com.google.android.gms.measurement.AppMeasurementService> zzade;

    private final com.google.android.gms.internal.measurement.zzjc<com.google.android.gms.measurement.AppMeasurementService> zzfq() {
        if (this.zzade == null) {
            this.zzade = new com.google.android.gms.internal.measurement.zzjc<>(this);
        }
        return this.zzade;
    }

    @Override // com.google.android.gms.internal.measurement.zzjg
    public final boolean callServiceStopSelfResult(int i17) {
        return stopSelfResult(i17);
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        return zzfq().onBind(intent);
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

    @Override // android.app.Service
    public final int onStartCommand(android.content.Intent intent, int i17, int i18) {
        return zzfq().onStartCommand(intent, i17, i18);
    }

    @Override // android.app.Service
    public final boolean onUnbind(android.content.Intent intent) {
        return zzfq().onUnbind(intent);
    }

    @Override // com.google.android.gms.internal.measurement.zzjg
    public final void zza(android.app.job.JobParameters jobParameters, boolean z17) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.measurement.zzjg
    public final void zzb(android.content.Intent intent) {
        androidx.legacy.content.WakefulBroadcastReceiver.completeWakefulIntent(intent);
    }
}

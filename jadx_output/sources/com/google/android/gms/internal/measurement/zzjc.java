package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zzjc<T extends android.content.Context & com.google.android.gms.internal.measurement.zzjg> {
    private final T zzabm;

    public zzjc(T t17) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(t17);
        this.zzabm = t17;
    }

    private final void zzb(java.lang.Runnable runnable) {
        com.google.android.gms.internal.measurement.zzgl zzg = com.google.android.gms.internal.measurement.zzgl.zzg(this.zzabm);
        zzg.zzgd().zzc(new com.google.android.gms.internal.measurement.zzjf(this, zzg, runnable));
    }

    private final com.google.android.gms.internal.measurement.zzfg zzge() {
        return com.google.android.gms.internal.measurement.zzgl.zzg(this.zzabm).zzge();
    }

    public final android.os.IBinder onBind(android.content.Intent intent) {
        if (intent == null) {
            zzge().zzim().log("onBind called with null intent");
            return null;
        }
        java.lang.String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new com.google.android.gms.internal.measurement.zzgn(com.google.android.gms.internal.measurement.zzgl.zzg(this.zzabm));
        }
        zzge().zzip().zzg("onBind received unknown action", action);
        return null;
    }

    public final void onCreate() {
        com.google.android.gms.internal.measurement.zzgl.zzg(this.zzabm).zzge().zzit().log("Local AppMeasurementService is starting up");
    }

    public final void onDestroy() {
        com.google.android.gms.internal.measurement.zzgl.zzg(this.zzabm).zzge().zzit().log("Local AppMeasurementService is shutting down");
    }

    public final void onRebind(android.content.Intent intent) {
        if (intent == null) {
            zzge().zzim().log("onRebind called with null intent");
        } else {
            zzge().zzit().zzg("onRebind called. action", intent.getAction());
        }
    }

    public final int onStartCommand(final android.content.Intent intent, int i17, final int i18) {
        final com.google.android.gms.internal.measurement.zzfg zzge = com.google.android.gms.internal.measurement.zzgl.zzg(this.zzabm).zzge();
        if (intent == null) {
            zzge.zzip().log("AppMeasurementService started with null intent");
            return 2;
        }
        java.lang.String action = intent.getAction();
        zzge.zzit().zze("Local AppMeasurementService called. startId, action", java.lang.Integer.valueOf(i18), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            zzb(new java.lang.Runnable(this, i18, zzge, intent) { // from class: com.google.android.gms.internal.measurement.zzjd
                private final int zzabp;
                private final com.google.android.gms.internal.measurement.zzjc zzapp;
                private final com.google.android.gms.internal.measurement.zzfg zzapq;
                private final android.content.Intent zzapr;

                {
                    this.zzapp = this;
                    this.zzabp = i18;
                    this.zzapq = zzge;
                    this.zzapr = intent;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzapp.zza(this.zzabp, this.zzapq, this.zzapr);
                }
            });
        }
        return 2;
    }

    public final boolean onStartJob(final android.app.job.JobParameters jobParameters) {
        final com.google.android.gms.internal.measurement.zzfg zzge = com.google.android.gms.internal.measurement.zzgl.zzg(this.zzabm).zzge();
        java.lang.String string = jobParameters.getExtras().getString("action");
        zzge.zzit().zzg("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        zzb(new java.lang.Runnable(this, zzge, jobParameters) { // from class: com.google.android.gms.internal.measurement.zzje
            private final android.app.job.JobParameters zzabs;
            private final com.google.android.gms.internal.measurement.zzjc zzapp;
            private final com.google.android.gms.internal.measurement.zzfg zzaps;

            {
                this.zzapp = this;
                this.zzaps = zzge;
                this.zzabs = jobParameters;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzapp.zza(this.zzaps, this.zzabs);
            }
        });
        return true;
    }

    public final boolean onUnbind(android.content.Intent intent) {
        if (intent == null) {
            zzge().zzim().log("onUnbind called with null intent");
            return true;
        }
        zzge().zzit().zzg("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    public final /* synthetic */ void zza(int i17, com.google.android.gms.internal.measurement.zzfg zzfgVar, android.content.Intent intent) {
        if (this.zzabm.callServiceStopSelfResult(i17)) {
            zzfgVar.zzit().zzg("Local AppMeasurementService processed last upload request. StartId", java.lang.Integer.valueOf(i17));
            zzge().zzit().log("Completed wakeful intent.");
            this.zzabm.zzb(intent);
        }
    }

    public final /* synthetic */ void zza(com.google.android.gms.internal.measurement.zzfg zzfgVar, android.app.job.JobParameters jobParameters) {
        zzfgVar.zzit().log("AppMeasurementJobService processed last upload request.");
        this.zzabm.zza(jobParameters, false);
    }

    public static boolean zza(android.content.Context context, boolean z17) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        return com.google.android.gms.internal.measurement.zzka.zzc(context, "com.google.android.gms.measurement.AppMeasurementJobService");
    }
}

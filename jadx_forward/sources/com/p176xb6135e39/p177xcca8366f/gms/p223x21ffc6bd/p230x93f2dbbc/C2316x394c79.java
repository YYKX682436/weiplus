package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzjc */
/* loaded from: classes16.dex */
public final class C2316x394c79<T extends android.content.Context & com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2320x394c7d> {

    /* renamed from: zzabm */
    private final T f6959x6f0212c;

    public C2316x394c79(T t17) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(t17);
        this.f6959x6f0212c = t17;
    }

    private final void zzb(java.lang.Runnable runnable) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2247x394c25 zzg = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2247x394c25.zzg(this.f6959x6f0212c);
        zzg.mo18975x394c1d().zzc(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2319x394c7c(this, zzg, runnable));
    }

    /* renamed from: zzge */
    private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01 m19236x394c1e() {
        return com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2247x394c25.zzg(this.f6959x6f0212c).mo18976x394c1e();
    }

    /* renamed from: onBind */
    public final android.os.IBinder m19237xc3979ebc(android.content.Intent intent) {
        if (intent == null) {
            m19236x394c1e().m19108x394c64().log("onBind called with null intent");
            return null;
        }
        java.lang.String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.BinderC2249x394c27(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2247x394c25.zzg(this.f6959x6f0212c));
        }
        m19236x394c1e().m19111x394c67().zzg("onBind received unknown action", action);
        return null;
    }

    /* renamed from: onCreate */
    public final void m19238x3e5a77bb() {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2247x394c25.zzg(this.f6959x6f0212c).mo18976x394c1e().m19115x394c6b().log("Local AppMeasurementService is starting up");
    }

    /* renamed from: onDestroy */
    public final void m19239xac79a11b() {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2247x394c25.zzg(this.f6959x6f0212c).mo18976x394c1e().m19115x394c6b().log("Local AppMeasurementService is shutting down");
    }

    /* renamed from: onRebind */
    public final void m19240x573ab7af(android.content.Intent intent) {
        if (intent == null) {
            m19236x394c1e().m19108x394c64().log("onRebind called with null intent");
        } else {
            m19236x394c1e().m19115x394c6b().zzg("onRebind called. action", intent.getAction());
        }
    }

    /* renamed from: onStartCommand */
    public final int m19241xa5e4ec08(final android.content.Intent intent, int i17, final int i18) {
        final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01 mo18976x394c1e = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2247x394c25.zzg(this.f6959x6f0212c).mo18976x394c1e();
        if (intent == null) {
            mo18976x394c1e.m19111x394c67().log("AppMeasurementService started with null intent");
            return 2;
        }
        java.lang.String action = intent.getAction();
        mo18976x394c1e.m19115x394c6b().zze("Local AppMeasurementService called. startId, action", java.lang.Integer.valueOf(i18), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            zzb(new java.lang.Runnable(this, i18, mo18976x394c1e, intent) { // from class: com.google.android.gms.internal.measurement.zzjd

                /* renamed from: zzabp */
                private final int f6960x6f0212f;

                /* renamed from: zzapp */
                private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2316x394c79 f6961x6f022e1;

                /* renamed from: zzapq */
                private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01 f6962x6f022e2;

                /* renamed from: zzapr */
                private final android.content.Intent f6963x6f022e3;

                {
                    this.f6961x6f022e1 = this;
                    this.f6960x6f0212f = i18;
                    this.f6962x6f022e2 = mo18976x394c1e;
                    this.f6963x6f022e3 = intent;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f6961x6f022e1.zza(this.f6960x6f0212f, this.f6962x6f022e2, this.f6963x6f022e3);
                }
            });
        }
        return 2;
    }

    /* renamed from: onStartJob */
    public final boolean m19242xf3968efa(final android.app.job.JobParameters jobParameters) {
        final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01 mo18976x394c1e = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2247x394c25.zzg(this.f6959x6f0212c).mo18976x394c1e();
        java.lang.String string = jobParameters.getExtras().getString("action");
        mo18976x394c1e.m19115x394c6b().zzg("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        zzb(new java.lang.Runnable(this, mo18976x394c1e, jobParameters) { // from class: com.google.android.gms.internal.measurement.zzje

            /* renamed from: zzabs */
            private final android.app.job.JobParameters f6964x6f02132;

            /* renamed from: zzapp */
            private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2316x394c79 f6965x6f022e1;

            /* renamed from: zzaps */
            private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01 f6966x6f022e4;

            {
                this.f6965x6f022e1 = this;
                this.f6966x6f022e4 = mo18976x394c1e;
                this.f6964x6f02132 = jobParameters;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f6965x6f022e1.zza(this.f6966x6f022e4, this.f6964x6f02132);
            }
        });
        return true;
    }

    /* renamed from: onUnbind */
    public final boolean m19243x5cd81515(android.content.Intent intent) {
        if (intent == null) {
            m19236x394c1e().m19108x394c64().log("onUnbind called with null intent");
            return true;
        }
        m19236x394c1e().m19115x394c6b().zzg("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    public final /* synthetic */ void zza(int i17, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01 c2216x394c01, android.content.Intent intent) {
        if (this.f6959x6f0212c.mo19244xa69f282(i17)) {
            c2216x394c01.m19115x394c6b().zzg("Local AppMeasurementService processed last upload request. StartId", java.lang.Integer.valueOf(i17));
            m19236x394c1e().m19115x394c6b().log("Completed wakeful intent.");
            this.f6959x6f0212c.zzb(intent);
        }
    }

    public final /* synthetic */ void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01 c2216x394c01, android.app.job.JobParameters jobParameters) {
        c2216x394c01.m19115x394c6b().log("AppMeasurementJobService processed last upload request.");
        this.f6959x6f0212c.zza(jobParameters, false);
    }

    public static boolean zza(android.content.Context context, boolean z17) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(context);
        return com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96.zzc(context, "com.google.android.gms.measurement.AppMeasurementJobService");
    }
}

package com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc;

/* renamed from: com.google.android.gms.measurement.AppMeasurementJobService */
/* loaded from: classes13.dex */
public final class JobServiceC2416x8620993 extends android.app.job.JobService implements com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2320x394c7d {

    /* renamed from: zzade */
    private com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2316x394c79<com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.JobServiceC2416x8620993> f7367x6f02162;

    /* renamed from: zzfq */
    private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2316x394c79<com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.JobServiceC2416x8620993> m19506x394c0b() {
        if (this.f7367x6f02162 == null) {
            this.f7367x6f02162 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2316x394c79<>(this);
        }
        return this.f7367x6f02162;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2320x394c7d
    /* renamed from: callServiceStopSelfResult */
    public final boolean mo19244xa69f282(int i17) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        m19506x394c0b().m19238x3e5a77bb();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        m19506x394c0b().m19239xac79a11b();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(android.content.Intent intent) {
        m19506x394c0b().m19240x573ab7af(intent);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(android.app.job.JobParameters jobParameters) {
        return m19506x394c0b().m19242xf3968efa(jobParameters);
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(android.app.job.JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(android.content.Intent intent) {
        return m19506x394c0b().m19243x5cd81515(intent);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2320x394c7d
    public final void zza(android.app.job.JobParameters jobParameters, boolean z17) {
        jobFinished(jobParameters, false);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2320x394c7d
    public final void zzb(android.content.Intent intent) {
    }
}

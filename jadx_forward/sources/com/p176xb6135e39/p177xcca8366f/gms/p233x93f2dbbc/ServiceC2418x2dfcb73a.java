package com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc;

/* renamed from: com.google.android.gms.measurement.AppMeasurementService */
/* loaded from: classes13.dex */
public final class ServiceC2418x2dfcb73a extends android.app.Service implements com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2320x394c7d {

    /* renamed from: zzade */
    private com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2316x394c79<com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.ServiceC2418x2dfcb73a> f7369x6f02162;

    /* renamed from: zzfq */
    private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2316x394c79<com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.ServiceC2418x2dfcb73a> m19507x394c0b() {
        if (this.f7369x6f02162 == null) {
            this.f7369x6f02162 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2316x394c79<>(this);
        }
        return this.f7369x6f02162;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2320x394c7d
    /* renamed from: callServiceStopSelfResult */
    public final boolean mo19244xa69f282(int i17) {
        return stopSelfResult(i17);
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        return m19507x394c0b().m19237xc3979ebc(intent);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        m19507x394c0b().m19238x3e5a77bb();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        m19507x394c0b().m19239xac79a11b();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(android.content.Intent intent) {
        m19507x394c0b().m19240x573ab7af(intent);
    }

    @Override // android.app.Service
    public final int onStartCommand(android.content.Intent intent, int i17, int i18) {
        return m19507x394c0b().m19241xa5e4ec08(intent, i17, i18);
    }

    @Override // android.app.Service
    public final boolean onUnbind(android.content.Intent intent) {
        return m19507x394c0b().m19243x5cd81515(intent);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2320x394c7d
    public final void zza(android.app.job.JobParameters jobParameters, boolean z17) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2320x394c7d
    public final void zzb(android.content.Intent intent) {
        p012xc85e97e9.p090xbe0af3c9.p091x38b73479.AbstractC1111x43921d97.m7784xb060689c(intent);
    }
}

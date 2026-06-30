package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zziw */
/* loaded from: classes16.dex */
public final class ServiceConnectionC2310x394c6e implements android.content.ServiceConnection, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.BaseConnectionCallbacks, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.BaseOnConnectionFailedListener {

    /* renamed from: zzape */
    final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2296x394c60 f6948x6f022d6;

    /* renamed from: zzapk */
    private volatile boolean f6949x6f022dc;

    /* renamed from: zzapl */
    private volatile com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2215x394c00 f6950x6f022dd;

    public ServiceConnectionC2310x394c6e(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2296x394c60 c2296x394c60) {
        this.f6948x6f022d6 = c2296x394c60;
    }

    public static /* synthetic */ boolean zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.ServiceConnectionC2310x394c6e serviceConnectionC2310x394c6e, boolean z17) {
        serviceConnectionC2310x394c6e.f6949x6f022dc = false;
        return false;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.BaseConnectionCallbacks
    /* renamed from: onConnected */
    public final void mo18126xdba42fea(android.os.Bundle bundle) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18207x6483284b("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2208x394bf4 m18108xb411027f = this.f6950x6f022dd.m18108xb411027f();
                this.f6950x6f022dd = null;
                this.f6948x6f022d6.mo18975x394c1d().zzc(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2313x394c71(this, m18108xb411027f));
            } catch (android.os.DeadObjectException | java.lang.IllegalStateException unused) {
                this.f6950x6f022dd = null;
                this.f6949x6f022dc = false;
            }
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.BaseOnConnectionFailedListener
    /* renamed from: onConnectionFailed */
    public final void mo18128xce9394ba(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18207x6483284b("MeasurementServiceConnection.onConnectionFailed");
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01 m19177x394c85 = this.f6948x6f022d6.f6815x6f02155.m19177x394c85();
        if (m19177x394c85 != null) {
            m19177x394c85.m19111x394c67().zzg("Service connection failed", c1700xff0c58bb);
        }
        synchronized (this) {
            this.f6949x6f022dc = false;
            this.f6950x6f022dd = null;
        }
        this.f6948x6f022d6.mo18975x394c1d().zzc(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2315x394c78(this));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.BaseConnectionCallbacks
    /* renamed from: onConnectionSuspended */
    public final void mo18127x4511603e(int i17) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18207x6483284b("MeasurementServiceConnection.onConnectionSuspended");
        this.f6948x6f022d6.mo18976x394c1e().m19114x394c6a().log("Service connection suspended");
        this.f6948x6f022d6.mo18975x394c1d().zzc(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2314x394c77(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.ServiceConnectionC2310x394c6e serviceConnectionC2310x394c6e;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18207x6483284b("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f6949x6f022dc = false;
                this.f6948x6f022d6.mo18976x394c1e().m19108x394c64().log("Service connected with null binder");
                return;
            }
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2208x394bf4 interfaceC2208x394bf4 = null;
            try {
                java.lang.String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    interfaceC2208x394bf4 = queryLocalInterface instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2208x394bf4 ? (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2208x394bf4) queryLocalInterface : new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2210x394bfb(iBinder);
                    this.f6948x6f022d6.mo18976x394c1e().m19115x394c6b().log("Bound to IMeasurementService interface");
                } else {
                    this.f6948x6f022d6.mo18976x394c1e().m19108x394c64().zzg("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (android.os.RemoteException unused) {
                this.f6948x6f022d6.mo18976x394c1e().m19108x394c64().log("Service connect failed to get IMeasurementService");
            }
            if (interfaceC2208x394bf4 == null) {
                this.f6949x6f022dc = false;
                try {
                    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p217x68ac49f.C1980x61745a5a m18493x9cf0d20b = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p217x68ac49f.C1980x61745a5a.m18493x9cf0d20b();
                    android.content.Context mo18960x76847179 = this.f6948x6f022d6.mo18960x76847179();
                    serviceConnectionC2310x394c6e = this.f6948x6f022d6.f6895x6f022ca;
                    m18493x9cf0d20b.m18495xa4bc737f(mo18960x76847179, serviceConnectionC2310x394c6e);
                } catch (java.lang.IllegalArgumentException unused2) {
                }
            } else {
                this.f6948x6f022d6.mo18975x394c1d().zzc(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2311x394c6f(this, interfaceC2208x394bf4));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18207x6483284b("MeasurementServiceConnection.onServiceDisconnected");
        this.f6948x6f022d6.mo18976x394c1e().m19114x394c6a().log("Service disconnected");
        this.f6948x6f022d6.mo18975x394c1d().zzc(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2312x394c70(this, componentName));
    }

    public final void zzc(android.content.Intent intent) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.ServiceConnectionC2310x394c6e serviceConnectionC2310x394c6e;
        this.f6948x6f022d6.mo18961x394b61();
        android.content.Context mo18960x76847179 = this.f6948x6f022d6.mo18960x76847179();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p217x68ac49f.C1980x61745a5a m18493x9cf0d20b = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p217x68ac49f.C1980x61745a5a.m18493x9cf0d20b();
        synchronized (this) {
            if (this.f6949x6f022dc) {
                this.f6948x6f022d6.mo18976x394c1e().m19115x394c6b().log("Connection attempt already in progress");
                return;
            }
            this.f6948x6f022d6.mo18976x394c1e().m19115x394c6b().log("Using local app measurement service");
            this.f6949x6f022dc = true;
            serviceConnectionC2310x394c6e = this.f6948x6f022d6.f6895x6f022ca;
            m18493x9cf0d20b.m18494x54856bb8(mo18960x76847179, intent, serviceConnectionC2310x394c6e, 129);
        }
    }

    /* renamed from: zzkh */
    public final void m19235x394c9d() {
        this.f6948x6f022d6.mo18961x394b61();
        android.content.Context mo18960x76847179 = this.f6948x6f022d6.mo18960x76847179();
        synchronized (this) {
            if (this.f6949x6f022dc) {
                this.f6948x6f022d6.mo18976x394c1e().m19115x394c6b().log("Connection attempt already in progress");
                return;
            }
            if (this.f6950x6f022dd != null) {
                this.f6948x6f022d6.mo18976x394c1e().m19115x394c6b().log("Already awaiting connection attempt");
                return;
            }
            this.f6950x6f022dd = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2215x394c00(mo18960x76847179, android.os.Looper.getMainLooper(), this, this);
            this.f6948x6f022d6.mo18976x394c1e().m19115x394c6b().log("Connecting to remote service");
            this.f6949x6f022dc = true;
            this.f6950x6f022dd.m18088x3744fdf6();
        }
    }
}

package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.zzfz */
/* loaded from: classes16.dex */
public final class ServiceConnectionC2235x394c14 implements android.content.ServiceConnection {

    /* renamed from: zzaky */
    final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2233x394c12 f6691x6f0224f;

    private ServiceConnectionC2235x394c14(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2233x394c12 c2233x394c12) {
        this.f6691x6f0224f = c2233x394c12;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        if (iBinder == null) {
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2233x394c12.zza(this.f6691x6f0224f).mo18976x394c1e().m19111x394c67().log("Install Referrer connection returned with null binder");
            return;
        }
        try {
            this.f6691x6f0224f.f6689x6f0224d = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.zzs.zza(iBinder);
            if (this.f6691x6f0224f.f6689x6f0224d == null) {
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2233x394c12.zza(this.f6691x6f0224f).mo18976x394c1e().m19111x394c67().log("Install Referrer Service implementation was not found");
            } else {
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2233x394c12.zza(this.f6691x6f0224f).mo18976x394c1e().m19113x394c69().log("Install Referrer Service connected");
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2233x394c12.zza(this.f6691x6f0224f).mo18975x394c1d().zzc(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2236x394c1a(this));
            }
        } catch (java.lang.Exception e17) {
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2233x394c12.zza(this.f6691x6f0224f).mo18976x394c1e().m19111x394c67().zzg("Exception occurred while calling Install Referrer API", e17);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        this.f6691x6f0224f.f6689x6f0224d = null;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2233x394c12.zza(this.f6691x6f0224f).mo18976x394c1e().m19113x394c69().log("Install Referrer Service disconnected");
    }
}

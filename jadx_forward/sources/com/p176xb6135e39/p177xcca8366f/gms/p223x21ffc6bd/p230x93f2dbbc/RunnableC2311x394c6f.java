package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzix */
/* loaded from: classes16.dex */
final class RunnableC2311x394c6f implements java.lang.Runnable {

    /* renamed from: zzapm */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2208x394bf4 f6951x6f022de;

    /* renamed from: zzapn */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.ServiceConnectionC2310x394c6e f6952x6f022df;

    public RunnableC2311x394c6f(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.ServiceConnectionC2310x394c6e serviceConnectionC2310x394c6e, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2208x394bf4 interfaceC2208x394bf4) {
        this.f6952x6f022df = serviceConnectionC2310x394c6e;
        this.f6951x6f022de = interfaceC2208x394bf4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f6952x6f022df) {
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.ServiceConnectionC2310x394c6e.zza(this.f6952x6f022df, false);
            if (!this.f6952x6f022df.f6948x6f022d6.m19229x23b734ff()) {
                this.f6952x6f022df.f6948x6f022d6.mo18976x394c1e().m19115x394c6b().log("Connected to service");
                this.f6952x6f022df.f6948x6f022d6.zza(this.f6951x6f022de);
            }
        }
    }
}

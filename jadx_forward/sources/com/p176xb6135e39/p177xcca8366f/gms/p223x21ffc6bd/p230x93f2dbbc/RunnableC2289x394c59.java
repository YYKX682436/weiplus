package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.zzib */
/* loaded from: classes16.dex */
public final class RunnableC2289x394c59 implements java.lang.Runnable {

    /* renamed from: zzanw */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2272x394c43 f6866x6f022aa;

    /* renamed from: zzaod */
    private final /* synthetic */ long f6867x6f022b6;

    public RunnableC2289x394c59(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2272x394c43 c2272x394c43, long j17) {
        this.f6866x6f022aa = c2272x394c43;
        this.f6867x6f022b6 = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6866x6f022aa.mo18977x394c1f().f6663x6f02240.set(this.f6867x6f022b6);
        this.f6866x6f022aa.mo18976x394c1e().m19114x394c6a().zzg("Session timeout duration set", java.lang.Long.valueOf(this.f6867x6f022b6));
    }
}

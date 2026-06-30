package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.zzhq */
/* loaded from: classes16.dex */
public final class RunnableC2278x394c49 implements java.lang.Runnable {

    /* renamed from: zzanw */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2272x394c43 f6837x6f022aa;

    /* renamed from: zzaoa */
    private final /* synthetic */ long f6838x6f022b3;

    public RunnableC2278x394c49(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2272x394c43 c2272x394c43, long j17) {
        this.f6837x6f022aa = c2272x394c43;
        this.f6838x6f022b3 = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2272x394c43 c2272x394c43 = this.f6837x6f022aa;
        long j17 = this.f6838x6f022b3;
        c2272x394c43.mo18961x394b61();
        c2272x394c43.m19186x394ba5();
        c2272x394c43.mo18976x394c1e().m19114x394c6a().log("Resetting analytics data (FE)");
        c2272x394c43.mo18974x394c1c().m19249x394c9f();
        if (c2272x394c43.mo18978x394c20().m19032x394b7f(c2272x394c43.mo18967x394c10().m19091x394b67())) {
            c2272x394c43.mo18977x394c1f().f6653x6f02231.set(j17);
        }
        boolean m19162x7d80d2b7 = c2272x394c43.f6815x6f02155.m19162x7d80d2b7();
        if (!c2272x394c43.mo18978x394c20().m19034x394c3f()) {
            c2272x394c43.mo18977x394c1f().zzh(!m19162x7d80d2b7);
        }
        c2272x394c43.mo18969x394c12().m19230x5c033741();
        c2272x394c43.f6823x6f022a8 = !m19162x7d80d2b7;
    }
}

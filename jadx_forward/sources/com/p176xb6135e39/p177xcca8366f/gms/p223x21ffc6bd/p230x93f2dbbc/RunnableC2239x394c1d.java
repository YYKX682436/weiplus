package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzgd */
/* loaded from: classes16.dex */
final class RunnableC2239x394c1d implements java.lang.Runnable {

    /* renamed from: val$context */
    private final /* synthetic */ android.content.Context f6696x927e9b2c;

    /* renamed from: zzalb */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2247x394c25 f6697x6f02257;

    /* renamed from: zzalc */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01 f6698x6f02258;

    /* renamed from: zzald */
    private final /* synthetic */ long f6699x6f02259;

    /* renamed from: zzale */
    private final /* synthetic */ android.os.Bundle f6700x6f0225a;

    /* renamed from: zzqu */
    private final /* synthetic */ android.content.BroadcastReceiver.PendingResult f6701x394d64;

    public RunnableC2239x394c1d(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2237x394c1b c2237x394c1b, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2247x394c25 c2247x394c25, long j17, android.os.Bundle bundle, android.content.Context context, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01 c2216x394c01, android.content.BroadcastReceiver.PendingResult pendingResult) {
        this.f6697x6f02257 = c2247x394c25;
        this.f6699x6f02259 = j17;
        this.f6700x6f0225a = bundle;
        this.f6696x927e9b2c = context;
        this.f6698x6f02258 = c2216x394c01;
        this.f6701x394d64 = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j17 = this.f6697x6f02257.mo19175x394c1f().f6653x6f02231.get();
        long j18 = this.f6699x6f02259;
        if (j17 > 0 && (j18 >= j17 || j18 <= 0)) {
            j18 = j17 - 1;
        }
        if (j18 > 0) {
            this.f6700x6f0225a.putLong("click_timestamp", j18);
        }
        this.f6700x6f0225a.putString("_cis", "referrer broadcast");
        com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.m19464x9cf0d20b(this.f6696x927e9b2c).m19486xdfc15e93("auto", "_cmp", this.f6700x6f0225a);
        this.f6698x6f02258.m19115x394c6b().log("Install campaign recorded");
        android.content.BroadcastReceiver.PendingResult pendingResult = this.f6701x394d64;
        if (pendingResult != null) {
            pendingResult.finish();
        }
    }
}

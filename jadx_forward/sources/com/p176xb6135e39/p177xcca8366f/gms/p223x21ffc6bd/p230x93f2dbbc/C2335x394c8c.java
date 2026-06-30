package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.zzjv */
/* loaded from: classes16.dex */
public final class C2335x394c8c implements com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2194x394be6 {

    /* renamed from: zzaqu */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2331x394c88 f7015x6f02305;

    /* renamed from: zzaqv */
    com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2356x394ca6 f7016x6f02306;

    /* renamed from: zzaqw */
    java.util.List<java.lang.Long> f7017x6f02307;

    /* renamed from: zzaqx */
    java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2353x394ca3> f7018x6f02308;

    /* renamed from: zzaqy */
    private long f7019x6f02309;

    private C2335x394c8c(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2331x394c88 c2331x394c88) {
        this.f7015x6f02305 = c2331x394c88;
    }

    private static long zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2353x394ca3 c2353x394ca3) {
        return ((c2353x394ca3.f7092x6f0234f.longValue() / 1000) / 60) / 60;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2194x394be6
    public final void zzb(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2356x394ca6 c2356x394ca6) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2356x394ca6);
        this.f7016x6f02306 = c2356x394ca6;
    }

    public /* synthetic */ C2335x394c8c(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2331x394c88 c2331x394c88, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2332x394c89 c2332x394c89) {
        this(c2331x394c88);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2194x394be6
    public final boolean zza(long j17, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2353x394ca3 c2353x394ca3) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2353x394ca3);
        if (this.f7018x6f02308 == null) {
            this.f7018x6f02308 = new java.util.ArrayList();
        }
        if (this.f7017x6f02307 == null) {
            this.f7017x6f02307 = new java.util.ArrayList();
        }
        if (this.f7018x6f02308.size() > 0 && zza(this.f7018x6f02308.get(0)) != zza(c2353x394ca3)) {
            return false;
        }
        long m18953x394df7 = this.f7019x6f02309 + c2353x394ca3.m18953x394df7();
        if (m18953x394df7 >= java.lang.Math.max(0, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2206x394bf2.f6548x6f021cb.get().intValue())) {
            return false;
        }
        this.f7019x6f02309 = m18953x394df7;
        this.f7018x6f02308.add(c2353x394ca3);
        this.f7017x6f02307.add(java.lang.Long.valueOf(j17));
        return this.f7018x6f02308.size() < java.lang.Math.max(1, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2206x394bf2.f6549x6f021cc.get().intValue());
    }
}

package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.zzfh */
/* loaded from: classes16.dex */
public final class RunnableC2217x394c02 implements java.lang.Runnable {

    /* renamed from: zzaix */
    private final /* synthetic */ int f6616x6f02210;

    /* renamed from: zzaiy */
    private final /* synthetic */ java.lang.String f6617x6f02211;

    /* renamed from: zzaiz */
    private final /* synthetic */ java.lang.Object f6618x6f02212;

    /* renamed from: zzaja */
    private final /* synthetic */ java.lang.Object f6619x6f02218;

    /* renamed from: zzajb */
    private final /* synthetic */ java.lang.Object f6620x6f02219;

    /* renamed from: zzajc */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01 f6621x6f0221a;

    public RunnableC2217x394c02(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01 c2216x394c01, int i17, java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        this.f6621x6f0221a = c2216x394c01;
        this.f6616x6f02210 = i17;
        this.f6617x6f02211 = str;
        this.f6618x6f02212 = obj;
        this.f6619x6f02218 = obj2;
        this.f6620x6f02219 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c17;
        long j17;
        char c18;
        long j18;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01 c2216x394c01;
        char c19;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2227x394c0c mo19175x394c1f = this.f6621x6f0221a.f6815x6f02155.mo19175x394c1f();
        if (!mo19175x394c1f.m19185xf582434a()) {
            this.f6621x6f0221a.zza(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        c17 = this.f6621x6f0221a.f6605x6f02205;
        if (c17 == 0) {
            if (this.f6621x6f0221a.mo18978x394c20().m19033x394bcf()) {
                c2216x394c01 = this.f6621x6f0221a;
                c19 = 'C';
            } else {
                c2216x394c01 = this.f6621x6f0221a;
                c19 = 'c';
            }
            c2216x394c01.f6605x6f02205 = c19;
        }
        j17 = this.f6621x6f0221a.f6604x6f02172;
        if (j17 < 0) {
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.zza(this.f6621x6f0221a, 12451L);
        }
        char charAt = "01VDIWEA?".charAt(this.f6616x6f02210);
        c18 = this.f6621x6f0221a.f6605x6f02205;
        j18 = this.f6621x6f0221a.f6604x6f02172;
        java.lang.String zza = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.zza(true, this.f6617x6f02211, this.f6618x6f02212, this.f6619x6f02218, this.f6620x6f02219);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(zza).length() + 24);
        sb6.append("2");
        sb6.append(charAt);
        sb6.append(c18);
        sb6.append(j18);
        sb6.append(":");
        sb6.append(zza);
        java.lang.String sb7 = sb6.toString();
        if (sb7.length() > 1024) {
            sb7 = this.f6617x6f02211.substring(0, 1024);
        }
        mo19175x394c1f.f6647x6f0222b.zzc(sb7, 1L);
    }
}

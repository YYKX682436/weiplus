package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzjh */
/* loaded from: classes16.dex */
public final class C2321x394c7e extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2269x394c40 {

    /* renamed from: handler */
    private android.os.Handler f6969x294b574a;

    /* renamed from: zzapu */
    private long f6970x6f022e6;

    /* renamed from: zzapv */
    private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2196x394be8 f6971x6f022e7;

    /* renamed from: zzapw */
    private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2196x394be8 f6972x6f022e8;

    public C2321x394c7e(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2247x394c25 c2247x394c25) {
        super(c2247x394c25);
        this.f6971x6f022e7 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2322x394c7f(this, this.f6815x6f02155);
        this.f6972x6f022e8 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2323x394c80(this, this.f6815x6f02155);
        this.f6970x6f022e6 = mo18962x394b92().mo18537x79952707();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzaf */
    public final void m19245x394b65(long j17) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2196x394be8 abstractC2196x394be8;
        long max;
        mo18961x394b61();
        m19247x394c9e();
        this.f6971x6f022e7.m19067xae7a2e7a();
        this.f6972x6f022e8.m19067xae7a2e7a();
        mo18976x394c1e().m19115x394c6b().zzg("Activity resumed, time", java.lang.Long.valueOf(j17));
        this.f6970x6f022e6 = j17;
        if (mo18962x394b92().mo18536x5cbba1cc() - mo18977x394c1f().f6663x6f02240.get() > mo18977x394c1f().f6665x6f02242.get()) {
            mo18977x394c1f().f6664x6f02241.set(true);
            mo18977x394c1f().f6666x6f02243.set(0L);
        }
        if (mo18977x394c1f().f6664x6f02241.get()) {
            abstractC2196x394be8 = this.f6971x6f022e7;
            max = java.lang.Math.max(0L, mo18977x394c1f().f6662x6f0223f.get() - mo18977x394c1f().f6666x6f02243.get());
        } else {
            abstractC2196x394be8 = this.f6972x6f022e8;
            max = java.lang.Math.max(0L, 3600000 - mo18977x394c1f().f6666x6f02243.get());
        }
        abstractC2196x394be8.zzh(max);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzag */
    public final void m19246x394b66(long j17) {
        mo18961x394b61();
        m19247x394c9e();
        this.f6971x6f022e7.m19067xae7a2e7a();
        this.f6972x6f022e8.m19067xae7a2e7a();
        mo18976x394c1e().m19115x394c6b().zzg("Activity paused, time", java.lang.Long.valueOf(j17));
        if (this.f6970x6f022e6 != 0) {
            mo18977x394c1f().f6666x6f02243.set(mo18977x394c1f().f6666x6f02243.get() + (j17 - this.f6970x6f022e6));
        }
    }

    /* renamed from: zzki */
    private final void m19247x394c9e() {
        synchronized (this) {
            if (this.f6969x294b574a == null) {
                this.f6969x294b574a = new android.os.Handler(android.os.Looper.getMainLooper());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzkk */
    public final void m19248x394ca0() {
        mo18961x394b61();
        zzl(false);
        mo18965x394c0e().zzk(mo18962x394b92().mo18537x79952707());
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2186x394bde
    /* renamed from: getContext */
    public final /* bridge */ /* synthetic */ android.content.Context mo18960x76847179() {
        return super.mo18960x76847179();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzab */
    public final /* bridge */ /* synthetic */ void mo18961x394b61() {
        super.mo18961x394b61();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2186x394bde
    /* renamed from: zzbt */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.InterfaceC1991x3e2ebee mo18962x394b92() {
        return super.mo18962x394b92();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfr */
    public final /* bridge */ /* synthetic */ void mo18963x394c0c() {
        super.mo18963x394c0c();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfs */
    public final /* bridge */ /* synthetic */ void mo18964x394c0d() {
        super.mo18964x394c0d();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzft */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2178x394bd1 mo18965x394c0e() {
        return super.mo18965x394c0e();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfu */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2272x394c43 mo18966x394c0f() {
        return super.mo18966x394c0f();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfv */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2211x394bfc mo18967x394c10() {
        return super.mo18967x394c10();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfw */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2198x394bea mo18968x394c11() {
        return super.mo18968x394c11();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfx */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2296x394c60 mo18969x394c12() {
        return super.mo18969x394c12();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfy */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2293x394c5d mo18970x394c13() {
        return super.mo18970x394c13();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfz */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2212x394bfd mo18971x394c14() {
        return super.mo18971x394c14();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzga */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2214x394bff mo18972x394c1a() {
        return super.mo18972x394c1a();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzgb */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96 mo18973x394c1b() {
        return super.mo18973x394c1b();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzgc */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2321x394c7e mo18974x394c1c() {
        return super.mo18974x394c1c();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2186x394bde
    /* renamed from: zzgd */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2242x394c20 mo18975x394c1d() {
        return super.mo18975x394c1d();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2186x394bde
    /* renamed from: zzge */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01 mo18976x394c1e() {
        return super.mo18976x394c1e();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzgf */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2227x394c0c mo18977x394c1f() {
        return super.mo18977x394c1f();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzgg */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2189x394be1 mo18978x394c20() {
        return super.mo18978x394c20();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2269x394c40
    /* renamed from: zzhf */
    public final boolean mo19069x394c3e() {
        return false;
    }

    /* renamed from: zzkj */
    public final void m19249x394c9f() {
        this.f6971x6f022e7.m19067xae7a2e7a();
        this.f6972x6f022e8.m19067xae7a2e7a();
        this.f6970x6f022e6 = 0L;
    }

    public final boolean zzl(boolean z17) {
        mo18961x394b61();
        m19186x394ba5();
        long mo18537x79952707 = mo18962x394b92().mo18537x79952707();
        mo18977x394c1f().f6665x6f02242.set(mo18962x394b92().mo18536x5cbba1cc());
        long j17 = mo18537x79952707 - this.f6970x6f022e6;
        if (!z17 && j17 < 1000) {
            mo18976x394c1e().m19115x394c6b().zzg("Screen exposed for less than 1000 ms. Event not sent. time", java.lang.Long.valueOf(j17));
            return false;
        }
        mo18977x394c1f().f6666x6f02243.set(j17);
        mo18976x394c1e().m19115x394c6b().zzg("Recording user engagement, ms", java.lang.Long.valueOf(j17));
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putLong("_et", j17);
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2293x394c5d.zza(mo18970x394c13().m19222x394c98(), bundle, true);
        mo18966x394c0f().m19195x769949b6("auto", "_e", bundle);
        this.f6970x6f022e6 = mo18537x79952707;
        this.f6972x6f022e8.m19067xae7a2e7a();
        this.f6972x6f022e8.zzh(java.lang.Math.max(0L, 3600000 - mo18977x394c1f().f6666x6f02243.get()));
        return true;
    }
}

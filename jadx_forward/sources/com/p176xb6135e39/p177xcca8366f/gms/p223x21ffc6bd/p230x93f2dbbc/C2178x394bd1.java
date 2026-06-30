package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzdu */
/* loaded from: classes16.dex */
public final class C2178x394bd1 extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f {

    /* renamed from: zzadf */
    private final java.util.Map<java.lang.String, java.lang.Long> f6415x6f02163;

    /* renamed from: zzadg */
    private final java.util.Map<java.lang.String, java.lang.Integer> f6416x6f02164;

    /* renamed from: zzadh */
    private long f6417x6f02165;

    public C2178x394bd1(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2247x394c25 c2247x394c25) {
        super(c2247x394c25);
        this.f6416x6f02164 = new x.b();
        this.f6415x6f02163 = new x.b();
    }

    private final void zza(long j17, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2292x394c5c c2292x394c5c) {
        if (c2292x394c5c == null) {
            mo18976x394c1e().m19115x394c6b().log("Not logging ad exposure. No active activity");
            return;
        }
        if (j17 < 1000) {
            mo18976x394c1e().m19115x394c6b().zzg("Not logging ad exposure. Less than 1000 ms. exposure", java.lang.Long.valueOf(j17));
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putLong("_xt", j17);
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2293x394c5d.zza(c2292x394c5c, bundle, true);
        mo18966x394c0f().m19195x769949b6("am", "_xa", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzl(long j17) {
        java.util.Iterator<java.lang.String> it = this.f6415x6f02163.keySet().iterator();
        while (it.hasNext()) {
            this.f6415x6f02163.put(it.next(), java.lang.Long.valueOf(j17));
        }
        if (this.f6415x6f02163.isEmpty()) {
            return;
        }
        this.f6417x6f02165 = j17;
    }

    /* renamed from: beginAdUnitExposure */
    public final void m18958xdd2aa377(java.lang.String str) {
        if (str == null || str.length() == 0) {
            mo18976x394c1e().m19108x394c64().log("Ad unit id must be a non-empty string");
        } else {
            mo18975x394c1d().zzc(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2179x394bd2(this, str, mo18962x394b92().mo18537x79952707()));
        }
    }

    /* renamed from: endAdUnitExposure */
    public final void m18959xd8567429(java.lang.String str) {
        if (str == null || str.length() == 0) {
            mo18976x394c1e().m19108x394c64().log("Ad unit id must be a non-empty string");
        } else {
            mo18975x394c1d().zzc(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2180x394bd3(this, str, mo18962x394b92().mo18537x79952707()));
        }
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

    public final void zzk(long j17) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2292x394c5c m19222x394c98 = mo18970x394c13().m19222x394c98();
        for (java.lang.String str : this.f6415x6f02163.keySet()) {
            zza(str, j17 - this.f6415x6f02163.get(str).longValue(), m19222x394c98);
        }
        if (!this.f6415x6f02163.isEmpty()) {
            zza(j17 - this.f6417x6f02165, m19222x394c98);
        }
        zzl(j17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(java.lang.String str, long j17) {
        mo18961x394b61();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
        java.lang.Integer num = this.f6416x6f02164.get(str);
        if (num == null) {
            mo18976x394c1e().m19108x394c64().zzg("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2292x394c5c m19222x394c98 = mo18970x394c13().m19222x394c98();
        int intValue = num.intValue() - 1;
        if (intValue != 0) {
            this.f6416x6f02164.put(str, java.lang.Integer.valueOf(intValue));
            return;
        }
        this.f6416x6f02164.remove(str);
        java.lang.Long l17 = this.f6415x6f02163.get(str);
        if (l17 == null) {
            mo18976x394c1e().m19108x394c64().log("First ad unit exposure time was never set");
        } else {
            long longValue = j17 - l17.longValue();
            this.f6415x6f02163.remove(str);
            zza(str, longValue, m19222x394c98);
        }
        if (this.f6416x6f02164.isEmpty()) {
            long j18 = this.f6417x6f02165;
            if (j18 == 0) {
                mo18976x394c1e().m19108x394c64().log("First ad exposure time was never set");
            } else {
                zza(j17 - j18, m19222x394c98);
                this.f6417x6f02165 = 0L;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(java.lang.String str, long j17) {
        mo18961x394b61();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
        if (this.f6416x6f02164.isEmpty()) {
            this.f6417x6f02165 = j17;
        }
        java.lang.Integer num = this.f6416x6f02164.get(str);
        if (num != null) {
            this.f6416x6f02164.put(str, java.lang.Integer.valueOf(num.intValue() + 1));
        } else if (this.f6416x6f02164.size() >= 100) {
            mo18976x394c1e().m19111x394c67().log("Too many ads visible");
        } else {
            this.f6416x6f02164.put(str, 1);
            this.f6415x6f02163.put(str, java.lang.Long.valueOf(j17));
        }
    }

    private final void zza(java.lang.String str, long j17, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2292x394c5c c2292x394c5c) {
        if (c2292x394c5c == null) {
            mo18976x394c1e().m19115x394c6b().log("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j17 < 1000) {
            mo18976x394c1e().m19115x394c6b().zzg("Not logging ad unit exposure. Less than 1000 ms. exposure", java.lang.Long.valueOf(j17));
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j17);
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2293x394c5d.zza(c2292x394c5c, bundle, true);
        mo18966x394c0f().m19195x769949b6("am", "_xu", bundle);
    }
}

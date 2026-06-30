package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzif */
/* loaded from: classes16.dex */
public final class C2293x394c5d extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2269x394c40 {

    /* renamed from: zzaol */
    protected com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2292x394c5c f6882x6f022be;

    /* renamed from: zzaom */
    private volatile com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2292x394c5c f6883x6f022bf;

    /* renamed from: zzaon */
    private com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2292x394c5c f6884x6f022c0;

    /* renamed from: zzaoo */
    private long f6885x6f022c1;

    /* renamed from: zzaop */
    private final java.util.Map<android.app.Activity, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2292x394c5c> f6886x6f022c2;

    /* renamed from: zzaoq */
    private com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2292x394c5c f6887x6f022c3;

    /* renamed from: zzaor */
    private java.lang.String f6888x6f022c4;

    public C2293x394c5d(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2247x394c25 c2247x394c25) {
        super(c2247x394c25);
        this.f6886x6f022c2 = new x.b();
    }

    private final void zza(android.app.Activity activity, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2292x394c5c c2292x394c5c, boolean z17) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2292x394c5c c2292x394c5c2 = this.f6883x6f022bf == null ? this.f6884x6f022c0 : this.f6883x6f022bf;
        if (c2292x394c5c.f6878x6f022bb == null) {
            c2292x394c5c = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2292x394c5c(c2292x394c5c.f6881x394dd7, m19215x394b9e(activity.getClass().getCanonicalName()), c2292x394c5c.f6879x6f022bc);
        }
        this.f6884x6f022c0 = this.f6883x6f022bf;
        this.f6885x6f022c1 = mo18962x394b92().mo18537x79952707();
        this.f6883x6f022bf = c2292x394c5c;
        mo18975x394c1d().zzc(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2294x394c5e(this, z17, c2292x394c5c2, c2292x394c5c));
    }

    /* renamed from: zzca */
    private static java.lang.String m19215x394b9e(java.lang.String str) {
        java.lang.String[] split = str.split("\\.");
        java.lang.String str2 = split.length > 0 ? split[split.length - 1] : "";
        return str2.length() > 100 ? str2.substring(0, 100) : str2;
    }

    private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2292x394c5c zze(android.app.Activity activity) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(activity);
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2292x394c5c c2292x394c5c = this.f6886x6f022c2.get(activity);
        if (c2292x394c5c != null) {
            return c2292x394c5c;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2292x394c5c c2292x394c5c2 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2292x394c5c(null, m19215x394b9e(activity.getClass().getCanonicalName()), mo18973x394c1b().m19290x394cb6());
        this.f6886x6f022c2.put(activity, c2292x394c5c2);
        return c2292x394c5c2;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2186x394bde
    /* renamed from: getContext */
    public final /* bridge */ /* synthetic */ android.content.Context mo18960x76847179() {
        return super.mo18960x76847179();
    }

    /* renamed from: onActivityCreated */
    public final void m19216x78cb4fa(android.app.Activity activity, android.os.Bundle bundle) {
        android.os.Bundle bundle2;
        if (bundle == null || (bundle2 = bundle.getBundle("com.google.firebase.analytics.screen_service")) == null) {
            return;
        }
        this.f6886x6f022c2.put(activity, new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2292x394c5c(bundle2.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d), bundle2.getString("referrer_name"), bundle2.getLong(dm.i4.f66865x76d1ec5a)));
    }

    /* renamed from: onActivityDestroyed */
    public final void m19217xa9f48fab(android.app.Activity activity) {
        this.f6886x6f022c2.remove(activity);
    }

    /* renamed from: onActivityPaused */
    public final void m19218x99a658dc(android.app.Activity activity) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2292x394c5c zze = zze(activity);
        this.f6884x6f022c0 = this.f6883x6f022bf;
        this.f6885x6f022c1 = mo18962x394b92().mo18537x79952707();
        this.f6883x6f022bf = null;
        mo18975x394c1d().zzc(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2295x394c5f(this, zze));
    }

    /* renamed from: onActivityResumed */
    public final void m19219xba973e9(android.app.Activity activity) {
        zza(activity, zze(activity), false);
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2178x394bd1 mo18965x394c0e = mo18965x394c0e();
        mo18965x394c0e.mo18975x394c1d().zzc(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2181x394bd4(mo18965x394c0e, mo18965x394c0e.mo18962x394b92().mo18537x79952707()));
    }

    /* renamed from: onActivitySaveInstanceState */
    public final void m19220x634d9e11(android.app.Activity activity, android.os.Bundle bundle) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2292x394c5c c2292x394c5c;
        if (bundle == null || (c2292x394c5c = this.f6886x6f022c2.get(activity)) == null) {
            return;
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putLong(dm.i4.f66865x76d1ec5a, c2292x394c5c.f6879x6f022bc);
        bundle2.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, c2292x394c5c.f6881x394dd7);
        bundle2.putString("referrer_name", c2292x394c5c.f6878x6f022bb);
        bundle.putBundle("com.google.firebase.analytics.screen_service", bundle2);
    }

    /* renamed from: setCurrentScreen */
    public final void m19221xd4fcce03(android.app.Activity activity, java.lang.String str, java.lang.String str2) {
        mo18975x394c1d();
        if (!com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2242x394c20.m19155x9e2d0ded()) {
            mo18976x394c1e().m19111x394c67().log("setCurrentScreen must be called from the main thread");
            return;
        }
        if (this.f6883x6f022bf == null) {
            mo18976x394c1e().m19111x394c67().log("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (this.f6886x6f022c2.get(activity) == null) {
            mo18976x394c1e().m19111x394c67().log("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = m19215x394b9e(activity.getClass().getCanonicalName());
        }
        boolean equals = this.f6883x6f022bf.f6878x6f022bb.equals(str2);
        boolean zzs = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96.zzs(this.f6883x6f022bf.f6881x394dd7, str);
        if (equals && zzs) {
            mo18976x394c1e().m19112x394c68().log("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > 100)) {
            mo18976x394c1e().m19111x394c67().zzg("Invalid screen name length in setCurrentScreen. Length", java.lang.Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > 100)) {
            mo18976x394c1e().m19111x394c67().zzg("Invalid class name length in setCurrentScreen. Length", java.lang.Integer.valueOf(str2.length()));
            return;
        }
        mo18976x394c1e().m19115x394c6b().zze("Setting current screen to name, class", str == null ? "null" : str, str2);
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2292x394c5c c2292x394c5c = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2292x394c5c(str, str2, mo18973x394c1b().m19290x394cb6());
        this.f6886x6f022c2.put(activity, c2292x394c5c);
        zza(activity, c2292x394c5c, true);
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

    /* renamed from: zzkc */
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2292x394c5c m19222x394c98() {
        m19186x394ba5();
        mo18961x394b61();
        return this.f6882x6f022be;
    }

    /* renamed from: zzkd */
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2292x394c5c m19223x394c99() {
        return this.f6883x6f022bf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2292x394c5c c2292x394c5c) {
        mo18965x394c0e().zzk(mo18962x394b92().mo18537x79952707());
        if (mo18974x394c1c().zzl(c2292x394c5c.f6880x6f022bd)) {
            c2292x394c5c.f6880x6f022bd = false;
        }
    }

    public static void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2292x394c5c c2292x394c5c, android.os.Bundle bundle, boolean z17) {
        if (bundle != null && c2292x394c5c != null && (!bundle.containsKey("_sc") || z17)) {
            java.lang.String str = c2292x394c5c.f6881x394dd7;
            if (str != null) {
                bundle.putString("_sn", str);
            } else {
                bundle.remove("_sn");
            }
            bundle.putString("_sc", c2292x394c5c.f6878x6f022bb);
            bundle.putLong("_si", c2292x394c5c.f6879x6f022bc);
            return;
        }
        if (bundle != null && c2292x394c5c == null && z17) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public final void zza(java.lang.String str, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2292x394c5c c2292x394c5c) {
        mo18961x394b61();
        synchronized (this) {
            java.lang.String str2 = this.f6888x6f022c4;
            if (str2 == null || str2.equals(str) || c2292x394c5c != null) {
                this.f6888x6f022c4 = str;
                this.f6887x6f022c3 = c2292x394c5c;
            }
        }
    }
}

package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzfb */
/* loaded from: classes16.dex */
public final class C2211x394bfc extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2269x394c40 {

    /* renamed from: zzadm */
    private java.lang.String f6589x6f0216a;

    /* renamed from: zzadt */
    private java.lang.String f6590x6f02171;

    /* renamed from: zzadx */
    private long f6591x6f02175;

    /* renamed from: zzaen */
    private int f6592x6f0218a;

    /* renamed from: zzaie */
    private int f6593x6f021fd;

    /* renamed from: zzaif */
    private long f6594x6f021fe;

    /* renamed from: zztg */
    private java.lang.String f6595x394db3;

    /* renamed from: zzth */
    private java.lang.String f6596x394db4;

    /* renamed from: zzti */
    private java.lang.String f6597x394db5;

    public C2211x394bfc(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2247x394c25 c2247x394c25) {
        super(c2247x394c25);
    }

    /* renamed from: zzgj */
    private final java.lang.String m19089x394c23() {
        mo18961x394b61();
        if (mo18978x394c20().m19030x394b78(this.f6597x394db5) && !this.f6815x6f02155.m19162x7d80d2b7()) {
            return null;
        }
        try {
            com.p176xb6135e39.p271xde6bf207.iid.C2743x723fba17.b().i();
            return com.p176xb6135e39.p271xde6bf207.iid.C2743x723fba17.j();
        } catch (java.lang.IllegalStateException unused) {
            mo18976x394c1e().m19111x394c67().log("Failed to retrieve Firebase Instance Id");
            return null;
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2186x394bde
    /* renamed from: getContext */
    public final /* bridge */ /* synthetic */ android.content.Context mo18960x76847179() {
        return super.mo18960x76847179();
    }

    /* renamed from: getGmpAppId */
    public final java.lang.String m19090x9061da68() {
        m19186x394ba5();
        return this.f6589x6f0216a;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzab */
    public final /* bridge */ /* synthetic */ void mo18961x394b61() {
        super.mo18961x394b61();
    }

    /* renamed from: zzah */
    public final java.lang.String m19091x394b67() {
        m19186x394ba5();
        return this.f6597x394db5;
    }

    /* renamed from: zzbi */
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2183x394bd6 m19092x394b87(java.lang.String str) {
        mo18961x394b61();
        java.lang.String m19091x394b67 = m19091x394b67();
        java.lang.String m19090x9061da68 = m19090x9061da68();
        m19186x394ba5();
        java.lang.String str2 = this.f6596x394db4;
        long m19095x394c61 = m19095x394c61();
        m19186x394ba5();
        java.lang.String str3 = this.f6590x6f02171;
        m19186x394ba5();
        mo18961x394b61();
        if (this.f6594x6f021fe == 0) {
            this.f6594x6f021fe = this.f6815x6f02155.mo19173x394c1b().zzd(mo18960x76847179(), mo18960x76847179().getPackageName());
        }
        long j17 = this.f6594x6f021fe;
        boolean m19162x7d80d2b7 = this.f6815x6f02155.m19162x7d80d2b7();
        boolean z17 = !mo18977x394c1f().f6667x6f02244;
        java.lang.String m19089x394c23 = m19089x394c23();
        m19186x394ba5();
        long m19182x394c8a = this.f6815x6f02155.m19182x394c8a();
        int m19096x394c62 = m19096x394c62();
        java.lang.Boolean m19024x394b72 = mo18978x394c20().m19024x394b72("google_analytics_adid_collection_enabled");
        boolean booleanValue = java.lang.Boolean.valueOf(m19024x394b72 == null || m19024x394b72.booleanValue()).booleanValue();
        java.lang.Boolean m19024x394b722 = mo18978x394c20().m19024x394b72("google_analytics_ssaid_collection_enabled");
        return new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2183x394bd6(m19091x394b67, m19090x9061da68, str2, m19095x394c61, str3, 12451L, j17, str, m19162x7d80d2b7, z17, m19089x394c23, 0L, m19182x394c8a, m19096x394c62, booleanValue, java.lang.Boolean.valueOf(m19024x394b722 == null || m19024x394b722.booleanValue()).booleanValue(), mo18977x394c1f().m19134x394c7b());
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
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:1|(1:3)(6:44|45|(1:47)(2:62|(1:64))|48|49|(16:51|(1:53)(1:60)|54|55|5|(1:43)(1:9)|(1:(1:12)(1:13))|(3:15|(1:17)(1:(1:(1:27)(1:26))(1:22))|18)|28|29|30|(1:32)(1:40)|33|(1:35)|37|38))|4|5|(1:7)|43|(0)|(0)|28|29|30|(0)(0)|33|(0)|37|38|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x015c, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x015d, code lost:
    
        mo18976x394c1e().m19108x394c64().zze("getGoogleAppId or isMeasurementEnabled failed with exception. appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(r0), r1);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014a A[Catch: IllegalStateException -> 0x015c, TRY_LEAVE, TryCatch #3 {IllegalStateException -> 0x015c, blocks: (B:30:0x013a, B:33:0x0146, B:35:0x014a), top: B:29:0x013a }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00aa  */
    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2269x394c40
    /* renamed from: zzih */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo19093x394c5f() {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2211x394bfc.mo19093x394c5f():void");
    }

    /* renamed from: zzii */
    public final java.lang.String m19094x394c60() {
        byte[] bArr = new byte[16];
        mo18973x394c1b().m19291x394cb7().nextBytes(bArr);
        return java.lang.String.format(java.util.Locale.US, "%032x", new java.math.BigInteger(1, bArr));
    }

    /* renamed from: zzij */
    public final int m19095x394c61() {
        m19186x394ba5();
        return this.f6593x6f021fd;
    }

    /* renamed from: zzik */
    public final int m19096x394c62() {
        m19186x394ba5();
        return this.f6592x6f0218a;
    }
}

package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzgf */
/* loaded from: classes16.dex */
public final class C2241x394c1f extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2330x394c87 implements com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2191x394be3 {

    /* renamed from: zzalf */
    private static int f6702x6f0225b = 65535;

    /* renamed from: zzalg */
    private static int f6703x6f0225c = 2;

    /* renamed from: zzalh */
    private final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> f6704x6f0225d;

    /* renamed from: zzali */
    private final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>> f6705x6f0225e;

    /* renamed from: zzalj */
    private final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>> f6706x6f0225f;

    /* renamed from: zzalk */
    private final java.util.Map<java.lang.String, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2350x394ca0> f6707x6f02260;

    /* renamed from: zzall */
    private final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Integer>> f6708x6f02261;

    /* renamed from: zzalm */
    private final java.util.Map<java.lang.String, java.lang.String> f6709x6f02262;

    public C2241x394c1f(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2331x394c88 c2331x394c88) {
        super(c2331x394c88);
        this.f6704x6f0225d = new x.b();
        this.f6705x6f0225e = new x.b();
        this.f6706x6f0225f = new x.b();
        this.f6707x6f02260 = new x.b();
        this.f6709x6f02262 = new x.b();
        this.f6708x6f02261 = new x.b();
    }

    private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2350x394ca0 zza(java.lang.String str, byte[] bArr) {
        if (bArr == null) {
            return new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2350x394ca0();
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2165x6f02135 zza = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2165x6f02135.zza(bArr, 0, bArr.length);
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2350x394ca0 c2350x394ca0 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2350x394ca0();
        try {
            c2350x394ca0.zzb(zza);
            mo18976x394c1e().m19115x394c6b().zze("Parsed config. version, gmp_app_id", c2350x394ca0.f7075x6f0233e, c2350x394ca0.f7074x6f0216a);
            return c2350x394ca0;
        } catch (java.io.IOException e17) {
            mo18976x394c1e().m19111x394c67().zze("Unable to merge remote config. appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str), e17);
            return new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2350x394ca0();
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

    /* renamed from: zzbu */
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2350x394ca0 m19148x394b93(java.lang.String str) {
        m19257x394ba5();
        mo18961x394b61();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
        m19147x394b92(str);
        return this.f6707x6f02260.get(str);
    }

    /* renamed from: zzbv */
    public final java.lang.String m19149x394b94(java.lang.String str) {
        mo18961x394b61();
        return this.f6709x6f02262.get(str);
    }

    /* renamed from: zzbw */
    public final void m19150x394b95(java.lang.String str) {
        mo18961x394b61();
        this.f6709x6f02262.put(str, null);
    }

    /* renamed from: zzbx */
    public final void m19151x394b96(java.lang.String str) {
        mo18961x394b61();
        this.f6707x6f02260.remove(str);
    }

    /* renamed from: zzby */
    public final boolean m19152x394b97(java.lang.String str) {
        return "1".equals(zze(str, "measurement.upload.blacklist_internal"));
    }

    /* renamed from: zzbz */
    public final boolean m19153x394b98(java.lang.String str) {
        return "1".equals(zze(str, "measurement.upload.blacklist_public"));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2191x394be3
    public final java.lang.String zze(java.lang.String str, java.lang.String str2) {
        mo18961x394b61();
        m19147x394b92(str);
        java.util.Map<java.lang.String, java.lang.String> map = this.f6704x6f0225d.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
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

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2330x394c87
    /* renamed from: zzhf */
    public final boolean mo19018x394c3e() {
        return false;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2329x394c86
    /* renamed from: zziw */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2185x394bdd mo19118x394c6e() {
        return super.mo19118x394c6e();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2329x394c86
    /* renamed from: zzix */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2192x394be4 mo19119x394c6f() {
        return super.mo19119x394c6f();
    }

    public final boolean zzn(java.lang.String str, java.lang.String str2) {
        java.lang.Boolean bool;
        mo18961x394b61();
        m19147x394b92(str);
        if (m19152x394b97(str) && com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96.m19282x394ba6(str2)) {
            return true;
        }
        if (m19153x394b98(str) && com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96.m19280x394ba0(str2)) {
            return true;
        }
        java.util.Map<java.lang.String, java.lang.Boolean> map = this.f6705x6f0225e.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean zzo(java.lang.String str, java.lang.String str2) {
        java.lang.Boolean bool;
        mo18961x394b61();
        m19147x394b92(str);
        if (ya.a.f77439xd6514440.equals(str2)) {
            return true;
        }
        java.util.Map<java.lang.String, java.lang.Boolean> map = this.f6706x6f0225f.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final int zzp(java.lang.String str, java.lang.String str2) {
        java.lang.Integer num;
        mo18961x394b61();
        m19147x394b92(str);
        java.util.Map<java.lang.String, java.lang.Integer> map = this.f6708x6f02261.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    private static java.util.Map<java.lang.String, java.lang.String> zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2350x394ca0 c2350x394ca0) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2351x394ca1[] c2351x394ca1Arr;
        x.b bVar = new x.b();
        if (c2350x394ca0 != null && (c2351x394ca1Arr = c2350x394ca0.f7077x6f02340) != null) {
            for (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2351x394ca1 c2351x394ca1 : c2351x394ca1Arr) {
                if (c2351x394ca1 != null) {
                    bVar.put(c2351x394ca1.f7082x394d0b, c2351x394ca1.f7081x6ac9171);
                }
            }
        }
        return bVar;
    }

    /* renamed from: zzbt */
    private final void m19147x394b92(java.lang.String str) {
        m19257x394ba5();
        mo18961x394b61();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
        if (this.f6707x6f02260.get(str) == null) {
            byte[] m19055x394b83 = mo19119x394c6f().m19055x394b83(str);
            if (m19055x394b83 != null) {
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2350x394ca0 zza = zza(str, m19055x394b83);
                this.f6704x6f0225d.put(str, zza(zza));
                zza(str, zza);
                this.f6707x6f02260.put(str, zza);
                this.f6709x6f02262.put(str, null);
                return;
            }
            this.f6704x6f0225d.put(str, null);
            this.f6705x6f0225e.put(str, null);
            this.f6706x6f0225f.put(str, null);
            this.f6707x6f02260.put(str, null);
            this.f6709x6f02262.put(str, null);
            this.f6708x6f02261.put(str, null);
        }
    }

    private final void zza(java.lang.String str, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2350x394ca0 c2350x394ca0) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2349x394c9f[] c2349x394c9fArr;
        x.b bVar = new x.b();
        x.b bVar2 = new x.b();
        x.b bVar3 = new x.b();
        if (c2350x394ca0 != null && (c2349x394c9fArr = c2350x394ca0.f7078x6f02341) != null) {
            for (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2349x394c9f c2349x394c9f : c2349x394c9fArr) {
                if (android.text.TextUtils.isEmpty(c2349x394c9f.f7070x337a8b)) {
                    mo18976x394c1e().m19111x394c67().log("EventConfig contained null event name");
                } else {
                    java.lang.String m19499x394b6a = com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Event.m19499x394b6a(c2349x394c9f.f7070x337a8b);
                    if (!android.text.TextUtils.isEmpty(m19499x394b6a)) {
                        c2349x394c9f.f7070x337a8b = m19499x394b6a;
                    }
                    bVar.put(c2349x394c9f.f7070x337a8b, c2349x394c9f.f7071x6f0233b);
                    bVar2.put(c2349x394c9f.f7070x337a8b, c2349x394c9f.f7072x6f0233c);
                    java.lang.Integer num = c2349x394c9f.f7073x6f0233d;
                    if (num != null) {
                        if (num.intValue() < f6703x6f0225c || c2349x394c9f.f7073x6f0233d.intValue() > f6702x6f0225b) {
                            mo18976x394c1e().m19111x394c67().zze("Invalid sampling rate. Event name, sample rate", c2349x394c9f.f7070x337a8b, c2349x394c9f.f7073x6f0233d);
                        } else {
                            bVar3.put(c2349x394c9f.f7070x337a8b, c2349x394c9f.f7073x6f0233d);
                        }
                    }
                }
            }
        }
        this.f6705x6f0225e.put(str, bVar);
        this.f6706x6f0225f.put(str, bVar2);
        this.f6708x6f02261.put(str, bVar3);
    }

    public final boolean zza(java.lang.String str, byte[] bArr, java.lang.String str2) {
        byte[] bArr2;
        m19257x394ba5();
        mo18961x394b61();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2350x394ca0 zza = zza(str, bArr);
        int i17 = 0;
        if (zza == null) {
            return false;
        }
        zza(str, zza);
        this.f6707x6f02260.put(str, zza);
        this.f6709x6f02262.put(str, str2);
        this.f6704x6f0225d.put(str, zza(zza));
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2185x394bdd mo19118x394c6e = mo19118x394c6e();
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2343x394c99[] c2343x394c99Arr = zza.f7079x6f02342;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2343x394c99Arr);
        int length = c2343x394c99Arr.length;
        int i18 = 0;
        while (i18 < length) {
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2343x394c99 c2343x394c99 = c2343x394c99Arr[i18];
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2344x394c9a[] c2344x394c9aArr = c2343x394c99.f7044x6f0231d;
            int length2 = c2344x394c9aArr.length;
            int i19 = i17;
            while (i19 < length2) {
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2344x394c9a c2344x394c9a = c2344x394c9aArr[i19];
                java.lang.String m19499x394b6a = com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Event.m19499x394b6a(c2344x394c9a.f7047x6f02320);
                if (m19499x394b6a != null) {
                    c2344x394c9a.f7047x6f02320 = m19499x394b6a;
                }
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2345x394c9b[] c2345x394c9bArr = c2344x394c9a.f7048x6f02321;
                int length3 = c2345x394c9bArr.length;
                for (int i27 = i17; i27 < length3; i27++) {
                    com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2345x394c9b c2345x394c9b = c2345x394c9bArr[i27];
                    java.lang.String m19503x394b6a = com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.m19503x394b6a(c2345x394c9b.f7055x6f02328);
                    if (m19503x394b6a != null) {
                        c2345x394c9b.f7055x6f02328 = m19503x394b6a;
                    }
                }
                i19++;
                i17 = 0;
            }
            for (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2347x394c9d c2347x394c9d : c2343x394c99.f7043x6f0231c) {
                java.lang.String m19505x394b6a = com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.UserProperty.m19505x394b6a(c2347x394c9d.f7063x6f02334);
                if (m19505x394b6a != null) {
                    c2347x394c9d.f7063x6f02334 = m19505x394b6a;
                }
            }
            i18++;
            i17 = 0;
        }
        mo19118x394c6e.mo19119x394c6f().zza(str, c2343x394c99Arr);
        try {
            zza.f7079x6f02342 = null;
            int m18953x394df7 = zza.m18953x394df7();
            bArr2 = new byte[m18953x394df7];
            zza.zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzb(bArr2, 0, m18953x394df7));
        } catch (java.io.IOException e17) {
            mo18976x394c1e().m19111x394c67().zze("Unable to serialize reduced-size config. Storing full config instead. appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str), e17);
            bArr2 = bArr;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2192x394be4 mo19119x394c6f = mo19119x394c6f();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
        mo19119x394c6f.mo18961x394b61();
        mo19119x394c6f.m19257x394ba5();
        new android.content.ContentValues().put("remote_config", bArr2);
        try {
            if (mo19119x394c6f.m19049x240d90b1().update("apps", r0, "app_id = ?", new java.lang.String[]{str}) != 0) {
                return true;
            }
            mo19119x394c6f.mo18976x394c1e().m19108x394c64().zzg("Failed to update remote config (got 0). appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str));
            return true;
        } catch (android.database.sqlite.SQLiteException e18) {
            mo19119x394c6f.mo18976x394c1e().m19108x394c64().zze("Error storing remote config. appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str), e18);
            return true;
        }
    }
}

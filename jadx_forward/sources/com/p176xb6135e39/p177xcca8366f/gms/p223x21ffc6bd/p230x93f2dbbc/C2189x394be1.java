package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzef */
/* loaded from: classes16.dex */
public final class C2189x394be1 extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f {

    /* renamed from: zzaet */
    private com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2191x394be3 f6484x6f02190;

    /* renamed from: zzxz */
    private java.lang.Boolean f6485x394e42;

    public C2189x394be1(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2247x394c25 c2247x394c25) {
        super(c2247x394c25);
        this.f6484x6f02190 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2190x394be2.f6486x6f02191;
    }

    /* renamed from: zzhh */
    public static long m19020x394c40() {
        return com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2206x394bf2.f6569x6f021e5.get().longValue();
    }

    /* renamed from: zzhi */
    public static long m19021x394c41() {
        return com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2206x394bf2.f6543x6f021c6.get().longValue();
    }

    /* renamed from: zzhk */
    public static boolean m19022x394c43() {
        return com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2206x394bf2.f6539x6f021c2.get().booleanValue();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2186x394bde
    /* renamed from: getContext */
    public final /* bridge */ /* synthetic */ android.content.Context mo18960x76847179() {
        return super.mo18960x76847179();
    }

    public final long zza(java.lang.String str, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2207x394bf3<java.lang.Long> c2207x394bf3) {
        if (str != null) {
            java.lang.String zze = this.f6484x6f02190.zze(str, c2207x394bf3.m19087xb5884f29());
            if (!android.text.TextUtils.isEmpty(zze)) {
                try {
                    return c2207x394bf3.get(java.lang.Long.valueOf(java.lang.Long.parseLong(zze))).longValue();
                } catch (java.lang.NumberFormatException unused) {
                }
            }
        }
        return c2207x394bf3.get().longValue();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzab */
    public final /* bridge */ /* synthetic */ void mo18961x394b61() {
        super.mo18961x394b61();
    }

    /* renamed from: zzar */
    public final int m19023x394b71(java.lang.String str) {
        return zzb(str, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2206x394bf2.f6554x6f021d1);
    }

    /* renamed from: zzas */
    public final java.lang.Boolean m19024x394b72(java.lang.String str) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
        try {
            if (mo18960x76847179().getPackageManager() == null) {
                mo18976x394c1e().m19108x394c64().log("Failed to load metadata: PackageManager is null");
                return null;
            }
            android.content.pm.ApplicationInfo m18636x9a0587e8 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p220x84170e40.C2020x87f17260.m18642x2e2c3887(mo18960x76847179()).m18636x9a0587e8(mo18960x76847179().getPackageName(), 128);
            if (m18636x9a0587e8 == null) {
                mo18976x394c1e().m19108x394c64().log("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            android.os.Bundle bundle = m18636x9a0587e8.metaData;
            if (bundle == null) {
                mo18976x394c1e().m19108x394c64().log("Failed to load metadata: Metadata bundle is null");
                return null;
            }
            if (bundle.containsKey(str)) {
                return java.lang.Boolean.valueOf(m18636x9a0587e8.metaData.getBoolean(str));
            }
            return null;
        } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
            mo18976x394c1e().m19108x394c64().zzg("Failed to load metadata: Package name not found", e17);
            return null;
        }
    }

    /* renamed from: zzat */
    public final boolean m19025x394b73(java.lang.String str) {
        return "1".equals(this.f6484x6f02190.zze(str, "gaia_collection_enabled"));
    }

    /* renamed from: zzau */
    public final boolean m19026x394b74(java.lang.String str) {
        return "1".equals(this.f6484x6f02190.zze(str, "measurement.event_sampling_enabled"));
    }

    /* renamed from: zzav */
    public final boolean m19027x394b75(java.lang.String str) {
        return zzd(str, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2206x394bf2.f6578x6f021ee);
    }

    /* renamed from: zzaw */
    public final boolean m19028x394b76(java.lang.String str) {
        return zzd(str, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2206x394bf2.f6580x6f021f0);
    }

    /* renamed from: zzax */
    public final boolean m19029x394b77(java.lang.String str) {
        return zzd(str, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2206x394bf2.f6581x6f021f1);
    }

    /* renamed from: zzay */
    public final boolean m19030x394b78(java.lang.String str) {
        return zzd(str, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2206x394bf2.f6582x6f021f2);
    }

    /* renamed from: zzaz */
    public final boolean m19031x394b79(java.lang.String str) {
        return zzd(str, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2206x394bf2.f6583x6f021f3);
    }

    public final int zzb(java.lang.String str, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2207x394bf3<java.lang.Integer> c2207x394bf3) {
        if (str != null) {
            java.lang.String zze = this.f6484x6f02190.zze(str, c2207x394bf3.m19087xb5884f29());
            if (!android.text.TextUtils.isEmpty(zze)) {
                try {
                    return c2207x394bf3.get(java.lang.Integer.valueOf(java.lang.Integer.parseInt(zze))).intValue();
                } catch (java.lang.NumberFormatException unused) {
                }
            }
        }
        return c2207x394bf3.get().intValue();
    }

    /* renamed from: zzba */
    public final boolean m19032x394b7f(java.lang.String str) {
        return zzd(str, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2206x394bf2.f6586x6f021fb);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2186x394bde
    /* renamed from: zzbt */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.InterfaceC1991x3e2ebee mo18962x394b92() {
        return super.mo18962x394b92();
    }

    public final double zzc(java.lang.String str, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2207x394bf3<java.lang.Double> c2207x394bf3) {
        if (str != null) {
            java.lang.String zze = this.f6484x6f02190.zze(str, c2207x394bf3.m19087xb5884f29());
            if (!android.text.TextUtils.isEmpty(zze)) {
                try {
                    return c2207x394bf3.get(java.lang.Double.valueOf(java.lang.Double.parseDouble(zze))).doubleValue();
                } catch (java.lang.NumberFormatException unused) {
                }
            }
        }
        return c2207x394bf3.get().doubleValue();
    }

    public final boolean zzd(java.lang.String str, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2207x394bf3<java.lang.Boolean> c2207x394bf3) {
        java.lang.Boolean bool;
        if (str != null) {
            java.lang.String zze = this.f6484x6f02190.zze(str, c2207x394bf3.m19087xb5884f29());
            if (!android.text.TextUtils.isEmpty(zze)) {
                bool = c2207x394bf3.get(java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(zze)));
                return bool.booleanValue();
            }
        }
        bool = c2207x394bf3.get();
        return bool.booleanValue();
    }

    /* renamed from: zzds */
    public final boolean m19033x394bcf() {
        if (this.f6485x394e42 == null) {
            synchronized (this) {
                if (this.f6485x394e42 == null) {
                    android.content.pm.ApplicationInfo applicationInfo = mo18960x76847179().getApplicationInfo();
                    java.lang.String m18616x5d999098 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2008x800f03a2.m18616x5d999098();
                    if (applicationInfo != null) {
                        java.lang.String str = applicationInfo.processName;
                        this.f6485x394e42 = java.lang.Boolean.valueOf(str != null && str.equals(m18616x5d999098));
                    }
                    if (this.f6485x394e42 == null) {
                        this.f6485x394e42 = java.lang.Boolean.TRUE;
                        mo18976x394c1e().m19108x394c64().log("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f6485x394e42.booleanValue();
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

    /* renamed from: zzhg */
    public final boolean m19034x394c3f() {
        java.lang.Boolean m19024x394b72 = m19024x394b72("firebase_analytics_collection_deactivated");
        return m19024x394b72 != null && m19024x394b72.booleanValue();
    }

    /* renamed from: zzhj */
    public final java.lang.String m19035x394c42() {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2218x394c03 m19108x394c64;
        java.lang.String str;
        try {
            return (java.lang.String) java.lang.Class.forName("android.os.SystemProperties").getMethod("get", java.lang.String.class, java.lang.String.class).invoke(null, "debug.firebase.analytics.app", "");
        } catch (java.lang.ClassNotFoundException e17) {
            e = e17;
            m19108x394c64 = mo18976x394c1e().m19108x394c64();
            str = "Could not find SystemProperties class";
            m19108x394c64.zzg(str, e);
            return "";
        } catch (java.lang.IllegalAccessException e18) {
            e = e18;
            m19108x394c64 = mo18976x394c1e().m19108x394c64();
            str = "Could not access SystemProperties.get()";
            m19108x394c64.zzg(str, e);
            return "";
        } catch (java.lang.NoSuchMethodException e19) {
            e = e19;
            m19108x394c64 = mo18976x394c1e().m19108x394c64();
            str = "Could not find SystemProperties.get() method";
            m19108x394c64.zzg(str, e);
            return "";
        } catch (java.lang.reflect.InvocationTargetException e27) {
            e = e27;
            m19108x394c64 = mo18976x394c1e().m19108x394c64();
            str = "SystemProperties.get() threw an exception";
            m19108x394c64.zzg(str, e);
            return "";
        }
    }

    /* renamed from: zzhl */
    public final boolean m19036x394c44() {
        return zzd(mo18967x394c10().m19091x394b67(), com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2206x394bf2.f6573x6f021e9);
    }

    /* renamed from: zzhm */
    public final java.lang.String m19037x394c45() {
        java.lang.String m19091x394b67 = mo18967x394c10().m19091x394b67();
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2207x394bf3<java.lang.String> c2207x394bf3 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2206x394bf2.f6574x6f021ea;
        return m19091x394b67 == null ? c2207x394bf3.get() : c2207x394bf3.get(this.f6484x6f02190.zze(m19091x394b67, c2207x394bf3.m19087xb5884f29()));
    }

    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2191x394be3 interfaceC2191x394be3) {
        this.f6484x6f02190 = interfaceC2191x394be3;
    }
}

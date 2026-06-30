package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.zzfr */
/* loaded from: classes16.dex */
public final class C2227x394c0c extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2269x394c40 {

    /* renamed from: zzajs */
    static final android.util.Pair<java.lang.String, java.lang.Long> f6645x6f0222a = new android.util.Pair<>("", 0L);

    /* renamed from: zzabf */
    private android.content.SharedPreferences f6646x6f02125;

    /* renamed from: zzajt */
    public com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2231x394c10 f6647x6f0222b;

    /* renamed from: zzaju */
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2230x394c0f f6648x6f0222c;

    /* renamed from: zzajv */
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2230x394c0f f6649x6f0222d;

    /* renamed from: zzajw */
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2230x394c0f f6650x6f0222e;

    /* renamed from: zzajx */
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2230x394c0f f6651x6f0222f;

    /* renamed from: zzajy */
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2230x394c0f f6652x6f02230;

    /* renamed from: zzajz */
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2230x394c0f f6653x6f02231;

    /* renamed from: zzaka */
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2230x394c0f f6654x6f02237;

    /* renamed from: zzakb */
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2232x394c11 f6655x6f02238;

    /* renamed from: zzakc */
    private java.lang.String f6656x6f02239;

    /* renamed from: zzakd */
    private boolean f6657x6f0223a;

    /* renamed from: zzake */
    private long f6658x6f0223b;

    /* renamed from: zzakf */
    private java.lang.String f6659x6f0223c;

    /* renamed from: zzakg */
    private long f6660x6f0223d;

    /* renamed from: zzakh */
    private final java.lang.Object f6661x6f0223e;

    /* renamed from: zzaki */
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2230x394c0f f6662x6f0223f;

    /* renamed from: zzakj */
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2230x394c0f f6663x6f02240;

    /* renamed from: zzakk */
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2229x394c0e f6664x6f02241;

    /* renamed from: zzakl */
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2230x394c0f f6665x6f02242;

    /* renamed from: zzakm */
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2230x394c0f f6666x6f02243;

    /* renamed from: zzakn */
    public boolean f6667x6f02244;

    public C2227x394c0c(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2247x394c25 c2247x394c25) {
        super(c2247x394c25);
        this.f6648x6f0222c = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2230x394c0f(this, "last_upload", 0L);
        this.f6649x6f0222d = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2230x394c0f(this, "last_upload_attempt", 0L);
        this.f6650x6f0222e = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2230x394c0f(this, "backoff", 0L);
        this.f6651x6f0222f = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2230x394c0f(this, "last_delete_stale", 0L);
        this.f6662x6f0223f = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2230x394c0f(this, "time_before_start", com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
        this.f6663x6f02240 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2230x394c0f(this, "session_timeout", 1800000L);
        this.f6664x6f02241 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2229x394c0e(this, "start_new_session", true);
        this.f6665x6f02242 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2230x394c0f(this, "last_pause_time", 0L);
        this.f6666x6f02243 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2230x394c0f(this, "time_active", 0L);
        this.f6652x6f02230 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2230x394c0f(this, "midnight_offset", 0L);
        this.f6653x6f02231 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2230x394c0f(this, "first_open_time", 0L);
        this.f6654x6f02237 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2230x394c0f(this, "app_install_time", 0L);
        this.f6655x6f02238 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2232x394c11(this, "app_instance_id", null);
        this.f6661x6f0223e = new java.lang.Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zziy */
    public final android.content.SharedPreferences m19123x394c70() {
        mo18961x394b61();
        m19186x394ba5();
        return this.f6646x6f02125;
    }

    /* renamed from: setMeasurementEnabled */
    public final void m19124x105dbfe7(boolean z17) {
        mo18961x394b61();
        mo18976x394c1e().m19115x394c6b().zzg("Setting measurementEnabled", java.lang.Boolean.valueOf(z17));
        android.content.SharedPreferences.Editor edit = m19123x394c70().edit();
        edit.putBoolean("measurement_enabled", z17);
        edit.apply();
    }

    /* renamed from: zzbo */
    public final android.util.Pair<java.lang.String, java.lang.Boolean> m19125x394b8d(java.lang.String str) {
        mo18961x394b61();
        long mo18537x79952707 = mo18962x394b92().mo18537x79952707();
        if (this.f6656x6f02239 != null && mo18537x79952707 < this.f6658x6f0223b) {
            return new android.util.Pair<>(this.f6656x6f02239, java.lang.Boolean.valueOf(this.f6657x6f0223a));
        }
        this.f6658x6f0223b = mo18537x79952707 + mo18978x394c20().zza(str, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2206x394bf2.f6541x6f021c4);
        com.p176xb6135e39.p177xcca8366f.gms.ads.p188x9f88aca9.C1631x45590bea.m17264x4f1f5248(true);
        try {
            com.p176xb6135e39.p177xcca8366f.gms.ads.p188x9f88aca9.C1631x45590bea.Info m17262x477d3ff7 = com.p176xb6135e39.p177xcca8366f.gms.ads.p188x9f88aca9.C1631x45590bea.m17262x477d3ff7(mo18960x76847179());
            if (m17262x477d3ff7 != null) {
                this.f6656x6f02239 = m17262x477d3ff7.m17269x5db1b11();
                this.f6657x6f0223a = m17262x477d3ff7.m17270xcc767936();
            }
            if (this.f6656x6f02239 == null) {
                this.f6656x6f02239 = "";
            }
        } catch (java.lang.Exception e17) {
            mo18976x394c1e().m19114x394c6a().zzg("Unable to get advertising id", e17);
            this.f6656x6f02239 = "";
        }
        com.p176xb6135e39.p177xcca8366f.gms.ads.p188x9f88aca9.C1631x45590bea.m17264x4f1f5248(false);
        return new android.util.Pair<>(this.f6656x6f02239, java.lang.Boolean.valueOf(this.f6657x6f0223a));
    }

    /* renamed from: zzbp */
    public final java.lang.String m19126x394b8e(java.lang.String str) {
        mo18961x394b61();
        java.lang.String str2 = (java.lang.String) m19125x394b8d(str).first;
        java.security.MessageDigest m19279x4657e4f5 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96.m19279x4657e4f5("MD5");
        if (m19279x4657e4f5 == null) {
            return null;
        }
        return java.lang.String.format(java.util.Locale.US, "%032X", new java.math.BigInteger(1, m19279x4657e4f5.digest(str2.getBytes())));
    }

    /* renamed from: zzbq */
    public final void m19127x394b8f(java.lang.String str) {
        mo18961x394b61();
        android.content.SharedPreferences.Editor edit = m19123x394c70().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    /* renamed from: zzbr */
    public final void m19128x394b90(java.lang.String str) {
        synchronized (this.f6661x6f0223e) {
            this.f6659x6f0223c = str;
            this.f6660x6f0223d = mo18962x394b92().mo18537x79952707();
        }
    }

    public final void zzf(boolean z17) {
        mo18961x394b61();
        mo18976x394c1e().m19115x394c6b().zzg("Setting useService", java.lang.Boolean.valueOf(z17));
        android.content.SharedPreferences.Editor edit = m19123x394c70().edit();
        edit.putBoolean("use_service", z17);
        edit.apply();
    }

    public final boolean zzg(boolean z17) {
        mo18961x394b61();
        return m19123x394c70().getBoolean("measurement_enabled", z17);
    }

    public final void zzh(boolean z17) {
        mo18961x394b61();
        mo18976x394c1e().m19115x394c6b().zzg("Updating deferred analytics collection", java.lang.Boolean.valueOf(z17));
        android.content.SharedPreferences.Editor edit = m19123x394c70().edit();
        edit.putBoolean("deferred_analytics_collection", z17);
        edit.apply();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2269x394c40
    /* renamed from: zzhf */
    public final boolean mo19069x394c3e() {
        return true;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2269x394c40
    /* renamed from: zzih */
    public final void mo19093x394c5f() {
        android.content.SharedPreferences sharedPreferences = mo18960x76847179().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f6646x6f02125 = sharedPreferences;
        boolean z17 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f6667x6f02244 = z17;
        if (!z17) {
            android.content.SharedPreferences.Editor edit = this.f6646x6f02125.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f6647x6f0222b = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2231x394c10(this, "health_monitor", java.lang.Math.max(0L, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2206x394bf2.f6542x6f021c5.get().longValue()));
    }

    /* renamed from: zziz */
    public final java.lang.String m19129x394c71() {
        mo18961x394b61();
        return m19123x394c70().getString("gmp_app_id", null);
    }

    /* renamed from: zzja */
    public final java.lang.String m19130x394c77() {
        synchronized (this.f6661x6f0223e) {
            if (java.lang.Math.abs(mo18962x394b92().mo18537x79952707() - this.f6660x6f0223d) >= 1000) {
                return null;
            }
            return this.f6659x6f0223c;
        }
    }

    /* renamed from: zzjb */
    public final java.lang.Boolean m19131x394c78() {
        mo18961x394b61();
        if (m19123x394c70().contains("use_service")) {
            return java.lang.Boolean.valueOf(m19123x394c70().getBoolean("use_service", false));
        }
        return null;
    }

    /* renamed from: zzjc */
    public final void m19132x394c79() {
        mo18961x394b61();
        mo18976x394c1e().m19115x394c6b().log("Clearing collection preferences.");
        boolean contains = m19123x394c70().contains("measurement_enabled");
        boolean zzg = contains ? zzg(true) : true;
        android.content.SharedPreferences.Editor edit = m19123x394c70().edit();
        edit.clear();
        edit.apply();
        if (contains) {
            m19124x105dbfe7(zzg);
        }
    }

    /* renamed from: zzjd */
    public final java.lang.String m19133x394c7a() {
        mo18961x394b61();
        java.lang.String string = m19123x394c70().getString("previous_os_version", null);
        mo18968x394c11().m19186x394ba5();
        java.lang.String str = android.os.Build.VERSION.RELEASE;
        if (!android.text.TextUtils.isEmpty(str) && !str.equals(string)) {
            android.content.SharedPreferences.Editor edit = m19123x394c70().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }

    /* renamed from: zzje */
    public final boolean m19134x394c7b() {
        mo18961x394b61();
        return m19123x394c70().getBoolean("deferred_analytics_collection", false);
    }

    /* renamed from: zzjf */
    public final boolean m19135x394c7c() {
        return this.f6646x6f02125.contains("deferred_analytics_collection");
    }
}

package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzws */
/* loaded from: classes15.dex */
public abstract class AbstractC2364x394e1c<T> {

    /* renamed from: zzbnc */
    private static final java.lang.Object f7174x6f02657 = new java.lang.Object();

    /* renamed from: zzbnd */
    private static boolean f7175x6f02658;

    /* renamed from: zzbne */
    private static volatile java.lang.Boolean f7176x6f02659;

    /* renamed from: zzbnf */
    private static volatile java.lang.Boolean f7177x6f0265a;

    /* renamed from: zzqx */
    private static android.content.Context f7178x394d67;

    /* renamed from: zzbng */
    private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2374x394e2b f7179x6f0265b;

    /* renamed from: zzbnh */
    final java.lang.String f7180x6f0265c;

    /* renamed from: zzbni */
    private final java.lang.String f7181x6f0265d;

    /* renamed from: zzbnj */
    private final T f7182x6f0265e;

    /* renamed from: zzbnk */
    private T f7183x6f0265f;

    /* renamed from: zzbnl */
    private volatile com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2361x394e19 f7184x6f02660;

    /* renamed from: zzbnm */
    private volatile android.content.SharedPreferences f7185x6f02661;

    private AbstractC2364x394e1c(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2374x394e2b c2374x394e2b, java.lang.String str, T t17) {
        android.net.Uri uri;
        java.lang.String str2;
        java.lang.String str3;
        this.f7183x6f0265f = null;
        this.f7184x6f02660 = null;
        this.f7185x6f02661 = null;
        uri = c2374x394e2b.f7192x6f02667;
        if (uri == null) {
            throw new java.lang.IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f7179x6f0265b = c2374x394e2b;
        str2 = c2374x394e2b.f7193x6f02668;
        java.lang.String valueOf = java.lang.String.valueOf(str2);
        java.lang.String valueOf2 = java.lang.String.valueOf(str);
        this.f7181x6f0265d = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new java.lang.String(valueOf);
        str3 = c2374x394e2b.f7194x6f02669;
        java.lang.String valueOf3 = java.lang.String.valueOf(str3);
        java.lang.String valueOf4 = java.lang.String.valueOf(str);
        this.f7180x6f0265c = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new java.lang.String(valueOf3);
        this.f7182x6f0265e = t17;
    }

    /* renamed from: init */
    public static void m19351x316510(android.content.Context context) {
        android.content.Context applicationContext;
        synchronized (f7174x6f02657) {
            if (!context.isDeviceProtectedStorage() && (applicationContext = context.getApplicationContext()) != null) {
                context = applicationContext;
            }
            if (f7178x394d67 != context) {
                f7176x6f02659 = null;
            }
            f7178x394d67 = context;
        }
        f7175x6f02658 = false;
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2364x394e1c<java.lang.Double> zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2374x394e2b c2374x394e2b, java.lang.String str, double d17) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2371x394e23(c2374x394e2b, str, java.lang.Double.valueOf(d17));
    }

    public static boolean zzd(java.lang.String str, boolean z17) {
        boolean z18 = false;
        try {
            if (m19354x394d8e()) {
                return ((java.lang.Boolean) zza(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2373x394e2a(str, z18) { // from class: com.google.android.gms.internal.measurement.zzwv

                    /* renamed from: zzbnp */
                    private final java.lang.String f7189x6f02664;

                    /* renamed from: zzbnq */
                    private final boolean f7190x6f02665 = false;

                    {
                        this.f7189x6f02664 = str;
                    }

                    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2373x394e2a
                    /* renamed from: zzsc */
                    public final java.lang.Object mo19357x394d90() {
                        java.lang.Boolean valueOf;
                        valueOf = java.lang.Boolean.valueOf(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2359x394e17.zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2364x394e1c.f7178x394d67.getContentResolver(), this.f7189x6f02664, this.f7190x6f02665));
                        return valueOf;
                    }
                })).booleanValue();
            }
        } catch (java.lang.SecurityException unused) {
        }
        return false;
    }

    /* renamed from: zzry */
    private final T m19352x394d87() {
        android.net.Uri uri;
        android.net.Uri uri2;
        if (zzd("gms:phenotype:phenotype_flag:debug_bypass_phenotype", false)) {
            java.lang.String valueOf = java.lang.String.valueOf(this.f7180x6f0265c);
            if (valueOf.length() == 0) {
                return null;
            }
            "Bypass reading Phenotype values for flag: ".concat(valueOf);
            return null;
        }
        uri = this.f7179x6f0265b.f7192x6f02667;
        if (uri == null) {
            return null;
        }
        if (this.f7184x6f02660 == null) {
            android.content.ContentResolver contentResolver = f7178x394d67.getContentResolver();
            uri2 = this.f7179x6f0265b.f7192x6f02667;
            this.f7184x6f02660 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2361x394e19.zza(contentResolver, uri2);
        }
        java.lang.String str = (java.lang.String) zza(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2373x394e2a(this, this.f7184x6f02660) { // from class: com.google.android.gms.internal.measurement.zzwt

            /* renamed from: zzbnn */
            private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2364x394e1c f7186x6f02662;

            /* renamed from: zzbno */
            private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2361x394e19 f7187x6f02663;

            {
                this.f7186x6f02662 = this;
                this.f7187x6f02663 = r2;
            }

            @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2373x394e2a
            /* renamed from: zzsc */
            public final java.lang.Object mo19357x394d90() {
                return this.f7187x6f02663.m19347x394d82().get(this.f7186x6f02662.f7180x6f0265c);
            }
        });
        if (str != null) {
            return mo19355x394bf4(str);
        }
        return null;
    }

    /* renamed from: zzrz */
    private final T m19353x394d88() {
        if (!m19354x394d8e()) {
            return null;
        }
        try {
            java.lang.String str = (java.lang.String) zza(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2373x394e2a(this) { // from class: com.google.android.gms.internal.measurement.zzwu

                /* renamed from: zzbnn */
                private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2364x394e1c f7188x6f02662;

                {
                    this.f7188x6f02662 = this;
                }

                @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2373x394e2a
                /* renamed from: zzsc */
                public final java.lang.Object mo19357x394d90() {
                    return this.f7188x6f02662.m19356x394d8f();
                }
            });
            if (str != null) {
                return mo19355x394bf4(str);
            }
            return null;
        } catch (java.lang.SecurityException unused) {
            java.lang.String valueOf = java.lang.String.valueOf(this.f7180x6f0265c);
            if (valueOf.length() == 0) {
                return null;
            }
            "Unable to read GServices for flag: ".concat(valueOf);
            return null;
        }
    }

    /* renamed from: zzsa */
    private static boolean m19354x394d8e() {
        if (f7176x6f02659 == null) {
            android.content.Context context = f7178x394d67;
            if (context == null) {
                return false;
            }
            f7176x6f02659 = java.lang.Boolean.valueOf(b3.r.a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES", android.os.Binder.getCallingPid(), android.os.Binder.getCallingUid(), android.os.Binder.getCallingPid() == android.os.Process.myPid() ? context.getPackageName() : null) == 0);
        }
        return f7176x6f02659.booleanValue();
    }

    public final T get() {
        if (f7178x394d67 == null) {
            throw new java.lang.IllegalStateException("Must call PhenotypeFlag.init() first");
        }
        T m19352x394d87 = m19352x394d87();
        if (m19352x394d87 != null) {
            return m19352x394d87;
        }
        T m19353x394d88 = m19353x394d88();
        return m19353x394d88 != null ? m19353x394d88 : this.f7182x6f0265e;
    }

    /* renamed from: zzey */
    public abstract T mo19355x394bf4(java.lang.String str);

    /* renamed from: zzsb */
    public final /* synthetic */ java.lang.String m19356x394d8f() {
        return com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2359x394e17.zza(f7178x394d67.getContentResolver(), this.f7181x6f0265d, (java.lang.String) null);
    }

    public /* synthetic */ AbstractC2364x394e1c(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2374x394e2b c2374x394e2b, java.lang.String str, java.lang.Object obj, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2368x394e20 c2368x394e20) {
        this(c2374x394e2b, str, obj);
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2364x394e1c<java.lang.Integer> zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2374x394e2b c2374x394e2b, java.lang.String str, int i17) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2369x394e21(c2374x394e2b, str, java.lang.Integer.valueOf(i17));
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2364x394e1c<java.lang.Long> zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2374x394e2b c2374x394e2b, java.lang.String str, long j17) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2368x394e20(c2374x394e2b, str, java.lang.Long.valueOf(j17));
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2364x394e1c<java.lang.String> zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2374x394e2b c2374x394e2b, java.lang.String str, java.lang.String str2) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2372x394e29(c2374x394e2b, str, str2);
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2364x394e1c<java.lang.Boolean> zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2374x394e2b c2374x394e2b, java.lang.String str, boolean z17) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2370x394e22(c2374x394e2b, str, java.lang.Boolean.valueOf(z17));
    }

    private static <V> V zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2373x394e2a<V> interfaceC2373x394e2a) {
        try {
            return interfaceC2373x394e2a.mo19357x394d90();
        } catch (java.lang.SecurityException unused) {
            long clearCallingIdentity = android.os.Binder.clearCallingIdentity();
            try {
                return interfaceC2373x394e2a.mo19357x394d90();
            } finally {
                android.os.Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }
}

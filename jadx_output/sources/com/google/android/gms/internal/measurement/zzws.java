package com.google.android.gms.internal.measurement;

/* loaded from: classes15.dex */
public abstract class zzws<T> {
    private static final java.lang.Object zzbnc = new java.lang.Object();
    private static boolean zzbnd;
    private static volatile java.lang.Boolean zzbne;
    private static volatile java.lang.Boolean zzbnf;
    private static android.content.Context zzqx;
    private final com.google.android.gms.internal.measurement.zzxc zzbng;
    final java.lang.String zzbnh;
    private final java.lang.String zzbni;
    private final T zzbnj;
    private T zzbnk;
    private volatile com.google.android.gms.internal.measurement.zzwp zzbnl;
    private volatile android.content.SharedPreferences zzbnm;

    private zzws(com.google.android.gms.internal.measurement.zzxc zzxcVar, java.lang.String str, T t17) {
        android.net.Uri uri;
        java.lang.String str2;
        java.lang.String str3;
        this.zzbnk = null;
        this.zzbnl = null;
        this.zzbnm = null;
        uri = zzxcVar.zzbns;
        if (uri == null) {
            throw new java.lang.IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.zzbng = zzxcVar;
        str2 = zzxcVar.zzbnt;
        java.lang.String valueOf = java.lang.String.valueOf(str2);
        java.lang.String valueOf2 = java.lang.String.valueOf(str);
        this.zzbni = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new java.lang.String(valueOf);
        str3 = zzxcVar.zzbnu;
        java.lang.String valueOf3 = java.lang.String.valueOf(str3);
        java.lang.String valueOf4 = java.lang.String.valueOf(str);
        this.zzbnh = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new java.lang.String(valueOf3);
        this.zzbnj = t17;
    }

    public static void init(android.content.Context context) {
        android.content.Context applicationContext;
        synchronized (zzbnc) {
            if (!context.isDeviceProtectedStorage() && (applicationContext = context.getApplicationContext()) != null) {
                context = applicationContext;
            }
            if (zzqx != context) {
                zzbne = null;
            }
            zzqx = context;
        }
        zzbnd = false;
    }

    public static com.google.android.gms.internal.measurement.zzws<java.lang.Double> zza(com.google.android.gms.internal.measurement.zzxc zzxcVar, java.lang.String str, double d17) {
        return new com.google.android.gms.internal.measurement.zzwz(zzxcVar, str, java.lang.Double.valueOf(d17));
    }

    public static boolean zzd(java.lang.String str, boolean z17) {
        boolean z18 = false;
        try {
            if (zzsa()) {
                return ((java.lang.Boolean) zza(new com.google.android.gms.internal.measurement.zzxb(str, z18) { // from class: com.google.android.gms.internal.measurement.zzwv
                    private final java.lang.String zzbnp;
                    private final boolean zzbnq = false;

                    {
                        this.zzbnp = str;
                    }

                    @Override // com.google.android.gms.internal.measurement.zzxb
                    public final java.lang.Object zzsc() {
                        java.lang.Boolean valueOf;
                        valueOf = java.lang.Boolean.valueOf(com.google.android.gms.internal.measurement.zzwn.zza(com.google.android.gms.internal.measurement.zzws.zzqx.getContentResolver(), this.zzbnp, this.zzbnq));
                        return valueOf;
                    }
                })).booleanValue();
            }
        } catch (java.lang.SecurityException unused) {
        }
        return false;
    }

    private final T zzry() {
        android.net.Uri uri;
        android.net.Uri uri2;
        if (zzd("gms:phenotype:phenotype_flag:debug_bypass_phenotype", false)) {
            java.lang.String valueOf = java.lang.String.valueOf(this.zzbnh);
            if (valueOf.length() == 0) {
                return null;
            }
            "Bypass reading Phenotype values for flag: ".concat(valueOf);
            return null;
        }
        uri = this.zzbng.zzbns;
        if (uri == null) {
            return null;
        }
        if (this.zzbnl == null) {
            android.content.ContentResolver contentResolver = zzqx.getContentResolver();
            uri2 = this.zzbng.zzbns;
            this.zzbnl = com.google.android.gms.internal.measurement.zzwp.zza(contentResolver, uri2);
        }
        java.lang.String str = (java.lang.String) zza(new com.google.android.gms.internal.measurement.zzxb(this, this.zzbnl) { // from class: com.google.android.gms.internal.measurement.zzwt
            private final com.google.android.gms.internal.measurement.zzws zzbnn;
            private final com.google.android.gms.internal.measurement.zzwp zzbno;

            {
                this.zzbnn = this;
                this.zzbno = r2;
            }

            @Override // com.google.android.gms.internal.measurement.zzxb
            public final java.lang.Object zzsc() {
                return this.zzbno.zzrt().get(this.zzbnn.zzbnh);
            }
        });
        if (str != null) {
            return zzey(str);
        }
        return null;
    }

    private final T zzrz() {
        if (!zzsa()) {
            return null;
        }
        try {
            java.lang.String str = (java.lang.String) zza(new com.google.android.gms.internal.measurement.zzxb(this) { // from class: com.google.android.gms.internal.measurement.zzwu
                private final com.google.android.gms.internal.measurement.zzws zzbnn;

                {
                    this.zzbnn = this;
                }

                @Override // com.google.android.gms.internal.measurement.zzxb
                public final java.lang.Object zzsc() {
                    return this.zzbnn.zzsb();
                }
            });
            if (str != null) {
                return zzey(str);
            }
            return null;
        } catch (java.lang.SecurityException unused) {
            java.lang.String valueOf = java.lang.String.valueOf(this.zzbnh);
            if (valueOf.length() == 0) {
                return null;
            }
            "Unable to read GServices for flag: ".concat(valueOf);
            return null;
        }
    }

    private static boolean zzsa() {
        if (zzbne == null) {
            android.content.Context context = zzqx;
            if (context == null) {
                return false;
            }
            zzbne = java.lang.Boolean.valueOf(b3.r.a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES", android.os.Binder.getCallingPid(), android.os.Binder.getCallingUid(), android.os.Binder.getCallingPid() == android.os.Process.myPid() ? context.getPackageName() : null) == 0);
        }
        return zzbne.booleanValue();
    }

    public final T get() {
        if (zzqx == null) {
            throw new java.lang.IllegalStateException("Must call PhenotypeFlag.init() first");
        }
        T zzry = zzry();
        if (zzry != null) {
            return zzry;
        }
        T zzrz = zzrz();
        return zzrz != null ? zzrz : this.zzbnj;
    }

    public abstract T zzey(java.lang.String str);

    public final /* synthetic */ java.lang.String zzsb() {
        return com.google.android.gms.internal.measurement.zzwn.zza(zzqx.getContentResolver(), this.zzbni, (java.lang.String) null);
    }

    public /* synthetic */ zzws(com.google.android.gms.internal.measurement.zzxc zzxcVar, java.lang.String str, java.lang.Object obj, com.google.android.gms.internal.measurement.zzww zzwwVar) {
        this(zzxcVar, str, obj);
    }

    public static com.google.android.gms.internal.measurement.zzws<java.lang.Integer> zza(com.google.android.gms.internal.measurement.zzxc zzxcVar, java.lang.String str, int i17) {
        return new com.google.android.gms.internal.measurement.zzwx(zzxcVar, str, java.lang.Integer.valueOf(i17));
    }

    public static com.google.android.gms.internal.measurement.zzws<java.lang.Long> zza(com.google.android.gms.internal.measurement.zzxc zzxcVar, java.lang.String str, long j17) {
        return new com.google.android.gms.internal.measurement.zzww(zzxcVar, str, java.lang.Long.valueOf(j17));
    }

    public static com.google.android.gms.internal.measurement.zzws<java.lang.String> zza(com.google.android.gms.internal.measurement.zzxc zzxcVar, java.lang.String str, java.lang.String str2) {
        return new com.google.android.gms.internal.measurement.zzxa(zzxcVar, str, str2);
    }

    public static com.google.android.gms.internal.measurement.zzws<java.lang.Boolean> zza(com.google.android.gms.internal.measurement.zzxc zzxcVar, java.lang.String str, boolean z17) {
        return new com.google.android.gms.internal.measurement.zzwy(zzxcVar, str, java.lang.Boolean.valueOf(z17));
    }

    private static <V> V zza(com.google.android.gms.internal.measurement.zzxb<V> zzxbVar) {
        try {
            return zzxbVar.zzsc();
        } catch (java.lang.SecurityException unused) {
            long clearCallingIdentity = android.os.Binder.clearCallingIdentity();
            try {
                return zzxbVar.zzsc();
            } finally {
                android.os.Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }
}

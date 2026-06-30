package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p202xaf3f8342;

/* renamed from: com.google.android.gms.common.config.GservicesValue */
/* loaded from: classes13.dex */
public abstract class AbstractC1878x5e4906cc<T> {
    private static final java.lang.Object zzc = new java.lang.Object();
    protected final java.lang.String zza;
    protected final java.lang.Object zzb;
    private java.lang.Object zzd = null;

    public AbstractC1878x5e4906cc(java.lang.String str, java.lang.Object obj) {
        this.zza = str;
        this.zzb = obj;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /* renamed from: isInitialized */
    public static boolean m17977xf582434a() {
        synchronized (zzc) {
        }
        return false;
    }

    /* renamed from: value */
    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p202xaf3f8342.AbstractC1878x5e4906cc<java.lang.Float> m17978x6ac9171(java.lang.String str, java.lang.Float f17) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p202xaf3f8342.zzd(str, f17);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final T get() {
        T t17;
        T t18 = (T) this.zzd;
        if (t18 != null) {
            return t18;
        }
        android.os.StrictMode.ThreadPolicy allowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        java.lang.Object obj = zzc;
        synchronized (obj) {
        }
        synchronized (obj) {
            try {
            } finally {
                android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        }
        try {
            t17 = (T) zza(this.zza);
        } catch (java.lang.SecurityException unused) {
            long clearCallingIdentity = android.os.Binder.clearCallingIdentity();
            try {
                t17 = (T) zza(this.zza);
            } finally {
                android.os.Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return t17;
    }

    @java.lang.Deprecated
    /* renamed from: getBinderSafe */
    public final T m17983x41e71c4d() {
        return get();
    }

    /* renamed from: override */
    public void m17984x1f971bcc(T t17) {
        this.zzd = t17;
        java.lang.Object obj = zzc;
        synchronized (obj) {
            synchronized (obj) {
            }
        }
    }

    /* renamed from: resetOverride */
    public void m17985xd598de3b() {
        this.zzd = null;
    }

    public abstract java.lang.Object zza(java.lang.String str);

    /* renamed from: value */
    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p202xaf3f8342.AbstractC1878x5e4906cc<java.lang.Integer> m17979x6ac9171(java.lang.String str, java.lang.Integer num) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p202xaf3f8342.zzc(str, num);
    }

    /* renamed from: value */
    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p202xaf3f8342.AbstractC1878x5e4906cc<java.lang.Long> m17980x6ac9171(java.lang.String str, java.lang.Long l17) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p202xaf3f8342.zzb(str, l17);
    }

    /* renamed from: value */
    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p202xaf3f8342.AbstractC1878x5e4906cc<java.lang.String> m17981x6ac9171(java.lang.String str, java.lang.String str2) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p202xaf3f8342.zze(str, str2);
    }

    /* renamed from: value */
    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p202xaf3f8342.AbstractC1878x5e4906cc<java.lang.Boolean> m17982x6ac9171(java.lang.String str, boolean z17) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p202xaf3f8342.zza(str, java.lang.Boolean.valueOf(z17));
    }
}

package com.google.android.gms.common.config;

/* loaded from: classes13.dex */
public abstract class GservicesValue<T> {
    private static final java.lang.Object zzc = new java.lang.Object();
    protected final java.lang.String zza;
    protected final java.lang.Object zzb;
    private java.lang.Object zzd = null;

    public GservicesValue(java.lang.String str, java.lang.Object obj) {
        this.zza = str;
        this.zzb = obj;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static boolean isInitialized() {
        synchronized (zzc) {
        }
        return false;
    }

    public static com.google.android.gms.common.config.GservicesValue<java.lang.Float> value(java.lang.String str, java.lang.Float f17) {
        return new com.google.android.gms.common.config.zzd(str, f17);
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
    public final T getBinderSafe() {
        return get();
    }

    public void override(T t17) {
        this.zzd = t17;
        java.lang.Object obj = zzc;
        synchronized (obj) {
            synchronized (obj) {
            }
        }
    }

    public void resetOverride() {
        this.zzd = null;
    }

    public abstract java.lang.Object zza(java.lang.String str);

    public static com.google.android.gms.common.config.GservicesValue<java.lang.Integer> value(java.lang.String str, java.lang.Integer num) {
        return new com.google.android.gms.common.config.zzc(str, num);
    }

    public static com.google.android.gms.common.config.GservicesValue<java.lang.Long> value(java.lang.String str, java.lang.Long l17) {
        return new com.google.android.gms.common.config.zzb(str, l17);
    }

    public static com.google.android.gms.common.config.GservicesValue<java.lang.String> value(java.lang.String str, java.lang.String str2) {
        return new com.google.android.gms.common.config.zze(str, str2);
    }

    public static com.google.android.gms.common.config.GservicesValue<java.lang.Boolean> value(java.lang.String str, boolean z17) {
        return new com.google.android.gms.common.config.zza(str, java.lang.Boolean.valueOf(z17));
    }
}

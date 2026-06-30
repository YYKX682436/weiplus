package com.google.android.gms.internal.measurement;

/* loaded from: classes15.dex */
public final class zzex<V> {
    private final com.google.android.gms.internal.measurement.zzws<V> zzaid;
    private final java.lang.String zzny;

    private zzex(java.lang.String str, com.google.android.gms.internal.measurement.zzws<V> zzwsVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzwsVar);
        this.zzaid = zzwsVar;
        this.zzny = str;
    }

    public static com.google.android.gms.internal.measurement.zzex<java.lang.Double> zza(java.lang.String str, double d17, double d18) {
        com.google.android.gms.internal.measurement.zzxc zzxcVar;
        zzxcVar = com.google.android.gms.internal.measurement.zzew.zzagc;
        return new com.google.android.gms.internal.measurement.zzex<>(str, zzxcVar.zzb(str, -3.0d));
    }

    public static com.google.android.gms.internal.measurement.zzex<java.lang.Long> zzb(java.lang.String str, long j17, long j18) {
        com.google.android.gms.internal.measurement.zzxc zzxcVar;
        zzxcVar = com.google.android.gms.internal.measurement.zzew.zzagc;
        return new com.google.android.gms.internal.measurement.zzex<>(str, zzxcVar.zze(str, j17));
    }

    public static com.google.android.gms.internal.measurement.zzex<java.lang.Integer> zzc(java.lang.String str, int i17, int i18) {
        com.google.android.gms.internal.measurement.zzxc zzxcVar;
        zzxcVar = com.google.android.gms.internal.measurement.zzew.zzagc;
        return new com.google.android.gms.internal.measurement.zzex<>(str, zzxcVar.zzd(str, i17));
    }

    public static com.google.android.gms.internal.measurement.zzex<java.lang.String> zzd(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.google.android.gms.internal.measurement.zzxc zzxcVar;
        zzxcVar = com.google.android.gms.internal.measurement.zzew.zzagc;
        return new com.google.android.gms.internal.measurement.zzex<>(str, zzxcVar.zzv(str, str2));
    }

    public final V get() {
        return this.zzaid.get();
    }

    public final java.lang.String getKey() {
        return this.zzny;
    }

    public static com.google.android.gms.internal.measurement.zzex<java.lang.Boolean> zzb(java.lang.String str, boolean z17, boolean z18) {
        com.google.android.gms.internal.measurement.zzxc zzxcVar;
        zzxcVar = com.google.android.gms.internal.measurement.zzew.zzagc;
        return new com.google.android.gms.internal.measurement.zzex<>(str, zzxcVar.zzf(str, z17));
    }

    public final V get(V v17) {
        return v17 != null ? v17 : this.zzaid.get();
    }
}

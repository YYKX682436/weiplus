package com.google.android.gms.internal.measurement;

/* loaded from: classes13.dex */
final class zzaap<T> implements com.google.android.gms.internal.measurement.zzaav<T> {
    private final com.google.android.gms.internal.measurement.zzaal zzbtk;
    private final com.google.android.gms.internal.measurement.zzabj<?, ?> zzbtl;
    private final boolean zzbtm;
    private final com.google.android.gms.internal.measurement.zzzj<?> zzbtn;

    private zzaap(com.google.android.gms.internal.measurement.zzabj<?, ?> zzabjVar, com.google.android.gms.internal.measurement.zzzj<?> zzzjVar, com.google.android.gms.internal.measurement.zzaal zzaalVar) {
        this.zzbtl = zzabjVar;
        this.zzbtm = zzzjVar.zza(zzaalVar);
        this.zzbtn = zzzjVar;
        this.zzbtk = zzaalVar;
    }

    public static <T> com.google.android.gms.internal.measurement.zzaap<T> zza(com.google.android.gms.internal.measurement.zzabj<?, ?> zzabjVar, com.google.android.gms.internal.measurement.zzzj<?> zzzjVar, com.google.android.gms.internal.measurement.zzaal zzaalVar) {
        return new com.google.android.gms.internal.measurement.zzaap<>(zzabjVar, zzzjVar, zzaalVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzaav
    public final boolean equals(T t17, T t18) {
        if (!this.zzbtl.zzu(t17).equals(this.zzbtl.zzu(t18))) {
            return false;
        }
        if (this.zzbtm) {
            return this.zzbtn.zzs(t17).equals(this.zzbtn.zzs(t18));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzaav
    public final int hashCode(T t17) {
        int hashCode = this.zzbtl.zzu(t17).hashCode();
        return this.zzbtm ? (hashCode * 53) + this.zzbtn.zzs(t17).hashCode() : hashCode;
    }
}

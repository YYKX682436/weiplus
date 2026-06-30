package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
final class zzeq {
    final java.lang.String name;
    final long zzafr;
    final long zzafs;
    final long zzaft;
    final long zzafu;
    final java.lang.Long zzafv;
    final java.lang.Long zzafw;
    final java.lang.Boolean zzafx;
    final java.lang.String zzti;

    public zzeq(java.lang.String str, java.lang.String str2, long j17, long j18, long j19, long j27, java.lang.Long l17, java.lang.Long l18, java.lang.Boolean bool) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        com.google.android.gms.common.internal.Preconditions.checkArgument(j17 >= 0);
        com.google.android.gms.common.internal.Preconditions.checkArgument(j18 >= 0);
        com.google.android.gms.common.internal.Preconditions.checkArgument(j27 >= 0);
        this.zzti = str;
        this.name = str2;
        this.zzafr = j17;
        this.zzafs = j18;
        this.zzaft = j19;
        this.zzafu = j27;
        this.zzafv = l17;
        this.zzafw = l18;
        this.zzafx = bool;
    }

    public final com.google.android.gms.internal.measurement.zzeq zza(java.lang.Long l17, java.lang.Long l18, java.lang.Boolean bool) {
        return new com.google.android.gms.internal.measurement.zzeq(this.zzti, this.name, this.zzafr, this.zzafs, this.zzaft, this.zzafu, l17, l18, (bool == null || bool.booleanValue()) ? bool : null);
    }

    public final com.google.android.gms.internal.measurement.zzeq zzac(long j17) {
        return new com.google.android.gms.internal.measurement.zzeq(this.zzti, this.name, this.zzafr, this.zzafs, j17, this.zzafu, this.zzafv, this.zzafw, this.zzafx);
    }

    public final com.google.android.gms.internal.measurement.zzeq zzad(long j17) {
        return new com.google.android.gms.internal.measurement.zzeq(this.zzti, this.name, this.zzafr, this.zzafs, this.zzaft, j17, this.zzafv, this.zzafw, this.zzafx);
    }

    public final com.google.android.gms.internal.measurement.zzeq zzie() {
        return new com.google.android.gms.internal.measurement.zzeq(this.zzti, this.name, this.zzafr + 1, 1 + this.zzafs, this.zzaft, this.zzafu, this.zzafv, this.zzafw, this.zzafx);
    }
}

package com.google.android.gms.common;

/* loaded from: classes13.dex */
final class zzz {
    private java.lang.String zza = null;
    private long zzb = -1;
    private com.google.android.gms.internal.common.zzag zzc = com.google.android.gms.internal.common.zzag.zzl();
    private com.google.android.gms.internal.common.zzag zzd = com.google.android.gms.internal.common.zzag.zzl();

    public final com.google.android.gms.common.zzz zza(long j17) {
        this.zzb = j17;
        return this;
    }

    public final com.google.android.gms.common.zzz zzb(java.util.List list) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(list);
        this.zzd = com.google.android.gms.internal.common.zzag.zzk(list);
        return this;
    }

    public final com.google.android.gms.common.zzz zzc(java.util.List list) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(list);
        this.zzc = com.google.android.gms.internal.common.zzag.zzk(list);
        return this;
    }

    public final com.google.android.gms.common.zzz zzd(java.lang.String str) {
        this.zza = str;
        return this;
    }

    public final com.google.android.gms.common.zzab zze() {
        if (this.zza == null) {
            throw new java.lang.IllegalStateException("packageName must be defined");
        }
        if (this.zzb < 0) {
            throw new java.lang.IllegalStateException("minimumStampedVersionNumber must be greater than or equal to 0");
        }
        if (this.zzc.isEmpty() && this.zzd.isEmpty()) {
            throw new java.lang.IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
        }
        return new com.google.android.gms.common.zzab(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}

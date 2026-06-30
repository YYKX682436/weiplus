package com.google.android.gms.internal.wearable;

/* loaded from: classes16.dex */
public final class zzi extends com.google.android.gms.internal.wearable.zzn<com.google.android.gms.internal.wearable.zzi> {
    private static volatile com.google.android.gms.internal.wearable.zzi[] zzgb;
    public int type = 1;
    public com.google.android.gms.internal.wearable.zzj zzgc = null;

    public zzi() {
        this.zzhc = null;
        this.zzhl = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.wearable.zzt
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.wearable.zzi zza(com.google.android.gms.internal.wearable.zzk zzkVar) {
        while (true) {
            int zzj = zzkVar.zzj();
            if (zzj == 0) {
                return this;
            }
            if (zzj == 8) {
                int position = zzkVar.getPosition();
                try {
                    int zzk = zzkVar.zzk();
                    if (zzk <= 0 || zzk > 15) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(36);
                        sb6.append(zzk);
                        sb6.append(" is not a valid enum Type");
                        throw new java.lang.IllegalArgumentException(sb6.toString());
                        break;
                    }
                    this.type = zzk;
                } catch (java.lang.IllegalArgumentException unused) {
                    zzkVar.zzg(position);
                    zza(zzkVar, zzj);
                }
            } else if (zzj == 18) {
                if (this.zzgc == null) {
                    this.zzgc = new com.google.android.gms.internal.wearable.zzj();
                }
                zzkVar.zza(this.zzgc);
            } else if (!super.zza(zzkVar, zzj)) {
                return this;
            }
        }
    }

    public static com.google.android.gms.internal.wearable.zzi[] zzi() {
        if (zzgb == null) {
            synchronized (com.google.android.gms.internal.wearable.zzr.zzhk) {
                if (zzgb == null) {
                    zzgb = new com.google.android.gms.internal.wearable.zzi[0];
                }
            }
        }
        return zzgb;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.wearable.zzi)) {
            return false;
        }
        com.google.android.gms.internal.wearable.zzi zziVar = (com.google.android.gms.internal.wearable.zzi) obj;
        if (this.type != zziVar.type) {
            return false;
        }
        com.google.android.gms.internal.wearable.zzj zzjVar = this.zzgc;
        if (zzjVar == null) {
            if (zziVar.zzgc != null) {
                return false;
            }
        } else if (!zzjVar.equals(zziVar.zzgc)) {
            return false;
        }
        com.google.android.gms.internal.wearable.zzp zzpVar = this.zzhc;
        if (zzpVar != null && !zzpVar.isEmpty()) {
            return this.zzhc.equals(zziVar.zzhc);
        }
        com.google.android.gms.internal.wearable.zzp zzpVar2 = zziVar.zzhc;
        return zzpVar2 == null || zzpVar2.isEmpty();
    }

    public final int hashCode() {
        int i17 = 1588755220 + this.type;
        com.google.android.gms.internal.wearable.zzj zzjVar = this.zzgc;
        int i18 = 0;
        int hashCode = ((i17 * 31) + (zzjVar == null ? 0 : zzjVar.hashCode())) * 31;
        com.google.android.gms.internal.wearable.zzp zzpVar = this.zzhc;
        if (zzpVar != null && !zzpVar.isEmpty()) {
            i18 = this.zzhc.hashCode();
        }
        return hashCode + i18;
    }

    @Override // com.google.android.gms.internal.wearable.zzn, com.google.android.gms.internal.wearable.zzt
    public final int zzg() {
        int zzg = super.zzg() + com.google.android.gms.internal.wearable.zzl.zze(1, this.type);
        com.google.android.gms.internal.wearable.zzj zzjVar = this.zzgc;
        return zzjVar != null ? zzg + com.google.android.gms.internal.wearable.zzl.zzb(2, zzjVar) : zzg;
    }

    @Override // com.google.android.gms.internal.wearable.zzn, com.google.android.gms.internal.wearable.zzt
    public final void zza(com.google.android.gms.internal.wearable.zzl zzlVar) {
        zzlVar.zzd(1, this.type);
        com.google.android.gms.internal.wearable.zzj zzjVar = this.zzgc;
        if (zzjVar != null) {
            zzlVar.zza(2, zzjVar);
        }
        super.zza(zzlVar);
    }
}

package com.google.android.gms.internal.wearable;

/* loaded from: classes16.dex */
public final class zzh extends com.google.android.gms.internal.wearable.zzn<com.google.android.gms.internal.wearable.zzh> {
    private static volatile com.google.android.gms.internal.wearable.zzh[] zzfz;
    public java.lang.String name = "";
    public com.google.android.gms.internal.wearable.zzi zzga = null;

    public zzh() {
        this.zzhc = null;
        this.zzhl = -1;
    }

    public static com.google.android.gms.internal.wearable.zzh[] zzh() {
        if (zzfz == null) {
            synchronized (com.google.android.gms.internal.wearable.zzr.zzhk) {
                if (zzfz == null) {
                    zzfz = new com.google.android.gms.internal.wearable.zzh[0];
                }
            }
        }
        return zzfz;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.wearable.zzh)) {
            return false;
        }
        com.google.android.gms.internal.wearable.zzh zzhVar = (com.google.android.gms.internal.wearable.zzh) obj;
        java.lang.String str = this.name;
        if (str == null) {
            if (zzhVar.name != null) {
                return false;
            }
        } else if (!str.equals(zzhVar.name)) {
            return false;
        }
        com.google.android.gms.internal.wearable.zzi zziVar = this.zzga;
        if (zziVar == null) {
            if (zzhVar.zzga != null) {
                return false;
            }
        } else if (!zziVar.equals(zzhVar.zzga)) {
            return false;
        }
        com.google.android.gms.internal.wearable.zzp zzpVar = this.zzhc;
        if (zzpVar != null && !zzpVar.isEmpty()) {
            return this.zzhc.equals(zzhVar.zzhc);
        }
        com.google.android.gms.internal.wearable.zzp zzpVar2 = zzhVar.zzhc;
        return zzpVar2 == null || zzpVar2.isEmpty();
    }

    public final int hashCode() {
        java.lang.String str = this.name;
        int i17 = 0;
        int hashCode = 1588755189 + (str == null ? 0 : str.hashCode());
        com.google.android.gms.internal.wearable.zzi zziVar = this.zzga;
        int hashCode2 = ((hashCode * 31) + (zziVar == null ? 0 : zziVar.hashCode())) * 31;
        com.google.android.gms.internal.wearable.zzp zzpVar = this.zzhc;
        if (zzpVar != null && !zzpVar.isEmpty()) {
            i17 = this.zzhc.hashCode();
        }
        return hashCode2 + i17;
    }

    @Override // com.google.android.gms.internal.wearable.zzt
    public final /* synthetic */ com.google.android.gms.internal.wearable.zzt zza(com.google.android.gms.internal.wearable.zzk zzkVar) {
        while (true) {
            int zzj = zzkVar.zzj();
            if (zzj == 0) {
                return this;
            }
            if (zzj == 10) {
                this.name = zzkVar.readString();
            } else if (zzj == 18) {
                if (this.zzga == null) {
                    this.zzga = new com.google.android.gms.internal.wearable.zzi();
                }
                zzkVar.zza(this.zzga);
            } else if (!super.zza(zzkVar, zzj)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.wearable.zzn, com.google.android.gms.internal.wearable.zzt
    public final int zzg() {
        int zzg = super.zzg() + com.google.android.gms.internal.wearable.zzl.zzb(1, this.name);
        com.google.android.gms.internal.wearable.zzi zziVar = this.zzga;
        return zziVar != null ? zzg + com.google.android.gms.internal.wearable.zzl.zzb(2, zziVar) : zzg;
    }

    @Override // com.google.android.gms.internal.wearable.zzn, com.google.android.gms.internal.wearable.zzt
    public final void zza(com.google.android.gms.internal.wearable.zzl zzlVar) {
        zzlVar.zza(1, this.name);
        com.google.android.gms.internal.wearable.zzi zziVar = this.zzga;
        if (zziVar != null) {
            zzlVar.zza(2, zziVar);
        }
        super.zza(zzlVar);
    }
}

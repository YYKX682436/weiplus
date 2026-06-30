package com.google.android.gms.internal.wearable;

/* loaded from: classes16.dex */
public final class zzg extends com.google.android.gms.internal.wearable.zzn<com.google.android.gms.internal.wearable.zzg> {
    public com.google.android.gms.internal.wearable.zzh[] zzfy = com.google.android.gms.internal.wearable.zzh.zzh();

    public zzg() {
        this.zzhc = null;
        this.zzhl = -1;
    }

    public static com.google.android.gms.internal.wearable.zzg zza(byte[] bArr) {
        return (com.google.android.gms.internal.wearable.zzg) com.google.android.gms.internal.wearable.zzt.zza(new com.google.android.gms.internal.wearable.zzg(), bArr, 0, bArr.length);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.wearable.zzg)) {
            return false;
        }
        com.google.android.gms.internal.wearable.zzg zzgVar = (com.google.android.gms.internal.wearable.zzg) obj;
        if (!com.google.android.gms.internal.wearable.zzr.equals(this.zzfy, zzgVar.zzfy)) {
            return false;
        }
        com.google.android.gms.internal.wearable.zzp zzpVar = this.zzhc;
        if (zzpVar != null && !zzpVar.isEmpty()) {
            return this.zzhc.equals(zzgVar.zzhc);
        }
        com.google.android.gms.internal.wearable.zzp zzpVar2 = zzgVar.zzhc;
        return zzpVar2 == null || zzpVar2.isEmpty();
    }

    public final int hashCode() {
        int hashCode = (1588755158 + com.google.android.gms.internal.wearable.zzr.hashCode(this.zzfy)) * 31;
        com.google.android.gms.internal.wearable.zzp zzpVar = this.zzhc;
        return hashCode + ((zzpVar == null || zzpVar.isEmpty()) ? 0 : this.zzhc.hashCode());
    }

    @Override // com.google.android.gms.internal.wearable.zzn, com.google.android.gms.internal.wearable.zzt
    public final int zzg() {
        int zzg = super.zzg();
        com.google.android.gms.internal.wearable.zzh[] zzhVarArr = this.zzfy;
        if (zzhVarArr != null && zzhVarArr.length > 0) {
            int i17 = 0;
            while (true) {
                com.google.android.gms.internal.wearable.zzh[] zzhVarArr2 = this.zzfy;
                if (i17 >= zzhVarArr2.length) {
                    break;
                }
                com.google.android.gms.internal.wearable.zzh zzhVar = zzhVarArr2[i17];
                if (zzhVar != null) {
                    zzg += com.google.android.gms.internal.wearable.zzl.zzb(1, zzhVar);
                }
                i17++;
            }
        }
        return zzg;
    }

    @Override // com.google.android.gms.internal.wearable.zzt
    public final /* synthetic */ com.google.android.gms.internal.wearable.zzt zza(com.google.android.gms.internal.wearable.zzk zzkVar) {
        while (true) {
            int zzj = zzkVar.zzj();
            if (zzj == 0) {
                return this;
            }
            if (zzj == 10) {
                int zzb = com.google.android.gms.internal.wearable.zzw.zzb(zzkVar, 10);
                com.google.android.gms.internal.wearable.zzh[] zzhVarArr = this.zzfy;
                int length = zzhVarArr == null ? 0 : zzhVarArr.length;
                int i17 = zzb + length;
                com.google.android.gms.internal.wearable.zzh[] zzhVarArr2 = new com.google.android.gms.internal.wearable.zzh[i17];
                if (length != 0) {
                    java.lang.System.arraycopy(zzhVarArr, 0, zzhVarArr2, 0, length);
                }
                while (length < i17 - 1) {
                    com.google.android.gms.internal.wearable.zzh zzhVar = new com.google.android.gms.internal.wearable.zzh();
                    zzhVarArr2[length] = zzhVar;
                    zzkVar.zza(zzhVar);
                    zzkVar.zzj();
                    length++;
                }
                com.google.android.gms.internal.wearable.zzh zzhVar2 = new com.google.android.gms.internal.wearable.zzh();
                zzhVarArr2[length] = zzhVar2;
                zzkVar.zza(zzhVar2);
                this.zzfy = zzhVarArr2;
            } else if (!super.zza(zzkVar, zzj)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.wearable.zzn, com.google.android.gms.internal.wearable.zzt
    public final void zza(com.google.android.gms.internal.wearable.zzl zzlVar) {
        com.google.android.gms.internal.wearable.zzh[] zzhVarArr = this.zzfy;
        if (zzhVarArr != null && zzhVarArr.length > 0) {
            int i17 = 0;
            while (true) {
                com.google.android.gms.internal.wearable.zzh[] zzhVarArr2 = this.zzfy;
                if (i17 >= zzhVarArr2.length) {
                    break;
                }
                com.google.android.gms.internal.wearable.zzh zzhVar = zzhVarArr2[i17];
                if (zzhVar != null) {
                    zzlVar.zza(1, zzhVar);
                }
                i17++;
            }
        }
        super.zza(zzlVar);
    }
}

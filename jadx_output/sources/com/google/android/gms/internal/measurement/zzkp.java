package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zzkp extends com.google.android.gms.internal.measurement.zzaby<com.google.android.gms.internal.measurement.zzkp> {
    public com.google.android.gms.internal.measurement.zzkq[] zzatf = com.google.android.gms.internal.measurement.zzkq.zzln();

    public zzkp() {
        this.zzbww = null;
        this.zzbxh = -1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzkp)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzkp zzkpVar = (com.google.android.gms.internal.measurement.zzkp) obj;
        if (!com.google.android.gms.internal.measurement.zzacc.equals(this.zzatf, zzkpVar.zzatf)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzaca zzacaVar = this.zzbww;
        if (zzacaVar != null && !zzacaVar.isEmpty()) {
            return this.zzbww.equals(zzkpVar.zzbww);
        }
        com.google.android.gms.internal.measurement.zzaca zzacaVar2 = zzkpVar.zzbww;
        return zzacaVar2 == null || zzacaVar2.isEmpty();
    }

    public final int hashCode() {
        int hashCode = ((-1033079951) + com.google.android.gms.internal.measurement.zzacc.hashCode(this.zzatf)) * 31;
        com.google.android.gms.internal.measurement.zzaca zzacaVar = this.zzbww;
        return hashCode + ((zzacaVar == null || zzacaVar.isEmpty()) ? 0 : this.zzbww.hashCode());
    }

    @Override // com.google.android.gms.internal.measurement.zzaby, com.google.android.gms.internal.measurement.zzace
    public final int zza() {
        int zza = super.zza();
        com.google.android.gms.internal.measurement.zzkq[] zzkqVarArr = this.zzatf;
        if (zzkqVarArr != null && zzkqVarArr.length > 0) {
            int i17 = 0;
            while (true) {
                com.google.android.gms.internal.measurement.zzkq[] zzkqVarArr2 = this.zzatf;
                if (i17 >= zzkqVarArr2.length) {
                    break;
                }
                com.google.android.gms.internal.measurement.zzkq zzkqVar = zzkqVarArr2[i17];
                if (zzkqVar != null) {
                    zza += com.google.android.gms.internal.measurement.zzabw.zzb(1, zzkqVar);
                }
                i17++;
            }
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzace
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzace zzb(com.google.android.gms.internal.measurement.zzabv zzabvVar) {
        while (true) {
            int zzuw = zzabvVar.zzuw();
            if (zzuw == 0) {
                return this;
            }
            if (zzuw == 10) {
                int zzb = com.google.android.gms.internal.measurement.zzach.zzb(zzabvVar, 10);
                com.google.android.gms.internal.measurement.zzkq[] zzkqVarArr = this.zzatf;
                int length = zzkqVarArr == null ? 0 : zzkqVarArr.length;
                int i17 = zzb + length;
                com.google.android.gms.internal.measurement.zzkq[] zzkqVarArr2 = new com.google.android.gms.internal.measurement.zzkq[i17];
                if (length != 0) {
                    java.lang.System.arraycopy(zzkqVarArr, 0, zzkqVarArr2, 0, length);
                }
                while (length < i17 - 1) {
                    com.google.android.gms.internal.measurement.zzkq zzkqVar = new com.google.android.gms.internal.measurement.zzkq();
                    zzkqVarArr2[length] = zzkqVar;
                    zzabvVar.zza(zzkqVar);
                    zzabvVar.zzuw();
                    length++;
                }
                com.google.android.gms.internal.measurement.zzkq zzkqVar2 = new com.google.android.gms.internal.measurement.zzkq();
                zzkqVarArr2[length] = zzkqVar2;
                zzabvVar.zza(zzkqVar2);
                this.zzatf = zzkqVarArr2;
            } else if (!super.zza(zzabvVar, zzuw)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaby, com.google.android.gms.internal.measurement.zzace
    public final void zza(com.google.android.gms.internal.measurement.zzabw zzabwVar) {
        com.google.android.gms.internal.measurement.zzkq[] zzkqVarArr = this.zzatf;
        if (zzkqVarArr != null && zzkqVarArr.length > 0) {
            int i17 = 0;
            while (true) {
                com.google.android.gms.internal.measurement.zzkq[] zzkqVarArr2 = this.zzatf;
                if (i17 >= zzkqVarArr2.length) {
                    break;
                }
                com.google.android.gms.internal.measurement.zzkq zzkqVar = zzkqVarArr2[i17];
                if (zzkqVar != null) {
                    zzabwVar.zza(1, zzkqVar);
                }
                i17++;
            }
        }
        super.zza(zzabwVar);
    }
}

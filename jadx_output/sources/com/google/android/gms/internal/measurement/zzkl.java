package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zzkl extends com.google.android.gms.internal.measurement.zzaby<com.google.android.gms.internal.measurement.zzkl> {
    private static volatile com.google.android.gms.internal.measurement.zzkl[] zzasu;
    public java.lang.String zzny = null;
    public java.lang.String value = null;

    public zzkl() {
        this.zzbww = null;
        this.zzbxh = -1;
    }

    public static com.google.android.gms.internal.measurement.zzkl[] zzlj() {
        if (zzasu == null) {
            synchronized (com.google.android.gms.internal.measurement.zzacc.zzbxg) {
                if (zzasu == null) {
                    zzasu = new com.google.android.gms.internal.measurement.zzkl[0];
                }
            }
        }
        return zzasu;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzkl)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzkl zzklVar = (com.google.android.gms.internal.measurement.zzkl) obj;
        java.lang.String str = this.zzny;
        if (str == null) {
            if (zzklVar.zzny != null) {
                return false;
            }
        } else if (!str.equals(zzklVar.zzny)) {
            return false;
        }
        java.lang.String str2 = this.value;
        if (str2 == null) {
            if (zzklVar.value != null) {
                return false;
            }
        } else if (!str2.equals(zzklVar.value)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzaca zzacaVar = this.zzbww;
        if (zzacaVar != null && !zzacaVar.isEmpty()) {
            return this.zzbww.equals(zzklVar.zzbww);
        }
        com.google.android.gms.internal.measurement.zzaca zzacaVar2 = zzklVar.zzbww;
        return zzacaVar2 == null || zzacaVar2.isEmpty();
    }

    public final int hashCode() {
        java.lang.String str = this.zzny;
        int i17 = 0;
        int hashCode = ((-1033080075) + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.value;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        com.google.android.gms.internal.measurement.zzaca zzacaVar = this.zzbww;
        if (zzacaVar != null && !zzacaVar.isEmpty()) {
            i17 = this.zzbww.hashCode();
        }
        return hashCode2 + i17;
    }

    @Override // com.google.android.gms.internal.measurement.zzaby, com.google.android.gms.internal.measurement.zzace
    public final int zza() {
        int zza = super.zza();
        java.lang.String str = this.zzny;
        if (str != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzc(1, str);
        }
        java.lang.String str2 = this.value;
        return str2 != null ? zza + com.google.android.gms.internal.measurement.zzabw.zzc(2, str2) : zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzace
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzace zzb(com.google.android.gms.internal.measurement.zzabv zzabvVar) {
        while (true) {
            int zzuw = zzabvVar.zzuw();
            if (zzuw == 0) {
                return this;
            }
            if (zzuw == 10) {
                this.zzny = zzabvVar.readString();
            } else if (zzuw == 18) {
                this.value = zzabvVar.readString();
            } else if (!super.zza(zzabvVar, zzuw)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaby, com.google.android.gms.internal.measurement.zzace
    public final void zza(com.google.android.gms.internal.measurement.zzabw zzabwVar) {
        java.lang.String str = this.zzny;
        if (str != null) {
            zzabwVar.zzb(1, str);
        }
        java.lang.String str2 = this.value;
        if (str2 != null) {
            zzabwVar.zzb(2, str2);
        }
        super.zza(zzabwVar);
    }
}

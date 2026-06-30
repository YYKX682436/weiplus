package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zzkh extends com.google.android.gms.internal.measurement.zzaby<com.google.android.gms.internal.measurement.zzkh> {
    private static volatile com.google.android.gms.internal.measurement.zzkh[] zzase;
    public java.lang.Integer zzarp = null;
    public java.lang.String zzasf = null;
    public com.google.android.gms.internal.measurement.zzkf zzasg = null;

    public zzkh() {
        this.zzbww = null;
        this.zzbxh = -1;
    }

    public static com.google.android.gms.internal.measurement.zzkh[] zzlh() {
        if (zzase == null) {
            synchronized (com.google.android.gms.internal.measurement.zzacc.zzbxg) {
                if (zzase == null) {
                    zzase = new com.google.android.gms.internal.measurement.zzkh[0];
                }
            }
        }
        return zzase;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzkh)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzkh zzkhVar = (com.google.android.gms.internal.measurement.zzkh) obj;
        java.lang.Integer num = this.zzarp;
        if (num == null) {
            if (zzkhVar.zzarp != null) {
                return false;
            }
        } else if (!num.equals(zzkhVar.zzarp)) {
            return false;
        }
        java.lang.String str = this.zzasf;
        if (str == null) {
            if (zzkhVar.zzasf != null) {
                return false;
            }
        } else if (!str.equals(zzkhVar.zzasf)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzkf zzkfVar = this.zzasg;
        if (zzkfVar == null) {
            if (zzkhVar.zzasg != null) {
                return false;
            }
        } else if (!zzkfVar.equals(zzkhVar.zzasg)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzaca zzacaVar = this.zzbww;
        if (zzacaVar != null && !zzacaVar.isEmpty()) {
            return this.zzbww.equals(zzkhVar.zzbww);
        }
        com.google.android.gms.internal.measurement.zzaca zzacaVar2 = zzkhVar.zzbww;
        return zzacaVar2 == null || zzacaVar2.isEmpty();
    }

    public final int hashCode() {
        java.lang.Integer num = this.zzarp;
        int i17 = 0;
        int hashCode = ((-1033080199) + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.String str = this.zzasf;
        int hashCode2 = hashCode + (str == null ? 0 : str.hashCode());
        com.google.android.gms.internal.measurement.zzkf zzkfVar = this.zzasg;
        int hashCode3 = ((hashCode2 * 31) + (zzkfVar == null ? 0 : zzkfVar.hashCode())) * 31;
        com.google.android.gms.internal.measurement.zzaca zzacaVar = this.zzbww;
        if (zzacaVar != null && !zzacaVar.isEmpty()) {
            i17 = this.zzbww.hashCode();
        }
        return hashCode3 + i17;
    }

    @Override // com.google.android.gms.internal.measurement.zzaby, com.google.android.gms.internal.measurement.zzace
    public final int zza() {
        int zza = super.zza();
        java.lang.Integer num = this.zzarp;
        if (num != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzf(1, num.intValue());
        }
        java.lang.String str = this.zzasf;
        if (str != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzc(2, str);
        }
        com.google.android.gms.internal.measurement.zzkf zzkfVar = this.zzasg;
        return zzkfVar != null ? zza + com.google.android.gms.internal.measurement.zzabw.zzb(3, zzkfVar) : zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzace
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzace zzb(com.google.android.gms.internal.measurement.zzabv zzabvVar) {
        while (true) {
            int zzuw = zzabvVar.zzuw();
            if (zzuw == 0) {
                return this;
            }
            if (zzuw == 8) {
                this.zzarp = java.lang.Integer.valueOf(zzabvVar.zzuy());
            } else if (zzuw == 18) {
                this.zzasf = zzabvVar.readString();
            } else if (zzuw == 26) {
                if (this.zzasg == null) {
                    this.zzasg = new com.google.android.gms.internal.measurement.zzkf();
                }
                zzabvVar.zza(this.zzasg);
            } else if (!super.zza(zzabvVar, zzuw)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaby, com.google.android.gms.internal.measurement.zzace
    public final void zza(com.google.android.gms.internal.measurement.zzabw zzabwVar) {
        java.lang.Integer num = this.zzarp;
        if (num != null) {
            zzabwVar.zze(1, num.intValue());
        }
        java.lang.String str = this.zzasf;
        if (str != null) {
            zzabwVar.zzb(2, str);
        }
        com.google.android.gms.internal.measurement.zzkf zzkfVar = this.zzasg;
        if (zzkfVar != null) {
            zzabwVar.zza(3, zzkfVar);
        }
        super.zza(zzabwVar);
    }
}

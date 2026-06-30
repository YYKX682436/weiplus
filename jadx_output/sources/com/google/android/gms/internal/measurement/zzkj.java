package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zzkj extends com.google.android.gms.internal.measurement.zzaby<com.google.android.gms.internal.measurement.zzkj> {
    private static volatile com.google.android.gms.internal.measurement.zzkj[] zzasl;
    public java.lang.String name = null;
    public java.lang.Boolean zzasm = null;
    public java.lang.Boolean zzasn = null;
    public java.lang.Integer zzaso = null;

    public zzkj() {
        this.zzbww = null;
        this.zzbxh = -1;
    }

    public static com.google.android.gms.internal.measurement.zzkj[] zzli() {
        if (zzasl == null) {
            synchronized (com.google.android.gms.internal.measurement.zzacc.zzbxg) {
                if (zzasl == null) {
                    zzasl = new com.google.android.gms.internal.measurement.zzkj[0];
                }
            }
        }
        return zzasl;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzkj)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzkj zzkjVar = (com.google.android.gms.internal.measurement.zzkj) obj;
        java.lang.String str = this.name;
        if (str == null) {
            if (zzkjVar.name != null) {
                return false;
            }
        } else if (!str.equals(zzkjVar.name)) {
            return false;
        }
        java.lang.Boolean bool = this.zzasm;
        if (bool == null) {
            if (zzkjVar.zzasm != null) {
                return false;
            }
        } else if (!bool.equals(zzkjVar.zzasm)) {
            return false;
        }
        java.lang.Boolean bool2 = this.zzasn;
        if (bool2 == null) {
            if (zzkjVar.zzasn != null) {
                return false;
            }
        } else if (!bool2.equals(zzkjVar.zzasn)) {
            return false;
        }
        java.lang.Integer num = this.zzaso;
        if (num == null) {
            if (zzkjVar.zzaso != null) {
                return false;
            }
        } else if (!num.equals(zzkjVar.zzaso)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzaca zzacaVar = this.zzbww;
        if (zzacaVar != null && !zzacaVar.isEmpty()) {
            return this.zzbww.equals(zzkjVar.zzbww);
        }
        com.google.android.gms.internal.measurement.zzaca zzacaVar2 = zzkjVar.zzbww;
        return zzacaVar2 == null || zzacaVar2.isEmpty();
    }

    public final int hashCode() {
        java.lang.String str = this.name;
        int i17 = 0;
        int hashCode = ((-1033080137) + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Boolean bool = this.zzasm;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        java.lang.Boolean bool2 = this.zzasn;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        java.lang.Integer num = this.zzaso;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        com.google.android.gms.internal.measurement.zzaca zzacaVar = this.zzbww;
        if (zzacaVar != null && !zzacaVar.isEmpty()) {
            i17 = this.zzbww.hashCode();
        }
        return hashCode4 + i17;
    }

    @Override // com.google.android.gms.internal.measurement.zzaby, com.google.android.gms.internal.measurement.zzace
    public final int zza() {
        int zza = super.zza();
        java.lang.String str = this.name;
        if (str != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzc(1, str);
        }
        java.lang.Boolean bool = this.zzasm;
        if (bool != null) {
            bool.booleanValue();
            zza += com.google.android.gms.internal.measurement.zzabw.zzaq(2) + 1;
        }
        java.lang.Boolean bool2 = this.zzasn;
        if (bool2 != null) {
            bool2.booleanValue();
            zza += com.google.android.gms.internal.measurement.zzabw.zzaq(3) + 1;
        }
        java.lang.Integer num = this.zzaso;
        return num != null ? zza + com.google.android.gms.internal.measurement.zzabw.zzf(4, num.intValue()) : zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzace
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzace zzb(com.google.android.gms.internal.measurement.zzabv zzabvVar) {
        while (true) {
            int zzuw = zzabvVar.zzuw();
            if (zzuw == 0) {
                return this;
            }
            if (zzuw == 10) {
                this.name = zzabvVar.readString();
            } else if (zzuw == 16) {
                this.zzasm = java.lang.Boolean.valueOf(zzabvVar.zzux());
            } else if (zzuw == 24) {
                this.zzasn = java.lang.Boolean.valueOf(zzabvVar.zzux());
            } else if (zzuw == 32) {
                this.zzaso = java.lang.Integer.valueOf(zzabvVar.zzuy());
            } else if (!super.zza(zzabvVar, zzuw)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaby, com.google.android.gms.internal.measurement.zzace
    public final void zza(com.google.android.gms.internal.measurement.zzabw zzabwVar) {
        java.lang.String str = this.name;
        if (str != null) {
            zzabwVar.zzb(1, str);
        }
        java.lang.Boolean bool = this.zzasm;
        if (bool != null) {
            zzabwVar.zza(2, bool.booleanValue());
        }
        java.lang.Boolean bool2 = this.zzasn;
        if (bool2 != null) {
            zzabwVar.zza(3, bool2.booleanValue());
        }
        java.lang.Integer num = this.zzaso;
        if (num != null) {
            zzabwVar.zze(4, num.intValue());
        }
        super.zza(zzabwVar);
    }
}

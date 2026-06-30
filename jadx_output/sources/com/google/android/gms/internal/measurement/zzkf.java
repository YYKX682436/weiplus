package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zzkf extends com.google.android.gms.internal.measurement.zzaby<com.google.android.gms.internal.measurement.zzkf> {
    private static volatile com.google.android.gms.internal.measurement.zzkf[] zzaru;
    public com.google.android.gms.internal.measurement.zzki zzarv = null;
    public com.google.android.gms.internal.measurement.zzkg zzarw = null;
    public java.lang.Boolean zzarx = null;
    public java.lang.String zzary = null;

    public zzkf() {
        this.zzbww = null;
        this.zzbxh = -1;
    }

    public static com.google.android.gms.internal.measurement.zzkf[] zzlg() {
        if (zzaru == null) {
            synchronized (com.google.android.gms.internal.measurement.zzacc.zzbxg) {
                if (zzaru == null) {
                    zzaru = new com.google.android.gms.internal.measurement.zzkf[0];
                }
            }
        }
        return zzaru;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzkf)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzkf zzkfVar = (com.google.android.gms.internal.measurement.zzkf) obj;
        com.google.android.gms.internal.measurement.zzki zzkiVar = this.zzarv;
        if (zzkiVar == null) {
            if (zzkfVar.zzarv != null) {
                return false;
            }
        } else if (!zzkiVar.equals(zzkfVar.zzarv)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzkg zzkgVar = this.zzarw;
        if (zzkgVar == null) {
            if (zzkfVar.zzarw != null) {
                return false;
            }
        } else if (!zzkgVar.equals(zzkfVar.zzarw)) {
            return false;
        }
        java.lang.Boolean bool = this.zzarx;
        if (bool == null) {
            if (zzkfVar.zzarx != null) {
                return false;
            }
        } else if (!bool.equals(zzkfVar.zzarx)) {
            return false;
        }
        java.lang.String str = this.zzary;
        if (str == null) {
            if (zzkfVar.zzary != null) {
                return false;
            }
        } else if (!str.equals(zzkfVar.zzary)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzaca zzacaVar = this.zzbww;
        if (zzacaVar != null && !zzacaVar.isEmpty()) {
            return this.zzbww.equals(zzkfVar.zzbww);
        }
        com.google.android.gms.internal.measurement.zzaca zzacaVar2 = zzkfVar.zzbww;
        return zzacaVar2 == null || zzacaVar2.isEmpty();
    }

    public final int hashCode() {
        com.google.android.gms.internal.measurement.zzki zzkiVar = this.zzarv;
        int i17 = 0;
        int hashCode = (-1033080261) + (zzkiVar == null ? 0 : zzkiVar.hashCode());
        com.google.android.gms.internal.measurement.zzkg zzkgVar = this.zzarw;
        int hashCode2 = ((hashCode * 31) + (zzkgVar == null ? 0 : zzkgVar.hashCode())) * 31;
        java.lang.Boolean bool = this.zzarx;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        java.lang.String str = this.zzary;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        com.google.android.gms.internal.measurement.zzaca zzacaVar = this.zzbww;
        if (zzacaVar != null && !zzacaVar.isEmpty()) {
            i17 = this.zzbww.hashCode();
        }
        return hashCode4 + i17;
    }

    @Override // com.google.android.gms.internal.measurement.zzaby, com.google.android.gms.internal.measurement.zzace
    public final int zza() {
        int zza = super.zza();
        com.google.android.gms.internal.measurement.zzki zzkiVar = this.zzarv;
        if (zzkiVar != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzb(1, zzkiVar);
        }
        com.google.android.gms.internal.measurement.zzkg zzkgVar = this.zzarw;
        if (zzkgVar != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzb(2, zzkgVar);
        }
        java.lang.Boolean bool = this.zzarx;
        if (bool != null) {
            bool.booleanValue();
            zza += com.google.android.gms.internal.measurement.zzabw.zzaq(3) + 1;
        }
        java.lang.String str = this.zzary;
        return str != null ? zza + com.google.android.gms.internal.measurement.zzabw.zzc(4, str) : zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzace
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzace zzb(com.google.android.gms.internal.measurement.zzabv zzabvVar) {
        com.google.android.gms.internal.measurement.zzace zzaceVar;
        while (true) {
            int zzuw = zzabvVar.zzuw();
            if (zzuw == 0) {
                return this;
            }
            if (zzuw == 10) {
                if (this.zzarv == null) {
                    this.zzarv = new com.google.android.gms.internal.measurement.zzki();
                }
                zzaceVar = this.zzarv;
            } else if (zzuw == 18) {
                if (this.zzarw == null) {
                    this.zzarw = new com.google.android.gms.internal.measurement.zzkg();
                }
                zzaceVar = this.zzarw;
            } else if (zzuw == 24) {
                this.zzarx = java.lang.Boolean.valueOf(zzabvVar.zzux());
            } else if (zzuw == 34) {
                this.zzary = zzabvVar.readString();
            } else if (!super.zza(zzabvVar, zzuw)) {
                return this;
            }
            zzabvVar.zza(zzaceVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaby, com.google.android.gms.internal.measurement.zzace
    public final void zza(com.google.android.gms.internal.measurement.zzabw zzabwVar) {
        com.google.android.gms.internal.measurement.zzki zzkiVar = this.zzarv;
        if (zzkiVar != null) {
            zzabwVar.zza(1, zzkiVar);
        }
        com.google.android.gms.internal.measurement.zzkg zzkgVar = this.zzarw;
        if (zzkgVar != null) {
            zzabwVar.zza(2, zzkgVar);
        }
        java.lang.Boolean bool = this.zzarx;
        if (bool != null) {
            zzabwVar.zza(3, bool.booleanValue());
        }
        java.lang.String str = this.zzary;
        if (str != null) {
            zzabwVar.zzb(4, str);
        }
        super.zza(zzabwVar);
    }
}

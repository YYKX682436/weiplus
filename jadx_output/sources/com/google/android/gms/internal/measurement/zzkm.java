package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zzkm extends com.google.android.gms.internal.measurement.zzaby<com.google.android.gms.internal.measurement.zzkm> {
    private static volatile com.google.android.gms.internal.measurement.zzkm[] zzasv;
    public java.lang.Integer zzarl = null;
    public com.google.android.gms.internal.measurement.zzkr zzasw = null;
    public com.google.android.gms.internal.measurement.zzkr zzasx = null;
    public java.lang.Boolean zzasy = null;

    public zzkm() {
        this.zzbww = null;
        this.zzbxh = -1;
    }

    public static com.google.android.gms.internal.measurement.zzkm[] zzlk() {
        if (zzasv == null) {
            synchronized (com.google.android.gms.internal.measurement.zzacc.zzbxg) {
                if (zzasv == null) {
                    zzasv = new com.google.android.gms.internal.measurement.zzkm[0];
                }
            }
        }
        return zzasv;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzkm)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzkm zzkmVar = (com.google.android.gms.internal.measurement.zzkm) obj;
        java.lang.Integer num = this.zzarl;
        if (num == null) {
            if (zzkmVar.zzarl != null) {
                return false;
            }
        } else if (!num.equals(zzkmVar.zzarl)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzkr zzkrVar = this.zzasw;
        if (zzkrVar == null) {
            if (zzkmVar.zzasw != null) {
                return false;
            }
        } else if (!zzkrVar.equals(zzkmVar.zzasw)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzkr zzkrVar2 = this.zzasx;
        if (zzkrVar2 == null) {
            if (zzkmVar.zzasx != null) {
                return false;
            }
        } else if (!zzkrVar2.equals(zzkmVar.zzasx)) {
            return false;
        }
        java.lang.Boolean bool = this.zzasy;
        if (bool == null) {
            if (zzkmVar.zzasy != null) {
                return false;
            }
        } else if (!bool.equals(zzkmVar.zzasy)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzaca zzacaVar = this.zzbww;
        if (zzacaVar != null && !zzacaVar.isEmpty()) {
            return this.zzbww.equals(zzkmVar.zzbww);
        }
        com.google.android.gms.internal.measurement.zzaca zzacaVar2 = zzkmVar.zzbww;
        return zzacaVar2 == null || zzacaVar2.isEmpty();
    }

    public final int hashCode() {
        java.lang.Integer num = this.zzarl;
        int i17 = 0;
        int hashCode = (-1033080044) + (num == null ? 0 : num.hashCode());
        com.google.android.gms.internal.measurement.zzkr zzkrVar = this.zzasw;
        int hashCode2 = (hashCode * 31) + (zzkrVar == null ? 0 : zzkrVar.hashCode());
        com.google.android.gms.internal.measurement.zzkr zzkrVar2 = this.zzasx;
        int hashCode3 = ((hashCode2 * 31) + (zzkrVar2 == null ? 0 : zzkrVar2.hashCode())) * 31;
        java.lang.Boolean bool = this.zzasy;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        com.google.android.gms.internal.measurement.zzaca zzacaVar = this.zzbww;
        if (zzacaVar != null && !zzacaVar.isEmpty()) {
            i17 = this.zzbww.hashCode();
        }
        return hashCode4 + i17;
    }

    @Override // com.google.android.gms.internal.measurement.zzaby, com.google.android.gms.internal.measurement.zzace
    public final int zza() {
        int zza = super.zza();
        java.lang.Integer num = this.zzarl;
        if (num != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzf(1, num.intValue());
        }
        com.google.android.gms.internal.measurement.zzkr zzkrVar = this.zzasw;
        if (zzkrVar != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzb(2, zzkrVar);
        }
        com.google.android.gms.internal.measurement.zzkr zzkrVar2 = this.zzasx;
        if (zzkrVar2 != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzb(3, zzkrVar2);
        }
        java.lang.Boolean bool = this.zzasy;
        if (bool == null) {
            return zza;
        }
        bool.booleanValue();
        return zza + com.google.android.gms.internal.measurement.zzabw.zzaq(4) + 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzace
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzace zzb(com.google.android.gms.internal.measurement.zzabv zzabvVar) {
        com.google.android.gms.internal.measurement.zzkr zzkrVar;
        while (true) {
            int zzuw = zzabvVar.zzuw();
            if (zzuw == 0) {
                return this;
            }
            if (zzuw != 8) {
                if (zzuw == 18) {
                    if (this.zzasw == null) {
                        this.zzasw = new com.google.android.gms.internal.measurement.zzkr();
                    }
                    zzkrVar = this.zzasw;
                } else if (zzuw == 26) {
                    if (this.zzasx == null) {
                        this.zzasx = new com.google.android.gms.internal.measurement.zzkr();
                    }
                    zzkrVar = this.zzasx;
                } else if (zzuw == 32) {
                    this.zzasy = java.lang.Boolean.valueOf(zzabvVar.zzux());
                } else if (!super.zza(zzabvVar, zzuw)) {
                    return this;
                }
                zzabvVar.zza(zzkrVar);
            } else {
                this.zzarl = java.lang.Integer.valueOf(zzabvVar.zzuy());
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaby, com.google.android.gms.internal.measurement.zzace
    public final void zza(com.google.android.gms.internal.measurement.zzabw zzabwVar) {
        java.lang.Integer num = this.zzarl;
        if (num != null) {
            zzabwVar.zze(1, num.intValue());
        }
        com.google.android.gms.internal.measurement.zzkr zzkrVar = this.zzasw;
        if (zzkrVar != null) {
            zzabwVar.zza(2, zzkrVar);
        }
        com.google.android.gms.internal.measurement.zzkr zzkrVar2 = this.zzasx;
        if (zzkrVar2 != null) {
            zzabwVar.zza(3, zzkrVar2);
        }
        java.lang.Boolean bool = this.zzasy;
        if (bool != null) {
            zzabwVar.zza(4, bool.booleanValue());
        }
        super.zza(zzabwVar);
    }
}

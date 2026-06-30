package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zzke extends com.google.android.gms.internal.measurement.zzaby<com.google.android.gms.internal.measurement.zzke> {
    private static volatile com.google.android.gms.internal.measurement.zzke[] zzaro;
    public java.lang.Integer zzarp = null;
    public java.lang.String zzarq = null;
    public com.google.android.gms.internal.measurement.zzkf[] zzarr = com.google.android.gms.internal.measurement.zzkf.zzlg();
    private java.lang.Boolean zzars = null;
    public com.google.android.gms.internal.measurement.zzkg zzart = null;

    public zzke() {
        this.zzbww = null;
        this.zzbxh = -1;
    }

    public static com.google.android.gms.internal.measurement.zzke[] zzlf() {
        if (zzaro == null) {
            synchronized (com.google.android.gms.internal.measurement.zzacc.zzbxg) {
                if (zzaro == null) {
                    zzaro = new com.google.android.gms.internal.measurement.zzke[0];
                }
            }
        }
        return zzaro;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzke)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzke zzkeVar = (com.google.android.gms.internal.measurement.zzke) obj;
        java.lang.Integer num = this.zzarp;
        if (num == null) {
            if (zzkeVar.zzarp != null) {
                return false;
            }
        } else if (!num.equals(zzkeVar.zzarp)) {
            return false;
        }
        java.lang.String str = this.zzarq;
        if (str == null) {
            if (zzkeVar.zzarq != null) {
                return false;
            }
        } else if (!str.equals(zzkeVar.zzarq)) {
            return false;
        }
        if (!com.google.android.gms.internal.measurement.zzacc.equals(this.zzarr, zzkeVar.zzarr)) {
            return false;
        }
        java.lang.Boolean bool = this.zzars;
        if (bool == null) {
            if (zzkeVar.zzars != null) {
                return false;
            }
        } else if (!bool.equals(zzkeVar.zzars)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzkg zzkgVar = this.zzart;
        if (zzkgVar == null) {
            if (zzkeVar.zzart != null) {
                return false;
            }
        } else if (!zzkgVar.equals(zzkeVar.zzart)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzaca zzacaVar = this.zzbww;
        if (zzacaVar != null && !zzacaVar.isEmpty()) {
            return this.zzbww.equals(zzkeVar.zzbww);
        }
        com.google.android.gms.internal.measurement.zzaca zzacaVar2 = zzkeVar.zzbww;
        return zzacaVar2 == null || zzacaVar2.isEmpty();
    }

    public final int hashCode() {
        java.lang.Integer num = this.zzarp;
        int i17 = 0;
        int hashCode = ((-1033080292) + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.String str = this.zzarq;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + com.google.android.gms.internal.measurement.zzacc.hashCode(this.zzarr)) * 31;
        java.lang.Boolean bool = this.zzars;
        int hashCode3 = hashCode2 + (bool == null ? 0 : bool.hashCode());
        com.google.android.gms.internal.measurement.zzkg zzkgVar = this.zzart;
        int hashCode4 = ((hashCode3 * 31) + (zzkgVar == null ? 0 : zzkgVar.hashCode())) * 31;
        com.google.android.gms.internal.measurement.zzaca zzacaVar = this.zzbww;
        if (zzacaVar != null && !zzacaVar.isEmpty()) {
            i17 = this.zzbww.hashCode();
        }
        return hashCode4 + i17;
    }

    @Override // com.google.android.gms.internal.measurement.zzaby, com.google.android.gms.internal.measurement.zzace
    public final int zza() {
        int zza = super.zza();
        java.lang.Integer num = this.zzarp;
        if (num != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzf(1, num.intValue());
        }
        java.lang.String str = this.zzarq;
        if (str != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzc(2, str);
        }
        com.google.android.gms.internal.measurement.zzkf[] zzkfVarArr = this.zzarr;
        if (zzkfVarArr != null && zzkfVarArr.length > 0) {
            int i17 = 0;
            while (true) {
                com.google.android.gms.internal.measurement.zzkf[] zzkfVarArr2 = this.zzarr;
                if (i17 >= zzkfVarArr2.length) {
                    break;
                }
                com.google.android.gms.internal.measurement.zzkf zzkfVar = zzkfVarArr2[i17];
                if (zzkfVar != null) {
                    zza += com.google.android.gms.internal.measurement.zzabw.zzb(3, zzkfVar);
                }
                i17++;
            }
        }
        java.lang.Boolean bool = this.zzars;
        if (bool != null) {
            bool.booleanValue();
            zza += com.google.android.gms.internal.measurement.zzabw.zzaq(4) + 1;
        }
        com.google.android.gms.internal.measurement.zzkg zzkgVar = this.zzart;
        return zzkgVar != null ? zza + com.google.android.gms.internal.measurement.zzabw.zzb(5, zzkgVar) : zza;
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
                this.zzarq = zzabvVar.readString();
            } else if (zzuw == 26) {
                int zzb = com.google.android.gms.internal.measurement.zzach.zzb(zzabvVar, 26);
                com.google.android.gms.internal.measurement.zzkf[] zzkfVarArr = this.zzarr;
                int length = zzkfVarArr == null ? 0 : zzkfVarArr.length;
                int i17 = zzb + length;
                com.google.android.gms.internal.measurement.zzkf[] zzkfVarArr2 = new com.google.android.gms.internal.measurement.zzkf[i17];
                if (length != 0) {
                    java.lang.System.arraycopy(zzkfVarArr, 0, zzkfVarArr2, 0, length);
                }
                while (length < i17 - 1) {
                    com.google.android.gms.internal.measurement.zzkf zzkfVar = new com.google.android.gms.internal.measurement.zzkf();
                    zzkfVarArr2[length] = zzkfVar;
                    zzabvVar.zza(zzkfVar);
                    zzabvVar.zzuw();
                    length++;
                }
                com.google.android.gms.internal.measurement.zzkf zzkfVar2 = new com.google.android.gms.internal.measurement.zzkf();
                zzkfVarArr2[length] = zzkfVar2;
                zzabvVar.zza(zzkfVar2);
                this.zzarr = zzkfVarArr2;
            } else if (zzuw == 32) {
                this.zzars = java.lang.Boolean.valueOf(zzabvVar.zzux());
            } else if (zzuw == 42) {
                if (this.zzart == null) {
                    this.zzart = new com.google.android.gms.internal.measurement.zzkg();
                }
                zzabvVar.zza(this.zzart);
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
        java.lang.String str = this.zzarq;
        if (str != null) {
            zzabwVar.zzb(2, str);
        }
        com.google.android.gms.internal.measurement.zzkf[] zzkfVarArr = this.zzarr;
        if (zzkfVarArr != null && zzkfVarArr.length > 0) {
            int i17 = 0;
            while (true) {
                com.google.android.gms.internal.measurement.zzkf[] zzkfVarArr2 = this.zzarr;
                if (i17 >= zzkfVarArr2.length) {
                    break;
                }
                com.google.android.gms.internal.measurement.zzkf zzkfVar = zzkfVarArr2[i17];
                if (zzkfVar != null) {
                    zzabwVar.zza(3, zzkfVar);
                }
                i17++;
            }
        }
        java.lang.Boolean bool = this.zzars;
        if (bool != null) {
            zzabwVar.zza(4, bool.booleanValue());
        }
        com.google.android.gms.internal.measurement.zzkg zzkgVar = this.zzart;
        if (zzkgVar != null) {
            zzabwVar.zza(5, zzkgVar);
        }
        super.zza(zzabwVar);
    }
}

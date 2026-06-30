package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zzkd extends com.google.android.gms.internal.measurement.zzaby<com.google.android.gms.internal.measurement.zzkd> {
    private static volatile com.google.android.gms.internal.measurement.zzkd[] zzark;
    public java.lang.Integer zzarl = null;
    public com.google.android.gms.internal.measurement.zzkh[] zzarm = com.google.android.gms.internal.measurement.zzkh.zzlh();
    public com.google.android.gms.internal.measurement.zzke[] zzarn = com.google.android.gms.internal.measurement.zzke.zzlf();

    public zzkd() {
        this.zzbww = null;
        this.zzbxh = -1;
    }

    public static com.google.android.gms.internal.measurement.zzkd[] zzle() {
        if (zzark == null) {
            synchronized (com.google.android.gms.internal.measurement.zzacc.zzbxg) {
                if (zzark == null) {
                    zzark = new com.google.android.gms.internal.measurement.zzkd[0];
                }
            }
        }
        return zzark;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzkd)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzkd zzkdVar = (com.google.android.gms.internal.measurement.zzkd) obj;
        java.lang.Integer num = this.zzarl;
        if (num == null) {
            if (zzkdVar.zzarl != null) {
                return false;
            }
        } else if (!num.equals(zzkdVar.zzarl)) {
            return false;
        }
        if (!com.google.android.gms.internal.measurement.zzacc.equals(this.zzarm, zzkdVar.zzarm) || !com.google.android.gms.internal.measurement.zzacc.equals(this.zzarn, zzkdVar.zzarn)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzaca zzacaVar = this.zzbww;
        if (zzacaVar != null && !zzacaVar.isEmpty()) {
            return this.zzbww.equals(zzkdVar.zzbww);
        }
        com.google.android.gms.internal.measurement.zzaca zzacaVar2 = zzkdVar.zzbww;
        return zzacaVar2 == null || zzacaVar2.isEmpty();
    }

    public final int hashCode() {
        java.lang.Integer num = this.zzarl;
        int i17 = 0;
        int hashCode = ((((((-1033080323) + (num == null ? 0 : num.hashCode())) * 31) + com.google.android.gms.internal.measurement.zzacc.hashCode(this.zzarm)) * 31) + com.google.android.gms.internal.measurement.zzacc.hashCode(this.zzarn)) * 31;
        com.google.android.gms.internal.measurement.zzaca zzacaVar = this.zzbww;
        if (zzacaVar != null && !zzacaVar.isEmpty()) {
            i17 = this.zzbww.hashCode();
        }
        return hashCode + i17;
    }

    @Override // com.google.android.gms.internal.measurement.zzaby, com.google.android.gms.internal.measurement.zzace
    public final int zza() {
        int zza = super.zza();
        java.lang.Integer num = this.zzarl;
        if (num != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzf(1, num.intValue());
        }
        com.google.android.gms.internal.measurement.zzkh[] zzkhVarArr = this.zzarm;
        int i17 = 0;
        if (zzkhVarArr != null && zzkhVarArr.length > 0) {
            int i18 = 0;
            while (true) {
                com.google.android.gms.internal.measurement.zzkh[] zzkhVarArr2 = this.zzarm;
                if (i18 >= zzkhVarArr2.length) {
                    break;
                }
                com.google.android.gms.internal.measurement.zzkh zzkhVar = zzkhVarArr2[i18];
                if (zzkhVar != null) {
                    zza += com.google.android.gms.internal.measurement.zzabw.zzb(2, zzkhVar);
                }
                i18++;
            }
        }
        com.google.android.gms.internal.measurement.zzke[] zzkeVarArr = this.zzarn;
        if (zzkeVarArr != null && zzkeVarArr.length > 0) {
            while (true) {
                com.google.android.gms.internal.measurement.zzke[] zzkeVarArr2 = this.zzarn;
                if (i17 >= zzkeVarArr2.length) {
                    break;
                }
                com.google.android.gms.internal.measurement.zzke zzkeVar = zzkeVarArr2[i17];
                if (zzkeVar != null) {
                    zza += com.google.android.gms.internal.measurement.zzabw.zzb(3, zzkeVar);
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
            if (zzuw == 8) {
                this.zzarl = java.lang.Integer.valueOf(zzabvVar.zzuy());
            } else if (zzuw == 18) {
                int zzb = com.google.android.gms.internal.measurement.zzach.zzb(zzabvVar, 18);
                com.google.android.gms.internal.measurement.zzkh[] zzkhVarArr = this.zzarm;
                int length = zzkhVarArr == null ? 0 : zzkhVarArr.length;
                int i17 = zzb + length;
                com.google.android.gms.internal.measurement.zzkh[] zzkhVarArr2 = new com.google.android.gms.internal.measurement.zzkh[i17];
                if (length != 0) {
                    java.lang.System.arraycopy(zzkhVarArr, 0, zzkhVarArr2, 0, length);
                }
                while (length < i17 - 1) {
                    com.google.android.gms.internal.measurement.zzkh zzkhVar = new com.google.android.gms.internal.measurement.zzkh();
                    zzkhVarArr2[length] = zzkhVar;
                    zzabvVar.zza(zzkhVar);
                    zzabvVar.zzuw();
                    length++;
                }
                com.google.android.gms.internal.measurement.zzkh zzkhVar2 = new com.google.android.gms.internal.measurement.zzkh();
                zzkhVarArr2[length] = zzkhVar2;
                zzabvVar.zza(zzkhVar2);
                this.zzarm = zzkhVarArr2;
            } else if (zzuw == 26) {
                int zzb2 = com.google.android.gms.internal.measurement.zzach.zzb(zzabvVar, 26);
                com.google.android.gms.internal.measurement.zzke[] zzkeVarArr = this.zzarn;
                int length2 = zzkeVarArr == null ? 0 : zzkeVarArr.length;
                int i18 = zzb2 + length2;
                com.google.android.gms.internal.measurement.zzke[] zzkeVarArr2 = new com.google.android.gms.internal.measurement.zzke[i18];
                if (length2 != 0) {
                    java.lang.System.arraycopy(zzkeVarArr, 0, zzkeVarArr2, 0, length2);
                }
                while (length2 < i18 - 1) {
                    com.google.android.gms.internal.measurement.zzke zzkeVar = new com.google.android.gms.internal.measurement.zzke();
                    zzkeVarArr2[length2] = zzkeVar;
                    zzabvVar.zza(zzkeVar);
                    zzabvVar.zzuw();
                    length2++;
                }
                com.google.android.gms.internal.measurement.zzke zzkeVar2 = new com.google.android.gms.internal.measurement.zzke();
                zzkeVarArr2[length2] = zzkeVar2;
                zzabvVar.zza(zzkeVar2);
                this.zzarn = zzkeVarArr2;
            } else if (!super.zza(zzabvVar, zzuw)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaby, com.google.android.gms.internal.measurement.zzace
    public final void zza(com.google.android.gms.internal.measurement.zzabw zzabwVar) {
        java.lang.Integer num = this.zzarl;
        if (num != null) {
            zzabwVar.zze(1, num.intValue());
        }
        com.google.android.gms.internal.measurement.zzkh[] zzkhVarArr = this.zzarm;
        int i17 = 0;
        if (zzkhVarArr != null && zzkhVarArr.length > 0) {
            int i18 = 0;
            while (true) {
                com.google.android.gms.internal.measurement.zzkh[] zzkhVarArr2 = this.zzarm;
                if (i18 >= zzkhVarArr2.length) {
                    break;
                }
                com.google.android.gms.internal.measurement.zzkh zzkhVar = zzkhVarArr2[i18];
                if (zzkhVar != null) {
                    zzabwVar.zza(2, zzkhVar);
                }
                i18++;
            }
        }
        com.google.android.gms.internal.measurement.zzke[] zzkeVarArr = this.zzarn;
        if (zzkeVarArr != null && zzkeVarArr.length > 0) {
            while (true) {
                com.google.android.gms.internal.measurement.zzke[] zzkeVarArr2 = this.zzarn;
                if (i17 >= zzkeVarArr2.length) {
                    break;
                }
                com.google.android.gms.internal.measurement.zzke zzkeVar = zzkeVarArr2[i17];
                if (zzkeVar != null) {
                    zzabwVar.zza(3, zzkeVar);
                }
                i17++;
            }
        }
        super.zza(zzabwVar);
    }
}

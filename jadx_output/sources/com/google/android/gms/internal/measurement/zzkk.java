package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zzkk extends com.google.android.gms.internal.measurement.zzaby<com.google.android.gms.internal.measurement.zzkk> {
    public java.lang.Long zzasp = null;
    public java.lang.String zzadm = null;
    private java.lang.Integer zzasq = null;
    public com.google.android.gms.internal.measurement.zzkl[] zzasr = com.google.android.gms.internal.measurement.zzkl.zzlj();
    public com.google.android.gms.internal.measurement.zzkj[] zzass = com.google.android.gms.internal.measurement.zzkj.zzli();
    public com.google.android.gms.internal.measurement.zzkd[] zzast = com.google.android.gms.internal.measurement.zzkd.zzle();

    public zzkk() {
        this.zzbww = null;
        this.zzbxh = -1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzkk)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzkk zzkkVar = (com.google.android.gms.internal.measurement.zzkk) obj;
        java.lang.Long l17 = this.zzasp;
        if (l17 == null) {
            if (zzkkVar.zzasp != null) {
                return false;
            }
        } else if (!l17.equals(zzkkVar.zzasp)) {
            return false;
        }
        java.lang.String str = this.zzadm;
        if (str == null) {
            if (zzkkVar.zzadm != null) {
                return false;
            }
        } else if (!str.equals(zzkkVar.zzadm)) {
            return false;
        }
        java.lang.Integer num = this.zzasq;
        if (num == null) {
            if (zzkkVar.zzasq != null) {
                return false;
            }
        } else if (!num.equals(zzkkVar.zzasq)) {
            return false;
        }
        if (!com.google.android.gms.internal.measurement.zzacc.equals(this.zzasr, zzkkVar.zzasr) || !com.google.android.gms.internal.measurement.zzacc.equals(this.zzass, zzkkVar.zzass) || !com.google.android.gms.internal.measurement.zzacc.equals(this.zzast, zzkkVar.zzast)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzaca zzacaVar = this.zzbww;
        if (zzacaVar != null && !zzacaVar.isEmpty()) {
            return this.zzbww.equals(zzkkVar.zzbww);
        }
        com.google.android.gms.internal.measurement.zzaca zzacaVar2 = zzkkVar.zzbww;
        return zzacaVar2 == null || zzacaVar2.isEmpty();
    }

    public final int hashCode() {
        java.lang.Long l17 = this.zzasp;
        int i17 = 0;
        int hashCode = ((-1033080106) + (l17 == null ? 0 : l17.hashCode())) * 31;
        java.lang.String str = this.zzadm;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Integer num = this.zzasq;
        int hashCode3 = (((((((hashCode2 + (num == null ? 0 : num.hashCode())) * 31) + com.google.android.gms.internal.measurement.zzacc.hashCode(this.zzasr)) * 31) + com.google.android.gms.internal.measurement.zzacc.hashCode(this.zzass)) * 31) + com.google.android.gms.internal.measurement.zzacc.hashCode(this.zzast)) * 31;
        com.google.android.gms.internal.measurement.zzaca zzacaVar = this.zzbww;
        if (zzacaVar != null && !zzacaVar.isEmpty()) {
            i17 = this.zzbww.hashCode();
        }
        return hashCode3 + i17;
    }

    @Override // com.google.android.gms.internal.measurement.zzaby, com.google.android.gms.internal.measurement.zzace
    public final int zza() {
        int zza = super.zza();
        java.lang.Long l17 = this.zzasp;
        if (l17 != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzc(1, l17.longValue());
        }
        java.lang.String str = this.zzadm;
        if (str != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzc(2, str);
        }
        java.lang.Integer num = this.zzasq;
        if (num != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzf(3, num.intValue());
        }
        com.google.android.gms.internal.measurement.zzkl[] zzklVarArr = this.zzasr;
        int i17 = 0;
        if (zzklVarArr != null && zzklVarArr.length > 0) {
            int i18 = 0;
            while (true) {
                com.google.android.gms.internal.measurement.zzkl[] zzklVarArr2 = this.zzasr;
                if (i18 >= zzklVarArr2.length) {
                    break;
                }
                com.google.android.gms.internal.measurement.zzkl zzklVar = zzklVarArr2[i18];
                if (zzklVar != null) {
                    zza += com.google.android.gms.internal.measurement.zzabw.zzb(4, zzklVar);
                }
                i18++;
            }
        }
        com.google.android.gms.internal.measurement.zzkj[] zzkjVarArr = this.zzass;
        if (zzkjVarArr != null && zzkjVarArr.length > 0) {
            int i19 = 0;
            while (true) {
                com.google.android.gms.internal.measurement.zzkj[] zzkjVarArr2 = this.zzass;
                if (i19 >= zzkjVarArr2.length) {
                    break;
                }
                com.google.android.gms.internal.measurement.zzkj zzkjVar = zzkjVarArr2[i19];
                if (zzkjVar != null) {
                    zza += com.google.android.gms.internal.measurement.zzabw.zzb(5, zzkjVar);
                }
                i19++;
            }
        }
        com.google.android.gms.internal.measurement.zzkd[] zzkdVarArr = this.zzast;
        if (zzkdVarArr != null && zzkdVarArr.length > 0) {
            while (true) {
                com.google.android.gms.internal.measurement.zzkd[] zzkdVarArr2 = this.zzast;
                if (i17 >= zzkdVarArr2.length) {
                    break;
                }
                com.google.android.gms.internal.measurement.zzkd zzkdVar = zzkdVarArr2[i17];
                if (zzkdVar != null) {
                    zza += com.google.android.gms.internal.measurement.zzabw.zzb(6, zzkdVar);
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
                this.zzasp = java.lang.Long.valueOf(zzabvVar.zzuz());
            } else if (zzuw == 18) {
                this.zzadm = zzabvVar.readString();
            } else if (zzuw == 24) {
                this.zzasq = java.lang.Integer.valueOf(zzabvVar.zzuy());
            } else if (zzuw == 34) {
                int zzb = com.google.android.gms.internal.measurement.zzach.zzb(zzabvVar, 34);
                com.google.android.gms.internal.measurement.zzkl[] zzklVarArr = this.zzasr;
                int length = zzklVarArr == null ? 0 : zzklVarArr.length;
                int i17 = zzb + length;
                com.google.android.gms.internal.measurement.zzkl[] zzklVarArr2 = new com.google.android.gms.internal.measurement.zzkl[i17];
                if (length != 0) {
                    java.lang.System.arraycopy(zzklVarArr, 0, zzklVarArr2, 0, length);
                }
                while (length < i17 - 1) {
                    com.google.android.gms.internal.measurement.zzkl zzklVar = new com.google.android.gms.internal.measurement.zzkl();
                    zzklVarArr2[length] = zzklVar;
                    zzabvVar.zza(zzklVar);
                    zzabvVar.zzuw();
                    length++;
                }
                com.google.android.gms.internal.measurement.zzkl zzklVar2 = new com.google.android.gms.internal.measurement.zzkl();
                zzklVarArr2[length] = zzklVar2;
                zzabvVar.zza(zzklVar2);
                this.zzasr = zzklVarArr2;
            } else if (zzuw == 42) {
                int zzb2 = com.google.android.gms.internal.measurement.zzach.zzb(zzabvVar, 42);
                com.google.android.gms.internal.measurement.zzkj[] zzkjVarArr = this.zzass;
                int length2 = zzkjVarArr == null ? 0 : zzkjVarArr.length;
                int i18 = zzb2 + length2;
                com.google.android.gms.internal.measurement.zzkj[] zzkjVarArr2 = new com.google.android.gms.internal.measurement.zzkj[i18];
                if (length2 != 0) {
                    java.lang.System.arraycopy(zzkjVarArr, 0, zzkjVarArr2, 0, length2);
                }
                while (length2 < i18 - 1) {
                    com.google.android.gms.internal.measurement.zzkj zzkjVar = new com.google.android.gms.internal.measurement.zzkj();
                    zzkjVarArr2[length2] = zzkjVar;
                    zzabvVar.zza(zzkjVar);
                    zzabvVar.zzuw();
                    length2++;
                }
                com.google.android.gms.internal.measurement.zzkj zzkjVar2 = new com.google.android.gms.internal.measurement.zzkj();
                zzkjVarArr2[length2] = zzkjVar2;
                zzabvVar.zza(zzkjVar2);
                this.zzass = zzkjVarArr2;
            } else if (zzuw == 50) {
                int zzb3 = com.google.android.gms.internal.measurement.zzach.zzb(zzabvVar, 50);
                com.google.android.gms.internal.measurement.zzkd[] zzkdVarArr = this.zzast;
                int length3 = zzkdVarArr == null ? 0 : zzkdVarArr.length;
                int i19 = zzb3 + length3;
                com.google.android.gms.internal.measurement.zzkd[] zzkdVarArr2 = new com.google.android.gms.internal.measurement.zzkd[i19];
                if (length3 != 0) {
                    java.lang.System.arraycopy(zzkdVarArr, 0, zzkdVarArr2, 0, length3);
                }
                while (length3 < i19 - 1) {
                    com.google.android.gms.internal.measurement.zzkd zzkdVar = new com.google.android.gms.internal.measurement.zzkd();
                    zzkdVarArr2[length3] = zzkdVar;
                    zzabvVar.zza(zzkdVar);
                    zzabvVar.zzuw();
                    length3++;
                }
                com.google.android.gms.internal.measurement.zzkd zzkdVar2 = new com.google.android.gms.internal.measurement.zzkd();
                zzkdVarArr2[length3] = zzkdVar2;
                zzabvVar.zza(zzkdVar2);
                this.zzast = zzkdVarArr2;
            } else if (!super.zza(zzabvVar, zzuw)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaby, com.google.android.gms.internal.measurement.zzace
    public final void zza(com.google.android.gms.internal.measurement.zzabw zzabwVar) {
        java.lang.Long l17 = this.zzasp;
        if (l17 != null) {
            zzabwVar.zzb(1, l17.longValue());
        }
        java.lang.String str = this.zzadm;
        if (str != null) {
            zzabwVar.zzb(2, str);
        }
        java.lang.Integer num = this.zzasq;
        if (num != null) {
            zzabwVar.zze(3, num.intValue());
        }
        com.google.android.gms.internal.measurement.zzkl[] zzklVarArr = this.zzasr;
        int i17 = 0;
        if (zzklVarArr != null && zzklVarArr.length > 0) {
            int i18 = 0;
            while (true) {
                com.google.android.gms.internal.measurement.zzkl[] zzklVarArr2 = this.zzasr;
                if (i18 >= zzklVarArr2.length) {
                    break;
                }
                com.google.android.gms.internal.measurement.zzkl zzklVar = zzklVarArr2[i18];
                if (zzklVar != null) {
                    zzabwVar.zza(4, zzklVar);
                }
                i18++;
            }
        }
        com.google.android.gms.internal.measurement.zzkj[] zzkjVarArr = this.zzass;
        if (zzkjVarArr != null && zzkjVarArr.length > 0) {
            int i19 = 0;
            while (true) {
                com.google.android.gms.internal.measurement.zzkj[] zzkjVarArr2 = this.zzass;
                if (i19 >= zzkjVarArr2.length) {
                    break;
                }
                com.google.android.gms.internal.measurement.zzkj zzkjVar = zzkjVarArr2[i19];
                if (zzkjVar != null) {
                    zzabwVar.zza(5, zzkjVar);
                }
                i19++;
            }
        }
        com.google.android.gms.internal.measurement.zzkd[] zzkdVarArr = this.zzast;
        if (zzkdVarArr != null && zzkdVarArr.length > 0) {
            while (true) {
                com.google.android.gms.internal.measurement.zzkd[] zzkdVarArr2 = this.zzast;
                if (i17 >= zzkdVarArr2.length) {
                    break;
                }
                com.google.android.gms.internal.measurement.zzkd zzkdVar = zzkdVarArr2[i17];
                if (zzkdVar != null) {
                    zzabwVar.zza(6, zzkdVar);
                }
                i17++;
            }
        }
        super.zza(zzabwVar);
    }
}

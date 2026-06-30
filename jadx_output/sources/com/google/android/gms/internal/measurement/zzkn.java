package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zzkn extends com.google.android.gms.internal.measurement.zzaby<com.google.android.gms.internal.measurement.zzkn> {
    private static volatile com.google.android.gms.internal.measurement.zzkn[] zzasz;
    public com.google.android.gms.internal.measurement.zzko[] zzata = com.google.android.gms.internal.measurement.zzko.zzlm();
    public java.lang.String name = null;
    public java.lang.Long zzatb = null;
    public java.lang.Long zzatc = null;
    public java.lang.Integer count = null;

    public zzkn() {
        this.zzbww = null;
        this.zzbxh = -1;
    }

    public static com.google.android.gms.internal.measurement.zzkn[] zzll() {
        if (zzasz == null) {
            synchronized (com.google.android.gms.internal.measurement.zzacc.zzbxg) {
                if (zzasz == null) {
                    zzasz = new com.google.android.gms.internal.measurement.zzkn[0];
                }
            }
        }
        return zzasz;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzkn)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzkn zzknVar = (com.google.android.gms.internal.measurement.zzkn) obj;
        if (!com.google.android.gms.internal.measurement.zzacc.equals(this.zzata, zzknVar.zzata)) {
            return false;
        }
        java.lang.String str = this.name;
        if (str == null) {
            if (zzknVar.name != null) {
                return false;
            }
        } else if (!str.equals(zzknVar.name)) {
            return false;
        }
        java.lang.Long l17 = this.zzatb;
        if (l17 == null) {
            if (zzknVar.zzatb != null) {
                return false;
            }
        } else if (!l17.equals(zzknVar.zzatb)) {
            return false;
        }
        java.lang.Long l18 = this.zzatc;
        if (l18 == null) {
            if (zzknVar.zzatc != null) {
                return false;
            }
        } else if (!l18.equals(zzknVar.zzatc)) {
            return false;
        }
        java.lang.Integer num = this.count;
        if (num == null) {
            if (zzknVar.count != null) {
                return false;
            }
        } else if (!num.equals(zzknVar.count)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzaca zzacaVar = this.zzbww;
        if (zzacaVar != null && !zzacaVar.isEmpty()) {
            return this.zzbww.equals(zzknVar.zzbww);
        }
        com.google.android.gms.internal.measurement.zzaca zzacaVar2 = zzknVar.zzbww;
        return zzacaVar2 == null || zzacaVar2.isEmpty();
    }

    public final int hashCode() {
        int hashCode = ((-1033080013) + com.google.android.gms.internal.measurement.zzacc.hashCode(this.zzata)) * 31;
        java.lang.String str = this.name;
        int i17 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Long l17 = this.zzatb;
        int hashCode3 = (hashCode2 + (l17 == null ? 0 : l17.hashCode())) * 31;
        java.lang.Long l18 = this.zzatc;
        int hashCode4 = (hashCode3 + (l18 == null ? 0 : l18.hashCode())) * 31;
        java.lang.Integer num = this.count;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        com.google.android.gms.internal.measurement.zzaca zzacaVar = this.zzbww;
        if (zzacaVar != null && !zzacaVar.isEmpty()) {
            i17 = this.zzbww.hashCode();
        }
        return hashCode5 + i17;
    }

    @Override // com.google.android.gms.internal.measurement.zzaby, com.google.android.gms.internal.measurement.zzace
    public final int zza() {
        int zza = super.zza();
        com.google.android.gms.internal.measurement.zzko[] zzkoVarArr = this.zzata;
        if (zzkoVarArr != null && zzkoVarArr.length > 0) {
            int i17 = 0;
            while (true) {
                com.google.android.gms.internal.measurement.zzko[] zzkoVarArr2 = this.zzata;
                if (i17 >= zzkoVarArr2.length) {
                    break;
                }
                com.google.android.gms.internal.measurement.zzko zzkoVar = zzkoVarArr2[i17];
                if (zzkoVar != null) {
                    zza += com.google.android.gms.internal.measurement.zzabw.zzb(1, zzkoVar);
                }
                i17++;
            }
        }
        java.lang.String str = this.name;
        if (str != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzc(2, str);
        }
        java.lang.Long l17 = this.zzatb;
        if (l17 != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzc(3, l17.longValue());
        }
        java.lang.Long l18 = this.zzatc;
        if (l18 != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzc(4, l18.longValue());
        }
        java.lang.Integer num = this.count;
        return num != null ? zza + com.google.android.gms.internal.measurement.zzabw.zzf(5, num.intValue()) : zza;
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
                com.google.android.gms.internal.measurement.zzko[] zzkoVarArr = this.zzata;
                int length = zzkoVarArr == null ? 0 : zzkoVarArr.length;
                int i17 = zzb + length;
                com.google.android.gms.internal.measurement.zzko[] zzkoVarArr2 = new com.google.android.gms.internal.measurement.zzko[i17];
                if (length != 0) {
                    java.lang.System.arraycopy(zzkoVarArr, 0, zzkoVarArr2, 0, length);
                }
                while (length < i17 - 1) {
                    com.google.android.gms.internal.measurement.zzko zzkoVar = new com.google.android.gms.internal.measurement.zzko();
                    zzkoVarArr2[length] = zzkoVar;
                    zzabvVar.zza(zzkoVar);
                    zzabvVar.zzuw();
                    length++;
                }
                com.google.android.gms.internal.measurement.zzko zzkoVar2 = new com.google.android.gms.internal.measurement.zzko();
                zzkoVarArr2[length] = zzkoVar2;
                zzabvVar.zza(zzkoVar2);
                this.zzata = zzkoVarArr2;
            } else if (zzuw == 18) {
                this.name = zzabvVar.readString();
            } else if (zzuw == 24) {
                this.zzatb = java.lang.Long.valueOf(zzabvVar.zzuz());
            } else if (zzuw == 32) {
                this.zzatc = java.lang.Long.valueOf(zzabvVar.zzuz());
            } else if (zzuw == 40) {
                this.count = java.lang.Integer.valueOf(zzabvVar.zzuy());
            } else if (!super.zza(zzabvVar, zzuw)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaby, com.google.android.gms.internal.measurement.zzace
    public final void zza(com.google.android.gms.internal.measurement.zzabw zzabwVar) {
        com.google.android.gms.internal.measurement.zzko[] zzkoVarArr = this.zzata;
        if (zzkoVarArr != null && zzkoVarArr.length > 0) {
            int i17 = 0;
            while (true) {
                com.google.android.gms.internal.measurement.zzko[] zzkoVarArr2 = this.zzata;
                if (i17 >= zzkoVarArr2.length) {
                    break;
                }
                com.google.android.gms.internal.measurement.zzko zzkoVar = zzkoVarArr2[i17];
                if (zzkoVar != null) {
                    zzabwVar.zza(1, zzkoVar);
                }
                i17++;
            }
        }
        java.lang.String str = this.name;
        if (str != null) {
            zzabwVar.zzb(2, str);
        }
        java.lang.Long l17 = this.zzatb;
        if (l17 != null) {
            zzabwVar.zzb(3, l17.longValue());
        }
        java.lang.Long l18 = this.zzatc;
        if (l18 != null) {
            zzabwVar.zzb(4, l18.longValue());
        }
        java.lang.Integer num = this.count;
        if (num != null) {
            zzabwVar.zze(5, num.intValue());
        }
        super.zza(zzabwVar);
    }
}

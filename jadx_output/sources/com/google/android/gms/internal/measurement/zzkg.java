package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zzkg extends com.google.android.gms.internal.measurement.zzaby<com.google.android.gms.internal.measurement.zzkg> {
    public java.lang.Integer zzarz = null;
    public java.lang.Boolean zzasa = null;
    public java.lang.String zzasb = null;
    public java.lang.String zzasc = null;
    public java.lang.String zzasd = null;

    public zzkg() {
        this.zzbww = null;
        this.zzbxh = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.zzace
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.measurement.zzkg zzb(com.google.android.gms.internal.measurement.zzabv zzabvVar) {
        while (true) {
            int zzuw = zzabvVar.zzuw();
            if (zzuw == 0) {
                return this;
            }
            if (zzuw == 8) {
                int position = zzabvVar.getPosition();
                try {
                    int zzuy = zzabvVar.zzuy();
                    if (zzuy < 0 || zzuy > 4) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(46);
                        sb6.append(zzuy);
                        sb6.append(" is not a valid enum ComparisonType");
                        throw new java.lang.IllegalArgumentException(sb6.toString());
                        break;
                    }
                    this.zzarz = java.lang.Integer.valueOf(zzuy);
                } catch (java.lang.IllegalArgumentException unused) {
                    zzabvVar.zzam(position);
                    zza(zzabvVar, zzuw);
                }
            } else if (zzuw == 16) {
                this.zzasa = java.lang.Boolean.valueOf(zzabvVar.zzux());
            } else if (zzuw == 26) {
                this.zzasb = zzabvVar.readString();
            } else if (zzuw == 34) {
                this.zzasc = zzabvVar.readString();
            } else if (zzuw == 42) {
                this.zzasd = zzabvVar.readString();
            } else if (!super.zza(zzabvVar, zzuw)) {
                return this;
            }
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzkg)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzkg zzkgVar = (com.google.android.gms.internal.measurement.zzkg) obj;
        java.lang.Integer num = this.zzarz;
        if (num == null) {
            if (zzkgVar.zzarz != null) {
                return false;
            }
        } else if (!num.equals(zzkgVar.zzarz)) {
            return false;
        }
        java.lang.Boolean bool = this.zzasa;
        if (bool == null) {
            if (zzkgVar.zzasa != null) {
                return false;
            }
        } else if (!bool.equals(zzkgVar.zzasa)) {
            return false;
        }
        java.lang.String str = this.zzasb;
        if (str == null) {
            if (zzkgVar.zzasb != null) {
                return false;
            }
        } else if (!str.equals(zzkgVar.zzasb)) {
            return false;
        }
        java.lang.String str2 = this.zzasc;
        if (str2 == null) {
            if (zzkgVar.zzasc != null) {
                return false;
            }
        } else if (!str2.equals(zzkgVar.zzasc)) {
            return false;
        }
        java.lang.String str3 = this.zzasd;
        if (str3 == null) {
            if (zzkgVar.zzasd != null) {
                return false;
            }
        } else if (!str3.equals(zzkgVar.zzasd)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzaca zzacaVar = this.zzbww;
        if (zzacaVar != null && !zzacaVar.isEmpty()) {
            return this.zzbww.equals(zzkgVar.zzbww);
        }
        com.google.android.gms.internal.measurement.zzaca zzacaVar2 = zzkgVar.zzbww;
        return zzacaVar2 == null || zzacaVar2.isEmpty();
    }

    public final int hashCode() {
        java.lang.Integer num = this.zzarz;
        int i17 = 0;
        int intValue = ((-1033080230) + (num == null ? 0 : num.intValue())) * 31;
        java.lang.Boolean bool = this.zzasa;
        int hashCode = (intValue + (bool == null ? 0 : bool.hashCode())) * 31;
        java.lang.String str = this.zzasb;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.zzasc;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.zzasd;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        com.google.android.gms.internal.measurement.zzaca zzacaVar = this.zzbww;
        if (zzacaVar != null && !zzacaVar.isEmpty()) {
            i17 = this.zzbww.hashCode();
        }
        return hashCode4 + i17;
    }

    @Override // com.google.android.gms.internal.measurement.zzaby, com.google.android.gms.internal.measurement.zzace
    public final int zza() {
        int zza = super.zza();
        java.lang.Integer num = this.zzarz;
        if (num != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzf(1, num.intValue());
        }
        java.lang.Boolean bool = this.zzasa;
        if (bool != null) {
            bool.booleanValue();
            zza += com.google.android.gms.internal.measurement.zzabw.zzaq(2) + 1;
        }
        java.lang.String str = this.zzasb;
        if (str != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzc(3, str);
        }
        java.lang.String str2 = this.zzasc;
        if (str2 != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzc(4, str2);
        }
        java.lang.String str3 = this.zzasd;
        return str3 != null ? zza + com.google.android.gms.internal.measurement.zzabw.zzc(5, str3) : zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzaby, com.google.android.gms.internal.measurement.zzace
    public final void zza(com.google.android.gms.internal.measurement.zzabw zzabwVar) {
        java.lang.Integer num = this.zzarz;
        if (num != null) {
            zzabwVar.zze(1, num.intValue());
        }
        java.lang.Boolean bool = this.zzasa;
        if (bool != null) {
            zzabwVar.zza(2, bool.booleanValue());
        }
        java.lang.String str = this.zzasb;
        if (str != null) {
            zzabwVar.zzb(3, str);
        }
        java.lang.String str2 = this.zzasc;
        if (str2 != null) {
            zzabwVar.zzb(4, str2);
        }
        java.lang.String str3 = this.zzasd;
        if (str3 != null) {
            zzabwVar.zzb(5, str3);
        }
        super.zza(zzabwVar);
    }
}

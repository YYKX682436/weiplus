package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zzki extends com.google.android.gms.internal.measurement.zzaby<com.google.android.gms.internal.measurement.zzki> {
    public java.lang.Integer zzash = null;
    public java.lang.String zzasi = null;
    public java.lang.Boolean zzasj = null;
    public java.lang.String[] zzask = com.google.android.gms.internal.measurement.zzach.zzbxq;

    public zzki() {
        this.zzbww = null;
        this.zzbxh = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.zzace
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.measurement.zzki zzb(com.google.android.gms.internal.measurement.zzabv zzabvVar) {
        while (true) {
            int zzuw = zzabvVar.zzuw();
            if (zzuw == 0) {
                return this;
            }
            if (zzuw == 8) {
                int position = zzabvVar.getPosition();
                try {
                    int zzuy = zzabvVar.zzuy();
                    if (zzuy < 0 || zzuy > 6) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(41);
                        sb6.append(zzuy);
                        sb6.append(" is not a valid enum MatchType");
                        throw new java.lang.IllegalArgumentException(sb6.toString());
                        break;
                    }
                    this.zzash = java.lang.Integer.valueOf(zzuy);
                } catch (java.lang.IllegalArgumentException unused) {
                    zzabvVar.zzam(position);
                    zza(zzabvVar, zzuw);
                }
            } else if (zzuw == 18) {
                this.zzasi = zzabvVar.readString();
            } else if (zzuw == 24) {
                this.zzasj = java.lang.Boolean.valueOf(zzabvVar.zzux());
            } else if (zzuw == 34) {
                int zzb = com.google.android.gms.internal.measurement.zzach.zzb(zzabvVar, 34);
                java.lang.String[] strArr = this.zzask;
                int length = strArr == null ? 0 : strArr.length;
                int i17 = zzb + length;
                java.lang.String[] strArr2 = new java.lang.String[i17];
                if (length != 0) {
                    java.lang.System.arraycopy(strArr, 0, strArr2, 0, length);
                }
                while (length < i17 - 1) {
                    strArr2[length] = zzabvVar.readString();
                    zzabvVar.zzuw();
                    length++;
                }
                strArr2[length] = zzabvVar.readString();
                this.zzask = strArr2;
            } else if (!super.zza(zzabvVar, zzuw)) {
                return this;
            }
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzki)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzki zzkiVar = (com.google.android.gms.internal.measurement.zzki) obj;
        java.lang.Integer num = this.zzash;
        if (num == null) {
            if (zzkiVar.zzash != null) {
                return false;
            }
        } else if (!num.equals(zzkiVar.zzash)) {
            return false;
        }
        java.lang.String str = this.zzasi;
        if (str == null) {
            if (zzkiVar.zzasi != null) {
                return false;
            }
        } else if (!str.equals(zzkiVar.zzasi)) {
            return false;
        }
        java.lang.Boolean bool = this.zzasj;
        if (bool == null) {
            if (zzkiVar.zzasj != null) {
                return false;
            }
        } else if (!bool.equals(zzkiVar.zzasj)) {
            return false;
        }
        if (!com.google.android.gms.internal.measurement.zzacc.equals(this.zzask, zzkiVar.zzask)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzaca zzacaVar = this.zzbww;
        if (zzacaVar != null && !zzacaVar.isEmpty()) {
            return this.zzbww.equals(zzkiVar.zzbww);
        }
        com.google.android.gms.internal.measurement.zzaca zzacaVar2 = zzkiVar.zzbww;
        return zzacaVar2 == null || zzacaVar2.isEmpty();
    }

    public final int hashCode() {
        java.lang.Integer num = this.zzash;
        int i17 = 0;
        int intValue = ((-1033080168) + (num == null ? 0 : num.intValue())) * 31;
        java.lang.String str = this.zzasi;
        int hashCode = (intValue + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Boolean bool = this.zzasj;
        int hashCode2 = (((hashCode + (bool == null ? 0 : bool.hashCode())) * 31) + com.google.android.gms.internal.measurement.zzacc.hashCode(this.zzask)) * 31;
        com.google.android.gms.internal.measurement.zzaca zzacaVar = this.zzbww;
        if (zzacaVar != null && !zzacaVar.isEmpty()) {
            i17 = this.zzbww.hashCode();
        }
        return hashCode2 + i17;
    }

    @Override // com.google.android.gms.internal.measurement.zzaby, com.google.android.gms.internal.measurement.zzace
    public final int zza() {
        int zza = super.zza();
        java.lang.Integer num = this.zzash;
        if (num != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzf(1, num.intValue());
        }
        java.lang.String str = this.zzasi;
        if (str != null) {
            zza += com.google.android.gms.internal.measurement.zzabw.zzc(2, str);
        }
        java.lang.Boolean bool = this.zzasj;
        if (bool != null) {
            bool.booleanValue();
            zza += com.google.android.gms.internal.measurement.zzabw.zzaq(3) + 1;
        }
        java.lang.String[] strArr = this.zzask;
        if (strArr == null || strArr.length <= 0) {
            return zza;
        }
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            java.lang.String[] strArr2 = this.zzask;
            if (i17 >= strArr2.length) {
                return zza + i18 + (i19 * 1);
            }
            java.lang.String str2 = strArr2[i17];
            if (str2 != null) {
                i19++;
                i18 += com.google.android.gms.internal.measurement.zzabw.zzfm(str2);
            }
            i17++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaby, com.google.android.gms.internal.measurement.zzace
    public final void zza(com.google.android.gms.internal.measurement.zzabw zzabwVar) {
        java.lang.Integer num = this.zzash;
        if (num != null) {
            zzabwVar.zze(1, num.intValue());
        }
        java.lang.String str = this.zzasi;
        if (str != null) {
            zzabwVar.zzb(2, str);
        }
        java.lang.Boolean bool = this.zzasj;
        if (bool != null) {
            zzabwVar.zza(3, bool.booleanValue());
        }
        java.lang.String[] strArr = this.zzask;
        if (strArr != null && strArr.length > 0) {
            int i17 = 0;
            while (true) {
                java.lang.String[] strArr2 = this.zzask;
                if (i17 >= strArr2.length) {
                    break;
                }
                java.lang.String str2 = strArr2[i17];
                if (str2 != null) {
                    zzabwVar.zzb(4, str2);
                }
                i17++;
            }
        }
        super.zza(zzabwVar);
    }
}

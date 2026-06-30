package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zzkr extends com.google.android.gms.internal.measurement.zzaby<com.google.android.gms.internal.measurement.zzkr> {
    public long[] zzauk;
    public long[] zzaul;

    public zzkr() {
        long[] jArr = com.google.android.gms.internal.measurement.zzach.zzbxm;
        this.zzauk = jArr;
        this.zzaul = jArr;
        this.zzbww = null;
        this.zzbxh = -1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzkr)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzkr zzkrVar = (com.google.android.gms.internal.measurement.zzkr) obj;
        if (!com.google.android.gms.internal.measurement.zzacc.equals(this.zzauk, zzkrVar.zzauk) || !com.google.android.gms.internal.measurement.zzacc.equals(this.zzaul, zzkrVar.zzaul)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzaca zzacaVar = this.zzbww;
        if (zzacaVar != null && !zzacaVar.isEmpty()) {
            return this.zzbww.equals(zzkrVar.zzbww);
        }
        com.google.android.gms.internal.measurement.zzaca zzacaVar2 = zzkrVar.zzbww;
        return zzacaVar2 == null || zzacaVar2.isEmpty();
    }

    public final int hashCode() {
        int hashCode = ((((-1033079889) + com.google.android.gms.internal.measurement.zzacc.hashCode(this.zzauk)) * 31) + com.google.android.gms.internal.measurement.zzacc.hashCode(this.zzaul)) * 31;
        com.google.android.gms.internal.measurement.zzaca zzacaVar = this.zzbww;
        return hashCode + ((zzacaVar == null || zzacaVar.isEmpty()) ? 0 : this.zzbww.hashCode());
    }

    @Override // com.google.android.gms.internal.measurement.zzaby, com.google.android.gms.internal.measurement.zzace
    public final int zza() {
        long[] jArr;
        int zza = super.zza();
        long[] jArr2 = this.zzauk;
        int i17 = 0;
        if (jArr2 != null && jArr2.length > 0) {
            int i18 = 0;
            int i19 = 0;
            while (true) {
                jArr = this.zzauk;
                if (i18 >= jArr.length) {
                    break;
                }
                i19 += com.google.android.gms.internal.measurement.zzabw.zzao(jArr[i18]);
                i18++;
            }
            zza = zza + i19 + (jArr.length * 1);
        }
        long[] jArr3 = this.zzaul;
        if (jArr3 == null || jArr3.length <= 0) {
            return zza;
        }
        int i27 = 0;
        while (true) {
            long[] jArr4 = this.zzaul;
            if (i17 >= jArr4.length) {
                return zza + i27 + (jArr4.length * 1);
            }
            i27 += com.google.android.gms.internal.measurement.zzabw.zzao(jArr4[i17]);
            i17++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzace
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzace zzb(com.google.android.gms.internal.measurement.zzabv zzabvVar) {
        int zzaf;
        while (true) {
            int zzuw = zzabvVar.zzuw();
            if (zzuw == 0) {
                return this;
            }
            if (zzuw != 8) {
                if (zzuw == 10) {
                    zzaf = zzabvVar.zzaf(zzabvVar.zzuy());
                    int position = zzabvVar.getPosition();
                    int i17 = 0;
                    while (zzabvVar.zzvc() > 0) {
                        zzabvVar.zzuz();
                        i17++;
                    }
                    zzabvVar.zzam(position);
                    long[] jArr = this.zzauk;
                    int length = jArr == null ? 0 : jArr.length;
                    int i18 = i17 + length;
                    long[] jArr2 = new long[i18];
                    if (length != 0) {
                        java.lang.System.arraycopy(jArr, 0, jArr2, 0, length);
                    }
                    while (length < i18) {
                        jArr2[length] = zzabvVar.zzuz();
                        length++;
                    }
                    this.zzauk = jArr2;
                } else if (zzuw == 16) {
                    int zzb = com.google.android.gms.internal.measurement.zzach.zzb(zzabvVar, 16);
                    long[] jArr3 = this.zzaul;
                    int length2 = jArr3 == null ? 0 : jArr3.length;
                    int i19 = zzb + length2;
                    long[] jArr4 = new long[i19];
                    if (length2 != 0) {
                        java.lang.System.arraycopy(jArr3, 0, jArr4, 0, length2);
                    }
                    while (length2 < i19 - 1) {
                        jArr4[length2] = zzabvVar.zzuz();
                        zzabvVar.zzuw();
                        length2++;
                    }
                    jArr4[length2] = zzabvVar.zzuz();
                    this.zzaul = jArr4;
                } else if (zzuw == 18) {
                    zzaf = zzabvVar.zzaf(zzabvVar.zzuy());
                    int position2 = zzabvVar.getPosition();
                    int i27 = 0;
                    while (zzabvVar.zzvc() > 0) {
                        zzabvVar.zzuz();
                        i27++;
                    }
                    zzabvVar.zzam(position2);
                    long[] jArr5 = this.zzaul;
                    int length3 = jArr5 == null ? 0 : jArr5.length;
                    int i28 = i27 + length3;
                    long[] jArr6 = new long[i28];
                    if (length3 != 0) {
                        java.lang.System.arraycopy(jArr5, 0, jArr6, 0, length3);
                    }
                    while (length3 < i28) {
                        jArr6[length3] = zzabvVar.zzuz();
                        length3++;
                    }
                    this.zzaul = jArr6;
                } else if (!super.zza(zzabvVar, zzuw)) {
                    return this;
                }
                zzabvVar.zzal(zzaf);
            } else {
                int zzb2 = com.google.android.gms.internal.measurement.zzach.zzb(zzabvVar, 8);
                long[] jArr7 = this.zzauk;
                int length4 = jArr7 == null ? 0 : jArr7.length;
                int i29 = zzb2 + length4;
                long[] jArr8 = new long[i29];
                if (length4 != 0) {
                    java.lang.System.arraycopy(jArr7, 0, jArr8, 0, length4);
                }
                while (length4 < i29 - 1) {
                    jArr8[length4] = zzabvVar.zzuz();
                    zzabvVar.zzuw();
                    length4++;
                }
                jArr8[length4] = zzabvVar.zzuz();
                this.zzauk = jArr8;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaby, com.google.android.gms.internal.measurement.zzace
    public final void zza(com.google.android.gms.internal.measurement.zzabw zzabwVar) {
        long[] jArr = this.zzauk;
        int i17 = 0;
        if (jArr != null && jArr.length > 0) {
            int i18 = 0;
            while (true) {
                long[] jArr2 = this.zzauk;
                if (i18 >= jArr2.length) {
                    break;
                }
                zzabwVar.zza(1, jArr2[i18]);
                i18++;
            }
        }
        long[] jArr3 = this.zzaul;
        if (jArr3 != null && jArr3.length > 0) {
            while (true) {
                long[] jArr4 = this.zzaul;
                if (i17 >= jArr4.length) {
                    break;
                }
                zzabwVar.zza(2, jArr4[i17]);
                i17++;
            }
        }
        super.zza(zzabwVar);
    }
}

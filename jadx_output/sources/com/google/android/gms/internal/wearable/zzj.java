package com.google.android.gms.internal.wearable;

/* loaded from: classes16.dex */
public final class zzj extends com.google.android.gms.internal.wearable.zzn<com.google.android.gms.internal.wearable.zzj> {
    public byte[] zzgd = com.google.android.gms.internal.wearable.zzw.zzhy;
    public java.lang.String zzge = "";
    public double zzgf = 0.0d;
    public float zzgg = 0.0f;
    public long zzgh = 0;
    public int zzgi = 0;
    public int zzgj = 0;
    public boolean zzgk = false;
    public com.google.android.gms.internal.wearable.zzh[] zzgl = com.google.android.gms.internal.wearable.zzh.zzh();
    public com.google.android.gms.internal.wearable.zzi[] zzgm = com.google.android.gms.internal.wearable.zzi.zzi();
    public java.lang.String[] zzgn = com.google.android.gms.internal.wearable.zzw.zzhw;
    public long[] zzgo = com.google.android.gms.internal.wearable.zzw.zzhs;
    public float[] zzgp = com.google.android.gms.internal.wearable.zzw.zzht;
    public long zzgq = 0;

    public zzj() {
        this.zzhc = null;
        this.zzhl = -1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.wearable.zzj)) {
            return false;
        }
        com.google.android.gms.internal.wearable.zzj zzjVar = (com.google.android.gms.internal.wearable.zzj) obj;
        if (!java.util.Arrays.equals(this.zzgd, zzjVar.zzgd)) {
            return false;
        }
        java.lang.String str = this.zzge;
        if (str == null) {
            if (zzjVar.zzge != null) {
                return false;
            }
        } else if (!str.equals(zzjVar.zzge)) {
            return false;
        }
        if (java.lang.Double.doubleToLongBits(this.zzgf) != java.lang.Double.doubleToLongBits(zzjVar.zzgf) || java.lang.Float.floatToIntBits(this.zzgg) != java.lang.Float.floatToIntBits(zzjVar.zzgg) || this.zzgh != zzjVar.zzgh || this.zzgi != zzjVar.zzgi || this.zzgj != zzjVar.zzgj || this.zzgk != zzjVar.zzgk || !com.google.android.gms.internal.wearable.zzr.equals(this.zzgl, zzjVar.zzgl) || !com.google.android.gms.internal.wearable.zzr.equals(this.zzgm, zzjVar.zzgm) || !com.google.android.gms.internal.wearable.zzr.equals(this.zzgn, zzjVar.zzgn) || !com.google.android.gms.internal.wearable.zzr.equals(this.zzgo, zzjVar.zzgo) || !com.google.android.gms.internal.wearable.zzr.equals(this.zzgp, zzjVar.zzgp) || this.zzgq != zzjVar.zzgq) {
            return false;
        }
        com.google.android.gms.internal.wearable.zzp zzpVar = this.zzhc;
        if (zzpVar != null && !zzpVar.isEmpty()) {
            return this.zzhc.equals(zzjVar.zzhc);
        }
        com.google.android.gms.internal.wearable.zzp zzpVar2 = zzjVar.zzhc;
        return zzpVar2 == null || zzpVar2.isEmpty();
    }

    public final int hashCode() {
        int hashCode = (1588755251 + java.util.Arrays.hashCode(this.zzgd)) * 31;
        java.lang.String str = this.zzge;
        int i17 = 0;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long doubleToLongBits = java.lang.Double.doubleToLongBits(this.zzgf);
        int floatToIntBits = (((((hashCode + hashCode2) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + java.lang.Float.floatToIntBits(this.zzgg)) * 31;
        long j17 = this.zzgh;
        int hashCode3 = (((((((((((((((((floatToIntBits + ((int) (j17 ^ (j17 >>> 32)))) * 31) + this.zzgi) * 31) + this.zzgj) * 31) + (this.zzgk ? 1231 : 1237)) * 31) + com.google.android.gms.internal.wearable.zzr.hashCode(this.zzgl)) * 31) + com.google.android.gms.internal.wearable.zzr.hashCode(this.zzgm)) * 31) + com.google.android.gms.internal.wearable.zzr.hashCode(this.zzgn)) * 31) + com.google.android.gms.internal.wearable.zzr.hashCode(this.zzgo)) * 31) + com.google.android.gms.internal.wearable.zzr.hashCode(this.zzgp)) * 31;
        long j18 = this.zzgq;
        int i18 = (hashCode3 + ((int) (j18 ^ (j18 >>> 32)))) * 31;
        com.google.android.gms.internal.wearable.zzp zzpVar = this.zzhc;
        if (zzpVar != null && !zzpVar.isEmpty()) {
            i17 = this.zzhc.hashCode();
        }
        return i18 + i17;
    }

    @Override // com.google.android.gms.internal.wearable.zzt
    public final /* synthetic */ com.google.android.gms.internal.wearable.zzt zza(com.google.android.gms.internal.wearable.zzk zzkVar) {
        while (true) {
            int zzj = zzkVar.zzj();
            switch (zzj) {
                case 0:
                    return this;
                case 10:
                    this.zzgd = zzkVar.readBytes();
                    break;
                case 18:
                    this.zzge = zzkVar.readString();
                    break;
                case 25:
                    this.zzgf = java.lang.Double.longBitsToDouble(zzkVar.zzn());
                    break;
                case 37:
                    this.zzgg = java.lang.Float.intBitsToFloat(zzkVar.zzm());
                    break;
                case 40:
                    this.zzgh = zzkVar.zzl();
                    break;
                case 48:
                    this.zzgi = zzkVar.zzk();
                    break;
                case 56:
                    int zzk = zzkVar.zzk();
                    this.zzgj = (-(zzk & 1)) ^ (zzk >>> 1);
                    break;
                case 64:
                    this.zzgk = zzkVar.zzk() != 0;
                    break;
                case 74:
                    int zzb = com.google.android.gms.internal.wearable.zzw.zzb(zzkVar, 74);
                    com.google.android.gms.internal.wearable.zzh[] zzhVarArr = this.zzgl;
                    int length = zzhVarArr == null ? 0 : zzhVarArr.length;
                    int i17 = zzb + length;
                    com.google.android.gms.internal.wearable.zzh[] zzhVarArr2 = new com.google.android.gms.internal.wearable.zzh[i17];
                    if (length != 0) {
                        java.lang.System.arraycopy(zzhVarArr, 0, zzhVarArr2, 0, length);
                    }
                    while (length < i17 - 1) {
                        com.google.android.gms.internal.wearable.zzh zzhVar = new com.google.android.gms.internal.wearable.zzh();
                        zzhVarArr2[length] = zzhVar;
                        zzkVar.zza(zzhVar);
                        zzkVar.zzj();
                        length++;
                    }
                    com.google.android.gms.internal.wearable.zzh zzhVar2 = new com.google.android.gms.internal.wearable.zzh();
                    zzhVarArr2[length] = zzhVar2;
                    zzkVar.zza(zzhVar2);
                    this.zzgl = zzhVarArr2;
                    break;
                case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_ERROR_CREATE_JAVA_DATASOURCE /* 82 */:
                    int zzb2 = com.google.android.gms.internal.wearable.zzw.zzb(zzkVar, 82);
                    com.google.android.gms.internal.wearable.zzi[] zziVarArr = this.zzgm;
                    int length2 = zziVarArr == null ? 0 : zziVarArr.length;
                    int i18 = zzb2 + length2;
                    com.google.android.gms.internal.wearable.zzi[] zziVarArr2 = new com.google.android.gms.internal.wearable.zzi[i18];
                    if (length2 != 0) {
                        java.lang.System.arraycopy(zziVarArr, 0, zziVarArr2, 0, length2);
                    }
                    while (length2 < i18 - 1) {
                        com.google.android.gms.internal.wearable.zzi zziVar = new com.google.android.gms.internal.wearable.zzi();
                        zziVarArr2[length2] = zziVar;
                        zzkVar.zza(zziVar);
                        zzkVar.zzj();
                        length2++;
                    }
                    com.google.android.gms.internal.wearable.zzi zziVar2 = new com.google.android.gms.internal.wearable.zzi();
                    zziVarArr2[length2] = zziVar2;
                    zzkVar.zza(zziVar2);
                    this.zzgm = zziVarArr2;
                    break;
                case 90:
                    int zzb3 = com.google.android.gms.internal.wearable.zzw.zzb(zzkVar, 90);
                    java.lang.String[] strArr = this.zzgn;
                    int length3 = strArr == null ? 0 : strArr.length;
                    int i19 = zzb3 + length3;
                    java.lang.String[] strArr2 = new java.lang.String[i19];
                    if (length3 != 0) {
                        java.lang.System.arraycopy(strArr, 0, strArr2, 0, length3);
                    }
                    while (length3 < i19 - 1) {
                        strArr2[length3] = zzkVar.readString();
                        zzkVar.zzj();
                        length3++;
                    }
                    strArr2[length3] = zzkVar.readString();
                    this.zzgn = strArr2;
                    break;
                case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_IN_SETAUDIOEFFECT /* 96 */:
                    int zzb4 = com.google.android.gms.internal.wearable.zzw.zzb(zzkVar, 96);
                    long[] jArr = this.zzgo;
                    int length4 = jArr == null ? 0 : jArr.length;
                    int i27 = zzb4 + length4;
                    long[] jArr2 = new long[i27];
                    if (length4 != 0) {
                        java.lang.System.arraycopy(jArr, 0, jArr2, 0, length4);
                    }
                    while (length4 < i27 - 1) {
                        jArr2[length4] = zzkVar.zzl();
                        zzkVar.zzj();
                        length4++;
                    }
                    jArr2[length4] = zzkVar.zzl();
                    this.zzgo = jArr2;
                    break;
                case 98:
                    int zze = zzkVar.zze(zzkVar.zzk());
                    int position = zzkVar.getPosition();
                    int i28 = 0;
                    while (zzkVar.zzp() > 0) {
                        zzkVar.zzl();
                        i28++;
                    }
                    zzkVar.zzg(position);
                    long[] jArr3 = this.zzgo;
                    int length5 = jArr3 == null ? 0 : jArr3.length;
                    int i29 = i28 + length5;
                    long[] jArr4 = new long[i29];
                    if (length5 != 0) {
                        java.lang.System.arraycopy(jArr3, 0, jArr4, 0, length5);
                    }
                    while (length5 < i29) {
                        jArr4[length5] = zzkVar.zzl();
                        length5++;
                    }
                    this.zzgo = jArr4;
                    zzkVar.zzf(zze);
                    break;
                case 104:
                    this.zzgq = zzkVar.zzl();
                    break;
                case 114:
                    int zzk2 = zzkVar.zzk();
                    int zze2 = zzkVar.zze(zzk2);
                    int i37 = zzk2 / 4;
                    float[] fArr = this.zzgp;
                    int length6 = fArr == null ? 0 : fArr.length;
                    int i38 = i37 + length6;
                    float[] fArr2 = new float[i38];
                    if (length6 != 0) {
                        java.lang.System.arraycopy(fArr, 0, fArr2, 0, length6);
                    }
                    while (length6 < i38) {
                        fArr2[length6] = java.lang.Float.intBitsToFloat(zzkVar.zzm());
                        length6++;
                    }
                    this.zzgp = fArr2;
                    zzkVar.zzf(zze2);
                    break;
                case 117:
                    int zzb5 = com.google.android.gms.internal.wearable.zzw.zzb(zzkVar, 117);
                    float[] fArr3 = this.zzgp;
                    int length7 = fArr3 == null ? 0 : fArr3.length;
                    int i39 = zzb5 + length7;
                    float[] fArr4 = new float[i39];
                    if (length7 != 0) {
                        java.lang.System.arraycopy(fArr3, 0, fArr4, 0, length7);
                    }
                    while (length7 < i39 - 1) {
                        fArr4[length7] = java.lang.Float.intBitsToFloat(zzkVar.zzm());
                        zzkVar.zzj();
                        length7++;
                    }
                    fArr4[length7] = java.lang.Float.intBitsToFloat(zzkVar.zzm());
                    this.zzgp = fArr4;
                    break;
                default:
                    if (!super.zza(zzkVar, zzj)) {
                        return this;
                    }
                    break;
            }
        }
    }

    @Override // com.google.android.gms.internal.wearable.zzn, com.google.android.gms.internal.wearable.zzt
    public final int zzg() {
        long[] jArr;
        int zzg = super.zzg();
        if (!java.util.Arrays.equals(this.zzgd, com.google.android.gms.internal.wearable.zzw.zzhy)) {
            byte[] bArr = this.zzgd;
            zzg += com.google.android.gms.internal.wearable.zzl.zzk(1) + com.google.android.gms.internal.wearable.zzl.zzm(bArr.length) + bArr.length;
        }
        java.lang.String str = this.zzge;
        if (str != null && !str.equals("")) {
            zzg += com.google.android.gms.internal.wearable.zzl.zzb(2, this.zzge);
        }
        if (java.lang.Double.doubleToLongBits(this.zzgf) != java.lang.Double.doubleToLongBits(0.0d)) {
            zzg += com.google.android.gms.internal.wearable.zzl.zzk(3) + 8;
        }
        if (java.lang.Float.floatToIntBits(this.zzgg) != java.lang.Float.floatToIntBits(0.0f)) {
            zzg += com.google.android.gms.internal.wearable.zzl.zzk(4) + 4;
        }
        long j17 = this.zzgh;
        if (j17 != 0) {
            zzg += com.google.android.gms.internal.wearable.zzl.zzb(5, j17);
        }
        int i17 = this.zzgi;
        if (i17 != 0) {
            zzg += com.google.android.gms.internal.wearable.zzl.zze(6, i17);
        }
        int i18 = this.zzgj;
        if (i18 != 0) {
            zzg += com.google.android.gms.internal.wearable.zzl.zzk(7) + com.google.android.gms.internal.wearable.zzl.zzm(com.google.android.gms.internal.wearable.zzl.zzn(i18));
        }
        if (this.zzgk) {
            zzg += com.google.android.gms.internal.wearable.zzl.zzk(8) + 1;
        }
        com.google.android.gms.internal.wearable.zzh[] zzhVarArr = this.zzgl;
        int i19 = 0;
        if (zzhVarArr != null && zzhVarArr.length > 0) {
            int i27 = 0;
            while (true) {
                com.google.android.gms.internal.wearable.zzh[] zzhVarArr2 = this.zzgl;
                if (i27 >= zzhVarArr2.length) {
                    break;
                }
                com.google.android.gms.internal.wearable.zzh zzhVar = zzhVarArr2[i27];
                if (zzhVar != null) {
                    zzg += com.google.android.gms.internal.wearable.zzl.zzb(9, zzhVar);
                }
                i27++;
            }
        }
        com.google.android.gms.internal.wearable.zzi[] zziVarArr = this.zzgm;
        if (zziVarArr != null && zziVarArr.length > 0) {
            int i28 = 0;
            while (true) {
                com.google.android.gms.internal.wearable.zzi[] zziVarArr2 = this.zzgm;
                if (i28 >= zziVarArr2.length) {
                    break;
                }
                com.google.android.gms.internal.wearable.zzi zziVar = zziVarArr2[i28];
                if (zziVar != null) {
                    zzg += com.google.android.gms.internal.wearable.zzl.zzb(10, zziVar);
                }
                i28++;
            }
        }
        java.lang.String[] strArr = this.zzgn;
        if (strArr != null && strArr.length > 0) {
            int i29 = 0;
            int i37 = 0;
            int i38 = 0;
            while (true) {
                java.lang.String[] strArr2 = this.zzgn;
                if (i29 >= strArr2.length) {
                    break;
                }
                java.lang.String str2 = strArr2[i29];
                if (str2 != null) {
                    i38++;
                    i37 += com.google.android.gms.internal.wearable.zzl.zzg(str2);
                }
                i29++;
            }
            zzg = zzg + i37 + (i38 * 1);
        }
        long[] jArr2 = this.zzgo;
        if (jArr2 != null && jArr2.length > 0) {
            int i39 = 0;
            while (true) {
                jArr = this.zzgo;
                if (i19 >= jArr.length) {
                    break;
                }
                long j18 = jArr[i19];
                i39 += (j18 & (-128)) == 0 ? 1 : (j18 & (-16384)) == 0 ? 2 : (j18 & (-2097152)) == 0 ? 3 : (j18 & (-268435456)) == 0 ? 4 : (j18 & (-34359738368L)) == 0 ? 5 : (j18 & (-4398046511104L)) == 0 ? 6 : (j18 & (-562949953421312L)) == 0 ? 7 : (j18 & (-72057594037927936L)) == 0 ? 8 : (j18 & Long.MIN_VALUE) == 0 ? 9 : 10;
                i19++;
            }
            zzg = zzg + i39 + (jArr.length * 1);
        }
        long j19 = this.zzgq;
        if (j19 != 0) {
            zzg += com.google.android.gms.internal.wearable.zzl.zzb(13, j19);
        }
        float[] fArr = this.zzgp;
        return (fArr == null || fArr.length <= 0) ? zzg : zzg + (fArr.length * 4) + (fArr.length * 1);
    }

    @Override // com.google.android.gms.internal.wearable.zzn, com.google.android.gms.internal.wearable.zzt
    public final void zza(com.google.android.gms.internal.wearable.zzl zzlVar) {
        if (!java.util.Arrays.equals(this.zzgd, com.google.android.gms.internal.wearable.zzw.zzhy)) {
            byte[] bArr = this.zzgd;
            zzlVar.zzf(1, 2);
            zzlVar.zzl(bArr.length);
            zzlVar.zzc(bArr);
        }
        java.lang.String str = this.zzge;
        if (str != null && !str.equals("")) {
            zzlVar.zza(2, this.zzge);
        }
        if (java.lang.Double.doubleToLongBits(this.zzgf) != java.lang.Double.doubleToLongBits(0.0d)) {
            double d17 = this.zzgf;
            zzlVar.zzf(3, 1);
            zzlVar.zzb(java.lang.Double.doubleToLongBits(d17));
        }
        if (java.lang.Float.floatToIntBits(this.zzgg) != java.lang.Float.floatToIntBits(0.0f)) {
            zzlVar.zza(4, this.zzgg);
        }
        long j17 = this.zzgh;
        if (j17 != 0) {
            zzlVar.zza(5, j17);
        }
        int i17 = this.zzgi;
        if (i17 != 0) {
            zzlVar.zzd(6, i17);
        }
        int i18 = this.zzgj;
        int i19 = 0;
        if (i18 != 0) {
            zzlVar.zzf(7, 0);
            zzlVar.zzl(com.google.android.gms.internal.wearable.zzl.zzn(i18));
        }
        boolean z17 = this.zzgk;
        if (z17) {
            zzlVar.zzf(8, 0);
            zzlVar.zza(z17 ? (byte) 1 : (byte) 0);
        }
        com.google.android.gms.internal.wearable.zzh[] zzhVarArr = this.zzgl;
        if (zzhVarArr != null && zzhVarArr.length > 0) {
            int i27 = 0;
            while (true) {
                com.google.android.gms.internal.wearable.zzh[] zzhVarArr2 = this.zzgl;
                if (i27 >= zzhVarArr2.length) {
                    break;
                }
                com.google.android.gms.internal.wearable.zzh zzhVar = zzhVarArr2[i27];
                if (zzhVar != null) {
                    zzlVar.zza(9, zzhVar);
                }
                i27++;
            }
        }
        com.google.android.gms.internal.wearable.zzi[] zziVarArr = this.zzgm;
        if (zziVarArr != null && zziVarArr.length > 0) {
            int i28 = 0;
            while (true) {
                com.google.android.gms.internal.wearable.zzi[] zziVarArr2 = this.zzgm;
                if (i28 >= zziVarArr2.length) {
                    break;
                }
                com.google.android.gms.internal.wearable.zzi zziVar = zziVarArr2[i28];
                if (zziVar != null) {
                    zzlVar.zza(10, zziVar);
                }
                i28++;
            }
        }
        java.lang.String[] strArr = this.zzgn;
        if (strArr != null && strArr.length > 0) {
            int i29 = 0;
            while (true) {
                java.lang.String[] strArr2 = this.zzgn;
                if (i29 >= strArr2.length) {
                    break;
                }
                java.lang.String str2 = strArr2[i29];
                if (str2 != null) {
                    zzlVar.zza(11, str2);
                }
                i29++;
            }
        }
        long[] jArr = this.zzgo;
        if (jArr != null && jArr.length > 0) {
            int i37 = 0;
            while (true) {
                long[] jArr2 = this.zzgo;
                if (i37 >= jArr2.length) {
                    break;
                }
                zzlVar.zza(12, jArr2[i37]);
                i37++;
            }
        }
        long j18 = this.zzgq;
        if (j18 != 0) {
            zzlVar.zza(13, j18);
        }
        float[] fArr = this.zzgp;
        if (fArr != null && fArr.length > 0) {
            while (true) {
                float[] fArr2 = this.zzgp;
                if (i19 >= fArr2.length) {
                    break;
                }
                zzlVar.zza(14, fArr2[i19]);
                i19++;
            }
        }
        super.zza(zzlVar);
    }
}

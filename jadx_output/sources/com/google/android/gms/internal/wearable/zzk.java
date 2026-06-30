package com.google.android.gms.internal.wearable;

/* loaded from: classes16.dex */
public final class zzk {
    private final byte[] buffer;
    private final int zzgr;
    private final int zzgs;
    private int zzgt;
    private int zzgu;
    private int zzgv;
    private int zzgw;
    private int zzgy;
    private int zzgx = Integer.MAX_VALUE;
    private int zzgz = 64;
    private int zzha = 67108864;

    private zzk(byte[] bArr, int i17, int i18) {
        this.buffer = bArr;
        this.zzgr = i17;
        int i19 = i18 + i17;
        this.zzgt = i19;
        this.zzgs = i19;
        this.zzgv = i17;
    }

    public static com.google.android.gms.internal.wearable.zzk zza(byte[] bArr, int i17, int i18) {
        return new com.google.android.gms.internal.wearable.zzk(bArr, 0, i18);
    }

    private final void zzh(int i17) {
        if (i17 < 0) {
            throw com.google.android.gms.internal.wearable.zzs.zzv();
        }
        int i18 = this.zzgv;
        int i19 = i18 + i17;
        int i27 = this.zzgx;
        if (i19 > i27) {
            zzh(i27 - i18);
            throw com.google.android.gms.internal.wearable.zzs.zzu();
        }
        if (i17 > this.zzgt - i18) {
            throw com.google.android.gms.internal.wearable.zzs.zzu();
        }
        this.zzgv = i18 + i17;
    }

    private final void zzo() {
        int i17 = this.zzgt + this.zzgu;
        this.zzgt = i17;
        int i18 = this.zzgx;
        if (i17 <= i18) {
            this.zzgu = 0;
            return;
        }
        int i19 = i17 - i18;
        this.zzgu = i19;
        this.zzgt = i17 - i19;
    }

    private final byte zzq() {
        int i17 = this.zzgv;
        if (i17 == this.zzgt) {
            throw com.google.android.gms.internal.wearable.zzs.zzu();
        }
        byte[] bArr = this.buffer;
        this.zzgv = i17 + 1;
        return bArr[i17];
    }

    public final int getPosition() {
        return this.zzgv - this.zzgr;
    }

    public final byte[] readBytes() {
        int zzk = zzk();
        if (zzk < 0) {
            throw com.google.android.gms.internal.wearable.zzs.zzv();
        }
        if (zzk == 0) {
            return com.google.android.gms.internal.wearable.zzw.zzhy;
        }
        int i17 = this.zzgt;
        int i18 = this.zzgv;
        if (zzk > i17 - i18) {
            throw com.google.android.gms.internal.wearable.zzs.zzu();
        }
        byte[] bArr = new byte[zzk];
        java.lang.System.arraycopy(this.buffer, i18, bArr, 0, zzk);
        this.zzgv += zzk;
        return bArr;
    }

    public final java.lang.String readString() {
        int zzk = zzk();
        if (zzk < 0) {
            throw com.google.android.gms.internal.wearable.zzs.zzv();
        }
        int i17 = this.zzgt;
        int i18 = this.zzgv;
        if (zzk > i17 - i18) {
            throw com.google.android.gms.internal.wearable.zzs.zzu();
        }
        java.lang.String str = new java.lang.String(this.buffer, i18, zzk, com.google.android.gms.internal.wearable.zzr.UTF_8);
        this.zzgv += zzk;
        return str;
    }

    public final byte[] zzb(int i17, int i18) {
        if (i18 == 0) {
            return com.google.android.gms.internal.wearable.zzw.zzhy;
        }
        byte[] bArr = new byte[i18];
        java.lang.System.arraycopy(this.buffer, this.zzgr + i17, bArr, 0, i18);
        return bArr;
    }

    public final void zzc(int i17) {
        if (this.zzgw != i17) {
            throw new com.google.android.gms.internal.wearable.zzs("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final boolean zzd(int i17) {
        int zzj;
        int i18 = i17 & 7;
        if (i18 == 0) {
            zzk();
            return true;
        }
        if (i18 == 1) {
            zzn();
            return true;
        }
        if (i18 == 2) {
            zzh(zzk());
            return true;
        }
        if (i18 != 3) {
            if (i18 == 4) {
                return false;
            }
            if (i18 != 5) {
                throw new com.google.android.gms.internal.wearable.zzs("Protocol message tag had invalid wire type.");
            }
            zzm();
            return true;
        }
        do {
            zzj = zzj();
            if (zzj == 0) {
                break;
            }
        } while (zzd(zzj));
        zzc(((i17 >>> 3) << 3) | 4);
        return true;
    }

    public final int zze(int i17) {
        if (i17 < 0) {
            throw com.google.android.gms.internal.wearable.zzs.zzv();
        }
        int i18 = i17 + this.zzgv;
        int i19 = this.zzgx;
        if (i18 > i19) {
            throw com.google.android.gms.internal.wearable.zzs.zzu();
        }
        this.zzgx = i18;
        zzo();
        return i19;
    }

    public final void zzf(int i17) {
        this.zzgx = i17;
        zzo();
    }

    public final void zzg(int i17) {
        zzc(i17, this.zzgw);
    }

    public final int zzj() {
        if (this.zzgv == this.zzgt) {
            this.zzgw = 0;
            return 0;
        }
        int zzk = zzk();
        this.zzgw = zzk;
        if (zzk != 0) {
            return zzk;
        }
        throw new com.google.android.gms.internal.wearable.zzs("Protocol message contained an invalid tag (zero).");
    }

    public final int zzk() {
        int i17;
        byte zzq = zzq();
        if (zzq >= 0) {
            return zzq;
        }
        int i18 = zzq & Byte.MAX_VALUE;
        byte zzq2 = zzq();
        if (zzq2 >= 0) {
            i17 = zzq2 << 7;
        } else {
            i18 |= (zzq2 & Byte.MAX_VALUE) << 7;
            byte zzq3 = zzq();
            if (zzq3 >= 0) {
                i17 = zzq3 << 14;
            } else {
                i18 |= (zzq3 & Byte.MAX_VALUE) << 14;
                byte zzq4 = zzq();
                if (zzq4 < 0) {
                    int i19 = i18 | ((zzq4 & Byte.MAX_VALUE) << 21);
                    byte zzq5 = zzq();
                    int i27 = i19 | (zzq5 << 28);
                    if (zzq5 >= 0) {
                        return i27;
                    }
                    for (int i28 = 0; i28 < 5; i28++) {
                        if (zzq() >= 0) {
                            return i27;
                        }
                    }
                    throw com.google.android.gms.internal.wearable.zzs.zzw();
                }
                i17 = zzq4 << 21;
            }
        }
        return i18 | i17;
    }

    public final long zzl() {
        long j17 = 0;
        for (int i17 = 0; i17 < 64; i17 += 7) {
            j17 |= (r3 & Byte.MAX_VALUE) << i17;
            if ((zzq() & 128) == 0) {
                return j17;
            }
        }
        throw com.google.android.gms.internal.wearable.zzs.zzw();
    }

    public final int zzm() {
        return (zzq() & 255) | ((zzq() & 255) << 8) | ((zzq() & 255) << 16) | ((zzq() & 255) << 24);
    }

    public final long zzn() {
        return ((zzq() & 255) << 8) | (zzq() & 255) | ((zzq() & 255) << 16) | ((zzq() & 255) << 24) | ((zzq() & 255) << 32) | ((zzq() & 255) << 40) | ((zzq() & 255) << 48) | ((zzq() & 255) << 56);
    }

    public final int zzp() {
        int i17 = this.zzgx;
        if (i17 == Integer.MAX_VALUE) {
            return -1;
        }
        return i17 - this.zzgv;
    }

    public final void zza(com.google.android.gms.internal.wearable.zzt zztVar) {
        int zzk = zzk();
        if (this.zzgy >= this.zzgz) {
            throw new com.google.android.gms.internal.wearable.zzs("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int zze = zze(zzk);
        this.zzgy++;
        zztVar.zza(this);
        zzc(0);
        this.zzgy--;
        zzf(zze);
    }

    public final void zzc(int i17, int i18) {
        int i19 = this.zzgv;
        int i27 = this.zzgr;
        if (i17 > i19 - i27) {
            int i28 = this.zzgv - this.zzgr;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(50);
            sb6.append("Position ");
            sb6.append(i17);
            sb6.append(" is beyond current ");
            sb6.append(i28);
            throw new java.lang.IllegalArgumentException(sb6.toString());
        }
        if (i17 >= 0) {
            this.zzgv = i27 + i17;
            this.zzgw = i18;
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(24);
            sb7.append("Bad position ");
            sb7.append(i17);
            throw new java.lang.IllegalArgumentException(sb7.toString());
        }
    }
}

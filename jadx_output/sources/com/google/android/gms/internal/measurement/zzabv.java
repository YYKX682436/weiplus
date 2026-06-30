package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zzabv {
    private final byte[] buffer;
    private int zzbri;
    private final int zzbwp;
    private final int zzbwq;
    private int zzbwr;
    private int zzbws;
    private int zzbwt;
    private int zzbwu;
    private int zzbrk = Integer.MAX_VALUE;
    private int zzbrd = 64;
    private int zzbre = 67108864;

    private zzabv(byte[] bArr, int i17, int i18) {
        this.buffer = bArr;
        this.zzbwp = i17;
        int i19 = i18 + i17;
        this.zzbwr = i19;
        this.zzbwq = i19;
        this.zzbws = i17;
    }

    public static com.google.android.gms.internal.measurement.zzabv zza(byte[] bArr, int i17, int i18) {
        return new com.google.android.gms.internal.measurement.zzabv(bArr, 0, i18);
    }

    private final void zzan(int i17) {
        if (i17 < 0) {
            throw com.google.android.gms.internal.measurement.zzacd.zzvi();
        }
        int i18 = this.zzbws;
        int i19 = i18 + i17;
        int i27 = this.zzbrk;
        if (i19 > i27) {
            zzan(i27 - i18);
            throw com.google.android.gms.internal.measurement.zzacd.zzvh();
        }
        if (i17 > this.zzbwr - i18) {
            throw com.google.android.gms.internal.measurement.zzacd.zzvh();
        }
        this.zzbws = i18 + i17;
    }

    public static com.google.android.gms.internal.measurement.zzabv zzi(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    private final void zzta() {
        int i17 = this.zzbwr + this.zzbri;
        this.zzbwr = i17;
        int i18 = this.zzbrk;
        if (i17 <= i18) {
            this.zzbri = 0;
            return;
        }
        int i19 = i17 - i18;
        this.zzbri = i19;
        this.zzbwr = i17 - i19;
    }

    private final byte zzvd() {
        int i17 = this.zzbws;
        if (i17 == this.zzbwr) {
            throw com.google.android.gms.internal.measurement.zzacd.zzvh();
        }
        byte[] bArr = this.buffer;
        this.zzbws = i17 + 1;
        return bArr[i17];
    }

    public final int getPosition() {
        return this.zzbws - this.zzbwp;
    }

    public final java.lang.String readString() {
        int zzuy = zzuy();
        if (zzuy < 0) {
            throw com.google.android.gms.internal.measurement.zzacd.zzvi();
        }
        int i17 = this.zzbwr;
        int i18 = this.zzbws;
        if (zzuy > i17 - i18) {
            throw com.google.android.gms.internal.measurement.zzacd.zzvh();
        }
        java.lang.String str = new java.lang.String(this.buffer, i18, zzuy, com.google.android.gms.internal.measurement.zzacc.UTF_8);
        this.zzbws += zzuy;
        return str;
    }

    public final int zzaf(int i17) {
        if (i17 < 0) {
            throw com.google.android.gms.internal.measurement.zzacd.zzvi();
        }
        int i18 = i17 + this.zzbws;
        int i19 = this.zzbrk;
        if (i18 > i19) {
            throw com.google.android.gms.internal.measurement.zzacd.zzvh();
        }
        this.zzbrk = i18;
        zzta();
        return i19;
    }

    public final void zzaj(int i17) {
        if (this.zzbwt != i17) {
            throw new com.google.android.gms.internal.measurement.zzacd("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final boolean zzak(int i17) {
        int zzuw;
        int i18 = i17 & 7;
        if (i18 == 0) {
            zzuy();
            return true;
        }
        if (i18 == 1) {
            zzvb();
            return true;
        }
        if (i18 == 2) {
            zzan(zzuy());
            return true;
        }
        if (i18 != 3) {
            if (i18 == 4) {
                return false;
            }
            if (i18 != 5) {
                throw new com.google.android.gms.internal.measurement.zzacd("Protocol message tag had invalid wire type.");
            }
            zzva();
            return true;
        }
        do {
            zzuw = zzuw();
            if (zzuw == 0) {
                break;
            }
        } while (zzak(zzuw));
        zzaj(((i17 >>> 3) << 3) | 4);
        return true;
    }

    public final void zzal(int i17) {
        this.zzbrk = i17;
        zzta();
    }

    public final void zzam(int i17) {
        zzd(i17, this.zzbwt);
    }

    public final byte[] zzc(int i17, int i18) {
        if (i18 == 0) {
            return com.google.android.gms.internal.measurement.zzach.zzbxs;
        }
        byte[] bArr = new byte[i18];
        java.lang.System.arraycopy(this.buffer, this.zzbwp + i17, bArr, 0, i18);
        return bArr;
    }

    public final void zzd(int i17, int i18) {
        int i19 = this.zzbws;
        int i27 = this.zzbwp;
        if (i17 > i19 - i27) {
            int i28 = this.zzbws - this.zzbwp;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(50);
            sb6.append("Position ");
            sb6.append(i17);
            sb6.append(" is beyond current ");
            sb6.append(i28);
            throw new java.lang.IllegalArgumentException(sb6.toString());
        }
        if (i17 >= 0) {
            this.zzbws = i27 + i17;
            this.zzbwt = i18;
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(24);
            sb7.append("Bad position ");
            sb7.append(i17);
            throw new java.lang.IllegalArgumentException(sb7.toString());
        }
    }

    public final int zzuw() {
        if (this.zzbws == this.zzbwr) {
            this.zzbwt = 0;
            return 0;
        }
        int zzuy = zzuy();
        this.zzbwt = zzuy;
        if (zzuy != 0) {
            return zzuy;
        }
        throw new com.google.android.gms.internal.measurement.zzacd("Protocol message contained an invalid tag (zero).");
    }

    public final boolean zzux() {
        return zzuy() != 0;
    }

    public final int zzuy() {
        int i17;
        byte zzvd = zzvd();
        if (zzvd >= 0) {
            return zzvd;
        }
        int i18 = zzvd & Byte.MAX_VALUE;
        byte zzvd2 = zzvd();
        if (zzvd2 >= 0) {
            i17 = zzvd2 << 7;
        } else {
            i18 |= (zzvd2 & Byte.MAX_VALUE) << 7;
            byte zzvd3 = zzvd();
            if (zzvd3 >= 0) {
                i17 = zzvd3 << 14;
            } else {
                i18 |= (zzvd3 & Byte.MAX_VALUE) << 14;
                byte zzvd4 = zzvd();
                if (zzvd4 < 0) {
                    int i19 = i18 | ((zzvd4 & Byte.MAX_VALUE) << 21);
                    byte zzvd5 = zzvd();
                    int i27 = i19 | (zzvd5 << 28);
                    if (zzvd5 >= 0) {
                        return i27;
                    }
                    for (int i28 = 0; i28 < 5; i28++) {
                        if (zzvd() >= 0) {
                            return i27;
                        }
                    }
                    throw com.google.android.gms.internal.measurement.zzacd.zzvj();
                }
                i17 = zzvd4 << 21;
            }
        }
        return i18 | i17;
    }

    public final long zzuz() {
        long j17 = 0;
        for (int i17 = 0; i17 < 64; i17 += 7) {
            j17 |= (r3 & Byte.MAX_VALUE) << i17;
            if ((zzvd() & 128) == 0) {
                return j17;
            }
        }
        throw com.google.android.gms.internal.measurement.zzacd.zzvj();
    }

    public final int zzva() {
        return (zzvd() & 255) | ((zzvd() & 255) << 8) | ((zzvd() & 255) << 16) | ((zzvd() & 255) << 24);
    }

    public final long zzvb() {
        return ((zzvd() & 255) << 8) | (zzvd() & 255) | ((zzvd() & 255) << 16) | ((zzvd() & 255) << 24) | ((zzvd() & 255) << 32) | ((zzvd() & 255) << 40) | ((zzvd() & 255) << 48) | ((zzvd() & 255) << 56);
    }

    public final int zzvc() {
        int i17 = this.zzbrk;
        if (i17 == Integer.MAX_VALUE) {
            return -1;
        }
        return i17 - this.zzbws;
    }

    public final void zza(com.google.android.gms.internal.measurement.zzace zzaceVar) {
        int zzuy = zzuy();
        if (this.zzbwu >= this.zzbrd) {
            throw com.google.android.gms.internal.measurement.zzacd.zzvk();
        }
        int zzaf = zzaf(zzuy);
        this.zzbwu++;
        zzaceVar.zzb(this);
        zzaj(0);
        this.zzbwu--;
        zzal(zzaf);
    }

    public final void zza(com.google.android.gms.internal.measurement.zzace zzaceVar, int i17) {
        int i18 = this.zzbwu;
        if (i18 >= this.zzbrd) {
            throw com.google.android.gms.internal.measurement.zzacd.zzvk();
        }
        this.zzbwu = i18 + 1;
        zzaceVar.zzb(this);
        zzaj((i17 << 3) | 4);
        this.zzbwu--;
    }
}

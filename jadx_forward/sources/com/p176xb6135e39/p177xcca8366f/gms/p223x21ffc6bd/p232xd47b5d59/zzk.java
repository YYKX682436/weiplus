package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59;

/* loaded from: classes16.dex */
public final class zzk {

    /* renamed from: buffer */
    private final byte[] f7296xaddb9440;

    /* renamed from: zzgr */
    private final int f7297x394c2b;

    /* renamed from: zzgs */
    private final int f7298x394c2c;

    /* renamed from: zzgt */
    private int f7299x394c2d;

    /* renamed from: zzgu */
    private int f7300x394c2e;

    /* renamed from: zzgv */
    private int f7301x394c2f;

    /* renamed from: zzgw */
    private int f7302x394c30;

    /* renamed from: zzgy */
    private int f7304x394c32;

    /* renamed from: zzgx */
    private int f7303x394c31 = Integer.MAX_VALUE;

    /* renamed from: zzgz */
    private int f7305x394c33 = 64;

    /* renamed from: zzha */
    private int f7306x394c39 = 67108864;

    private zzk(byte[] bArr, int i17, int i18) {
        this.f7296xaddb9440 = bArr;
        this.f7297x394c2b = i17;
        int i19 = i18 + i17;
        this.f7299x394c2d = i19;
        this.f7298x394c2c = i19;
        this.f7301x394c2f = i17;
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzk zza(byte[] bArr, int i17, int i18) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzk(bArr, 0, i18);
    }

    private final void zzh(int i17) {
        if (i17 < 0) {
            throw com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzs.zzv();
        }
        int i18 = this.f7301x394c2f;
        int i19 = i18 + i17;
        int i27 = this.f7303x394c31;
        if (i19 > i27) {
            zzh(i27 - i18);
            throw com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzs.zzu();
        }
        if (i17 > this.f7299x394c2d - i18) {
            throw com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzs.zzu();
        }
        this.f7301x394c2f = i18 + i17;
    }

    private final void zzo() {
        int i17 = this.f7299x394c2d + this.f7300x394c2e;
        this.f7299x394c2d = i17;
        int i18 = this.f7303x394c31;
        if (i17 <= i18) {
            this.f7300x394c2e = 0;
            return;
        }
        int i19 = i17 - i18;
        this.f7300x394c2e = i19;
        this.f7299x394c2d = i17 - i19;
    }

    private final byte zzq() {
        int i17 = this.f7301x394c2f;
        if (i17 == this.f7299x394c2d) {
            throw com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzs.zzu();
        }
        byte[] bArr = this.f7296xaddb9440;
        this.f7301x394c2f = i17 + 1;
        return bArr[i17];
    }

    /* renamed from: getPosition */
    public final int m19436xa86cd69f() {
        return this.f7301x394c2f - this.f7297x394c2b;
    }

    /* renamed from: readBytes */
    public final byte[] m19437xbc0c0475() {
        int zzk = zzk();
        if (zzk < 0) {
            throw com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzs.zzv();
        }
        if (zzk == 0) {
            return com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzw.f7334x394c51;
        }
        int i17 = this.f7299x394c2d;
        int i18 = this.f7301x394c2f;
        if (zzk > i17 - i18) {
            throw com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzs.zzu();
        }
        byte[] bArr = new byte[zzk];
        java.lang.System.arraycopy(this.f7296xaddb9440, i18, bArr, 0, zzk);
        this.f7301x394c2f += zzk;
        return bArr;
    }

    /* renamed from: readString */
    public final java.lang.String m19438xe22f9d47() {
        int zzk = zzk();
        if (zzk < 0) {
            throw com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzs.zzv();
        }
        int i17 = this.f7299x394c2d;
        int i18 = this.f7301x394c2f;
        if (zzk > i17 - i18) {
            throw com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzs.zzu();
        }
        java.lang.String str = new java.lang.String(this.f7296xaddb9440, i18, zzk, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzr.f7319x4d50f80);
        this.f7301x394c2f += zzk;
        return str;
    }

    public final byte[] zzb(int i17, int i18) {
        if (i18 == 0) {
            return com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzw.f7334x394c51;
        }
        byte[] bArr = new byte[i18];
        java.lang.System.arraycopy(this.f7296xaddb9440, this.f7297x394c2b + i17, bArr, 0, i18);
        return bArr;
    }

    public final void zzc(int i17) {
        if (this.f7302x394c30 != i17) {
            throw new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzs("Protocol message end-group tag did not match expected tag.");
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
                throw new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzs("Protocol message tag had invalid wire type.");
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
            throw com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzs.zzv();
        }
        int i18 = i17 + this.f7301x394c2f;
        int i19 = this.f7303x394c31;
        if (i18 > i19) {
            throw com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzs.zzu();
        }
        this.f7303x394c31 = i18;
        zzo();
        return i19;
    }

    public final void zzf(int i17) {
        this.f7303x394c31 = i17;
        zzo();
    }

    public final void zzg(int i17) {
        zzc(i17, this.f7302x394c30);
    }

    public final int zzj() {
        if (this.f7301x394c2f == this.f7299x394c2d) {
            this.f7302x394c30 = 0;
            return 0;
        }
        int zzk = zzk();
        this.f7302x394c30 = zzk;
        if (zzk != 0) {
            return zzk;
        }
        throw new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzs("Protocol message contained an invalid tag (zero).");
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
                    throw com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzs.zzw();
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
        throw com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzs.zzw();
    }

    public final int zzm() {
        return (zzq() & 255) | ((zzq() & 255) << 8) | ((zzq() & 255) << 16) | ((zzq() & 255) << 24);
    }

    public final long zzn() {
        return ((zzq() & 255) << 8) | (zzq() & 255) | ((zzq() & 255) << 16) | ((zzq() & 255) << 24) | ((zzq() & 255) << 32) | ((zzq() & 255) << 40) | ((zzq() & 255) << 48) | ((zzq() & 255) << 56);
    }

    public final int zzp() {
        int i17 = this.f7303x394c31;
        if (i17 == Integer.MAX_VALUE) {
            return -1;
        }
        return i17 - this.f7301x394c2f;
    }

    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzt zztVar) {
        int zzk = zzk();
        if (this.f7304x394c32 >= this.f7305x394c33) {
            throw new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzs("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int zze = zze(zzk);
        this.f7304x394c32++;
        zztVar.zza(this);
        zzc(0);
        this.f7304x394c32--;
        zzf(zze);
    }

    public final void zzc(int i17, int i18) {
        int i19 = this.f7301x394c2f;
        int i27 = this.f7297x394c2b;
        if (i17 > i19 - i27) {
            int i28 = this.f7301x394c2f - this.f7297x394c2b;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(50);
            sb6.append("Position ");
            sb6.append(i17);
            sb6.append(" is beyond current ");
            sb6.append(i28);
            throw new java.lang.IllegalArgumentException(sb6.toString());
        }
        if (i17 >= 0) {
            this.f7301x394c2f = i27 + i17;
            this.f7302x394c30 = i18;
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(24);
            sb7.append("Bad position ");
            sb7.append(i17);
            throw new java.lang.IllegalArgumentException(sb7.toString());
        }
    }
}

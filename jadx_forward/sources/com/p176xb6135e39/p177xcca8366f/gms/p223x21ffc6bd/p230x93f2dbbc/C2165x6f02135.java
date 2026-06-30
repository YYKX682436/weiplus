package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzabv */
/* loaded from: classes16.dex */
public final class C2165x6f02135 {

    /* renamed from: buffer */
    private final byte[] f6373xaddb9440;

    /* renamed from: zzbri */
    private int f6376x6f026d9;

    /* renamed from: zzbwp */
    private final int f6378x6f0277b;

    /* renamed from: zzbwq */
    private final int f6379x6f0277c;

    /* renamed from: zzbwr */
    private int f6380x6f0277d;

    /* renamed from: zzbws */
    private int f6381x6f0277e;

    /* renamed from: zzbwt */
    private int f6382x6f0277f;

    /* renamed from: zzbwu */
    private int f6383x6f02780;

    /* renamed from: zzbrk */
    private int f6377x6f026db = Integer.MAX_VALUE;

    /* renamed from: zzbrd */
    private int f6374x6f026d4 = 64;

    /* renamed from: zzbre */
    private int f6375x6f026d5 = 67108864;

    private C2165x6f02135(byte[] bArr, int i17, int i18) {
        this.f6373xaddb9440 = bArr;
        this.f6378x6f0277b = i17;
        int i19 = i18 + i17;
        this.f6380x6f0277d = i19;
        this.f6379x6f0277c = i19;
        this.f6381x6f0277e = i17;
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2165x6f02135 zza(byte[] bArr, int i17, int i18) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2165x6f02135(bArr, 0, i18);
    }

    /* renamed from: zzan */
    private final void m18895x394b6d(int i17) {
        if (i17 < 0) {
            throw com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2173x6f02142.m18948x394df3();
        }
        int i18 = this.f6381x6f0277e;
        int i19 = i18 + i17;
        int i27 = this.f6377x6f026db;
        if (i19 > i27) {
            m18895x394b6d(i27 - i18);
            throw com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2173x6f02142.m18947x394df2();
        }
        if (i17 > this.f6380x6f0277d - i18) {
            throw com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2173x6f02142.m18947x394df2();
        }
        this.f6381x6f0277e = i18 + i17;
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2165x6f02135 zzi(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    /* renamed from: zzta */
    private final void m18896x394dad() {
        int i17 = this.f6380x6f0277d + this.f6376x6f026d9;
        this.f6380x6f0277d = i17;
        int i18 = this.f6377x6f026db;
        if (i17 <= i18) {
            this.f6376x6f026d9 = 0;
            return;
        }
        int i19 = i17 - i18;
        this.f6376x6f026d9 = i19;
        this.f6380x6f0277d = i17 - i19;
    }

    /* renamed from: zzvd */
    private final byte m18897x394dee() {
        int i17 = this.f6381x6f0277e;
        if (i17 == this.f6380x6f0277d) {
            throw com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2173x6f02142.m18947x394df2();
        }
        byte[] bArr = this.f6373xaddb9440;
        this.f6381x6f0277e = i17 + 1;
        return bArr[i17];
    }

    /* renamed from: getPosition */
    public final int m18898xa86cd69f() {
        return this.f6381x6f0277e - this.f6378x6f0277b;
    }

    /* renamed from: readString */
    public final java.lang.String m18899xe22f9d47() {
        int m18907x394de4 = m18907x394de4();
        if (m18907x394de4 < 0) {
            throw com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2173x6f02142.m18948x394df3();
        }
        int i17 = this.f6380x6f0277d;
        int i18 = this.f6381x6f0277e;
        if (m18907x394de4 > i17 - i18) {
            throw com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2173x6f02142.m18947x394df2();
        }
        java.lang.String str = new java.lang.String(this.f6373xaddb9440, i18, m18907x394de4, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2172x6f02141.f6399x4d50f80);
        this.f6381x6f0277e += m18907x394de4;
        return str;
    }

    /* renamed from: zzaf */
    public final int m18900x394b65(int i17) {
        if (i17 < 0) {
            throw com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2173x6f02142.m18948x394df3();
        }
        int i18 = i17 + this.f6381x6f0277e;
        int i19 = this.f6377x6f026db;
        if (i18 > i19) {
            throw com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2173x6f02142.m18947x394df2();
        }
        this.f6377x6f026db = i18;
        m18896x394dad();
        return i19;
    }

    /* renamed from: zzaj */
    public final void m18901x394b69(int i17) {
        if (this.f6382x6f0277f != i17) {
            throw new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2173x6f02142("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* renamed from: zzak */
    public final boolean m18902x394b6a(int i17) {
        int m18905x394de2;
        int i18 = i17 & 7;
        if (i18 == 0) {
            m18907x394de4();
            return true;
        }
        if (i18 == 1) {
            m18910x394dec();
            return true;
        }
        if (i18 == 2) {
            m18895x394b6d(m18907x394de4());
            return true;
        }
        if (i18 != 3) {
            if (i18 == 4) {
                return false;
            }
            if (i18 != 5) {
                throw new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2173x6f02142("Protocol message tag had invalid wire type.");
            }
            m18909x394deb();
            return true;
        }
        do {
            m18905x394de2 = m18905x394de2();
            if (m18905x394de2 == 0) {
                break;
            }
        } while (m18902x394b6a(m18905x394de2));
        m18901x394b69(((i17 >>> 3) << 3) | 4);
        return true;
    }

    /* renamed from: zzal */
    public final void m18903x394b6b(int i17) {
        this.f6377x6f026db = i17;
        m18896x394dad();
    }

    /* renamed from: zzam */
    public final void m18904x394b6c(int i17) {
        zzd(i17, this.f6382x6f0277f);
    }

    public final byte[] zzc(int i17, int i18) {
        if (i18 == 0) {
            return com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2177x6f02146.f6414x6f0279d;
        }
        byte[] bArr = new byte[i18];
        java.lang.System.arraycopy(this.f6373xaddb9440, this.f6378x6f0277b + i17, bArr, 0, i18);
        return bArr;
    }

    public final void zzd(int i17, int i18) {
        int i19 = this.f6381x6f0277e;
        int i27 = this.f6378x6f0277b;
        if (i17 > i19 - i27) {
            int i28 = this.f6381x6f0277e - this.f6378x6f0277b;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(50);
            sb6.append("Position ");
            sb6.append(i17);
            sb6.append(" is beyond current ");
            sb6.append(i28);
            throw new java.lang.IllegalArgumentException(sb6.toString());
        }
        if (i17 >= 0) {
            this.f6381x6f0277e = i27 + i17;
            this.f6382x6f0277f = i18;
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(24);
            sb7.append("Bad position ");
            sb7.append(i17);
            throw new java.lang.IllegalArgumentException(sb7.toString());
        }
    }

    /* renamed from: zzuw */
    public final int m18905x394de2() {
        if (this.f6381x6f0277e == this.f6380x6f0277d) {
            this.f6382x6f0277f = 0;
            return 0;
        }
        int m18907x394de4 = m18907x394de4();
        this.f6382x6f0277f = m18907x394de4;
        if (m18907x394de4 != 0) {
            return m18907x394de4;
        }
        throw new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2173x6f02142("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: zzux */
    public final boolean m18906x394de3() {
        return m18907x394de4() != 0;
    }

    /* renamed from: zzuy */
    public final int m18907x394de4() {
        int i17;
        byte m18897x394dee = m18897x394dee();
        if (m18897x394dee >= 0) {
            return m18897x394dee;
        }
        int i18 = m18897x394dee & Byte.MAX_VALUE;
        byte m18897x394dee2 = m18897x394dee();
        if (m18897x394dee2 >= 0) {
            i17 = m18897x394dee2 << 7;
        } else {
            i18 |= (m18897x394dee2 & Byte.MAX_VALUE) << 7;
            byte m18897x394dee3 = m18897x394dee();
            if (m18897x394dee3 >= 0) {
                i17 = m18897x394dee3 << 14;
            } else {
                i18 |= (m18897x394dee3 & Byte.MAX_VALUE) << 14;
                byte m18897x394dee4 = m18897x394dee();
                if (m18897x394dee4 < 0) {
                    int i19 = i18 | ((m18897x394dee4 & Byte.MAX_VALUE) << 21);
                    byte m18897x394dee5 = m18897x394dee();
                    int i27 = i19 | (m18897x394dee5 << 28);
                    if (m18897x394dee5 >= 0) {
                        return i27;
                    }
                    for (int i28 = 0; i28 < 5; i28++) {
                        if (m18897x394dee() >= 0) {
                            return i27;
                        }
                    }
                    throw com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2173x6f02142.m18949x394df4();
                }
                i17 = m18897x394dee4 << 21;
            }
        }
        return i18 | i17;
    }

    /* renamed from: zzuz */
    public final long m18908x394de5() {
        long j17 = 0;
        for (int i17 = 0; i17 < 64; i17 += 7) {
            j17 |= (r3 & Byte.MAX_VALUE) << i17;
            if ((m18897x394dee() & 128) == 0) {
                return j17;
            }
        }
        throw com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2173x6f02142.m18949x394df4();
    }

    /* renamed from: zzva */
    public final int m18909x394deb() {
        return (m18897x394dee() & 255) | ((m18897x394dee() & 255) << 8) | ((m18897x394dee() & 255) << 16) | ((m18897x394dee() & 255) << 24);
    }

    /* renamed from: zzvb */
    public final long m18910x394dec() {
        return ((m18897x394dee() & 255) << 8) | (m18897x394dee() & 255) | ((m18897x394dee() & 255) << 16) | ((m18897x394dee() & 255) << 24) | ((m18897x394dee() & 255) << 32) | ((m18897x394dee() & 255) << 40) | ((m18897x394dee() & 255) << 48) | ((m18897x394dee() & 255) << 56);
    }

    /* renamed from: zzvc */
    public final int m18911x394ded() {
        int i17 = this.f6377x6f026db;
        if (i17 == Integer.MAX_VALUE) {
            return -1;
        }
        return i17 - this.f6381x6f0277e;
    }

    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143 abstractC2174x6f02143) {
        int m18907x394de4 = m18907x394de4();
        if (this.f6383x6f02780 >= this.f6374x6f026d4) {
            throw com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2173x6f02142.m18950x394df5();
        }
        int m18900x394b65 = m18900x394b65(m18907x394de4);
        this.f6383x6f02780++;
        abstractC2174x6f02143.zzb(this);
        m18901x394b69(0);
        this.f6383x6f02780--;
        m18903x394b6b(m18900x394b65);
    }

    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143 abstractC2174x6f02143, int i17) {
        int i18 = this.f6383x6f02780;
        if (i18 >= this.f6374x6f026d4) {
            throw com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2173x6f02142.m18950x394df5();
        }
        this.f6383x6f02780 = i18 + 1;
        abstractC2174x6f02143.zzb(this);
        m18901x394b69((i17 << 3) | 4);
        this.f6383x6f02780--;
    }
}

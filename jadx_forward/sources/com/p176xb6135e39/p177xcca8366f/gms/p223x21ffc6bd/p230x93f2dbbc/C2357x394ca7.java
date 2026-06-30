package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzkr */
/* loaded from: classes16.dex */
public final class C2357x394ca7 extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2357x394ca7> {

    /* renamed from: zzauk */
    public long[] f7139x6f02377;

    /* renamed from: zzaul */
    public long[] f7140x6f02378;

    public C2357x394ca7() {
        long[] jArr = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2177x6f02146.f6408x6f02797;
        this.f7139x6f02377 = jArr;
        this.f7140x6f02378 = jArr;
        this.f6385x6f02782 = null;
        this.f6401x6f02792 = -1;
    }

    /* renamed from: equals */
    public final boolean m19332xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2357x394ca7)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2357x394ca7 c2357x394ca7 = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2357x394ca7) obj;
        if (!com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2172x6f02141.m18942xb2c87fbf(this.f7139x6f02377, c2357x394ca7.f7139x6f02377) || !com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2172x6f02141.m18942xb2c87fbf(this.f7140x6f02378, c2357x394ca7.f7140x6f02378)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f = this.f6385x6f02782;
        if (c2170x6f0213f != null && !c2170x6f0213f.m18931x7aab3243()) {
            return this.f6385x6f02782.m18929xb2c87fbf(c2357x394ca7.f6385x6f02782);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f2 = c2357x394ca7.f6385x6f02782;
        return c2170x6f0213f2 == null || c2170x6f0213f2.m18931x7aab3243();
    }

    /* renamed from: hashCode */
    public final int m19333x8cdac1b() {
        int m18945x8cdac1b = ((((-1033079889) + com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2172x6f02141.m18945x8cdac1b(this.f7139x6f02377)) * 31) + com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2172x6f02141.m18945x8cdac1b(this.f7140x6f02378)) * 31;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f = this.f6385x6f02782;
        return m18945x8cdac1b + ((c2170x6f0213f == null || c2170x6f0213f.m18931x7aab3243()) ? 0 : this.f6385x6f02782.m18930x8cdac1b());
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143
    public final int zza() {
        long[] jArr;
        int zza = super.zza();
        long[] jArr2 = this.f7139x6f02377;
        int i17 = 0;
        if (jArr2 != null && jArr2.length > 0) {
            int i18 = 0;
            int i19 = 0;
            while (true) {
                jArr = this.f7139x6f02377;
                if (i18 >= jArr.length) {
                    break;
                }
                i19 += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.m18914x394b6e(jArr[i18]);
                i18++;
            }
            zza = zza + i19 + (jArr.length * 1);
        }
        long[] jArr3 = this.f7140x6f02378;
        if (jArr3 == null || jArr3.length <= 0) {
            return zza;
        }
        int i27 = 0;
        while (true) {
            long[] jArr4 = this.f7140x6f02378;
            if (i17 >= jArr4.length) {
                return zza + i27 + (jArr4.length * 1);
            }
            i27 += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.m18914x394b6e(jArr4[i17]);
            i17++;
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143 zzb(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2165x6f02135 c2165x6f02135) {
        int m18900x394b65;
        while (true) {
            int m18905x394de2 = c2165x6f02135.m18905x394de2();
            if (m18905x394de2 == 0) {
                return this;
            }
            if (m18905x394de2 != 8) {
                if (m18905x394de2 == 10) {
                    m18900x394b65 = c2165x6f02135.m18900x394b65(c2165x6f02135.m18907x394de4());
                    int m18898xa86cd69f = c2165x6f02135.m18898xa86cd69f();
                    int i17 = 0;
                    while (c2165x6f02135.m18911x394ded() > 0) {
                        c2165x6f02135.m18908x394de5();
                        i17++;
                    }
                    c2165x6f02135.m18904x394b6c(m18898xa86cd69f);
                    long[] jArr = this.f7139x6f02377;
                    int length = jArr == null ? 0 : jArr.length;
                    int i18 = i17 + length;
                    long[] jArr2 = new long[i18];
                    if (length != 0) {
                        java.lang.System.arraycopy(jArr, 0, jArr2, 0, length);
                    }
                    while (length < i18) {
                        jArr2[length] = c2165x6f02135.m18908x394de5();
                        length++;
                    }
                    this.f7139x6f02377 = jArr2;
                } else if (m18905x394de2 == 16) {
                    int zzb = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2177x6f02146.zzb(c2165x6f02135, 16);
                    long[] jArr3 = this.f7140x6f02378;
                    int length2 = jArr3 == null ? 0 : jArr3.length;
                    int i19 = zzb + length2;
                    long[] jArr4 = new long[i19];
                    if (length2 != 0) {
                        java.lang.System.arraycopy(jArr3, 0, jArr4, 0, length2);
                    }
                    while (length2 < i19 - 1) {
                        jArr4[length2] = c2165x6f02135.m18908x394de5();
                        c2165x6f02135.m18905x394de2();
                        length2++;
                    }
                    jArr4[length2] = c2165x6f02135.m18908x394de5();
                    this.f7140x6f02378 = jArr4;
                } else if (m18905x394de2 == 18) {
                    m18900x394b65 = c2165x6f02135.m18900x394b65(c2165x6f02135.m18907x394de4());
                    int m18898xa86cd69f2 = c2165x6f02135.m18898xa86cd69f();
                    int i27 = 0;
                    while (c2165x6f02135.m18911x394ded() > 0) {
                        c2165x6f02135.m18908x394de5();
                        i27++;
                    }
                    c2165x6f02135.m18904x394b6c(m18898xa86cd69f2);
                    long[] jArr5 = this.f7140x6f02378;
                    int length3 = jArr5 == null ? 0 : jArr5.length;
                    int i28 = i27 + length3;
                    long[] jArr6 = new long[i28];
                    if (length3 != 0) {
                        java.lang.System.arraycopy(jArr5, 0, jArr6, 0, length3);
                    }
                    while (length3 < i28) {
                        jArr6[length3] = c2165x6f02135.m18908x394de5();
                        length3++;
                    }
                    this.f7140x6f02378 = jArr6;
                } else if (!super.zza(c2165x6f02135, m18905x394de2)) {
                    return this;
                }
                c2165x6f02135.m18903x394b6b(m18900x394b65);
            } else {
                int zzb2 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2177x6f02146.zzb(c2165x6f02135, 8);
                long[] jArr7 = this.f7139x6f02377;
                int length4 = jArr7 == null ? 0 : jArr7.length;
                int i29 = zzb2 + length4;
                long[] jArr8 = new long[i29];
                if (length4 != 0) {
                    java.lang.System.arraycopy(jArr7, 0, jArr8, 0, length4);
                }
                while (length4 < i29 - 1) {
                    jArr8[length4] = c2165x6f02135.m18908x394de5();
                    c2165x6f02135.m18905x394de2();
                    length4++;
                }
                jArr8[length4] = c2165x6f02135.m18908x394de5();
                this.f7139x6f02377 = jArr8;
            }
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143
    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136 c2166x6f02136) {
        long[] jArr = this.f7139x6f02377;
        int i17 = 0;
        if (jArr != null && jArr.length > 0) {
            int i18 = 0;
            while (true) {
                long[] jArr2 = this.f7139x6f02377;
                if (i18 >= jArr2.length) {
                    break;
                }
                c2166x6f02136.zza(1, jArr2[i18]);
                i18++;
            }
        }
        long[] jArr3 = this.f7140x6f02378;
        if (jArr3 != null && jArr3.length > 0) {
            while (true) {
                long[] jArr4 = this.f7140x6f02378;
                if (i17 >= jArr4.length) {
                    break;
                }
                c2166x6f02136.zza(2, jArr4[i17]);
                i17++;
            }
        }
        super.zza(c2166x6f02136);
    }
}

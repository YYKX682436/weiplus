package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzkk */
/* loaded from: classes16.dex */
public final class C2350x394ca0 extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2350x394ca0> {

    /* renamed from: zzasp */
    public java.lang.Long f7075x6f0233e = null;

    /* renamed from: zzadm */
    public java.lang.String f7074x6f0216a = null;

    /* renamed from: zzasq */
    private java.lang.Integer f7076x6f0233f = null;

    /* renamed from: zzasr */
    public com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2351x394ca1[] f7077x6f02340 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2351x394ca1.m19315x394cbe();

    /* renamed from: zzass */
    public com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2349x394c9f[] f7078x6f02341 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2349x394c9f.m19310x394cbd();

    /* renamed from: zzast */
    public com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2343x394c99[] f7079x6f02342 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2343x394c99.m19294x394cb9();

    public C2350x394ca0() {
        this.f6385x6f02782 = null;
        this.f6401x6f02792 = -1;
    }

    /* renamed from: equals */
    public final boolean m19313xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2350x394ca0)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2350x394ca0 c2350x394ca0 = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2350x394ca0) obj;
        java.lang.Long l17 = this.f7075x6f0233e;
        if (l17 == null) {
            if (c2350x394ca0.f7075x6f0233e != null) {
                return false;
            }
        } else if (!l17.equals(c2350x394ca0.f7075x6f0233e)) {
            return false;
        }
        java.lang.String str = this.f7074x6f0216a;
        if (str == null) {
            if (c2350x394ca0.f7074x6f0216a != null) {
                return false;
            }
        } else if (!str.equals(c2350x394ca0.f7074x6f0216a)) {
            return false;
        }
        java.lang.Integer num = this.f7076x6f0233f;
        if (num == null) {
            if (c2350x394ca0.f7076x6f0233f != null) {
                return false;
            }
        } else if (!num.equals(c2350x394ca0.f7076x6f0233f)) {
            return false;
        }
        if (!com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2172x6f02141.m18943xb2c87fbf(this.f7077x6f02340, c2350x394ca0.f7077x6f02340) || !com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2172x6f02141.m18943xb2c87fbf(this.f7078x6f02341, c2350x394ca0.f7078x6f02341) || !com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2172x6f02141.m18943xb2c87fbf(this.f7079x6f02342, c2350x394ca0.f7079x6f02342)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f = this.f6385x6f02782;
        if (c2170x6f0213f != null && !c2170x6f0213f.m18931x7aab3243()) {
            return this.f6385x6f02782.m18929xb2c87fbf(c2350x394ca0.f6385x6f02782);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f2 = c2350x394ca0.f6385x6f02782;
        return c2170x6f0213f2 == null || c2170x6f0213f2.m18931x7aab3243();
    }

    /* renamed from: hashCode */
    public final int m19314x8cdac1b() {
        java.lang.Long l17 = this.f7075x6f0233e;
        int i17 = 0;
        int hashCode = ((-1033080106) + (l17 == null ? 0 : l17.hashCode())) * 31;
        java.lang.String str = this.f7074x6f0216a;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Integer num = this.f7076x6f0233f;
        int hashCode3 = (((((((hashCode2 + (num == null ? 0 : num.hashCode())) * 31) + com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2172x6f02141.m18946x8cdac1b(this.f7077x6f02340)) * 31) + com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2172x6f02141.m18946x8cdac1b(this.f7078x6f02341)) * 31) + com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2172x6f02141.m18946x8cdac1b(this.f7079x6f02342)) * 31;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f = this.f6385x6f02782;
        if (c2170x6f0213f != null && !c2170x6f0213f.m18931x7aab3243()) {
            i17 = this.f6385x6f02782.m18930x8cdac1b();
        }
        return hashCode3 + i17;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143
    public final int zza() {
        int zza = super.zza();
        java.lang.Long l17 = this.f7075x6f0233e;
        if (l17 != null) {
            zza += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzc(1, l17.longValue());
        }
        java.lang.String str = this.f7074x6f0216a;
        if (str != null) {
            zza += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzc(2, str);
        }
        java.lang.Integer num = this.f7076x6f0233f;
        if (num != null) {
            zza += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzf(3, num.intValue());
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2351x394ca1[] c2351x394ca1Arr = this.f7077x6f02340;
        int i17 = 0;
        if (c2351x394ca1Arr != null && c2351x394ca1Arr.length > 0) {
            int i18 = 0;
            while (true) {
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2351x394ca1[] c2351x394ca1Arr2 = this.f7077x6f02340;
                if (i18 >= c2351x394ca1Arr2.length) {
                    break;
                }
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2351x394ca1 c2351x394ca1 = c2351x394ca1Arr2[i18];
                if (c2351x394ca1 != null) {
                    zza += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzb(4, c2351x394ca1);
                }
                i18++;
            }
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2349x394c9f[] c2349x394c9fArr = this.f7078x6f02341;
        if (c2349x394c9fArr != null && c2349x394c9fArr.length > 0) {
            int i19 = 0;
            while (true) {
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2349x394c9f[] c2349x394c9fArr2 = this.f7078x6f02341;
                if (i19 >= c2349x394c9fArr2.length) {
                    break;
                }
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2349x394c9f c2349x394c9f = c2349x394c9fArr2[i19];
                if (c2349x394c9f != null) {
                    zza += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzb(5, c2349x394c9f);
                }
                i19++;
            }
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2343x394c99[] c2343x394c99Arr = this.f7079x6f02342;
        if (c2343x394c99Arr != null && c2343x394c99Arr.length > 0) {
            while (true) {
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2343x394c99[] c2343x394c99Arr2 = this.f7079x6f02342;
                if (i17 >= c2343x394c99Arr2.length) {
                    break;
                }
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2343x394c99 c2343x394c99 = c2343x394c99Arr2[i17];
                if (c2343x394c99 != null) {
                    zza += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzb(6, c2343x394c99);
                }
                i17++;
            }
        }
        return zza;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143 zzb(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2165x6f02135 c2165x6f02135) {
        while (true) {
            int m18905x394de2 = c2165x6f02135.m18905x394de2();
            if (m18905x394de2 == 0) {
                return this;
            }
            if (m18905x394de2 == 8) {
                this.f7075x6f0233e = java.lang.Long.valueOf(c2165x6f02135.m18908x394de5());
            } else if (m18905x394de2 == 18) {
                this.f7074x6f0216a = c2165x6f02135.m18899xe22f9d47();
            } else if (m18905x394de2 == 24) {
                this.f7076x6f0233f = java.lang.Integer.valueOf(c2165x6f02135.m18907x394de4());
            } else if (m18905x394de2 == 34) {
                int zzb = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2177x6f02146.zzb(c2165x6f02135, 34);
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2351x394ca1[] c2351x394ca1Arr = this.f7077x6f02340;
                int length = c2351x394ca1Arr == null ? 0 : c2351x394ca1Arr.length;
                int i17 = zzb + length;
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2351x394ca1[] c2351x394ca1Arr2 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2351x394ca1[i17];
                if (length != 0) {
                    java.lang.System.arraycopy(c2351x394ca1Arr, 0, c2351x394ca1Arr2, 0, length);
                }
                while (length < i17 - 1) {
                    com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2351x394ca1 c2351x394ca1 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2351x394ca1();
                    c2351x394ca1Arr2[length] = c2351x394ca1;
                    c2165x6f02135.zza(c2351x394ca1);
                    c2165x6f02135.m18905x394de2();
                    length++;
                }
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2351x394ca1 c2351x394ca12 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2351x394ca1();
                c2351x394ca1Arr2[length] = c2351x394ca12;
                c2165x6f02135.zza(c2351x394ca12);
                this.f7077x6f02340 = c2351x394ca1Arr2;
            } else if (m18905x394de2 == 42) {
                int zzb2 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2177x6f02146.zzb(c2165x6f02135, 42);
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2349x394c9f[] c2349x394c9fArr = this.f7078x6f02341;
                int length2 = c2349x394c9fArr == null ? 0 : c2349x394c9fArr.length;
                int i18 = zzb2 + length2;
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2349x394c9f[] c2349x394c9fArr2 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2349x394c9f[i18];
                if (length2 != 0) {
                    java.lang.System.arraycopy(c2349x394c9fArr, 0, c2349x394c9fArr2, 0, length2);
                }
                while (length2 < i18 - 1) {
                    com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2349x394c9f c2349x394c9f = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2349x394c9f();
                    c2349x394c9fArr2[length2] = c2349x394c9f;
                    c2165x6f02135.zza(c2349x394c9f);
                    c2165x6f02135.m18905x394de2();
                    length2++;
                }
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2349x394c9f c2349x394c9f2 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2349x394c9f();
                c2349x394c9fArr2[length2] = c2349x394c9f2;
                c2165x6f02135.zza(c2349x394c9f2);
                this.f7078x6f02341 = c2349x394c9fArr2;
            } else if (m18905x394de2 == 50) {
                int zzb3 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2177x6f02146.zzb(c2165x6f02135, 50);
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2343x394c99[] c2343x394c99Arr = this.f7079x6f02342;
                int length3 = c2343x394c99Arr == null ? 0 : c2343x394c99Arr.length;
                int i19 = zzb3 + length3;
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2343x394c99[] c2343x394c99Arr2 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2343x394c99[i19];
                if (length3 != 0) {
                    java.lang.System.arraycopy(c2343x394c99Arr, 0, c2343x394c99Arr2, 0, length3);
                }
                while (length3 < i19 - 1) {
                    com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2343x394c99 c2343x394c99 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2343x394c99();
                    c2343x394c99Arr2[length3] = c2343x394c99;
                    c2165x6f02135.zza(c2343x394c99);
                    c2165x6f02135.m18905x394de2();
                    length3++;
                }
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2343x394c99 c2343x394c992 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2343x394c99();
                c2343x394c99Arr2[length3] = c2343x394c992;
                c2165x6f02135.zza(c2343x394c992);
                this.f7079x6f02342 = c2343x394c99Arr2;
            } else if (!super.zza(c2165x6f02135, m18905x394de2)) {
                return this;
            }
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143
    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136 c2166x6f02136) {
        java.lang.Long l17 = this.f7075x6f0233e;
        if (l17 != null) {
            c2166x6f02136.zzb(1, l17.longValue());
        }
        java.lang.String str = this.f7074x6f0216a;
        if (str != null) {
            c2166x6f02136.zzb(2, str);
        }
        java.lang.Integer num = this.f7076x6f0233f;
        if (num != null) {
            c2166x6f02136.zze(3, num.intValue());
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2351x394ca1[] c2351x394ca1Arr = this.f7077x6f02340;
        int i17 = 0;
        if (c2351x394ca1Arr != null && c2351x394ca1Arr.length > 0) {
            int i18 = 0;
            while (true) {
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2351x394ca1[] c2351x394ca1Arr2 = this.f7077x6f02340;
                if (i18 >= c2351x394ca1Arr2.length) {
                    break;
                }
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2351x394ca1 c2351x394ca1 = c2351x394ca1Arr2[i18];
                if (c2351x394ca1 != null) {
                    c2166x6f02136.zza(4, c2351x394ca1);
                }
                i18++;
            }
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2349x394c9f[] c2349x394c9fArr = this.f7078x6f02341;
        if (c2349x394c9fArr != null && c2349x394c9fArr.length > 0) {
            int i19 = 0;
            while (true) {
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2349x394c9f[] c2349x394c9fArr2 = this.f7078x6f02341;
                if (i19 >= c2349x394c9fArr2.length) {
                    break;
                }
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2349x394c9f c2349x394c9f = c2349x394c9fArr2[i19];
                if (c2349x394c9f != null) {
                    c2166x6f02136.zza(5, c2349x394c9f);
                }
                i19++;
            }
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2343x394c99[] c2343x394c99Arr = this.f7079x6f02342;
        if (c2343x394c99Arr != null && c2343x394c99Arr.length > 0) {
            while (true) {
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2343x394c99[] c2343x394c99Arr2 = this.f7079x6f02342;
                if (i17 >= c2343x394c99Arr2.length) {
                    break;
                }
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2343x394c99 c2343x394c99 = c2343x394c99Arr2[i17];
                if (c2343x394c99 != null) {
                    c2166x6f02136.zza(6, c2343x394c99);
                }
                i17++;
            }
        }
        super.zza(c2166x6f02136);
    }
}

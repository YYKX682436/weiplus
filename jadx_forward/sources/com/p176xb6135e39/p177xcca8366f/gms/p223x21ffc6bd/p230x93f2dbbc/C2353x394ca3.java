package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzkn */
/* loaded from: classes16.dex */
public final class C2353x394ca3 extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2353x394ca3> {

    /* renamed from: zzasz */
    private static volatile com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2353x394ca3[] f7088x6f02348;

    /* renamed from: zzata */
    public com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2354x394ca4[] f7091x6f0234e = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2354x394ca4.m19324x394cc1();

    /* renamed from: name */
    public java.lang.String f7090x337a8b = null;

    /* renamed from: zzatb */
    public java.lang.Long f7092x6f0234f = null;

    /* renamed from: zzatc */
    public java.lang.Long f7093x6f02350 = null;

    /* renamed from: count */
    public java.lang.Integer f7089x5a7510f = null;

    public C2353x394ca3() {
        this.f6385x6f02782 = null;
        this.f6401x6f02792 = -1;
    }

    /* renamed from: zzll */
    public static com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2353x394ca3[] m19321x394cc0() {
        if (f7088x6f02348 == null) {
            synchronized (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2172x6f02141.f6400x6f02791) {
                if (f7088x6f02348 == null) {
                    f7088x6f02348 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2353x394ca3[0];
                }
            }
        }
        return f7088x6f02348;
    }

    /* renamed from: equals */
    public final boolean m19322xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2353x394ca3)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2353x394ca3 c2353x394ca3 = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2353x394ca3) obj;
        if (!com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2172x6f02141.m18943xb2c87fbf(this.f7091x6f0234e, c2353x394ca3.f7091x6f0234e)) {
            return false;
        }
        java.lang.String str = this.f7090x337a8b;
        if (str == null) {
            if (c2353x394ca3.f7090x337a8b != null) {
                return false;
            }
        } else if (!str.equals(c2353x394ca3.f7090x337a8b)) {
            return false;
        }
        java.lang.Long l17 = this.f7092x6f0234f;
        if (l17 == null) {
            if (c2353x394ca3.f7092x6f0234f != null) {
                return false;
            }
        } else if (!l17.equals(c2353x394ca3.f7092x6f0234f)) {
            return false;
        }
        java.lang.Long l18 = this.f7093x6f02350;
        if (l18 == null) {
            if (c2353x394ca3.f7093x6f02350 != null) {
                return false;
            }
        } else if (!l18.equals(c2353x394ca3.f7093x6f02350)) {
            return false;
        }
        java.lang.Integer num = this.f7089x5a7510f;
        if (num == null) {
            if (c2353x394ca3.f7089x5a7510f != null) {
                return false;
            }
        } else if (!num.equals(c2353x394ca3.f7089x5a7510f)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f = this.f6385x6f02782;
        if (c2170x6f0213f != null && !c2170x6f0213f.m18931x7aab3243()) {
            return this.f6385x6f02782.m18929xb2c87fbf(c2353x394ca3.f6385x6f02782);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f2 = c2353x394ca3.f6385x6f02782;
        return c2170x6f0213f2 == null || c2170x6f0213f2.m18931x7aab3243();
    }

    /* renamed from: hashCode */
    public final int m19323x8cdac1b() {
        int m18946x8cdac1b = ((-1033080013) + com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2172x6f02141.m18946x8cdac1b(this.f7091x6f0234e)) * 31;
        java.lang.String str = this.f7090x337a8b;
        int i17 = 0;
        int hashCode = (m18946x8cdac1b + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Long l17 = this.f7092x6f0234f;
        int hashCode2 = (hashCode + (l17 == null ? 0 : l17.hashCode())) * 31;
        java.lang.Long l18 = this.f7093x6f02350;
        int hashCode3 = (hashCode2 + (l18 == null ? 0 : l18.hashCode())) * 31;
        java.lang.Integer num = this.f7089x5a7510f;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f = this.f6385x6f02782;
        if (c2170x6f0213f != null && !c2170x6f0213f.m18931x7aab3243()) {
            i17 = this.f6385x6f02782.m18930x8cdac1b();
        }
        return hashCode4 + i17;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143
    public final int zza() {
        int zza = super.zza();
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2354x394ca4[] c2354x394ca4Arr = this.f7091x6f0234e;
        if (c2354x394ca4Arr != null && c2354x394ca4Arr.length > 0) {
            int i17 = 0;
            while (true) {
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2354x394ca4[] c2354x394ca4Arr2 = this.f7091x6f0234e;
                if (i17 >= c2354x394ca4Arr2.length) {
                    break;
                }
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2354x394ca4 c2354x394ca4 = c2354x394ca4Arr2[i17];
                if (c2354x394ca4 != null) {
                    zza += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzb(1, c2354x394ca4);
                }
                i17++;
            }
        }
        java.lang.String str = this.f7090x337a8b;
        if (str != null) {
            zza += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzc(2, str);
        }
        java.lang.Long l17 = this.f7092x6f0234f;
        if (l17 != null) {
            zza += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzc(3, l17.longValue());
        }
        java.lang.Long l18 = this.f7093x6f02350;
        if (l18 != null) {
            zza += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzc(4, l18.longValue());
        }
        java.lang.Integer num = this.f7089x5a7510f;
        return num != null ? zza + com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzf(5, num.intValue()) : zza;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143 zzb(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2165x6f02135 c2165x6f02135) {
        while (true) {
            int m18905x394de2 = c2165x6f02135.m18905x394de2();
            if (m18905x394de2 == 0) {
                return this;
            }
            if (m18905x394de2 == 10) {
                int zzb = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2177x6f02146.zzb(c2165x6f02135, 10);
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2354x394ca4[] c2354x394ca4Arr = this.f7091x6f0234e;
                int length = c2354x394ca4Arr == null ? 0 : c2354x394ca4Arr.length;
                int i17 = zzb + length;
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2354x394ca4[] c2354x394ca4Arr2 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2354x394ca4[i17];
                if (length != 0) {
                    java.lang.System.arraycopy(c2354x394ca4Arr, 0, c2354x394ca4Arr2, 0, length);
                }
                while (length < i17 - 1) {
                    com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2354x394ca4 c2354x394ca4 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2354x394ca4();
                    c2354x394ca4Arr2[length] = c2354x394ca4;
                    c2165x6f02135.zza(c2354x394ca4);
                    c2165x6f02135.m18905x394de2();
                    length++;
                }
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2354x394ca4 c2354x394ca42 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2354x394ca4();
                c2354x394ca4Arr2[length] = c2354x394ca42;
                c2165x6f02135.zza(c2354x394ca42);
                this.f7091x6f0234e = c2354x394ca4Arr2;
            } else if (m18905x394de2 == 18) {
                this.f7090x337a8b = c2165x6f02135.m18899xe22f9d47();
            } else if (m18905x394de2 == 24) {
                this.f7092x6f0234f = java.lang.Long.valueOf(c2165x6f02135.m18908x394de5());
            } else if (m18905x394de2 == 32) {
                this.f7093x6f02350 = java.lang.Long.valueOf(c2165x6f02135.m18908x394de5());
            } else if (m18905x394de2 == 40) {
                this.f7089x5a7510f = java.lang.Integer.valueOf(c2165x6f02135.m18907x394de4());
            } else if (!super.zza(c2165x6f02135, m18905x394de2)) {
                return this;
            }
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143
    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136 c2166x6f02136) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2354x394ca4[] c2354x394ca4Arr = this.f7091x6f0234e;
        if (c2354x394ca4Arr != null && c2354x394ca4Arr.length > 0) {
            int i17 = 0;
            while (true) {
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2354x394ca4[] c2354x394ca4Arr2 = this.f7091x6f0234e;
                if (i17 >= c2354x394ca4Arr2.length) {
                    break;
                }
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2354x394ca4 c2354x394ca4 = c2354x394ca4Arr2[i17];
                if (c2354x394ca4 != null) {
                    c2166x6f02136.zza(1, c2354x394ca4);
                }
                i17++;
            }
        }
        java.lang.String str = this.f7090x337a8b;
        if (str != null) {
            c2166x6f02136.zzb(2, str);
        }
        java.lang.Long l17 = this.f7092x6f0234f;
        if (l17 != null) {
            c2166x6f02136.zzb(3, l17.longValue());
        }
        java.lang.Long l18 = this.f7093x6f02350;
        if (l18 != null) {
            c2166x6f02136.zzb(4, l18.longValue());
        }
        java.lang.Integer num = this.f7089x5a7510f;
        if (num != null) {
            c2166x6f02136.zze(5, num.intValue());
        }
        super.zza(c2166x6f02136);
    }
}

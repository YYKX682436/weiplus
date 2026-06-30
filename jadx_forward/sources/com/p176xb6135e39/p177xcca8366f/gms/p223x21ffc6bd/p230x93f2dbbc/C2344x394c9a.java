package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzke */
/* loaded from: classes16.dex */
public final class C2344x394c9a extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2344x394c9a> {

    /* renamed from: zzaro */
    private static volatile com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2344x394c9a[] f7045x6f0231e;

    /* renamed from: zzarp */
    public java.lang.Integer f7046x6f0231f = null;

    /* renamed from: zzarq */
    public java.lang.String f7047x6f02320 = null;

    /* renamed from: zzarr */
    public com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2345x394c9b[] f7048x6f02321 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2345x394c9b.m19300x394cbb();

    /* renamed from: zzars */
    private java.lang.Boolean f7049x6f02322 = null;

    /* renamed from: zzart */
    public com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2346x394c9c f7050x6f02323 = null;

    public C2344x394c9a() {
        this.f6385x6f02782 = null;
        this.f6401x6f02792 = -1;
    }

    /* renamed from: zzlf */
    public static com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2344x394c9a[] m19297x394cba() {
        if (f7045x6f0231e == null) {
            synchronized (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2172x6f02141.f6400x6f02791) {
                if (f7045x6f0231e == null) {
                    f7045x6f0231e = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2344x394c9a[0];
                }
            }
        }
        return f7045x6f0231e;
    }

    /* renamed from: equals */
    public final boolean m19298xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2344x394c9a)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2344x394c9a c2344x394c9a = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2344x394c9a) obj;
        java.lang.Integer num = this.f7046x6f0231f;
        if (num == null) {
            if (c2344x394c9a.f7046x6f0231f != null) {
                return false;
            }
        } else if (!num.equals(c2344x394c9a.f7046x6f0231f)) {
            return false;
        }
        java.lang.String str = this.f7047x6f02320;
        if (str == null) {
            if (c2344x394c9a.f7047x6f02320 != null) {
                return false;
            }
        } else if (!str.equals(c2344x394c9a.f7047x6f02320)) {
            return false;
        }
        if (!com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2172x6f02141.m18943xb2c87fbf(this.f7048x6f02321, c2344x394c9a.f7048x6f02321)) {
            return false;
        }
        java.lang.Boolean bool = this.f7049x6f02322;
        if (bool == null) {
            if (c2344x394c9a.f7049x6f02322 != null) {
                return false;
            }
        } else if (!bool.equals(c2344x394c9a.f7049x6f02322)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2346x394c9c c2346x394c9c = this.f7050x6f02323;
        if (c2346x394c9c == null) {
            if (c2344x394c9a.f7050x6f02323 != null) {
                return false;
            }
        } else if (!c2346x394c9c.m19303xb2c87fbf(c2344x394c9a.f7050x6f02323)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f = this.f6385x6f02782;
        if (c2170x6f0213f != null && !c2170x6f0213f.m18931x7aab3243()) {
            return this.f6385x6f02782.m18929xb2c87fbf(c2344x394c9a.f6385x6f02782);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f2 = c2344x394c9a.f6385x6f02782;
        return c2170x6f0213f2 == null || c2170x6f0213f2.m18931x7aab3243();
    }

    /* renamed from: hashCode */
    public final int m19299x8cdac1b() {
        java.lang.Integer num = this.f7046x6f0231f;
        int i17 = 0;
        int hashCode = ((-1033080292) + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.String str = this.f7047x6f02320;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2172x6f02141.m18946x8cdac1b(this.f7048x6f02321)) * 31;
        java.lang.Boolean bool = this.f7049x6f02322;
        int hashCode3 = hashCode2 + (bool == null ? 0 : bool.hashCode());
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2346x394c9c c2346x394c9c = this.f7050x6f02323;
        int m19304x8cdac1b = ((hashCode3 * 31) + (c2346x394c9c == null ? 0 : c2346x394c9c.m19304x8cdac1b())) * 31;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f = this.f6385x6f02782;
        if (c2170x6f0213f != null && !c2170x6f0213f.m18931x7aab3243()) {
            i17 = this.f6385x6f02782.m18930x8cdac1b();
        }
        return m19304x8cdac1b + i17;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143
    public final int zza() {
        int zza = super.zza();
        java.lang.Integer num = this.f7046x6f0231f;
        if (num != null) {
            zza += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzf(1, num.intValue());
        }
        java.lang.String str = this.f7047x6f02320;
        if (str != null) {
            zza += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzc(2, str);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2345x394c9b[] c2345x394c9bArr = this.f7048x6f02321;
        if (c2345x394c9bArr != null && c2345x394c9bArr.length > 0) {
            int i17 = 0;
            while (true) {
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2345x394c9b[] c2345x394c9bArr2 = this.f7048x6f02321;
                if (i17 >= c2345x394c9bArr2.length) {
                    break;
                }
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2345x394c9b c2345x394c9b = c2345x394c9bArr2[i17];
                if (c2345x394c9b != null) {
                    zza += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzb(3, c2345x394c9b);
                }
                i17++;
            }
        }
        java.lang.Boolean bool = this.f7049x6f02322;
        if (bool != null) {
            bool.booleanValue();
            zza += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.m18916x394b70(4) + 1;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2346x394c9c c2346x394c9c = this.f7050x6f02323;
        return c2346x394c9c != null ? zza + com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzb(5, c2346x394c9c) : zza;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143 zzb(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2165x6f02135 c2165x6f02135) {
        while (true) {
            int m18905x394de2 = c2165x6f02135.m18905x394de2();
            if (m18905x394de2 == 0) {
                return this;
            }
            if (m18905x394de2 == 8) {
                this.f7046x6f0231f = java.lang.Integer.valueOf(c2165x6f02135.m18907x394de4());
            } else if (m18905x394de2 == 18) {
                this.f7047x6f02320 = c2165x6f02135.m18899xe22f9d47();
            } else if (m18905x394de2 == 26) {
                int zzb = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2177x6f02146.zzb(c2165x6f02135, 26);
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2345x394c9b[] c2345x394c9bArr = this.f7048x6f02321;
                int length = c2345x394c9bArr == null ? 0 : c2345x394c9bArr.length;
                int i17 = zzb + length;
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2345x394c9b[] c2345x394c9bArr2 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2345x394c9b[i17];
                if (length != 0) {
                    java.lang.System.arraycopy(c2345x394c9bArr, 0, c2345x394c9bArr2, 0, length);
                }
                while (length < i17 - 1) {
                    com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2345x394c9b c2345x394c9b = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2345x394c9b();
                    c2345x394c9bArr2[length] = c2345x394c9b;
                    c2165x6f02135.zza(c2345x394c9b);
                    c2165x6f02135.m18905x394de2();
                    length++;
                }
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2345x394c9b c2345x394c9b2 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2345x394c9b();
                c2345x394c9bArr2[length] = c2345x394c9b2;
                c2165x6f02135.zza(c2345x394c9b2);
                this.f7048x6f02321 = c2345x394c9bArr2;
            } else if (m18905x394de2 == 32) {
                this.f7049x6f02322 = java.lang.Boolean.valueOf(c2165x6f02135.m18906x394de3());
            } else if (m18905x394de2 == 42) {
                if (this.f7050x6f02323 == null) {
                    this.f7050x6f02323 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2346x394c9c();
                }
                c2165x6f02135.zza(this.f7050x6f02323);
            } else if (!super.zza(c2165x6f02135, m18905x394de2)) {
                return this;
            }
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143
    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136 c2166x6f02136) {
        java.lang.Integer num = this.f7046x6f0231f;
        if (num != null) {
            c2166x6f02136.zze(1, num.intValue());
        }
        java.lang.String str = this.f7047x6f02320;
        if (str != null) {
            c2166x6f02136.zzb(2, str);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2345x394c9b[] c2345x394c9bArr = this.f7048x6f02321;
        if (c2345x394c9bArr != null && c2345x394c9bArr.length > 0) {
            int i17 = 0;
            while (true) {
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2345x394c9b[] c2345x394c9bArr2 = this.f7048x6f02321;
                if (i17 >= c2345x394c9bArr2.length) {
                    break;
                }
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2345x394c9b c2345x394c9b = c2345x394c9bArr2[i17];
                if (c2345x394c9b != null) {
                    c2166x6f02136.zza(3, c2345x394c9b);
                }
                i17++;
            }
        }
        java.lang.Boolean bool = this.f7049x6f02322;
        if (bool != null) {
            c2166x6f02136.zza(4, bool.booleanValue());
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2346x394c9c c2346x394c9c = this.f7050x6f02323;
        if (c2346x394c9c != null) {
            c2166x6f02136.zza(5, c2346x394c9c);
        }
        super.zza(c2166x6f02136);
    }
}

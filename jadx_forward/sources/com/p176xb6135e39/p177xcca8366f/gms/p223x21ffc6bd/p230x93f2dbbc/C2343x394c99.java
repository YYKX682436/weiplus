package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzkd */
/* loaded from: classes16.dex */
public final class C2343x394c99 extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2343x394c99> {

    /* renamed from: zzark */
    private static volatile com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2343x394c99[] f7041x6f0231a;

    /* renamed from: zzarl */
    public java.lang.Integer f7042x6f0231b = null;

    /* renamed from: zzarm */
    public com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2347x394c9d[] f7043x6f0231c = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2347x394c9d.m19305x394cbc();

    /* renamed from: zzarn */
    public com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2344x394c9a[] f7044x6f0231d = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2344x394c9a.m19297x394cba();

    public C2343x394c99() {
        this.f6385x6f02782 = null;
        this.f6401x6f02792 = -1;
    }

    /* renamed from: zzle */
    public static com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2343x394c99[] m19294x394cb9() {
        if (f7041x6f0231a == null) {
            synchronized (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2172x6f02141.f6400x6f02791) {
                if (f7041x6f0231a == null) {
                    f7041x6f0231a = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2343x394c99[0];
                }
            }
        }
        return f7041x6f0231a;
    }

    /* renamed from: equals */
    public final boolean m19295xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2343x394c99)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2343x394c99 c2343x394c99 = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2343x394c99) obj;
        java.lang.Integer num = this.f7042x6f0231b;
        if (num == null) {
            if (c2343x394c99.f7042x6f0231b != null) {
                return false;
            }
        } else if (!num.equals(c2343x394c99.f7042x6f0231b)) {
            return false;
        }
        if (!com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2172x6f02141.m18943xb2c87fbf(this.f7043x6f0231c, c2343x394c99.f7043x6f0231c) || !com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2172x6f02141.m18943xb2c87fbf(this.f7044x6f0231d, c2343x394c99.f7044x6f0231d)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f = this.f6385x6f02782;
        if (c2170x6f0213f != null && !c2170x6f0213f.m18931x7aab3243()) {
            return this.f6385x6f02782.m18929xb2c87fbf(c2343x394c99.f6385x6f02782);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f2 = c2343x394c99.f6385x6f02782;
        return c2170x6f0213f2 == null || c2170x6f0213f2.m18931x7aab3243();
    }

    /* renamed from: hashCode */
    public final int m19296x8cdac1b() {
        java.lang.Integer num = this.f7042x6f0231b;
        int i17 = 0;
        int hashCode = ((((((-1033080323) + (num == null ? 0 : num.hashCode())) * 31) + com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2172x6f02141.m18946x8cdac1b(this.f7043x6f0231c)) * 31) + com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2172x6f02141.m18946x8cdac1b(this.f7044x6f0231d)) * 31;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f = this.f6385x6f02782;
        if (c2170x6f0213f != null && !c2170x6f0213f.m18931x7aab3243()) {
            i17 = this.f6385x6f02782.m18930x8cdac1b();
        }
        return hashCode + i17;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143
    public final int zza() {
        int zza = super.zza();
        java.lang.Integer num = this.f7042x6f0231b;
        if (num != null) {
            zza += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzf(1, num.intValue());
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2347x394c9d[] c2347x394c9dArr = this.f7043x6f0231c;
        int i17 = 0;
        if (c2347x394c9dArr != null && c2347x394c9dArr.length > 0) {
            int i18 = 0;
            while (true) {
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2347x394c9d[] c2347x394c9dArr2 = this.f7043x6f0231c;
                if (i18 >= c2347x394c9dArr2.length) {
                    break;
                }
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2347x394c9d c2347x394c9d = c2347x394c9dArr2[i18];
                if (c2347x394c9d != null) {
                    zza += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzb(2, c2347x394c9d);
                }
                i18++;
            }
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2344x394c9a[] c2344x394c9aArr = this.f7044x6f0231d;
        if (c2344x394c9aArr != null && c2344x394c9aArr.length > 0) {
            while (true) {
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2344x394c9a[] c2344x394c9aArr2 = this.f7044x6f0231d;
                if (i17 >= c2344x394c9aArr2.length) {
                    break;
                }
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2344x394c9a c2344x394c9a = c2344x394c9aArr2[i17];
                if (c2344x394c9a != null) {
                    zza += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzb(3, c2344x394c9a);
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
                this.f7042x6f0231b = java.lang.Integer.valueOf(c2165x6f02135.m18907x394de4());
            } else if (m18905x394de2 == 18) {
                int zzb = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2177x6f02146.zzb(c2165x6f02135, 18);
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2347x394c9d[] c2347x394c9dArr = this.f7043x6f0231c;
                int length = c2347x394c9dArr == null ? 0 : c2347x394c9dArr.length;
                int i17 = zzb + length;
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2347x394c9d[] c2347x394c9dArr2 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2347x394c9d[i17];
                if (length != 0) {
                    java.lang.System.arraycopy(c2347x394c9dArr, 0, c2347x394c9dArr2, 0, length);
                }
                while (length < i17 - 1) {
                    com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2347x394c9d c2347x394c9d = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2347x394c9d();
                    c2347x394c9dArr2[length] = c2347x394c9d;
                    c2165x6f02135.zza(c2347x394c9d);
                    c2165x6f02135.m18905x394de2();
                    length++;
                }
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2347x394c9d c2347x394c9d2 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2347x394c9d();
                c2347x394c9dArr2[length] = c2347x394c9d2;
                c2165x6f02135.zza(c2347x394c9d2);
                this.f7043x6f0231c = c2347x394c9dArr2;
            } else if (m18905x394de2 == 26) {
                int zzb2 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2177x6f02146.zzb(c2165x6f02135, 26);
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2344x394c9a[] c2344x394c9aArr = this.f7044x6f0231d;
                int length2 = c2344x394c9aArr == null ? 0 : c2344x394c9aArr.length;
                int i18 = zzb2 + length2;
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2344x394c9a[] c2344x394c9aArr2 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2344x394c9a[i18];
                if (length2 != 0) {
                    java.lang.System.arraycopy(c2344x394c9aArr, 0, c2344x394c9aArr2, 0, length2);
                }
                while (length2 < i18 - 1) {
                    com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2344x394c9a c2344x394c9a = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2344x394c9a();
                    c2344x394c9aArr2[length2] = c2344x394c9a;
                    c2165x6f02135.zza(c2344x394c9a);
                    c2165x6f02135.m18905x394de2();
                    length2++;
                }
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2344x394c9a c2344x394c9a2 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2344x394c9a();
                c2344x394c9aArr2[length2] = c2344x394c9a2;
                c2165x6f02135.zza(c2344x394c9a2);
                this.f7044x6f0231d = c2344x394c9aArr2;
            } else if (!super.zza(c2165x6f02135, m18905x394de2)) {
                return this;
            }
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143
    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136 c2166x6f02136) {
        java.lang.Integer num = this.f7042x6f0231b;
        if (num != null) {
            c2166x6f02136.zze(1, num.intValue());
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2347x394c9d[] c2347x394c9dArr = this.f7043x6f0231c;
        int i17 = 0;
        if (c2347x394c9dArr != null && c2347x394c9dArr.length > 0) {
            int i18 = 0;
            while (true) {
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2347x394c9d[] c2347x394c9dArr2 = this.f7043x6f0231c;
                if (i18 >= c2347x394c9dArr2.length) {
                    break;
                }
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2347x394c9d c2347x394c9d = c2347x394c9dArr2[i18];
                if (c2347x394c9d != null) {
                    c2166x6f02136.zza(2, c2347x394c9d);
                }
                i18++;
            }
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2344x394c9a[] c2344x394c9aArr = this.f7044x6f0231d;
        if (c2344x394c9aArr != null && c2344x394c9aArr.length > 0) {
            while (true) {
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2344x394c9a[] c2344x394c9aArr2 = this.f7044x6f0231d;
                if (i17 >= c2344x394c9aArr2.length) {
                    break;
                }
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2344x394c9a c2344x394c9a = c2344x394c9aArr2[i17];
                if (c2344x394c9a != null) {
                    c2166x6f02136.zza(3, c2344x394c9a);
                }
                i17++;
            }
        }
        super.zza(c2166x6f02136);
    }
}

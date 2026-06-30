package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzkm */
/* loaded from: classes16.dex */
public final class C2352x394ca2 extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2352x394ca2> {

    /* renamed from: zzasv */
    private static volatile com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2352x394ca2[] f7083x6f02344;

    /* renamed from: zzarl */
    public java.lang.Integer f7084x6f0231b = null;

    /* renamed from: zzasw */
    public com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2357x394ca7 f7085x6f02345 = null;

    /* renamed from: zzasx */
    public com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2357x394ca7 f7086x6f02346 = null;

    /* renamed from: zzasy */
    public java.lang.Boolean f7087x6f02347 = null;

    public C2352x394ca2() {
        this.f6385x6f02782 = null;
        this.f6401x6f02792 = -1;
    }

    /* renamed from: zzlk */
    public static com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2352x394ca2[] m19318x394cbf() {
        if (f7083x6f02344 == null) {
            synchronized (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2172x6f02141.f6400x6f02791) {
                if (f7083x6f02344 == null) {
                    f7083x6f02344 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2352x394ca2[0];
                }
            }
        }
        return f7083x6f02344;
    }

    /* renamed from: equals */
    public final boolean m19319xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2352x394ca2)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2352x394ca2 c2352x394ca2 = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2352x394ca2) obj;
        java.lang.Integer num = this.f7084x6f0231b;
        if (num == null) {
            if (c2352x394ca2.f7084x6f0231b != null) {
                return false;
            }
        } else if (!num.equals(c2352x394ca2.f7084x6f0231b)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2357x394ca7 c2357x394ca7 = this.f7085x6f02345;
        if (c2357x394ca7 == null) {
            if (c2352x394ca2.f7085x6f02345 != null) {
                return false;
            }
        } else if (!c2357x394ca7.m19332xb2c87fbf(c2352x394ca2.f7085x6f02345)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2357x394ca7 c2357x394ca72 = this.f7086x6f02346;
        if (c2357x394ca72 == null) {
            if (c2352x394ca2.f7086x6f02346 != null) {
                return false;
            }
        } else if (!c2357x394ca72.m19332xb2c87fbf(c2352x394ca2.f7086x6f02346)) {
            return false;
        }
        java.lang.Boolean bool = this.f7087x6f02347;
        if (bool == null) {
            if (c2352x394ca2.f7087x6f02347 != null) {
                return false;
            }
        } else if (!bool.equals(c2352x394ca2.f7087x6f02347)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f = this.f6385x6f02782;
        if (c2170x6f0213f != null && !c2170x6f0213f.m18931x7aab3243()) {
            return this.f6385x6f02782.m18929xb2c87fbf(c2352x394ca2.f6385x6f02782);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f2 = c2352x394ca2.f6385x6f02782;
        return c2170x6f0213f2 == null || c2170x6f0213f2.m18931x7aab3243();
    }

    /* renamed from: hashCode */
    public final int m19320x8cdac1b() {
        java.lang.Integer num = this.f7084x6f0231b;
        int i17 = 0;
        int hashCode = (-1033080044) + (num == null ? 0 : num.hashCode());
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2357x394ca7 c2357x394ca7 = this.f7085x6f02345;
        int m19333x8cdac1b = (hashCode * 31) + (c2357x394ca7 == null ? 0 : c2357x394ca7.m19333x8cdac1b());
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2357x394ca7 c2357x394ca72 = this.f7086x6f02346;
        int m19333x8cdac1b2 = ((m19333x8cdac1b * 31) + (c2357x394ca72 == null ? 0 : c2357x394ca72.m19333x8cdac1b())) * 31;
        java.lang.Boolean bool = this.f7087x6f02347;
        int hashCode2 = (m19333x8cdac1b2 + (bool == null ? 0 : bool.hashCode())) * 31;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f = this.f6385x6f02782;
        if (c2170x6f0213f != null && !c2170x6f0213f.m18931x7aab3243()) {
            i17 = this.f6385x6f02782.m18930x8cdac1b();
        }
        return hashCode2 + i17;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143
    public final int zza() {
        int zza = super.zza();
        java.lang.Integer num = this.f7084x6f0231b;
        if (num != null) {
            zza += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzf(1, num.intValue());
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2357x394ca7 c2357x394ca7 = this.f7085x6f02345;
        if (c2357x394ca7 != null) {
            zza += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzb(2, c2357x394ca7);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2357x394ca7 c2357x394ca72 = this.f7086x6f02346;
        if (c2357x394ca72 != null) {
            zza += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzb(3, c2357x394ca72);
        }
        java.lang.Boolean bool = this.f7087x6f02347;
        if (bool == null) {
            return zza;
        }
        bool.booleanValue();
        return zza + com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.m18916x394b70(4) + 1;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143 zzb(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2165x6f02135 c2165x6f02135) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2357x394ca7 c2357x394ca7;
        while (true) {
            int m18905x394de2 = c2165x6f02135.m18905x394de2();
            if (m18905x394de2 == 0) {
                return this;
            }
            if (m18905x394de2 != 8) {
                if (m18905x394de2 == 18) {
                    if (this.f7085x6f02345 == null) {
                        this.f7085x6f02345 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2357x394ca7();
                    }
                    c2357x394ca7 = this.f7085x6f02345;
                } else if (m18905x394de2 == 26) {
                    if (this.f7086x6f02346 == null) {
                        this.f7086x6f02346 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2357x394ca7();
                    }
                    c2357x394ca7 = this.f7086x6f02346;
                } else if (m18905x394de2 == 32) {
                    this.f7087x6f02347 = java.lang.Boolean.valueOf(c2165x6f02135.m18906x394de3());
                } else if (!super.zza(c2165x6f02135, m18905x394de2)) {
                    return this;
                }
                c2165x6f02135.zza(c2357x394ca7);
            } else {
                this.f7084x6f0231b = java.lang.Integer.valueOf(c2165x6f02135.m18907x394de4());
            }
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143
    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136 c2166x6f02136) {
        java.lang.Integer num = this.f7084x6f0231b;
        if (num != null) {
            c2166x6f02136.zze(1, num.intValue());
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2357x394ca7 c2357x394ca7 = this.f7085x6f02345;
        if (c2357x394ca7 != null) {
            c2166x6f02136.zza(2, c2357x394ca7);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2357x394ca7 c2357x394ca72 = this.f7086x6f02346;
        if (c2357x394ca72 != null) {
            c2166x6f02136.zza(3, c2357x394ca72);
        }
        java.lang.Boolean bool = this.f7087x6f02347;
        if (bool != null) {
            c2166x6f02136.zza(4, bool.booleanValue());
        }
        super.zza(c2166x6f02136);
    }
}

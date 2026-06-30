package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzkl */
/* loaded from: classes16.dex */
public final class C2351x394ca1 extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2351x394ca1> {

    /* renamed from: zzasu */
    private static volatile com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2351x394ca1[] f7080x6f02343;

    /* renamed from: zzny */
    public java.lang.String f7082x394d0b = null;

    /* renamed from: value */
    public java.lang.String f7081x6ac9171 = null;

    public C2351x394ca1() {
        this.f6385x6f02782 = null;
        this.f6401x6f02792 = -1;
    }

    /* renamed from: zzlj */
    public static com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2351x394ca1[] m19315x394cbe() {
        if (f7080x6f02343 == null) {
            synchronized (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2172x6f02141.f6400x6f02791) {
                if (f7080x6f02343 == null) {
                    f7080x6f02343 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2351x394ca1[0];
                }
            }
        }
        return f7080x6f02343;
    }

    /* renamed from: equals */
    public final boolean m19316xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2351x394ca1)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2351x394ca1 c2351x394ca1 = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2351x394ca1) obj;
        java.lang.String str = this.f7082x394d0b;
        if (str == null) {
            if (c2351x394ca1.f7082x394d0b != null) {
                return false;
            }
        } else if (!str.equals(c2351x394ca1.f7082x394d0b)) {
            return false;
        }
        java.lang.String str2 = this.f7081x6ac9171;
        if (str2 == null) {
            if (c2351x394ca1.f7081x6ac9171 != null) {
                return false;
            }
        } else if (!str2.equals(c2351x394ca1.f7081x6ac9171)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f = this.f6385x6f02782;
        if (c2170x6f0213f != null && !c2170x6f0213f.m18931x7aab3243()) {
            return this.f6385x6f02782.m18929xb2c87fbf(c2351x394ca1.f6385x6f02782);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f2 = c2351x394ca1.f6385x6f02782;
        return c2170x6f0213f2 == null || c2170x6f0213f2.m18931x7aab3243();
    }

    /* renamed from: hashCode */
    public final int m19317x8cdac1b() {
        java.lang.String str = this.f7082x394d0b;
        int i17 = 0;
        int hashCode = ((-1033080075) + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f7081x6ac9171;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f = this.f6385x6f02782;
        if (c2170x6f0213f != null && !c2170x6f0213f.m18931x7aab3243()) {
            i17 = this.f6385x6f02782.m18930x8cdac1b();
        }
        return hashCode2 + i17;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143
    public final int zza() {
        int zza = super.zza();
        java.lang.String str = this.f7082x394d0b;
        if (str != null) {
            zza += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzc(1, str);
        }
        java.lang.String str2 = this.f7081x6ac9171;
        return str2 != null ? zza + com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzc(2, str2) : zza;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143 zzb(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2165x6f02135 c2165x6f02135) {
        while (true) {
            int m18905x394de2 = c2165x6f02135.m18905x394de2();
            if (m18905x394de2 == 0) {
                return this;
            }
            if (m18905x394de2 == 10) {
                this.f7082x394d0b = c2165x6f02135.m18899xe22f9d47();
            } else if (m18905x394de2 == 18) {
                this.f7081x6ac9171 = c2165x6f02135.m18899xe22f9d47();
            } else if (!super.zza(c2165x6f02135, m18905x394de2)) {
                return this;
            }
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143
    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136 c2166x6f02136) {
        java.lang.String str = this.f7082x394d0b;
        if (str != null) {
            c2166x6f02136.zzb(1, str);
        }
        java.lang.String str2 = this.f7081x6ac9171;
        if (str2 != null) {
            c2166x6f02136.zzb(2, str2);
        }
        super.zza(c2166x6f02136);
    }
}

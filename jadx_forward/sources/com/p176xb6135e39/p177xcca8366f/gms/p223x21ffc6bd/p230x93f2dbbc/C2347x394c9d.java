package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzkh */
/* loaded from: classes16.dex */
public final class C2347x394c9d extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2347x394c9d> {

    /* renamed from: zzase */
    private static volatile com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2347x394c9d[] f7061x6f02333;

    /* renamed from: zzarp */
    public java.lang.Integer f7062x6f0231f = null;

    /* renamed from: zzasf */
    public java.lang.String f7063x6f02334 = null;

    /* renamed from: zzasg */
    public com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2345x394c9b f7064x6f02335 = null;

    public C2347x394c9d() {
        this.f6385x6f02782 = null;
        this.f6401x6f02792 = -1;
    }

    /* renamed from: zzlh */
    public static com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2347x394c9d[] m19305x394cbc() {
        if (f7061x6f02333 == null) {
            synchronized (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2172x6f02141.f6400x6f02791) {
                if (f7061x6f02333 == null) {
                    f7061x6f02333 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2347x394c9d[0];
                }
            }
        }
        return f7061x6f02333;
    }

    /* renamed from: equals */
    public final boolean m19306xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2347x394c9d)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2347x394c9d c2347x394c9d = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2347x394c9d) obj;
        java.lang.Integer num = this.f7062x6f0231f;
        if (num == null) {
            if (c2347x394c9d.f7062x6f0231f != null) {
                return false;
            }
        } else if (!num.equals(c2347x394c9d.f7062x6f0231f)) {
            return false;
        }
        java.lang.String str = this.f7063x6f02334;
        if (str == null) {
            if (c2347x394c9d.f7063x6f02334 != null) {
                return false;
            }
        } else if (!str.equals(c2347x394c9d.f7063x6f02334)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2345x394c9b c2345x394c9b = this.f7064x6f02335;
        if (c2345x394c9b == null) {
            if (c2347x394c9d.f7064x6f02335 != null) {
                return false;
            }
        } else if (!c2345x394c9b.m19301xb2c87fbf(c2347x394c9d.f7064x6f02335)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f = this.f6385x6f02782;
        if (c2170x6f0213f != null && !c2170x6f0213f.m18931x7aab3243()) {
            return this.f6385x6f02782.m18929xb2c87fbf(c2347x394c9d.f6385x6f02782);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f2 = c2347x394c9d.f6385x6f02782;
        return c2170x6f0213f2 == null || c2170x6f0213f2.m18931x7aab3243();
    }

    /* renamed from: hashCode */
    public final int m19307x8cdac1b() {
        java.lang.Integer num = this.f7062x6f0231f;
        int i17 = 0;
        int hashCode = ((-1033080199) + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.String str = this.f7063x6f02334;
        int hashCode2 = hashCode + (str == null ? 0 : str.hashCode());
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2345x394c9b c2345x394c9b = this.f7064x6f02335;
        int m19302x8cdac1b = ((hashCode2 * 31) + (c2345x394c9b == null ? 0 : c2345x394c9b.m19302x8cdac1b())) * 31;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f = this.f6385x6f02782;
        if (c2170x6f0213f != null && !c2170x6f0213f.m18931x7aab3243()) {
            i17 = this.f6385x6f02782.m18930x8cdac1b();
        }
        return m19302x8cdac1b + i17;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143
    public final int zza() {
        int zza = super.zza();
        java.lang.Integer num = this.f7062x6f0231f;
        if (num != null) {
            zza += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzf(1, num.intValue());
        }
        java.lang.String str = this.f7063x6f02334;
        if (str != null) {
            zza += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzc(2, str);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2345x394c9b c2345x394c9b = this.f7064x6f02335;
        return c2345x394c9b != null ? zza + com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzb(3, c2345x394c9b) : zza;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143 zzb(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2165x6f02135 c2165x6f02135) {
        while (true) {
            int m18905x394de2 = c2165x6f02135.m18905x394de2();
            if (m18905x394de2 == 0) {
                return this;
            }
            if (m18905x394de2 == 8) {
                this.f7062x6f0231f = java.lang.Integer.valueOf(c2165x6f02135.m18907x394de4());
            } else if (m18905x394de2 == 18) {
                this.f7063x6f02334 = c2165x6f02135.m18899xe22f9d47();
            } else if (m18905x394de2 == 26) {
                if (this.f7064x6f02335 == null) {
                    this.f7064x6f02335 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2345x394c9b();
                }
                c2165x6f02135.zza(this.f7064x6f02335);
            } else if (!super.zza(c2165x6f02135, m18905x394de2)) {
                return this;
            }
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143
    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136 c2166x6f02136) {
        java.lang.Integer num = this.f7062x6f0231f;
        if (num != null) {
            c2166x6f02136.zze(1, num.intValue());
        }
        java.lang.String str = this.f7063x6f02334;
        if (str != null) {
            c2166x6f02136.zzb(2, str);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2345x394c9b c2345x394c9b = this.f7064x6f02335;
        if (c2345x394c9b != null) {
            c2166x6f02136.zza(3, c2345x394c9b);
        }
        super.zza(c2166x6f02136);
    }
}

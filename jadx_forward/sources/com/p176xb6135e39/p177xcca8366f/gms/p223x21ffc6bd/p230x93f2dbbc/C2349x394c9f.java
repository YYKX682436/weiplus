package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzkj */
/* loaded from: classes16.dex */
public final class C2349x394c9f extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2349x394c9f> {

    /* renamed from: zzasl */
    private static volatile com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2349x394c9f[] f7069x6f0233a;

    /* renamed from: name */
    public java.lang.String f7070x337a8b = null;

    /* renamed from: zzasm */
    public java.lang.Boolean f7071x6f0233b = null;

    /* renamed from: zzasn */
    public java.lang.Boolean f7072x6f0233c = null;

    /* renamed from: zzaso */
    public java.lang.Integer f7073x6f0233d = null;

    public C2349x394c9f() {
        this.f6385x6f02782 = null;
        this.f6401x6f02792 = -1;
    }

    /* renamed from: zzli */
    public static com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2349x394c9f[] m19310x394cbd() {
        if (f7069x6f0233a == null) {
            synchronized (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2172x6f02141.f6400x6f02791) {
                if (f7069x6f0233a == null) {
                    f7069x6f0233a = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2349x394c9f[0];
                }
            }
        }
        return f7069x6f0233a;
    }

    /* renamed from: equals */
    public final boolean m19311xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2349x394c9f)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2349x394c9f c2349x394c9f = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2349x394c9f) obj;
        java.lang.String str = this.f7070x337a8b;
        if (str == null) {
            if (c2349x394c9f.f7070x337a8b != null) {
                return false;
            }
        } else if (!str.equals(c2349x394c9f.f7070x337a8b)) {
            return false;
        }
        java.lang.Boolean bool = this.f7071x6f0233b;
        if (bool == null) {
            if (c2349x394c9f.f7071x6f0233b != null) {
                return false;
            }
        } else if (!bool.equals(c2349x394c9f.f7071x6f0233b)) {
            return false;
        }
        java.lang.Boolean bool2 = this.f7072x6f0233c;
        if (bool2 == null) {
            if (c2349x394c9f.f7072x6f0233c != null) {
                return false;
            }
        } else if (!bool2.equals(c2349x394c9f.f7072x6f0233c)) {
            return false;
        }
        java.lang.Integer num = this.f7073x6f0233d;
        if (num == null) {
            if (c2349x394c9f.f7073x6f0233d != null) {
                return false;
            }
        } else if (!num.equals(c2349x394c9f.f7073x6f0233d)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f = this.f6385x6f02782;
        if (c2170x6f0213f != null && !c2170x6f0213f.m18931x7aab3243()) {
            return this.f6385x6f02782.m18929xb2c87fbf(c2349x394c9f.f6385x6f02782);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f2 = c2349x394c9f.f6385x6f02782;
        return c2170x6f0213f2 == null || c2170x6f0213f2.m18931x7aab3243();
    }

    /* renamed from: hashCode */
    public final int m19312x8cdac1b() {
        java.lang.String str = this.f7070x337a8b;
        int i17 = 0;
        int hashCode = ((-1033080137) + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Boolean bool = this.f7071x6f0233b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        java.lang.Boolean bool2 = this.f7072x6f0233c;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        java.lang.Integer num = this.f7073x6f0233d;
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
        java.lang.String str = this.f7070x337a8b;
        if (str != null) {
            zza += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzc(1, str);
        }
        java.lang.Boolean bool = this.f7071x6f0233b;
        if (bool != null) {
            bool.booleanValue();
            zza += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.m18916x394b70(2) + 1;
        }
        java.lang.Boolean bool2 = this.f7072x6f0233c;
        if (bool2 != null) {
            bool2.booleanValue();
            zza += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.m18916x394b70(3) + 1;
        }
        java.lang.Integer num = this.f7073x6f0233d;
        return num != null ? zza + com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzf(4, num.intValue()) : zza;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143 zzb(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2165x6f02135 c2165x6f02135) {
        while (true) {
            int m18905x394de2 = c2165x6f02135.m18905x394de2();
            if (m18905x394de2 == 0) {
                return this;
            }
            if (m18905x394de2 == 10) {
                this.f7070x337a8b = c2165x6f02135.m18899xe22f9d47();
            } else if (m18905x394de2 == 16) {
                this.f7071x6f0233b = java.lang.Boolean.valueOf(c2165x6f02135.m18906x394de3());
            } else if (m18905x394de2 == 24) {
                this.f7072x6f0233c = java.lang.Boolean.valueOf(c2165x6f02135.m18906x394de3());
            } else if (m18905x394de2 == 32) {
                this.f7073x6f0233d = java.lang.Integer.valueOf(c2165x6f02135.m18907x394de4());
            } else if (!super.zza(c2165x6f02135, m18905x394de2)) {
                return this;
            }
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143
    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136 c2166x6f02136) {
        java.lang.String str = this.f7070x337a8b;
        if (str != null) {
            c2166x6f02136.zzb(1, str);
        }
        java.lang.Boolean bool = this.f7071x6f0233b;
        if (bool != null) {
            c2166x6f02136.zza(2, bool.booleanValue());
        }
        java.lang.Boolean bool2 = this.f7072x6f0233c;
        if (bool2 != null) {
            c2166x6f02136.zza(3, bool2.booleanValue());
        }
        java.lang.Integer num = this.f7073x6f0233d;
        if (num != null) {
            c2166x6f02136.zze(4, num.intValue());
        }
        super.zza(c2166x6f02136);
    }
}

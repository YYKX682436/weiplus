package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzko */
/* loaded from: classes16.dex */
public final class C2354x394ca4 extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2354x394ca4> {

    /* renamed from: zzatd */
    private static volatile com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2354x394ca4[] f7094x6f02351;

    /* renamed from: name */
    public java.lang.String f7095x337a8b = null;

    /* renamed from: zzajf */
    public java.lang.String f7096x6f0221d = null;

    /* renamed from: zzate */
    public java.lang.Long f7099x6f02352 = null;

    /* renamed from: zzarb */
    private java.lang.Float f7097x6f02311 = null;

    /* renamed from: zzarc */
    public java.lang.Double f7098x6f02312 = null;

    public C2354x394ca4() {
        this.f6385x6f02782 = null;
        this.f6401x6f02792 = -1;
    }

    /* renamed from: zzlm */
    public static com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2354x394ca4[] m19324x394cc1() {
        if (f7094x6f02351 == null) {
            synchronized (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2172x6f02141.f6400x6f02791) {
                if (f7094x6f02351 == null) {
                    f7094x6f02351 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2354x394ca4[0];
                }
            }
        }
        return f7094x6f02351;
    }

    /* renamed from: equals */
    public final boolean m19325xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2354x394ca4)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2354x394ca4 c2354x394ca4 = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2354x394ca4) obj;
        java.lang.String str = this.f7095x337a8b;
        if (str == null) {
            if (c2354x394ca4.f7095x337a8b != null) {
                return false;
            }
        } else if (!str.equals(c2354x394ca4.f7095x337a8b)) {
            return false;
        }
        java.lang.String str2 = this.f7096x6f0221d;
        if (str2 == null) {
            if (c2354x394ca4.f7096x6f0221d != null) {
                return false;
            }
        } else if (!str2.equals(c2354x394ca4.f7096x6f0221d)) {
            return false;
        }
        java.lang.Long l17 = this.f7099x6f02352;
        if (l17 == null) {
            if (c2354x394ca4.f7099x6f02352 != null) {
                return false;
            }
        } else if (!l17.equals(c2354x394ca4.f7099x6f02352)) {
            return false;
        }
        java.lang.Float f17 = this.f7097x6f02311;
        if (f17 == null) {
            if (c2354x394ca4.f7097x6f02311 != null) {
                return false;
            }
        } else if (!f17.equals(c2354x394ca4.f7097x6f02311)) {
            return false;
        }
        java.lang.Double d17 = this.f7098x6f02312;
        if (d17 == null) {
            if (c2354x394ca4.f7098x6f02312 != null) {
                return false;
            }
        } else if (!d17.equals(c2354x394ca4.f7098x6f02312)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f = this.f6385x6f02782;
        if (c2170x6f0213f != null && !c2170x6f0213f.m18931x7aab3243()) {
            return this.f6385x6f02782.m18929xb2c87fbf(c2354x394ca4.f6385x6f02782);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f2 = c2354x394ca4.f6385x6f02782;
        return c2170x6f0213f2 == null || c2170x6f0213f2.m18931x7aab3243();
    }

    /* renamed from: hashCode */
    public final int m19326x8cdac1b() {
        java.lang.String str = this.f7095x337a8b;
        int i17 = 0;
        int hashCode = ((-1033079982) + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f7096x6f0221d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.Long l17 = this.f7099x6f02352;
        int hashCode3 = (hashCode2 + (l17 == null ? 0 : l17.hashCode())) * 31;
        java.lang.Float f17 = this.f7097x6f02311;
        int hashCode4 = (hashCode3 + (f17 == null ? 0 : f17.hashCode())) * 31;
        java.lang.Double d17 = this.f7098x6f02312;
        int hashCode5 = (hashCode4 + (d17 == null ? 0 : d17.hashCode())) * 31;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f = this.f6385x6f02782;
        if (c2170x6f0213f != null && !c2170x6f0213f.m18931x7aab3243()) {
            i17 = this.f6385x6f02782.m18930x8cdac1b();
        }
        return hashCode5 + i17;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143
    public final int zza() {
        int zza = super.zza();
        java.lang.String str = this.f7095x337a8b;
        if (str != null) {
            zza += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzc(1, str);
        }
        java.lang.String str2 = this.f7096x6f0221d;
        if (str2 != null) {
            zza += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzc(2, str2);
        }
        java.lang.Long l17 = this.f7099x6f02352;
        if (l17 != null) {
            zza += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzc(3, l17.longValue());
        }
        java.lang.Float f17 = this.f7097x6f02311;
        if (f17 != null) {
            f17.floatValue();
            zza += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.m18916x394b70(4) + 4;
        }
        java.lang.Double d17 = this.f7098x6f02312;
        if (d17 == null) {
            return zza;
        }
        d17.doubleValue();
        return zza + com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.m18916x394b70(5) + 8;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143 zzb(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2165x6f02135 c2165x6f02135) {
        while (true) {
            int m18905x394de2 = c2165x6f02135.m18905x394de2();
            if (m18905x394de2 == 0) {
                return this;
            }
            if (m18905x394de2 == 10) {
                this.f7095x337a8b = c2165x6f02135.m18899xe22f9d47();
            } else if (m18905x394de2 == 18) {
                this.f7096x6f0221d = c2165x6f02135.m18899xe22f9d47();
            } else if (m18905x394de2 == 24) {
                this.f7099x6f02352 = java.lang.Long.valueOf(c2165x6f02135.m18908x394de5());
            } else if (m18905x394de2 == 37) {
                this.f7097x6f02311 = java.lang.Float.valueOf(java.lang.Float.intBitsToFloat(c2165x6f02135.m18909x394deb()));
            } else if (m18905x394de2 == 41) {
                this.f7098x6f02312 = java.lang.Double.valueOf(java.lang.Double.longBitsToDouble(c2165x6f02135.m18910x394dec()));
            } else if (!super.zza(c2165x6f02135, m18905x394de2)) {
                return this;
            }
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143
    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136 c2166x6f02136) {
        java.lang.String str = this.f7095x337a8b;
        if (str != null) {
            c2166x6f02136.zzb(1, str);
        }
        java.lang.String str2 = this.f7096x6f0221d;
        if (str2 != null) {
            c2166x6f02136.zzb(2, str2);
        }
        java.lang.Long l17 = this.f7099x6f02352;
        if (l17 != null) {
            c2166x6f02136.zzb(3, l17.longValue());
        }
        java.lang.Float f17 = this.f7097x6f02311;
        if (f17 != null) {
            c2166x6f02136.zza(4, f17.floatValue());
        }
        java.lang.Double d17 = this.f7098x6f02312;
        if (d17 != null) {
            c2166x6f02136.zza(5, d17.doubleValue());
        }
        super.zza(c2166x6f02136);
    }
}

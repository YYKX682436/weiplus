package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzks */
/* loaded from: classes16.dex */
public final class C2358x394ca8 extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2358x394ca8> {

    /* renamed from: zzaum */
    private static volatile com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2358x394ca8[] f7141x6f02379;

    /* renamed from: zzaun */
    public java.lang.Long f7147x6f0237a = null;

    /* renamed from: name */
    public java.lang.String f7142x337a8b = null;

    /* renamed from: zzajf */
    public java.lang.String f7143x6f0221d = null;

    /* renamed from: zzate */
    public java.lang.Long f7146x6f02352 = null;

    /* renamed from: zzarb */
    private java.lang.Float f7144x6f02311 = null;

    /* renamed from: zzarc */
    public java.lang.Double f7145x6f02312 = null;

    public C2358x394ca8() {
        this.f6385x6f02782 = null;
        this.f6401x6f02792 = -1;
    }

    /* renamed from: zzlo */
    public static com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2358x394ca8[] m19334x394cc3() {
        if (f7141x6f02379 == null) {
            synchronized (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2172x6f02141.f6400x6f02791) {
                if (f7141x6f02379 == null) {
                    f7141x6f02379 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2358x394ca8[0];
                }
            }
        }
        return f7141x6f02379;
    }

    /* renamed from: equals */
    public final boolean m19335xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2358x394ca8)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2358x394ca8 c2358x394ca8 = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2358x394ca8) obj;
        java.lang.Long l17 = this.f7147x6f0237a;
        if (l17 == null) {
            if (c2358x394ca8.f7147x6f0237a != null) {
                return false;
            }
        } else if (!l17.equals(c2358x394ca8.f7147x6f0237a)) {
            return false;
        }
        java.lang.String str = this.f7142x337a8b;
        if (str == null) {
            if (c2358x394ca8.f7142x337a8b != null) {
                return false;
            }
        } else if (!str.equals(c2358x394ca8.f7142x337a8b)) {
            return false;
        }
        java.lang.String str2 = this.f7143x6f0221d;
        if (str2 == null) {
            if (c2358x394ca8.f7143x6f0221d != null) {
                return false;
            }
        } else if (!str2.equals(c2358x394ca8.f7143x6f0221d)) {
            return false;
        }
        java.lang.Long l18 = this.f7146x6f02352;
        if (l18 == null) {
            if (c2358x394ca8.f7146x6f02352 != null) {
                return false;
            }
        } else if (!l18.equals(c2358x394ca8.f7146x6f02352)) {
            return false;
        }
        java.lang.Float f17 = this.f7144x6f02311;
        if (f17 == null) {
            if (c2358x394ca8.f7144x6f02311 != null) {
                return false;
            }
        } else if (!f17.equals(c2358x394ca8.f7144x6f02311)) {
            return false;
        }
        java.lang.Double d17 = this.f7145x6f02312;
        if (d17 == null) {
            if (c2358x394ca8.f7145x6f02312 != null) {
                return false;
            }
        } else if (!d17.equals(c2358x394ca8.f7145x6f02312)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f = this.f6385x6f02782;
        if (c2170x6f0213f != null && !c2170x6f0213f.m18931x7aab3243()) {
            return this.f6385x6f02782.m18929xb2c87fbf(c2358x394ca8.f6385x6f02782);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f2 = c2358x394ca8.f6385x6f02782;
        return c2170x6f0213f2 == null || c2170x6f0213f2.m18931x7aab3243();
    }

    /* renamed from: hashCode */
    public final int m19336x8cdac1b() {
        java.lang.Long l17 = this.f7147x6f0237a;
        int i17 = 0;
        int hashCode = ((-1033079858) + (l17 == null ? 0 : l17.hashCode())) * 31;
        java.lang.String str = this.f7142x337a8b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f7143x6f0221d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.Long l18 = this.f7146x6f02352;
        int hashCode4 = (hashCode3 + (l18 == null ? 0 : l18.hashCode())) * 31;
        java.lang.Float f17 = this.f7144x6f02311;
        int hashCode5 = (hashCode4 + (f17 == null ? 0 : f17.hashCode())) * 31;
        java.lang.Double d17 = this.f7145x6f02312;
        int hashCode6 = (hashCode5 + (d17 == null ? 0 : d17.hashCode())) * 31;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f = this.f6385x6f02782;
        if (c2170x6f0213f != null && !c2170x6f0213f.m18931x7aab3243()) {
            i17 = this.f6385x6f02782.m18930x8cdac1b();
        }
        return hashCode6 + i17;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143
    public final int zza() {
        int zza = super.zza();
        java.lang.Long l17 = this.f7147x6f0237a;
        if (l17 != null) {
            zza += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzc(1, l17.longValue());
        }
        java.lang.String str = this.f7142x337a8b;
        if (str != null) {
            zza += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzc(2, str);
        }
        java.lang.String str2 = this.f7143x6f0221d;
        if (str2 != null) {
            zza += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzc(3, str2);
        }
        java.lang.Long l18 = this.f7146x6f02352;
        if (l18 != null) {
            zza += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzc(4, l18.longValue());
        }
        java.lang.Float f17 = this.f7144x6f02311;
        if (f17 != null) {
            f17.floatValue();
            zza += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.m18916x394b70(5) + 4;
        }
        java.lang.Double d17 = this.f7145x6f02312;
        if (d17 == null) {
            return zza;
        }
        d17.doubleValue();
        return zza + com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.m18916x394b70(6) + 8;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143 zzb(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2165x6f02135 c2165x6f02135) {
        while (true) {
            int m18905x394de2 = c2165x6f02135.m18905x394de2();
            if (m18905x394de2 == 0) {
                return this;
            }
            if (m18905x394de2 == 8) {
                this.f7147x6f0237a = java.lang.Long.valueOf(c2165x6f02135.m18908x394de5());
            } else if (m18905x394de2 == 18) {
                this.f7142x337a8b = c2165x6f02135.m18899xe22f9d47();
            } else if (m18905x394de2 == 26) {
                this.f7143x6f0221d = c2165x6f02135.m18899xe22f9d47();
            } else if (m18905x394de2 == 32) {
                this.f7146x6f02352 = java.lang.Long.valueOf(c2165x6f02135.m18908x394de5());
            } else if (m18905x394de2 == 45) {
                this.f7144x6f02311 = java.lang.Float.valueOf(java.lang.Float.intBitsToFloat(c2165x6f02135.m18909x394deb()));
            } else if (m18905x394de2 == 49) {
                this.f7145x6f02312 = java.lang.Double.valueOf(java.lang.Double.longBitsToDouble(c2165x6f02135.m18910x394dec()));
            } else if (!super.zza(c2165x6f02135, m18905x394de2)) {
                return this;
            }
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143
    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136 c2166x6f02136) {
        java.lang.Long l17 = this.f7147x6f0237a;
        if (l17 != null) {
            c2166x6f02136.zzb(1, l17.longValue());
        }
        java.lang.String str = this.f7142x337a8b;
        if (str != null) {
            c2166x6f02136.zzb(2, str);
        }
        java.lang.String str2 = this.f7143x6f0221d;
        if (str2 != null) {
            c2166x6f02136.zzb(3, str2);
        }
        java.lang.Long l18 = this.f7146x6f02352;
        if (l18 != null) {
            c2166x6f02136.zzb(4, l18.longValue());
        }
        java.lang.Float f17 = this.f7144x6f02311;
        if (f17 != null) {
            c2166x6f02136.zza(5, f17.floatValue());
        }
        java.lang.Double d17 = this.f7145x6f02312;
        if (d17 != null) {
            c2166x6f02136.zza(6, d17.doubleValue());
        }
        super.zza(c2166x6f02136);
    }
}

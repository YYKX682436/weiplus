package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzkf */
/* loaded from: classes16.dex */
public final class C2345x394c9b extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2345x394c9b> {

    /* renamed from: zzaru */
    private static volatile com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2345x394c9b[] f7051x6f02324;

    /* renamed from: zzarv */
    public com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2348x394c9e f7052x6f02325 = null;

    /* renamed from: zzarw */
    public com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2346x394c9c f7053x6f02326 = null;

    /* renamed from: zzarx */
    public java.lang.Boolean f7054x6f02327 = null;

    /* renamed from: zzary */
    public java.lang.String f7055x6f02328 = null;

    public C2345x394c9b() {
        this.f6385x6f02782 = null;
        this.f6401x6f02792 = -1;
    }

    /* renamed from: zzlg */
    public static com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2345x394c9b[] m19300x394cbb() {
        if (f7051x6f02324 == null) {
            synchronized (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2172x6f02141.f6400x6f02791) {
                if (f7051x6f02324 == null) {
                    f7051x6f02324 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2345x394c9b[0];
                }
            }
        }
        return f7051x6f02324;
    }

    /* renamed from: equals */
    public final boolean m19301xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2345x394c9b)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2345x394c9b c2345x394c9b = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2345x394c9b) obj;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2348x394c9e c2348x394c9e = this.f7052x6f02325;
        if (c2348x394c9e == null) {
            if (c2345x394c9b.f7052x6f02325 != null) {
                return false;
            }
        } else if (!c2348x394c9e.m19308xb2c87fbf(c2345x394c9b.f7052x6f02325)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2346x394c9c c2346x394c9c = this.f7053x6f02326;
        if (c2346x394c9c == null) {
            if (c2345x394c9b.f7053x6f02326 != null) {
                return false;
            }
        } else if (!c2346x394c9c.m19303xb2c87fbf(c2345x394c9b.f7053x6f02326)) {
            return false;
        }
        java.lang.Boolean bool = this.f7054x6f02327;
        if (bool == null) {
            if (c2345x394c9b.f7054x6f02327 != null) {
                return false;
            }
        } else if (!bool.equals(c2345x394c9b.f7054x6f02327)) {
            return false;
        }
        java.lang.String str = this.f7055x6f02328;
        if (str == null) {
            if (c2345x394c9b.f7055x6f02328 != null) {
                return false;
            }
        } else if (!str.equals(c2345x394c9b.f7055x6f02328)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f = this.f6385x6f02782;
        if (c2170x6f0213f != null && !c2170x6f0213f.m18931x7aab3243()) {
            return this.f6385x6f02782.m18929xb2c87fbf(c2345x394c9b.f6385x6f02782);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f2 = c2345x394c9b.f6385x6f02782;
        return c2170x6f0213f2 == null || c2170x6f0213f2.m18931x7aab3243();
    }

    /* renamed from: hashCode */
    public final int m19302x8cdac1b() {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2348x394c9e c2348x394c9e = this.f7052x6f02325;
        int i17 = 0;
        int m19309x8cdac1b = (-1033080261) + (c2348x394c9e == null ? 0 : c2348x394c9e.m19309x8cdac1b());
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2346x394c9c c2346x394c9c = this.f7053x6f02326;
        int m19304x8cdac1b = ((m19309x8cdac1b * 31) + (c2346x394c9c == null ? 0 : c2346x394c9c.m19304x8cdac1b())) * 31;
        java.lang.Boolean bool = this.f7054x6f02327;
        int hashCode = (m19304x8cdac1b + (bool == null ? 0 : bool.hashCode())) * 31;
        java.lang.String str = this.f7055x6f02328;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f = this.f6385x6f02782;
        if (c2170x6f0213f != null && !c2170x6f0213f.m18931x7aab3243()) {
            i17 = this.f6385x6f02782.m18930x8cdac1b();
        }
        return hashCode2 + i17;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143
    public final int zza() {
        int zza = super.zza();
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2348x394c9e c2348x394c9e = this.f7052x6f02325;
        if (c2348x394c9e != null) {
            zza += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzb(1, c2348x394c9e);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2346x394c9c c2346x394c9c = this.f7053x6f02326;
        if (c2346x394c9c != null) {
            zza += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzb(2, c2346x394c9c);
        }
        java.lang.Boolean bool = this.f7054x6f02327;
        if (bool != null) {
            bool.booleanValue();
            zza += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.m18916x394b70(3) + 1;
        }
        java.lang.String str = this.f7055x6f02328;
        return str != null ? zza + com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzc(4, str) : zza;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143 zzb(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2165x6f02135 c2165x6f02135) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143 abstractC2174x6f02143;
        while (true) {
            int m18905x394de2 = c2165x6f02135.m18905x394de2();
            if (m18905x394de2 == 0) {
                return this;
            }
            if (m18905x394de2 == 10) {
                if (this.f7052x6f02325 == null) {
                    this.f7052x6f02325 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2348x394c9e();
                }
                abstractC2174x6f02143 = this.f7052x6f02325;
            } else if (m18905x394de2 == 18) {
                if (this.f7053x6f02326 == null) {
                    this.f7053x6f02326 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2346x394c9c();
                }
                abstractC2174x6f02143 = this.f7053x6f02326;
            } else if (m18905x394de2 == 24) {
                this.f7054x6f02327 = java.lang.Boolean.valueOf(c2165x6f02135.m18906x394de3());
            } else if (m18905x394de2 == 34) {
                this.f7055x6f02328 = c2165x6f02135.m18899xe22f9d47();
            } else if (!super.zza(c2165x6f02135, m18905x394de2)) {
                return this;
            }
            c2165x6f02135.zza(abstractC2174x6f02143);
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143
    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136 c2166x6f02136) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2348x394c9e c2348x394c9e = this.f7052x6f02325;
        if (c2348x394c9e != null) {
            c2166x6f02136.zza(1, c2348x394c9e);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2346x394c9c c2346x394c9c = this.f7053x6f02326;
        if (c2346x394c9c != null) {
            c2166x6f02136.zza(2, c2346x394c9c);
        }
        java.lang.Boolean bool = this.f7054x6f02327;
        if (bool != null) {
            c2166x6f02136.zza(3, bool.booleanValue());
        }
        java.lang.String str = this.f7055x6f02328;
        if (str != null) {
            c2166x6f02136.zzb(4, str);
        }
        super.zza(c2166x6f02136);
    }
}

package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzkg */
/* loaded from: classes16.dex */
public final class C2346x394c9c extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2346x394c9c> {

    /* renamed from: zzarz */
    public java.lang.Integer f7056x6f02329 = null;

    /* renamed from: zzasa */
    public java.lang.Boolean f7057x6f0232f = null;

    /* renamed from: zzasb */
    public java.lang.String f7058x6f02330 = null;

    /* renamed from: zzasc */
    public java.lang.String f7059x6f02331 = null;

    /* renamed from: zzasd */
    public java.lang.String f7060x6f02332 = null;

    public C2346x394c9c() {
        this.f6385x6f02782 = null;
        this.f6401x6f02792 = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2346x394c9c zzb(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2165x6f02135 c2165x6f02135) {
        while (true) {
            int m18905x394de2 = c2165x6f02135.m18905x394de2();
            if (m18905x394de2 == 0) {
                return this;
            }
            if (m18905x394de2 == 8) {
                int m18898xa86cd69f = c2165x6f02135.m18898xa86cd69f();
                try {
                    int m18907x394de4 = c2165x6f02135.m18907x394de4();
                    if (m18907x394de4 < 0 || m18907x394de4 > 4) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(46);
                        sb6.append(m18907x394de4);
                        sb6.append(" is not a valid enum ComparisonType");
                        throw new java.lang.IllegalArgumentException(sb6.toString());
                        break;
                    }
                    this.f7056x6f02329 = java.lang.Integer.valueOf(m18907x394de4);
                } catch (java.lang.IllegalArgumentException unused) {
                    c2165x6f02135.m18904x394b6c(m18898xa86cd69f);
                    zza(c2165x6f02135, m18905x394de2);
                }
            } else if (m18905x394de2 == 16) {
                this.f7057x6f0232f = java.lang.Boolean.valueOf(c2165x6f02135.m18906x394de3());
            } else if (m18905x394de2 == 26) {
                this.f7058x6f02330 = c2165x6f02135.m18899xe22f9d47();
            } else if (m18905x394de2 == 34) {
                this.f7059x6f02331 = c2165x6f02135.m18899xe22f9d47();
            } else if (m18905x394de2 == 42) {
                this.f7060x6f02332 = c2165x6f02135.m18899xe22f9d47();
            } else if (!super.zza(c2165x6f02135, m18905x394de2)) {
                return this;
            }
        }
    }

    /* renamed from: equals */
    public final boolean m19303xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2346x394c9c)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2346x394c9c c2346x394c9c = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2346x394c9c) obj;
        java.lang.Integer num = this.f7056x6f02329;
        if (num == null) {
            if (c2346x394c9c.f7056x6f02329 != null) {
                return false;
            }
        } else if (!num.equals(c2346x394c9c.f7056x6f02329)) {
            return false;
        }
        java.lang.Boolean bool = this.f7057x6f0232f;
        if (bool == null) {
            if (c2346x394c9c.f7057x6f0232f != null) {
                return false;
            }
        } else if (!bool.equals(c2346x394c9c.f7057x6f0232f)) {
            return false;
        }
        java.lang.String str = this.f7058x6f02330;
        if (str == null) {
            if (c2346x394c9c.f7058x6f02330 != null) {
                return false;
            }
        } else if (!str.equals(c2346x394c9c.f7058x6f02330)) {
            return false;
        }
        java.lang.String str2 = this.f7059x6f02331;
        if (str2 == null) {
            if (c2346x394c9c.f7059x6f02331 != null) {
                return false;
            }
        } else if (!str2.equals(c2346x394c9c.f7059x6f02331)) {
            return false;
        }
        java.lang.String str3 = this.f7060x6f02332;
        if (str3 == null) {
            if (c2346x394c9c.f7060x6f02332 != null) {
                return false;
            }
        } else if (!str3.equals(c2346x394c9c.f7060x6f02332)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f = this.f6385x6f02782;
        if (c2170x6f0213f != null && !c2170x6f0213f.m18931x7aab3243()) {
            return this.f6385x6f02782.m18929xb2c87fbf(c2346x394c9c.f6385x6f02782);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f2 = c2346x394c9c.f6385x6f02782;
        return c2170x6f0213f2 == null || c2170x6f0213f2.m18931x7aab3243();
    }

    /* renamed from: hashCode */
    public final int m19304x8cdac1b() {
        java.lang.Integer num = this.f7056x6f02329;
        int i17 = 0;
        int intValue = ((-1033080230) + (num == null ? 0 : num.intValue())) * 31;
        java.lang.Boolean bool = this.f7057x6f0232f;
        int hashCode = (intValue + (bool == null ? 0 : bool.hashCode())) * 31;
        java.lang.String str = this.f7058x6f02330;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f7059x6f02331;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f7060x6f02332;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f = this.f6385x6f02782;
        if (c2170x6f0213f != null && !c2170x6f0213f.m18931x7aab3243()) {
            i17 = this.f6385x6f02782.m18930x8cdac1b();
        }
        return hashCode4 + i17;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143
    public final int zza() {
        int zza = super.zza();
        java.lang.Integer num = this.f7056x6f02329;
        if (num != null) {
            zza += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzf(1, num.intValue());
        }
        java.lang.Boolean bool = this.f7057x6f0232f;
        if (bool != null) {
            bool.booleanValue();
            zza += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.m18916x394b70(2) + 1;
        }
        java.lang.String str = this.f7058x6f02330;
        if (str != null) {
            zza += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzc(3, str);
        }
        java.lang.String str2 = this.f7059x6f02331;
        if (str2 != null) {
            zza += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzc(4, str2);
        }
        java.lang.String str3 = this.f7060x6f02332;
        return str3 != null ? zza + com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzc(5, str3) : zza;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143
    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136 c2166x6f02136) {
        java.lang.Integer num = this.f7056x6f02329;
        if (num != null) {
            c2166x6f02136.zze(1, num.intValue());
        }
        java.lang.Boolean bool = this.f7057x6f0232f;
        if (bool != null) {
            c2166x6f02136.zza(2, bool.booleanValue());
        }
        java.lang.String str = this.f7058x6f02330;
        if (str != null) {
            c2166x6f02136.zzb(3, str);
        }
        java.lang.String str2 = this.f7059x6f02331;
        if (str2 != null) {
            c2166x6f02136.zzb(4, str2);
        }
        java.lang.String str3 = this.f7060x6f02332;
        if (str3 != null) {
            c2166x6f02136.zzb(5, str3);
        }
        super.zza(c2166x6f02136);
    }
}

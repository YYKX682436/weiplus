package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzki */
/* loaded from: classes16.dex */
public final class C2348x394c9e extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2348x394c9e> {

    /* renamed from: zzash */
    public java.lang.Integer f7065x6f02336 = null;

    /* renamed from: zzasi */
    public java.lang.String f7066x6f02337 = null;

    /* renamed from: zzasj */
    public java.lang.Boolean f7067x6f02338 = null;

    /* renamed from: zzask */
    public java.lang.String[] f7068x6f02339 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2177x6f02146.f6412x6f0279b;

    public C2348x394c9e() {
        this.f6385x6f02782 = null;
        this.f6401x6f02792 = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2348x394c9e zzb(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2165x6f02135 c2165x6f02135) {
        while (true) {
            int m18905x394de2 = c2165x6f02135.m18905x394de2();
            if (m18905x394de2 == 0) {
                return this;
            }
            if (m18905x394de2 == 8) {
                int m18898xa86cd69f = c2165x6f02135.m18898xa86cd69f();
                try {
                    int m18907x394de4 = c2165x6f02135.m18907x394de4();
                    if (m18907x394de4 < 0 || m18907x394de4 > 6) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(41);
                        sb6.append(m18907x394de4);
                        sb6.append(" is not a valid enum MatchType");
                        throw new java.lang.IllegalArgumentException(sb6.toString());
                        break;
                    }
                    this.f7065x6f02336 = java.lang.Integer.valueOf(m18907x394de4);
                } catch (java.lang.IllegalArgumentException unused) {
                    c2165x6f02135.m18904x394b6c(m18898xa86cd69f);
                    zza(c2165x6f02135, m18905x394de2);
                }
            } else if (m18905x394de2 == 18) {
                this.f7066x6f02337 = c2165x6f02135.m18899xe22f9d47();
            } else if (m18905x394de2 == 24) {
                this.f7067x6f02338 = java.lang.Boolean.valueOf(c2165x6f02135.m18906x394de3());
            } else if (m18905x394de2 == 34) {
                int zzb = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2177x6f02146.zzb(c2165x6f02135, 34);
                java.lang.String[] strArr = this.f7068x6f02339;
                int length = strArr == null ? 0 : strArr.length;
                int i17 = zzb + length;
                java.lang.String[] strArr2 = new java.lang.String[i17];
                if (length != 0) {
                    java.lang.System.arraycopy(strArr, 0, strArr2, 0, length);
                }
                while (length < i17 - 1) {
                    strArr2[length] = c2165x6f02135.m18899xe22f9d47();
                    c2165x6f02135.m18905x394de2();
                    length++;
                }
                strArr2[length] = c2165x6f02135.m18899xe22f9d47();
                this.f7068x6f02339 = strArr2;
            } else if (!super.zza(c2165x6f02135, m18905x394de2)) {
                return this;
            }
        }
    }

    /* renamed from: equals */
    public final boolean m19308xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2348x394c9e)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2348x394c9e c2348x394c9e = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2348x394c9e) obj;
        java.lang.Integer num = this.f7065x6f02336;
        if (num == null) {
            if (c2348x394c9e.f7065x6f02336 != null) {
                return false;
            }
        } else if (!num.equals(c2348x394c9e.f7065x6f02336)) {
            return false;
        }
        java.lang.String str = this.f7066x6f02337;
        if (str == null) {
            if (c2348x394c9e.f7066x6f02337 != null) {
                return false;
            }
        } else if (!str.equals(c2348x394c9e.f7066x6f02337)) {
            return false;
        }
        java.lang.Boolean bool = this.f7067x6f02338;
        if (bool == null) {
            if (c2348x394c9e.f7067x6f02338 != null) {
                return false;
            }
        } else if (!bool.equals(c2348x394c9e.f7067x6f02338)) {
            return false;
        }
        if (!com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2172x6f02141.m18943xb2c87fbf(this.f7068x6f02339, c2348x394c9e.f7068x6f02339)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f = this.f6385x6f02782;
        if (c2170x6f0213f != null && !c2170x6f0213f.m18931x7aab3243()) {
            return this.f6385x6f02782.m18929xb2c87fbf(c2348x394c9e.f6385x6f02782);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f2 = c2348x394c9e.f6385x6f02782;
        return c2170x6f0213f2 == null || c2170x6f0213f2.m18931x7aab3243();
    }

    /* renamed from: hashCode */
    public final int m19309x8cdac1b() {
        java.lang.Integer num = this.f7065x6f02336;
        int i17 = 0;
        int intValue = ((-1033080168) + (num == null ? 0 : num.intValue())) * 31;
        java.lang.String str = this.f7066x6f02337;
        int hashCode = (intValue + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Boolean bool = this.f7067x6f02338;
        int hashCode2 = (((hashCode + (bool == null ? 0 : bool.hashCode())) * 31) + com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2172x6f02141.m18946x8cdac1b(this.f7068x6f02339)) * 31;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f = this.f6385x6f02782;
        if (c2170x6f0213f != null && !c2170x6f0213f.m18931x7aab3243()) {
            i17 = this.f6385x6f02782.m18930x8cdac1b();
        }
        return hashCode2 + i17;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143
    public final int zza() {
        int zza = super.zza();
        java.lang.Integer num = this.f7065x6f02336;
        if (num != null) {
            zza += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzf(1, num.intValue());
        }
        java.lang.String str = this.f7066x6f02337;
        if (str != null) {
            zza += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzc(2, str);
        }
        java.lang.Boolean bool = this.f7067x6f02338;
        if (bool != null) {
            bool.booleanValue();
            zza += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.m18916x394b70(3) + 1;
        }
        java.lang.String[] strArr = this.f7068x6f02339;
        if (strArr == null || strArr.length <= 0) {
            return zza;
        }
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            java.lang.String[] strArr2 = this.f7068x6f02339;
            if (i17 >= strArr2.length) {
                return zza + i18 + (i19 * 1);
            }
            java.lang.String str2 = strArr2[i17];
            if (str2 != null) {
                i19++;
                i18 += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.m18918x394c07(str2);
            }
            i17++;
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143
    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136 c2166x6f02136) {
        java.lang.Integer num = this.f7065x6f02336;
        if (num != null) {
            c2166x6f02136.zze(1, num.intValue());
        }
        java.lang.String str = this.f7066x6f02337;
        if (str != null) {
            c2166x6f02136.zzb(2, str);
        }
        java.lang.Boolean bool = this.f7067x6f02338;
        if (bool != null) {
            c2166x6f02136.zza(3, bool.booleanValue());
        }
        java.lang.String[] strArr = this.f7068x6f02339;
        if (strArr != null && strArr.length > 0) {
            int i17 = 0;
            while (true) {
                java.lang.String[] strArr2 = this.f7068x6f02339;
                if (i17 >= strArr2.length) {
                    break;
                }
                java.lang.String str2 = strArr2[i17];
                if (str2 != null) {
                    c2166x6f02136.zzb(4, str2);
                }
                i17++;
            }
        }
        super.zza(c2166x6f02136);
    }
}

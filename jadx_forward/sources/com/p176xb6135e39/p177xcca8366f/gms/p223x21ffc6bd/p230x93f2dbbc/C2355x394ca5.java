package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzkp */
/* loaded from: classes16.dex */
public final class C2355x394ca5 extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2355x394ca5> {

    /* renamed from: zzatf */
    public com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2356x394ca6[] f7100x6f02353 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2356x394ca6.m19329x394cc2();

    public C2355x394ca5() {
        this.f6385x6f02782 = null;
        this.f6401x6f02792 = -1;
    }

    /* renamed from: equals */
    public final boolean m19327xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2355x394ca5)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2355x394ca5 c2355x394ca5 = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2355x394ca5) obj;
        if (!com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2172x6f02141.m18943xb2c87fbf(this.f7100x6f02353, c2355x394ca5.f7100x6f02353)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f = this.f6385x6f02782;
        if (c2170x6f0213f != null && !c2170x6f0213f.m18931x7aab3243()) {
            return this.f6385x6f02782.m18929xb2c87fbf(c2355x394ca5.f6385x6f02782);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f2 = c2355x394ca5.f6385x6f02782;
        return c2170x6f0213f2 == null || c2170x6f0213f2.m18931x7aab3243();
    }

    /* renamed from: hashCode */
    public final int m19328x8cdac1b() {
        int m18946x8cdac1b = ((-1033079951) + com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2172x6f02141.m18946x8cdac1b(this.f7100x6f02353)) * 31;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f = this.f6385x6f02782;
        return m18946x8cdac1b + ((c2170x6f0213f == null || c2170x6f0213f.m18931x7aab3243()) ? 0 : this.f6385x6f02782.m18930x8cdac1b());
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143
    public final int zza() {
        int zza = super.zza();
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2356x394ca6[] c2356x394ca6Arr = this.f7100x6f02353;
        if (c2356x394ca6Arr != null && c2356x394ca6Arr.length > 0) {
            int i17 = 0;
            while (true) {
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2356x394ca6[] c2356x394ca6Arr2 = this.f7100x6f02353;
                if (i17 >= c2356x394ca6Arr2.length) {
                    break;
                }
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2356x394ca6 c2356x394ca6 = c2356x394ca6Arr2[i17];
                if (c2356x394ca6 != null) {
                    zza += com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzb(1, c2356x394ca6);
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
            if (m18905x394de2 == 10) {
                int zzb = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2177x6f02146.zzb(c2165x6f02135, 10);
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2356x394ca6[] c2356x394ca6Arr = this.f7100x6f02353;
                int length = c2356x394ca6Arr == null ? 0 : c2356x394ca6Arr.length;
                int i17 = zzb + length;
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2356x394ca6[] c2356x394ca6Arr2 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2356x394ca6[i17];
                if (length != 0) {
                    java.lang.System.arraycopy(c2356x394ca6Arr, 0, c2356x394ca6Arr2, 0, length);
                }
                while (length < i17 - 1) {
                    com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2356x394ca6 c2356x394ca6 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2356x394ca6();
                    c2356x394ca6Arr2[length] = c2356x394ca6;
                    c2165x6f02135.zza(c2356x394ca6);
                    c2165x6f02135.m18905x394de2();
                    length++;
                }
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2356x394ca6 c2356x394ca62 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2356x394ca6();
                c2356x394ca6Arr2[length] = c2356x394ca62;
                c2165x6f02135.zza(c2356x394ca62);
                this.f7100x6f02353 = c2356x394ca6Arr2;
            } else if (!super.zza(c2165x6f02135, m18905x394de2)) {
                return this;
            }
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143
    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136 c2166x6f02136) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2356x394ca6[] c2356x394ca6Arr = this.f7100x6f02353;
        if (c2356x394ca6Arr != null && c2356x394ca6Arr.length > 0) {
            int i17 = 0;
            while (true) {
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2356x394ca6[] c2356x394ca6Arr2 = this.f7100x6f02353;
                if (i17 >= c2356x394ca6Arr2.length) {
                    break;
                }
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2356x394ca6 c2356x394ca6 = c2356x394ca6Arr2[i17];
                if (c2356x394ca6 != null) {
                    c2166x6f02136.zza(1, c2356x394ca6);
                }
                i17++;
            }
        }
        super.zza(c2166x6f02136);
    }
}

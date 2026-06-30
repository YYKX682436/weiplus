package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59;

/* loaded from: classes16.dex */
public final class zzp implements java.lang.Cloneable {

    /* renamed from: zzhe */
    private static final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzq f7310x394c3d = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzq();

    /* renamed from: mSize */
    private int f7311x627560e;

    /* renamed from: zzhf */
    private boolean f7312x394c3e;

    /* renamed from: zzhg */
    private int[] f7313x394c3f;

    /* renamed from: zzhh */
    private com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzq[] f7314x394c40;

    public zzp() {
        this(10);
    }

    /* renamed from: idealIntArraySize */
    private static int m19443xda3f13c0(int i17) {
        int i18 = i17 << 2;
        int i19 = 4;
        while (true) {
            if (i19 >= 32) {
                break;
            }
            int i27 = (1 << i19) - 12;
            if (i18 <= i27) {
                i18 = i27;
                break;
            }
            i19++;
        }
        return i18 / 4;
    }

    private final int zzq(int i17) {
        int i18 = this.f7311x627560e - 1;
        int i19 = 0;
        while (i19 <= i18) {
            int i27 = (i19 + i18) >>> 1;
            int i28 = this.f7313x394c3f[i27];
            if (i28 < i17) {
                i19 = i27 + 1;
            } else {
                if (i28 <= i17) {
                    return i27;
                }
                i18 = i27 - 1;
            }
        }
        return ~i19;
    }

    /* renamed from: clone */
    public final /* synthetic */ java.lang.Object m19444x5a5dd5d() {
        int i17 = this.f7311x627560e;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzp zzpVar = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzp(i17);
        java.lang.System.arraycopy(this.f7313x394c3f, 0, zzpVar.f7313x394c3f, 0, i17);
        for (int i18 = 0; i18 < i17; i18++) {
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzq zzqVar = this.f7314x394c40[i18];
            if (zzqVar != null) {
                zzpVar.f7314x394c40[i18] = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzq) zzqVar.m19450x5a5dd5d();
            }
        }
        zzpVar.f7311x627560e = i17;
        return zzpVar;
    }

    /* renamed from: equals */
    public final boolean m19445xb2c87fbf(java.lang.Object obj) {
        boolean z17;
        boolean z18;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzp)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzp zzpVar = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzp) obj;
        int i17 = this.f7311x627560e;
        if (i17 != zzpVar.f7311x627560e) {
            return false;
        }
        int[] iArr = this.f7313x394c3f;
        int[] iArr2 = zzpVar.f7313x394c3f;
        int i18 = 0;
        while (true) {
            if (i18 >= i17) {
                z17 = true;
                break;
            }
            if (iArr[i18] != iArr2[i18]) {
                z17 = false;
                break;
            }
            i18++;
        }
        if (z17) {
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzq[] zzqVarArr = this.f7314x394c40;
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzq[] zzqVarArr2 = zzpVar.f7314x394c40;
            int i19 = this.f7311x627560e;
            int i27 = 0;
            while (true) {
                if (i27 >= i19) {
                    z18 = true;
                    break;
                }
                if (!zzqVarArr[i27].m19451xb2c87fbf(zzqVarArr2[i27])) {
                    z18 = false;
                    break;
                }
                i27++;
            }
            if (z18) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public final int m19446x8cdac1b() {
        int i17 = 17;
        for (int i18 = 0; i18 < this.f7311x627560e; i18++) {
            i17 = (((i17 * 31) + this.f7313x394c3f[i18]) * 31) + this.f7314x394c40[i18].m19452x8cdac1b();
        }
        return i17;
    }

    /* renamed from: isEmpty */
    public final boolean m19447x7aab3243() {
        return this.f7311x627560e == 0;
    }

    /* renamed from: size */
    public final int m19448x35e001() {
        return this.f7311x627560e;
    }

    public final void zza(int i17, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzq zzqVar) {
        int zzq = zzq(i17);
        if (zzq >= 0) {
            this.f7314x394c40[zzq] = zzqVar;
            return;
        }
        int i18 = ~zzq;
        int i19 = this.f7311x627560e;
        if (i18 < i19) {
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzq[] zzqVarArr = this.f7314x394c40;
            if (zzqVarArr[i18] == f7310x394c3d) {
                this.f7313x394c3f[i18] = i17;
                zzqVarArr[i18] = zzqVar;
                return;
            }
        }
        if (i19 >= this.f7313x394c3f.length) {
            int m19443xda3f13c0 = m19443xda3f13c0(i19 + 1);
            int[] iArr = new int[m19443xda3f13c0];
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzq[] zzqVarArr2 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzq[m19443xda3f13c0];
            int[] iArr2 = this.f7313x394c3f;
            java.lang.System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzq[] zzqVarArr3 = this.f7314x394c40;
            java.lang.System.arraycopy(zzqVarArr3, 0, zzqVarArr2, 0, zzqVarArr3.length);
            this.f7313x394c3f = iArr;
            this.f7314x394c40 = zzqVarArr2;
        }
        int i27 = this.f7311x627560e;
        if (i27 - i18 != 0) {
            int[] iArr3 = this.f7313x394c3f;
            int i28 = i18 + 1;
            java.lang.System.arraycopy(iArr3, i18, iArr3, i28, i27 - i18);
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzq[] zzqVarArr4 = this.f7314x394c40;
            java.lang.System.arraycopy(zzqVarArr4, i18, zzqVarArr4, i28, this.f7311x627560e - i18);
        }
        this.f7313x394c3f[i18] = i17;
        this.f7314x394c40[i18] = zzqVar;
        this.f7311x627560e++;
    }

    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzq zzo(int i17) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzq zzqVar;
        int zzq = zzq(i17);
        if (zzq < 0 || (zzqVar = this.f7314x394c40[zzq]) == f7310x394c3d) {
            return null;
        }
        return zzqVar;
    }

    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzq zzp(int i17) {
        return this.f7314x394c40[i17];
    }

    private zzp(int i17) {
        this.f7312x394c3e = false;
        int m19443xda3f13c0 = m19443xda3f13c0(i17);
        this.f7313x394c3f = new int[m19443xda3f13c0];
        this.f7314x394c40 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzq[m19443xda3f13c0];
        this.f7311x627560e = 0;
    }
}

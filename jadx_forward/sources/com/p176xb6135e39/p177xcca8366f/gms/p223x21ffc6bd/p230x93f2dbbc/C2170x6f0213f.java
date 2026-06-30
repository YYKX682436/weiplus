package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzaca */
/* loaded from: classes16.dex */
public final class C2170x6f0213f implements java.lang.Cloneable {

    /* renamed from: zzbxa */
    private static final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2171x6f02140 f6390x6f0278b = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2171x6f02140();

    /* renamed from: mSize */
    private int f6391x627560e;

    /* renamed from: zzbxb */
    private boolean f6392x6f0278c;

    /* renamed from: zzbxc */
    private int[] f6393x6f0278d;

    /* renamed from: zzbxd */
    private com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2171x6f02140[] f6394x6f0278e;

    public C2170x6f0213f() {
        this(10);
    }

    /* renamed from: idealIntArraySize */
    private static int m18926xda3f13c0(int i17) {
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

    /* renamed from: zzav */
    private final int m18927x394b75(int i17) {
        int i18 = this.f6391x627560e - 1;
        int i19 = 0;
        while (i19 <= i18) {
            int i27 = (i19 + i18) >>> 1;
            int i28 = this.f6393x6f0278d[i27];
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
    public final /* synthetic */ java.lang.Object m18928x5a5dd5d() {
        int i17 = this.f6391x627560e;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f(i17);
        java.lang.System.arraycopy(this.f6393x6f0278d, 0, c2170x6f0213f.f6393x6f0278d, 0, i17);
        for (int i18 = 0; i18 < i17; i18++) {
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2171x6f02140 c2171x6f02140 = this.f6394x6f0278e[i18];
            if (c2171x6f02140 != null) {
                c2170x6f0213f.f6394x6f0278e[i18] = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2171x6f02140) c2171x6f02140.m18937x5a5dd5d();
            }
        }
        c2170x6f0213f.f6391x627560e = i17;
        return c2170x6f0213f;
    }

    /* renamed from: equals */
    public final boolean m18929xb2c87fbf(java.lang.Object obj) {
        boolean z17;
        boolean z18;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f) obj;
        int i17 = this.f6391x627560e;
        if (i17 != c2170x6f0213f.f6391x627560e) {
            return false;
        }
        int[] iArr = this.f6393x6f0278d;
        int[] iArr2 = c2170x6f0213f.f6393x6f0278d;
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
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2171x6f02140[] c2171x6f02140Arr = this.f6394x6f0278e;
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2171x6f02140[] c2171x6f02140Arr2 = c2170x6f0213f.f6394x6f0278e;
            int i19 = this.f6391x627560e;
            int i27 = 0;
            while (true) {
                if (i27 >= i19) {
                    z18 = true;
                    break;
                }
                if (!c2171x6f02140Arr[i27].m18938xb2c87fbf(c2171x6f02140Arr2[i27])) {
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
    public final int m18930x8cdac1b() {
        int i17 = 17;
        for (int i18 = 0; i18 < this.f6391x627560e; i18++) {
            i17 = (((i17 * 31) + this.f6393x6f0278d[i18]) * 31) + this.f6394x6f0278e[i18].m18939x8cdac1b();
        }
        return i17;
    }

    /* renamed from: isEmpty */
    public final boolean m18931x7aab3243() {
        return this.f6391x627560e == 0;
    }

    /* renamed from: size */
    public final int m18932x35e001() {
        return this.f6391x627560e;
    }

    public final void zza(int i17, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2171x6f02140 c2171x6f02140) {
        int m18927x394b75 = m18927x394b75(i17);
        if (m18927x394b75 >= 0) {
            this.f6394x6f0278e[m18927x394b75] = c2171x6f02140;
            return;
        }
        int i18 = ~m18927x394b75;
        int i19 = this.f6391x627560e;
        if (i18 < i19) {
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2171x6f02140[] c2171x6f02140Arr = this.f6394x6f0278e;
            if (c2171x6f02140Arr[i18] == f6390x6f0278b) {
                this.f6393x6f0278d[i18] = i17;
                c2171x6f02140Arr[i18] = c2171x6f02140;
                return;
            }
        }
        if (i19 >= this.f6393x6f0278d.length) {
            int m18926xda3f13c0 = m18926xda3f13c0(i19 + 1);
            int[] iArr = new int[m18926xda3f13c0];
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2171x6f02140[] c2171x6f02140Arr2 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2171x6f02140[m18926xda3f13c0];
            int[] iArr2 = this.f6393x6f0278d;
            java.lang.System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2171x6f02140[] c2171x6f02140Arr3 = this.f6394x6f0278e;
            java.lang.System.arraycopy(c2171x6f02140Arr3, 0, c2171x6f02140Arr2, 0, c2171x6f02140Arr3.length);
            this.f6393x6f0278d = iArr;
            this.f6394x6f0278e = c2171x6f02140Arr2;
        }
        int i27 = this.f6391x627560e;
        if (i27 - i18 != 0) {
            int[] iArr3 = this.f6393x6f0278d;
            int i28 = i18 + 1;
            java.lang.System.arraycopy(iArr3, i18, iArr3, i28, i27 - i18);
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2171x6f02140[] c2171x6f02140Arr4 = this.f6394x6f0278e;
            java.lang.System.arraycopy(c2171x6f02140Arr4, i18, c2171x6f02140Arr4, i28, this.f6391x627560e - i18);
        }
        this.f6393x6f0278d[i18] = i17;
        this.f6394x6f0278e[i18] = c2171x6f02140;
        this.f6391x627560e++;
    }

    /* renamed from: zzat */
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2171x6f02140 m18933x394b73(int i17) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2171x6f02140 c2171x6f02140;
        int m18927x394b75 = m18927x394b75(i17);
        if (m18927x394b75 < 0 || (c2171x6f02140 = this.f6394x6f0278e[m18927x394b75]) == f6390x6f0278b) {
            return null;
        }
        return c2171x6f02140;
    }

    /* renamed from: zzau */
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2171x6f02140 m18934x394b74(int i17) {
        return this.f6394x6f0278e[i17];
    }

    private C2170x6f0213f(int i17) {
        this.f6392x6f0278c = false;
        int m18926xda3f13c0 = m18926xda3f13c0(i17);
        this.f6393x6f0278d = new int[m18926xda3f13c0];
        this.f6394x6f0278e = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2171x6f02140[m18926xda3f13c0];
        this.f6391x627560e = 0;
    }
}

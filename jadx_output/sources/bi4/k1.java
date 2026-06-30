package bi4;

/* loaded from: classes11.dex */
public class k1 implements java.lang.Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public int f21064d = 12480;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21065e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21066f = false;

    /* renamed from: g, reason: collision with root package name */
    public int f21067g = 3;

    /* renamed from: h, reason: collision with root package name */
    public boolean f21068h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f21069i = false;

    public static bi4.k1 a() {
        bi4.k1 k1Var = new bi4.k1();
        k1Var.q(true);
        k1Var.o(true);
        java.text.SimpleDateFormat simpleDateFormat = bi4.v1.f21093a;
        k1Var.r(true);
        k1Var.g(false);
        k1Var.i(false);
        k1Var.f21067g = 3;
        k1Var.h(true);
        k1Var.m(true);
        k1Var.f21064d |= 2097152;
        return k1Var;
    }

    public static bi4.k1 b(int i17, boolean z17, boolean z18) {
        bi4.k1 k1Var = new bi4.k1();
        k1Var.q(true);
        k1Var.o(true);
        java.text.SimpleDateFormat simpleDateFormat = bi4.v1.f21093a;
        k1Var.r(true);
        k1Var.f21064d |= com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62;
        k1Var.m(false);
        k1Var.p(z18);
        k1Var.k(true);
        k1Var.i(false);
        k1Var.g(false);
        if (z17) {
            k1Var.f21064d |= com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62;
        } else {
            k1Var.f21064d &= -33554433;
        }
        k1Var.f21064d |= 67108864;
        k1Var.h(true);
        k1Var.f21067g = i17;
        return k1Var;
    }

    public bi4.k1 c(boolean z17) {
        if (z17) {
            this.f21064d |= 256;
        } else {
            this.f21064d &= -257;
        }
        return this;
    }

    public java.lang.Object clone() {
        try {
            return (bi4.k1) super.clone();
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public bi4.k1 d(boolean z17) {
        if (z17) {
            this.f21064d |= 64;
        } else {
            this.f21064d &= -65;
        }
        return this;
    }

    public bi4.k1 e(boolean z17) {
        if (z17) {
            this.f21064d |= 1;
        } else {
            this.f21064d &= -2;
        }
        return this;
    }

    public bi4.k1 f(boolean z17) {
        if (z17) {
            this.f21064d |= 2;
        } else {
            this.f21064d &= -3;
        }
        return this;
    }

    public bi4.k1 g(boolean z17) {
        if (z17) {
            this.f21064d |= 8192;
        } else {
            this.f21064d &= -8193;
        }
        return this;
    }

    public bi4.k1 h(boolean z17) {
        if (z17) {
            this.f21064d |= 16384;
        } else {
            this.f21064d &= -16385;
        }
        return this;
    }

    public bi4.k1 i(boolean z17) {
        if (z17) {
            this.f21064d |= 128;
        } else {
            this.f21064d &= -129;
        }
        return this;
    }

    public bi4.k1 j(boolean z17) {
        if (z17) {
            this.f21064d |= 4;
        } else {
            this.f21064d &= -5;
        }
        return this;
    }

    public bi4.k1 k(boolean z17) {
        if (z17) {
            this.f21064d |= 1048576;
        } else {
            this.f21064d &= -1048577;
        }
        return this;
    }

    public boolean l(int i17) {
        return (i17 & this.f21064d) != 0;
    }

    public bi4.k1 m(boolean z17) {
        if (z17) {
            this.f21064d |= 512;
        } else {
            this.f21064d &= -513;
        }
        return this;
    }

    public bi4.k1 n(boolean z17) {
        if (z17) {
            this.f21064d |= 262144;
        } else {
            this.f21064d &= -262145;
        }
        return this;
    }

    public bi4.k1 o(boolean z17) {
        if (z17) {
            this.f21064d |= 32768;
        } else {
            this.f21064d &= -32769;
        }
        return this;
    }

    public bi4.k1 p(boolean z17) {
        if (z17) {
            this.f21064d |= 65536;
        } else {
            this.f21064d &= -65537;
        }
        return this;
    }

    public bi4.k1 q(boolean z17) {
        if (z17) {
            this.f21064d |= 8;
        } else {
            this.f21064d &= -9;
        }
        return this;
    }

    public bi4.k1 r(boolean z17) {
        if (z17) {
            this.f21064d |= 16;
        } else {
            this.f21064d &= -17;
        }
        return this;
    }
}

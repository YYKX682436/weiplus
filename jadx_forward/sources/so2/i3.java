package so2;

/* loaded from: classes10.dex */
public final class i3 extends dm.w4 {
    public static final l75.e0 L1 = dm.w4.m125655x3593deb(so2.i3.class);

    public final boolean A0() {
        return this.f68989x78351860 > 0 && this.f68968x799e9d9e > 0 && this.f68988x29d3a50c == 3;
    }

    public final boolean D0() {
        long j17 = this.f68989x78351860;
        return j17 > 0 && this.f68968x799e9d9e == j17;
    }

    public final boolean F0() {
        if (this.f68989x78351860 > 0) {
            long j17 = this.f68968x799e9d9e;
            if (j17 > 0) {
                long j18 = this.f68977x19959117;
                if (j18 > 0 && j17 >= j18) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean G0() {
        if (this.f68990x40360b93 == 0) {
            this.f68990x40360b93 = ((c61.l7) i95.n0.c(c61.l7.class)).ek().r(this.f68970xa7075739 * 1000);
        }
        if (this.f68989x78351860 > 0) {
            if (this.f68968x799e9d9e > 0 && this.f68990x40360b93 > 0 && ((float) java.lang.Math.ceil((((float) r4) * 100.0f) / ((float) r0))) >= this.f68990x40360b93) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.String I0() {
        return this.f68981xaca5bdda + ", " + this.f68976xe1500f8 + ' ' + this.f68982x84465715 + " state:" + this.f68988x29d3a50c + " codingFormat=" + this.f68987x74535930 + " cacheSize=" + this.f68968x799e9d9e + " totalSize=" + this.f68989x78351860 + " percent=" + w0() + ", oneStage:" + this.f68977x19959117 + " twoStage:" + this.f68990x40360b93 + " progress=" + this.f68986xa6baeca6;
    }

    /* renamed from: equals */
    public boolean m164894xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof so2.i3) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f68981xaca5bdda, ((so2.i3) obj).f68981xaca5bdda);
        }
        return false;
    }

    @Override // dm.w4, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        l75.e0 info = L1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(info, "info");
        return info;
    }

    /* renamed from: hashCode */
    public int m164895x8cdac1b() {
        return this.f68981xaca5bdda.hashCode();
    }

    /* renamed from: reset */
    public void m164896x6761d4f() {
        this.f68968x799e9d9e = 0L;
        this.f68989x78351860 = 0L;
        this.f68979x84cd6908 = false;
        this.f68987x74535930 = 0;
        this.f68976xe1500f8 = "";
        this.f68988x29d3a50c = 0;
        this.f68982x84465715 = false;
        this.f68967xa78549dc = 0;
        this.f68994xfd4dbd97 = 0;
        this.f68978xbb1b16e8 = 0;
        this.f68983x928511b1 = "";
        this.f68973xffefc = 0;
        this.f68974x45abca = 0;
        this.f68972x7ed828cf = 0;
    }

    public final long t0() {
        return this.f68968x799e9d9e;
    }

    /* renamed from: toString */
    public java.lang.String m164897x9616526c() {
        return I0() + u0() + ", " + this.f68992x4b6e88aa;
    }

    public final java.lang.String u0() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183673i + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a.k(this.f68976xe1500f8, this.f68984xbaadf794, this.f68992x4b6e88aa);
    }

    public final java.lang.String v0() {
        java.lang.String str = this.f68983x928511b1;
        return str == null ? "" : str;
    }

    public final int w0() {
        long j17 = this.f68989x78351860;
        if (j17 <= 0) {
            return 0;
        }
        return (int) ((((float) this.f68968x799e9d9e) / ((float) j17)) * 100);
    }

    public final float y0() {
        long j17 = this.f68989x78351860;
        if (j17 <= 0) {
            return 0.0f;
        }
        return (((float) this.f68968x799e9d9e) * 1.0f) / ((float) j17);
    }

    public final long z0() {
        return this.f68989x78351860;
    }
}

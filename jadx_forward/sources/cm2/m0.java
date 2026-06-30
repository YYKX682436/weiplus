package cm2;

/* loaded from: classes3.dex */
public final class m0 extends cm2.t {
    public int A;
    public int B;
    public int C;
    public java.lang.String D;
    public r45.ce0 E;
    public r45.ce0 F;
    public int G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f124900J;
    public java.lang.String K;
    public int L;
    public r45.rl0 M;
    public r45.e07 N;
    public java.util.LinkedList P;
    public final r45.no5 Q;

    /* renamed from: v, reason: collision with root package name */
    public r45.y23 f124901v;

    /* renamed from: w, reason: collision with root package name */
    public long f124902w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f124903x;

    /* renamed from: y, reason: collision with root package name */
    public java.util.LinkedList f124904y;

    /* renamed from: z, reason: collision with root package name */
    public int f124905z;

    public m0(r45.y23 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f124901v = data;
        this.f124902w = data.m75942xfb822ef2(0);
        this.f124903x = this.f124901v.m75945x2fec8307(1);
        this.f124904y = this.f124901v.m75941xfb821914(2);
        this.f124905z = this.f124901v.m75939xb282bd08(3);
        this.A = this.f124901v.m75939xb282bd08(4);
        this.B = this.f124901v.m75939xb282bd08(5);
        this.C = this.f124901v.m75939xb282bd08(6);
        this.D = this.f124901v.m75945x2fec8307(7);
        this.E = (r45.ce0) this.f124901v.m75936x14adae67(8);
        this.F = (r45.ce0) this.f124901v.m75936x14adae67(9);
        this.G = this.f124901v.m75939xb282bd08(10);
        this.H = this.f124901v.m75939xb282bd08(11);
        this.I = this.f124901v.m75939xb282bd08(12);
        this.f124900J = this.f124901v.m75945x2fec8307(13);
        this.K = this.f124901v.m75945x2fec8307(15);
        this.L = -1;
        this.M = (r45.rl0) this.f124901v.m75936x14adae67(20);
        this.f124901v.m75945x2fec8307(23);
        this.f124901v.m75945x2fec8307(14);
        this.f124901v.m75939xb282bd08(18);
        this.N = (r45.e07) this.f124901v.m75936x14adae67(32);
        this.P = this.f124901v.m75941xfb821914(34);
        this.Q = (r45.no5) this.f124901v.m75936x14adae67(75);
    }

    @Override // c61.bc
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g a() {
        return this.f124919e;
    }

    @Override // c61.bc
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f b() {
        return this.f124901v;
    }

    @Override // c61.bc
    public long c() {
        return this.f124918d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        return ((obj instanceof cm2.m0) && ((cm2.m0) obj).f124902w == this.f124902w) ? 0 : -1;
    }

    /* renamed from: equals */
    public boolean m15297xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cm2.m0.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.convert.ShopWindowShelfProductItem");
        return this.f124902w == ((cm2.m0) obj).f124902w;
    }

    public final r45.rl0 g() {
        r45.rl0 rl0Var = this.M;
        if (rl0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShopWindowShelfProductItem", "availableExclusiveInfo " + pm0.b0.g(rl0Var));
        }
        if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_live_disable_shopping_exclusive_price, false) && rl0Var != null) {
            if (rl0Var.m75933x41a8a7f2(0)) {
                return rl0Var;
            }
        }
        return null;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f124902w;
    }

    @Override // in5.c
    public int h() {
        return 0;
    }

    /* renamed from: hashCode */
    public int m15298x8cdac1b() {
        return java.lang.Long.hashCode(this.f124902w);
    }

    public final int i() {
        r45.mw3 mw3Var;
        r45.mw3 mw3Var2 = (r45.mw3) this.f124901v.m75936x14adae67(44);
        boolean z17 = false;
        if (mw3Var2 != null && mw3Var2.m75939xb282bd08(0) == 1) {
            z17 = true;
        }
        return (!z17 || (mw3Var = (r45.mw3) this.f124901v.m75936x14adae67(44)) == null) ? this.f124901v.m75939xb282bd08(39) : mw3Var.m75939xb282bd08(2);
    }

    public final r45.bd5 j() {
        r45.mw3 mw3Var;
        r45.bd5 bd5Var;
        r45.mw3 mw3Var2 = (r45.mw3) this.f124901v.m75936x14adae67(44);
        boolean z17 = false;
        if (mw3Var2 != null && mw3Var2.m75939xb282bd08(0) == 1) {
            z17 = true;
        }
        return (!z17 || (mw3Var = (r45.mw3) this.f124901v.m75936x14adae67(44)) == null || (bd5Var = (r45.bd5) mw3Var.m75936x14adae67(4)) == null) ? (r45.bd5) this.f124901v.m75936x14adae67(70) : bd5Var;
    }

    public final int k() {
        r45.mw3 mw3Var;
        r45.mw3 mw3Var2 = (r45.mw3) this.f124901v.m75936x14adae67(44);
        boolean z17 = false;
        if (mw3Var2 != null && mw3Var2.m75939xb282bd08(0) == 1) {
            z17 = true;
        }
        return (!z17 || (mw3Var = (r45.mw3) this.f124901v.m75936x14adae67(44)) == null) ? this.f124901v.m75939xb282bd08(35) : mw3Var.m75939xb282bd08(3);
    }

    public final java.lang.String l() {
        java.lang.String m75945x2fec8307;
        r45.mw3 mw3Var = (r45.mw3) this.f124901v.m75936x14adae67(44);
        boolean z17 = false;
        if (mw3Var != null && mw3Var.m75939xb282bd08(0) == 1) {
            z17 = true;
        }
        if (z17) {
            r45.mw3 mw3Var2 = (r45.mw3) this.f124901v.m75936x14adae67(44);
            if (mw3Var2 == null || (m75945x2fec8307 = mw3Var2.m75945x2fec8307(1)) == null) {
                return "";
            }
        } else {
            m75945x2fec8307 = this.f124901v.m75945x2fec8307(30);
            if (m75945x2fec8307 == null) {
                return "";
            }
        }
        return m75945x2fec8307;
    }

    public final void n(r45.y23 newData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newData, "newData");
        this.f124901v = newData;
        this.f124902w = newData.m75942xfb822ef2(0);
        this.f124903x = this.f124901v.m75945x2fec8307(1);
        this.f124904y = this.f124901v.m75941xfb821914(2);
        this.f124905z = this.f124901v.m75939xb282bd08(3);
        this.A = this.f124901v.m75939xb282bd08(4);
        this.B = this.f124901v.m75939xb282bd08(5);
        this.C = this.f124901v.m75939xb282bd08(6);
        this.D = this.f124901v.m75945x2fec8307(7);
        this.E = (r45.ce0) this.f124901v.m75936x14adae67(8);
        this.F = (r45.ce0) this.f124901v.m75936x14adae67(9);
        this.G = this.f124901v.m75939xb282bd08(10);
        this.H = this.f124901v.m75939xb282bd08(11);
        this.I = this.f124901v.m75939xb282bd08(12);
        this.f124900J = this.f124901v.m75945x2fec8307(13);
        this.K = this.f124901v.m75945x2fec8307(15);
        this.L = -1;
        this.M = (r45.rl0) this.f124901v.m75936x14adae67(20);
        this.f124901v.m75945x2fec8307(23);
        this.f124901v.m75945x2fec8307(14);
        this.f124901v.m75939xb282bd08(18);
        this.N = (r45.e07) this.f124901v.m75936x14adae67(32);
        this.P = this.f124901v.m75941xfb821914(34);
    }

    /* renamed from: toString */
    public java.lang.String m15299x9616526c() {
        return "ShopWindowShelfProductItem(product_id=" + this.f124902w + ", title=" + this.f124903x + ", stock=" + this.f124905z + ", product_button_status:" + k() + ", market_price=" + this.A + ", selling_price=" + this.B + ", status=" + this.C + ", is_promoting=" + this.G + ", platform_id=" + this.H + ", list_id=" + this.I + ", extra_data=" + this.f124900J + ", button_wording=" + this.K + ", origin_price=" + this.L + ')';
    }
}

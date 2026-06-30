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
    public java.lang.String f43367J;
    public java.lang.String K;
    public int L;
    public r45.rl0 M;
    public r45.e07 N;
    public java.util.LinkedList P;
    public final r45.no5 Q;

    /* renamed from: v, reason: collision with root package name */
    public r45.y23 f43368v;

    /* renamed from: w, reason: collision with root package name */
    public long f43369w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f43370x;

    /* renamed from: y, reason: collision with root package name */
    public java.util.LinkedList f43371y;

    /* renamed from: z, reason: collision with root package name */
    public int f43372z;

    public m0(r45.y23 data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f43368v = data;
        this.f43369w = data.getLong(0);
        this.f43370x = this.f43368v.getString(1);
        this.f43371y = this.f43368v.getList(2);
        this.f43372z = this.f43368v.getInteger(3);
        this.A = this.f43368v.getInteger(4);
        this.B = this.f43368v.getInteger(5);
        this.C = this.f43368v.getInteger(6);
        this.D = this.f43368v.getString(7);
        this.E = (r45.ce0) this.f43368v.getCustom(8);
        this.F = (r45.ce0) this.f43368v.getCustom(9);
        this.G = this.f43368v.getInteger(10);
        this.H = this.f43368v.getInteger(11);
        this.I = this.f43368v.getInteger(12);
        this.f43367J = this.f43368v.getString(13);
        this.K = this.f43368v.getString(15);
        this.L = -1;
        this.M = (r45.rl0) this.f43368v.getCustom(20);
        this.f43368v.getString(23);
        this.f43368v.getString(14);
        this.f43368v.getInteger(18);
        this.N = (r45.e07) this.f43368v.getCustom(32);
        this.P = this.f43368v.getList(34);
        this.Q = (r45.no5) this.f43368v.getCustom(75);
    }

    @Override // c61.bc
    public com.tencent.mm.protobuf.g a() {
        return this.f43386e;
    }

    @Override // c61.bc
    public com.tencent.mm.protobuf.f b() {
        return this.f43368v;
    }

    @Override // c61.bc
    public long c() {
        return this.f43385d;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return ((obj instanceof cm2.m0) && ((cm2.m0) obj).f43369w == this.f43369w) ? 0 : -1;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.o.b(cm2.m0.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.convert.ShopWindowShelfProductItem");
        return this.f43369w == ((cm2.m0) obj).f43369w;
    }

    public final r45.rl0 g() {
        r45.rl0 rl0Var = this.M;
        if (rl0Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShopWindowShelfProductItem", "availableExclusiveInfo " + pm0.b0.g(rl0Var));
        }
        if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_live_disable_shopping_exclusive_price, false) && rl0Var != null) {
            if (rl0Var.getBoolean(0)) {
                return rl0Var;
            }
        }
        return null;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f43369w;
    }

    @Override // in5.c
    public int h() {
        return 0;
    }

    public int hashCode() {
        return java.lang.Long.hashCode(this.f43369w);
    }

    public final int i() {
        r45.mw3 mw3Var;
        r45.mw3 mw3Var2 = (r45.mw3) this.f43368v.getCustom(44);
        boolean z17 = false;
        if (mw3Var2 != null && mw3Var2.getInteger(0) == 1) {
            z17 = true;
        }
        return (!z17 || (mw3Var = (r45.mw3) this.f43368v.getCustom(44)) == null) ? this.f43368v.getInteger(39) : mw3Var.getInteger(2);
    }

    public final r45.bd5 j() {
        r45.mw3 mw3Var;
        r45.bd5 bd5Var;
        r45.mw3 mw3Var2 = (r45.mw3) this.f43368v.getCustom(44);
        boolean z17 = false;
        if (mw3Var2 != null && mw3Var2.getInteger(0) == 1) {
            z17 = true;
        }
        return (!z17 || (mw3Var = (r45.mw3) this.f43368v.getCustom(44)) == null || (bd5Var = (r45.bd5) mw3Var.getCustom(4)) == null) ? (r45.bd5) this.f43368v.getCustom(70) : bd5Var;
    }

    public final int k() {
        r45.mw3 mw3Var;
        r45.mw3 mw3Var2 = (r45.mw3) this.f43368v.getCustom(44);
        boolean z17 = false;
        if (mw3Var2 != null && mw3Var2.getInteger(0) == 1) {
            z17 = true;
        }
        return (!z17 || (mw3Var = (r45.mw3) this.f43368v.getCustom(44)) == null) ? this.f43368v.getInteger(35) : mw3Var.getInteger(3);
    }

    public final java.lang.String l() {
        java.lang.String string;
        r45.mw3 mw3Var = (r45.mw3) this.f43368v.getCustom(44);
        boolean z17 = false;
        if (mw3Var != null && mw3Var.getInteger(0) == 1) {
            z17 = true;
        }
        if (z17) {
            r45.mw3 mw3Var2 = (r45.mw3) this.f43368v.getCustom(44);
            if (mw3Var2 == null || (string = mw3Var2.getString(1)) == null) {
                return "";
            }
        } else {
            string = this.f43368v.getString(30);
            if (string == null) {
                return "";
            }
        }
        return string;
    }

    public final void n(r45.y23 newData) {
        kotlin.jvm.internal.o.g(newData, "newData");
        this.f43368v = newData;
        this.f43369w = newData.getLong(0);
        this.f43370x = this.f43368v.getString(1);
        this.f43371y = this.f43368v.getList(2);
        this.f43372z = this.f43368v.getInteger(3);
        this.A = this.f43368v.getInteger(4);
        this.B = this.f43368v.getInteger(5);
        this.C = this.f43368v.getInteger(6);
        this.D = this.f43368v.getString(7);
        this.E = (r45.ce0) this.f43368v.getCustom(8);
        this.F = (r45.ce0) this.f43368v.getCustom(9);
        this.G = this.f43368v.getInteger(10);
        this.H = this.f43368v.getInteger(11);
        this.I = this.f43368v.getInteger(12);
        this.f43367J = this.f43368v.getString(13);
        this.K = this.f43368v.getString(15);
        this.L = -1;
        this.M = (r45.rl0) this.f43368v.getCustom(20);
        this.f43368v.getString(23);
        this.f43368v.getString(14);
        this.f43368v.getInteger(18);
        this.N = (r45.e07) this.f43368v.getCustom(32);
        this.P = this.f43368v.getList(34);
    }

    public java.lang.String toString() {
        return "ShopWindowShelfProductItem(product_id=" + this.f43369w + ", title=" + this.f43370x + ", stock=" + this.f43372z + ", product_button_status:" + k() + ", market_price=" + this.A + ", selling_price=" + this.B + ", status=" + this.C + ", is_promoting=" + this.G + ", platform_id=" + this.H + ", list_id=" + this.I + ", extra_data=" + this.f43367J + ", button_wording=" + this.K + ", origin_price=" + this.L + ')';
    }
}

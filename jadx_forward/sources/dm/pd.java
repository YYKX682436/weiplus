package dm;

/* loaded from: classes10.dex */
public final class pd extends dm.x4 {

    /* renamed from: b3, reason: collision with root package name */
    public static final l75.e0 f320835b3 = dm.c4.m124839x3593deb(dm.pd.class);

    /* renamed from: c3, reason: collision with root package name */
    public static final java.lang.String f320836c3 = "metion_Index";

    @Override // dm.c4, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f320835b3;
    }

    public final java.lang.String l() {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f;
        r45.vg2 vg2Var = this.f66083x26b3182a;
        if (vg2Var == null || (str = vg2Var.m75945x2fec8307(0)) == null) {
            str = "";
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "music")) {
            r45.vg2 vg2Var2 = this.f66083x26b3182a;
            if (vg2Var2 == null || (m75934xbce7f2f = vg2Var2.m75934xbce7f2f(2)) == null) {
                return "";
            }
            byte[] bArr = m75934xbce7f2f.f273689a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bArr, "getBytes(...)");
            try {
                r45.hf2 hf2Var = new r45.hf2();
                hf2Var.mo11468x92b714fd(bArr);
                str2 = hf2Var.m75945x2fec8307(8);
            } catch (java.lang.Exception unused) {
                str2 = null;
            }
            if (str2 == null) {
                return "";
            }
        } else {
            str2 = this.f66128x7b284d5e;
            if (str2 == null) {
                return "";
            }
        }
        return str2;
    }

    public final boolean t0() {
        int i17 = this.f66082x26b1b2e8;
        return (i17 & 2) > 0 || (i17 & 1) > 0;
    }

    public boolean u0() {
        r45.rg2 rg2Var = this.f66070x5f9d295d;
        return (rg2Var == null || rg2Var.m75939xb282bd08(1) == 0) ? false : true;
    }

    public int v0() {
        r45.rg2 rg2Var = this.f66070x5f9d295d;
        if (rg2Var != null) {
            return rg2Var.m75939xb282bd08(1);
        }
        return 0;
    }

    public final void w0(boolean z17) {
        if (z17) {
            this.f66082x26b1b2e8 |= 32;
        } else {
            this.f66082x26b1b2e8 &= -33;
        }
    }
}

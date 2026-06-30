package dk2;

/* loaded from: classes3.dex */
public final class x6 extends dk2.t4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6(r45.ch1 msg) {
        super(msg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
    }

    @Override // dk2.zf
    public java.lang.Object D() {
        r45.ch1 ch1Var = this.f315634a;
        if (ch1Var.m75939xb282bd08(1) != 20127) {
            return null;
        }
        r45.uj1 uj1Var = new r45.uj1();
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = ch1Var.m75934xbce7f2f(4);
        byte[] g17 = m75934xbce7f2f != null ? m75934xbce7f2f.g() : null;
        if (g17 == null) {
            return null;
        }
        try {
            uj1Var.mo11468x92b714fd(g17);
            return uj1Var;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            return null;
        }
    }

    @Override // dk2.zf
    public int e() {
        java.lang.Object D = D();
        r45.uj1 uj1Var = D instanceof r45.uj1 ? (r45.uj1) D : null;
        if (uj1Var == null) {
            return 0;
        }
        r45.uj1 uj1Var2 = uj1Var.m75939xb282bd08(0) == 2 ? uj1Var : null;
        if (uj1Var2 != null) {
            return uj1Var2.m75939xb282bd08(3);
        }
        return 0;
    }
}

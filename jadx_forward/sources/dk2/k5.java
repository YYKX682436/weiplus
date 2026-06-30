package dk2;

/* loaded from: classes3.dex */
public final class k5 extends dk2.t4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(r45.ch1 msg) {
        super(msg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
    }

    @Override // dk2.zf
    public java.lang.Object D() {
        if (mo124533xfb85f7b0() != 20074) {
            return null;
        }
        r45.bi1 bi1Var = new r45.bi1();
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = this.f315634a.m75934xbce7f2f(4);
        bi1Var.mo11468x92b714fd(m75934xbce7f2f != null ? m75934xbce7f2f.g() : null);
        return bi1Var;
    }

    @Override // dk2.t4, dk2.zf
    public java.lang.String j() {
        java.lang.String m75945x2fec8307;
        java.lang.Object D = D();
        com.p314xaae8f345.mm.p2495xc50a8b8b.e eVar = null;
        r45.bi1 bi1Var = D instanceof r45.bi1 ? (r45.bi1) D : null;
        if (bi1Var == null) {
            return "";
        }
        int m75939xb282bd08 = bi1Var.m75939xb282bd08(0);
        if (m75939xb282bd08 == 2) {
            r45.g42 g42Var = new r45.g42();
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = bi1Var.m75934xbce7f2f(1);
            byte[] g17 = m75934xbce7f2f != null ? m75934xbce7f2f.g() : null;
            if (g17 != null) {
                try {
                    g42Var.mo11468x92b714fd(g17);
                    eVar = g42Var;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                }
            }
            if (eVar == null || (m75945x2fec8307 = eVar.m75945x2fec8307(0)) == null) {
                return "";
            }
        } else {
            if (m75939xb282bd08 != 3) {
                return "";
            }
            r45.ip1 ip1Var = new r45.ip1();
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f2 = bi1Var.m75934xbce7f2f(1);
            byte[] g18 = m75934xbce7f2f2 != null ? m75934xbce7f2f2.g() : null;
            if (g18 != null) {
                try {
                    ip1Var.mo11468x92b714fd(g18);
                    eVar = ip1Var;
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e18);
                }
            }
            if (eVar == null || (m75945x2fec8307 = eVar.m75945x2fec8307(0)) == null) {
                return "";
            }
        }
        return m75945x2fec8307;
    }
}

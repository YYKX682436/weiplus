package dk2;

/* loaded from: classes3.dex */
public final class ab extends dk2.t4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(r45.ch1 msg) {
        super(msg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
    }

    @Override // dk2.zf
    public java.lang.Object D() {
        if (mo124533xfb85f7b0() != 20035) {
            return null;
        }
        r45.gj1 gj1Var = new r45.gj1();
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = this.f315634a.m75934xbce7f2f(4);
        gj1Var.mo11468x92b714fd(m75934xbce7f2f != null ? m75934xbce7f2f.g() : null);
        return gj1Var;
    }

    @Override // dk2.t4, dk2.zf
    public java.lang.String j() {
        r45.ze2 ze2Var;
        java.lang.Object D = D();
        java.lang.String str = null;
        r45.gj1 gj1Var = D instanceof r45.gj1 ? (r45.gj1) D : null;
        java.lang.String m75945x2fec8307 = (gj1Var == null || (ze2Var = (r45.ze2) gj1Var.m75936x14adae67(0)) == null) ? null : ze2Var.m75945x2fec8307(2);
        if (m75945x2fec8307 != null) {
            java.lang.Object D2 = D();
            r45.gj1 gj1Var2 = D2 instanceof r45.gj1 ? (r45.gj1) D2 : null;
            java.lang.String m75945x2fec83072 = gj1Var2 != null ? gj1Var2.m75945x2fec8307(1) : null;
            if (m75945x2fec83072 == null || m75945x2fec83072.length() == 0) {
                str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573033da0, m75945x2fec8307);
            } else {
                java.lang.Object D3 = D();
                r45.gj1 gj1Var3 = D3 instanceof r45.gj1 ? (r45.gj1) D3 : null;
                if (gj1Var3 != null) {
                    str = gj1Var3.m75945x2fec8307(1);
                }
            }
            if (str != null) {
                return str;
            }
        }
        return "";
    }
}

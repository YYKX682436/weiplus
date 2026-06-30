package dk2;

/* loaded from: classes3.dex */
public final class v7 extends dk2.t4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(r45.ch1 msg) {
        super(msg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
    }

    @Override // dk2.zf
    public java.lang.Object D() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f pi1Var;
        int mo124533xfb85f7b0 = mo124533xfb85f7b0();
        r45.ch1 ch1Var = this.f315634a;
        if (mo124533xfb85f7b0 == 20090) {
            pi1Var = new r45.pi1();
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = ch1Var.m75934xbce7f2f(4);
            byte[] g17 = m75934xbce7f2f != null ? m75934xbce7f2f.g() : null;
            if (g17 == null) {
                return null;
            }
            try {
                pi1Var.mo11468x92b714fd(g17);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                return null;
            }
        } else {
            if (mo124533xfb85f7b0 != 20091) {
                return null;
            }
            pi1Var = new r45.wi1();
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f2 = ch1Var.m75934xbce7f2f(4);
            byte[] g18 = m75934xbce7f2f2 != null ? m75934xbce7f2f2.g() : null;
            if (g18 == null) {
                return null;
            }
            try {
                pi1Var.mo11468x92b714fd(g18);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e18);
                return null;
            }
        }
        return pi1Var;
    }
}

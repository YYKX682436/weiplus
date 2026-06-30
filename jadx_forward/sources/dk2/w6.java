package dk2;

/* loaded from: classes3.dex */
public final class w6 extends dk2.t4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(r45.ch1 msg) {
        super(msg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
    }

    @Override // dk2.zf
    public java.lang.Object D() {
        if (mo124533xfb85f7b0() != 20047) {
            return null;
        }
        r45.li1 li1Var = new r45.li1();
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = this.f315634a.m75934xbce7f2f(4);
        byte[] g17 = m75934xbce7f2f != null ? m75934xbce7f2f.g() : null;
        if (g17 != null) {
            try {
                li1Var.mo11468x92b714fd(g17);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            }
        }
        return li1Var;
    }
}

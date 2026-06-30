package fk2;

/* loaded from: classes3.dex */
public final class j3 extends dk2.t4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(r45.ch1 msg) {
        super(msg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
    }

    @Override // dk2.zf
    public java.lang.Object D() {
        if (mo124533xfb85f7b0() != 20098) {
            return null;
        }
        r45.di1 di1Var = new r45.di1();
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = this.f315634a.m75934xbce7f2f(4);
        byte[] g17 = m75934xbce7f2f != null ? m75934xbce7f2f.g() : null;
        if (g17 == null) {
            return null;
        }
        try {
            di1Var.mo11468x92b714fd(g17);
            return di1Var;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            return null;
        }
    }
}

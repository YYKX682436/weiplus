package dk2;

/* loaded from: classes3.dex */
public final class y7 extends dk2.t4 {

    /* renamed from: b, reason: collision with root package name */
    public int f315908b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7(r45.ch1 msg) {
        super(msg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
    }

    @Override // dk2.zf
    public java.lang.Object D() {
        if (mo124533xfb85f7b0() != 20111) {
            return null;
        }
        r45.pj1 pj1Var = new r45.pj1();
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = this.f315634a.m75934xbce7f2f(4);
        pj1Var.mo11468x92b714fd(m75934xbce7f2f != null ? m75934xbce7f2f.g() : null);
        return pj1Var;
    }

    @Override // dk2.zf
    /* renamed from: isValid */
    public boolean mo124688x7b953cf2() {
        java.lang.Object D = D();
        r45.pj1 pj1Var = D instanceof r45.pj1 ? (r45.pj1) D : null;
        if (pj1Var == null) {
            return false;
        }
        if (pj1Var.m75939xb282bd08(5) == 1) {
            xt2.a0 a0Var = xt2.a0.f538144a;
            r45.y23 y23Var = (r45.y23) pj1Var.m75936x14adae67(0);
            boolean c17 = a0Var.c(y23Var != null ? y23Var.m75942xfb822ef2(0) : 0L, (r45.n32) pj1Var.m75936x14adae67(4), "notification");
            mm2.f6 f6Var = (mm2.f6) dk2.ef.f314905a.i(mm2.f6.class);
            so2.j5 j5Var = f6Var != null ? f6Var.f410582w : null;
            cm2.m0 m0Var = j5Var instanceof cm2.m0 ? (cm2.m0) j5Var : null;
            r45.y23 y23Var2 = (r45.y23) pj1Var.m75936x14adae67(0);
            boolean z17 = !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(y23Var2 != null ? java.lang.Long.valueOf(y23Var2.m75942xfb822ef2(0)) : null, m0Var != null ? java.lang.Long.valueOf(m0Var.f124902w) : null);
            if (!c17 || !z17) {
                return false;
            }
        }
        return true;
    }
}

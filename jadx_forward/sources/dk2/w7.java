package dk2;

/* loaded from: classes3.dex */
public final class w7 extends dk2.t4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(r45.ch1 msg) {
        super(msg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
    }

    @Override // dk2.zf
    public java.lang.Object D() {
        if (mo124533xfb85f7b0() != 20031) {
            return null;
        }
        r45.qi1 qi1Var = new r45.qi1();
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = this.f315634a.m75934xbce7f2f(4);
        qi1Var.mo11468x92b714fd(m75934xbce7f2f != null ? m75934xbce7f2f.g() : null);
        zl2.r4.f555483a.M2("FinderLiveGlobalLevelUpgradeMsg", "userlevelTest," + qi1Var);
        if (qi1Var.m75939xb282bd08(0) == 1 || qi1Var.m75939xb282bd08(0) == 2) {
            return qi1Var;
        }
        return null;
    }

    /* renamed from: toString */
    public java.lang.String m124678x9616526c() {
        java.lang.Object D = D();
        if (!(D instanceof r45.qi1)) {
            return super.toString();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("nickNake:");
        sb6.append(k());
        sb6.append('-');
        sb6.append(y());
        sb6.append(",type:");
        r45.qi1 qi1Var = (r45.qi1) D;
        sb6.append(qi1Var.m75939xb282bd08(0));
        sb6.append(",level:");
        sb6.append(qi1Var.m75939xb282bd08(1));
        sb6.append('-');
        sb6.append(qi1Var.m75939xb282bd08(2));
        sb6.append(",showFlag:");
        sb6.append(qi1Var.m75942xfb822ef2(3));
        return sb6.toString();
    }
}

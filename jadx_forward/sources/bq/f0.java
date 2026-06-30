package bq;

/* loaded from: classes.dex */
public final class f0 extends bq.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(java.lang.String finderUsername, java.util.List list) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        r45.o51 o51Var = new r45.o51();
        o51Var.set(2, finderUsername);
        if (list != null) {
            o51Var.m75941xfb821914(3).addAll(list);
        }
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.A9).mo141623x754a37bb()).r()).intValue() == 1) {
            o51Var.set(4, java.lang.Integer.valueOf(o51Var.m75939xb282bd08(4) | 1));
        }
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.B9).mo141623x754a37bb()).r()).intValue() == 1) {
            o51Var.set(4, java.lang.Integer.valueOf(o51Var.m75939xb282bd08(4) | 2));
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 21564;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetdiagnosisdata";
        lVar.f152197a = o51Var;
        lVar.f152198b = new r45.p51();
        p(lVar.a());
    }
}

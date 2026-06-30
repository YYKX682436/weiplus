package ti3;

@j95.b
/* loaded from: classes5.dex */
public final class q extends i95.w implements ty.k0 {
    public void Ai(ty.p0 action, ty.r0 refOccasion, com.p314xaae8f345.mm.p2621x8fb0427b.f9 quotedMsg, r15.g gVar, long j17, java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 l17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(refOccasion, "refOccasion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(quotedMsg, "quotedMsg");
        if ((str == null || str.length() == 0) || (l17 = pt0.f0.f439742b1.l(str, j17)) == null) {
            return;
        }
        Bi(action, ty.r0.f504287f, quotedMsg, gVar, java.lang.Integer.valueOf(g95.e0.b(quotedMsg)), g95.e0.e(l17), g95.e0.b(l17), j17, str);
    }

    public final void Bi(ty.p0 action, ty.r0 refOccasion, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, r15.g gVar, java.lang.Integer num, long j17, long j18, long j19, java.lang.String talkerName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(refOccasion, "refOccasion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talkerName, "talkerName");
        ((ku5.t0) ku5.t0.f394148d).b(new ti3.o(action, talkerName, f9Var, num, gVar, j19, j17, j18, refOccasion), "MicroMsg.msgquote.MsgReportManager");
    }

    public void Di(ty.p0 action, ty.r0 refOccasion, com.p314xaae8f345.mm.p2621x8fb0427b.f9 quotedMsg, r15.g gVar, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(refOccasion, "refOccasion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(quotedMsg, "quotedMsg");
        Bi(action, refOccasion, quotedMsg, gVar, java.lang.Integer.valueOf(g95.e0.b(quotedMsg)), 0L, 0L, 0L, str == null ? "" : str);
    }

    public void Ni(ty.p0 action, com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e c16565x9bc03d4e, java.lang.Integer num, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        Ri(action, ty.r0.f504287f, c16565x9bc03d4e, str);
    }

    public void Ri(ty.p0 action, ty.r0 refOccasion, com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e c16565x9bc03d4e, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(refOccasion, "refOccasion");
        if ((str == null || str.length() == 0) || c16565x9bc03d4e == null) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 l17 = pt0.f0.f439742b1.l(str, c16565x9bc03d4e.f231016e);
        Bi(action, refOccasion, l17, c16565x9bc03d4e.f231026r, java.lang.Integer.valueOf(l17 != null ? g95.e0.b(l17) : 0), 0L, 0L, 0L, str);
    }

    public void Ui(com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e c16565x9bc03d4e, java.lang.Integer num, long j17, java.lang.String str) {
        pt0.e0 e0Var;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 l17;
        if ((str == null || str.length() == 0) || c16565x9bc03d4e == null || (l17 = (e0Var = pt0.f0.f439742b1).l(str, c16565x9bc03d4e.f231016e)) == null) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 l18 = e0Var.l(str, j17);
        Bi(ty.p0.f504270f, ty.r0.f504287f, l17, c16565x9bc03d4e.f231026r, num, l18 != null ? g95.e0.e(l18) : 0L, l18 != null ? g95.e0.b(l18) : 0L, j17, str);
    }

    public void Vi(r15.b bVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 quoteMsg) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 l17;
        r15.i n17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(quoteMsg, "quoteMsg");
        java.lang.Long valueOf = (bVar == null || (n17 = bVar.n()) == null) ? null : java.lang.Long.valueOf(n17.l());
        if (valueOf != null) {
            valueOf.longValue();
            java.lang.String Q0 = quoteMsg.Q0();
            if ((Q0 == null || Q0.length() == 0) || (l17 = pt0.f0.f439742b1.l(quoteMsg.Q0(), valueOf.longValue())) == null) {
                return;
            }
            ty.k0 k0Var = (ty.k0) i95.n0.c(ty.k0.class);
            ty.p0 p0Var = ty.p0.f504270f;
            ty.r0 r0Var = ty.r0.f504287f;
            r15.i n18 = bVar.n();
            ((ti3.q) k0Var).wi(p0Var, r0Var, l17, n18 != null ? n18.j() : null, g95.e0.e(quoteMsg), 0L, quoteMsg.I0(), quoteMsg.Q0());
        }
    }

    public void wi(ty.p0 action, ty.r0 refOccasion, com.p314xaae8f345.mm.p2621x8fb0427b.f9 quotedMsg, r15.g gVar, long j17, long j18, long j19, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(refOccasion, "refOccasion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(quotedMsg, "quotedMsg");
        Bi(action, refOccasion, quotedMsg, gVar, java.lang.Integer.valueOf(g95.e0.b(quotedMsg)), j17, j18, j19, str == null ? "" : str);
    }
}

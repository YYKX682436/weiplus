package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes9.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.l8 f277826a;

    public w(com.p314xaae8f345.mm.p2621x8fb0427b.l8 l8Var) {
        r01.q3.rj();
        this.f277826a = l8Var;
    }

    public void a(com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var, com.p314xaae8f345.mm.p2621x8fb0427b.l8 l8Var) {
        boolean z17;
        if (l4Var == null || l8Var == null || !c01.e2.G(l4Var.h1()) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l4Var.W0()) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.k4(l4Var.W0()) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.B4(l4Var.W0())) {
            return;
        }
        java.lang.String W0 = l4Var.W0();
        boolean z18 = false;
        if ((W0 != null && W0.equalsIgnoreCase("photoaccounts")) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.X3(l4Var.W0())) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.m4 m4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.m4) l8Var;
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = m4Var.p(l4Var.W0());
        boolean z19 = (l4Var.W0().equals("officialaccounts") || l4Var.W0().equals("service_officialaccounts")) ? false : true;
        if (p17 == null) {
            p17 = new com.p314xaae8f345.mm.p2621x8fb0427b.l4(l4Var.W0());
            if (z19) {
                p17.c2(2097152);
            }
            z17 = true;
        } else {
            z17 = false;
        }
        if (z19 && p17.u0() == 0) {
            p17.c2(2097152);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizConversationStorage", "enterprise cvs count is %d", java.lang.Integer.valueOf(p17.d1()));
        java.lang.String y17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().y(l4Var.W0());
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 q57 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().q5(y17);
        if (q57 == null || q57.m124847x74d37ac6() <= 0) {
            p17.f2();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizConversationStorage", "lastOfMsg is null or MsgId <= 0, lastConvBiz is %s", y17);
        } else {
            p17.h2(q57);
            p17.l1(q57.Q0() + ":" + q57.j());
            p17.S1(java.lang.Integer.toString(q57.mo78013xfb85f7b0()));
            if (m4Var.w() != null) {
                com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd081 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081();
                com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd0812 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081();
                com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
                q57.u1(l4Var.W0());
                q57.d1(p17.j());
                qm.a0.d(q57, c19772x1c2cd081, c19772x1c2cd0812, c19767x257d7f, true);
                p17.o1(c19772x1c2cd081.f38869x6ac9171);
                p17.p1(c19772x1c2cd0812.f38869x6ac9171);
                p17.K1(c19767x257d7f.f38864x6ac9171);
            }
        }
        if (z19 && m4Var.u(p17.h1()) <= 0) {
            z18 = true;
        }
        if (z18) {
            m4Var.k(p17.h1());
        } else if (z17) {
            m4Var.G(p17);
        } else {
            m4Var.W(p17, p17.h1());
        }
    }

    public void b(java.lang.String str) {
        if (str != null && c01.e2.G(str) && r01.z.j(str)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.l8 l8Var = this.f277826a;
            com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) l8Var).p(str);
            if (p17 == null) {
                return;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 q57 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().q5(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().y(str));
            if (q57 == null || q57.m124847x74d37ac6() <= 0) {
                return;
            }
            p17.h2(q57);
            p17.l1(q57.Q0() + ":" + q57.j());
            p17.S1(java.lang.Integer.toString(q57.mo78013xfb85f7b0()));
            if (((com.p314xaae8f345.mm.p2621x8fb0427b.m4) l8Var).w() != null) {
                com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd081 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081();
                com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd0812 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081();
                com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
                q57.u1(str);
                q57.d1(p17.j());
                qm.a0.d(q57, c19772x1c2cd081, c19772x1c2cd0812, c19767x257d7f, true);
                p17.o1(c19772x1c2cd081.f38869x6ac9171);
                p17.p1(c19772x1c2cd0812.f38869x6ac9171);
                p17.K1(c19767x257d7f.f38864x6ac9171);
            } else {
                p17.f2();
            }
            ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) l8Var).W(p17, p17.h1());
        }
    }
}

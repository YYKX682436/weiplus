package ab5;

@j95.b
/* loaded from: classes9.dex */
public class a extends i95.w implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.b5 {
    public void Ai(com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var, com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var2) {
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var3;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        java.util.Map d17;
        java.lang.String str = null;
        android.database.Cursor s17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().s(4, null, "appbrandcustomerservicemsg", -1);
        if (s17 != null) {
            if (s17.getCount() <= 0 || !s17.moveToFirst()) {
                l4Var3 = null;
            } else {
                l4Var3 = new com.p314xaae8f345.mm.p2621x8fb0427b.l4();
                l4Var3.mo9015xbf5d97fd(s17);
            }
            s17.close();
        } else {
            l4Var3 = null;
        }
        if (l4Var3 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandConversationService", "The lastest app brand conversation username is %s", l4Var3.h1());
            f9Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().q5(l4Var3.h1());
        } else if (l4Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandConversationService", "The lastest app brand conversation is null");
            f9Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().q5(l4Var.h1());
        } else {
            f9Var = null;
        }
        if (f9Var == null || f9Var.m124847x74d37ac6() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandConversationService", "the last of msg is null'");
            l4Var2.f2();
            return;
        }
        l4Var2.h2(f9Var);
        l4Var2.l1(f9Var.Q0() + ":" + f9Var.j());
        l4Var2.S1(java.lang.Integer.toString(f9Var.mo78013xfb85f7b0()));
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().w() != null) {
            com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd081 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081();
            com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd0812 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081();
            com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
            if (l4Var3 != null) {
                f9Var.u1(l4Var3.W0());
            } else if (l4Var != null) {
                f9Var.u1(l4Var.W0());
            }
            f9Var.d1(l4Var2.j());
            qm.a0.d(f9Var, c19772x1c2cd081, c19772x1c2cd0812, c19767x257d7f, true);
            int mo78013xfb85f7b0 = f9Var.mo78013xfb85f7b0();
            java.lang.String j17 = f9Var.j();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j17) && mo78013xfb85f7b0 == 49 && (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(j17, "msg", null)) != null) {
                str = (java.lang.String) d17.get(".msg.appmsg.title");
            }
            java.lang.String str2 = c19772x1c2cd081.f38869x6ac9171;
            java.lang.String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                if (str == null) {
                    str = "";
                }
                str3 = " ".concat(str);
            }
            l4Var2.o1(str2.concat(str3));
            l4Var2.p1(c19772x1c2cd0812.f38869x6ac9171);
            l4Var2.K1(c19767x257d7f.f38864x6ac9171);
        }
    }

    public void wi(com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var) {
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p("appbrandcustomerservicemsg");
        if (p17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandConversationService", "appBrandSuperConv is created");
            p17.T1(null);
            Ai(l4Var, p17);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().W(p17, "appbrandcustomerservicemsg");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandConversationService", "create parentConv");
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.l4("appbrandcustomerservicemsg");
        l4Var2.f2();
        Ai(l4Var, l4Var2);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().G(l4Var2);
    }
}

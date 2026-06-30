package k41;

/* loaded from: classes9.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final k41.a1 f385501a = new k41.a1();

    public static final boolean a(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(username);
        if (p17 != null) {
            java.lang.String h17 = p17.h1();
            if (!(h17 == null || h17.length() == 0) && p17.h1().equals(username)) {
                return true;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenIMKefuConversationLogic", "isKefuConversationExist conv invalid username: %s", username);
        return false;
    }

    public final void b(java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var) {
        java.util.Map d17;
        if (l4Var == null) {
            return;
        }
        l4Var.h2(f9Var);
        l4Var.S1(java.lang.String.valueOf(f9Var.mo78013xfb85f7b0()));
        l4Var.l1(f9Var.Q0() + ':' + f9Var.j());
        f9Var.j();
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().w() != null) {
            com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd081 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081();
            com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd0812 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081();
            com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
            java.lang.String Q0 = f9Var.Q0();
            f9Var.u1(str);
            f9Var.d1(l4Var.j());
            qm.a0.d(f9Var, c19772x1c2cd081, c19772x1c2cd0812, c19767x257d7f, true);
            java.lang.String str2 = c19772x1c2cd0812.f38869x6ac9171;
            if (str2 == null || str2.length() == 0) {
                c19772x1c2cd0812.f38869x6ac9171 = Q0;
            }
            int mo78013xfb85f7b0 = f9Var.mo78013xfb85f7b0();
            java.lang.String j17 = f9Var.j();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(j17, "getContent(...)");
            java.lang.String str3 = null;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j17) && mo78013xfb85f7b0 == 49 && (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(j17, "msg", null)) != null) {
                str3 = (java.lang.String) d17.get(".msg.appmsg.title");
            }
            if (str3 == null) {
                str3 = "";
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String str4 = c19772x1c2cd081.f38869x6ac9171;
            if (str4 == null) {
                str4 = "";
            }
            sb6.append(str4);
            sb6.append(str3.length() == 0 ? "" : " ".concat(str3));
            l4Var.o1(sb6.toString());
            l4Var.p1(c19772x1c2cd0812.f38869x6ac9171);
            l4Var.K1(c19767x257d7f.f38864x6ac9171);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMKefuConversationLogic", "doFillParentConversationInfo talker: %s, msgType: %s, digest: %s, digestUser: %s, parenConv: %s, lastOfMsgTalker: %s", str, java.lang.Integer.valueOf(f9Var.mo78013xfb85f7b0()), l4Var.y0(), l4Var.z0(), l4Var.h1(), Q0);
        }
    }

    public final void c(com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var, com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var2) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        java.lang.String str;
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 d17 = d();
        if (d17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenIMKefuConversationLogic", "fillParentConversationInfo the lastest openim kefu conversation username is %s", d17.h1());
            f9Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().q5(d17.h1());
            str = d17.W0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getParentRef(...)");
        } else if (l4Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenIMKefuConversationLogic", "fillParentConversationInfo the lastest openim kefu conversation is null");
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 q57 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().q5(l4Var.h1());
            java.lang.String W0 = l4Var.W0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(W0, "getParentRef(...)");
            str = W0;
            f9Var = q57;
        } else {
            f9Var = null;
            str = "";
        }
        boolean z17 = false;
        if (f9Var != null) {
            if (f9Var.m124847x74d37ac6() > 0) {
                z17 = true;
            }
        }
        if (z17) {
            b(str, f9Var, l4Var2);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenIMKefuConversationLogic", "the last of msg is invalid");
            l4Var2.f2();
        }
    }

    public final com.p314xaae8f345.mm.p2621x8fb0427b.l4 d() {
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = null;
        android.database.Cursor s17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().s(6, null, "opencustomerservicemsg", -1);
        if (s17 != null) {
            if (s17.getCount() > 0 && s17.moveToFirst()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.l4();
                l4Var2.mo9015xbf5d97fd(s17);
                l4Var = l4Var2;
            }
            s17.close();
        }
        return l4Var;
    }
}

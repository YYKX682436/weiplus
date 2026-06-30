package l41;

@j95.b
/* loaded from: classes11.dex */
public final class b2 extends i95.w implements j41.y {
    public void Ai(java.lang.String str, j41.x xVar) {
        k41.h1 h1Var = k41.h1.f385540d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMKefuGetContactService", "closeContact username: " + str);
        if (str == null) {
            str = "";
        }
        j41.j0 j0Var = new j41.j0(str);
        j0Var.f379181b = 2;
        j0Var.f379183d = xVar;
        k41.h1.f385540d.f(j0Var);
    }

    public k41.k0 Bi(java.lang.String str) {
        return k41.o0.b(str);
    }

    public dm.u8 Di(java.lang.String str) {
        k41.h1 h1Var = k41.h1.f385540d;
        return k41.o0.c(str);
    }

    public boolean Ni(java.lang.String str, java.lang.String toSendUsername) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMKefuService", "sendOpenImkfCard toUsername: %s, cardSendingUsername: %s", str, toSendUsername);
        boolean z17 = true;
        if (!(str == null || str.length() == 0)) {
            if (toSendUsername != null && toSendUsername.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                l41.a2 a2Var = new l41.a2(str, this);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toSendUsername, "toSendUsername");
                j41.h0 h0Var = new j41.h0(0, toSendUsername, null);
                h0Var.f379167d = false;
                com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a = new com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a();
                j41.y yVar = (j41.y) i95.n0.c(j41.y.class);
                k41.i0 i0Var = new k41.i0(c19762x487075a, a2Var, "<msg bigheadimgurl=\"%s\" smallheadimgurl=\"%s\" username=\"%s\" nickname=\"%s\" openimappid=\"%s\" openimdesc=\"%s\" openimdescicon=\"%s\"/>", toSendUsername);
                ((l41.b2) yVar).getClass();
                k41.h1.a(h0Var, i0Var);
                return c19762x487075a.f38859x6ac9171;
            }
        }
        return false;
    }

    public void Ri(java.lang.String str, java.lang.String str2) {
        if (str2 == null) {
            return;
        }
        java.lang.String decode = java.net.URLDecoder.decode(str2, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        if (w11.t1.a(str == null ? "" : str)) {
            w11.r1 b17 = w11.s1.b(str, null, 2, null);
            b17.e(decode);
            b17.h(67);
            b17.f523664f = 1;
            w11.r1.d(b17, null, 1, null);
            return;
        }
        w11.r1 b18 = w11.s1.b(str, null, 2, null);
        b18.g(str);
        b18.e(decode);
        b18.h(67);
        b18.f523664f = 1;
        b18.f523667i = 5;
        b18.a().a();
    }

    public void Ui(com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var) {
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p("opencustomerservicemsg");
        k41.a1 a1Var = k41.a1.f385501a;
        if (p17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMKefuConversationLogic", "openim kefu service conversation has created");
            p17.T1(null);
            a1Var.c(l4Var, p17);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().W(p17, "opencustomerservicemsg");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMKefuConversationLogic", "create openim kefu service conversation");
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.l4("opencustomerservicemsg");
        l4Var2.f2();
        a1Var.c(l4Var, l4Var2);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().G(l4Var2);
    }

    public boolean wi() {
        android.database.Cursor s17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().s(6, new java.util.ArrayList(), "opencustomerservicemsg", 1);
        return s17 != null && s17.getCount() > 0;
    }
}

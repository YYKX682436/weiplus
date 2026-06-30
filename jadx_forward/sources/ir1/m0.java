package ir1;

/* loaded from: classes11.dex */
public final class m0 {
    public m0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(android.content.Context context, com.p314xaae8f345.p2845xc516c4b6.biz.C23135x54a4d828 userInfo, java.lang.String biz, int i17) {
        java.lang.String m85056x59bd62df;
        java.lang.String m85056x59bd62df2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userInfo, "userInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(biz, "biz");
        java.lang.String m85056x59bd62df3 = userInfo.m85056x59bd62df();
        boolean z17 = true;
        if (m85056x59bd62df3 == null || m85056x59bd62df3.length() == 0) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(context, 0, 0);
        java.lang.Long m85057x59c0778e = userInfo.m85057x59c0778e();
        int longValue = m85057x59c0778e != null ? (int) m85057x59c0778e.longValue() : 0;
        if (longValue == 0) {
            java.lang.String m85056x59bd62df4 = userInfo.m85056x59bd62df();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m85056x59bd62df4);
            m85056x59bd62df = jr1.j.b(m85056x59bd62df4, i17);
        } else {
            m85056x59bd62df = userInfo.m85056x59bd62df();
        }
        hr1.a Ai = ((br1.m) ((zq1.u) i95.n0.c(zq1.u.class))).Ai(m85056x59bd62df, i17, longValue);
        if (Ai == null) {
            Ai = new hr1.a();
        }
        java.lang.String m85058x8010e5e4 = userInfo.m85058x8010e5e4();
        if (m85058x8010e5e4 != null) {
            Ai.f66212x21f9b213 = m85058x8010e5e4;
        }
        java.lang.String m85055x341984a2 = userInfo.m85055x341984a2();
        if (m85055x341984a2 != null) {
            Ai.f66207xff000111 = m85055x341984a2;
        }
        java.lang.String m85056x59bd62df5 = userInfo.m85056x59bd62df();
        if (m85056x59bd62df5 != null) {
            Ai.f66209x4f67f8e = m85056x59bd62df5;
        }
        java.lang.Long m85057x59c0778e2 = userInfo.m85057x59c0778e();
        if (m85057x59c0778e2 != null) {
            Ai.f66210x4f9943d = (int) m85057x59c0778e2.longValue();
        }
        java.lang.Long m85059x66e5ae59 = userInfo.m85059x66e5ae59();
        if (m85059x66e5ae59 != null) {
            Ai.f66216xf8cebfca = (int) m85059x66e5ae59.longValue();
        }
        java.lang.String str = Ai.f66213x996f7ca;
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17 && (m85056x59bd62df2 = userInfo.m85056x59bd62df()) != null) {
            Ai.f66213x996f7ca = jr1.j.a(m85056x59bd62df2);
        }
        if (i17 == 5) {
            yq1.u0.Ui().z0(Ai);
        } else {
            yq1.u0.Bi().z0(Ai);
        }
        ir1.i1 i1Var = new ir1.i1(context, z2Var, biz, i17);
        i1Var.P = Ai;
        pm0.v.X(new ir1.h1(i1Var));
        z2Var.k(i1Var, 0, 0);
        z2Var.C();
        ((br1.m) ((zq1.u) i95.n0.c(zq1.u.class))).Bi(i17, Ai, biz, new ir1.k0(i1Var));
    }

    public final void b(android.content.Context context, java.lang.String openId, int i17) {
        java.lang.String c17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openId, "openId");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(context, 0, 0);
        hr1.a y07 = i17 == 5 ? yq1.u0.Ui().y0(jr1.j.c(openId)) : yq1.u0.Bi().y0(jr1.j.a(openId));
        ir1.i1 i1Var = new ir1.i1(context, z2Var, "", i17);
        i1Var.P = y07;
        pm0.v.X(new ir1.h1(i1Var));
        z2Var.k(i1Var, 0, 0);
        z2Var.C();
        zq1.u uVar = (zq1.u) i95.n0.c(zq1.u.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(y07);
        if (i17 == 5) {
            rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr = tk.s.f501403d;
            c17 = ((ox.r) d0Var).Bi(2).c();
        } else {
            rm.d0 d0Var2 = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr2 = tk.s.f501403d;
            c17 = ((ox.r) d0Var2).Bi(1).c();
        }
        ((br1.m) uVar).Bi(i17, y07, c17, new ir1.l0(i1Var));
    }
}

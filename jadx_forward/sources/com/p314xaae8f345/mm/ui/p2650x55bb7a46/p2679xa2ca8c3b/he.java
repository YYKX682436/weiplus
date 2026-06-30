package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public abstract class he {
    public static boolean a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 a0Var, yb5.d dVar, db5.g4 g4Var, android.view.View view, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17) {
        ot0.q v17;
        int d17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag()).d();
        if (f9Var.j() != null && (v17 = ot0.q.v(c01.w9.l(dVar.D(), f9Var.j(), f9Var.A0()))) != null) {
            if (118 != v17.f430199i) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemAppMsgTingChatRoom", "onCreateContextMenu(from), not ting chatroom type, but enter here.");
            } else {
                lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
                java.lang.String str = v17.f430179d;
                ((kt.c) i0Var).getClass();
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.j(str, false, false);
                if (!z17 && ((f9Var.P0() == 2 || f9Var.P0() == 3 || f9Var.h2() == 1) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.L(f9Var, dVar) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.J(f9Var.Q0()) && !dVar.A())) {
                    g4Var.c(d17, 123, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572402b40), com.p314xaae8f345.mm.R.raw.f79868x8752620f);
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564 c5348xb8e1a564 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564();
                long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
                am.b6 b6Var = c5348xb8e1a564.f135674g;
                b6Var.f87752a = m124847x74d37ac6;
                b6Var.f87753b = f9Var.Q0();
                c5348xb8e1a564.e();
                if (c5348xb8e1a564.f135675h.f87869a) {
                    g4Var.c(d17, 129, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3x), com.p314xaae8f345.mm.R.raw.f79841xc8521962);
                }
                if (!dVar.F()) {
                    g4Var.c(d17, 100, 0, dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
                }
            }
        }
        return true;
    }

    public static boolean b(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 a0Var, android.view.MenuItem menuItem, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (menuItem.getItemId() != 111) {
            return false;
        }
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.la.a(f9Var)) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.s1.c(dVar, f9Var, a0Var.A(dVar, f9Var), 2000, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ce(f9Var, a0Var));
            return false;
        }
        db5.e1.y(dVar.g(), dVar.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c96), "", dVar.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_e), null);
        return false;
    }

    public static boolean c(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 a0Var, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        com.p314xaae8f345.mm.p959x883644fd.b.d(f9Var, com.p314xaae8f345.mm.p959x883644fd.a.Click, dVar.f542255q, dVar.k());
        boolean z17 = true;
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(f9Var.Q0(), 1);
        if (f9Var.j() == null) {
            return false;
        }
        ot0.q content = ot0.q.v(c01.w9.l(dVar.D(), f9Var.j(), f9Var.A0()));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        il4.b bVar = (il4.b) content.y(il4.b.class);
        if (bVar == null) {
            z17 = false;
        } else {
            bw5.o50 v17 = il4.d.v(bVar.f373630c);
            if (v17 != null) {
                qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                qk.f9.a(aj6, context, v17, bw5.ar0.TingScene_Chat, false, null, 24, null);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingMusicPlayHelper", "openChatRoomCategoryItem categoryItem parse failed");
            }
        }
        return z17;
    }
}

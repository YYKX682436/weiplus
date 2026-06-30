package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public final class e3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2650x55bb7a46.e3 f281987a = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.e3();

    public final boolean a(java.util.List selectItems, long j17) {
        ot0.q v17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectItems, "selectItems");
        java.util.Iterator it = selectItems.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next();
            if (f9Var.k2() && (v17 = ot0.q.v(f9Var.j())) != null && ez.v0.f339310a.j(java.lang.Integer.valueOf(v17.f430199i))) {
                long j18 = v17.f430215m;
                if (j18 > j17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingEditModeRetransmitMsg", "file is too large, %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(j18));
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(java.util.List selectItems, long j17) {
        long j18;
        int i17;
        int i18;
        int i19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectItems, "selectItems");
        java.util.Iterator it = selectItems.iterator();
        long j19 = 0;
        while (true) {
            int i27 = 0;
            if (!it.hasNext()) {
                break;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next();
            if (f9Var.m78014x7b98c171() || f9Var.Y2()) {
                wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
                java.lang.String z07 = f9Var.z0();
                ((vf0.y1) x1Var).getClass();
                t21.v2 h17 = t21.d3.h(z07);
                t21.v2 v2Var = null;
                if (h17 != null) {
                    i27 = h17.f496541f;
                    if (t21.d3.s()) {
                        wf0.x1 x1Var2 = (wf0.x1) i95.n0.c(wf0.x1.class);
                        java.lang.String str = h17.S;
                        ((vf0.y1) x1Var2).getClass();
                        v2Var = t21.d3.h(str);
                    }
                }
                j19 += i27;
                if (v2Var != null) {
                    i17 = v2Var.f496541f;
                    j18 = i17;
                }
            } else if (f9Var.J2()) {
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                i17 = m11.b1.Di().b2(f9Var.Q0(), f9Var.I0()).f404169d;
                j18 = i17;
            } else if (f9Var.k2()) {
                ot0.q v17 = ot0.q.v(f9Var.j());
                if (v17 != null && ez.v0.f339310a.j(java.lang.Integer.valueOf(v17.f430199i))) {
                    j18 = v17.f430215m;
                } else if (v17 != null && ((i18 = v17.f430199i) == 24 || i18 == 19)) {
                    r45.ul5 A = bt3.g2.A(v17.f430196h0);
                    if (A != null) {
                        java.util.Iterator it6 = A.f468998f.iterator();
                        int i28 = 0;
                        while (it6.hasNext()) {
                            r45.gp0 gp0Var = (r45.gp0) it6.next();
                            if (gp0Var.I == 17) {
                                r45.ul5 A2 = bt3.g2.A(gp0Var.Z1);
                                if (A2 != null) {
                                    java.util.Iterator it7 = A2.f468998f.iterator();
                                    i19 = 0;
                                    while (it7.hasNext()) {
                                        i19 += (int) ((r45.gp0) it7.next()).R;
                                    }
                                } else {
                                    i19 = 0;
                                }
                                i28 += i19;
                            } else {
                                i28 += (int) gp0Var.R;
                            }
                        }
                        i27 = i28;
                    }
                    j18 = i27;
                }
            }
            j19 += j18;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingEditModeRetransmitMsg", "sumSelectedMsgFileSize, totalSize:%s", java.lang.Long.valueOf(j19));
        return j19 > j17;
    }
}

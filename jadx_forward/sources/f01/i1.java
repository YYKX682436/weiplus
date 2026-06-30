package f01;

/* loaded from: classes9.dex */
public class i1 implements com.p314xaae8f345.mm.p2621x8fb0427b.j8 {
    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.j8
    public void p(com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var, com.p314xaae8f345.mm.p2621x8fb0427b.l8 l8Var) {
        boolean z17;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 z07;
        long mo78012x3fdd41df;
        if (l4Var == null) {
            return;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.G4(l4Var.h1()) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.s4(l4Var.h1()) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.H3(l4Var.h1()) || c01.e2.G(l4Var.h1()) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(l4Var.h1())) {
            if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.H3(l4Var.h1())) {
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.G4(l4Var.h1()) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.s4(l4Var.h1())) {
                    return;
                }
                ((r01.s1) ((r01.x2) i95.n0.c(r01.x2.class))).Ai().a(l4Var, l8Var);
                if ("@blacklist".equals(l4Var.W0())) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(l4Var.h1(), true);
                    if (n17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.d1()) || n17.o2()) {
                        return;
                    }
                    ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).P(new java.lang.String[]{l4Var.h1()}, "");
                    return;
                }
                return;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.m4 m4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.m4) l8Var;
            com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = m4Var.p("floatbottle");
            if (p17 == null) {
                p17 = new com.p314xaae8f345.mm.p2621x8fb0427b.l4("floatbottle");
                z17 = true;
            } else {
                z17 = false;
            }
            p17.k1(1);
            p17.Y1(c01.f1.a());
            final com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u();
            java.util.List list = g9Var.f275514g;
            if (list == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfoStorage", "getLastMsg failed lstTable is null");
                f9Var = null;
            } else {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                final java.lang.String replaceFirst = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(" and not ( type = 10000 and isSend != 2 ) ") ? "" : " and not ( type = 10000 and isSend != 2 ) ".replaceFirst("and", "where");
                int i17 = 0;
                long j17 = 0;
                while (true) {
                    java.util.LinkedList linkedList = (java.util.LinkedList) list;
                    if (i17 >= linkedList.size()) {
                        break;
                    }
                    if ((((xg3.k0) linkedList.get(i17)).f535940c & 8) != 0) {
                        final java.lang.String str = ((xg3.k0) linkedList.get(i17)).f535941d;
                        final java.lang.String str2 = "select * from " + str + replaceFirst + "  order by createTime DESC limit 1";
                        if (g9Var.Da(str)) {
                            z07 = ot0.c3.l().g("getLastMsg[" + str + "]", new yz5.a() { // from class: com.tencent.mm.storage.g9$$e5
                                @Override // yz5.a
                                /* renamed from: invoke */
                                public final java.lang.Object mo152xb9724478() {
                                    return ot0.z2.f430355a.z0(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, str, replaceFirst);
                                }
                            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$f5
                                @Override // yz5.a
                                /* renamed from: invoke */
                                public final java.lang.Object mo152xb9724478() {
                                    android.database.Cursor f17 = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r.f(str2, null, 2);
                                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var3 = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                                    if (f17.moveToFirst()) {
                                        f9Var3.mo9015xbf5d97fd(f17);
                                    }
                                    f17.close();
                                    return f9Var3;
                                }
                            });
                            if (z07.m124847x74d37ac6() > 0 && z07.mo78012x3fdd41df() > j17) {
                                mo78012x3fdd41df = z07.mo78012x3fdd41df();
                                f9Var2 = z07;
                                j17 = mo78012x3fdd41df;
                            }
                        } else {
                            boolean Pb = g9Var.Pb(str);
                            l75.k0 k0Var = g9Var.f275522r;
                            if (Pb) {
                                z07 = ot0.z2.f430355a.z0(k0Var, str, replaceFirst);
                                if (z07.m124847x74d37ac6() > 0 && z07.mo78012x3fdd41df() > j17) {
                                    mo78012x3fdd41df = z07.mo78012x3fdd41df();
                                    f9Var2 = z07;
                                    j17 = mo78012x3fdd41df;
                                }
                            } else {
                                android.database.Cursor f17 = k0Var.f(str2, null, 2);
                                if (f17.moveToFirst()) {
                                    long j18 = f17.getLong(f17.getColumnIndex("createTime"));
                                    if (j17 < j18) {
                                        f9Var2.mo9015xbf5d97fd(f17);
                                        j17 = j18;
                                    }
                                }
                                f17.close();
                            }
                        }
                        i17++;
                    }
                    i17++;
                }
                f9Var = f9Var2;
            }
            if (f9Var == null || f9Var.m124847x74d37ac6() <= 0) {
                p17.f2();
            } else {
                p17.h2(f9Var);
                p17.l1(com.p314xaae8f345.mm.p2621x8fb0427b.z3.Y4(f9Var.Q0()) + ":" + f9Var.j());
                p17.S1(java.lang.Integer.toString(f9Var.mo78013xfb85f7b0()));
                if (m4Var.w() != null) {
                    com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd081 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081();
                    com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd0812 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081();
                    com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
                    f9Var.u1("floatbottle");
                    f9Var.d1(p17.j());
                    qm.a0.d(f9Var, c19772x1c2cd081, c19772x1c2cd0812, c19767x257d7f, false);
                    p17.o1(c19772x1c2cd081.f38869x6ac9171);
                    p17.p1(c19772x1c2cd0812.f38869x6ac9171);
                    p17.K1(c19767x257d7f.f38864x6ac9171);
                }
            }
            if (z17) {
                m4Var.G(p17);
            } else {
                m4Var.W(p17, p17.h1());
            }
        }
    }
}

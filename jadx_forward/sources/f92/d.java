package f92;

/* loaded from: classes8.dex */
public final class d implements l92.a {
    @Override // l92.a
    public void a(int i17, int i18, java.lang.String str, r45.ny3 ny3Var, org.json.JSONObject reportExt) {
        r45.lk2 resp = (r45.lk2) ny3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportExt, "reportExt");
        if (i17 == 0 && i18 == 0) {
            java.util.LinkedList<r45.ac5> m75941xfb821914 = resp.m75941xfb821914(20);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getFinder_list(...)");
            for (r45.ac5 ac5Var : m75941xfb821914) {
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                r45.ya5 ya5Var = (r45.ya5) ac5Var.m75936x14adae67(6);
                java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                if (ya5Var != null) {
                    java.util.LinkedList m75941xfb8219142 = ya5Var.m75941xfb821914(0);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getSheets(...)");
                    pm0.v.d0(m75941xfb8219142, ya2.f1.f542012d);
                    java.util.LinkedList<r45.xa5> m75941xfb8219143 = ya5Var.m75941xfb821914(0);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219143, "getSheets(...)");
                    for (r45.xa5 xa5Var : m75941xfb8219143) {
                        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Ri(xa5Var.m75945x2fec8307(4), xa5Var.m75945x2fec8307(9), null);
                    }
                }
                ac5Var.set(6, ya5Var);
            }
        }
    }

    @Override // l92.a
    public int b() {
        return 7289;
    }

    @Override // l92.a
    public void c(int i17, int i18, java.lang.String str, r45.ny3 ny3Var, org.json.JSONObject reportExt) {
        boolean z17;
        java.lang.Object obj;
        jz5.f0 f0Var;
        java.lang.String str2;
        r45.lk2 resp = (r45.lk2) ny3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportExt, "reportExt");
        if (i17 == 0 && i18 == 0) {
            c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
            java.util.LinkedList m75941xfb821914 = resp.m75941xfb821914(15);
            ((b92.d1) zbVar).getClass();
            zl2.r4.f555483a.U2(m75941xfb821914);
            java.util.LinkedList m75941xfb8219142 = resp.m75941xfb821914(15);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getAlias_info(...)");
            java.util.Iterator it = m75941xfb8219142.iterator();
            while (true) {
                z17 = false;
                if (it.hasNext()) {
                    obj = it.next();
                    if (((r45.of1) obj).m75939xb282bd08(2) == 2) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            r45.of1 of1Var = (r45.of1) obj;
            if (of1Var != null) {
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Vk(of1Var, true, "UserPrepare");
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                if (resp.m75941xfb821914(15) != null && (!r11.isEmpty())) {
                    z17 = true;
                }
                if (z17) {
                    i95.m c17 = i95.n0.c(zy2.b6.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    zy2.b6.Pd((zy2.b6) c17, "UserPrepare", null, 2, null);
                }
            }
            g92.b.f351302e.k2().d().set(20, resp.m75945x2fec8307(21));
            java.util.LinkedList<r45.ac5> m75941xfb8219143 = resp.m75941xfb821914(20);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219143, "getFinder_list(...)");
            for (r45.ac5 ac5Var : m75941xfb8219143) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) ac5Var.m75936x14adae67(1);
                if (c19782x23db1cfa == null || (str2 = c19782x23db1cfa.m76197x6c03c64c()) == null) {
                    str2 = "";
                }
                g92.b.f351302e.F1(str2, new m92.i(ac5Var.m75939xb282bd08(11), ac5Var.m75945x2fec8307(12), false, 4, null));
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.e1) ((c61.l7) i95.n0.c(c61.l7.class)).nk().S()).h(str2, zy2.y8.f559150m);
            }
            ((ku5.t0) ku5.t0.f394148d).a(f92.c.f341773d);
        }
    }
}

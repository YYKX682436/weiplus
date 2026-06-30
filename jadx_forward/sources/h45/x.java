package h45;

/* loaded from: classes9.dex */
public abstract class x {
    public static boolean a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        boolean z17;
        ot0.q v17;
        if (f9Var.mo78013xfb85f7b0() == 419430449) {
            if (f9Var.A0() == 0 && (v17 = ot0.q.v(f9Var.U1())) != null) {
                ot0.n nVar = (ot0.n) v17.y(ot0.n.class);
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var.Q0()) && !c01.z1.r().equals(nVar.f430127c)) {
                    return false;
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6255xde73125b c6255xde73125b = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6255xde73125b();
                c6255xde73125b.f136504g.f89954a = v17.L0;
                c6255xde73125b.e();
                int i17 = c6255xde73125b.f136505h.f90038a;
                if (i17 <= 0) {
                    i17 = v17.I0;
                }
                if (i17 >= 0 && (i17 == 1 || i17 == 21 || i17 == 7 || i17 == 27)) {
                    return true;
                }
            }
        } else if (f9Var.mo78013xfb85f7b0() == 436207665 && f9Var.A0() == 0) {
            java.lang.String j17 = f9Var.j();
            ot0.q v18 = j17 != null ? ot0.q.v(j17) : null;
            if (v18 != null) {
                if (!"1001".equals(v18.f430233q1) && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var.Q0())) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6254x6dec987f c6254x6dec987f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6254x6dec987f();
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v18.f430237r1)) {
                        c6254x6dec987f.f136502g.f89786a = v18.f430237r1;
                        c6254x6dec987f.e();
                        am.x10 x10Var = c6254x6dec987f.f136503h;
                        int i18 = x10Var.f89869b;
                        if (x10Var.f89870c == 0) {
                            return true;
                        }
                    }
                } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var.Q0())) {
                    java.lang.String r17 = c01.z1.r();
                    int i19 = -1;
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(v18.E1)) {
                        java.util.Iterator it = ((java.util.ArrayList) v18.E1).iterator();
                        while (it.hasNext()) {
                            java.lang.String[] split = ((java.lang.String) it.next()).split(",");
                            if (split.length == 3 && split[0].equals(r17)) {
                                i19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[2], -1);
                                z17 = true;
                                break;
                            }
                        }
                    }
                    z17 = false;
                    if (z17 && i19 == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

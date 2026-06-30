package k05;

/* loaded from: classes9.dex */
public class l implements xg3.i0 {
    @Override // xg3.i0
    public void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g.class)).getClass();
        if (z65.c.f551991d || m0Var == null || l0Var == null || l0Var.f535945c == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.r rVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.r();
        java.lang.String str = l0Var.f535944b;
        str.getClass();
        char c17 = 65535;
        switch (str.hashCode()) {
            case -1335458389:
                if (str.equals("delete")) {
                    c17 = 0;
                    break;
                }
                break;
            case -1183792455:
                if (str.equals("insert")) {
                    c17 = 1;
                    break;
                }
                break;
            case -838846263:
                if (str.equals("update")) {
                    c17 = 2;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                rVar.a(l0Var.f535945c, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.p.f262491f);
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.i1.f262438a.d(l0Var.f535945c, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.e1.f262409h);
                return;
            case 1:
                rVar.a(l0Var.f535945c, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.p.f262490e);
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.i1.f262438a.d(l0Var.f535945c, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.e1.f262406e);
                li3.g gVar = (li3.g) ((h45.s) i95.n0.c(h45.s.class));
                gVar.getClass();
                ((ku5.t0) ku5.t0.f394148d).h(new li3.f(gVar, l0Var), "PayPlugin_Msg_Handler");
                return;
            case 2:
                rVar.a(l0Var.f535945c, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.p.f262492g);
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.i1.f262438a.d(l0Var.f535945c, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.e1.f262408g);
                return;
            default:
                return;
        }
    }
}

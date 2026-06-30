package r21;

/* loaded from: classes11.dex */
public class t extends c01.l implements com.p314xaae8f345.mm.p944x882e457a.i1 {
    @Override // c01.l
    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 b(com.p314xaae8f345.mm.p944x882e457a.p0 p0Var, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        int i17;
        r45.j4 j4Var = p0Var.f152259a;
        java.lang.String g17 = x51.j1.g(j4Var.f459094h);
        if (g17 == null || g17.length() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FMessageExtension", "possible friend msg : content is null");
            return null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.y8 i18 = com.p314xaae8f345.mm.p2621x8fb0427b.y8.i(g17);
        if ((i18.f277898h != null || i18.f277899i != null) && ((i17 = i18.f277897g) == 10 || i17 == 11)) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5414x5010811f c5414x5010811f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5414x5010811f();
            java.lang.String str4 = i18.f277898h;
            am.j9 j9Var = c5414x5010811f.f135760g;
            j9Var.f88549a = str4;
            j9Var.f88550b = i18.f277899i;
            c5414x5010811f.e();
            if (c5414x5010811f.f135761h.f88669a) {
                return null;
            }
        }
        if (i18.f277900j > 0) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).hj(i18.f277900j, i18.f277896f);
        }
        java.lang.String str5 = i18.f277891a;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str5 == null) {
            str5 = "";
        }
        if (str5.length() > 0) {
            com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var = new com.p314xaae8f345.mm.p943x351df9c2.r0();
            r0Var.f152062a = i18.f277891a;
            r0Var.f152063b = 3;
            r0Var.f152067f = 1;
            r0Var.f152066e = i18.f277912v;
            r0Var.f152065d = i18.f277913w;
            r0Var.f152070i = -1;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().y0(r0Var);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.p7 p7Var = new com.p314xaae8f345.mm.p2621x8fb0427b.p7();
        p7Var.f66487xac3be4e = r21.v.b(str, j4Var.f459098o);
        p7Var.f66490xff7bdab7 = 0;
        p7Var.f66491xbeb3161d = x51.j1.g(j4Var.f459094h);
        p7Var.f66492x29d4c865 = j4Var.f459101r;
        p7Var.f66493x114ef53e = i18.f277891a;
        p7Var.f66494x2262335f = 0;
        com.p314xaae8f345.mm.p2621x8fb0427b.m7 L0 = r21.w.wi().L0(p7Var.f66493x114ef53e);
        if (L0 != null) {
            java.lang.String str6 = p7Var.f66493x114ef53e;
            java.lang.String str7 = L0.f66376x114ef53e;
            p7Var.f66488x5285fa99 = str6;
            p7Var.f66493x114ef53e = str7;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(p7Var.f66493x114ef53e, true);
        if (n17 != null && n17.r2() && n17.E2 > 0) {
            return null;
        }
        r21.w.Ai().mo880xb970c2b9(p7Var);
        return null;
    }
}

package r21;

/* loaded from: classes11.dex */
public class a0 implements com.p314xaae8f345.mm.p944x882e457a.i1 {
    @Override // com.p314xaae8f345.mm.p944x882e457a.t0
    public com.p314xaae8f345.mm.p944x882e457a.q0 b1(com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        int i17;
        int i18;
        r45.j4 j4Var = p0Var.f152259a;
        java.lang.String g17 = x51.j1.g(j4Var.f459091e);
        if (!"fmessage".equals(g17) && j4Var.f459093g != 37) {
            return null;
        }
        java.lang.String g18 = x51.j1.g(j4Var.f459094h);
        com.p314xaae8f345.mm.p2621x8fb0427b.e9 f17 = com.p314xaae8f345.mm.p2621x8fb0427b.e9.f(g18);
        java.lang.String r17 = c01.z1.r();
        java.lang.String str = f17.f275392a;
        if (str != null && str.equals(r17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VerifyMessageExtension", "fromUserName is self, simply drop this msg");
            return null;
        }
        com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var = new com.p314xaae8f345.mm.p943x351df9c2.r0();
        r0Var.f152062a = f17.f275392a;
        r0Var.f152063b = 3;
        r0Var.f152067f = 1;
        r0Var.f152070i = -1;
        r0Var.f152066e = f17.f275412u;
        r0Var.f152065d = f17.f275413v;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().y0(r0Var);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f17.f275392a)) {
            int i19 = f17.f275399h;
            if (i19 == 18) {
                com.p314xaae8f345.mm.p2621x8fb0427b.t8 t8Var = new com.p314xaae8f345.mm.p2621x8fb0427b.t8();
                t8Var.f66507xad49e234 = x51.j1.g(j4Var.f459094h);
                t8Var.f66508xad24a2e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
                t8Var.f66510xe6e11023 = "";
                t8Var.f66512x7236dff2 = f17.f275397f;
                t8Var.f66514x49f69af2 = f17.f275392a;
                t8Var.f66515x29cbf907 = f17.f275399h;
                int i27 = j4Var.f459095i;
                if (i27 <= 3) {
                    i27 = 3;
                }
                t8Var.f66516x10a0fed7 = i27;
                t8Var.f66517x29d4cc45 = j4Var.f459101r;
                t8Var.f66518x114ef53e = x51.j1.g(j4Var.f459091e);
                t8Var.f66520x2262335f = j4Var.f459093g;
                t8Var.f66511xff7bdab7 = 0;
                t8Var.f66513xe76baaa9 = f17.f275415x;
                t8Var.f66519x11bb99f1 = f17.f275411t;
                t8Var.f66509x225ba391 = 1;
                ((com.p314xaae8f345.mm.p2621x8fb0427b.u8) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Zi()).mo880xb970c2b9(t8Var);
                kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
                java.lang.String str2 = t8Var.f66513xe76baaa9;
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) c0Var).getClass();
                com.p314xaae8f345.mm.p943x351df9c2.g.f(str2, 3);
                c01.d9.b().p().w(73729, 1);
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(f17.f275415x, true);
                if (n17 == null || ((int) n17.E2) <= 0) {
                    ((c01.k7) c01.n8.a()).b(f17.f275415x, 29, new r21.z(this, f17));
                } else {
                    java.lang.String d17 = n17.d1();
                    if (d17 != null && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.E4(d17)) {
                        n17.X1(f17.f275415x);
                        n17.K1(null);
                        ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).p0(d17, n17);
                    }
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5672xb6c0812b c5672xb6c0812b = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5672xb6c0812b();
                    java.lang.String str3 = f17.f275415x;
                    am.ni niVar = c5672xb6c0812b.f135997g;
                    niVar.f88959a = str3;
                    niVar.f88960b = 1;
                    c5672xb6c0812b.e();
                }
                return null;
            }
            if (c01.w9.y(i19)) {
                com.p314xaae8f345.mm.p2621x8fb0427b.pa paVar = new com.p314xaae8f345.mm.p2621x8fb0427b.pa();
                paVar.f66538xad49e234 = x51.j1.g(j4Var.f459094h);
                paVar.f66539xad24a2e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
                paVar.f66540xe6e11023 = "";
                paVar.f66542x7236dff2 = f17.f275397f;
                paVar.f66543x49f69af2 = f17.f275392a;
                paVar.f66544x29cbf907 = f17.f275399h;
                int i28 = j4Var.f459095i;
                if (i28 <= 3) {
                    i28 = 3;
                }
                paVar.f66545x10a0fed7 = i28;
                paVar.f66546x29d4cc45 = j4Var.f459101r;
                paVar.f66547x114ef53e = x51.j1.g(j4Var.f459091e);
                paVar.f66548x2262335f = j4Var.f459093g;
                paVar.f66541xff7bdab7 = 0;
                ((com.p314xaae8f345.mm.p2621x8fb0427b.qa) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).ij()).mo880xb970c2b9(paVar);
                kv.c0 c0Var2 = (kv.c0) i95.n0.c(kv.c0.class);
                java.lang.String str4 = paVar.f66543x49f69af2;
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) c0Var2).getClass();
                com.p314xaae8f345.mm.p943x351df9c2.g.f(str4, 3);
                c01.d9.b().p().w(73730, 1);
                return null;
            }
            if (f17.f275399h == 48) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5866x1e83a4bf c5866x1e83a4bf = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5866x1e83a4bf();
                am.ip ipVar = c5866x1e83a4bf.f136174g;
                ipVar.f88500a = g18;
                ipVar.getClass();
                c5866x1e83a4bf.e();
            }
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.p7 p7Var = new com.p314xaae8f345.mm.p2621x8fb0427b.p7();
        p7Var.f66487xac3be4e = r21.v.b(g17, j4Var.f459098o);
        if (j4Var.f459095i == 4) {
            i18 = 2;
            i17 = 0;
        } else {
            i17 = 0;
            i18 = 0;
        }
        p7Var.f66490xff7bdab7 = i18 + i17;
        p7Var.f66491xbeb3161d = x51.j1.g(j4Var.f459094h);
        p7Var.f66492x29d4c865 = j4Var.f459101r;
        p7Var.f66493x114ef53e = f17.f275392a;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n18 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(f17.f275417z, true);
        if (n18 != null && ((int) n18.E2) != -1) {
            p7Var.f66486x3745f483 = f17.f275417z;
        }
        int i29 = f17.f275414w;
        if (i29 == 2) {
            p7Var.f66494x2262335f = 1;
        } else if (i29 == 5) {
            p7Var.f66494x2262335f = 2;
        } else if (i29 != 6) {
            p7Var.f66494x2262335f = 1;
        } else {
            p7Var.f66494x2262335f = 3;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f17.f275415x)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VerifyMessageExtension", "it should not go in here");
            com.p314xaae8f345.mm.p2621x8fb0427b.m7 L0 = r21.w.wi().L0(p7Var.f66493x114ef53e);
            if (L0 != null) {
                java.lang.String str5 = L0.f66376x114ef53e;
                p7Var.f66488x5285fa99 = str5;
                p7Var.f66493x114ef53e = str5;
            }
            r21.w.Ai().y0(p7Var);
            r21.w.Ai().mo880xb970c2b9(p7Var);
        } else {
            p7Var.f66488x5285fa99 = f17.f275415x;
            r21.w.Ai().y0(p7Var);
            r21.w.Ai().mo880xb970c2b9(p7Var);
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.t0
    public void x5(com.p314xaae8f345.mm.p944x882e457a.r0 r0Var) {
    }
}

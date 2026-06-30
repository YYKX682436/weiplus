package u73;

/* loaded from: classes9.dex */
public abstract class h {
    public static java.lang.String a(long j17) {
        return com.p314xaae8f345.mm.p2802xd031a825.ui.r1.i("" + j17, "100", 2, java.math.RoundingMode.HALF_UP).toString();
    }

    public static java.lang.String b(long j17) {
        return new java.text.SimpleDateFormat(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f).format(new java.util.Date(j17 * 1000));
    }

    public static int c(int i17) {
        if (i17 == 1) {
            return com.p314xaae8f345.mm.R.raw.f79484x1754ca60;
        }
        if (i17 == 2) {
            return com.p314xaae8f345.mm.R.raw.f79490x2c51ab07;
        }
        if (i17 == 3) {
            return com.p314xaae8f345.mm.R.raw.f79482x7790244a;
        }
        if (i17 == 4) {
            return com.p314xaae8f345.mm.R.raw.f79493x59648215;
        }
        return -1;
    }

    public static int d(int i17) {
        return !com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.R.raw.f79486xedd8267b : com.p314xaae8f345.mm.R.raw.f79487x34a774cd;
    }

    public static void e(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6243x5c461184 c6243x5c461184 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6243x5c461184();
        c6243x5c461184.f136491g.f88748a = 8;
        c6243x5c461184.e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HoneyPayUtil", "trigger offline event");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5778x426a2e60 c5778x426a2e60 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5778x426a2e60();
        am.dm dmVar = c5778x426a2e60.f136091g;
        dmVar.f88010a = i17;
        dmVar.f88011b = str;
        c5778x426a2e60.e();
        if (i17 != 1 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        if (!yo3.m.k()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineUtil", "setOfflineBindSerialForHoneyPayCard but offline is not create, ignore");
            return;
        }
        if (yo3.m.i()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineUtil", "offline kinda enable, update default card in kinda");
            ((h45.q) i95.n0.c(h45.q.class)).mo24855x361c2aa3(str, "QMF");
        } else {
            if (yo3.m.f() == 2) {
                new wo3.b(str, "QMF", 0).l();
            } else {
                yo3.m.s(str);
            }
        }
    }

    public static void f(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HoneyPayUtil", "insert sys msg: %s, %s", str, java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        java.lang.String j17 = j(j(str2, str, -1), str3, -1);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        f9Var.j1(0);
        f9Var.u1(str);
        f9Var.r1(6);
        f9Var.d1(j17);
        f9Var.e1(c01.w9.m(str, java.lang.System.currentTimeMillis() / 1000));
        f9Var.m124850x7650bebc(10000);
        f9Var.f1(f9Var.w0() | 8);
        long M9 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HoneyPayUtil", "insert msgId: %s", java.lang.Long.valueOf(M9));
        if (M9 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.HoneyPayUtil", "insert sys msg fail!");
        }
    }

    public static boolean g() {
        int g17 = bm5.o1.f104252a.g(bm5.h0.RepairerConfig_Pay_HoneyPayCross_Int, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HoneyPayUtil", "isOpenCrossSwitch: %s, %s", java.lang.Boolean.TRUE, java.lang.Integer.valueOf(g17));
        return g17 == 0 || g17 == 1;
    }

    public static void h(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, r45.ft5 ft5Var, java.lang.String str, int i17, r45.an6 an6Var) {
        java.util.LinkedList linkedList;
        if (ft5Var == null || (linkedList = ft5Var.f456127d) == null || linkedList.isEmpty()) {
            return;
        }
        u73.g gVar = new u73.g(abstractActivityC21394xb3d2c0cf, ft5Var, str, an6Var, i17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ft5Var.f456128e)) {
            abstractActivityC21394xb3d2c0cf.mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, gVar);
        } else {
            abstractActivityC21394xb3d2c0cf.m78490xd9193382(0, ft5Var.f456128e, com.p314xaae8f345.mm.R.C30859x5a72f63.aaw, gVar);
        }
    }

    public static void i(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, android.os.Bundle bundle, r45.bv3 bv3Var, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1 c19088xa4b300c1 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1();
        c19088xa4b300c1.d("" + bv3Var.f452612d, bv3Var.f452613e, bv3Var.f452614f, bv3Var.f452615g, bv3Var.f452616h, 0);
        if (bundle == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.HoneyPayUtil", "bundle is null!");
            bundle = new android.os.Bundle();
        }
        android.os.Bundle bundle2 = bundle;
        bundle2.putString("realname_verify_process_jump_plugin", "honey_pay");
        c19088xa4b300c1.b(abstractActivityC21394xb3d2c0cf, bundle2, null, new u73.d(z17), false);
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15191, 0, 0, 0, 0, 0, 0, 0, 1);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15191, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1);
        }
    }

    public static java.lang.String j(java.lang.String str, java.lang.String str2, int i17) {
        if (i17 >= 0) {
            return str.replace("$" + str2 + "$", com.p314xaae8f345.mm.p2802xd031a825.ui.r1.I(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.x(str2), i17));
        }
        return str.replace("$" + str2 + "$", com.p314xaae8f345.mm.p2802xd031a825.ui.r1.x(str2));
    }

    public static void k(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HoneyPayUtil", "update msg: %s, %s", str, java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        java.lang.String j17 = j(str2, str3, 6);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            j17 = j(j17, str4, 6);
        }
        u73.b bVar = new u73.b();
        bVar.f67674x6e706659 = str;
        ((u73.c) ((q73.f) i95.n0.c(q73.f.class)).f441914d.a()).get(bVar, new java.lang.String[0]);
        long j18 = bVar.f67673x297eb4f7;
        if (j18 > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HoneyPayUtil", "find msg: %s", java.lang.Long.valueOf(j18));
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4) && !str4.equals(c01.z1.r())) {
                str3 = str4;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(str3, bVar.f67673x297eb4f7);
            if (Li.m124847x74d37ac6() <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.HoneyPayUtil", "can't find msg: %s, may be deleted", java.lang.Long.valueOf(bVar.f67673x297eb4f7));
            } else {
                Li.d1(j17);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(Li.m124847x74d37ac6(), Li, true);
            }
        }
    }
}

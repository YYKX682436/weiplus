package com.p314xaae8f345.mm.p957x53236a1b;

/* loaded from: classes5.dex */
public class d1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: n, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f152839n = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("deleteRevokeMessageThread");

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f152840d;

    /* renamed from: e, reason: collision with root package name */
    public final long f152841e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f152842f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f152843g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f152844h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f152845i;

    /* renamed from: m, reason: collision with root package name */
    public final long f152846m;

    /* JADX WARN: Removed duplicated region for block: B:13:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d1(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p957x53236a1b.d1.<init>(com.tencent.mm.storage.f9, java.lang.String, java.lang.String):void");
    }

    public static boolean H(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var != null) {
            return f9Var.mo78013xfb85f7b0() == 1 || f9Var.mo78013xfb85f7b0() == 16777265 || f9Var.mo78013xfb85f7b0() == 822083633 || f9Var.mo78013xfb85f7b0() == 805306417 || f9Var.mo78013xfb85f7b0() == 1107296305;
        }
        return false;
    }

    public static r15.d I(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null) {
            return null;
        }
        r15.d c17 = ic5.f.f371970c.c(f9Var);
        if (c17 != null) {
            return c17;
        }
        w15.h hVar = new w15.h();
        java.lang.String f27 = f9Var.f2();
        if (f27 == null) {
            f27 = "";
        }
        hVar.m126728xdc93280d(f27);
        if (hVar.j() == null || hVar.j().j() == null) {
            return null;
        }
        return hVar.j().j();
    }

    public static void J(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str3) {
        java.util.Map d17;
        if (!H(f9Var)) {
            r15.d I = ((kc5.x) ((wg3.j) i95.n0.c(wg3.j.class))).Ni() ? I(f9Var) : null;
            f9Var.d1(str);
            if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20544xcfdbf979()) == 1) {
                f9Var.m124850x7650bebc(285222674);
                w15.h hVar = new w15.h();
                w15.e eVar = new w15.e();
                w15.d dVar = new w15.d();
                dVar.s(c01.id.a() / 1000);
                dVar.w(str);
                dVar.u("revokemsgcontent");
                eVar.k(dVar);
                hVar.o("revokemsgcontent");
                eVar.l(str);
                hVar.n(eVar);
                if (I != null) {
                    r15.b bVar = new r15.b();
                    bVar.o(I);
                    hVar.l(bVar);
                }
                f9Var.x3(hVar.m126747x696739c());
            } else {
                f9Var.m124850x7650bebc(268445456);
                f9Var.x3(str);
            }
            tg3.p1.f500739a.d(f9Var);
            return;
        }
        java.lang.String K = f9Var.mo78013xfb85f7b0() == 822083633 ? K(str3) : str3;
        int mo78013xfb85f7b0 = f9Var.mo78013xfb85f7b0();
        java.lang.String K2 = K(f9Var.G);
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20544xcfdbf979()) != 1) {
            f9Var.m124850x7650bebc(268445458);
            java.lang.String format = java.lang.String.format("<sysmsg type=\"invokeMessage\"><invokeMessage><text><![CDATA[%s]]></text><timestamp><![CDATA[%s]]></timestamp><link><text><![CDATA[%s]]></text></link><preContent><![CDATA[%s]]></preContent><type><![CDATA[%s]]></type><msgSource><![CDATA[%s]]></msgSource></invokeMessage></sysmsg>", str, java.lang.Long.valueOf(c01.id.a()), str2, "", java.lang.Integer.valueOf(mo78013xfb85f7b0), K2);
            f9Var.d1(K);
            f9Var.x3(format);
            return;
        }
        f9Var.m124850x7650bebc(285222674);
        w15.h hVar2 = new w15.h();
        w15.e eVar2 = new w15.e();
        w15.d dVar2 = new w15.d();
        dVar2.s(c01.id.a() / 1000);
        dVar2.u("revokemsgcontent");
        dVar2.p(1);
        dVar2.w(str);
        if (!android.text.TextUtils.isEmpty(K2)) {
            try {
                K2 = new java.lang.String(android.util.Base64.decode(K2, 0));
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneRevokeMsg", th6, "parse msgSourceStr err", new java.lang.Object[0]);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(K2) && (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(K2, "msgsource", null)) != null) {
                dVar2.q((java.lang.String) d17.get(".msgsource.atuserlist"));
            }
        }
        dVar2.r(f9Var.I0());
        dVar2.t(mo78013xfb85f7b0);
        eVar2.k(dVar2);
        eVar2.l(str);
        hVar2.o("revokemsgcontent");
        hVar2.n(eVar2);
        f9Var.x3(hVar2.m126747x696739c());
        f9Var.d1(K);
    }

    public static java.lang.String K(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return android.util.Base64.encodeToString(str.getBytes(), 0);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneRevokeMsg", th6, "safeBase64Encode err:%s", str);
            return "";
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f152840d = u0Var;
        return mo9409x10f9447a(sVar, this.f152844h, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 594;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (((java.lang.Integer) bm5.o1.f104252a.d(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2564xc84f0e86.C20645x747bf9a3())).intValue() == 1) {
            r45.xs5 xs5Var = (r45.xs5) this.f152844h.f152244b.f152233a;
            if (xs5Var != null) {
                xs5Var.f471914e = null;
            }
            i18 = 4;
            i19 = -1;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(this.f152842f, this.f152841e);
        cd0.c0 c0Var = cd0.c0.f122061a;
        if (i18 == 0 && i19 == 0) {
            c0Var.a(Li, 1);
        } else {
            c0Var.a(Li, 2);
        }
        if ((i18 == 0 && i19 == 0) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f152845i)) {
            long m124847x74d37ac6 = Li.m124847x74d37ac6();
            long j17 = this.f152841e;
            if (m124847x74d37ac6 == j17) {
                if (Li.mo78013xfb85f7b0() == 1090519089) {
                    ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p957x53236a1b.a1(this, Li.j(), Li));
                } else {
                    c01.w9.e(Li, false);
                }
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 M1 = com.p314xaae8f345.mm.p2621x8fb0427b.f9.M1(Li);
                r45.xs5 xs5Var2 = (r45.xs5) this.f152844h.f152244b.f152233a;
                if (xs5Var2 == null) {
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneRevokeMsg", "[oneliang][doSceneEnd.revokeMsg] msgId:%s,msgSvrId:%s,responseSysWording:%s， type:%s", java.lang.Long.valueOf(Li.m124847x74d37ac6()), java.lang.Long.valueOf(Li.I0()), xs5Var2.f471914e, java.lang.Integer.valueOf(Li.mo78013xfb85f7b0()));
                int mo78013xfb85f7b0 = Li.mo78013xfb85f7b0();
                J(this.f152843g, "  " + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g3_), Li, Li.j());
                Li.j1(0);
                Li.y3();
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5946x34ca3d16 c5946x34ca3d16 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5946x34ca3d16();
                am.ds dsVar = c5946x34ca3d16.f136247g;
                dsVar.f88029a = this.f152841e;
                dsVar.f88031c = this.f152842f;
                c5946x34ca3d16.e();
                ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(Li.m124847x74d37ac6(), Li, true);
                ((ri3.e) ((aa0.e) i95.n0.c(aa0.e.class))).Zi(Li.Q0(), Li.m124847x74d37ac6(), Li.I0());
                java.lang.Object l17 = c01.d9.b().p().l(290818, 0);
                c01.d9.b().p().w(290818, java.lang.Integer.valueOf((l17 != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(l17.toString(), 0) : 0) + 1));
                Li.m124850x7650bebc(mo78013xfb85f7b0);
                if (Li.k2()) {
                    v90.v vVar = (v90.v) i95.n0.c(v90.v.class);
                    ot0.u.a(Li);
                    ((u90.a) vVar).getClass();
                    com.p314xaae8f345.mm.p959x883644fd.e.f153038a.getClass();
                } else {
                    ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).getClass();
                    com.p314xaae8f345.mm.p959x883644fd.e.f153038a.getClass();
                }
                f152839n.mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p957x53236a1b.b1(this, Li), 300000L);
                if (kn.l0.a(M1)) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5761xb35fab50 c5761xb35fab50 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5761xb35fab50();
                    c5761xb35fab50.f136080g.f89436a = M1;
                    c5761xb35fab50.e();
                }
                if (t21.d3.s() && Li.m78014x7b98c171()) {
                    wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
                    java.lang.String z07 = Li.z0();
                    ((vf0.y1) x1Var).getClass();
                    t21.v2 h17 = t21.d3.h(z07);
                    if (h17 != null && h17.f496537c != this.f152846m) {
                        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p957x53236a1b.c1(this, Li, h17));
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneRevokeMsg", "cannot find the msg:%d after revoke.", java.lang.Long.valueOf(j17));
            }
        } else if (H(Li)) {
            Li.l1(Li.F & (-5));
            ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(Li.m124847x74d37ac6(), Li, true);
        }
        this.f152840d.mo815x76e0bfae(i18, i19, str, this);
    }
}

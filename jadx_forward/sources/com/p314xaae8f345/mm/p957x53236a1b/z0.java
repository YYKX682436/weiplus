package com.p314xaae8f345.mm.p957x53236a1b;

/* loaded from: classes12.dex */
public class z0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f152988d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.v0 f152989e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f152990f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f152991g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f152992h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f152993i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f152994m;

    /* renamed from: n, reason: collision with root package name */
    public final int f152995n;

    /* renamed from: o, reason: collision with root package name */
    public final int f152996o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f152997p;

    /* renamed from: q, reason: collision with root package name */
    public int f152998q = 2;

    public z0(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, int i18, java.lang.String str9, java.lang.String str10, java.lang.String str11, boolean z17, boolean z18) {
        this.f152997p = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneReg", "init: use:%s pwd:%s nick:%s bindqq:%d email:%s mobile:%s [%s,%s,%s] regmode:%d alias:%s [%s,%s] force:%b avatar:%b", str, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(str2), str3, java.lang.Integer.valueOf(i17), str4, str5, str6, str7, str8, java.lang.Integer.valueOf(i18), str9, str11, str10, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        this.f152996o = i18;
        c01.i9 i9Var = new c01.i9();
        this.f152989e = i9Var;
        o45.bi biVar = (o45.bi) i9Var.mo47979x2d63726f();
        boolean z19 = false;
        biVar.mo150593xca029c98(0);
        r45.yv4 yv4Var = biVar.f424442a;
        yv4Var.f472938d = str;
        yv4Var.f472939e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A(str2);
        if (i18 == 4) {
            yv4Var.f472939e = str8;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneReg", "dkreg rand:" + str8 + " reqMd5:" + yv4Var.f472939e);
        }
        yv4Var.f472940f = str3;
        yv4Var.f472941g = i17;
        yv4Var.f472942h = str4;
        yv4Var.f472943i = str5;
        yv4Var.f472944m = str8;
        yv4Var.f472947p = i18;
        yv4Var.f472948q = "" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k0();
        yv4Var.f472951t = wo.w0.o();
        yv4Var.f472949r = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
        yv4Var.f472945n = 0;
        yv4Var.f472953v = str9;
        yv4Var.f472955x = str11;
        yv4Var.f472954w = str10;
        yv4Var.f472950s = z17 ? 1 : 0;
        yv4Var.f472956y = z18 ? 1 : 0;
        yv4Var.A = gm0.m.e();
        yv4Var.C = wo.w0.c();
        yv4Var.D = wo.w0.i();
        yv4Var.E = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0).getString("installreferer", "");
        yv4Var.F = fo3.s.INSTANCE.I3(2);
        yv4Var.H = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e() + "_google_aid", 4).getString("getgoogleaid", "");
        yv4Var.U = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b;
        this.f152990f = str;
        this.f152991g = str3;
        this.f152992h = str4;
        this.f152993i = str5;
        this.f152995n = i17;
        this.f152994m = str9;
        if ((str8 == null || str8.length() <= 0) && (str4 == null || str4.length() <= 0)) {
            z19 = true;
        }
        this.f152997p = z19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneReg", "reg json=%s", yv4Var.mo12245xcc313de3());
    }

    public java.lang.String H() {
        java.util.LinkedList linkedList;
        r45.w56 w56Var = ((c01.i9) this.f152989e).f118786b.f424447a.G;
        if (w56Var != null && (linkedList = w56Var.f470438e) != null && linkedList.size() > 0) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.gg6 gg6Var = (r45.gg6) it.next();
                if (gg6Var.f456770d == 2) {
                    return gg6Var.f456771e;
                }
            }
        }
        return "";
    }

    public int I() {
        java.util.LinkedList linkedList;
        r45.w56 w56Var = ((c01.i9) this.f152989e).f118786b.f424447a.G;
        if (w56Var == null || (linkedList = w56Var.f470438e) == null || linkedList.size() <= 0) {
            return 2;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.gg6 gg6Var = (r45.gg6) it.next();
            if (gg6Var.f456770d == 3) {
                return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(gg6Var.f456771e, 2);
            }
        }
        return 2;
    }

    public java.lang.String J() {
        java.util.LinkedList linkedList;
        r45.w56 w56Var = ((c01.i9) this.f152989e).f118786b.f424447a.G;
        if (w56Var != null && (linkedList = w56Var.f470438e) != null && linkedList.size() > 0) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.gg6 gg6Var = (r45.gg6) it.next();
                if (gg6Var.f456770d == 17) {
                    return gg6Var.f456771e;
                }
            }
        }
        return null;
    }

    public java.lang.String K() {
        return ((c01.i9) this.f152989e).f118786b.f424447a.D;
    }

    public void L(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        ((o45.bi) this.f152989e.mo47979x2d63726f()).f424442a.P = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneReg", "setRegSessionId %s", str);
    }

    public void M(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        ((o45.bi) this.f152989e.mo47979x2d63726f()).f424442a.R = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneReg", "thirdAppTicket %s", str);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f152988d = u0Var;
        return mo9409x10f9447a(sVar, this.f152989e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 126;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        int i27;
        o45.ci ciVar;
        boolean z17;
        com.p314xaae8f345.mm.p957x53236a1b.z0 z0Var = this;
        o45.ci ciVar2 = (o45.ci) v0Var.mo13821x7f35c2d1();
        r45.zv4 zv4Var = ciVar2.f424447a;
        if (zv4Var != null) {
            int i28 = zv4Var.K;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneReg", "summerauth mmtls reg json:%s", zv4Var.mo12245xcc313de3());
            gm0.j1.i();
            gm0.j1.u().f354681a.f(47, java.lang.Integer.valueOf(i28));
            com.p314xaae8f345.mm.p971x6de15a2e.s sVar = gm0.j1.n().f354821b.f152297d;
            if (sVar != null) {
                sVar.n1((i28 & 1) == 0);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneReg", "summerauth mmtls reg not set as ret:%s", java.lang.Integer.valueOf(ciVar2.mo150578x7f2fddf8()));
        }
        if (i18 == 4 && i19 == -301) {
            r45.zv4 zv4Var2 = ciVar2.f424447a;
            c01.f9.d(zv4Var2.f473932p, zv4Var2.f473936t, zv4Var2.A, true, 0);
            int i29 = z0Var.f152998q - 1;
            z0Var.f152998q = i29;
            if (i29 <= 0) {
                z0Var.f152988d.mo815x76e0bfae(3, -1, "", z0Var);
                return;
            } else {
                z0Var.mo807x6c193ac1(m47995xb7ba1aa7(), z0Var.f152988d);
                return;
            }
        }
        if (i18 == 4 && i19 == -240) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneReg", "summerauth auth MM_ERR_AUTO_RETRY_REQUEST redirectCount:%s", java.lang.Integer.valueOf(z0Var.f152998q));
            int i37 = z0Var.f152998q - 1;
            z0Var.f152998q = i37;
            if (i37 <= 0) {
                z0Var.f152988d.mo815x76e0bfae(3, -1, "", z0Var);
                return;
            } else {
                z0Var.mo807x6c193ac1(m47995xb7ba1aa7(), z0Var.f152988d);
                return;
            }
        }
        if (i18 == 4 && i19 == -102) {
            int i38 = v0Var.mo47979x2d63726f().m150614x960aaed8().f424532c;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneReg", "summerauth auth MM_ERR_CERT_EXPIRED  getcert now  old ver:%d", java.lang.Integer.valueOf(i38));
            gm0.j1.e().j(new com.p314xaae8f345.mm.p957x53236a1b.y0(z0Var, i38));
            return;
        }
        if (i18 == 4 && (i19 == -305 || i19 == -306)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneReg", "summerauth newreg MM_ERR_CERT_SWITCH or MM_ERR_ECDHFAIL_ROLLBACK errCode:%d ver:%d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(o45.ag.a()));
            z0Var.mo807x6c193ac1(m47995xb7ba1aa7(), z0Var.f152988d);
            return;
        }
        if (i18 != 0 || i19 != 0) {
            z0Var.f152988d.mo815x76e0bfae(i18, i19, str, z0Var);
            return;
        }
        o45.bi biVar = (o45.bi) v0Var.mo47979x2d63726f();
        r45.zv4 zv4Var3 = ciVar2.f424447a;
        java.lang.String str2 = zv4Var3.f473941y;
        int i39 = zv4Var3.f473938v;
        int i47 = biVar.f424442a.f472947p;
        if (zv4Var3.f473923d == 0 || z0Var.f152997p) {
            i27 = 21;
        } else {
            gm0.j1.i();
            gm0.j1.b().f354774d = biVar.f424442a.f472938d;
            gm0.j1.i().k(ciVar2.f424447a.f473923d);
            gm0.j1.u().c().w(2, biVar.f424442a.f472938d);
            gm0.j1.u().c().w(16, 1);
            gm0.j1.u().c().w(52, java.lang.Integer.valueOf(ciVar2.f424447a.f473938v));
            gm0.j1.u().c().w(340240, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            gm0.j1.u().c().w(340241, java.lang.Boolean.TRUE);
            c01.je.p(ciVar2.f424447a.M);
            c01.je.n(ciVar2.f424447a.N);
            c01.je.j(ciVar2.f424447a.P);
            java.lang.String str3 = z0Var.f152990f;
            if (str3 != null && str3.length() > 0 && z0Var.f152996o != 1) {
                ciVar2.f424447a.f473934r = z0Var.f152990f;
            }
            r45.zv4 zv4Var4 = ciVar2.f424447a;
            zv4Var4.f473928i = z0Var.f152992h;
            zv4Var4.f473935s = 0;
            if (!gm0.j1.a() || gm0.j1.u().c() == null) {
                ciVar = ciVar2;
                z17 = true;
                i27 = 21;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneReg", "dkwt ERR: updateProfile acc:%b uin:%s userConfigStg:%s", java.lang.Boolean.valueOf(gm0.j1.a()), kk.v.a(gm0.j1.b().h()), gm0.j1.u().c());
            } else {
                java.lang.String str4 = z0Var.f152994m;
                int i48 = z0Var.f152995n;
                java.lang.String str5 = z0Var.f152991g;
                java.lang.String str6 = z0Var.f152993i;
                r45.zv4 zv4Var5 = ciVar2.f424447a;
                java.lang.String selfUsername = zv4Var5.f473934r;
                java.lang.String str7 = zv4Var5.f473928i;
                int i49 = zv4Var5.f473935s;
                ciVar = ciVar2;
                java.lang.String str8 = zv4Var5.f473925f;
                java.lang.String str9 = zv4Var5.f473926g;
                int i57 = zv4Var5.f473929m;
                int i58 = zv4Var5.f473930n;
                java.lang.String str10 = zv4Var5.f473924e;
                java.lang.String str11 = zv4Var5.f473933q;
                java.lang.String str12 = zv4Var5.f473939w;
                z17 = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HandleAuthResponse", "dkwt updateProfile user:%s alias:%s qq:%s nick:%s email:%s mobile:%s status:%d offuser:%s offnick:%s pushmail:%d sendCard:%d session:%s fsurl:%s pluginFlag:%d atuhkey:%s a2:%s newa2:%s kisd:%s safedev:%d MicroBlog:%s emailpwd:%d", selfUsername, str4, kk.v.a(i48), str5, str7, str6, java.lang.Integer.valueOf(i49), str8, str9, java.lang.Integer.valueOf(i57), java.lang.Integer.valueOf(i58), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(str10), str11, 0, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(str12), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(null), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(null), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(null), -1, zv4Var5.f473927h, 0);
                com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
                c01.b9 b9Var = c01.b9.f118602c;
                b9Var.d("login_weixin_username", selfUsername);
                b9Var.d("last_login_nick_name", str5);
                b9Var.c(str6, i48, str7);
                c17.w(2, selfUsername);
                c17.w(42, str4);
                c17.w(9, java.lang.Integer.valueOf(i48));
                c17.w(4, str5);
                c17.w(5, str7);
                c17.w(6, str6);
                c17.w(7, java.lang.Integer.valueOf(i49));
                i27 = 21;
                c17.w(21, str8);
                c17.w(22, str9);
                c17.w(57, 0);
                c17.w(17, java.lang.Integer.valueOf(i57));
                c17.w(25, java.lang.Integer.valueOf(i58));
                c17.w(1, str10);
                c17.w(29, str11);
                c17.w(34, 0);
                c17.w(256, java.lang.Boolean.FALSE);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HandleAuthResponse", "summerstatus USERINFO_FORCE_UPDATE_AUTH set false");
                c17.w(-1535680990, str12);
                c17.w(46, null);
                c17.w(72, null);
                c17.w(64, -1);
                c17.i(true);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selfUsername, "selfUsername");
                bn0.g.f104312a.h("USERINFO_USERNAME", selfUsername);
                z0Var = this;
                ((dn1.i) i95.n0.c(dn1.i.class)).f323407d.mo8829x6279e596(ciVar, z0Var.f152994m, z0Var.f152995n, z0Var.f152991g, z0Var.f152993i, 0);
            }
            gm0.j1.u().c().i(z17);
            int i59 = ciVar.f424447a.f473937u;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(new e21.p(i27, "android-" + android.os.Build.VERSION.SDK_INT + "-" + wo.w0.m()));
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new e21.q(linkedList));
        z0Var.f152988d.mo815x76e0bfae(i18, i19, str, z0Var);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return 3;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: setSecurityCheckError */
    public void mo14485xb35c0942(com.p314xaae8f345.mm.p944x882e457a.n1 n1Var) {
    }
}

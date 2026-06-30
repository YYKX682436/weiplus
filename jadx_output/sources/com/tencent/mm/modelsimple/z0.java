package com.tencent.mm.modelsimple;

/* loaded from: classes12.dex */
public class z0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f71455d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.network.v0 f71456e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f71457f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f71458g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f71459h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f71460i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f71461m;

    /* renamed from: n, reason: collision with root package name */
    public final int f71462n;

    /* renamed from: o, reason: collision with root package name */
    public final int f71463o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f71464p;

    /* renamed from: q, reason: collision with root package name */
    public int f71465q = 2;

    public z0(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, int i18, java.lang.String str9, java.lang.String str10, java.lang.String str11, boolean z17, boolean z18) {
        this.f71464p = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneReg", "init: use:%s pwd:%s nick:%s bindqq:%d email:%s mobile:%s [%s,%s,%s] regmode:%d alias:%s [%s,%s] force:%b avatar:%b", str, com.tencent.mm.sdk.platformtools.t8.G1(str2), str3, java.lang.Integer.valueOf(i17), str4, str5, str6, str7, str8, java.lang.Integer.valueOf(i18), str9, str11, str10, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        this.f71463o = i18;
        c01.i9 i9Var = new c01.i9();
        this.f71456e = i9Var;
        o45.bi biVar = (o45.bi) i9Var.getReqObj();
        boolean z19 = false;
        biVar.setUin(0);
        r45.yv4 yv4Var = biVar.f342909a;
        yv4Var.f391405d = str;
        yv4Var.f391406e = com.tencent.mm.sdk.platformtools.t8.A(str2);
        if (i18 == 4) {
            yv4Var.f391406e = str8;
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneReg", "dkreg rand:" + str8 + " reqMd5:" + yv4Var.f391406e);
        }
        yv4Var.f391407f = str3;
        yv4Var.f391408g = i17;
        yv4Var.f391409h = str4;
        yv4Var.f391410i = str5;
        yv4Var.f391411m = str8;
        yv4Var.f391414p = i18;
        yv4Var.f391415q = "" + com.tencent.mm.sdk.platformtools.t8.k0();
        yv4Var.f391418t = wo.w0.o();
        yv4Var.f391416r = com.tencent.mm.sdk.platformtools.m2.d();
        yv4Var.f391412n = 0;
        yv4Var.f391420v = str9;
        yv4Var.f391422x = str11;
        yv4Var.f391421w = str10;
        yv4Var.f391417s = z17 ? 1 : 0;
        yv4Var.f391423y = z18 ? 1 : 0;
        yv4Var.A = gm0.m.e();
        yv4Var.C = wo.w0.c();
        yv4Var.D = wo.w0.i();
        yv4Var.E = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).getString("installreferer", "");
        yv4Var.F = fo3.s.INSTANCE.I3(2);
        yv4Var.H = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e() + "_google_aid", 4).getString("getgoogleaid", "");
        yv4Var.U = com.tencent.mm.sdk.platformtools.x2.f193072b;
        this.f71457f = str;
        this.f71458g = str3;
        this.f71459h = str4;
        this.f71460i = str5;
        this.f71462n = i17;
        this.f71461m = str9;
        if ((str8 == null || str8.length() <= 0) && (str4 == null || str4.length() <= 0)) {
            z19 = true;
        }
        this.f71464p = z19;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneReg", "reg json=%s", yv4Var.toJSON());
    }

    public java.lang.String H() {
        java.util.LinkedList linkedList;
        r45.w56 w56Var = ((c01.i9) this.f71456e).f37253b.f342914a.G;
        if (w56Var != null && (linkedList = w56Var.f388905e) != null && linkedList.size() > 0) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.gg6 gg6Var = (r45.gg6) it.next();
                if (gg6Var.f375237d == 2) {
                    return gg6Var.f375238e;
                }
            }
        }
        return "";
    }

    public int I() {
        java.util.LinkedList linkedList;
        r45.w56 w56Var = ((c01.i9) this.f71456e).f37253b.f342914a.G;
        if (w56Var == null || (linkedList = w56Var.f388905e) == null || linkedList.size() <= 0) {
            return 2;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.gg6 gg6Var = (r45.gg6) it.next();
            if (gg6Var.f375237d == 3) {
                return com.tencent.mm.sdk.platformtools.t8.P(gg6Var.f375238e, 2);
            }
        }
        return 2;
    }

    public java.lang.String J() {
        java.util.LinkedList linkedList;
        r45.w56 w56Var = ((c01.i9) this.f71456e).f37253b.f342914a.G;
        if (w56Var != null && (linkedList = w56Var.f388905e) != null && linkedList.size() > 0) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.gg6 gg6Var = (r45.gg6) it.next();
                if (gg6Var.f375237d == 17) {
                    return gg6Var.f375238e;
                }
            }
        }
        return null;
    }

    public java.lang.String K() {
        return ((c01.i9) this.f71456e).f37253b.f342914a.D;
    }

    public void L(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        ((o45.bi) this.f71456e.getReqObj()).f342909a.P = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneReg", "setRegSessionId %s", str);
    }

    public void M(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        ((o45.bi) this.f71456e.getReqObj()).f342909a.R = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneReg", "thirdAppTicket %s", str);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f71455d = u0Var;
        return dispatch(sVar, this.f71456e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 126;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        int i27;
        o45.ci ciVar;
        boolean z17;
        com.tencent.mm.modelsimple.z0 z0Var = this;
        o45.ci ciVar2 = (o45.ci) v0Var.getRespObj();
        r45.zv4 zv4Var = ciVar2.f342914a;
        if (zv4Var != null) {
            int i28 = zv4Var.K;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneReg", "summerauth mmtls reg json:%s", zv4Var.toJSON());
            gm0.j1.i();
            gm0.j1.u().f273148a.f(47, java.lang.Integer.valueOf(i28));
            com.tencent.mm.network.s sVar = gm0.j1.n().f273288b.f70764d;
            if (sVar != null) {
                sVar.n1((i28 & 1) == 0);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneReg", "summerauth mmtls reg not set as ret:%s", java.lang.Integer.valueOf(ciVar2.getRetCode()));
        }
        if (i18 == 4 && i19 == -301) {
            r45.zv4 zv4Var2 = ciVar2.f342914a;
            c01.f9.d(zv4Var2.f392399p, zv4Var2.f392403t, zv4Var2.A, true, 0);
            int i29 = z0Var.f71465q - 1;
            z0Var.f71465q = i29;
            if (i29 <= 0) {
                z0Var.f71455d.onSceneEnd(3, -1, "", z0Var);
                return;
            } else {
                z0Var.doScene(dispatcher(), z0Var.f71455d);
                return;
            }
        }
        if (i18 == 4 && i19 == -240) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneReg", "summerauth auth MM_ERR_AUTO_RETRY_REQUEST redirectCount:%s", java.lang.Integer.valueOf(z0Var.f71465q));
            int i37 = z0Var.f71465q - 1;
            z0Var.f71465q = i37;
            if (i37 <= 0) {
                z0Var.f71455d.onSceneEnd(3, -1, "", z0Var);
                return;
            } else {
                z0Var.doScene(dispatcher(), z0Var.f71455d);
                return;
            }
        }
        if (i18 == 4 && i19 == -102) {
            int i38 = v0Var.getReqObj().getRsaInfo().f342999c;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneReg", "summerauth auth MM_ERR_CERT_EXPIRED  getcert now  old ver:%d", java.lang.Integer.valueOf(i38));
            gm0.j1.e().j(new com.tencent.mm.modelsimple.y0(z0Var, i38));
            return;
        }
        if (i18 == 4 && (i19 == -305 || i19 == -306)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneReg", "summerauth newreg MM_ERR_CERT_SWITCH or MM_ERR_ECDHFAIL_ROLLBACK errCode:%d ver:%d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(o45.ag.a()));
            z0Var.doScene(dispatcher(), z0Var.f71455d);
            return;
        }
        if (i18 != 0 || i19 != 0) {
            z0Var.f71455d.onSceneEnd(i18, i19, str, z0Var);
            return;
        }
        o45.bi biVar = (o45.bi) v0Var.getReqObj();
        r45.zv4 zv4Var3 = ciVar2.f342914a;
        java.lang.String str2 = zv4Var3.f392408y;
        int i39 = zv4Var3.f392405v;
        int i47 = biVar.f342909a.f391414p;
        if (zv4Var3.f392390d == 0 || z0Var.f71464p) {
            i27 = 21;
        } else {
            gm0.j1.i();
            gm0.j1.b().f273241d = biVar.f342909a.f391405d;
            gm0.j1.i().k(ciVar2.f342914a.f392390d);
            gm0.j1.u().c().w(2, biVar.f342909a.f391405d);
            gm0.j1.u().c().w(16, 1);
            gm0.j1.u().c().w(52, java.lang.Integer.valueOf(ciVar2.f342914a.f392405v));
            gm0.j1.u().c().w(340240, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            gm0.j1.u().c().w(340241, java.lang.Boolean.TRUE);
            c01.je.p(ciVar2.f342914a.M);
            c01.je.n(ciVar2.f342914a.N);
            c01.je.j(ciVar2.f342914a.P);
            java.lang.String str3 = z0Var.f71457f;
            if (str3 != null && str3.length() > 0 && z0Var.f71463o != 1) {
                ciVar2.f342914a.f392401r = z0Var.f71457f;
            }
            r45.zv4 zv4Var4 = ciVar2.f342914a;
            zv4Var4.f392395i = z0Var.f71459h;
            zv4Var4.f392402s = 0;
            if (!gm0.j1.a() || gm0.j1.u().c() == null) {
                ciVar = ciVar2;
                z17 = true;
                i27 = 21;
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneReg", "dkwt ERR: updateProfile acc:%b uin:%s userConfigStg:%s", java.lang.Boolean.valueOf(gm0.j1.a()), kk.v.a(gm0.j1.b().h()), gm0.j1.u().c());
            } else {
                java.lang.String str4 = z0Var.f71461m;
                int i48 = z0Var.f71462n;
                java.lang.String str5 = z0Var.f71458g;
                java.lang.String str6 = z0Var.f71460i;
                r45.zv4 zv4Var5 = ciVar2.f342914a;
                java.lang.String selfUsername = zv4Var5.f392401r;
                java.lang.String str7 = zv4Var5.f392395i;
                int i49 = zv4Var5.f392402s;
                ciVar = ciVar2;
                java.lang.String str8 = zv4Var5.f392392f;
                java.lang.String str9 = zv4Var5.f392393g;
                int i57 = zv4Var5.f392396m;
                int i58 = zv4Var5.f392397n;
                java.lang.String str10 = zv4Var5.f392391e;
                java.lang.String str11 = zv4Var5.f392400q;
                java.lang.String str12 = zv4Var5.f392406w;
                z17 = true;
                com.tencent.mars.xlog.Log.i("MicroMsg.HandleAuthResponse", "dkwt updateProfile user:%s alias:%s qq:%s nick:%s email:%s mobile:%s status:%d offuser:%s offnick:%s pushmail:%d sendCard:%d session:%s fsurl:%s pluginFlag:%d atuhkey:%s a2:%s newa2:%s kisd:%s safedev:%d MicroBlog:%s emailpwd:%d", selfUsername, str4, kk.v.a(i48), str5, str7, str6, java.lang.Integer.valueOf(i49), str8, str9, java.lang.Integer.valueOf(i57), java.lang.Integer.valueOf(i58), com.tencent.mm.sdk.platformtools.t8.G1(str10), str11, 0, com.tencent.mm.sdk.platformtools.t8.G1(str12), com.tencent.mm.sdk.platformtools.t8.G1(null), com.tencent.mm.sdk.platformtools.t8.G1(null), com.tencent.mm.sdk.platformtools.t8.G1(null), -1, zv4Var5.f392394h, 0);
                com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                c01.b9 b9Var = c01.b9.f37069c;
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
                com.tencent.mars.xlog.Log.i("MicroMsg.HandleAuthResponse", "summerstatus USERINFO_FORCE_UPDATE_AUTH set false");
                c17.w(-1535680990, str12);
                c17.w(46, null);
                c17.w(72, null);
                c17.w(64, -1);
                c17.i(true);
                kotlin.jvm.internal.o.g(selfUsername, "selfUsername");
                bn0.g.f22779a.h("USERINFO_USERNAME", selfUsername);
                z0Var = this;
                ((dn1.i) i95.n0.c(dn1.i.class)).f241874d.onRegResponse(ciVar, z0Var.f71461m, z0Var.f71462n, z0Var.f71458g, z0Var.f71460i, 0);
            }
            gm0.j1.u().c().i(z17);
            int i59 = ciVar.f342914a.f392404u;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(new e21.p(i27, "android-" + android.os.Build.VERSION.SDK_INT + "-" + wo.w0.m()));
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new e21.q(linkedList));
        z0Var.f71455d.onSceneEnd(i18, i19, str, z0Var);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return 3;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        return com.tencent.mm.modelbase.o1.EOk;
    }

    @Override // com.tencent.mm.modelbase.m1
    public void setSecurityCheckError(com.tencent.mm.modelbase.n1 n1Var) {
    }
}

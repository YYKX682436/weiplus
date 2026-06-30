package com.p314xaae8f345.mm.p957x53236a1b;

/* loaded from: classes11.dex */
public class l1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f152900d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f152901e;

    /* renamed from: f, reason: collision with root package name */
    public final long f152902f;

    public l1(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17) {
        this(i17, str, str2, str3, str4, z17, 0);
    }

    public java.lang.String H() {
        try {
            return ((r45.vx6) this.f152901e.f152244b.f152233a).f470183f;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneVerifyPswd", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f152900d = u0Var;
        return mo9409x10f9447a(sVar, this.f152901e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 384;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        m48024x6b3684de(i17);
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f152901e;
        r45.ux6 ux6Var = (r45.ux6) oVar.f152243a.f152217a;
        r45.vx6 vx6Var = (r45.vx6) oVar.f152244b.f152233a;
        r45.cu5 cu5Var = vx6Var.f470188n;
        if (cu5Var != null && cu5Var.f453372d > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneVerifyPswd", "summerauth parseRet[%b], len[%d]", java.lang.Boolean.valueOf(gm0.j1.b().l().f(this.f152902f, x51.j1.d(vx6Var.f470188n))), java.lang.Integer.valueOf(vx6Var.f470188n.f453372d));
            if (gm0.j1.a()) {
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MANUAL_AUTH_AS_QQ_ACCOUNT_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            }
        }
        if (i18 == 0 && i19 == 0) {
            gm0.j1.u().c().w(77830, vx6Var.f470183f);
            gm0.j1.u().c().w(32, ux6Var.f469256e);
            gm0.j1.u().c().w(33, ux6Var.f469257f);
            gm0.j1.u().c().w(46, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(x51.j1.d(vx6Var.f470185h)));
            java.lang.String l17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(x51.j1.d(ux6Var.f469261m));
            gm0.j1.u().c().w(47, l17);
            gm0.j1.u().f354681a.f(18, l17);
            gm0.j1.u().c().w(-1535680990, vx6Var.f470187m);
            r45.cu5 cu5Var2 = vx6Var.f470185h;
            int i27 = cu5Var2 == null ? 0 : cu5Var2.f453372d;
            java.lang.String str2 = vx6Var.f470187m;
            int length = str2 == null ? 0 : str2.length();
            java.lang.String str3 = vx6Var.f470183f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneVerifyPswd", "A2Key.len %d, authKey.len: %d, ticketLen:%d", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(length), java.lang.Integer.valueOf(str3 != null ? str3.length() : 0));
        } else if (i18 == 4) {
            gm0.j1.u().c().w(32, "");
            gm0.j1.u().c().w(33, "");
        }
        this.f152900d.mo815x76e0bfae(i18, i19, str, this);
    }

    public l1(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, int i18) {
        this(i17, str, str2, str3, str4, z17, i18, true);
    }

    public l1(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, int i18, boolean z18) {
        byte[] d17;
        this.f152902f = 0L;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ux6();
        lVar.f152198b = new r45.vx6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/newverifypasswd";
        lVar.f152200d = 384;
        lVar.f152201e = 182;
        lVar.f152202f = 1000000182;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f152901e = a17;
        r45.ux6 ux6Var = (r45.ux6) a17.f152243a.f152217a;
        ux6Var.f469255d = i17;
        ux6Var.f469262n = i18;
        ux6Var.f469256e = kk.k.g(str.getBytes());
        ux6Var.f469257f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A(str);
        r45.du5 du5Var = new r45.du5();
        du5Var.f454289d = str2;
        du5Var.f454290e = true;
        ux6Var.f469258g = du5Var;
        r45.du5 du5Var2 = new r45.du5();
        du5Var2.f454289d = str3;
        du5Var2.f454290e = true;
        ux6Var.f469259h = du5Var2;
        r45.du5 du5Var3 = new r45.du5();
        du5Var3.f454289d = str4;
        du5Var3.f454290e = true;
        ux6Var.f469260i = du5Var3;
        if (i17 == 5 || i17 == 2) {
            long longValue = new kk.v(c01.z1.f()).longValue();
            this.f152902f = longValue;
            if (z17) {
                d17 = gm0.j1.b().l().c(longValue, str3);
            } else {
                d17 = gm0.j1.b().l().d(longValue, kk.k.g(str.getBytes()), z18);
            }
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(d17);
            ux6Var.f469263o = cu5Var;
        }
        java.lang.String str5 = (java.lang.String) gm0.j1.u().c().l(47, null);
        str5 = str5 == null ? "" : str5;
        r45.cu5 cu5Var2 = new r45.cu5();
        cu5Var2.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(str5));
        ux6Var.f469261m = cu5Var2;
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Integer.valueOf(ux6Var.f469255d);
        objArr[1] = java.lang.Boolean.valueOf(z17);
        objArr[2] = java.lang.Boolean.valueOf(z18);
        r45.cu5 cu5Var3 = ux6Var.f469263o;
        objArr[3] = java.lang.Integer.valueOf(cu5Var3 == null ? -1 : cu5Var3.f453372d);
        r45.cu5 cu5Var4 = ux6Var.f469263o;
        objArr[4] = cu5Var4 == null ? "null" : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(cu5Var4.f453374f.f273689a));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneVerifyPswd", "summerauth opCode[%d], hasSecCode[%b], isManualAuth[%b], len:%d, content:[%s]", objArr);
    }
}

package com.tencent.mm.modelsimple;

/* loaded from: classes11.dex */
public class l1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f71367d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f71368e;

    /* renamed from: f, reason: collision with root package name */
    public final long f71369f;

    public l1(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17) {
        this(i17, str, str2, str3, str4, z17, 0);
    }

    public java.lang.String H() {
        try {
            return ((r45.vx6) this.f71368e.f70711b.f70700a).f388650f;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneVerifyPswd", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f71367d = u0Var;
        return dispatch(sVar, this.f71368e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 384;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        updateDispatchId(i17);
        com.tencent.mm.modelbase.o oVar = this.f71368e;
        r45.ux6 ux6Var = (r45.ux6) oVar.f70710a.f70684a;
        r45.vx6 vx6Var = (r45.vx6) oVar.f70711b.f70700a;
        r45.cu5 cu5Var = vx6Var.f388655n;
        if (cu5Var != null && cu5Var.f371839d > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneVerifyPswd", "summerauth parseRet[%b], len[%d]", java.lang.Boolean.valueOf(gm0.j1.b().l().f(this.f71369f, x51.j1.d(vx6Var.f388655n))), java.lang.Integer.valueOf(vx6Var.f388655n.f371839d));
            if (gm0.j1.a()) {
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_MANUAL_AUTH_AS_QQ_ACCOUNT_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            }
        }
        if (i18 == 0 && i19 == 0) {
            gm0.j1.u().c().w(77830, vx6Var.f388650f);
            gm0.j1.u().c().w(32, ux6Var.f387723e);
            gm0.j1.u().c().w(33, ux6Var.f387724f);
            gm0.j1.u().c().w(46, com.tencent.mm.sdk.platformtools.t8.l(x51.j1.d(vx6Var.f388652h)));
            java.lang.String l17 = com.tencent.mm.sdk.platformtools.t8.l(x51.j1.d(ux6Var.f387728m));
            gm0.j1.u().c().w(47, l17);
            gm0.j1.u().f273148a.f(18, l17);
            gm0.j1.u().c().w(-1535680990, vx6Var.f388654m);
            r45.cu5 cu5Var2 = vx6Var.f388652h;
            int i27 = cu5Var2 == null ? 0 : cu5Var2.f371839d;
            java.lang.String str2 = vx6Var.f388654m;
            int length = str2 == null ? 0 : str2.length();
            java.lang.String str3 = vx6Var.f388650f;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneVerifyPswd", "A2Key.len %d, authKey.len: %d, ticketLen:%d", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(length), java.lang.Integer.valueOf(str3 != null ? str3.length() : 0));
        } else if (i18 == 4) {
            gm0.j1.u().c().w(32, "");
            gm0.j1.u().c().w(33, "");
        }
        this.f71367d.onSceneEnd(i18, i19, str, this);
    }

    public l1(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, int i18) {
        this(i17, str, str2, str3, str4, z17, i18, true);
    }

    public l1(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, int i18, boolean z18) {
        byte[] d17;
        this.f71369f = 0L;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ux6();
        lVar.f70665b = new r45.vx6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/newverifypasswd";
        lVar.f70667d = 384;
        lVar.f70668e = 182;
        lVar.f70669f = 1000000182;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f71368e = a17;
        r45.ux6 ux6Var = (r45.ux6) a17.f70710a.f70684a;
        ux6Var.f387722d = i17;
        ux6Var.f387729n = i18;
        ux6Var.f387723e = kk.k.g(str.getBytes());
        ux6Var.f387724f = com.tencent.mm.sdk.platformtools.t8.A(str);
        r45.du5 du5Var = new r45.du5();
        du5Var.f372756d = str2;
        du5Var.f372757e = true;
        ux6Var.f387725g = du5Var;
        r45.du5 du5Var2 = new r45.du5();
        du5Var2.f372756d = str3;
        du5Var2.f372757e = true;
        ux6Var.f387726h = du5Var2;
        r45.du5 du5Var3 = new r45.du5();
        du5Var3.f372756d = str4;
        du5Var3.f372757e = true;
        ux6Var.f387727i = du5Var3;
        if (i17 == 5 || i17 == 2) {
            long longValue = new kk.v(c01.z1.f()).longValue();
            this.f71369f = longValue;
            if (z17) {
                d17 = gm0.j1.b().l().c(longValue, str3);
            } else {
                d17 = gm0.j1.b().l().d(longValue, kk.k.g(str.getBytes()), z18);
            }
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(d17);
            ux6Var.f387730o = cu5Var;
        }
        java.lang.String str5 = (java.lang.String) gm0.j1.u().c().l(47, null);
        str5 = str5 == null ? "" : str5;
        r45.cu5 cu5Var2 = new r45.cu5();
        cu5Var2.d(com.tencent.mm.sdk.platformtools.t8.h(str5));
        ux6Var.f387728m = cu5Var2;
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Integer.valueOf(ux6Var.f387722d);
        objArr[1] = java.lang.Boolean.valueOf(z17);
        objArr[2] = java.lang.Boolean.valueOf(z18);
        r45.cu5 cu5Var3 = ux6Var.f387730o;
        objArr[3] = java.lang.Integer.valueOf(cu5Var3 == null ? -1 : cu5Var3.f371839d);
        r45.cu5 cu5Var4 = ux6Var.f387730o;
        objArr[4] = cu5Var4 == null ? "null" : com.tencent.mm.sdk.platformtools.t8.G1(com.tencent.mm.sdk.platformtools.t8.j(cu5Var4.f371841f.f192156a));
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneVerifyPswd", "summerauth opCode[%d], hasSecCode[%b], isManualAuth[%b], len:%d, content:[%s]", objArr);
    }
}

package com.p314xaae8f345.mm.p957x53236a1b;

/* loaded from: classes4.dex */
public class n1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f152910d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f152911e;

    /* renamed from: f, reason: collision with root package name */
    public int f152912f = 3;

    public n1(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.rg7();
        lVar.f152198b = new r45.sg7();
        lVar.f152199c = "/cgi-bin/micromsg-bin/yybgetpkgsig";
        lVar.f152200d = 729;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f152910d = a17;
        r45.rg7 rg7Var = (r45.rg7) a17.f152243a.f152217a;
        rg7Var.f466390d = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
        rg7Var.f466391e = fo3.s.INSTANCE.I3(0);
        rg7Var.f466392f = str;
        rg7Var.f466393g = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneYybGetPkgSig", "summertoken YybGetPkgSig Language[%s], PkgName[%s], versionCode[%d], stack[%s]", rg7Var.f466390d, str, java.lang.Integer.valueOf(i17), new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f152911e = u0Var;
        return mo9409x10f9447a(sVar, this.f152910d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 729;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f152910d;
        r45.rg7 rg7Var = (r45.rg7) oVar.f152243a.f152217a;
        r45.sg7 sg7Var = (r45.sg7) oVar.f152244b.f152233a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneYybGetPkgSig", "summertoken YybGetPkgSig onGYNetEnd netId[%d], errType[%d], errCode[%d], errMsg[%s], ret[%d], sig[%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, java.lang.Integer.valueOf(sg7Var.f467242d), sg7Var.f467243e);
        if (i18 != 0 || i19 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneYybGetPkgSig", "summertoken YybGetPkgSig err and return!");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.mo68477x336bdfd8(322L, 1L, 1L, false);
            g0Var.d(11098, 4001, java.lang.String.format("%s,%d,%d,%d", rg7Var.f466392f, java.lang.Integer.valueOf(rg7Var.f466393g), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19)));
            this.f152911e.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        int i27 = sg7Var.f467242d;
        if (i27 == 2 || i27 == 3) {
            int i28 = this.f152912f - 1;
            this.f152912f = i28;
            if (i28 <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneYybGetPkgSig", "summertoken err and return with no try!");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var2.mo68477x336bdfd8(322L, 2L, 1L, false);
                g0Var2.d(11098, 4002, java.lang.String.format("%s,%d", rg7Var.f466392f, java.lang.Integer.valueOf(rg7Var.f466393g)));
                this.f152911e.mo815x76e0bfae(3, -1, "", this);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneYybGetPkgSig", "summertoken do scene again retryCount:%d", java.lang.Integer.valueOf(i28));
            mo807x6c193ac1(m47995xb7ba1aa7(), this.f152911e);
        } else if (i27 == 1) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) com.p314xaae8f345.mm.sdk.p2603x2137b148.SharedPreferencesC20998x2b0514dd.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "yyb_pkg_sig_prefs", 4);
            o4Var.getClass();
            o4Var.remove(rg7Var.f466392f);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var3.mo68477x336bdfd8(322L, 5L, 1L, false);
            g0Var3.d(11098, java.lang.Integer.valueOf(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2477xcdece81b.f7528x16eb0541), java.lang.String.format("%s,%d", rg7Var.f466392f, java.lang.Integer.valueOf(rg7Var.f466393g)));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneYybGetPkgSig", "summertoken ret no sig[%s] and remove", sg7Var.f467243e);
        } else if (i27 == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneYybGetPkgSig", "summertoken ret no need try and revise");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var4 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var4.mo68477x336bdfd8(322L, 4L, 1L, false);
            g0Var4.d(11098, java.lang.Integer.valueOf(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2477xcdece81b.f7532x3a129d88), java.lang.String.format("%s,%d", rg7Var.f466392f, java.lang.Integer.valueOf(rg7Var.f466393g)));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneYybGetPkgSig", "summertoken ret sig[%s]", sg7Var.f467243e);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var2 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) com.p314xaae8f345.mm.sdk.p2603x2137b148.SharedPreferencesC20998x2b0514dd.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "yyb_pkg_sig_prefs", 4);
            o4Var2.getClass();
            o4Var2.putString(rg7Var.f466392f, sg7Var.f467243e).commit();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var5 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var5.mo68477x336bdfd8(322L, 3L, 1L, false);
            g0Var5.d(11098, java.lang.Integer.valueOf(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2477xcdece81b.f7529x7d0fa359), java.lang.String.format("%s,%d,%s", rg7Var.f466392f, java.lang.Integer.valueOf(rg7Var.f466393g), sg7Var.f467243e));
        }
        this.f152911e.mo815x76e0bfae(i18, i19, str, this);
    }
}

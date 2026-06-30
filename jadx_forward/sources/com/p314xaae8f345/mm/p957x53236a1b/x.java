package com.p314xaae8f345.mm.p957x53236a1b;

/* loaded from: classes12.dex */
public class x extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.v0 f152979d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f152980e;

    public x() {
        com.p314xaae8f345.mm.p957x53236a1b.y yVar = new com.p314xaae8f345.mm.p957x53236a1b.y();
        this.f152979d = yVar;
        o45.og ogVar = (o45.og) yVar.mo47979x2d63726f();
        r45.mc mcVar = new r45.mc();
        r45.pc pcVar = new r45.pc();
        r45.oc ocVar = ogVar.f424521a;
        ocVar.f463674d = pcVar;
        ocVar.f463675e = mcVar;
        mcVar.f461892w = new r45.ye5();
        com.p314xaae8f345.mm.p971x6de15a2e.j jVar = com.p314xaae8f345.mm.p971x6de15a2e.j.f153559e;
        java.lang.String a17 = jVar.a();
        if (android.text.TextUtils.isEmpty(a17)) {
            r45.ye5 ye5Var = mcVar.f461892w;
            ye5Var.f472548d = 0;
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(new byte[0]);
            ye5Var.f472549e = cu5Var;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMDisasterAuth", "get sign key failed");
        } else {
            r45.ye5 ye5Var2 = mcVar.f461892w;
            jVar.b();
            ye5Var2.f472548d = jVar.f153560a.f472548d;
            r45.ye5 ye5Var3 = mcVar.f461892w;
            r45.cu5 cu5Var2 = new r45.cu5();
            cu5Var2.d(a17.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1));
            ye5Var3.f472549e = cu5Var2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMDisasterAuth", "disaster auth add public key , length " + a17.length());
        }
        android.content.SharedPreferences a18 = c01.h9.a();
        java.lang.String string = a18.getString("_auth_key", "");
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Integer.valueOf(string == null ? -1 : string.length());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMDisasterAuth", "disasterauths KEY_SP_SUFFIX keyStr[%s]", objArr);
        byte[] h17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(string);
        r45.nc ncVar = new r45.nc();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(h17)) {
            jx3.f.INSTANCE.mo68477x336bdfd8(148L, 16L, 1L, false);
            r45.cu5 cu5Var3 = new r45.cu5();
            cu5Var3.d(new byte[0]);
            mcVar.f461877e = cu5Var3;
        } else {
            r45.cu5 cu5Var4 = new r45.cu5();
            cu5Var4.d(h17);
            mcVar.f461877e = cu5Var4;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMDisasterAuth", "disasterauths keyBuf[%s, %s]", java.lang.Integer.valueOf(cu5Var4.f453374f.f273689a.length), java.lang.Integer.valueOf(h17.length));
            try {
                ncVar.mo11468x92b714fd(h17);
            } catch (java.io.IOException e17) {
                jx3.f.INSTANCE.mo68477x336bdfd8(148L, 15L, 1L, false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMDisasterAuth", e17, "summerauthkey Failed parse autoauthkey buf", new java.lang.Object[0]);
            }
        }
        r45.cu5 cu5Var5 = ncVar.f462771d;
        if (cu5Var5 != null) {
            pcVar.f464468d = cu5Var5;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMDisasterAuth", "disasterauths AesEncryptKey [%s][%s]", java.lang.Integer.valueOf(cu5Var5.f453374f.f273689a.length), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(ncVar.f462771d.f453374f.f273689a));
        } else {
            jx3.f.INSTANCE.mo68477x336bdfd8(148L, 17L, 1L, false);
            r45.cu5 cu5Var6 = new r45.cu5();
            cu5Var6.d(new byte[0]);
            pcVar.f464468d = cu5Var6;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMDisasterAuth", "disasterauths AesEncryptKey null!");
        }
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(2, null);
        str = str == null ? "" : str;
        gm0.j1.i();
        kk.v vVar = new kk.v(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j1((java.lang.Integer) gm0.j1.u().c().l(9, null), 0));
        str = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? vVar.m143587x9616526c() : str;
        a18.getInt("key_auth_update_version", 0);
        int i17 = o45.wf.f424556a;
        ogVar.m150629x6027f5dc(2);
        r45.zd zdVar = new r45.zd();
        zdVar.f473460i = 1;
        r45.cu5 cu5Var7 = new r45.cu5();
        cu5Var7.d(new byte[0]);
        zdVar.f473459h = cu5Var7;
        r45.cu5 cu5Var8 = new r45.cu5();
        cu5Var8.d(new byte[0]);
        zdVar.f473458g = cu5Var8;
        r45.z57 z57Var = new r45.z57();
        zdVar.f473456e = z57Var;
        z57Var.f473273e = "";
        z57Var.f473272d = "";
        z57Var.f473274f = "";
        r45.sb7 sb7Var = new r45.sb7();
        zdVar.f473457f = sb7Var;
        sb7Var.f467154e = "";
        sb7Var.f467153d = "";
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMDisasterAuth", "disasterauths build autoauth Req  , failed  acc not ready");
            return;
        }
        gm0.j1.i();
        byte[] d17 = gm0.j1.b().l().d(vVar.longValue(), "", false);
        mcVar.f461891v = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b;
        java.lang.Object[] objArr2 = new java.lang.Object[5];
        objArr2[0] = str;
        objArr2[1] = vVar;
        objArr2[2] = java.lang.Integer.valueOf(d17 != null ? d17.length : -1);
        objArr2[3] = d17 == null ? "null" : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(d17));
        objArr2[4] = mcVar.f461891v;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMDisasterAuth", "disasterauths loginbuf username:%s, qq:%s, len:%d, content:[%s], AndroidPackageName:%s", objArr2);
        r45.cu5 cu5Var9 = new r45.cu5();
        cu5Var9.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(d17) ? new byte[0] : d17);
        zdVar.f473455d = cu5Var9;
        mcVar.f461876d = zdVar;
        ogVar.f424522b = str;
        com.p314xaae8f345.mm.p971x6de15a2e.i iVar = new com.p314xaae8f345.mm.p971x6de15a2e.i();
        com.p314xaae8f345.mm.p971x6de15a2e.j jVar2 = com.p314xaae8f345.mm.p971x6de15a2e.j.f153559e;
        iVar.f153556b = jVar2.a();
        jVar2.b();
        iVar.f153555a = jVar2.f153561b;
        ogVar.m150621x20d83983(iVar);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f152980e = u0Var;
        jx3.f.INSTANCE.mo68477x336bdfd8(148L, 126L, 1L, false);
        return mo9409x10f9447a(sVar, this.f152979d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        ((com.p314xaae8f345.mm.p957x53236a1b.y) this.f152979d).getClass();
        return 3941;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f152980e.mo815x76e0bfae(i18, i19, str, this);
        if (i19 == 0 && i18 == 0) {
            jx3.f.INSTANCE.mo68477x336bdfd8(148L, 127L, 1L, false);
        } else {
            jx3.f.INSTANCE.mo68477x336bdfd8(148L, 128L, 1L, false);
        }
    }
}

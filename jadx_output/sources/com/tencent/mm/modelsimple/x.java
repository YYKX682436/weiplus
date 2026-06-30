package com.tencent.mm.modelsimple;

/* loaded from: classes12.dex */
public class x extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.network.v0 f71446d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f71447e;

    public x() {
        com.tencent.mm.modelsimple.y yVar = new com.tencent.mm.modelsimple.y();
        this.f71446d = yVar;
        o45.og ogVar = (o45.og) yVar.getReqObj();
        r45.mc mcVar = new r45.mc();
        r45.pc pcVar = new r45.pc();
        r45.oc ocVar = ogVar.f342988a;
        ocVar.f382141d = pcVar;
        ocVar.f382142e = mcVar;
        mcVar.f380359w = new r45.ye5();
        com.tencent.mm.network.j jVar = com.tencent.mm.network.j.f72026e;
        java.lang.String a17 = jVar.a();
        if (android.text.TextUtils.isEmpty(a17)) {
            r45.ye5 ye5Var = mcVar.f380359w;
            ye5Var.f391015d = 0;
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(new byte[0]);
            ye5Var.f391016e = cu5Var;
            com.tencent.mars.xlog.Log.e("MicroMsg.MMDisasterAuth", "get sign key failed");
        } else {
            r45.ye5 ye5Var2 = mcVar.f380359w;
            jVar.b();
            ye5Var2.f391015d = jVar.f72027a.f391015d;
            r45.ye5 ye5Var3 = mcVar.f380359w;
            r45.cu5 cu5Var2 = new r45.cu5();
            cu5Var2.d(a17.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1));
            ye5Var3.f391016e = cu5Var2;
            com.tencent.mars.xlog.Log.i("MicroMsg.MMDisasterAuth", "disaster auth add public key , length " + a17.length());
        }
        android.content.SharedPreferences a18 = c01.h9.a();
        java.lang.String string = a18.getString("_auth_key", "");
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Integer.valueOf(string == null ? -1 : string.length());
        com.tencent.mars.xlog.Log.i("MicroMsg.MMDisasterAuth", "disasterauths KEY_SP_SUFFIX keyStr[%s]", objArr);
        byte[] h17 = com.tencent.mm.sdk.platformtools.t8.h(string);
        r45.nc ncVar = new r45.nc();
        if (com.tencent.mm.sdk.platformtools.t8.M0(h17)) {
            jx3.f.INSTANCE.idkeyStat(148L, 16L, 1L, false);
            r45.cu5 cu5Var3 = new r45.cu5();
            cu5Var3.d(new byte[0]);
            mcVar.f380344e = cu5Var3;
        } else {
            r45.cu5 cu5Var4 = new r45.cu5();
            cu5Var4.d(h17);
            mcVar.f380344e = cu5Var4;
            com.tencent.mars.xlog.Log.i("MicroMsg.MMDisasterAuth", "disasterauths keyBuf[%s, %s]", java.lang.Integer.valueOf(cu5Var4.f371841f.f192156a.length), java.lang.Integer.valueOf(h17.length));
            try {
                ncVar.parseFrom(h17);
            } catch (java.io.IOException e17) {
                jx3.f.INSTANCE.idkeyStat(148L, 15L, 1L, false);
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMDisasterAuth", e17, "summerauthkey Failed parse autoauthkey buf", new java.lang.Object[0]);
            }
        }
        r45.cu5 cu5Var5 = ncVar.f381238d;
        if (cu5Var5 != null) {
            pcVar.f382935d = cu5Var5;
            com.tencent.mars.xlog.Log.w("MicroMsg.MMDisasterAuth", "disasterauths AesEncryptKey [%s][%s]", java.lang.Integer.valueOf(cu5Var5.f371841f.f192156a.length), com.tencent.mm.sdk.platformtools.t8.j(ncVar.f381238d.f371841f.f192156a));
        } else {
            jx3.f.INSTANCE.idkeyStat(148L, 17L, 1L, false);
            r45.cu5 cu5Var6 = new r45.cu5();
            cu5Var6.d(new byte[0]);
            pcVar.f382935d = cu5Var6;
            com.tencent.mars.xlog.Log.w("MicroMsg.MMDisasterAuth", "disasterauths AesEncryptKey null!");
        }
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(2, null);
        str = str == null ? "" : str;
        gm0.j1.i();
        kk.v vVar = new kk.v(com.tencent.mm.sdk.platformtools.t8.j1((java.lang.Integer) gm0.j1.u().c().l(9, null), 0));
        str = com.tencent.mm.sdk.platformtools.t8.K0(str) ? vVar.toString() : str;
        a18.getInt("key_auth_update_version", 0);
        int i17 = o45.wf.f343023a;
        ogVar.setSceneStatus(2);
        r45.zd zdVar = new r45.zd();
        zdVar.f391927i = 1;
        r45.cu5 cu5Var7 = new r45.cu5();
        cu5Var7.d(new byte[0]);
        zdVar.f391926h = cu5Var7;
        r45.cu5 cu5Var8 = new r45.cu5();
        cu5Var8.d(new byte[0]);
        zdVar.f391925g = cu5Var8;
        r45.z57 z57Var = new r45.z57();
        zdVar.f391923e = z57Var;
        z57Var.f391740e = "";
        z57Var.f391739d = "";
        z57Var.f391741f = "";
        r45.sb7 sb7Var = new r45.sb7();
        zdVar.f391924f = sb7Var;
        sb7Var.f385621e = "";
        sb7Var.f385620d = "";
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMDisasterAuth", "disasterauths build autoauth Req  , failed  acc not ready");
            return;
        }
        gm0.j1.i();
        byte[] d17 = gm0.j1.b().l().d(vVar.longValue(), "", false);
        mcVar.f380358v = com.tencent.mm.sdk.platformtools.x2.f193072b;
        java.lang.Object[] objArr2 = new java.lang.Object[5];
        objArr2[0] = str;
        objArr2[1] = vVar;
        objArr2[2] = java.lang.Integer.valueOf(d17 != null ? d17.length : -1);
        objArr2[3] = d17 == null ? "null" : com.tencent.mm.sdk.platformtools.t8.G1(com.tencent.mm.sdk.platformtools.t8.j(d17));
        objArr2[4] = mcVar.f380358v;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMDisasterAuth", "disasterauths loginbuf username:%s, qq:%s, len:%d, content:[%s], AndroidPackageName:%s", objArr2);
        r45.cu5 cu5Var9 = new r45.cu5();
        cu5Var9.d(com.tencent.mm.sdk.platformtools.t8.M0(d17) ? new byte[0] : d17);
        zdVar.f391922d = cu5Var9;
        mcVar.f380343d = zdVar;
        ogVar.f342989b = str;
        com.tencent.mm.network.i iVar = new com.tencent.mm.network.i();
        com.tencent.mm.network.j jVar2 = com.tencent.mm.network.j.f72026e;
        iVar.f72023b = jVar2.a();
        jVar2.b();
        iVar.f72022a = jVar2.f72028b;
        ogVar.setCGiVerifyKey(iVar);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f71447e = u0Var;
        jx3.f.INSTANCE.idkeyStat(148L, 126L, 1L, false);
        return dispatch(sVar, this.f71446d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        ((com.tencent.mm.modelsimple.y) this.f71446d).getClass();
        return 3941;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f71447e.onSceneEnd(i18, i19, str, this);
        if (i19 == 0 && i18 == 0) {
            jx3.f.INSTANCE.idkeyStat(148L, 127L, 1L, false);
        } else {
            jx3.f.INSTANCE.idkeyStat(148L, 128L, 1L, false);
        }
    }
}

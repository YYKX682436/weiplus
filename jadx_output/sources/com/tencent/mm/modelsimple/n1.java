package com.tencent.mm.modelsimple;

/* loaded from: classes4.dex */
public class n1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f71377d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f71378e;

    /* renamed from: f, reason: collision with root package name */
    public int f71379f = 3;

    public n1(java.lang.String str, int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.rg7();
        lVar.f70665b = new r45.sg7();
        lVar.f70666c = "/cgi-bin/micromsg-bin/yybgetpkgsig";
        lVar.f70667d = 729;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f71377d = a17;
        r45.rg7 rg7Var = (r45.rg7) a17.f70710a.f70684a;
        rg7Var.f384857d = com.tencent.mm.sdk.platformtools.m2.d();
        rg7Var.f384858e = fo3.s.INSTANCE.I3(0);
        rg7Var.f384859f = str;
        rg7Var.f384860g = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneYybGetPkgSig", "summertoken YybGetPkgSig Language[%s], PkgName[%s], versionCode[%d], stack[%s]", rg7Var.f384857d, str, java.lang.Integer.valueOf(i17), new com.tencent.mm.sdk.platformtools.z3());
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f71378e = u0Var;
        return dispatch(sVar, this.f71377d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 729;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.o oVar = this.f71377d;
        r45.rg7 rg7Var = (r45.rg7) oVar.f70710a.f70684a;
        r45.sg7 sg7Var = (r45.sg7) oVar.f70711b.f70700a;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneYybGetPkgSig", "summertoken YybGetPkgSig onGYNetEnd netId[%d], errType[%d], errCode[%d], errMsg[%s], ret[%d], sig[%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, java.lang.Integer.valueOf(sg7Var.f385709d), sg7Var.f385710e);
        if (i18 != 0 || i19 != 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneYybGetPkgSig", "summertoken YybGetPkgSig err and return!");
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(322L, 1L, 1L, false);
            g0Var.d(11098, 4001, java.lang.String.format("%s,%d,%d,%d", rg7Var.f384859f, java.lang.Integer.valueOf(rg7Var.f384860g), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19)));
            this.f71378e.onSceneEnd(i18, i19, str, this);
            return;
        }
        int i27 = sg7Var.f385709d;
        if (i27 == 2 || i27 == 3) {
            int i28 = this.f71379f - 1;
            this.f71379f = i28;
            if (i28 <= 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneYybGetPkgSig", "summertoken err and return with no try!");
                com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var2.idkeyStat(322L, 2L, 1L, false);
                g0Var2.d(11098, 4002, java.lang.String.format("%s,%d", rg7Var.f384859f, java.lang.Integer.valueOf(rg7Var.f384860g)));
                this.f71378e.onSceneEnd(3, -1, "", this);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneYybGetPkgSig", "summertoken do scene again retryCount:%d", java.lang.Integer.valueOf(i28));
            doScene(dispatcher(), this.f71378e);
        } else if (i27 == 1) {
            com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences.b(com.tencent.mm.sdk.platformtools.x2.f193071a, "yyb_pkg_sig_prefs", 4);
            o4Var.getClass();
            o4Var.remove(rg7Var.f384859f);
            com.tencent.mm.plugin.report.service.g0 g0Var3 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var3.idkeyStat(322L, 5L, 1L, false);
            g0Var3.d(11098, java.lang.Integer.valueOf(com.google.android.gms.wearable.WearableStatusCodes.ASSET_UNAVAILABLE), java.lang.String.format("%s,%d", rg7Var.f384859f, java.lang.Integer.valueOf(rg7Var.f384860g)));
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneYybGetPkgSig", "summertoken ret no sig[%s] and remove", sg7Var.f385710e);
        } else if (i27 == 4) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneYybGetPkgSig", "summertoken ret no need try and revise");
            com.tencent.mm.plugin.report.service.g0 g0Var4 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var4.idkeyStat(322L, 4L, 1L, false);
            g0Var4.d(11098, java.lang.Integer.valueOf(com.google.android.gms.wearable.WearableStatusCodes.INVALID_TARGET_NODE), java.lang.String.format("%s,%d", rg7Var.f384859f, java.lang.Integer.valueOf(rg7Var.f384860g)));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneYybGetPkgSig", "summertoken ret sig[%s]", sg7Var.f385710e);
            com.tencent.mm.sdk.platformtools.o4 o4Var2 = (com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences.b(com.tencent.mm.sdk.platformtools.x2.f193071a, "yyb_pkg_sig_prefs", 4);
            o4Var2.getClass();
            o4Var2.putString(rg7Var.f384859f, sg7Var.f385710e).commit();
            com.tencent.mm.plugin.report.service.g0 g0Var5 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var5.idkeyStat(322L, 3L, 1L, false);
            g0Var5.d(11098, java.lang.Integer.valueOf(com.google.android.gms.wearable.WearableStatusCodes.DATA_ITEM_TOO_LARGE), java.lang.String.format("%s,%d,%s", rg7Var.f384859f, java.lang.Integer.valueOf(rg7Var.f384860g), sg7Var.f385710e));
        }
        this.f71378e.onSceneEnd(i18, i19, str, this);
    }
}

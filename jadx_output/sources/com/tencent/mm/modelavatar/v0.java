package com.tencent.mm.modelavatar;

/* loaded from: classes12.dex */
public class v0 extends com.tencent.mm.modelavatar.x0 {
    @Override // com.tencent.mm.modelavatar.x0, com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f70556d = u0Var;
        this.f70566q = sVar;
        java.lang.String str = this.f70557e;
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadBotHeadImg", "imgPath is null or length = 0");
            return -1;
        }
        if (!com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadBotHeadImg", "The img does not exist, imgPath = " + str);
            return -1;
        }
        if (this.f70562m == 0) {
            this.f70562m = (int) com.tencent.mm.vfs.w6.k(str);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadBotHeadImg", "head total len:%s", java.lang.Integer.valueOf(this.f70562m));
        if (H()) {
            return 0;
        }
        byte[] N = com.tencent.mm.vfs.w6.N(str, this.f70563n, java.lang.Math.min(this.f70562m - this.f70563n, 8192));
        if (N == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadBotHeadImg", "readFromFile error");
            return -1;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadBotHeadImg", "doScene uploadLen:%d, total: %d", java.lang.Integer.valueOf(N.length), java.lang.Integer.valueOf(this.f70562m));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.bu6();
        lVar.f70665b = new r45.cu6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/uploadbotheadimg";
        lVar.f70667d = 14509;
        lVar.f70668e = 46;
        lVar.f70669f = 1000000046;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        r45.bu6 bu6Var = (r45.bu6) a17.f70710a.f70684a;
        bu6Var.f371069d = this.f70562m;
        bu6Var.f371070e = this.f70563n;
        bu6Var.f371071f = 3;
        bu6Var.f371073h = this.f70559g;
        bu6Var.f371074i = this.f70561i;
        bu6Var.f371077o = com.tencent.mm.vfs.w6.p(str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f70564o)) {
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(N);
            bu6Var.f371072g = cu5Var;
            bu6Var.f371078p = 0;
        } else {
            bu6Var.f371072g = new r45.cu5();
            bu6Var.f371076n = this.f70564o;
            bu6Var.f371078p = 1;
        }
        try {
            r45.k57 k57Var = new r45.k57();
            r45.cu5 cu5Var2 = new r45.cu5();
            cu5Var2.d(fo3.s.INSTANCE.h());
            k57Var.f378396f = cu5Var2;
            r45.cu5 cu5Var3 = new r45.cu5();
            cu5Var3.d(k57Var.toByteArray());
            bu6Var.f371075m = cu5Var3;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("NetSceneUploadBotHeadImg", "Caught exception in dispatch process");
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneUploadBotHeadImg", th6, "", new java.lang.Object[0]);
        }
        return dispatch(sVar, a17, this);
    }

    @Override // com.tencent.mm.modelavatar.x0, com.tencent.mm.modelbase.m1
    public int getType() {
        return 14509;
    }
}

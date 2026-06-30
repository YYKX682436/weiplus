package com.p314xaae8f345.mm.p943x351df9c2;

/* loaded from: classes12.dex */
public class v0 extends com.p314xaae8f345.mm.p943x351df9c2.x0 {
    @Override // com.p314xaae8f345.mm.p943x351df9c2.x0, com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f152089d = u0Var;
        this.f152099q = sVar;
        java.lang.String str = this.f152090e;
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadBotHeadImg", "imgPath is null or length = 0");
            return -1;
        }
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadBotHeadImg", "The img does not exist, imgPath = " + str);
            return -1;
        }
        if (this.f152095m == 0) {
            this.f152095m = (int) com.p314xaae8f345.mm.vfs.w6.k(str);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadBotHeadImg", "head total len:%s", java.lang.Integer.valueOf(this.f152095m));
        if (H()) {
            return 0;
        }
        byte[] N = com.p314xaae8f345.mm.vfs.w6.N(str, this.f152096n, java.lang.Math.min(this.f152095m - this.f152096n, 8192));
        if (N == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadBotHeadImg", "readFromFile error");
            return -1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadBotHeadImg", "doScene uploadLen:%d, total: %d", java.lang.Integer.valueOf(N.length), java.lang.Integer.valueOf(this.f152095m));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.bu6();
        lVar.f152198b = new r45.cu6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/uploadbotheadimg";
        lVar.f152200d = 14509;
        lVar.f152201e = 46;
        lVar.f152202f = 1000000046;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        r45.bu6 bu6Var = (r45.bu6) a17.f152243a.f152217a;
        bu6Var.f452602d = this.f152095m;
        bu6Var.f452603e = this.f152096n;
        bu6Var.f452604f = 3;
        bu6Var.f452606h = this.f152092g;
        bu6Var.f452607i = this.f152094i;
        bu6Var.f452610o = com.p314xaae8f345.mm.vfs.w6.p(str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f152097o)) {
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(N);
            bu6Var.f452605g = cu5Var;
            bu6Var.f452611p = 0;
        } else {
            bu6Var.f452605g = new r45.cu5();
            bu6Var.f452609n = this.f152097o;
            bu6Var.f452611p = 1;
        }
        try {
            r45.k57 k57Var = new r45.k57();
            r45.cu5 cu5Var2 = new r45.cu5();
            cu5Var2.d(fo3.s.INSTANCE.h());
            k57Var.f459929f = cu5Var2;
            r45.cu5 cu5Var3 = new r45.cu5();
            cu5Var3.d(k57Var.mo14344x5f01b1f6());
            bu6Var.f452608m = cu5Var3;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("NetSceneUploadBotHeadImg", "Caught exception in dispatch process");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneUploadBotHeadImg", th6, "", new java.lang.Object[0]);
        }
        return mo9409x10f9447a(sVar, a17, this);
    }

    @Override // com.p314xaae8f345.mm.p943x351df9c2.x0, com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 14509;
    }
}

package com.tencent.mm.plugin.downloader_app.model;

/* loaded from: classes8.dex */
public class o0 implements com.tencent.mm.modelbase.e3 {
    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PbAppInfoManager", "errType = %d, errCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == 0 && i18 == 0) {
            com.tencent.mm.plugin.downloader_app.model.q0.f97311b = new com.tencent.mm.plugin.downloader_app.model.n0((c02.b) oVar.f70711b.f70700a);
            com.tencent.mm.plugin.downloader_app.model.p0 p0Var = com.tencent.mm.plugin.downloader_app.model.q0.f97310a;
            if (p0Var != null) {
                p0Var.a(true);
            }
        } else {
            com.tencent.mm.plugin.downloader_app.model.p0 p0Var2 = com.tencent.mm.plugin.downloader_app.model.q0.f97310a;
            if (p0Var2 != null) {
                p0Var2.a(false);
            }
        }
        return 0;
    }
}

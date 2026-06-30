package com.tencent.mm.plugin.base.stub;

/* loaded from: classes7.dex */
public class x implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f93816d;

    public x(int i17) {
        this.f93816d = i17;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        int i19 = this.f93816d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WXBizLogic", "doPreloadMiniProgramTranslateLink, %d, %d, %s, cgiType=%d", valueOf, valueOf2, str, java.lang.Integer.valueOf(i19));
        if (i17 != 0 || i18 != 0) {
            com.tencent.mm.plugin.base.stub.e0.b(false, i19);
            return 0;
        }
        com.tencent.mm.plugin.base.stub.e0.b(true, i19);
        if (i19 == 3) {
            com.tencent.mm.plugin.appbrand.service.f5 f5Var = (com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class);
            com.tencent.mm.plugin.appbrand.service.x6 x6Var = com.tencent.mm.plugin.appbrand.service.x6.f88830u;
            f5Var.Rh(x6Var);
            ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).c8(x6Var);
        }
        return 0;
    }
}

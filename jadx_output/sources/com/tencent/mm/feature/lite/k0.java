package com.tencent.mm.feature.lite;

/* loaded from: classes14.dex */
public class k0 implements com.tencent.mm.app.h4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.lite.i f67204d;

    public k0(com.tencent.mm.feature.lite.i iVar) {
        this.f67204d = iVar;
    }

    @Override // com.tencent.mm.app.h4
    public void a(java.lang.Thread thread, java.lang.String str, java.lang.Throwable th6) {
        com.tencent.mm.feature.lite.i iVar = this.f67204d;
        if (iVar.f67170e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "LiteApp uncaughtException");
            iVar.ek(java.lang.Boolean.FALSE);
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.C(1293L, 3L, 1L);
            g0Var.kvStat(23380, "1");
        }
    }

    @Override // com.tencent.mm.app.h4
    public void e(int i17, java.lang.String str) {
    }
}

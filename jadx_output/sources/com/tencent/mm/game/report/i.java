package com.tencent.mm.game.report;

/* loaded from: classes8.dex */
public class i implements com.tencent.mm.modelbase.e3 {
    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ReportService", "tryDoScene, errType = %d, errCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.mm.game.report.k.f68203b = false;
        com.tencent.mm.game.report.k.b();
        return 0;
    }
}

package com.tencent.mm.console;

/* loaded from: classes7.dex */
public class p4 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        if (!z65.c.a() && !com.tencent.mm.sdk.platformtools.s9.f192974b) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
            return;
        }
        ((com.tencent.mm.feature.finder.live.k5) ((s40.z0) i95.n0.c(s40.z0.class))).getClass();
        if (!z65.c.a() && !com.tencent.mm.sdk.platformtools.s9.f192974b) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FinderLiveShellService", "Environment denied: not coolassist or monkey env");
            return;
        }
        try {
            cl0.g gVar = new cl0.g(intent.getStringExtra("info"));
            r45.lk1 lk1Var = new r45.lk1();
            lk1Var.set(0, java.lang.Boolean.valueOf(gVar.optBoolean("can_display", false)));
            lk1Var.set(2, java.lang.Double.valueOf(gVar.optDouble(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_NETWORK_SPEED)));
            lk1Var.set(1, java.lang.Long.valueOf(gVar.optLong("resource_id")));
            ((mm2.l0) dk2.ef.f233372a.i(mm2.l0.class)).P6(lk1Var);
        } catch (cl0.f unused) {
        }
    }
}

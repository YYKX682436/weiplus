package com.tencent.mm.modelcdntran;

/* loaded from: classes12.dex */
public class y1 extends com.tencent.mm.app.s2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcdntran.h2 f71166d;

    public y1(com.tencent.mm.modelcdntran.h2 h2Var) {
        this.f71166d = h2Var;
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportService", "onAppBackground %s", str);
        this.f71166d.f70992p = false;
        if (!com.tencent.mm.modelcdntran.h2.e()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportService", "!canCDNCallbackStatistics");
            return;
        }
        this.f71166d.f70986g.d();
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.modelcdntran.x1(this));
        long Ui = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.c0.clicfg_cdn_callback_tooslow_crash_backup_wait_time, u04.d.f423477c);
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportService", "clicfg_cdn_callback_tooslow_crash_backup_wait_time:" + Ui);
        if (Ui != -1) {
            this.f71166d.f70988i = ((ku5.t0) ku5.t0.f312615d).k(this.f71166d.f70990n, Ui);
        }
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportService", "onAppForeground %s", str);
        com.tencent.mm.modelcdntran.h2 h2Var = this.f71166d;
        h2Var.f70992p = true;
        if (com.tencent.mm.modelcdntran.h2.e()) {
            h2Var.f70986g.c(60000L, 60000L);
            wu5.c cVar = h2Var.f70988i;
            if (cVar != null) {
                cVar.cancel(true);
                h2Var.f70988i = null;
            }
        }
    }
}

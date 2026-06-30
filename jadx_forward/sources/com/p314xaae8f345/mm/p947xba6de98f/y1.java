package com.p314xaae8f345.mm.p947xba6de98f;

/* loaded from: classes12.dex */
public class y1 extends com.p314xaae8f345.mm.app.s2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p947xba6de98f.h2 f152699d;

    public y1(com.p314xaae8f345.mm.p947xba6de98f.h2 h2Var) {
        this.f152699d = h2Var;
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    public void mo8889x3be51a90(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnTransportService", "onAppBackground %s", str);
        this.f152699d.f152525p = false;
        if (!com.p314xaae8f345.mm.p947xba6de98f.h2.e()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnTransportService", "!canCDNCallbackStatistics");
            return;
        }
        this.f152699d.f152519g.d();
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p947xba6de98f.x1(this));
        long Ui = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.c0.clicfg_cdn_callback_tooslow_crash_backup_wait_time, u04.d.f505010c);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnTransportService", "clicfg_cdn_callback_tooslow_crash_backup_wait_time:" + Ui);
        if (Ui != -1) {
            this.f152699d.f152521i = ((ku5.t0) ku5.t0.f394148d).k(this.f152699d.f152523n, Ui);
        }
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnTransportService", "onAppForeground %s", str);
        com.p314xaae8f345.mm.p947xba6de98f.h2 h2Var = this.f152699d;
        h2Var.f152525p = true;
        if (com.p314xaae8f345.mm.p947xba6de98f.h2.e()) {
            h2Var.f152519g.c(60000L, 60000L);
            wu5.c cVar = h2Var.f152521i;
            if (cVar != null) {
                cVar.cancel(true);
                h2Var.f152521i = null;
            }
        }
    }
}

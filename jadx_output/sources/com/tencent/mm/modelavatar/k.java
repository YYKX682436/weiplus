package com.tencent.mm.modelavatar;

/* loaded from: classes11.dex */
public class k implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public long f70458d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelavatar.r f70459e;

    public k(com.tencent.mm.modelavatar.r rVar) {
        this.f70459e = rVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.modelavatar.r rVar = this.f70459e;
        if (rVar.f70521d) {
            long j17 = this.f70458d;
            if (currentTimeMillis - j17 > 60000) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AvatarService", "do scene TIMEOUT: %d", java.lang.Long.valueOf(currentTimeMillis - j17));
                rVar.f70521d = false;
            }
        }
        if (rVar.f70521d) {
            rVar.f70528n.c(1000L, 1000L);
            return false;
        }
        this.f70458d = currentTimeMillis;
        rVar.f70521d = true;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i17 = 0; i17 < 5 && rVar.f70524g.size() > 0; i17++) {
            java.lang.String e17 = ((com.tencent.mm.modelavatar.r0) rVar.f70524g.pop()).e();
            if (e17 == null) {
                e17 = "";
            }
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(138L, 42L, 1L, true);
            g0Var.d(14058, 100001, 42, "", 0, e17, "", -1, "", "", -1);
            r45.du5 du5Var = new r45.du5();
            du5Var.f372756d = e17;
            du5Var.f372757e = true;
            linkedList.add(du5Var);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AvatarService", "To batch head img: %s", linkedList);
        gm0.j1.d().g(new com.tencent.mm.modelavatar.t0(linkedList));
        com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var2.idkeyStat(138L, 44L, 1L, true);
        g0Var2.d(14058, 100001, 44, "", 0, "", "", -1, "", "", -1);
        return false;
    }
}

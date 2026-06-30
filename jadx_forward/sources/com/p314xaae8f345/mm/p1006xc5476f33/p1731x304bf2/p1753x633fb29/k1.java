package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

/* loaded from: classes8.dex */
public class k1 implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.l1 f221884a;

    public k1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.l1 l1Var) {
        this.f221884a = l1Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        long j17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        if (i17 == 0 && i18 == 0 && (fVar = oVar.f152244b.f152233a) != null) {
            m53.p4 p4Var = (m53.p4) fVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameMessageService", "PullUserMessageResponse success NextReportSeconds: %d", java.lang.Long.valueOf(p4Var.f405499d));
            j17 = p4Var.f405499d;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameMessageService", "PullUserMessageRequest cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, oVar.f152244b.f152233a);
            j17 = 0;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f221884a.f221890d)) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GAME_REDDOT_PULL_MSG_MIN_DURATION_SEC_LONG, java.lang.Long.valueOf(j17));
        }
    }
}

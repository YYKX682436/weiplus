package com.p314xaae8f345.mm.p943x351df9c2;

/* loaded from: classes11.dex */
public class k implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public long f151991d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p943x351df9c2.r f151992e;

    public k(com.p314xaae8f345.mm.p943x351df9c2.r rVar) {
        this.f151992e = rVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p943x351df9c2.r rVar = this.f151992e;
        if (rVar.f152054d) {
            long j17 = this.f151991d;
            if (currentTimeMillis - j17 > 60000) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AvatarService", "do scene TIMEOUT: %d", java.lang.Long.valueOf(currentTimeMillis - j17));
                rVar.f152054d = false;
            }
        }
        if (rVar.f152054d) {
            rVar.f152061n.c(1000L, 1000L);
            return false;
        }
        this.f151991d = currentTimeMillis;
        rVar.f152054d = true;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i17 = 0; i17 < 5 && rVar.f152057g.size() > 0; i17++) {
            java.lang.String e17 = ((com.p314xaae8f345.mm.p943x351df9c2.r0) rVar.f152057g.pop()).e();
            if (e17 == null) {
                e17 = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.mo68477x336bdfd8(138L, 42L, 1L, true);
            g0Var.d(14058, 100001, 42, "", 0, e17, "", -1, "", "", -1);
            r45.du5 du5Var = new r45.du5();
            du5Var.f454289d = e17;
            du5Var.f454290e = true;
            linkedList.add(du5Var);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvatarService", "To batch head img: %s", linkedList);
        gm0.j1.d().g(new com.p314xaae8f345.mm.p943x351df9c2.t0(linkedList));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var2.mo68477x336bdfd8(138L, 44L, 1L, true);
        g0Var2.d(14058, 100001, 44, "", 0, "", "", -1, "", "", -1);
        return false;
    }
}

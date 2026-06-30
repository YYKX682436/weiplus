package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes15.dex */
public final class r2 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    private r2() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle.getString("appId");
        long j17 = bundle.getLong("timeout");
        if (j17 <= 0) {
            j17 = 20000;
        }
        long j18 = j17;
        int i17 = bundle.getInt("from");
        boolean z17 = bundle.getBoolean("syncCheckUpdate");
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().p();
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 y17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().y(string, null);
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().H(y17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "no need check pay liteapp, info: %s", y17.m28998x9616526c());
            rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(true));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().m(string, y17, z17, i17, j18, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.p2(this, rVar));
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2 k2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2) ((java.util.concurrent.ConcurrentHashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().f225484e).get(string);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (y17 != null) {
            r45.vc4 vc4Var = new r45.vc4();
            vc4Var.f469630d = com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29;
            vc4Var.f469631e = y17.f14362x26947355;
            linkedList.add(vc4Var);
        }
        ((s80.e) ((t80.h) i95.n0.c(t80.h.class))).Ai(string, null, linkedList, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.q2(this, string, null, y17, k2Var));
    }
}

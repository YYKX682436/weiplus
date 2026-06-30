package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public class e0 extends com.p314xaae8f345.mm.p971x6de15a2e.e1 {
    public e0(com.p314xaae8f345.mm.app.d0 d0Var) {
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.f1
    public boolean R0() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.f1
    public void Z8(com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af binderC11173x1cfac0af) {
        if (binderC11173x1cfac0af != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoreServiceConnection", "backup AccInfo, hash:%s CgiKeyLength:[%d,%d]", binderC11173x1cfac0af.E, java.lang.Integer.valueOf(binderC11173x1cfac0af.K()[0].length()), java.lang.Integer.valueOf(binderC11173x1cfac0af.K()[1].length()));
        }
        if (c01.b.b()) {
            try {
                gm0.j1.i();
                gm0.j1.b().f354776f.a(binderC11173x1cfac0af);
            } catch (java.lang.Throwable th6) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AccInfoCacheInWorker", "tryBackupToWorker Exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(th6));
            }
        }
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.fts;

/* renamed from: com.tencent.mm.plugin.fts.d0$$a */
/* loaded from: classes12.dex */
public final /* synthetic */ class C15569x5978c15 implements com.p314xaae8f345.p3121x37984a.InterfaceC26879x4f347d5d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.d0 f218932a;

    public /* synthetic */ C15569x5978c15(com.p314xaae8f345.mm.p1006xc5476f33.fts.d0 d0Var) {
        this.f218932a = d0Var;
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26879x4f347d5d
    /* renamed from: onCorruption */
    public final void mo63526x28043a1a(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7) {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.d0 d0Var = this.f218932a;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.t tVar = d0Var.f218912d;
        gm0.j1.i();
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FTS_MASTER_DB_CORRUPT_REBUILD_TIME_INT_SYNC;
        int intValue = ((java.lang.Integer) c17.m(u3Var, 5)).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTS.PluginFTS", "DB onCorrupt dbCorruptRebuildTimes: %d", java.lang.Integer.valueOf(intValue));
        if (intValue <= 0) {
            d0Var.rj("CorruptAndRecoverOverThreeTime");
            return;
        }
        gm0.j1.i();
        gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(intValue - 1));
        try {
            d0Var.Zi();
            d0Var.aj();
            d0Var.Ri();
            com.p314xaae8f345.mm.p1006xc5476f33.fts.o.f();
            tVar.a().c();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSTaskDaemon", "searchTaskThread clearAllTask");
            d0Var.f218913e.a().c();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSTaskDaemon", "searchTaskThread clearAllTask");
            tVar.b(-131072, new com.p314xaae8f345.mm.p1006xc5476f33.fts.j0(d0Var));
            tVar.b(-131071, new com.p314xaae8f345.mm.p1006xc5476f33.fts.i0(d0Var, null));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.PluginFTS", e17, "onCorruption handle error", new java.lang.Object[0]);
        }
        d0Var.rj("CorruptAndTryFix");
        throw new com.p314xaae8f345.mm.p1006xc5476f33.fts.q("Throw FTSStopTaskException From FTSDatabaseErrorHandler");
    }
}

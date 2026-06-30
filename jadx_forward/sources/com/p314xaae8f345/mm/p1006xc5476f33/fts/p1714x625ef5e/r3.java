package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

@j95.b
/* loaded from: classes12.dex */
public class r3 extends i95.w implements c01.j8 {
    public void Ai(java.lang.String str, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSDeleteMsgLogic", "start to delete fts talker msg %s %s", str, k35.m1.d(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f, j17 / 1000));
        if (!gm0.j1.a()) {
            throw new c01.c();
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.fts.o oVar = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.fts.d0.class)).f218914f;
            if (oVar != null) {
                oVar.h(str, j17);
            } else {
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.fts.d0.class)).f218912d.b(65536, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.q3(this, str, j17));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSDeleteMsgLogic", "syncDeleteTalkerMsg post task to fts task daemon %s %s", str, java.lang.Long.valueOf(j17));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.FTSDeleteMsgLogic", e17, "syncDeleteTalkerMsg", new java.lang.Object[0]);
        }
    }

    public void wi() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSDeleteMsgLogic", "start to delete all msg");
        if (!gm0.j1.a()) {
            throw new c01.c();
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.fts.d0.class)).f218912d.b(-131072, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.o3(this, null));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSDeleteMsgLogic", "syncDeleteAllMsg post task to fts task daemon");
    }
}

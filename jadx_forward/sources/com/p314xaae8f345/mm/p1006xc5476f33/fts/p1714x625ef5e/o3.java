package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class o3 extends p13.c {
    public o3(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.r3 r3Var, com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.n3 n3Var) {
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "FTSDeleteMsgLogic.DeleteAllMsgTask";
    }

    @Override // p13.c
    public boolean i() {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.o oVar = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.fts.d0.class)).f218914f;
        if (oVar == null) {
            return true;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        oVar.a();
        try {
            oVar.i(java.lang.String.format("DROP TABLE %s;", "FTS5MetaMessage"));
            oVar.i(java.lang.String.format("DROP TABLE %s;", "FTS5IndexMessage"));
            o13.u cj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).cj(4);
            cj6.mo150429x5cd39ffa();
            cj6.mo150428xaf65a0fc();
            oVar.d();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSIndexDB", "deleteAllMsg use time %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
            return true;
        } catch (java.lang.Throwable th6) {
            oVar.d();
            throw th6;
        }
    }
}

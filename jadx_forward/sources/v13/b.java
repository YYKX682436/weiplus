package v13;

/* loaded from: classes5.dex */
public final class b implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v13.e f514050a;

    public b(v13.e eVar) {
        this.f514050a = eVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSQueryClickRecallPLC", "OnPardusSearchSceneEnd " + fVar.f152148a + ' ' + fVar.f152149b + ' ' + fVar.f152150c);
        int i17 = fVar.f152148a;
        v13.e eVar = this.f514050a;
        if (i17 == 0 && fVar.f152149b == 0) {
            r45.yc4 yc4Var = (r45.yc4) fVar.f152151d;
            r45.wc4 wc4Var = yc4Var != null ? yc4Var.f472495d : null;
            r45.st4 st4Var = yc4Var != null ? yc4Var.f472496e : null;
            eVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSQueryClickRecallPLC", "updateRecallDict");
            com.p314xaae8f345.mm.p1006xc5476f33.fts.t tVar = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.fts.d0.class)).f218912d;
            if (tVar != null) {
                tVar.b(65536, new v13.d(eVar, wc4Var, st4Var));
            }
            eVar.f514065g = (((r45.yc4) fVar.f152151d) != null ? r7.f472497f : 0) * 1000;
        }
        eVar.f514066h = null;
        return jz5.f0.f384359a;
    }
}

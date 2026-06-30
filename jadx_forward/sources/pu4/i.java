package pu4;

/* loaded from: classes12.dex */
public class i extends o13.b {

    /* renamed from: e, reason: collision with root package name */
    public o13.y f439974e;

    @Override // o13.w
    public p13.c b(p13.u uVar) {
        pu4.h hVar = new pu4.h(this, uVar);
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) this.f439974e).b(-65536, hVar);
        return hVar;
    }

    @Override // o13.w
    /* renamed from: getName */
    public java.lang.String mo9545xfb82e301() {
        return "FTS5SearchAIHistoryLogic";
    }

    @Override // o13.b
    public boolean h() {
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).mj()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchAIHistoryLogic", "Create Fail!");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchAIHistoryLogic", "Create Success!");
        this.f439974e = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f218913e;
        return true;
    }

    @Override // o13.b
    public boolean i() {
        this.f439974e = null;
        return true;
    }
}

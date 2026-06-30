package od2;

/* loaded from: classes12.dex */
public class k extends o13.b {

    /* renamed from: e, reason: collision with root package name */
    public o13.y f426153e;

    /* renamed from: f, reason: collision with root package name */
    public od2.e f426154f;

    /* renamed from: g, reason: collision with root package name */
    public p13.c f426155g = null;

    /* renamed from: h, reason: collision with root package name */
    public final l75.q0 f426156h = new od2.f(this);

    @Override // o13.w
    public p13.c b(p13.u uVar) {
        od2.i iVar = new od2.i(this, uVar);
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) this.f426153e).b(-65536, iVar);
        return iVar;
    }

    @Override // o13.w
    /* renamed from: getName */
    public java.lang.String mo9545xfb82e301() {
        return "FTS5SearchFinderFollowerLogic";
    }

    @Override // o13.b
    public boolean h() {
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).mj()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchFinderFollowerLogic", "Create Fail!");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchFinderFollowerLogic", "Create Success!");
        this.f426154f = (od2.e) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).cj(1792);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.t tVar = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f218912d;
        this.f426153e = tVar;
        tVar.b(65646, new od2.j(this));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).wi(this.f426156h);
        return true;
    }

    @Override // o13.b
    public boolean i() {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).rj(this.f426156h);
        this.f426154f = null;
        this.f426153e = null;
        return true;
    }
}

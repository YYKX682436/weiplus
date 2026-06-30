package ea1;

/* loaded from: classes12.dex */
public class g extends o13.b {

    /* renamed from: e, reason: collision with root package name */
    public o13.y f332050e;

    /* renamed from: f, reason: collision with root package name */
    public ea1.h f332051f;

    /* renamed from: g, reason: collision with root package name */
    public final l75.q0 f332052g = new ea1.b(this);

    @Override // o13.w
    public p13.c b(p13.u uVar) {
        ea1.e eVar = new ea1.e(this, uVar);
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) this.f332050e).b(-65536, eVar);
        return eVar;
    }

    @Override // o13.w
    /* renamed from: getName */
    public java.lang.String mo9545xfb82e301() {
        return "FTS5SearchWeAppLogic";
    }

    @Override // o13.b
    public boolean h() {
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).mj()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchWeAppLogic", "Create Fail!");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchWeAppLogic", "Create Success!");
        this.f332051f = (ea1.h) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).cj(512);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.t tVar = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f218912d;
        this.f332050e = tVar;
        tVar.b(65616, new ea1.f(this));
        ft.l4 l4Var = (ft.l4) i95.n0.c(ft.l4.class);
        l75.q0 q0Var = this.f332052g;
        et.i2 i2Var = (et.i2) l4Var;
        boolean z17 = i2Var.f337999d.get();
        java.util.concurrent.ConcurrentSkipListSet concurrentSkipListSet = i2Var.f338000e;
        if (!z17) {
            concurrentSkipListSet.add(q0Var);
            return true;
        }
        while (!concurrentSkipListSet.isEmpty()) {
            l75.q0 q0Var2 = (l75.q0) concurrentSkipListSet.pollFirst();
            if (q0Var2 != null && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.hj() != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.hj().add(q0Var2);
            }
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.hj() == null) {
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.hj().add(q0Var);
        return true;
    }

    @Override // o13.b
    public boolean i() {
        ft.l4 l4Var = (ft.l4) i95.n0.c(ft.l4.class);
        l75.q0 q0Var = this.f332052g;
        java.util.concurrent.ConcurrentSkipListSet concurrentSkipListSet = ((et.i2) l4Var).f338000e;
        try {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.hj() != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.hj().mo49775xc84af884(q0Var);
            }
        } catch (c01.c unused) {
        } catch (java.lang.Throwable th6) {
            concurrentSkipListSet.remove(q0Var);
            throw th6;
        }
        concurrentSkipListSet.remove(q0Var);
        this.f332051f = null;
        this.f332050e = null;
        return true;
    }
}

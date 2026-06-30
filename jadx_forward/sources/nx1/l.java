package nx1;

/* loaded from: classes12.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f422829d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f422830e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nx1.n f422831f;

    public l(nx1.n nVar, int i17, java.lang.String str) {
        this.f422831f = nVar;
        this.f422829d = i17;
        this.f422830e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        nx1.n nVar = this.f422831f;
        boolean z17 = nVar.f422847q;
        int i17 = this.f422829d;
        if (z17 || i17 == -50006) {
            nx1.o oVar = nVar.f422842i;
            ix1.i iVar = nVar.f422843m;
            com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.o1 o1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.o1) oVar;
            o1Var.getClass();
            ix1.m mVar = (ix1.m) iVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorActivityUI", "compressNoteVideo onImportFinish");
            java.lang.String str = this.f422830e;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && com.p314xaae8f345.mm.vfs.w6.j(str) && mVar != null) {
                mVar.f376879s = str;
                nx1.d q17 = nx1.d.q();
                com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 abstractActivityC13156x6363e8e1 = o1Var.f178151a;
                q17.r(mVar, abstractActivityC13156x6363e8e1.f178036m.c(), true, true, false, true, false);
                abstractActivityC13156x6363e8e1.k7(true, 100L);
                abstractActivityC13156x6363e8e1.j7(1, 0L);
            }
        } else {
            nx1.o oVar2 = nVar.f422842i;
            ix1.i iVar2 = nVar.f422843m;
            com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 abstractActivityC13156x6363e8e12 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.o1) oVar2).f178151a;
            if (i17 == -50002) {
                abstractActivityC13156x6363e8e12.f7();
            } else if (i17 == -50008) {
                abstractActivityC13156x6363e8e12.f7();
            }
        }
        if (nVar.f422847q || i17 != -50006) {
            gm0.j1.e().k(new nx1.k(this), 80L);
        }
    }
}

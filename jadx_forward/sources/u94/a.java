package u94;

/* loaded from: classes4.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u94.f f507364d;

    public a(u94.f fVar) {
        this.f507364d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        u94.f fVar = this.f507364d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$1");
        try {
            if (((int) u94.f.c(fVar).E2) == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1000", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
                com.p314xaae8f345.mm.p2621x8fb0427b.e8 e8Var = fVar.f507383e;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1000", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
                ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) e8Var).i0(u94.f.c(fVar));
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HalfScreenAddBrandController", th6.toString());
        }
        if (((int) u94.f.c(fVar).E2) <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HalfScreenAddBrandController", "addContact : insert contact failed");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$1");
        } else {
            c01.e2.m0(u94.f.c(fVar));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$1");
        }
    }
}

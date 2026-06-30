package com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29;

/* loaded from: classes8.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d f270004d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f270005e;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.u0 u0Var, com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        this.f270004d = c10756x2a5d7b2d;
        this.f270005e = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda e17 = com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.o0.e(this.f270004d.f149939d);
        if (e17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Wepkg.WepkgUpdater", "updateLiteApp, wepkgVersion is null");
            this.f270005e.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(false));
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17.f269910g)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Wepkg.WepkgUpdater", "pkgPath is null");
            this.f270005e.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(false));
            return;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(e17.f269910g);
        if (!r6Var.m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Wepkg.WepkgUpdater", "file not exists");
            this.f270005e.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(false));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.o oVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.o(r6Var);
        if (!oVar.f269980b) {
            this.f270005e.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(false));
            return;
        }
        java.util.Iterator it = oVar.c().iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.j.a((com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.k) it.next());
        }
        this.f270005e.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(true));
    }
}

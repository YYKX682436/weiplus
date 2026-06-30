package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes8.dex */
public class i0 implements zh1.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f283357a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 f283358b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5 f283359c;

    public i0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21601xaeea84d6 activityC21601xaeea84d6, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 c12476xea20f622, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5 k5Var) {
        this.f283357a = new java.lang.ref.WeakReference(activityC21601xaeea84d6);
        this.f283358b = c12476xea20f622;
        this.f283359c = k5Var;
    }

    @Override // zh1.a1
    public void a(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 c12473xe2bfc4b5) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21601xaeea84d6 activityC21601xaeea84d6 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21601xaeea84d6) this.f283357a.get();
        if (activityC21601xaeea84d6 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppAttachNewDownloadUI", "loadOpenMaterials#onMyOpenMaterialsGot, ui is null");
            return;
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppAttachNewDownloadUI", "loadOpenMaterials#onMyOpenMaterialsGot, fail");
            return;
        }
        activityC21601xaeea84d6.M1 = this.f283358b.f167804f;
        activityC21601xaeea84d6.N1 = c12473xe2bfc4b5;
        if (!activityC21601xaeea84d6.M) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppAttachNewDownloadUI", "loadOpenMaterials#onMyOpenMaterialsGot, download not finish");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5 k5Var = this.f283359c;
        k5Var.getClass();
        zh1.a aVar = zh1.n.f554442o;
        boolean a17 = aVar.a(c12473xe2bfc4b5);
        bi1.g gVar = bi1.g.ATTACH;
        if (a17) {
            zh1.v0 v0Var = activityC21601xaeea84d6.O1;
            if (v0Var != null) {
                v0Var.mo10668x2efc64();
            }
            gVar.toString();
            zh1.n.f554443p = gVar;
            zh1.n.f554444q = 1L;
            activityC21601xaeea84d6.O1 = aVar.b(activityC21601xaeea84d6, activityC21601xaeea84d6.Q1, activityC21601xaeea84d6.N1, null, null);
            activityC21601xaeea84d6.A7(0);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppAttachNewDownloadUI", "loadOpenMaterials#onMyOpenMaterialsGot, can not create");
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = activityC21601xaeea84d6.Q1;
        if (k0Var != null) {
            zh1.p pVar = (zh1.p) k5Var;
            if (!pVar.Zi(k0Var, c12473xe2bfc4b5)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppAttachNewDownloadUI", "loadOpenMaterials#onMyOpenMaterialsGot, not need enhance");
                return;
            }
            zh1.z0 z0Var = activityC21601xaeea84d6.P1;
            if (z0Var != null) {
                z0Var.mo10668x2efc64();
            }
            activityC21601xaeea84d6.P1 = pVar.Ai(gVar, activityC21601xaeea84d6, activityC21601xaeea84d6.Q1, activityC21601xaeea84d6.N1, activityC21601xaeea84d6.O1, null);
        }
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public enum i0 {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public final ik1.x f157117d = new ik1.x();

    i0() {
    }

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.j0 j0Var, m81.c cVar, com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v vVar) {
        java.util.Set g17 = this.f157117d.g(j0Var.f271245a);
        if (g17 != null) {
            java.util.Iterator it = g17.iterator();
            while (it.hasNext()) {
                ((m81.d) it.next()).c(j0Var.f406221l, cVar, vVar);
            }
        }
    }

    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.j0 j0Var, com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v vVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.b6 b6Var) {
        m81.c cVar;
        if (vVar.f271262g != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.Predownload.EncryptPkgDownloader", "onDownloadResult %s", vVar);
            if (vVar.f271263h instanceof n35.a) {
                cVar = m81.c.DISK_FULL;
            } else {
                int i17 = vVar.f271264i;
                cVar = (i17 == 403 || i17 == 404) ? m81.c.SEVER_FILE_NOT_FOUND : m81.c.FAILED;
            }
            a(j0Var, cVar, vVar);
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.za) ((l81.q0) i95.n0.c(l81.q0.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n6 n6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n6) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n6.class);
        m81.c cVar2 = m81.c.ENV_ERR;
        if (n6Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.Predownload.EncryptPkgDownloader", "onDownloadResult complete, null storage");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.m6 z07 = n6Var.z0(j0Var.f406221l, j0Var.f157136q, j0Var.f406222m);
            if (z07 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.Predownload.EncryptPkgDownloader", "onDownloadResult complete, null record with %s", j0Var.f());
            } else {
                z07.f67844x55b471cc = j0Var.f271247c;
                boolean y07 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n6.y0(z07);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Predownload.EncryptPkgDownloader", "onDownloadResult complete, integrityOk %b, with %s", java.lang.Boolean.valueOf(y07), j0Var.f());
                if (y07) {
                    n6Var.mo9952xce0038c9(z07, new java.lang.String[0]);
                    cVar2 = m81.c.OK;
                } else {
                    cVar2 = m81.c.PKG_INVALID;
                }
            }
        }
        a(j0Var, cVar2, vVar);
    }
}

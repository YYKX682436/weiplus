package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public final class c9 implements com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.g {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f157008a = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("WxaPkgDownloadPerformerEventDispatchThread");

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.g
    public void a(java.lang.String str, int i17, int i18) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.g
    public void b(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.i iVar, com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v vVar) {
        this.f157008a.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.b9(this, vVar, iVar));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.g
    public void c(java.lang.String str, long j17) {
    }

    public void d(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11666xa31a0b7f c11666xa31a0b7f) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ua Bi;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaPkgUpdater", "hy: urlkey: %s, onProgressUpdate %s", str, c11666xa31a0b7f);
        java.util.Set<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.va> d17 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (Bi = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ua.Bi()) == null) ? null : Bi.f157531e.d(str);
        if (d17 != null) {
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.va vaVar : d17) {
                if (vaVar != null) {
                    vaVar.a(c11666xa31a0b7f);
                }
            }
        }
    }

    public final void e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a9 a9Var, com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v vVar) {
        com.p314xaae8f345.mm.vfs.w6.h(vVar.f271258c);
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.k kVar = a9Var.f271221d;
        boolean z17 = ((m81.b) kVar) instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.j0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.b6 b6Var = a9Var.f156969m;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.i0.INSTANCE.b((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.j0) ((m81.b) kVar), vVar, b6Var);
            return;
        }
        boolean z18 = ((m81.b) kVar) instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p8;
        m81.c cVar = m81.c.ENV_ERR;
        m81.c cVar2 = m81.c.FAILED;
        if (z18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p8 p8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p8) ((m81.b) kVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.IncrementalPkgLogic[incremental]", "onIncrementalPkgDownloadFail, request(%s %d->%d)", p8Var.f406221l, java.lang.Integer.valueOf(p8Var.f157256q), java.lang.Integer.valueOf(p8Var.f157257r));
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a5) b6Var).c(vVar);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.za) ((l81.q0) i95.n0.c(l81.q0.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.qa Di = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di();
            java.lang.String str = p8Var.f406221l;
            java.lang.String str2 = p8Var.f271245a;
            if (Di != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ua.wi(str2, str, cVar2, null);
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.IncrementalPkgLogic[incremental]", "onIncrementalPkgDownloadFail, before fallback full_pkg, nil storage");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ua.wi(str2, str, cVar, null);
                return;
            }
        }
        if (!(((m81.b) kVar) instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.fc)) {
            java.lang.String str3 = ((m81.b) kVar).f406221l;
            if (vVar.f271263h instanceof n35.a) {
                cVar2 = m81.c.DISK_FULL;
            } else {
                int i17 = vVar.f271264i;
                if (i17 == 403 || i17 == 404) {
                    cVar2 = m81.c.SEVER_FILE_NOT_FOUND;
                }
            }
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ua.Bi() == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaPkgUpdater", "onDownloadFail, get instance null !!!");
                return;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ua.wi(vVar.f271256a, str3, cVar2, null);
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.fc fcVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.fc) ((m81.b) kVar);
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.gc.f157090a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.ZstdLogic", "onZstdPkgDownloadFail, request(%s %d)", fcVar.f406221l, java.lang.Integer.valueOf(fcVar.f157071q));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a5) b6Var).c(vVar);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.za) ((l81.q0) i95.n0.c(l81.q0.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.qa Di2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di();
        java.lang.String str4 = fcVar.f406221l;
        java.lang.String str5 = fcVar.f271245a;
        if (Di2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ua.wi(str5, str4, cVar2, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.ZstdLogic", "onZstdPkgDownloadFail, before fallback full_pkg, nil storage");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ua.wi(str5, str4, cVar, null);
        }
    }
}

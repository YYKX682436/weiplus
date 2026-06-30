package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class c9 implements com.tencent.mm.pluginsdk.res.downloader.model.g {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f75475a = new com.tencent.mm.sdk.platformtools.n3("WxaPkgDownloadPerformerEventDispatchThread");

    @Override // com.tencent.mm.pluginsdk.res.downloader.model.g
    public void a(java.lang.String str, int i17, int i18) {
    }

    @Override // com.tencent.mm.pluginsdk.res.downloader.model.g
    public void b(com.tencent.mm.pluginsdk.res.downloader.model.i iVar, com.tencent.mm.pluginsdk.res.downloader.model.v vVar) {
        this.f75475a.post(new com.tencent.mm.plugin.appbrand.appcache.b9(this, vVar, iVar));
    }

    @Override // com.tencent.mm.pluginsdk.res.downloader.model.g
    public void c(java.lang.String str, long j17) {
    }

    public void d(java.lang.String str, com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress wxaPkgLoadProgress) {
        com.tencent.mm.plugin.appbrand.appcache.ua Bi;
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaPkgUpdater", "hy: urlkey: %s, onProgressUpdate %s", str, wxaPkgLoadProgress);
        java.util.Set<com.tencent.mm.plugin.appbrand.appcache.va> d17 = (com.tencent.mm.sdk.platformtools.t8.K0(str) || (Bi = com.tencent.mm.plugin.appbrand.appcache.ua.Bi()) == null) ? null : Bi.f75998e.d(str);
        if (d17 != null) {
            for (com.tencent.mm.plugin.appbrand.appcache.va vaVar : d17) {
                if (vaVar != null) {
                    vaVar.a(wxaPkgLoadProgress);
                }
            }
        }
    }

    public final void e(com.tencent.mm.plugin.appbrand.appcache.a9 a9Var, com.tencent.mm.pluginsdk.res.downloader.model.v vVar) {
        com.tencent.mm.vfs.w6.h(vVar.f189725c);
        com.tencent.mm.pluginsdk.res.downloader.model.k kVar = a9Var.f189688d;
        boolean z17 = ((m81.b) kVar) instanceof com.tencent.mm.plugin.appbrand.appcache.j0;
        com.tencent.mm.plugin.appbrand.appcache.b6 b6Var = a9Var.f75436m;
        if (z17) {
            com.tencent.mm.plugin.appbrand.appcache.i0.INSTANCE.b((com.tencent.mm.plugin.appbrand.appcache.j0) ((m81.b) kVar), vVar, b6Var);
            return;
        }
        boolean z18 = ((m81.b) kVar) instanceof com.tencent.mm.plugin.appbrand.appcache.p8;
        m81.c cVar = m81.c.ENV_ERR;
        m81.c cVar2 = m81.c.FAILED;
        if (z18) {
            com.tencent.mm.plugin.appbrand.appcache.p8 p8Var = (com.tencent.mm.plugin.appbrand.appcache.p8) ((m81.b) kVar);
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.IncrementalPkgLogic[incremental]", "onIncrementalPkgDownloadFail, request(%s %d->%d)", p8Var.f324688l, java.lang.Integer.valueOf(p8Var.f75723q), java.lang.Integer.valueOf(p8Var.f75724r));
            ((com.tencent.mm.plugin.appbrand.appcache.a5) b6Var).c(vVar);
            ((com.tencent.mm.plugin.appbrand.app.za) ((l81.q0) i95.n0.c(l81.q0.class))).getClass();
            com.tencent.mm.plugin.appbrand.appcache.qa Di = com.tencent.mm.plugin.appbrand.app.r9.Di();
            java.lang.String str = p8Var.f324688l;
            java.lang.String str2 = p8Var.f189712a;
            if (Di != null) {
                com.tencent.mm.plugin.appbrand.appcache.ua.wi(str2, str, cVar2, null);
                return;
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.IncrementalPkgLogic[incremental]", "onIncrementalPkgDownloadFail, before fallback full_pkg, nil storage");
                com.tencent.mm.plugin.appbrand.appcache.ua.wi(str2, str, cVar, null);
                return;
            }
        }
        if (!(((m81.b) kVar) instanceof com.tencent.mm.plugin.appbrand.appcache.fc)) {
            java.lang.String str3 = ((m81.b) kVar).f324688l;
            if (vVar.f189730h instanceof n35.a) {
                cVar2 = m81.c.DISK_FULL;
            } else {
                int i17 = vVar.f189731i;
                if (i17 == 403 || i17 == 404) {
                    cVar2 = m81.c.SEVER_FILE_NOT_FOUND;
                }
            }
            if (com.tencent.mm.plugin.appbrand.appcache.ua.Bi() == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WxaPkgUpdater", "onDownloadFail, get instance null !!!");
                return;
            } else {
                com.tencent.mm.plugin.appbrand.appcache.ua.wi(vVar.f189723a, str3, cVar2, null);
                return;
            }
        }
        com.tencent.mm.plugin.appbrand.appcache.fc fcVar = (com.tencent.mm.plugin.appbrand.appcache.fc) ((m81.b) kVar);
        int i18 = com.tencent.mm.plugin.appbrand.appcache.gc.f75557a;
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.ZstdLogic", "onZstdPkgDownloadFail, request(%s %d)", fcVar.f324688l, java.lang.Integer.valueOf(fcVar.f75538q));
        ((com.tencent.mm.plugin.appbrand.appcache.a5) b6Var).c(vVar);
        ((com.tencent.mm.plugin.appbrand.app.za) ((l81.q0) i95.n0.c(l81.q0.class))).getClass();
        com.tencent.mm.plugin.appbrand.appcache.qa Di2 = com.tencent.mm.plugin.appbrand.app.r9.Di();
        java.lang.String str4 = fcVar.f324688l;
        java.lang.String str5 = fcVar.f189712a;
        if (Di2 != null) {
            com.tencent.mm.plugin.appbrand.appcache.ua.wi(str5, str4, cVar2, null);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.ZstdLogic", "onZstdPkgDownloadFail, before fallback full_pkg, nil storage");
            com.tencent.mm.plugin.appbrand.appcache.ua.wi(str5, str4, cVar, null);
        }
    }
}

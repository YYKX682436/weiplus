package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public enum i0 {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public final ik1.x f75584d = new ik1.x();

    i0() {
    }

    public final void a(com.tencent.mm.plugin.appbrand.appcache.j0 j0Var, m81.c cVar, com.tencent.mm.pluginsdk.res.downloader.model.v vVar) {
        java.util.Set g17 = this.f75584d.g(j0Var.f189712a);
        if (g17 != null) {
            java.util.Iterator it = g17.iterator();
            while (it.hasNext()) {
                ((m81.d) it.next()).c(j0Var.f324688l, cVar, vVar);
            }
        }
    }

    public void b(com.tencent.mm.plugin.appbrand.appcache.j0 j0Var, com.tencent.mm.pluginsdk.res.downloader.model.v vVar, com.tencent.mm.plugin.appbrand.appcache.b6 b6Var) {
        m81.c cVar;
        if (vVar.f189729g != 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.Predownload.EncryptPkgDownloader", "onDownloadResult %s", vVar);
            if (vVar.f189730h instanceof n35.a) {
                cVar = m81.c.DISK_FULL;
            } else {
                int i17 = vVar.f189731i;
                cVar = (i17 == 403 || i17 == 404) ? m81.c.SEVER_FILE_NOT_FOUND : m81.c.FAILED;
            }
            a(j0Var, cVar, vVar);
            return;
        }
        ((com.tencent.mm.plugin.appbrand.app.za) ((l81.q0) i95.n0.c(l81.q0.class))).getClass();
        com.tencent.mm.plugin.appbrand.appcache.n6 n6Var = (com.tencent.mm.plugin.appbrand.appcache.n6) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appcache.n6.class);
        m81.c cVar2 = m81.c.ENV_ERR;
        if (n6Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.Predownload.EncryptPkgDownloader", "onDownloadResult complete, null storage");
        } else {
            com.tencent.mm.plugin.appbrand.appcache.m6 z07 = n6Var.z0(j0Var.f324688l, j0Var.f75603q, j0Var.f324689m);
            if (z07 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.Predownload.EncryptPkgDownloader", "onDownloadResult complete, null record with %s", j0Var.f());
            } else {
                z07.field_pkgPath = j0Var.f189714c;
                boolean y07 = com.tencent.mm.plugin.appbrand.appcache.n6.y0(z07);
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Predownload.EncryptPkgDownloader", "onDownloadResult complete, integrityOk %b, with %s", java.lang.Boolean.valueOf(y07), j0Var.f());
                if (y07) {
                    n6Var.update(z07, new java.lang.String[0]);
                    cVar2 = m81.c.OK;
                } else {
                    cVar2 = m81.c.PKG_INVALID;
                }
            }
        }
        a(j0Var, cVar2, vVar);
    }
}

package com.tencent.mm.plugin.appbrand.appcache.predownload;

/* loaded from: classes4.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f75847d;

    public h(long j17) {
        this.f75847d = j17;
    }

    public final void a(java.util.List list) {
        r81.f.INSTANCE.b(0, 0);
        pq5.g l17 = new com.tencent.mm.plugin.appbrand.appcache.predownload.i(list, null).l();
        lm5.j jVar = lm5.d.f319601b;
        l17.b(jVar, new com.tencent.mm.plugin.appbrand.appcache.predownload.g(this));
        l17.t(jVar, new com.tencent.mm.plugin.appbrand.appcache.predownload.f(this));
    }

    @Override // java.lang.Runnable
    public void run() {
        int size;
        java.util.List list;
        android.util.LongSparseArray longSparseArray = com.tencent.mm.plugin.appbrand.appcache.predownload.i.f75850m;
        synchronized (longSparseArray) {
            longSparseArray.remove(this.f75847d);
            size = longSparseArray.size();
        }
        if (size > 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1422, 12);
        }
        if (!gm0.j1.b().f273254q || com.tencent.mm.plugin.appbrand.app.r9.Ri() == null || com.tencent.mm.plugin.appbrand.app.r9.Di() == null) {
            return;
        }
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.APPBRAND_PREDOWNLOAD_CGI_PULL_LAST_TIME_IN_SECOND_LONG;
        long longValue = ((java.lang.Long) c17.m(u3Var, 0L)).longValue();
        long j17 = com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.b().M.f77272d;
        long i17 = com.tencent.mm.sdk.platformtools.t8.i1();
        int i18 = 0;
        boolean z17 = true;
        if (i17 < longValue + j17 && longValue <= j17 + i17) {
            z17 = false;
        }
        if (z17) {
            gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(i17));
            try {
                list = com.tencent.mm.plugin.appbrand.appcache.predownload.i.s();
            } catch (android.database.sqlite.SQLiteDiskIOException | com.tencent.wcdb.database.SQLiteDiskIOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.CgiBatchSyncPkgVersion", "pullIfExceedLimit::collectReqInfoList, e=%s", e17);
                list = null;
            }
            if (com.tencent.mm.sdk.platformtools.t8.L0(list)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.CgiBatchSyncPkgVersion", "pullIfExceedLimit, empty list");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CgiBatchSyncPkgVersion", "pullIfExceedLimit, collectReqInfoList.size=%d", java.lang.Integer.valueOf(list.size()));
            int i19 = com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.b().M.f77275g;
            int i27 = 0;
            while (i18 < list.size() / i19) {
                int i28 = i18 * i19;
                int i29 = i28 + i19;
                a(list.subList(i28, i29));
                i18++;
                i27 = i29;
            }
            if (i27 < list.size()) {
                a(list.subList(i27, list.size()));
            }
        }
    }
}

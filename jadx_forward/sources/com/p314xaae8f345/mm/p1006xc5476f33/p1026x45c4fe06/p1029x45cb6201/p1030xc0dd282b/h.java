package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b;

/* loaded from: classes4.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f157380d;

    public h(long j17) {
        this.f157380d = j17;
    }

    public final void a(java.util.List list) {
        r81.f.INSTANCE.b(0, 0);
        pq5.g l17 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.i(list, null).l();
        lm5.j jVar = lm5.d.f401134b;
        l17.b(jVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.g(this));
        l17.t(jVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.f(this));
    }

    @Override // java.lang.Runnable
    public void run() {
        int size;
        java.util.List list;
        android.util.LongSparseArray longSparseArray = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.i.f157383m;
        synchronized (longSparseArray) {
            longSparseArray.remove(this.f157380d);
            size = longSparseArray.size();
        }
        if (size > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1422, 12);
        }
        if (!gm0.j1.b().f354787q || com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Ri() == null || com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di() == null) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.APPBRAND_PREDOWNLOAD_CGI_PULL_LAST_TIME_IN_SECOND_LONG;
        long longValue = ((java.lang.Long) c17.m(u3Var, 0L)).longValue();
        long j17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11807xf443363a.b().M.f158805d;
        long i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        int i18 = 0;
        boolean z17 = true;
        if (i17 < longValue + j17 && longValue <= j17 + i17) {
            z17 = false;
        }
        if (z17) {
            gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(i17));
            try {
                list = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.i.s();
            } catch (android.database.sqlite.SQLiteDiskIOException | com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26957x1fbb1a40 e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.CgiBatchSyncPkgVersion", "pullIfExceedLimit::collectReqInfoList, e=%s", e17);
                list = null;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.CgiBatchSyncPkgVersion", "pullIfExceedLimit, empty list");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.CgiBatchSyncPkgVersion", "pullIfExceedLimit, collectReqInfoList.size=%d", java.lang.Integer.valueOf(list.size()));
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11807xf443363a.b().M.f158808g;
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

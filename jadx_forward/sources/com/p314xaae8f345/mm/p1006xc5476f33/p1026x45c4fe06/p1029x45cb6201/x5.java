package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public abstract class x5 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f157583a;

    /* renamed from: b, reason: collision with root package name */
    public static final android.util.SparseLongArray f157584b = new android.util.SparseLongArray();

    /* renamed from: c, reason: collision with root package name */
    public static final long f157585c = java.util.concurrent.TimeUnit.SECONDS.toMillis(30);

    static {
        new java.util.concurrent.atomic.AtomicInteger(0);
    }

    public static void a(java.lang.String str) {
        long j17;
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PkgNetworkOpt", "preConnectHost with EMPTY url");
            return;
        }
        android.util.SparseLongArray sparseLongArray = f157584b;
        synchronized (sparseLongArray) {
            j17 = sparseLongArray.get(str.hashCode(), 0L);
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (java.lang.System.currentTimeMillis() - j17 < f157585c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PkgNetworkOpt", "preConnectHost, hit interval control, url:%s, lastPreConnectedTimestamp:%d", str, java.lang.Long.valueOf(j17));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PkgNetworkOpt", "preConnectHost, task start, url:%s", str);
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.fc) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.fc.class)).mo48894x44a66de6()) {
            rc.c cVar = rc.b.f475439a;
            org.p3343x72743996.net.AbstractC29500x62bc147f abstractC29500x62bc147f = cVar.f475440a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.v5 v5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.v5();
            v5Var.mo153714x45901f31((org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29569x80e9f442<? super byte[]>) new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w5(str));
            abstractC29500x62bc147f.mo153158x92e7539b(str, v5Var, cVar.f475441b).mo153272x492a458b("HEAD").mo153269x59bc66e().mo153671x68ac462();
        }
    }

    public static void b() {
        if (!(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_appbrand_weapp_core_pkg_download, 0) == 1)) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (f157583a) {
                return;
            }
            f157583a = true;
            ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.u5());
            return;
        }
        java.lang.String url = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11807xf443363a.b().f158753r;
        if (android.text.TextUtils.isEmpty(url)) {
            return;
        }
        com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22923xa7798be8 abstractC22923xa7798be8 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.yf.f173962a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.yf.f173962a.m83383x7e5eb0c7(url);
    }
}

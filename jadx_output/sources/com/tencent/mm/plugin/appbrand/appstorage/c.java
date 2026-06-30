package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.appstorage.c f76149a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f76150b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile int f76151c;

    static {
        com.tencent.mm.plugin.appbrand.appstorage.c cVar = new com.tencent.mm.plugin.appbrand.appstorage.c();
        f76149a = cVar;
        cVar.a();
    }

    public final synchronized void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandEncryptKVStorageTransferABTest", "[load]");
        f76151c = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_appbrand_storag_mmkv_transfer_to_encrypt_mmkv, 0);
        f76150b = f76151c != 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandEncryptKVStorageTransferABTest", "[load] isNeedTransfer=" + f76150b + "  phases=" + f76151c);
    }
}

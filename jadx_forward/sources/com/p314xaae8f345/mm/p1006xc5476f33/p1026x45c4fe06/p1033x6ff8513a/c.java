package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.c f157682a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f157683b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile int f157684c;

    static {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.c cVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.c();
        f157682a = cVar;
        cVar.a();
    }

    public final synchronized void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandEncryptKVStorageTransferABTest", "[load]");
        f157684c = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_appbrand_storag_mmkv_transfer_to_encrypt_mmkv, 0);
        f157683b = f157684c != 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandEncryptKVStorageTransferABTest", "[load] isNeedTransfer=" + f157683b + "  phases=" + f157684c);
    }
}

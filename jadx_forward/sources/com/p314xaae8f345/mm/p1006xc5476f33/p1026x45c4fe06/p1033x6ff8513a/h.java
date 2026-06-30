package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a;

/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.h f157724a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.h();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f157725b = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("AppBrandEncryptMMKVStorageDirtyDataFixer");

    public final void a(long j17, java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        f157725b.putBoolean(java.lang.Long.valueOf(j17).longValue() + '#' + appId + "#is_dirty", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandEncryptMMKVStorageDirtyDataFixer", "[unmarkDirty] uin[" + j17 + "] appId[" + appId + ']');
    }
}

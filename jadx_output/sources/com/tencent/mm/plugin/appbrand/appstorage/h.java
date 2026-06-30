package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.appstorage.h f76191a = new com.tencent.mm.plugin.appbrand.appstorage.h();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o4 f76192b = com.tencent.mm.sdk.platformtools.o4.M("AppBrandEncryptMMKVStorageDirtyDataFixer");

    public final void a(long j17, java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        f76192b.putBoolean(java.lang.Long.valueOf(j17).longValue() + '#' + appId + "#is_dirty", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandEncryptMMKVStorageDirtyDataFixer", "[unmarkDirty] uin[" + j17 + "] appId[" + appId + ']');
    }
}

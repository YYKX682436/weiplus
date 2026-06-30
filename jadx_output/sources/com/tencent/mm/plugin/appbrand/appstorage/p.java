package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.appstorage.p f76297a = new com.tencent.mm.plugin.appbrand.appstorage.p();

    public final int a(java.lang.String appId) {
        int i17;
        kotlin.jvm.internal.o.g(appId, "appId");
        long longValue = new kk.v(((v81.e) i95.n0.c(v81.e.class)).Z3(appId)).longValue();
        if (com.tencent.mm.sdk.platformtools.o4.L().getBoolean("hadTransferToEncryptMMKV#" + longValue + '#' + appId, false)) {
            com.tencent.mm.sdk.platformtools.o4 L = com.tencent.mm.sdk.platformtools.o4.L();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("keyHadFinishTransferToEncryptMMKV#");
            sb6.append(longValue);
            sb6.append('#');
            sb6.append(appId);
            i17 = L.getBoolean(sb6.toString(), false) ? 5 : 4;
        } else {
            android.content.SharedPreferences d17 = com.tencent.mm.sdk.platformtools.x2.d();
            com.tencent.mm.plugin.appbrand.appstorage.q qVar = com.tencent.mm.plugin.appbrand.appstorage.s.f76312e;
            kotlin.jvm.internal.o.d(d17);
            i17 = qVar.b(d17, longValue, appId) ? 2 : (!qVar.c(d17, longValue, appId) || com.tencent.mm.plugin.appbrand.appstorage.t.f76321a.a()) ? 1 : 3;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandKVStorageScheme", "getStorageScheme:" + i17);
        return i17;
    }
}

package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public final class q {
    public q(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(java.lang.String key, long j17, java.lang.String appId) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(appId, "appId");
        return key + '#' + j17 + '#' + appId;
    }

    public final boolean b(android.content.SharedPreferences sharedPreferences, long j17, java.lang.String appId) {
        kotlin.jvm.internal.o.g(sharedPreferences, "sharedPreferences");
        kotlin.jvm.internal.o.g(appId, "appId");
        java.lang.String a17 = a("keyHadFinishTransfer", j17, appId);
        com.tencent.mm.sdk.platformtools.o4 R = com.tencent.mm.sdk.platformtools.o4.R("AppBrandKVStorageTransfer");
        kotlin.jvm.internal.o.f(R, "getSingleMMKV(...)");
        if (!R.getBoolean(a17, false)) {
            boolean z17 = sharedPreferences.getBoolean(a17, false);
            if (z17 && !R.getBoolean(a17, false)) {
                R.putBoolean(a17, z17);
            }
            if (!z17) {
                return false;
            }
        }
        return true;
    }

    public final boolean c(android.content.SharedPreferences sharedPreferences, long j17, java.lang.String appId) {
        kotlin.jvm.internal.o.g(sharedPreferences, "sharedPreferences");
        kotlin.jvm.internal.o.g(appId, "appId");
        java.lang.String a17 = a("hadTransferToMMKV", j17, appId);
        com.tencent.mm.sdk.platformtools.o4 R = com.tencent.mm.sdk.platformtools.o4.R("AppBrandKVStorageTransfer");
        kotlin.jvm.internal.o.f(R, "getSingleMMKV(...)");
        if (!R.getBoolean(a17, false)) {
            boolean z17 = sharedPreferences.getBoolean(a17, false);
            if (z17 && !R.getBoolean(a17, false)) {
                R.putBoolean(a17, z17);
            }
            if (!z17) {
                return false;
            }
        }
        return true;
    }
}

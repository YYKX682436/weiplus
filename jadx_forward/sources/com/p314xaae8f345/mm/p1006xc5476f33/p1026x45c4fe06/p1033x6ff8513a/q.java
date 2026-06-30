package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a;

/* loaded from: classes7.dex */
public final class q {
    public q(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.lang.String a(java.lang.String key, long j17, java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        return key + '#' + j17 + '#' + appId;
    }

    public final boolean b(android.content.SharedPreferences sharedPreferences, long j17, java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sharedPreferences, "sharedPreferences");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        java.lang.String a17 = a("keyHadFinishTransfer", j17, appId);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 R = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("AppBrandKVStorageTransfer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(R, "getSingleMMKV(...)");
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sharedPreferences, "sharedPreferences");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        java.lang.String a17 = a("hadTransferToMMKV", j17, appId);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 R = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("AppBrandKVStorageTransfer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(R, "getSingleMMKV(...)");
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

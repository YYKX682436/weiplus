package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes13.dex */
public final class l0 {
    public l0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.m0 a(java.lang.String bssidCache) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bssidCache, "bssidCache");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConnectivityCompat", "parse bssidCache: ".concat(bssidCache));
        java.util.List f07 = r26.n0.f0(bssidCache, new java.lang.String[]{","}, false, 0, 6, null);
        return f07.size() == 2 ? new com.p314xaae8f345.mm.sdk.p2603x2137b148.m0((java.lang.String) f07.get(0), java.lang.Long.parseLong((java.lang.String) f07.get(1))) : new com.p314xaae8f345.mm.sdk.p2603x2137b148.m0("02:00:00:00:00:00", 0L);
    }
}

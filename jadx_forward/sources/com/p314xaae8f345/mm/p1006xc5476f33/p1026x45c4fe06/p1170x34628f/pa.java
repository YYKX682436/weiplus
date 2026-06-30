package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public final class pa {

    /* renamed from: a, reason: collision with root package name */
    public final android.util.LongSparseArray f168545a = new android.util.LongSparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final android.util.LongSparseArray f168546b = new android.util.LongSparseArray();

    /* renamed from: c, reason: collision with root package name */
    public final android.util.LongSparseArray f168547c = new android.util.LongSparseArray();

    public long a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar, java.lang.String str) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(wdVar.ordinal());
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long hash = java.util.Objects.hash(valueOf, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
        b(hash, "routeStartTime", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), true);
        b(hash, "routePageOpenType", wdVar, false);
        b(hash, "routeJsRouteId", str, false);
        return hash;
    }

    public void b(long j17, java.lang.String str, java.lang.Object obj, boolean z17) {
        android.util.LongSparseArray longSparseArray = this.f168547c;
        java.util.Map map = (java.util.Map) longSparseArray.get(j17);
        if (map == null) {
            if (!z17) {
                return;
            }
            map = new java.util.HashMap();
            longSparseArray.put(j17, map);
        }
        if ("routeInitReadyTime".equals(str) && map.containsKey(str)) {
            return;
        }
        map.put(str, obj);
    }
}

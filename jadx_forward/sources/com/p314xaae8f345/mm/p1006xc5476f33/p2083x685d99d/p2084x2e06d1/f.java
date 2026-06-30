package com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.f f243943a = new com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.f();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashSet f243944b = new java.util.HashSet();

    /* renamed from: c, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 f243945c = new com.p314xaae8f345.mm.sdk.p2603x2137b148.r2(30);

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b a(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = f243945c;
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b bVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b) r2Var.get(path);
        if (bVar != null) {
            return bVar;
        }
        if (!com.p314xaae8f345.mm.vfs.w6.j(path)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SightUtilCacheWrapper", "read media info error, file not exists:" + path + '.');
            return null;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(path, true);
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SightUtilCacheWrapper", "read media info with ffmpeg error, path:" + path + '.');
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SightUtilCacheWrapper", "read media info with ffmpeg success, path:" + path + " mediaInfo:" + d17 + " cost: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ", update cache");
        r2Var.put(path, d17);
        return d17;
    }
}

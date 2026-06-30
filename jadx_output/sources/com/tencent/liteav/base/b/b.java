package com.tencent.liteav.base.b;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final long f46290a = java.util.concurrent.TimeUnit.SECONDS.toMillis(1);

    /* renamed from: b, reason: collision with root package name */
    private final java.util.Map<java.lang.String, com.tencent.liteav.base.b.a> f46291b = new java.util.HashMap();

    public final synchronized com.tencent.liteav.base.b.a a(java.lang.String str) {
        com.tencent.liteav.base.b.a aVar;
        aVar = this.f46291b.get(str);
        if (aVar == null) {
            aVar = new com.tencent.liteav.base.b.a(f46290a);
            this.f46291b.put(str, aVar);
        }
        return aVar;
    }
}

package com.p314xaae8f345.p373xbe494963.p378x2e06d1.b;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final long f127823a = java.util.concurrent.TimeUnit.SECONDS.toMillis(1);

    /* renamed from: b, reason: collision with root package name */
    private final java.util.Map<java.lang.String, com.p314xaae8f345.p373xbe494963.p378x2e06d1.b.a> f127824b = new java.util.HashMap();

    public final synchronized com.p314xaae8f345.p373xbe494963.p378x2e06d1.b.a a(java.lang.String str) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.b.a aVar;
        aVar = this.f127824b.get(str);
        if (aVar == null) {
            aVar = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.b.a(f127823a);
            this.f127824b.put(str, aVar);
        }
        return aVar;
    }
}

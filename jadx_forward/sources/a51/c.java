package a51;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final a51.c f83103a = new a51.c();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f83104b = new java.util.concurrent.ConcurrentHashMap();

    public static a51.a a(a51.c cVar, java.lang.String tracerName, java.lang.String spanName, java.lang.String str, boolean z17, int i17, java.lang.Object obj) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.c cVar2;
        java.lang.Object putIfAbsent;
        if ((i17 & 4) != 0) {
            str = null;
        }
        if ((i17 & 8) != 0) {
            z17 = true;
        }
        cVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tracerName, "tracerName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(spanName, "spanName");
        a51.b bVar = new a51.b(spanName, null);
        long currentTimeMillis = java.lang.System.currentTimeMillis() * 1000;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.a aVar = bVar.f83101a;
        aVar.f298939g = currentTimeMillis;
        aVar.f298945p[4] = true;
        bVar.f83102b = true;
        a51.d dVar = a51.d.f83105a;
        boolean[] zArr = aVar.f298945p;
        if (str == null || !dVar.b(str)) {
            if (z17) {
                try {
                    cVar2 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.h.f298976b.b();
                } catch (java.lang.Throwable unused) {
                    cVar2 = null;
                }
                java.lang.String str2 = cVar2 != null ? cVar2.f298955f[1] ? cVar2.f298953d : "" : null;
                if (dVar.b(str2)) {
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.c cVar3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.c();
                    cVar3.f298953d = str2;
                    cVar3.f298955f[1] = true;
                    aVar.f298938f = cVar3;
                    zArr[3] = true;
                }
            }
        } else if (dVar.b(str)) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.c cVar4 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.c();
            cVar4.f298953d = str;
            cVar4.f298955f[1] = true;
            aVar.f298938f = cVar4;
            zArr[3] = true;
        }
        if (!bVar.f83102b) {
            aVar.f298939g = java.lang.System.currentTimeMillis() * 1000;
            zArr[4] = true;
        }
        aVar.f298940h = java.lang.System.currentTimeMillis() * 1000;
        zArr[5] = true;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f83104b;
        java.lang.Object obj2 = concurrentHashMap.get(tracerName);
        if (obj2 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(tracerName, (obj2 = java.lang.Long.valueOf(com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.h.f298976b.c(tracerName))))) != null) {
            obj2 = putIfAbsent;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "getOrPut(...)");
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.f d17 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.h.f298976b.d(((java.lang.Number) obj2).longValue(), aVar);
        long j17 = d17.f298968d;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.c cVar5 = d17.f298970f[2] ? d17.f298969e : new com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.c();
        java.lang.String str3 = cVar5.f298955f[1] ? cVar5.f298953d : "";
        return new a51.a(j17, str3 != null ? str3 : "");
    }
}

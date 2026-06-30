package a51;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final a51.c f1570a = new a51.c();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f1571b = new java.util.concurrent.ConcurrentHashMap();

    public static a51.a a(a51.c cVar, java.lang.String tracerName, java.lang.String spanName, java.lang.String str, boolean z17, int i17, java.lang.Object obj) {
        com.tencent.wechat.aff.otel.c cVar2;
        java.lang.Object putIfAbsent;
        if ((i17 & 4) != 0) {
            str = null;
        }
        if ((i17 & 8) != 0) {
            z17 = true;
        }
        cVar.getClass();
        kotlin.jvm.internal.o.g(tracerName, "tracerName");
        kotlin.jvm.internal.o.g(spanName, "spanName");
        a51.b bVar = new a51.b(spanName, null);
        long currentTimeMillis = java.lang.System.currentTimeMillis() * 1000;
        com.tencent.wechat.aff.otel.a aVar = bVar.f1568a;
        aVar.f217406g = currentTimeMillis;
        aVar.f217412p[4] = true;
        bVar.f1569b = true;
        a51.d dVar = a51.d.f1572a;
        boolean[] zArr = aVar.f217412p;
        if (str == null || !dVar.b(str)) {
            if (z17) {
                try {
                    cVar2 = com.tencent.wechat.aff.otel.h.f217443b.b();
                } catch (java.lang.Throwable unused) {
                    cVar2 = null;
                }
                java.lang.String str2 = cVar2 != null ? cVar2.f217422f[1] ? cVar2.f217420d : "" : null;
                if (dVar.b(str2)) {
                    com.tencent.wechat.aff.otel.c cVar3 = new com.tencent.wechat.aff.otel.c();
                    cVar3.f217420d = str2;
                    cVar3.f217422f[1] = true;
                    aVar.f217405f = cVar3;
                    zArr[3] = true;
                }
            }
        } else if (dVar.b(str)) {
            com.tencent.wechat.aff.otel.c cVar4 = new com.tencent.wechat.aff.otel.c();
            cVar4.f217420d = str;
            cVar4.f217422f[1] = true;
            aVar.f217405f = cVar4;
            zArr[3] = true;
        }
        if (!bVar.f1569b) {
            aVar.f217406g = java.lang.System.currentTimeMillis() * 1000;
            zArr[4] = true;
        }
        aVar.f217407h = java.lang.System.currentTimeMillis() * 1000;
        zArr[5] = true;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f1571b;
        java.lang.Object obj2 = concurrentHashMap.get(tracerName);
        if (obj2 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(tracerName, (obj2 = java.lang.Long.valueOf(com.tencent.wechat.aff.otel.h.f217443b.c(tracerName))))) != null) {
            obj2 = putIfAbsent;
        }
        kotlin.jvm.internal.o.f(obj2, "getOrPut(...)");
        com.tencent.wechat.aff.otel.f d17 = com.tencent.wechat.aff.otel.h.f217443b.d(((java.lang.Number) obj2).longValue(), aVar);
        long j17 = d17.f217435d;
        com.tencent.wechat.aff.otel.c cVar5 = d17.f217437f[2] ? d17.f217436e : new com.tencent.wechat.aff.otel.c();
        java.lang.String str3 = cVar5.f217422f[1] ? cVar5.f217420d : "";
        return new a51.a(j17, str3 != null ? str3 : "");
    }
}

package com.tencent.mm.plugin.appbrand.keylogger;

/* loaded from: classes7.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f84204a = new java.util.concurrent.ConcurrentHashMap();

    public long a(java.lang.String str, java.lang.String str2, kg1.a aVar) {
        java.lang.Long l17;
        java.lang.String format = java.lang.String.format("%s#%s#%s", str, str2, ((kg1.h) aVar).f307694b);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) this.f84204a;
        if (!concurrentHashMap.containsKey(format) || (l17 = (java.lang.Long) concurrentHashMap.get(format)) == null) {
            return -1L;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - l17.longValue();
        concurrentHashMap.remove(format);
        return currentTimeMillis;
    }
}

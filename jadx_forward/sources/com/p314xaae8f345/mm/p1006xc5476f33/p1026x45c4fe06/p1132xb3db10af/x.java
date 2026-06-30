package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af;

/* loaded from: classes7.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f165737a = new java.util.concurrent.ConcurrentHashMap();

    public long a(java.lang.String str, java.lang.String str2, kg1.a aVar) {
        java.lang.Long l17;
        java.lang.String format = java.lang.String.format("%s#%s#%s", str, str2, ((kg1.h) aVar).f389227b);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) this.f165737a;
        if (!concurrentHashMap.containsKey(format) || (l17 = (java.lang.Long) concurrentHashMap.get(format)) == null) {
            return -1L;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - l17.longValue();
        concurrentHashMap.remove(format);
        return currentTimeMillis;
    }
}

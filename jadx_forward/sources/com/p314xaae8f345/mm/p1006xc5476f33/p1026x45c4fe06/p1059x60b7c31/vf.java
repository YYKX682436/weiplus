package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public final class vf {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.vf f165052a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.vf();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f165053b = new java.util.LinkedHashMap();

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d1 type, java.lang.String url) {
        java.util.HashSet hashSet;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        java.util.Map map = f165053b;
        synchronized (map) {
            hashSet = new java.util.HashSet();
            java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) map;
            java.lang.Object obj = linkedHashMap.get(type);
            if (obj == null) {
                obj = new java.util.HashSet();
                linkedHashMap.put(type, obj);
            }
            hashSet.addAll((java.util.Collection) obj);
        }
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.s1) it.next()).a(url);
        }
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d1 type, long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.s1 watcher) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(watcher, "watcher");
        java.util.Map map = f165053b;
        synchronized (map) {
            java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) map;
            java.lang.Object obj = linkedHashMap.get(type);
            if (obj == null) {
                obj = new java.util.HashSet();
                linkedHashMap.put(type, obj);
            }
            ((java.util.HashSet) obj).add(watcher);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new nf.d(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.uf(type, watcher)), j17);
    }

    public final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d1 type, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.s1 watcher) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(watcher, "watcher");
        java.util.Map map = f165053b;
        synchronized (map) {
            java.util.HashSet hashSet = (java.util.HashSet) ((java.util.LinkedHashMap) map).get(type);
            if (hashSet != null) {
                hashSet.remove(watcher);
            }
        }
    }
}

package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class vf {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.vf f83519a = new com.tencent.mm.plugin.appbrand.jsapi.vf();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f83520b = new java.util.LinkedHashMap();

    public final void a(com.tencent.mm.plugin.appbrand.jsapi.d1 type, java.lang.String url) {
        java.util.HashSet hashSet;
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(url, "url");
        java.util.Map map = f83520b;
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
            ((com.tencent.mm.plugin.appbrand.jsapi.s1) it.next()).a(url);
        }
    }

    public final void b(com.tencent.mm.plugin.appbrand.jsapi.d1 type, long j17, com.tencent.mm.plugin.appbrand.jsapi.s1 watcher) {
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(watcher, "watcher");
        java.util.Map map = f83520b;
        synchronized (map) {
            java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) map;
            java.lang.Object obj = linkedHashMap.get(type);
            if (obj == null) {
                obj = new java.util.HashSet();
                linkedHashMap.put(type, obj);
            }
            ((java.util.HashSet) obj).add(watcher);
        }
        com.tencent.mm.sdk.platformtools.u3.i(new nf.d(new com.tencent.mm.plugin.appbrand.jsapi.uf(type, watcher)), j17);
    }

    public final void c(com.tencent.mm.plugin.appbrand.jsapi.d1 type, com.tencent.mm.plugin.appbrand.jsapi.s1 watcher) {
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(watcher, "watcher");
        java.util.Map map = f83520b;
        synchronized (map) {
            java.util.HashSet hashSet = (java.util.HashSet) ((java.util.LinkedHashMap) map).get(type);
            if (hashSet != null) {
                hashSet.remove(watcher);
            }
        }
    }
}

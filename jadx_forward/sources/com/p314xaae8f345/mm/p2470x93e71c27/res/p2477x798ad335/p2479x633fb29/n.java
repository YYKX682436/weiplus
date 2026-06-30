package com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29;

/* loaded from: classes7.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f271224a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f271225b = new java.util.concurrent.ConcurrentHashMap();

    public final void a(java.lang.String str) {
        java.util.concurrent.Future future = (java.util.concurrent.Future) ((java.util.concurrent.ConcurrentHashMap) this.f271225b).remove(str);
        if (future != null) {
            future.cancel(true);
        }
        ((java.util.concurrent.ConcurrentHashMap) this.f271224a).remove(str);
    }

    public final void b() {
        java.util.Map map = this.f271225b;
        java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) map).keySet().iterator();
        while (it.hasNext()) {
            java.util.concurrent.Future future = (java.util.concurrent.Future) ((java.util.concurrent.ConcurrentHashMap) map).get((java.lang.String) it.next());
            if (future != null) {
                future.cancel(true);
            }
        }
        ((java.util.concurrent.ConcurrentHashMap) this.f271224a).clear();
        ((java.util.concurrent.ConcurrentHashMap) map).clear();
    }

    public abstract ku5.f c();

    public synchronized boolean d(java.lang.String str) {
        boolean z17;
        if (!((java.util.concurrent.ConcurrentHashMap) this.f271225b).containsKey(str)) {
            z17 = ((java.util.concurrent.ConcurrentHashMap) this.f271224a).containsKey(str);
        }
        return z17;
    }

    public abstract com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.m e(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.k kVar);

    public final void f(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.k kVar) {
        ((java.util.concurrent.ConcurrentHashMap) this.f271224a).put(kVar.a(), kVar);
        c().submit(e(kVar));
    }
}

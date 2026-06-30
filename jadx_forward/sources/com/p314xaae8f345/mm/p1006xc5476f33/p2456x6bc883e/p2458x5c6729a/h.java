package com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a;

/* loaded from: classes8.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentLinkedQueue f269865a = new java.util.concurrent.ConcurrentLinkedQueue();

    public static void a(android.os.Parcelable parcelable, com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.f fVar) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            java.util.Iterator it = f269865a.iterator();
            while (it.hasNext()) {
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
                if (weakReference.get() != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.c) weakReference.get()).a(parcelable);
                }
            }
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.j0 j0Var = (com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.j0) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.j0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.e eVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.e(fVar);
        ((h80.k) j0Var).getClass();
        com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.p800x7643c6b5.ServiceC10771x8ab5e24d.a(parcelable, com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.g.class, eVar);
    }

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.c cVar) {
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = f269865a;
        java.util.Iterator it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            if (weakReference.get() == cVar) {
                concurrentLinkedQueue.remove(weakReference);
            }
        }
    }
}

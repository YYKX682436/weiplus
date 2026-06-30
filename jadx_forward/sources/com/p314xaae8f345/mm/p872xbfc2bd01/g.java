package com.p314xaae8f345.mm.p872xbfc2bd01;

/* loaded from: classes14.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.NavigableMap f150493a = new java.util.concurrent.ConcurrentSkipListMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Vector f150494b = new java.util.Vector();

    /* renamed from: c, reason: collision with root package name */
    public long f150495c = 0;

    public g() {
        new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5697xfda8a2d7>(this) { // from class: com.tencent.mm.memory.BucketPool$MMTrimMemoryEventListener

            /* renamed from: d, reason: collision with root package name */
            public final java.lang.ref.WeakReference f150487d;

            {
                super(com.p314xaae8f345.mm.app.a0.f134821d);
                this.f150487d = new java.lang.ref.WeakReference(this);
                this.f39173x3fe91575 = 708811463;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5697xfda8a2d7 c5697xfda8a2d7) {
                com.p314xaae8f345.mm.p872xbfc2bd01.g gVar = (com.p314xaae8f345.mm.p872xbfc2bd01.g) this.f150487d.get();
                if (gVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BucketPool", "received MMTrimMemoryEvent: BucketPool[%s] was gone", getClass().getName());
                    mo48814x2efc64();
                } else if (j62.e.g().l("clicfg_matrix_trim_memory_bucketpool_v2", true, false, true)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BucketPool", "received MMTrimMemoryEvent: BucketPool[%s]", getClass().getName());
                    java.util.NavigableMap navigableMap = gVar.f150493a;
                    if (navigableMap != null) {
                        java.util.concurrent.ConcurrentSkipListMap concurrentSkipListMap = (java.util.concurrent.ConcurrentSkipListMap) navigableMap;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BucketPool", "received MMTrimMemoryEvent: clear [pools][%s]", java.lang.Integer.valueOf(concurrentSkipListMap.size()));
                        concurrentSkipListMap.clear();
                    }
                }
                return false;
            }
        }.mo48813x58998cd();
    }

    public void a(com.p314xaae8f345.mm.p872xbfc2bd01.f fVar) {
        java.util.Vector vector = this.f150494b;
        vector.add(fVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BucketPool", "%s addPreload: %s", this, fVar);
        if (vector.size() > 0) {
            s75.d.b(new com.p314xaae8f345.mm.p872xbfc2bd01.e(this), "BucketPool_preload");
        }
    }

    public abstract java.lang.Object b(java.lang.Comparable comparable);

    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BucketPool", "freeAll: %s", getClass().getName());
        ((java.util.concurrent.ConcurrentSkipListMap) this.f150493a).clear();
        this.f150495c = 0L;
    }

    public synchronized java.lang.Object d(java.lang.Comparable comparable) {
        com.p314xaae8f345.mm.p872xbfc2bd01.d dVar = (com.p314xaae8f345.mm.p872xbfc2bd01.d) ((java.util.concurrent.ConcurrentSkipListMap) this.f150493a).get(comparable);
        if (dVar == null || ((java.util.concurrent.ConcurrentLinkedQueue) dVar.f150490a).size() <= 0) {
            return null;
        }
        java.lang.Object poll = ((java.util.concurrent.ConcurrentLinkedQueue) dVar.f150490a).poll();
        ((java.util.concurrent.ConcurrentSkipListMap) this.f150493a).put((java.lang.Comparable) dVar.f150491b, dVar);
        long e17 = e(poll);
        synchronized (this) {
            this.f150495c -= e17;
        }
        return poll;
    }

    public abstract long e(java.lang.Object obj);

    public abstract java.lang.Comparable f(java.lang.Object obj);

    public abstract long g();

    public abstract long h();

    public abstract java.lang.Comparable i(java.lang.Comparable comparable);

    public abstract com.p314xaae8f345.mm.p872xbfc2bd01.d j(java.lang.Comparable comparable);

    public synchronized void k(java.lang.Object obj) {
        if (obj == null) {
            return;
        }
        java.lang.Comparable f17 = f(obj);
        long e17 = e(obj);
        if (e17 > g()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BucketPool", "release, reach maximum element size: %s, ignore this", java.lang.Long.valueOf(e17));
            return;
        }
        if (this.f150495c + e17 > h()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BucketPool", "release, reach maximum size, just ignore %s %s", java.lang.Long.valueOf(e17), java.lang.Long.valueOf(this.f150495c));
            return;
        }
        com.p314xaae8f345.mm.p872xbfc2bd01.d dVar = (com.p314xaae8f345.mm.p872xbfc2bd01.d) ((java.util.concurrent.ConcurrentSkipListMap) this.f150493a).get(f17);
        if (dVar == null) {
            dVar = j(f17);
        }
        ((java.util.concurrent.ConcurrentLinkedQueue) dVar.f150490a).add(obj);
        ((java.util.concurrent.ConcurrentSkipListMap) this.f150493a).put(f17, dVar);
        synchronized (this) {
            this.f150495c += e17;
        }
    }
}

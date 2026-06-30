package com.tencent.mm.memory;

/* loaded from: classes14.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.NavigableMap f68960a = new java.util.concurrent.ConcurrentSkipListMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Vector f68961b = new java.util.Vector();

    /* renamed from: c, reason: collision with root package name */
    public long f68962c = 0;

    public g() {
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MMTrimMemoryEvent>(this) { // from class: com.tencent.mm.memory.BucketPool$MMTrimMemoryEventListener

            /* renamed from: d, reason: collision with root package name */
            public final java.lang.ref.WeakReference f68954d;

            {
                super(com.tencent.mm.app.a0.f53288d);
                this.f68954d = new java.lang.ref.WeakReference(this);
                this.__eventId = 708811463;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MMTrimMemoryEvent mMTrimMemoryEvent) {
                com.tencent.mm.memory.g gVar = (com.tencent.mm.memory.g) this.f68954d.get();
                if (gVar == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BucketPool", "received MMTrimMemoryEvent: BucketPool[%s] was gone", getClass().getName());
                    dead();
                } else if (j62.e.g().l("clicfg_matrix_trim_memory_bucketpool_v2", true, false, true)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.BucketPool", "received MMTrimMemoryEvent: BucketPool[%s]", getClass().getName());
                    java.util.NavigableMap navigableMap = gVar.f68960a;
                    if (navigableMap != null) {
                        java.util.concurrent.ConcurrentSkipListMap concurrentSkipListMap = (java.util.concurrent.ConcurrentSkipListMap) navigableMap;
                        com.tencent.mars.xlog.Log.e("MicroMsg.BucketPool", "received MMTrimMemoryEvent: clear [pools][%s]", java.lang.Integer.valueOf(concurrentSkipListMap.size()));
                        concurrentSkipListMap.clear();
                    }
                }
                return false;
            }
        }.alive();
    }

    public void a(com.tencent.mm.memory.f fVar) {
        java.util.Vector vector = this.f68961b;
        vector.add(fVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.BucketPool", "%s addPreload: %s", this, fVar);
        if (vector.size() > 0) {
            s75.d.b(new com.tencent.mm.memory.e(this), "BucketPool_preload");
        }
    }

    public abstract java.lang.Object b(java.lang.Comparable comparable);

    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BucketPool", "freeAll: %s", getClass().getName());
        ((java.util.concurrent.ConcurrentSkipListMap) this.f68960a).clear();
        this.f68962c = 0L;
    }

    public synchronized java.lang.Object d(java.lang.Comparable comparable) {
        com.tencent.mm.memory.d dVar = (com.tencent.mm.memory.d) ((java.util.concurrent.ConcurrentSkipListMap) this.f68960a).get(comparable);
        if (dVar == null || ((java.util.concurrent.ConcurrentLinkedQueue) dVar.f68957a).size() <= 0) {
            return null;
        }
        java.lang.Object poll = ((java.util.concurrent.ConcurrentLinkedQueue) dVar.f68957a).poll();
        ((java.util.concurrent.ConcurrentSkipListMap) this.f68960a).put((java.lang.Comparable) dVar.f68958b, dVar);
        long e17 = e(poll);
        synchronized (this) {
            this.f68962c -= e17;
        }
        return poll;
    }

    public abstract long e(java.lang.Object obj);

    public abstract java.lang.Comparable f(java.lang.Object obj);

    public abstract long g();

    public abstract long h();

    public abstract java.lang.Comparable i(java.lang.Comparable comparable);

    public abstract com.tencent.mm.memory.d j(java.lang.Comparable comparable);

    public synchronized void k(java.lang.Object obj) {
        if (obj == null) {
            return;
        }
        java.lang.Comparable f17 = f(obj);
        long e17 = e(obj);
        if (e17 > g()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BucketPool", "release, reach maximum element size: %s, ignore this", java.lang.Long.valueOf(e17));
            return;
        }
        if (this.f68962c + e17 > h()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BucketPool", "release, reach maximum size, just ignore %s %s", java.lang.Long.valueOf(e17), java.lang.Long.valueOf(this.f68962c));
            return;
        }
        com.tencent.mm.memory.d dVar = (com.tencent.mm.memory.d) ((java.util.concurrent.ConcurrentSkipListMap) this.f68960a).get(f17);
        if (dVar == null) {
            dVar = j(f17);
        }
        ((java.util.concurrent.ConcurrentLinkedQueue) dVar.f68957a).add(obj);
        ((java.util.concurrent.ConcurrentSkipListMap) this.f68960a).put(f17, dVar);
        synchronized (this) {
            this.f68962c += e17;
        }
    }
}

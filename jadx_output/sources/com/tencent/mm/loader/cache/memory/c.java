package com.tencent.mm.loader.cache.memory;

/* loaded from: classes15.dex */
public final class c extends com.tencent.mm.loader.cache.memory.e {

    /* renamed from: a, reason: collision with root package name */
    public final hp0.f f68635a = new hp0.f(50);

    public c() {
        final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MMTrimMemoryEvent>(weakReference) { // from class: com.tencent.mm.loader.cache.memory.DefaultMemoryCache$MMTrimMemoryEventListener

            /* renamed from: d, reason: collision with root package name */
            public final java.lang.ref.WeakReference f68630d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(com.tencent.mm.app.a0.f53288d);
                kotlin.jvm.internal.o.g(weakReference, "weakTarget");
                this.f68630d = weakReference;
                this.__eventId = 708811463;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MMTrimMemoryEvent mMTrimMemoryEvent) {
                int size;
                com.tencent.mm.autogen.events.MMTrimMemoryEvent event = mMTrimMemoryEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.loader.cache.memory.c cVar = (com.tencent.mm.loader.cache.memory.c) this.f68630d.get();
                if (cVar == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Loader.DefaultImageMemoryCacheListener", "received MMTrimMemoryEvent: DefaultMemoryCache was gone");
                    dead();
                } else if (j62.e.g().l("clicfg_matrix_trim_memory_defaultmemorycache_v2", true, false, true)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Loader.DefaultImageMemoryCacheListener", "received MMTrimMemoryEvent: DefaultMemoryCache");
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    hp0.f fVar = cVar.f68635a;
                    synchronized (fVar) {
                        kk.j jVar = fVar.f282912a;
                        if (jVar == null) {
                            throw new java.lang.NullPointerException("mData == null");
                        }
                        size = ((lt0.f) jVar).size();
                    }
                    objArr[0] = java.lang.Integer.valueOf(size);
                    com.tencent.mars.xlog.Log.e("MicroMsg.Loader.DefaultImageMemoryCacheListener", "received MMTrimMemoryEvent: clear [defaultImageMemoryCache][%s]", objArr);
                    kk.j jVar2 = cVar.f68635a.f282912a;
                    if (jVar2 == null) {
                        throw new java.lang.NullPointerException("mData == null");
                    }
                    ((lt0.f) jVar2).d(-1);
                }
                return false;
            }
        }.alive();
    }

    @Override // com.tencent.mm.loader.cache.memory.e
    public hp0.g a(ip0.a url, dp0.a aVar) {
        kotlin.jvm.internal.o.g(url, "url");
        java.lang.String b17 = b(url, aVar);
        kk.j jVar = this.f68635a.f282912a;
        if (jVar == null) {
            throw new java.lang.NullPointerException("mData == null");
        }
        java.lang.Object obj = ((lt0.f) jVar).get(b17);
        if (obj != null) {
            return new hp0.g(obj);
        }
        return null;
    }

    @Override // com.tencent.mm.loader.cache.memory.e
    public void c(ip0.a url, dp0.a aVar, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(url, "url");
        this.f68635a.a(b(url, aVar), obj);
    }

    @Override // com.tencent.mm.loader.cache.memory.e
    public void d(ip0.a url, dp0.a aVar) {
        kotlin.jvm.internal.o.g(url, "url");
        java.lang.String b17 = b(url, aVar);
        kk.j jVar = this.f68635a.f282912a;
        if (jVar == null) {
            throw new java.lang.NullPointerException("mData == null");
        }
        ((lt0.f) jVar).remove(b17);
    }
}

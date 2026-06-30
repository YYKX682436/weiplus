package com.tencent.mm.loader.cache.memory;

/* loaded from: classes15.dex */
public class a extends com.tencent.mm.loader.cache.memory.e {

    /* renamed from: a, reason: collision with root package name */
    public final jt0.i f68631a = new jt0.i(50, com.tencent.mm.loader.cache.memory.a.class);

    public a() {
        final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MMTrimMemoryEvent>(weakReference) { // from class: com.tencent.mm.loader.cache.memory.DefaultBitmapMemoryCache$MMTrimMemoryEventListener

            /* renamed from: d, reason: collision with root package name */
            public final java.lang.ref.WeakReference f68628d;

            {
                super(com.tencent.mm.app.a0.f53288d);
                this.f68628d = weakReference;
                this.__eventId = 708811463;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MMTrimMemoryEvent mMTrimMemoryEvent) {
                com.tencent.mm.autogen.events.MMTrimMemoryEvent event = mMTrimMemoryEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.ref.WeakReference weakReference2 = this.f68628d;
                com.tencent.mm.loader.cache.memory.a aVar = weakReference2 != null ? (com.tencent.mm.loader.cache.memory.a) weakReference2.get() : null;
                if (aVar == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Loader.DefaultImageMemoryCacheListener", "received MMTrimMemoryEvent: DefaultBitmapMemoryCache was gone");
                    dead();
                } else if (j62.e.g().l("clicfg_matrix_trim_memory_defaultbitmapmemorycache_v2", true, false, true)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Loader.DefaultImageMemoryCacheListener", "received MMTrimMemoryEvent: DefaultBitmapMemoryCache");
                    jt0.i iVar = aVar.f68631a;
                    com.tencent.mars.xlog.Log.e("MicroMsg.Loader.DefaultImageMemoryCacheListener", "received MMTrimMemoryEvent: clear [defaultImageMemoryCache][%s]", java.lang.Integer.valueOf(iVar.size()));
                    iVar.clear();
                }
                return false;
            }
        }.alive();
    }

    @Override // com.tencent.mm.loader.cache.memory.e
    public hp0.g a(ip0.a url, dp0.a aVar) {
        kotlin.jvm.internal.o.g(url, "url");
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) this.f68631a.get(b(url, aVar));
        if (bitmap != null) {
            return new hp0.g(bitmap);
        }
        return null;
    }

    @Override // com.tencent.mm.loader.cache.memory.e
    public void c(ip0.a url, dp0.a aVar, java.lang.Object obj) {
        android.graphics.Bitmap value = (android.graphics.Bitmap) obj;
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(value, "value");
        this.f68631a.put(b(url, aVar), value);
    }

    @Override // com.tencent.mm.loader.cache.memory.e
    public void d(ip0.a url, dp0.a aVar) {
        kotlin.jvm.internal.o.g(url, "url");
        this.f68631a.remove(b(url, aVar));
    }
}

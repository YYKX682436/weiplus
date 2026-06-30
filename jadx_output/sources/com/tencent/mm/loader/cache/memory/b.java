package com.tencent.mm.loader.cache.memory;

/* loaded from: classes15.dex */
public class b extends com.tencent.mm.loader.cache.memory.e {

    /* renamed from: c, reason: collision with root package name */
    public static final int f68632c;

    /* renamed from: a, reason: collision with root package name */
    public final kk.j f68633a;

    /* renamed from: b, reason: collision with root package name */
    public final kk.j f68634b;

    static {
        jt0.i iVar = com.tencent.mm.loader.cache.memory.d.f68636a;
        f68632c = 524288;
    }

    public b() {
        jt0.i iVar = com.tencent.mm.loader.cache.memory.d.f68636a;
        this.f68633a = com.tencent.mm.loader.cache.memory.d.f68636a;
        this.f68634b = com.tencent.mm.loader.cache.memory.d.f68637b;
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MMTrimMemoryEvent>(this) { // from class: com.tencent.mm.loader.cache.memory.DefaultImageMemoryCache$MMTrimMemoryEventListener

            /* renamed from: d, reason: collision with root package name */
            public final java.lang.ref.WeakReference f68629d;

            {
                super(com.tencent.mm.app.a0.f53288d);
                this.f68629d = new java.lang.ref.WeakReference(this);
                this.__eventId = 708811463;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MMTrimMemoryEvent mMTrimMemoryEvent) {
                com.tencent.mm.loader.cache.memory.b bVar = (com.tencent.mm.loader.cache.memory.b) this.f68629d.get();
                if (bVar == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Loader.DefaultImageMemoryCacheListener", "received MMTrimMemoryEvent: DefaultImageMemoryCache was gone");
                    dead();
                } else if (j62.e.g().l("clicfg_matrix_trim_memory_defaultimagememorycache_v2", true, false, true)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Loader.DefaultImageMemoryCacheListener", "received MMTrimMemoryEvent: DefaultImageMemoryCache");
                    kk.j jVar = bVar.f68633a;
                    if (jVar != null) {
                        lt0.f fVar = (lt0.f) jVar;
                        com.tencent.mars.xlog.Log.e("MicroMsg.Loader.DefaultImageMemoryCacheListener", "received MMTrimMemoryEvent: clear [defaultImageMemoryCache][%s]", java.lang.Integer.valueOf(fVar.size()));
                        fVar.clear();
                    }
                }
                return false;
            }
        }.alive();
    }

    @Override // com.tencent.mm.loader.cache.memory.e
    public hp0.g a(ip0.a aVar, dp0.a aVar2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) aVar.f293573a)) {
            return null;
        }
        java.lang.String b17 = b(aVar, aVar2);
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((jt0.i) this.f68633a).get(b17);
        if (bitmap == null) {
            bitmap = (android.graphics.Bitmap) ((jt0.i) this.f68634b).get(b17);
        }
        if (bitmap != null) {
            return new hp0.g(bitmap);
        }
        return null;
    }

    @Override // com.tencent.mm.loader.cache.memory.e
    public void c(ip0.a aVar, dp0.a aVar2, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (aVar == null) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) aVar.f293573a)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Loader.DefaultImageMemoryCacheListener", "[cpan] put failed. key is null.");
            return;
        }
        if (bitmap == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Loader.DefaultImageMemoryCacheListener", "[cpan] put failed.value is null.");
            return;
        }
        long a17 = np0.a.a(bitmap);
        com.tencent.mm.sdk.platformtools.t8.f0(a17);
        if (a17 > f68632c) {
            ((jt0.i) this.f68634b).put(b(aVar, aVar2), bitmap);
        } else {
            ((jt0.i) this.f68633a).put(b(aVar, aVar2), bitmap);
        }
    }

    @Override // com.tencent.mm.loader.cache.memory.e
    public void d(ip0.a aVar, dp0.a aVar2) {
        ((jt0.i) this.f68633a).remove((java.lang.String) aVar.f293573a);
        ((jt0.i) this.f68634b).remove((java.lang.String) aVar.f293573a);
    }
}

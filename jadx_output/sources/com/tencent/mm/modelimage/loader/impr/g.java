package com.tencent.mm.modelimage.loader.impr;

/* loaded from: classes12.dex */
public class g implements p11.o {

    /* renamed from: a, reason: collision with root package name */
    public final kk.j f71247a = new jt0.i(50, com.tencent.mm.modelimage.loader.impr.g.class);

    /* renamed from: b, reason: collision with root package name */
    public final kk.j f71248b = new jt0.i(10, com.tencent.mm.modelimage.loader.impr.g.class);

    public g() {
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MMTrimMemoryEvent>(this) { // from class: com.tencent.mm.modelimage.loader.impr.DefaultImageMemoryCacheListener$MMTrimMemoryEventListener

            /* renamed from: d, reason: collision with root package name */
            public final java.lang.ref.WeakReference f71245d;

            {
                super(com.tencent.mm.app.a0.f53288d);
                this.f71245d = new java.lang.ref.WeakReference(this);
                this.__eventId = 708811463;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MMTrimMemoryEvent mMTrimMemoryEvent) {
                com.tencent.mm.modelimage.loader.impr.g gVar = (com.tencent.mm.modelimage.loader.impr.g) this.f71245d.get();
                if (gVar == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.imageloader.DefaultImageMemoryCacheListener", "received MMTrimMemoryEvent: DefaultImageMemoryCacheListener was gone");
                    dead();
                } else if (j62.e.g().l("clicfg_matrix_trim_memory_defaultimagememorycachelistener_v2", true, false, true)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.imageloader.DefaultImageMemoryCacheListener", "received MMTrimMemoryEvent: DefaultImageMemoryCacheListener");
                    kk.j jVar = gVar.f71247a;
                    if (jVar != null) {
                        lt0.f fVar = (lt0.f) jVar;
                        com.tencent.mars.xlog.Log.e("MicroMsg.imageloader.DefaultImageMemoryCacheListener", "received MMTrimMemoryEvent: clear [defaultImageMemoryCache][%s]", java.lang.Integer.valueOf(fVar.size()));
                        fVar.clear();
                    }
                    kk.j jVar2 = gVar.f71248b;
                    if (jVar2 != null) {
                        lt0.f fVar2 = (lt0.f) jVar2;
                        com.tencent.mars.xlog.Log.e("MicroMsg.imageloader.DefaultImageMemoryCacheListener", "received MMTrimMemoryEvent: clear [bigImageMemoryCache][%s]", java.lang.Integer.valueOf(fVar2.size()));
                        fVar2.clear();
                    }
                }
                return false;
            }
        }.alive();
    }

    @Override // p11.o
    public void a(java.lang.String str, android.graphics.Bitmap bitmap) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.imageloader.DefaultImageMemoryCacheListener", "[cpan] put failed. key is null.");
            return;
        }
        if (bitmap == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.imageloader.DefaultImageMemoryCacheListener", "[cpan] put failed.value is null.");
            return;
        }
        long byteCount = bitmap.getByteCount();
        com.tencent.mm.sdk.platformtools.t8.f0(byteCount);
        if (byteCount > 524288) {
            ((jt0.i) this.f71248b).put(str, bitmap);
        } else {
            ((jt0.i) this.f71247a).put(str, bitmap);
        }
    }

    @Override // p11.o
    public void clear() {
        synchronized (this) {
            kk.j jVar = this.f71247a;
            if (jVar != null) {
                java.util.Map l17 = ((jt0.i) jVar).l();
                if (!l17.isEmpty() && l17.size() > 0) {
                    java.util.Iterator it = l17.entrySet().iterator();
                    while (it.hasNext()) {
                        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((java.util.Map.Entry) it.next()).getValue();
                        if (bitmap != null && !bitmap.isRecycled()) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.imageloader.DefaultImageMemoryCacheListener", "recycle bitmap:%s, not need", bitmap.toString());
                        }
                    }
                }
                ((lt0.f) this.f71247a).clear();
            }
            kk.j jVar2 = this.f71248b;
            if (jVar2 != null) {
                java.util.Map l18 = ((jt0.i) jVar2).l();
                if (!l18.isEmpty() && l18.size() > 0) {
                    java.util.Iterator it6 = l18.entrySet().iterator();
                    while (it6.hasNext()) {
                        android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) ((java.util.Map.Entry) it6.next()).getValue();
                        if (bitmap2 != null && !bitmap2.isRecycled()) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.imageloader.DefaultImageMemoryCacheListener", "recycle bitmap:%s. not need", bitmap2.toString());
                        }
                    }
                }
                ((lt0.f) this.f71248b).clear();
            }
        }
    }

    @Override // p11.o
    public android.graphics.Bitmap get(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        kk.j jVar = this.f71247a;
        if (((jt0.i) jVar).get(str) == null) {
            jVar = this.f71248b;
        }
        return (android.graphics.Bitmap) ((jt0.i) jVar).get(str);
    }

    @Override // p11.o
    public void remove(java.lang.String str) {
        ((jt0.i) this.f71247a).remove(str);
        ((jt0.i) this.f71248b).remove(str);
    }
}

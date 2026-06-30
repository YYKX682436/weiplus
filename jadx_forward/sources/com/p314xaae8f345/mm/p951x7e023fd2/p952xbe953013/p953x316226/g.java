package com.p314xaae8f345.mm.p951x7e023fd2.p952xbe953013.p953x316226;

/* loaded from: classes12.dex */
public class g implements p11.o {

    /* renamed from: a, reason: collision with root package name */
    public final kk.j f152780a = new jt0.i(50, com.p314xaae8f345.mm.p951x7e023fd2.p952xbe953013.p953x316226.g.class);

    /* renamed from: b, reason: collision with root package name */
    public final kk.j f152781b = new jt0.i(10, com.p314xaae8f345.mm.p951x7e023fd2.p952xbe953013.p953x316226.g.class);

    public g() {
        new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5697xfda8a2d7>(this) { // from class: com.tencent.mm.modelimage.loader.impr.DefaultImageMemoryCacheListener$MMTrimMemoryEventListener

            /* renamed from: d, reason: collision with root package name */
            public final java.lang.ref.WeakReference f152778d;

            {
                super(com.p314xaae8f345.mm.app.a0.f134821d);
                this.f152778d = new java.lang.ref.WeakReference(this);
                this.f39173x3fe91575 = 708811463;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5697xfda8a2d7 c5697xfda8a2d7) {
                com.p314xaae8f345.mm.p951x7e023fd2.p952xbe953013.p953x316226.g gVar = (com.p314xaae8f345.mm.p951x7e023fd2.p952xbe953013.p953x316226.g) this.f152778d.get();
                if (gVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.imageloader.DefaultImageMemoryCacheListener", "received MMTrimMemoryEvent: DefaultImageMemoryCacheListener was gone");
                    mo48814x2efc64();
                } else if (j62.e.g().l("clicfg_matrix_trim_memory_defaultimagememorycachelistener_v2", true, false, true)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.imageloader.DefaultImageMemoryCacheListener", "received MMTrimMemoryEvent: DefaultImageMemoryCacheListener");
                    kk.j jVar = gVar.f152780a;
                    if (jVar != null) {
                        lt0.f fVar = (lt0.f) jVar;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.imageloader.DefaultImageMemoryCacheListener", "received MMTrimMemoryEvent: clear [defaultImageMemoryCache][%s]", java.lang.Integer.valueOf(fVar.mo143586x35e001()));
                        fVar.mo143584x5a5b64d();
                    }
                    kk.j jVar2 = gVar.f152781b;
                    if (jVar2 != null) {
                        lt0.f fVar2 = (lt0.f) jVar2;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.imageloader.DefaultImageMemoryCacheListener", "received MMTrimMemoryEvent: clear [bigImageMemoryCache][%s]", java.lang.Integer.valueOf(fVar2.mo143586x35e001()));
                        fVar2.mo143584x5a5b64d();
                    }
                }
                return false;
            }
        }.mo48813x58998cd();
    }

    @Override // p11.o
    public void a(java.lang.String str, android.graphics.Bitmap bitmap) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.imageloader.DefaultImageMemoryCacheListener", "[cpan] put failed. key is null.");
            return;
        }
        if (bitmap == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.imageloader.DefaultImageMemoryCacheListener", "[cpan] put failed.value is null.");
            return;
        }
        long byteCount = bitmap.getByteCount();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(byteCount);
        if (byteCount > 524288) {
            ((jt0.i) this.f152781b).put(str, bitmap);
        } else {
            ((jt0.i) this.f152780a).put(str, bitmap);
        }
    }

    @Override // p11.o
    /* renamed from: clear */
    public void mo48128x5a5b64d() {
        synchronized (this) {
            kk.j jVar = this.f152780a;
            if (jVar != null) {
                java.util.Map l17 = ((jt0.i) jVar).l();
                if (!l17.isEmpty() && l17.size() > 0) {
                    java.util.Iterator it = l17.entrySet().iterator();
                    while (it.hasNext()) {
                        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((java.util.Map.Entry) it.next()).getValue();
                        if (bitmap != null && !bitmap.isRecycled()) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.imageloader.DefaultImageMemoryCacheListener", "recycle bitmap:%s, not need", bitmap.toString());
                        }
                    }
                }
                ((lt0.f) this.f152780a).mo143584x5a5b64d();
            }
            kk.j jVar2 = this.f152781b;
            if (jVar2 != null) {
                java.util.Map l18 = ((jt0.i) jVar2).l();
                if (!l18.isEmpty() && l18.size() > 0) {
                    java.util.Iterator it6 = l18.entrySet().iterator();
                    while (it6.hasNext()) {
                        android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) ((java.util.Map.Entry) it6.next()).getValue();
                        if (bitmap2 != null && !bitmap2.isRecycled()) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.imageloader.DefaultImageMemoryCacheListener", "recycle bitmap:%s. not need", bitmap2.toString());
                        }
                    }
                }
                ((lt0.f) this.f152781b).mo143584x5a5b64d();
            }
        }
    }

    @Override // p11.o
    public android.graphics.Bitmap get(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        kk.j jVar = this.f152780a;
        if (((jt0.i) jVar).get(str) == null) {
            jVar = this.f152781b;
        }
        return (android.graphics.Bitmap) ((jt0.i) jVar).get(str);
    }

    @Override // p11.o
    /* renamed from: remove */
    public void mo48129xc84af884(java.lang.String str) {
        ((jt0.i) this.f152780a).mo141381xc84af884(str);
        ((jt0.i) this.f152781b).mo141381xc84af884(str);
    }
}

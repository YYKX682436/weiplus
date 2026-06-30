package com.p314xaae8f345.mm.p836xbe953013.p837x5a0af82.p838xbfc2bd01;

/* loaded from: classes15.dex */
public class b extends com.p314xaae8f345.mm.p836xbe953013.p837x5a0af82.p838xbfc2bd01.e {

    /* renamed from: c, reason: collision with root package name */
    public static final int f150165c;

    /* renamed from: a, reason: collision with root package name */
    public final kk.j f150166a;

    /* renamed from: b, reason: collision with root package name */
    public final kk.j f150167b;

    static {
        jt0.i iVar = com.p314xaae8f345.mm.p836xbe953013.p837x5a0af82.p838xbfc2bd01.d.f150169a;
        f150165c = 524288;
    }

    public b() {
        jt0.i iVar = com.p314xaae8f345.mm.p836xbe953013.p837x5a0af82.p838xbfc2bd01.d.f150169a;
        this.f150166a = com.p314xaae8f345.mm.p836xbe953013.p837x5a0af82.p838xbfc2bd01.d.f150169a;
        this.f150167b = com.p314xaae8f345.mm.p836xbe953013.p837x5a0af82.p838xbfc2bd01.d.f150170b;
        new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5697xfda8a2d7>(this) { // from class: com.tencent.mm.loader.cache.memory.DefaultImageMemoryCache$MMTrimMemoryEventListener

            /* renamed from: d, reason: collision with root package name */
            public final java.lang.ref.WeakReference f150162d;

            {
                super(com.p314xaae8f345.mm.app.a0.f134821d);
                this.f150162d = new java.lang.ref.WeakReference(this);
                this.f39173x3fe91575 = 708811463;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5697xfda8a2d7 c5697xfda8a2d7) {
                com.p314xaae8f345.mm.p836xbe953013.p837x5a0af82.p838xbfc2bd01.b bVar = (com.p314xaae8f345.mm.p836xbe953013.p837x5a0af82.p838xbfc2bd01.b) this.f150162d.get();
                if (bVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Loader.DefaultImageMemoryCacheListener", "received MMTrimMemoryEvent: DefaultImageMemoryCache was gone");
                    mo48814x2efc64();
                } else if (j62.e.g().l("clicfg_matrix_trim_memory_defaultimagememorycache_v2", true, false, true)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Loader.DefaultImageMemoryCacheListener", "received MMTrimMemoryEvent: DefaultImageMemoryCache");
                    kk.j jVar = bVar.f150166a;
                    if (jVar != null) {
                        lt0.f fVar = (lt0.f) jVar;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Loader.DefaultImageMemoryCacheListener", "received MMTrimMemoryEvent: clear [defaultImageMemoryCache][%s]", java.lang.Integer.valueOf(fVar.mo143586x35e001()));
                        fVar.mo143584x5a5b64d();
                    }
                }
                return false;
            }
        }.mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.p836xbe953013.p837x5a0af82.p838xbfc2bd01.e
    public hp0.g a(ip0.a aVar, dp0.a aVar2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) aVar.f375106a)) {
            return null;
        }
        java.lang.String b17 = b(aVar, aVar2);
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((jt0.i) this.f150166a).get(b17);
        if (bitmap == null) {
            bitmap = (android.graphics.Bitmap) ((jt0.i) this.f150167b).get(b17);
        }
        if (bitmap != null) {
            return new hp0.g(bitmap);
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p836xbe953013.p837x5a0af82.p838xbfc2bd01.e
    public void c(ip0.a aVar, dp0.a aVar2, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (aVar == null) {
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) aVar.f375106a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Loader.DefaultImageMemoryCacheListener", "[cpan] put failed. key is null.");
            return;
        }
        if (bitmap == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Loader.DefaultImageMemoryCacheListener", "[cpan] put failed.value is null.");
            return;
        }
        long a17 = np0.a.a(bitmap);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(a17);
        if (a17 > f150165c) {
            ((jt0.i) this.f150167b).put(b(aVar, aVar2), bitmap);
        } else {
            ((jt0.i) this.f150166a).put(b(aVar, aVar2), bitmap);
        }
    }

    @Override // com.p314xaae8f345.mm.p836xbe953013.p837x5a0af82.p838xbfc2bd01.e
    public void d(ip0.a aVar, dp0.a aVar2) {
        ((jt0.i) this.f150166a).mo141381xc84af884((java.lang.String) aVar.f375106a);
        ((jt0.i) this.f150167b).mo141381xc84af884((java.lang.String) aVar.f375106a);
    }
}

package com.p314xaae8f345.mm.p836xbe953013.p837x5a0af82.p838xbfc2bd01;

/* loaded from: classes15.dex */
public final class c extends com.p314xaae8f345.mm.p836xbe953013.p837x5a0af82.p838xbfc2bd01.e {

    /* renamed from: a, reason: collision with root package name */
    public final hp0.f f150168a = new hp0.f(50);

    public c() {
        final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
        new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5697xfda8a2d7>(weakReference) { // from class: com.tencent.mm.loader.cache.memory.DefaultMemoryCache$MMTrimMemoryEventListener

            /* renamed from: d, reason: collision with root package name */
            public final java.lang.ref.WeakReference f150163d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(com.p314xaae8f345.mm.app.a0.f134821d);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weakReference, "weakTarget");
                this.f150163d = weakReference;
                this.f39173x3fe91575 = 708811463;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5697xfda8a2d7 c5697xfda8a2d7) {
                int mo143586x35e001;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5697xfda8a2d7 event = c5697xfda8a2d7;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.mm.p836xbe953013.p837x5a0af82.p838xbfc2bd01.c cVar = (com.p314xaae8f345.mm.p836xbe953013.p837x5a0af82.p838xbfc2bd01.c) this.f150163d.get();
                if (cVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Loader.DefaultImageMemoryCacheListener", "received MMTrimMemoryEvent: DefaultMemoryCache was gone");
                    mo48814x2efc64();
                } else if (j62.e.g().l("clicfg_matrix_trim_memory_defaultmemorycache_v2", true, false, true)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Loader.DefaultImageMemoryCacheListener", "received MMTrimMemoryEvent: DefaultMemoryCache");
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    hp0.f fVar = cVar.f150168a;
                    synchronized (fVar) {
                        kk.j jVar = fVar.f364445a;
                        if (jVar == null) {
                            throw new java.lang.NullPointerException("mData == null");
                        }
                        mo143586x35e001 = ((lt0.f) jVar).mo143586x35e001();
                    }
                    objArr[0] = java.lang.Integer.valueOf(mo143586x35e001);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Loader.DefaultImageMemoryCacheListener", "received MMTrimMemoryEvent: clear [defaultImageMemoryCache][%s]", objArr);
                    kk.j jVar2 = cVar.f150168a.f364445a;
                    if (jVar2 == null) {
                        throw new java.lang.NullPointerException("mData == null");
                    }
                    ((lt0.f) jVar2).d(-1);
                }
                return false;
            }
        }.mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.p836xbe953013.p837x5a0af82.p838xbfc2bd01.e
    public hp0.g a(ip0.a url, dp0.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        java.lang.String b17 = b(url, aVar);
        kk.j jVar = this.f150168a.f364445a;
        if (jVar == null) {
            throw new java.lang.NullPointerException("mData == null");
        }
        java.lang.Object obj = ((lt0.f) jVar).get(b17);
        if (obj != null) {
            return new hp0.g(obj);
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p836xbe953013.p837x5a0af82.p838xbfc2bd01.e
    public void c(ip0.a url, dp0.a aVar, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        this.f150168a.a(b(url, aVar), obj);
    }

    @Override // com.p314xaae8f345.mm.p836xbe953013.p837x5a0af82.p838xbfc2bd01.e
    public void d(ip0.a url, dp0.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        java.lang.String b17 = b(url, aVar);
        kk.j jVar = this.f150168a.f364445a;
        if (jVar == null) {
            throw new java.lang.NullPointerException("mData == null");
        }
        ((lt0.f) jVar).mo141381xc84af884(b17);
    }
}

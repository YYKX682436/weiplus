package com.p314xaae8f345.mm.p836xbe953013.p837x5a0af82.p838xbfc2bd01;

/* loaded from: classes15.dex */
public class a extends com.p314xaae8f345.mm.p836xbe953013.p837x5a0af82.p838xbfc2bd01.e {

    /* renamed from: a, reason: collision with root package name */
    public final jt0.i f150164a = new jt0.i(50, com.p314xaae8f345.mm.p836xbe953013.p837x5a0af82.p838xbfc2bd01.a.class);

    public a() {
        final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
        new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5697xfda8a2d7>(weakReference) { // from class: com.tencent.mm.loader.cache.memory.DefaultBitmapMemoryCache$MMTrimMemoryEventListener

            /* renamed from: d, reason: collision with root package name */
            public final java.lang.ref.WeakReference f150161d;

            {
                super(com.p314xaae8f345.mm.app.a0.f134821d);
                this.f150161d = weakReference;
                this.f39173x3fe91575 = 708811463;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5697xfda8a2d7 c5697xfda8a2d7) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5697xfda8a2d7 event = c5697xfda8a2d7;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                java.lang.ref.WeakReference weakReference2 = this.f150161d;
                com.p314xaae8f345.mm.p836xbe953013.p837x5a0af82.p838xbfc2bd01.a aVar = weakReference2 != null ? (com.p314xaae8f345.mm.p836xbe953013.p837x5a0af82.p838xbfc2bd01.a) weakReference2.get() : null;
                if (aVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Loader.DefaultImageMemoryCacheListener", "received MMTrimMemoryEvent: DefaultBitmapMemoryCache was gone");
                    mo48814x2efc64();
                } else if (j62.e.g().l("clicfg_matrix_trim_memory_defaultbitmapmemorycache_v2", true, false, true)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Loader.DefaultImageMemoryCacheListener", "received MMTrimMemoryEvent: DefaultBitmapMemoryCache");
                    jt0.i iVar = aVar.f150164a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Loader.DefaultImageMemoryCacheListener", "received MMTrimMemoryEvent: clear [defaultImageMemoryCache][%s]", java.lang.Integer.valueOf(iVar.mo143586x35e001()));
                    iVar.mo143584x5a5b64d();
                }
                return false;
            }
        }.mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.p836xbe953013.p837x5a0af82.p838xbfc2bd01.e
    public hp0.g a(ip0.a url, dp0.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) this.f150164a.get(b(url, aVar));
        if (bitmap != null) {
            return new hp0.g(bitmap);
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p836xbe953013.p837x5a0af82.p838xbfc2bd01.e
    public void c(ip0.a url, dp0.a aVar, java.lang.Object obj) {
        android.graphics.Bitmap value = (android.graphics.Bitmap) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        this.f150164a.put(b(url, aVar), value);
    }

    @Override // com.p314xaae8f345.mm.p836xbe953013.p837x5a0af82.p838xbfc2bd01.e
    public void d(ip0.a url, dp0.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        this.f150164a.mo141381xc84af884(b(url, aVar));
    }
}

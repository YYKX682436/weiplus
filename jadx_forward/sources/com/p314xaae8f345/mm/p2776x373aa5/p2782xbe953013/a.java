package com.p314xaae8f345.mm.p2776x373aa5.p2782xbe953013;

/* loaded from: classes12.dex */
public class a implements p11.o {

    /* renamed from: a, reason: collision with root package name */
    public final q11.a f295140a = new q11.a(150);

    public a() {
        new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5697xfda8a2d7>(this) { // from class: com.tencent.mm.view.loader.EmojiLoaderMemoryCache$MMTrimMemoryEventListener

            /* renamed from: d, reason: collision with root package name */
            public final java.lang.ref.WeakReference f295139d;

            {
                super(com.p314xaae8f345.mm.app.a0.f134821d);
                this.f295139d = new java.lang.ref.WeakReference(this);
                this.f39173x3fe91575 = 708811463;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5697xfda8a2d7 c5697xfda8a2d7) {
                int mo143586x35e001;
                com.p314xaae8f345.mm.p2776x373aa5.p2782xbe953013.a aVar = (com.p314xaae8f345.mm.p2776x373aa5.p2782xbe953013.a) this.f295139d.get();
                if (aVar != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiLoaderMemoryCache", "received MMTrimMemoryEvent: EmojiLoaderMemoryCache");
                    q11.a aVar2 = aVar.f295140a;
                    if (aVar2 != null) {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        synchronized (aVar2) {
                            kk.j jVar = aVar2.f441063a;
                            if (jVar == null) {
                                throw new java.lang.NullPointerException("mData == null");
                            }
                            mo143586x35e001 = ((lt0.f) jVar).mo143586x35e001();
                        }
                        objArr[0] = java.lang.Integer.valueOf(mo143586x35e001);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiLoaderMemoryCache", "received MMTrimMemoryEvent: clear [defaultImageMemoryCache][%s]", objArr);
                        kk.j jVar2 = aVar.f295140a.f441063a;
                        if (jVar2 == null) {
                            throw new java.lang.NullPointerException("mData == null");
                        }
                        ((lt0.f) jVar2).d(-1);
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiLoaderMemoryCache", "received MMTrimMemoryEvent: EmojiLoaderMemoryCache was gone");
                    mo48814x2efc64();
                }
                return false;
            }
        }.mo48813x58998cd();
    }

    @Override // p11.o
    public void a(java.lang.String str, android.graphics.Bitmap bitmap) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiLoaderMemoryCache", "[cpan] put failed. key is null.");
        } else if (bitmap == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiLoaderMemoryCache", "[cpan] put failed.value is null.");
        } else {
            this.f295140a.a(str, bitmap);
        }
    }

    @Override // p11.o
    /* renamed from: clear */
    public void mo48128x5a5b64d() {
        java.util.Map l17;
        synchronized (this) {
            q11.a aVar = this.f295140a;
            if (aVar != null) {
                synchronized (aVar) {
                    kk.j jVar = aVar.f441063a;
                    if (jVar == null) {
                        throw new java.lang.NullPointerException("mData == null");
                    }
                    l17 = ((jt0.j) jVar).l();
                }
                if (!l17.isEmpty() && l17.size() > 0) {
                    java.util.Iterator it = l17.entrySet().iterator();
                    while (it.hasNext()) {
                        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((java.util.Map.Entry) it.next()).getValue();
                        if (bitmap != null && !bitmap.isRecycled()) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiLoaderMemoryCache", "recycle bitmap:%s, not need", bitmap.toString());
                        }
                    }
                }
                kk.j jVar2 = this.f295140a.f441063a;
                if (jVar2 == null) {
                    throw new java.lang.NullPointerException("mData == null");
                }
                ((lt0.f) jVar2).d(-1);
            }
        }
    }

    @Override // p11.o
    public android.graphics.Bitmap get(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        kk.j jVar = this.f295140a.f441063a;
        if (jVar != null) {
            return (android.graphics.Bitmap) ((lt0.f) jVar).get(str);
        }
        throw new java.lang.NullPointerException("mData == null");
    }

    @Override // p11.o
    /* renamed from: remove */
    public void mo48129xc84af884(java.lang.String str) {
        kk.j jVar = this.f295140a.f441063a;
        if (jVar == null) {
            throw new java.lang.NullPointerException("mData == null");
        }
        ((lt0.f) jVar).mo141381xc84af884(str);
    }
}

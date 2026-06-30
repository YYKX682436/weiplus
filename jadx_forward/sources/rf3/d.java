package rf3;

/* loaded from: classes12.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rf3.e f476518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf3.g f476519e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sf3.j f476520f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(rf3.e eVar, sf3.g gVar, sf3.j jVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f476518d = eVar;
        this.f476519e = gVar;
        this.f476520f = jVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rf3.d(this.f476518d, this.f476519e, this.f476520f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        rf3.d dVar = (rf3.d) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        dVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        android.graphics.Bitmap bitmap;
        int i17;
        int i18;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        rf3.e eVar = this.f476518d;
        eVar.getClass();
        sf3.g loadParam = this.f476519e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadParam, "loadParam");
        boolean b17 = fp.i.b();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (b17) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.String c17 = loadParam.c();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17) || !com.p314xaae8f345.mm.vfs.w6.j(c17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.DiskImageLoader", "getBitmap file not exist, path" + c17);
            } else {
                sf3.c cVar = eVar.f476521a;
                android.graphics.Bitmap a17 = cVar.a(loadParam);
                if (a17 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.DiskImageLoader", "get from cache success, path:" + c17);
                    bitmap = a17;
                } else {
                    com.p314xaae8f345.mm.p786x600aa8b.C10724x2c46e1f5 c10724x2c46e1f5 = new com.p314xaae8f345.mm.p786x600aa8b.C10724x2c46e1f5();
                    ((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).inJustDecodeBounds = true;
                    android.graphics.Bitmap d17 = com.p314xaae8f345.mm.p786x600aa8b.e.d(c17, c10724x2c46e1f5);
                    if (d17 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.DiskImageLoader", "bitmap recycled %s", d17);
                        d17.recycle();
                    }
                    this.f476520f.b(loadParam, c10724x2c46e1f5);
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.q2.c(((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outWidth, ((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outHeight) && ((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outWidth > 480;
                    boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.q2.e(((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outWidth, ((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outHeight) && ((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outHeight > 480;
                    if (z17 || z18) {
                        int i19 = ((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outHeight;
                        int i27 = ((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outWidth;
                        i17 = i19;
                        i18 = i27;
                    } else {
                        i18 = com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48865xd4605761;
                        i17 = 960;
                    }
                    int a18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.l.a(c17);
                    if (a18 != 90 && a18 != 270) {
                        int i28 = i17;
                        i17 = i18;
                        i18 = i28;
                    }
                    android.graphics.Bitmap T = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.T(c17, i18, i17, false);
                    if (T == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.DiskImageLoader", "extractThumbNail fail, temBmp is null, filePath = " + c17);
                    } else {
                        android.graphics.Bitmap w07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(T, a18);
                        cVar.b(loadParam, w07);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.DiskImageLoader", "put bitmap to lruCache,ret: " + f0Var + ", path: " + c17 + " , cost: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ", length: " + com.p314xaae8f345.mm.vfs.w6.k(c17));
                        bitmap = w07;
                    }
                }
            }
            bitmap = null;
        } else {
            bitmap = com.p314xaae8f345.mm.p786x600aa8b.e.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources(), com.p314xaae8f345.mm.R.C30861xcebc809e.bkr);
        }
        sf3.g gVar = this.f476519e;
        v65.i.c(eVar.f476523c, null, new rf3.c(bitmap != null, gVar, this.f476520f, new sf3.i(bitmap, null, gVar, 2, null), null), 1, null);
        return f0Var;
    }
}

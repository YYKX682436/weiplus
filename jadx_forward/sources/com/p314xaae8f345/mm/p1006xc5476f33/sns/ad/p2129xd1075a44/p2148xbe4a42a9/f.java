package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9;

/* loaded from: classes4.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f245238d;

    /* renamed from: e, reason: collision with root package name */
    public int f245239e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f245240f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f245241g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f245242h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(r45.jj4 jj4Var, int i17, int i18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f245240f = jj4Var;
        this.f245241g = i17;
        this.f245242h = i18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$createBlurBitmap$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.f fVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.f(this.f245240f, this.f245241g, this.f245242h, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$createBlurBitmap$2");
        return fVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$createBlurBitmap$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$createBlurBitmap$2");
        java.lang.Object mo150x989b7ca4 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$createBlurBitmap$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$createBlurBitmap$2");
        return mo150x989b7ca4;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object j17;
        com.p314xaae8f345.mm.p786x600aa8b.C10724x2c46e1f5 c10724x2c46e1f5;
        int i17;
        int i18;
        android.graphics.Bitmap createBitmap;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$createBlurBitmap$2");
        pz5.a aVar = pz5.a.f440719d;
        int i19 = this.f245239e;
        if (i19 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p786x600aa8b.C10724x2c46e1f5 c10724x2c46e1f52 = new com.p314xaae8f345.mm.p786x600aa8b.C10724x2c46e1f5();
            ((android.graphics.BitmapFactory.Options) c10724x2c46e1f52).inJustDecodeBounds = false;
            ((android.graphics.BitmapFactory.Options) c10724x2c46e1f52).inSampleSize = 2;
            java.lang.String Thumb = this.f245240f.f459393i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Thumb, "Thumb");
            this.f245238d = c10724x2c46e1f52;
            this.f245239e = 1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("downloadImgWithPath", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper2");
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            za4.s0.f552722a.a(Thumb, new za4.r0(rVar));
            j17 = rVar.j();
            pz5.a aVar2 = pz5.a.f440719d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadImgWithPath", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper2");
            if (j17 == aVar) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$createBlurBitmap$2");
                return aVar;
            }
            c10724x2c46e1f5 = c10724x2c46e1f52;
        } else {
            if (i19 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$createBlurBitmap$2");
                throw illegalStateException;
            }
            c10724x2c46e1f5 = (com.p314xaae8f345.mm.p786x600aa8b.C10724x2c46e1f5) this.f245238d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            j17 = obj;
        }
        android.graphics.Bitmap d17 = com.p314xaae8f345.mm.p786x600aa8b.e.d((java.lang.String) j17, c10724x2c46e1f5);
        android.graphics.Bitmap bitmap = null;
        if (d17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$createBlurBitmap$2");
            return null;
        }
        if (d17.getHeight() <= 0 || (i17 = this.f245241g) <= 0 || (i18 = this.f245242h) <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdLivingStreamContainer", "download error or height is <= 0, return null");
        } else {
            float f17 = i17 / i18;
            if (((float) ((d17.getWidth() + 0.0d) / d17.getHeight())) > f17) {
                int width = (int) ((d17.getWidth() - (d17.getHeight() * f17)) / 2);
                int height = d17.getHeight();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(height));
                arrayList.add(java.lang.Integer.valueOf((int) (d17.getHeight() * f17)));
                arrayList.add(0);
                arrayList.add(java.lang.Integer.valueOf(width));
                arrayList.add(d17);
                java.lang.Object obj2 = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/living/AdLivingStreamContainer$createBlurBitmap$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), ((java.lang.Integer) arrayList.get(3)).intValue(), ((java.lang.Integer) arrayList.get(4)).intValue());
                yj0.a.e(obj2, createBitmap, "com/tencent/mm/plugin/sns/ad/widget/living/AdLivingStreamContainer$createBlurBitmap$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
            } else {
                int height2 = (int) ((d17.getHeight() - (d17.getWidth() / f17)) / 2);
                int width2 = d17.getWidth();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(java.lang.Integer.valueOf((int) (d17.getWidth() / f17)));
                arrayList2.add(java.lang.Integer.valueOf(width2));
                arrayList2.add(java.lang.Integer.valueOf(height2));
                arrayList2.add(0);
                arrayList2.add(d17);
                java.lang.Object obj3 = new java.lang.Object();
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(obj3, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/widget/living/AdLivingStreamContainer$createBlurBitmap$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue(), ((java.lang.Integer) arrayList2.get(2)).intValue(), ((java.lang.Integer) arrayList2.get(3)).intValue(), ((java.lang.Integer) arrayList2.get(4)).intValue());
                yj0.a.e(obj3, createBitmap, "com/tencent/mm/plugin/sns/ad/widget/living/AdLivingStreamContainer$createBlurBitmap$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(createBitmap);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdLivingStreamContainer", "return fastblur bitmap");
            bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.X(createBitmap, 54);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$createBlurBitmap$2");
        return bitmap;
    }
}

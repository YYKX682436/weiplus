package com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd;

/* loaded from: classes11.dex */
public final class t0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zq5.e f296630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f296631e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(zq5.e eVar, int i17) {
        super(1);
        this.f296630d = eVar;
        this.f296631e = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        yq5.h decoder = (yq5.h) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(decoder, "decoder");
        com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.d dVar = (com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.d) decoder;
        zq5.e region = this.f296630d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(region, "region");
        dVar.a();
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inSampleSize = this.f296631e;
        jz5.g gVar = dVar.f296463f;
        com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.e eVar = (com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.e) ((jz5.n) gVar).mo141623x754a37bb();
        long j17 = ((yq5.c) ((jz5.n) dVar.f296466i).mo141623x754a37bb()).f546124a;
        eVar.getClass();
        int i17 = eVar.f296472c;
        boolean z17 = java.lang.Math.abs(i17 % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3) != 0;
        int i18 = -i17;
        long d17 = zq5.h.d(j17, i18);
        if (z17) {
            region = zq5.f.a(region, j17, i18);
        }
        if (eVar.f296471b) {
            int i19 = zq5.g.f556599c;
            int i27 = (int) (d17 >> 32);
            region = new zq5.e(i27 - region.f556596c, region.f556595b, i27 - region.f556594a, region.f556597d);
        }
        android.graphics.BitmapRegionDecoder bitmapRegionDecoder = dVar.f296465h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmapRegionDecoder);
        android.graphics.Rect rect = new android.graphics.Rect(region.f556594a, region.f556595b, region.f556596c, region.f556597d);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(options);
        arrayList.add(rect);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(bitmapRegionDecoder, arrayList.toArray(), "com/tencent/mm/zoomimage/subsampling/internal/AndroidRegionDecoder", "decodeRegion", "(Lcom/tencent/mm/zoomimage/util/IntRectCompat;I)Landroid/graphics/Bitmap;", "android/graphics/BitmapRegionDecoder_EXEC_", "decodeRegion", "(Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeRegion = bitmapRegionDecoder.decodeRegion((android.graphics.Rect) arrayList.get(0), (android.graphics.BitmapFactory.Options) arrayList.get(1));
        yj0.a.e(bitmapRegionDecoder, decodeRegion, "com/tencent/mm/zoomimage/subsampling/internal/AndroidRegionDecoder", "decodeRegion", "(Lcom/tencent/mm/zoomimage/util/IntRectCompat;I)Landroid/graphics/Bitmap;", "android/graphics/BitmapRegionDecoder_EXEC_", "decodeRegion", "(Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        if (decodeRegion == null) {
            throw new java.lang.Exception("Invalid image. region decode return null");
        }
        com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.e eVar2 = (com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.e) ((jz5.n) gVar).mo141623x754a37bb();
        eVar2.getClass();
        int i28 = eVar2.f296472c;
        boolean z18 = java.lang.Math.abs(i28 % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3) != 0;
        boolean z19 = eVar2.f296471b;
        if (!z19 && !z18) {
            return decodeRegion;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        if (z19) {
            matrix.postScale(-1.0f, 1.0f);
        }
        if (z18) {
            matrix.postRotate(i28);
        }
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, decodeRegion.getWidth(), decodeRegion.getHeight());
        matrix.mapRect(rectF);
        matrix.postTranslate(-rectF.left, -rectF.top);
        android.graphics.Bitmap.Config config = decodeRegion.getConfig();
        if (config == null) {
            config = android.graphics.Bitmap.Config.ARGB_8888;
        }
        int width = (int) rectF.width();
        int height = (int) rectF.height();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(java.lang.Integer.valueOf(height));
        arrayList2.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/zoomimage/subsampling/internal/ExifOrientationHelper", "applyToBitmap", "(Landroid/graphics/Bitmap;Z)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList2.get(2));
        yj0.a.e(obj2, createBitmap, "com/tencent/mm/zoomimage/subsampling/internal/ExifOrientationHelper", "applyToBitmap", "(Landroid/graphics/Bitmap;Z)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
        new android.graphics.Canvas(createBitmap).drawBitmap(decodeRegion, matrix, new android.graphics.Paint(6));
        return createBitmap;
    }
}

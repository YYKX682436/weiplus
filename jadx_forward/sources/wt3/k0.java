package wt3;

/* loaded from: classes5.dex */
public final class k0 extends wt3.n0 {

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f530966i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(java.util.ArrayList imageList, int i17, wt3.q classifier) {
        super(classifier);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageList, "imageList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(classifier, "classifier");
        this.f530966i = imageList;
    }

    @Override // wt3.n0
    public android.graphics.Bitmap d(int i17) {
        java.util.ArrayList arrayList = this.f530966i;
        if (arrayList.isEmpty()) {
            int i18 = this.f530985b;
            int i19 = this.f530986c;
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(i19));
            arrayList2.add(java.lang.Integer.valueOf(i18));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(obj, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/model/audio/ImageListFrameFeatureExtractor", "nextBitmap", "(I)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList2.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/recordvideo/model/audio/ImageListFrameFeatureExtractor", "nextBitmap", "(I)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
            return createBitmap;
        }
        int i27 = this.f530987d[i17];
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        java.lang.String str = (java.lang.String) arrayList.get(i27);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(options);
        arrayList3.add(str);
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(obj2, arrayList3.toArray(), "com/tencent/mm/plugin/recordvideo/model/audio/ImageListFrameFeatureExtractor", "nextBitmap", "(I)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        yj0.a.e(obj2, android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList3.get(0), (android.graphics.BitmapFactory.Options) arrayList3.get(1)), "com/tencent/mm/plugin/recordvideo/model/audio/ImageListFrameFeatureExtractor", "nextBitmap", "(I)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        options.inSampleSize = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.f(options.outWidth, options.outHeight, this.f530985b, this.f530986c);
        options.inJustDecodeBounds = false;
        android.graphics.Bitmap d17 = com.p314xaae8f345.mm.p786x600aa8b.e.d((java.lang.String) arrayList.get(i27), options);
        if (d17 != null) {
            return d17;
        }
        int i28 = this.f530985b;
        int i29 = this.f530986c;
        android.graphics.Bitmap.Config config2 = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(config2);
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList4.add(java.lang.Integer.valueOf(i29));
        arrayList4.add(java.lang.Integer.valueOf(i28));
        java.lang.Object obj3 = new java.lang.Object();
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(obj3, arrayList4.toArray(), "com/tencent/mm/plugin/recordvideo/model/audio/ImageListFrameFeatureExtractor", "nextBitmap", "(I)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap2 = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList4.get(0)).intValue(), ((java.lang.Integer) arrayList4.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList4.get(2));
        yj0.a.e(obj3, createBitmap2, "com/tencent/mm/plugin/recordvideo/model/audio/ImageListFrameFeatureExtractor", "nextBitmap", "(I)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap2, "createBitmap(...)");
        return createBitmap2;
    }

    @Override // wt3.n0
    public void e() {
    }

    @Override // wt3.n0
    public void f() {
        st3.v vVar = st3.v.f494138d;
        this.f530987d = new int[]{0, 0, 0};
        java.util.ArrayList arrayList = this.f530966i;
        if (arrayList.size() >= 3) {
            this.f530987d[1] = arrayList.size() / 2;
            this.f530987d[2] = arrayList.size() - 1;
        } else if (arrayList.size() == 2) {
            int[] iArr = this.f530987d;
            iArr[1] = 1;
            iArr[2] = 1;
        }
    }
}

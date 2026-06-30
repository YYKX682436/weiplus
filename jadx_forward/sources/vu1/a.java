package vu1;

/* loaded from: classes13.dex */
public final class a implements android.media.ImageReader.OnImageAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vu1.b f521709d;

    public a(vu1.b bVar) {
        this.f521709d = bVar;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(android.media.ImageReader imageReader) {
        android.media.Image acquireLatestImage = imageReader.acquireLatestImage();
        if (acquireLatestImage != null) {
            android.media.Image.Plane[] planes = acquireLatestImage.getPlanes();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(planes);
            if (!(planes.length == 0)) {
                java.nio.ByteBuffer buffer = planes[0].getBuffer();
                int pixelStride = planes[0].getPixelStride();
                int rowStride = planes[0].getRowStride();
                vu1.b bVar = this.f521709d;
                int i17 = rowStride - (bVar.f521710a * pixelStride);
                synchronized (bVar.f521715f) {
                    try {
                        if (bVar.f521716g == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenCastImageReader", "image reader render ");
                            int i18 = bVar.f521710a + (i17 / pixelStride);
                            int i19 = bVar.f521711b;
                            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            arrayList.add(config);
                            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                            arrayList.add(java.lang.Integer.valueOf(i19));
                            arrayList.add(java.lang.Integer.valueOf(i18));
                            java.lang.Object obj = new java.lang.Object();
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/cast/render/ScreenCastImageReader$initScreenCastImageReader$1", "onImageAvailable", "(Landroid/media/ImageReader;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/cast/render/ScreenCastImageReader$initScreenCastImageReader$1", "onImageAvailable", "(Landroid/media/ImageReader;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                            bVar.f521716g = createBitmap;
                        }
                        android.graphics.Bitmap bitmap = bVar.f521716g;
                        if (bitmap != null) {
                            bitmap.copyPixelsFromBuffer(buffer);
                        }
                    } catch (java.lang.Throwable th6) {
                        throw th6;
                    }
                }
            }
            acquireLatestImage.close();
        }
    }
}

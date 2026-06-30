package com.tencent.mm.graphics;

/* loaded from: classes12.dex */
public abstract class e {
    public static android.graphics.Bitmap a(byte[] bArr, int i17, int i18) {
        return com.tencent.mm.graphics.MMBitmapFactoryImpl.getInstance().decodeByteArray(bArr, i17, i18);
    }

    public static android.graphics.Bitmap b(byte[] bArr, int i17, int i18, android.graphics.BitmapFactory.Options options) {
        return com.tencent.mm.graphics.MMBitmapFactoryImpl.getInstance().decodeByteArray(bArr, i17, i18, options);
    }

    public static android.graphics.Bitmap c(java.lang.String str) {
        return com.tencent.mm.graphics.MMBitmapFactoryImpl.getInstance().decodeFile(str);
    }

    public static android.graphics.Bitmap d(java.lang.String str, android.graphics.BitmapFactory.Options options) {
        return com.tencent.mm.graphics.MMBitmapFactoryImpl.getInstance().decodeFile(str, options);
    }

    public static android.graphics.Bitmap e(android.content.res.Resources resources, int i17) {
        return com.tencent.mm.graphics.MMBitmapFactoryImpl.getInstance().decodeResource(resources, i17);
    }

    public static android.graphics.Bitmap f(java.io.InputStream inputStream) {
        return com.tencent.mm.graphics.MMBitmapFactoryImpl.getInstance().decodeStream(inputStream);
    }

    public static android.graphics.Bitmap g(java.io.InputStream inputStream, android.graphics.Rect rect, android.graphics.BitmapFactory.Options options) {
        return com.tencent.mm.graphics.MMBitmapFactoryImpl.getInstance().decodeStream(inputStream, rect, options);
    }

    public static android.graphics.Bitmap h(android.graphics.Bitmap bitmap) {
        return com.tencent.mm.graphics.MMBitmapFactoryImpl.getInstance().pinBitmap(bitmap);
    }

    public static void i(com.tencent.mm.graphics.a aVar) {
        com.tencent.mm.graphics.MMBitmapFactoryImpl.setDecodeCanary(aVar);
    }

    public static void j(com.tencent.mm.graphics.b bVar) {
        com.tencent.mm.graphics.MMBitmapFactoryImpl.setMMCodecListener(bVar);
    }

    public static void k(com.tencent.mm.graphics.d dVar) {
        com.tencent.mm.graphics.MMBitmapFactoryImpl.setStreamProvider(dVar);
    }
}

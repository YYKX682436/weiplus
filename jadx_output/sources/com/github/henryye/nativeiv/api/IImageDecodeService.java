package com.github.henryye.nativeiv.api;

/* loaded from: classes7.dex */
public interface IImageDecodeService {
    void addDecodeEventListener(e8.d dVar);

    void addImageStreamFetcher(h8.c cVar, boolean z17);

    java.lang.String encodeToBase64(android.graphics.Bitmap bitmap, int i17, float f17);

    byte[] encodeToBuffer(android.graphics.Bitmap bitmap, int i17, float f17);

    void forceSetUseType(com.github.henryye.nativeiv.bitmap.BitmapType bitmapType);

    android.graphics.Bitmap getBitmap(int i17, int i18);

    void init();

    void loadBitmapAsync(java.lang.Object obj, com.github.henryye.nativeiv.ImageDecodeConfig imageDecodeConfig);

    void loadBitmapAsync(java.lang.String str);

    void loadBitmapAsync(java.lang.String str, com.github.henryye.nativeiv.ImageDecodeConfig imageDecodeConfig);

    com.github.henryye.nativeiv.bitmap.IBitmap loadBitmapSync(java.lang.Object obj, com.github.henryye.nativeiv.ImageDecodeConfig imageDecodeConfig);

    com.github.henryye.nativeiv.bitmap.IBitmap loadBitmapSync(java.lang.String str);

    com.github.henryye.nativeiv.bitmap.IBitmap loadBitmapSync(java.lang.String str, com.github.henryye.nativeiv.ImageDecodeConfig imageDecodeConfig);

    void release();

    void releaseBitmap(android.graphics.Bitmap bitmap);

    void removeDecodeEventListener(e8.d dVar);

    void removeImageStreamFetcher(h8.c cVar, boolean z17);

    void setBitmapDecodeSlave(e8.b bVar);

    void setIdKeyReportDelegate(g8.h hVar);

    void setKvReportDelegate(g8.i iVar);

    void setMaxDecodeDimension(int i17, int i18);

    void setNetworkTimeout(int i17, int i18);
}

package com.github.henryye.nativeiv.bitmap;

/* loaded from: classes7.dex */
public interface IBitmap<Type> {
    void decodeInputStream(java.io.InputStream inputStream, com.github.henryye.nativeiv.ImageDecodeConfig imageDecodeConfig, f8.c cVar);

    long getDecodeTime();

    com.github.henryye.nativeiv.bitmap.BitmapType getType();

    java.lang.Object provide();

    void recycle();
}

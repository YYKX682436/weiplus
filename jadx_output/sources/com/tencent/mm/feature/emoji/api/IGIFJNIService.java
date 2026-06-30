package com.tencent.mm.feature.emoji.api;

/* loaded from: classes15.dex */
public interface IGIFJNIService extends i95.m {
    byte[] decFile(java.lang.String str, java.lang.String str2);

    boolean drawFrameBitmap(long j17, android.graphics.Bitmap bitmap, int[] iArr);

    boolean drawFramePixels(long j17, int[] iArr, int[] iArr2);

    void encFile(java.lang.String str, java.lang.String str2);

    java.lang.String encodeString(java.lang.String str);

    int getCurrentFrameDuration(long j17);

    int getCurrentFrameIndex(long j17);

    int getHeight(long j17);

    int getTotalFrameCount(long j17);

    int getWidth(long j17);

    void isEncFile(java.lang.String str);

    boolean isGif(long j17);

    void lockBitmap(android.graphics.Bitmap bitmap);

    long openByByteArray(byte[] bArr, int[] iArr);

    long openByFileDescroptor(java.io.FileDescriptor fileDescriptor, long j17, int[] iArr);

    long openByFilePath(java.lang.String str, int[] iArr);

    long openByInputStrem(java.io.InputStream inputStream, int[] iArr);

    void recycle(long j17);

    void reset(long j17);

    void restoreRemainder(long j17);

    void saveRemainder(long j17);
}

package com.tencent.mm.feature.emoji.api;

/* loaded from: classes15.dex */
public interface IWXGFJNIService extends i95.m {
    int getErrorCode();

    int nativeDecodeBufferFrame(long j17, byte[] bArr, int i17, android.graphics.Bitmap bitmap, int[] iArr);

    int nativeDecodeBufferHeader(long j17, byte[] bArr, int i17);

    int nativeGetOption(long j17, byte[] bArr, int i17, int[] iArr);

    long nativeInitWxAMDecoder();

    int nativeRewindBuffer(long j17);

    int nativeUninit(long j17);

    int pic2WxamWithWH(java.lang.String str, byte[] bArr, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47);
}

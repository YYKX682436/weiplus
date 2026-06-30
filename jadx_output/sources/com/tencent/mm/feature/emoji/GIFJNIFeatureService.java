package com.tencent.mm.feature.emoji;

@j95.b
/* loaded from: classes16.dex */
public class GIFJNIFeatureService extends i95.w implements com.tencent.mm.feature.emoji.api.IGIFJNIService {
    @Override // com.tencent.mm.feature.emoji.api.IGIFJNIService
    public byte[] decFile(java.lang.String str, java.lang.String str2) {
        return com.tencent.mm.plugin.gif.MMGIFJNI.decFile(str, str2);
    }

    @Override // com.tencent.mm.feature.emoji.api.IGIFJNIService
    public boolean drawFrameBitmap(long j17, android.graphics.Bitmap bitmap, int[] iArr) {
        return com.tencent.mm.plugin.gif.MMGIFJNI.drawFrameBitmap(j17, bitmap, iArr);
    }

    @Override // com.tencent.mm.feature.emoji.api.IGIFJNIService
    public boolean drawFramePixels(long j17, int[] iArr, int[] iArr2) {
        return com.tencent.mm.plugin.gif.MMGIFJNI.drawFramePixels(j17, iArr, iArr2);
    }

    @Override // com.tencent.mm.feature.emoji.api.IGIFJNIService
    public void encFile(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.gif.MMGIFJNI.encFile(str, str2);
    }

    @Override // com.tencent.mm.feature.emoji.api.IGIFJNIService
    public java.lang.String encodeString(java.lang.String str) {
        return com.tencent.mm.plugin.gif.MMGIFJNI.encodeString(str);
    }

    @Override // com.tencent.mm.feature.emoji.api.IGIFJNIService
    public int getCurrentFrameDuration(long j17) {
        return com.tencent.mm.plugin.gif.MMGIFJNI.getCurrentFrameDuration(j17);
    }

    @Override // com.tencent.mm.feature.emoji.api.IGIFJNIService
    public int getCurrentFrameIndex(long j17) {
        return com.tencent.mm.plugin.gif.MMGIFJNI.getCurrentFrameIndex(j17);
    }

    @Override // com.tencent.mm.feature.emoji.api.IGIFJNIService
    public int getHeight(long j17) {
        return com.tencent.mm.plugin.gif.MMGIFJNI.getHeight(j17);
    }

    @Override // com.tencent.mm.feature.emoji.api.IGIFJNIService
    public int getTotalFrameCount(long j17) {
        return com.tencent.mm.plugin.gif.MMGIFJNI.getTotalFrameCount(j17);
    }

    @Override // com.tencent.mm.feature.emoji.api.IGIFJNIService
    public int getWidth(long j17) {
        return com.tencent.mm.plugin.gif.MMGIFJNI.getWidth(j17);
    }

    @Override // com.tencent.mm.feature.emoji.api.IGIFJNIService
    public void isEncFile(java.lang.String str) {
        com.tencent.mm.plugin.gif.MMGIFJNI.isEncFile(str);
    }

    @Override // com.tencent.mm.feature.emoji.api.IGIFJNIService
    public boolean isGif(long j17) {
        return com.tencent.mm.plugin.gif.MMGIFJNI.isGif(j17);
    }

    @Override // com.tencent.mm.feature.emoji.api.IGIFJNIService
    public void lockBitmap(android.graphics.Bitmap bitmap) {
        com.tencent.mm.plugin.gif.MMGIFJNI.lockBitmap(bitmap);
    }

    @Override // com.tencent.mm.feature.emoji.api.IGIFJNIService
    public long openByByteArray(byte[] bArr, int[] iArr) {
        return com.tencent.mm.plugin.gif.MMGIFJNI.openByByteArray(bArr, iArr);
    }

    @Override // com.tencent.mm.feature.emoji.api.IGIFJNIService
    public long openByFileDescroptor(java.io.FileDescriptor fileDescriptor, long j17, int[] iArr) {
        return com.tencent.mm.plugin.gif.MMGIFJNI.openByFileDescroptor(fileDescriptor, j17, iArr);
    }

    @Override // com.tencent.mm.feature.emoji.api.IGIFJNIService
    public long openByFilePath(java.lang.String str, int[] iArr) {
        return com.tencent.mm.plugin.gif.MMGIFJNI.openByFilePath(str, iArr);
    }

    @Override // com.tencent.mm.feature.emoji.api.IGIFJNIService
    public long openByInputStrem(java.io.InputStream inputStream, int[] iArr) {
        return com.tencent.mm.plugin.gif.MMGIFJNI.openByInputStrem(inputStream, iArr);
    }

    @Override // com.tencent.mm.feature.emoji.api.IGIFJNIService
    public void recycle(long j17) {
        com.tencent.mm.plugin.gif.MMGIFJNI.recycle(j17);
    }

    @Override // com.tencent.mm.feature.emoji.api.IGIFJNIService
    public void reset(long j17) {
        com.tencent.mm.plugin.gif.MMGIFJNI.reset(j17);
    }

    @Override // com.tencent.mm.feature.emoji.api.IGIFJNIService
    public void restoreRemainder(long j17) {
        com.tencent.mm.plugin.gif.MMGIFJNI.restoreRemainder(j17);
    }

    @Override // com.tencent.mm.feature.emoji.api.IGIFJNIService
    public void saveRemainder(long j17) {
        com.tencent.mm.plugin.gif.MMGIFJNI.saveRemainder(j17);
    }
}

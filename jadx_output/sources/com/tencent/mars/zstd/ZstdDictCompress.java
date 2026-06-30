package com.tencent.mars.zstd;

/* loaded from: classes5.dex */
public class ZstdDictCompress implements java.io.Closeable {
    private long nativePtr;

    public ZstdDictCompress(byte[] bArr, int i17) {
        this(bArr, 0, bArr.length, i17);
    }

    private native void free();

    private native void init(byte[] bArr, int i17, int i18, int i19);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        free();
        this.nativePtr = 0L;
    }

    public void finalize() {
        close();
    }

    public ZstdDictCompress(byte[] bArr, int i17, int i18, int i19) {
        this.nativePtr = 0L;
        if (bArr.length - i17 >= 0) {
            init(bArr, i17, i18, i19);
            if (0 == this.nativePtr) {
                throw new java.lang.IllegalStateException("ZSTD_createCDict failed");
            }
            return;
        }
        throw new java.lang.IllegalArgumentException("Dictionary buffer is to short");
    }
}

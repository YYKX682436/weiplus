package com.tencent.mars.zstd;

/* loaded from: classes5.dex */
public class ZstdDictDecompress implements java.io.Closeable {
    private long nativePtr;

    public ZstdDictDecompress(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    private native void free();

    private native void init(byte[] bArr, int i17, int i18);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        free();
        this.nativePtr = 0L;
    }

    public void finalize() {
        close();
    }

    public ZstdDictDecompress(byte[] bArr, int i17, int i18) {
        this.nativePtr = 0L;
        if (bArr.length >= 0) {
            init(bArr, i17, i18);
            if (this.nativePtr == 0) {
                throw new java.lang.IllegalStateException("ZSTD_createDDict failed");
            }
            return;
        }
        throw new java.lang.IllegalArgumentException("Dictionary buffer is to short");
    }
}

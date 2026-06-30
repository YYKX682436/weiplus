package com.tencent.mars.zstd;

/* loaded from: classes13.dex */
public class ZstdDirectBufferDecompressingStream implements java.io.Closeable {
    private int consumed;
    private int produced;
    private java.nio.ByteBuffer source;
    private final long stream;
    private boolean finishedFrame = false;
    private boolean closed = false;
    private boolean streamEnd = false;
    private boolean initialized = false;
    private byte[] dict = null;
    private com.tencent.mars.zstd.ZstdDictDecompress fastDict = null;

    public ZstdDirectBufferDecompressingStream(java.nio.ByteBuffer byteBuffer) {
        if (!byteBuffer.isDirect()) {
            throw new java.lang.IllegalArgumentException("Source buffer should be a direct buffer");
        }
        this.source = byteBuffer;
        this.stream = createDStream();
    }

    private static native long createDStream();

    private native long decompressStream(long j17, java.nio.ByteBuffer byteBuffer, int i17, int i18, java.nio.ByteBuffer byteBuffer2, int i19, int i27);

    private static native int freeDStream(long j17);

    private native int initDStream(long j17);

    private native int initDStreamWithDict(long j17, byte[] bArr, int i17);

    private native int initDStreamWithFastDict(long j17, com.tencent.mars.zstd.ZstdDictDecompress zstdDictDecompress);

    private void initStream() {
        int initDStreamWithDict;
        com.tencent.mars.zstd.ZstdDictDecompress zstdDictDecompress = this.fastDict;
        if (zstdDictDecompress != null) {
            initDStreamWithDict = initDStreamWithFastDict(this.stream, zstdDictDecompress);
        } else {
            byte[] bArr = this.dict;
            initDStreamWithDict = bArr != null ? initDStreamWithDict(this.stream, bArr, bArr.length) : initDStream(this.stream);
        }
        long j17 = initDStreamWithDict;
        if (!com.tencent.mars.zstd.Zstd.isError(j17)) {
            this.initialized = true;
        } else {
            throw new java.io.IOException("Decompression error: " + com.tencent.mars.zstd.Zstd.getErrorName(j17));
        }
    }

    private static native int recommendedDOutSize();

    public static int recommendedTargetBufferSize() {
        return recommendedDOutSize();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        try {
            if (this.initialized) {
                freeDStream(this.stream);
            }
        } finally {
            this.closed = true;
            this.initialized = false;
        }
    }

    public void finalize() {
        if (!this.closed && this.initialized) {
            freeDStream(this.stream);
        }
        this.source = null;
    }

    public boolean hasRemaining() {
        return !this.streamEnd && (this.source.hasRemaining() || !this.finishedFrame);
    }

    public int read(java.nio.ByteBuffer byteBuffer) {
        if (!byteBuffer.isDirect()) {
            throw new java.lang.IllegalArgumentException("Target buffer should be a direct buffer");
        }
        if (this.closed) {
            throw new java.io.IOException("Stream closed");
        }
        if (this.streamEnd) {
            return 0;
        }
        if (!this.initialized) {
            initStream();
        }
        long j17 = this.stream;
        int position = byteBuffer.position();
        int remaining = byteBuffer.remaining();
        java.nio.ByteBuffer byteBuffer2 = this.source;
        long decompressStream = decompressStream(j17, byteBuffer, position, remaining, byteBuffer2, byteBuffer2.position(), this.source.remaining());
        if (com.tencent.mars.zstd.Zstd.isError(decompressStream)) {
            throw new java.io.IOException(com.tencent.mars.zstd.Zstd.getErrorName(decompressStream));
        }
        java.nio.ByteBuffer byteBuffer3 = this.source;
        byteBuffer3.position(byteBuffer3.position() + this.consumed);
        byteBuffer.position(byteBuffer.position() + this.produced);
        if (!this.source.hasRemaining()) {
            java.nio.ByteBuffer refill = refill(this.source);
            this.source = refill;
            if (!refill.isDirect()) {
                throw new java.lang.IllegalArgumentException("Source buffer should be a direct buffer");
            }
        }
        boolean z17 = decompressStream == 0;
        this.finishedFrame = z17;
        if (z17) {
            if (this.source.hasRemaining()) {
                initStream();
            } else {
                this.streamEnd = true;
            }
        }
        return this.produced;
    }

    public java.nio.ByteBuffer refill(java.nio.ByteBuffer byteBuffer) {
        return byteBuffer;
    }

    public com.tencent.mars.zstd.ZstdDirectBufferDecompressingStream setDict(byte[] bArr) {
        if (!this.initialized) {
            this.dict = bArr;
            this.fastDict = null;
            return this;
        }
        throw new java.io.IOException("Change of parameter on initialized stream");
    }

    public com.tencent.mars.zstd.ZstdDirectBufferDecompressingStream setDict(com.tencent.mars.zstd.ZstdDictDecompress zstdDictDecompress) {
        if (!this.initialized) {
            this.fastDict = zstdDictDecompress;
            this.dict = null;
            return this;
        }
        throw new java.io.IOException("Change of parameter on initialized stream");
    }
}

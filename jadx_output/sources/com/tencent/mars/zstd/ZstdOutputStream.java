package com.tencent.mars.zstd;

/* loaded from: classes13.dex */
public class ZstdOutputStream extends java.io.FilterOutputStream {
    private static final int dstSize = (int) recommendedCOutSize();
    private boolean closeFrameOnFlush;
    private byte[] dict;
    private byte[] dst;
    private long dstPos;
    private com.tencent.mars.zstd.ZstdDictCompress fastDict;
    private boolean frameClosed;
    private boolean isClosed;
    private int level;
    private long srcPos;
    private long stream;
    private boolean useChecksum;

    public ZstdOutputStream(java.io.OutputStream outputStream, int i17, boolean z17, boolean z18) {
        super(outputStream);
        this.srcPos = 0L;
        this.dstPos = 0L;
        this.dst = null;
        this.isClosed = false;
        this.frameClosed = true;
        this.dict = null;
        this.fastDict = null;
        this.closeFrameOnFlush = z17;
        this.level = i17;
        this.useChecksum = z18;
        this.stream = createCStream();
        this.dst = new byte[dstSize];
    }

    private native int compressStream(long j17, byte[] bArr, int i17, byte[] bArr2, int i18);

    private static native long createCStream();

    private native int endStream(long j17, byte[] bArr, int i17);

    private native int flushStream(long j17, byte[] bArr, int i17);

    private static native int freeCStream(long j17);

    private native int initCStream(long j17, int i17, int i18);

    private native int initCStreamWithDict(long j17, byte[] bArr, int i17, int i18, int i19);

    private native int initCStreamWithFastDict(long j17, com.tencent.mars.zstd.ZstdDictCompress zstdDictCompress, int i17);

    private static native long recommendedCOutSize();

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.isClosed) {
            return;
        }
        if (!this.frameClosed) {
            long endStream = endStream(this.stream, this.dst, dstSize);
            if (com.tencent.mars.zstd.Zstd.isError(endStream)) {
                throw new java.io.IOException("Compression error: " + com.tencent.mars.zstd.Zstd.getErrorName(endStream));
            }
            ((java.io.FilterOutputStream) this).out.write(this.dst, 0, (int) this.dstPos);
        }
        freeCStream(this.stream);
        ((java.io.FilterOutputStream) this).out.close();
        this.isClosed = true;
    }

    public void finalize() {
        close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() {
        if (this.isClosed) {
            throw new java.io.IOException("Stream closed");
        }
        if (this.frameClosed) {
            return;
        }
        if (this.closeFrameOnFlush) {
            long endStream = endStream(this.stream, this.dst, dstSize);
            if (com.tencent.mars.zstd.Zstd.isError(endStream)) {
                throw new java.io.IOException("Compression error: " + com.tencent.mars.zstd.Zstd.getErrorName(endStream));
            }
            this.frameClosed = true;
        } else {
            long flushStream = flushStream(this.stream, this.dst, dstSize);
            if (com.tencent.mars.zstd.Zstd.isError(flushStream)) {
                throw new java.io.IOException("Compression error: " + com.tencent.mars.zstd.Zstd.getErrorName(flushStream));
            }
        }
        ((java.io.FilterOutputStream) this).out.write(this.dst, 0, (int) this.dstPos);
        ((java.io.FilterOutputStream) this).out.flush();
    }

    public com.tencent.mars.zstd.ZstdOutputStream setChecksum(boolean z17) {
        if (!this.frameClosed) {
            throw new java.io.IOException("Change of parameter on initialized stream");
        }
        this.useChecksum = z17;
        return this;
    }

    public com.tencent.mars.zstd.ZstdOutputStream setDict(byte[] bArr) {
        if (this.frameClosed) {
            this.fastDict = null;
            this.dict = bArr;
            return this;
        }
        throw new java.io.IOException("Change of parameter on initialized stream");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i17, int i18) {
        int initCStream;
        if (!this.isClosed) {
            if (this.frameClosed) {
                com.tencent.mars.zstd.ZstdDictCompress zstdDictCompress = this.fastDict;
                if (zstdDictCompress != null) {
                    initCStream = initCStreamWithFastDict(this.stream, zstdDictCompress, this.useChecksum ? 1 : 0);
                } else {
                    byte[] bArr2 = this.dict;
                    if (bArr2 != null) {
                        initCStream = initCStreamWithDict(this.stream, bArr2, bArr2.length, this.level, this.useChecksum ? 1 : 0);
                    } else {
                        initCStream = initCStream(this.stream, this.level, this.useChecksum ? 1 : 0);
                    }
                }
                long j17 = initCStream;
                if (!com.tencent.mars.zstd.Zstd.isError(j17)) {
                    this.frameClosed = false;
                } else {
                    throw new java.io.IOException("Compression error: cannot create header: " + com.tencent.mars.zstd.Zstd.getErrorName(j17));
                }
            }
            int i19 = i18 + i17;
            this.srcPos = i17;
            while (this.srcPos < i19) {
                long compressStream = compressStream(this.stream, this.dst, dstSize, bArr, i19);
                if (!com.tencent.mars.zstd.Zstd.isError(compressStream)) {
                    long j18 = this.dstPos;
                    if (j18 > 0) {
                        ((java.io.FilterOutputStream) this).out.write(this.dst, 0, (int) j18);
                    }
                } else {
                    throw new java.io.IOException("Compression error: " + com.tencent.mars.zstd.Zstd.getErrorName(compressStream));
                }
            }
            return;
        }
        throw new java.io.IOException("Stream closed");
    }

    public com.tencent.mars.zstd.ZstdOutputStream setDict(com.tencent.mars.zstd.ZstdDictCompress zstdDictCompress) {
        if (this.frameClosed) {
            this.dict = null;
            this.fastDict = zstdDictCompress;
            return this;
        }
        throw new java.io.IOException("Change of parameter on initialized stream");
    }

    public ZstdOutputStream(java.io.OutputStream outputStream, int i17, boolean z17) {
        this(outputStream, i17, z17, false);
    }

    public ZstdOutputStream(java.io.OutputStream outputStream, int i17) {
        this(outputStream, i17, false);
    }

    public ZstdOutputStream(java.io.OutputStream outputStream) {
        this(outputStream, 3, false);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i17) {
        write(new byte[]{(byte) i17}, 0, 1);
    }
}

package com.tencent.mars.zstd;

/* loaded from: classes13.dex */
public class ZstdInputStream extends java.io.FilterInputStream {
    private static final int srcBuffSize = (int) recommendedDInSize();
    private byte[] dict;
    private long dstPos;
    private com.tencent.mars.zstd.ZstdDictDecompress fastDict;
    private boolean frameFinished;
    private boolean isClosed;
    private boolean isContinuous;
    private byte[] src;
    private long srcPos;
    private long srcSize;
    private long stream;

    public ZstdInputStream(java.io.InputStream inputStream) {
        super(inputStream);
        this.dstPos = 0L;
        this.srcPos = 0L;
        this.srcSize = 0L;
        this.src = null;
        this.isContinuous = false;
        this.frameFinished = true;
        this.isClosed = false;
        this.dict = null;
        this.fastDict = null;
        this.src = new byte[srcBuffSize];
        this.stream = createDStream();
    }

    private static native long createDStream();

    private native int decompressStream(long j17, byte[] bArr, int i17, byte[] bArr2, int i18);

    private static native int freeDStream(long j17);

    private native int initDStream(long j17);

    private native int initDStreamWithDict(long j17, byte[] bArr, int i17);

    private native int initDStreamWithFastDict(long j17, com.tencent.mars.zstd.ZstdDictDecompress zstdDictDecompress);

    private static native long recommendedDInSize();

    private static native long recommendedDOutSize();

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        if (this.isClosed) {
            throw new java.io.IOException("Stream closed");
        }
        long j17 = this.srcSize - this.srcPos;
        return j17 > 0 ? (int) j17 : ((java.io.FilterInputStream) this).in.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.isClosed) {
            return;
        }
        freeDStream(this.stream);
        ((java.io.FilterInputStream) this).in.close();
        this.isClosed = true;
    }

    public void finalize() {
        close();
    }

    public boolean getContinuous() {
        return this.isContinuous;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i17, int i18) {
        long j17;
        int initDStream;
        if (!this.isClosed) {
            if (this.frameFinished) {
                com.tencent.mars.zstd.ZstdDictDecompress zstdDictDecompress = this.fastDict;
                if (zstdDictDecompress != null) {
                    initDStream = initDStreamWithFastDict(this.stream, zstdDictDecompress);
                } else {
                    byte[] bArr2 = this.dict;
                    if (bArr2 != null) {
                        initDStream = initDStreamWithDict(this.stream, bArr2, bArr2.length);
                    } else {
                        initDStream = initDStream(this.stream);
                    }
                }
                long j18 = initDStream;
                if (com.tencent.mars.zstd.Zstd.isError(j18)) {
                    throw new java.io.IOException("Decompression error: " + com.tencent.mars.zstd.Zstd.getErrorName(j18));
                }
            }
            if (i17 >= 0 && i18 <= bArr.length - i17) {
                int i19 = i17 + i18;
                long j19 = i17;
                this.dstPos = j19;
                while (this.dstPos < i19) {
                    if (this.srcSize - this.srcPos == 0) {
                        long read = ((java.io.FilterInputStream) this).in.read(this.src, 0, srcBuffSize);
                        this.srcSize = read;
                        this.srcPos = 0L;
                        if (read < 0) {
                            this.srcSize = 0L;
                            if (this.frameFinished) {
                                return -1;
                            }
                            if (this.isContinuous) {
                                j17 = this.dstPos;
                                return (int) (j17 - j19);
                            }
                            throw new java.io.IOException("Read error or truncated source");
                        }
                        this.frameFinished = false;
                    }
                    int decompressStream = decompressStream(this.stream, bArr, i19, this.src, (int) this.srcSize);
                    long j27 = decompressStream;
                    if (com.tencent.mars.zstd.Zstd.isError(j27)) {
                        throw new java.io.IOException("Decompression error: " + com.tencent.mars.zstd.Zstd.getErrorName(j27));
                    }
                    if (decompressStream == 0) {
                        this.frameFinished = true;
                        j17 = this.dstPos;
                        return (int) (j17 - j19);
                    }
                }
                return i18;
            }
            throw new java.lang.IndexOutOfBoundsException("Requested lenght " + i18 + " from offset " + i17 + " in buffer of size " + bArr.length);
        }
        throw new java.io.IOException("Stream closed");
    }

    public com.tencent.mars.zstd.ZstdInputStream setContinuous(boolean z17) {
        this.isContinuous = z17;
        return this;
    }

    public com.tencent.mars.zstd.ZstdInputStream setDict(byte[] bArr) {
        if (this.frameFinished) {
            this.dict = bArr;
            this.fastDict = null;
            return this;
        }
        throw new java.io.IOException("Change of parameter on initialized stream");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j17) {
        int read;
        if (this.isClosed) {
            throw new java.io.IOException("Stream closed");
        }
        if (j17 <= 0) {
            return 0L;
        }
        int min = (int) java.lang.Math.min(recommendedDOutSize(), j17);
        byte[] bArr = new byte[min];
        long j18 = j17;
        while (j18 > 0 && (read = read(bArr, 0, (int) java.lang.Math.min(min, j18))) >= 0) {
            j18 -= read;
        }
        return j17 - j18;
    }

    public com.tencent.mars.zstd.ZstdInputStream setDict(com.tencent.mars.zstd.ZstdDictDecompress zstdDictDecompress) {
        if (this.frameFinished) {
            this.fastDict = zstdDictDecompress;
            this.dict = null;
            return this;
        }
        throw new java.io.IOException("Change of parameter on initialized stream");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        byte[] bArr = new byte[1];
        int read = read(bArr, 0, 1);
        return read > 0 ? bArr[0] & 255 : read;
    }
}

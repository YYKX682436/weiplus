package com.tencent.mars.zstd;

/* loaded from: classes13.dex */
public class ZstdDirectBufferCompressingStream implements java.io.Closeable, java.io.Flushable {
    private int level;
    private final long stream;
    private java.nio.ByteBuffer target;
    private int consumed = 0;
    private int produced = 0;
    private boolean closed = false;
    private boolean initialized = false;
    private byte[] dict = null;
    private com.tencent.mars.zstd.ZstdDictCompress fastDict = null;

    public ZstdDirectBufferCompressingStream(java.nio.ByteBuffer byteBuffer, int i17) {
        this.target = byteBuffer;
        this.level = i17;
        if (!byteBuffer.isDirect()) {
            throw new java.lang.IllegalArgumentException("Target buffer should be a direct buffer");
        }
        this.stream = createCStream();
    }

    private native int compressDirectByteBuffer(long j17, java.nio.ByteBuffer byteBuffer, int i17, int i18, java.nio.ByteBuffer byteBuffer2, int i19, int i27);

    private static native long createCStream();

    private native int endStream(long j17, java.nio.ByteBuffer byteBuffer, int i17, int i18);

    private native int flushStream(long j17, java.nio.ByteBuffer byteBuffer, int i17, int i18);

    private static native int freeCStream(long j17);

    private native int initCStream(long j17, int i17);

    private native int initCStreamWithDict(long j17, byte[] bArr, int i17, int i18);

    private native int initCStreamWithFastDict(long j17, com.tencent.mars.zstd.ZstdDictCompress zstdDictCompress);

    private static native long recommendedCOutSize();

    public static int recommendedOutputBufferSize() {
        return (int) recommendedCOutSize();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
    
        if (r4.isDirect() == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        if (r3 <= 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        if (r10.target.hasRemaining() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        if (r3 > 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        throw new java.io.IOException("The target buffer has no more space, even after flushing, and there are still bytes to compress");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        throw new java.lang.IllegalArgumentException("Target buffer should be a direct buffer");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
    
        throw new java.io.IOException("Compression error: " + com.tencent.mars.zstd.Zstd.getErrorName(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0009, code lost:
    
        if (r10.initialized != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000b, code lost:
    
        r5 = r10.stream;
        r7 = r10.target;
        r3 = endStream(r5, r7, r7.position(), r10.target.remaining());
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (com.tencent.mars.zstd.Zstd.isError(r4) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        r4 = r10.target;
        r4.position(r4.position() + r10.produced);
        r4 = flushBuffer(r10.target);
        r10.target = r4;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() {
        /*
            r10 = this;
            boolean r0 = r10.closed
            if (r0 != 0) goto L91
            r0 = 0
            r1 = 0
            r2 = 1
            boolean r3 = r10.initialized     // Catch: java.lang.Throwable -> L84
            if (r3 == 0) goto L78
        Lb:
            long r5 = r10.stream     // Catch: java.lang.Throwable -> L84
            java.nio.ByteBuffer r7 = r10.target     // Catch: java.lang.Throwable -> L84
            int r8 = r7.position()     // Catch: java.lang.Throwable -> L84
            java.nio.ByteBuffer r3 = r10.target     // Catch: java.lang.Throwable -> L84
            int r9 = r3.remaining()     // Catch: java.lang.Throwable -> L84
            r4 = r10
            int r3 = r4.endStream(r5, r7, r8, r9)     // Catch: java.lang.Throwable -> L84
            long r4 = (long) r3     // Catch: java.lang.Throwable -> L84
            boolean r6 = com.tencent.mars.zstd.Zstd.isError(r4)     // Catch: java.lang.Throwable -> L84
            if (r6 != 0) goto L5d
            java.nio.ByteBuffer r4 = r10.target     // Catch: java.lang.Throwable -> L84
            int r5 = r4.position()     // Catch: java.lang.Throwable -> L84
            int r6 = r10.produced     // Catch: java.lang.Throwable -> L84
            int r5 = r5 + r6
            r4.position(r5)     // Catch: java.lang.Throwable -> L84
            java.nio.ByteBuffer r4 = r10.target     // Catch: java.lang.Throwable -> L84
            java.nio.ByteBuffer r4 = r10.flushBuffer(r4)     // Catch: java.lang.Throwable -> L84
            r10.target = r4     // Catch: java.lang.Throwable -> L84
            boolean r4 = r4.isDirect()     // Catch: java.lang.Throwable -> L84
            if (r4 == 0) goto L55
            if (r3 <= 0) goto L52
            java.nio.ByteBuffer r4 = r10.target     // Catch: java.lang.Throwable -> L84
            boolean r4 = r4.hasRemaining()     // Catch: java.lang.Throwable -> L84
            if (r4 == 0) goto L4a
            goto L52
        L4a:
            java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.Throwable -> L84
            java.lang.String r4 = "The target buffer has no more space, even after flushing, and there are still bytes to compress"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L84
            throw r3     // Catch: java.lang.Throwable -> L84
        L52:
            if (r3 > 0) goto Lb
            goto L78
        L55:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L84
            java.lang.String r4 = "Target buffer should be a direct buffer"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L84
            throw r3     // Catch: java.lang.Throwable -> L84
        L5d:
            java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.Throwable -> L84
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            r6.<init>()     // Catch: java.lang.Throwable -> L84
            java.lang.String r7 = "Compression error: "
            r6.append(r7)     // Catch: java.lang.Throwable -> L84
            java.lang.String r4 = com.tencent.mars.zstd.Zstd.getErrorName(r4)     // Catch: java.lang.Throwable -> L84
            r6.append(r4)     // Catch: java.lang.Throwable -> L84
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L84
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L84
            throw r3     // Catch: java.lang.Throwable -> L84
        L78:
            long r3 = r10.stream
            freeCStream(r3)
            r10.closed = r2
            r10.initialized = r1
            r10.target = r0
            goto L91
        L84:
            r3 = move-exception
            long r4 = r10.stream
            freeCStream(r4)
            r10.closed = r2
            r10.initialized = r1
            r10.target = r0
            throw r3
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mars.zstd.ZstdDirectBufferCompressingStream.close():void");
    }

    public void compress(java.nio.ByteBuffer byteBuffer) {
        int initCStreamWithDict;
        if (!byteBuffer.isDirect()) {
            throw new java.lang.IllegalArgumentException("Source buffer should be a direct buffer");
        }
        if (this.closed) {
            throw new java.io.IOException("Stream closed");
        }
        if (!this.initialized) {
            com.tencent.mars.zstd.ZstdDictCompress zstdDictCompress = this.fastDict;
            if (zstdDictCompress != null) {
                initCStreamWithDict = initCStreamWithFastDict(this.stream, zstdDictCompress);
            } else {
                byte[] bArr = this.dict;
                initCStreamWithDict = bArr != null ? initCStreamWithDict(this.stream, bArr, bArr.length, this.level) : initCStream(this.stream, this.level);
            }
            long j17 = initCStreamWithDict;
            if (com.tencent.mars.zstd.Zstd.isError(j17)) {
                throw new java.io.IOException("Compression error: cannot create header: " + com.tencent.mars.zstd.Zstd.getErrorName(j17));
            }
            this.initialized = true;
        }
        while (byteBuffer.hasRemaining()) {
            if (!this.target.hasRemaining()) {
                java.nio.ByteBuffer flushBuffer = flushBuffer(this.target);
                this.target = flushBuffer;
                if (!flushBuffer.isDirect()) {
                    throw new java.lang.IllegalArgumentException("Target buffer should be a direct buffer");
                }
                if (!this.target.hasRemaining()) {
                    throw new java.io.IOException("The target buffer has no more space, even after flushing, and there are still bytes to compress");
                }
            }
            long j18 = this.stream;
            java.nio.ByteBuffer byteBuffer2 = this.target;
            long compressDirectByteBuffer = compressDirectByteBuffer(j18, byteBuffer2, byteBuffer2.position(), this.target.remaining(), byteBuffer, byteBuffer.position(), byteBuffer.remaining());
            if (com.tencent.mars.zstd.Zstd.isError(compressDirectByteBuffer)) {
                throw new java.io.IOException("Compression error: " + com.tencent.mars.zstd.Zstd.getErrorName(compressDirectByteBuffer));
            }
            java.nio.ByteBuffer byteBuffer3 = this.target;
            byteBuffer3.position(byteBuffer3.position() + this.produced);
            byteBuffer.position(byteBuffer.position() + this.consumed);
        }
    }

    public void finalize() {
        close();
    }

    @Override // java.io.Flushable
    public void flush() {
        int flushStream;
        if (this.closed || !this.initialized) {
            return;
        }
        do {
            long j17 = this.stream;
            java.nio.ByteBuffer byteBuffer = this.target;
            flushStream = flushStream(j17, byteBuffer, byteBuffer.position(), this.target.remaining());
            long j18 = flushStream;
            if (com.tencent.mars.zstd.Zstd.isError(j18)) {
                throw new java.io.IOException("Compression error: " + com.tencent.mars.zstd.Zstd.getErrorName(j18));
            }
            java.nio.ByteBuffer byteBuffer2 = this.target;
            byteBuffer2.position(byteBuffer2.position() + this.produced);
            java.nio.ByteBuffer flushBuffer = flushBuffer(this.target);
            this.target = flushBuffer;
            if (!flushBuffer.isDirect()) {
                throw new java.lang.IllegalArgumentException("Target buffer should be a direct buffer");
            }
            if (flushStream > 0 && !this.target.hasRemaining()) {
                throw new java.io.IOException("The target buffer has no more space, even after flushing, and there are still bytes to compress");
            }
        } while (flushStream > 0);
    }

    public java.nio.ByteBuffer flushBuffer(java.nio.ByteBuffer byteBuffer) {
        return byteBuffer;
    }

    public com.tencent.mars.zstd.ZstdDirectBufferCompressingStream setDict(byte[] bArr) {
        if (!this.initialized) {
            this.dict = bArr;
            this.fastDict = null;
            return this;
        }
        throw new java.io.IOException("Change of parameter on initialized stream");
    }

    public com.tencent.mars.zstd.ZstdDirectBufferCompressingStream setDict(com.tencent.mars.zstd.ZstdDictCompress zstdDictCompress) {
        if (!this.initialized) {
            this.dict = null;
            this.fastDict = zstdDictCompress;
            return this;
        }
        throw new java.io.IOException("Change of parameter on initialized stream");
    }
}

package com.p314xaae8f345.p542x3306d5.p551x393369;

/* renamed from: com.tencent.mars.zstd.ZstdDirectBufferCompressingStream */
/* loaded from: classes13.dex */
public class C4618x3d263f4e implements java.io.Closeable, java.io.Flushable {

    /* renamed from: level */
    private int f19826x6219b84;

    /* renamed from: stream */
    private final long f19828xcad54f80;

    /* renamed from: target */
    private java.nio.ByteBuffer f19829xcb7e7191;

    /* renamed from: consumed */
    private int f19822xde2883e8 = 0;

    /* renamed from: produced */
    private int f19827xc42bcf84 = 0;

    /* renamed from: closed */
    private boolean f19821xaf15e16c = false;

    /* renamed from: initialized */
    private boolean f19825x498da6d4 = false;

    /* renamed from: dict */
    private byte[] f19823x2f0bb6 = null;

    /* renamed from: fastDict */
    private com.p314xaae8f345.p542x3306d5.p551x393369.C4615xd30f3b61 f19824x39b4ca32 = null;

    public C4618x3d263f4e(java.nio.ByteBuffer byteBuffer, int i17) {
        this.f19829xcb7e7191 = byteBuffer;
        this.f19826x6219b84 = i17;
        if (!byteBuffer.isDirect()) {
            throw new java.lang.IllegalArgumentException("Target buffer should be a direct buffer");
        }
        this.f19828xcad54f80 = m40681x8f2a4927();
    }

    /* renamed from: compressDirectByteBuffer */
    private native int m40680x9b058fb3(long j17, java.nio.ByteBuffer byteBuffer, int i17, int i18, java.nio.ByteBuffer byteBuffer2, int i19, int i27);

    /* renamed from: createCStream */
    private static native long m40681x8f2a4927();

    /* renamed from: endStream */
    private native int m40682x5fea743b(long j17, java.nio.ByteBuffer byteBuffer, int i17, int i18);

    /* renamed from: flushStream */
    private native int m40683xe14b23a4(long j17, java.nio.ByteBuffer byteBuffer, int i17, int i18);

    /* renamed from: freeCStream */
    private static native int m40684x325d5b7(long j17);

    /* renamed from: initCStream */
    private native int m40685x57f18693(long j17, int i17);

    /* renamed from: initCStreamWithDict */
    private native int m40686x9818054f(long j17, byte[] bArr, int i17, int i18);

    /* renamed from: initCStreamWithFastDict */
    private native int m40687x5ae54f4b(long j17, com.p314xaae8f345.p542x3306d5.p551x393369.C4615xd30f3b61 c4615xd30f3b61);

    /* renamed from: recommendedCOutSize */
    private static native long m40688xbf765607();

    /* renamed from: recommendedOutputBufferSize */
    public static int m40689xabfa3cbd() {
        return (int) m40688xbf765607();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
    
        if (r4.isDirect() == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        if (r3 <= 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        if (r10.f19829xcb7e7191.hasRemaining() == false) goto L31;
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
    
        throw new java.io.IOException("Compression error: " + com.p314xaae8f345.p542x3306d5.p551x393369.C4614x2aa789.m40662x130eedfd(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0009, code lost:
    
        if (r10.f19825x498da6d4 != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000b, code lost:
    
        r5 = r10.f19828xcad54f80;
        r7 = r10.f19829xcb7e7191;
        r3 = m40682x5fea743b(r5, r7, r7.position(), r10.f19829xcb7e7191.remaining());
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (com.p314xaae8f345.p542x3306d5.p551x393369.C4614x2aa789.m40663x7aad7efe(r4) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        r4 = r10.f19829xcb7e7191;
        r4.position(r4.position() + r10.f19827xc42bcf84);
        r4 = m40692xc4516864(r10.f19829xcb7e7191);
        r10.f19829xcb7e7191 = r4;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() {
        /*
            r10 = this;
            boolean r0 = r10.f19821xaf15e16c
            if (r0 != 0) goto L91
            r0 = 0
            r1 = 0
            r2 = 1
            boolean r3 = r10.f19825x498da6d4     // Catch: java.lang.Throwable -> L84
            if (r3 == 0) goto L78
        Lb:
            long r5 = r10.f19828xcad54f80     // Catch: java.lang.Throwable -> L84
            java.nio.ByteBuffer r7 = r10.f19829xcb7e7191     // Catch: java.lang.Throwable -> L84
            int r8 = r7.position()     // Catch: java.lang.Throwable -> L84
            java.nio.ByteBuffer r3 = r10.f19829xcb7e7191     // Catch: java.lang.Throwable -> L84
            int r9 = r3.remaining()     // Catch: java.lang.Throwable -> L84
            r4 = r10
            int r3 = r4.m40682x5fea743b(r5, r7, r8, r9)     // Catch: java.lang.Throwable -> L84
            long r4 = (long) r3     // Catch: java.lang.Throwable -> L84
            boolean r6 = com.p314xaae8f345.p542x3306d5.p551x393369.C4614x2aa789.m40663x7aad7efe(r4)     // Catch: java.lang.Throwable -> L84
            if (r6 != 0) goto L5d
            java.nio.ByteBuffer r4 = r10.f19829xcb7e7191     // Catch: java.lang.Throwable -> L84
            int r5 = r4.position()     // Catch: java.lang.Throwable -> L84
            int r6 = r10.f19827xc42bcf84     // Catch: java.lang.Throwable -> L84
            int r5 = r5 + r6
            r4.position(r5)     // Catch: java.lang.Throwable -> L84
            java.nio.ByteBuffer r4 = r10.f19829xcb7e7191     // Catch: java.lang.Throwable -> L84
            java.nio.ByteBuffer r4 = r10.m40692xc4516864(r4)     // Catch: java.lang.Throwable -> L84
            r10.f19829xcb7e7191 = r4     // Catch: java.lang.Throwable -> L84
            boolean r4 = r4.isDirect()     // Catch: java.lang.Throwable -> L84
            if (r4 == 0) goto L55
            if (r3 <= 0) goto L52
            java.nio.ByteBuffer r4 = r10.f19829xcb7e7191     // Catch: java.lang.Throwable -> L84
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
            java.lang.String r4 = com.p314xaae8f345.p542x3306d5.p551x393369.C4614x2aa789.m40662x130eedfd(r4)     // Catch: java.lang.Throwable -> L84
            r6.append(r4)     // Catch: java.lang.Throwable -> L84
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L84
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L84
            throw r3     // Catch: java.lang.Throwable -> L84
        L78:
            long r3 = r10.f19828xcad54f80
            m40684x325d5b7(r3)
            r10.f19821xaf15e16c = r2
            r10.f19825x498da6d4 = r1
            r10.f19829xcb7e7191 = r0
            goto L91
        L84:
            r3 = move-exception
            long r4 = r10.f19828xcad54f80
            m40684x325d5b7(r4)
            r10.f19821xaf15e16c = r2
            r10.f19825x498da6d4 = r1
            r10.f19829xcb7e7191 = r0
            throw r3
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p542x3306d5.p551x393369.C4618x3d263f4e.close():void");
    }

    /* renamed from: compress */
    public void m40690xdc47eb62(java.nio.ByteBuffer byteBuffer) {
        int m40686x9818054f;
        if (!byteBuffer.isDirect()) {
            throw new java.lang.IllegalArgumentException("Source buffer should be a direct buffer");
        }
        if (this.f19821xaf15e16c) {
            throw new java.io.IOException("Stream closed");
        }
        if (!this.f19825x498da6d4) {
            com.p314xaae8f345.p542x3306d5.p551x393369.C4615xd30f3b61 c4615xd30f3b61 = this.f19824x39b4ca32;
            if (c4615xd30f3b61 != null) {
                m40686x9818054f = m40687x5ae54f4b(this.f19828xcad54f80, c4615xd30f3b61);
            } else {
                byte[] bArr = this.f19823x2f0bb6;
                m40686x9818054f = bArr != null ? m40686x9818054f(this.f19828xcad54f80, bArr, bArr.length, this.f19826x6219b84) : m40685x57f18693(this.f19828xcad54f80, this.f19826x6219b84);
            }
            long j17 = m40686x9818054f;
            if (com.p314xaae8f345.p542x3306d5.p551x393369.C4614x2aa789.m40663x7aad7efe(j17)) {
                throw new java.io.IOException("Compression error: cannot create header: " + com.p314xaae8f345.p542x3306d5.p551x393369.C4614x2aa789.m40662x130eedfd(j17));
            }
            this.f19825x498da6d4 = true;
        }
        while (byteBuffer.hasRemaining()) {
            if (!this.f19829xcb7e7191.hasRemaining()) {
                java.nio.ByteBuffer m40692xc4516864 = m40692xc4516864(this.f19829xcb7e7191);
                this.f19829xcb7e7191 = m40692xc4516864;
                if (!m40692xc4516864.isDirect()) {
                    throw new java.lang.IllegalArgumentException("Target buffer should be a direct buffer");
                }
                if (!this.f19829xcb7e7191.hasRemaining()) {
                    throw new java.io.IOException("The target buffer has no more space, even after flushing, and there are still bytes to compress");
                }
            }
            long j18 = this.f19828xcad54f80;
            java.nio.ByteBuffer byteBuffer2 = this.f19829xcb7e7191;
            long m40680x9b058fb3 = m40680x9b058fb3(j18, byteBuffer2, byteBuffer2.position(), this.f19829xcb7e7191.remaining(), byteBuffer, byteBuffer.position(), byteBuffer.remaining());
            if (com.p314xaae8f345.p542x3306d5.p551x393369.C4614x2aa789.m40663x7aad7efe(m40680x9b058fb3)) {
                throw new java.io.IOException("Compression error: " + com.p314xaae8f345.p542x3306d5.p551x393369.C4614x2aa789.m40662x130eedfd(m40680x9b058fb3));
            }
            java.nio.ByteBuffer byteBuffer3 = this.f19829xcb7e7191;
            byteBuffer3.position(byteBuffer3.position() + this.f19827xc42bcf84);
            byteBuffer.position(byteBuffer.position() + this.f19822xde2883e8);
        }
    }

    /* renamed from: finalize */
    public void m40691xd764dc1e() {
        close();
    }

    @Override // java.io.Flushable
    public void flush() {
        int m40683xe14b23a4;
        if (this.f19821xaf15e16c || !this.f19825x498da6d4) {
            return;
        }
        do {
            long j17 = this.f19828xcad54f80;
            java.nio.ByteBuffer byteBuffer = this.f19829xcb7e7191;
            m40683xe14b23a4 = m40683xe14b23a4(j17, byteBuffer, byteBuffer.position(), this.f19829xcb7e7191.remaining());
            long j18 = m40683xe14b23a4;
            if (com.p314xaae8f345.p542x3306d5.p551x393369.C4614x2aa789.m40663x7aad7efe(j18)) {
                throw new java.io.IOException("Compression error: " + com.p314xaae8f345.p542x3306d5.p551x393369.C4614x2aa789.m40662x130eedfd(j18));
            }
            java.nio.ByteBuffer byteBuffer2 = this.f19829xcb7e7191;
            byteBuffer2.position(byteBuffer2.position() + this.f19827xc42bcf84);
            java.nio.ByteBuffer m40692xc4516864 = m40692xc4516864(this.f19829xcb7e7191);
            this.f19829xcb7e7191 = m40692xc4516864;
            if (!m40692xc4516864.isDirect()) {
                throw new java.lang.IllegalArgumentException("Target buffer should be a direct buffer");
            }
            if (m40683xe14b23a4 > 0 && !this.f19829xcb7e7191.hasRemaining()) {
                throw new java.io.IOException("The target buffer has no more space, even after flushing, and there are still bytes to compress");
            }
        } while (m40683xe14b23a4 > 0);
    }

    /* renamed from: flushBuffer */
    public java.nio.ByteBuffer m40692xc4516864(java.nio.ByteBuffer byteBuffer) {
        return byteBuffer;
    }

    /* renamed from: setDict */
    public com.p314xaae8f345.p542x3306d5.p551x393369.C4618x3d263f4e m40694x76493b38(byte[] bArr) {
        if (!this.f19825x498da6d4) {
            this.f19823x2f0bb6 = bArr;
            this.f19824x39b4ca32 = null;
            return this;
        }
        throw new java.io.IOException("Change of parameter on initialized stream");
    }

    /* renamed from: setDict */
    public com.p314xaae8f345.p542x3306d5.p551x393369.C4618x3d263f4e m40693x76493b38(com.p314xaae8f345.p542x3306d5.p551x393369.C4615xd30f3b61 c4615xd30f3b61) {
        if (!this.f19825x498da6d4) {
            this.f19823x2f0bb6 = null;
            this.f19824x39b4ca32 = c4615xd30f3b61;
            return this;
        }
        throw new java.io.IOException("Change of parameter on initialized stream");
    }
}

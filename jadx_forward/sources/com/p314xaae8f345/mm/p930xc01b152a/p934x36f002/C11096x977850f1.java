package com.p314xaae8f345.mm.p930xc01b152a.p934x36f002;

/* renamed from: com.tencent.mm.mm7zip.util.ByteArrayStream */
/* loaded from: classes12.dex */
public class C11096x977850f1 implements com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11038x35e1246e, com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11053x70861a25 {

    /* renamed from: INPUT_STREAM_READ_BUFFER_SIZE */
    private static final int f32519xd00944c1 = 16384;

    /* renamed from: MAX_CHUNK_SIZE */
    private static final int f32520x28a8488e = 1048576;

    /* renamed from: chunkList */
    private final java.util.List<byte[]> f32521x78e748ab;

    /* renamed from: currentChunkIndex */
    private int f32522xdc2768be;

    /* renamed from: currentPosition */
    private int f32523xb2e431c2;

    /* renamed from: currentPositionInChunk */
    private int f32524xac13dc26;

    /* renamed from: initialSize */
    private final int f32525x49836965;

    /* renamed from: maxSize */
    private final int f32526x324fa785;

    /* renamed from: seekToPosition */
    private int f32527x7732555c;

    /* renamed from: size */
    private int f32528x35e001;

    public C11096x977850f1(byte[] bArr, boolean z17, int i17) {
        this(1024, i17);
        m47809x52c98129(bArr, z17);
    }

    /* renamed from: allocateNextChunk */
    private void m47794x4fa76c7d(int i17) {
        int i18 = this.f32522xdc2768be;
        if (i18 == -1 || (i18 == this.f32521x78e748ab.size() - 1 && this.f32521x78e748ab.get(this.f32522xdc2768be).length == this.f32524xac13dc26)) {
            this.f32524xac13dc26 = 0;
            this.f32522xdc2768be++;
        }
        if (this.f32528x35e001 >= this.f32526x324fa785) {
            throw new java.lang.RuntimeException("Maximal size of the byte array stream was reached. (Max size = " + this.f32526x324fa785 + ")");
        }
        int size = this.f32521x78e748ab.size() - 1;
        int length = size == -1 ? this.f32525x49836965 : this.f32521x78e748ab.get(size).length << 1;
        if (length < 0 || length > 1048576) {
            length = 1048576;
        }
        int i19 = this.f32528x35e001;
        int i27 = i19 + length;
        int i28 = this.f32526x324fa785;
        if (i27 > i28) {
            length = i28 - i19;
        }
        if (i17 == -1 || length >= i17) {
            i17 = length;
        } else if (i19 + i17 >= i28) {
            throw new java.lang.RuntimeException("Maximal size of the byte array stream was reached. (Max size = " + this.f32526x324fa785 + ")");
        }
        this.f32521x78e748ab.add(new byte[i17]);
    }

    /* renamed from: endWriting */
    private void m47795x6d1b6b81() {
        if (this.f32528x35e001 == this.f32523xb2e431c2 && this.f32524xac13dc26 == 0) {
            int i17 = this.f32522xdc2768be;
            if (i17 == 0) {
                m47796x316510();
                return;
            }
            java.util.List<byte[]> list = this.f32521x78e748ab;
            this.f32522xdc2768be = i17 - 1;
            list.remove(i17);
            this.f32524xac13dc26 = this.f32521x78e748ab.get(this.f32522xdc2768be).length;
        }
    }

    /* renamed from: init */
    private void m47796x316510() {
        this.f32521x78e748ab.clear();
        this.f32523xb2e431c2 = 0;
        this.f32524xac13dc26 = 0;
        this.f32522xdc2768be = -1;
        this.f32528x35e001 = 0;
        this.f32527x7732555c = -1;
    }

    /* renamed from: performDelayedSeek */
    private void m47797x91d3cd9() {
        int i17 = this.f32527x7732555c;
        if (i17 == -1) {
            return;
        }
        if (this.f32523xb2e431c2 == i17) {
            this.f32527x7732555c = -1;
            return;
        }
        if (i17 > this.f32528x35e001) {
            m47798x76500f83(i17, true);
            this.f32527x7732555c = -1;
            return;
        }
        int i18 = 0;
        for (int i19 = 0; i19 < this.f32521x78e748ab.size(); i19++) {
            int length = this.f32521x78e748ab.get(i19).length;
            i18 += length;
            int i27 = this.f32527x7732555c;
            if (i18 > i27) {
                this.f32522xdc2768be = i19;
                this.f32524xac13dc26 = length - (i18 - i27);
                this.f32523xb2e431c2 = i27;
                this.f32527x7732555c = -1;
                return;
            }
        }
        int size = this.f32521x78e748ab.size() - 1;
        this.f32522xdc2768be = size;
        this.f32524xac13dc26 = this.f32521x78e748ab.get(size).length;
        this.f32523xb2e431c2 = this.f32528x35e001;
        this.f32527x7732555c = -1;
    }

    /* renamed from: startWriting */
    private void m47799x57887a1a() {
        int i17 = this.f32522xdc2768be;
        if (i17 == -1 || this.f32524xac13dc26 >= this.f32521x78e748ab.get(i17).length) {
            m47794x4fa76c7d(-1);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    /* renamed from: getBytes */
    public synchronized byte[] m47800x743b66b5() {
        byte[] bArr;
        bArr = new byte[this.f32528x35e001];
        int i17 = 0;
        for (byte[] bArr2 : this.f32521x78e748ab) {
            int length = bArr2.length + i17;
            int i18 = this.f32528x35e001;
            int length2 = length > i18 ? i18 - i17 : bArr2.length;
            java.lang.System.arraycopy(bArr2, 0, bArr, i17, length2);
            i17 += length2;
        }
        return bArr;
    }

    /* renamed from: getCurrentPosition */
    public synchronized int m47801x9746038c() {
        int i17 = this.f32527x7732555c;
        if (i17 != -1) {
            return i17;
        }
        return this.f32523xb2e431c2;
    }

    /* renamed from: getDetachedInputStream */
    public java.io.InputStream m47802x2fc0d1e2() {
        throw new java.lang.IllegalStateException("Not implemented");
    }

    /* renamed from: getInputStream */
    public java.io.InputStream m47803xc7995ab4() {
        throw new java.lang.IllegalStateException("Not implemented");
    }

    /* renamed from: getOutputStream */
    public java.io.OutputStream m47804x592d6257() {
        throw new java.lang.IllegalStateException("Not implemented");
    }

    /* renamed from: getSize */
    public synchronized int m47805xfb854877() {
        return this.f32528x35e001;
    }

    /* renamed from: isEOF */
    public synchronized boolean m47806x5fcf772() {
        return m47801x9746038c() >= this.f32528x35e001;
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11059x8bb0b4d
    /* renamed from: read */
    public int mo47634x355996(byte[] bArr) {
        return m47807x355996(bArr, 0, bArr.length);
    }

    /* renamed from: rewind */
    public synchronized void m47808xc84f6cbb() {
        this.f32527x7732555c = 0;
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11058xd0ed169b
    /* renamed from: seek */
    public synchronized long mo47633x35ce78(long j17, int i17) {
        int i18;
        try {
            if (i17 != 0) {
                if (i17 == 1) {
                    i18 = this.f32527x7732555c;
                    if (i18 == -1) {
                        i18 = this.f32523xb2e431c2;
                    }
                } else {
                    if (i17 != 2) {
                        throw new com.p314xaae8f345.mm.p930xc01b152a.C11078x9fb4b6bb("Seek: unknown origin: " + i17);
                    }
                    i18 = this.f32528x35e001;
                }
                j17 += i18;
            }
            if (j17 > this.f32526x324fa785) {
                throw new java.lang.RuntimeException("Maximal size of the byte array stream was reached by seek to " + j17 + ", maximal size is " + this.f32526x324fa785 + " bytes");
            }
            this.f32527x7732555c = (int) j17;
        } catch (java.lang.Throwable th6) {
            throw th6;
        }
        return j17;
    }

    /* renamed from: setBytes */
    public synchronized void m47809x52c98129(byte[] bArr, boolean z17) {
        m47796x316510();
        int length = bArr.length;
        if (z17) {
            byte[] bArr2 = new byte[length];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, length);
            bArr = bArr2;
        }
        this.f32521x78e748ab.add(bArr);
        this.f32522xdc2768be = 0;
        this.f32523xb2e431c2 = 0;
        this.f32524xac13dc26 = 0;
        this.f32528x35e001 = length;
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11053x70861a25
    /* renamed from: setSize */
    public synchronized void mo47628x76500f83(long j17) {
        m47798x76500f83(j17, false);
    }

    /* renamed from: truncate */
    public synchronized void m47810x6e724d66() {
        m47796x316510();
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11060xf8e90f26
    /* renamed from: write */
    public int mo47635x6c257df(byte[] bArr) {
        return m47811x6c257df(bArr, 0, bArr.length);
    }

    /* renamed from: writeFromInputStream */
    public synchronized void m47812x96d7dc01(java.io.InputStream inputStream, boolean z17) {
        m47797x91d3cd9();
        if (this.f32528x35e001 == 0) {
            m47796x316510();
            int available = inputStream.available();
            if (available > this.f32526x324fa785) {
                throw new java.lang.RuntimeException("Maximal size of the byte array stream was reached. (Max size = " + this.f32526x324fa785 + ")");
            }
            if (available > this.f32525x49836965) {
                byte[] bArr = new byte[available];
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return;
                }
                this.f32528x35e001 = read;
                this.f32523xb2e431c2 = read;
                this.f32524xac13dc26 = read;
                this.f32522xdc2768be = 0;
                this.f32521x78e748ab.add(bArr);
            }
            m47799x57887a1a();
            while (true) {
                byte[] bArr2 = this.f32521x78e748ab.get(this.f32522xdc2768be);
                int i17 = this.f32524xac13dc26;
                int read2 = inputStream.read(bArr2, i17, bArr2.length - i17);
                if (read2 == -1) {
                    break;
                }
                this.f32523xb2e431c2 += read2;
                int i18 = this.f32524xac13dc26 + read2;
                this.f32524xac13dc26 = i18;
                if (bArr2.length - i18 == 0) {
                    m47794x4fa76c7d(-1);
                }
            }
            this.f32528x35e001 = this.f32523xb2e431c2;
            m47795x6d1b6b81();
        } else {
            byte[] bArr3 = new byte[16384];
            while (true) {
                int read3 = inputStream.read(bArr3);
                if (read3 == -1) {
                    break;
                } else {
                    m47811x6c257df(bArr3, 0, read3);
                }
            }
        }
        if (z17) {
            inputStream.close();
        }
    }

    /* renamed from: writeToOutputStream */
    public synchronized void m47813x6c1bc3bb(java.io.OutputStream outputStream, boolean z17) {
        try {
            int i17 = 0;
            for (byte[] bArr : this.f32521x78e748ab) {
                int length = bArr.length + i17;
                int i18 = this.f32528x35e001;
                int length2 = length > i18 ? i18 - i17 : bArr.length;
                outputStream.write(bArr, 0, length2);
                i17 += length2;
            }
            if (z17) {
                try {
                    outputStream.close();
                } catch (java.lang.Exception unused) {
                }
            }
        } catch (java.lang.Throwable th6) {
            if (z17) {
                try {
                    outputStream.close();
                } catch (java.lang.Exception unused2) {
                }
            }
            throw th6;
        }
    }

    /* renamed from: read */
    public synchronized int m47807x355996(byte[] bArr, int i17, int i18) {
        if (i17 >= 0 && i18 >= 0) {
            if (bArr.length >= i17 + i18) {
                if (this.f32527x7732555c > this.f32528x35e001) {
                    return 0;
                }
                m47797x91d3cd9();
                int i19 = this.f32523xb2e431c2;
                int i27 = i19 + i18;
                int i28 = this.f32528x35e001;
                if (i27 > i28) {
                    i18 = i28 - i19;
                }
                int i29 = i18;
                while (i29 > 0) {
                    int length = this.f32521x78e748ab.get(this.f32522xdc2768be).length;
                    int i37 = length - this.f32524xac13dc26;
                    if (i29 <= i37) {
                        i37 = i29;
                    }
                    java.lang.System.arraycopy(this.f32521x78e748ab.get(this.f32522xdc2768be), this.f32524xac13dc26, bArr, i17, i37);
                    i17 += i37;
                    int i38 = this.f32524xac13dc26 + i37;
                    this.f32524xac13dc26 = i38;
                    i29 -= i37;
                    if (i38 >= length && this.f32522xdc2768be < this.f32521x78e748ab.size() - 1) {
                        int i39 = this.f32522xdc2768be + 1;
                        this.f32522xdc2768be = i39;
                        this.f32524xac13dc26 = 0;
                        int length2 = this.f32521x78e748ab.get(i39).length;
                    }
                }
                this.f32523xb2e431c2 += i18;
                return i18;
            }
        }
        throw new java.lang.IllegalStateException("Invalid start position (" + i17 + ") and length (" + i18 + ")");
    }

    /* renamed from: write */
    public synchronized int m47811x6c257df(byte[] bArr, int i17, int i18) {
        if (i17 >= 0 && i18 >= 0) {
            if (bArr.length >= i17 + i18) {
                if (i18 == 0) {
                    return 0;
                }
                m47797x91d3cd9();
                m47799x57887a1a();
                do {
                    byte[] bArr2 = this.f32521x78e748ab.get(this.f32522xdc2768be);
                    int length = bArr2.length;
                    int i19 = this.f32524xac13dc26;
                    int i27 = length - i19;
                    if (i27 >= i18) {
                        i27 = i18;
                    }
                    java.lang.System.arraycopy(bArr, i17, bArr2, i19, i27);
                    int i28 = this.f32524xac13dc26 + i27;
                    this.f32524xac13dc26 = i28;
                    this.f32523xb2e431c2 += i27;
                    i17 += i27;
                    i18 -= i27;
                    if (i28 >= bArr2.length) {
                        this.f32524xac13dc26 = 0;
                        int i29 = this.f32522xdc2768be + 1;
                        this.f32522xdc2768be = i29;
                        if (i29 >= this.f32521x78e748ab.size()) {
                            m47794x4fa76c7d(-1);
                        }
                    }
                } while (i18 > 0);
                int i37 = this.f32523xb2e431c2;
                if (i37 > this.f32528x35e001) {
                    this.f32528x35e001 = i37;
                }
                m47795x6d1b6b81();
                return bArr.length;
            }
        }
        throw new java.lang.IllegalStateException("Invalid start position (" + i17 + ") and length (" + i18 + ")");
    }

    public C11096x977850f1(byte[] bArr, boolean z17) {
        this(1024 > bArr.length ? bArr.length : 1024, bArr.length);
        m47809x52c98129(bArr, z17);
    }

    /* renamed from: setSize */
    private synchronized void m47798x76500f83(long j17, boolean z17) {
        if (j17 == 0) {
            m47810x6e724d66();
            return;
        }
        if (j17 <= this.f32526x324fa785) {
            int i17 = this.f32528x35e001;
            if (j17 > i17) {
                if (i17 == 0) {
                    int i18 = (int) j17;
                    this.f32521x78e748ab.add(new byte[i18]);
                    this.f32522xdc2768be = 0;
                    this.f32528x35e001 = i18;
                }
                int i19 = (int) (j17 - this.f32528x35e001);
                int i27 = 0;
                for (int i28 = 0; i28 < this.f32521x78e748ab.size(); i28++) {
                    i27 += this.f32521x78e748ab.get(i28).length;
                }
                int i29 = this.f32528x35e001;
                int i37 = i27 - i29;
                if (i37 < i19) {
                    this.f32528x35e001 = i29 + i37;
                    int i38 = i19 - i37;
                    m47794x4fa76c7d(i38);
                    if (z17) {
                        this.f32524xac13dc26 = i38;
                    }
                } else if (z17) {
                    this.f32524xac13dc26 = (this.f32521x78e748ab.get(r1.size() - 1).length - i37) + i19;
                }
                if (z17) {
                    this.f32522xdc2768be = this.f32521x78e748ab.size() - 1;
                    this.f32523xb2e431c2 = (int) j17;
                }
                this.f32528x35e001 = (int) j17;
            }
            if (j17 < this.f32528x35e001) {
                int i39 = 0;
                for (int i47 = 0; i47 < this.f32521x78e748ab.size(); i47++) {
                    i39 += this.f32521x78e748ab.get(i47).length;
                    if (i39 >= j17) {
                        for (int size = this.f32521x78e748ab.size() - 1; size > i47; size--) {
                            this.f32521x78e748ab.remove(size);
                        }
                        int i48 = this.f32527x7732555c;
                        if (i48 != -1 && i48 > j17) {
                            this.f32527x7732555c = (int) j17;
                        } else if (this.f32523xb2e431c2 > j17) {
                            int i49 = (int) j17;
                            this.f32523xb2e431c2 = i49;
                            this.f32524xac13dc26 = (i49 - i39) + this.f32521x78e748ab.get(i47).length;
                            this.f32522xdc2768be = i47;
                        }
                        this.f32528x35e001 = (int) j17;
                    }
                }
            }
            return;
        }
        throw new java.lang.RuntimeException("Maximal size of the byte array stream was reached by setSize(" + j17 + "). Maximal size is " + this.f32526x324fa785 + " bytes");
    }

    public C11096x977850f1(int i17) {
        this(1024, i17);
    }

    public C11096x977850f1(int i17, int i18) {
        this.f32521x78e748ab = new java.util.ArrayList();
        this.f32525x49836965 = i17;
        if (i18 < 0) {
            throw new java.lang.IllegalStateException("Maximal size of the byte array stream should be >0");
        }
        if (i17 >= 0) {
            this.f32526x324fa785 = i18;
            m47796x316510();
            return;
        }
        throw new java.lang.IllegalStateException("Initial size of the byte array stream should be >0");
    }
}

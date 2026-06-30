package com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.p599xe9faa8c5;

/* renamed from: com.tencent.midas.comm.log.util.compressor.GzipCompressorOutputStream */
/* loaded from: classes13.dex */
public class C4774xd002df60 extends java.io.OutputStream {

    /* renamed from: closed */
    private boolean f20388xaf15e16c;
    private final java.io.OutputStream out;

    /* renamed from: deflateBuffer */
    private final byte[] f20389x2c6c004b = new byte[512];
    private final java.util.zip.CRC32 crc = new java.util.zip.CRC32();

    /* renamed from: _header */
    private final byte[] f20387x58a4dfac = {31, -117, 8, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: deflater */
    private final java.util.zip.Deflater f20390x26f8f9a7 = new java.util.zip.Deflater(-1, true);

    public C4774xd002df60(java.io.OutputStream outputStream) {
        this.out = outputStream;
    }

    /* renamed from: deflate */
    private void m41745x5c188c2b() {
        java.util.zip.Deflater deflater = this.f20390x26f8f9a7;
        byte[] bArr = this.f20389x2c6c004b;
        int deflate = deflater.deflate(bArr, 0, bArr.length);
        if (deflate > 0) {
            this.out.write(this.f20389x2c6c004b, 0, deflate);
        }
    }

    /* renamed from: writeTrailer */
    private void m41746x62000c54() {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(8);
        allocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        allocate.putInt((int) this.crc.getValue());
        allocate.putInt(this.f20390x26f8f9a7.getTotalIn());
        this.out.write(allocate.array());
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f20388xaf15e16c) {
            return;
        }
        m41748xb4098c93();
        this.f20390x26f8f9a7.end();
        this.out.close();
        this.f20388xaf15e16c = true;
    }

    /* renamed from: continued */
    public void m41747xe7f4689d() {
        this.crc.reset();
        this.f20390x26f8f9a7.reset();
    }

    /* renamed from: finish */
    public void m41748xb4098c93() {
        if (this.f20390x26f8f9a7.finished()) {
            return;
        }
        this.f20390x26f8f9a7.finish();
        while (!this.f20390x26f8f9a7.finished()) {
            m41745x5c188c2b();
        }
        m41746x62000c54();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.out.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i17) {
        write(new byte[]{(byte) (i17 & 255)}, 0, 1);
    }

    /* renamed from: writeHeader */
    public void m41749x408c834c() {
        this.out.write(this.f20387x58a4dfac);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i17, int i18) {
        if (this.f20390x26f8f9a7.finished()) {
            throw new java.io.IOException("Cannot write more data, the end of the compressed data stream has been reached");
        }
        if (i18 > 0) {
            this.f20390x26f8f9a7.setInput(bArr, i17, i18);
            while (!this.f20390x26f8f9a7.needsInput()) {
                m41745x5c188c2b();
            }
            this.crc.update(bArr, i17, i18);
        }
    }
}

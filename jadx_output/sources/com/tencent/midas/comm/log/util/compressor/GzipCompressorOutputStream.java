package com.tencent.midas.comm.log.util.compressor;

/* loaded from: classes13.dex */
public class GzipCompressorOutputStream extends java.io.OutputStream {
    private boolean closed;
    private final java.io.OutputStream out;
    private final byte[] deflateBuffer = new byte[512];
    private final java.util.zip.CRC32 crc = new java.util.zip.CRC32();
    private final byte[] _header = {31, -117, 8, 0, 0, 0, 0, 0, 0, 0};
    private final java.util.zip.Deflater deflater = new java.util.zip.Deflater(-1, true);

    public GzipCompressorOutputStream(java.io.OutputStream outputStream) {
        this.out = outputStream;
    }

    private void deflate() {
        java.util.zip.Deflater deflater = this.deflater;
        byte[] bArr = this.deflateBuffer;
        int deflate = deflater.deflate(bArr, 0, bArr.length);
        if (deflate > 0) {
            this.out.write(this.deflateBuffer, 0, deflate);
        }
    }

    private void writeTrailer() {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(8);
        allocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        allocate.putInt((int) this.crc.getValue());
        allocate.putInt(this.deflater.getTotalIn());
        this.out.write(allocate.array());
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        finish();
        this.deflater.end();
        this.out.close();
        this.closed = true;
    }

    public void continued() {
        this.crc.reset();
        this.deflater.reset();
    }

    public void finish() {
        if (this.deflater.finished()) {
            return;
        }
        this.deflater.finish();
        while (!this.deflater.finished()) {
            deflate();
        }
        writeTrailer();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.out.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i17) {
        write(new byte[]{(byte) (i17 & 255)}, 0, 1);
    }

    public void writeHeader() {
        this.out.write(this._header);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i17, int i18) {
        if (this.deflater.finished()) {
            throw new java.io.IOException("Cannot write more data, the end of the compressed data stream has been reached");
        }
        if (i18 > 0) {
            this.deflater.setInput(bArr, i17, i18);
            while (!this.deflater.needsInput()) {
                deflate();
            }
            this.crc.update(bArr, i17, i18);
        }
    }
}

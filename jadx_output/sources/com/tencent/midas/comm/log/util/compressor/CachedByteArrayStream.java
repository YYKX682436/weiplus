package com.tencent.midas.comm.log.util.compressor;

/* loaded from: classes13.dex */
public class CachedByteArrayStream extends java.io.OutputStream {
    private final int BUFFER_SIZE;
    private final byte[] _bytes;
    protected byte[] buf;
    protected int count;

    public CachedByteArrayStream() {
        this.BUFFER_SIZE = 512;
        byte[] bArr = new byte[512];
        this._bytes = bArr;
        this.buf = bArr;
    }

    private static void checkOffsetAndCount(int i17, int i18, int i19) {
        if ((i18 | i19) < 0 || i18 > i17 || i17 - i18 < i19) {
            throw new java.lang.ArrayIndexOutOfBoundsException("arrayLength: " + i17 + ", offset: " + i18 + ", count: " + i19);
        }
    }

    private void expand(int i17) {
        int i18 = this.count;
        int i19 = i18 + i17;
        byte[] bArr = this.buf;
        if (i19 <= bArr.length) {
            return;
        }
        byte[] bArr2 = new byte[(i17 + i18) * 2];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, i18);
        this.buf = bArr2;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
    }

    public synchronized void reset() {
        this.buf = this._bytes;
        this.count = 0;
    }

    public int size() {
        return this.count;
    }

    public synchronized byte[] toByteArray() {
        byte[] bArr;
        int i17 = this.count;
        bArr = new byte[i17];
        java.lang.System.arraycopy(this.buf, 0, bArr, 0, i17);
        return bArr;
    }

    public java.lang.String toString() {
        return new java.lang.String(this.buf, 0, this.count);
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr, int i17, int i18) {
        checkOffsetAndCount(bArr.length, i17, i18);
        if (i18 == 0) {
            return;
        }
        expand(i18);
        java.lang.System.arraycopy(bArr, i17, this.buf, this.count, i18);
        this.count += i18;
    }

    public synchronized void writeTo(java.io.OutputStream outputStream) {
        outputStream.write(this.buf, 0, this.count);
    }

    @java.lang.Deprecated
    public java.lang.String toString(int i17) {
        int size = size();
        char[] cArr = new char[size];
        for (int i18 = 0; i18 < size; i18++) {
            cArr[i18] = (char) (((i17 & 255) << 8) | (this.buf[i18] & 255));
        }
        return new java.lang.String(cArr);
    }

    public CachedByteArrayStream(int i17) {
        this.BUFFER_SIZE = 512;
        this._bytes = new byte[512];
        if (i17 >= 0) {
            this.buf = new byte[i17];
            return;
        }
        throw new java.lang.IllegalArgumentException("size < 0");
    }

    public java.lang.String toString(java.lang.String str) {
        return new java.lang.String(this.buf, 0, this.count, str);
    }

    @Override // java.io.OutputStream
    public synchronized void write(int i17) {
        if (this.count == this.buf.length) {
            expand(1);
        }
        byte[] bArr = this.buf;
        int i18 = this.count;
        this.count = i18 + 1;
        bArr[i18] = (byte) i17;
    }
}

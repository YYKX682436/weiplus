package com.p166x1da19ac6.p168x5890096f;

/* loaded from: classes13.dex */
public class i implements com.p166x1da19ac6.p168x5890096f.g {

    /* renamed from: d, reason: collision with root package name */
    public java.io.InputStream f125569d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.zip.ZipEntry f125570e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.zip.ZipFile f125571f;

    /* renamed from: g, reason: collision with root package name */
    public final long f125572g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f125573h = true;

    /* renamed from: i, reason: collision with root package name */
    public long f125574i = 0;

    public i(java.util.zip.ZipFile zipFile, java.util.zip.ZipEntry zipEntry) {
        this.f125571f = zipFile;
        this.f125570e = zipEntry;
        this.f125572g = zipEntry.getSize();
        java.io.InputStream inputStream = zipFile.getInputStream(zipEntry);
        this.f125569d = inputStream;
        if (inputStream != null) {
            return;
        }
        throw new java.io.IOException(zipEntry.getName() + "'s InputStream is null");
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        java.io.InputStream inputStream = this.f125569d;
        if (inputStream != null) {
            inputStream.close();
            this.f125573h = false;
        }
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f125573h;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(java.nio.ByteBuffer byteBuffer) {
        return s(byteBuffer, this.f125574i);
    }

    @Override // com.p166x1da19ac6.p168x5890096f.g
    public int s(java.nio.ByteBuffer byteBuffer, long j17) {
        if (this.f125569d == null) {
            throw new java.io.IOException("InputStream is null");
        }
        int remaining = byteBuffer.remaining();
        long j18 = this.f125572g;
        long j19 = j18 - j17;
        if (j19 <= 0) {
            return -1;
        }
        int i17 = (int) j19;
        if (remaining > i17) {
            remaining = i17;
        }
        java.io.InputStream inputStream = this.f125569d;
        java.util.zip.ZipEntry zipEntry = this.f125570e;
        if (inputStream == null) {
            throw new java.io.IOException(zipEntry.getName() + "'s InputStream is null");
        }
        long j27 = this.f125574i;
        if (j17 != j27) {
            if (j17 > j18) {
                j17 = j18;
            }
            if (j17 >= j27) {
                inputStream.skip(j17 - j27);
            } else {
                inputStream.close();
                java.io.InputStream inputStream2 = this.f125571f.getInputStream(zipEntry);
                this.f125569d = inputStream2;
                if (inputStream2 == null) {
                    throw new java.io.IOException(zipEntry.getName() + "'s InputStream is null");
                }
                inputStream2.skip(j17);
            }
            this.f125574i = j17;
        }
        if (byteBuffer.hasArray()) {
            this.f125569d.read(byteBuffer.array(), 0, remaining);
            byteBuffer.position(byteBuffer.position() + remaining);
        } else {
            byte[] bArr = new byte[remaining];
            this.f125569d.read(bArr, 0, remaining);
            byteBuffer.put(bArr, 0, remaining);
        }
        this.f125574i += remaining;
        return remaining;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(java.nio.ByteBuffer byteBuffer) {
        throw new java.lang.UnsupportedOperationException("ElfZipFileChannel doesn't support write");
    }
}

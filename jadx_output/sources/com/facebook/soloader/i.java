package com.facebook.soloader;

/* loaded from: classes13.dex */
public class i implements com.facebook.soloader.g {

    /* renamed from: d, reason: collision with root package name */
    public java.io.InputStream f44036d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.zip.ZipEntry f44037e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.zip.ZipFile f44038f;

    /* renamed from: g, reason: collision with root package name */
    public final long f44039g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f44040h = true;

    /* renamed from: i, reason: collision with root package name */
    public long f44041i = 0;

    public i(java.util.zip.ZipFile zipFile, java.util.zip.ZipEntry zipEntry) {
        this.f44038f = zipFile;
        this.f44037e = zipEntry;
        this.f44039g = zipEntry.getSize();
        java.io.InputStream inputStream = zipFile.getInputStream(zipEntry);
        this.f44036d = inputStream;
        if (inputStream != null) {
            return;
        }
        throw new java.io.IOException(zipEntry.getName() + "'s InputStream is null");
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        java.io.InputStream inputStream = this.f44036d;
        if (inputStream != null) {
            inputStream.close();
            this.f44040h = false;
        }
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f44040h;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(java.nio.ByteBuffer byteBuffer) {
        return s(byteBuffer, this.f44041i);
    }

    @Override // com.facebook.soloader.g
    public int s(java.nio.ByteBuffer byteBuffer, long j17) {
        if (this.f44036d == null) {
            throw new java.io.IOException("InputStream is null");
        }
        int remaining = byteBuffer.remaining();
        long j18 = this.f44039g;
        long j19 = j18 - j17;
        if (j19 <= 0) {
            return -1;
        }
        int i17 = (int) j19;
        if (remaining > i17) {
            remaining = i17;
        }
        java.io.InputStream inputStream = this.f44036d;
        java.util.zip.ZipEntry zipEntry = this.f44037e;
        if (inputStream == null) {
            throw new java.io.IOException(zipEntry.getName() + "'s InputStream is null");
        }
        long j27 = this.f44041i;
        if (j17 != j27) {
            if (j17 > j18) {
                j17 = j18;
            }
            if (j17 >= j27) {
                inputStream.skip(j17 - j27);
            } else {
                inputStream.close();
                java.io.InputStream inputStream2 = this.f44038f.getInputStream(zipEntry);
                this.f44036d = inputStream2;
                if (inputStream2 == null) {
                    throw new java.io.IOException(zipEntry.getName() + "'s InputStream is null");
                }
                inputStream2.skip(j17);
            }
            this.f44041i = j17;
        }
        if (byteBuffer.hasArray()) {
            this.f44036d.read(byteBuffer.array(), 0, remaining);
            byteBuffer.position(byteBuffer.position() + remaining);
        } else {
            byte[] bArr = new byte[remaining];
            this.f44036d.read(bArr, 0, remaining);
            byteBuffer.put(bArr, 0, remaining);
        }
        this.f44041i += remaining;
        return remaining;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(java.nio.ByteBuffer byteBuffer) {
        throw new java.lang.UnsupportedOperationException("ElfZipFileChannel doesn't support write");
    }
}

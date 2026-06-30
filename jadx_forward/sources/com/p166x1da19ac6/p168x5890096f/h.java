package com.p166x1da19ac6.p168x5890096f;

/* loaded from: classes13.dex */
public class h implements com.p166x1da19ac6.p168x5890096f.g {

    /* renamed from: d, reason: collision with root package name */
    public final java.io.File f125565d;

    /* renamed from: e, reason: collision with root package name */
    public java.io.FileInputStream f125566e;

    /* renamed from: f, reason: collision with root package name */
    public java.nio.channels.FileChannel f125567f;

    public h(java.io.File file) {
        this.f125565d = file;
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
        this.f125566e = fileInputStream;
        this.f125567f = fileInputStream.getChannel();
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f125566e.close();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f125567f.isOpen();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(java.nio.ByteBuffer byteBuffer) {
        return this.f125567f.read(byteBuffer);
    }

    @Override // com.p166x1da19ac6.p168x5890096f.g
    public int s(java.nio.ByteBuffer byteBuffer, long j17) {
        return this.f125567f.read(byteBuffer, j17);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(java.nio.ByteBuffer byteBuffer) {
        return this.f125567f.write(byteBuffer);
    }
}

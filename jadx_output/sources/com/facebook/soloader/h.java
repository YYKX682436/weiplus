package com.facebook.soloader;

/* loaded from: classes13.dex */
public class h implements com.facebook.soloader.g {

    /* renamed from: d, reason: collision with root package name */
    public final java.io.File f44032d;

    /* renamed from: e, reason: collision with root package name */
    public java.io.FileInputStream f44033e;

    /* renamed from: f, reason: collision with root package name */
    public java.nio.channels.FileChannel f44034f;

    public h(java.io.File file) {
        this.f44032d = file;
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
        this.f44033e = fileInputStream;
        this.f44034f = fileInputStream.getChannel();
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f44033e.close();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f44034f.isOpen();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(java.nio.ByteBuffer byteBuffer) {
        return this.f44034f.read(byteBuffer);
    }

    @Override // com.facebook.soloader.g
    public int s(java.nio.ByteBuffer byteBuffer, long j17) {
        return this.f44034f.read(byteBuffer, j17);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(java.nio.ByteBuffer byteBuffer) {
        return this.f44034f.write(byteBuffer);
    }
}

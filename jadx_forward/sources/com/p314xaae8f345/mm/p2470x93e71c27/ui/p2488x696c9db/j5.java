package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes7.dex */
public final class j5 extends java.io.InputStream {

    /* renamed from: d, reason: collision with root package name */
    public final java.io.InputStream f273266d;

    /* renamed from: e, reason: collision with root package name */
    public final java.io.InputStream f273267e;

    public j5(java.io.InputStream first, java.io.InputStream second) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(first, "first");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(second, "second");
        this.f273266d = first;
        this.f273267e = second;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f273266d.available() + this.f273267e.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f273266d.close();
        this.f273267e.close();
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i17) {
        this.f273266d.mark(i17);
        this.f273267e.mark(i17 - this.f273266d.available());
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public int read() {
        int read = this.f273266d.read();
        return read != -1 ? read : this.f273267e.read();
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f273266d.reset();
        this.f273267e.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j17) {
        long skip = this.f273266d.skip(j17);
        return skip < j17 ? skip + this.f273267e.skip(j17 - skip) : skip;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        if (bArr != null) {
            return read(bArr, 0, bArr.length);
        }
        return 0;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i17, int i18) {
        if (bArr == null) {
            return 0;
        }
        int read = this.f273266d.read(bArr, i17, i18);
        int i19 = read != -1 ? read : 0;
        if (i19 >= i18) {
            return i19;
        }
        int read2 = this.f273267e.read(bArr, i17 + i19, i18 - i19);
        if (read2 == -1) {
            return -1;
        }
        return i19 + read2;
    }
}

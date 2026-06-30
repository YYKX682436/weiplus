package com.google.protobuf;

/* loaded from: classes13.dex */
public final class d extends java.io.FilterInputStream {

    /* renamed from: d, reason: collision with root package name */
    public int f44990d;

    public d(java.io.InputStream inputStream, int i17) {
        super(inputStream);
        this.f44990d = i17;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return java.lang.Math.min(super.available(), this.f44990d);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        if (this.f44990d <= 0) {
            return -1;
        }
        int read = super.read();
        if (read >= 0) {
            this.f44990d--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j17) {
        long skip = super.skip(java.lang.Math.min(j17, this.f44990d));
        if (skip >= 0) {
            this.f44990d = (int) (this.f44990d - skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i17, int i18) {
        int i19 = this.f44990d;
        if (i19 <= 0) {
            return -1;
        }
        int read = super.read(bArr, i17, java.lang.Math.min(i18, i19));
        if (read >= 0) {
            this.f44990d -= read;
        }
        return read;
    }
}

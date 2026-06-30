package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes13.dex */
public final class d extends java.io.FilterInputStream {

    /* renamed from: d, reason: collision with root package name */
    public int f126523d;

    public d(java.io.InputStream inputStream, int i17) {
        super(inputStream);
        this.f126523d = i17;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return java.lang.Math.min(super.available(), this.f126523d);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        if (this.f126523d <= 0) {
            return -1;
        }
        int read = super.read();
        if (read >= 0) {
            this.f126523d--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j17) {
        long skip = super.skip(java.lang.Math.min(j17, this.f126523d));
        if (skip >= 0) {
            this.f126523d = (int) (this.f126523d - skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i17, int i18) {
        int i19 = this.f126523d;
        if (i19 <= 0) {
            return -1;
        }
        int read = super.read(bArr, i17, java.lang.Math.min(i18, i19));
        if (read >= 0) {
            this.f126523d -= read;
        }
        return read;
    }
}

package u6;

/* loaded from: classes13.dex */
public final class k extends java.io.FilterInputStream {

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f506383f = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* renamed from: g, reason: collision with root package name */
    public static final int f506384g = 31;

    /* renamed from: d, reason: collision with root package name */
    public final byte f506385d;

    /* renamed from: e, reason: collision with root package name */
    public int f506386e;

    public k(java.io.InputStream inputStream, int i17) {
        super(inputStream);
        if (i17 >= -1 && i17 <= 8) {
            this.f506385d = (byte) i17;
        } else {
            throw new java.lang.IllegalArgumentException("Cannot add invalid orientation: " + i17);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i17) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int read;
        int i17;
        int i18 = this.f506386e;
        if (i18 < 2 || i18 > (i17 = f506384g)) {
            read = super.read();
        } else if (i18 == i17) {
            read = this.f506385d;
        } else {
            read = f506383f[i18 - 2] & 255;
        }
        if (read != -1) {
            this.f506386e++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j17) {
        long skip = super.skip(j17);
        if (skip > 0) {
            this.f506386e = (int) (this.f506386e + skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i17, int i18) {
        int i19;
        int i27 = this.f506386e;
        int i28 = f506384g;
        if (i27 > i28) {
            i19 = super.read(bArr, i17, i18);
        } else if (i27 == i28) {
            bArr[i17] = this.f506385d;
            i19 = 1;
        } else if (i27 < 2) {
            i19 = super.read(bArr, i17, 2 - i27);
        } else {
            int min = java.lang.Math.min(i28 - i27, i18);
            java.lang.System.arraycopy(f506383f, this.f506386e - 2, bArr, i17, min);
            i19 = min;
        }
        if (i19 > 0) {
            this.f506386e += i19;
        }
        return i19;
    }
}

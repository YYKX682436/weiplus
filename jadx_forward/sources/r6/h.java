package r6;

/* loaded from: classes13.dex */
public class h implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final java.io.InputStream f474305d;

    /* renamed from: e, reason: collision with root package name */
    public final java.nio.charset.Charset f474306e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f474307f;

    /* renamed from: g, reason: collision with root package name */
    public int f474308g;

    /* renamed from: h, reason: collision with root package name */
    public int f474309h;

    public h(java.io.InputStream inputStream, java.nio.charset.Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (!charset.equals(r6.i.f474310a)) {
            throw new java.lang.IllegalArgumentException("Unsupported encoding");
        }
        this.f474305d = inputStream;
        this.f474306e = charset;
        this.f474307f = new byte[8192];
    }

    public java.lang.String a() {
        int i17;
        synchronized (this.f474305d) {
            byte[] bArr = this.f474307f;
            if (bArr == null) {
                throw new java.io.IOException("LineReader is closed");
            }
            if (this.f474308g >= this.f474309h) {
                int read = this.f474305d.read(bArr, 0, bArr.length);
                if (read == -1) {
                    throw new java.io.EOFException();
                }
                this.f474308g = 0;
                this.f474309h = read;
            }
            for (int i18 = this.f474308g; i18 != this.f474309h; i18++) {
                byte[] bArr2 = this.f474307f;
                if (bArr2[i18] == 10) {
                    int i19 = this.f474308g;
                    if (i18 != i19) {
                        i17 = i18 - 1;
                        if (bArr2[i17] == 13) {
                            java.lang.String str = new java.lang.String(bArr2, i19, i17 - i19, this.f474306e.name());
                            this.f474308g = i18 + 1;
                            return str;
                        }
                    }
                    i17 = i18;
                    java.lang.String str2 = new java.lang.String(bArr2, i19, i17 - i19, this.f474306e.name());
                    this.f474308g = i18 + 1;
                    return str2;
                }
            }
            r6.g gVar = new r6.g(this, (this.f474309h - this.f474308g) + 80);
            while (true) {
                byte[] bArr3 = this.f474307f;
                int i27 = this.f474308g;
                gVar.write(bArr3, i27, this.f474309h - i27);
                this.f474309h = -1;
                byte[] bArr4 = this.f474307f;
                int read2 = this.f474305d.read(bArr4, 0, bArr4.length);
                if (read2 == -1) {
                    throw new java.io.EOFException();
                }
                this.f474308g = 0;
                this.f474309h = read2;
                for (int i28 = 0; i28 != this.f474309h; i28++) {
                    byte[] bArr5 = this.f474307f;
                    if (bArr5[i28] == 10) {
                        int i29 = this.f474308g;
                        if (i28 != i29) {
                            gVar.write(bArr5, i29, i28 - i29);
                        }
                        this.f474308g = i28 + 1;
                        return gVar.toString();
                    }
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f474305d) {
            if (this.f474307f != null) {
                this.f474307f = null;
                this.f474305d.close();
            }
        }
    }
}

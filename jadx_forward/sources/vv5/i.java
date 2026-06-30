package vv5;

/* loaded from: classes13.dex */
public class i extends java.io.FilterOutputStream {

    /* renamed from: q, reason: collision with root package name */
    public static final byte[] f522104q = new byte[0];

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f522105d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f522106e;

    /* renamed from: f, reason: collision with root package name */
    public final int f522107f;

    /* renamed from: g, reason: collision with root package name */
    public java.io.ByteArrayOutputStream f522108g;

    /* renamed from: h, reason: collision with root package name */
    public vv5.f f522109h;

    /* renamed from: i, reason: collision with root package name */
    public long f522110i;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f522111m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f522112n;

    /* renamed from: o, reason: collision with root package name */
    public final int f522113o;

    /* renamed from: p, reason: collision with root package name */
    public int f522114p;

    public i(java.io.OutputStream outputStream) {
        super(outputStream);
        this.f522105d = new java.util.HashSet();
        this.f522106e = f522104q;
        this.f522107f = 8;
        this.f522108g = new java.io.ByteArrayOutputStream();
        this.f522110i = 0L;
        this.f522114p = 0;
        this.f522113o = 4;
    }

    public static int f(java.io.OutputStream outputStream, int i17) {
        outputStream.write(i17 & 255);
        outputStream.write((i17 >> 8) & 255);
        return i17;
    }

    public static long i(java.io.OutputStream outputStream, long j17) {
        outputStream.write((int) (255 & j17));
        outputStream.write(((int) (j17 >> 8)) & 255);
        outputStream.write(((int) (j17 >> 16)) & 255);
        outputStream.write(((int) (j17 >> 24)) & 255);
        return j17;
    }

    public final void a(java.lang.String str, byte[] bArr) {
        if (bArr.length <= 65535) {
            return;
        }
        throw new java.lang.IllegalArgumentException(str + " too long in UTF-8:" + bArr.length + " bytes");
    }

    public void b() {
        long j17;
        if (this.f522108g == null) {
            throw new java.io.IOException("Stream is closed");
        }
        vv5.f fVar = this.f522109h;
        if (fVar == null) {
            return;
        }
        if (fVar.f522090i != 0) {
            i(((java.io.FilterOutputStream) this).out, 134695760L);
            i(((java.io.FilterOutputStream) this).out, this.f522109h.f522087f);
            i(((java.io.FilterOutputStream) this).out, this.f522109h.f522088g);
            i(((java.io.FilterOutputStream) this).out, this.f522109h.f522089h);
            j17 = 46;
        } else {
            j17 = 30;
        }
        int i17 = this.f522109h.f522090i == 0 ? 0 : 8;
        i(this.f522108g, 33639248L);
        f(this.f522108g, 20);
        f(this.f522108g, 20);
        f(this.f522108g, i17 | 2048);
        f(this.f522108g, this.f522109h.f522090i);
        f(this.f522108g, this.f522109h.f522091m);
        f(this.f522108g, this.f522109h.f522092n);
        i(this.f522108g, this.f522109h.f522087f);
        vv5.f fVar2 = this.f522109h;
        long j18 = j17 + (fVar2.f522090i == 8 ? fVar2.f522088g : fVar2.f522089h);
        i(this.f522108g, fVar2.f522088g);
        i(this.f522108g, this.f522109h.f522089h);
        java.io.ByteArrayOutputStream byteArrayOutputStream = this.f522108g;
        int length = this.f522111m.length;
        f(byteArrayOutputStream, length);
        long j19 = j18 + length;
        byte[] bArr = this.f522109h.f522093o;
        if (bArr != null) {
            java.io.ByteArrayOutputStream byteArrayOutputStream2 = this.f522108g;
            int length2 = bArr.length;
            f(byteArrayOutputStream2, length2);
            j19 += length2;
        } else {
            f(this.f522108g, 0);
        }
        f(this.f522108g, this.f522112n.length);
        f(this.f522108g, 0);
        f(this.f522108g, 0);
        i(this.f522108g, 0L);
        i(this.f522108g, this.f522109h.f522094p);
        this.f522108g.write(this.f522111m);
        this.f522111m = null;
        byte[] bArr2 = this.f522109h.f522093o;
        if (bArr2 != null) {
            this.f522108g.write(bArr2);
        }
        this.f522110i += j19 + this.f522114p;
        this.f522114p = 0;
        byte[] bArr3 = this.f522112n;
        if (bArr3.length > 0) {
            this.f522108g.write(bArr3);
            this.f522112n = f522104q;
        }
        this.f522109h = null;
    }

    public void c(vv5.f fVar) {
        int i17;
        int i18;
        if (this.f522109h != null) {
            b();
        }
        int i19 = fVar.f522090i;
        if (i19 == -1) {
            i19 = this.f522107f;
        }
        if (i19 == 0) {
            long j17 = fVar.f522088g;
            if (j17 == -1) {
                fVar.f522088g = fVar.f522089h;
            } else if (fVar.f522089h == -1) {
                fVar.b(j17);
            }
            if (fVar.f522087f == -1) {
                throw new java.util.zip.ZipException("STORED entry missing CRC");
            }
            long j18 = fVar.f522089h;
            if (j18 == -1) {
                throw new java.util.zip.ZipException("STORED entry missing size");
            }
            if (j18 != fVar.f522088g) {
                throw new java.util.zip.ZipException("STORED entry size/compressed size mismatch");
            }
        }
        if (this.f522108g == null) {
            throw new java.io.IOException("Stream is closed");
        }
        fVar.f522086e = null;
        fVar.f522093o = null;
        fVar.f522091m = 40691;
        fVar.f522092n = 18698;
        java.nio.charset.Charset charset = vv5.d.f522083a;
        java.lang.String str = fVar.f522085d;
        byte[] bytes = str.getBytes(charset);
        this.f522111m = bytes;
        a("Name", bytes);
        this.f522112n = f522104q;
        java.lang.String str2 = fVar.f522086e;
        if (str2 != null) {
            byte[] bytes2 = str2.getBytes(charset);
            this.f522112n = bytes2;
            a("Comment", bytes2);
        }
        fVar.a(i19);
        this.f522109h = fVar;
        fVar.f522094p = this.f522110i;
        this.f522105d.add(str);
        int i27 = i19 == 0 ? 0 : 8;
        i(((java.io.FilterOutputStream) this).out, 67324752L);
        f(((java.io.FilterOutputStream) this).out, 20);
        f(((java.io.FilterOutputStream) this).out, i27 | 2048);
        f(((java.io.FilterOutputStream) this).out, i19);
        f(((java.io.FilterOutputStream) this).out, this.f522109h.f522091m);
        f(((java.io.FilterOutputStream) this).out, this.f522109h.f522092n);
        if (i19 == 0) {
            i(((java.io.FilterOutputStream) this).out, this.f522109h.f522087f);
            i(((java.io.FilterOutputStream) this).out, this.f522109h.f522089h);
            i(((java.io.FilterOutputStream) this).out, this.f522109h.f522089h);
        } else {
            i(((java.io.FilterOutputStream) this).out, 0L);
            i(((java.io.FilterOutputStream) this).out, 0L);
            i(((java.io.FilterOutputStream) this).out, 0L);
        }
        int length = this.f522111m.length;
        f(((java.io.FilterOutputStream) this).out, length);
        long j19 = this.f522110i + 30 + length;
        vv5.f fVar2 = this.f522109h;
        byte[] bArr = fVar2.f522093o;
        long length2 = j19 + (bArr != null ? bArr.length : 0);
        if (fVar2.f522090i != 0 || (i18 = this.f522113o) == 0) {
            i17 = 0;
        } else {
            long j27 = i18;
            i17 = (int) ((j27 - (length2 % j27)) % j27);
        }
        this.f522114p = i17;
        if (bArr != null) {
            f(((java.io.FilterOutputStream) this).out, bArr.length + i17);
        } else {
            f(((java.io.FilterOutputStream) this).out, i17);
        }
        ((java.io.FilterOutputStream) this).out.write(this.f522111m);
        byte[] bArr2 = this.f522109h.f522093o;
        if (bArr2 != null) {
            ((java.io.FilterOutputStream) this).out.write(bArr2);
        }
        java.io.OutputStream outputStream = ((java.io.FilterOutputStream) this).out;
        long j28 = this.f522114p;
        if (j28 <= 0) {
            return;
        }
        while (true) {
            long j29 = j28 - 1;
            if (j28 <= 0) {
                return;
            }
            outputStream.write(0);
            j28 = j29;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        java.io.OutputStream outputStream = ((java.io.FilterOutputStream) this).out;
        if (outputStream != null) {
            if (outputStream == null) {
                throw new java.io.IOException("Stream is closed");
            }
            if (this.f522108g != null) {
                java.util.HashSet hashSet = this.f522105d;
                if (hashSet.isEmpty()) {
                    throw new java.util.zip.ZipException("No entries");
                }
                if (this.f522109h != null) {
                    b();
                }
                int size = this.f522108g.size();
                i(this.f522108g, 101010256L);
                f(this.f522108g, 0);
                f(this.f522108g, 0);
                f(this.f522108g, hashSet.size());
                f(this.f522108g, hashSet.size());
                i(this.f522108g, size);
                i(this.f522108g, this.f522110i + this.f522114p);
                f(this.f522108g, this.f522106e.length);
                byte[] bArr = this.f522106e;
                if (bArr.length > 0) {
                    this.f522108g.write(bArr);
                }
                this.f522108g.writeTo(((java.io.FilterOutputStream) this).out);
                this.f522108g = null;
            }
            ((java.io.FilterOutputStream) this).out.close();
            ((java.io.FilterOutputStream) this).out = null;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i17, int i18) {
        int length = bArr.length;
        if ((i17 | i18) < 0 || i17 > length || length - i17 < i18) {
            throw new java.lang.ArrayIndexOutOfBoundsException(i17);
        }
        vv5.f fVar = this.f522109h;
        if (fVar == null) {
            throw new java.util.zip.ZipException("No active entry");
        }
        if (fVar.f522090i == 0) {
            ((java.io.FilterOutputStream) this).out.write(bArr, i17, i18);
        } else {
            ((java.io.FilterOutputStream) this).out.write(bArr, i17, i18);
        }
    }
}

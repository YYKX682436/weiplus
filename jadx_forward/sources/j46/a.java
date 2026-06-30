package j46;

/* loaded from: classes13.dex */
public abstract class a extends a46.b {

    /* renamed from: f, reason: collision with root package name */
    public final r46.a f379251f;

    /* renamed from: i, reason: collision with root package name */
    public byte f379254i;

    /* renamed from: n, reason: collision with root package name */
    public int f379256n;

    /* renamed from: o, reason: collision with root package name */
    public int[] f379257o;

    /* renamed from: p, reason: collision with root package name */
    public byte[] f379258p;

    /* renamed from: q, reason: collision with root package name */
    public byte[] f379259q;

    /* renamed from: r, reason: collision with root package name */
    public int f379260r;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f379250e = new byte[1];

    /* renamed from: g, reason: collision with root package name */
    public int f379252g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f379253h = 9;

    /* renamed from: m, reason: collision with root package name */
    public int f379255m = -1;

    public a(java.io.InputStream inputStream, java.nio.ByteOrder byteOrder) {
        this.f379251f = new r46.a(inputStream, byteOrder);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f379251f.close();
    }

    @Override // java.io.InputStream
    public int read() {
        byte[] bArr = this.f379250e;
        int read = read(bArr);
        return read < 0 ? read : bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i17, int i18) {
        int i19;
        int i27;
        boolean z17;
        if (i18 == 0) {
            return 0;
        }
        int length = this.f379259q.length - this.f379260r;
        if (length > 0) {
            i19 = java.lang.Math.min(length, i18);
            java.lang.System.arraycopy(this.f379259q, this.f379260r, bArr, i17, i19);
            this.f379260r += i19;
        } else {
            i19 = 0;
        }
        while (true) {
            int i28 = i18 - i19;
            if (i28 > 0) {
                n46.a aVar = (n46.a) this;
                int f17 = aVar.f();
                int i29 = -1;
                if (f17 >= 0) {
                    boolean z18 = aVar.f416622s;
                    if (z18 && f17 == aVar.f379252g) {
                        aVar.f379256n = (z18 ? 1 : 0) + 256;
                        aVar.c();
                        aVar.f379253h = 9;
                        aVar.f379255m = -1;
                        i29 = 0;
                    } else {
                        int i37 = aVar.f379256n;
                        if (f17 == i37) {
                            int i38 = aVar.f379255m;
                            if (i38 != -1) {
                                aVar.b(i38, aVar.f379254i);
                                z17 = true;
                            } else {
                                throw new java.io.IOException("The first code can't be a reference to its preceding code");
                            }
                        } else {
                            if (f17 > i37) {
                                throw new java.io.IOException(java.lang.String.format("Invalid %d bit code 0x%x", java.lang.Integer.valueOf(aVar.f379253h), java.lang.Integer.valueOf(f17)));
                            }
                            z17 = false;
                        }
                        for (int i39 = f17; i39 >= 0; i39 = aVar.f379257o[i39]) {
                            byte[] bArr2 = aVar.f379259q;
                            int i47 = aVar.f379260r - 1;
                            aVar.f379260r = i47;
                            bArr2[i47] = aVar.f379258p[i39];
                        }
                        int i48 = aVar.f379255m;
                        if (i48 != -1 && !z17) {
                            aVar.b(i48, aVar.f379259q[aVar.f379260r]);
                        }
                        aVar.f379255m = f17;
                        byte[] bArr3 = aVar.f379259q;
                        i29 = aVar.f379260r;
                        aVar.f379254i = bArr3[i29];
                    }
                }
                if (i29 < 0) {
                    if (i19 <= 0) {
                        return i29;
                    }
                    a(i19);
                    return i19;
                }
                int i49 = i17 + i19;
                int length2 = this.f379259q.length - this.f379260r;
                if (length2 > 0) {
                    i27 = java.lang.Math.min(length2, i28);
                    java.lang.System.arraycopy(this.f379259q, this.f379260r, bArr, i49, i27);
                    this.f379260r += i27;
                } else {
                    i27 = 0;
                }
                i19 += i27;
            } else {
                a(i19);
                return i19;
            }
        }
    }
}

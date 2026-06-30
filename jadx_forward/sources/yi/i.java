package yi;

/* loaded from: classes15.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final java.io.InputStream f544001a;

    /* renamed from: b, reason: collision with root package name */
    public int f544002b = 0;

    public i(java.io.InputStream inputStream) {
        this.f544001a = inputStream;
    }

    public void a(yi.j jVar) {
        java.io.InputStream inputStream;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        while (true) {
            inputStream = this.f544001a;
            int read = inputStream.read();
            if (read == 0) {
                break;
            } else {
                sb6.append((char) read);
            }
        }
        java.lang.String sb7 = sb6.toString();
        int a17 = aj.a.a(inputStream);
        if (a17 <= 0 || a17 >= 1073741823) {
            throw new java.io.IOException("bad idSize: " + a17);
        }
        long b17 = aj.a.b(inputStream);
        this.f544002b = a17;
        jVar.b(sb7, a17, b17);
        while (true) {
            try {
                int read2 = inputStream.read();
                int a18 = aj.a.a(inputStream);
                long a19 = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2 & aj.a.a(inputStream);
                if (read2 == 1) {
                    zi.b e17 = aj.a.e(inputStream, this.f544002b);
                    long j17 = a19 - this.f544002b;
                    byte[] bArr = new byte[(int) j17];
                    aj.a.d(inputStream, bArr, 0, j17);
                    jVar.g(e17, new java.lang.String(bArr, java.nio.charset.Charset.forName(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c)), a18, a19);
                } else if (read2 == 2) {
                    jVar.d(aj.a.a(inputStream), aj.a.e(inputStream, this.f544002b), aj.a.a(inputStream), aj.a.e(inputStream, this.f544002b), a18, a19);
                } else if (read2 == 4) {
                    jVar.e(aj.a.e(inputStream, this.f544002b), aj.a.e(inputStream, this.f544002b), aj.a.e(inputStream, this.f544002b), aj.a.e(inputStream, this.f544002b), aj.a.a(inputStream), aj.a.a(inputStream), a18, a19);
                } else if (read2 == 5) {
                    int a27 = aj.a.a(inputStream);
                    int a28 = aj.a.a(inputStream);
                    int a29 = aj.a.a(inputStream);
                    zi.b[] bVarArr = new zi.b[a29];
                    for (int i17 = 0; i17 < a29; i17++) {
                        bVarArr[i17] = aj.a.e(inputStream, this.f544002b);
                    }
                    jVar.f(a27, a28, bVarArr, a18, a19);
                } else if (read2 == 12 || read2 == 28) {
                    b(read2, a18, a19, jVar);
                } else {
                    byte[] bArr2 = new byte[(int) a19];
                    aj.a.d(inputStream, bArr2, 0, a19);
                    jVar.h(read2, a18, a19, bArr2);
                }
            } catch (java.io.EOFException unused) {
                jVar.a();
                return;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0034. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0038. Please report as an issue. */
    public final void b(int i17, int i18, long j17, yi.j jVar) {
        long j18;
        int i19;
        long j19;
        long j27;
        int i27;
        int i28;
        int i29;
        long j28;
        int c17;
        long j29 = j17;
        yi.h c18 = jVar.c(i17, i18, j29);
        java.io.InputStream inputStream = this.f544001a;
        if (c18 == null) {
            aj.a.g(inputStream, j29);
            return;
        }
        while (j29 > 0) {
            int read = inputStream.read();
            long j37 = j29 - 1;
            if (read == 144) {
                j18 = j37;
                c18.b(read, aj.a.e(inputStream, this.f544002b));
                i19 = this.f544002b;
            } else if (read != 195) {
                if (read == 254) {
                    j18 = j37;
                    c18.d(aj.a.a(inputStream), aj.a.e(inputStream, this.f544002b));
                    i27 = this.f544002b;
                } else if (read != 255) {
                    switch (read) {
                        case 1:
                            j18 = j37;
                            c18.b(read, aj.a.e(inputStream, this.f544002b));
                            aj.a.g(inputStream, this.f544002b);
                            i19 = this.f544002b << 1;
                            break;
                        case 2:
                            j18 = j37;
                            c18.g(aj.a.e(inputStream, this.f544002b), aj.a.a(inputStream), aj.a.a(inputStream));
                            i28 = this.f544002b;
                            i27 = i28 + 4;
                            break;
                        case 3:
                            j18 = j37;
                            c18.f(aj.a.e(inputStream, this.f544002b), aj.a.a(inputStream), aj.a.a(inputStream));
                            i28 = this.f544002b;
                            i27 = i28 + 4;
                            break;
                        case 4:
                            j18 = j37;
                            c18.i(aj.a.e(inputStream, this.f544002b), aj.a.a(inputStream));
                            i27 = this.f544002b;
                            break;
                        case 5:
                            j18 = j37;
                            c18.b(read, aj.a.e(inputStream, this.f544002b));
                            i19 = this.f544002b;
                            break;
                        case 6:
                            j18 = j37;
                            c18.l(aj.a.e(inputStream, this.f544002b), aj.a.a(inputStream));
                            i27 = this.f544002b;
                            break;
                        case 7:
                            j18 = j37;
                            c18.b(read, aj.a.e(inputStream, this.f544002b));
                            i19 = this.f544002b;
                            break;
                        case 8:
                            j18 = j37;
                            c18.m(aj.a.e(inputStream, this.f544002b), aj.a.a(inputStream), aj.a.a(inputStream));
                            i28 = this.f544002b;
                            i27 = i28 + 4;
                            break;
                        default:
                            switch (read) {
                                case 32:
                                    zi.b e17 = aj.a.e(inputStream, this.f544002b);
                                    int a17 = aj.a.a(inputStream);
                                    zi.b e18 = aj.a.e(inputStream, this.f544002b);
                                    zi.b e19 = aj.a.e(inputStream, this.f544002b);
                                    aj.a.g(inputStream, this.f544002b << 2);
                                    int a18 = aj.a.a(inputStream);
                                    int i37 = (this.f544002b * 7) + 4 + 4;
                                    short c19 = aj.a.c(inputStream);
                                    int i38 = i37 + 2;
                                    int i39 = 0;
                                    while (i39 < c19) {
                                        aj.a.g(inputStream, 2L);
                                        int read2 = inputStream.read();
                                        zi.c a19 = zi.c.a(read2);
                                        if (a19 == null) {
                                            throw new java.lang.IllegalStateException("failure to skip type, cannot find type def of typeid: " + read2);
                                        }
                                        int i47 = this.f544002b;
                                        int i48 = a19.f554613e;
                                        zi.b bVar = e17;
                                        if (i48 != 0) {
                                            i47 = i48;
                                        }
                                        aj.a.g(inputStream, i47);
                                        i38 += i47 + 1 + 2;
                                        i39++;
                                        e17 = bVar;
                                    }
                                    zi.b bVar2 = e17;
                                    int c27 = aj.a.c(inputStream);
                                    zi.a[] aVarArr = new zi.a[c27];
                                    int i49 = i38 + 2;
                                    int i57 = 0;
                                    while (i57 < c27) {
                                        zi.b e27 = aj.a.e(inputStream, this.f544002b);
                                        int read3 = inputStream.read();
                                        zi.c a27 = zi.c.a(read3);
                                        if (a27 == null) {
                                            throw new java.lang.IllegalStateException("accept class failed, lost type def of typeId: " + read3);
                                        }
                                        int i58 = c27;
                                        long j38 = j37;
                                        aVarArr[i57] = new zi.a(read3, e27, aj.a.f(inputStream, a27, this.f544002b));
                                        int i59 = this.f544002b;
                                        int i66 = i59 + 1;
                                        int i67 = a27.f554613e;
                                        if (i67 != 0) {
                                            i59 = i67;
                                        }
                                        i49 += i66 + i59;
                                        i57++;
                                        c27 = i58;
                                        j37 = j38;
                                    }
                                    long j39 = j37;
                                    int c28 = aj.a.c(inputStream);
                                    zi.a[] aVarArr2 = new zi.a[c28];
                                    int i68 = i49 + 2;
                                    for (int i69 = 0; i69 < c28; i69++) {
                                        aVarArr2[i69] = new zi.a(inputStream.read(), aj.a.e(inputStream, this.f544002b), null);
                                        i68 += this.f544002b + 1;
                                    }
                                    c18.c(bVar2, a17, e18, e19, a18, aVarArr, aVarArr2);
                                    j19 = i68;
                                    j18 = j39;
                                    j27 = j18 - j19;
                                    j29 = j27;
                                case 33:
                                    zi.b e28 = aj.a.e(inputStream, this.f544002b);
                                    int a28 = aj.a.a(inputStream);
                                    zi.b e29 = aj.a.e(inputStream, this.f544002b);
                                    int a29 = aj.a.a(inputStream);
                                    byte[] bArr = new byte[a29];
                                    aj.a.d(inputStream, bArr, 0, a29);
                                    c18.e(e28, a28, e29, bArr);
                                    int i76 = this.f544002b;
                                    i29 = i76 + 4 + i76 + 4 + a29;
                                    j28 = i29;
                                    j27 = j37 - j28;
                                    j29 = j27;
                                case 34:
                                    zi.b e37 = aj.a.e(inputStream, this.f544002b);
                                    int a37 = aj.a.a(inputStream);
                                    int a38 = aj.a.a(inputStream);
                                    zi.b e38 = aj.a.e(inputStream, this.f544002b);
                                    int i77 = this.f544002b * a38;
                                    byte[] bArr2 = new byte[i77];
                                    aj.a.d(inputStream, bArr2, 0, i77);
                                    c18.j(e37, a37, a38, e38, bArr2);
                                    int i78 = this.f544002b;
                                    i29 = i78 + 4 + 4 + i78 + i77;
                                    j28 = i29;
                                    j27 = j37 - j28;
                                    j29 = j27;
                                case 35:
                                    c17 = c(read, c18);
                                    j28 = c17;
                                    j27 = j37 - j28;
                                    j29 = j27;
                                default:
                                    switch (read) {
                                        case 137:
                                            c18.b(read, aj.a.e(inputStream, this.f544002b));
                                            c17 = this.f544002b;
                                            break;
                                        case 138:
                                            c18.b(read, aj.a.e(inputStream, this.f544002b));
                                            c17 = this.f544002b;
                                            break;
                                        case 139:
                                            c18.b(read, aj.a.e(inputStream, this.f544002b));
                                            c17 = this.f544002b;
                                            break;
                                        case 140:
                                            c18.b(read, aj.a.e(inputStream, this.f544002b));
                                            c17 = this.f544002b;
                                            break;
                                        case 141:
                                            c18.b(read, aj.a.e(inputStream, this.f544002b));
                                            c17 = this.f544002b;
                                            break;
                                        case com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50673x992affbf /* 142 */:
                                            c18.h(aj.a.e(inputStream, this.f544002b), aj.a.a(inputStream), aj.a.a(inputStream));
                                            c17 = this.f544002b + 4 + 4;
                                            break;
                                        default:
                                            throw new java.lang.IllegalArgumentException("acceptHeapDumpRecord loop with unknown tag " + read + " with " + inputStream.available() + " bytes possibly remaining");
                                    }
                                    j28 = c17;
                                    j27 = j37 - j28;
                                    j29 = j27;
                            }
                    }
                } else {
                    j18 = j37;
                    c18.b(read, aj.a.e(inputStream, this.f544002b));
                    i19 = this.f544002b;
                }
                i19 = i27 + 4;
            } else {
                j18 = j37;
                i19 = c(read, c18);
            }
            j19 = i19;
            j27 = j18 - j19;
            j29 = j27;
        }
        c18.a();
    }

    public final int c(int i17, yi.h hVar) {
        int i18 = this.f544002b;
        java.io.InputStream inputStream = this.f544001a;
        zi.b e17 = aj.a.e(inputStream, i18);
        int a17 = aj.a.a(inputStream);
        int a18 = aj.a.a(inputStream);
        int read = inputStream.read();
        zi.c a19 = zi.c.a(read);
        if (a19 == null) {
            throw new java.lang.IllegalStateException("accept primitive array failed, lost type def of typeId: " + read);
        }
        int i19 = this.f544002b;
        int i27 = a19.f554613e;
        if (i27 != 0) {
            i19 = i27;
        }
        int i28 = a18 * i19;
        byte[] bArr = new byte[i28];
        aj.a.d(inputStream, bArr, 0, i28);
        hVar.k(i17, e17, a17, a18, read, bArr);
        return this.f544002b + 4 + 4 + 1 + i28;
    }
}

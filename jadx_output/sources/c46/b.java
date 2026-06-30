package c46;

/* loaded from: classes13.dex */
public class b extends a46.b {
    public static final /* synthetic */ int D = 0;
    public int A;
    public char B;
    public c46.a C;

    /* renamed from: e, reason: collision with root package name */
    public int f38548e;

    /* renamed from: f, reason: collision with root package name */
    public int f38549f;

    /* renamed from: g, reason: collision with root package name */
    public int f38550g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f38551h;

    /* renamed from: m, reason: collision with root package name */
    public int f38553m;

    /* renamed from: n, reason: collision with root package name */
    public r46.a f38554n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f38555o;

    /* renamed from: q, reason: collision with root package name */
    public int f38557q;

    /* renamed from: r, reason: collision with root package name */
    public int f38558r;

    /* renamed from: s, reason: collision with root package name */
    public int f38559s;

    /* renamed from: t, reason: collision with root package name */
    public int f38560t;

    /* renamed from: u, reason: collision with root package name */
    public int f38561u;

    /* renamed from: v, reason: collision with root package name */
    public int f38562v;

    /* renamed from: w, reason: collision with root package name */
    public int f38563w;

    /* renamed from: x, reason: collision with root package name */
    public int f38564x;

    /* renamed from: y, reason: collision with root package name */
    public int f38565y;

    /* renamed from: z, reason: collision with root package name */
    public int f38566z;

    /* renamed from: i, reason: collision with root package name */
    public final c46.c f38552i = new c46.c();

    /* renamed from: p, reason: collision with root package name */
    public int f38556p = 1;

    public b(java.io.InputStream inputStream, boolean z17) {
        this.f38554n = new r46.a(inputStream == java.lang.System.in ? new r46.f(inputStream) : inputStream, java.nio.ByteOrder.BIG_ENDIAN);
        this.f38555o = z17;
        i(true);
        j();
    }

    public static int b(r46.a aVar, int i17) {
        long a17 = aVar.a(i17);
        if (a17 >= 0) {
            return (int) a17;
        }
        throw new java.io.IOException("Unexpected end of stream");
    }

    public static void c(int i17, int i18, java.lang.String str) {
        if (i17 < 0) {
            throw new java.io.IOException("Corrupted input, " + str + " value negative");
        }
        if (i17 < i18) {
            return;
        }
        throw new java.io.IOException("Corrupted input, " + str + " value too big");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        r46.a aVar = this.f38554n;
        if (aVar != null) {
            try {
                aVar.close();
            } finally {
                this.C = null;
                this.f38554n = null;
            }
        }
    }

    public final void f() {
        int i17 = ~this.f38552i.f38568a;
        int i18 = this.f38557q;
        if (i18 == i17) {
            int i19 = this.f38559s;
            this.f38559s = i17 ^ ((i19 >>> 31) | (i19 << 1));
        } else {
            int i27 = this.f38558r;
            this.f38559s = ((i27 >>> 31) | (i27 << 1)) ^ i18;
            throw new java.io.IOException("BZip2 CRC error");
        }
    }

    public final boolean i(boolean z17) {
        r46.a aVar = this.f38554n;
        if (aVar == null) {
            throw new java.io.IOException("No InputStream");
        }
        if (!z17) {
            aVar.f392498f = 0L;
            aVar.f392499g = 0;
        }
        int a17 = (int) aVar.a(8);
        if (a17 == -1 && !z17) {
            return false;
        }
        int a18 = (int) this.f38554n.a(8);
        int a19 = (int) this.f38554n.a(8);
        if (a17 != 66 || a18 != 90 || a19 != 104) {
            throw new java.io.IOException(z17 ? "Stream is not in the BZip2 format" : "Garbage after a valid BZip2 stream");
        }
        int a27 = (int) this.f38554n.a(8);
        if (a27 < 49 || a27 > 57) {
            throw new java.io.IOException("BZip2 block size is invalid");
        }
        this.f38550g = a27 - 48;
        this.f38559s = 0;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13, types: [int] */
    /* JADX WARN: Type inference failed for: r18v13, types: [int] */
    public final void j() {
        char c17;
        byte[] bArr;
        byte[] bArr2;
        int[] iArr;
        char[] cArr;
        int[] iArr2;
        c46.a aVar;
        int[] iArr3;
        int i17;
        int[] iArr4;
        int[] iArr5;
        int i18;
        java.lang.String str;
        byte[] bArr3;
        r46.a aVar2;
        java.lang.String str2;
        int i19;
        int i27;
        int i28;
        int i29;
        int i37;
        int i38;
        char c18;
        int i39;
        int i47;
        r46.a aVar3 = this.f38554n;
        do {
            char b17 = (char) b(aVar3, 8);
            char b18 = (char) b(aVar3, 8);
            char b19 = (char) b(aVar3, 8);
            char b27 = (char) b(aVar3, 8);
            char b28 = (char) b(aVar3, 8);
            char b29 = (char) b(aVar3, 8);
            c17 = 0;
            if (b17 != 23 || b18 != 'r' || b19 != 'E' || b27 != '8' || b28 != 'P' || b29 != 144) {
                if (b17 != '1' || b18 != 'A' || b19 != 'Y' || b27 != '&' || b28 != 'S' || b29 != 'Y') {
                    this.f38556p = 0;
                    throw new java.io.IOException("Bad block header");
                }
                this.f38557q = b(aVar3, 32);
                this.f38551h = b(aVar3, 1) == 1;
                if (this.C == null) {
                    this.C = new c46.a(this.f38550g);
                }
                r46.a aVar4 = this.f38554n;
                this.f38549f = b(aVar4, 24);
                r46.a aVar5 = this.f38554n;
                c46.a aVar6 = this.C;
                boolean[] zArr = aVar6.f38533a;
                int i48 = 0;
                for (int i49 = 0; i49 < 16; i49++) {
                    if (b(aVar5, 1) != 0) {
                        i48 |= 1 << i49;
                    }
                }
                java.util.Arrays.fill(zArr, false);
                for (int i57 = 0; i57 < 16; i57++) {
                    if (((1 << i57) & i48) != 0) {
                        int i58 = i57 << 4;
                        for (int i59 = 0; i59 < 16; i59++) {
                            if (b(aVar5, 1) != 0) {
                                zArr[i58 + i59] = true;
                            }
                        }
                    }
                }
                c46.a aVar7 = this.C;
                boolean[] zArr2 = aVar7.f38533a;
                int i66 = 0;
                for (int i67 = 0; i67 < 256; i67++) {
                    if (zArr2[i67]) {
                        aVar7.f38534b[i66] = (byte) i67;
                        i66++;
                    }
                }
                this.f38553m = i66;
                int i68 = i66 + 2;
                int b37 = b(aVar5, 3);
                int b38 = b(aVar5, 15);
                if (b38 < 0) {
                    throw new java.io.IOException("Corrupted input, nSelectors value negative");
                }
                c(i68, com.tencent.mars.cdn.proto.AppType.APPTYPE_259_VALUE, "alphaSize");
                c(b37, 7, "nGroups");
                int i69 = 0;
                while (true) {
                    bArr = aVar6.f38536d;
                    if (i69 >= b38) {
                        break;
                    }
                    int i76 = 0;
                    while (true) {
                        if (!(b(aVar5, 1) != 0)) {
                            break;
                        } else {
                            i76++;
                        }
                    }
                    if (i69 < 18002) {
                        bArr[i69] = (byte) i76;
                    }
                    i69++;
                }
                if (b38 > 18002) {
                    b38 = 18002;
                }
                int i77 = b37;
                while (true) {
                    i77--;
                    bArr2 = aVar6.f38545m;
                    if (i77 < 0) {
                        break;
                    } else {
                        bArr2[i77] = (byte) i77;
                    }
                }
                for (int i78 = 0; i78 < b38; i78++) {
                    int i79 = bArr[i78] & 255;
                    c(i79, 6, "selectorMtf");
                    byte b39 = bArr2[i79];
                    while (i79 > 0) {
                        int i86 = i79 - 1;
                        bArr2[i79] = bArr2[i86];
                        i79 = i86;
                    }
                    bArr2[0] = b39;
                    aVar6.f38535c[i78] = b39;
                }
                for (int i87 = 0; i87 < b37; i87++) {
                    int b47 = b(aVar5, 5);
                    char[] cArr2 = aVar6.f38544l[i87];
                    for (int i88 = 0; i88 < i68; i88++) {
                        while (true) {
                            if (b(aVar5, 1) != 0) {
                                b47 += b(aVar5, 1) != 0 ? -1 : 1;
                            }
                        }
                        cArr2[i88] = (char) b47;
                    }
                }
                c46.a aVar8 = this.C;
                char[][] cArr3 = aVar8.f38544l;
                int i89 = 0;
                while (i89 < b37) {
                    char[] cArr4 = cArr3[i89];
                    char c19 = c17;
                    int i96 = i68;
                    char c27 = ' ';
                    while (true) {
                        i96--;
                        if (i96 < 0) {
                            break;
                        }
                        char c28 = cArr4[i96];
                        if (c28 > c19) {
                            c19 = c28;
                        }
                        if (c28 < c27) {
                            c27 = c28;
                        }
                    }
                    int[] iArr6 = aVar8.f38538f[i89];
                    int[] iArr7 = aVar8.f38539g[i89];
                    int[] iArr8 = aVar8.f38540h[i89];
                    char[] cArr5 = cArr3[i89];
                    char c29 = c17;
                    int i97 = c27;
                    while (i97 <= c19) {
                        for (int i98 = c17; i98 < i68; i98++) {
                            if (cArr5[i98] == i97) {
                                iArr8[c29] = i98;
                                c29++;
                            }
                        }
                        i97++;
                        c17 = 0;
                    }
                    int i99 = 23;
                    while (true) {
                        i99--;
                        if (i99 <= 0) {
                            break;
                        }
                        iArr7[i99] = 0;
                        iArr6[i99] = 0;
                    }
                    for (int i100 = 0; i100 < i68; i100++) {
                        char c37 = cArr5[i100];
                        c(c37, 258, "length");
                        int i101 = c37 + 1;
                        iArr7[i101] = iArr7[i101] + 1;
                    }
                    int i102 = iArr7[0];
                    for (int i103 = 1; i103 < 23; i103++) {
                        i102 += iArr7[i103];
                        iArr7[i103] = i102;
                    }
                    int i104 = iArr7[c27];
                    char c38 = c27;
                    int i105 = 0;
                    while (c38 <= c19) {
                        ?? r18 = c38 + 1;
                        int i106 = iArr7[r18];
                        int i107 = i105 + (i106 - i104);
                        iArr6[c38] = i107 - 1;
                        i105 = i107 << 1;
                        c38 = r18;
                        i104 = i106;
                    }
                    int i108 = 1;
                    int i109 = c27 + 1;
                    while (i109 <= c19) {
                        iArr7[i109] = ((iArr6[i109 - 1] + i108) << i108) - iArr7[i109];
                        i109++;
                        i108 = 1;
                    }
                    aVar8.f38541i[i89] = c27;
                    i89++;
                    c17 = 0;
                }
                c46.a aVar9 = this.C;
                byte[] bArr4 = aVar9.f38547o;
                int i110 = this.f38550g * 100000;
                int i111 = 256;
                while (true) {
                    i111--;
                    iArr = aVar9.f38537e;
                    cArr = aVar9.f38543k;
                    if (i111 < 0) {
                        break;
                    }
                    cArr[i111] = (char) i111;
                    iArr[i111] = 0;
                }
                int i112 = this.f38553m + 1;
                c46.a aVar10 = this.C;
                int i113 = aVar10.f38535c[0] & 255;
                c(i113, 6, "zt");
                int i114 = aVar10.f38541i[i113];
                java.lang.String str3 = "zn";
                c(i114, 258, "zn");
                int b48 = b(this.f38554n, i114);
                for (int[] iArr9 = aVar10.f38538f[i113]; b48 > iArr9[i114]; iArr9 = iArr9) {
                    i114++;
                    c(i114, 258, "zn");
                    b48 = (b48 << 1) | b(this.f38554n, 1);
                }
                int i115 = b48 - aVar10.f38539g[i113][i114];
                c(i115, 258, "zvec");
                int i116 = aVar10.f38540h[i113][i115];
                byte[] bArr5 = aVar9.f38535c;
                int i117 = bArr5[0] & 255;
                c(i117, 6, "zt");
                int[][] iArr10 = aVar9.f38539g;
                int[] iArr11 = iArr10[i117];
                int[][] iArr12 = aVar9.f38538f;
                int[] iArr13 = iArr12[i117];
                int[] iArr14 = iArr11;
                int[][] iArr15 = aVar9.f38540h;
                int[] iArr16 = iArr15[i117];
                int[] iArr17 = aVar9.f38541i;
                java.lang.String str4 = "zvec";
                int[] iArr18 = iArr16;
                int i118 = -1;
                int i119 = 0;
                int i120 = 49;
                int i121 = iArr17[i117];
                int i122 = i116;
                while (i122 != i112) {
                    int i123 = i112;
                    java.lang.String str5 = "groupNo";
                    r46.a aVar11 = aVar4;
                    java.lang.String str6 = str3;
                    byte[] bArr6 = aVar9.f38534b;
                    if (i122 != 0) {
                        aVar = aVar9;
                        if (i122 == 1) {
                            iArr2 = iArr17;
                        } else {
                            i118++;
                            if (i118 >= i110) {
                                throw new java.io.IOException("Block overrun in MTF, " + i118 + " exceeds " + i110);
                            }
                            int i124 = i110;
                            c(i122, 257, "nextSym");
                            int i125 = i122 - 1;
                            char c39 = cArr[i125];
                            iArr2 = iArr17;
                            c(c39, 256, "yy");
                            byte b49 = bArr6[c39];
                            int i126 = b49 & 255;
                            iArr[i126] = iArr[i126] + 1;
                            bArr4[i118] = b49;
                            if (i122 <= 16) {
                                while (i125 > 0) {
                                    int i127 = i125 - 1;
                                    cArr[i125] = cArr[i127];
                                    i125 = i127;
                                }
                                c18 = 0;
                            } else {
                                c18 = 0;
                                java.lang.System.arraycopy(cArr, 0, cArr, 1, i125);
                            }
                            cArr[c18] = c39;
                            if (i120 == 0) {
                                int i128 = i119 + 1;
                                c(i128, 18002, "groupNo");
                                int i129 = bArr5[i128] & 255;
                                c(i129, 6, "zt");
                                iArr14 = iArr10[i129];
                                iArr13 = iArr12[i129];
                                iArr18 = iArr15[i129];
                                i119 = i128;
                                i39 = iArr2[i129];
                                str2 = str6;
                                i47 = 258;
                                i120 = 49;
                            } else {
                                i120--;
                                i39 = i121;
                                str2 = str6;
                                i47 = 258;
                            }
                            c(i39, i47, str2);
                            int b57 = b(aVar11, i39);
                            int i130 = i39;
                            while (b57 > iArr13[i130]) {
                                i130++;
                                c(i130, i47, str2);
                                b57 = (b57 << 1) | b(aVar11, 1);
                            }
                            int i131 = b57 - iArr14[i130];
                            java.lang.String str7 = str4;
                            c(i131, i47, str7);
                            int i132 = iArr18[i131];
                            str = str7;
                            bArr3 = bArr4;
                            aVar2 = aVar11;
                            iArr3 = iArr18;
                            i27 = i124;
                            i17 = i119;
                            iArr4 = iArr14;
                            iArr5 = iArr13;
                            i18 = i39;
                            i19 = i132;
                            bArr4 = bArr3;
                            i112 = i123;
                            aVar9 = aVar;
                            str3 = str2;
                            i110 = i27;
                            iArr17 = iArr2;
                            r46.a aVar12 = aVar2;
                            i122 = i19;
                            aVar4 = aVar12;
                            int[] iArr19 = iArr3;
                            str4 = str;
                            i121 = i18;
                            iArr13 = iArr5;
                            iArr14 = iArr4;
                            i119 = i17;
                            iArr18 = iArr19;
                        }
                    } else {
                        iArr2 = iArr17;
                        aVar = aVar9;
                    }
                    int i133 = i110;
                    java.lang.String str8 = str4;
                    str2 = str6;
                    int i134 = i122;
                    aVar2 = aVar11;
                    byte[] bArr7 = bArr4;
                    int i135 = i134;
                    int i136 = -1;
                    iArr3 = iArr18;
                    i17 = i119;
                    iArr4 = iArr14;
                    iArr5 = iArr13;
                    i18 = i121;
                    int i137 = 1;
                    while (true) {
                        if (i135 != 0) {
                            i28 = i118;
                            if (i135 != 1) {
                                break;
                            } else {
                                i29 = i136 + (i137 << 1);
                            }
                        } else {
                            i29 = i136 + i137;
                            i28 = i118;
                        }
                        if (i120 == 0) {
                            int i138 = i17 + 1;
                            c(i138, 18002, str5);
                            int i139 = bArr5[i138] & 255;
                            c(i139, 6, "zt");
                            int[] iArr20 = iArr10[i139];
                            iArr5 = iArr12[i139];
                            int[] iArr21 = iArr15[i139];
                            i37 = iArr2[i139];
                            i17 = i138;
                            iArr3 = iArr21;
                            i38 = 258;
                            i120 = 49;
                            iArr4 = iArr20;
                        } else {
                            i120--;
                            i37 = i18;
                            i38 = 258;
                        }
                        c(i37, i38, str2);
                        int i140 = i29;
                        int b58 = b(aVar2, i37);
                        int i141 = i37;
                        while (b58 > iArr5[i141]) {
                            int i142 = i141 + 1;
                            c(i142, 258, str2);
                            b58 = (b58 << 1) | b(aVar2, 1);
                            i141 = i142;
                            str5 = str5;
                        }
                        int i143 = b58 - iArr4[i141];
                        c(i143, 258, str8);
                        i135 = iArr3[i143];
                        i137 <<= 1;
                        i18 = i37;
                        i118 = i28;
                        i136 = i140;
                        str5 = str5;
                    }
                    int i144 = i135;
                    str = str8;
                    c(i136, this.C.f38547o.length, "s");
                    char c47 = cArr[0];
                    c(c47, 256, "yy");
                    byte b59 = bArr6[c47];
                    int i145 = b59 & 255;
                    iArr[i145] = iArr[i145] + i136 + 1;
                    int i146 = i28 + 1;
                    int i147 = i136 + i146;
                    c(i147, this.C.f38547o.length, "lastShadow");
                    bArr3 = bArr7;
                    java.util.Arrays.fill(bArr3, i146, i147 + 1, b59);
                    i27 = i133;
                    if (i147 >= i27) {
                        throw new java.io.IOException("Block overrun while expanding RLE in MTF, " + i147 + " exceeds " + i27);
                    }
                    i19 = i144;
                    i118 = i147;
                    bArr4 = bArr3;
                    i112 = i123;
                    aVar9 = aVar;
                    str3 = str2;
                    i110 = i27;
                    iArr17 = iArr2;
                    r46.a aVar122 = aVar2;
                    i122 = i19;
                    aVar4 = aVar122;
                    int[] iArr192 = iArr3;
                    str4 = str;
                    i121 = i18;
                    iArr13 = iArr5;
                    iArr14 = iArr4;
                    i119 = i17;
                    iArr18 = iArr192;
                }
                this.f38548e = i118;
                this.f38552i.f38568a = -1;
                this.f38556p = 1;
                return;
            }
            int b67 = b(this.f38554n, 32);
            this.f38558r = b67;
            this.f38556p = 0;
            this.C = null;
            if (b67 != this.f38559s) {
                throw new java.io.IOException("BZip2 CRC error");
            }
            if (!this.f38555o || !i(false)) {
                c17 = 1;
            }
        } while (c17 == 0);
    }

    public final int k() {
        switch (this.f38556p) {
            case 0:
                return -1;
            case 1:
                return l();
            case 2:
                throw new java.lang.IllegalStateException();
            case 3:
                if (this.f38561u != this.f38562v) {
                    this.f38556p = 2;
                    this.f38560t = 1;
                    return v();
                }
                int i17 = this.f38560t + 1;
                this.f38560t = i17;
                if (i17 < 4) {
                    this.f38556p = 2;
                    return v();
                }
                c46.a aVar = this.C;
                byte[] bArr = aVar.f38547o;
                int i18 = this.A;
                this.B = (char) (bArr[i18] & 255);
                c(i18, aVar.f38546n.length, "su_tPos");
                this.A = this.C.f38546n[this.A];
                int i19 = this.f38565y;
                if (i19 == 0) {
                    int i27 = this.f38566z;
                    this.f38565y = c46.d.f38569a[i27] - 1;
                    int i28 = i27 + 1;
                    this.f38566z = i28;
                    if (i28 == 512) {
                        this.f38566z = 0;
                    }
                } else {
                    this.f38565y = i19 - 1;
                }
                this.f38564x = 0;
                this.f38556p = 4;
                if (this.f38565y == 1) {
                    this.B = (char) (this.B ^ 1);
                }
                return w();
            case 4:
                return w();
            case 5:
                throw new java.lang.IllegalStateException();
            case 6:
                if (this.f38561u != this.f38562v) {
                    this.f38560t = 1;
                    return p();
                }
                int i29 = this.f38560t + 1;
                this.f38560t = i29;
                if (i29 < 4) {
                    return p();
                }
                c(this.A, this.C.f38547o.length, "su_tPos");
                c46.a aVar2 = this.C;
                byte[] bArr2 = aVar2.f38547o;
                int i37 = this.A;
                this.B = (char) (bArr2[i37] & 255);
                this.A = aVar2.f38546n[i37];
                this.f38564x = 0;
                return q();
            case 7:
                return q();
            default:
                throw new java.lang.IllegalStateException();
        }
    }

    public final int l() {
        c46.a aVar;
        if (this.f38556p == 0 || (aVar = this.C) == null) {
            return -1;
        }
        int[] iArr = aVar.f38542j;
        int i17 = this.f38548e + 1;
        int[] iArr2 = aVar.f38546n;
        if (iArr2 == null || iArr2.length < i17) {
            iArr2 = new int[i17];
            aVar.f38546n = iArr2;
        }
        byte[] bArr = aVar.f38547o;
        iArr[0] = 0;
        java.lang.System.arraycopy(aVar.f38537e, 0, iArr, 1, 256);
        int i18 = iArr[0];
        for (int i19 = 1; i19 <= 256; i19++) {
            i18 += iArr[i19];
            iArr[i19] = i18;
        }
        int i27 = this.f38548e;
        for (int i28 = 0; i28 <= i27; i28++) {
            int i29 = bArr[i28] & 255;
            int i37 = iArr[i29];
            iArr[i29] = i37 + 1;
            c(i37, i17, "tt index");
            iArr2[i37] = i28;
        }
        int i38 = this.f38549f;
        if (i38 < 0 || i38 >= iArr2.length) {
            throw new java.io.IOException("Stream corrupted");
        }
        this.A = iArr2[i38];
        this.f38560t = 0;
        this.f38563w = 0;
        this.f38561u = 256;
        if (!this.f38551h) {
            return p();
        }
        this.f38565y = 0;
        this.f38566z = 0;
        return v();
    }

    public final int p() {
        if (this.f38563w > this.f38548e) {
            this.f38556p = 5;
            f();
            j();
            return l();
        }
        this.f38562v = this.f38561u;
        c46.a aVar = this.C;
        byte[] bArr = aVar.f38547o;
        int i17 = this.A;
        int i18 = bArr[i17] & 255;
        this.f38561u = i18;
        c(i17, aVar.f38546n.length, "su_tPos");
        this.A = this.C.f38546n[this.A];
        this.f38563w++;
        this.f38556p = 6;
        this.f38552i.a(i18);
        return i18;
    }

    public final int q() {
        if (this.f38564x >= this.B) {
            this.f38563w++;
            this.f38560t = 0;
            return p();
        }
        int i17 = this.f38561u;
        this.f38552i.a(i17);
        this.f38564x++;
        this.f38556p = 7;
        return i17;
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f38554n != null) {
            int k17 = k();
            a(k17 < 0 ? -1 : 1);
            return k17;
        }
        throw new java.io.IOException("Stream closed");
    }

    public final int v() {
        if (this.f38563w > this.f38548e) {
            f();
            j();
            return l();
        }
        this.f38562v = this.f38561u;
        c46.a aVar = this.C;
        byte[] bArr = aVar.f38547o;
        int i17 = this.A;
        int i18 = bArr[i17] & 255;
        c(i17, aVar.f38546n.length, "su_tPos");
        this.A = this.C.f38546n[this.A];
        int i19 = this.f38565y;
        if (i19 == 0) {
            int i27 = this.f38566z;
            this.f38565y = c46.d.f38569a[i27] - 1;
            int i28 = i27 + 1;
            this.f38566z = i28;
            if (i28 == 512) {
                this.f38566z = 0;
            }
        } else {
            this.f38565y = i19 - 1;
        }
        int i29 = i18 ^ (this.f38565y == 1 ? 1 : 0);
        this.f38561u = i29;
        this.f38563w++;
        this.f38556p = 3;
        this.f38552i.a(i29);
        return i29;
    }

    public final int w() {
        if (this.f38564x < this.B) {
            this.f38552i.a(this.f38561u);
            this.f38564x++;
            return this.f38561u;
        }
        this.f38556p = 2;
        this.f38563w++;
        this.f38560t = 0;
        return v();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i17, int i18) {
        if (i17 < 0) {
            throw new java.lang.IndexOutOfBoundsException("offs(" + i17 + ") < 0.");
        }
        if (i18 >= 0) {
            int i19 = i17 + i18;
            if (i19 <= bArr.length) {
                if (this.f38554n == null) {
                    throw new java.io.IOException("Stream closed");
                }
                if (i18 == 0) {
                    return 0;
                }
                int i27 = i17;
                while (i27 < i19) {
                    int k17 = k();
                    if (k17 < 0) {
                        break;
                    }
                    bArr[i27] = (byte) k17;
                    a(1);
                    i27++;
                }
                if (i27 == i17) {
                    return -1;
                }
                return i27 - i17;
            }
            throw new java.lang.IndexOutOfBoundsException("offs(" + i17 + ") + len(" + i18 + ") > dest.length(" + bArr.length + ").");
        }
        throw new java.lang.IndexOutOfBoundsException("len(" + i18 + ") < 0.");
    }
}

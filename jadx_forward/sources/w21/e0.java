package w21;

/* loaded from: classes14.dex */
public class e0 {

    /* renamed from: a, reason: collision with root package name */
    public short[] f523877a;

    /* renamed from: b, reason: collision with root package name */
    public short[] f523878b;

    /* renamed from: c, reason: collision with root package name */
    public short[] f523879c;

    /* renamed from: e, reason: collision with root package name */
    public int f523881e;

    /* renamed from: f, reason: collision with root package name */
    public int f523882f;

    /* renamed from: g, reason: collision with root package name */
    public int f523883g;

    /* renamed from: h, reason: collision with root package name */
    public int f523884h;

    /* renamed from: i, reason: collision with root package name */
    public int f523885i;

    /* renamed from: j, reason: collision with root package name */
    public int f523886j;

    /* renamed from: k, reason: collision with root package name */
    public int f523887k;

    /* renamed from: l, reason: collision with root package name */
    public int f523888l;

    /* renamed from: m, reason: collision with root package name */
    public int f523889m;

    /* renamed from: n, reason: collision with root package name */
    public int f523890n;

    /* renamed from: p, reason: collision with root package name */
    public int f523892p;

    /* renamed from: q, reason: collision with root package name */
    public int f523893q;

    /* renamed from: r, reason: collision with root package name */
    public int f523894r;

    /* renamed from: o, reason: collision with root package name */
    public int f523891o = 0;

    /* renamed from: d, reason: collision with root package name */
    public float f523880d = 1.0f;

    public e0(int i17, int i18) {
        this.f523886j = i17 / 400;
        int i19 = i17 / 65;
        this.f523887k = i19;
        int i27 = i19 * 2;
        this.f523888l = i27;
        this.f523882f = i27;
        int i28 = i27 * i18;
        this.f523877a = new short[i28];
        this.f523883g = i27;
        this.f523878b = new short[i28];
        this.f523879c = new short[i27];
        this.f523890n = i17;
        this.f523881e = i18;
    }

    public final void a(short[] sArr, int i17, int i18) {
        int i19 = this.f523888l / i18;
        int i27 = this.f523881e;
        int i28 = i18 * i27;
        int i29 = i17 * i27;
        for (int i37 = 0; i37 < i19; i37++) {
            int i38 = 0;
            for (int i39 = 0; i39 < i28; i39++) {
                i38 += sArr[(i37 * i28) + i29 + i39];
            }
            this.f523879c[i37] = (short) (i38 / i28);
        }
    }

    public final void b(int i17) {
        int i18 = this.f523885i + i17;
        int i19 = this.f523883g;
        if (i18 > i19) {
            int i27 = i19 + (i19 >> 1) + i17;
            this.f523883g = i27;
            short[] sArr = this.f523878b;
            int i28 = i27 * this.f523881e;
            short[] sArr2 = new short[i28];
            java.lang.System.arraycopy(sArr, 0, sArr2, 0, java.lang.Math.min(sArr.length, i28));
            this.f523878b = sArr2;
        }
    }

    public final int c(short[] sArr, int i17, int i18, int i19) {
        int i27 = i17 * this.f523881e;
        int i28 = 255;
        int i29 = 1;
        int i37 = 0;
        int i38 = 0;
        while (i18 <= i19) {
            int i39 = 0;
            for (int i47 = 0; i47 < i18; i47++) {
                short s17 = sArr[i27 + i47];
                short s18 = sArr[i27 + i18 + i47];
                i39 += s17 >= s18 ? s17 - s18 : s18 - s17;
            }
            if (i39 * i37 < i29 * i18) {
                i37 = i18;
                i29 = i39;
            }
            if (i39 * i28 > i38 * i18) {
                i28 = i18;
                i38 = i39;
            }
            i18++;
        }
        this.f523893q = i29 / i37;
        this.f523894r = i38 / i28;
        return i37;
    }

    public void d() {
        int i17;
        int i18 = this.f523884h;
        int i19 = this.f523885i + ((int) ((i18 / this.f523880d) + 0 + 0.5f));
        int i27 = (this.f523888l * 2) + i18;
        int i28 = i18 + i27;
        int i29 = this.f523882f;
        if (i28 > i29) {
            int i37 = i29 + (i29 >> 1) + i27;
            this.f523882f = i37;
            short[] sArr = this.f523877a;
            int i38 = i37 * this.f523881e;
            short[] sArr2 = new short[i38];
            java.lang.System.arraycopy(sArr, 0, sArr2, 0, java.lang.Math.min(sArr.length, i38));
            this.f523877a = sArr2;
        }
        int i39 = 0;
        while (true) {
            i17 = this.f523888l * 2;
            int i47 = this.f523881e;
            if (i39 >= i17 * i47) {
                break;
            }
            this.f523877a[(i47 * i18) + i39] = 0;
            i39++;
        }
        this.f523884h += i17;
        f();
        if (this.f523885i > i19) {
            this.f523885i = i19;
        }
        this.f523884h = 0;
        this.f523889m = 0;
    }

    public final void e(int i17, int i18, short[] sArr, int i19, short[] sArr2, int i27, short[] sArr3, int i28) {
        for (int i29 = 0; i29 < i18; i29++) {
            int i37 = (i19 * i18) + i29;
            int i38 = (i28 * i18) + i29;
            int i39 = (i27 * i18) + i29;
            for (int i47 = 0; i47 < i17; i47++) {
                sArr[i37] = (short) (((sArr2[i39] * (i17 - i47)) + (sArr3[i38] * i47)) / i17);
                i37 += i18;
                i39 += i18;
                i38 += i18;
            }
        }
    }

    public final void f() {
        int i17;
        int i18;
        int i19;
        float f17 = this.f523880d;
        double d17 = f17;
        int i27 = 0;
        if (d17 <= 1.00001d && d17 >= 0.99999d) {
            short[] sArr = this.f523877a;
            int i28 = this.f523884h;
            b(i28);
            short[] sArr2 = this.f523878b;
            int i29 = this.f523885i;
            int i37 = this.f523881e;
            java.lang.System.arraycopy(sArr, 0 * i37, sArr2, i29 * i37, i37 * i28);
            this.f523885i += i28;
            this.f523884h = 0;
            return;
        }
        int i38 = this.f523884h;
        if (i38 < this.f523888l) {
            return;
        }
        int i39 = 0;
        while (true) {
            int i47 = this.f523889m;
            if (i47 > 0) {
                int i48 = this.f523888l;
                if (i47 > i48) {
                    i47 = i48;
                }
                short[] sArr3 = this.f523877a;
                b(i47);
                short[] sArr4 = this.f523878b;
                int i49 = this.f523885i;
                int i57 = this.f523881e;
                java.lang.System.arraycopy(sArr3, i39 * i57, sArr4, i49 * i57, i57 * i47);
                this.f523885i += i47;
                this.f523889m -= i47;
                i39 += i47;
            } else {
                short[] sArr5 = this.f523877a;
                int i58 = this.f523890n;
                int i59 = i58 > 4000 ? i58 / 4000 : 1;
                if (this.f523881e == 1 && i59 == 1) {
                    i17 = c(sArr5, i39, this.f523886j, this.f523887k);
                } else {
                    a(sArr5, i39, i59);
                    int c17 = c(this.f523879c, i27, this.f523886j / i59, this.f523887k / i59);
                    if (i59 != 1) {
                        int i66 = c17 * i59;
                        int i67 = i59 << 2;
                        int i68 = i66 - i67;
                        int i69 = i66 + i67;
                        int i76 = this.f523886j;
                        if (i68 < i76) {
                            i68 = i76;
                        }
                        int i77 = this.f523887k;
                        if (i69 > i77) {
                            i69 = i77;
                        }
                        if (this.f523881e == 1) {
                            i17 = c(sArr5, i39, i68, i69);
                        } else {
                            a(sArr5, i39, 1);
                            i17 = c(this.f523879c, i27, i68, i69);
                        }
                    } else {
                        i17 = c17;
                    }
                }
                int i78 = this.f523893q;
                int i79 = ((i78 == 0 || this.f523891o == 0 || this.f523894r > i78 * 3 || i78 * 2 <= this.f523892p * 3) ? i27 : 1) != 0 ? this.f523891o : i17;
                this.f523892p = i78;
                this.f523891o = i17;
                if (d17 > 1.0d) {
                    short[] sArr6 = this.f523877a;
                    if (f17 >= 2.0f) {
                        i19 = (int) (i79 / (f17 - 1.0f));
                    } else {
                        this.f523889m = (int) ((i79 * (2.0f - f17)) / (f17 - 1.0f));
                        i19 = i79;
                    }
                    b(i19);
                    int i86 = i19;
                    e(i19, this.f523881e, this.f523878b, this.f523885i, sArr6, i39, sArr6, i39 + i79);
                    this.f523885i += i86;
                    i39 += i79 + i86;
                } else {
                    int i87 = i79;
                    short[] sArr7 = this.f523877a;
                    if (f17 < 0.5f) {
                        i18 = (int) ((i87 * f17) / (1.0f - f17));
                    } else {
                        this.f523889m = (int) ((i87 * ((2.0f * f17) - 1.0f)) / (1.0f - f17));
                        i18 = i87;
                    }
                    int i88 = i87 + i18;
                    b(i88);
                    short[] sArr8 = this.f523878b;
                    int i89 = this.f523885i;
                    int i96 = this.f523881e;
                    java.lang.System.arraycopy(sArr7, i39 * i96, sArr8, i89 * i96, i96 * i87);
                    e(i18, this.f523881e, this.f523878b, this.f523885i + i87, sArr7, i39 + i87, sArr7, i39);
                    this.f523885i += i88;
                    i39 += i18;
                }
            }
            if (this.f523888l + i39 > i38) {
                int i97 = this.f523884h - i39;
                short[] sArr9 = this.f523877a;
                int i98 = this.f523881e;
                java.lang.System.arraycopy(sArr9, i39 * i98, sArr9, 0 * i98, i98 * i97);
                this.f523884h = i97;
                return;
            }
            i27 = 0;
        }
    }

    public int g(short[] sArr, int i17) {
        int i18;
        int i19 = this.f523885i;
        if (i19 == 0) {
            return 0;
        }
        if (i19 > i17) {
            i18 = i19 - i17;
        } else {
            i17 = i19;
            i18 = 0;
        }
        short[] sArr2 = this.f523878b;
        int i27 = this.f523881e;
        int i28 = 0 * i27;
        java.lang.System.arraycopy(sArr2, i28, sArr, i28, i27 * i17);
        short[] sArr3 = this.f523878b;
        int i29 = this.f523881e;
        java.lang.System.arraycopy(sArr3, i17 * i29, sArr3, 0 * i29, i29 * i18);
        this.f523885i = i18;
        return i17;
    }

    public void h(byte[] bArr, int i17) {
        int i18 = this.f523881e;
        int i19 = i17 / (i18 * 2);
        int i27 = this.f523884h + i19;
        int i28 = this.f523882f;
        if (i27 > i28) {
            int i29 = i28 + (i28 >> 1) + i19;
            this.f523882f = i29;
            short[] sArr = this.f523877a;
            int i37 = i29 * i18;
            short[] sArr2 = new short[i37];
            java.lang.System.arraycopy(sArr, 0, sArr2, 0, java.lang.Math.min(sArr.length, i37));
            this.f523877a = sArr2;
        }
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        wrap.order(java.nio.ByteOrder.nativeOrder());
        wrap.asShortBuffer().get(this.f523877a, this.f523884h * this.f523881e, i17 / 2);
        this.f523884h += i19;
        f();
    }
}

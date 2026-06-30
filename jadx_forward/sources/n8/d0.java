package n8;

/* loaded from: classes15.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f417017a;

    /* renamed from: b, reason: collision with root package name */
    public final int f417018b;

    /* renamed from: c, reason: collision with root package name */
    public final int f417019c;

    /* renamed from: d, reason: collision with root package name */
    public final int f417020d;

    /* renamed from: e, reason: collision with root package name */
    public final int f417021e;

    /* renamed from: f, reason: collision with root package name */
    public final short[] f417022f;

    /* renamed from: g, reason: collision with root package name */
    public int f417023g;

    /* renamed from: h, reason: collision with root package name */
    public short[] f417024h;

    /* renamed from: i, reason: collision with root package name */
    public int f417025i;

    /* renamed from: j, reason: collision with root package name */
    public short[] f417026j;

    /* renamed from: k, reason: collision with root package name */
    public int f417027k;

    /* renamed from: l, reason: collision with root package name */
    public short[] f417028l;

    /* renamed from: q, reason: collision with root package name */
    public int f417033q;

    /* renamed from: r, reason: collision with root package name */
    public int f417034r;

    /* renamed from: s, reason: collision with root package name */
    public int f417035s;

    /* renamed from: t, reason: collision with root package name */
    public int f417036t;

    /* renamed from: v, reason: collision with root package name */
    public int f417038v;

    /* renamed from: w, reason: collision with root package name */
    public int f417039w;

    /* renamed from: x, reason: collision with root package name */
    public int f417040x;

    /* renamed from: m, reason: collision with root package name */
    public int f417029m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f417030n = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f417037u = 0;

    /* renamed from: o, reason: collision with root package name */
    public float f417031o = 1.0f;

    /* renamed from: p, reason: collision with root package name */
    public float f417032p = 1.0f;

    public d0(int i17, int i18) {
        this.f417017a = i17;
        this.f417018b = i18;
        this.f417019c = i17 / 400;
        int i19 = i17 / 65;
        this.f417020d = i19;
        int i27 = i19 * 2;
        this.f417021e = i27;
        this.f417022f = new short[i27];
        this.f417023g = i27;
        this.f417024h = new short[i27 * i18];
        this.f417025i = i27;
        this.f417026j = new short[i27 * i18];
        this.f417027k = i27;
        this.f417028l = new short[i27 * i18];
    }

    public static void d(int i17, int i18, short[] sArr, int i19, short[] sArr2, int i27, short[] sArr3, int i28) {
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

    public final void a(short[] sArr, int i17, int i18) {
        int i19 = this.f417021e / i18;
        int i27 = this.f417018b;
        int i28 = i18 * i27;
        int i29 = i17 * i27;
        for (int i37 = 0; i37 < i19; i37++) {
            int i38 = 0;
            for (int i39 = 0; i39 < i28; i39++) {
                i38 += sArr[(i37 * i28) + i29 + i39];
            }
            this.f417022f[i37] = (short) (i38 / i28);
        }
    }

    public final void b(int i17) {
        int i18 = this.f417034r + i17;
        int i19 = this.f417025i;
        if (i18 > i19) {
            int i27 = i19 + (i19 / 2) + i17;
            this.f417025i = i27;
            this.f417026j = java.util.Arrays.copyOf(this.f417026j, i27 * this.f417018b);
        }
    }

    public final int c(short[] sArr, int i17, int i18, int i19) {
        int i27 = i17 * this.f417018b;
        int i28 = 255;
        int i29 = 1;
        int i37 = 0;
        int i38 = 0;
        while (i18 <= i19) {
            int i39 = 0;
            for (int i47 = 0; i47 < i18; i47++) {
                i39 += java.lang.Math.abs(sArr[i27 + i47] - sArr[(i27 + i18) + i47]);
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
        this.f417039w = i29 / i37;
        this.f417040x = i38 / i28;
        return i37;
    }

    public final void e() {
        int i17;
        int i18;
        int i19;
        int i27;
        int i28;
        float f17;
        int i29;
        int i37;
        int i38;
        int i39;
        int i47;
        int i48 = this.f417034r;
        float f18 = this.f417031o / this.f417032p;
        double d17 = f18;
        int i49 = this.f417017a;
        int i57 = this.f417018b;
        if (d17 > 1.00001d || d17 < 0.99999d) {
            int i58 = this.f417033q;
            int i59 = this.f417021e;
            if (i58 >= i59) {
                int i66 = 0;
                while (true) {
                    int i67 = this.f417036t;
                    if (i67 > 0) {
                        int min = java.lang.Math.min(i59, i67);
                        short[] sArr = this.f417024h;
                        b(min);
                        java.lang.System.arraycopy(sArr, i66 * i57, this.f417026j, this.f417034r * i57, i57 * min);
                        this.f417034r += min;
                        this.f417036t -= min;
                        i66 += min;
                        i18 = i48;
                        i17 = i49;
                    } else {
                        short[] sArr2 = this.f417024h;
                        int i68 = i49 > 4000 ? i49 / 4000 : 1;
                        int i69 = this.f417020d;
                        int i76 = this.f417019c;
                        if (i57 == 1 && i68 == 1) {
                            i19 = c(sArr2, i66, i76, i69);
                            i18 = i48;
                            i17 = i49;
                        } else {
                            a(sArr2, i66, i68);
                            i17 = i49;
                            short[] sArr3 = this.f417022f;
                            i18 = i48;
                            int c17 = c(sArr3, 0, i76 / i68, i69 / i68);
                            if (i68 != 1) {
                                int i77 = c17 * i68;
                                int i78 = i68 * 4;
                                int i79 = i77 - i78;
                                int i86 = i77 + i78;
                                if (i79 >= i76) {
                                    i76 = i79;
                                }
                                if (i86 <= i69) {
                                    i69 = i86;
                                }
                                if (i57 == 1) {
                                    i19 = c(sArr2, i66, i76, i69);
                                } else {
                                    a(sArr2, i66, 1);
                                    i19 = c(sArr3, 0, i76, i69);
                                }
                            } else {
                                i19 = c17;
                            }
                        }
                        int i87 = this.f417039w;
                        int i88 = i87 != 0 && this.f417037u != 0 && this.f417040x <= i87 * 3 && i87 * 2 > this.f417038v * 3 ? this.f417037u : i19;
                        this.f417038v = i87;
                        this.f417037u = i19;
                        if (d17 > 1.0d) {
                            short[] sArr4 = this.f417024h;
                            if (f18 >= 2.0f) {
                                i28 = (int) (i88 / (f18 - 1.0f));
                            } else {
                                this.f417036t = (int) ((i88 * (2.0f - f18)) / (f18 - 1.0f));
                                i28 = i88;
                            }
                            b(i28);
                            int i89 = i66;
                            d(i28, this.f417018b, this.f417026j, this.f417034r, sArr4, i89, sArr4, i66 + i88);
                            this.f417034r += i28;
                            i66 = i89 + i88 + i28;
                        } else {
                            int i96 = i66;
                            short[] sArr5 = this.f417024h;
                            if (f18 < 0.5f) {
                                i27 = (int) ((i88 * f18) / (1.0f - f18));
                            } else {
                                this.f417036t = (int) ((i88 * ((2.0f * f18) - 1.0f)) / (1.0f - f18));
                                i27 = i88;
                            }
                            int i97 = i88 + i27;
                            b(i97);
                            java.lang.System.arraycopy(sArr5, i96 * i57, this.f417026j, this.f417034r * i57, i57 * i88);
                            d(i27, this.f417018b, this.f417026j, this.f417034r + i88, sArr5, i96 + i88, sArr5, i96);
                            this.f417034r += i97;
                            i66 = i96 + i27;
                        }
                    }
                    if (i66 + i59 > i58) {
                        break;
                    }
                    i49 = i17;
                    i48 = i18;
                }
                int i98 = this.f417033q - i66;
                short[] sArr6 = this.f417024h;
                java.lang.System.arraycopy(sArr6, i66 * i57, sArr6, 0, i57 * i98);
                this.f417033q = i98;
                f17 = this.f417032p;
                if (f17 != 1.0f || this.f417034r == (i29 = i18)) {
                }
                int i99 = i17;
                int i100 = (int) (i99 / f17);
                while (true) {
                    if (i100 <= 16384 && i99 <= 16384) {
                        break;
                    }
                    i100 /= 2;
                    i99 /= 2;
                }
                int i101 = this.f417034r - i29;
                int i102 = this.f417035s + i101;
                int i103 = this.f417027k;
                if (i102 > i103) {
                    int i104 = i103 + (i103 / 2) + i101;
                    this.f417027k = i104;
                    this.f417028l = java.util.Arrays.copyOf(this.f417028l, i104 * i57);
                }
                java.lang.System.arraycopy(this.f417026j, i29 * i57, this.f417028l, this.f417035s * i57, i57 * i101);
                this.f417034r = i29;
                this.f417035s += i101;
                int i105 = 0;
                while (true) {
                    i37 = this.f417035s;
                    i38 = i37 - 1;
                    if (i105 >= i38) {
                        break;
                    }
                    while (true) {
                        i39 = this.f417029m + 1;
                        int i106 = i39 * i100;
                        i47 = this.f417030n;
                        if (i106 <= i47 * i99) {
                            break;
                        }
                        b(1);
                        for (int i107 = 0; i107 < i57; i107++) {
                            short[] sArr7 = this.f417026j;
                            int i108 = (this.f417034r * i57) + i107;
                            short[] sArr8 = this.f417028l;
                            int i109 = (i105 * i57) + i107;
                            short s17 = sArr8[i109];
                            short s18 = sArr8[i109 + i57];
                            int i110 = this.f417030n * i99;
                            int i111 = this.f417029m;
                            int i112 = i111 * i100;
                            int i113 = (i111 + 1) * i100;
                            int i114 = i113 - i110;
                            int i115 = i113 - i112;
                            sArr7[i108] = (short) (((s17 * i114) + ((i115 - i114) * s18)) / i115);
                        }
                        this.f417030n++;
                        this.f417034r++;
                    }
                    this.f417029m = i39;
                    if (i39 == i99) {
                        this.f417029m = 0;
                        t9.a.d(i47 == i100);
                        this.f417030n = 0;
                    }
                    i105++;
                }
                if (i38 == 0) {
                    return;
                }
                short[] sArr9 = this.f417028l;
                java.lang.System.arraycopy(sArr9, i38 * i57, sArr9, 0, (i37 - i38) * i57);
                this.f417035s -= i38;
                return;
            }
        } else {
            short[] sArr10 = this.f417024h;
            int i116 = this.f417033q;
            b(i116);
            java.lang.System.arraycopy(sArr10, 0 * i57, this.f417026j, this.f417034r * i57, i57 * i116);
            this.f417034r += i116;
            this.f417033q = 0;
        }
        i18 = i48;
        i17 = i49;
        f17 = this.f417032p;
        if (f17 != 1.0f) {
        }
    }
}

package ks5;

/* loaded from: classes15.dex */
public class d implements ks5.b {

    /* renamed from: x, reason: collision with root package name */
    public static final android.text.TextPaint f393364x = new android.text.TextPaint(1);

    /* renamed from: d, reason: collision with root package name */
    public final ks5.c f393365d;

    /* renamed from: e, reason: collision with root package name */
    public final char[] f393366e;

    /* renamed from: f, reason: collision with root package name */
    public final int f393367f;

    /* renamed from: g, reason: collision with root package name */
    public final int f393368g;

    /* renamed from: h, reason: collision with root package name */
    public final int f393369h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f393370i;

    /* renamed from: m, reason: collision with root package name */
    public final float f393371m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f393372n;

    /* renamed from: o, reason: collision with root package name */
    public final float f393373o;

    /* renamed from: p, reason: collision with root package name */
    public final float f393374p;

    /* renamed from: q, reason: collision with root package name */
    public float f393375q = -1.0f;

    /* renamed from: r, reason: collision with root package name */
    public final float f393376r;

    /* renamed from: s, reason: collision with root package name */
    public final float f393377s;

    /* renamed from: t, reason: collision with root package name */
    public final android.graphics.RectF f393378t;

    /* renamed from: u, reason: collision with root package name */
    public final android.graphics.RectF f393379u;

    /* renamed from: v, reason: collision with root package name */
    public final int f393380v;

    /* renamed from: w, reason: collision with root package name */
    public final float f393381w;

    public d(ks5.c cVar, char[] cArr, int i17, int i18, float f17, float f18, float[] fArr, float f19, float f27, float f28, android.text.TextPaint textPaint, boolean z17, float f29, int i19, int i27, float f37) {
        this.f393376r = 0.0f;
        this.f393377s = 0.0f;
        android.graphics.RectF rectF = new android.graphics.RectF();
        this.f393378t = rectF;
        android.graphics.RectF rectF2 = new android.graphics.RectF();
        this.f393379u = rectF2;
        this.f393365d = cVar;
        this.f393366e = cArr;
        this.f393367f = i17;
        this.f393368g = i18;
        this.f393369h = i19;
        this.f393370i = fArr;
        this.f393371m = f28;
        this.f393376r = f29;
        this.f393372n = z17;
        this.f393373o = f27;
        this.f393374p = f19;
        this.f393377s = f37;
        this.f393380v = i27;
        android.graphics.Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        float f38 = fontMetrics.leading;
        float f39 = fontMetrics.top;
        float f47 = f38 - f39;
        float f48 = fontMetrics.bottom;
        float f49 = f48 - f38;
        float f57 = (f18 + (((f27 - f48) + f39) / 2.0f)) - f39;
        this.f393381w = f57;
        rectF.set(f17, f57 - f47, f19 + f17, f49 + f57);
        rectF2.set(f17, f57 - f47, f17 + f37, rectF.top + f27);
    }

    public float a() {
        float f17;
        float f18 = this.f393375q;
        if (f18 != -1.0f) {
            return f18;
        }
        int i17 = this.f393380v & 7;
        int i18 = this.f393367f;
        if (i17 == 1) {
            int i19 = i18;
            int i27 = i19;
            float f19 = 0.0f;
            while (true) {
                int i28 = this.f393368g;
                if (i19 >= i28) {
                    break;
                }
                i19++;
                float[] fArr = this.f393370i;
                if (i19 >= i28 || fArr[i19] != 0.0f) {
                    f19 += fArr[i27] + this.f393371m;
                    i27 = i19;
                }
            }
            f17 = (this.f393377s - f19) / 2.0f;
        } else {
            f17 = 0.0f;
        }
        float max = java.lang.Math.max(0.0f, f17);
        ks5.c cVar = this.f393365d;
        if (cVar.f393359v.a(i18, i18 + 1) == null) {
            java.util.HashMap hashMap = cVar.f393346i;
            char[] cArr = this.f393366e;
            if (hashMap.containsKey(java.lang.Character.valueOf(cArr[i18]))) {
                float floatValue = max - ((java.lang.Float) cVar.f393346i.get(java.lang.Character.valueOf(cArr[i18]))).floatValue();
                this.f393375q = floatValue;
                return floatValue;
            }
        }
        this.f393375q = max;
        return max;
    }

    public int b(int i17, int i18) {
        int i19;
        float f17;
        float[] fArr;
        android.graphics.RectF rectF = this.f393378t;
        float a17 = rectF.left + a();
        int i27 = this.f393367f;
        int i28 = i27;
        int i29 = i28;
        int i37 = i29;
        while (true) {
            boolean z17 = false;
            while (true) {
                i19 = this.f393368g;
                if (i28 >= i19) {
                    return i19;
                }
                i28++;
                f17 = this.f393376r;
                fArr = this.f393370i;
                if (i28 >= i19) {
                    break;
                }
                float f18 = fArr[i28];
                if (f18 != 0.0f) {
                    if (!z17) {
                        z17 = this.f393372n && f18 == f17;
                        if (!z17) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i29++;
            }
            if (z17) {
                a17 += f17;
            }
            float f19 = fArr[i37] + this.f393371m + a17;
            float f27 = i17;
            if (a17 <= f27 && f27 < f19) {
                return i29;
            }
            if (a17 > f27) {
                return i27;
            }
            if (f27 > rectF.right) {
                return i19 == this.f393366e.length ? i19 : i19 - 1;
            }
            i29++;
            i37 = i28;
            a17 = f19;
        }
    }

    public float c(int i17) {
        float f17;
        float[] fArr;
        float a17 = this.f393378t.left + a();
        int i18 = this.f393367f;
        loop0: while (true) {
            int i19 = i18;
            boolean z17 = false;
            while (true) {
                int i27 = this.f393368g;
                if (i18 < i27 && i18 < i17) {
                    i18++;
                    f17 = this.f393376r;
                    fArr = this.f393370i;
                    if (i18 >= i27) {
                        break;
                    }
                    float f18 = fArr[i18];
                    if (f18 != 0.0f) {
                        if (!z17) {
                            z17 = this.f393372n && f18 == f17;
                            if (!z17) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    break loop0;
                }
            }
            if (z17) {
                a17 += f17;
            }
            a17 += fArr[i19] + this.f393371m;
        }
        return a17;
    }

    public android.graphics.RectF d(int i17, int i18) {
        float f17;
        float[] fArr;
        android.graphics.RectF rectF = new android.graphics.RectF();
        if (i17 >= i18) {
            return rectF;
        }
        float a17 = a();
        int i19 = this.f393367f;
        while (true) {
            f17 = this.f393371m;
            fArr = this.f393370i;
            if (i19 >= i17) {
                break;
            }
            a17 += fArr[i19] + f17;
            i19++;
        }
        float f18 = a17;
        while (i17 < i18) {
            f18 += fArr[i17] + f17;
            i17++;
        }
        android.graphics.RectF rectF2 = this.f393378t;
        rectF.set(a17, rectF2.top, f18, rectF2.bottom);
        return rectF;
    }

    /* renamed from: equals */
    public boolean m144268xb2c87fbf(java.lang.Object obj) {
        if (obj != null && (obj instanceof ks5.b)) {
            ks5.b bVar = (ks5.b) obj;
            int i17 = ((ks5.d) bVar).f393367f;
            int i18 = this.f393367f;
            if (i17 == i18) {
                ks5.d dVar = (ks5.d) bVar;
                int i19 = this.f393368g;
                if (dVar.f393368g == i19 && dVar.f393378t.equals(this.f393378t)) {
                    if (dVar.f393372n == this.f393372n) {
                        if (dVar.f393371m == this.f393371m && dVar.a() == this.f393375q) {
                            while (i18 < i19) {
                                if (this.f393370i[i18] != dVar.f393370i[i18]) {
                                    return false;
                                }
                                i18++;
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m144269x8cdac1b() {
        return this.f393367f + this.f393368g + ((int) this.f393373o) + ((int) this.f393374p) + ((int) this.f393375q) + this.f393378t.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m144270x9616526c() {
        return "MeasuredLine{mStart=" + this.f393367f + ", mEnd=" + this.f393368g + ", mLetter=" + this.f393371m + ", isSmartLetter=" + this.f393372n + ", mHeight=" + this.f393373o + ", mWidth=" + this.f393374p + ", mLeftOffset=" + this.f393375q + ", mLineRect=" + this.f393378t + ", mLineRect=" + this.f393379u + '}';
    }
}

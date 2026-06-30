package s7;

/* loaded from: classes16.dex */
public class f3 {

    /* renamed from: h, reason: collision with root package name */
    public static java.util.HashSet f485186h;

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Canvas f485187a;

    /* renamed from: b, reason: collision with root package name */
    public final float f485188b;

    /* renamed from: c, reason: collision with root package name */
    public s7.t2 f485189c;

    /* renamed from: d, reason: collision with root package name */
    public s7.b3 f485190d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.Stack f485191e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.Stack f485192f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.Stack f485193g;

    public f3(android.graphics.Canvas canvas, float f17) {
        this.f485187a = canvas;
        this.f485188b = f17;
    }

    public static void a(float f17, float f18, float f19, float f27, float f28, boolean z17, boolean z18, float f29, float f37, s7.b1 b1Var) {
        float f38;
        s7.b1 b1Var2;
        if (f17 == f29 && f18 == f37) {
            return;
        }
        if (f19 == 0.0f) {
            f38 = f37;
            b1Var2 = b1Var;
        } else {
            if (f27 != 0.0f) {
                float abs = java.lang.Math.abs(f19);
                float abs2 = java.lang.Math.abs(f27);
                double radians = java.lang.Math.toRadians(f28 % 360.0d);
                double cos = java.lang.Math.cos(radians);
                double sin = java.lang.Math.sin(radians);
                double d17 = (f17 - f29) / 2.0d;
                double d18 = (f18 - f37) / 2.0d;
                double d19 = (cos * d17) + (sin * d18);
                double d27 = ((-sin) * d17) + (d18 * cos);
                double d28 = abs * abs;
                double d29 = abs2 * abs2;
                double d37 = d19 * d19;
                double d38 = d27 * d27;
                double d39 = (d37 / d28) + (d38 / d29);
                if (d39 > 0.99999d) {
                    double sqrt = java.lang.Math.sqrt(d39) * 1.00001d;
                    abs = (float) (abs * sqrt);
                    abs2 = (float) (sqrt * abs2);
                    d28 = abs * abs;
                    d29 = abs2 * abs2;
                }
                double d47 = z17 == z18 ? -1.0d : 1.0d;
                double d48 = d28 * d29;
                double d49 = d28 * d38;
                double d57 = d29 * d37;
                double d58 = ((d48 - d49) - d57) / (d49 + d57);
                if (d58 < 0.0d) {
                    d58 = 0.0d;
                }
                double sqrt2 = d47 * java.lang.Math.sqrt(d58);
                double d59 = abs;
                double d66 = abs2;
                double d67 = ((d59 * d27) / d66) * sqrt2;
                float f39 = abs;
                float f47 = abs2;
                double d68 = sqrt2 * (-((d66 * d19) / d59));
                double d69 = ((f17 + f29) / 2.0d) + ((cos * d67) - (sin * d68));
                double d76 = ((f18 + f37) / 2.0d) + (sin * d67) + (cos * d68);
                double d77 = (d19 - d67) / d59;
                double d78 = (d27 - d68) / d66;
                double d79 = ((-d19) - d67) / d59;
                double d86 = ((-d27) - d68) / d66;
                double d87 = (d77 * d77) + (d78 * d78);
                double acos = (d78 < 0.0d ? -1.0d : 1.0d) * java.lang.Math.acos(d77 / java.lang.Math.sqrt(d87));
                double sqrt3 = ((d77 * d79) + (d78 * d86)) / java.lang.Math.sqrt(d87 * ((d79 * d79) + (d86 * d86)));
                double acos2 = ((d77 * d86) - (d78 * d79) < 0.0d ? -1.0d : 1.0d) * (sqrt3 < -1.0d ? 3.141592653589793d : sqrt3 > 1.0d ? 0.0d : java.lang.Math.acos(sqrt3));
                if (acos2 == 0.0d) {
                    b1Var.b(f29, f37);
                    return;
                }
                if (!z18 && acos2 > 0.0d) {
                    acos2 -= 6.283185307179586d;
                } else if (z18 && acos2 < 0.0d) {
                    acos2 += 6.283185307179586d;
                }
                double d88 = acos2 % 6.283185307179586d;
                double d89 = acos % 6.283185307179586d;
                int ceil = (int) java.lang.Math.ceil((java.lang.Math.abs(d88) * 2.0d) / 3.141592653589793d);
                double d96 = d88 / ceil;
                double d97 = d96 / 2.0d;
                double sin2 = (java.lang.Math.sin(d97) * 1.3333333333333333d) / (java.lang.Math.cos(d97) + 1.0d);
                int i17 = ceil * 6;
                float[] fArr = new float[i17];
                int i18 = 0;
                int i19 = 0;
                while (i18 < ceil) {
                    double d98 = (i18 * d96) + d89;
                    double cos2 = java.lang.Math.cos(d98);
                    double sin3 = java.lang.Math.sin(d98);
                    int i27 = i19 + 1;
                    int i28 = ceil;
                    int i29 = i17;
                    fArr[i19] = (float) (cos2 - (sin2 * sin3));
                    int i37 = i27 + 1;
                    double d99 = d76;
                    fArr[i27] = (float) (sin3 + (cos2 * sin2));
                    double d100 = d98 + d96;
                    double cos3 = java.lang.Math.cos(d100);
                    double sin4 = java.lang.Math.sin(d100);
                    int i38 = i37 + 1;
                    double d101 = d96;
                    fArr[i37] = (float) ((sin2 * sin4) + cos3);
                    int i39 = i38 + 1;
                    fArr[i38] = (float) (sin4 - (sin2 * cos3));
                    int i47 = i39 + 1;
                    fArr[i39] = (float) cos3;
                    i19 = i47 + 1;
                    fArr[i47] = (float) sin4;
                    i18++;
                    d76 = d99;
                    d96 = d101;
                    sin2 = sin2;
                    ceil = i28;
                    i17 = i29;
                }
                int i48 = i17;
                android.graphics.Matrix matrix = new android.graphics.Matrix();
                matrix.postScale(f39, f47);
                matrix.postRotate(f28);
                matrix.postTranslate((float) d69, (float) d76);
                matrix.mapPoints(fArr);
                fArr[i48 - 2] = f29;
                fArr[i48 - 1] = f37;
                for (int i49 = 0; i49 < i48; i49 += 6) {
                    b1Var.d(fArr[i49], fArr[i49 + 1], fArr[i49 + 2], fArr[i49 + 3], fArr[i49 + 4], fArr[i49 + 5]);
                }
                return;
            }
            f38 = f37;
            b1Var2 = b1Var;
        }
        b1Var2.b(f29, f38);
    }

    public static int i(int i17, float f17) {
        int i18 = 255;
        int round = java.lang.Math.round(((i17 >> 24) & 255) * f17);
        if (round < 0) {
            i18 = 0;
        } else if (round <= 255) {
            i18 = round;
        }
        return (i17 & 16777215) | (i18 << 24);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Path A(s7.f1 r24) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.f3.A(s7.f1):android.graphics.Path");
    }

    public final s7.f0 B(s7.t0 t0Var, s7.t0 t0Var2, s7.t0 t0Var3, s7.t0 t0Var4) {
        float d17 = t0Var != null ? t0Var.d(this) : 0.0f;
        float e17 = t0Var2 != null ? t0Var2.e(this) : 0.0f;
        s7.b3 b3Var = this.f485190d;
        s7.f0 f0Var = b3Var.f485133g;
        if (f0Var == null) {
            f0Var = b3Var.f485132f;
        }
        return new s7.f0(d17, e17, t0Var3 != null ? t0Var3.d(this) : f0Var.f485178c, t0Var4 != null ? t0Var4.e(this) : f0Var.f485179d);
    }

    public final android.graphics.Path C(s7.x1 x1Var, boolean z17) {
        android.graphics.Path path;
        android.graphics.Path b17;
        this.f485191e.push(this.f485190d);
        s7.b3 b3Var = new s7.b3(this, this.f485190d);
        this.f485190d = b3Var;
        U(b3Var, x1Var);
        if (!k() || !W()) {
            this.f485190d = (s7.b3) this.f485191e.pop();
            return null;
        }
        if (x1Var instanceof s7.r2) {
            if (!z17) {
                java.lang.String.format("<use> elements inside a <clipPath> cannot reference another <use>", new java.lang.Object[0]);
            }
            s7.r2 r2Var = (s7.r2) x1Var;
            s7.a2 h17 = x1Var.f485118a.h(r2Var.f485342o);
            if (h17 == null) {
                java.lang.String.format("Use reference '%s' not found", r2Var.f485342o);
                this.f485190d = (s7.b3) this.f485191e.pop();
                return null;
            }
            if (!(h17 instanceof s7.x1)) {
                this.f485190d = (s7.b3) this.f485191e.pop();
                return null;
            }
            path = C((s7.x1) h17, false);
            if (path == null) {
                return null;
            }
            if (r2Var.f485423h == null) {
                r2Var.f485423h = c(path);
            }
            android.graphics.Matrix matrix = r2Var.f485307n;
            if (matrix != null) {
                path.transform(matrix);
            }
        } else if (x1Var instanceof s7.p0) {
            s7.p0 p0Var = (s7.p0) x1Var;
            if (x1Var instanceof s7.z0) {
                path = new s7.x2(((s7.z0) x1Var).f485441o).f485424a;
                if (x1Var.f485423h == null) {
                    x1Var.f485423h = c(path);
                }
            } else {
                path = x1Var instanceof s7.f1 ? A((s7.f1) x1Var) : x1Var instanceof s7.h0 ? x((s7.h0) x1Var) : x1Var instanceof s7.m0 ? y((s7.m0) x1Var) : x1Var instanceof s7.d1 ? z((s7.d1) x1Var) : null;
            }
            if (path == null) {
                return null;
            }
            if (p0Var.f485423h == null) {
                p0Var.f485423h = c(path);
            }
            android.graphics.Matrix matrix2 = p0Var.f485298n;
            if (matrix2 != null) {
                path.transform(matrix2);
            }
            path.setFillType(v());
        } else {
            if (!(x1Var instanceof s7.j2)) {
                java.lang.String.format("Invalid %s element found in clipPath definition", x1Var.n());
                return null;
            }
            s7.j2 j2Var = (s7.j2) x1Var;
            java.util.List list = j2Var.f485271n;
            float f17 = 0.0f;
            float d17 = (list == null || ((java.util.ArrayList) list).size() == 0) ? 0.0f : ((s7.t0) ((java.util.ArrayList) j2Var.f485271n).get(0)).d(this);
            java.util.List list2 = j2Var.f485272o;
            float e17 = (list2 == null || ((java.util.ArrayList) list2).size() == 0) ? 0.0f : ((s7.t0) ((java.util.ArrayList) j2Var.f485272o).get(0)).e(this);
            java.util.List list3 = j2Var.f485273p;
            float d18 = (list3 == null || ((java.util.ArrayList) list3).size() == 0) ? 0.0f : ((s7.t0) ((java.util.ArrayList) j2Var.f485273p).get(0)).d(this);
            java.util.List list4 = j2Var.f485274q;
            if (list4 != null && ((java.util.ArrayList) list4).size() != 0) {
                f17 = ((s7.t0) ((java.util.ArrayList) j2Var.f485274q).get(0)).e(this);
            }
            if (this.f485190d.f485127a.A != s7.n1.Start) {
                float d19 = d(j2Var);
                if (this.f485190d.f485127a.A == s7.n1.Middle) {
                    d19 /= 2.0f;
                }
                d17 -= d19;
            }
            if (j2Var.f485423h == null) {
                s7.c3 c3Var = new s7.c3(this, d17, e17);
                n(j2Var, c3Var);
                android.graphics.RectF rectF = c3Var.f485153c;
                j2Var.f485423h = new s7.f0(rectF.left, rectF.top, rectF.width(), rectF.height());
            }
            android.graphics.Path path2 = new android.graphics.Path();
            n(j2Var, new s7.a3(this, d17 + d18, e17 + f17, path2));
            android.graphics.Matrix matrix3 = j2Var.f485229r;
            if (matrix3 != null) {
                path2.transform(matrix3);
            }
            path2.setFillType(v());
            path = path2;
        }
        if (this.f485190d.f485127a.K != null && (b17 = b(x1Var, x1Var.f485423h)) != null) {
            path.op(b17, android.graphics.Path.Op.INTERSECT);
        }
        this.f485190d = (s7.b3) this.f485191e.pop();
        return path;
    }

    public final void D(s7.x1 x1Var) {
        E(x1Var, x1Var.f485423h);
    }

    public final void E(s7.x1 x1Var, s7.f0 f0Var) {
        if (this.f485190d.f485127a.M != null) {
            android.graphics.Paint paint = new android.graphics.Paint();
            paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN));
            android.graphics.Canvas canvas = this.f485187a;
            canvas.saveLayer(null, paint, 31);
            android.graphics.Paint paint2 = new android.graphics.Paint();
            paint2.setColorFilter(new android.graphics.ColorMatrixColorFilter(new android.graphics.ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            canvas.saveLayer(null, paint2, 31);
            s7.w0 w0Var = (s7.w0) this.f485189c.h(this.f485190d.f485127a.M);
            M(w0Var, x1Var, f0Var);
            canvas.restore();
            android.graphics.Paint paint3 = new android.graphics.Paint();
            paint3.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN));
            canvas.saveLayer(null, paint3, 31);
            M(w0Var, x1Var, f0Var);
            canvas.restore();
            canvas.restore();
        }
        P();
    }

    public final boolean F() {
        s7.a2 h17;
        int i17 = 0;
        if (!(this.f485190d.f485127a.f485334s.floatValue() < 1.0f || this.f485190d.f485127a.M != null)) {
            return false;
        }
        int floatValue = (int) (this.f485190d.f485127a.f485334s.floatValue() * 256.0f);
        if (floatValue >= 0) {
            i17 = 255;
            if (floatValue <= 255) {
                i17 = floatValue;
            }
        }
        this.f485187a.saveLayerAlpha(null, i17, 31);
        this.f485191e.push(this.f485190d);
        s7.b3 b3Var = new s7.b3(this, this.f485190d);
        this.f485190d = b3Var;
        java.lang.String str = b3Var.f485127a.M;
        if (str != null && ((h17 = this.f485189c.h(str)) == null || !(h17 instanceof s7.w0))) {
            java.lang.String.format("Mask reference '%s' not found", this.f485190d.f485127a.M);
            this.f485190d.f485127a.M = null;
        }
        return true;
    }

    public final void G(s7.s1 s1Var, s7.f0 f0Var, s7.f0 f0Var2, s7.c0 c0Var) {
        if (f0Var.f485178c == 0.0f || f0Var.f485179d == 0.0f) {
            return;
        }
        if (c0Var == null && (c0Var = s1Var.f485150n) == null) {
            c0Var = s7.c0.f485139d;
        }
        U(this.f485190d, s1Var);
        if (k()) {
            s7.b3 b3Var = this.f485190d;
            b3Var.f485132f = f0Var;
            if (!b3Var.f485127a.B.booleanValue()) {
                s7.f0 f0Var3 = this.f485190d.f485132f;
                N(f0Var3.f485176a, f0Var3.f485177b, f0Var3.f485178c, f0Var3.f485179d);
            }
            f(s1Var, this.f485190d.f485132f);
            android.graphics.Canvas canvas = this.f485187a;
            if (f0Var2 != null) {
                canvas.concat(e(this.f485190d.f485132f, f0Var2, c0Var));
                this.f485190d.f485133g = s1Var.f485173o;
            } else {
                s7.f0 f0Var4 = this.f485190d.f485132f;
                canvas.translate(f0Var4.f485176a, f0Var4.f485177b);
            }
            boolean F = F();
            V();
            I(s1Var, true);
            if (F) {
                E(s1Var, s1Var.f485423h);
            }
            S(s1Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H(s7.a2 a2Var) {
        s7.t0 t0Var;
        java.lang.String str;
        int indexOf;
        java.util.Set g17;
        s7.t0 t0Var2;
        java.lang.Boolean bool;
        if (a2Var instanceof s7.x0) {
            return;
        }
        Q();
        if ((a2Var instanceof s7.y1) && (bool = ((s7.y1) a2Var).f485432d) != null) {
            this.f485190d.f485134h = bool.booleanValue();
        }
        if (a2Var instanceof s7.s1) {
            s7.s1 s1Var = (s7.s1) a2Var;
            G(s1Var, B(s1Var.f485362p, s1Var.f485363q, s1Var.f485364r, s1Var.f485365s), s1Var.f485173o, s1Var.f485150n);
        } else {
            android.graphics.Bitmap bitmap = null;
            if (a2Var instanceof s7.r2) {
                s7.r2 r2Var = (s7.r2) a2Var;
                s7.t0 t0Var3 = r2Var.f485345r;
                if ((t0Var3 == null || !t0Var3.g()) && ((t0Var2 = r2Var.f485346s) == null || !t0Var2.g())) {
                    U(this.f485190d, r2Var);
                    if (k()) {
                        s7.a2 h17 = r2Var.f485118a.h(r2Var.f485342o);
                        if (h17 == null) {
                            java.lang.String.format("Use reference '%s' not found", r2Var.f485342o);
                        } else {
                            android.graphics.Matrix matrix = r2Var.f485307n;
                            android.graphics.Canvas canvas = this.f485187a;
                            if (matrix != null) {
                                canvas.concat(matrix);
                            }
                            s7.t0 t0Var4 = r2Var.f485343p;
                            float d17 = t0Var4 != null ? t0Var4.d(this) : 0.0f;
                            s7.t0 t0Var5 = r2Var.f485344q;
                            canvas.translate(d17, t0Var5 != null ? t0Var5.e(this) : 0.0f);
                            f(r2Var, r2Var.f485423h);
                            boolean F = F();
                            this.f485192f.push(r2Var);
                            this.f485193g.push(this.f485187a.getMatrix());
                            if (h17 instanceof s7.s1) {
                                s7.s1 s1Var2 = (s7.s1) h17;
                                s7.f0 B = B(null, null, r2Var.f485345r, r2Var.f485346s);
                                Q();
                                G(s1Var2, B, s1Var2.f485173o, s1Var2.f485150n);
                                P();
                            } else if (h17 instanceof s7.g2) {
                                s7.t0 t0Var6 = r2Var.f485345r;
                                s7.q2 q2Var = s7.q2.percent;
                                if (t0Var6 == null) {
                                    t0Var6 = new s7.t0(100.0f, q2Var);
                                }
                                s7.t0 t0Var7 = r2Var.f485346s;
                                if (t0Var7 == null) {
                                    t0Var7 = new s7.t0(100.0f, q2Var);
                                }
                                s7.f0 B2 = B(null, null, t0Var6, t0Var7);
                                Q();
                                s7.g2 g2Var = (s7.g2) h17;
                                if (B2.f485178c != 0.0f && B2.f485179d != 0.0f) {
                                    s7.c0 c0Var = g2Var.f485150n;
                                    if (c0Var == null) {
                                        c0Var = s7.c0.f485139d;
                                    }
                                    U(this.f485190d, g2Var);
                                    s7.b3 b3Var = this.f485190d;
                                    b3Var.f485132f = B2;
                                    if (!b3Var.f485127a.B.booleanValue()) {
                                        s7.f0 f0Var = this.f485190d.f485132f;
                                        N(f0Var.f485176a, f0Var.f485177b, f0Var.f485178c, f0Var.f485179d);
                                    }
                                    s7.f0 f0Var2 = g2Var.f485173o;
                                    if (f0Var2 != null) {
                                        canvas.concat(e(this.f485190d.f485132f, f0Var2, c0Var));
                                        this.f485190d.f485133g = g2Var.f485173o;
                                    } else {
                                        s7.f0 f0Var3 = this.f485190d.f485132f;
                                        canvas.translate(f0Var3.f485176a, f0Var3.f485177b);
                                    }
                                    boolean F2 = F();
                                    I(g2Var, true);
                                    if (F2) {
                                        E(g2Var, g2Var.f485423h);
                                    }
                                    S(g2Var);
                                }
                                P();
                            } else {
                                H(h17);
                            }
                            this.f485192f.pop();
                            this.f485193g.pop();
                            if (F) {
                                E(r2Var, r2Var.f485423h);
                            }
                            S(r2Var);
                        }
                    }
                }
            } else if (a2Var instanceof s7.f2) {
                s7.f2 f2Var = (s7.f2) a2Var;
                U(this.f485190d, f2Var);
                if (k()) {
                    android.graphics.Matrix matrix2 = f2Var.f485307n;
                    if (matrix2 != null) {
                        this.f485187a.concat(matrix2);
                    }
                    f(f2Var, f2Var.f485423h);
                    boolean F3 = F();
                    java.lang.String language = java.util.Locale.getDefault().getLanguage();
                    java.util.Iterator it = f2Var.f485379i.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        s7.a2 a2Var2 = (s7.a2) it.next();
                        if (a2Var2 instanceof s7.t1) {
                            s7.t1 t1Var = (s7.t1) a2Var2;
                            if (t1Var.a() == null && ((g17 = t1Var.g()) == null || (!g17.isEmpty() && g17.contains(language)))) {
                                java.util.Set mo164028xf716cc72 = t1Var.mo164028xf716cc72();
                                if (mo164028xf716cc72 != null) {
                                    if (f485186h == null) {
                                        synchronized (s7.f3.class) {
                                            java.util.HashSet hashSet = new java.util.HashSet();
                                            f485186h = hashSet;
                                            hashSet.add("Structure");
                                            f485186h.add("BasicStructure");
                                            f485186h.add("ConditionalProcessing");
                                            f485186h.add("Image");
                                            f485186h.add("Style");
                                            f485186h.add("ViewportAttribute");
                                            f485186h.add("Shape");
                                            f485186h.add("BasicText");
                                            f485186h.add("PaintAttribute");
                                            f485186h.add("BasicPaintAttribute");
                                            f485186h.add("OpacityAttribute");
                                            f485186h.add("BasicGraphicsAttribute");
                                            f485186h.add("Marker");
                                            f485186h.add("Gradient");
                                            f485186h.add("Pattern");
                                            f485186h.add("Clip");
                                            f485186h.add("BasicClip");
                                            f485186h.add("Mask");
                                            f485186h.add("View");
                                        }
                                    }
                                    if (!mo164028xf716cc72.isEmpty() && f485186h.containsAll(mo164028xf716cc72)) {
                                    }
                                }
                                java.util.Set f17 = t1Var.f();
                                if (f17 == null) {
                                    java.util.Set m17 = t1Var.m();
                                    if (m17 == null) {
                                        H(a2Var2);
                                        break;
                                    }
                                    m17.isEmpty();
                                } else {
                                    f17.isEmpty();
                                }
                            }
                        }
                    }
                    if (F3) {
                        E(f2Var, f2Var.f485423h);
                    }
                    S(f2Var);
                }
            } else if (a2Var instanceof s7.q0) {
                s7.q0 q0Var = (s7.q0) a2Var;
                q0Var.n();
                U(this.f485190d, q0Var);
                if (k()) {
                    android.graphics.Matrix matrix3 = q0Var.f485307n;
                    if (matrix3 != null) {
                        this.f485187a.concat(matrix3);
                    }
                    f(q0Var, q0Var.f485423h);
                    boolean F4 = F();
                    I(q0Var, true);
                    if (F4) {
                        E(q0Var, q0Var.f485423h);
                    }
                    S(q0Var);
                }
            } else {
                if (a2Var instanceof s7.s0) {
                    s7.s0 s0Var = (s7.s0) a2Var;
                    s7.t0 t0Var8 = s0Var.f485359r;
                    if (t0Var8 != null && !t0Var8.g() && (t0Var = s0Var.f485360s) != null && !t0Var.g() && (str = s0Var.f485356o) != null) {
                        s7.c0 c0Var2 = s0Var.f485150n;
                        if (c0Var2 == null) {
                            c0Var2 = s7.c0.f485139d;
                        }
                        if (str.startsWith("data:") && str.length() >= 14 && (indexOf = str.indexOf(44)) >= 12 && ";base64".equals(str.substring(indexOf - 7, indexOf))) {
                            try {
                                byte[] decode = android.util.Base64.decode(str.substring(indexOf + 1), 0);
                                int length = decode.length;
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                                arrayList.add(java.lang.Integer.valueOf(length));
                                arrayList.add(0);
                                arrayList.add(decode);
                                java.lang.Object obj = new java.lang.Object();
                                java.util.Collections.reverse(arrayList);
                                yj0.a.d(obj, arrayList.toArray(), "com/caverock/androidsvg/SVGAndroidRenderer", "checkForImageDataURL", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
                                android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
                                yj0.a.e(obj, decodeByteArray, "com/caverock/androidsvg/SVGAndroidRenderer", "checkForImageDataURL", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
                                bitmap = decodeByteArray;
                            } catch (java.lang.Exception unused) {
                            }
                        }
                        if (bitmap != null) {
                            s7.f0 f0Var4 = new s7.f0(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
                            U(this.f485190d, s0Var);
                            if (k() && W()) {
                                android.graphics.Matrix matrix4 = s0Var.f485361t;
                                android.graphics.Canvas canvas2 = this.f485187a;
                                if (matrix4 != null) {
                                    canvas2.concat(matrix4);
                                }
                                s7.t0 t0Var9 = s0Var.f485357p;
                                float d18 = t0Var9 != null ? t0Var9.d(this) : 0.0f;
                                s7.t0 t0Var10 = s0Var.f485358q;
                                float e17 = t0Var10 != null ? t0Var10.e(this) : 0.0f;
                                float d19 = s0Var.f485359r.d(this);
                                float d27 = s0Var.f485360s.d(this);
                                s7.b3 b3Var2 = this.f485190d;
                                b3Var2.f485132f = new s7.f0(d18, e17, d19, d27);
                                if (!b3Var2.f485127a.B.booleanValue()) {
                                    s7.f0 f0Var5 = this.f485190d.f485132f;
                                    N(f0Var5.f485176a, f0Var5.f485177b, f0Var5.f485178c, f0Var5.f485179d);
                                }
                                s0Var.f485423h = this.f485190d.f485132f;
                                S(s0Var);
                                f(s0Var, s0Var.f485423h);
                                boolean F5 = F();
                                V();
                                canvas2.save();
                                canvas2.concat(e(this.f485190d.f485132f, f0Var4, c0Var2));
                                canvas2.drawBitmap(bitmap, 0.0f, 0.0f, new android.graphics.Paint(this.f485190d.f485127a.T != s7.m1.optimizeSpeed ? 2 : 0));
                                canvas2.restore();
                                if (F5) {
                                    E(s0Var, s0Var.f485423h);
                                }
                            }
                        }
                    }
                } else if (a2Var instanceof s7.z0) {
                    s7.z0 z0Var = (s7.z0) a2Var;
                    if (z0Var.f485441o != null) {
                        U(this.f485190d, z0Var);
                        if (k() && W()) {
                            s7.b3 b3Var3 = this.f485190d;
                            if (b3Var3.f485129c || b3Var3.f485128b) {
                                android.graphics.Matrix matrix5 = z0Var.f485298n;
                                if (matrix5 != null) {
                                    this.f485187a.concat(matrix5);
                                }
                                android.graphics.Path path = new s7.x2(z0Var.f485441o).f485424a;
                                if (z0Var.f485423h == null) {
                                    z0Var.f485423h = c(path);
                                }
                                S(z0Var);
                                g(z0Var);
                                f(z0Var, z0Var.f485423h);
                                boolean F6 = F();
                                s7.b3 b3Var4 = this.f485190d;
                                if (b3Var4.f485128b) {
                                    s7.i1 i1Var = b3Var4.f485127a.f485324f;
                                    path.setFillType((i1Var == null || i1Var != s7.i1.EvenOdd) ? android.graphics.Path.FillType.WINDING : android.graphics.Path.FillType.EVEN_ODD);
                                    l(z0Var, path);
                                }
                                if (this.f485190d.f485129c) {
                                    m(path);
                                }
                                L(z0Var);
                                if (F6) {
                                    E(z0Var, z0Var.f485423h);
                                }
                            }
                        }
                    }
                } else if (a2Var instanceof s7.f1) {
                    s7.f1 f1Var = (s7.f1) a2Var;
                    s7.t0 t0Var11 = f1Var.f485182q;
                    if (t0Var11 != null && f1Var.f485183r != null && !t0Var11.g() && !f1Var.f485183r.g()) {
                        U(this.f485190d, f1Var);
                        if (k() && W()) {
                            android.graphics.Matrix matrix6 = f1Var.f485298n;
                            if (matrix6 != null) {
                                this.f485187a.concat(matrix6);
                            }
                            android.graphics.Path A = A(f1Var);
                            S(f1Var);
                            g(f1Var);
                            f(f1Var, f1Var.f485423h);
                            boolean F7 = F();
                            if (this.f485190d.f485128b) {
                                l(f1Var, A);
                            }
                            if (this.f485190d.f485129c) {
                                m(A);
                            }
                            if (F7) {
                                E(f1Var, f1Var.f485423h);
                            }
                        }
                    }
                } else if (a2Var instanceof s7.h0) {
                    s7.h0 h0Var = (s7.h0) a2Var;
                    s7.t0 t0Var12 = h0Var.f485207q;
                    if (t0Var12 != null && !t0Var12.g()) {
                        U(this.f485190d, h0Var);
                        if (k() && W()) {
                            android.graphics.Matrix matrix7 = h0Var.f485298n;
                            if (matrix7 != null) {
                                this.f485187a.concat(matrix7);
                            }
                            android.graphics.Path x17 = x(h0Var);
                            S(h0Var);
                            g(h0Var);
                            f(h0Var, h0Var.f485423h);
                            boolean F8 = F();
                            if (this.f485190d.f485128b) {
                                l(h0Var, x17);
                            }
                            if (this.f485190d.f485129c) {
                                m(x17);
                            }
                            if (F8) {
                                E(h0Var, h0Var.f485423h);
                            }
                        }
                    }
                } else if (a2Var instanceof s7.m0) {
                    s7.m0 m0Var = (s7.m0) a2Var;
                    s7.t0 t0Var13 = m0Var.f485251q;
                    if (t0Var13 != null && m0Var.f485252r != null && !t0Var13.g() && !m0Var.f485252r.g()) {
                        U(this.f485190d, m0Var);
                        if (k() && W()) {
                            android.graphics.Matrix matrix8 = m0Var.f485298n;
                            if (matrix8 != null) {
                                this.f485187a.concat(matrix8);
                            }
                            android.graphics.Path y17 = y(m0Var);
                            S(m0Var);
                            g(m0Var);
                            f(m0Var, m0Var.f485423h);
                            boolean F9 = F();
                            if (this.f485190d.f485128b) {
                                l(m0Var, y17);
                            }
                            if (this.f485190d.f485129c) {
                                m(y17);
                            }
                            if (F9) {
                                E(m0Var, m0Var.f485423h);
                            }
                        }
                    }
                } else if (a2Var instanceof s7.u0) {
                    s7.u0 u0Var = (s7.u0) a2Var;
                    U(this.f485190d, u0Var);
                    if (k() && W() && this.f485190d.f485129c) {
                        android.graphics.Matrix matrix9 = u0Var.f485298n;
                        if (matrix9 != null) {
                            this.f485187a.concat(matrix9);
                        }
                        s7.t0 t0Var14 = u0Var.f485375o;
                        float d28 = t0Var14 == null ? 0.0f : t0Var14.d(this);
                        s7.t0 t0Var15 = u0Var.f485376p;
                        float e18 = t0Var15 == null ? 0.0f : t0Var15.e(this);
                        s7.t0 t0Var16 = u0Var.f485377q;
                        float d29 = t0Var16 == null ? 0.0f : t0Var16.d(this);
                        s7.t0 t0Var17 = u0Var.f485378r;
                        r5 = t0Var17 != null ? t0Var17.e(this) : 0.0f;
                        if (u0Var.f485423h == null) {
                            u0Var.f485423h = new s7.f0(java.lang.Math.min(d28, d29), java.lang.Math.min(e18, r5), java.lang.Math.abs(d29 - d28), java.lang.Math.abs(r5 - e18));
                        }
                        android.graphics.Path path2 = new android.graphics.Path();
                        path2.moveTo(d28, e18);
                        path2.lineTo(d29, r5);
                        S(u0Var);
                        g(u0Var);
                        f(u0Var, u0Var.f485423h);
                        boolean F10 = F();
                        m(path2);
                        L(u0Var);
                        if (F10) {
                            E(u0Var, u0Var.f485423h);
                        }
                    }
                } else if (a2Var instanceof s7.e1) {
                    s7.d1 d1Var = (s7.e1) a2Var;
                    U(this.f485190d, d1Var);
                    if (k() && W()) {
                        s7.b3 b3Var5 = this.f485190d;
                        if (b3Var5.f485129c || b3Var5.f485128b) {
                            android.graphics.Matrix matrix10 = d1Var.f485298n;
                            if (matrix10 != null) {
                                this.f485187a.concat(matrix10);
                            }
                            if (d1Var.f485165o.length >= 2) {
                                android.graphics.Path z17 = z(d1Var);
                                S(d1Var);
                                g(d1Var);
                                f(d1Var, d1Var.f485423h);
                                boolean F11 = F();
                                if (this.f485190d.f485128b) {
                                    l(d1Var, z17);
                                }
                                if (this.f485190d.f485129c) {
                                    m(z17);
                                }
                                L(d1Var);
                                if (F11) {
                                    E(d1Var, d1Var.f485423h);
                                }
                            }
                        }
                    }
                } else if (a2Var instanceof s7.d1) {
                    s7.d1 d1Var2 = (s7.d1) a2Var;
                    U(this.f485190d, d1Var2);
                    if (k() && W()) {
                        s7.b3 b3Var6 = this.f485190d;
                        if (b3Var6.f485129c || b3Var6.f485128b) {
                            android.graphics.Matrix matrix11 = d1Var2.f485298n;
                            if (matrix11 != null) {
                                this.f485187a.concat(matrix11);
                            }
                            if (d1Var2.f485165o.length >= 2) {
                                android.graphics.Path z18 = z(d1Var2);
                                S(d1Var2);
                                s7.i1 i1Var2 = this.f485190d.f485127a.f485324f;
                                z18.setFillType((i1Var2 == null || i1Var2 != s7.i1.EvenOdd) ? android.graphics.Path.FillType.WINDING : android.graphics.Path.FillType.EVEN_ODD);
                                g(d1Var2);
                                f(d1Var2, d1Var2.f485423h);
                                boolean F12 = F();
                                if (this.f485190d.f485128b) {
                                    l(d1Var2, z18);
                                }
                                if (this.f485190d.f485129c) {
                                    m(z18);
                                }
                                L(d1Var2);
                                if (F12) {
                                    E(d1Var2, d1Var2.f485423h);
                                }
                            }
                        }
                    }
                } else if (a2Var instanceof s7.j2) {
                    s7.j2 j2Var = (s7.j2) a2Var;
                    U(this.f485190d, j2Var);
                    if (k()) {
                        android.graphics.Matrix matrix12 = j2Var.f485229r;
                        if (matrix12 != null) {
                            this.f485187a.concat(matrix12);
                        }
                        java.util.List list = j2Var.f485271n;
                        float d37 = (list == null || ((java.util.ArrayList) list).size() == 0) ? 0.0f : ((s7.t0) ((java.util.ArrayList) j2Var.f485271n).get(0)).d(this);
                        java.util.List list2 = j2Var.f485272o;
                        float e19 = (list2 == null || ((java.util.ArrayList) list2).size() == 0) ? 0.0f : ((s7.t0) ((java.util.ArrayList) j2Var.f485272o).get(0)).e(this);
                        java.util.List list3 = j2Var.f485273p;
                        float d38 = (list3 == null || ((java.util.ArrayList) list3).size() == 0) ? 0.0f : ((s7.t0) ((java.util.ArrayList) j2Var.f485273p).get(0)).d(this);
                        java.util.List list4 = j2Var.f485274q;
                        if (list4 != null && ((java.util.ArrayList) list4).size() != 0) {
                            r5 = ((s7.t0) ((java.util.ArrayList) j2Var.f485274q).get(0)).e(this);
                        }
                        s7.n1 u17 = u();
                        if (u17 != s7.n1.Start) {
                            float d39 = d(j2Var);
                            if (u17 == s7.n1.Middle) {
                                d39 /= 2.0f;
                            }
                            d37 -= d39;
                        }
                        if (j2Var.f485423h == null) {
                            s7.c3 c3Var = new s7.c3(this, d37, e19);
                            n(j2Var, c3Var);
                            android.graphics.RectF rectF = c3Var.f485153c;
                            j2Var.f485423h = new s7.f0(rectF.left, rectF.top, rectF.width(), rectF.height());
                        }
                        S(j2Var);
                        g(j2Var);
                        f(j2Var, j2Var.f485423h);
                        boolean F13 = F();
                        n(j2Var, new s7.z2(this, d37 + d38, e19 + r5));
                        if (F13) {
                            E(j2Var, j2Var.f485423h);
                        }
                    }
                }
            }
        }
        P();
    }

    public final void I(s7.w1 w1Var, boolean z17) {
        if (z17) {
            this.f485192f.push(w1Var);
            this.f485193g.push(this.f485187a.getMatrix());
        }
        java.util.Iterator it = w1Var.c().iterator();
        while (it.hasNext()) {
            H((s7.a2) it.next());
        }
        if (z17) {
            this.f485192f.pop();
            this.f485193g.pop();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0116 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void J(s7.t2 r10, s7.d0 r11) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.f3.J(s7.t2, s7.d0):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0106, code lost:
    
        if (r12.f485190d.f485127a.B.booleanValue() != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0108, code lost:
    
        N(r0, r1, r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010b, code lost:
    
        r3.reset();
        r3.preScale(r7, r5);
        r6.concat(r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K(s7.v0 r13, s7.w2 r14) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.f3.K(s7.v0, s7.w2):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x017c A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L(s7.p0 r23) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.f3.L(s7.p0):void");
    }

    public final void M(s7.w0 w0Var, s7.x1 x1Var, s7.f0 f0Var) {
        float f17;
        float f18;
        java.lang.Boolean bool = w0Var.f485411n;
        boolean z17 = true;
        if (bool != null && bool.booleanValue()) {
            s7.t0 t0Var = w0Var.f485413p;
            f17 = t0Var != null ? t0Var.d(this) : f0Var.f485178c;
            s7.t0 t0Var2 = w0Var.f485414q;
            f18 = t0Var2 != null ? t0Var2.e(this) : f0Var.f485179d;
        } else {
            s7.t0 t0Var3 = w0Var.f485413p;
            float c17 = t0Var3 != null ? t0Var3.c(this, 1.0f) : 1.2f;
            s7.t0 t0Var4 = w0Var.f485414q;
            float c18 = t0Var4 != null ? t0Var4.c(this, 1.0f) : 1.2f;
            f17 = c17 * f0Var.f485178c;
            f18 = c18 * f0Var.f485179d;
        }
        if (f17 == 0.0f || f18 == 0.0f) {
            return;
        }
        Q();
        s7.b3 s17 = s(w0Var);
        this.f485190d = s17;
        s17.f485127a.f485334s = java.lang.Float.valueOf(1.0f);
        boolean F = F();
        android.graphics.Canvas canvas = this.f485187a;
        canvas.save();
        java.lang.Boolean bool2 = w0Var.f485412o;
        if (bool2 != null && !bool2.booleanValue()) {
            z17 = false;
        }
        if (!z17) {
            canvas.translate(f0Var.f485176a, f0Var.f485177b);
            canvas.scale(f0Var.f485178c, f0Var.f485179d);
        }
        I(w0Var, false);
        canvas.restore();
        if (F) {
            E(x1Var, f0Var);
        }
        P();
    }

    public final void N(float f17, float f18, float f19, float f27) {
        float f28 = f19 + f17;
        float f29 = f27 + f18;
        s7.g0 g0Var = this.f485190d.f485127a.C;
        if (g0Var != null) {
            f17 += g0Var.f485201d.d(this);
            f18 += this.f485190d.f485127a.C.f485198a.e(this);
            f28 -= this.f485190d.f485127a.C.f485199b.d(this);
            f29 -= this.f485190d.f485127a.C.f485200c.e(this);
        }
        this.f485187a.clipRect(f17, f18, f28, f29);
    }

    public final void O(s7.b3 b3Var, boolean z17, s7.b2 b2Var) {
        int i17;
        s7.r1 r1Var = b3Var.f485127a;
        float floatValue = (z17 ? r1Var.f485325g : r1Var.f485327i).floatValue();
        if (b2Var instanceof s7.j0) {
            i17 = ((s7.j0) b2Var).f485224d;
        } else if (!(b2Var instanceof s7.k0)) {
            return;
        } else {
            i17 = b3Var.f485127a.f485335t.f485224d;
        }
        int i18 = i(i17, floatValue);
        if (z17) {
            b3Var.f485130d.setColor(i18);
        } else {
            b3Var.f485131e.setColor(i18);
        }
    }

    public final void P() {
        this.f485187a.restore();
        this.f485190d = (s7.b3) this.f485191e.pop();
    }

    public final void Q() {
        this.f485187a.save();
        this.f485191e.push(this.f485190d);
        this.f485190d = new s7.b3(this, this.f485190d);
    }

    public final java.lang.String R(java.lang.String str, boolean z17, boolean z18) {
        if (this.f485190d.f485134h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        java.lang.String replaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z17) {
            replaceAll = replaceAll.replaceAll("^\\s+", "");
        }
        if (z18) {
            replaceAll = replaceAll.replaceAll("\\s+$", "");
        }
        return replaceAll.replaceAll("\\s{2,}", " ");
    }

    public final void S(s7.x1 x1Var) {
        if (x1Var.f485119b == null || x1Var.f485423h == null) {
            return;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        if (((android.graphics.Matrix) this.f485193g.peek()).invert(matrix)) {
            s7.f0 f0Var = x1Var.f485423h;
            float f17 = f0Var.f485176a;
            float f18 = f0Var.f485177b;
            float f19 = f0Var.f485178c + f17;
            float f27 = f18 + f0Var.f485179d;
            float[] fArr = {f17, f18, f19, f18, f19, f27, f17, f27};
            matrix.preConcat(this.f485187a.getMatrix());
            matrix.mapPoints(fArr);
            float f28 = fArr[0];
            float f29 = fArr[1];
            android.graphics.RectF rectF = new android.graphics.RectF(f28, f29, f28, f29);
            for (int i17 = 2; i17 <= 6; i17 += 2) {
                float f37 = fArr[i17];
                if (f37 < rectF.left) {
                    rectF.left = f37;
                }
                if (f37 > rectF.right) {
                    rectF.right = f37;
                }
                float f38 = fArr[i17 + 1];
                if (f38 < rectF.top) {
                    rectF.top = f38;
                }
                if (f38 > rectF.bottom) {
                    rectF.bottom = f38;
                }
            }
            s7.x1 x1Var2 = (s7.x1) this.f485192f.peek();
            s7.f0 f0Var2 = x1Var2.f485423h;
            if (f0Var2 == null) {
                float f39 = rectF.left;
                float f47 = rectF.top;
                x1Var2.f485423h = new s7.f0(f39, f47, rectF.right - f39, rectF.bottom - f47);
                return;
            }
            float f48 = rectF.left;
            float f49 = rectF.top;
            float f57 = rectF.right - f48;
            float f58 = rectF.bottom - f49;
            if (f48 < f0Var2.f485176a) {
                f0Var2.f485176a = f48;
            }
            if (f49 < f0Var2.f485177b) {
                f0Var2.f485177b = f49;
            }
            float f59 = f48 + f57;
            float f66 = f0Var2.f485176a;
            if (f59 > f0Var2.f485178c + f66) {
                f0Var2.f485178c = f59 - f66;
            }
            float f67 = f49 + f58;
            float f68 = f0Var2.f485177b;
            if (f67 > f0Var2.f485179d + f68) {
                f0Var2.f485179d = f67 - f68;
            }
        }
    }

    public final void T(s7.b3 b3Var, s7.r1 r1Var) {
        s7.r1 r1Var2;
        if (w(r1Var, 4096L)) {
            b3Var.f485127a.f485335t = r1Var.f485335t;
        }
        if (w(r1Var, 2048L)) {
            b3Var.f485127a.f485334s = r1Var.f485334s;
        }
        boolean w17 = w(r1Var, 1L);
        s7.j0 j0Var = s7.j0.f485223f;
        if (w17) {
            b3Var.f485127a.f485323e = r1Var.f485323e;
            s7.b2 b2Var = r1Var.f485323e;
            b3Var.f485128b = (b2Var == null || b2Var == j0Var) ? false : true;
        }
        if (w(r1Var, 4L)) {
            b3Var.f485127a.f485325g = r1Var.f485325g;
        }
        if (w(r1Var, 6149L)) {
            O(b3Var, true, b3Var.f485127a.f485323e);
        }
        if (w(r1Var, 2L)) {
            b3Var.f485127a.f485324f = r1Var.f485324f;
        }
        if (w(r1Var, 8L)) {
            b3Var.f485127a.f485326h = r1Var.f485326h;
            s7.b2 b2Var2 = r1Var.f485326h;
            b3Var.f485129c = (b2Var2 == null || b2Var2 == j0Var) ? false : true;
        }
        if (w(r1Var, 16L)) {
            b3Var.f485127a.f485327i = r1Var.f485327i;
        }
        if (w(r1Var, 6168L)) {
            O(b3Var, false, b3Var.f485127a.f485326h);
        }
        if (w(r1Var, 34359738368L)) {
            b3Var.f485127a.S = r1Var.S;
        }
        if (w(r1Var, 32L)) {
            s7.r1 r1Var3 = b3Var.f485127a;
            s7.t0 t0Var = r1Var.f485328m;
            r1Var3.f485328m = t0Var;
            b3Var.f485131e.setStrokeWidth(t0Var.b(this));
        }
        if (w(r1Var, 64L)) {
            b3Var.f485127a.f485329n = r1Var.f485329n;
            int ordinal = r1Var.f485329n.ordinal();
            android.graphics.Paint paint = b3Var.f485131e;
            if (ordinal == 0) {
                paint.setStrokeCap(android.graphics.Paint.Cap.BUTT);
            } else if (ordinal == 1) {
                paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
            } else if (ordinal == 2) {
                paint.setStrokeCap(android.graphics.Paint.Cap.SQUARE);
            }
        }
        if (w(r1Var, 128L)) {
            b3Var.f485127a.f485330o = r1Var.f485330o;
            int ordinal2 = r1Var.f485330o.ordinal();
            android.graphics.Paint paint2 = b3Var.f485131e;
            if (ordinal2 == 0) {
                paint2.setStrokeJoin(android.graphics.Paint.Join.MITER);
            } else if (ordinal2 == 1) {
                paint2.setStrokeJoin(android.graphics.Paint.Join.ROUND);
            } else if (ordinal2 == 2) {
                paint2.setStrokeJoin(android.graphics.Paint.Join.BEVEL);
            }
        }
        if (w(r1Var, 256L)) {
            b3Var.f485127a.f485331p = r1Var.f485331p;
            b3Var.f485131e.setStrokeMiter(r1Var.f485331p.floatValue());
        }
        if (w(r1Var, 512L)) {
            b3Var.f485127a.f485332q = r1Var.f485332q;
        }
        if (w(r1Var, 1024L)) {
            b3Var.f485127a.f485333r = r1Var.f485333r;
        }
        android.graphics.Typeface typeface = null;
        if (w(r1Var, 1536L)) {
            s7.t0[] t0VarArr = b3Var.f485127a.f485332q;
            android.graphics.Paint paint3 = b3Var.f485131e;
            if (t0VarArr == null) {
                paint3.setPathEffect(null);
            } else {
                int length = t0VarArr.length;
                int i17 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i17];
                int i18 = 0;
                float f17 = 0.0f;
                while (true) {
                    r1Var2 = b3Var.f485127a;
                    if (i18 >= i17) {
                        break;
                    }
                    float b17 = r1Var2.f485332q[i18 % length].b(this);
                    fArr[i18] = b17;
                    f17 += b17;
                    i18++;
                }
                if (f17 == 0.0f) {
                    paint3.setPathEffect(null);
                } else {
                    float b18 = r1Var2.f485333r.b(this);
                    if (b18 < 0.0f) {
                        b18 = (b18 % f17) + f17;
                    }
                    paint3.setPathEffect(new android.graphics.DashPathEffect(fArr, b18));
                }
            }
        }
        if (w(r1Var, 16384L)) {
            float textSize = this.f485190d.f485130d.getTextSize();
            b3Var.f485127a.f485337v = r1Var.f485337v;
            b3Var.f485130d.setTextSize(r1Var.f485337v.c(this, textSize));
            b3Var.f485131e.setTextSize(r1Var.f485337v.c(this, textSize));
        }
        if (w(r1Var, 8192L)) {
            b3Var.f485127a.f485336u = r1Var.f485336u;
        }
        if (w(r1Var, 32768L)) {
            if (r1Var.f485338w.intValue() == -1 && b3Var.f485127a.f485338w.intValue() > 100) {
                s7.r1 r1Var4 = b3Var.f485127a;
                r1Var4.f485338w = java.lang.Integer.valueOf(r1Var4.f485338w.intValue() - 100);
            } else if (r1Var.f485338w.intValue() != 1 || b3Var.f485127a.f485338w.intValue() >= 900) {
                b3Var.f485127a.f485338w = r1Var.f485338w;
            } else {
                s7.r1 r1Var5 = b3Var.f485127a;
                r1Var5.f485338w = java.lang.Integer.valueOf(r1Var5.f485338w.intValue() + 100);
            }
        }
        if (w(r1Var, 65536L)) {
            b3Var.f485127a.f485339x = r1Var.f485339x;
        }
        if (w(r1Var, 106496L)) {
            s7.r1 r1Var6 = b3Var.f485127a;
            java.util.List list = r1Var6.f485336u;
            if (list != null && this.f485189c != null) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext() && (typeface = h((java.lang.String) it.next(), r1Var6.f485338w, r1Var6.f485339x)) == null) {
                }
            }
            if (typeface == null) {
                typeface = h("serif", r1Var6.f485338w, r1Var6.f485339x);
            }
            b3Var.f485130d.setTypeface(typeface);
            b3Var.f485131e.setTypeface(typeface);
        }
        if (w(r1Var, 131072L)) {
            b3Var.f485127a.f485340y = r1Var.f485340y;
            android.graphics.Paint paint4 = b3Var.f485130d;
            s7.o1 o1Var = r1Var.f485340y;
            s7.o1 o1Var2 = s7.o1.LineThrough;
            paint4.setStrikeThruText(o1Var == o1Var2);
            s7.o1 o1Var3 = r1Var.f485340y;
            s7.o1 o1Var4 = s7.o1.Underline;
            paint4.setUnderlineText(o1Var3 == o1Var4);
            android.graphics.Paint paint5 = b3Var.f485131e;
            paint5.setStrikeThruText(r1Var.f485340y == o1Var2);
            paint5.setUnderlineText(r1Var.f485340y == o1Var4);
        }
        if (w(r1Var, 68719476736L)) {
            b3Var.f485127a.f485341z = r1Var.f485341z;
        }
        if (w(r1Var, 262144L)) {
            b3Var.f485127a.A = r1Var.A;
        }
        if (w(r1Var, 524288L)) {
            b3Var.f485127a.B = r1Var.B;
        }
        if (w(r1Var, 2097152L)) {
            b3Var.f485127a.D = r1Var.D;
        }
        if (w(r1Var, 4194304L)) {
            b3Var.f485127a.E = r1Var.E;
        }
        if (w(r1Var, 8388608L)) {
            b3Var.f485127a.F = r1Var.F;
        }
        if (w(r1Var, 16777216L)) {
            b3Var.f485127a.G = r1Var.G;
        }
        if (w(r1Var, 33554432L)) {
            b3Var.f485127a.H = r1Var.H;
        }
        if (w(r1Var, 1048576L)) {
            b3Var.f485127a.C = r1Var.C;
        }
        if (w(r1Var, 268435456L)) {
            b3Var.f485127a.K = r1Var.K;
        }
        if (w(r1Var, 536870912L)) {
            b3Var.f485127a.L = r1Var.L;
        }
        if (w(r1Var, 1073741824L)) {
            b3Var.f485127a.M = r1Var.M;
        }
        if (w(r1Var, 67108864L)) {
            b3Var.f485127a.I = r1Var.I;
        }
        if (w(r1Var, 134217728L)) {
            b3Var.f485127a.f485321J = r1Var.f485321J;
        }
        if (w(r1Var, 8589934592L)) {
            b3Var.f485127a.Q = r1Var.Q;
        }
        if (w(r1Var, 17179869184L)) {
            b3Var.f485127a.R = r1Var.R;
        }
        if (w(r1Var, 137438953472L)) {
            b3Var.f485127a.T = r1Var.T;
        }
    }

    public final void U(s7.b3 b3Var, s7.y1 y1Var) {
        boolean z17 = y1Var.f485119b == null;
        s7.r1 r1Var = b3Var.f485127a;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        r1Var.G = bool;
        if (!z17) {
            bool = java.lang.Boolean.FALSE;
        }
        r1Var.B = bool;
        r1Var.C = null;
        r1Var.K = null;
        r1Var.f485334s = java.lang.Float.valueOf(1.0f);
        r1Var.I = s7.j0.f485222e;
        r1Var.f485321J = java.lang.Float.valueOf(1.0f);
        r1Var.M = null;
        r1Var.N = null;
        r1Var.P = java.lang.Float.valueOf(1.0f);
        r1Var.Q = null;
        r1Var.R = java.lang.Float.valueOf(1.0f);
        r1Var.S = s7.q1.None;
        s7.r1 r1Var2 = y1Var.f485433e;
        if (r1Var2 != null) {
            T(b3Var, r1Var2);
        }
        java.util.List list = this.f485189c.f485371c.f485366a;
        if (true ^ (list == null || ((java.util.ArrayList) list).isEmpty())) {
            java.util.Iterator it = ((java.util.ArrayList) this.f485189c.f485371c.f485366a).iterator();
            while (it.hasNext()) {
                s7.r rVar = (s7.r) it.next();
                if (s7.x.g(null, rVar.f485318a, y1Var)) {
                    T(b3Var, rVar.f485319b);
                }
            }
        }
        s7.r1 r1Var3 = y1Var.f485434f;
        if (r1Var3 != null) {
            T(b3Var, r1Var3);
        }
    }

    public final void V() {
        int i17;
        s7.r1 r1Var = this.f485190d.f485127a;
        s7.b2 b2Var = r1Var.Q;
        if (b2Var instanceof s7.j0) {
            i17 = ((s7.j0) b2Var).f485224d;
        } else if (!(b2Var instanceof s7.k0)) {
            return;
        } else {
            i17 = r1Var.f485335t.f485224d;
        }
        java.lang.Float f17 = r1Var.R;
        if (f17 != null) {
            i17 = i(i17, f17.floatValue());
        }
        this.f485187a.drawColor(i17);
    }

    public final boolean W() {
        java.lang.Boolean bool = this.f485190d.f485127a.H;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final android.graphics.Path b(s7.x1 x1Var, s7.f0 f0Var) {
        android.graphics.Path C;
        s7.a2 h17 = x1Var.f485118a.h(this.f485190d.f485127a.K);
        if (h17 == null) {
            java.lang.String.format("ClipPath reference '%s' not found", this.f485190d.f485127a.K);
            return null;
        }
        s7.i0 i0Var = (s7.i0) h17;
        this.f485191e.push(this.f485190d);
        this.f485190d = s(i0Var);
        java.lang.Boolean bool = i0Var.f485211o;
        boolean z17 = bool == null || bool.booleanValue();
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        if (!z17) {
            matrix.preTranslate(f0Var.f485176a, f0Var.f485177b);
            matrix.preScale(f0Var.f485178c, f0Var.f485179d);
        }
        android.graphics.Matrix matrix2 = i0Var.f485307n;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        android.graphics.Path path = new android.graphics.Path();
        for (s7.a2 a2Var : i0Var.f485379i) {
            if ((a2Var instanceof s7.x1) && (C = C((s7.x1) a2Var, true)) != null) {
                path.op(C, android.graphics.Path.Op.UNION);
            }
        }
        if (this.f485190d.f485127a.K != null) {
            if (i0Var.f485423h == null) {
                i0Var.f485423h = c(path);
            }
            android.graphics.Path b17 = b(i0Var, i0Var.f485423h);
            if (b17 != null) {
                path.op(b17, android.graphics.Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f485190d = (s7.b3) this.f485191e.pop();
        return path;
    }

    public final s7.f0 c(android.graphics.Path path) {
        android.graphics.RectF rectF = new android.graphics.RectF();
        path.computeBounds(rectF, true);
        return new s7.f0(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    public final float d(s7.l2 l2Var) {
        s7.e3 e3Var = new s7.e3(this, null);
        n(l2Var, e3Var);
        return e3Var.f485174a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        if (r6 != 9) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Matrix e(s7.f0 r10, s7.f0 r11, s7.c0 r12) {
        /*
            r9 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r12 == 0) goto L8a
            s7.a0 r1 = r12.f485140a
            if (r1 != 0) goto Ld
            goto L8a
        Ld:
            float r2 = r10.f485178c
            float r3 = r11.f485178c
            float r2 = r2 / r3
            float r3 = r10.f485179d
            float r4 = r11.f485179d
            float r3 = r3 / r4
            float r4 = r11.f485176a
            float r4 = -r4
            float r5 = r11.f485177b
            float r5 = -r5
            s7.c0 r6 = s7.c0.f485138c
            boolean r6 = r12.m163955xb2c87fbf(r6)
            if (r6 == 0) goto L33
            float r11 = r10.f485176a
            float r10 = r10.f485177b
            r0.preTranslate(r11, r10)
            r0.preScale(r2, r3)
            r0.preTranslate(r4, r5)
            return r0
        L33:
            s7.b0 r6 = s7.b0.slice
            s7.b0 r12 = r12.f485141b
            if (r12 != r6) goto L3e
            float r12 = java.lang.Math.max(r2, r3)
            goto L42
        L3e:
            float r12 = java.lang.Math.min(r2, r3)
        L42:
            float r2 = r10.f485178c
            float r2 = r2 / r12
            float r3 = r10.f485179d
            float r3 = r3 / r12
            int r6 = r1.ordinal()
            r7 = 2
            r8 = 1073741824(0x40000000, float:2.0)
            if (r6 == r7) goto L67
            r7 = 3
            if (r6 == r7) goto L63
            r7 = 5
            if (r6 == r7) goto L67
            r7 = 6
            if (r6 == r7) goto L63
            r7 = 8
            if (r6 == r7) goto L67
            r7 = 9
            if (r6 == r7) goto L63
            goto L6c
        L63:
            float r6 = r11.f485178c
            float r6 = r6 - r2
            goto L6b
        L67:
            float r6 = r11.f485178c
            float r6 = r6 - r2
            float r6 = r6 / r8
        L6b:
            float r4 = r4 - r6
        L6c:
            int r1 = r1.ordinal()
            switch(r1) {
                case 4: goto L78;
                case 5: goto L78;
                case 6: goto L78;
                case 7: goto L74;
                case 8: goto L74;
                case 9: goto L74;
                default: goto L73;
            }
        L73:
            goto L7d
        L74:
            float r11 = r11.f485179d
            float r11 = r11 - r3
            goto L7c
        L78:
            float r11 = r11.f485179d
            float r11 = r11 - r3
            float r11 = r11 / r8
        L7c:
            float r5 = r5 - r11
        L7d:
            float r11 = r10.f485176a
            float r10 = r10.f485177b
            r0.preTranslate(r11, r10)
            r0.preScale(r12, r12)
            r0.preTranslate(r4, r5)
        L8a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.f3.e(s7.f0, s7.f0, s7.c0):android.graphics.Matrix");
    }

    public final void f(s7.x1 x1Var, s7.f0 f0Var) {
        android.graphics.Path b17;
        if (this.f485190d.f485127a.K == null || (b17 = b(x1Var, f0Var)) == null) {
            return;
        }
        this.f485187a.clipPath(b17);
    }

    public final void g(s7.x1 x1Var) {
        s7.b2 b2Var = this.f485190d.f485127a.f485323e;
        if (b2Var instanceof s7.y0) {
            j(true, x1Var.f485423h, (s7.y0) b2Var);
        }
        s7.b2 b2Var2 = this.f485190d.f485127a.f485326h;
        if (b2Var2 instanceof s7.y0) {
            j(false, x1Var.f485423h, (s7.y0) b2Var2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        if (r6.equals("monospace") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Typeface h(java.lang.String r6, java.lang.Integer r7, s7.j1 r8) {
        /*
            r5 = this;
            s7.j1 r0 = s7.j1.Italic
            r1 = 1
            r2 = 0
            if (r8 != r0) goto L8
            r8 = r1
            goto L9
        L8:
            r8 = r2
        L9:
            int r7 = r7.intValue()
            r0 = 500(0x1f4, float:7.0E-43)
            r3 = 3
            r4 = 2
            if (r7 <= r0) goto L19
            if (r8 == 0) goto L17
            r7 = r3
            goto L1e
        L17:
            r7 = r1
            goto L1e
        L19:
            if (r8 == 0) goto L1d
            r7 = r4
            goto L1e
        L1d:
            r7 = r2
        L1e:
            r6.getClass()
            int r8 = r6.hashCode()
            r0 = -1
            switch(r8) {
                case -1536685117: goto L55;
                case -1431958525: goto L4c;
                case -1081737434: goto L41;
                case 109326717: goto L36;
                case 1126973893: goto L2b;
                default: goto L29;
            }
        L29:
            r1 = r0
            goto L5f
        L2b:
            java.lang.String r8 = "cursive"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L34
            goto L29
        L34:
            r1 = 4
            goto L5f
        L36:
            java.lang.String r8 = "serif"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L3f
            goto L29
        L3f:
            r1 = r3
            goto L5f
        L41:
            java.lang.String r8 = "fantasy"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L4a
            goto L29
        L4a:
            r1 = r4
            goto L5f
        L4c:
            java.lang.String r8 = "monospace"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L5f
            goto L29
        L55:
            java.lang.String r8 = "sans-serif"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L5e
            goto L29
        L5e:
            r1 = r2
        L5f:
            switch(r1) {
                case 0: goto L80;
                case 1: goto L79;
                case 2: goto L72;
                case 3: goto L6b;
                case 4: goto L64;
                default: goto L62;
            }
        L62:
            r6 = 0
            goto L86
        L64:
            android.graphics.Typeface r6 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
            goto L86
        L6b:
            android.graphics.Typeface r6 = android.graphics.Typeface.SERIF
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
            goto L86
        L72:
            android.graphics.Typeface r6 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
            goto L86
        L79:
            android.graphics.Typeface r6 = android.graphics.Typeface.MONOSPACE
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
            goto L86
        L80:
            android.graphics.Typeface r6 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
        L86:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.f3.h(java.lang.String, java.lang.Integer, s7.j1):android.graphics.Typeface");
    }

    public final void j(boolean z17, s7.f0 f0Var, s7.y0 y0Var) {
        float c17;
        float f17;
        float c18;
        float c19;
        float c27;
        float c28;
        float c29;
        float f18;
        float f19;
        float f27;
        float f28;
        s7.a2 h17 = this.f485189c.h(y0Var.f485429d);
        if (h17 == null) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = z17 ? "Fill" : "Stroke";
            objArr[1] = y0Var.f485429d;
            java.lang.String.format("%s reference '%s' not found", objArr);
            s7.b2 b2Var = y0Var.f485430e;
            if (b2Var != null) {
                O(this.f485190d, z17, b2Var);
                return;
            } else if (z17) {
                this.f485190d.f485128b = false;
                return;
            } else {
                this.f485190d.f485129c = false;
                return;
            }
        }
        boolean z18 = h17 instanceof s7.z1;
        s7.j0 j0Var = s7.j0.f485222e;
        s7.o0 o0Var = s7.o0.repeat;
        s7.o0 o0Var2 = s7.o0.reflect;
        if (z18) {
            s7.z1 z1Var = (s7.z1) h17;
            java.lang.String str = z1Var.f485266l;
            if (str != null) {
                p(z1Var, str);
            }
            java.lang.Boolean bool = z1Var.f485263i;
            boolean z19 = bool != null && bool.booleanValue();
            s7.b3 b3Var = this.f485190d;
            android.graphics.Paint paint = z17 ? b3Var.f485130d : b3Var.f485131e;
            if (z19) {
                s7.f0 f0Var2 = b3Var.f485133g;
                if (f0Var2 == null) {
                    f0Var2 = b3Var.f485132f;
                }
                s7.t0 t0Var = z1Var.f485442m;
                c19 = t0Var != null ? t0Var.d(this) : 0.0f;
                s7.t0 t0Var2 = z1Var.f485443n;
                c27 = t0Var2 != null ? t0Var2.e(this) : 0.0f;
                s7.t0 t0Var3 = z1Var.f485444o;
                c28 = t0Var3 != null ? t0Var3.d(this) : f0Var2.f485178c;
                s7.t0 t0Var4 = z1Var.f485445p;
                if (t0Var4 != null) {
                    c29 = t0Var4.e(this);
                    f18 = c28;
                    f19 = c27;
                    f28 = c29;
                    f27 = c19;
                }
                f18 = c28;
                f19 = c27;
                f27 = c19;
                f28 = 0.0f;
            } else {
                s7.t0 t0Var5 = z1Var.f485442m;
                c19 = t0Var5 != null ? t0Var5.c(this, 1.0f) : 0.0f;
                s7.t0 t0Var6 = z1Var.f485443n;
                c27 = t0Var6 != null ? t0Var6.c(this, 1.0f) : 0.0f;
                s7.t0 t0Var7 = z1Var.f485444o;
                c28 = t0Var7 != null ? t0Var7.c(this, 1.0f) : 1.0f;
                s7.t0 t0Var8 = z1Var.f485445p;
                if (t0Var8 != null) {
                    c29 = t0Var8.c(this, 1.0f);
                    f18 = c28;
                    f19 = c27;
                    f28 = c29;
                    f27 = c19;
                }
                f18 = c28;
                f19 = c27;
                f27 = c19;
                f28 = 0.0f;
            }
            Q();
            this.f485190d = s(z1Var);
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            if (!z19) {
                matrix.preTranslate(f0Var.f485176a, f0Var.f485177b);
                matrix.preScale(f0Var.f485178c, f0Var.f485179d);
            }
            android.graphics.Matrix matrix2 = z1Var.f485264j;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            int size = z1Var.f485262h.size();
            if (size == 0) {
                P();
                if (z17) {
                    this.f485190d.f485128b = false;
                    return;
                } else {
                    this.f485190d.f485129c = false;
                    return;
                }
            }
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            java.util.Iterator it = z1Var.f485262h.iterator();
            int i17 = 0;
            float f29 = -1.0f;
            while (it.hasNext()) {
                s7.h1 h1Var = (s7.h1) ((s7.a2) it.next());
                java.lang.Float f37 = h1Var.f485208h;
                float floatValue = f37 != null ? f37.floatValue() : 0.0f;
                if (i17 == 0 || floatValue >= f29) {
                    fArr[i17] = floatValue;
                    f29 = floatValue;
                } else {
                    fArr[i17] = f29;
                }
                Q();
                U(this.f485190d, h1Var);
                s7.r1 r1Var = this.f485190d.f485127a;
                s7.j0 j0Var2 = (s7.j0) r1Var.I;
                if (j0Var2 == null) {
                    j0Var2 = j0Var;
                }
                iArr[i17] = i(j0Var2.f485224d, r1Var.f485321J.floatValue());
                i17++;
                P();
            }
            if ((f27 == f18 && f19 == f28) || size == 1) {
                P();
                paint.setColor(iArr[size - 1]);
                return;
            }
            android.graphics.Shader.TileMode tileMode = android.graphics.Shader.TileMode.CLAMP;
            s7.o0 o0Var3 = z1Var.f485265k;
            if (o0Var3 != null) {
                if (o0Var3 == o0Var2) {
                    tileMode = android.graphics.Shader.TileMode.MIRROR;
                } else if (o0Var3 == o0Var) {
                    tileMode = android.graphics.Shader.TileMode.REPEAT;
                }
            }
            P();
            android.graphics.LinearGradient linearGradient = new android.graphics.LinearGradient(f27, f19, f18, f28, iArr, fArr, tileMode);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            int floatValue2 = (int) (this.f485190d.f485127a.f485325g.floatValue() * 256.0f);
            paint.setAlpha(floatValue2 < 0 ? 0 : floatValue2 > 255 ? 255 : floatValue2);
            return;
        }
        if (!(h17 instanceof s7.d2)) {
            if (h17 instanceof s7.g1) {
                s7.g1 g1Var = (s7.g1) h17;
                if (z17) {
                    if (w(g1Var.f485433e, 2147483648L)) {
                        s7.b3 b3Var2 = this.f485190d;
                        s7.r1 r1Var2 = b3Var2.f485127a;
                        s7.b2 b2Var2 = g1Var.f485433e.N;
                        r1Var2.f485323e = b2Var2;
                        b3Var2.f485128b = b2Var2 != null;
                    }
                    if (w(g1Var.f485433e, 4294967296L)) {
                        this.f485190d.f485127a.f485325g = g1Var.f485433e.P;
                    }
                    if (w(g1Var.f485433e, 6442450944L)) {
                        s7.b3 b3Var3 = this.f485190d;
                        O(b3Var3, z17, b3Var3.f485127a.f485323e);
                        return;
                    }
                    return;
                }
                if (w(g1Var.f485433e, 2147483648L)) {
                    s7.b3 b3Var4 = this.f485190d;
                    s7.r1 r1Var3 = b3Var4.f485127a;
                    s7.b2 b2Var3 = g1Var.f485433e.N;
                    r1Var3.f485326h = b2Var3;
                    b3Var4.f485129c = b2Var3 != null;
                }
                if (w(g1Var.f485433e, 4294967296L)) {
                    this.f485190d.f485127a.f485327i = g1Var.f485433e.P;
                }
                if (w(g1Var.f485433e, 6442450944L)) {
                    s7.b3 b3Var5 = this.f485190d;
                    O(b3Var5, z17, b3Var5.f485127a.f485326h);
                    return;
                }
                return;
            }
            return;
        }
        s7.d2 d2Var = (s7.d2) h17;
        java.lang.String str2 = d2Var.f485266l;
        if (str2 != null) {
            p(d2Var, str2);
        }
        java.lang.Boolean bool2 = d2Var.f485263i;
        boolean z27 = bool2 != null && bool2.booleanValue();
        s7.b3 b3Var6 = this.f485190d;
        android.graphics.Paint paint2 = z17 ? b3Var6.f485130d : b3Var6.f485131e;
        if (z27) {
            s7.t0 t0Var9 = new s7.t0(50.0f, s7.q2.percent);
            s7.t0 t0Var10 = d2Var.f485166m;
            float d17 = t0Var10 != null ? t0Var10.d(this) : t0Var9.d(this);
            s7.t0 t0Var11 = d2Var.f485167n;
            c17 = t0Var11 != null ? t0Var11.e(this) : t0Var9.e(this);
            s7.t0 t0Var12 = d2Var.f485168o;
            c18 = t0Var12 != null ? t0Var12.b(this) : t0Var9.b(this);
            f17 = d17;
        } else {
            s7.t0 t0Var13 = d2Var.f485166m;
            float c37 = t0Var13 != null ? t0Var13.c(this, 1.0f) : 0.5f;
            s7.t0 t0Var14 = d2Var.f485167n;
            c17 = t0Var14 != null ? t0Var14.c(this, 1.0f) : 0.5f;
            s7.t0 t0Var15 = d2Var.f485168o;
            f17 = c37;
            c18 = t0Var15 != null ? t0Var15.c(this, 1.0f) : 0.5f;
        }
        float f38 = c17;
        Q();
        this.f485190d = s(d2Var);
        android.graphics.Matrix matrix3 = new android.graphics.Matrix();
        if (!z27) {
            matrix3.preTranslate(f0Var.f485176a, f0Var.f485177b);
            matrix3.preScale(f0Var.f485178c, f0Var.f485179d);
        }
        android.graphics.Matrix matrix4 = d2Var.f485264j;
        if (matrix4 != null) {
            matrix3.preConcat(matrix4);
        }
        int size2 = d2Var.f485262h.size();
        if (size2 == 0) {
            P();
            if (z17) {
                this.f485190d.f485128b = false;
                return;
            } else {
                this.f485190d.f485129c = false;
                return;
            }
        }
        int[] iArr2 = new int[size2];
        float[] fArr2 = new float[size2];
        java.util.Iterator it6 = d2Var.f485262h.iterator();
        int i18 = 0;
        float f39 = -1.0f;
        while (it6.hasNext()) {
            s7.h1 h1Var2 = (s7.h1) ((s7.a2) it6.next());
            java.lang.Float f47 = h1Var2.f485208h;
            float floatValue3 = f47 != null ? f47.floatValue() : 0.0f;
            if (i18 == 0 || floatValue3 >= f39) {
                fArr2[i18] = floatValue3;
                f39 = floatValue3;
            } else {
                fArr2[i18] = f39;
            }
            Q();
            U(this.f485190d, h1Var2);
            s7.r1 r1Var4 = this.f485190d.f485127a;
            s7.j0 j0Var3 = (s7.j0) r1Var4.I;
            if (j0Var3 == null) {
                j0Var3 = j0Var;
            }
            iArr2[i18] = i(j0Var3.f485224d, r1Var4.f485321J.floatValue());
            i18++;
            P();
        }
        if (c18 == 0.0f || size2 == 1) {
            P();
            paint2.setColor(iArr2[size2 - 1]);
            return;
        }
        android.graphics.Shader.TileMode tileMode2 = android.graphics.Shader.TileMode.CLAMP;
        s7.o0 o0Var4 = d2Var.f485265k;
        if (o0Var4 != null) {
            if (o0Var4 == o0Var2) {
                tileMode2 = android.graphics.Shader.TileMode.MIRROR;
            } else if (o0Var4 == o0Var) {
                tileMode2 = android.graphics.Shader.TileMode.REPEAT;
            }
        }
        P();
        android.graphics.RadialGradient radialGradient = new android.graphics.RadialGradient(f17, f38, c18, iArr2, fArr2, tileMode2);
        radialGradient.setLocalMatrix(matrix3);
        paint2.setShader(radialGradient);
        int floatValue4 = (int) (this.f485190d.f485127a.f485325g.floatValue() * 256.0f);
        if (floatValue4 < 0) {
            floatValue4 = 0;
        } else if (floatValue4 > 255) {
            floatValue4 = 255;
        }
        paint2.setAlpha(floatValue4);
    }

    public final boolean k() {
        java.lang.Boolean bool = this.f485190d.f485127a.G;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x020a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(s7.x1 r21, android.graphics.Path r22) {
        /*
            Method dump skipped, instructions count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.f3.l(s7.x1, android.graphics.Path):void");
    }

    public final void m(android.graphics.Path path) {
        s7.b3 b3Var = this.f485190d;
        s7.q1 q1Var = b3Var.f485127a.S;
        s7.q1 q1Var2 = s7.q1.NonScalingStroke;
        android.graphics.Canvas canvas = this.f485187a;
        if (q1Var != q1Var2) {
            canvas.drawPath(path, b3Var.f485131e);
            return;
        }
        android.graphics.Matrix matrix = canvas.getMatrix();
        android.graphics.Path path2 = new android.graphics.Path();
        path.transform(matrix, path2);
        canvas.setMatrix(new android.graphics.Matrix());
        android.graphics.Shader shader = this.f485190d.f485131e.getShader();
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            android.graphics.Matrix matrix3 = new android.graphics.Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        canvas.drawPath(path2, this.f485190d.f485131e);
        canvas.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    public final void n(s7.l2 l2Var, s7.d3 d3Var) {
        float f17;
        float f18;
        float f19;
        s7.n1 u17;
        if (k()) {
            java.util.Iterator it = l2Var.f485379i.iterator();
            boolean z17 = true;
            while (it.hasNext()) {
                s7.a2 a2Var = (s7.a2) it.next();
                if (a2Var instanceof s7.p2) {
                    d3Var.b(R(((s7.p2) a2Var).f485302c, z17, !it.hasNext()));
                } else if (d3Var.a((s7.l2) a2Var)) {
                    boolean z18 = a2Var instanceof s7.m2;
                    s7.n1 n1Var = s7.n1.Middle;
                    s7.n1 n1Var2 = s7.n1.Start;
                    float f27 = 0.0f;
                    if (z18) {
                        Q();
                        s7.m2 m2Var = (s7.m2) a2Var;
                        U(this.f485190d, m2Var);
                        if (k() && W()) {
                            s7.a2 h17 = m2Var.f485118a.h(m2Var.f485257n);
                            if (h17 == null) {
                                java.lang.String.format("TextPath reference '%s' not found", m2Var.f485257n);
                            } else {
                                s7.z0 z0Var = (s7.z0) h17;
                                android.graphics.Path path = new s7.x2(z0Var.f485441o).f485424a;
                                android.graphics.Matrix matrix = z0Var.f485298n;
                                if (matrix != null) {
                                    path.transform(matrix);
                                }
                                android.graphics.PathMeasure pathMeasure = new android.graphics.PathMeasure(path, false);
                                s7.t0 t0Var = m2Var.f485258o;
                                float c17 = t0Var != null ? t0Var.c(this, pathMeasure.getLength()) : 0.0f;
                                s7.n1 u18 = u();
                                if (u18 != n1Var2) {
                                    float d17 = d(m2Var);
                                    if (u18 == n1Var) {
                                        d17 /= 2.0f;
                                    }
                                    c17 -= d17;
                                }
                                g((s7.x1) m2Var.f485259p);
                                boolean F = F();
                                n(m2Var, new s7.y2(this, path, c17, 0.0f));
                                if (F) {
                                    E(m2Var, m2Var.f485423h);
                                }
                            }
                        }
                        P();
                    } else if (a2Var instanceof s7.i2) {
                        Q();
                        s7.i2 i2Var = (s7.i2) a2Var;
                        U(this.f485190d, i2Var);
                        if (k()) {
                            java.util.List list = i2Var.f485271n;
                            boolean z19 = list != null && ((java.util.ArrayList) list).size() > 0;
                            boolean z27 = d3Var instanceof s7.z2;
                            if (z27) {
                                f17 = !z19 ? ((s7.z2) d3Var).f485446a : ((s7.t0) ((java.util.ArrayList) i2Var.f485271n).get(0)).d(this);
                                java.util.List list2 = i2Var.f485272o;
                                f18 = (list2 == null || ((java.util.ArrayList) list2).size() == 0) ? ((s7.z2) d3Var).f485447b : ((s7.t0) ((java.util.ArrayList) i2Var.f485272o).get(0)).e(this);
                                java.util.List list3 = i2Var.f485273p;
                                f19 = (list3 == null || ((java.util.ArrayList) list3).size() == 0) ? 0.0f : ((s7.t0) ((java.util.ArrayList) i2Var.f485273p).get(0)).d(this);
                                java.util.List list4 = i2Var.f485274q;
                                if (list4 != null && ((java.util.ArrayList) list4).size() != 0) {
                                    f27 = ((s7.t0) ((java.util.ArrayList) i2Var.f485274q).get(0)).e(this);
                                }
                            } else {
                                f17 = 0.0f;
                                f18 = 0.0f;
                                f19 = 0.0f;
                            }
                            if (z19 && (u17 = u()) != n1Var2) {
                                float d18 = d(i2Var);
                                if (u17 == n1Var) {
                                    d18 /= 2.0f;
                                }
                                f17 -= d18;
                            }
                            g((s7.x1) i2Var.f485215r);
                            if (z27) {
                                s7.z2 z2Var = (s7.z2) d3Var;
                                z2Var.f485446a = f17 + f19;
                                z2Var.f485447b = f18 + f27;
                            }
                            boolean F2 = F();
                            n(i2Var, d3Var);
                            if (F2) {
                                E(i2Var, i2Var.f485423h);
                            }
                        }
                        P();
                    } else if (a2Var instanceof s7.h2) {
                        Q();
                        s7.h2 h2Var = (s7.h2) a2Var;
                        U(this.f485190d, h2Var);
                        if (k()) {
                            g((s7.x1) h2Var.f485210o);
                            s7.a2 h18 = a2Var.f485118a.h(h2Var.f485209n);
                            if (h18 == null || !(h18 instanceof s7.l2)) {
                                java.lang.String.format("Tref reference '%s' not found", h2Var.f485209n);
                            } else {
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                o((s7.l2) h18, sb6);
                                if (sb6.length() > 0) {
                                    d3Var.b(sb6.toString());
                                }
                            }
                        }
                        P();
                    }
                }
                z17 = false;
            }
        }
    }

    public final void o(s7.l2 l2Var, java.lang.StringBuilder sb6) {
        java.util.Iterator it = l2Var.f485379i.iterator();
        boolean z17 = true;
        while (it.hasNext()) {
            s7.a2 a2Var = (s7.a2) it.next();
            if (a2Var instanceof s7.l2) {
                o((s7.l2) a2Var, sb6);
            } else if (a2Var instanceof s7.p2) {
                sb6.append(R(((s7.p2) a2Var).f485302c, z17, !it.hasNext()));
            }
            z17 = false;
        }
    }

    public final void p(s7.n0 n0Var, java.lang.String str) {
        s7.a2 h17 = n0Var.f485118a.h(str);
        if (h17 == null) {
            java.lang.String.format("Gradient reference '%s' not found", str);
            return;
        }
        if (!(h17 instanceof s7.n0)) {
            java.lang.String.format("Gradient href attributes must point to other gradient elements", new java.lang.Object[0]);
            return;
        }
        if (h17 == n0Var) {
            java.lang.String.format("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        s7.n0 n0Var2 = (s7.n0) h17;
        if (n0Var.f485263i == null) {
            n0Var.f485263i = n0Var2.f485263i;
        }
        if (n0Var.f485264j == null) {
            n0Var.f485264j = n0Var2.f485264j;
        }
        if (n0Var.f485265k == null) {
            n0Var.f485265k = n0Var2.f485265k;
        }
        if (n0Var.f485262h.isEmpty()) {
            n0Var.f485262h = n0Var2.f485262h;
        }
        try {
            if (n0Var instanceof s7.z1) {
                s7.z1 z1Var = (s7.z1) n0Var;
                s7.z1 z1Var2 = (s7.z1) h17;
                if (z1Var.f485442m == null) {
                    z1Var.f485442m = z1Var2.f485442m;
                }
                if (z1Var.f485443n == null) {
                    z1Var.f485443n = z1Var2.f485443n;
                }
                if (z1Var.f485444o == null) {
                    z1Var.f485444o = z1Var2.f485444o;
                }
                if (z1Var.f485445p == null) {
                    z1Var.f485445p = z1Var2.f485445p;
                }
            } else {
                q((s7.d2) n0Var, (s7.d2) h17);
            }
        } catch (java.lang.ClassCastException unused) {
        }
        java.lang.String str2 = n0Var2.f485266l;
        if (str2 != null) {
            p(n0Var, str2);
        }
    }

    public final void q(s7.d2 d2Var, s7.d2 d2Var2) {
        if (d2Var.f485166m == null) {
            d2Var.f485166m = d2Var2.f485166m;
        }
        if (d2Var.f485167n == null) {
            d2Var.f485167n = d2Var2.f485167n;
        }
        if (d2Var.f485168o == null) {
            d2Var.f485168o = d2Var2.f485168o;
        }
        if (d2Var.f485169p == null) {
            d2Var.f485169p = d2Var2.f485169p;
        }
        if (d2Var.f485170q == null) {
            d2Var.f485170q = d2Var2.f485170q;
        }
    }

    public final void r(s7.c1 c1Var, java.lang.String str) {
        s7.a2 h17 = c1Var.f485118a.h(str);
        if (h17 == null) {
            java.lang.String.format("Pattern reference '%s' not found", str);
            return;
        }
        if (!(h17 instanceof s7.c1)) {
            java.lang.String.format("Pattern href attributes must point to other pattern elements", new java.lang.Object[0]);
            return;
        }
        if (h17 == c1Var) {
            java.lang.String.format("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        s7.c1 c1Var2 = (s7.c1) h17;
        if (c1Var.f485142p == null) {
            c1Var.f485142p = c1Var2.f485142p;
        }
        if (c1Var.f485143q == null) {
            c1Var.f485143q = c1Var2.f485143q;
        }
        if (c1Var.f485144r == null) {
            c1Var.f485144r = c1Var2.f485144r;
        }
        if (c1Var.f485145s == null) {
            c1Var.f485145s = c1Var2.f485145s;
        }
        if (c1Var.f485146t == null) {
            c1Var.f485146t = c1Var2.f485146t;
        }
        if (c1Var.f485147u == null) {
            c1Var.f485147u = c1Var2.f485147u;
        }
        if (c1Var.f485148v == null) {
            c1Var.f485148v = c1Var2.f485148v;
        }
        if (c1Var.f485379i.isEmpty()) {
            c1Var.f485379i = c1Var2.f485379i;
        }
        if (c1Var.f485173o == null) {
            c1Var.f485173o = c1Var2.f485173o;
        }
        if (c1Var.f485150n == null) {
            c1Var.f485150n = c1Var2.f485150n;
        }
        java.lang.String str2 = c1Var2.f485149w;
        if (str2 != null) {
            r(c1Var, str2);
        }
    }

    public final s7.b3 s(s7.a2 a2Var) {
        s7.b3 b3Var = new s7.b3(this);
        T(b3Var, s7.r1.a());
        t(a2Var, b3Var);
        return b3Var;
    }

    public final s7.b3 t(s7.a2 a2Var, s7.b3 b3Var) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            if (a2Var instanceof s7.y1) {
                arrayList.add(0, (s7.y1) a2Var);
            }
            java.lang.Object obj = a2Var.f485119b;
            if (obj == null) {
                break;
            }
            a2Var = (s7.a2) obj;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            U(b3Var, (s7.y1) it.next());
        }
        s7.b3 b3Var2 = this.f485190d;
        b3Var.f485133g = b3Var2.f485133g;
        b3Var.f485132f = b3Var2.f485132f;
        return b3Var;
    }

    public final s7.n1 u() {
        s7.n1 n1Var;
        s7.r1 r1Var = this.f485190d.f485127a;
        if (r1Var.f485341z == s7.p1.LTR || (n1Var = r1Var.A) == s7.n1.Middle) {
            return r1Var.A;
        }
        s7.n1 n1Var2 = s7.n1.Start;
        return n1Var == n1Var2 ? s7.n1.End : n1Var2;
    }

    public final android.graphics.Path.FillType v() {
        s7.i1 i1Var = this.f485190d.f485127a.L;
        return (i1Var == null || i1Var != s7.i1.EvenOdd) ? android.graphics.Path.FillType.WINDING : android.graphics.Path.FillType.EVEN_ODD;
    }

    public final boolean w(s7.r1 r1Var, long j17) {
        return (r1Var.f485322d & j17) != 0;
    }

    public final android.graphics.Path x(s7.h0 h0Var) {
        s7.t0 t0Var = h0Var.f485205o;
        float d17 = t0Var != null ? t0Var.d(this) : 0.0f;
        s7.t0 t0Var2 = h0Var.f485206p;
        float e17 = t0Var2 != null ? t0Var2.e(this) : 0.0f;
        float b17 = h0Var.f485207q.b(this);
        float f17 = d17 - b17;
        float f18 = e17 - b17;
        float f19 = d17 + b17;
        float f27 = e17 + b17;
        if (h0Var.f485423h == null) {
            float f28 = 2.0f * b17;
            h0Var.f485423h = new s7.f0(f17, f18, f28, f28);
        }
        float f29 = 0.5522848f * b17;
        android.graphics.Path path = new android.graphics.Path();
        path.moveTo(d17, f18);
        float f37 = d17 + f29;
        float f38 = e17 - f29;
        path.cubicTo(f37, f18, f19, f38, f19, e17);
        float f39 = e17 + f29;
        path.cubicTo(f19, f39, f37, f27, d17, f27);
        float f47 = d17 - f29;
        path.cubicTo(f47, f27, f17, f39, f17, e17);
        path.cubicTo(f17, f38, f47, f18, d17, f18);
        path.close();
        return path;
    }

    public final android.graphics.Path y(s7.m0 m0Var) {
        s7.t0 t0Var = m0Var.f485249o;
        float d17 = t0Var != null ? t0Var.d(this) : 0.0f;
        s7.t0 t0Var2 = m0Var.f485250p;
        float e17 = t0Var2 != null ? t0Var2.e(this) : 0.0f;
        float d18 = m0Var.f485251q.d(this);
        float e18 = m0Var.f485252r.e(this);
        float f17 = d17 - d18;
        float f18 = e17 - e18;
        float f19 = d17 + d18;
        float f27 = e17 + e18;
        if (m0Var.f485423h == null) {
            m0Var.f485423h = new s7.f0(f17, f18, d18 * 2.0f, 2.0f * e18);
        }
        float f28 = d18 * 0.5522848f;
        float f29 = 0.5522848f * e18;
        android.graphics.Path path = new android.graphics.Path();
        path.moveTo(d17, f18);
        float f37 = d17 + f28;
        float f38 = e17 - f29;
        path.cubicTo(f37, f18, f19, f38, f19, e17);
        float f39 = f29 + e17;
        path.cubicTo(f19, f39, f37, f27, d17, f27);
        float f47 = d17 - f28;
        path.cubicTo(f47, f27, f17, f39, f17, e17);
        path.cubicTo(f17, f38, f47, f18, d17, f18);
        path.close();
        return path;
    }

    public final android.graphics.Path z(s7.d1 d1Var) {
        android.graphics.Path path = new android.graphics.Path();
        float[] fArr = d1Var.f485165o;
        path.moveTo(fArr[0], fArr[1]);
        int i17 = 2;
        while (true) {
            float[] fArr2 = d1Var.f485165o;
            if (i17 >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i17], fArr2[i17 + 1]);
            i17 += 2;
        }
        if (d1Var instanceof s7.e1) {
            path.close();
        }
        if (d1Var.f485423h == null) {
            d1Var.f485423h = c(path);
        }
        return path;
    }
}

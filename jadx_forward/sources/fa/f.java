package fa;

/* loaded from: classes15.dex */
public final class f {
    public float A;
    public int[] B;
    public boolean C;
    public final android.text.TextPaint D;
    public final android.text.TextPaint E;
    public android.animation.TimeInterpolator F;
    public android.animation.TimeInterpolator G;
    public float H;
    public float I;

    /* renamed from: J, reason: collision with root package name */
    public float f342128J;
    public int K;
    public float L;
    public float M;
    public float N;
    public int O;

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f342129a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f342130b;

    /* renamed from: c, reason: collision with root package name */
    public float f342131c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Rect f342132d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Rect f342133e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.RectF f342134f;

    /* renamed from: g, reason: collision with root package name */
    public int f342135g = 16;

    /* renamed from: h, reason: collision with root package name */
    public int f342136h = 16;

    /* renamed from: i, reason: collision with root package name */
    public float f342137i = 15.0f;

    /* renamed from: j, reason: collision with root package name */
    public float f342138j = 15.0f;

    /* renamed from: k, reason: collision with root package name */
    public android.content.res.ColorStateList f342139k;

    /* renamed from: l, reason: collision with root package name */
    public android.content.res.ColorStateList f342140l;

    /* renamed from: m, reason: collision with root package name */
    public float f342141m;

    /* renamed from: n, reason: collision with root package name */
    public float f342142n;

    /* renamed from: o, reason: collision with root package name */
    public float f342143o;

    /* renamed from: p, reason: collision with root package name */
    public float f342144p;

    /* renamed from: q, reason: collision with root package name */
    public float f342145q;

    /* renamed from: r, reason: collision with root package name */
    public float f342146r;

    /* renamed from: s, reason: collision with root package name */
    public android.graphics.Typeface f342147s;

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.Typeface f342148t;

    /* renamed from: u, reason: collision with root package name */
    public android.graphics.Typeface f342149u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.CharSequence f342150v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.CharSequence f342151w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f342152x;

    /* renamed from: y, reason: collision with root package name */
    public android.graphics.Bitmap f342153y;

    /* renamed from: z, reason: collision with root package name */
    public float f342154z;

    public f(android.view.View view) {
        this.f342129a = view;
        android.text.TextPaint textPaint = new android.text.TextPaint(129);
        this.D = textPaint;
        this.E = new android.text.TextPaint(textPaint);
        this.f342133e = new android.graphics.Rect();
        this.f342132d = new android.graphics.Rect();
        this.f342134f = new android.graphics.RectF();
    }

    public static int a(int i17, int i18, float f17) {
        float f18 = 1.0f - f17;
        return android.graphics.Color.argb((int) ((android.graphics.Color.alpha(i17) * f18) + (android.graphics.Color.alpha(i18) * f17)), (int) ((android.graphics.Color.red(i17) * f18) + (android.graphics.Color.red(i18) * f17)), (int) ((android.graphics.Color.green(i17) * f18) + (android.graphics.Color.green(i18) * f17)), (int) ((android.graphics.Color.blue(i17) * f18) + (android.graphics.Color.blue(i18) * f17)));
    }

    public static float f(float f17, float f18, float f19, android.animation.TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f19 = timeInterpolator.getInterpolation(f19);
        }
        android.animation.TimeInterpolator timeInterpolator2 = w9.a.f525567a;
        return f17 + (f19 * (f18 - f17));
    }

    public final boolean b(java.lang.CharSequence charSequence) {
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        return ((l3.i) (n3.v0.d(this.f342129a) == 1 ? l3.k.f396838d : l3.k.f396837c)).b(charSequence, 0, charSequence.length());
    }

    public final void c(float f17) {
        boolean z17;
        float f18;
        if (this.f342150v == null) {
            return;
        }
        float width = this.f342133e.width();
        float width2 = this.f342132d.width();
        if (java.lang.Math.abs(f17 - this.f342138j) < 0.001f) {
            f18 = this.f342138j;
            this.f342154z = 1.0f;
            android.graphics.Typeface typeface = this.f342149u;
            android.graphics.Typeface typeface2 = this.f342147s;
            if (typeface != typeface2) {
                this.f342149u = typeface2;
                z17 = true;
            } else {
                z17 = false;
            }
        } else {
            float f19 = this.f342137i;
            android.graphics.Typeface typeface3 = this.f342149u;
            android.graphics.Typeface typeface4 = this.f342148t;
            if (typeface3 != typeface4) {
                this.f342149u = typeface4;
                z17 = true;
            } else {
                z17 = false;
            }
            if (java.lang.Math.abs(f17 - f19) < 0.001f) {
                this.f342154z = 1.0f;
            } else {
                this.f342154z = f17 / this.f342137i;
            }
            float f27 = this.f342138j / this.f342137i;
            width = width2 * f27 > width ? java.lang.Math.min(width / f27, width2) : width2;
            f18 = f19;
        }
        if (width > 0.0f) {
            z17 = this.A != f18 || this.C || z17;
            this.A = f18;
            this.C = false;
        }
        if (this.f342151w == null || z17) {
            android.text.TextPaint textPaint = this.D;
            textPaint.setTextSize(this.A);
            textPaint.setTypeface(this.f342149u);
            textPaint.setLinearText(this.f342154z != 1.0f);
            java.lang.CharSequence ellipsize = android.text.TextUtils.ellipsize(this.f342150v, textPaint, width, android.text.TextUtils.TruncateAt.END);
            if (android.text.TextUtils.equals(ellipsize, this.f342151w)) {
                return;
            }
            this.f342151w = ellipsize;
            this.f342152x = b(ellipsize);
        }
    }

    public void d(android.graphics.Canvas canvas) {
        int save = canvas.save();
        if (this.f342151w != null && this.f342130b) {
            float f17 = this.f342145q;
            float f18 = this.f342146r;
            android.text.TextPaint textPaint = this.D;
            textPaint.ascent();
            textPaint.descent();
            float f19 = this.f342154z;
            if (f19 != 1.0f) {
                canvas.scale(f19, f19, f17, f18);
            }
            java.lang.CharSequence charSequence = this.f342151w;
            canvas.drawText(charSequence, 0, charSequence.length(), f17, f18, textPaint);
        }
        canvas.restoreToCount(save);
    }

    public int e() {
        int[] iArr = this.B;
        return iArr != null ? this.f342140l.getColorForState(iArr, 0) : this.f342140l.getDefaultColor();
    }

    public void g() {
        boolean z17;
        android.graphics.Rect rect = this.f342133e;
        if (rect.width() > 0 && rect.height() > 0) {
            android.graphics.Rect rect2 = this.f342132d;
            if (rect2.width() > 0 && rect2.height() > 0) {
                z17 = true;
                this.f342130b = z17;
            }
        }
        z17 = false;
        this.f342130b = z17;
    }

    public final android.graphics.Typeface h(int i17) {
        android.content.res.TypedArray obtainStyledAttributes = this.f342129a.getContext().obtainStyledAttributes(i17, new int[]{android.R.attr.fontFamily});
        try {
            java.lang.String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                return android.graphics.Typeface.create(string, 0);
            }
            obtainStyledAttributes.recycle();
            return null;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void i() {
        android.view.View view = this.f342129a;
        if (view.getHeight() <= 0 || view.getWidth() <= 0) {
            return;
        }
        float f17 = this.A;
        c(this.f342138j);
        java.lang.CharSequence charSequence = this.f342151w;
        android.text.TextPaint textPaint = this.D;
        float measureText = charSequence != null ? textPaint.measureText(charSequence, 0, charSequence.length()) : 0.0f;
        int absoluteGravity = android.view.Gravity.getAbsoluteGravity(this.f342136h, this.f342152x ? 1 : 0);
        int i17 = absoluteGravity & 112;
        android.graphics.Rect rect = this.f342133e;
        if (i17 == 48) {
            this.f342142n = rect.top - textPaint.ascent();
        } else if (i17 != 80) {
            this.f342142n = rect.centerY() + (((textPaint.descent() - textPaint.ascent()) / 2.0f) - textPaint.descent());
        } else {
            this.f342142n = rect.bottom;
        }
        int i18 = absoluteGravity & 8388615;
        if (i18 == 1) {
            this.f342144p = rect.centerX() - (measureText / 2.0f);
        } else if (i18 != 5) {
            this.f342144p = rect.left;
        } else {
            this.f342144p = rect.right - measureText;
        }
        c(this.f342137i);
        java.lang.CharSequence charSequence2 = this.f342151w;
        float measureText2 = charSequence2 != null ? textPaint.measureText(charSequence2, 0, charSequence2.length()) : 0.0f;
        int absoluteGravity2 = android.view.Gravity.getAbsoluteGravity(this.f342135g, this.f342152x ? 1 : 0);
        int i19 = absoluteGravity2 & 112;
        android.graphics.Rect rect2 = this.f342132d;
        if (i19 == 48) {
            this.f342141m = rect2.top - textPaint.ascent();
        } else if (i19 != 80) {
            this.f342141m = rect2.centerY() + (((textPaint.descent() - textPaint.ascent()) / 2.0f) - textPaint.descent());
        } else {
            this.f342141m = rect2.bottom;
        }
        int i27 = absoluteGravity2 & 8388615;
        if (i27 == 1) {
            this.f342143o = rect2.centerX() - (measureText2 / 2.0f);
        } else if (i27 != 5) {
            this.f342143o = rect2.left;
        } else {
            this.f342143o = rect2.right - measureText2;
        }
        android.graphics.Bitmap bitmap = this.f342153y;
        if (bitmap != null) {
            bitmap.recycle();
            this.f342153y = null;
        }
        n(f17);
        float f18 = this.f342131c;
        android.graphics.RectF rectF = this.f342134f;
        rectF.left = f(rect2.left, rect.left, f18, this.F);
        rectF.top = f(this.f342141m, this.f342142n, f18, this.F);
        rectF.right = f(rect2.right, rect.right, f18, this.F);
        rectF.bottom = f(rect2.bottom, rect.bottom, f18, this.F);
        this.f342145q = f(this.f342143o, this.f342144p, f18, this.F);
        this.f342146r = f(this.f342141m, this.f342142n, f18, this.F);
        n(f(this.f342137i, this.f342138j, f18, this.G));
        android.content.res.ColorStateList colorStateList = this.f342140l;
        android.content.res.ColorStateList colorStateList2 = this.f342139k;
        if (colorStateList != colorStateList2) {
            int[] iArr = this.B;
            textPaint.setColor(a(iArr != null ? colorStateList2.getColorForState(iArr, 0) : colorStateList2.getDefaultColor(), e(), f18));
        } else {
            textPaint.setColor(e());
        }
        textPaint.setShadowLayer(f(this.L, this.H, f18, null), f(this.M, this.I, f18, null), f(this.N, this.f342128J, f18, null), a(this.O, this.K, f18));
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.u0.k(view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r0 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.f342129a
            android.content.Context r0 = r0.getContext()
            int[] r1 = j.a.f377730y
            android.content.res.TypedArray r1 = r0.obtainStyledAttributes(r7, r1)
            r2 = 3
            boolean r3 = r1.hasValue(r2)
            r4 = 0
            if (r3 == 0) goto L2f
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L29
            int r3 = r1.getResourceId(r2, r4)
            if (r3 == 0) goto L29
            java.lang.Object r5 = k.a.f384389a
            android.content.res.ColorStateList r0 = r0.getColorStateList(r3)
            if (r0 == 0) goto L29
            goto L2d
        L29:
            android.content.res.ColorStateList r0 = r1.getColorStateList(r2)
        L2d:
            r6.f342140l = r0
        L2f:
            boolean r0 = r1.hasValue(r4)
            if (r0 == 0) goto L3f
            float r0 = r6.f342138j
            int r0 = (int) r0
            int r0 = r1.getDimensionPixelSize(r4, r0)
            float r0 = (float) r0
            r6.f342138j = r0
        L3f:
            r0 = 6
            int r0 = r1.getInt(r0, r4)
            r6.K = r0
            r0 = 7
            r2 = 0
            float r0 = r1.getFloat(r0, r2)
            r6.I = r0
            r0 = 8
            float r0 = r1.getFloat(r0, r2)
            r6.f342128J = r0
            r0 = 9
            float r0 = r1.getFloat(r0, r2)
            r6.H = r0
            r1.recycle()
            android.graphics.Typeface r7 = r6.h(r7)
            r6.f342147s = r7
            r6.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fa.f.j(int):void");
    }

    public void k(android.content.res.ColorStateList colorStateList) {
        if (this.f342140l != colorStateList) {
            this.f342140l = colorStateList;
            i();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r0 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.f342129a
            android.content.Context r0 = r0.getContext()
            int[] r1 = j.a.f377730y
            android.content.res.TypedArray r1 = r0.obtainStyledAttributes(r7, r1)
            r2 = 3
            boolean r3 = r1.hasValue(r2)
            r4 = 0
            if (r3 == 0) goto L2f
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L29
            int r3 = r1.getResourceId(r2, r4)
            if (r3 == 0) goto L29
            java.lang.Object r5 = k.a.f384389a
            android.content.res.ColorStateList r0 = r0.getColorStateList(r3)
            if (r0 == 0) goto L29
            goto L2d
        L29:
            android.content.res.ColorStateList r0 = r1.getColorStateList(r2)
        L2d:
            r6.f342139k = r0
        L2f:
            boolean r0 = r1.hasValue(r4)
            if (r0 == 0) goto L3f
            float r0 = r6.f342137i
            int r0 = (int) r0
            int r0 = r1.getDimensionPixelSize(r4, r0)
            float r0 = (float) r0
            r6.f342137i = r0
        L3f:
            r0 = 6
            int r0 = r1.getInt(r0, r4)
            r6.O = r0
            r0 = 7
            r2 = 0
            float r0 = r1.getFloat(r0, r2)
            r6.M = r0
            r0 = 8
            float r0 = r1.getFloat(r0, r2)
            r6.N = r0
            r0 = 9
            float r0 = r1.getFloat(r0, r2)
            r6.L = r0
            r1.recycle()
            android.graphics.Typeface r7 = r6.h(r7)
            r6.f342148t = r7
            r6.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fa.f.l(int):void");
    }

    public void m(float f17) {
        float a17 = h3.a.a(f17, 0.0f, 1.0f);
        if (a17 != this.f342131c) {
            this.f342131c = a17;
            android.graphics.RectF rectF = this.f342134f;
            float f18 = this.f342132d.left;
            android.graphics.Rect rect = this.f342133e;
            rectF.left = f(f18, rect.left, a17, this.F);
            rectF.top = f(this.f342141m, this.f342142n, a17, this.F);
            rectF.right = f(r1.right, rect.right, a17, this.F);
            rectF.bottom = f(r1.bottom, rect.bottom, a17, this.F);
            this.f342145q = f(this.f342143o, this.f342144p, a17, this.F);
            this.f342146r = f(this.f342141m, this.f342142n, a17, this.F);
            n(f(this.f342137i, this.f342138j, a17, this.G));
            android.content.res.ColorStateList colorStateList = this.f342140l;
            android.content.res.ColorStateList colorStateList2 = this.f342139k;
            android.text.TextPaint textPaint = this.D;
            if (colorStateList != colorStateList2) {
                int[] iArr = this.B;
                textPaint.setColor(a(iArr != null ? colorStateList2.getColorForState(iArr, 0) : colorStateList2.getDefaultColor(), e(), a17));
            } else {
                textPaint.setColor(e());
            }
            textPaint.setShadowLayer(f(this.L, this.H, a17, null), f(this.M, this.I, a17, null), f(this.N, this.f342128J, a17, null), a(this.O, this.K, a17));
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.u0.k(this.f342129a);
        }
    }

    public final void n(float f17) {
        c(f17);
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.u0.k(this.f342129a);
    }

    public final boolean o(int[] iArr) {
        android.content.res.ColorStateList colorStateList;
        this.B = iArr;
        android.content.res.ColorStateList colorStateList2 = this.f342140l;
        if (!((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f342139k) != null && colorStateList.isStateful()))) {
            return false;
        }
        i();
        return true;
    }
}

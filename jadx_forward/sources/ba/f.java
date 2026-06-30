package ba;

/* loaded from: classes15.dex */
public class f extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback {
    public static final int[] F1 = {android.R.attr.state_enabled};
    public boolean A;
    public boolean A1;
    public android.graphics.drawable.Drawable B;
    public float B1;
    public w9.h C;
    public android.text.TextUtils.TruncateAt C1;
    public w9.h D;
    public boolean D1;
    public float E;
    public int E1;
    public float F;
    public float G;
    public float H;
    public float I;

    /* renamed from: J, reason: collision with root package name */
    public float f100174J;
    public float K;
    public float L;
    public final android.content.Context M;
    public final android.text.TextPaint N;
    public final android.graphics.Paint P;
    public final android.graphics.Paint.FontMetrics Q;
    public final android.graphics.RectF R;
    public final android.graphics.PointF S;
    public int T;
    public int U;
    public int V;
    public int W;
    public boolean X;
    public int Y;
    public int Z;

    /* renamed from: d, reason: collision with root package name */
    public android.content.res.ColorStateList f100175d;

    /* renamed from: e, reason: collision with root package name */
    public float f100176e;

    /* renamed from: f, reason: collision with root package name */
    public float f100177f;

    /* renamed from: g, reason: collision with root package name */
    public android.content.res.ColorStateList f100178g;

    /* renamed from: h, reason: collision with root package name */
    public float f100179h;

    /* renamed from: i, reason: collision with root package name */
    public android.content.res.ColorStateList f100180i;

    /* renamed from: l1, reason: collision with root package name */
    public android.graphics.PorterDuff.Mode f100181l1;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.CharSequence f100182m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.CharSequence f100183n;

    /* renamed from: o, reason: collision with root package name */
    public ia.c f100184o;

    /* renamed from: p, reason: collision with root package name */
    public final d3.p f100185p = new ba.d(this);

    /* renamed from: p0, reason: collision with root package name */
    public android.graphics.ColorFilter f100186p0;

    /* renamed from: p1, reason: collision with root package name */
    public int[] f100187p1;

    /* renamed from: q, reason: collision with root package name */
    public boolean f100188q;

    /* renamed from: r, reason: collision with root package name */
    public android.graphics.drawable.Drawable f100189r;

    /* renamed from: s, reason: collision with root package name */
    public android.content.res.ColorStateList f100190s;

    /* renamed from: t, reason: collision with root package name */
    public float f100191t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f100192u;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.drawable.Drawable f100193v;

    /* renamed from: w, reason: collision with root package name */
    public android.content.res.ColorStateList f100194w;

    /* renamed from: x, reason: collision with root package name */
    public float f100195x;

    /* renamed from: x0, reason: collision with root package name */
    public android.graphics.PorterDuffColorFilter f100196x0;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f100197x1;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.CharSequence f100198y;

    /* renamed from: y0, reason: collision with root package name */
    public android.content.res.ColorStateList f100199y0;

    /* renamed from: y1, reason: collision with root package name */
    public android.content.res.ColorStateList f100200y1;

    /* renamed from: z, reason: collision with root package name */
    public boolean f100201z;

    /* renamed from: z1, reason: collision with root package name */
    public java.lang.ref.WeakReference f100202z1;

    public f(android.content.Context context) {
        android.text.TextPaint textPaint = new android.text.TextPaint(1);
        this.N = textPaint;
        this.P = new android.graphics.Paint(1);
        this.Q = new android.graphics.Paint.FontMetrics();
        this.R = new android.graphics.RectF();
        this.S = new android.graphics.PointF();
        this.Z = 255;
        this.f100181l1 = android.graphics.PorterDuff.Mode.SRC_IN;
        this.f100202z1 = new java.lang.ref.WeakReference(null);
        this.A1 = true;
        this.M = context;
        this.f100182m = "";
        textPaint.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = F1;
        setState(iArr);
        if (!java.util.Arrays.equals(this.f100187p1, iArr)) {
            this.f100187p1 = iArr;
            if (D()) {
                h(getState(), iArr);
            }
        }
        this.D1 = true;
    }

    public static boolean f(android.graphics.drawable.Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public void A(ia.c cVar) {
        if (this.f100184o != cVar) {
            this.f100184o = cVar;
            if (cVar != null) {
                cVar.c(this.M, this.N, this.f100185p);
                this.A1 = true;
            }
            onStateChange(getState());
            g();
        }
    }

    public final boolean B() {
        return this.A && this.B != null && this.X;
    }

    public final boolean C() {
        return this.f100188q && this.f100189r != null;
    }

    public final boolean D() {
        return this.f100192u && this.f100193v != null;
    }

    public final void E(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public final void a(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            f3.c.b(drawable, f3.c.a(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.f100193v) {
                if (drawable.isStateful()) {
                    drawable.setState(this.f100187p1);
                }
                f3.b.h(drawable, this.f100194w);
            } else if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    public final void b(android.graphics.Rect rect, android.graphics.RectF rectF) {
        rectF.setEmpty();
        if (C() || B()) {
            float f17 = this.E + this.F;
            if (f3.c.a(this) == 0) {
                float f18 = rect.left + f17;
                rectF.left = f18;
                rectF.right = f18 + this.f100191t;
            } else {
                float f19 = rect.right - f17;
                rectF.right = f19;
                rectF.left = f19 - this.f100191t;
            }
            float exactCenterY = rect.exactCenterY();
            float f27 = this.f100191t;
            float f28 = exactCenterY - (f27 / 2.0f);
            rectF.top = f28;
            rectF.bottom = f28 + f27;
        }
    }

    public float c() {
        if (C() || B()) {
            return this.F + this.f100191t + this.G;
        }
        return 0.0f;
    }

    public final float d() {
        if (D()) {
            return this.f100174J + this.f100195x + this.K;
        }
        return 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        int i17;
        int i18;
        android.graphics.Rect bounds = getBounds();
        if (bounds.isEmpty() || (i17 = this.Z) == 0) {
            return;
        }
        int saveLayerAlpha = i17 < 255 ? canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i17) : 0;
        android.graphics.Paint paint = this.P;
        paint.setColor(this.T);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.ColorFilter colorFilter = this.f100186p0;
        if (colorFilter == null) {
            colorFilter = this.f100196x0;
        }
        paint.setColorFilter(colorFilter);
        android.graphics.RectF rectF = this.R;
        rectF.set(bounds);
        float f17 = this.f100177f;
        canvas.drawRoundRect(rectF, f17, f17, paint);
        if (this.f100179h > 0.0f) {
            paint.setColor(this.U);
            paint.setStyle(android.graphics.Paint.Style.STROKE);
            android.graphics.ColorFilter colorFilter2 = this.f100186p0;
            if (colorFilter2 == null) {
                colorFilter2 = this.f100196x0;
            }
            paint.setColorFilter(colorFilter2);
            float f18 = bounds.left;
            float f19 = this.f100179h / 2.0f;
            rectF.set(f18 + f19, bounds.top + f19, bounds.right - f19, bounds.bottom - f19);
            float f27 = this.f100177f - (this.f100179h / 2.0f);
            canvas.drawRoundRect(rectF, f27, f27, paint);
        }
        paint.setColor(this.V);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        rectF.set(bounds);
        float f28 = this.f100177f;
        canvas.drawRoundRect(rectF, f28, f28, paint);
        if (C()) {
            b(bounds, rectF);
            float f29 = rectF.left;
            float f37 = rectF.top;
            canvas.translate(f29, f37);
            this.f100189r.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f100189r.draw(canvas);
            canvas.translate(-f29, -f37);
        }
        if (B()) {
            b(bounds, rectF);
            float f38 = rectF.left;
            float f39 = rectF.top;
            canvas.translate(f38, f39);
            this.B.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.B.draw(canvas);
            canvas.translate(-f38, -f39);
        }
        if (this.D1 && this.f100183n != null) {
            android.graphics.PointF pointF = this.S;
            pointF.set(0.0f, 0.0f);
            android.graphics.Paint.Align align = android.graphics.Paint.Align.LEFT;
            java.lang.CharSequence charSequence = this.f100183n;
            android.text.TextPaint textPaint = this.N;
            if (charSequence != null) {
                float c17 = this.E + c() + this.H;
                if (f3.c.a(this) == 0) {
                    pointF.x = bounds.left + c17;
                    align = android.graphics.Paint.Align.LEFT;
                } else {
                    pointF.x = bounds.right - c17;
                    align = android.graphics.Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                android.graphics.Paint.FontMetrics fontMetrics = this.Q;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF.setEmpty();
            if (this.f100183n != null) {
                float c18 = this.E + c() + this.H;
                float d17 = this.L + d() + this.I;
                if (f3.c.a(this) == 0) {
                    rectF.left = bounds.left + c18;
                    rectF.right = bounds.right - d17;
                } else {
                    rectF.left = bounds.left + d17;
                    rectF.right = bounds.right - c18;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            if (this.f100184o != null) {
                textPaint.drawableState = getState();
                this.f100184o.b(this.M, textPaint, this.f100185p);
            }
            textPaint.setTextAlign(align);
            boolean z17 = java.lang.Math.round(e()) > java.lang.Math.round(rectF.width());
            if (z17) {
                int save = canvas.save();
                canvas.clipRect(rectF);
                i18 = save;
            } else {
                i18 = 0;
            }
            java.lang.CharSequence charSequence2 = this.f100183n;
            if (z17 && this.C1 != null) {
                charSequence2 = android.text.TextUtils.ellipsize(charSequence2, textPaint, rectF.width(), this.C1);
            }
            int i19 = i18;
            canvas.drawText(charSequence2, 0, charSequence2.length(), pointF.x, pointF.y, textPaint);
            if (z17) {
                canvas.restoreToCount(i19);
            }
        }
        if (D()) {
            rectF.setEmpty();
            if (D()) {
                float f47 = this.L + this.K;
                if (f3.c.a(this) == 0) {
                    float f48 = bounds.right - f47;
                    rectF.right = f48;
                    rectF.left = f48 - this.f100195x;
                } else {
                    float f49 = bounds.left + f47;
                    rectF.left = f49;
                    rectF.right = f49 + this.f100195x;
                }
                float exactCenterY = bounds.exactCenterY();
                float f57 = this.f100195x;
                float f58 = exactCenterY - (f57 / 2.0f);
                rectF.top = f58;
                rectF.bottom = f58 + f57;
            }
            float f59 = rectF.left;
            float f66 = rectF.top;
            canvas.translate(f59, f66);
            this.f100193v.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f100193v.draw(canvas);
            canvas.translate(-f59, -f66);
        }
        if (this.Z < 255) {
            canvas.restoreToCount(saveLayerAlpha);
        }
    }

    public final float e() {
        if (!this.A1) {
            return this.B1;
        }
        java.lang.CharSequence charSequence = this.f100183n;
        float measureText = charSequence == null ? 0.0f : this.N.measureText(charSequence, 0, charSequence.length());
        this.B1 = measureText;
        this.A1 = false;
        return measureText;
    }

    public void g() {
        ba.e eVar = (ba.e) this.f100202z1.get();
        if (eVar != null) {
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p252x2e944c.C2694x20086c c2694x20086c = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p252x2e944c.C2694x20086c) eVar;
            c2694x20086c.f();
            c2694x20086c.requestLayout();
            c2694x20086c.invalidateOutline();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.Z;
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.ColorFilter getColorFilter() {
        return this.f100186p0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f100176e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return java.lang.Math.min(java.lang.Math.round(this.E + c() + this.H + e() + this.I + d() + this.L), this.E1);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline outline) {
        android.graphics.Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f100176e, this.f100177f);
        } else {
            outline.setRoundRect(bounds, this.f100177f);
        }
        outline.setAlpha(this.Z / 255.0f);
    }

    public final boolean h(int[] iArr, int[] iArr2) {
        boolean z17;
        boolean z18;
        android.content.res.ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        android.content.res.ColorStateList colorStateList2 = this.f100175d;
        int colorForState = colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.T) : 0;
        boolean z19 = true;
        if (this.T != colorForState) {
            this.T = colorForState;
            onStateChange = true;
        }
        android.content.res.ColorStateList colorStateList3 = this.f100178g;
        int colorForState2 = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.U) : 0;
        if (this.U != colorForState2) {
            this.U = colorForState2;
            onStateChange = true;
        }
        android.content.res.ColorStateList colorStateList4 = this.f100200y1;
        int colorForState3 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.V) : 0;
        if (this.V != colorForState3) {
            this.V = colorForState3;
            if (this.f100197x1) {
                onStateChange = true;
            }
        }
        ia.c cVar = this.f100184o;
        int colorForState4 = (cVar == null || (colorStateList = cVar.f371405b) == null) ? 0 : colorStateList.getColorForState(iArr, this.W);
        if (this.W != colorForState4) {
            this.W = colorForState4;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            for (int i17 : state) {
                if (i17 == 16842912) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        boolean z27 = z17 && this.f100201z;
        if (this.X == z27 || this.B == null) {
            z18 = false;
        } else {
            float c17 = c();
            this.X = z27;
            if (c17 != c()) {
                onStateChange = true;
                z18 = true;
            } else {
                z18 = false;
                onStateChange = true;
            }
        }
        android.content.res.ColorStateList colorStateList5 = this.f100199y0;
        int colorForState5 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.Y) : 0;
        if (this.Y != colorForState5) {
            this.Y = colorForState5;
            android.content.res.ColorStateList colorStateList6 = this.f100199y0;
            android.graphics.PorterDuff.Mode mode = this.f100181l1;
            this.f100196x0 = (colorStateList6 == null || mode == null) ? null : new android.graphics.PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            z19 = onStateChange;
        }
        if (f(this.f100189r)) {
            z19 |= this.f100189r.setState(iArr);
        }
        if (f(this.B)) {
            z19 |= this.B.setState(iArr);
        }
        if (f(this.f100193v)) {
            z19 |= this.f100193v.setState(iArr2);
        }
        if (z19) {
            invalidateSelf();
        }
        if (z18) {
            g();
        }
        return z19;
    }

    public void i(boolean z17) {
        if (this.f100201z != z17) {
            this.f100201z = z17;
            float c17 = c();
            if (!z17 && this.X) {
                this.X = false;
            }
            float c18 = c();
            invalidateSelf();
            if (c17 != c18) {
                g();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        android.content.res.ColorStateList colorStateList;
        android.content.res.ColorStateList colorStateList2 = this.f100175d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        android.content.res.ColorStateList colorStateList3 = this.f100178g;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        if (this.f100197x1) {
            android.content.res.ColorStateList colorStateList4 = this.f100200y1;
            if (colorStateList4 != null && colorStateList4.isStateful()) {
                return true;
            }
        }
        ia.c cVar = this.f100184o;
        if ((cVar == null || (colorStateList = cVar.f371405b) == null || !colorStateList.isStateful()) ? false : true) {
            return true;
        }
        if ((this.A && this.B != null && this.f100201z) || f(this.f100189r) || f(this.B)) {
            return true;
        }
        android.content.res.ColorStateList colorStateList5 = this.f100199y0;
        return colorStateList5 != null && colorStateList5.isStateful();
    }

    public void j(android.graphics.drawable.Drawable drawable) {
        if (this.B != drawable) {
            float c17 = c();
            this.B = drawable;
            float c18 = c();
            E(this.B);
            a(this.B);
            invalidateSelf();
            if (c17 != c18) {
                g();
            }
        }
    }

    public void k(boolean z17) {
        if (this.A != z17) {
            boolean B = B();
            this.A = z17;
            boolean B2 = B();
            if (B != B2) {
                if (B2) {
                    a(this.B);
                } else {
                    E(this.B);
                }
                invalidateSelf();
                g();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void l(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2;
        android.graphics.drawable.Drawable drawable3 = this.f100189r;
        if (drawable3 != 0) {
            boolean z17 = drawable3 instanceof f3.k;
            drawable2 = drawable3;
            if (z17) {
                ((f3.l) ((f3.k) drawable3)).getClass();
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float c17 = c();
            this.f100189r = drawable != null ? drawable.mutate() : null;
            float c18 = c();
            E(drawable2);
            if (C()) {
                a(this.f100189r);
            }
            invalidateSelf();
            if (c17 != c18) {
                g();
            }
        }
    }

    public void m(float f17) {
        if (this.f100191t != f17) {
            float c17 = c();
            this.f100191t = f17;
            float c18 = c();
            invalidateSelf();
            if (c17 != c18) {
                g();
            }
        }
    }

    public void n(android.content.res.ColorStateList colorStateList) {
        if (this.f100190s != colorStateList) {
            this.f100190s = colorStateList;
            if (C()) {
                f3.b.h(this.f100189r, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void o(boolean z17) {
        if (this.f100188q != z17) {
            boolean C = C();
            this.f100188q = z17;
            boolean C2 = C();
            if (C != C2) {
                if (C2) {
                    a(this.f100189r);
                } else {
                    E(this.f100189r);
                }
                invalidateSelf();
                g();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i17) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i17);
        if (C()) {
            onLayoutDirectionChanged |= this.f100189r.setLayoutDirection(i17);
        }
        if (B()) {
            onLayoutDirectionChanged |= this.B.setLayoutDirection(i17);
        }
        if (D()) {
            onLayoutDirectionChanged |= this.f100193v.setLayoutDirection(i17);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i17) {
        boolean onLevelChange = super.onLevelChange(i17);
        if (C()) {
            onLevelChange |= this.f100189r.setLevel(i17);
        }
        if (B()) {
            onLevelChange |= this.B.setLevel(i17);
        }
        if (D()) {
            onLevelChange |= this.f100193v.setLevel(i17);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        return h(iArr, this.f100187p1);
    }

    public void p(float f17) {
        if (this.f100179h != f17) {
            this.f100179h = f17;
            this.P.setStrokeWidth(f17);
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void q(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2;
        android.graphics.drawable.Drawable drawable3 = this.f100193v;
        if (drawable3 != 0) {
            boolean z17 = drawable3 instanceof f3.k;
            drawable2 = drawable3;
            if (z17) {
                ((f3.l) ((f3.k) drawable3)).getClass();
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float d17 = d();
            this.f100193v = drawable != null ? drawable.mutate() : null;
            float d18 = d();
            E(drawable2);
            if (D()) {
                a(this.f100193v);
            }
            invalidateSelf();
            if (d17 != d18) {
                g();
            }
        }
    }

    public void r(float f17) {
        if (this.K != f17) {
            this.K = f17;
            invalidateSelf();
            if (D()) {
                g();
            }
        }
    }

    public void s(float f17) {
        if (this.f100195x != f17) {
            this.f100195x = f17;
            invalidateSelf();
            if (D()) {
                g();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable, long j17) {
        android.graphics.drawable.Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j17);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        if (this.Z != i17) {
            this.Z = i17;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        if (this.f100186p0 != colorFilter) {
            this.f100186p0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(android.content.res.ColorStateList colorStateList) {
        if (this.f100199y0 != colorStateList) {
            this.f100199y0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(android.graphics.PorterDuff.Mode mode) {
        if (this.f100181l1 != mode) {
            this.f100181l1 = mode;
            android.content.res.ColorStateList colorStateList = this.f100199y0;
            this.f100196x0 = (colorStateList == null || mode == null) ? null : new android.graphics.PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z17, boolean z18) {
        boolean visible = super.setVisible(z17, z18);
        if (C()) {
            visible |= this.f100189r.setVisible(z17, z18);
        }
        if (B()) {
            visible |= this.B.setVisible(z17, z18);
        }
        if (D()) {
            visible |= this.f100193v.setVisible(z17, z18);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public void t(float f17) {
        if (this.f100174J != f17) {
            this.f100174J = f17;
            invalidateSelf();
            if (D()) {
                g();
            }
        }
    }

    public void u(android.content.res.ColorStateList colorStateList) {
        if (this.f100194w != colorStateList) {
            this.f100194w = colorStateList;
            if (D()) {
                f3.b.h(this.f100193v, colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable) {
        android.graphics.drawable.Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void v(boolean z17) {
        if (this.f100192u != z17) {
            boolean D = D();
            this.f100192u = z17;
            boolean D2 = D();
            if (D != D2) {
                if (D2) {
                    a(this.f100193v);
                } else {
                    E(this.f100193v);
                }
                invalidateSelf();
                g();
            }
        }
    }

    public void w(float f17) {
        if (this.G != f17) {
            float c17 = c();
            this.G = f17;
            float c18 = c();
            invalidateSelf();
            if (c17 != c18) {
                g();
            }
        }
    }

    public void x(float f17) {
        if (this.F != f17) {
            float c17 = c();
            this.F = f17;
            float c18 = c();
            invalidateSelf();
            if (c17 != c18) {
                g();
            }
        }
    }

    public void y(android.content.res.ColorStateList colorStateList) {
        if (this.f100180i != colorStateList) {
            this.f100180i = colorStateList;
            this.f100200y1 = this.f100197x1 ? ja.a.a(colorStateList) : null;
            onStateChange(getState());
        }
    }

    public void z(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (this.f100182m != charSequence) {
            this.f100182m = charSequence;
            this.f100183n = l3.b.c().d(charSequence);
            this.A1 = true;
            invalidateSelf();
            g();
        }
    }
}

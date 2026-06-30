package com.p314xaae8f345.mm.ui.p2747xd1075a44;

@android.widget.RemoteViews.RemoteView
/* renamed from: com.tencent.mm.ui.widget.QImageView */
/* loaded from: classes13.dex */
public class C22638x8e581d4f extends android.view.View {
    public static final android.graphics.Matrix.ScaleToFit[] C = {android.graphics.Matrix.ScaleToFit.FILL, android.graphics.Matrix.ScaleToFit.START, android.graphics.Matrix.ScaleToFit.CENTER, android.graphics.Matrix.ScaleToFit.END};
    public android.graphics.PaintFlagsDrawFilter A;
    public android.graphics.PaintFlagsDrawFilter B;

    /* renamed from: d, reason: collision with root package name */
    public android.net.Uri f292912d;

    /* renamed from: e, reason: collision with root package name */
    public int f292913e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Matrix f292914f;

    /* renamed from: g, reason: collision with root package name */
    public al5.q2 f292915g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f292916h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f292917i;

    /* renamed from: m, reason: collision with root package name */
    public int f292918m;

    /* renamed from: n, reason: collision with root package name */
    public int f292919n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.ColorFilter f292920o;

    /* renamed from: p, reason: collision with root package name */
    public int f292921p;

    /* renamed from: q, reason: collision with root package name */
    public int f292922q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f292923r;

    /* renamed from: s, reason: collision with root package name */
    public android.graphics.drawable.Drawable f292924s;

    /* renamed from: t, reason: collision with root package name */
    public int f292925t;

    /* renamed from: u, reason: collision with root package name */
    public int f292926u;

    /* renamed from: v, reason: collision with root package name */
    public int f292927v;

    /* renamed from: w, reason: collision with root package name */
    public android.graphics.Matrix f292928w;

    /* renamed from: x, reason: collision with root package name */
    public final android.graphics.RectF f292929x;

    /* renamed from: y, reason: collision with root package name */
    public final android.graphics.RectF f292930y;

    /* renamed from: z, reason: collision with root package name */
    public final android.content.Context f292931z;

    public C22638x8e581d4f(android.content.Context context) {
        super(context);
        this.f292913e = 0;
        this.f292916h = false;
        this.f292917i = false;
        this.f292918m = Integer.MAX_VALUE;
        this.f292919n = Integer.MAX_VALUE;
        this.f292921p = 255;
        this.f292922q = 256;
        this.f292923r = false;
        this.f292924s = null;
        this.f292925t = 0;
        this.f292928w = null;
        this.f292929x = new android.graphics.RectF();
        this.f292930y = new android.graphics.RectF();
        this.f292931z = context;
        h();
    }

    private void h() {
        this.f292914f = new android.graphics.Matrix();
        this.f292915g = al5.q2.FIT_CENTER;
        this.A = new android.graphics.PaintFlagsDrawFilter(0, 3);
        this.B = new android.graphics.PaintFlagsDrawFilter(0, 0);
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        android.graphics.drawable.Drawable drawable = this.f292924s;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final void f() {
        android.graphics.drawable.Drawable drawable = this.f292924s;
        if (drawable == null || !this.f292923r) {
            return;
        }
        android.graphics.drawable.Drawable mutate = drawable.mutate();
        this.f292924s = mutate;
        mutate.setColorFilter(this.f292920o);
        this.f292924s.setAlpha((this.f292921p * this.f292922q) >> 8);
    }

    public final void g() {
        float f17;
        float f18;
        if (this.f292924s == null || !this.f292916h) {
            return;
        }
        int i17 = this.f292926u;
        int i18 = this.f292927v;
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        boolean z17 = (i17 < 0 || width == i17) && (i18 < 0 || height == i18);
        if (i17 <= 0 || i18 <= 0 || al5.q2.FIT_XY == this.f292915g) {
            this.f292924s.setBounds(0, 0, width, height);
            this.f292928w = null;
            return;
        }
        this.f292924s.setBounds(0, 0, i17, i18);
        al5.q2 q2Var = al5.q2.MATRIX;
        al5.q2 q2Var2 = this.f292915g;
        if (q2Var == q2Var2) {
            if (this.f292914f.isIdentity()) {
                this.f292928w = null;
                return;
            } else {
                this.f292928w = this.f292914f;
                return;
            }
        }
        if (z17) {
            this.f292928w = null;
            return;
        }
        if (al5.q2.CENTER == q2Var2) {
            android.graphics.Matrix matrix = this.f292914f;
            this.f292928w = matrix;
            matrix.setTranslate((int) (((width - i17) * 0.5f) + 0.5f), (int) (((height - i18) * 0.5f) + 0.5f));
            return;
        }
        float f19 = 0.0f;
        if (al5.q2.CENTER_CROP == q2Var2) {
            android.graphics.Matrix matrix2 = this.f292914f;
            this.f292928w = matrix2;
            if (i17 * height > width * i18) {
                f18 = height / i18;
                float f27 = (width - (i17 * f18)) * 0.5f;
                f17 = 0.0f;
                f19 = f27;
            } else {
                float f28 = width / i17;
                f17 = (height - (i18 * f28)) * 0.5f;
                f18 = f28;
            }
            matrix2.setScale(f18, f18);
            this.f292928w.postTranslate((int) (f19 + 0.5f), (int) (f17 + 0.5f));
            return;
        }
        if (al5.q2.CENTER_INSIDE == q2Var2) {
            this.f292928w = this.f292914f;
            float min = (i17 > width || i18 > height) ? java.lang.Math.min(width / i17, height / i18) : 1.0f;
            this.f292928w.setScale(min, min);
            this.f292928w.postTranslate((int) (((width - (i17 * min)) * 0.5f) + 0.5f), (int) (((height - (i18 * min)) * 0.5f) + 0.5f));
            return;
        }
        android.graphics.RectF rectF = this.f292929x;
        rectF.set(0.0f, 0.0f, i17, i18);
        android.graphics.RectF rectF2 = this.f292930y;
        rectF2.set(0.0f, 0.0f, width, height);
        android.graphics.Matrix matrix3 = this.f292914f;
        this.f292928w = matrix3;
        matrix3.setRectToRect(rectF, rectF2, C[this.f292915g.f87534d - 1]);
    }

    @Override // android.view.View
    public int getBaseline() {
        return -1;
    }

    /* renamed from: getDrawable */
    public android.graphics.drawable.Drawable m81416x4a96be14() {
        return this.f292924s;
    }

    /* renamed from: getImageMatrix */
    public android.graphics.Matrix m81417x5037c3c6() {
        return this.f292914f;
    }

    /* renamed from: getScaleType */
    public al5.q2 m81418x8f7ec8ee() {
        return this.f292915g;
    }

    public final void i() {
        android.graphics.drawable.Drawable drawable = this.f292924s;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth < 0) {
                intrinsicWidth = this.f292926u;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight < 0) {
                intrinsicHeight = this.f292927v;
            }
            if (intrinsicWidth == this.f292926u && intrinsicHeight == this.f292927v) {
                return;
            }
            this.f292926u = intrinsicWidth;
            this.f292927v = intrinsicHeight;
            requestLayout();
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
        if (drawable == this.f292924s) {
            postInvalidate();
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public final int j(int i17, int i18, int i19) {
        int mode = android.view.View.MeasureSpec.getMode(i19);
        int size = android.view.View.MeasureSpec.getSize(i19);
        return mode != Integer.MIN_VALUE ? mode != 0 ? mode != 1073741824 ? i17 : size : java.lang.Math.min(i17, i18) : java.lang.Math.min(java.lang.Math.min(i17, size), i18);
    }

    public final void k() {
        android.content.res.Resources resources;
        if (this.f292924s == null && (resources = getResources()) != null) {
            int i17 = this.f292913e;
            android.graphics.drawable.Drawable drawable = null;
            if (i17 != 0) {
                try {
                    drawable = resources.getDrawable(i17);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ImageView", "Unable to find resource: " + this.f292913e, e17);
                    this.f292912d = null;
                }
            } else if (this.f292912d == null) {
                return;
            }
            l(drawable);
        }
    }

    public final void l(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.f292924s;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f292924s);
        }
        this.f292924s = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (drawable.isStateful()) {
                drawable.setState(getDrawableState());
            }
            drawable.setLevel(this.f292925t);
            this.f292926u = drawable.getIntrinsicWidth();
            this.f292927v = drawable.getIntrinsicHeight();
            f();
            g();
        }
    }

    @Override // android.view.View
    public int[] onCreateDrawableState(int i17) {
        return super.onCreateDrawableState(i17);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        canvas.setDrawFilter(this.A);
        super.onDraw(canvas);
        if (this.f292924s == null || this.f292926u == 0 || this.f292927v == 0) {
            return;
        }
        if (this.f292928w == null && getPaddingTop() == 0 && getPaddingLeft() == 0) {
            this.f292924s.draw(canvas);
        } else {
            int saveCount = canvas.getSaveCount();
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            android.graphics.Matrix matrix = this.f292928w;
            if (matrix != null) {
                canvas.concat(matrix);
            }
            this.f292924s.draw(canvas);
            canvas.restoreToCount(saveCount);
        }
        if (android.os.Build.VERSION.SDK_INT > 28) {
            canvas.setDrawFilter(this.B);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        this.f292916h = true;
        g();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0088  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r19, int r20) {
        /*
            Method dump skipped, instructions count: 190
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2747xd1075a44.C22638x8e581d4f.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public boolean onSetAlpha(int i17) {
        if (getBackground() != null) {
            return false;
        }
        int i18 = i17 + (i17 >> 7);
        if (this.f292922q != i18) {
            this.f292922q = i18;
            this.f292923r = true;
            f();
        }
        return true;
    }

    /* renamed from: setAdjustViewBounds */
    public void m81419x3c81f72b(boolean z17) {
        this.f292917i = z17;
        if (z17) {
            m81429xebd28962(al5.q2.FIT_CENTER);
        }
    }

    /* renamed from: setAlpha */
    public void m81420x52b5721c(int i17) {
        int i18 = i17 & 255;
        if (this.f292921p != i18) {
            this.f292921p = i18;
            this.f292923r = true;
            f();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    /* renamed from: setColorFilter */
    public final void m81421x93fa4af9(int i17) {
        m81422x93fa4af9(new android.graphics.PorterDuffColorFilter(i17, android.graphics.PorterDuff.Mode.SRC_ATOP));
    }

    /* renamed from: setImageBitmap */
    public void mo69290xd44890a8(android.graphics.Bitmap bitmap) {
        mo46895x706225d7(new android.graphics.drawable.BitmapDrawable(this.f292931z.getResources(), bitmap));
    }

    /* renamed from: setImageDrawable */
    public void mo46895x706225d7(android.graphics.drawable.Drawable drawable) {
        if (this.f292924s != drawable) {
            this.f292913e = 0;
            this.f292912d = null;
            l(drawable);
            postInvalidate();
        }
    }

    /* renamed from: setImageLevel */
    public void m81423xc553a8eb(int i17) {
        this.f292925t = i17;
        android.graphics.drawable.Drawable drawable = this.f292924s;
        if (drawable != null) {
            drawable.setLevel(i17);
            i();
        }
    }

    /* renamed from: setImageMatrix */
    public void m81424xe69d373a(android.graphics.Matrix matrix) {
        if (matrix != null && matrix.isIdentity()) {
            matrix = null;
        }
        if ((matrix != null || this.f292914f.isIdentity()) && (matrix == null || this.f292914f.equals(matrix))) {
            return;
        }
        this.f292914f.set(matrix);
        g();
        invalidate();
    }

    /* renamed from: setImageResource */
    public void m81425x8d516947(int i17) {
        if (this.f292912d == null && this.f292913e == i17) {
            return;
        }
        l(null);
        this.f292913e = i17;
        this.f292912d = null;
        k();
        invalidate();
    }

    /* renamed from: setImageURI */
    public void m81426x4355fc93(android.net.Uri uri) {
        if (this.f292913e == 0) {
            android.net.Uri uri2 = this.f292912d;
            if (uri2 == uri) {
                return;
            }
            if (uri != null && uri2 != null && uri.equals(uri2)) {
                return;
            }
        }
        l(null);
        this.f292913e = 0;
        this.f292912d = uri;
        k();
        invalidate();
    }

    @Override // android.view.View
    public void setLayerType(int i17, android.graphics.Paint paint) {
        if (!(m81416x4a96be14() instanceof android.graphics.drawable.PictureDrawable) || i17 == 1) {
            super.setLayerType(i17, paint);
        }
    }

    /* renamed from: setMaxHeight */
    public void m81427x25bfb969(int i17) {
        this.f292919n = i17;
    }

    /* renamed from: setMaxWidth */
    public void m81428x8e6ff544(int i17) {
        this.f292918m = i17;
    }

    /* renamed from: setScaleType */
    public void m81429xebd28962(al5.q2 q2Var) {
        q2Var.getClass();
        if (this.f292915g != q2Var) {
            this.f292915g = q2Var;
            setWillNotCacheDrawing(q2Var == al5.q2.CENTER);
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setSelected(boolean z17) {
        super.setSelected(z17);
        i();
    }

    @Override // android.view.View
    public boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        return this.f292924s == drawable || super.verifyDrawable(drawable);
    }

    /* renamed from: setColorFilter */
    public void m81422x93fa4af9(android.graphics.ColorFilter colorFilter) {
        if (this.f292920o != colorFilter) {
            this.f292920o = colorFilter;
            this.f292923r = true;
            f();
            invalidate();
        }
    }

    public C22638x8e581d4f(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.f292931z = context;
        h();
    }

    public C22638x8e581d4f(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f292913e = 0;
        this.f292916h = false;
        this.f292917i = false;
        this.f292918m = Integer.MAX_VALUE;
        this.f292919n = Integer.MAX_VALUE;
        this.f292921p = 255;
        this.f292922q = 256;
        this.f292923r = false;
        this.f292924s = null;
        this.f292925t = 0;
        this.f292928w = null;
        this.f292929x = new android.graphics.RectF();
        this.f292930y = new android.graphics.RectF();
        this.f292931z = context;
        h();
        m81419x3c81f72b(false);
        m81428x8e6ff544(Integer.MAX_VALUE);
        m81427x25bfb969(Integer.MAX_VALUE);
    }
}

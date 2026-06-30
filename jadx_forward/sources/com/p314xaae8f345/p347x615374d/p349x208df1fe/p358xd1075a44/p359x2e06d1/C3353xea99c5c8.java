package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.MMKViewBackgroundBorderDrawable */
/* loaded from: classes13.dex */
public class C3353xea99c5c8 extends android.graphics.drawable.Drawable {

    /* renamed from: borderPath */
    private android.graphics.Path f13234x6cc45671;

    /* renamed from: insetDrawable */
    private android.graphics.drawable.Drawable f13240x6761d8db;

    /* renamed from: insetDrawableClipPath */
    private android.graphics.Path f13241x45218590;

    /* renamed from: mView */
    private android.view.View f13243x628b0b2;

    /* renamed from: paint */
    private android.graphics.Paint f13244x657f85e;

    /* renamed from: borderWidth */
    private float f13237x2c2c84fa = 0.0f;

    /* renamed from: borderRadius */
    private float f13236x506afbde = 0.0f;

    /* renamed from: topLeftBorderRadius */
    private float f13247x8d98d8fa = 0.0f;

    /* renamed from: topRightBorderRadius */
    private float f13248xd43c7b45 = 0.0f;

    /* renamed from: bottomLeftBorderRadius */
    private float f13238x867445d0 = 0.0f;

    /* renamed from: bottomRightBorderRadius */
    private float f13239xf6cea92f = 0.0f;

    /* renamed from: borderColor */
    private int f13233x2b158697 = 0;

    /* renamed from: borderPressedColor */
    private int f13235x19bbead = 0;

    /* renamed from: isPressed */
    private boolean f13242xca78f398 = false;

    /* renamed from: backgroundColor */
    private int f13232x4cb7f6d5 = 0;

    /* renamed from: roundBorderRectF */
    private android.graphics.RectF f13245xb0744ba8 = new android.graphics.RectF();

    /* renamed from: roundBorderradii */
    private float[] f13246xb2356cdb = new float[8];

    public C3353xea99c5c8(android.view.View view) {
        this.f13244x657f85e = new android.graphics.Paint();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f13244x657f85e = paint;
        paint.setAntiAlias(true);
        this.f13234x6cc45671 = new android.graphics.Path();
        this.f13241x45218590 = new android.graphics.Path();
        this.f13243x628b0b2 = view;
    }

    /* renamed from: containsPressedState */
    private boolean m27116x3306014e(int[] iArr) {
        for (int i17 : iArr) {
            if (i17 == 16842919) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: drawClipRadiusBorder */
    private void m27117xccf48032(android.graphics.Canvas canvas) {
        this.f13244x657f85e.reset();
        this.f13234x6cc45671.reset();
        this.f13241x45218590.reset();
        this.f13244x657f85e.setAntiAlias(true);
        this.f13245xb0744ba8.set(getBounds());
        android.graphics.RectF rectF = this.f13245xb0744ba8;
        float f17 = this.f13237x2c2c84fa;
        rectF.inset(f17 / 2.0f, f17 / 2.0f);
        java.util.Arrays.fill(this.f13246xb2356cdb, this.f13236x506afbde);
        float f18 = this.f13247x8d98d8fa;
        if (f18 > 0.0f) {
            float[] fArr = this.f13246xb2356cdb;
            fArr[0] = f18;
            fArr[1] = f18;
        }
        float f19 = this.f13248xd43c7b45;
        if (f19 > 0.0f) {
            float[] fArr2 = this.f13246xb2356cdb;
            fArr2[2] = f19;
            fArr2[3] = f19;
        }
        float f27 = this.f13238x867445d0;
        if (f27 > 0.0f) {
            float[] fArr3 = this.f13246xb2356cdb;
            fArr3[4] = f27;
            fArr3[5] = f27;
        }
        float f28 = this.f13239xf6cea92f;
        if (f28 > 0.0f) {
            float[] fArr4 = this.f13246xb2356cdb;
            fArr4[6] = f28;
            fArr4[7] = f28;
        }
        this.f13234x6cc45671.addRoundRect(this.f13245xb0744ba8, this.f13246xb2356cdb, android.graphics.Path.Direction.CCW);
        this.f13245xb0744ba8.set(getBounds());
        android.graphics.RectF rectF2 = this.f13245xb0744ba8;
        float f29 = this.f13237x2c2c84fa;
        rectF2.inset(f29, f29);
        java.util.Arrays.fill(this.f13246xb2356cdb, this.f13236x506afbde);
        float f37 = this.f13247x8d98d8fa;
        if (f37 > 0.0f) {
            float[] fArr5 = this.f13246xb2356cdb;
            fArr5[0] = f37;
            fArr5[1] = f37;
        }
        float f38 = this.f13248xd43c7b45;
        if (f38 > 0.0f) {
            float[] fArr6 = this.f13246xb2356cdb;
            fArr6[2] = f38;
            fArr6[3] = f38;
        }
        float f39 = this.f13238x867445d0;
        if (f39 > 0.0f) {
            float[] fArr7 = this.f13246xb2356cdb;
            fArr7[4] = f39;
            fArr7[5] = f39;
        }
        float f47 = this.f13239xf6cea92f;
        if (f47 > 0.0f) {
            float[] fArr8 = this.f13246xb2356cdb;
            fArr8[6] = f47;
            fArr8[7] = f47;
        }
        this.f13241x45218590.addRoundRect(this.f13245xb0744ba8, this.f13246xb2356cdb, android.graphics.Path.Direction.CCW);
        if (this.f13240x6761d8db == null && android.graphics.Color.alpha(this.f13232x4cb7f6d5) > 0) {
            this.f13244x657f85e.setStyle(android.graphics.Paint.Style.FILL);
            this.f13244x657f85e.setColor(this.f13232x4cb7f6d5);
            canvas.drawPath(this.f13234x6cc45671, this.f13244x657f85e);
        }
        if (android.graphics.Color.alpha(this.f13233x2b158697) > 0 && !this.f13242xca78f398) {
            this.f13244x657f85e.setColor(this.f13233x2b158697);
            this.f13244x657f85e.setStyle(android.graphics.Paint.Style.STROKE);
            canvas.drawPath(this.f13234x6cc45671, this.f13244x657f85e);
            if (this.f13240x6761d8db != null) {
                canvas.clipPath(this.f13241x45218590);
                return;
            }
            return;
        }
        if (android.graphics.Color.alpha(this.f13235x19bbead) <= 0 || !this.f13242xca78f398) {
            canvas.clipPath(this.f13241x45218590);
            return;
        }
        this.f13244x657f85e.setColor(this.f13235x19bbead);
        this.f13244x657f85e.setStyle(android.graphics.Paint.Style.STROKE);
        canvas.drawPath(this.f13234x6cc45671, this.f13244x657f85e);
        if (this.f13240x6761d8db != null) {
            canvas.clipPath(this.f13241x45218590);
        }
    }

    /* renamed from: drawClipRectBorder */
    private void m27118x5400cd04(android.graphics.Canvas canvas) {
        android.graphics.Rect bounds = getBounds();
        int i17 = bounds.top;
        int i18 = bounds.left;
        int width = bounds.width();
        int height = bounds.height();
        this.f13244x657f85e.reset();
        if (this.f13242xca78f398) {
            this.f13244x657f85e.setColor(this.f13235x19bbead);
        } else {
            this.f13244x657f85e.setColor(this.f13233x2b158697);
        }
        this.f13244x657f85e.setStyle(android.graphics.Paint.Style.FILL);
        this.f13244x657f85e.setAntiAlias(true);
        this.f13234x6cc45671.reset();
        float f17 = i18;
        float f18 = i17;
        this.f13234x6cc45671.moveTo(f17, f18);
        this.f13234x6cc45671.lineTo(this.f13237x2c2c84fa + f17, f18);
        float f19 = i17 + height;
        this.f13234x6cc45671.lineTo(this.f13237x2c2c84fa + f17, f19);
        this.f13234x6cc45671.lineTo(f17, f19);
        this.f13234x6cc45671.lineTo(f17, f18);
        canvas.drawPath(this.f13234x6cc45671, this.f13244x657f85e);
        this.f13234x6cc45671.reset();
        this.f13234x6cc45671.moveTo(this.f13237x2c2c84fa + f17, f18);
        float f27 = i18 + width;
        this.f13234x6cc45671.lineTo(f27, f18);
        this.f13234x6cc45671.lineTo(f27, this.f13237x2c2c84fa + f18);
        android.graphics.Path path = this.f13234x6cc45671;
        float f28 = this.f13237x2c2c84fa;
        path.lineTo(f17 + f28, f28 + f18);
        this.f13234x6cc45671.lineTo(this.f13237x2c2c84fa + f17, f18);
        canvas.drawPath(this.f13234x6cc45671, this.f13244x657f85e);
        this.f13234x6cc45671.reset();
        this.f13234x6cc45671.moveTo(f27, f18);
        this.f13234x6cc45671.lineTo(f27, f19);
        this.f13234x6cc45671.lineTo(f27 - this.f13237x2c2c84fa, f19);
        this.f13234x6cc45671.lineTo(f27 - this.f13237x2c2c84fa, f18);
        this.f13234x6cc45671.lineTo(f27, f18);
        canvas.drawPath(this.f13234x6cc45671, this.f13244x657f85e);
        this.f13234x6cc45671.reset();
        android.graphics.Path path2 = this.f13234x6cc45671;
        float f29 = this.f13237x2c2c84fa;
        path2.moveTo(f17 + f29, f19 - f29);
        this.f13234x6cc45671.lineTo(f27, f19 - this.f13237x2c2c84fa);
        this.f13234x6cc45671.lineTo(f27, f19);
        this.f13234x6cc45671.lineTo(this.f13237x2c2c84fa + f17, f19);
        android.graphics.Path path3 = this.f13234x6cc45671;
        float f37 = this.f13237x2c2c84fa;
        path3.lineTo(f17 + f37, f19 - f37);
        canvas.drawPath(this.f13234x6cc45671, this.f13244x657f85e);
        this.f13244x657f85e.setAntiAlias(false);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.f13244x657f85e.reset();
        if (this.f13236x506afbde > 0.0f || this.f13247x8d98d8fa > 0.0f || this.f13248xd43c7b45 > 0.0f || this.f13238x867445d0 > 0.0f || this.f13239xf6cea92f > 0.0f) {
            m27117xccf48032(canvas);
            android.graphics.drawable.Drawable drawable = this.f13240x6761d8db;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        android.graphics.drawable.Drawable drawable2 = this.f13240x6761d8db;
        if (drawable2 == null) {
            canvas.drawARGB(android.graphics.Color.alpha(this.f13232x4cb7f6d5), android.graphics.Color.red(this.f13232x4cb7f6d5), android.graphics.Color.green(this.f13232x4cb7f6d5), android.graphics.Color.blue(this.f13232x4cb7f6d5));
        } else {
            drawable2.draw(canvas);
        }
        if (this.f13237x2c2c84fa > 0.0f) {
            m27118x5400cd04(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        android.graphics.drawable.Drawable drawable = this.f13240x6761d8db;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        int i17 = this.f13232x4cb7f6d5;
        if (i17 == 0) {
            return -2;
        }
        return android.graphics.Color.alpha(i17) > 0 ? -3 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        android.graphics.drawable.Drawable drawable = this.f13240x6761d8db;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        android.view.View view = this.f13243x628b0b2;
        if (view != null && !view.isEnabled() && m27116x3306014e(iArr) && !this.f13242xca78f398) {
            return false;
        }
        if (m27116x3306014e(iArr)) {
            this.f13242xca78f398 = true;
        } else {
            this.f13242xca78f398 = false;
        }
        android.graphics.drawable.Drawable drawable = this.f13240x6761d8db;
        if (drawable == null) {
            return super.onStateChange(iArr);
        }
        boolean state = drawable.setState(iArr);
        invalidateSelf();
        return state;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        android.graphics.drawable.Drawable drawable = this.f13240x6761d8db;
        if (drawable != null) {
            drawable.setAlpha(i17);
        }
    }

    /* renamed from: setBackgroundColor */
    public void m27119x67f06213(int i17) {
        if (this.f13232x4cb7f6d5 != i17) {
            this.f13232x4cb7f6d5 = i17;
            invalidateSelf();
        }
    }

    /* renamed from: setBorderColor */
    public void m27120x9b5140d5(int i17) {
        if (this.f13233x2b158697 != i17) {
            this.f13233x2b158697 = i17;
            invalidateSelf();
        }
    }

    /* renamed from: setBorderPressedColor */
    public void m27121xac23a2af(int i17) {
        if (this.f13235x19bbead != i17) {
            this.f13235x19bbead = i17;
            invalidateSelf();
        }
    }

    /* renamed from: setBorderRadius */
    public void m27122xe7a68960(float f17) {
        if (this.f13236x506afbde != f17) {
            this.f13236x506afbde = f17;
            invalidateSelf();
        }
    }

    /* renamed from: setBorderWidth */
    public void m27123x9c683f38(float f17) {
        if (this.f13237x2c2c84fa != f17) {
            this.f13237x2c2c84fa = f17;
            invalidateSelf();
        }
    }

    /* renamed from: setBottomLeftBorderRadius */
    public void m27124x228658d2(float f17) {
        if (this.f13238x867445d0 != f17) {
            this.f13238x867445d0 = f17;
            invalidateSelf();
        }
    }

    /* renamed from: setBottomRightBorderRadius */
    public void m27125xdcfef66d(float f17) {
        if (this.f13239xf6cea92f != f17) {
            this.f13239xf6cea92f = f17;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        android.graphics.drawable.Drawable drawable = this.f13240x6761d8db;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    /* renamed from: setInsetDrawable */
    public void m27126xb797fb99(android.graphics.drawable.Drawable drawable) {
        this.f13240x6761d8db = drawable;
        invalidateSelf();
    }

    /* renamed from: setTopLeftBorderRadius */
    public void m27127x340d7538(float f17) {
        if (this.f13247x8d98d8fa != f17) {
            this.f13247x8d98d8fa = f17;
            invalidateSelf();
        }
    }

    /* renamed from: setTopRightBorderRadius */
    public void m27128xfc5b66c7(float f17) {
        if (this.f13248xd43c7b45 != f17) {
            this.f13248xd43c7b45 = f17;
            invalidateSelf();
        }
    }
}

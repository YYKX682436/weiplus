package com.tencent.kinda.framework.widget.base;

/* loaded from: classes13.dex */
public class MMKViewBackgroundBorderDrawable extends android.graphics.drawable.Drawable {
    private android.graphics.Path borderPath;
    private android.graphics.drawable.Drawable insetDrawable;
    private android.graphics.Path insetDrawableClipPath;
    private android.view.View mView;
    private android.graphics.Paint paint;
    private float borderWidth = 0.0f;
    private float borderRadius = 0.0f;
    private float topLeftBorderRadius = 0.0f;
    private float topRightBorderRadius = 0.0f;
    private float bottomLeftBorderRadius = 0.0f;
    private float bottomRightBorderRadius = 0.0f;
    private int borderColor = 0;
    private int borderPressedColor = 0;
    private boolean isPressed = false;
    private int backgroundColor = 0;
    private android.graphics.RectF roundBorderRectF = new android.graphics.RectF();
    private float[] roundBorderradii = new float[8];

    public MMKViewBackgroundBorderDrawable(android.view.View view) {
        this.paint = new android.graphics.Paint();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.paint = paint;
        paint.setAntiAlias(true);
        this.borderPath = new android.graphics.Path();
        this.insetDrawableClipPath = new android.graphics.Path();
        this.mView = view;
    }

    private boolean containsPressedState(int[] iArr) {
        for (int i17 : iArr) {
            if (i17 == 16842919) {
                return true;
            }
        }
        return false;
    }

    private void drawClipRadiusBorder(android.graphics.Canvas canvas) {
        this.paint.reset();
        this.borderPath.reset();
        this.insetDrawableClipPath.reset();
        this.paint.setAntiAlias(true);
        this.roundBorderRectF.set(getBounds());
        android.graphics.RectF rectF = this.roundBorderRectF;
        float f17 = this.borderWidth;
        rectF.inset(f17 / 2.0f, f17 / 2.0f);
        java.util.Arrays.fill(this.roundBorderradii, this.borderRadius);
        float f18 = this.topLeftBorderRadius;
        if (f18 > 0.0f) {
            float[] fArr = this.roundBorderradii;
            fArr[0] = f18;
            fArr[1] = f18;
        }
        float f19 = this.topRightBorderRadius;
        if (f19 > 0.0f) {
            float[] fArr2 = this.roundBorderradii;
            fArr2[2] = f19;
            fArr2[3] = f19;
        }
        float f27 = this.bottomLeftBorderRadius;
        if (f27 > 0.0f) {
            float[] fArr3 = this.roundBorderradii;
            fArr3[4] = f27;
            fArr3[5] = f27;
        }
        float f28 = this.bottomRightBorderRadius;
        if (f28 > 0.0f) {
            float[] fArr4 = this.roundBorderradii;
            fArr4[6] = f28;
            fArr4[7] = f28;
        }
        this.borderPath.addRoundRect(this.roundBorderRectF, this.roundBorderradii, android.graphics.Path.Direction.CCW);
        this.roundBorderRectF.set(getBounds());
        android.graphics.RectF rectF2 = this.roundBorderRectF;
        float f29 = this.borderWidth;
        rectF2.inset(f29, f29);
        java.util.Arrays.fill(this.roundBorderradii, this.borderRadius);
        float f37 = this.topLeftBorderRadius;
        if (f37 > 0.0f) {
            float[] fArr5 = this.roundBorderradii;
            fArr5[0] = f37;
            fArr5[1] = f37;
        }
        float f38 = this.topRightBorderRadius;
        if (f38 > 0.0f) {
            float[] fArr6 = this.roundBorderradii;
            fArr6[2] = f38;
            fArr6[3] = f38;
        }
        float f39 = this.bottomLeftBorderRadius;
        if (f39 > 0.0f) {
            float[] fArr7 = this.roundBorderradii;
            fArr7[4] = f39;
            fArr7[5] = f39;
        }
        float f47 = this.bottomRightBorderRadius;
        if (f47 > 0.0f) {
            float[] fArr8 = this.roundBorderradii;
            fArr8[6] = f47;
            fArr8[7] = f47;
        }
        this.insetDrawableClipPath.addRoundRect(this.roundBorderRectF, this.roundBorderradii, android.graphics.Path.Direction.CCW);
        if (this.insetDrawable == null && android.graphics.Color.alpha(this.backgroundColor) > 0) {
            this.paint.setStyle(android.graphics.Paint.Style.FILL);
            this.paint.setColor(this.backgroundColor);
            canvas.drawPath(this.borderPath, this.paint);
        }
        if (android.graphics.Color.alpha(this.borderColor) > 0 && !this.isPressed) {
            this.paint.setColor(this.borderColor);
            this.paint.setStyle(android.graphics.Paint.Style.STROKE);
            canvas.drawPath(this.borderPath, this.paint);
            if (this.insetDrawable != null) {
                canvas.clipPath(this.insetDrawableClipPath);
                return;
            }
            return;
        }
        if (android.graphics.Color.alpha(this.borderPressedColor) <= 0 || !this.isPressed) {
            canvas.clipPath(this.insetDrawableClipPath);
            return;
        }
        this.paint.setColor(this.borderPressedColor);
        this.paint.setStyle(android.graphics.Paint.Style.STROKE);
        canvas.drawPath(this.borderPath, this.paint);
        if (this.insetDrawable != null) {
            canvas.clipPath(this.insetDrawableClipPath);
        }
    }

    private void drawClipRectBorder(android.graphics.Canvas canvas) {
        android.graphics.Rect bounds = getBounds();
        int i17 = bounds.top;
        int i18 = bounds.left;
        int width = bounds.width();
        int height = bounds.height();
        this.paint.reset();
        if (this.isPressed) {
            this.paint.setColor(this.borderPressedColor);
        } else {
            this.paint.setColor(this.borderColor);
        }
        this.paint.setStyle(android.graphics.Paint.Style.FILL);
        this.paint.setAntiAlias(true);
        this.borderPath.reset();
        float f17 = i18;
        float f18 = i17;
        this.borderPath.moveTo(f17, f18);
        this.borderPath.lineTo(this.borderWidth + f17, f18);
        float f19 = i17 + height;
        this.borderPath.lineTo(this.borderWidth + f17, f19);
        this.borderPath.lineTo(f17, f19);
        this.borderPath.lineTo(f17, f18);
        canvas.drawPath(this.borderPath, this.paint);
        this.borderPath.reset();
        this.borderPath.moveTo(this.borderWidth + f17, f18);
        float f27 = i18 + width;
        this.borderPath.lineTo(f27, f18);
        this.borderPath.lineTo(f27, this.borderWidth + f18);
        android.graphics.Path path = this.borderPath;
        float f28 = this.borderWidth;
        path.lineTo(f17 + f28, f28 + f18);
        this.borderPath.lineTo(this.borderWidth + f17, f18);
        canvas.drawPath(this.borderPath, this.paint);
        this.borderPath.reset();
        this.borderPath.moveTo(f27, f18);
        this.borderPath.lineTo(f27, f19);
        this.borderPath.lineTo(f27 - this.borderWidth, f19);
        this.borderPath.lineTo(f27 - this.borderWidth, f18);
        this.borderPath.lineTo(f27, f18);
        canvas.drawPath(this.borderPath, this.paint);
        this.borderPath.reset();
        android.graphics.Path path2 = this.borderPath;
        float f29 = this.borderWidth;
        path2.moveTo(f17 + f29, f19 - f29);
        this.borderPath.lineTo(f27, f19 - this.borderWidth);
        this.borderPath.lineTo(f27, f19);
        this.borderPath.lineTo(this.borderWidth + f17, f19);
        android.graphics.Path path3 = this.borderPath;
        float f37 = this.borderWidth;
        path3.lineTo(f17 + f37, f19 - f37);
        canvas.drawPath(this.borderPath, this.paint);
        this.paint.setAntiAlias(false);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.paint.reset();
        if (this.borderRadius > 0.0f || this.topLeftBorderRadius > 0.0f || this.topRightBorderRadius > 0.0f || this.bottomLeftBorderRadius > 0.0f || this.bottomRightBorderRadius > 0.0f) {
            drawClipRadiusBorder(canvas);
            android.graphics.drawable.Drawable drawable = this.insetDrawable;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        android.graphics.drawable.Drawable drawable2 = this.insetDrawable;
        if (drawable2 == null) {
            canvas.drawARGB(android.graphics.Color.alpha(this.backgroundColor), android.graphics.Color.red(this.backgroundColor), android.graphics.Color.green(this.backgroundColor), android.graphics.Color.blue(this.backgroundColor));
        } else {
            drawable2.draw(canvas);
        }
        if (this.borderWidth > 0.0f) {
            drawClipRectBorder(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        android.graphics.drawable.Drawable drawable = this.insetDrawable;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        int i17 = this.backgroundColor;
        if (i17 == 0) {
            return -2;
        }
        return android.graphics.Color.alpha(i17) > 0 ? -3 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        android.graphics.drawable.Drawable drawable = this.insetDrawable;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        android.view.View view = this.mView;
        if (view != null && !view.isEnabled() && containsPressedState(iArr) && !this.isPressed) {
            return false;
        }
        if (containsPressedState(iArr)) {
            this.isPressed = true;
        } else {
            this.isPressed = false;
        }
        android.graphics.drawable.Drawable drawable = this.insetDrawable;
        if (drawable == null) {
            return super.onStateChange(iArr);
        }
        boolean state = drawable.setState(iArr);
        invalidateSelf();
        return state;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        android.graphics.drawable.Drawable drawable = this.insetDrawable;
        if (drawable != null) {
            drawable.setAlpha(i17);
        }
    }

    public void setBackgroundColor(int i17) {
        if (this.backgroundColor != i17) {
            this.backgroundColor = i17;
            invalidateSelf();
        }
    }

    public void setBorderColor(int i17) {
        if (this.borderColor != i17) {
            this.borderColor = i17;
            invalidateSelf();
        }
    }

    public void setBorderPressedColor(int i17) {
        if (this.borderPressedColor != i17) {
            this.borderPressedColor = i17;
            invalidateSelf();
        }
    }

    public void setBorderRadius(float f17) {
        if (this.borderRadius != f17) {
            this.borderRadius = f17;
            invalidateSelf();
        }
    }

    public void setBorderWidth(float f17) {
        if (this.borderWidth != f17) {
            this.borderWidth = f17;
            invalidateSelf();
        }
    }

    public void setBottomLeftBorderRadius(float f17) {
        if (this.bottomLeftBorderRadius != f17) {
            this.bottomLeftBorderRadius = f17;
            invalidateSelf();
        }
    }

    public void setBottomRightBorderRadius(float f17) {
        if (this.bottomRightBorderRadius != f17) {
            this.bottomRightBorderRadius = f17;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        android.graphics.drawable.Drawable drawable = this.insetDrawable;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    public void setInsetDrawable(android.graphics.drawable.Drawable drawable) {
        this.insetDrawable = drawable;
        invalidateSelf();
    }

    public void setTopLeftBorderRadius(float f17) {
        if (this.topLeftBorderRadius != f17) {
            this.topLeftBorderRadius = f17;
            invalidateSelf();
        }
    }

    public void setTopRightBorderRadius(float f17) {
        if (this.topRightBorderRadius != f17) {
            this.topRightBorderRadius = f17;
            invalidateSelf();
        }
    }
}

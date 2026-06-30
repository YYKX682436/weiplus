package com.google.android.material.internal;

/* loaded from: classes13.dex */
public class ForegroundLinearLayout extends androidx.appcompat.widget.LinearLayoutCompat {
    public boolean A;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.drawable.Drawable f44514v;

    /* renamed from: w, reason: collision with root package name */
    public final android.graphics.Rect f44515w;

    /* renamed from: x, reason: collision with root package name */
    public final android.graphics.Rect f44516x;

    /* renamed from: y, reason: collision with root package name */
    public int f44517y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f44518z;

    public ForegroundLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        super.draw(canvas);
        android.graphics.drawable.Drawable drawable = this.f44514v;
        if (drawable != null) {
            if (this.A) {
                this.A = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z17 = this.f44518z;
                android.graphics.Rect rect = this.f44515w;
                if (z17) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i17 = this.f44517y;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                android.graphics.Rect rect2 = this.f44516x;
                android.view.Gravity.apply(i17, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f17, float f18) {
        super.drawableHotspotChanged(f17, f18);
        android.graphics.drawable.Drawable drawable = this.f44514v;
        if (drawable != null) {
            drawable.setHotspot(f17, f18);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        android.graphics.drawable.Drawable drawable = this.f44514v;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f44514v.setState(getDrawableState());
    }

    @Override // android.view.View
    public android.graphics.drawable.Drawable getForeground() {
        return this.f44514v;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f44517y;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        android.graphics.drawable.Drawable drawable = this.f44514v;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        this.A = z17 | this.A;
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        this.A = true;
    }

    @Override // android.view.View
    public void setForeground(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.f44514v;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f44514v);
            }
            this.f44514v = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f44517y == 119) {
                    drawable.getPadding(new android.graphics.Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i17) {
        if (this.f44517y != i17) {
            if ((8388615 & i17) == 0) {
                i17 |= 8388611;
            }
            if ((i17 & 112) == 0) {
                i17 |= 48;
            }
            this.f44517y = i17;
            if (i17 == 119 && this.f44514v != null) {
                this.f44514v.getPadding(new android.graphics.Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f44514v;
    }

    public ForegroundLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f44515w = new android.graphics.Rect();
        this.f44516x = new android.graphics.Rect();
        this.f44517y = 119;
        this.f44518z = true;
        this.A = false;
        android.content.res.TypedArray d17 = fa.d0.d(context, attributeSet, v9.a.f434123m, i17, 0, new int[0]);
        this.f44517y = d17.getInt(1, this.f44517y);
        android.graphics.drawable.Drawable drawable = d17.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f44518z = d17.getBoolean(2, true);
        d17.recycle();
    }
}

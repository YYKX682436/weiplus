package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p257x21ffc6bd;

/* renamed from: com.google.android.material.internal.ForegroundLinearLayout */
/* loaded from: classes13.dex */
public class C2706xe6b763b2 extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331 {
    public boolean A;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.drawable.Drawable f126047v;

    /* renamed from: w, reason: collision with root package name */
    public final android.graphics.Rect f126048w;

    /* renamed from: x, reason: collision with root package name */
    public final android.graphics.Rect f126049x;

    /* renamed from: y, reason: collision with root package name */
    public int f126050y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f126051z;

    public C2706xe6b763b2(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        super.draw(canvas);
        android.graphics.drawable.Drawable drawable = this.f126047v;
        if (drawable != null) {
            if (this.A) {
                this.A = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z17 = this.f126051z;
                android.graphics.Rect rect = this.f126048w;
                if (z17) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i17 = this.f126050y;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                android.graphics.Rect rect2 = this.f126049x;
                android.view.Gravity.apply(i17, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f17, float f18) {
        super.drawableHotspotChanged(f17, f18);
        android.graphics.drawable.Drawable drawable = this.f126047v;
        if (drawable != null) {
            drawable.setHotspot(f17, f18);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        android.graphics.drawable.Drawable drawable = this.f126047v;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f126047v.setState(getDrawableState());
    }

    @Override // android.view.View
    public android.graphics.drawable.Drawable getForeground() {
        return this.f126047v;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f126050y;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        android.graphics.drawable.Drawable drawable = this.f126047v;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331, android.view.ViewGroup, android.view.View
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
        android.graphics.drawable.Drawable drawable2 = this.f126047v;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f126047v);
            }
            this.f126047v = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f126050y == 119) {
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
        if (this.f126050y != i17) {
            if ((8388615 & i17) == 0) {
                i17 |= 8388611;
            }
            if ((i17 & 112) == 0) {
                i17 |= 48;
            }
            this.f126050y = i17;
            if (i17 == 119 && this.f126047v != null) {
                this.f126047v.getPadding(new android.graphics.Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f126047v;
    }

    public C2706xe6b763b2(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f126048w = new android.graphics.Rect();
        this.f126049x = new android.graphics.Rect();
        this.f126050y = 119;
        this.f126051z = true;
        this.A = false;
        android.content.res.TypedArray d17 = fa.d0.d(context, attributeSet, v9.a.f515656m, i17, 0, new int[0]);
        this.f126050y = d17.getInt(1, this.f126050y);
        android.graphics.drawable.Drawable drawable = d17.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f126051z = d17.getBoolean(2, true);
        d17.recycle();
    }
}

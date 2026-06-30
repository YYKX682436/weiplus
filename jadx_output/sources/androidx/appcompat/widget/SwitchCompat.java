package androidx.appcompat.widget;

/* loaded from: classes13.dex */
public class SwitchCompat extends android.widget.CompoundButton {
    public static final android.util.Property T = new androidx.appcompat.widget.l2(java.lang.Float.class, "thumbPos");
    public static final int[] U = {android.R.attr.state_checked};
    public float A;
    public final android.view.VelocityTracker B;
    public final int C;
    public float D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f9456J;
    public int K;
    public final android.text.TextPaint L;
    public android.content.res.ColorStateList M;
    public android.text.Layout N;
    public android.text.Layout P;
    public android.text.method.TransformationMethod Q;
    public android.animation.ObjectAnimator R;
    public final android.graphics.Rect S;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.drawable.Drawable f9457d;

    /* renamed from: e, reason: collision with root package name */
    public android.content.res.ColorStateList f9458e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.PorterDuff.Mode f9459f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9460g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9461h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.drawable.Drawable f9462i;

    /* renamed from: m, reason: collision with root package name */
    public android.content.res.ColorStateList f9463m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.PorterDuff.Mode f9464n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f9465o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9466p;

    /* renamed from: q, reason: collision with root package name */
    public int f9467q;

    /* renamed from: r, reason: collision with root package name */
    public int f9468r;

    /* renamed from: s, reason: collision with root package name */
    public int f9469s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f9470t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.CharSequence f9471u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.CharSequence f9472v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f9473w;

    /* renamed from: x, reason: collision with root package name */
    public int f9474x;

    /* renamed from: y, reason: collision with root package name */
    public final int f9475y;

    /* renamed from: z, reason: collision with root package name */
    public float f9476z;

    public SwitchCompat(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.tencent.mm.R.attr.f478418jb);
    }

    private boolean getTargetCheckedState() {
        return this.D > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((androidx.appcompat.widget.h3.a(this) ? 1.0f - this.D : this.D) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        android.graphics.drawable.Drawable drawable = this.f9462i;
        if (drawable == null) {
            return 0;
        }
        android.graphics.Rect rect = this.S;
        drawable.getPadding(rect);
        android.graphics.drawable.Drawable drawable2 = this.f9457d;
        android.graphics.Rect b17 = drawable2 != null ? androidx.appcompat.widget.y0.b(drawable2) : androidx.appcompat.widget.y0.f9738a;
        return ((((this.E - this.G) - rect.left) - rect.right) - b17.left) - b17.right;
    }

    public final void a() {
        android.graphics.drawable.Drawable drawable = this.f9457d;
        if (drawable != null) {
            if (this.f9460g || this.f9461h) {
                android.graphics.drawable.Drawable mutate = drawable.mutate();
                this.f9457d = mutate;
                if (this.f9460g) {
                    f3.b.h(mutate, this.f9458e);
                }
                if (this.f9461h) {
                    f3.b.i(this.f9457d, this.f9459f);
                }
                if (this.f9457d.isStateful()) {
                    this.f9457d.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        android.graphics.drawable.Drawable drawable = this.f9462i;
        if (drawable != null) {
            if (this.f9465o || this.f9466p) {
                android.graphics.drawable.Drawable mutate = drawable.mutate();
                this.f9462i = mutate;
                if (this.f9465o) {
                    f3.b.h(mutate, this.f9463m);
                }
                if (this.f9466p) {
                    f3.b.i(this.f9462i, this.f9464n);
                }
                if (this.f9462i.isStateful()) {
                    this.f9462i.setState(getDrawableState());
                }
            }
        }
    }

    public final android.text.Layout c(java.lang.CharSequence charSequence) {
        android.text.method.TransformationMethod transformationMethod = this.Q;
        if (transformationMethod != null) {
            charSequence = ((m.a) transformationMethod).getTransformation(charSequence, this);
        }
        java.lang.CharSequence charSequence2 = charSequence;
        return new android.text.StaticLayout(charSequence2, this.L, charSequence2 != null ? (int) java.lang.Math.ceil(android.text.Layout.getDesiredWidth(charSequence2, r2)) : 0, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        int i17;
        int i18;
        int i19 = this.H;
        int i27 = this.I;
        int i28 = this.f9456J;
        int i29 = this.K;
        int thumbOffset = getThumbOffset() + i19;
        android.graphics.drawable.Drawable drawable = this.f9457d;
        android.graphics.Rect b17 = drawable != null ? androidx.appcompat.widget.y0.b(drawable) : androidx.appcompat.widget.y0.f9738a;
        android.graphics.drawable.Drawable drawable2 = this.f9462i;
        android.graphics.Rect rect = this.S;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i37 = rect.left;
            thumbOffset += i37;
            if (b17 != null) {
                int i38 = b17.left;
                if (i38 > i37) {
                    i19 += i38 - i37;
                }
                int i39 = b17.top;
                int i47 = rect.top;
                i17 = i39 > i47 ? (i39 - i47) + i27 : i27;
                int i48 = b17.right;
                int i49 = rect.right;
                if (i48 > i49) {
                    i28 -= i48 - i49;
                }
                int i57 = b17.bottom;
                int i58 = rect.bottom;
                if (i57 > i58) {
                    i18 = i29 - (i57 - i58);
                    this.f9462i.setBounds(i19, i17, i28, i18);
                }
            } else {
                i17 = i27;
            }
            i18 = i29;
            this.f9462i.setBounds(i19, i17, i28, i18);
        }
        android.graphics.drawable.Drawable drawable3 = this.f9457d;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i59 = thumbOffset - rect.left;
            int i66 = thumbOffset + this.G + rect.right;
            this.f9457d.setBounds(i59, i27, i66, i29);
            android.graphics.drawable.Drawable background = getBackground();
            if (background != null) {
                f3.b.f(background, i59, i27, i66, i29);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f17, float f18) {
        super.drawableHotspotChanged(f17, f18);
        android.graphics.drawable.Drawable drawable = this.f9457d;
        if (drawable != null) {
            f3.b.e(drawable, f17, f18);
        }
        android.graphics.drawable.Drawable drawable2 = this.f9462i;
        if (drawable2 != null) {
            f3.b.e(drawable2, f17, f18);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        android.graphics.drawable.Drawable drawable = this.f9457d;
        boolean z17 = false;
        if (drawable != null && drawable.isStateful()) {
            z17 = false | drawable.setState(drawableState);
        }
        android.graphics.drawable.Drawable drawable2 = this.f9462i;
        if (drawable2 != null && drawable2.isStateful()) {
            z17 |= drawable2.setState(drawableState);
        }
        if (z17) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!androidx.appcompat.widget.h3.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.E;
        return !android.text.TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f9469s : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (androidx.appcompat.widget.h3.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.E;
        return !android.text.TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f9469s : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f9473w;
    }

    public boolean getSplitTrack() {
        return this.f9470t;
    }

    public int getSwitchMinWidth() {
        return this.f9468r;
    }

    public int getSwitchPadding() {
        return this.f9469s;
    }

    public java.lang.CharSequence getTextOff() {
        return this.f9472v;
    }

    public java.lang.CharSequence getTextOn() {
        return this.f9471u;
    }

    public android.graphics.drawable.Drawable getThumbDrawable() {
        return this.f9457d;
    }

    public int getThumbTextPadding() {
        return this.f9467q;
    }

    public android.content.res.ColorStateList getThumbTintList() {
        return this.f9458e;
    }

    public android.graphics.PorterDuff.Mode getThumbTintMode() {
        return this.f9459f;
    }

    public android.graphics.drawable.Drawable getTrackDrawable() {
        return this.f9462i;
    }

    public android.content.res.ColorStateList getTrackTintList() {
        return this.f9463m;
    }

    public android.graphics.PorterDuff.Mode getTrackTintMode() {
        return this.f9464n;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        android.graphics.drawable.Drawable drawable = this.f9457d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        android.graphics.drawable.Drawable drawable2 = this.f9462i;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        android.animation.ObjectAnimator objectAnimator = this.R;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.R.end();
        this.R = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i17) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i17 + 1);
        if (isChecked()) {
            android.view.View.mergeDrawableStates(onCreateDrawableState, U);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        int width;
        super.onDraw(canvas);
        android.graphics.drawable.Drawable drawable = this.f9462i;
        android.graphics.Rect rect = this.S;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i17 = this.I;
        int i18 = this.K;
        int i19 = i17 + rect.top;
        int i27 = i18 - rect.bottom;
        android.graphics.drawable.Drawable drawable2 = this.f9457d;
        if (drawable != null) {
            if (!this.f9470t || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                android.graphics.Rect b17 = androidx.appcompat.widget.y0.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += b17.left;
                rect.right -= b17.right;
                int save = canvas.save();
                canvas.clipRect(rect, android.graphics.Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        android.text.Layout layout = getTargetCheckedState() ? this.N : this.P;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            android.content.res.ColorStateList colorStateList = this.M;
            android.text.TextPaint textPaint = this.L;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                android.graphics.Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i19 + i27) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        java.lang.CharSequence charSequence = isChecked() ? this.f9471u : this.f9472v;
        if (android.text.TextUtils.isEmpty(charSequence)) {
            return;
        }
        java.lang.CharSequence text = accessibilityNodeInfo.getText();
        if (android.text.TextUtils.isEmpty(text)) {
            accessibilityNodeInfo.setText(charSequence);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(text);
        sb6.append(' ');
        sb6.append(charSequence);
        accessibilityNodeInfo.setText(sb6);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        int i28;
        int width;
        int i29;
        int i37;
        int i38;
        int i39;
        super.onLayout(z17, i17, i18, i19, i27);
        int i47 = 0;
        if (this.f9457d != null) {
            android.graphics.drawable.Drawable drawable = this.f9462i;
            android.graphics.Rect rect = this.S;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            android.graphics.Rect b17 = androidx.appcompat.widget.y0.b(this.f9457d);
            i28 = java.lang.Math.max(0, b17.left - rect.left);
            i47 = java.lang.Math.max(0, b17.right - rect.right);
        } else {
            i28 = 0;
        }
        if (androidx.appcompat.widget.h3.a(this)) {
            i29 = getPaddingLeft() + i28;
            width = ((this.E + i29) - i28) - i47;
        } else {
            width = (getWidth() - getPaddingRight()) - i47;
            i29 = (width - this.E) + i28 + i47;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i37 = this.F;
            i38 = paddingTop - (i37 / 2);
        } else {
            if (gravity == 80) {
                i39 = getHeight() - getPaddingBottom();
                i38 = i39 - this.F;
                this.H = i29;
                this.I = i38;
                this.K = i39;
                this.f9456J = width;
            }
            i38 = getPaddingTop();
            i37 = this.F;
        }
        i39 = i37 + i38;
        this.H = i29;
        this.I = i38;
        this.K = i39;
        this.f9456J = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19;
        int i27;
        if (this.f9473w) {
            if (this.N == null) {
                this.N = c(this.f9471u);
            }
            if (this.P == null) {
                this.P = c(this.f9472v);
            }
        }
        android.graphics.drawable.Drawable drawable = this.f9457d;
        int i28 = 0;
        android.graphics.Rect rect = this.S;
        if (drawable != null) {
            drawable.getPadding(rect);
            i19 = (this.f9457d.getIntrinsicWidth() - rect.left) - rect.right;
            i27 = this.f9457d.getIntrinsicHeight();
        } else {
            i19 = 0;
            i27 = 0;
        }
        this.G = java.lang.Math.max(this.f9473w ? java.lang.Math.max(this.N.getWidth(), this.P.getWidth()) + (this.f9467q * 2) : 0, i19);
        android.graphics.drawable.Drawable drawable2 = this.f9462i;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i28 = this.f9462i.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i29 = rect.left;
        int i37 = rect.right;
        android.graphics.drawable.Drawable drawable3 = this.f9457d;
        if (drawable3 != null) {
            android.graphics.Rect b17 = androidx.appcompat.widget.y0.b(drawable3);
            i29 = java.lang.Math.max(i29, b17.left);
            i37 = java.lang.Math.max(i37, b17.right);
        }
        int max = java.lang.Math.max(this.f9468r, (this.G * 2) + i29 + i37);
        int max2 = java.lang.Math.max(i28, i27);
        this.E = max;
        this.F = max2;
        super.onMeasure(i17, i18);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        java.lang.CharSequence charSequence = isChecked() ? this.f9471u : this.f9472v;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r1 != 3) goto L84;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z17) {
        super.setChecked(z17);
        boolean isChecked = isChecked();
        if (getWindowToken() != null) {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            if (n3.x0.c(this)) {
                android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<androidx.appcompat.widget.SwitchCompat, java.lang.Float>) T, isChecked ? 1.0f : 0.0f);
                this.R = ofFloat;
                ofFloat.setDuration(250L);
                this.R.setAutoCancel(true);
                this.R.start();
                return;
            }
        }
        android.animation.ObjectAnimator objectAnimator = this.R;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setThumbPosition(isChecked ? 1.0f : 0.0f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.a0.g(this, callback));
    }

    public void setShowText(boolean z17) {
        if (this.f9473w != z17) {
            this.f9473w = z17;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z17) {
        this.f9470t = z17;
        invalidate();
    }

    public void setSwitchMinWidth(int i17) {
        this.f9468r = i17;
        requestLayout();
    }

    public void setSwitchPadding(int i17) {
        this.f9469s = i17;
        requestLayout();
    }

    public void setSwitchTypeface(android.graphics.Typeface typeface) {
        android.text.TextPaint textPaint = this.L;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(java.lang.CharSequence charSequence) {
        this.f9472v = charSequence;
        requestLayout();
    }

    public void setTextOn(java.lang.CharSequence charSequence) {
        this.f9471u = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.f9457d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f9457d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f17) {
        this.D = f17;
        invalidate();
    }

    public void setThumbResource(int i17) {
        setThumbDrawable(k.a.a(getContext(), i17));
    }

    public void setThumbTextPadding(int i17) {
        this.f9467q = i17;
        requestLayout();
    }

    public void setThumbTintList(android.content.res.ColorStateList colorStateList) {
        this.f9458e = colorStateList;
        this.f9460g = true;
        a();
    }

    public void setThumbTintMode(android.graphics.PorterDuff.Mode mode) {
        this.f9459f = mode;
        this.f9461h = true;
        a();
    }

    public void setTrackDrawable(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.f9462i;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f9462i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i17) {
        setTrackDrawable(k.a.a(getContext(), i17));
    }

    public void setTrackTintList(android.content.res.ColorStateList colorStateList) {
        this.f9463m = colorStateList;
        this.f9465o = true;
        b();
    }

    public void setTrackTintMode(android.graphics.PorterDuff.Mode mode) {
        this.f9464n = mode;
        this.f9466p = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f9457d || drawable == this.f9462i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00fc, code lost:
    
        if (r8 != null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SwitchCompat(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}

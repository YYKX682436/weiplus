package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* renamed from: androidx.appcompat.widget.SwitchCompat */
/* loaded from: classes13.dex */
public class C0101x3849f3f6 extends android.widget.CompoundButton {
    public static final android.util.Property T = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.l2(java.lang.Float.class, "thumbPos");
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
    public int f90989J;
    public int K;
    public final android.text.TextPaint L;
    public android.content.res.ColorStateList M;
    public android.text.Layout N;
    public android.text.Layout P;
    public android.text.method.TransformationMethod Q;
    public android.animation.ObjectAnimator R;
    public final android.graphics.Rect S;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.drawable.Drawable f90990d;

    /* renamed from: e, reason: collision with root package name */
    public android.content.res.ColorStateList f90991e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.PorterDuff.Mode f90992f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f90993g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f90994h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.drawable.Drawable f90995i;

    /* renamed from: m, reason: collision with root package name */
    public android.content.res.ColorStateList f90996m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.PorterDuff.Mode f90997n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f90998o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f90999p;

    /* renamed from: q, reason: collision with root package name */
    public int f91000q;

    /* renamed from: r, reason: collision with root package name */
    public int f91001r;

    /* renamed from: s, reason: collision with root package name */
    public int f91002s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f91003t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.CharSequence f91004u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.CharSequence f91005v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f91006w;

    /* renamed from: x, reason: collision with root package name */
    public int f91007x;

    /* renamed from: y, reason: collision with root package name */
    public final int f91008y;

    /* renamed from: z, reason: collision with root package name */
    public float f91009z;

    public C0101x3849f3f6(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559951jb);
    }

    /* renamed from: getTargetCheckedState */
    private boolean m2770xb1270b51() {
        return this.D > 0.5f;
    }

    /* renamed from: getThumbOffset */
    private int m2771x5a3310d3() {
        return (int) (((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h3.a(this) ? 1.0f - this.D : this.D) * m2772xf7029630()) + 0.5f);
    }

    /* renamed from: getThumbScrollRange */
    private int m2772xf7029630() {
        android.graphics.drawable.Drawable drawable = this.f90995i;
        if (drawable == null) {
            return 0;
        }
        android.graphics.Rect rect = this.S;
        drawable.getPadding(rect);
        android.graphics.drawable.Drawable drawable2 = this.f90990d;
        android.graphics.Rect b17 = drawable2 != null ? p012xc85e97e9.p016x746ad0e3.p019xd1075a44.y0.b(drawable2) : p012xc85e97e9.p016x746ad0e3.p019xd1075a44.y0.f91271a;
        return ((((this.E - this.G) - rect.left) - rect.right) - b17.left) - b17.right;
    }

    public final void a() {
        android.graphics.drawable.Drawable drawable = this.f90990d;
        if (drawable != null) {
            if (this.f90993g || this.f90994h) {
                android.graphics.drawable.Drawable mutate = drawable.mutate();
                this.f90990d = mutate;
                if (this.f90993g) {
                    f3.b.h(mutate, this.f90991e);
                }
                if (this.f90994h) {
                    f3.b.i(this.f90990d, this.f90992f);
                }
                if (this.f90990d.isStateful()) {
                    this.f90990d.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        android.graphics.drawable.Drawable drawable = this.f90995i;
        if (drawable != null) {
            if (this.f90998o || this.f90999p) {
                android.graphics.drawable.Drawable mutate = drawable.mutate();
                this.f90995i = mutate;
                if (this.f90998o) {
                    f3.b.h(mutate, this.f90996m);
                }
                if (this.f90999p) {
                    f3.b.i(this.f90995i, this.f90997n);
                }
                if (this.f90995i.isStateful()) {
                    this.f90995i.setState(getDrawableState());
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
        int i28 = this.f90989J;
        int i29 = this.K;
        int m2771x5a3310d3 = m2771x5a3310d3() + i19;
        android.graphics.drawable.Drawable drawable = this.f90990d;
        android.graphics.Rect b17 = drawable != null ? p012xc85e97e9.p016x746ad0e3.p019xd1075a44.y0.b(drawable) : p012xc85e97e9.p016x746ad0e3.p019xd1075a44.y0.f91271a;
        android.graphics.drawable.Drawable drawable2 = this.f90995i;
        android.graphics.Rect rect = this.S;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i37 = rect.left;
            m2771x5a3310d3 += i37;
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
                    this.f90995i.setBounds(i19, i17, i28, i18);
                }
            } else {
                i17 = i27;
            }
            i18 = i29;
            this.f90995i.setBounds(i19, i17, i28, i18);
        }
        android.graphics.drawable.Drawable drawable3 = this.f90990d;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i59 = m2771x5a3310d3 - rect.left;
            int i66 = m2771x5a3310d3 + this.G + rect.right;
            this.f90990d.setBounds(i59, i27, i66, i29);
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
        android.graphics.drawable.Drawable drawable = this.f90990d;
        if (drawable != null) {
            f3.b.e(drawable, f17, f18);
        }
        android.graphics.drawable.Drawable drawable2 = this.f90995i;
        if (drawable2 != null) {
            f3.b.e(drawable2, f17, f18);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        android.graphics.drawable.Drawable drawable = this.f90990d;
        boolean z17 = false;
        if (drawable != null && drawable.isStateful()) {
            z17 = false | drawable.setState(drawableState);
        }
        android.graphics.drawable.Drawable drawable2 = this.f90995i;
        if (drawable2 != null && drawable2.isStateful()) {
            z17 |= drawable2.setState(drawableState);
        }
        if (z17) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h3.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.E;
        return !android.text.TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f91002s : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h3.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.E;
        return !android.text.TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f91002s : compoundPaddingRight;
    }

    /* renamed from: getShowText */
    public boolean m2773x67a80b40() {
        return this.f91006w;
    }

    /* renamed from: getSplitTrack */
    public boolean m2774xd9637e47() {
        return this.f91003t;
    }

    /* renamed from: getSwitchMinWidth */
    public int m2775x49ac2ede() {
        return this.f91001r;
    }

    /* renamed from: getSwitchPadding */
    public int m2776xf5fe1687() {
        return this.f91002s;
    }

    /* renamed from: getTextOff */
    public java.lang.CharSequence m2777xe94a80cc() {
        return this.f91005v;
    }

    /* renamed from: getTextOn */
    public java.lang.CharSequence m2778x30d0dae2() {
        return this.f91004u;
    }

    /* renamed from: getThumbDrawable */
    public android.graphics.drawable.Drawable m2779x957e1cde() {
        return this.f90990d;
    }

    /* renamed from: getThumbTextPadding */
    public int m2780x1a85cde4() {
        return this.f91000q;
    }

    /* renamed from: getThumbTintList */
    public android.content.res.ColorStateList m2781x4d741e79() {
        return this.f90991e;
    }

    /* renamed from: getThumbTintMode */
    public android.graphics.PorterDuff.Mode m2782x4d74a77e() {
        return this.f90992f;
    }

    /* renamed from: getTrackDrawable */
    public android.graphics.drawable.Drawable m2783xec1a1753() {
        return this.f90995i;
    }

    /* renamed from: getTrackTintList */
    public android.content.res.ColorStateList m2784xa41018ee() {
        return this.f90996m;
    }

    /* renamed from: getTrackTintMode */
    public android.graphics.PorterDuff.Mode m2785xa410a1f3() {
        return this.f90997n;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        android.graphics.drawable.Drawable drawable = this.f90990d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        android.graphics.drawable.Drawable drawable2 = this.f90995i;
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
        android.graphics.drawable.Drawable drawable = this.f90995i;
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
        android.graphics.drawable.Drawable drawable2 = this.f90990d;
        if (drawable != null) {
            if (!this.f91003t || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                android.graphics.Rect b17 = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.y0.b(drawable2);
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
        android.text.Layout layout = m2770xb1270b51() ? this.N : this.P;
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
        java.lang.CharSequence charSequence = isChecked() ? this.f91004u : this.f91005v;
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
        if (this.f90990d != null) {
            android.graphics.drawable.Drawable drawable = this.f90995i;
            android.graphics.Rect rect = this.S;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            android.graphics.Rect b17 = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.y0.b(this.f90990d);
            i28 = java.lang.Math.max(0, b17.left - rect.left);
            i47 = java.lang.Math.max(0, b17.right - rect.right);
        } else {
            i28 = 0;
        }
        if (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h3.a(this)) {
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
                this.f90989J = width;
            }
            i38 = getPaddingTop();
            i37 = this.F;
        }
        i39 = i37 + i38;
        this.H = i29;
        this.I = i38;
        this.K = i39;
        this.f90989J = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19;
        int i27;
        if (this.f91006w) {
            if (this.N == null) {
                this.N = c(this.f91004u);
            }
            if (this.P == null) {
                this.P = c(this.f91005v);
            }
        }
        android.graphics.drawable.Drawable drawable = this.f90990d;
        int i28 = 0;
        android.graphics.Rect rect = this.S;
        if (drawable != null) {
            drawable.getPadding(rect);
            i19 = (this.f90990d.getIntrinsicWidth() - rect.left) - rect.right;
            i27 = this.f90990d.getIntrinsicHeight();
        } else {
            i19 = 0;
            i27 = 0;
        }
        this.G = java.lang.Math.max(this.f91006w ? java.lang.Math.max(this.N.getWidth(), this.P.getWidth()) + (this.f91000q * 2) : 0, i19);
        android.graphics.drawable.Drawable drawable2 = this.f90995i;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i28 = this.f90995i.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i29 = rect.left;
        int i37 = rect.right;
        android.graphics.drawable.Drawable drawable3 = this.f90990d;
        if (drawable3 != null) {
            android.graphics.Rect b17 = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.y0.b(drawable3);
            i29 = java.lang.Math.max(i29, b17.left);
            i37 = java.lang.Math.max(i37, b17.right);
        }
        int max = java.lang.Math.max(this.f91001r, (this.G * 2) + i29 + i37);
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
        java.lang.CharSequence charSequence = isChecked() ? this.f91004u : this.f91005v;
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
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0101x3849f3f6.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z17) {
        super.setChecked(z17);
        boolean isChecked = isChecked();
        if (getWindowToken() != null) {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            if (n3.x0.c(this)) {
                android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0101x3849f3f6, java.lang.Float>) T, isChecked ? 1.0f : 0.0f);
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
        m2794x862a9bdd(isChecked ? 1.0f : 0.0f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(p012xc85e97e9.p075x2eaf9f.p079xd1075a44.a0.g(this, callback));
    }

    /* renamed from: setShowText */
    public void m2786x62606c4c(boolean z17) {
        if (this.f91006w != z17) {
            this.f91006w = z17;
            requestLayout();
        }
    }

    /* renamed from: setSplitTrack */
    public void m2787x787cc53(boolean z17) {
        this.f91003t = z17;
        invalidate();
    }

    /* renamed from: setSwitchMinWidth */
    public void m2788x11a296ea(int i17) {
        this.f91001r = i17;
        requestLayout();
    }

    /* renamed from: setSwitchPadding */
    public void m2789x88d47cfb(int i17) {
        this.f91002s = i17;
        requestLayout();
    }

    /* renamed from: setSwitchTypeface */
    public void m2790x3b5c14ed(android.graphics.Typeface typeface) {
        android.text.TextPaint textPaint = this.L;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    /* renamed from: setTextOff */
    public void m2791x5cbbce40(java.lang.CharSequence charSequence) {
        this.f91005v = charSequence;
        requestLayout();
    }

    /* renamed from: setTextOn */
    public void m2792x24060eee(java.lang.CharSequence charSequence) {
        this.f91004u = charSequence;
        requestLayout();
    }

    /* renamed from: setThumbDrawable */
    public void m2793x28548352(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.f90990d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f90990d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    /* renamed from: setThumbPosition */
    public void m2794x862a9bdd(float f17) {
        this.D = f17;
        invalidate();
    }

    /* renamed from: setThumbResource */
    public void m2795x4543c6c2(int i17) {
        m2793x28548352(k.a.a(getContext(), i17));
    }

    /* renamed from: setThumbTextPadding */
    public void m2796xbe8262f0(int i17) {
        this.f91000q = i17;
        requestLayout();
    }

    /* renamed from: setThumbTintList */
    public void m2797xe04a84ed(android.content.res.ColorStateList colorStateList) {
        this.f90991e = colorStateList;
        this.f90993g = true;
        a();
    }

    /* renamed from: setThumbTintMode */
    public void m2798xe04b0df2(android.graphics.PorterDuff.Mode mode) {
        this.f90992f = mode;
        this.f90994h = true;
        a();
    }

    /* renamed from: setTrackDrawable */
    public void m2799x7ef07dc7(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.f90995i;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f90995i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    /* renamed from: setTrackResource */
    public void m2800x9bdfc137(int i17) {
        m2799x7ef07dc7(k.a.a(getContext(), i17));
    }

    /* renamed from: setTrackTintList */
    public void m2801x36e67f62(android.content.res.ColorStateList colorStateList) {
        this.f90996m = colorStateList;
        this.f90998o = true;
        b();
    }

    /* renamed from: setTrackTintMode */
    public void m2802x36e70867(android.graphics.PorterDuff.Mode mode) {
        this.f90997n = mode;
        this.f90999p = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f90990d || drawable == this.f90995i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00fc, code lost:
    
        if (r8 != null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0101x3849f3f6(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0101x3849f3f6.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}

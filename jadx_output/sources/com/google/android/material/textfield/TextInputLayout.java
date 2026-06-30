package com.google.android.material.textfield;

/* loaded from: classes15.dex */
public class TextInputLayout extends android.widget.LinearLayout {
    public final float A;
    public boolean A1;
    public final float B;
    public android.animation.ValueAnimator B1;
    public int C;
    public boolean C1;
    public final int D;
    public boolean D1;
    public final int E;
    public int F;
    public int G;
    public android.graphics.drawable.Drawable H;
    public final android.graphics.Rect I;

    /* renamed from: J, reason: collision with root package name */
    public final android.graphics.RectF f44561J;
    public android.graphics.Typeface K;
    public boolean L;
    public android.graphics.drawable.Drawable M;
    public java.lang.CharSequence N;
    public com.google.android.material.internal.CheckableImageButton P;
    public boolean Q;
    public android.graphics.drawable.Drawable R;
    public android.graphics.drawable.Drawable S;
    public android.content.res.ColorStateList T;
    public boolean U;
    public android.graphics.PorterDuff.Mode V;
    public boolean W;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.FrameLayout f44562d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.EditText f44563e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.CharSequence f44564f;

    /* renamed from: g, reason: collision with root package name */
    public final com.google.android.material.textfield.c f44565g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f44566h;

    /* renamed from: i, reason: collision with root package name */
    public int f44567i;

    /* renamed from: l1, reason: collision with root package name */
    public final int f44568l1;

    /* renamed from: m, reason: collision with root package name */
    public boolean f44569m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f44570n;

    /* renamed from: o, reason: collision with root package name */
    public final int f44571o;

    /* renamed from: p, reason: collision with root package name */
    public final int f44572p;

    /* renamed from: p0, reason: collision with root package name */
    public android.content.res.ColorStateList f44573p0;

    /* renamed from: p1, reason: collision with root package name */
    public int f44574p1;

    /* renamed from: q, reason: collision with root package name */
    public boolean f44575q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.CharSequence f44576r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f44577s;

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.drawable.GradientDrawable f44578t;

    /* renamed from: u, reason: collision with root package name */
    public final int f44579u;

    /* renamed from: v, reason: collision with root package name */
    public final int f44580v;

    /* renamed from: w, reason: collision with root package name */
    public int f44581w;

    /* renamed from: x, reason: collision with root package name */
    public final int f44582x;

    /* renamed from: x0, reason: collision with root package name */
    public android.content.res.ColorStateList f44583x0;

    /* renamed from: x1, reason: collision with root package name */
    public final int f44584x1;

    /* renamed from: y, reason: collision with root package name */
    public final float f44585y;

    /* renamed from: y0, reason: collision with root package name */
    public final int f44586y0;

    /* renamed from: y1, reason: collision with root package name */
    public boolean f44587y1;

    /* renamed from: z, reason: collision with root package name */
    public final float f44588z;

    /* renamed from: z1, reason: collision with root package name */
    public final fa.f f44589z1;

    /* loaded from: classes13.dex */
    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<com.google.android.material.textfield.TextInputLayout.SavedState> CREATOR = new com.google.android.material.textfield.h();

        /* renamed from: f, reason: collision with root package name */
        public java.lang.CharSequence f44590f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f44591g;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f44590f = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f44591g = parcel.readInt() == 1;
        }

        public java.lang.String toString() {
            return "TextInputLayout.SavedState{" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " error=" + ((java.lang.Object) this.f44590f) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeParcelable(this.f11112d, i17);
            android.text.TextUtils.writeToParcel(this.f44590f, parcel, i17);
            parcel.writeInt(this.f44591g ? 1 : 0);
        }
    }

    public TextInputLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.tencent.mm.R.attr.f478453ka);
    }

    private android.graphics.drawable.Drawable getBoxBackground() {
        int i17 = this.f44581w;
        if (i17 == 1 || i17 == 2) {
            return this.f44578t;
        }
        throw new java.lang.IllegalStateException();
    }

    private float[] getCornerRadiiAsArray() {
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        boolean z17 = n3.v0.d(this) == 1;
        float f17 = this.A;
        float f18 = this.B;
        float f19 = this.f44585y;
        float f27 = this.f44588z;
        return !z17 ? new float[]{f19, f19, f27, f27, f17, f17, f18, f18} : new float[]{f27, f27, f19, f19, f18, f18, f17, f17};
    }

    public static void i(android.view.ViewGroup viewGroup, boolean z17) {
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            childAt.setEnabled(z17);
            if (childAt instanceof android.view.ViewGroup) {
                i((android.view.ViewGroup) childAt, z17);
            }
        }
    }

    private void setEditText(android.widget.EditText editText) {
        if (this.f44563e != null) {
            throw new java.lang.IllegalArgumentException("We already have an EditText, can only have one");
        }
        boolean z17 = editText instanceof com.google.android.material.textfield.TextInputEditText;
        this.f44563e = editText;
        f();
        setTextInputAccessibilityDelegate(new com.google.android.material.textfield.g(this));
        android.widget.EditText editText2 = this.f44563e;
        boolean z18 = editText2 != null && (editText2.getTransformationMethod() instanceof android.text.method.PasswordTransformationMethod);
        fa.f fVar = this.f44589z1;
        if (!z18) {
            android.graphics.Typeface typeface = this.f44563e.getTypeface();
            fVar.f260615t = typeface;
            fVar.f260614s = typeface;
            fVar.i();
        }
        float textSize = this.f44563e.getTextSize();
        if (fVar.f260604i != textSize) {
            fVar.f260604i = textSize;
            fVar.i();
        }
        int gravity = this.f44563e.getGravity();
        int i17 = (gravity & (-113)) | 48;
        if (fVar.f260603h != i17) {
            fVar.f260603h = i17;
            fVar.i();
        }
        if (fVar.f260602g != gravity) {
            fVar.f260602g = gravity;
            fVar.i();
        }
        this.f44563e.addTextChangedListener(new com.google.android.material.textfield.d(this));
        if (this.f44573p0 == null) {
            this.f44573p0 = this.f44563e.getHintTextColors();
        }
        if (this.f44575q) {
            if (android.text.TextUtils.isEmpty(this.f44576r)) {
                java.lang.CharSequence hint = this.f44563e.getHint();
                this.f44564f = hint;
                setHint(hint);
                this.f44563e.setHint((java.lang.CharSequence) null);
            }
            this.f44577s = true;
        }
        if (this.f44570n != null) {
            k(this.f44563e.getText().length());
        }
        this.f44565g.b();
        o();
        n(false, true);
    }

    private void setHintInternal(java.lang.CharSequence charSequence) {
        if (android.text.TextUtils.equals(charSequence, this.f44576r)) {
            return;
        }
        this.f44576r = charSequence;
        fa.f fVar = this.f44589z1;
        if (charSequence == null || !charSequence.equals(fVar.f260617v)) {
            fVar.f260617v = charSequence;
            fVar.f260618w = null;
            android.graphics.Bitmap bitmap = fVar.f260620y;
            if (bitmap != null) {
                bitmap.recycle();
                fVar.f260620y = null;
            }
            fVar.i();
        }
        if (this.f44587y1) {
            return;
        }
        g();
    }

    public void a(float f17) {
        fa.f fVar = this.f44589z1;
        if (fVar.f260598c == f17) {
            return;
        }
        if (this.B1 == null) {
            android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
            this.B1 = valueAnimator;
            valueAnimator.setInterpolator(w9.a.f444035b);
            this.B1.setDuration(167L);
            this.B1.addUpdateListener(new com.google.android.material.textfield.f(this));
        }
        this.B1.setFloatValues(fVar.f260598c, f17);
        this.B1.start();
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof android.widget.EditText)) {
            super.addView(view, i17, layoutParams);
            return;
        }
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        android.widget.FrameLayout frameLayout = this.f44562d;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        m();
        setEditText((android.widget.EditText) view);
    }

    public final void b() {
        int i17;
        android.graphics.drawable.Drawable drawable;
        if (this.f44578t == null) {
            return;
        }
        int i18 = this.f44581w;
        if (i18 == 1) {
            this.C = 0;
        } else if (i18 == 2 && this.f44574p1 == 0) {
            this.f44574p1 = this.f44583x0.getColorForState(getDrawableState(), this.f44583x0.getDefaultColor());
        }
        android.widget.EditText editText = this.f44563e;
        if (editText != null && this.f44581w == 2) {
            if (editText.getBackground() != null) {
                this.H = this.f44563e.getBackground();
            }
            android.widget.EditText editText2 = this.f44563e;
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.u0.q(editText2, null);
        }
        android.widget.EditText editText3 = this.f44563e;
        if (editText3 != null && this.f44581w == 1 && (drawable = this.H) != null) {
            java.util.WeakHashMap weakHashMap2 = n3.l1.f334362a;
            n3.u0.q(editText3, drawable);
        }
        int i19 = this.C;
        if (i19 > -1 && (i17 = this.F) != 0) {
            this.f44578t.setStroke(i19, i17);
        }
        this.f44578t.setCornerRadii(getCornerRadiiAsArray());
        this.f44578t.setColor(this.G);
        invalidate();
    }

    public final void c() {
        android.graphics.drawable.Drawable drawable = this.M;
        if (drawable != null) {
            if (this.U || this.W) {
                android.graphics.drawable.Drawable mutate = drawable.mutate();
                this.M = mutate;
                if (this.U) {
                    f3.b.h(mutate, this.T);
                }
                if (this.W) {
                    f3.b.i(this.M, this.V);
                }
                com.google.android.material.internal.CheckableImageButton checkableImageButton = this.P;
                if (checkableImageButton != null) {
                    android.graphics.drawable.Drawable drawable2 = checkableImageButton.getDrawable();
                    android.graphics.drawable.Drawable drawable3 = this.M;
                    if (drawable2 != drawable3) {
                        this.P.setImageDrawable(drawable3);
                    }
                }
            }
        }
    }

    public final int d() {
        float f17;
        if (!this.f44575q) {
            return 0;
        }
        int i17 = this.f44581w;
        fa.f fVar = this.f44589z1;
        if (i17 == 0 || i17 == 1) {
            android.text.TextPaint textPaint = fVar.E;
            textPaint.setTextSize(fVar.f260605j);
            textPaint.setTypeface(fVar.f260614s);
            f17 = -textPaint.ascent();
        } else {
            if (i17 != 2) {
                return 0;
            }
            android.text.TextPaint textPaint2 = fVar.E;
            textPaint2.setTextSize(fVar.f260605j);
            textPaint2.setTypeface(fVar.f260614s);
            f17 = (-textPaint2.ascent()) / 2.0f;
        }
        return (int) f17;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(android.view.ViewStructure viewStructure, int i17) {
        android.widget.EditText editText;
        if (this.f44564f == null || (editText = this.f44563e) == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i17);
            return;
        }
        boolean z17 = this.f44577s;
        this.f44577s = false;
        java.lang.CharSequence hint = editText.getHint();
        this.f44563e.setHint(this.f44564f);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i17);
        } finally {
            this.f44563e.setHint(hint);
            this.f44577s = z17;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(android.util.SparseArray sparseArray) {
        this.D1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.D1 = false;
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.drawable.GradientDrawable gradientDrawable = this.f44578t;
        if (gradientDrawable != null) {
            gradientDrawable.draw(canvas);
        }
        super.draw(canvas);
        if (this.f44575q) {
            this.f44589z1.d(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.C1) {
            return;
        }
        this.C1 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n(n3.x0.c(this) && isEnabled(), false);
        l();
        p();
        q();
        fa.f fVar = this.f44589z1;
        if (fVar != null ? fVar.o(drawableState) | false : false) {
            invalidate();
        }
        this.C1 = false;
    }

    public final boolean e() {
        return this.f44575q && !android.text.TextUtils.isEmpty(this.f44576r) && (this.f44578t instanceof com.google.android.material.textfield.a);
    }

    public final void f() {
        int i17 = this.f44581w;
        if (i17 == 0) {
            this.f44578t = null;
        } else if (i17 == 2 && this.f44575q && !(this.f44578t instanceof com.google.android.material.textfield.a)) {
            this.f44578t = new com.google.android.material.textfield.a();
        } else if (!(this.f44578t instanceof android.graphics.drawable.GradientDrawable)) {
            this.f44578t = new android.graphics.drawable.GradientDrawable();
        }
        if (this.f44581w != 0) {
            m();
        }
        p();
    }

    public final void g() {
        float measureText;
        float f17;
        float f18;
        if (e()) {
            android.graphics.RectF rectF = this.f44561J;
            fa.f fVar = this.f44589z1;
            boolean b17 = fVar.b(fVar.f260617v);
            float f19 = 0.0f;
            android.text.TextPaint textPaint = fVar.E;
            android.graphics.Rect rect = fVar.f260600e;
            if (b17) {
                float f27 = rect.right;
                if (fVar.f260617v == null) {
                    measureText = 0.0f;
                } else {
                    textPaint.setTextSize(fVar.f260605j);
                    textPaint.setTypeface(fVar.f260614s);
                    java.lang.CharSequence charSequence = fVar.f260617v;
                    measureText = textPaint.measureText(charSequence, 0, charSequence.length());
                }
                f17 = f27 - measureText;
            } else {
                f17 = rect.left;
            }
            rectF.left = f17;
            rectF.top = rect.top;
            if (b17) {
                f18 = rect.right;
            } else {
                if (fVar.f260617v != null) {
                    textPaint.setTextSize(fVar.f260605j);
                    textPaint.setTypeface(fVar.f260614s);
                    java.lang.CharSequence charSequence2 = fVar.f260617v;
                    f19 = textPaint.measureText(charSequence2, 0, charSequence2.length());
                }
                f18 = f17 + f19;
            }
            rectF.right = f18;
            float f28 = rect.top;
            textPaint.setTextSize(fVar.f260605j);
            textPaint.setTypeface(fVar.f260614s);
            float f29 = f28 + (-textPaint.ascent());
            float f37 = rectF.left;
            float f38 = this.f44580v;
            rectF.left = f37 - f38;
            rectF.top -= f38;
            rectF.right += f38;
            rectF.bottom = f29 + f38;
            com.google.android.material.textfield.a aVar = (com.google.android.material.textfield.a) this.f44578t;
            aVar.getClass();
            aVar.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    public int getBoxBackgroundColor() {
        return this.G;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.A;
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.B;
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.f44588z;
    }

    public float getBoxCornerRadiusTopStart() {
        return this.f44585y;
    }

    public int getBoxStrokeColor() {
        return this.f44574p1;
    }

    public int getCounterMaxLength() {
        return this.f44567i;
    }

    public java.lang.CharSequence getCounterOverflowDescription() {
        android.widget.TextView textView;
        if (this.f44566h && this.f44569m && (textView = this.f44570n) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public android.content.res.ColorStateList getDefaultHintTextColor() {
        return this.f44573p0;
    }

    public android.widget.EditText getEditText() {
        return this.f44563e;
    }

    public java.lang.CharSequence getError() {
        com.google.android.material.textfield.c cVar = this.f44565g;
        if (cVar.f44611l) {
            return cVar.f44610k;
        }
        return null;
    }

    public int getErrorCurrentTextColors() {
        android.widget.TextView textView = this.f44565g.f44612m;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public final int getErrorTextCurrentColor() {
        android.widget.TextView textView = this.f44565g.f44612m;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public java.lang.CharSequence getHelperText() {
        com.google.android.material.textfield.c cVar = this.f44565g;
        if (cVar.f44615p) {
            return cVar.f44614o;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        android.widget.TextView textView = this.f44565g.f44616q;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public java.lang.CharSequence getHint() {
        if (this.f44575q) {
            return this.f44576r;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        fa.f fVar = this.f44589z1;
        android.text.TextPaint textPaint = fVar.E;
        textPaint.setTextSize(fVar.f260605j);
        textPaint.setTypeface(fVar.f260614s);
        return -textPaint.ascent();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.f44589z1.e();
    }

    public java.lang.CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.N;
    }

    public android.graphics.drawable.Drawable getPasswordVisibilityToggleDrawable() {
        return this.M;
    }

    public android.graphics.Typeface getTypeface() {
        return this.K;
    }

    public void h(boolean z17) {
        if (this.L) {
            int selectionEnd = this.f44563e.getSelectionEnd();
            android.widget.EditText editText = this.f44563e;
            if (editText != null && (editText.getTransformationMethod() instanceof android.text.method.PasswordTransformationMethod)) {
                this.f44563e.setTransformationMethod(null);
                this.Q = true;
            } else {
                this.f44563e.setTransformationMethod(android.text.method.PasswordTransformationMethod.getInstance());
                this.Q = false;
            }
            this.P.setChecked(this.Q);
            if (z17) {
                this.P.jumpDrawablesToCurrentState();
            }
            this.f44563e.setSelection(selectionEnd);
        }
    }

    public void j(android.widget.TextView textView, int i17) {
        boolean z17 = true;
        try {
            textView.setTextAppearance(i17);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                z17 = false;
            }
        } catch (java.lang.Exception unused) {
        }
        if (z17) {
            textView.setTextAppearance(com.tencent.mm.R.style.f494567qe);
            textView.setTextColor(b3.l.getColor(getContext(), com.tencent.mm.R.color.f478875jl));
        }
    }

    public void k(int i17) {
        boolean z17 = this.f44569m;
        if (this.f44567i == -1) {
            this.f44570n.setText(java.lang.String.valueOf(i17));
            this.f44570n.setContentDescription(null);
            this.f44569m = false;
        } else {
            android.widget.TextView textView = this.f44570n;
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            if (n3.x0.a(textView) == 1) {
                n3.x0.f(this.f44570n, 0);
            }
            boolean z18 = i17 > this.f44567i;
            this.f44569m = z18;
            if (z17 != z18) {
                j(this.f44570n, z18 ? this.f44571o : this.f44572p);
                if (this.f44569m) {
                    n3.x0.f(this.f44570n, 1);
                }
            }
            this.f44570n.setText(getContext().getString(com.tencent.mm.R.string.ax8, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f44567i)));
            this.f44570n.setContentDescription(getContext().getString(com.tencent.mm.R.string.ax7, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f44567i)));
        }
        if (this.f44563e == null || z17 == this.f44569m) {
            return;
        }
        n(false, false);
        q();
        l();
    }

    public void l() {
        android.graphics.drawable.Drawable background;
        android.widget.TextView textView;
        android.widget.EditText editText = this.f44563e;
        if (editText == null || (background = editText.getBackground()) == null) {
            return;
        }
        if (androidx.appcompat.widget.y0.a(background)) {
            background = background.mutate();
        }
        com.google.android.material.textfield.c cVar = this.f44565g;
        if (cVar.e()) {
            android.widget.TextView textView2 = cVar.f44612m;
            background.setColorFilter(androidx.appcompat.widget.h0.j(textView2 != null ? textView2.getCurrentTextColor() : -1, android.graphics.PorterDuff.Mode.SRC_IN));
        } else if (this.f44569m && (textView = this.f44570n) != null) {
            background.setColorFilter(androidx.appcompat.widget.h0.j(textView.getCurrentTextColor(), android.graphics.PorterDuff.Mode.SRC_IN));
        } else {
            background.clearColorFilter();
            this.f44563e.refreshDrawableState();
        }
    }

    public final void m() {
        android.widget.FrameLayout frameLayout = this.f44562d;
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) frameLayout.getLayoutParams();
        int d17 = d();
        if (d17 != layoutParams.topMargin) {
            layoutParams.topMargin = d17;
            frameLayout.requestLayout();
        }
    }

    public final void n(boolean z17, boolean z18) {
        android.content.res.ColorStateList colorStateList;
        android.widget.TextView textView;
        boolean isEnabled = isEnabled();
        android.widget.EditText editText = this.f44563e;
        boolean z19 = (editText == null || android.text.TextUtils.isEmpty(editText.getText())) ? false : true;
        android.widget.EditText editText2 = this.f44563e;
        boolean z27 = editText2 != null && editText2.hasFocus();
        com.google.android.material.textfield.c cVar = this.f44565g;
        boolean e17 = cVar.e();
        android.content.res.ColorStateList colorStateList2 = this.f44573p0;
        fa.f fVar = this.f44589z1;
        if (colorStateList2 != null) {
            fVar.k(colorStateList2);
            android.content.res.ColorStateList colorStateList3 = this.f44573p0;
            if (fVar.f260606k != colorStateList3) {
                fVar.f260606k = colorStateList3;
                fVar.i();
            }
        }
        if (!isEnabled) {
            int i17 = this.f44584x1;
            fVar.k(android.content.res.ColorStateList.valueOf(i17));
            android.content.res.ColorStateList valueOf = android.content.res.ColorStateList.valueOf(i17);
            if (fVar.f260606k != valueOf) {
                fVar.f260606k = valueOf;
                fVar.i();
            }
        } else if (e17) {
            android.widget.TextView textView2 = cVar.f44612m;
            fVar.k(textView2 != null ? textView2.getTextColors() : null);
        } else if (this.f44569m && (textView = this.f44570n) != null) {
            fVar.k(textView.getTextColors());
        } else if (z27 && (colorStateList = this.f44583x0) != null) {
            fVar.k(colorStateList);
        }
        if (z19 || (isEnabled() && (z27 || e17))) {
            if (z18 || this.f44587y1) {
                android.animation.ValueAnimator valueAnimator = this.B1;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.B1.cancel();
                }
                if (z17 && this.A1) {
                    a(1.0f);
                } else {
                    fVar.m(1.0f);
                }
                this.f44587y1 = false;
                if (e()) {
                    g();
                    return;
                }
                return;
            }
            return;
        }
        if (z18 || !this.f44587y1) {
            android.animation.ValueAnimator valueAnimator2 = this.B1;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.B1.cancel();
            }
            if (z17 && this.A1) {
                a(0.0f);
            } else {
                fVar.m(0.0f);
            }
            if (e() && (!((com.google.android.material.textfield.a) this.f44578t).f44593b.isEmpty()) && e()) {
                ((com.google.android.material.textfield.a) this.f44578t).a(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f44587y1 = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o() {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.o():void");
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        android.widget.EditText editText;
        super.onLayout(z17, i17, i18, i19, i27);
        if (this.f44578t != null) {
            p();
        }
        if (!this.f44575q || (editText = this.f44563e) == null) {
            return;
        }
        android.graphics.Rect rect = this.I;
        fa.g.a(this, editText, rect);
        int compoundPaddingLeft = rect.left + this.f44563e.getCompoundPaddingLeft();
        int compoundPaddingRight = rect.right - this.f44563e.getCompoundPaddingRight();
        int i28 = this.f44581w;
        int paddingTop = i28 != 1 ? i28 != 2 ? getPaddingTop() : getBoxBackground().getBounds().top - d() : getBoxBackground().getBounds().top + this.f44582x;
        int compoundPaddingTop = rect.top + this.f44563e.getCompoundPaddingTop();
        int compoundPaddingBottom = rect.bottom - this.f44563e.getCompoundPaddingBottom();
        fa.f fVar = this.f44589z1;
        android.graphics.Rect rect2 = fVar.f260599d;
        boolean z18 = false;
        if (!(rect2.left == compoundPaddingLeft && rect2.top == compoundPaddingTop && rect2.right == compoundPaddingRight && rect2.bottom == compoundPaddingBottom)) {
            rect2.set(compoundPaddingLeft, compoundPaddingTop, compoundPaddingRight, compoundPaddingBottom);
            fVar.C = true;
            fVar.g();
        }
        int paddingBottom = (i27 - i18) - getPaddingBottom();
        android.graphics.Rect rect3 = fVar.f260600e;
        if (rect3.left == compoundPaddingLeft && rect3.top == paddingTop && rect3.right == compoundPaddingRight && rect3.bottom == paddingBottom) {
            z18 = true;
        }
        if (!z18) {
            rect3.set(compoundPaddingLeft, paddingTop, compoundPaddingRight, paddingBottom);
            fVar.C = true;
            fVar.g();
        }
        fVar.i();
        if (!e() || this.f44587y1) {
            return;
        }
        g();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        o();
        super.onMeasure(i17, i18);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof com.google.android.material.textfield.TextInputLayout.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.google.android.material.textfield.TextInputLayout.SavedState savedState = (com.google.android.material.textfield.TextInputLayout.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f11112d);
        setError(savedState.f44590f);
        if (savedState.f44591g) {
            h(true);
        }
        requestLayout();
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        com.google.android.material.textfield.TextInputLayout.SavedState savedState = new com.google.android.material.textfield.TextInputLayout.SavedState(super.onSaveInstanceState());
        if (this.f44565g.e()) {
            savedState.f44590f = getError();
        }
        savedState.f44591g = this.Q;
        return savedState;
    }

    public final void p() {
        android.graphics.drawable.Drawable background;
        if (this.f44581w == 0 || this.f44578t == null || this.f44563e == null || getRight() == 0) {
            return;
        }
        int left = this.f44563e.getLeft();
        android.widget.EditText editText = this.f44563e;
        int i17 = 0;
        if (editText != null) {
            int i18 = this.f44581w;
            if (i18 == 1) {
                i17 = editText.getTop();
            } else if (i18 == 2) {
                i17 = d() + editText.getTop();
            }
        }
        int right = this.f44563e.getRight();
        int bottom = this.f44563e.getBottom() + this.f44579u;
        if (this.f44581w == 2) {
            int i19 = this.E;
            left += i19 / 2;
            i17 -= i19 / 2;
            right -= i19 / 2;
            bottom += i19 / 2;
        }
        this.f44578t.setBounds(left, i17, right, bottom);
        b();
        android.widget.EditText editText2 = this.f44563e;
        if (editText2 == null || (background = editText2.getBackground()) == null) {
            return;
        }
        if (androidx.appcompat.widget.y0.a(background)) {
            background = background.mutate();
        }
        fa.g.a(this, this.f44563e, new android.graphics.Rect());
        android.graphics.Rect bounds = background.getBounds();
        if (bounds.left != bounds.right) {
            android.graphics.Rect rect = new android.graphics.Rect();
            background.getPadding(rect);
            background.setBounds(bounds.left - rect.left, bounds.top, bounds.right + (rect.right * 2), this.f44563e.getBottom());
        }
    }

    public void q() {
        android.widget.TextView textView;
        if (this.f44578t == null || this.f44581w == 0) {
            return;
        }
        android.widget.EditText editText = this.f44563e;
        boolean z17 = editText != null && editText.hasFocus();
        android.widget.EditText editText2 = this.f44563e;
        boolean z18 = editText2 != null && editText2.isHovered();
        if (this.f44581w == 2) {
            if (isEnabled()) {
                com.google.android.material.textfield.c cVar = this.f44565g;
                if (cVar.e()) {
                    android.widget.TextView textView2 = cVar.f44612m;
                    this.F = textView2 != null ? textView2.getCurrentTextColor() : -1;
                } else if (this.f44569m && (textView = this.f44570n) != null) {
                    this.F = textView.getCurrentTextColor();
                } else if (z17) {
                    this.F = this.f44574p1;
                } else if (z18) {
                    this.F = this.f44568l1;
                } else {
                    this.F = this.f44586y0;
                }
            } else {
                this.F = this.f44584x1;
            }
            if ((z18 || z17) && isEnabled()) {
                this.C = this.E;
            } else {
                this.C = this.D;
            }
            b();
        }
    }

    public void setBoxBackgroundColor(int i17) {
        if (this.G != i17) {
            this.G = i17;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i17) {
        setBoxBackgroundColor(b3.l.getColor(getContext(), i17));
    }

    public void setBoxBackgroundMode(int i17) {
        if (i17 == this.f44581w) {
            return;
        }
        this.f44581w = i17;
        f();
    }

    public void setBoxStrokeColor(int i17) {
        if (this.f44574p1 != i17) {
            this.f44574p1 = i17;
            q();
        }
    }

    public void setCounterEnabled(boolean z17) {
        if (this.f44566h != z17) {
            com.google.android.material.textfield.c cVar = this.f44565g;
            if (z17) {
                androidx.appcompat.widget.AppCompatTextView appCompatTextView = new androidx.appcompat.widget.AppCompatTextView(getContext(), null);
                this.f44570n = appCompatTextView;
                appCompatTextView.setId(com.tencent.mm.R.id.o5i);
                android.graphics.Typeface typeface = this.K;
                if (typeface != null) {
                    this.f44570n.setTypeface(typeface);
                }
                this.f44570n.setMaxLines(1);
                j(this.f44570n, this.f44572p);
                cVar.a(this.f44570n, 2);
                android.widget.EditText editText = this.f44563e;
                if (editText == null) {
                    k(0);
                } else {
                    k(editText.getText().length());
                }
            } else {
                cVar.h(this.f44570n, 2);
                this.f44570n = null;
            }
            this.f44566h = z17;
        }
    }

    public void setCounterMaxLength(int i17) {
        if (this.f44567i != i17) {
            if (i17 > 0) {
                this.f44567i = i17;
            } else {
                this.f44567i = -1;
            }
            if (this.f44566h) {
                android.widget.EditText editText = this.f44563e;
                k(editText == null ? 0 : editText.getText().length());
            }
        }
    }

    public void setDefaultHintTextColor(android.content.res.ColorStateList colorStateList) {
        this.f44573p0 = colorStateList;
        this.f44583x0 = colorStateList;
        if (this.f44563e != null) {
            n(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z17) {
        i(this, z17);
        super.setEnabled(z17);
    }

    public void setError(java.lang.CharSequence charSequence) {
        com.google.android.material.textfield.c cVar = this.f44565g;
        if (!cVar.f44611l) {
            if (android.text.TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (android.text.TextUtils.isEmpty(charSequence)) {
            cVar.g();
            return;
        }
        cVar.c();
        cVar.f44610k = charSequence;
        cVar.f44612m.setText(charSequence);
        int i17 = cVar.f44608i;
        if (i17 != 1) {
            cVar.f44609j = 1;
        }
        cVar.j(i17, cVar.f44609j, cVar.i(cVar.f44612m, charSequence));
    }

    public void setErrorEnabled(boolean z17) {
        com.google.android.material.textfield.c cVar = this.f44565g;
        if (cVar.f44611l == z17) {
            return;
        }
        cVar.c();
        com.google.android.material.textfield.TextInputLayout textInputLayout = cVar.f44601b;
        if (z17) {
            androidx.appcompat.widget.AppCompatTextView appCompatTextView = new androidx.appcompat.widget.AppCompatTextView(cVar.f44600a, null);
            cVar.f44612m = appCompatTextView;
            appCompatTextView.setId(com.tencent.mm.R.id.o5j);
            android.graphics.Typeface typeface = cVar.f44618s;
            if (typeface != null) {
                cVar.f44612m.setTypeface(typeface);
            }
            int i17 = cVar.f44613n;
            cVar.f44613n = i17;
            android.widget.TextView textView = cVar.f44612m;
            if (textView != null) {
                textInputLayout.j(textView, i17);
            }
            cVar.f44612m.setVisibility(4);
            android.widget.TextView textView2 = cVar.f44612m;
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.x0.f(textView2, 1);
            cVar.a(cVar.f44612m, 0);
        } else {
            cVar.g();
            cVar.h(cVar.f44612m, 0);
            cVar.f44612m = null;
            textInputLayout.l();
            textInputLayout.q();
        }
        cVar.f44611l = z17;
    }

    public void setErrorTextAppearance(int i17) {
        com.google.android.material.textfield.c cVar = this.f44565g;
        cVar.f44613n = i17;
        android.widget.TextView textView = cVar.f44612m;
        if (textView != null) {
            cVar.f44601b.j(textView, i17);
        }
    }

    public void setErrorTextColor(android.content.res.ColorStateList colorStateList) {
        android.widget.TextView textView = this.f44565g.f44612m;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setHelperText(java.lang.CharSequence charSequence) {
        boolean isEmpty = android.text.TextUtils.isEmpty(charSequence);
        com.google.android.material.textfield.c cVar = this.f44565g;
        if (isEmpty) {
            if (cVar.f44615p) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!cVar.f44615p) {
            setHelperTextEnabled(true);
        }
        cVar.c();
        cVar.f44614o = charSequence;
        cVar.f44616q.setText(charSequence);
        int i17 = cVar.f44608i;
        if (i17 != 2) {
            cVar.f44609j = 2;
        }
        cVar.j(i17, cVar.f44609j, cVar.i(cVar.f44616q, charSequence));
    }

    public void setHelperTextColor(android.content.res.ColorStateList colorStateList) {
        android.widget.TextView textView = this.f44565g.f44616q;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z17) {
        com.google.android.material.textfield.c cVar = this.f44565g;
        if (cVar.f44615p == z17) {
            return;
        }
        cVar.c();
        if (z17) {
            androidx.appcompat.widget.AppCompatTextView appCompatTextView = new androidx.appcompat.widget.AppCompatTextView(cVar.f44600a, null);
            cVar.f44616q = appCompatTextView;
            appCompatTextView.setId(com.tencent.mm.R.id.o5k);
            android.graphics.Typeface typeface = cVar.f44618s;
            if (typeface != null) {
                cVar.f44616q.setTypeface(typeface);
            }
            cVar.f44616q.setVisibility(4);
            android.widget.TextView textView = cVar.f44616q;
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.x0.f(textView, 1);
            int i17 = cVar.f44617r;
            cVar.f44617r = i17;
            android.widget.TextView textView2 = cVar.f44616q;
            if (textView2 != null) {
                textView2.setTextAppearance(i17);
            }
            cVar.a(cVar.f44616q, 1);
        } else {
            cVar.c();
            int i18 = cVar.f44608i;
            if (i18 == 2) {
                cVar.f44609j = 0;
            }
            cVar.j(i18, cVar.f44609j, cVar.i(cVar.f44616q, null));
            cVar.h(cVar.f44616q, 1);
            cVar.f44616q = null;
            com.google.android.material.textfield.TextInputLayout textInputLayout = cVar.f44601b;
            textInputLayout.l();
            textInputLayout.q();
        }
        cVar.f44615p = z17;
    }

    public void setHelperTextTextAppearance(int i17) {
        com.google.android.material.textfield.c cVar = this.f44565g;
        cVar.f44617r = i17;
        android.widget.TextView textView = cVar.f44616q;
        if (textView != null) {
            textView.setTextAppearance(i17);
        }
    }

    public void setHint(java.lang.CharSequence charSequence) {
        if (this.f44575q) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z17) {
        this.A1 = z17;
    }

    public void setHintEnabled(boolean z17) {
        if (z17 != this.f44575q) {
            this.f44575q = z17;
            if (z17) {
                java.lang.CharSequence hint = this.f44563e.getHint();
                if (!android.text.TextUtils.isEmpty(hint)) {
                    if (android.text.TextUtils.isEmpty(this.f44576r)) {
                        setHint(hint);
                    }
                    this.f44563e.setHint((java.lang.CharSequence) null);
                }
                this.f44577s = true;
            } else {
                this.f44577s = false;
                if (!android.text.TextUtils.isEmpty(this.f44576r) && android.text.TextUtils.isEmpty(this.f44563e.getHint())) {
                    this.f44563e.setHint(this.f44576r);
                }
                setHintInternal(null);
            }
            if (this.f44563e != null) {
                m();
            }
        }
    }

    public void setHintTextAppearance(int i17) {
        fa.f fVar = this.f44589z1;
        fVar.j(i17);
        this.f44583x0 = fVar.f260607l;
        if (this.f44563e != null) {
            n(false, false);
            m();
        }
    }

    public void setPasswordVisibilityToggleContentDescription(int i17) {
        setPasswordVisibilityToggleContentDescription(i17 != 0 ? getResources().getText(i17) : null);
    }

    public void setPasswordVisibilityToggleDrawable(int i17) {
        setPasswordVisibilityToggleDrawable(i17 != 0 ? k.a.a(getContext(), i17) : null);
    }

    public void setPasswordVisibilityToggleEnabled(boolean z17) {
        android.widget.EditText editText;
        if (this.L != z17) {
            this.L = z17;
            if (!z17 && this.Q && (editText = this.f44563e) != null) {
                editText.setTransformationMethod(android.text.method.PasswordTransformationMethod.getInstance());
            }
            this.Q = false;
            o();
        }
    }

    public void setPasswordVisibilityToggleTintList(android.content.res.ColorStateList colorStateList) {
        this.T = colorStateList;
        this.U = true;
        c();
    }

    public void setPasswordVisibilityToggleTintMode(android.graphics.PorterDuff.Mode mode) {
        this.V = mode;
        this.W = true;
        c();
    }

    public void setTextInputAccessibilityDelegate(com.google.android.material.textfield.g gVar) {
        android.widget.EditText editText = this.f44563e;
        if (editText != null) {
            n3.l1.l(editText, gVar);
        }
    }

    public void setTypeface(android.graphics.Typeface typeface) {
        if (typeface != this.K) {
            this.K = typeface;
            fa.f fVar = this.f44589z1;
            fVar.f260615t = typeface;
            fVar.f260614s = typeface;
            fVar.i();
            com.google.android.material.textfield.c cVar = this.f44565g;
            if (typeface != cVar.f44618s) {
                cVar.f44618s = typeface;
                android.widget.TextView textView = cVar.f44612m;
                if (textView != null) {
                    textView.setTypeface(typeface);
                }
                android.widget.TextView textView2 = cVar.f44616q;
                if (textView2 != null) {
                    textView2.setTypeface(typeface);
                }
            }
            android.widget.TextView textView3 = this.f44570n;
            if (textView3 != null) {
                textView3.setTypeface(typeface);
            }
        }
    }

    public TextInputLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f44565g = new com.google.android.material.textfield.c(this);
        this.I = new android.graphics.Rect();
        this.f44561J = new android.graphics.RectF();
        fa.f fVar = new fa.f(this);
        this.f44589z1 = fVar;
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        this.f44562d = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        addView(frameLayout);
        android.animation.TimeInterpolator timeInterpolator = w9.a.f444034a;
        fVar.G = timeInterpolator;
        fVar.i();
        fVar.F = timeInterpolator;
        fVar.i();
        if (fVar.f260603h != 8388659) {
            fVar.f260603h = 8388659;
            fVar.i();
        }
        int[] iArr = v9.a.f434133w;
        fa.d0.a(context, attributeSet, i17, com.tencent.mm.R.style.f494751v9);
        fa.d0.b(context, attributeSet, iArr, i17, com.tencent.mm.R.style.f494751v9, new int[0]);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i17, com.tencent.mm.R.style.f494751v9);
        androidx.appcompat.widget.q2 q2Var = new androidx.appcompat.widget.q2(context, obtainStyledAttributes);
        this.f44575q = q2Var.a(21, true);
        setHint(q2Var.j(1));
        this.A1 = q2Var.a(20, true);
        this.f44579u = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.a6p);
        this.f44580v = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.a6q);
        this.f44582x = q2Var.c(4, 0);
        this.f44585y = obtainStyledAttributes.getDimension(8, 0.0f);
        this.f44588z = obtainStyledAttributes.getDimension(7, 0.0f);
        this.A = obtainStyledAttributes.getDimension(5, 0.0f);
        this.B = obtainStyledAttributes.getDimension(6, 0.0f);
        this.G = obtainStyledAttributes.getColor(2, 0);
        this.f44574p1 = obtainStyledAttributes.getColor(9, 0);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a6r);
        this.D = dimensionPixelSize;
        this.E = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a6s);
        this.C = dimensionPixelSize;
        setBoxBackgroundMode(q2Var.h(3, 0));
        if (q2Var.k(0)) {
            android.content.res.ColorStateList b17 = q2Var.b(0);
            this.f44583x0 = b17;
            this.f44573p0 = b17;
        }
        this.f44586y0 = b3.l.getColor(context, com.tencent.mm.R.color.f479440zb);
        this.f44584x1 = b3.l.getColor(context, com.tencent.mm.R.color.f479441zc);
        this.f44568l1 = b3.l.getColor(context, com.tencent.mm.R.color.f479442zd);
        if (q2Var.i(22, -1) != -1) {
            setHintTextAppearance(q2Var.i(22, 0));
        }
        int i18 = q2Var.i(16, 0);
        boolean a17 = q2Var.a(15, false);
        int i19 = q2Var.i(19, 0);
        boolean a18 = q2Var.a(18, false);
        java.lang.CharSequence j17 = q2Var.j(17);
        boolean a19 = q2Var.a(11, false);
        setCounterMaxLength(q2Var.h(12, -1));
        this.f44572p = q2Var.i(14, 0);
        this.f44571o = q2Var.i(13, 0);
        this.L = q2Var.a(25, false);
        this.M = q2Var.e(24);
        this.N = q2Var.j(23);
        if (q2Var.k(26)) {
            this.U = true;
            this.T = q2Var.b(26);
        }
        if (q2Var.k(27)) {
            this.W = true;
            this.V = fa.e0.a(q2Var.h(27, -1), null);
        }
        q2Var.m();
        setHelperTextEnabled(a18);
        setHelperText(j17);
        setHelperTextTextAppearance(i19);
        setErrorEnabled(a17);
        setErrorTextAppearance(i18);
        setCounterEnabled(a19);
        c();
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.u0.s(this, 2);
    }

    public void setPasswordVisibilityToggleContentDescription(java.lang.CharSequence charSequence) {
        this.N = charSequence;
        com.google.android.material.internal.CheckableImageButton checkableImageButton = this.P;
        if (checkableImageButton != null) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setPasswordVisibilityToggleDrawable(android.graphics.drawable.Drawable drawable) {
        this.M = drawable;
        com.google.android.material.internal.CheckableImageButton checkableImageButton = this.P;
        if (checkableImageButton != null) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }
}

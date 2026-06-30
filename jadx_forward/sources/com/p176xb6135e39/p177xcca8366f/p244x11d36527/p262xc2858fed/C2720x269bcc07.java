package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed;

/* renamed from: com.google.android.material.textfield.TextInputLayout */
/* loaded from: classes15.dex */
public class C2720x269bcc07 extends android.widget.LinearLayout {
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
    public final android.graphics.RectF f126094J;
    public android.graphics.Typeface K;
    public boolean L;
    public android.graphics.drawable.Drawable M;
    public java.lang.CharSequence N;
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p257x21ffc6bd.C2704x2750c0cb P;
    public boolean Q;
    public android.graphics.drawable.Drawable R;
    public android.graphics.drawable.Drawable S;
    public android.content.res.ColorStateList T;
    public boolean U;
    public android.graphics.PorterDuff.Mode V;
    public boolean W;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.FrameLayout f126095d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.EditText f126096e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.CharSequence f126097f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.c f126098g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f126099h;

    /* renamed from: i, reason: collision with root package name */
    public int f126100i;

    /* renamed from: l1, reason: collision with root package name */
    public final int f126101l1;

    /* renamed from: m, reason: collision with root package name */
    public boolean f126102m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f126103n;

    /* renamed from: o, reason: collision with root package name */
    public final int f126104o;

    /* renamed from: p, reason: collision with root package name */
    public final int f126105p;

    /* renamed from: p0, reason: collision with root package name */
    public android.content.res.ColorStateList f126106p0;

    /* renamed from: p1, reason: collision with root package name */
    public int f126107p1;

    /* renamed from: q, reason: collision with root package name */
    public boolean f126108q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.CharSequence f126109r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f126110s;

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.drawable.GradientDrawable f126111t;

    /* renamed from: u, reason: collision with root package name */
    public final int f126112u;

    /* renamed from: v, reason: collision with root package name */
    public final int f126113v;

    /* renamed from: w, reason: collision with root package name */
    public int f126114w;

    /* renamed from: x, reason: collision with root package name */
    public final int f126115x;

    /* renamed from: x0, reason: collision with root package name */
    public android.content.res.ColorStateList f126116x0;

    /* renamed from: x1, reason: collision with root package name */
    public final int f126117x1;

    /* renamed from: y, reason: collision with root package name */
    public final float f126118y;

    /* renamed from: y0, reason: collision with root package name */
    public final int f126119y0;

    /* renamed from: y1, reason: collision with root package name */
    public boolean f126120y1;

    /* renamed from: z, reason: collision with root package name */
    public final float f126121z;

    /* renamed from: z1, reason: collision with root package name */
    public final fa.f f126122z1;

    /* renamed from: com.google.android.material.textfield.TextInputLayout$SavedState */
    /* loaded from: classes13.dex */
    public static class SavedState extends p012xc85e97e9.p080xa1c8a596.p081x373aa5.AbstractC1096x35cc803c {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.C2720x269bcc07.SavedState> f7863x681a0c0c = new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.h();

        /* renamed from: f, reason: collision with root package name */
        public java.lang.CharSequence f126123f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f126124g;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f126123f = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f126124g = parcel.readInt() == 1;
        }

        /* renamed from: toString */
        public java.lang.String m20439x9616526c() {
            return "TextInputLayout.SavedState{" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " error=" + ((java.lang.Object) this.f126123f) + "}";
        }

        @Override // p012xc85e97e9.p080xa1c8a596.p081x373aa5.AbstractC1096x35cc803c, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeParcelable(this.f92645d, i17);
            android.text.TextUtils.writeToParcel(this.f126123f, parcel, i17);
            parcel.writeInt(this.f126124g ? 1 : 0);
        }
    }

    public C2720x269bcc07(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559986ka);
    }

    /* renamed from: getBoxBackground */
    private android.graphics.drawable.Drawable m20385x542ce9a3() {
        int i17 = this.f126114w;
        if (i17 == 1 || i17 == 2) {
            return this.f126111t;
        }
        throw new java.lang.IllegalStateException();
    }

    /* renamed from: getCornerRadiiAsArray */
    private float[] m20386x63abac7d() {
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        boolean z17 = n3.v0.d(this) == 1;
        float f17 = this.A;
        float f18 = this.B;
        float f19 = this.f126118y;
        float f27 = this.f126121z;
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

    /* renamed from: setEditText */
    private void m20387xd60fb0d9(android.widget.EditText editText) {
        if (this.f126096e != null) {
            throw new java.lang.IllegalArgumentException("We already have an EditText, can only have one");
        }
        boolean z17 = editText instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.C2719x9b4d1ff4;
        this.f126096e = editText;
        f();
        m20436x6c63f358(new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.g(this));
        android.widget.EditText editText2 = this.f126096e;
        boolean z18 = editText2 != null && (editText2.getTransformationMethod() instanceof android.text.method.PasswordTransformationMethod);
        fa.f fVar = this.f126122z1;
        if (!z18) {
            android.graphics.Typeface typeface = this.f126096e.getTypeface();
            fVar.f342148t = typeface;
            fVar.f342147s = typeface;
            fVar.i();
        }
        float textSize = this.f126096e.getTextSize();
        if (fVar.f342137i != textSize) {
            fVar.f342137i = textSize;
            fVar.i();
        }
        int gravity = this.f126096e.getGravity();
        int i17 = (gravity & (-113)) | 48;
        if (fVar.f342136h != i17) {
            fVar.f342136h = i17;
            fVar.i();
        }
        if (fVar.f342135g != gravity) {
            fVar.f342135g = gravity;
            fVar.i();
        }
        this.f126096e.addTextChangedListener(new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.d(this));
        if (this.f126106p0 == null) {
            this.f126106p0 = this.f126096e.getHintTextColors();
        }
        if (this.f126108q) {
            if (android.text.TextUtils.isEmpty(this.f126109r)) {
                java.lang.CharSequence hint = this.f126096e.getHint();
                this.f126097f = hint;
                m20425x764b0e09(hint);
                this.f126096e.setHint((java.lang.CharSequence) null);
            }
            this.f126110s = true;
        }
        if (this.f126103n != null) {
            k(this.f126096e.getText().length());
        }
        this.f126098g.b();
        o();
        n(false, true);
    }

    /* renamed from: setHintInternal */
    private void m20388x159f1fe6(java.lang.CharSequence charSequence) {
        if (android.text.TextUtils.equals(charSequence, this.f126109r)) {
            return;
        }
        this.f126109r = charSequence;
        fa.f fVar = this.f126122z1;
        if (charSequence == null || !charSequence.equals(fVar.f342150v)) {
            fVar.f342150v = charSequence;
            fVar.f342151w = null;
            android.graphics.Bitmap bitmap = fVar.f342153y;
            if (bitmap != null) {
                bitmap.recycle();
                fVar.f342153y = null;
            }
            fVar.i();
        }
        if (this.f126120y1) {
            return;
        }
        g();
    }

    public void a(float f17) {
        fa.f fVar = this.f126122z1;
        if (fVar.f342131c == f17) {
            return;
        }
        if (this.B1 == null) {
            android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
            this.B1 = valueAnimator;
            valueAnimator.setInterpolator(w9.a.f525568b);
            this.B1.setDuration(167L);
            this.B1.addUpdateListener(new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.f(this));
        }
        this.B1.setFloatValues(fVar.f342131c, f17);
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
        android.widget.FrameLayout frameLayout = this.f126095d;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        m();
        m20387xd60fb0d9((android.widget.EditText) view);
    }

    public final void b() {
        int i17;
        android.graphics.drawable.Drawable drawable;
        if (this.f126111t == null) {
            return;
        }
        int i18 = this.f126114w;
        if (i18 == 1) {
            this.C = 0;
        } else if (i18 == 2 && this.f126107p1 == 0) {
            this.f126107p1 = this.f126116x0.getColorForState(getDrawableState(), this.f126116x0.getDefaultColor());
        }
        android.widget.EditText editText = this.f126096e;
        if (editText != null && this.f126114w == 2) {
            if (editText.getBackground() != null) {
                this.H = this.f126096e.getBackground();
            }
            android.widget.EditText editText2 = this.f126096e;
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.u0.q(editText2, null);
        }
        android.widget.EditText editText3 = this.f126096e;
        if (editText3 != null && this.f126114w == 1 && (drawable = this.H) != null) {
            java.util.WeakHashMap weakHashMap2 = n3.l1.f415895a;
            n3.u0.q(editText3, drawable);
        }
        int i19 = this.C;
        if (i19 > -1 && (i17 = this.F) != 0) {
            this.f126111t.setStroke(i19, i17);
        }
        this.f126111t.setCornerRadii(m20386x63abac7d());
        this.f126111t.setColor(this.G);
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
                com.p176xb6135e39.p177xcca8366f.p244x11d36527.p257x21ffc6bd.C2704x2750c0cb c2704x2750c0cb = this.P;
                if (c2704x2750c0cb != null) {
                    android.graphics.drawable.Drawable drawable2 = c2704x2750c0cb.getDrawable();
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
        if (!this.f126108q) {
            return 0;
        }
        int i17 = this.f126114w;
        fa.f fVar = this.f126122z1;
        if (i17 == 0 || i17 == 1) {
            android.text.TextPaint textPaint = fVar.E;
            textPaint.setTextSize(fVar.f342138j);
            textPaint.setTypeface(fVar.f342147s);
            f17 = -textPaint.ascent();
        } else {
            if (i17 != 2) {
                return 0;
            }
            android.text.TextPaint textPaint2 = fVar.E;
            textPaint2.setTextSize(fVar.f342138j);
            textPaint2.setTypeface(fVar.f342147s);
            f17 = (-textPaint2.ascent()) / 2.0f;
        }
        return (int) f17;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(android.view.ViewStructure viewStructure, int i17) {
        android.widget.EditText editText;
        if (this.f126097f == null || (editText = this.f126096e) == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i17);
            return;
        }
        boolean z17 = this.f126110s;
        this.f126110s = false;
        java.lang.CharSequence hint = editText.getHint();
        this.f126096e.setHint(this.f126097f);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i17);
        } finally {
            this.f126096e.setHint(hint);
            this.f126110s = z17;
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
        android.graphics.drawable.GradientDrawable gradientDrawable = this.f126111t;
        if (gradientDrawable != null) {
            gradientDrawable.draw(canvas);
        }
        super.draw(canvas);
        if (this.f126108q) {
            this.f126122z1.d(canvas);
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
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n(n3.x0.c(this) && isEnabled(), false);
        l();
        p();
        q();
        fa.f fVar = this.f126122z1;
        if (fVar != null ? fVar.o(drawableState) | false : false) {
            invalidate();
        }
        this.C1 = false;
    }

    public final boolean e() {
        return this.f126108q && !android.text.TextUtils.isEmpty(this.f126109r) && (this.f126111t instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.a);
    }

    public final void f() {
        int i17 = this.f126114w;
        if (i17 == 0) {
            this.f126111t = null;
        } else if (i17 == 2 && this.f126108q && !(this.f126111t instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.a)) {
            this.f126111t = new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.a();
        } else if (!(this.f126111t instanceof android.graphics.drawable.GradientDrawable)) {
            this.f126111t = new android.graphics.drawable.GradientDrawable();
        }
        if (this.f126114w != 0) {
            m();
        }
        p();
    }

    public final void g() {
        float measureText;
        float f17;
        float f18;
        if (e()) {
            android.graphics.RectF rectF = this.f126094J;
            fa.f fVar = this.f126122z1;
            boolean b17 = fVar.b(fVar.f342150v);
            float f19 = 0.0f;
            android.text.TextPaint textPaint = fVar.E;
            android.graphics.Rect rect = fVar.f342133e;
            if (b17) {
                float f27 = rect.right;
                if (fVar.f342150v == null) {
                    measureText = 0.0f;
                } else {
                    textPaint.setTextSize(fVar.f342138j);
                    textPaint.setTypeface(fVar.f342147s);
                    java.lang.CharSequence charSequence = fVar.f342150v;
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
                if (fVar.f342150v != null) {
                    textPaint.setTextSize(fVar.f342138j);
                    textPaint.setTypeface(fVar.f342147s);
                    java.lang.CharSequence charSequence2 = fVar.f342150v;
                    f19 = textPaint.measureText(charSequence2, 0, charSequence2.length());
                }
                f18 = f17 + f19;
            }
            rectF.right = f18;
            float f28 = rect.top;
            textPaint.setTextSize(fVar.f342138j);
            textPaint.setTypeface(fVar.f342147s);
            float f29 = f28 + (-textPaint.ascent());
            float f37 = rectF.left;
            float f38 = this.f126113v;
            rectF.left = f37 - f38;
            rectF.top -= f38;
            rectF.right += f38;
            rectF.bottom = f29 + f38;
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.a aVar = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.a) this.f126111t;
            aVar.getClass();
            aVar.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    /* renamed from: getBoxBackgroundColor */
    public int m20389x1a86e380() {
        return this.G;
    }

    /* renamed from: getBoxCornerRadiusBottomEnd */
    public float m20390x734dab94() {
        return this.A;
    }

    /* renamed from: getBoxCornerRadiusBottomStart */
    public float m20391xd7591cdb() {
        return this.B;
    }

    /* renamed from: getBoxCornerRadiusTopEnd */
    public float m20392x747cb4e2() {
        return this.f126121z;
    }

    /* renamed from: getBoxCornerRadiusTopStart */
    public float m20393x48eb0aa9() {
        return this.f126118y;
    }

    /* renamed from: getBoxStrokeColor */
    public int m20394x4095e636() {
        return this.f126107p1;
    }

    /* renamed from: getCounterMaxLength */
    public int m20395xdbc25e44() {
        return this.f126100i;
    }

    /* renamed from: getCounterOverflowDescription */
    public java.lang.CharSequence m20396xf2ffa6f4() {
        android.widget.TextView textView;
        if (this.f126099h && this.f126102m && (textView = this.f126103n) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    /* renamed from: getDefaultHintTextColor */
    public android.content.res.ColorStateList m20397xa8c3df24() {
        return this.f126106p0;
    }

    /* renamed from: getEditText */
    public android.widget.EditText m20398xdb574fcd() {
        return this.f126096e;
    }

    /* renamed from: getError */
    public java.lang.CharSequence m20399x74627852() {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.c cVar = this.f126098g;
        if (cVar.f126144l) {
            return cVar.f126143k;
        }
        return null;
    }

    /* renamed from: getErrorCurrentTextColors */
    public int m20400x6a73a524() {
        android.widget.TextView textView = this.f126098g.f126145m;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* renamed from: getErrorTextCurrentColor */
    public final int m20401xb16b1ba9() {
        android.widget.TextView textView = this.f126098g.f126145m;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* renamed from: getHelperText */
    public java.lang.CharSequence m20402x5596f9f1() {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.c cVar = this.f126098g;
        if (cVar.f126148p) {
            return cVar.f126147o;
        }
        return null;
    }

    /* renamed from: getHelperTextCurrentTextColor */
    public int m20403x64afe4ce() {
        android.widget.TextView textView = this.f126098g.f126149q;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* renamed from: getHint */
    public java.lang.CharSequence m20404xfb8046fd() {
        if (this.f126108q) {
            return this.f126109r;
        }
        return null;
    }

    /* renamed from: getHintCollapsedTextHeight */
    public final float m20405xc624782e() {
        fa.f fVar = this.f126122z1;
        android.text.TextPaint textPaint = fVar.E;
        textPaint.setTextSize(fVar.f342138j);
        textPaint.setTypeface(fVar.f342147s);
        return -textPaint.ascent();
    }

    /* renamed from: getHintCurrentCollapsedTextColor */
    public final int m20406xe1281a7b() {
        return this.f126122z1.e();
    }

    /* renamed from: getPasswordVisibilityToggleContentDescription */
    public java.lang.CharSequence m20407x4c6b8d5a() {
        return this.N;
    }

    /* renamed from: getPasswordVisibilityToggleDrawable */
    public android.graphics.drawable.Drawable m20408x6e5facf5() {
        return this.M;
    }

    /* renamed from: getTypeface */
    public android.graphics.Typeface m20409x5392760d() {
        return this.K;
    }

    public void h(boolean z17) {
        if (this.L) {
            int selectionEnd = this.f126096e.getSelectionEnd();
            android.widget.EditText editText = this.f126096e;
            if (editText != null && (editText.getTransformationMethod() instanceof android.text.method.PasswordTransformationMethod)) {
                this.f126096e.setTransformationMethod(null);
                this.Q = true;
            } else {
                this.f126096e.setTransformationMethod(android.text.method.PasswordTransformationMethod.getInstance());
                this.Q = false;
            }
            this.P.setChecked(this.Q);
            if (z17) {
                this.P.jumpDrawablesToCurrentState();
            }
            this.f126096e.setSelection(selectionEnd);
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
            textView.setTextAppearance(com.p314xaae8f345.mm.R.C30868x68b1db1.f576100qe);
            textView.setTextColor(b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560408jl));
        }
    }

    public void k(int i17) {
        boolean z17 = this.f126102m;
        if (this.f126100i == -1) {
            this.f126103n.setText(java.lang.String.valueOf(i17));
            this.f126103n.setContentDescription(null);
            this.f126102m = false;
        } else {
            android.widget.TextView textView = this.f126103n;
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            if (n3.x0.a(textView) == 1) {
                n3.x0.f(this.f126103n, 0);
            }
            boolean z18 = i17 > this.f126100i;
            this.f126102m = z18;
            if (z17 != z18) {
                j(this.f126103n, z18 ? this.f126104o : this.f126105p);
                if (this.f126102m) {
                    n3.x0.f(this.f126103n, 1);
                }
            }
            this.f126103n.setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ax8, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f126100i)));
            this.f126103n.setContentDescription(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ax7, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f126100i)));
        }
        if (this.f126096e == null || z17 == this.f126102m) {
            return;
        }
        n(false, false);
        q();
        l();
    }

    public void l() {
        android.graphics.drawable.Drawable background;
        android.widget.TextView textView;
        android.widget.EditText editText = this.f126096e;
        if (editText == null || (background = editText.getBackground()) == null) {
            return;
        }
        if (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.y0.a(background)) {
            background = background.mutate();
        }
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.c cVar = this.f126098g;
        if (cVar.e()) {
            android.widget.TextView textView2 = cVar.f126145m;
            background.setColorFilter(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h0.j(textView2 != null ? textView2.getCurrentTextColor() : -1, android.graphics.PorterDuff.Mode.SRC_IN));
        } else if (this.f126102m && (textView = this.f126103n) != null) {
            background.setColorFilter(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h0.j(textView.getCurrentTextColor(), android.graphics.PorterDuff.Mode.SRC_IN));
        } else {
            background.clearColorFilter();
            this.f126096e.refreshDrawableState();
        }
    }

    public final void m() {
        android.widget.FrameLayout frameLayout = this.f126095d;
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
        android.widget.EditText editText = this.f126096e;
        boolean z19 = (editText == null || android.text.TextUtils.isEmpty(editText.getText())) ? false : true;
        android.widget.EditText editText2 = this.f126096e;
        boolean z27 = editText2 != null && editText2.hasFocus();
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.c cVar = this.f126098g;
        boolean e17 = cVar.e();
        android.content.res.ColorStateList colorStateList2 = this.f126106p0;
        fa.f fVar = this.f126122z1;
        if (colorStateList2 != null) {
            fVar.k(colorStateList2);
            android.content.res.ColorStateList colorStateList3 = this.f126106p0;
            if (fVar.f342139k != colorStateList3) {
                fVar.f342139k = colorStateList3;
                fVar.i();
            }
        }
        if (!isEnabled) {
            int i17 = this.f126117x1;
            fVar.k(android.content.res.ColorStateList.valueOf(i17));
            android.content.res.ColorStateList valueOf = android.content.res.ColorStateList.valueOf(i17);
            if (fVar.f342139k != valueOf) {
                fVar.f342139k = valueOf;
                fVar.i();
            }
        } else if (e17) {
            android.widget.TextView textView2 = cVar.f126145m;
            fVar.k(textView2 != null ? textView2.getTextColors() : null);
        } else if (this.f126102m && (textView = this.f126103n) != null) {
            fVar.k(textView.getTextColors());
        } else if (z27 && (colorStateList = this.f126116x0) != null) {
            fVar.k(colorStateList);
        }
        if (z19 || (isEnabled() && (z27 || e17))) {
            if (z18 || this.f126120y1) {
                android.animation.ValueAnimator valueAnimator = this.B1;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.B1.cancel();
                }
                if (z17 && this.A1) {
                    a(1.0f);
                } else {
                    fVar.m(1.0f);
                }
                this.f126120y1 = false;
                if (e()) {
                    g();
                    return;
                }
                return;
            }
            return;
        }
        if (z18 || !this.f126120y1) {
            android.animation.ValueAnimator valueAnimator2 = this.B1;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.B1.cancel();
            }
            if (z17 && this.A1) {
                a(0.0f);
            } else {
                fVar.m(0.0f);
            }
            if (e() && (!((com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.a) this.f126111t).f126126b.isEmpty()) && e()) {
                ((com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.a) this.f126111t).a(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f126120y1 = true;
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
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.C2720x269bcc07.o():void");
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        android.widget.EditText editText;
        super.onLayout(z17, i17, i18, i19, i27);
        if (this.f126111t != null) {
            p();
        }
        if (!this.f126108q || (editText = this.f126096e) == null) {
            return;
        }
        android.graphics.Rect rect = this.I;
        fa.g.a(this, editText, rect);
        int compoundPaddingLeft = rect.left + this.f126096e.getCompoundPaddingLeft();
        int compoundPaddingRight = rect.right - this.f126096e.getCompoundPaddingRight();
        int i28 = this.f126114w;
        int paddingTop = i28 != 1 ? i28 != 2 ? getPaddingTop() : m20385x542ce9a3().getBounds().top - d() : m20385x542ce9a3().getBounds().top + this.f126115x;
        int compoundPaddingTop = rect.top + this.f126096e.getCompoundPaddingTop();
        int compoundPaddingBottom = rect.bottom - this.f126096e.getCompoundPaddingBottom();
        fa.f fVar = this.f126122z1;
        android.graphics.Rect rect2 = fVar.f342132d;
        boolean z18 = false;
        if (!(rect2.left == compoundPaddingLeft && rect2.top == compoundPaddingTop && rect2.right == compoundPaddingRight && rect2.bottom == compoundPaddingBottom)) {
            rect2.set(compoundPaddingLeft, compoundPaddingTop, compoundPaddingRight, compoundPaddingBottom);
            fVar.C = true;
            fVar.g();
        }
        int paddingBottom = (i27 - i18) - getPaddingBottom();
        android.graphics.Rect rect3 = fVar.f342133e;
        if (rect3.left == compoundPaddingLeft && rect3.top == paddingTop && rect3.right == compoundPaddingRight && rect3.bottom == paddingBottom) {
            z18 = true;
        }
        if (!z18) {
            rect3.set(compoundPaddingLeft, paddingTop, compoundPaddingRight, paddingBottom);
            fVar.C = true;
            fVar.g();
        }
        fVar.i();
        if (!e() || this.f126120y1) {
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
        if (!(parcelable instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.C2720x269bcc07.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.C2720x269bcc07.SavedState savedState = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.C2720x269bcc07.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f92645d);
        m20417x52f092c6(savedState.f126123f);
        if (savedState.f126124g) {
            h(true);
        }
        requestLayout();
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.C2720x269bcc07.SavedState savedState = new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.C2720x269bcc07.SavedState(super.onSaveInstanceState());
        if (this.f126098g.e()) {
            savedState.f126123f = m20399x74627852();
        }
        savedState.f126124g = this.Q;
        return savedState;
    }

    public final void p() {
        android.graphics.drawable.Drawable background;
        if (this.f126114w == 0 || this.f126111t == null || this.f126096e == null || getRight() == 0) {
            return;
        }
        int left = this.f126096e.getLeft();
        android.widget.EditText editText = this.f126096e;
        int i17 = 0;
        if (editText != null) {
            int i18 = this.f126114w;
            if (i18 == 1) {
                i17 = editText.getTop();
            } else if (i18 == 2) {
                i17 = d() + editText.getTop();
            }
        }
        int right = this.f126096e.getRight();
        int bottom = this.f126096e.getBottom() + this.f126112u;
        if (this.f126114w == 2) {
            int i19 = this.E;
            left += i19 / 2;
            i17 -= i19 / 2;
            right -= i19 / 2;
            bottom += i19 / 2;
        }
        this.f126111t.setBounds(left, i17, right, bottom);
        b();
        android.widget.EditText editText2 = this.f126096e;
        if (editText2 == null || (background = editText2.getBackground()) == null) {
            return;
        }
        if (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.y0.a(background)) {
            background = background.mutate();
        }
        fa.g.a(this, this.f126096e, new android.graphics.Rect());
        android.graphics.Rect bounds = background.getBounds();
        if (bounds.left != bounds.right) {
            android.graphics.Rect rect = new android.graphics.Rect();
            background.getPadding(rect);
            background.setBounds(bounds.left - rect.left, bounds.top, bounds.right + (rect.right * 2), this.f126096e.getBottom());
        }
    }

    public void q() {
        android.widget.TextView textView;
        if (this.f126111t == null || this.f126114w == 0) {
            return;
        }
        android.widget.EditText editText = this.f126096e;
        boolean z17 = editText != null && editText.hasFocus();
        android.widget.EditText editText2 = this.f126096e;
        boolean z18 = editText2 != null && editText2.isHovered();
        if (this.f126114w == 2) {
            if (isEnabled()) {
                com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.c cVar = this.f126098g;
                if (cVar.e()) {
                    android.widget.TextView textView2 = cVar.f126145m;
                    this.F = textView2 != null ? textView2.getCurrentTextColor() : -1;
                } else if (this.f126102m && (textView = this.f126103n) != null) {
                    this.F = textView.getCurrentTextColor();
                } else if (z17) {
                    this.F = this.f126107p1;
                } else if (z18) {
                    this.F = this.f126101l1;
                } else {
                    this.F = this.f126119y0;
                }
            } else {
                this.F = this.f126117x1;
            }
            if ((z18 || z17) && isEnabled()) {
                this.C = this.E;
            } else {
                this.C = this.D;
            }
            b();
        }
    }

    /* renamed from: setBoxBackgroundColor */
    public void m20410xb1b2658c(int i17) {
        if (this.G != i17) {
            this.G = i17;
            b();
        }
    }

    /* renamed from: setBoxBackgroundColorResource */
    public void m20411xe47041ba(int i17) {
        m20410xb1b2658c(b3.l.m9702x7444d5ad(getContext(), i17));
    }

    /* renamed from: setBoxBackgroundMode */
    public void m20412x16441a5a(int i17) {
        if (i17 == this.f126114w) {
            return;
        }
        this.f126114w = i17;
        f();
    }

    /* renamed from: setBoxStrokeColor */
    public void m20413x88c4e42(int i17) {
        if (this.f126107p1 != i17) {
            this.f126107p1 = i17;
            q();
        }
    }

    /* renamed from: setCounterEnabled */
    public void m20414x6e6d8ea7(boolean z17) {
        if (this.f126099h != z17) {
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.c cVar = this.f126098g;
            if (z17) {
                p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375 c0092xf45d4375 = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375(getContext(), null);
                this.f126103n = c0092xf45d4375;
                c0092xf45d4375.setId(com.p314xaae8f345.mm.R.id.o5i);
                android.graphics.Typeface typeface = this.K;
                if (typeface != null) {
                    this.f126103n.setTypeface(typeface);
                }
                this.f126103n.setMaxLines(1);
                j(this.f126103n, this.f126105p);
                cVar.a(this.f126103n, 2);
                android.widget.EditText editText = this.f126096e;
                if (editText == null) {
                    k(0);
                } else {
                    k(editText.getText().length());
                }
            } else {
                cVar.h(this.f126103n, 2);
                this.f126103n = null;
            }
            this.f126099h = z17;
        }
    }

    /* renamed from: setCounterMaxLength */
    public void m20415x7fbef350(int i17) {
        if (this.f126100i != i17) {
            if (i17 > 0) {
                this.f126100i = i17;
            } else {
                this.f126100i = -1;
            }
            if (this.f126099h) {
                android.widget.EditText editText = this.f126096e;
                k(editText == null ? 0 : editText.getText().length());
            }
        }
    }

    /* renamed from: setDefaultHintTextColor */
    public void m20416x23170e30(android.content.res.ColorStateList colorStateList) {
        this.f126106p0 = colorStateList;
        this.f126116x0 = colorStateList;
        if (this.f126096e != null) {
            n(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z17) {
        i(this, z17);
        super.setEnabled(z17);
    }

    /* renamed from: setError */
    public void m20417x52f092c6(java.lang.CharSequence charSequence) {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.c cVar = this.f126098g;
        if (!cVar.f126144l) {
            if (android.text.TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                m20418x4618059b(true);
            }
        }
        if (android.text.TextUtils.isEmpty(charSequence)) {
            cVar.g();
            return;
        }
        cVar.c();
        cVar.f126143k = charSequence;
        cVar.f126145m.setText(charSequence);
        int i17 = cVar.f126141i;
        if (i17 != 1) {
            cVar.f126142j = 1;
        }
        cVar.j(i17, cVar.f126142j, cVar.i(cVar.f126145m, charSequence));
    }

    /* renamed from: setErrorEnabled */
    public void m20418x4618059b(boolean z17) {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.c cVar = this.f126098g;
        if (cVar.f126144l == z17) {
            return;
        }
        cVar.c();
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.C2720x269bcc07 c2720x269bcc07 = cVar.f126134b;
        if (z17) {
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375 c0092xf45d4375 = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375(cVar.f126133a, null);
            cVar.f126145m = c0092xf45d4375;
            c0092xf45d4375.setId(com.p314xaae8f345.mm.R.id.o5j);
            android.graphics.Typeface typeface = cVar.f126151s;
            if (typeface != null) {
                cVar.f126145m.setTypeface(typeface);
            }
            int i17 = cVar.f126146n;
            cVar.f126146n = i17;
            android.widget.TextView textView = cVar.f126145m;
            if (textView != null) {
                c2720x269bcc07.j(textView, i17);
            }
            cVar.f126145m.setVisibility(4);
            android.widget.TextView textView2 = cVar.f126145m;
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.x0.f(textView2, 1);
            cVar.a(cVar.f126145m, 0);
        } else {
            cVar.g();
            cVar.h(cVar.f126145m, 0);
            cVar.f126145m = null;
            c2720x269bcc07.l();
            c2720x269bcc07.q();
        }
        cVar.f126144l = z17;
    }

    /* renamed from: setErrorTextAppearance */
    public void m20419x3c8515d7(int i17) {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.c cVar = this.f126098g;
        cVar.f126146n = i17;
        android.widget.TextView textView = cVar.f126145m;
        if (textView != null) {
            cVar.f126134b.j(textView, i17);
        }
    }

    /* renamed from: setErrorTextColor */
    public void m20420x66e7a10(android.content.res.ColorStateList colorStateList) {
        android.widget.TextView textView = this.f126098g.f126145m;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* renamed from: setHelperText */
    public void m20421x83bb47fd(java.lang.CharSequence charSequence) {
        boolean isEmpty = android.text.TextUtils.isEmpty(charSequence);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.c cVar = this.f126098g;
        if (isEmpty) {
            if (cVar.f126148p) {
                m20423x4285484(false);
                return;
            }
            return;
        }
        if (!cVar.f126148p) {
            m20423x4285484(true);
        }
        cVar.c();
        cVar.f126147o = charSequence;
        cVar.f126149q.setText(charSequence);
        int i17 = cVar.f126141i;
        if (i17 != 2) {
            cVar.f126142j = 2;
        }
        cVar.j(i17, cVar.f126142j, cVar.i(cVar.f126149q, charSequence));
    }

    /* renamed from: setHelperTextColor */
    public void m20422x74d76d66(android.content.res.ColorStateList colorStateList) {
        android.widget.TextView textView = this.f126098g.f126149q;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* renamed from: setHelperTextEnabled */
    public void m20423x4285484(boolean z17) {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.c cVar = this.f126098g;
        if (cVar.f126148p == z17) {
            return;
        }
        cVar.c();
        if (z17) {
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375 c0092xf45d4375 = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375(cVar.f126133a, null);
            cVar.f126149q = c0092xf45d4375;
            c0092xf45d4375.setId(com.p314xaae8f345.mm.R.id.o5k);
            android.graphics.Typeface typeface = cVar.f126151s;
            if (typeface != null) {
                cVar.f126149q.setTypeface(typeface);
            }
            cVar.f126149q.setVisibility(4);
            android.widget.TextView textView = cVar.f126149q;
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.x0.f(textView, 1);
            int i17 = cVar.f126150r;
            cVar.f126150r = i17;
            android.widget.TextView textView2 = cVar.f126149q;
            if (textView2 != null) {
                textView2.setTextAppearance(i17);
            }
            cVar.a(cVar.f126149q, 1);
        } else {
            cVar.c();
            int i18 = cVar.f126141i;
            if (i18 == 2) {
                cVar.f126142j = 0;
            }
            cVar.j(i18, cVar.f126142j, cVar.i(cVar.f126149q, null));
            cVar.h(cVar.f126149q, 1);
            cVar.f126149q = null;
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.C2720x269bcc07 c2720x269bcc07 = cVar.f126134b;
            c2720x269bcc07.l();
            c2720x269bcc07.q();
        }
        cVar.f126148p = z17;
    }

    /* renamed from: setHelperTextTextAppearance */
    public void m20424xb412dece(int i17) {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.c cVar = this.f126098g;
        cVar.f126150r = i17;
        android.widget.TextView textView = cVar.f126149q;
        if (textView != null) {
            textView.setTextAppearance(i17);
        }
    }

    /* renamed from: setHint */
    public void m20425x764b0e09(java.lang.CharSequence charSequence) {
        if (this.f126108q) {
            m20388x159f1fe6(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    /* renamed from: setHintAnimationEnabled */
    public void m20426x383feb46(boolean z17) {
        this.A1 = z17;
    }

    /* renamed from: setHintEnabled */
    public void m20427xe9fbe8f8(boolean z17) {
        if (z17 != this.f126108q) {
            this.f126108q = z17;
            if (z17) {
                java.lang.CharSequence hint = this.f126096e.getHint();
                if (!android.text.TextUtils.isEmpty(hint)) {
                    if (android.text.TextUtils.isEmpty(this.f126109r)) {
                        m20425x764b0e09(hint);
                    }
                    this.f126096e.setHint((java.lang.CharSequence) null);
                }
                this.f126110s = true;
            } else {
                this.f126110s = false;
                if (!android.text.TextUtils.isEmpty(this.f126109r) && android.text.TextUtils.isEmpty(this.f126096e.getHint())) {
                    this.f126096e.setHint(this.f126109r);
                }
                m20388x159f1fe6(null);
            }
            if (this.f126096e != null) {
                m();
            }
        }
    }

    /* renamed from: setHintTextAppearance */
    public void m20428x6ad91fda(int i17) {
        fa.f fVar = this.f126122z1;
        fVar.j(i17);
        this.f126116x0 = fVar.f342140l;
        if (this.f126096e != null) {
            n(false, false);
            m();
        }
    }

    /* renamed from: setPasswordVisibilityToggleContentDescription */
    public void m20429x8bf4ab66(int i17) {
        m20430x8bf4ab66(i17 != 0 ? getResources().getText(i17) : null);
    }

    /* renamed from: setPasswordVisibilityToggleDrawable */
    public void m20431x4088aa01(int i17) {
        m20432x4088aa01(i17 != 0 ? k.a.a(getContext(), i17) : null);
    }

    /* renamed from: setPasswordVisibilityToggleEnabled */
    public void m20433x9337297e(boolean z17) {
        android.widget.EditText editText;
        if (this.L != z17) {
            this.L = z17;
            if (!z17 && this.Q && (editText = this.f126096e) != null) {
                editText.setTransformationMethod(android.text.method.PasswordTransformationMethod.getInstance());
            }
            this.Q = false;
            o();
        }
    }

    /* renamed from: setPasswordVisibilityToggleTintList */
    public void m20434xf87eab9c(android.content.res.ColorStateList colorStateList) {
        this.T = colorStateList;
        this.U = true;
        c();
    }

    /* renamed from: setPasswordVisibilityToggleTintMode */
    public void m20435xf87f34a1(android.graphics.PorterDuff.Mode mode) {
        this.V = mode;
        this.W = true;
        c();
    }

    /* renamed from: setTextInputAccessibilityDelegate */
    public void m20436x6c63f358(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.g gVar) {
        android.widget.EditText editText = this.f126096e;
        if (editText != null) {
            n3.l1.l(editText, gVar);
        }
    }

    /* renamed from: setTypeface */
    public void m20437x4e4ad719(android.graphics.Typeface typeface) {
        if (typeface != this.K) {
            this.K = typeface;
            fa.f fVar = this.f126122z1;
            fVar.f342148t = typeface;
            fVar.f342147s = typeface;
            fVar.i();
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.c cVar = this.f126098g;
            if (typeface != cVar.f126151s) {
                cVar.f126151s = typeface;
                android.widget.TextView textView = cVar.f126145m;
                if (textView != null) {
                    textView.setTypeface(typeface);
                }
                android.widget.TextView textView2 = cVar.f126149q;
                if (textView2 != null) {
                    textView2.setTypeface(typeface);
                }
            }
            android.widget.TextView textView3 = this.f126103n;
            if (textView3 != null) {
                textView3.setTypeface(typeface);
            }
        }
    }

    public C2720x269bcc07(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f126098g = new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.c(this);
        this.I = new android.graphics.Rect();
        this.f126094J = new android.graphics.RectF();
        fa.f fVar = new fa.f(this);
        this.f126122z1 = fVar;
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        this.f126095d = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        addView(frameLayout);
        android.animation.TimeInterpolator timeInterpolator = w9.a.f525567a;
        fVar.G = timeInterpolator;
        fVar.i();
        fVar.F = timeInterpolator;
        fVar.i();
        if (fVar.f342136h != 8388659) {
            fVar.f342136h = 8388659;
            fVar.i();
        }
        int[] iArr = v9.a.f515666w;
        fa.d0.a(context, attributeSet, i17, com.p314xaae8f345.mm.R.C30868x68b1db1.f576284v9);
        fa.d0.b(context, attributeSet, iArr, i17, com.p314xaae8f345.mm.R.C30868x68b1db1.f576284v9, new int[0]);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i17, com.p314xaae8f345.mm.R.C30868x68b1db1.f576284v9);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q2 q2Var = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q2(context, obtainStyledAttributes);
        this.f126108q = q2Var.a(21, true);
        m20425x764b0e09(q2Var.j(1));
        this.A1 = q2Var.a(20, true);
        this.f126112u = context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.a6p);
        this.f126113v = context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.a6q);
        this.f126115x = q2Var.c(4, 0);
        this.f126118y = obtainStyledAttributes.getDimension(8, 0.0f);
        this.f126121z = obtainStyledAttributes.getDimension(7, 0.0f);
        this.A = obtainStyledAttributes.getDimension(5, 0.0f);
        this.B = obtainStyledAttributes.getDimension(6, 0.0f);
        this.G = obtainStyledAttributes.getColor(2, 0);
        this.f126107p1 = obtainStyledAttributes.getColor(9, 0);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a6r);
        this.D = dimensionPixelSize;
        this.E = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a6s);
        this.C = dimensionPixelSize;
        m20412x16441a5a(q2Var.h(3, 0));
        if (q2Var.k(0)) {
            android.content.res.ColorStateList b17 = q2Var.b(0);
            this.f126116x0 = b17;
            this.f126106p0 = b17;
        }
        this.f126119y0 = b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560973zb);
        this.f126117x1 = b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560974zc);
        this.f126101l1 = b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560975zd);
        if (q2Var.i(22, -1) != -1) {
            m20428x6ad91fda(q2Var.i(22, 0));
        }
        int i18 = q2Var.i(16, 0);
        boolean a17 = q2Var.a(15, false);
        int i19 = q2Var.i(19, 0);
        boolean a18 = q2Var.a(18, false);
        java.lang.CharSequence j17 = q2Var.j(17);
        boolean a19 = q2Var.a(11, false);
        m20415x7fbef350(q2Var.h(12, -1));
        this.f126105p = q2Var.i(14, 0);
        this.f126104o = q2Var.i(13, 0);
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
        m20423x4285484(a18);
        m20421x83bb47fd(j17);
        m20424xb412dece(i19);
        m20418x4618059b(a17);
        m20419x3c8515d7(i18);
        m20414x6e6d8ea7(a19);
        c();
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.u0.s(this, 2);
    }

    /* renamed from: setPasswordVisibilityToggleContentDescription */
    public void m20430x8bf4ab66(java.lang.CharSequence charSequence) {
        this.N = charSequence;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p257x21ffc6bd.C2704x2750c0cb c2704x2750c0cb = this.P;
        if (c2704x2750c0cb != null) {
            c2704x2750c0cb.setContentDescription(charSequence);
        }
    }

    /* renamed from: setPasswordVisibilityToggleDrawable */
    public void m20432x4088aa01(android.graphics.drawable.Drawable drawable) {
        this.M = drawable;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p257x21ffc6bd.C2704x2750c0cb c2704x2750c0cb = this.P;
        if (c2704x2750c0cb != null) {
            c2704x2750c0cb.setImageDrawable(drawable);
        }
    }
}

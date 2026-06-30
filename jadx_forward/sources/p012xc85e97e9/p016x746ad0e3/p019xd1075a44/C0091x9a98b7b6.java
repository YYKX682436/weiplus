package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* renamed from: androidx.appcompat.widget.AppCompatSpinner */
/* loaded from: classes15.dex */
public class C0091x9a98b7b6 extends android.widget.Spinner {

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f90911o = {android.R.attr.spinnerMode};

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0 f90912d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f90913e;

    /* renamed from: f, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.p019xd1075a44.f1 f90914f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.SpinnerAdapter f90915g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f90916h;

    /* renamed from: i, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.p019xd1075a44.r0 f90917i;

    /* renamed from: m, reason: collision with root package name */
    public int f90918m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.Rect f90919n;

    public C0091x9a98b7b6(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559937ix);
    }

    public int a(android.widget.SpinnerAdapter spinnerAdapter, android.graphics.drawable.Drawable drawable) {
        int i17 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = java.lang.Math.max(0, getSelectedItemPosition());
        int min = java.lang.Math.min(spinnerAdapter.getCount(), max + 15);
        android.view.View view = null;
        int i18 = 0;
        for (int max2 = java.lang.Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i17) {
                view = null;
                i17 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i18 = java.lang.Math.max(i18, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i18;
        }
        android.graphics.Rect rect = this.f90919n;
        drawable.getPadding(rect);
        return i18 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0 d0Var = this.f90912d;
        if (d0Var != null) {
            d0Var.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.r0 r0Var = this.f90917i;
        return r0Var != null ? r0Var.f90955i : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.r0 r0Var = this.f90917i;
        if (r0Var == null) {
            return super.getDropDownVerticalOffset();
        }
        if (r0Var.f90958o) {
            return r0Var.f90956m;
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f90917i != null ? this.f90918m : super.getDropDownWidth();
    }

    @Override // android.widget.Spinner
    public android.graphics.drawable.Drawable getPopupBackground() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.r0 r0Var = this.f90917i;
        return r0Var != null ? r0Var.E.getBackground() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public android.content.Context getPopupContext() {
        return this.f90917i != null ? this.f90913e : super.getPopupContext();
    }

    @Override // android.widget.Spinner
    public java.lang.CharSequence getPrompt() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.r0 r0Var = this.f90917i;
        return r0Var != null ? r0Var.I : super.getPrompt();
    }

    /* renamed from: getSupportBackgroundTintList */
    public android.content.res.ColorStateList m2688x6bcb5100() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0 d0Var = this.f90912d;
        if (d0Var != null) {
            return d0Var.b();
        }
        return null;
    }

    /* renamed from: getSupportBackgroundTintMode */
    public android.graphics.PorterDuff.Mode m2689x6bcbda05() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0 d0Var = this.f90912d;
        if (d0Var != null) {
            return d0Var.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.r0 r0Var = this.f90917i;
        if (r0Var == null || !r0Var.mo2734x58a9c73b()) {
            return;
        }
        r0Var.mo2732x63a3b28a();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        if (this.f90917i == null || android.view.View.MeasureSpec.getMode(i17) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(java.lang.Math.min(java.lang.Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), android.view.View.MeasureSpec.getSize(i17)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.f1 f1Var = this.f90914f;
        if (f1Var == null || !f1Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.r0 r0Var = this.f90917i;
        if (r0Var == null) {
            return super.performClick();
        }
        if (r0Var.mo2734x58a9c73b()) {
            return true;
        }
        r0Var.mo2735x35dafd();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0 d0Var = this.f90912d;
        if (d0Var != null) {
            d0Var.e(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i17) {
        super.setBackgroundResource(i17);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0 d0Var = this.f90912d;
        if (d0Var != null) {
            d0Var.f(i17);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i17) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.r0 r0Var = this.f90917i;
        if (r0Var != null) {
            r0Var.f90955i = i17;
        } else {
            super.setDropDownHorizontalOffset(i17);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i17) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.r0 r0Var = this.f90917i;
        if (r0Var == null) {
            super.setDropDownVerticalOffset(i17);
        } else {
            r0Var.f90956m = i17;
            r0Var.f90958o = true;
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i17) {
        if (this.f90917i != null) {
            this.f90918m = i17;
        } else {
            super.setDropDownWidth(i17);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.r0 r0Var = this.f90917i;
        if (r0Var != null) {
            r0Var.E.setBackgroundDrawable(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i17) {
        setPopupBackgroundDrawable(k.a.a(getPopupContext(), i17));
    }

    @Override // android.widget.Spinner
    public void setPrompt(java.lang.CharSequence charSequence) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.r0 r0Var = this.f90917i;
        if (r0Var != null) {
            r0Var.I = charSequence;
        } else {
            super.setPrompt(charSequence);
        }
    }

    /* renamed from: setSupportBackgroundTintList */
    public void m2690xb597a974(android.content.res.ColorStateList colorStateList) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0 d0Var = this.f90912d;
        if (d0Var != null) {
            d0Var.h(colorStateList);
        }
    }

    /* renamed from: setSupportBackgroundTintMode */
    public void m2691xb5983279(android.graphics.PorterDuff.Mode mode) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0 d0Var = this.f90912d;
        if (d0Var != null) {
            d0Var.i(mode);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (r6 == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0091x9a98b7b6(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            r9.<init>(r10, r11, r12)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r9.f90919n = r0
            int[] r0 = j.a.f377728w
            r1 = 0
            android.content.res.TypedArray r2 = r10.obtainStyledAttributes(r11, r0, r12, r1)
            androidx.appcompat.widget.d0 r3 = new androidx.appcompat.widget.d0
            r3.<init>(r9)
            r9.f90912d = r3
            r3 = 4
            int r3 = r2.getResourceId(r3, r1)
            r4 = 0
            if (r3 == 0) goto L28
            n.d r5 = new n.d
            r5.<init>(r10, r3)
            r9.f90913e = r5
            goto L2a
        L28:
            r9.f90913e = r4
        L2a:
            android.content.Context r3 = r9.f90913e
            r5 = 1
            if (r3 == 0) goto L86
            r3 = -1
            int[] r6 = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0091x9a98b7b6.f90911o     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L4b
            android.content.res.TypedArray r6 = r10.obtainStyledAttributes(r11, r6, r12, r1)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L4b
            boolean r7 = r6.hasValue(r1)     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L4c
            if (r7 == 0) goto L4e
            int r3 = r6.getInt(r1, r1)     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L4c
            goto L4e
        L41:
            r10 = move-exception
            r4 = r6
            goto L45
        L44:
            r10 = move-exception
        L45:
            if (r4 == 0) goto L4a
            r4.recycle()
        L4a:
            throw r10
        L4b:
            r6 = r4
        L4c:
            if (r6 == 0) goto L51
        L4e:
            r6.recycle()
        L51:
            if (r3 != r5) goto L86
            androidx.appcompat.widget.r0 r3 = new androidx.appcompat.widget.r0
            android.content.Context r6 = r9.f90913e
            r3.<init>(r9, r6, r11, r12)
            android.content.Context r6 = r9.f90913e
            androidx.appcompat.widget.q2 r0 = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q2.l(r6, r11, r0, r12, r1)
            android.content.res.TypedArray r6 = r0.f91226b
            r7 = 3
            r8 = -2
            int r6 = r6.getLayoutDimension(r7, r8)
            r9.f90918m = r6
            android.graphics.drawable.Drawable r6 = r0.e(r5)
            android.widget.PopupWindow r7 = r3.E
            r7.setBackgroundDrawable(r6)
            r6 = 2
            java.lang.String r6 = r2.getString(r6)
            r3.I = r6
            r0.m()
            r9.f90917i = r3
            androidx.appcompat.widget.m0 r0 = new androidx.appcompat.widget.m0
            r0.<init>(r9, r9, r3)
            r9.f90914f = r0
        L86:
            java.lang.CharSequence[] r0 = r2.getTextArray(r1)
            if (r0 == 0) goto L9d
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r10, r3, r0)
            r10 = 2131500041(0x7f0c1c09, float:1.8623749E38)
            r1.setDropDownViewResource(r10)
            r9.setAdapter(r1)
        L9d:
            r2.recycle()
            r9.f90916h = r5
            android.widget.SpinnerAdapter r10 = r9.f90915g
            if (r10 == 0) goto Lab
            r9.setAdapter(r10)
            r9.f90915g = r4
        Lab:
            androidx.appcompat.widget.d0 r10 = r9.f90912d
            r10.d(r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0091x9a98b7b6.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.AdapterView
    public void setAdapter(android.widget.SpinnerAdapter spinnerAdapter) {
        if (!this.f90916h) {
            this.f90915g = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.r0 r0Var = this.f90917i;
        if (r0Var != null) {
            android.content.Context context = this.f90913e;
            if (context == null) {
                context = getContext();
            }
            r0Var.d(new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.n0(spinnerAdapter, context.getTheme()));
        }
    }
}

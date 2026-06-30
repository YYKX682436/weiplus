package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class AppCompatSpinner extends android.widget.Spinner {

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f9378o = {android.R.attr.spinnerMode};

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.widget.d0 f9379d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f9380e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.appcompat.widget.f1 f9381f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.SpinnerAdapter f9382g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f9383h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.appcompat.widget.r0 f9384i;

    /* renamed from: m, reason: collision with root package name */
    public int f9385m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.Rect f9386n;

    public AppCompatSpinner(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.tencent.mm.R.attr.f478404ix);
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
        android.graphics.Rect rect = this.f9386n;
        drawable.getPadding(rect);
        return i18 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.d0 d0Var = this.f9379d;
        if (d0Var != null) {
            d0Var.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        androidx.appcompat.widget.r0 r0Var = this.f9384i;
        return r0Var != null ? r0Var.f9422i : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        androidx.appcompat.widget.r0 r0Var = this.f9384i;
        if (r0Var == null) {
            return super.getDropDownVerticalOffset();
        }
        if (r0Var.f9425o) {
            return r0Var.f9423m;
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f9384i != null ? this.f9385m : super.getDropDownWidth();
    }

    @Override // android.widget.Spinner
    public android.graphics.drawable.Drawable getPopupBackground() {
        androidx.appcompat.widget.r0 r0Var = this.f9384i;
        return r0Var != null ? r0Var.E.getBackground() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public android.content.Context getPopupContext() {
        return this.f9384i != null ? this.f9380e : super.getPopupContext();
    }

    @Override // android.widget.Spinner
    public java.lang.CharSequence getPrompt() {
        androidx.appcompat.widget.r0 r0Var = this.f9384i;
        return r0Var != null ? r0Var.I : super.getPrompt();
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.d0 d0Var = this.f9379d;
        if (d0Var != null) {
            return d0Var.b();
        }
        return null;
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.d0 d0Var = this.f9379d;
        if (d0Var != null) {
            return d0Var.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.r0 r0Var = this.f9384i;
        if (r0Var == null || !r0Var.isShowing()) {
            return;
        }
        r0Var.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        if (this.f9384i == null || android.view.View.MeasureSpec.getMode(i17) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(java.lang.Math.min(java.lang.Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), android.view.View.MeasureSpec.getSize(i17)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        androidx.appcompat.widget.f1 f1Var = this.f9381f;
        if (f1Var == null || !f1Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        androidx.appcompat.widget.r0 r0Var = this.f9384i;
        if (r0Var == null) {
            return super.performClick();
        }
        if (r0Var.isShowing()) {
            return true;
        }
        r0Var.show();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.d0 d0Var = this.f9379d;
        if (d0Var != null) {
            d0Var.e(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i17) {
        super.setBackgroundResource(i17);
        androidx.appcompat.widget.d0 d0Var = this.f9379d;
        if (d0Var != null) {
            d0Var.f(i17);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i17) {
        androidx.appcompat.widget.r0 r0Var = this.f9384i;
        if (r0Var != null) {
            r0Var.f9422i = i17;
        } else {
            super.setDropDownHorizontalOffset(i17);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i17) {
        androidx.appcompat.widget.r0 r0Var = this.f9384i;
        if (r0Var == null) {
            super.setDropDownVerticalOffset(i17);
        } else {
            r0Var.f9423m = i17;
            r0Var.f9425o = true;
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i17) {
        if (this.f9384i != null) {
            this.f9385m = i17;
        } else {
            super.setDropDownWidth(i17);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        androidx.appcompat.widget.r0 r0Var = this.f9384i;
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
        androidx.appcompat.widget.r0 r0Var = this.f9384i;
        if (r0Var != null) {
            r0Var.I = charSequence;
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        androidx.appcompat.widget.d0 d0Var = this.f9379d;
        if (d0Var != null) {
            d0Var.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        androidx.appcompat.widget.d0 d0Var = this.f9379d;
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
    public AppCompatSpinner(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            r9.<init>(r10, r11, r12)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r9.f9386n = r0
            int[] r0 = j.a.f296195w
            r1 = 0
            android.content.res.TypedArray r2 = r10.obtainStyledAttributes(r11, r0, r12, r1)
            androidx.appcompat.widget.d0 r3 = new androidx.appcompat.widget.d0
            r3.<init>(r9)
            r9.f9379d = r3
            r3 = 4
            int r3 = r2.getResourceId(r3, r1)
            r4 = 0
            if (r3 == 0) goto L28
            n.d r5 = new n.d
            r5.<init>(r10, r3)
            r9.f9380e = r5
            goto L2a
        L28:
            r9.f9380e = r4
        L2a:
            android.content.Context r3 = r9.f9380e
            r5 = 1
            if (r3 == 0) goto L86
            r3 = -1
            int[] r6 = androidx.appcompat.widget.AppCompatSpinner.f9378o     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L4b
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
            android.content.Context r6 = r9.f9380e
            r3.<init>(r9, r6, r11, r12)
            android.content.Context r6 = r9.f9380e
            androidx.appcompat.widget.q2 r0 = androidx.appcompat.widget.q2.l(r6, r11, r0, r12, r1)
            android.content.res.TypedArray r6 = r0.f9693b
            r7 = 3
            r8 = -2
            int r6 = r6.getLayoutDimension(r7, r8)
            r9.f9385m = r6
            android.graphics.drawable.Drawable r6 = r0.e(r5)
            android.widget.PopupWindow r7 = r3.E
            r7.setBackgroundDrawable(r6)
            r6 = 2
            java.lang.String r6 = r2.getString(r6)
            r3.I = r6
            r0.m()
            r9.f9384i = r3
            androidx.appcompat.widget.m0 r0 = new androidx.appcompat.widget.m0
            r0.<init>(r9, r9, r3)
            r9.f9381f = r0
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
            r9.f9383h = r5
            android.widget.SpinnerAdapter r10 = r9.f9382g
            if (r10 == 0) goto Lab
            r9.setAdapter(r10)
            r9.f9382g = r4
        Lab:
            androidx.appcompat.widget.d0 r10 = r9.f9379d
            r10.d(r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.AdapterView
    public void setAdapter(android.widget.SpinnerAdapter spinnerAdapter) {
        if (!this.f9383h) {
            this.f9382g = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        androidx.appcompat.widget.r0 r0Var = this.f9384i;
        if (r0Var != null) {
            android.content.Context context = this.f9380e;
            if (context == null) {
                context = getContext();
            }
            r0Var.d(new androidx.appcompat.widget.n0(spinnerAdapter, context.getTheme()));
        }
    }
}

package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p250xade22732;

/* renamed from: com.google.android.material.button.MaterialButton */
/* loaded from: classes15.dex */
public class C2692x47948b59 extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0080x3ada79f5 {

    /* renamed from: f, reason: collision with root package name */
    public final z9.b f125988f;

    /* renamed from: g, reason: collision with root package name */
    public int f125989g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.PorterDuff.Mode f125990h;

    /* renamed from: i, reason: collision with root package name */
    public android.content.res.ColorStateList f125991i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.drawable.Drawable f125992m;

    /* renamed from: n, reason: collision with root package name */
    public int f125993n;

    /* renamed from: o, reason: collision with root package name */
    public int f125994o;

    /* renamed from: p, reason: collision with root package name */
    public int f125995p;

    public C2692x47948b59(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559877hb);
    }

    public final boolean a() {
        z9.b bVar = this.f125988f;
        return (bVar == null || bVar.f552381p) ? false : true;
    }

    public final void b() {
        android.graphics.drawable.Drawable drawable = this.f125992m;
        if (drawable != null) {
            android.graphics.drawable.Drawable mutate = drawable.mutate();
            this.f125992m = mutate;
            f3.b.h(mutate, this.f125991i);
            android.graphics.PorterDuff.Mode mode = this.f125990h;
            if (mode != null) {
                f3.b.i(this.f125992m, mode);
            }
            int i17 = this.f125993n;
            if (i17 == 0) {
                i17 = this.f125992m.getIntrinsicWidth();
            }
            int i18 = this.f125993n;
            if (i18 == 0) {
                i18 = this.f125992m.getIntrinsicHeight();
            }
            android.graphics.drawable.Drawable drawable2 = this.f125992m;
            int i19 = this.f125994o;
            drawable2.setBounds(i19, 0, i17 + i19, i18);
        }
        p012xc85e97e9.p075x2eaf9f.p079xd1075a44.u.e(this, this.f125992m, null, null, null);
    }

    @Override // android.view.View
    public android.content.res.ColorStateList getBackgroundTintList() {
        return mo2648x6bcb5100();
    }

    @Override // android.view.View
    public android.graphics.PorterDuff.Mode getBackgroundTintMode() {
        return mo2649x6bcbda05();
    }

    /* renamed from: getCornerRadius */
    public int m20103x83bb89bd() {
        if (a()) {
            return this.f125988f.f552371f;
        }
        return 0;
    }

    /* renamed from: getIcon */
    public android.graphics.drawable.Drawable m20104xfb80a4ef() {
        return this.f125992m;
    }

    /* renamed from: getIconGravity */
    public int m20105xc468ca5f() {
        return this.f125995p;
    }

    /* renamed from: getIconPadding */
    public int m20106x83a09422() {
        return this.f125989g;
    }

    /* renamed from: getIconSize */
    public int m20107x4fdde990() {
        return this.f125993n;
    }

    /* renamed from: getIconTint */
    public android.content.res.ColorStateList m20108x4fde5c8a() {
        return this.f125991i;
    }

    /* renamed from: getIconTintMode */
    public android.graphics.PorterDuff.Mode m20109x490db54d() {
        return this.f125990h;
    }

    /* renamed from: getRippleColor */
    public android.content.res.ColorStateList m20110xaba02ddd() {
        if (a()) {
            return this.f125988f.f552376k;
        }
        return null;
    }

    /* renamed from: getStrokeColor */
    public android.content.res.ColorStateList m20111x4b6e32d5() {
        if (a()) {
            return this.f125988f.f552375j;
        }
        return null;
    }

    /* renamed from: getStrokeWidth */
    public int m20112x4c853138() {
        if (a()) {
            return this.f125988f.f552372g;
        }
        return 0;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0080x3ada79f5
    /* renamed from: getSupportBackgroundTintList */
    public android.content.res.ColorStateList mo2648x6bcb5100() {
        return a() ? this.f125988f.f552374i : super.mo2648x6bcb5100();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0080x3ada79f5
    /* renamed from: getSupportBackgroundTintMode */
    public android.graphics.PorterDuff.Mode mo2649x6bcbda05() {
        return a() ? this.f125988f.f552373h : super.mo2649x6bcbda05();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0080x3ada79f5, android.widget.TextView, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        if (this.f125992m == null || this.f125995p != 2) {
            return;
        }
        int measureText = (int) getPaint().measureText(getText().toString());
        int i19 = this.f125993n;
        if (i19 == 0) {
            i19 = this.f125992m.getIntrinsicWidth();
        }
        int measuredWidth = getMeasuredWidth() - measureText;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        int e17 = ((((measuredWidth - n3.v0.e(this)) - i19) - this.f125989g) - n3.v0.f(this)) / 2;
        if (n3.v0.d(this) == 1) {
            e17 = -e17;
        }
        if (this.f125994o != e17) {
            this.f125994o = e17;
            b();
        }
    }

    @Override // android.view.View
    public void setBackground(android.graphics.drawable.Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i17) {
        if (!a()) {
            super.setBackgroundColor(i17);
            return;
        }
        android.graphics.drawable.GradientDrawable gradientDrawable = this.f125988f.f552378m;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(i17);
        }
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0080x3ada79f5, android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        if (!a()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        z9.b bVar = this.f125988f;
        bVar.f552381p = true;
        android.content.res.ColorStateList colorStateList = bVar.f552374i;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p250xade22732.C2692x47948b59 c2692x47948b59 = bVar.f552366a;
        c2692x47948b59.mo2651xb597a974(colorStateList);
        c2692x47948b59.mo2652xb5983279(bVar.f552373h);
        super.setBackgroundDrawable(drawable);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0080x3ada79f5, android.view.View
    public void setBackgroundResource(int i17) {
        setBackgroundDrawable(i17 != 0 ? k.a.a(getContext(), i17) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        mo2651xb597a974(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        mo2652xb5983279(mode);
    }

    /* renamed from: setCornerRadius */
    public void m20113xba0484c9(int i17) {
        if (a()) {
            z9.b bVar = this.f125988f;
            if (bVar.f552371f != i17) {
                bVar.f552371f = i17;
                android.graphics.drawable.GradientDrawable gradientDrawable = bVar.f552378m;
                if (gradientDrawable == null || bVar.f552379n == null || bVar.f552380o == null) {
                    return;
                }
                float f17 = i17 + 1.0E-5f;
                gradientDrawable.setCornerRadius(f17);
                bVar.f552379n.setCornerRadius(f17);
                bVar.f552380o.setCornerRadius(f17);
            }
        }
    }

    /* renamed from: setCornerRadiusResource */
    public void m20114x1881d3f7(int i17) {
        if (a()) {
            m20113xba0484c9(getResources().getDimensionPixelSize(i17));
        }
    }

    /* renamed from: setIcon */
    public void m20115x764b6bfb(android.graphics.drawable.Drawable drawable) {
        if (this.f125992m != drawable) {
            this.f125992m = drawable;
            b();
        }
    }

    /* renamed from: setIconGravity */
    public void m20116x5ace3dd3(int i17) {
        this.f125995p = i17;
    }

    /* renamed from: setIconPadding */
    public void m20117x1a060796(int i17) {
        if (this.f125989g != i17) {
            this.f125989g = i17;
            setCompoundDrawablePadding(i17);
        }
    }

    /* renamed from: setIconResource */
    public void m20118xe44f6929(int i17) {
        m20115x764b6bfb(i17 != 0 ? k.a.a(getContext(), i17) : null);
    }

    /* renamed from: setIconSize */
    public void m20119x4a964a9c(int i17) {
        if (i17 < 0) {
            throw new java.lang.IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f125993n != i17) {
            this.f125993n = i17;
            b();
        }
    }

    /* renamed from: setIconTint */
    public void m20120x4a96bd96(android.content.res.ColorStateList colorStateList) {
        if (this.f125991i != colorStateList) {
            this.f125991i = colorStateList;
            b();
        }
    }

    /* renamed from: setIconTintMode */
    public void m20121x7f56b059(android.graphics.PorterDuff.Mode mode) {
        if (this.f125990h != mode) {
            this.f125990h = mode;
            b();
        }
    }

    /* renamed from: setIconTintResource */
    public void m20122xaa28efc4(int i17) {
        android.content.Context context = getContext();
        java.lang.Object obj = k.a.f384389a;
        m20120x4a96bd96(context.getColorStateList(i17));
    }

    /* renamed from: setInternalBackground */
    public void m20123x904a53cd(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    /* renamed from: setRippleColor */
    public void m20124x4205a151(android.content.res.ColorStateList colorStateList) {
        if (a()) {
            z9.b bVar = this.f125988f;
            if (bVar.f552376k != colorStateList) {
                bVar.f552376k = colorStateList;
                com.p176xb6135e39.p177xcca8366f.p244x11d36527.p250xade22732.C2692x47948b59 c2692x47948b59 = bVar.f552366a;
                if (c2692x47948b59.getBackground() instanceof android.graphics.drawable.RippleDrawable) {
                    ((android.graphics.drawable.RippleDrawable) c2692x47948b59.getBackground()).setColor(colorStateList);
                }
            }
        }
    }

    /* renamed from: setRippleColorResource */
    public void m20125x5001e87f(int i17) {
        if (a()) {
            android.content.Context context = getContext();
            java.lang.Object obj = k.a.f384389a;
            m20124x4205a151(context.getColorStateList(i17));
        }
    }

    /* renamed from: setStrokeColor */
    public void m20126xe1d3a649(android.content.res.ColorStateList colorStateList) {
        if (a()) {
            z9.b bVar = this.f125988f;
            if (bVar.f552375j != colorStateList) {
                bVar.f552375j = colorStateList;
                android.graphics.Paint paint = bVar.f552377l;
                com.p176xb6135e39.p177xcca8366f.p244x11d36527.p250xade22732.C2692x47948b59 c2692x47948b59 = bVar.f552366a;
                paint.setColor(colorStateList != null ? colorStateList.getColorForState(c2692x47948b59.getDrawableState(), 0) : 0);
                if (bVar.f552379n != null) {
                    c2692x47948b59.m20123x904a53cd(bVar.a());
                }
            }
        }
    }

    /* renamed from: setStrokeColorResource */
    public void m20127xf5d77577(int i17) {
        if (a()) {
            android.content.Context context = getContext();
            java.lang.Object obj = k.a.f384389a;
            m20126xe1d3a649(context.getColorStateList(i17));
        }
    }

    /* renamed from: setStrokeWidth */
    public void m20128xe2eaa4ac(int i17) {
        if (a()) {
            z9.b bVar = this.f125988f;
            if (bVar.f552372g != i17) {
                bVar.f552372g = i17;
                bVar.f552377l.setStrokeWidth(i17);
                if (bVar.f552379n != null) {
                    bVar.f552366a.m20123x904a53cd(bVar.a());
                }
            }
        }
    }

    /* renamed from: setStrokeWidthResource */
    public void m20129xbd8760da(int i17) {
        if (a()) {
            m20128xe2eaa4ac(getResources().getDimensionPixelSize(i17));
        }
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0080x3ada79f5
    /* renamed from: setSupportBackgroundTintList */
    public void mo2651xb597a974(android.content.res.ColorStateList colorStateList) {
        boolean a17 = a();
        z9.b bVar = this.f125988f;
        if (!a17) {
            if (bVar != null) {
                super.mo2651xb597a974(colorStateList);
            }
        } else if (bVar.f552374i != colorStateList) {
            bVar.f552374i = colorStateList;
            bVar.b();
        }
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0080x3ada79f5
    /* renamed from: setSupportBackgroundTintMode */
    public void mo2652xb5983279(android.graphics.PorterDuff.Mode mode) {
        boolean a17 = a();
        z9.b bVar = this.f125988f;
        if (!a17) {
            if (bVar != null) {
                super.mo2652xb5983279(mode);
            }
        } else if (bVar.f552373h != mode) {
            bVar.f552373h = mode;
            bVar.b();
        }
    }

    public C2692x47948b59(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.content.res.TypedArray d17 = fa.d0.d(context, attributeSet, v9.a.f515657n, i17, com.p314xaae8f345.mm.R.C30868x68b1db1.f576285va, new int[0]);
        this.f125989g = d17.getDimensionPixelSize(9, 0);
        this.f125990h = fa.e0.a(d17.getInt(12, -1), android.graphics.PorterDuff.Mode.SRC_IN);
        this.f125991i = ia.a.a(getContext(), d17, 11);
        this.f125992m = ia.a.b(getContext(), d17, 7);
        this.f125995p = d17.getInteger(8, 1);
        this.f125993n = d17.getDimensionPixelSize(10, 0);
        z9.b bVar = new z9.b(this);
        this.f125988f = bVar;
        bVar.f552367b = d17.getDimensionPixelOffset(0, 0);
        bVar.f552368c = d17.getDimensionPixelOffset(1, 0);
        bVar.f552369d = d17.getDimensionPixelOffset(2, 0);
        bVar.f552370e = d17.getDimensionPixelOffset(3, 0);
        bVar.f552371f = d17.getDimensionPixelSize(6, 0);
        bVar.f552372g = d17.getDimensionPixelSize(15, 0);
        bVar.f552373h = fa.e0.a(d17.getInt(5, -1), android.graphics.PorterDuff.Mode.SRC_IN);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p250xade22732.C2692x47948b59 c2692x47948b59 = bVar.f552366a;
        bVar.f552374i = ia.a.a(c2692x47948b59.getContext(), d17, 4);
        bVar.f552375j = ia.a.a(c2692x47948b59.getContext(), d17, 14);
        bVar.f552376k = ia.a.a(c2692x47948b59.getContext(), d17, 13);
        android.graphics.Paint paint = bVar.f552377l;
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(bVar.f552372g);
        android.content.res.ColorStateList colorStateList = bVar.f552375j;
        paint.setColor(colorStateList != null ? colorStateList.getColorForState(c2692x47948b59.getDrawableState(), 0) : 0);
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        int f17 = n3.v0.f(c2692x47948b59);
        int paddingTop = c2692x47948b59.getPaddingTop();
        int e17 = n3.v0.e(c2692x47948b59);
        int paddingBottom = c2692x47948b59.getPaddingBottom();
        c2692x47948b59.m20123x904a53cd(bVar.a());
        n3.v0.k(c2692x47948b59, f17 + bVar.f552367b, paddingTop + bVar.f552369d, e17 + bVar.f552368c, paddingBottom + bVar.f552370e);
        d17.recycle();
        setCompoundDrawablePadding(this.f125989g);
        b();
    }
}

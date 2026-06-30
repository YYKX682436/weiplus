package com.google.android.material.button;

/* loaded from: classes15.dex */
public class MaterialButton extends androidx.appcompat.widget.AppCompatButton {

    /* renamed from: f, reason: collision with root package name */
    public final z9.b f44455f;

    /* renamed from: g, reason: collision with root package name */
    public int f44456g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.PorterDuff.Mode f44457h;

    /* renamed from: i, reason: collision with root package name */
    public android.content.res.ColorStateList f44458i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.drawable.Drawable f44459m;

    /* renamed from: n, reason: collision with root package name */
    public int f44460n;

    /* renamed from: o, reason: collision with root package name */
    public int f44461o;

    /* renamed from: p, reason: collision with root package name */
    public int f44462p;

    public MaterialButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.tencent.mm.R.attr.f478344hb);
    }

    public final boolean a() {
        z9.b bVar = this.f44455f;
        return (bVar == null || bVar.f470848p) ? false : true;
    }

    public final void b() {
        android.graphics.drawable.Drawable drawable = this.f44459m;
        if (drawable != null) {
            android.graphics.drawable.Drawable mutate = drawable.mutate();
            this.f44459m = mutate;
            f3.b.h(mutate, this.f44458i);
            android.graphics.PorterDuff.Mode mode = this.f44457h;
            if (mode != null) {
                f3.b.i(this.f44459m, mode);
            }
            int i17 = this.f44460n;
            if (i17 == 0) {
                i17 = this.f44459m.getIntrinsicWidth();
            }
            int i18 = this.f44460n;
            if (i18 == 0) {
                i18 = this.f44459m.getIntrinsicHeight();
            }
            android.graphics.drawable.Drawable drawable2 = this.f44459m;
            int i19 = this.f44461o;
            drawable2.setBounds(i19, 0, i17 + i19, i18);
        }
        androidx.core.widget.u.e(this, this.f44459m, null, null, null);
    }

    @Override // android.view.View
    public android.content.res.ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public android.graphics.PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (a()) {
            return this.f44455f.f470838f;
        }
        return 0;
    }

    public android.graphics.drawable.Drawable getIcon() {
        return this.f44459m;
    }

    public int getIconGravity() {
        return this.f44462p;
    }

    public int getIconPadding() {
        return this.f44456g;
    }

    public int getIconSize() {
        return this.f44460n;
    }

    public android.content.res.ColorStateList getIconTint() {
        return this.f44458i;
    }

    public android.graphics.PorterDuff.Mode getIconTintMode() {
        return this.f44457h;
    }

    public android.content.res.ColorStateList getRippleColor() {
        if (a()) {
            return this.f44455f.f470843k;
        }
        return null;
    }

    public android.content.res.ColorStateList getStrokeColor() {
        if (a()) {
            return this.f44455f.f470842j;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (a()) {
            return this.f44455f.f470839g;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public android.content.res.ColorStateList getSupportBackgroundTintList() {
        return a() ? this.f44455f.f470841i : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
        return a() ? this.f44455f.f470840h : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        if (this.f44459m == null || this.f44462p != 2) {
            return;
        }
        int measureText = (int) getPaint().measureText(getText().toString());
        int i19 = this.f44460n;
        if (i19 == 0) {
            i19 = this.f44459m.getIntrinsicWidth();
        }
        int measuredWidth = getMeasuredWidth() - measureText;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        int e17 = ((((measuredWidth - n3.v0.e(this)) - i19) - this.f44456g) - n3.v0.f(this)) / 2;
        if (n3.v0.d(this) == 1) {
            e17 = -e17;
        }
        if (this.f44461o != e17) {
            this.f44461o = e17;
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
        android.graphics.drawable.GradientDrawable gradientDrawable = this.f44455f.f470845m;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(i17);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        if (!a()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        z9.b bVar = this.f44455f;
        bVar.f470848p = true;
        android.content.res.ColorStateList colorStateList = bVar.f470841i;
        com.google.android.material.button.MaterialButton materialButton = bVar.f470833a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(bVar.f470840h);
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i17) {
        setBackgroundDrawable(i17 != 0 ? k.a.a(getContext(), i17) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCornerRadius(int i17) {
        if (a()) {
            z9.b bVar = this.f44455f;
            if (bVar.f470838f != i17) {
                bVar.f470838f = i17;
                android.graphics.drawable.GradientDrawable gradientDrawable = bVar.f470845m;
                if (gradientDrawable == null || bVar.f470846n == null || bVar.f470847o == null) {
                    return;
                }
                float f17 = i17 + 1.0E-5f;
                gradientDrawable.setCornerRadius(f17);
                bVar.f470846n.setCornerRadius(f17);
                bVar.f470847o.setCornerRadius(f17);
            }
        }
    }

    public void setCornerRadiusResource(int i17) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i17));
        }
    }

    public void setIcon(android.graphics.drawable.Drawable drawable) {
        if (this.f44459m != drawable) {
            this.f44459m = drawable;
            b();
        }
    }

    public void setIconGravity(int i17) {
        this.f44462p = i17;
    }

    public void setIconPadding(int i17) {
        if (this.f44456g != i17) {
            this.f44456g = i17;
            setCompoundDrawablePadding(i17);
        }
    }

    public void setIconResource(int i17) {
        setIcon(i17 != 0 ? k.a.a(getContext(), i17) : null);
    }

    public void setIconSize(int i17) {
        if (i17 < 0) {
            throw new java.lang.IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f44460n != i17) {
            this.f44460n = i17;
            b();
        }
    }

    public void setIconTint(android.content.res.ColorStateList colorStateList) {
        if (this.f44458i != colorStateList) {
            this.f44458i = colorStateList;
            b();
        }
    }

    public void setIconTintMode(android.graphics.PorterDuff.Mode mode) {
        if (this.f44457h != mode) {
            this.f44457h = mode;
            b();
        }
    }

    public void setIconTintResource(int i17) {
        android.content.Context context = getContext();
        java.lang.Object obj = k.a.f302856a;
        setIconTint(context.getColorStateList(i17));
    }

    public void setInternalBackground(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setRippleColor(android.content.res.ColorStateList colorStateList) {
        if (a()) {
            z9.b bVar = this.f44455f;
            if (bVar.f470843k != colorStateList) {
                bVar.f470843k = colorStateList;
                com.google.android.material.button.MaterialButton materialButton = bVar.f470833a;
                if (materialButton.getBackground() instanceof android.graphics.drawable.RippleDrawable) {
                    ((android.graphics.drawable.RippleDrawable) materialButton.getBackground()).setColor(colorStateList);
                }
            }
        }
    }

    public void setRippleColorResource(int i17) {
        if (a()) {
            android.content.Context context = getContext();
            java.lang.Object obj = k.a.f302856a;
            setRippleColor(context.getColorStateList(i17));
        }
    }

    public void setStrokeColor(android.content.res.ColorStateList colorStateList) {
        if (a()) {
            z9.b bVar = this.f44455f;
            if (bVar.f470842j != colorStateList) {
                bVar.f470842j = colorStateList;
                android.graphics.Paint paint = bVar.f470844l;
                com.google.android.material.button.MaterialButton materialButton = bVar.f470833a;
                paint.setColor(colorStateList != null ? colorStateList.getColorForState(materialButton.getDrawableState(), 0) : 0);
                if (bVar.f470846n != null) {
                    materialButton.setInternalBackground(bVar.a());
                }
            }
        }
    }

    public void setStrokeColorResource(int i17) {
        if (a()) {
            android.content.Context context = getContext();
            java.lang.Object obj = k.a.f302856a;
            setStrokeColor(context.getColorStateList(i17));
        }
    }

    public void setStrokeWidth(int i17) {
        if (a()) {
            z9.b bVar = this.f44455f;
            if (bVar.f470839g != i17) {
                bVar.f470839g = i17;
                bVar.f470844l.setStrokeWidth(i17);
                if (bVar.f470846n != null) {
                    bVar.f470833a.setInternalBackground(bVar.a());
                }
            }
        }
    }

    public void setStrokeWidthResource(int i17) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i17));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        boolean a17 = a();
        z9.b bVar = this.f44455f;
        if (!a17) {
            if (bVar != null) {
                super.setSupportBackgroundTintList(colorStateList);
            }
        } else if (bVar.f470841i != colorStateList) {
            bVar.f470841i = colorStateList;
            bVar.b();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        boolean a17 = a();
        z9.b bVar = this.f44455f;
        if (!a17) {
            if (bVar != null) {
                super.setSupportBackgroundTintMode(mode);
            }
        } else if (bVar.f470840h != mode) {
            bVar.f470840h = mode;
            bVar.b();
        }
    }

    public MaterialButton(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.content.res.TypedArray d17 = fa.d0.d(context, attributeSet, v9.a.f434124n, i17, com.tencent.mm.R.style.f494752va, new int[0]);
        this.f44456g = d17.getDimensionPixelSize(9, 0);
        this.f44457h = fa.e0.a(d17.getInt(12, -1), android.graphics.PorterDuff.Mode.SRC_IN);
        this.f44458i = ia.a.a(getContext(), d17, 11);
        this.f44459m = ia.a.b(getContext(), d17, 7);
        this.f44462p = d17.getInteger(8, 1);
        this.f44460n = d17.getDimensionPixelSize(10, 0);
        z9.b bVar = new z9.b(this);
        this.f44455f = bVar;
        bVar.f470834b = d17.getDimensionPixelOffset(0, 0);
        bVar.f470835c = d17.getDimensionPixelOffset(1, 0);
        bVar.f470836d = d17.getDimensionPixelOffset(2, 0);
        bVar.f470837e = d17.getDimensionPixelOffset(3, 0);
        bVar.f470838f = d17.getDimensionPixelSize(6, 0);
        bVar.f470839g = d17.getDimensionPixelSize(15, 0);
        bVar.f470840h = fa.e0.a(d17.getInt(5, -1), android.graphics.PorterDuff.Mode.SRC_IN);
        com.google.android.material.button.MaterialButton materialButton = bVar.f470833a;
        bVar.f470841i = ia.a.a(materialButton.getContext(), d17, 4);
        bVar.f470842j = ia.a.a(materialButton.getContext(), d17, 14);
        bVar.f470843k = ia.a.a(materialButton.getContext(), d17, 13);
        android.graphics.Paint paint = bVar.f470844l;
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(bVar.f470839g);
        android.content.res.ColorStateList colorStateList = bVar.f470842j;
        paint.setColor(colorStateList != null ? colorStateList.getColorForState(materialButton.getDrawableState(), 0) : 0);
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        int f17 = n3.v0.f(materialButton);
        int paddingTop = materialButton.getPaddingTop();
        int e17 = n3.v0.e(materialButton);
        int paddingBottom = materialButton.getPaddingBottom();
        materialButton.setInternalBackground(bVar.a());
        n3.v0.k(materialButton, f17 + bVar.f470834b, paddingTop + bVar.f470836d, e17 + bVar.f470835c, paddingBottom + bVar.f470837e);
        d17.recycle();
        setCompoundDrawablePadding(this.f44456g);
        b();
    }
}

package com.google.android.material.chip;

/* loaded from: classes13.dex */
public class ChipGroup extends com.google.android.material.internal.FlowLayout {

    /* renamed from: g, reason: collision with root package name */
    public int f44479g;

    /* renamed from: h, reason: collision with root package name */
    public int f44480h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f44481i;

    /* renamed from: m, reason: collision with root package name */
    public final ba.h f44482m;

    /* renamed from: n, reason: collision with root package name */
    public final ba.j f44483n;

    /* renamed from: o, reason: collision with root package name */
    public int f44484o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f44485p;

    /* loaded from: classes13.dex */
    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public ChipGroup(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.tencent.mm.R.attr.f478151c0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckedId(int i17) {
        this.f44484o = i17;
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        if (view instanceof com.google.android.material.chip.Chip) {
            com.google.android.material.chip.Chip chip = (com.google.android.material.chip.Chip) view;
            if (chip.isChecked()) {
                int i18 = this.f44484o;
                if (i18 != -1 && this.f44481i) {
                    b(i18, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i17, layoutParams);
    }

    public final void b(int i17, boolean z17) {
        android.view.View findViewById = findViewById(i17);
        if (findViewById instanceof com.google.android.material.chip.Chip) {
            this.f44485p = true;
            ((com.google.android.material.chip.Chip) findViewById).setChecked(z17);
            this.f44485p = false;
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof com.google.android.material.chip.ChipGroup.LayoutParams);
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new com.google.android.material.chip.ChipGroup.LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new com.google.android.material.chip.ChipGroup.LayoutParams(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        if (this.f44481i) {
            return this.f44484o;
        }
        return -1;
    }

    public int getChipSpacingHorizontal() {
        return this.f44479g;
    }

    public int getChipSpacingVertical() {
        return this.f44480h;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i17 = this.f44484o;
        if (i17 != -1) {
            b(i17, true);
            setCheckedId(this.f44484o);
        }
    }

    public void setChipSpacing(int i17) {
        setChipSpacingHorizontal(i17);
        setChipSpacingVertical(i17);
    }

    public void setChipSpacingHorizontal(int i17) {
        if (this.f44479g != i17) {
            this.f44479g = i17;
            setItemSpacing(i17);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i17) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i17));
    }

    public void setChipSpacingResource(int i17) {
        setChipSpacing(getResources().getDimensionPixelOffset(i17));
    }

    public void setChipSpacingVertical(int i17) {
        if (this.f44480h != i17) {
            this.f44480h = i17;
            setLineSpacing(i17);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i17) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i17));
    }

    @java.lang.Deprecated
    public void setDividerDrawableHorizontal(android.graphics.drawable.Drawable drawable) {
        throw new java.lang.UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @java.lang.Deprecated
    public void setDividerDrawableVertical(android.graphics.drawable.Drawable drawable) {
        throw new java.lang.UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @java.lang.Deprecated
    public void setFlexWrap(int i17) {
        throw new java.lang.UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(ba.i iVar) {
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f44483n.f18671d = onHierarchyChangeListener;
    }

    @java.lang.Deprecated
    public void setShowDividerHorizontal(int i17) {
        throw new java.lang.UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @java.lang.Deprecated
    public void setShowDividerVertical(int i17) {
        throw new java.lang.UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i17) {
        setSingleLine(getResources().getBoolean(i17));
    }

    public void setSingleSelection(boolean z17) {
        if (this.f44481i != z17) {
            this.f44481i = z17;
            this.f44485p = true;
            for (int i17 = 0; i17 < getChildCount(); i17++) {
                android.view.View childAt = getChildAt(i17);
                if (childAt instanceof com.google.android.material.chip.Chip) {
                    ((com.google.android.material.chip.Chip) childAt).setChecked(false);
                }
            }
            this.f44485p = false;
            setCheckedId(-1);
        }
    }

    public ChipGroup(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f44482m = new ba.h(this, null);
        ba.j jVar = new ba.j(this, null);
        this.f44483n = jVar;
        this.f44484o = -1;
        this.f44485p = false;
        android.content.res.TypedArray d17 = fa.d0.d(context, attributeSet, v9.a.f434117g, i17, com.tencent.mm.R.style.f494755vd, new int[0]);
        int dimensionPixelOffset = d17.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(d17.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(d17.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(d17.getBoolean(4, false));
        setSingleSelection(d17.getBoolean(5, false));
        int resourceId = d17.getResourceId(0, -1);
        if (resourceId != -1) {
            this.f44484o = resourceId;
        }
        d17.recycle();
        super.setOnHierarchyChangeListener(jVar);
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new com.google.android.material.chip.ChipGroup.LayoutParams(layoutParams);
    }

    public void setSingleSelection(int i17) {
        setSingleSelection(getResources().getBoolean(i17));
    }
}

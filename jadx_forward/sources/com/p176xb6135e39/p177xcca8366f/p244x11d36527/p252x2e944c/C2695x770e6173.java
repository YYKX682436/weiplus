package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p252x2e944c;

/* renamed from: com.google.android.material.chip.ChipGroup */
/* loaded from: classes13.dex */
public class C2695x770e6173 extends com.p176xb6135e39.p177xcca8366f.p244x11d36527.p257x21ffc6bd.C2705x81dbaa18 {

    /* renamed from: g, reason: collision with root package name */
    public int f126012g;

    /* renamed from: h, reason: collision with root package name */
    public int f126013h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f126014i;

    /* renamed from: m, reason: collision with root package name */
    public final ba.h f126015m;

    /* renamed from: n, reason: collision with root package name */
    public final ba.j f126016n;

    /* renamed from: o, reason: collision with root package name */
    public int f126017o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f126018p;

    /* renamed from: com.google.android.material.chip.ChipGroup$LayoutParams */
    /* loaded from: classes13.dex */
    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public C2695x770e6173(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559684c0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setCheckedId */
    public void m20236x738abce0(int i17) {
        this.f126017o = i17;
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        if (view instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p252x2e944c.C2694x20086c) {
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p252x2e944c.C2694x20086c c2694x20086c = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p252x2e944c.C2694x20086c) view;
            if (c2694x20086c.isChecked()) {
                int i18 = this.f126017o;
                if (i18 != -1 && this.f126014i) {
                    b(i18, false);
                }
                m20236x738abce0(c2694x20086c.getId());
            }
        }
        super.addView(view, i17, layoutParams);
    }

    public final void b(int i17, boolean z17) {
        android.view.View findViewById = findViewById(i17);
        if (findViewById instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p252x2e944c.C2694x20086c) {
            this.f126018p = true;
            ((com.p176xb6135e39.p177xcca8366f.p244x11d36527.p252x2e944c.C2694x20086c) findViewById).setChecked(z17);
            this.f126018p = false;
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p252x2e944c.C2695x770e6173.LayoutParams);
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p252x2e944c.C2695x770e6173.LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p252x2e944c.C2695x770e6173.LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: getCheckedChipId */
    public int m20237x67779958() {
        if (this.f126014i) {
            return this.f126017o;
        }
        return -1;
    }

    /* renamed from: getChipSpacingHorizontal */
    public int m20238x6eb13425() {
        return this.f126012g;
    }

    /* renamed from: getChipSpacingVertical */
    public int m20239xcd41bb7() {
        return this.f126013h;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i17 = this.f126017o;
        if (i17 != -1) {
            b(i17, true);
            m20236x738abce0(this.f126017o);
        }
    }

    /* renamed from: setChipSpacing */
    public void m20240x70617495(int i17) {
        m20241x3ec3e699(i17);
        m20244x5b18db2b(i17);
    }

    /* renamed from: setChipSpacingHorizontal */
    public void m20241x3ec3e699(int i17) {
        if (this.f126012g != i17) {
            this.f126012g = i17;
            m20302xd879afee(i17);
            requestLayout();
        }
    }

    /* renamed from: setChipSpacingHorizontalResource */
    public void m20242xd3ea65c7(int i17) {
        m20241x3ec3e699(getResources().getDimensionPixelOffset(i17));
    }

    /* renamed from: setChipSpacingResource */
    public void m20243xbd0837c3(int i17) {
        m20240x70617495(getResources().getDimensionPixelOffset(i17));
    }

    /* renamed from: setChipSpacingVertical */
    public void m20244x5b18db2b(int i17) {
        if (this.f126013h != i17) {
            this.f126013h = i17;
            m20303xf5e6bed(i17);
            requestLayout();
        }
    }

    /* renamed from: setChipSpacingVerticalResource */
    public void m20245x2512a859(int i17) {
        m20244x5b18db2b(getResources().getDimensionPixelOffset(i17));
    }

    @java.lang.Deprecated
    /* renamed from: setDividerDrawableHorizontal */
    public void m20246x6890cc19(android.graphics.drawable.Drawable drawable) {
        throw new java.lang.UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @java.lang.Deprecated
    /* renamed from: setDividerDrawableVertical */
    public void m20247x15e120ab(android.graphics.drawable.Drawable drawable) {
        throw new java.lang.UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @java.lang.Deprecated
    /* renamed from: setFlexWrap */
    public void m20248xde893e65(int i17) {
        throw new java.lang.UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    /* renamed from: setOnCheckedChangeListener */
    public void m20249x405278aa(ba.i iVar) {
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f126016n.f100204d = onHierarchyChangeListener;
    }

    @java.lang.Deprecated
    /* renamed from: setShowDividerHorizontal */
    public void m20250x7795d35e(int i17) {
        throw new java.lang.UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @java.lang.Deprecated
    /* renamed from: setShowDividerVertical */
    public void m20251x72993530(int i17) {
        throw new java.lang.UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    /* renamed from: setSingleLine */
    public void m20252x52d64a5e(int i17) {
        m20304x52d64a5e(getResources().getBoolean(i17));
    }

    /* renamed from: setSingleSelection */
    public void m20254xf426c962(boolean z17) {
        if (this.f126014i != z17) {
            this.f126014i = z17;
            this.f126018p = true;
            for (int i17 = 0; i17 < getChildCount(); i17++) {
                android.view.View childAt = getChildAt(i17);
                if (childAt instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p252x2e944c.C2694x20086c) {
                    ((com.p176xb6135e39.p177xcca8366f.p244x11d36527.p252x2e944c.C2694x20086c) childAt).setChecked(false);
                }
            }
            this.f126018p = false;
            m20236x738abce0(-1);
        }
    }

    public C2695x770e6173(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f126015m = new ba.h(this, null);
        ba.j jVar = new ba.j(this, null);
        this.f126016n = jVar;
        this.f126017o = -1;
        this.f126018p = false;
        android.content.res.TypedArray d17 = fa.d0.d(context, attributeSet, v9.a.f515650g, i17, com.p314xaae8f345.mm.R.C30868x68b1db1.f576288vd, new int[0]);
        int dimensionPixelOffset = d17.getDimensionPixelOffset(1, 0);
        m20241x3ec3e699(d17.getDimensionPixelOffset(2, dimensionPixelOffset));
        m20244x5b18db2b(d17.getDimensionPixelOffset(3, dimensionPixelOffset));
        m20304x52d64a5e(d17.getBoolean(4, false));
        m20254xf426c962(d17.getBoolean(5, false));
        int resourceId = d17.getResourceId(0, -1);
        if (resourceId != -1) {
            this.f126017o = resourceId;
        }
        d17.recycle();
        super.setOnHierarchyChangeListener(jVar);
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p252x2e944c.C2695x770e6173.LayoutParams(layoutParams);
    }

    /* renamed from: setSingleSelection */
    public void m20253xf426c962(int i17) {
        m20254xf426c962(getResources().getBoolean(i17));
    }
}

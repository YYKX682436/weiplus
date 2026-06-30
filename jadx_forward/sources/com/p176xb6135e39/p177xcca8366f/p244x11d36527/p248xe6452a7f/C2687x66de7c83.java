package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f;

/* renamed from: com.google.android.material.bottomnavigation.BottomNavigationMenuView */
/* loaded from: classes15.dex */
public class C2687x66de7c83 extends android.view.ViewGroup implements o.i0 {
    public static final int[] E = {android.R.attr.state_checked};
    public static final int[] F = {-16842910};
    public int A;
    public final int[] B;
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.d C;
    public o.r D;

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p112x993b6d55.C1184xfa388aad f125935d;

    /* renamed from: e, reason: collision with root package name */
    public final int f125936e;

    /* renamed from: f, reason: collision with root package name */
    public final int f125937f;

    /* renamed from: g, reason: collision with root package name */
    public final int f125938g;

    /* renamed from: h, reason: collision with root package name */
    public final int f125939h;

    /* renamed from: i, reason: collision with root package name */
    public final int f125940i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View.OnClickListener f125941m;

    /* renamed from: n, reason: collision with root package name */
    public final m3.e f125942n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f125943o;

    /* renamed from: p, reason: collision with root package name */
    public int f125944p;

    /* renamed from: q, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.C2686xd10ae837[] f125945q;

    /* renamed from: r, reason: collision with root package name */
    public int f125946r;

    /* renamed from: s, reason: collision with root package name */
    public int f125947s;

    /* renamed from: t, reason: collision with root package name */
    public android.content.res.ColorStateList f125948t;

    /* renamed from: u, reason: collision with root package name */
    public int f125949u;

    /* renamed from: v, reason: collision with root package name */
    public android.content.res.ColorStateList f125950v;

    /* renamed from: w, reason: collision with root package name */
    public final android.content.res.ColorStateList f125951w;

    /* renamed from: x, reason: collision with root package name */
    public int f125952x;

    /* renamed from: y, reason: collision with root package name */
    public int f125953y;

    /* renamed from: z, reason: collision with root package name */
    public android.graphics.drawable.Drawable f125954z;

    public C2687x66de7c83(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f125942n = new m3.g(5);
        this.f125946r = 0;
        this.f125947s = 0;
        android.content.res.Resources resources = getResources();
        this.f125936e = resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561806t6);
        this.f125937f = resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561807t7);
        this.f125938g = resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561800t0);
        this.f125939h = resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561801t1);
        this.f125940i = resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561804t4);
        this.f125951w = b(android.R.attr.textColorSecondary);
        p012xc85e97e9.p112x993b6d55.C1172x76e7e484 c1172x76e7e484 = new p012xc85e97e9.p112x993b6d55.C1172x76e7e484();
        this.f125935d = c1172x76e7e484;
        c1172x76e7e484.b0(0);
        c1172x76e7e484.Z(115L);
        c1172x76e7e484.a0(new y3.b());
        c1172x76e7e484.X(new fa.c0());
        this.f125941m = new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.b(this);
        this.B = new int[5];
    }

    /* renamed from: getNewItem */
    private com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.C2686xd10ae837 m20054xabc4049d() {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.C2686xd10ae837 c2686xd10ae837 = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.C2686xd10ae837) ((m3.g) this.f125942n).a();
        return c2686xd10ae837 == null ? new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.C2686xd10ae837(getContext(), null) : c2686xd10ae837;
    }

    public void a() {
        removeAllViews();
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.C2686xd10ae837[] c2686xd10ae837Arr = this.f125945q;
        if (c2686xd10ae837Arr != null) {
            for (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.C2686xd10ae837 c2686xd10ae837 : c2686xd10ae837Arr) {
                if (c2686xd10ae837 != null) {
                    ((m3.g) this.f125942n).b(c2686xd10ae837);
                }
            }
        }
        if (this.D.size() == 0) {
            this.f125946r = 0;
            this.f125947s = 0;
            this.f125945q = null;
            return;
        }
        this.f125945q = new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.C2686xd10ae837[this.D.size()];
        int i17 = this.f125944p;
        boolean z17 = i17 != -1 ? i17 == 0 : this.D.l().size() > 3;
        for (int i18 = 0; i18 < this.D.size(); i18++) {
            this.C.f125964e = true;
            this.D.getItem(i18).setCheckable(true);
            this.C.f125964e = false;
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.C2686xd10ae837 m20054xabc4049d = m20054xabc4049d();
            this.f125945q[i18] = m20054xabc4049d;
            m20054xabc4049d.m20043x7f562754(this.f125948t);
            m20054xabc4049d.m20042x4a964a9c(this.f125949u);
            m20054xabc4049d.m20051x1c5c5ff4(this.f125951w);
            m20054xabc4049d.m20050x5181dbfe(this.f125952x);
            m20054xabc4049d.m20049x70a9c759(this.f125953y);
            m20054xabc4049d.m20051x1c5c5ff4(this.f125950v);
            android.graphics.drawable.Drawable drawable = this.f125954z;
            if (drawable != null) {
                m20054xabc4049d.m20045x3c565a3(drawable);
            } else {
                m20054xabc4049d.m20044x3c565a3(this.A);
            }
            m20054xabc4049d.m20048x574262a2(z17);
            m20054xabc4049d.m20047x8ef6e427(this.f125944p);
            m20054xabc4049d.a((o.u) this.D.getItem(i18), 0);
            m20054xabc4049d.m20046xe94342de(i18);
            m20054xabc4049d.setOnClickListener(this.f125941m);
            addView(m20054xabc4049d);
        }
        int min = java.lang.Math.min(this.D.size() - 1, this.f125947s);
        this.f125947s = min;
        this.D.getItem(min).setChecked(true);
    }

    public android.content.res.ColorStateList b(int i17) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (!getContext().getTheme().resolveAttribute(i17, typedValue, true)) {
            return null;
        }
        android.content.Context context = getContext();
        int i18 = typedValue.resourceId;
        java.lang.Object obj = k.a.f384389a;
        android.content.res.ColorStateList colorStateList = context.getColorStateList(i18);
        if (!getContext().getTheme().resolveAttribute(com.p314xaae8f345.mm.R.C30857x2dd9f1.f559710cq, typedValue, true)) {
            return null;
        }
        int i19 = typedValue.data;
        int defaultColor = colorStateList.getDefaultColor();
        int[] iArr = F;
        return new android.content.res.ColorStateList(new int[][]{iArr, E, android.view.ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i19, defaultColor});
    }

    /* renamed from: getIconTintList */
    public android.content.res.ColorStateList m20055x490d2c48() {
        return this.f125948t;
    }

    /* renamed from: getItemBackground */
    public android.graphics.drawable.Drawable m20056x3bcefd97() {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.C2686xd10ae837[] c2686xd10ae837Arr = this.f125945q;
        return (c2686xd10ae837Arr == null || c2686xd10ae837Arr.length <= 0) ? this.f125954z : c2686xd10ae837Arr[0].getBackground();
    }

    @java.lang.Deprecated
    /* renamed from: getItemBackgroundRes */
    public int m20057xfcb9c789() {
        return this.A;
    }

    /* renamed from: getItemIconSize */
    public int m20058x5a6b5ac3() {
        return this.f125949u;
    }

    /* renamed from: getItemTextAppearanceActive */
    public int m20059xef5cd500() {
        return this.f125953y;
    }

    /* renamed from: getItemTextAppearanceInactive */
    public int m20060xefa81be5() {
        return this.f125952x;
    }

    /* renamed from: getItemTextColor */
    public android.content.res.ColorStateList m20061x72954ad() {
        return this.f125950v;
    }

    /* renamed from: getLabelVisibilityMode */
    public int m20062x40b224b3() {
        return this.f125944p;
    }

    /* renamed from: getSelectedItemId */
    public int m20063x4c6a16ff() {
        return this.f125946r;
    }

    /* renamed from: getWindowAnimations */
    public int m20064xac0048f5() {
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        int childCount = getChildCount();
        int i28 = i19 - i17;
        int i29 = i27 - i18;
        int i37 = 0;
        for (int i38 = 0; i38 < childCount; i38++) {
            android.view.View childAt = getChildAt(i38);
            if (childAt.getVisibility() != 8) {
                java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                if (n3.v0.d(this) == 1) {
                    int i39 = i28 - i37;
                    childAt.layout(i39 - childAt.getMeasuredWidth(), 0, i39, i29);
                } else {
                    childAt.layout(i37, 0, childAt.getMeasuredWidth() + i37, i29);
                }
                i37 += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        int size = android.view.View.MeasureSpec.getSize(i17);
        int size2 = this.D.l().size();
        int childCount = getChildCount();
        int i19 = this.f125940i;
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i19, 1073741824);
        int i27 = this.f125944p;
        boolean z17 = i27 != -1 ? i27 == 0 : size2 > 3;
        int i28 = this.f125938g;
        int[] iArr = this.B;
        if (z17 && this.f125943o) {
            android.view.View childAt = getChildAt(this.f125947s);
            int visibility = childAt.getVisibility();
            int i29 = this.f125939h;
            if (visibility != 8) {
                childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(i28, Integer.MIN_VALUE), makeMeasureSpec);
                i29 = java.lang.Math.max(i29, childAt.getMeasuredWidth());
            }
            int i37 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min = java.lang.Math.min(size - (this.f125937f * i37), java.lang.Math.min(i29, i28));
            int i38 = size - min;
            int min2 = java.lang.Math.min(i38 / (i37 != 0 ? i37 : 1), this.f125936e);
            int i39 = i38 - (i37 * min2);
            int i47 = 0;
            while (i47 < childCount) {
                if (getChildAt(i47).getVisibility() != 8) {
                    int i48 = i47 == this.f125947s ? min : min2;
                    iArr[i47] = i48;
                    if (i39 > 0) {
                        iArr[i47] = i48 + 1;
                        i39--;
                    }
                } else {
                    iArr[i47] = 0;
                }
                i47++;
            }
        } else {
            int min3 = java.lang.Math.min(size / (size2 != 0 ? size2 : 1), i28);
            int i49 = size - (size2 * min3);
            for (int i57 = 0; i57 < childCount; i57++) {
                if (getChildAt(i57).getVisibility() != 8) {
                    iArr[i57] = min3;
                    if (i49 > 0) {
                        iArr[i57] = min3 + 1;
                        i49--;
                    }
                } else {
                    iArr[i57] = 0;
                }
            }
        }
        int i58 = 0;
        for (int i59 = 0; i59 < childCount; i59++) {
            android.view.View childAt2 = getChildAt(i59);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(android.view.View.MeasureSpec.makeMeasureSpec(iArr[i59], 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i58 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(android.view.View.resolveSizeAndState(i58, android.view.View.MeasureSpec.makeMeasureSpec(i58, 1073741824), 0), android.view.View.resolveSizeAndState(i19, makeMeasureSpec, 0));
    }

    @Override // o.i0
    public void r(o.r rVar) {
        this.D = rVar;
    }

    /* renamed from: setIconTintList */
    public void m20065x7f562754(android.content.res.ColorStateList colorStateList) {
        this.f125948t = colorStateList;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.C2686xd10ae837[] c2686xd10ae837Arr = this.f125945q;
        if (c2686xd10ae837Arr != null) {
            for (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.C2686xd10ae837 c2686xd10ae837 : c2686xd10ae837Arr) {
                c2686xd10ae837.m20043x7f562754(colorStateList);
            }
        }
    }

    /* renamed from: setItemBackground */
    public void m20066x3c565a3(android.graphics.drawable.Drawable drawable) {
        this.f125954z = drawable;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.C2686xd10ae837[] c2686xd10ae837Arr = this.f125945q;
        if (c2686xd10ae837Arr != null) {
            for (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.C2686xd10ae837 c2686xd10ae837 : c2686xd10ae837Arr) {
                c2686xd10ae837.m20045x3c565a3(drawable);
            }
        }
    }

    /* renamed from: setItemBackgroundRes */
    public void m20067xd84fd3fd(int i17) {
        this.A = i17;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.C2686xd10ae837[] c2686xd10ae837Arr = this.f125945q;
        if (c2686xd10ae837Arr != null) {
            for (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.C2686xd10ae837 c2686xd10ae837 : c2686xd10ae837Arr) {
                c2686xd10ae837.m20044x3c565a3(i17);
            }
        }
    }

    /* renamed from: setItemHorizontalTranslationEnabled */
    public void m20068x8985bbc9(boolean z17) {
        this.f125943o = z17;
    }

    /* renamed from: setItemIconSize */
    public void m20069x90b455cf(int i17) {
        this.f125949u = i17;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.C2686xd10ae837[] c2686xd10ae837Arr = this.f125945q;
        if (c2686xd10ae837Arr != null) {
            for (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.C2686xd10ae837 c2686xd10ae837 : c2686xd10ae837Arr) {
                c2686xd10ae837.m20042x4a964a9c(i17);
            }
        }
    }

    /* renamed from: setItemTextAppearanceActive */
    public void m20070x9f299e0c(int i17) {
        this.f125953y = i17;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.C2686xd10ae837[] c2686xd10ae837Arr = this.f125945q;
        if (c2686xd10ae837Arr != null) {
            for (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.C2686xd10ae837 c2686xd10ae837 : c2686xd10ae837Arr) {
                c2686xd10ae837.m20049x70a9c759(i17);
                android.content.res.ColorStateList colorStateList = this.f125950v;
                if (colorStateList != null) {
                    c2686xd10ae837.m20051x1c5c5ff4(colorStateList);
                }
            }
        }
    }

    /* renamed from: setItemTextAppearanceInactive */
    public void m20071xdf66d1f1(int i17) {
        this.f125952x = i17;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.C2686xd10ae837[] c2686xd10ae837Arr = this.f125945q;
        if (c2686xd10ae837Arr != null) {
            for (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.C2686xd10ae837 c2686xd10ae837 : c2686xd10ae837Arr) {
                c2686xd10ae837.m20050x5181dbfe(i17);
                android.content.res.ColorStateList colorStateList = this.f125950v;
                if (colorStateList != null) {
                    c2686xd10ae837.m20051x1c5c5ff4(colorStateList);
                }
            }
        }
    }

    /* renamed from: setItemTextColor */
    public void m20072x99ffbb21(android.content.res.ColorStateList colorStateList) {
        this.f125950v = colorStateList;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.C2686xd10ae837[] c2686xd10ae837Arr = this.f125945q;
        if (c2686xd10ae837Arr != null) {
            for (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.C2686xd10ae837 c2686xd10ae837 : c2686xd10ae837Arr) {
                c2686xd10ae837.m20051x1c5c5ff4(colorStateList);
            }
        }
    }

    /* renamed from: setLabelVisibilityMode */
    public void m20073x8ef6e427(int i17) {
        this.f125944p = i17;
    }

    /* renamed from: setPresenter */
    public void m20074x24cd7466(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.d dVar) {
        this.C = dVar;
    }
}

package com.google.android.material.bottomnavigation;

/* loaded from: classes15.dex */
public class BottomNavigationMenuView extends android.view.ViewGroup implements o.i0 {
    public static final int[] E = {android.R.attr.state_checked};
    public static final int[] F = {-16842910};
    public int A;
    public final int[] B;
    public com.google.android.material.bottomnavigation.d C;
    public o.r D;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.transition.TransitionSet f44402d;

    /* renamed from: e, reason: collision with root package name */
    public final int f44403e;

    /* renamed from: f, reason: collision with root package name */
    public final int f44404f;

    /* renamed from: g, reason: collision with root package name */
    public final int f44405g;

    /* renamed from: h, reason: collision with root package name */
    public final int f44406h;

    /* renamed from: i, reason: collision with root package name */
    public final int f44407i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View.OnClickListener f44408m;

    /* renamed from: n, reason: collision with root package name */
    public final m3.e f44409n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f44410o;

    /* renamed from: p, reason: collision with root package name */
    public int f44411p;

    /* renamed from: q, reason: collision with root package name */
    public com.google.android.material.bottomnavigation.BottomNavigationItemView[] f44412q;

    /* renamed from: r, reason: collision with root package name */
    public int f44413r;

    /* renamed from: s, reason: collision with root package name */
    public int f44414s;

    /* renamed from: t, reason: collision with root package name */
    public android.content.res.ColorStateList f44415t;

    /* renamed from: u, reason: collision with root package name */
    public int f44416u;

    /* renamed from: v, reason: collision with root package name */
    public android.content.res.ColorStateList f44417v;

    /* renamed from: w, reason: collision with root package name */
    public final android.content.res.ColorStateList f44418w;

    /* renamed from: x, reason: collision with root package name */
    public int f44419x;

    /* renamed from: y, reason: collision with root package name */
    public int f44420y;

    /* renamed from: z, reason: collision with root package name */
    public android.graphics.drawable.Drawable f44421z;

    public BottomNavigationMenuView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44409n = new m3.g(5);
        this.f44413r = 0;
        this.f44414s = 0;
        android.content.res.Resources resources = getResources();
        this.f44403e = resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f480273t6);
        this.f44404f = resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f480274t7);
        this.f44405g = resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f480267t0);
        this.f44406h = resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f480268t1);
        this.f44407i = resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f480271t4);
        this.f44418w = b(android.R.attr.textColorSecondary);
        androidx.transition.AutoTransition autoTransition = new androidx.transition.AutoTransition();
        this.f44402d = autoTransition;
        autoTransition.b0(0);
        autoTransition.Z(115L);
        autoTransition.a0(new y3.b());
        autoTransition.X(new fa.c0());
        this.f44408m = new com.google.android.material.bottomnavigation.b(this);
        this.B = new int[5];
    }

    private com.google.android.material.bottomnavigation.BottomNavigationItemView getNewItem() {
        com.google.android.material.bottomnavigation.BottomNavigationItemView bottomNavigationItemView = (com.google.android.material.bottomnavigation.BottomNavigationItemView) ((m3.g) this.f44409n).a();
        return bottomNavigationItemView == null ? new com.google.android.material.bottomnavigation.BottomNavigationItemView(getContext(), null) : bottomNavigationItemView;
    }

    public void a() {
        removeAllViews();
        com.google.android.material.bottomnavigation.BottomNavigationItemView[] bottomNavigationItemViewArr = this.f44412q;
        if (bottomNavigationItemViewArr != null) {
            for (com.google.android.material.bottomnavigation.BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                if (bottomNavigationItemView != null) {
                    ((m3.g) this.f44409n).b(bottomNavigationItemView);
                }
            }
        }
        if (this.D.size() == 0) {
            this.f44413r = 0;
            this.f44414s = 0;
            this.f44412q = null;
            return;
        }
        this.f44412q = new com.google.android.material.bottomnavigation.BottomNavigationItemView[this.D.size()];
        int i17 = this.f44411p;
        boolean z17 = i17 != -1 ? i17 == 0 : this.D.l().size() > 3;
        for (int i18 = 0; i18 < this.D.size(); i18++) {
            this.C.f44431e = true;
            this.D.getItem(i18).setCheckable(true);
            this.C.f44431e = false;
            com.google.android.material.bottomnavigation.BottomNavigationItemView newItem = getNewItem();
            this.f44412q[i18] = newItem;
            newItem.setIconTintList(this.f44415t);
            newItem.setIconSize(this.f44416u);
            newItem.setTextColor(this.f44418w);
            newItem.setTextAppearanceInactive(this.f44419x);
            newItem.setTextAppearanceActive(this.f44420y);
            newItem.setTextColor(this.f44417v);
            android.graphics.drawable.Drawable drawable = this.f44421z;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.A);
            }
            newItem.setShifting(z17);
            newItem.setLabelVisibilityMode(this.f44411p);
            newItem.a((o.u) this.D.getItem(i18), 0);
            newItem.setItemPosition(i18);
            newItem.setOnClickListener(this.f44408m);
            addView(newItem);
        }
        int min = java.lang.Math.min(this.D.size() - 1, this.f44414s);
        this.f44414s = min;
        this.D.getItem(min).setChecked(true);
    }

    public android.content.res.ColorStateList b(int i17) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (!getContext().getTheme().resolveAttribute(i17, typedValue, true)) {
            return null;
        }
        android.content.Context context = getContext();
        int i18 = typedValue.resourceId;
        java.lang.Object obj = k.a.f302856a;
        android.content.res.ColorStateList colorStateList = context.getColorStateList(i18);
        if (!getContext().getTheme().resolveAttribute(com.tencent.mm.R.attr.f478177cq, typedValue, true)) {
            return null;
        }
        int i19 = typedValue.data;
        int defaultColor = colorStateList.getDefaultColor();
        int[] iArr = F;
        return new android.content.res.ColorStateList(new int[][]{iArr, E, android.view.ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i19, defaultColor});
    }

    public android.content.res.ColorStateList getIconTintList() {
        return this.f44415t;
    }

    public android.graphics.drawable.Drawable getItemBackground() {
        com.google.android.material.bottomnavigation.BottomNavigationItemView[] bottomNavigationItemViewArr = this.f44412q;
        return (bottomNavigationItemViewArr == null || bottomNavigationItemViewArr.length <= 0) ? this.f44421z : bottomNavigationItemViewArr[0].getBackground();
    }

    @java.lang.Deprecated
    public int getItemBackgroundRes() {
        return this.A;
    }

    public int getItemIconSize() {
        return this.f44416u;
    }

    public int getItemTextAppearanceActive() {
        return this.f44420y;
    }

    public int getItemTextAppearanceInactive() {
        return this.f44419x;
    }

    public android.content.res.ColorStateList getItemTextColor() {
        return this.f44417v;
    }

    public int getLabelVisibilityMode() {
        return this.f44411p;
    }

    public int getSelectedItemId() {
        return this.f44413r;
    }

    public int getWindowAnimations() {
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
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
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
        int i19 = this.f44407i;
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i19, 1073741824);
        int i27 = this.f44411p;
        boolean z17 = i27 != -1 ? i27 == 0 : size2 > 3;
        int i28 = this.f44405g;
        int[] iArr = this.B;
        if (z17 && this.f44410o) {
            android.view.View childAt = getChildAt(this.f44414s);
            int visibility = childAt.getVisibility();
            int i29 = this.f44406h;
            if (visibility != 8) {
                childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(i28, Integer.MIN_VALUE), makeMeasureSpec);
                i29 = java.lang.Math.max(i29, childAt.getMeasuredWidth());
            }
            int i37 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min = java.lang.Math.min(size - (this.f44404f * i37), java.lang.Math.min(i29, i28));
            int i38 = size - min;
            int min2 = java.lang.Math.min(i38 / (i37 != 0 ? i37 : 1), this.f44403e);
            int i39 = i38 - (i37 * min2);
            int i47 = 0;
            while (i47 < childCount) {
                if (getChildAt(i47).getVisibility() != 8) {
                    int i48 = i47 == this.f44414s ? min : min2;
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

    public void setIconTintList(android.content.res.ColorStateList colorStateList) {
        this.f44415t = colorStateList;
        com.google.android.material.bottomnavigation.BottomNavigationItemView[] bottomNavigationItemViewArr = this.f44412q;
        if (bottomNavigationItemViewArr != null) {
            for (com.google.android.material.bottomnavigation.BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemBackground(android.graphics.drawable.Drawable drawable) {
        this.f44421z = drawable;
        com.google.android.material.bottomnavigation.BottomNavigationItemView[] bottomNavigationItemViewArr = this.f44412q;
        if (bottomNavigationItemViewArr != null) {
            for (com.google.android.material.bottomnavigation.BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i17) {
        this.A = i17;
        com.google.android.material.bottomnavigation.BottomNavigationItemView[] bottomNavigationItemViewArr = this.f44412q;
        if (bottomNavigationItemViewArr != null) {
            for (com.google.android.material.bottomnavigation.BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setItemBackground(i17);
            }
        }
    }

    public void setItemHorizontalTranslationEnabled(boolean z17) {
        this.f44410o = z17;
    }

    public void setItemIconSize(int i17) {
        this.f44416u = i17;
        com.google.android.material.bottomnavigation.BottomNavigationItemView[] bottomNavigationItemViewArr = this.f44412q;
        if (bottomNavigationItemViewArr != null) {
            for (com.google.android.material.bottomnavigation.BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setIconSize(i17);
            }
        }
    }

    public void setItemTextAppearanceActive(int i17) {
        this.f44420y = i17;
        com.google.android.material.bottomnavigation.BottomNavigationItemView[] bottomNavigationItemViewArr = this.f44412q;
        if (bottomNavigationItemViewArr != null) {
            for (com.google.android.material.bottomnavigation.BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setTextAppearanceActive(i17);
                android.content.res.ColorStateList colorStateList = this.f44417v;
                if (colorStateList != null) {
                    bottomNavigationItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i17) {
        this.f44419x = i17;
        com.google.android.material.bottomnavigation.BottomNavigationItemView[] bottomNavigationItemViewArr = this.f44412q;
        if (bottomNavigationItemViewArr != null) {
            for (com.google.android.material.bottomnavigation.BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setTextAppearanceInactive(i17);
                android.content.res.ColorStateList colorStateList = this.f44417v;
                if (colorStateList != null) {
                    bottomNavigationItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(android.content.res.ColorStateList colorStateList) {
        this.f44417v = colorStateList;
        com.google.android.material.bottomnavigation.BottomNavigationItemView[] bottomNavigationItemViewArr = this.f44412q;
        if (bottomNavigationItemViewArr != null) {
            for (com.google.android.material.bottomnavigation.BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i17) {
        this.f44411p = i17;
    }

    public void setPresenter(com.google.android.material.bottomnavigation.d dVar) {
        this.C = dVar;
    }
}

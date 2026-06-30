package com.google.android.material.navigation;

/* loaded from: classes15.dex */
public class NavigationView extends com.google.android.material.internal.ScrimInsetsFrameLayout {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f44524n = {android.R.attr.state_checked};

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f44525o = {-16842910};

    /* renamed from: g, reason: collision with root package name */
    public final fa.h f44526g;

    /* renamed from: h, reason: collision with root package name */
    public final fa.u f44527h;

    /* renamed from: i, reason: collision with root package name */
    public final int f44528i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.MenuInflater f44529m;

    /* loaded from: classes15.dex */
    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<com.google.android.material.navigation.NavigationView.SavedState> CREATOR = new com.google.android.material.navigation.a();

        /* renamed from: f, reason: collision with root package name */
        public android.os.Bundle f44530f;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f44530f = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeParcelable(this.f11112d, i17);
            parcel.writeBundle(this.f44530f);
        }
    }

    public NavigationView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.tencent.mm.R.attr.f478351hi);
    }

    private android.view.MenuInflater getMenuInflater() {
        if (this.f44529m == null) {
            this.f44529m = new n.j(getContext());
        }
        return this.f44529m;
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    public void a(n3.g3 g3Var) {
        fa.u uVar = this.f44527h;
        uVar.getClass();
        int e17 = g3Var.e();
        if (uVar.f260647t != e17) {
            uVar.f260647t = e17;
            if (uVar.f260635e.getChildCount() == 0) {
                com.google.android.material.internal.NavigationMenuView navigationMenuView = uVar.f260634d;
                navigationMenuView.setPadding(0, uVar.f260647t, 0, navigationMenuView.getPaddingBottom());
            }
        }
        n3.l1.b(uVar.f260635e, g3Var);
    }

    public final android.content.res.ColorStateList b(int i17) {
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
        int[] iArr = f44525o;
        return new android.content.res.ColorStateList(new int[][]{iArr, f44524n, android.widget.FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i19, defaultColor});
    }

    public android.view.MenuItem getCheckedItem() {
        return this.f44527h.f260638h.f260627e;
    }

    public int getHeaderCount() {
        return this.f44527h.f260635e.getChildCount();
    }

    public android.graphics.drawable.Drawable getItemBackground() {
        return this.f44527h.f260644q;
    }

    public int getItemHorizontalPadding() {
        return this.f44527h.f260645r;
    }

    public int getItemIconPadding() {
        return this.f44527h.f260646s;
    }

    public android.content.res.ColorStateList getItemIconTintList() {
        return this.f44527h.f260643p;
    }

    public android.content.res.ColorStateList getItemTextColor() {
        return this.f44527h.f260642o;
    }

    public android.view.Menu getMenu() {
        return this.f44526g;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        int mode = android.view.View.MeasureSpec.getMode(i17);
        int i19 = this.f44528i;
        if (mode == Integer.MIN_VALUE) {
            i17 = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(android.view.View.MeasureSpec.getSize(i17), i19), 1073741824);
        } else if (mode == 0) {
            i17 = android.view.View.MeasureSpec.makeMeasureSpec(i19, 1073741824);
        }
        super.onMeasure(i17, i18);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof com.google.android.material.navigation.NavigationView.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.google.android.material.navigation.NavigationView.SavedState savedState = (com.google.android.material.navigation.NavigationView.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f11112d);
        this.f44526g.t(savedState.f44530f);
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        com.google.android.material.navigation.NavigationView.SavedState savedState = new com.google.android.material.navigation.NavigationView.SavedState(super.onSaveInstanceState());
        android.os.Bundle bundle = new android.os.Bundle();
        savedState.f44530f = bundle;
        this.f44526g.v(bundle);
        return savedState;
    }

    public void setCheckedItem(int i17) {
        android.view.MenuItem findItem = this.f44526g.findItem(i17);
        if (findItem != null) {
            this.f44527h.f260638h.y((o.u) findItem);
        }
    }

    public void setItemBackground(android.graphics.drawable.Drawable drawable) {
        fa.u uVar = this.f44527h;
        uVar.f260644q = drawable;
        uVar.c(false);
    }

    public void setItemBackgroundResource(int i17) {
        setItemBackground(b3.l.getDrawable(getContext(), i17));
    }

    public void setItemHorizontalPadding(int i17) {
        fa.u uVar = this.f44527h;
        uVar.f260645r = i17;
        uVar.c(false);
    }

    public void setItemHorizontalPaddingResource(int i17) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i17);
        fa.u uVar = this.f44527h;
        uVar.f260645r = dimensionPixelSize;
        uVar.c(false);
    }

    public void setItemIconPadding(int i17) {
        fa.u uVar = this.f44527h;
        uVar.f260646s = i17;
        uVar.c(false);
    }

    public void setItemIconPaddingResource(int i17) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i17);
        fa.u uVar = this.f44527h;
        uVar.f260646s = dimensionPixelSize;
        uVar.c(false);
    }

    public void setItemIconTintList(android.content.res.ColorStateList colorStateList) {
        fa.u uVar = this.f44527h;
        uVar.f260643p = colorStateList;
        uVar.c(false);
    }

    public void setItemTextAppearance(int i17) {
        fa.u uVar = this.f44527h;
        uVar.f260640m = i17;
        uVar.f260641n = true;
        uVar.c(false);
    }

    public void setItemTextColor(android.content.res.ColorStateList colorStateList) {
        fa.u uVar = this.f44527h;
        uVar.f260642o = colorStateList;
        uVar.c(false);
    }

    public void setNavigationItemSelectedListener(ha.b bVar) {
    }

    public NavigationView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.content.res.ColorStateList b17;
        int i18;
        boolean z17;
        fa.u uVar = new fa.u();
        this.f44527h = uVar;
        fa.h hVar = new fa.h(context);
        this.f44526g = hVar;
        int[] iArr = v9.a.f434126p;
        fa.d0.a(context, attributeSet, i17, com.tencent.mm.R.style.f494748v6);
        fa.d0.b(context, attributeSet, iArr, i17, com.tencent.mm.R.style.f494748v6, new int[0]);
        androidx.appcompat.widget.q2 q2Var = new androidx.appcompat.widget.q2(context, context.obtainStyledAttributes(attributeSet, iArr, i17, com.tencent.mm.R.style.f494748v6));
        android.graphics.drawable.Drawable e17 = q2Var.e(0);
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.u0.q(this, e17);
        if (q2Var.k(3)) {
            n3.a1.s(this, q2Var.d(3, 0));
        }
        setFitsSystemWindows(q2Var.a(1, false));
        this.f44528i = q2Var.d(2, 0);
        if (q2Var.k(8)) {
            b17 = q2Var.b(8);
        } else {
            b17 = b(android.R.attr.textColorSecondary);
        }
        if (q2Var.k(9)) {
            i18 = q2Var.i(9, 0);
            z17 = true;
        } else {
            i18 = 0;
            z17 = false;
        }
        android.content.res.ColorStateList b18 = q2Var.k(10) ? q2Var.b(10) : null;
        if (!z17 && b18 == null) {
            b18 = b(android.R.attr.textColorPrimary);
        }
        android.graphics.drawable.Drawable e18 = q2Var.e(5);
        if (q2Var.k(6)) {
            uVar.f260645r = q2Var.d(6, 0);
            uVar.c(false);
        }
        int d17 = q2Var.d(7, 0);
        hVar.f341784h = new ha.a(this);
        uVar.f260637g = 1;
        uVar.d(context, hVar);
        uVar.f260643p = b17;
        uVar.c(false);
        if (z17) {
            uVar.f260640m = i18;
            uVar.f260641n = true;
            uVar.c(false);
        }
        uVar.f260642o = b18;
        uVar.c(false);
        uVar.f260644q = e18;
        uVar.c(false);
        uVar.f260646s = d17;
        uVar.c(false);
        hVar.b(uVar, hVar.f341780d);
        if (uVar.f260634d == null) {
            uVar.f260634d = (com.google.android.material.internal.NavigationMenuView) uVar.f260639i.inflate(com.tencent.mm.R.layout.f488702a40, (android.view.ViewGroup) this, false);
            if (uVar.f260638h == null) {
                uVar.f260638h = new fa.l(uVar);
            }
            uVar.f260635e = (android.widget.LinearLayout) uVar.f260639i.inflate(com.tencent.mm.R.layout.a3x, (android.view.ViewGroup) uVar.f260634d, false);
            uVar.f260634d.setAdapter(uVar.f260638h);
        }
        addView(uVar.f260634d);
        if (q2Var.k(11)) {
            int i19 = q2Var.i(11, 0);
            fa.l lVar = uVar.f260638h;
            if (lVar != null) {
                lVar.f260628f = true;
            }
            getMenuInflater().inflate(i19, hVar);
            fa.l lVar2 = uVar.f260638h;
            if (lVar2 != null) {
                lVar2.f260628f = false;
            }
            uVar.c(false);
        }
        if (q2Var.k(4)) {
            uVar.f260635e.addView(uVar.f260639i.inflate(q2Var.i(4, 0), (android.view.ViewGroup) uVar.f260635e, false));
            com.google.android.material.internal.NavigationMenuView navigationMenuView = uVar.f260634d;
            navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
        }
        q2Var.m();
    }

    public void setCheckedItem(android.view.MenuItem menuItem) {
        android.view.MenuItem findItem = this.f44526g.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.f44527h.f260638h.y((o.u) findItem);
            return;
        }
        throw new java.lang.IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}

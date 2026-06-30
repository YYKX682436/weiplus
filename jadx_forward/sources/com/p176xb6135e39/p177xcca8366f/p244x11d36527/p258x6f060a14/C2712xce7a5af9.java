package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p258x6f060a14;

/* renamed from: com.google.android.material.navigation.NavigationView */
/* loaded from: classes15.dex */
public class C2712xce7a5af9 extends com.p176xb6135e39.p177xcca8366f.p244x11d36527.p257x21ffc6bd.C2710xed0f221b {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f126057n = {android.R.attr.state_checked};

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f126058o = {-16842910};

    /* renamed from: g, reason: collision with root package name */
    public final fa.h f126059g;

    /* renamed from: h, reason: collision with root package name */
    public final fa.u f126060h;

    /* renamed from: i, reason: collision with root package name */
    public final int f126061i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.MenuInflater f126062m;

    /* renamed from: com.google.android.material.navigation.NavigationView$SavedState */
    /* loaded from: classes15.dex */
    public static class SavedState extends p012xc85e97e9.p080xa1c8a596.p081x373aa5.AbstractC1096x35cc803c {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.p244x11d36527.p258x6f060a14.C2712xce7a5af9.SavedState> f7861x681a0c0c = new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p258x6f060a14.a();

        /* renamed from: f, reason: collision with root package name */
        public android.os.Bundle f126063f;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f126063f = parcel.readBundle(classLoader);
        }

        @Override // p012xc85e97e9.p080xa1c8a596.p081x373aa5.AbstractC1096x35cc803c, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeParcelable(this.f92645d, i17);
            parcel.writeBundle(this.f126063f);
        }
    }

    public C2712xce7a5af9(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559884hi);
    }

    /* renamed from: getMenuInflater */
    private android.view.MenuInflater m20321x2ef72c40() {
        if (this.f126062m == null) {
            this.f126062m = new n.j(getContext());
        }
        return this.f126062m;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p257x21ffc6bd.C2710xed0f221b
    public void a(n3.g3 g3Var) {
        fa.u uVar = this.f126060h;
        uVar.getClass();
        int e17 = g3Var.e();
        if (uVar.f342180t != e17) {
            uVar.f342180t = e17;
            if (uVar.f342168e.getChildCount() == 0) {
                com.p176xb6135e39.p177xcca8366f.p244x11d36527.p257x21ffc6bd.C2708x9856d2f8 c2708x9856d2f8 = uVar.f342167d;
                c2708x9856d2f8.setPadding(0, uVar.f342180t, 0, c2708x9856d2f8.getPaddingBottom());
            }
        }
        n3.l1.b(uVar.f342168e, g3Var);
    }

    public final android.content.res.ColorStateList b(int i17) {
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
        int[] iArr = f126058o;
        return new android.content.res.ColorStateList(new int[][]{iArr, f126057n, android.widget.FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i19, defaultColor});
    }

    /* renamed from: getCheckedItem */
    public android.view.MenuItem m20322x2569da24() {
        return this.f126060h.f342171h.f342160e;
    }

    /* renamed from: getHeaderCount */
    public int m20323x1ede554c() {
        return this.f126060h.f342168e.getChildCount();
    }

    /* renamed from: getItemBackground */
    public android.graphics.drawable.Drawable m20324x3bcefd97() {
        return this.f126060h.f342177q;
    }

    /* renamed from: getItemHorizontalPadding */
    public int m20325x7dfd6c4() {
        return this.f126060h.f342178r;
    }

    /* renamed from: getItemIconPadding */
    public int m20326x8568b20f() {
        return this.f126060h.f342179s;
    }

    /* renamed from: getItemIconTintList */
    public android.content.res.ColorStateList m20327x8048cbfb() {
        return this.f126060h.f342176p;
    }

    /* renamed from: getItemTextColor */
    public android.content.res.ColorStateList m20328x72954ad() {
        return this.f126060h.f342175o;
    }

    /* renamed from: getMenu */
    public android.view.Menu m20329xfb827dd5() {
        return this.f126059g;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        int mode = android.view.View.MeasureSpec.getMode(i17);
        int i19 = this.f126061i;
        if (mode == Integer.MIN_VALUE) {
            i17 = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(android.view.View.MeasureSpec.getSize(i17), i19), 1073741824);
        } else if (mode == 0) {
            i17 = android.view.View.MeasureSpec.makeMeasureSpec(i19, 1073741824);
        }
        super.onMeasure(i17, i18);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p258x6f060a14.C2712xce7a5af9.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p258x6f060a14.C2712xce7a5af9.SavedState savedState = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p258x6f060a14.C2712xce7a5af9.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f92645d);
        this.f126059g.t(savedState.f126063f);
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p258x6f060a14.C2712xce7a5af9.SavedState savedState = new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p258x6f060a14.C2712xce7a5af9.SavedState(super.onSaveInstanceState());
        android.os.Bundle bundle = new android.os.Bundle();
        savedState.f126063f = bundle;
        this.f126059g.v(bundle);
        return savedState;
    }

    /* renamed from: setCheckedItem */
    public void m20330xbbcf4d98(int i17) {
        android.view.MenuItem findItem = this.f126059g.findItem(i17);
        if (findItem != null) {
            this.f126060h.f342171h.y((o.u) findItem);
        }
    }

    /* renamed from: setItemBackground */
    public void m20332x3c565a3(android.graphics.drawable.Drawable drawable) {
        fa.u uVar = this.f126060h;
        uVar.f342177q = drawable;
        uVar.c(false);
    }

    /* renamed from: setItemBackgroundResource */
    public void m20333xc5a93ad1(int i17) {
        m20332x3c565a3(b3.l.m9707x4a96be14(getContext(), i17));
    }

    /* renamed from: setItemHorizontalPadding */
    public void m20334xd7f28938(int i17) {
        fa.u uVar = this.f126060h;
        uVar.f342178r = i17;
        uVar.c(false);
    }

    /* renamed from: setItemHorizontalPaddingResource */
    public void m20335xc3d7f966(int i17) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i17);
        fa.u uVar = this.f126060h;
        uVar.f342178r = dimensionPixelSize;
        uVar.c(false);
    }

    /* renamed from: setItemIconPadding */
    public void m20336xbc3f4b83(int i17) {
        fa.u uVar = this.f126060h;
        uVar.f342179s = i17;
        uVar.c(false);
    }

    /* renamed from: setItemIconPaddingResource */
    public void m20337xe84f40b1(int i17) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i17);
        fa.u uVar = this.f126060h;
        uVar.f342179s = dimensionPixelSize;
        uVar.c(false);
    }

    /* renamed from: setItemIconTintList */
    public void m20338x24456107(android.content.res.ColorStateList colorStateList) {
        fa.u uVar = this.f126060h;
        uVar.f342176p = colorStateList;
        uVar.c(false);
    }

    /* renamed from: setItemTextAppearance */
    public void m20339x4396d766(int i17) {
        fa.u uVar = this.f126060h;
        uVar.f342173m = i17;
        uVar.f342174n = true;
        uVar.c(false);
    }

    /* renamed from: setItemTextColor */
    public void m20340x99ffbb21(android.content.res.ColorStateList colorStateList) {
        fa.u uVar = this.f126060h;
        uVar.f342175o = colorStateList;
        uVar.c(false);
    }

    /* renamed from: setNavigationItemSelectedListener */
    public void m20341x7ae2e6d8(ha.b bVar) {
    }

    public C2712xce7a5af9(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.content.res.ColorStateList b17;
        int i18;
        boolean z17;
        fa.u uVar = new fa.u();
        this.f126060h = uVar;
        fa.h hVar = new fa.h(context);
        this.f126059g = hVar;
        int[] iArr = v9.a.f515659p;
        fa.d0.a(context, attributeSet, i17, com.p314xaae8f345.mm.R.C30868x68b1db1.f576281v6);
        fa.d0.b(context, attributeSet, iArr, i17, com.p314xaae8f345.mm.R.C30868x68b1db1.f576281v6, new int[0]);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q2 q2Var = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q2(context, context.obtainStyledAttributes(attributeSet, iArr, i17, com.p314xaae8f345.mm.R.C30868x68b1db1.f576281v6));
        android.graphics.drawable.Drawable e17 = q2Var.e(0);
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.u0.q(this, e17);
        if (q2Var.k(3)) {
            n3.a1.s(this, q2Var.d(3, 0));
        }
        setFitsSystemWindows(q2Var.a(1, false));
        this.f126061i = q2Var.d(2, 0);
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
            uVar.f342178r = q2Var.d(6, 0);
            uVar.c(false);
        }
        int d17 = q2Var.d(7, 0);
        hVar.f423317h = new ha.a(this);
        uVar.f342170g = 1;
        uVar.d(context, hVar);
        uVar.f342176p = b17;
        uVar.c(false);
        if (z17) {
            uVar.f342173m = i18;
            uVar.f342174n = true;
            uVar.c(false);
        }
        uVar.f342175o = b18;
        uVar.c(false);
        uVar.f342177q = e18;
        uVar.c(false);
        uVar.f342179s = d17;
        uVar.c(false);
        hVar.b(uVar, hVar.f423313d);
        if (uVar.f342167d == null) {
            uVar.f342167d = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p257x21ffc6bd.C2708x9856d2f8) uVar.f342172i.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570235a40, (android.view.ViewGroup) this, false);
            if (uVar.f342171h == null) {
                uVar.f342171h = new fa.l(uVar);
            }
            uVar.f342168e = (android.widget.LinearLayout) uVar.f342172i.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a3x, (android.view.ViewGroup) uVar.f342167d, false);
            uVar.f342167d.mo7960x6cab2c8d(uVar.f342171h);
        }
        addView(uVar.f342167d);
        if (q2Var.k(11)) {
            int i19 = q2Var.i(11, 0);
            fa.l lVar = uVar.f342171h;
            if (lVar != null) {
                lVar.f342161f = true;
            }
            m20321x2ef72c40().inflate(i19, hVar);
            fa.l lVar2 = uVar.f342171h;
            if (lVar2 != null) {
                lVar2.f342161f = false;
            }
            uVar.c(false);
        }
        if (q2Var.k(4)) {
            uVar.f342168e.addView(uVar.f342172i.inflate(q2Var.i(4, 0), (android.view.ViewGroup) uVar.f342168e, false));
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p257x21ffc6bd.C2708x9856d2f8 c2708x9856d2f8 = uVar.f342167d;
            c2708x9856d2f8.setPadding(0, 0, 0, c2708x9856d2f8.getPaddingBottom());
        }
        q2Var.m();
    }

    /* renamed from: setCheckedItem */
    public void m20331xbbcf4d98(android.view.MenuItem menuItem) {
        android.view.MenuItem findItem = this.f126059g.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.f126060h.f342171h.y((o.u) findItem);
            return;
        }
        throw new java.lang.IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}

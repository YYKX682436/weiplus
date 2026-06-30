package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f;

/* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView */
/* loaded from: classes15.dex */
public class C2689x62d28204 extends android.widget.FrameLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f125956h = 0;

    /* renamed from: d, reason: collision with root package name */
    public final o.r f125957d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.C2687x66de7c83 f125958e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.d f125959f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.MenuInflater f125960g;

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$SavedState */
    /* loaded from: classes15.dex */
    public static class SavedState extends p012xc85e97e9.p080xa1c8a596.p081x373aa5.AbstractC1096x35cc803c {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.C2689x62d28204.SavedState> f7858x681a0c0c = new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.h();

        /* renamed from: f, reason: collision with root package name */
        public android.os.Bundle f125961f;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f125961f = parcel.readBundle(classLoader);
        }

        @Override // p012xc85e97e9.p080xa1c8a596.p081x373aa5.AbstractC1096x35cc803c, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeParcelable(this.f92645d, i17);
            parcel.writeBundle(this.f125961f);
        }
    }

    public C2689x62d28204(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559649b4);
    }

    /* renamed from: getMenuInflater */
    private android.view.MenuInflater m20076x2ef72c40() {
        if (this.f125960g == null) {
            this.f125960g = new n.j(getContext());
        }
        return this.f125960g;
    }

    /* renamed from: getItemBackground */
    public android.graphics.drawable.Drawable m20077x3bcefd97() {
        return this.f125958e.m20056x3bcefd97();
    }

    @java.lang.Deprecated
    /* renamed from: getItemBackgroundResource */
    public int m20078x93659ec5() {
        return this.f125958e.m20057xfcb9c789();
    }

    /* renamed from: getItemIconSize */
    public int m20079x5a6b5ac3() {
        return this.f125958e.m20058x5a6b5ac3();
    }

    /* renamed from: getItemIconTintList */
    public android.content.res.ColorStateList m20080x8048cbfb() {
        return this.f125958e.m20055x490d2c48();
    }

    /* renamed from: getItemTextAppearanceActive */
    public int m20081xef5cd500() {
        return this.f125958e.m20059xef5cd500();
    }

    /* renamed from: getItemTextAppearanceInactive */
    public int m20082xefa81be5() {
        return this.f125958e.m20060xefa81be5();
    }

    /* renamed from: getItemTextColor */
    public android.content.res.ColorStateList m20083x72954ad() {
        return this.f125958e.m20061x72954ad();
    }

    /* renamed from: getLabelVisibilityMode */
    public int m20084x40b224b3() {
        return this.f125958e.m20062x40b224b3();
    }

    /* renamed from: getMaxItemCount */
    public int m20085x8af0b72e() {
        return 5;
    }

    /* renamed from: getMenu */
    public android.view.Menu m20086xfb827dd5() {
        return this.f125957d;
    }

    /* renamed from: getSelectedItemId */
    public int m20087x4c6a16ff() {
        return this.f125958e.m20063x4c6a16ff();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.C2689x62d28204.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.C2689x62d28204.SavedState savedState = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.C2689x62d28204.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f92645d);
        this.f125957d.t(savedState.f125961f);
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.C2689x62d28204.SavedState savedState = new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.C2689x62d28204.SavedState(super.onSaveInstanceState());
        android.os.Bundle bundle = new android.os.Bundle();
        savedState.f125961f = bundle;
        this.f125957d.v(bundle);
        return savedState;
    }

    /* renamed from: setItemBackground */
    public void m20088x3c565a3(android.graphics.drawable.Drawable drawable) {
        this.f125958e.m20066x3c565a3(drawable);
    }

    /* renamed from: setItemBackgroundResource */
    public void m20089xc5a93ad1(int i17) {
        this.f125958e.m20067xd84fd3fd(i17);
    }

    /* renamed from: setItemHorizontalTranslationEnabled */
    public void m20090x8985bbc9(boolean z17) {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.C2687x66de7c83 c2687x66de7c83 = this.f125958e;
        if (c2687x66de7c83.f125943o != z17) {
            c2687x66de7c83.m20068x8985bbc9(z17);
            this.f125959f.c(false);
        }
    }

    /* renamed from: setItemIconSize */
    public void m20091x90b455cf(int i17) {
        this.f125958e.m20069x90b455cf(i17);
    }

    /* renamed from: setItemIconSizeRes */
    public void m20092x69cee451(int i17) {
        m20091x90b455cf(getResources().getDimensionPixelSize(i17));
    }

    /* renamed from: setItemIconTintList */
    public void m20093x24456107(android.content.res.ColorStateList colorStateList) {
        this.f125958e.m20065x7f562754(colorStateList);
    }

    /* renamed from: setItemTextAppearanceActive */
    public void m20094x9f299e0c(int i17) {
        this.f125958e.m20070x9f299e0c(i17);
    }

    /* renamed from: setItemTextAppearanceInactive */
    public void m20095xdf66d1f1(int i17) {
        this.f125958e.m20071xdf66d1f1(i17);
    }

    /* renamed from: setItemTextColor */
    public void m20096x99ffbb21(android.content.res.ColorStateList colorStateList) {
        this.f125958e.m20072x99ffbb21(colorStateList);
    }

    /* renamed from: setLabelVisibilityMode */
    public void m20097x8ef6e427(int i17) {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.C2687x66de7c83 c2687x66de7c83 = this.f125958e;
        if (c2687x66de7c83.m20062x40b224b3() != i17) {
            c2687x66de7c83.m20073x8ef6e427(i17);
            this.f125959f.c(false);
        }
    }

    /* renamed from: setOnNavigationItemReselectedListener */
    public void m20098xc376f64a(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.f fVar) {
    }

    /* renamed from: setOnNavigationItemSelectedListener */
    public void m20099x1806f817(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.g gVar) {
    }

    /* renamed from: setSelectedItemId */
    public void m20100x14607f0b(int i17) {
        o.r rVar = this.f125957d;
        android.view.MenuItem findItem = rVar.findItem(i17);
        if (findItem == null || rVar.q(findItem, this.f125959f, 0)) {
            return;
        }
        findItem.setChecked(true);
    }

    public C2689x62d28204(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.d dVar = new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.d();
        this.f125959f = dVar;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.a aVar = new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.a(context);
        this.f125957d = aVar;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.C2687x66de7c83 c2687x66de7c83 = new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.C2687x66de7c83(context, null);
        this.f125958e = c2687x66de7c83;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        c2687x66de7c83.setLayoutParams(layoutParams);
        dVar.f125963d = c2687x66de7c83;
        dVar.f125965f = 1;
        c2687x66de7c83.m20074x24cd7466(dVar);
        aVar.b(dVar, aVar.f423313d);
        getContext();
        dVar.f125963d.D = aVar;
        int[] iArr = v9.a.f515647d;
        fa.d0.a(context, attributeSet, i17, com.p314xaae8f345.mm.R.C30868x68b1db1.f576277v2);
        fa.d0.b(context, attributeSet, iArr, i17, com.p314xaae8f345.mm.R.C30868x68b1db1.f576277v2, 6, 5);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i17, com.p314xaae8f345.mm.R.C30868x68b1db1.f576277v2);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q2 q2Var = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q2(context, obtainStyledAttributes);
        if (q2Var.k(4)) {
            c2687x66de7c83.m20065x7f562754(q2Var.b(4));
        } else {
            c2687x66de7c83.m20065x7f562754(c2687x66de7c83.b(android.R.attr.textColorSecondary));
        }
        m20091x90b455cf(q2Var.d(3, getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561805t5)));
        if (q2Var.k(6)) {
            m20095xdf66d1f1(q2Var.i(6, 0));
        }
        if (q2Var.k(5)) {
            m20094x9f299e0c(q2Var.i(5, 0));
        }
        if (q2Var.k(7)) {
            m20096x99ffbb21(q2Var.b(7));
        }
        if (q2Var.k(0)) {
            float d17 = q2Var.d(0, 0);
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.a1.s(this, d17);
        }
        m20097x8ef6e427(obtainStyledAttributes.getInteger(8, -1));
        m20090x8985bbc9(q2Var.a(2, true));
        c2687x66de7c83.m20067xd84fd3fd(q2Var.i(1, 0));
        if (q2Var.k(9)) {
            int i18 = q2Var.i(9, 0);
            dVar.f125964e = true;
            m20076x2ef72c40().inflate(i18, aVar);
            dVar.f125964e = false;
            dVar.c(true);
        }
        q2Var.m();
        addView(c2687x66de7c83, layoutParams);
        aVar.f423317h = new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.e(this);
    }
}

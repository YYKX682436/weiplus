package com.google.android.material.bottomnavigation;

/* loaded from: classes15.dex */
public class BottomNavigationView extends android.widget.FrameLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f44423h = 0;

    /* renamed from: d, reason: collision with root package name */
    public final o.r f44424d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.android.material.bottomnavigation.BottomNavigationMenuView f44425e;

    /* renamed from: f, reason: collision with root package name */
    public final com.google.android.material.bottomnavigation.d f44426f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.MenuInflater f44427g;

    /* loaded from: classes15.dex */
    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<com.google.android.material.bottomnavigation.BottomNavigationView.SavedState> CREATOR = new com.google.android.material.bottomnavigation.h();

        /* renamed from: f, reason: collision with root package name */
        public android.os.Bundle f44428f;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f44428f = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeParcelable(this.f11112d, i17);
            parcel.writeBundle(this.f44428f);
        }
    }

    public BottomNavigationView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.tencent.mm.R.attr.f478116b4);
    }

    private android.view.MenuInflater getMenuInflater() {
        if (this.f44427g == null) {
            this.f44427g = new n.j(getContext());
        }
        return this.f44427g;
    }

    public android.graphics.drawable.Drawable getItemBackground() {
        return this.f44425e.getItemBackground();
    }

    @java.lang.Deprecated
    public int getItemBackgroundResource() {
        return this.f44425e.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f44425e.getItemIconSize();
    }

    public android.content.res.ColorStateList getItemIconTintList() {
        return this.f44425e.getIconTintList();
    }

    public int getItemTextAppearanceActive() {
        return this.f44425e.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f44425e.getItemTextAppearanceInactive();
    }

    public android.content.res.ColorStateList getItemTextColor() {
        return this.f44425e.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f44425e.getLabelVisibilityMode();
    }

    public int getMaxItemCount() {
        return 5;
    }

    public android.view.Menu getMenu() {
        return this.f44424d;
    }

    public int getSelectedItemId() {
        return this.f44425e.getSelectedItemId();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof com.google.android.material.bottomnavigation.BottomNavigationView.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.google.android.material.bottomnavigation.BottomNavigationView.SavedState savedState = (com.google.android.material.bottomnavigation.BottomNavigationView.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f11112d);
        this.f44424d.t(savedState.f44428f);
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        com.google.android.material.bottomnavigation.BottomNavigationView.SavedState savedState = new com.google.android.material.bottomnavigation.BottomNavigationView.SavedState(super.onSaveInstanceState());
        android.os.Bundle bundle = new android.os.Bundle();
        savedState.f44428f = bundle;
        this.f44424d.v(bundle);
        return savedState;
    }

    public void setItemBackground(android.graphics.drawable.Drawable drawable) {
        this.f44425e.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i17) {
        this.f44425e.setItemBackgroundRes(i17);
    }

    public void setItemHorizontalTranslationEnabled(boolean z17) {
        com.google.android.material.bottomnavigation.BottomNavigationMenuView bottomNavigationMenuView = this.f44425e;
        if (bottomNavigationMenuView.f44410o != z17) {
            bottomNavigationMenuView.setItemHorizontalTranslationEnabled(z17);
            this.f44426f.c(false);
        }
    }

    public void setItemIconSize(int i17) {
        this.f44425e.setItemIconSize(i17);
    }

    public void setItemIconSizeRes(int i17) {
        setItemIconSize(getResources().getDimensionPixelSize(i17));
    }

    public void setItemIconTintList(android.content.res.ColorStateList colorStateList) {
        this.f44425e.setIconTintList(colorStateList);
    }

    public void setItemTextAppearanceActive(int i17) {
        this.f44425e.setItemTextAppearanceActive(i17);
    }

    public void setItemTextAppearanceInactive(int i17) {
        this.f44425e.setItemTextAppearanceInactive(i17);
    }

    public void setItemTextColor(android.content.res.ColorStateList colorStateList) {
        this.f44425e.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i17) {
        com.google.android.material.bottomnavigation.BottomNavigationMenuView bottomNavigationMenuView = this.f44425e;
        if (bottomNavigationMenuView.getLabelVisibilityMode() != i17) {
            bottomNavigationMenuView.setLabelVisibilityMode(i17);
            this.f44426f.c(false);
        }
    }

    public void setOnNavigationItemReselectedListener(com.google.android.material.bottomnavigation.f fVar) {
    }

    public void setOnNavigationItemSelectedListener(com.google.android.material.bottomnavigation.g gVar) {
    }

    public void setSelectedItemId(int i17) {
        o.r rVar = this.f44424d;
        android.view.MenuItem findItem = rVar.findItem(i17);
        if (findItem == null || rVar.q(findItem, this.f44426f, 0)) {
            return;
        }
        findItem.setChecked(true);
    }

    public BottomNavigationView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        com.google.android.material.bottomnavigation.d dVar = new com.google.android.material.bottomnavigation.d();
        this.f44426f = dVar;
        com.google.android.material.bottomnavigation.a aVar = new com.google.android.material.bottomnavigation.a(context);
        this.f44424d = aVar;
        com.google.android.material.bottomnavigation.BottomNavigationMenuView bottomNavigationMenuView = new com.google.android.material.bottomnavigation.BottomNavigationMenuView(context, null);
        this.f44425e = bottomNavigationMenuView;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        bottomNavigationMenuView.setLayoutParams(layoutParams);
        dVar.f44430d = bottomNavigationMenuView;
        dVar.f44432f = 1;
        bottomNavigationMenuView.setPresenter(dVar);
        aVar.b(dVar, aVar.f341780d);
        getContext();
        dVar.f44430d.D = aVar;
        int[] iArr = v9.a.f434114d;
        fa.d0.a(context, attributeSet, i17, com.tencent.mm.R.style.f494744v2);
        fa.d0.b(context, attributeSet, iArr, i17, com.tencent.mm.R.style.f494744v2, 6, 5);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i17, com.tencent.mm.R.style.f494744v2);
        androidx.appcompat.widget.q2 q2Var = new androidx.appcompat.widget.q2(context, obtainStyledAttributes);
        if (q2Var.k(4)) {
            bottomNavigationMenuView.setIconTintList(q2Var.b(4));
        } else {
            bottomNavigationMenuView.setIconTintList(bottomNavigationMenuView.b(android.R.attr.textColorSecondary));
        }
        setItemIconSize(q2Var.d(3, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480272t5)));
        if (q2Var.k(6)) {
            setItemTextAppearanceInactive(q2Var.i(6, 0));
        }
        if (q2Var.k(5)) {
            setItemTextAppearanceActive(q2Var.i(5, 0));
        }
        if (q2Var.k(7)) {
            setItemTextColor(q2Var.b(7));
        }
        if (q2Var.k(0)) {
            float d17 = q2Var.d(0, 0);
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.a1.s(this, d17);
        }
        setLabelVisibilityMode(obtainStyledAttributes.getInteger(8, -1));
        setItemHorizontalTranslationEnabled(q2Var.a(2, true));
        bottomNavigationMenuView.setItemBackgroundRes(q2Var.i(1, 0));
        if (q2Var.k(9)) {
            int i18 = q2Var.i(9, 0);
            dVar.f44431e = true;
            getMenuInflater().inflate(i18, aVar);
            dVar.f44431e = false;
            dVar.c(true);
        }
        q2Var.m();
        addView(bottomNavigationMenuView, layoutParams);
        aVar.f341784h = new com.google.android.material.bottomnavigation.e(this);
    }
}

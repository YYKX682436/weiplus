package com.google.android.material.bottomnavigation;

/* loaded from: classes15.dex */
public class d implements o.g0 {

    /* renamed from: d, reason: collision with root package name */
    public com.google.android.material.bottomnavigation.BottomNavigationMenuView f44430d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f44431e = false;

    /* renamed from: f, reason: collision with root package name */
    public int f44432f;

    @Override // o.g0
    public void a(o.r rVar, boolean z17) {
    }

    @Override // o.g0
    public android.os.Parcelable b() {
        com.google.android.material.bottomnavigation.BottomNavigationPresenter$SavedState bottomNavigationPresenter$SavedState = new com.google.android.material.bottomnavigation.BottomNavigationPresenter$SavedState();
        bottomNavigationPresenter$SavedState.f44422d = this.f44430d.getSelectedItemId();
        return bottomNavigationPresenter$SavedState;
    }

    @Override // o.g0
    public void c(boolean z17) {
        if (this.f44431e) {
            return;
        }
        if (z17) {
            this.f44430d.a();
            return;
        }
        com.google.android.material.bottomnavigation.BottomNavigationMenuView bottomNavigationMenuView = this.f44430d;
        o.r rVar = bottomNavigationMenuView.D;
        if (rVar == null || bottomNavigationMenuView.f44412q == null) {
            return;
        }
        int size = rVar.size();
        if (size != bottomNavigationMenuView.f44412q.length) {
            bottomNavigationMenuView.a();
            return;
        }
        int i17 = bottomNavigationMenuView.f44413r;
        for (int i18 = 0; i18 < size; i18++) {
            android.view.MenuItem item = bottomNavigationMenuView.D.getItem(i18);
            if (item.isChecked()) {
                bottomNavigationMenuView.f44413r = item.getItemId();
                bottomNavigationMenuView.f44414s = i18;
            }
        }
        if (i17 != bottomNavigationMenuView.f44413r) {
            u4.g1.a(bottomNavigationMenuView, bottomNavigationMenuView.f44402d);
        }
        int i19 = bottomNavigationMenuView.f44411p;
        boolean z18 = i19 != -1 ? i19 == 0 : bottomNavigationMenuView.D.l().size() > 3;
        for (int i27 = 0; i27 < size; i27++) {
            bottomNavigationMenuView.C.f44431e = true;
            bottomNavigationMenuView.f44412q[i27].setLabelVisibilityMode(bottomNavigationMenuView.f44411p);
            bottomNavigationMenuView.f44412q[i27].setShifting(z18);
            bottomNavigationMenuView.f44412q[i27].a((o.u) bottomNavigationMenuView.D.getItem(i27), 0);
            bottomNavigationMenuView.C.f44431e = false;
        }
    }

    @Override // o.g0
    public void d(android.content.Context context, o.r rVar) {
        this.f44430d.D = rVar;
    }

    @Override // o.g0
    public boolean e() {
        return false;
    }

    @Override // o.g0
    public void f(android.os.Parcelable parcelable) {
        if (parcelable instanceof com.google.android.material.bottomnavigation.BottomNavigationPresenter$SavedState) {
            com.google.android.material.bottomnavigation.BottomNavigationMenuView bottomNavigationMenuView = this.f44430d;
            int i17 = ((com.google.android.material.bottomnavigation.BottomNavigationPresenter$SavedState) parcelable).f44422d;
            int size = bottomNavigationMenuView.D.size();
            for (int i18 = 0; i18 < size; i18++) {
                android.view.MenuItem item = bottomNavigationMenuView.D.getItem(i18);
                if (i17 == item.getItemId()) {
                    bottomNavigationMenuView.f44413r = i17;
                    bottomNavigationMenuView.f44414s = i18;
                    item.setChecked(true);
                    return;
                }
            }
        }
    }

    @Override // o.g0
    public int getId() {
        return this.f44432f;
    }

    @Override // o.g0
    public boolean h(o.r rVar, o.u uVar) {
        return false;
    }

    @Override // o.g0
    public boolean i(o.o0 o0Var) {
        return false;
    }

    @Override // o.g0
    public boolean j(o.r rVar, o.u uVar) {
        return false;
    }
}

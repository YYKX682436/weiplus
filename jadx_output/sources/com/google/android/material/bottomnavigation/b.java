package com.google.android.material.bottomnavigation;

/* loaded from: classes15.dex */
public class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.bottomnavigation.BottomNavigationMenuView f44429d;

    public b(com.google.android.material.bottomnavigation.BottomNavigationMenuView bottomNavigationMenuView) {
        this.f44429d = bottomNavigationMenuView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        o.u itemData = ((com.google.android.material.bottomnavigation.BottomNavigationItemView) view).getItemData();
        com.google.android.material.bottomnavigation.BottomNavigationMenuView bottomNavigationMenuView = this.f44429d;
        if (bottomNavigationMenuView.D.q(itemData, bottomNavigationMenuView.C, 0)) {
            return;
        }
        itemData.setChecked(true);
    }
}

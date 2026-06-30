package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f;

/* loaded from: classes15.dex */
public final class a extends o.r {
    @Override // o.r
    public android.view.MenuItem a(int i17, int i18, int i19, java.lang.CharSequence charSequence) {
        if (size() + 1 > 5) {
            throw new java.lang.IllegalArgumentException("Maximum number of items supported by BottomNavigationView is 5. Limit can be checked with BottomNavigationView#getMaxItemCount()");
        }
        z();
        android.view.MenuItem a17 = super.a(i17, i18, i19, charSequence);
        ((o.u) a17).f(true);
        y();
        return a17;
    }

    @Override // o.r, android.view.Menu
    public android.view.SubMenu addSubMenu(int i17, int i18, int i19, java.lang.CharSequence charSequence) {
        throw new java.lang.UnsupportedOperationException("BottomNavigationView does not support submenus");
    }
}

package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class g5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavSearchUI f100863d;

    public g5(com.tencent.mm.plugin.fav.ui.FavSearchUI favSearchUI) {
        this.f100863d = favSearchUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fav.ui.FavSearchUI favSearchUI = this.f100863d;
        android.view.MenuItem menuItem = favSearchUI.C;
        if (menuItem != null) {
            menuItem.expandActionView();
            androidx.appcompat.widget.Toolbar.LayoutParams layoutParams = (androidx.appcompat.widget.Toolbar.LayoutParams) favSearchUI.f100402p.getLayoutParams();
            if (layoutParams != null) {
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).height = -1;
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).width = -1;
            }
            favSearchUI.f100402p.setLayoutParams(layoutParams);
        }
    }
}

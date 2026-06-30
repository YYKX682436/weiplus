package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class y5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandNearbyEmptyUI f90347d;

    public y5(com.tencent.mm.plugin.appbrand.ui.AppBrandNearbyEmptyUI appBrandNearbyEmptyUI) {
        this.f90347d = appBrandNearbyEmptyUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f90347d.onBackPressed();
        return true;
    }
}

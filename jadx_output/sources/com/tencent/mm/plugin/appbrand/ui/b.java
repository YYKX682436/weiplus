package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes.dex */
public class b implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrand404PageUI f89563d;

    public b(com.tencent.mm.plugin.appbrand.ui.AppBrand404PageUI appBrand404PageUI) {
        this.f89563d = appBrand404PageUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f89563d.finish();
        return true;
    }
}

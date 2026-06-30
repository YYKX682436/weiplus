package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes8.dex */
public class vb implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandVoIPDeviceListAuthorizeUI f90282d;

    public vb(com.tencent.mm.plugin.appbrand.ui.AppBrandVoIPDeviceListAuthorizeUI appBrandVoIPDeviceListAuthorizeUI) {
        this.f90282d = appBrandVoIPDeviceListAuthorizeUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f90282d.finish();
        return false;
    }
}

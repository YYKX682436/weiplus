package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes9.dex */
public class l0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI f89840d;

    public l0(com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI) {
        this.f89840d = appBrandAuthorizeUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        java.lang.String[] strArr = com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.Z;
        com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI = this.f89840d;
        appBrandAuthorizeUI.m7();
        appBrandAuthorizeUI.finish();
        return false;
    }
}

package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes15.dex */
public class h implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeDetailUI f89745d;

    public h(com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeDetailUI appBrandAuthorizeDetailUI) {
        this.f89745d = appBrandAuthorizeDetailUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int[] iArr = com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeDetailUI.f89284r;
        com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeDetailUI appBrandAuthorizeDetailUI = this.f89745d;
        appBrandAuthorizeDetailUI.W6();
        appBrandAuthorizeDetailUI.finish();
        return false;
    }
}

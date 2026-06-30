package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class pa implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandUserInfoAuthorizeUI f89923d;

    public pa(com.tencent.mm.plugin.appbrand.ui.AppBrandUserInfoAuthorizeUI appBrandUserInfoAuthorizeUI) {
        this.f89923d = appBrandUserInfoAuthorizeUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f89923d.finish();
        return false;
    }
}

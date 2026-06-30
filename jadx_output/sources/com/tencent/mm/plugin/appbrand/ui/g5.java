package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class g5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI f89727d;

    public g5(com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI appBrandLauncherUI) {
        this.f89727d = appBrandLauncherUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f89727d.finish();
        return true;
    }
}

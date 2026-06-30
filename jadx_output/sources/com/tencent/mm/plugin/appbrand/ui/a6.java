package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes5.dex */
public class a6 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandOpenWeRunSettingUI f89503d;

    public a6(com.tencent.mm.plugin.appbrand.ui.AppBrandOpenWeRunSettingUI appBrandOpenWeRunSettingUI) {
        this.f89503d = appBrandOpenWeRunSettingUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f89503d.finish();
        return true;
    }
}

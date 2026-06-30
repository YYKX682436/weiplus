package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class t1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI f90221d;

    public t1(com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI appBrandDebugUI) {
        this.f90221d = appBrandDebugUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem item) {
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI appBrandDebugUI = this.f90221d;
        db5.e1.N(appBrandDebugUI, appBrandDebugUI.getString(com.tencent.mm.R.string.a0e), "", "", Integer.MAX_VALUE, new com.tencent.mm.plugin.appbrand.ui.s1(this.f90221d));
        return true;
    }
}

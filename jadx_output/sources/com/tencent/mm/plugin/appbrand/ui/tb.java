package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes5.dex */
public final class tb implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandVideoPreviewUI f90239d;

    public tb(com.tencent.mm.plugin.appbrand.ui.AppBrandVideoPreviewUI appBrandVideoPreviewUI) {
        this.f90239d = appBrandVideoPreviewUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f90239d.onBackPressed();
        return true;
    }
}

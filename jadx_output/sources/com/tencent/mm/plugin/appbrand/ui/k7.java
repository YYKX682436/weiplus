package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes3.dex */
public final class k7 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandStorageUsageUI f89826d;

    public k7(com.tencent.mm.plugin.appbrand.ui.AppBrandStorageUsageUI appBrandStorageUsageUI) {
        this.f89826d = appBrandStorageUsageUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f89826d.finish();
        return true;
    }
}

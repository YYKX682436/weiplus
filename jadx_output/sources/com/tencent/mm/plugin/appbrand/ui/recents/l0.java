package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public class l0 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList f90115d;

    public l0(com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList) {
        this.f90115d = appBrandLauncherRecentsList;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        if ("single".equals(str)) {
            int i17 = w0Var.f316974b;
            if (3 == i17 || 2 == i17) {
                com.tencent.mm.plugin.appbrand.ui.recents.k0 k0Var = new com.tencent.mm.plugin.appbrand.ui.recents.k0(this);
                com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList = this.f90115d;
                appBrandLauncherRecentsList.n0(k0Var);
                com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList.p0(appBrandLauncherRecentsList, true, com.tencent.wcdb.core.Database.DictDefaultMatchValue, false);
            }
        }
    }
}

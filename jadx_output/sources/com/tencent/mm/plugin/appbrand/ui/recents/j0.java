package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public class j0 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList f90098d;

    public j0(com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList) {
        this.f90098d = appBrandLauncherRecentsList;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        boolean equals = "single".equals(str);
        com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList = this.f90098d;
        if (equals) {
            int i17 = w0Var.f316974b;
            if ((5 == i17 && appBrandLauncherRecentsList.f90002m) || 2 == i17 || 3 == i17) {
                com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList.p0(appBrandLauncherRecentsList, false, -1L, true);
                return;
            }
            return;
        }
        if ("batch".equals(str) && 3 == w0Var.f316974b) {
            java.lang.Object obj = w0Var.f316976d;
            if ((obj instanceof java.lang.Long) && ((java.lang.Long) obj).longValue() == appBrandLauncherRecentsList.f90008r.get()) {
                return;
            }
            com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList.p0(appBrandLauncherRecentsList, false, com.tencent.wcdb.core.Database.DictDefaultMatchValue, true);
        }
    }
}

package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public class m0 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList f90126d;

    public m0(com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList) {
        this.f90126d = appBrandLauncherRecentsList;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList.p0(this.f90126d, false, -1L, false);
    }
}

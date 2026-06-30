package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.l0 f90106d;

    public k0(com.tencent.mm.plugin.appbrand.ui.recents.l0 l0Var) {
        this.f90106d = l0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList = this.f90106d.f90115d;
        if (appBrandLauncherRecentsList.f90013w.C) {
            appBrandLauncherRecentsList.I.f90029u = false;
        }
    }
}

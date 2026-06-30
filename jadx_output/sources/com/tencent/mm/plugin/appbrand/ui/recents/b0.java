package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList f90035d;

    public b0(com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList) {
        this.f90035d = appBrandLauncherRecentsList;
    }

    @Override // java.lang.Runnable
    public void run() {
        int size = this.f90035d.f90017z.size();
        if (size > 0) {
            this.f90035d.f90017z.clear();
            this.f90035d.f90016y.notifyItemRangeRemoved(0, size);
        }
        com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList.s0(this.f90035d);
        synchronized (this.f90035d.R) {
            this.f90035d.R.notifyAll();
        }
    }
}

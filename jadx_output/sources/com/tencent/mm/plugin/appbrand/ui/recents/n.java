package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public class n implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList f90127d;

    public n(com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList) {
        this.f90127d = appBrandLauncherRecentsList;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView;
        android.os.Looper.myQueue().removeIdleHandler(this);
        com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList = this.f90127d;
        if (appBrandLauncherRecentsList.Z || (loadMoreRecyclerView = appBrandLauncherRecentsList.f90013w) == null) {
            return false;
        }
        try {
            loadMoreRecyclerView.setLayoutFrozen(true);
            return false;
        } catch (java.lang.IllegalStateException unused) {
            return false;
        }
    }
}

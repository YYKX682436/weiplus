package com.tencent.liteav.sdkcommon;

/* loaded from: classes15.dex */
final /* synthetic */ class d implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.sdkcommon.DashboardManager f46532a;

    private d(com.tencent.liteav.sdkcommon.DashboardManager dashboardManager) {
        this.f46532a = dashboardManager;
    }

    public static java.lang.Runnable a(com.tencent.liteav.sdkcommon.DashboardManager dashboardManager) {
        return new com.tencent.liteav.sdkcommon.d(dashboardManager);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46532a.removeAllDashboardInternal();
    }
}

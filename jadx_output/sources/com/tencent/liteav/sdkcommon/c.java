package com.tencent.liteav.sdkcommon;

/* loaded from: classes15.dex */
final /* synthetic */ class c implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.sdkcommon.DashboardManager f46530a;

    /* renamed from: b, reason: collision with root package name */
    private final java.lang.String f46531b;

    private c(com.tencent.liteav.sdkcommon.DashboardManager dashboardManager, java.lang.String str) {
        this.f46530a = dashboardManager;
        this.f46531b = str;
    }

    public static java.lang.Runnable a(com.tencent.liteav.sdkcommon.DashboardManager dashboardManager, java.lang.String str) {
        return new com.tencent.liteav.sdkcommon.c(dashboardManager, str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46530a.removeDashboardInternal(this.f46531b);
    }
}

package com.tencent.liteav.sdkcommon;

/* loaded from: classes15.dex */
final /* synthetic */ class b implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.sdkcommon.DashboardManager f46528a;

    /* renamed from: b, reason: collision with root package name */
    private final java.lang.String f46529b;

    private b(com.tencent.liteav.sdkcommon.DashboardManager dashboardManager, java.lang.String str) {
        this.f46528a = dashboardManager;
        this.f46529b = str;
    }

    public static java.lang.Runnable a(com.tencent.liteav.sdkcommon.DashboardManager dashboardManager, java.lang.String str) {
        return new com.tencent.liteav.sdkcommon.b(dashboardManager, str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46528a.addDashboardInternal(this.f46529b);
    }
}

package com.tencent.liteav.sdkcommon;

/* loaded from: classes15.dex */
final /* synthetic */ class a implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.sdkcommon.DashboardManager f46526a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f46527b;

    private a(com.tencent.liteav.sdkcommon.DashboardManager dashboardManager, boolean z17) {
        this.f46526a = dashboardManager;
        this.f46527b = z17;
    }

    public static java.lang.Runnable a(com.tencent.liteav.sdkcommon.DashboardManager dashboardManager, boolean z17) {
        return new com.tencent.liteav.sdkcommon.a(dashboardManager, z17);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46526a.showDashboardInternal(this.f46527b);
    }
}

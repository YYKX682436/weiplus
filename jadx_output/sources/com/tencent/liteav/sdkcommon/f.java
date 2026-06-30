package com.tencent.liteav.sdkcommon;

/* loaded from: classes15.dex */
final /* synthetic */ class f implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.sdkcommon.DashboardManager f46536a;

    /* renamed from: b, reason: collision with root package name */
    private final java.lang.String f46537b;

    /* renamed from: c, reason: collision with root package name */
    private final java.lang.String f46538c;

    private f(com.tencent.liteav.sdkcommon.DashboardManager dashboardManager, java.lang.String str, java.lang.String str2) {
        this.f46536a = dashboardManager;
        this.f46537b = str;
        this.f46538c = str2;
    }

    public static java.lang.Runnable a(com.tencent.liteav.sdkcommon.DashboardManager dashboardManager, java.lang.String str, java.lang.String str2) {
        return new com.tencent.liteav.sdkcommon.f(dashboardManager, str, str2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46536a.appendLogInternal(this.f46537b, this.f46538c);
    }
}

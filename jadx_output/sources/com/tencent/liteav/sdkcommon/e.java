package com.tencent.liteav.sdkcommon;

/* loaded from: classes15.dex */
final /* synthetic */ class e implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.sdkcommon.DashboardManager f46533a;

    /* renamed from: b, reason: collision with root package name */
    private final java.lang.String f46534b;

    /* renamed from: c, reason: collision with root package name */
    private final java.lang.String f46535c;

    private e(com.tencent.liteav.sdkcommon.DashboardManager dashboardManager, java.lang.String str, java.lang.String str2) {
        this.f46533a = dashboardManager;
        this.f46534b = str;
        this.f46535c = str2;
    }

    public static java.lang.Runnable a(com.tencent.liteav.sdkcommon.DashboardManager dashboardManager, java.lang.String str, java.lang.String str2) {
        return new com.tencent.liteav.sdkcommon.e(dashboardManager, str, str2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46533a.setStatusInternal(this.f46534b, this.f46535c);
    }
}

package com.tencent.liteav.base.system;

/* loaded from: classes13.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final com.tencent.liteav.base.util.r<android.content.pm.PackageInfo> f46400a = new com.tencent.liteav.base.util.r<>(com.tencent.liteav.base.system.b.a());

    public static java.lang.String a() {
        android.content.pm.PackageInfo a17 = f46400a.a();
        return a17 == null ? "" : a17.packageName;
    }

    public static java.lang.String b() {
        android.content.pm.PackageInfo a17;
        android.content.Context applicationContext = com.tencent.liteav.base.ContextUtils.getApplicationContext();
        return (applicationContext == null || (a17 = f46400a.a()) == null) ? "" : applicationContext.getPackageManager().getApplicationLabel(a17.applicationInfo).toString();
    }

    public static java.lang.String c() {
        android.content.pm.PackageInfo a17 = f46400a.a();
        return a17 == null ? "" : a17.versionName;
    }

    public static /* synthetic */ android.content.pm.PackageInfo d() {
        android.content.Context applicationContext = com.tencent.liteav.base.ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return null;
        }
        return applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0);
    }
}

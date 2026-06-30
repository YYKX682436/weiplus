package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public final class b4 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f278743a;

    public static final boolean a(android.content.Context context) {
        return context != null && android.os.Build.VERSION.SDK_INT >= 34 && f278743a;
    }

    public static final boolean b(android.content.Context context) {
        if (context == null) {
            return false;
        }
        try {
            android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(packageInfo, "getPackageInfo(...)");
            android.content.pm.ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo == null) {
                return false;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(applicationInfo);
            return applicationInfo.targetSdkVersion >= 35;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static final boolean c(android.content.Context context) {
        if (context == null) {
            return false;
        }
        return a(context);
    }
}

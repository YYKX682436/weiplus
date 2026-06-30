package by5;

/* loaded from: classes13.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static int f117970a;

    /* renamed from: b, reason: collision with root package name */
    public static int f117971b;

    public static int a() {
        int c17;
        if (f117970a <= 0) {
            int b17 = b();
            if (b17 > 0) {
                f117970a = b17;
                return b17;
            }
            int i17 = f117971b;
            if (i17 <= 0) {
                i17 = 0;
                try {
                    if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
                        java.lang.String userAgentString = new android.webkit.WebView(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429503c).getSettings().getUserAgentString();
                        if (userAgentString != null) {
                            java.lang.String[] split = userAgentString.split("Chrome/");
                            if (split.length != 0 && ((split.length != 1 || split[0].length() != userAgentString.length()) && (c17 = c(split[1])) > 0)) {
                                by5.c4.f("ChromiumVersionUtil", "getVersionByUserAgent, version:" + c17);
                                f117971b = c17;
                                i17 = c17;
                            }
                        }
                    } else {
                        by5.c4.c("ChromiumVersionUtil", "getVersionByUserAgent NOT IN UI THREAD");
                    }
                } catch (java.lang.Throwable th6) {
                    by5.c4.d("ChromiumVersionUtil", "getVersionByUserAgent failed, error:", th6);
                }
            }
            if (i17 > 0) {
                f117970a = i17;
                return i17;
            }
        }
        return f117970a;
    }

    public static int b() {
        android.content.pm.PackageInfo packageInfo;
        int i17;
        android.content.pm.PackageInfo packageInfo2;
        int c17;
        android.content.Context context = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429503c;
        int i18 = 0;
        if (context == null) {
            by5.c4.g("ChromiumVersionUtil", "getVersionByPackageInfo, invalid context");
            return 0;
        }
        int i19 = y4.m.f540810a;
        android.content.pm.PackageInfo packageInfo3 = null;
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            packageInfo = z4.o.a();
        } else {
            try {
                packageInfo = y4.m.a();
            } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
                packageInfo = null;
            }
        }
        if (packageInfo != null) {
            packageInfo3 = packageInfo;
        } else {
            try {
                java.lang.String str = (java.lang.String) java.lang.Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                if (str != null) {
                    packageInfo3 = context.getPackageManager().getPackageInfo(str, 0);
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused2) {
            }
        }
        if (packageInfo3 != null) {
            i17 = c(packageInfo3.versionName);
            by5.c4.f("ChromiumVersionUtil", "getCurrentWebViewPackage, version:" + i17 + ", packageName:" + packageInfo3.packageName);
        } else {
            i17 = 0;
        }
        if (i17 > 0) {
            return i17;
        }
        try {
            packageInfo2 = context.getPackageManager().getPackageInfo("com.android.webview", 0);
        } catch (java.lang.Throwable th6) {
            by5.c4.g("ChromiumVersionUtil", "getVersionByPackageInfo failed, error:" + th6);
        }
        if (packageInfo2 != null) {
            c17 = c(packageInfo2.versionName);
            if (c17 > 0) {
                by5.c4.f("ChromiumVersionUtil", "getVersionByPackageInfo, version:" + c17 + ", packageName:com.android.webview");
            }
            return i18;
        }
        android.content.pm.PackageInfo packageInfo4 = context.getPackageManager().getPackageInfo("com.google.android.webview", 0);
        if (packageInfo4 != null && (c17 = c(packageInfo4.versionName)) > 0) {
            by5.c4.f("ChromiumVersionUtil", "getVersionByPackageInfo, version:" + c17 + ", packageName:com.google.android.webview");
        }
        return i18;
        i18 = c17;
        return i18;
    }

    public static int c(java.lang.String str) {
        if (str != null && !str.isEmpty()) {
            by5.c4.f("ChromiumVersionUtil", "getVersionFromVersionName, versionName:".concat(str));
            try {
                return java.lang.Integer.parseInt(str.split("\\.")[0]);
            } catch (java.lang.Throwable th6) {
                by5.c4.d("ChromiumVersionUtil", "getVersionFromVersionName failed, versionName:" + str + ", error:", th6);
            }
        }
        return 0;
    }

    public static int d() {
        int b17;
        if (f117970a > 0 || (b17 = b()) <= 0) {
            return f117970a;
        }
        f117970a = b17;
        return b17;
    }
}

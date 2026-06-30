package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class hs {

    /* renamed from: a, reason: collision with root package name */
    public static final int f131374a = 400;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f131375b = "TencentMapSDK";

    /* renamed from: c, reason: collision with root package name */
    private static final int f131376c = 65537;

    /* renamed from: d, reason: collision with root package name */
    private static java.lang.String f131377d = null;

    /* renamed from: e, reason: collision with root package name */
    private static java.lang.String f131378e = null;

    /* renamed from: f, reason: collision with root package name */
    private static java.lang.String f131379f = null;

    /* renamed from: g, reason: collision with root package name */
    private static java.lang.String f131380g = "";

    /* renamed from: h, reason: collision with root package name */
    private static final java.lang.String f131381h = "device_id";

    public static float a(android.content.Context context) {
        if (context == null) {
            return 1.0f;
        }
        return context.getResources().getDisplayMetrics().density;
    }

    public static int b(android.content.Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int c(android.content.Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int[] d(android.content.Context context) {
        android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
        android.graphics.Point point = new android.graphics.Point();
        windowManager.getDefaultDisplay().getSize(point);
        return new int[]{point.x, point.y};
    }

    public static java.lang.String e(android.content.Context context) {
        if (context == null) {
            return "";
        }
        try {
            android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            return packageInfo.versionName + packageInfo.versionCode;
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public static java.lang.String f(android.content.Context context) {
        return com.p314xaae8f345.map.p511x696c9db.C4314x286422.m35832x40453099(com.p314xaae8f345.map.p511x696c9db.C4314x286422.m35840xfb857373(context));
    }

    public static java.lang.String g(android.content.Context context) {
        return !android.text.TextUtils.isEmpty(f131380g) ? f131380g : com.p314xaae8f345.map.p511x696c9db.C4314x286422.m35832x40453099(com.p314xaae8f345.map.p511x696c9db.C4314x286422.m35829xfb7ea1e2(context));
    }

    public static java.lang.String h(android.content.Context context) {
        android.content.pm.ApplicationInfo applicationInfo;
        if (context == null) {
            return "";
        }
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        try {
            applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            applicationInfo = null;
        }
        try {
            return java.net.URLEncoder.encode((applicationInfo != null ? applicationInfo.loadLabel(packageManager) : "can't find app name").toString(), com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
        } catch (java.lang.Exception unused2) {
            return "";
        }
    }

    public static java.lang.String i(android.content.Context context) {
        if (context == null) {
            return "";
        }
        try {
            android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            return displayMetrics.widthPixels + "*" + displayMetrics.heightPixels;
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    private static int j(android.content.Context context) {
        android.content.pm.ConfigurationInfo deviceConfigurationInfo = ((android.app.ActivityManager) context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getDeviceConfigurationInfo();
        return deviceConfigurationInfo != null ? deviceConfigurationInfo.reqGlEsVersion : f131376c;
    }

    public static java.lang.String a(android.content.Context context, java.lang.String str) {
        android.content.pm.ApplicationInfo applicationInfo;
        android.os.Bundle bundle;
        if (context == null) {
            return "";
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            applicationInfo = null;
        }
        return (applicationInfo == null || (bundle = applicationInfo.metaData) == null) ? "" : bundle.getString(str);
    }

    public static java.lang.String b() {
        if (f131377d == null) {
            f131377d = "undefined";
        }
        return f131377d;
    }

    public static java.lang.String c() {
        if (f131378e == null) {
            f131378e = android.os.Build.MODEL;
        }
        return f131378e;
    }

    public static java.lang.String a() {
        if (f131379f == null) {
            f131379f = com.p314xaae8f345.map.p511x696c9db.C4314x286422.m35832x40453099(com.p314xaae8f345.map.p511x696c9db.C4314x286422.m35842xfb85e011());
        }
        return f131379f;
    }

    public static void a(java.lang.String str, java.lang.String str2) {
        if ("device_id".equals(str)) {
            f131380g = str2;
        }
    }

    private static boolean a(android.view.View view, float f17, float f18) {
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i17 = iArr[0];
        int i18 = iArr[1];
        return f18 >= ((float) i18) && f18 <= ((float) (view.getMeasuredHeight() + i18)) && f17 >= ((float) i17) && f17 <= ((float) (view.getMeasuredWidth() + i17));
    }

    public static android.graphics.Rect a(android.view.View view) {
        if (view == null) {
            return new android.graphics.Rect();
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i17 = iArr[0];
        int i18 = iArr[1];
        return new android.graphics.Rect(i17, i18, view.getMeasuredWidth() + i17, view.getMeasuredHeight() + i18);
    }
}

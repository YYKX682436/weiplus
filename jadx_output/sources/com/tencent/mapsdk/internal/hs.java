package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class hs {

    /* renamed from: a, reason: collision with root package name */
    public static final int f49841a = 400;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f49842b = "TencentMapSDK";

    /* renamed from: c, reason: collision with root package name */
    private static final int f49843c = 65537;

    /* renamed from: d, reason: collision with root package name */
    private static java.lang.String f49844d = null;

    /* renamed from: e, reason: collision with root package name */
    private static java.lang.String f49845e = null;

    /* renamed from: f, reason: collision with root package name */
    private static java.lang.String f49846f = null;

    /* renamed from: g, reason: collision with root package name */
    private static java.lang.String f49847g = "";

    /* renamed from: h, reason: collision with root package name */
    private static final java.lang.String f49848h = "device_id";

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
        return com.tencent.map.tools.Util.getMD5String(com.tencent.map.tools.Util.getSuid(context));
    }

    public static java.lang.String g(android.content.Context context) {
        return !android.text.TextUtils.isEmpty(f49847g) ? f49847g : com.tencent.map.tools.Util.getMD5String(com.tencent.map.tools.Util.getDuid(context));
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
            return java.net.URLEncoder.encode((applicationInfo != null ? applicationInfo.loadLabel(packageManager) : "can't find app name").toString(), com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
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
        android.content.pm.ConfigurationInfo deviceConfigurationInfo = ((android.app.ActivityManager) context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getDeviceConfigurationInfo();
        return deviceConfigurationInfo != null ? deviceConfigurationInfo.reqGlEsVersion : f49843c;
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
        if (f49844d == null) {
            f49844d = "undefined";
        }
        return f49844d;
    }

    public static java.lang.String c() {
        if (f49845e == null) {
            f49845e = android.os.Build.MODEL;
        }
        return f49845e;
    }

    public static java.lang.String a() {
        if (f49846f == null) {
            f49846f = com.tencent.map.tools.Util.getMD5String(com.tencent.map.tools.Util.getUUID());
        }
        return f49846f;
    }

    public static void a(java.lang.String str, java.lang.String str2) {
        if ("device_id".equals(str)) {
            f49847g = str2;
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

package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public abstract class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Set f90550a = new java.util.HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f90551b = {'<', '>', '\"', '\'', '&', ' ', '\''};

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String[] f90552c = {"&lt;", "&gt;", "&quot;", "&apos;", "&amp;", "&nbsp;", "&#39;"};

    public static java.lang.String a(android.content.ComponentName componentName) {
        android.content.pm.PackageManager packageManager;
        if (componentName == null || (packageManager = com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageManager()) == null) {
            return "[UNKNOWN]";
        }
        try {
            android.content.pm.ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            if (activityInfo != null) {
                return activityInfo.taskAffinity;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandUtil", "getActivityTaskAffinity e = %s", e17);
        }
        return "[UNKNOWN]";
    }

    public static java.lang.String b(int i17, java.lang.Object... objArr) {
        return com.tencent.mm.sdk.platformtools.x2.f193075e.getString(i17, objArr);
    }

    public static java.lang.String c(java.lang.String str) {
        char[] cArr;
        java.lang.String[] strArr;
        int i17;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        int length = str.length();
        int i18 = 0;
        while (i18 < length) {
            int i19 = 0;
            while (true) {
                cArr = f90551b;
                int length2 = cArr.length;
                strArr = f90552c;
                if (i19 >= length2) {
                    break;
                }
                java.lang.String str2 = strArr[i19];
                int i27 = 0;
                while (i27 < str2.length() && (i17 = i18 + i27) < length && str2.charAt(i27) == str.charAt(i17)) {
                    i27++;
                }
                if (i27 == str2.length()) {
                    break;
                }
                i19++;
            }
            if (i19 != cArr.length) {
                stringBuffer.append(cArr[i19]);
                i18 += strArr[i19].length();
            } else {
                stringBuffer.append(str.charAt(i18));
                i18++;
            }
        }
        return stringBuffer.toString();
    }

    public static java.lang.String d(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return str.replace((char) 8232, '\n').replace((char) 8233, '\n');
    }
}

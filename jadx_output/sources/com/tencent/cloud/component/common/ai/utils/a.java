package com.tencent.cloud.component.common.ai.utils;

/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String[] f45903a = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};

    public static boolean a(android.content.Context context) {
        java.lang.String[] strArr = f45903a;
        if (context == null) {
            return false;
        }
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        java.lang.String packageName = context.getPackageName();
        for (java.lang.String str : strArr) {
            if (packageManager.checkPermission(str, packageName) != 0) {
                return false;
            }
        }
        return true;
    }
}

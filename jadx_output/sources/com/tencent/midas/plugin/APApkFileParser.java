package com.tencent.midas.plugin;

/* loaded from: classes12.dex */
public class APApkFileParser {
    public static android.graphics.drawable.Drawable getAPKIcon(android.content.Context context, java.lang.String str) {
        android.content.pm.ApplicationInfo applicationInfo;
        try {
            android.content.pm.PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(str, 1);
            if (packageArchiveInfo != null && (applicationInfo = packageArchiveInfo.applicationInfo) != null) {
                java.lang.Class<?> cls = java.lang.Class.forName("android.content.res.AssetManager");
                android.content.res.AssetManager assetManager = (android.content.res.AssetManager) cls.getConstructor(null).newInstance(null);
                cls.getDeclaredMethod("addAssetPath", java.lang.String.class).invoke(assetManager, str);
                android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
                displayMetrics.setToDefaults();
                android.content.res.Resources resources = new android.content.res.Resources(assetManager, displayMetrics, context.getResources().getConfiguration());
                int i17 = applicationInfo.icon;
                if (i17 != 0) {
                    return resources.getDrawable(i17);
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        return null;
    }

    public static android.content.pm.PackageInfo getPackageInfo(android.content.Context context, java.lang.String str, int i17) {
        try {
            return context.getPackageManager().getPackageArchiveInfo(str, i17);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static boolean isApkFileBroken(android.content.Context context, java.lang.String str) {
        android.content.pm.PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(str, 64);
        return packageArchiveInfo == null || packageArchiveInfo.applicationInfo == null;
    }

    public static boolean isSignaturesSame(android.content.pm.Signature[] signatureArr, android.content.pm.Signature[] signatureArr2) {
        if (signatureArr == null || signatureArr2 == null) {
            return true;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        for (android.content.pm.Signature signature : signatureArr) {
            hashSet.add(signature);
        }
        java.util.HashSet hashSet2 = new java.util.HashSet();
        for (android.content.pm.Signature signature2 : signatureArr2) {
            hashSet2.add(signature2);
        }
        return hashSet.equals(hashSet2);
    }
}

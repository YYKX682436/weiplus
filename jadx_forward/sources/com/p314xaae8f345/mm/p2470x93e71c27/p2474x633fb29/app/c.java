package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes8.dex */
public abstract class c {
    public static android.content.pm.Signature[] a(android.content.Context context, java.lang.String str, boolean z17) {
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AndroidAppUtil", "getSignature, packageName is null");
            return null;
        }
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AndroidAppUtil", "getSignature, context is null");
            return null;
        }
        try {
            android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            if (packageInfo != null) {
                return packageInfo.signatures;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AndroidAppUtil", java.lang.String.format(java.util.Locale.ENGLISH, "getPackageInfo for %s, system returns null", str));
            return null;
        } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AndroidAppUtil", java.lang.String.format(java.util.Locale.ENGLISH, "getPackageInfo for %s, get exception %s", str, e17));
            return null;
        }
    }
}

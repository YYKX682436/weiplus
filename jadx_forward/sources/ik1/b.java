package ik1;

/* loaded from: classes5.dex */
public abstract class b {
    public static android.content.pm.PackageInfo a(android.content.Context context, java.lang.String str) {
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.AndroidPackageUtil", "getPackageInfo fail, packageName is null");
            return null;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.AndroidPackageUtil", e17.getMessage());
            return null;
        }
    }

    public static boolean b(android.content.Context context, java.lang.String str) {
        return a(context, str) != null;
    }
}

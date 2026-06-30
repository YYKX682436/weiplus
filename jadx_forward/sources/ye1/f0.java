package ye1;

/* loaded from: classes8.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f542733a;

    public static java.lang.String a(android.content.Context context) {
        java.lang.String str;
        android.content.pm.ApplicationInfo applicationInfo;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f542733a)) {
            return f542733a;
        }
        f542733a = context.getPackageName();
        try {
            android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(f542733a, 0);
            if (packageInfo != null && (applicationInfo = packageInfo.applicationInfo) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(applicationInfo.name)) {
                f542733a = packageInfo.applicationInfo.name;
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.Video.Utils", e17, "getUserAgent exception", new java.lang.Object[0]);
        }
        java.lang.String str2 = f542733a;
        int i17 = t9.d0.f498031a;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            str = "?";
        }
        return str2 + "/" + str + " (Linux;Android " + android.os.Build.VERSION.RELEASE + ") ExoPlayerLib/2.5.4";
    }
}

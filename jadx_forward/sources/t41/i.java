package t41;

/* loaded from: classes8.dex */
public abstract class i {
    public static boolean a() {
        android.content.pm.PackageInfo packageInfo;
        try {
            packageInfo = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager().getPackageInfo("com.tencent.wework", 0);
        } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PackageUtil", e17.getMessage());
            packageInfo = null;
        }
        return packageInfo != null;
    }
}

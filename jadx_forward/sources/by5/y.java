package by5;

/* loaded from: classes12.dex */
public abstract class y {
    public static int a(android.content.Context context) {
        android.net.ConnectivityManager connectivityManager;
        android.net.NetworkInfo activeNetworkInfo;
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0 || (connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            return 0;
        }
        if (activeNetworkInfo.getType() == 1) {
            return 1;
        }
        if (activeNetworkInfo.getSubtype() >= 13) {
            return 3;
        }
        return (activeNetworkInfo.getSubtype() < 5 || activeNetworkInfo.getSubtype() >= 13) ? 4 : 2;
    }

    public static boolean b() {
        android.content.Context context = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429503c;
        if (context == null) {
            by5.c4.g("NetworkUtil", "context is null");
            return false;
        }
        if (a(context) != 0) {
            return true;
        }
        by5.c4.g("NetworkUtil", "no network");
        return false;
    }

    public static boolean c() {
        android.content.Context context = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429503c;
        if (context != null) {
            return a(context) == 1;
        }
        by5.c4.g("NetworkUtil", "context is null");
        return false;
    }
}

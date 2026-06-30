package sr5;

/* loaded from: classes13.dex */
public abstract class g {
    public static int a(android.content.Context context) {
        android.net.NetworkInfo activeNetworkInfo;
        if (context == null) {
            return 0;
        }
        try {
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return 0;
            }
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                if (type != 1) {
                    return type != 9 ? 0 : 5;
                }
                return 4;
            }
            switch (activeNetworkInfo.getSubtype()) {
                case 0:
                    return 0;
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    return 1;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    return 2;
                case 13:
                default:
                    return 3;
            }
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }
}

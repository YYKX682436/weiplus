package o45;

/* loaded from: classes12.dex */
public abstract class a {
    public static int a(android.content.Context context) {
        try {
            android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return 0;
            }
            int subtype = activeNetworkInfo.getSubtype();
            if (activeNetworkInfo.getType() == 1) {
                return 1;
            }
            if (subtype == 13 || subtype == 15 || subtype == 14) {
                return 4;
            }
            int i17 = 3;
            if (subtype != 3 && subtype != 4 && subtype != 5 && subtype != 6 && subtype != 12) {
                i17 = 2;
                if (subtype != 1 && subtype != 2) {
                    return 0;
                }
            }
            return i17;
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BgFgBase", "getNetType: %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return 1;
        }
    }

    public static int b() {
        return z65.c.f551988a ? 1 : 2;
    }
}

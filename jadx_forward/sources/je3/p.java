package je3;

/* loaded from: classes7.dex */
public abstract class p {
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j17, long j18, int i17, int i18, int i19, java.lang.String str5, java.lang.String str6) {
        java.lang.String str7;
        de3.a aVar = de3.a.None;
        try {
            str7 = fp.s0.b(str4, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
        } catch (java.io.UnsupportedEncodingException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MagicBrush.Report.kv_27740", "kv_27740 report UnsupportedEncodingException");
            str7 = str4;
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        de3.a aVar2 = de3.a.Unknown;
        try {
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    if (activeNetworkInfo.getType() == 1) {
                        aVar2 = de3.a.Wifi;
                    } else {
                        if (activeNetworkInfo.getSubtype() != 2 && activeNetworkInfo.getSubtype() != 1 && activeNetworkInfo.getSubtype() != 4) {
                            if (activeNetworkInfo.getSubtype() >= 5 && activeNetworkInfo.getSubtype() < 13) {
                                aVar2 = de3.a.Mobile_3g;
                            } else if (activeNetworkInfo.getSubtype() >= 13 && activeNetworkInfo.getSubtype() < 20) {
                                aVar2 = de3.a.Mobile_4g;
                            } else if (activeNetworkInfo.getSubtype() >= 20) {
                                aVar2 = de3.a.Mobile_5g;
                            }
                        }
                        aVar2 = de3.a.Mobile_2g;
                    }
                }
                aVar2 = aVar;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MagicBrushNetworkUtil", e17, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(27740, str, aVar2 != aVar ? aVar2.f310927d : "offline", str2, str7, str3, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str5, str6);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016();
    }
}

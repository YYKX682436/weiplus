package b21;

/* loaded from: classes8.dex */
public abstract class q {
    public static boolean a() {
        if (java.util.TimeZone.getDefault().getRawOffset() != java.util.TimeZone.getTimeZone("GMT+08:00").getRawOffset()) {
            return false;
        }
        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("phone");
        if (telephonyManager == null) {
            return true;
        }
        java.lang.String networkCountryIso = telephonyManager.getNetworkCountryIso();
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(networkCountryIso) || networkCountryIso.equalsIgnoreCase("cn");
    }

    public static boolean b() {
        int b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("ShakeMusicGlobalSwitch", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicHelperUtils", "isShakeMusicGlobalUser: %d", java.lang.Integer.valueOf(b17));
        return b17 != 0;
    }

    public static boolean c() {
        return a() || b();
    }
}

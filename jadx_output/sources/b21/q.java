package b21;

/* loaded from: classes8.dex */
public abstract class q {
    public static boolean a() {
        if (java.util.TimeZone.getDefault().getRawOffset() != java.util.TimeZone.getTimeZone("GMT+08:00").getRawOffset()) {
            return false;
        }
        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("phone");
        if (telephonyManager == null) {
            return true;
        }
        java.lang.String networkCountryIso = telephonyManager.getNetworkCountryIso();
        return com.tencent.mm.sdk.platformtools.t8.K0(networkCountryIso) || networkCountryIso.equalsIgnoreCase("cn");
    }

    public static boolean b() {
        int b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("ShakeMusicGlobalSwitch", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicHelperUtils", "isShakeMusicGlobalUser: %d", java.lang.Integer.valueOf(b17));
        return b17 != 0;
    }

    public static boolean c() {
        return a() || b();
    }
}

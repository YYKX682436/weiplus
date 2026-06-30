package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes8.dex */
public abstract class u9 {
    public static boolean a() {
        java.lang.String p17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.p(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        java.lang.String d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
        if (p17.equals("language_default")) {
            p17 = d17;
        }
        if (!p17.equals("zh_CN")) {
            return true;
        }
        if (java.util.TimeZone.getDefault().getRawOffset() != java.util.TimeZone.getTimeZone("GMT+08:00").getRawOffset()) {
            return true;
        }
        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("phone");
        if (telephonyManager != null) {
            java.lang.String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(networkCountryIso) && !networkCountryIso.contains("cn") && !networkCountryIso.contains("CN")) {
                return true;
            }
        }
        return false;
    }
}

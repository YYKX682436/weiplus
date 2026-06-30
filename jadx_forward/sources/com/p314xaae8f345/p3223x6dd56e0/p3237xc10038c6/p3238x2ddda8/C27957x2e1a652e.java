package com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3238x2ddda8;

/* renamed from: com.tencent.youtu.ytcommon.auth.StatisticsUtils */
/* loaded from: classes12.dex */
public class C27957x2e1a652e {
    private C27957x2e1a652e() {
    }

    /* renamed from: encryptUid */
    private static java.lang.String m121219xa5d6c3ab(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int length = str.length();
        for (int i17 = 0; i17 < length; i17++) {
            char charAt = str.charAt(i17);
            sb6.append(charAt + (charAt % length));
        }
        sb6.reverse();
        return sb6.toString();
    }

    /* renamed from: getChar */
    private static char m121220xfb7dfbcc(byte b17, int i17) {
        return (char) (b17 - m121224x284e8789(i17 & 1));
    }

    /* renamed from: getDeviceUid */
    public static java.lang.String m121221xedf764(android.content.Context context) {
        if (context.getPackageName().startsWith("com.tencent")) {
            return "com.tencent";
        }
        java.lang.String m121222xfb804d1e = m121222xfb804d1e(context.getApplicationContext());
        java.lang.String m121223x6eecb1aa = m121223x6eecb1aa(context.getApplicationContext());
        boolean z17 = !android.text.TextUtils.isEmpty(m121223x6eecb1aa);
        if (z17) {
            m121223x6eecb1aa = m121223x6eecb1aa.replaceAll(":", "");
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(m121222xfb804d1e);
        sb6.append(z17 ? m121223x6eecb1aa : "");
        return m121225x6964523(m121219xa5d6c3ab(sb6.toString()));
    }

    /* renamed from: getIMEI */
    public static java.lang.String m121222xfb804d1e(android.content.Context context) {
        android.telephony.TelephonyManager telephonyManager;
        java.lang.String string = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
        return (!android.text.TextUtils.isEmpty(string) || (telephonyManager = (android.telephony.TelephonyManager) context.getApplicationContext().getSystemService("phone")) == null) ? string : telephonyManager.getDeviceId();
    }

    /* renamed from: getMacAddr */
    public static java.lang.String m121223x6eecb1aa(android.content.Context context) {
        android.net.wifi.WifiManager wifiManager;
        android.net.wifi.WifiInfo connectionInfo;
        if (context == null || (wifiManager = (android.net.wifi.WifiManager) context.getApplicationContext().getSystemService("wifi")) == null || (connectionInfo = wifiManager.getConnectionInfo()) == null) {
            return null;
        }
        return connectionInfo.getMacAddress();
    }

    /* renamed from: getOffset */
    private static byte m121224x284e8789(int i17) {
        return (byte) (i17 == 0 ? 65 : 97);
    }

    /* renamed from: toMD5 */
    public static java.lang.String m121225x6964523(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(str.getBytes());
            java.lang.String bigInteger = new java.math.BigInteger(1, messageDigest.digest()).toString(16);
            while (bigInteger.length() < 32) {
                bigInteger = "0" + bigInteger;
            }
            return bigInteger;
        } catch (java.security.NoSuchAlgorithmException unused) {
            return "";
        }
    }
}

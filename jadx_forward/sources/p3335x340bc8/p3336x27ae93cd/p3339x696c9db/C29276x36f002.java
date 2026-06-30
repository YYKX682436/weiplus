package p3335x340bc8.p3336x27ae93cd.p3339x696c9db;

/* renamed from: oicq.wlogin_sdk.tools.util */
/* loaded from: classes13.dex */
public class C29276x36f002 {

    /* renamed from: a, reason: collision with root package name */
    public static int f427196a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static k36.c f427197b;

    /* renamed from: RSAPrivKeyFromJNI */
    public static java.security.Key m151454xc816d28b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = {48, -126, 2, 117, 2, 1, 0, 48, 13, 6, 9, 42, -122, 72, -122, -9, 13, 1, 1, 1, 5, 0, 4, -126, 2, 95};
        int length = bArr.length + org.p3343x72743996.net.InterfaceC29524x4f65168b.f73971x21a66c06;
        bArr2[3] = (byte) (bArr2[3] + length);
        bArr2[25] = (byte) (bArr2[25] + length);
        byte[] bArr3 = new byte[bArr.length + 26];
        java.lang.System.arraycopy(bArr2, 0, bArr3, 0, 26);
        java.lang.System.arraycopy(bArr, 0, bArr3, 26, bArr.length);
        try {
            return java.security.KeyFactory.getInstance("RSA").generatePrivate(new java.security.spec.PKCS8EncodedKeySpec(bArr3));
        } catch (java.lang.Exception e17) {
            u(e17);
            return null;
        }
    }

    /* renamed from: RSAPubKeyFromJNI */
    public static java.security.Key m151455x32996cd9(byte[] bArr) {
        boolean z17;
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = {48, -127, -97, 48, 13, 6, 9, 42, -122, 72, -122, -9, 13, 1, 1, 1, 5, 0, 3, -127, -115, 0};
        byte[] bArr3 = new byte[bArr.length + 22];
        if (bArr.length >= 22) {
            for (int i17 = 0; i17 < 22; i17++) {
                if (bArr2[i17] != bArr[i17]) {
                    z17 = false;
                    break;
                }
            }
        }
        z17 = true;
        if (!z17) {
            java.lang.System.arraycopy(bArr2, 0, bArr3, 0, 22);
            java.lang.System.arraycopy(bArr, 0, bArr3, 22, bArr.length);
            bArr = bArr3;
        }
        try {
            return java.security.KeyFactory.getInstance("RSA").generatePublic(new java.security.spec.X509EncodedKeySpec(bArr));
        } catch (java.lang.Exception e17) {
            u(e17);
            return null;
        }
    }

    public static void a(java.lang.String str) {
        k36.c cVar;
        try {
            if (f427196a < 2 || (cVar = f427197b) == null) {
                return;
            }
            ((com.p314xaae8f345.mm.p944x882e457a.m3) cVar).a(2, "", str);
        } catch (java.lang.Exception unused) {
        }
    }

    public static void b(java.lang.String str, java.lang.String str2) {
        k36.c cVar;
        try {
            if (f427196a < 2 || (cVar = f427197b) == null) {
                return;
            }
            cVar.a(2, str, str2);
        } catch (java.lang.Exception unused) {
        }
    }

    public static void c(java.lang.String str) {
        k36.c cVar;
        try {
            if (f427196a < 1 || (cVar = f427197b) == null) {
                return;
            }
            ((com.p314xaae8f345.mm.p944x882e457a.m3) cVar).a(1, "", str);
        } catch (java.lang.Exception unused) {
        }
    }

    public static void d(java.lang.String str, java.lang.String str2) {
        k36.c cVar;
        try {
            if (f427196a < 0 || (cVar = f427197b) == null) {
                return;
            }
            cVar.a(0, str, str2);
        } catch (java.lang.Exception unused) {
        }
    }

    public static long e(byte[] bArr) {
        if (bArr == null) {
            return 0L;
        }
        return bArr.length;
    }

    public static int f(byte[] bArr, int i17) {
        return ((bArr[i17] << 8) & 65280) + ((bArr[i17 + 1] << 0) & 255);
    }

    public static int g(byte[] bArr, int i17) {
        return ((bArr[i17] << 24) & (-16777216)) + ((bArr[i17 + 1] << com.p314xaae8f345.p3206x37e841.C27806x41b77320.f60796x98e30028) & 16711680) + ((bArr[i17 + 2] << 8) & 65280) + ((bArr[i17 + 3] << 0) & 255);
    }

    public static java.lang.String h(byte[] bArr) {
        java.lang.String str = "";
        if (bArr == null) {
            return "";
        }
        for (int i17 = 0; i17 < bArr.length; i17++) {
            str = (str + java.lang.Integer.toHexString((bArr[i17] >> 4) & 15)) + java.lang.Integer.toHexString(bArr[i17] & 15);
        }
        return str;
    }

    public static java.lang.String i(byte[] bArr, int i17) {
        java.lang.String str = "";
        if (bArr == null) {
            return "";
        }
        if (i17 > bArr.length) {
            i17 = bArr.length;
        }
        for (int i18 = 0; i18 < i17; i18++) {
            str = (str + java.lang.Integer.toHexString((bArr[i18] >> 4) & 15)) + java.lang.Integer.toHexString(bArr[i18] & 15);
        }
        return str;
    }

    public static byte[] j(android.content.Context context) {
        android.net.wifi.WifiInfo wifiInfo;
        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) context.getSystemService("phone");
        java.lang.String str = null;
        java.lang.String str2 = telephonyManager != null ? (java.lang.String) yj0.a.j(telephonyManager, "oicq/wlogin_sdk/tools/util", "get_IMEI", "(Landroid/content/Context;)[B", "android/telephony/TelephonyManager", "getDeviceId", "()Ljava/lang/String;") : null;
        android.net.wifi.WifiManager wifiManager = (android.net.wifi.WifiManager) context.getSystemService("wifi");
        if (wifiManager != null && (wifiInfo = (android.net.wifi.WifiInfo) yj0.a.j(wifiManager, "oicq/wlogin_sdk/tools/util", "get_IMEI", "(Landroid/content/Context;)[B", "android/net/wifi/WifiManager", "getConnectionInfo", "()Landroid/net/wifi/WifiInfo;")) != null) {
            str = wifiInfo.getMacAddress();
        }
        if (str2 == null) {
            str2 = "";
        }
        if (str != null) {
            str2 = str2 + str;
        }
        return str2.length() <= 0 ? new byte[0] : k36.d.k(str2.getBytes());
    }

    public static byte k(byte b17) {
        int i17;
        if (b17 < 48 || b17 > 57) {
            byte b18 = 97;
            if (b17 < 97 || b17 > 102) {
                b18 = 65;
                if (b17 < 65 || b17 > 70) {
                    return (byte) 0;
                }
            }
            i17 = (b17 - b18) + 10;
        } else {
            i17 = b17 - 48;
        }
        return (byte) i17;
    }

    public static byte[] l(android.content.Context context) {
        java.lang.String str;
        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) context.getSystemService("phone");
        return (telephonyManager == null || (str = (java.lang.String) yj0.a.j(telephonyManager, "oicq/wlogin_sdk/tools/util", "get_imei_id", "(Landroid/content/Context;)[B", "android/telephony/TelephonyManager", "getDeviceId", "()Ljava/lang/String;")) == null) ? new byte[0] : str.getBytes();
    }

    public static byte[] m(android.content.Context context) {
        java.lang.String str;
        byte[] bytes = new java.lang.String("").getBytes();
        try {
            bytes = x(context.getSharedPreferences("WLOGIN_DEVICE_INFO", 0).getString("ksid", new java.lang.String("")));
        } catch (java.lang.Exception e17) {
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            java.io.PrintWriter printWriter = new java.io.PrintWriter((java.io.Writer) stringWriter, true);
            e17.printStackTrace(printWriter);
            printWriter.flush();
            stringWriter.flush();
            d("exception", stringWriter.toString());
        }
        if (bytes == null || bytes.length <= 0) {
            str = "get_ksid:null";
        } else {
            str = "get_ksid:" + h(bytes);
        }
        a(str);
        return bytes;
    }

    public static byte[] n(android.content.Context context) {
        android.net.wifi.WifiInfo wifiInfo;
        java.lang.String macAddress;
        android.net.wifi.WifiManager wifiManager = (android.net.wifi.WifiManager) context.getSystemService("wifi");
        return (wifiManager == null || (wifiInfo = (android.net.wifi.WifiInfo) yj0.a.j(wifiManager, "oicq/wlogin_sdk/tools/util", "get_mac_addr", "(Landroid/content/Context;)[B", "android/net/wifi/WifiManager", "getConnectionInfo", "()Landroid/net/wifi/WifiInfo;")) == null || (macAddress = wifiInfo.getMacAddress()) == null) ? new byte[0] : macAddress.getBytes();
    }

    public static int o() {
        return (int) (java.lang.Math.random() * 2.147483647E9d);
    }

    public static byte[] p(android.content.Context context) {
        byte[] bArr = new byte[0];
        try {
            bArr = x(context.getSharedPreferences("WLOGIN_DEVICE_INFO", 0).getString("imei", new java.lang.String("")));
        } catch (java.lang.Exception e17) {
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            java.io.PrintWriter printWriter = new java.io.PrintWriter((java.io.Writer) stringWriter, true);
            e17.printStackTrace(printWriter);
            printWriter.flush();
            stringWriter.flush();
            d("exception", stringWriter.toString());
        }
        if (bArr.length <= 0) {
            return new byte[0];
        }
        a("get_imei:" + h(bArr));
        return bArr;
    }

    public static void q(byte[] bArr, int i17, int i18) {
        bArr[i17 + 1] = (byte) (i18 >> 0);
        bArr[i17 + 0] = (byte) (i18 >> 8);
    }

    public static void r(byte[] bArr, int i17, int i18) {
        bArr[i17 + 3] = (byte) (i18 >> 0);
        bArr[i17 + 2] = (byte) (i18 >> 8);
        bArr[i17 + 1] = (byte) (i18 >> 16);
        bArr[i17 + 0] = (byte) (i18 >> 24);
    }

    public static void s(byte[] bArr, int i17, long j17) {
        bArr[i17 + 7] = (byte) (j17 >> 0);
        bArr[i17 + 6] = (byte) (j17 >> 8);
        bArr[i17 + 5] = (byte) (j17 >> 16);
        bArr[i17 + 4] = (byte) (j17 >> 24);
        bArr[i17 + 3] = (byte) (j17 >> 32);
        bArr[i17 + 2] = (byte) (j17 >> 40);
        bArr[i17 + 1] = (byte) (j17 >> 48);
        bArr[i17 + 0] = (byte) (j17 >> 56);
    }

    public static void t(byte[] bArr, int i17, long j17) {
        bArr[i17 + 3] = (byte) (j17 >> 0);
        bArr[i17 + 2] = (byte) (j17 >> 8);
        bArr[i17 + 1] = (byte) (j17 >> 16);
        bArr[i17 + 0] = (byte) (j17 >> 24);
    }

    public static void u(java.lang.Exception exc) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        java.io.PrintWriter printWriter = new java.io.PrintWriter((java.io.Writer) stringWriter, true);
        exc.printStackTrace(printWriter);
        printWriter.flush();
        stringWriter.flush();
        d("exception:", stringWriter.toString());
    }

    public static void v(java.lang.String str, java.lang.Exception exc) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        java.io.PrintWriter printWriter = new java.io.PrintWriter((java.io.Writer) stringWriter, true);
        exc.printStackTrace(printWriter);
        printWriter.flush();
        stringWriter.flush();
        d(str, stringWriter.toString());
    }

    public static void w(android.content.Context context, byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        android.content.SharedPreferences.Editor edit = context.getSharedPreferences("WLOGIN_DEVICE_INFO", 0).edit();
        edit.putString("imei", h(bArr));
        edit.commit();
    }

    public static byte[] x(java.lang.String str) {
        if (str == null) {
            return new byte[0];
        }
        byte[] bArr = new byte[str.length() / 2];
        for (int i17 = 0; i17 < str.length() / 2; i17++) {
            int i18 = i17 * 2;
            bArr[i17] = (byte) (k((byte) str.charAt(i18 + 1)) + (k((byte) str.charAt(i18)) << 4));
        }
        return bArr;
    }
}

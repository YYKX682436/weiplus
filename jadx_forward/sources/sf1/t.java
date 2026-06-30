package sf1;

/* loaded from: classes13.dex */
public abstract class t {
    public static int a(android.net.wifi.WifiConfiguration wifiConfiguration) {
        if (wifiConfiguration.allowedKeyManagement.get(1)) {
            return 2;
        }
        if (wifiConfiguration.allowedKeyManagement.get(2) || wifiConfiguration.allowedKeyManagement.get(3)) {
            return 3;
        }
        return wifiConfiguration.wepKeys[0] != null ? 1 : 0;
    }

    public static java.lang.String b(java.lang.String str) {
        if (str == null) {
            return "";
        }
        int length = str.length();
        if (length <= 1 || str.charAt(0) != '\"') {
            return str;
        }
        int i17 = length - 1;
        return str.charAt(i17) == '\"' ? str.substring(1, i17) : str;
    }
}

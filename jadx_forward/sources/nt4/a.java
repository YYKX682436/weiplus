package nt4;

/* loaded from: classes8.dex */
public abstract class a {
    public static boolean a(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        java.lang.String[] split = str.split("&");
        int length = split.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                str3 = null;
                break;
            }
            java.lang.String[] split2 = split[i17].split("=");
            if (split2.length > 1 && split2[0].equals("prepay_id")) {
                str3 = split2[1];
                break;
            }
            i17++;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            return false;
        }
        return str3.startsWith(str2);
    }
}

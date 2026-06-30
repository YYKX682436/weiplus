package c01;

/* loaded from: classes.dex */
public abstract class eb {
    public static boolean a(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        java.lang.String str4 = "";
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return true;
        }
        try {
            str3 = "";
            for (char c17 : str.toCharArray()) {
                str3 = str3 + java.lang.String.format("%02x", java.lang.Integer.valueOf(c17));
            }
        } catch (java.lang.Exception unused) {
            str3 = "";
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3) && str3.length() % 2 == 0) {
            java.lang.String str5 = "";
            int i17 = 0;
            while (i17 < str3.length()) {
                try {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(str5);
                    int i18 = i17 + 2;
                    sb6.append((char) java.lang.Integer.parseInt(str3.substring(i17, i18), 16));
                    str5 = sb6.toString();
                    i17 = i18;
                } catch (java.lang.Exception unused2) {
                }
            }
            str4 = str5;
        }
        return com.tencent.mm.sdk.platformtools.t8.K0(str4) || !str4.equals(str2);
    }
}

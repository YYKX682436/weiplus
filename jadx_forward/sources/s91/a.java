package s91;

/* loaded from: classes7.dex */
public abstract class a {
    public static java.lang.String a(java.lang.String str) {
        java.lang.String str2 = "";
        if (!fp.q.b("appbrand")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DesensitizationUtil", "appbrand delivery is not installed");
            return "";
        }
        try {
            str = java.net.URLDecoder.decode(str);
        } catch (java.lang.Exception unused) {
        }
        int indexOf = str.indexOf(63);
        if (indexOf < 0) {
            return "";
        }
        java.lang.String substring = str.substring(indexOf + 1);
        com.p302x1ea3c036.p303x85af7841.C2842x8c5ff3c4 c2842x8c5ff3c4 = ob.a.f425421a;
        if (substring != null && !substring.isEmpty()) {
            str2 = ob.a.f425421a.a(substring, 1, 2);
        }
        return java.net.URLEncoder.encode(str2);
    }

    public static java.lang.String b(java.lang.String str) {
        java.lang.String str2 = "";
        if (!fp.q.b("appbrand")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DesensitizationUtil", "appbrand delivery is not installed");
            return "";
        }
        try {
            str = java.net.URLDecoder.decode(str);
        } catch (java.lang.Exception unused) {
        }
        com.p302x1ea3c036.p303x85af7841.C2842x8c5ff3c4 c2842x8c5ff3c4 = ob.a.f425421a;
        try {
            int indexOf = str.indexOf(63);
            if (indexOf >= 0) {
                int i17 = indexOf + 1;
                java.lang.String substring = str.substring(i17);
                if (substring != null && !substring.isEmpty()) {
                    str2 = ob.a.f425421a.a(substring, 1, 2);
                }
                str = str.substring(0, i17) + str2;
            }
        } catch (java.lang.Exception unused2) {
        }
        return java.net.URLEncoder.encode(str);
    }
}

package hs3;

/* loaded from: classes.dex */
public abstract class q {
    public static java.lang.String a(java.lang.String str, java.lang.String str2, java.util.Map map) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (!str2.startsWith("http://") && !str2.startsWith("https://")) {
            sb6.append(str + "");
        }
        sb6.append(str2);
        if (map == null) {
            return sb6.toString();
        }
        sb6.append('?');
        boolean z17 = true;
        for (java.lang.String str3 : map.keySet()) {
            java.lang.String str4 = (java.lang.String) map.get(str3);
            sb6.append(z17 ? "" : "&");
            sb6.append(java.net.URLEncoder.encode(str3, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
            sb6.append('=');
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str4 == null) {
                str4 = "";
            }
            sb6.append(java.net.URLEncoder.encode(str4, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
            z17 = false;
        }
        return sb6.toString();
    }
}

package b75;

/* loaded from: classes.dex */
public abstract class g {
    public static java.lang.String a(java.util.Map map) {
        if (map == null || map.size() == 0) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = 0;
        for (java.lang.String str : map.keySet()) {
            sb6.append(java.net.URLEncoder.encode(str, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
            sb6.append('=');
            sb6.append(java.net.URLEncoder.encode((java.lang.String) map.get(str), com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
            i17++;
            if (map.size() > i17) {
                sb6.append("; ");
            }
        }
        return sb6.toString();
    }

    public static java.util.Map b(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (str != null && str.length() != 0) {
            for (java.lang.String str2 : str.split(";")) {
                java.lang.String[] split = str2.split("=");
                if (split.length == 2) {
                    hashMap.put(split[0], split[1]);
                }
            }
        }
        return hashMap;
    }
}

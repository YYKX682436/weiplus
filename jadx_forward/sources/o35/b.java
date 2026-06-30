package o35;

/* loaded from: classes.dex */
public enum b {
    ;

    public static java.lang.String a(java.util.Map map) {
        if (map == null) {
            return "null";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "null";
            }
            sb6.append(str);
            sb6.append(" : ");
            java.util.List<java.lang.String> list = (java.util.List) entry.getValue();
            if (list != null && list.size() > 0) {
                for (java.lang.String str2 : list) {
                    if (str2 == null) {
                        str2 = "";
                    }
                    sb6.append(str2);
                    sb6.append("|");
                }
            }
            sb6.append("\n");
        }
        return sb6.toString();
    }

    /* renamed from: valueOf */
    public static o35.b m150559xdce0328(java.lang.String str) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(java.lang.Enum.valueOf(o35.b.class, str));
        return null;
    }
}

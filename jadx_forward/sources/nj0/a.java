package nj0;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f419332a;

    public static int a(android.content.Context context) {
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(context)) {
            return 4;
        }
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(context)) {
            return 5;
        }
        int m40067xab9ed241 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(context);
        if (m40067xab9ed241 == -1) {
            return 255;
        }
        if (m40067xab9ed241 == 0) {
            return 1;
        }
        if (m40067xab9ed241 != 5) {
            return m40067xab9ed241 != 6 ? 6 : 3;
        }
        return 2;
    }

    public static java.lang.String b() {
        if (f419332a == null) {
            java.lang.String k17 = wo.w0.k();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            for (int i17 = 0; i17 < k17.length() - 1; i17++) {
                sb6.append(java.lang.Integer.toHexString(k17.charAt(i17)));
            }
            sb6.append("00");
            f419332a = sb6.toString();
        }
        return f419332a;
    }

    public static java.lang.String c(java.util.Map map) {
        if (map != null && map.size() != 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            for (java.util.Map.Entry entry : map.entrySet()) {
                try {
                    jSONObject.put((java.lang.String) entry.getKey(), entry.getValue());
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameReportUtil", e17.getMessage());
                    return "";
                }
            }
            try {
                return java.net.URLEncoder.encode(jSONObject.toString(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameReportUtil", e18.getMessage());
            }
        }
        return "";
    }

    public static java.lang.String d(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return "";
        }
        try {
            return java.net.URLEncoder.encode(str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameReportUtil", e17.getMessage());
            return "";
        }
    }
}

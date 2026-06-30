package n53;

/* loaded from: classes8.dex */
public abstract class a {
    public static java.lang.String a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObject2 = null;
        try {
            jSONObject.put(str2, str3);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameReportUtil", e17.getMessage());
            jSONObject = null;
        }
        if (jSONObject != null) {
            java.lang.String jSONObject3 = jSONObject.toString();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                str = jSONObject3;
            } else {
                try {
                    jSONObject2 = new org.json.JSONObject(str);
                } catch (java.lang.Exception unused) {
                }
                try {
                    org.json.JSONObject jSONObject4 = new org.json.JSONObject(jSONObject3);
                    if (jSONObject2 != null) {
                        java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
                        while (keys.hasNext()) {
                            java.lang.String next = keys.next();
                            jSONObject4.put(next, jSONObject2.opt(next));
                        }
                    }
                    str = jSONObject4.toString();
                } catch (org.json.JSONException | java.lang.Exception unused2) {
                    str = "";
                }
            }
        }
        return e(str);
    }

    public static void b(android.content.Context context, int i17, int i18, int i19, int i27, java.lang.String str, int i28, java.lang.String str2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportExposureInfo : ");
        sb6.append(i17);
        sb6.append(" , ");
        sb6.append(i18);
        sb6.append(" , ");
        sb6.append(i19);
        sb6.append(" , ");
        sb6.append(i27);
        sb6.append(" , 0 , ");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(str == null ? "" : str);
        sb6.append(" , ");
        sb6.append(i28);
        sb6.append(" , 0 , ");
        sb6.append("");
        sb6.append(" , ");
        sb6.append("");
        sb6.append(" , ");
        sb6.append(str2 != null ? str2 : "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameReportUtil", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[12];
        objArr[0] = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        int i29 = 1;
        objArr[1] = valueOf;
        objArr[2] = java.lang.Integer.valueOf(i19);
        objArr[3] = java.lang.Integer.valueOf(i27);
        objArr[4] = 0;
        objArr[5] = str;
        objArr[6] = java.lang.Integer.valueOf(i28);
        objArr[7] = 0;
        objArr[8] = null;
        objArr[9] = java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(null, 0));
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(context)) {
            i29 = 4;
        } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(context)) {
            i29 = 5;
        } else {
            int m40067xab9ed241 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(context);
            if (m40067xab9ed241 == -1) {
                i29 = 255;
            } else if (m40067xab9ed241 != 0) {
                i29 = m40067xab9ed241 != 5 ? m40067xab9ed241 != 6 ? 6 : 3 : 2;
            }
        }
        objArr[10] = java.lang.Integer.valueOf(i29);
        objArr[11] = str2;
        g0Var.d(13384, objArr);
    }

    public static void c(int i17, long j17, int i18, java.lang.String str, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameReportUtil", "report_31408 : " + i17 + " , " + j17 + " , " + i18 + " , " + str + " , " + i19);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(31408, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(i19));
    }

    public static java.lang.String d(java.util.Map map) {
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

    public static java.lang.String e(java.lang.String str) {
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

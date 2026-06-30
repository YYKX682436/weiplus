package m42;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f404981a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f404982b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f404983c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f404984d = new java.util.HashMap();

    public a() {
        java.lang.String[] split;
        java.lang.String[] split2;
        java.lang.String[] split3;
        java.lang.String[] split4;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_name_edge_computing_breaker_" + j62.e.g().n());
        if (M == null) {
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String string = M.getString("mmkv_key_script_config_recorder", "");
        char c17 = 1;
        char c18 = 0;
        if (!u46.l.e(string) && (split3 = string.split(";")) != null && split3.length > 0) {
            int length = split3.length;
            int i17 = 0;
            while (i17 < length) {
                java.lang.String str = split3[i17];
                try {
                    if (!u46.l.e(str) && (split4 = str.split(",")) != null && split4.length > 0) {
                        hashMap.put(split4[c18], java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(split4[c17], 0L)));
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EdgeComputingConfigBreaker", "[EdgeComputingConfigBreaker] initRecorder scriptConfigRecorder throw Exception : " + e17.getMessage() + ", record : " + str);
                }
                i17++;
                c17 = 1;
                c18 = 0;
            }
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.lang.String string2 = M.getString("mmkv_key_sql_config_recorder", "");
        if (!u46.l.e(string2) && (split = string2.split(";")) != null && split.length > 0) {
            for (java.lang.String str2 : split) {
                try {
                    if (!u46.l.e(str2) && (split2 = str2.split(",")) != null && split2.length > 0) {
                        try {
                        } catch (java.lang.Exception e18) {
                            e = e18;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EdgeComputingConfigBreaker", "[EdgeComputingConfigBreaker] initRecorder sqlConfigRecorder throw Exception : " + e.getMessage() + ", record : " + str2);
                        }
                        try {
                        } catch (java.lang.Exception e19) {
                            e = e19;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EdgeComputingConfigBreaker", "[EdgeComputingConfigBreaker] initRecorder sqlConfigRecorder throw Exception : " + e.getMessage() + ", record : " + str2);
                        }
                        try {
                            hashMap2.put(split2[0], java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(split2[1], 0L)));
                        } catch (java.lang.Exception e27) {
                            e = e27;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EdgeComputingConfigBreaker", "[EdgeComputingConfigBreaker] initRecorder sqlConfigRecorder throw Exception : " + e.getMessage() + ", record : " + str2);
                        }
                    }
                } catch (java.lang.Exception e28) {
                    e = e28;
                }
            }
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        for (java.lang.String str3 : hashMap.keySet()) {
            if (currentTimeMillis - ((java.lang.Long) hashMap.get(str3)).longValue() < 129600000) {
                ((java.util.HashMap) this.f404981a).put(str3, java.lang.Long.valueOf(currentTimeMillis));
                ((java.util.HashMap) this.f404983c).put(str3, java.lang.Long.valueOf(currentTimeMillis));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EdgeComputingConfigBreaker", "[EdgeComputingConfigBreaker] initRecorder errorScriptConfigRecord : " + str3 + ", time : " + currentTimeMillis);
            }
        }
        for (java.lang.String str4 : hashMap2.keySet()) {
            if (currentTimeMillis - ((java.lang.Long) hashMap2.get(str4)).longValue() < 129600000) {
                ((java.util.HashMap) this.f404982b).put(str4, java.lang.Long.valueOf(currentTimeMillis));
                ((java.util.HashMap) this.f404984d).put(str4, java.lang.Long.valueOf(currentTimeMillis));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EdgeComputingConfigBreaker", "[EdgeComputingConfigBreaker] initRecorder errorSqlConfigRecord : " + str4 + ", time : " + currentTimeMillis);
            }
        }
        a();
    }

    public final void a() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_name_edge_computing_breaker_" + j62.e.g().n());
        if (M == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.HashMap hashMap = (java.util.HashMap) this.f404983c;
        for (java.lang.String str : hashMap.keySet()) {
            sb6.append(str);
            sb6.append(",");
            sb6.append(hashMap.get(str));
            sb6.append(";");
        }
        M.putString("mmkv_key_script_config_recorder", sb6.toString());
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        java.util.HashMap hashMap2 = (java.util.HashMap) this.f404984d;
        for (java.lang.String str2 : hashMap2.keySet()) {
            sb7.append(str2);
            sb7.append(",");
            sb7.append(hashMap2.get(str2));
            sb7.append(";");
        }
        M.putString("mmkv_key_sql_config_recorder", sb7.toString());
    }
}

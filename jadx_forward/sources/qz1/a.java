package qz1;

/* loaded from: classes13.dex */
public class a implements gy1.a {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Boolean f449360a = null;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Boolean f449361b = null;

    @Override // gy1.a
    public boolean a(long j17, java.lang.String str, java.util.Map map, ky1.d dVar) {
        java.lang.Object obj;
        oy1.n c17;
        if (!u46.l.e(str) && dVar != null) {
            int i17 = dVar.f395033b;
            if (i17 == 5 || i17 == 9 || i17 == 999) {
                try {
                    java.util.Map Di = ((fm4.f) ((qk.k8) i95.n0.c(qk.k8.class))).Di(dVar.f395033b);
                    if (Di != null) {
                        java.util.HashMap hashMap = (java.util.HashMap) Di;
                        if (hashMap.size() > 0 && map != null && (obj = map.get("udf_kv")) != null && (obj instanceof java.util.Map)) {
                            for (java.lang.String str2 : hashMap.keySet()) {
                                if (!((java.util.Map) obj).containsKey(str2)) {
                                    ((java.util.Map) obj).put(str2, hashMap.get(str2));
                                }
                            }
                        }
                    }
                    cy1.a.Ui().Pj(j17, str, map, 29375, false);
                } catch (java.lang.Exception unused) {
                }
            }
            if (!"LiteAppCustomReportCgiEvent".equals(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.Test.CGI", "[route] eventId : " + str + ", routeRule : " + dVar.f395033b + ", params : " + sz1.a.a(map, 0));
                if (dVar.f395033b == 999) {
                    dVar.f395033b = 5;
                }
                if (map != null) {
                    oy1.n c18 = c(dVar, j17, str, map);
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    linkedList.add(c18);
                    if (c18 != null) {
                        oy1.p.f431444a.c(dVar.f395033b, linkedList, false);
                    }
                }
            } else if (map != null) {
                try {
                    java.util.LinkedList linkedList2 = new java.util.LinkedList();
                    java.lang.Object obj2 = map.get("udf_kv");
                    java.util.HashMap hashMap2 = new java.util.HashMap();
                    if (obj2 instanceof java.util.Map) {
                        java.util.Map map2 = (java.util.Map) obj2;
                        java.lang.Object remove = map2.remove("LiteAppCustomReportCgiEvent");
                        for (java.util.Map.Entry entry : map2.entrySet()) {
                            hashMap2.put((java.lang.String) entry.getKey(), entry.getValue());
                        }
                        if (remove instanceof java.util.List) {
                            for (java.lang.Object obj3 : (java.util.List) remove) {
                                if (obj3 instanceof java.util.Map) {
                                    java.util.HashMap hashMap3 = new java.util.HashMap();
                                    java.util.HashMap hashMap4 = new java.util.HashMap(hashMap2);
                                    java.lang.String str3 = "";
                                    for (java.util.Map.Entry entry2 : ((java.util.Map) obj3).entrySet()) {
                                        java.lang.String str4 = (java.lang.String) entry2.getKey();
                                        java.lang.Object value = entry2.getValue();
                                        hashMap4.put(str4, value);
                                        if (str4.equals("eventId")) {
                                            str3 = (java.lang.String) value;
                                        }
                                    }
                                    for (java.util.Map.Entry entry3 : map.entrySet()) {
                                        java.lang.String str5 = (java.lang.String) entry3.getKey();
                                        if (java.util.Objects.equals(str5, "udf_kv")) {
                                            hashMap3.put(str5, hashMap4);
                                        } else {
                                            hashMap3.put(str5, entry3.getValue());
                                        }
                                    }
                                    if (!hashMap3.isEmpty() && (c17 = c(dVar, j17, str3, hashMap3)) != null) {
                                        linkedList2.add(c17);
                                    }
                                }
                            }
                        }
                    }
                    if (!linkedList2.isEmpty()) {
                        oy1.p.f431444a.c(dVar.f395033b, linkedList2, true);
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CGIReportRouter", "get params err %s", e17.toString());
                }
            }
        }
        return false;
    }

    @Override // gy1.a
    public int b() {
        return 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:94:0x028f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02da A[PHI: r2 r17 r20 r21 r22
  0x02da: PHI (r2v19 java.lang.String) = 
  (r2v18 java.lang.String)
  (r2v21 java.lang.String)
  (r2v18 java.lang.String)
  (r2v18 java.lang.String)
  (r2v18 java.lang.String)
  (r2v18 java.lang.String)
 binds: [B:94:0x028f, B:118:0x02d7, B:113:0x02c8, B:108:0x02b9, B:103:0x02a9, B:97:0x0299] A[DONT_GENERATE, DONT_INLINE]
  0x02da: PHI (r17v3 java.lang.String) = 
  (r17v2 java.lang.String)
  (r17v2 java.lang.String)
  (r17v2 java.lang.String)
  (r17v2 java.lang.String)
  (r17v2 java.lang.String)
  (r17v6 java.lang.String)
 binds: [B:94:0x028f, B:118:0x02d7, B:113:0x02c8, B:108:0x02b9, B:103:0x02a9, B:97:0x0299] A[DONT_GENERATE, DONT_INLINE]
  0x02da: PHI (r20v3 java.lang.String) = 
  (r20v2 java.lang.String)
  (r20v2 java.lang.String)
  (r20v5 java.lang.String)
  (r20v2 java.lang.String)
  (r20v2 java.lang.String)
  (r20v2 java.lang.String)
 binds: [B:94:0x028f, B:118:0x02d7, B:113:0x02c8, B:108:0x02b9, B:103:0x02a9, B:97:0x0299] A[DONT_GENERATE, DONT_INLINE]
  0x02da: PHI (r21v3 java.lang.String) = 
  (r21v2 java.lang.String)
  (r21v2 java.lang.String)
  (r21v2 java.lang.String)
  (r21v2 java.lang.String)
  (r21v5 java.lang.String)
  (r21v2 java.lang.String)
 binds: [B:94:0x028f, B:118:0x02d7, B:113:0x02c8, B:108:0x02b9, B:103:0x02a9, B:97:0x0299] A[DONT_GENERATE, DONT_INLINE]
  0x02da: PHI (r22v5 java.lang.String) = 
  (r22v4 java.lang.String)
  (r22v4 java.lang.String)
  (r22v4 java.lang.String)
  (r22v7 java.lang.String)
  (r22v4 java.lang.String)
  (r22v4 java.lang.String)
 binds: [B:94:0x028f, B:118:0x02d7, B:113:0x02c8, B:108:0x02b9, B:103:0x02a9, B:97:0x0299] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0200 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0293  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final oy1.n c(ky1.d r29, long r30, java.lang.String r32, java.util.Map r33) {
        /*
            Method dump skipped, instructions count: 906
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qz1.a.c(ky1.d, long, java.lang.String, java.util.Map):oy1.n");
    }

    public final int d(java.util.Map map) {
        if (map == null) {
            return 0;
        }
        org.json.JSONObject jSONObject = (org.json.JSONObject) sz1.f.c(map);
        return (jSONObject != null ? jSONObject.toString() : "").getBytes(java.nio.charset.StandardCharsets.UTF_8).length;
    }

    public final void e(java.util.Map map) {
        if (this.f449361b == null) {
            this.f449361b = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_data_report_sdk_cgi_remove_page_info, true));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CGIReportRouter", "isRemovePageInfo = " + this.f449361b);
        }
        if (this.f449361b.booleanValue()) {
            java.util.HashSet hashSet = new java.util.HashSet();
            hashSet.add("page_id");
            hashSet.add("page_name");
            map.keySet().retainAll(hashSet);
        }
    }

    public final java.lang.String f(java.util.Map map) {
        org.json.JSONObject jSONObject;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (map == null) {
            return "";
        }
        if (d(map) <= 2048 && (jSONObject = (org.json.JSONObject) sz1.f.c(map)) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CGIReportRouter", "not removePageLargeParams cost time [%d]", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            return jSONObject.toString();
        }
        sz1.f.a(map);
        int d17 = d(map);
        int i17 = 0;
        while (d17 > 2048 && i17 < 20) {
            i17++;
            sz1.f.a(map);
            d17 = d(map);
        }
        if (d17 > 2048) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CGIReportRouter", " [%d] params  remove,   cost time [%d]", java.lang.Integer.valueOf(i17 + 1), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            return "";
        }
        org.json.JSONObject jSONObject2 = (org.json.JSONObject) sz1.f.c(map);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CGIReportRouter", " [%d] params  remove,   cost time [%d]", java.lang.Integer.valueOf(i17 + 1), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        return jSONObject2.toString();
    }
}

package a62;

/* loaded from: classes15.dex */
public abstract class d {
    public static org.json.JSONArray a(java.util.List list, org.json.JSONObject jSONObject, long j17) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        long j18 = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            try {
                r45.jw3 jw3Var = (r45.jw3) list.get(i17);
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("pageName", jw3Var.f459692d);
                jSONObject2.put("tbe", jw3Var.f459693e);
                long max = java.lang.Math.max(jw3Var.f459694f, 0L);
                jSONObject2.put("in", max);
                j18 += max;
                if (i17 == 0) {
                    jSONObject.put("tbe", jw3Var.f459693e);
                }
                a62.h.b(jSONObject2, jw3Var, false, j17);
                a62.h.c(jSONObject2, jw3Var, j17);
                jSONArray.put(jSONObject2);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.HellSessionPageDetailReport", e17, "createPagePathJsonArray json crash", new java.lang.Object[0]);
            }
        }
        jSONObject.put("in", java.lang.Math.max(j18, 0L));
        return jSONArray;
    }

    public static java.lang.String b(r45.lw3 lw3Var, java.lang.String str) {
        java.util.Iterator it = lw3Var.f461411f.iterator();
        while (it.hasNext()) {
            r45.c45 c45Var = (r45.c45) it.next();
            if (c45Var != null && c45Var.f452803d.equals(str)) {
                return com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.c.i(c45Var.f452818v);
            }
        }
        java.util.Iterator it6 = lw3Var.f461413h.iterator();
        while (it6.hasNext()) {
            r45.w35 w35Var = (r45.w35) it6.next();
            if (w35Var != null) {
                if (!w35Var.f470375d.equals(str)) {
                    if ((w35Var.f470381m + "_" + w35Var.f470378g).equals(str)) {
                    }
                }
                return com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.c.i(w35Var.f470385q);
            }
        }
        return null;
    }

    public static void c(java.util.List list) {
        java.lang.String c17;
        boolean z17;
        int h17 = b52.b.h();
        if (h17 == 0) {
            c17 = "-1";
        } else {
            c17 = c52.c.c("mmkv_key_hellSenPageFlRptChe_" + h17);
            if (c17 == null || c17.isEmpty()) {
                c17 = null;
            }
        }
        java.lang.String a17 = x52.d.a(c17);
        if (a17 != null && !a17.isEmpty()) {
            try {
                java.lang.String[] split = a17.split("\\|");
                if (split.length > 0) {
                    if (split.length == 1) {
                        java.lang.String[] split2 = split[0].split("-");
                        if (split2.length == 2) {
                            if (list == null) {
                                list = new java.util.ArrayList();
                            }
                            list.add(nm5.j.c(split2[0], split2[1]));
                        }
                    } else {
                        for (java.lang.String str : split) {
                            if (str != null) {
                                java.lang.String[] split3 = str.split("-");
                                if (split3.length == 2) {
                                    if (list == null) {
                                        list = new java.util.ArrayList();
                                    }
                                    list.add(nm5.j.c(split3[0], split3[1]));
                                }
                            }
                        }
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.HellSessionPageDetailReport", e17, "restoreSessionMap crash: %s", e17.getMessage());
            }
        }
        if (list == null || list.isEmpty()) {
            z17 = false;
        } else {
            z17 = false;
            for (nm5.b bVar : list) {
                java.lang.String str2 = (java.lang.String) bVar.a(1);
                if (str2 != null) {
                    try {
                        org.json.JSONArray optJSONArray = new org.json.JSONObject(str2).optJSONArray("content");
                        if (optJSONArray.length() > 0) {
                            for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                                org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
                                if (optJSONObject != null && optJSONObject.optLong("pagePathId", 0L) == 1179880) {
                                    jx3.f.INSTANCE.d(19354, 9);
                                }
                            }
                        }
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.HellSessionPageDetailReport", e18, "realReportFlow, crash: %s", e18.getMessage());
                    }
                }
                java.lang.String str3 = (java.lang.String) bVar.a(0);
                if (str2 != null) {
                    int length = str2.length();
                    if (length >= 1900) {
                        int i18 = length / 1900;
                        int i19 = length % 1900;
                        for (int i27 = 0; i27 < i18; i27++) {
                            int i28 = i27 * 1900;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellSessionPageDetailReport", "reportSessionPageDetail-item-%d: %s, %s", java.lang.Integer.valueOf(i27), str3, str2.substring(i28, i28 + 1900));
                        }
                        if (i19 > 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellSessionPageDetailReport", "reportSessionPageDetail-item-left: %s, %s", str3, str2.substring(i18 * 1900));
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellSessionPageDetailReport", "reportSessionPageDetail-item: %s, %s", str3, str2);
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1394xc84c5534.C13493x9cb3cdf1.p(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) bVar.a(0), -1), str2, 5120);
                for (nm5.b bVar2 : list) {
                    q42.l lVar = g42.f.Bi().f350254d;
                    java.lang.String str4 = (java.lang.String) bVar2.a(1);
                    int parseInt = java.lang.Integer.parseInt((java.lang.String) bVar2.a(0));
                    lVar.getClass();
                    if (g42.i.h()) {
                        if (parseInt <= 0 || u46.l.e(str4)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EdgeComputingDataSourceService", "[EdgeComputingDataSourceService] sendSessionPageSingle data or sessionPageID isEmpty!");
                        } else {
                            g42.i.a("EdgeComputingDataSourceService", "[EdgeComputingDataSourceService] sendSessionPageSingle reportID : " + parseInt + ", data : " + str4);
                            lVar.f441614b.mo50293x3498a0(new q42.g(lVar, parseInt, java.lang.System.currentTimeMillis(), str4));
                        }
                    }
                }
                z17 = true;
            }
        }
        if (z17) {
            java.lang.String valueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
            int h18 = b52.b.h();
            if (h18 == 0) {
                return;
            }
            if (valueOf == null) {
                valueOf = "";
            }
            try {
                c52.c.e("mmkv_key_hellSenPageFlRptChe_" + h18, valueOf);
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.HellSessionPageDao", e19, "HellSessionReportCache.writeBackOfFlow", new java.lang.Object[0]);
            }
        }
    }
}

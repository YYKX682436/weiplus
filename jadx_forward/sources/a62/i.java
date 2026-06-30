package a62;

/* loaded from: classes15.dex */
public abstract class i {
    public static org.json.JSONArray a(java.util.Map map, r45.c45 c45Var) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.List<r45.jw3> list = (java.util.List) map.get(c45Var.f452803d);
        if (list == null || list.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HABBYGE-MALI.HellSessionUBAReport", "pagePathJsonArrayForSession: NULL");
            return jSONArray;
        }
        try {
            org.json.JSONObject jSONObject = null;
            long j17 = 0;
            int i17 = 0;
            for (r45.jw3 jw3Var : list) {
                if (jw3Var != null) {
                    jSONObject = new org.json.JSONObject();
                    jSONObject.put("pageName", jw3Var.f459692d);
                    jSONObject.put("tbe", jw3Var.f459693e);
                    jSONObject.put("in", jw3Var.f459694f);
                    j17 += jw3Var.f459694f;
                    i17++;
                    a62.h.b(jSONObject, jw3Var, true, -1L);
                    jSONArray.put(jSONObject);
                }
            }
            long j18 = c45Var.f452809m;
            long j19 = c45Var.f452808i;
            long j27 = j18 - j19;
            if (j27 < 5000) {
                c45Var.f452809m = j19 + j17;
            } else if (i17 == 1) {
                jSONObject.put("in", j27);
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.HellSessionUBAReport", e17, "pagePathJsonArrayForSession json crash", new java.lang.Object[0]);
        }
        return jSONArray;
    }

    public static org.json.JSONArray b(java.util.Map map, r45.w35 w35Var) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.lang.String str = w35Var.f470381m;
        if (str != null && !str.isEmpty()) {
            java.lang.String str2 = w35Var.f470381m + "_" + w35Var.f470378g;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellSessionUBAReport", "pagePathJsonArrayForUnknowPage, unknonwSessionId: %s", str2);
            java.util.List<r45.jw3> list = (java.util.List) map.get(str2);
            if (list != null && !list.isEmpty()) {
                try {
                    org.json.JSONObject jSONObject = null;
                    long j17 = 0;
                    int i17 = 0;
                    for (r45.jw3 jw3Var : list) {
                        if (jw3Var != null) {
                            jSONObject = new org.json.JSONObject();
                            jSONObject.put("pageName", jw3Var.f459692d);
                            jSONObject.put("tbe", jw3Var.f459693e);
                            jSONObject.put("in", jw3Var.f459694f);
                            j17 += jw3Var.f459694f;
                            i17++;
                            jSONArray.put(jSONObject);
                        }
                    }
                    long j18 = w35Var.f470379h;
                    long j19 = w35Var.f470378g;
                    long j27 = j18 - j19;
                    if (j27 < 5000) {
                        w35Var.f470379h = j19 + j17;
                    } else if (i17 == 1) {
                        jSONObject.put("in", j27);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellSessionUBAReport", "pagePathJsonArrayForUnknowPage: %s", jSONArray.toString());
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.HellSessionUBAReport", e17, "pagePathJsonArrayForUnknowPage json crash", new java.lang.Object[0]);
                }
                return jSONArray;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HABBYGE-MALI.HellSessionUBAReport", "pagePathJsonArrayForUnknowPage, unknowPageFlow NULL");
        }
        return jSONArray;
    }

    public static boolean c(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellSessionUBAReport", "HellSessionUBAReport, reportSessionUBA: %s", str);
        java.util.List c17 = jx3.a.c(str.replace(',', '#'), 5120);
        if (c17 == null) {
            return false;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6866xe5643a93 c6866xe5643a93 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6866xe5643a93();
        c6866xe5643a93.f141835d = android.os.Process.myPid();
        c6866xe5643a93.f141836e = c6866xe5643a93.b("PName", ((km0.c) gm0.j1.p().a()).f390520a, true);
        c6866xe5643a93.f141837f = jx3.a.e();
        java.util.ArrayList arrayList = (java.util.ArrayList) c17;
        c6866xe5643a93.f141839h = arrayList.size();
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            c6866xe5643a93.f141838g = i17;
            c6866xe5643a93.f141840i = c6866xe5643a93.b("DataContent", (java.lang.String) arrayList.get(i17), true);
            c6866xe5643a93.k();
        }
        return true;
    }
}

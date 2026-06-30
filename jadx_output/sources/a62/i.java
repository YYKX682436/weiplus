package a62;

/* loaded from: classes15.dex */
public abstract class i {
    public static org.json.JSONArray a(java.util.Map map, r45.c45 c45Var) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.List<r45.jw3> list = (java.util.List) map.get(c45Var.f371270d);
        if (list == null || list.isEmpty()) {
            com.tencent.mars.xlog.Log.e("HABBYGE-MALI.HellSessionUBAReport", "pagePathJsonArrayForSession: NULL");
            return jSONArray;
        }
        try {
            org.json.JSONObject jSONObject = null;
            long j17 = 0;
            int i17 = 0;
            for (r45.jw3 jw3Var : list) {
                if (jw3Var != null) {
                    jSONObject = new org.json.JSONObject();
                    jSONObject.put("pageName", jw3Var.f378159d);
                    jSONObject.put("tbe", jw3Var.f378160e);
                    jSONObject.put("in", jw3Var.f378161f);
                    j17 += jw3Var.f378161f;
                    i17++;
                    a62.h.b(jSONObject, jw3Var, true, -1L);
                    jSONArray.put(jSONObject);
                }
            }
            long j18 = c45Var.f371276m;
            long j19 = c45Var.f371275i;
            long j27 = j18 - j19;
            if (j27 < 5000) {
                c45Var.f371276m = j19 + j17;
            } else if (i17 == 1) {
                jSONObject.put("in", j27);
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.HellSessionUBAReport", e17, "pagePathJsonArrayForSession json crash", new java.lang.Object[0]);
        }
        return jSONArray;
    }

    public static org.json.JSONArray b(java.util.Map map, r45.w35 w35Var) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.lang.String str = w35Var.f388848m;
        if (str != null && !str.isEmpty()) {
            java.lang.String str2 = w35Var.f388848m + "_" + w35Var.f388845g;
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionUBAReport", "pagePathJsonArrayForUnknowPage, unknonwSessionId: %s", str2);
            java.util.List<r45.jw3> list = (java.util.List) map.get(str2);
            if (list != null && !list.isEmpty()) {
                try {
                    org.json.JSONObject jSONObject = null;
                    long j17 = 0;
                    int i17 = 0;
                    for (r45.jw3 jw3Var : list) {
                        if (jw3Var != null) {
                            jSONObject = new org.json.JSONObject();
                            jSONObject.put("pageName", jw3Var.f378159d);
                            jSONObject.put("tbe", jw3Var.f378160e);
                            jSONObject.put("in", jw3Var.f378161f);
                            j17 += jw3Var.f378161f;
                            i17++;
                            jSONArray.put(jSONObject);
                        }
                    }
                    long j18 = w35Var.f388846h;
                    long j19 = w35Var.f388845g;
                    long j27 = j18 - j19;
                    if (j27 < 5000) {
                        w35Var.f388846h = j19 + j17;
                    } else if (i17 == 1) {
                        jSONObject.put("in", j27);
                    }
                    com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionUBAReport", "pagePathJsonArrayForUnknowPage: %s", jSONArray.toString());
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.HellSessionUBAReport", e17, "pagePathJsonArrayForUnknowPage json crash", new java.lang.Object[0]);
                }
                return jSONArray;
            }
            com.tencent.mars.xlog.Log.e("HABBYGE-MALI.HellSessionUBAReport", "pagePathJsonArrayForUnknowPage, unknowPageFlow NULL");
        }
        return jSONArray;
    }

    public static boolean c(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionUBAReport", "HellSessionUBAReport, reportSessionUBA: %s", str);
        java.util.List c17 = jx3.a.c(str.replace(',', '#'), 5120);
        if (c17 == null) {
            return false;
        }
        com.tencent.mm.autogen.mmdata.rpt.SessionUBAStruct sessionUBAStruct = new com.tencent.mm.autogen.mmdata.rpt.SessionUBAStruct();
        sessionUBAStruct.f60302d = android.os.Process.myPid();
        sessionUBAStruct.f60303e = sessionUBAStruct.b("PName", ((km0.c) gm0.j1.p().a()).f308987a, true);
        sessionUBAStruct.f60304f = jx3.a.e();
        java.util.ArrayList arrayList = (java.util.ArrayList) c17;
        sessionUBAStruct.f60306h = arrayList.size();
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            sessionUBAStruct.f60305g = i17;
            sessionUBAStruct.f60307i = sessionUBAStruct.b("DataContent", (java.lang.String) arrayList.get(i17), true);
            sessionUBAStruct.k();
        }
        return true;
    }
}

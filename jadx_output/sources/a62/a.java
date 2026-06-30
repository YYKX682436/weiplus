package a62;

/* loaded from: classes15.dex */
public abstract class a {
    public static void a(org.json.JSONObject jSONObject, r45.u53 u53Var, r45.t53 t53Var) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        if (t53Var == null) {
            jSONObject.put("businessParam", jSONArray);
            return;
        }
        r45.c16 c16Var = u53Var.f387049f;
        java.util.LinkedList linkedList = u53Var.f387048e;
        java.lang.String str = null;
        if (!linkedList.isEmpty() && linkedList.size() == 1) {
            str = b52.b.g(((r45.c16) linkedList.get(0)).f371220d);
        }
        java.lang.String g17 = b52.b.g(c16Var.f371220d);
        java.lang.String g18 = b52.b.g(t53Var.f386152d);
        if (str != null && str.equals(g18)) {
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FuzzyDetailReport", "sPrePageName: %s, %s", str, g18);
            b(t53Var, jSONArray, u53Var.f387054n);
        } else if (g17 == null || !g17.equals(g18)) {
            com.tencent.mars.xlog.Log.e("HABBYGE-MALI.FuzzyDetailReport", "Neither prePage nor curPage !!");
            jSONObject.put("businessParam", jSONArray);
            return;
        } else {
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FuzzyDetailReport", "sCurPageName: %s, %s", g17, g18);
            b(t53Var, jSONArray, u53Var.f387054n);
        }
        jSONObject.put("businessParam", jSONArray);
    }

    public static void b(r45.t53 t53Var, org.json.JSONArray jSONArray, long j17) {
        java.lang.String str;
        int i17 = 0;
        if (t53Var.f386155g.isEmpty()) {
            java.lang.String g17 = b52.b.g(t53Var.f386152d);
            if (g17 != null) {
                a62.h.e(g17, false, j17);
                return;
            }
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList linkedList = t53Var.f386155g;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.kw3 kw3Var = (r45.kw3) it.next();
            if (kw3Var != null && !android.text.TextUtils.isEmpty(kw3Var.f379000f)) {
                arrayList.add(kw3Var.f379000f);
            }
        }
        try {
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                r45.kw3 kw3Var2 = (r45.kw3) it6.next();
                if (kw3Var2 != null) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    java.lang.String str2 = kw3Var2.f378999e;
                    java.lang.String str3 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    jSONObject.put("dataPath", str2);
                    java.lang.String str4 = kw3Var2.f378998d;
                    if (str4 != null) {
                        str3 = str4;
                    }
                    jSONObject.put("value", str3);
                    if (!android.text.TextUtils.isEmpty(kw3Var2.f379000f)) {
                        str = kw3Var2.f379000f;
                        jSONObject.put("businessId", str);
                        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionReportUtil", "handleSessionPageDetailParams, bizId, %s", str);
                        jSONArray.put(jSONObject);
                    }
                    do {
                        i17++;
                        str = com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.d(t53Var.f386153e, i17);
                    } while (arrayList.contains(str));
                    arrayList.add(str);
                    jSONObject.put("businessId", str);
                    com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionReportUtil", "handleSessionPageDetailParams, bizId, %s", str);
                    jSONArray.put(jSONObject);
                }
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.HellSessionReportUtil", e17, "handleFuzzyPathDetailParams: %s", e17.getMessage());
        }
        jSONArray.length();
    }

    public static void c(org.json.JSONObject jSONObject, r45.u53 u53Var, r45.t53 t53Var) {
        boolean z17;
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = t53Var.f386156h.iterator();
        boolean z18 = false;
        while (it.hasNext()) {
            r45.a07 a07Var = (r45.a07) it.next();
            if (a07Var != null) {
                java.lang.String g17 = b52.b.g(t53Var.f386152d);
                java.lang.String g18 = b52.b.g(u53Var.f387049f.f371220d);
                k52.p pVar = k52.q.f304326a;
                if (g18 != null && g18.equals(g17)) {
                    java.util.Iterator it6 = u53Var.f387049f.f371222f.iterator();
                    while (it6.hasNext()) {
                        r45.b07 b07Var = (r45.b07) it6.next();
                        if (pVar.e(a07Var, b07Var)) {
                            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FuzzyDetailReport", "inConfig: entry: viewNode=%s, %s", b07Var.f370417d, b07Var.f370422i);
                            break;
                        }
                    }
                }
                java.util.Iterator it7 = u53Var.f387048e.iterator();
                while (it7.hasNext()) {
                    r45.c16 c16Var = (r45.c16) it7.next();
                    java.lang.String g19 = b52.b.g(c16Var.f371220d);
                    if (g19 != null && g19.equals(g17)) {
                        java.util.Iterator it8 = c16Var.f371222f.iterator();
                        while (it8.hasNext()) {
                            r45.b07 b07Var2 = (r45.b07) it8.next();
                            if (pVar.e(a07Var, b07Var2)) {
                                com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FuzzyDetailReport", "inConfig: prePage=%s, %s", b07Var2.f370417d, b07Var2.f370422i);
                                z17 = true;
                            }
                        }
                    }
                }
                com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FuzzyDetailReport", "inConfig: false: %s, %s", a07Var.f369601d, a07Var.f369602e);
                z17 = false;
                if (z17) {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("viewId", a07Var.f369602e);
                    jSONObject2.put("type", a07Var.f369615u);
                    jSONObject2.put("action", a07Var.f369606i);
                    jSONObject2.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, a07Var.f369609o);
                    java.util.LinkedList linkedList = a07Var.f369612r;
                    if (linkedList.isEmpty()) {
                        java.lang.String g27 = b52.b.g(t53Var.f386152d);
                        if (g27 != null) {
                            a62.h.f(a07Var.f369602e, g27, u53Var.f387054n);
                        }
                    } else {
                        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                        java.util.Iterator it9 = linkedList.iterator();
                        while (it9.hasNext()) {
                            r45.ql qlVar = (r45.ql) it9.next();
                            if (qlVar != null && qlVar.f384080d == u53Var.f387054n) {
                                java.util.Iterator it10 = qlVar.f384081e.iterator();
                                while (it10.hasNext()) {
                                    r45.kw3 kw3Var = (r45.kw3) it10.next();
                                    if (kw3Var != null && kw3Var.f378999e != null) {
                                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                                        jSONObject3.put("dataPath", kw3Var.f378999e);
                                        jSONObject3.put("value", kw3Var.f378998d);
                                        jSONArray2.put(jSONObject3);
                                    }
                                }
                            }
                        }
                        if (jSONArray2.length() > 0) {
                            jSONObject2.put("businessParam", jSONArray2);
                        }
                    }
                    jSONArray.put(jSONObject2);
                    z18 = true;
                }
            }
        }
        jSONObject.put("viewOp", jSONArray);
        if (z18) {
            if (!t53Var.f386156h.isEmpty()) {
                jSONArray.length();
                long j17 = u53Var.f387054n;
            } else {
                java.lang.String g28 = b52.b.g(t53Var.f386152d);
                if (g28 != null) {
                    a62.h.g(g28, u53Var.f387054n);
                }
            }
        }
    }

    public static org.json.JSONArray d(r45.u53 u53Var, org.json.JSONObject jSONObject) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        if (u53Var != null) {
            java.util.LinkedList linkedList = u53Var.f387050g;
            if (!linkedList.isEmpty()) {
                int size = linkedList.size();
                long j17 = 0;
                for (int i17 = 0; i17 < size; i17++) {
                    try {
                        r45.t53 t53Var = (r45.t53) linkedList.get(i17);
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        jSONObject2.put("pageName", t53Var.f386152d);
                        jSONObject2.put("tbe", t53Var.f386153e);
                        jSONObject2.put("in", t53Var.f386154f);
                        j17 += t53Var.f386154f;
                        if (i17 == 0) {
                            try {
                                jSONObject.put("tbe", t53Var.f386153e);
                            } catch (java.lang.Exception e17) {
                                com.tencent.mm.sdk.platformtools.Log.c("HABBYGE-MALI.FuzzyDetailReport", "createFuzzyPathJsonArray, exception: %s", e17.getMessage());
                            }
                        }
                        try {
                            a(jSONObject2, u53Var, t53Var);
                        } catch (org.json.JSONException e18) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.FuzzyDetailReport", e18, "_getBizParams crash: %s", e18.getMessage());
                        }
                        c(jSONObject2, u53Var, t53Var);
                        jSONArray.put(jSONObject2);
                    } catch (org.json.JSONException e19) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.FuzzyDetailReport", e19, "createFuzzyPathJsonArray crash: %s", e19.getMessage());
                    }
                }
                jSONObject.put("in", j17 > 0 ? j17 : 0L);
            }
        }
        return jSONArray;
    }
}

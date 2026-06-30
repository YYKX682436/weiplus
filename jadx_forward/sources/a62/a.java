package a62;

/* loaded from: classes15.dex */
public abstract class a {
    public static void a(org.json.JSONObject jSONObject, r45.u53 u53Var, r45.t53 t53Var) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        if (t53Var == null) {
            jSONObject.put("businessParam", jSONArray);
            return;
        }
        r45.c16 c16Var = u53Var.f468582f;
        java.util.LinkedList linkedList = u53Var.f468581e;
        java.lang.String str = null;
        if (!linkedList.isEmpty() && linkedList.size() == 1) {
            str = b52.b.g(((r45.c16) linkedList.get(0)).f452753d);
        }
        java.lang.String g17 = b52.b.g(c16Var.f452753d);
        java.lang.String g18 = b52.b.g(t53Var.f467685d);
        if (str != null && str.equals(g18)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FuzzyDetailReport", "sPrePageName: %s, %s", str, g18);
            b(t53Var, jSONArray, u53Var.f468587n);
        } else if (g17 == null || !g17.equals(g18)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HABBYGE-MALI.FuzzyDetailReport", "Neither prePage nor curPage !!");
            jSONObject.put("businessParam", jSONArray);
            return;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FuzzyDetailReport", "sCurPageName: %s, %s", g17, g18);
            b(t53Var, jSONArray, u53Var.f468587n);
        }
        jSONObject.put("businessParam", jSONArray);
    }

    public static void b(r45.t53 t53Var, org.json.JSONArray jSONArray, long j17) {
        java.lang.String str;
        int i17 = 0;
        if (t53Var.f467688g.isEmpty()) {
            java.lang.String g17 = b52.b.g(t53Var.f467685d);
            if (g17 != null) {
                a62.h.e(g17, false, j17);
                return;
            }
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList linkedList = t53Var.f467688g;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.kw3 kw3Var = (r45.kw3) it.next();
            if (kw3Var != null && !android.text.TextUtils.isEmpty(kw3Var.f460533f)) {
                arrayList.add(kw3Var.f460533f);
            }
        }
        try {
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                r45.kw3 kw3Var2 = (r45.kw3) it6.next();
                if (kw3Var2 != null) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    java.lang.String str2 = kw3Var2.f460532e;
                    java.lang.String str3 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    jSONObject.put("dataPath", str2);
                    java.lang.String str4 = kw3Var2.f460531d;
                    if (str4 != null) {
                        str3 = str4;
                    }
                    jSONObject.put("value", str3);
                    if (!android.text.TextUtils.isEmpty(kw3Var2.f460533f)) {
                        str = kw3Var2.f460533f;
                        jSONObject.put("businessId", str);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellSessionReportUtil", "handleSessionPageDetailParams, bizId, %s", str);
                        jSONArray.put(jSONObject);
                    }
                    do {
                        i17++;
                        str = com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.c.d(t53Var.f467686e, i17);
                    } while (arrayList.contains(str));
                    arrayList.add(str);
                    jSONObject.put("businessId", str);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellSessionReportUtil", "handleSessionPageDetailParams, bizId, %s", str);
                    jSONArray.put(jSONObject);
                }
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.HellSessionReportUtil", e17, "handleFuzzyPathDetailParams: %s", e17.getMessage());
        }
        jSONArray.length();
    }

    public static void c(org.json.JSONObject jSONObject, r45.u53 u53Var, r45.t53 t53Var) {
        boolean z17;
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = t53Var.f467689h.iterator();
        boolean z18 = false;
        while (it.hasNext()) {
            r45.a07 a07Var = (r45.a07) it.next();
            if (a07Var != null) {
                java.lang.String g17 = b52.b.g(t53Var.f467685d);
                java.lang.String g18 = b52.b.g(u53Var.f468582f.f452753d);
                k52.p pVar = k52.q.f385859a;
                if (g18 != null && g18.equals(g17)) {
                    java.util.Iterator it6 = u53Var.f468582f.f452755f.iterator();
                    while (it6.hasNext()) {
                        r45.b07 b07Var = (r45.b07) it6.next();
                        if (pVar.e(a07Var, b07Var)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FuzzyDetailReport", "inConfig: entry: viewNode=%s, %s", b07Var.f451950d, b07Var.f451955i);
                            break;
                        }
                    }
                }
                java.util.Iterator it7 = u53Var.f468581e.iterator();
                while (it7.hasNext()) {
                    r45.c16 c16Var = (r45.c16) it7.next();
                    java.lang.String g19 = b52.b.g(c16Var.f452753d);
                    if (g19 != null && g19.equals(g17)) {
                        java.util.Iterator it8 = c16Var.f452755f.iterator();
                        while (it8.hasNext()) {
                            r45.b07 b07Var2 = (r45.b07) it8.next();
                            if (pVar.e(a07Var, b07Var2)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FuzzyDetailReport", "inConfig: prePage=%s, %s", b07Var2.f451950d, b07Var2.f451955i);
                                z17 = true;
                            }
                        }
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FuzzyDetailReport", "inConfig: false: %s, %s", a07Var.f451134d, a07Var.f451135e);
                z17 = false;
                if (z17) {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("viewId", a07Var.f451135e);
                    jSONObject2.put("type", a07Var.f451148u);
                    jSONObject2.put("action", a07Var.f451139i);
                    jSONObject2.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, a07Var.f451142o);
                    java.util.LinkedList linkedList = a07Var.f451145r;
                    if (linkedList.isEmpty()) {
                        java.lang.String g27 = b52.b.g(t53Var.f467685d);
                        if (g27 != null) {
                            a62.h.f(a07Var.f451135e, g27, u53Var.f468587n);
                        }
                    } else {
                        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                        java.util.Iterator it9 = linkedList.iterator();
                        while (it9.hasNext()) {
                            r45.ql qlVar = (r45.ql) it9.next();
                            if (qlVar != null && qlVar.f465613d == u53Var.f468587n) {
                                java.util.Iterator it10 = qlVar.f465614e.iterator();
                                while (it10.hasNext()) {
                                    r45.kw3 kw3Var = (r45.kw3) it10.next();
                                    if (kw3Var != null && kw3Var.f460532e != null) {
                                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                                        jSONObject3.put("dataPath", kw3Var.f460532e);
                                        jSONObject3.put("value", kw3Var.f460531d);
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
            if (!t53Var.f467689h.isEmpty()) {
                jSONArray.length();
                long j17 = u53Var.f468587n;
            } else {
                java.lang.String g28 = b52.b.g(t53Var.f467685d);
                if (g28 != null) {
                    a62.h.g(g28, u53Var.f468587n);
                }
            }
        }
    }

    public static org.json.JSONArray d(r45.u53 u53Var, org.json.JSONObject jSONObject) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        if (u53Var != null) {
            java.util.LinkedList linkedList = u53Var.f468583g;
            if (!linkedList.isEmpty()) {
                int size = linkedList.size();
                long j17 = 0;
                for (int i17 = 0; i17 < size; i17++) {
                    try {
                        r45.t53 t53Var = (r45.t53) linkedList.get(i17);
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        jSONObject2.put("pageName", t53Var.f467685d);
                        jSONObject2.put("tbe", t53Var.f467686e);
                        jSONObject2.put("in", t53Var.f467687f);
                        j17 += t53Var.f467687f;
                        if (i17 == 0) {
                            try {
                                jSONObject.put("tbe", t53Var.f467686e);
                            } catch (java.lang.Exception e17) {
                                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("HABBYGE-MALI.FuzzyDetailReport", "createFuzzyPathJsonArray, exception: %s", e17.getMessage());
                            }
                        }
                        try {
                            a(jSONObject2, u53Var, t53Var);
                        } catch (org.json.JSONException e18) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.FuzzyDetailReport", e18, "_getBizParams crash: %s", e18.getMessage());
                        }
                        c(jSONObject2, u53Var, t53Var);
                        jSONArray.put(jSONObject2);
                    } catch (org.json.JSONException e19) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.FuzzyDetailReport", e19, "createFuzzyPathJsonArray crash: %s", e19.getMessage());
                    }
                }
                jSONObject.put("in", j17 > 0 ? j17 : 0L);
            }
        }
        return jSONArray;
    }
}

package w52;

/* loaded from: classes15.dex */
public abstract class a {
    public static void a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        nm5.b bVar = null;
        try {
            jSONObject.put("businessId", str3);
            jSONObject.put("dataPath", str);
            jSONObject.put("value", str2);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.AsyncBizCollector", e17, "AsyncBizCollector, generateParamJSONOBject, %s", e17.getMessage());
            jSONObject = null;
        }
        if (jSONObject == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.AsyncBizCollector", "_collectBizData: %s, %s, %s", str, str2, str3);
        java.lang.String a17 = x52.a.a();
        if (a17 == null || a17.isEmpty()) {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            jSONArray.put(jSONObject);
            x52.a.b(java.lang.System.currentTimeMillis() + "@" + jSONArray.toString());
            return;
        }
        if ("-1".equals(a17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HABBYGE-MALI.AsyncBizDao", " AsyncBizDao putBiz NOT LOGIN");
            return;
        }
        if (a17.split("@").length <= 1) {
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            jSONArray2.put(jSONObject);
            x52.a.b(a17 + "@" + jSONArray2.toString());
            return;
        }
        if (!a17.isEmpty()) {
            java.lang.String[] split = a17.split("@");
            if (split.length > 0) {
                bVar = split.length == 1 ? nm5.j.c(split[0], null) : nm5.j.c(split[0], split[1]);
            }
        }
        if (bVar == null) {
            org.json.JSONArray jSONArray3 = new org.json.JSONArray();
            jSONArray3.put(jSONObject);
            x52.a.b(java.lang.System.currentTimeMillis() + "@" + jSONArray3.toString());
            return;
        }
        if (android.text.TextUtils.isEmpty((java.lang.CharSequence) bVar.a(1)) && !android.text.TextUtils.isEmpty((java.lang.CharSequence) bVar.a(0))) {
            org.json.JSONArray jSONArray4 = new org.json.JSONArray();
            jSONArray4.put(jSONObject);
            x52.a.b(((java.lang.String) bVar.a(0)) + "@" + jSONArray4.toString());
            return;
        }
        try {
            org.json.JSONArray jSONArray5 = new org.json.JSONArray((java.lang.String) bVar.a(1));
            jSONArray5.put(jSONObject);
            x52.a.b(((java.lang.String) bVar.a(0)) + "@" + jSONArray5.toString());
        } catch (org.json.JSONException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.AsyncBizDao", e18, "AsyncBizDao.putBiz crash: %s", e18.getMessage());
        }
    }

    public static void b(java.lang.String str) {
        java.lang.String str2;
        nm5.b a17 = w52.b.a();
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HABBYGE-MALI.AsyncBizCollector", "getBizId, tuple2 is NULL");
            str2 = null;
        } else {
            r45.jw3 jw3Var = (r45.jw3) a17.a(0);
            int intValue = ((java.lang.Integer) a17.a(1)).intValue();
            int size = jw3Var.f459696h.size() + 1;
            java.util.LinkedList linkedList = jw3Var.f459698m;
            int size2 = linkedList.size() + 1;
            com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.b bVar = com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.c.f181316a;
            int i17 = size >= size2 ? size + 1 : size2 + 1;
            r45.kw3 kw3Var = new r45.kw3();
            kw3Var.f460533f = com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.c.d(jw3Var.f459693e, i17);
            jw3Var.f459696h.add(kw3Var);
            linkedList.add(kw3Var);
            y52.b.i(jw3Var, intValue);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.AsyncBizCollector", "getBizId, addBizIdCurPageFlowItem: %s", kw3Var.f460533f);
            str2 = kw3Var.f460533f;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.AsyncBizCollector", "AsyncBizCollector, _collectBizId: %s", str2);
        w52.g.wi().getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HellBizService", "HABBYGE-MALI, notifyGetBizId: requestId:%s, bizId:%s", str, str2);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5638xc01e8ce9 c5638xc01e8ce9 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5638xc01e8ce9();
        am.ih ihVar = c5638xc01e8ce9.f135966g;
        ihVar.f88485a = str;
        ihVar.f88486b = str2;
        c5638xc01e8ce9.e();
    }
}

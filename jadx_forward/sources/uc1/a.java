package uc1;

/* loaded from: classes13.dex */
public abstract class a {
    public static void a(vc1.a3 a3Var, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 mo98964x19b45a1b = ((vc1.p1) a3Var).f516601e.mo98897xb5885626().mo98964x19b45a1b();
        double m37195x2605e9e2 = mo98964x19b45a1b.m37195x2605e9e2();
        double m37196x79d7af9 = mo98964x19b45a1b.m37196x79d7af9();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("latitude", m37195x2605e9e2);
            jSONObject2.put("longitude", m37196x79d7af9);
            jSONObject.remove("centerLocation");
            jSONObject.put("centerLocation", jSONObject2);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandMapUtils", e17, "", new java.lang.Object[0]);
        }
    }

    public static void b(vc1.a3 a3Var, org.json.JSONObject jSONObject) {
        vc1.z2 z2Var = ((vc1.p1) a3Var).A().f516758a;
        if (z2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandMapUtils", "visibleRegion is  null");
        }
        vc1.z1 z1Var = z2Var.f516765a;
        if (z1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandMapUtils", "latLngBounds is  null");
        }
        vc1.y1 y1Var = z1Var.f516763a;
        vc1.y1 y1Var2 = z1Var.f516764b;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        if (y1Var != null) {
            try {
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("latitude", y1Var.f516756a);
                jSONObject3.put("longitude", y1Var.f516757b);
                jSONObject2.put("southwest", jSONObject3);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandMapUtils", e17, "", new java.lang.Object[0]);
                return;
            }
        }
        if (y1Var2 != null) {
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            jSONObject4.put("latitude", y1Var2.f516756a);
            jSONObject4.put("longitude", y1Var2.f516757b);
            jSONObject2.put("northeast", jSONObject4);
        }
        jSONObject.remove("region");
        jSONObject.put("region", jSONObject2);
    }
}

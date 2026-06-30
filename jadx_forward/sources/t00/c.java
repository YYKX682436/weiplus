package t00;

/* loaded from: classes.dex */
public final class c {
    public c(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final org.json.JSONObject a(org.json.JSONObject paramsObject, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paramsObject, "paramsObject");
        java.lang.String optString = paramsObject.optString(ya.b.f77491x8758c4e1);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, "isActionAvailable")) {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, "getAllSupportAction")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CheckActionEcsActionHandler", "unSupport check method: " + optString);
                return null;
            }
            java.util.Map wi6 = ((b00.m2) ((c00.r3) i95.n0.c(c00.r3.class))).wi(i17);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            for (java.util.Map.Entry entry : wi6.entrySet()) {
                jSONObject.put((java.lang.String) entry.getKey(), ((java.lang.Number) entry.getValue()).intValue());
            }
            return jSONObject;
        }
        java.lang.String optString2 = paramsObject.optString("actionName");
        int optInt = paramsObject.optInt("actionVersion", Integer.MAX_VALUE);
        java.lang.Integer num = (java.lang.Integer) ((b00.m2) ((c00.r3) i95.n0.c(c00.r3.class))).wi(i17).get(optString2);
        if (num == null) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("result", false);
            return jSONObject2;
        }
        if (optInt <= num.intValue()) {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("result", true);
            return jSONObject3;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckActionEcsActionHandler", "unSupport action version: " + optString2 + '/' + optInt);
        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
        jSONObject4.put("result", false);
        return jSONObject4;
    }
}

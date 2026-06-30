package t71;

/* loaded from: classes15.dex */
public abstract class e {
    public static java.lang.String a(i83.b bVar) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (bVar == null) {
            return jSONObject.toString();
        }
        try {
            jSONObject.put("type", bVar.f371168e);
            java.lang.String str = bVar.f371168e;
            if (str == null || !str.equals("1")) {
                jSONObject.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, bVar.f371169f);
                java.lang.String str2 = bVar.f371171h;
                if (str2 != null) {
                    jSONObject.put("taxNumber", str2);
                } else {
                    jSONObject.put("taxNumber", "");
                }
                java.lang.String str3 = bVar.f371178r;
                if (str3 != null) {
                    jSONObject.put("companyAddress", str3);
                } else {
                    jSONObject.put("companyAddress", "");
                }
                java.lang.String str4 = bVar.f371175o;
                if (str4 != null) {
                    jSONObject.put("telephone", str4);
                } else {
                    jSONObject.put("telephone", "");
                }
                java.lang.String str5 = bVar.f371173m;
                if (str5 != null) {
                    jSONObject.put("bankName", str5);
                } else {
                    jSONObject.put("bankName", "");
                }
                java.lang.String str6 = bVar.f371172i;
                if (str6 != null) {
                    jSONObject.put("bankAccount", str6);
                } else {
                    jSONObject.put("bankAccount", "");
                }
            } else {
                jSONObject.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, bVar.f371170g);
                jSONObject.put("taxNumber", "");
                jSONObject.put("companyAddress", "");
                jSONObject.put("telephone", "");
                jSONObject.put("bankName", "");
                jSONObject.put("bankAccount", "");
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.InvoiceUtil", "put json value error : %s", android.util.Log.getStackTraceString(e17));
        }
        return jSONObject.toString();
    }
}

package s50;

@j95.b
/* loaded from: classes.dex */
public class i0 extends i95.w implements tg0.i1 {
    public java.lang.String wi() {
        try {
            java.util.List list = new g23.h().f349453d;
            if (list == null) {
                return null;
            }
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            if (arrayList.isEmpty()) {
                return null;
            }
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                g23.g gVar = (g23.g) it.next();
                if (gVar != null) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("key", gVar.f349447a);
                    jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, gVar.f349448b);
                    jSONObject.put("selected", gVar.f349449c ? 1 : 0);
                    jSONArray.put(jSONObject);
                }
            }
            if (jSONArray.length() > 0) {
                return jSONArray.toString();
            }
            return null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.ConfigProvider", e17, "getCheckBoxesJson error", new java.lang.Object[0]);
            return null;
        }
    }
}

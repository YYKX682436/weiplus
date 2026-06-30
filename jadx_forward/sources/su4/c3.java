package su4;

/* loaded from: classes.dex */
public abstract class c3 {
    public static org.json.JSONObject a(java.util.Map map) {
        if (map == null || map.size() == 0) {
            return new org.json.JSONObject();
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            for (java.lang.String str : map.keySet()) {
                if (str != null) {
                    jSONObject.put(str, map.get(str));
                }
            }
            return jSONObject;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewPreLoadMgr.Builder", "convertMapToJSON fail, exception = " + e17.getMessage());
            return null;
        }
    }

    public static java.lang.String b(java.lang.String str, java.util.Map map, boolean z17, java.lang.String str2) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("__msg_type", "event");
            jSONObject.put("__event_id", str);
            jSONObject.put("__params", a(map));
            return jSONObject.toString();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewPreLoadMgr.Builder", "build fail, exception = " + e17.getMessage());
            return null;
        }
    }
}

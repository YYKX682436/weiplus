package nw4;

/* loaded from: classes7.dex */
public abstract class x2 {
    public static java.lang.String a(java.lang.String str, java.util.Map map, boolean z17, java.lang.String str2) {
        return e("callback", str, map, null, z17, str2);
    }

    public static org.json.JSONObject b(java.util.Map map) {
        if (map == null || map.size() == 0) {
            return new org.json.JSONObject();
        }
        nf.f.c(map);
        try {
            java.lang.String str = (java.lang.String) map.get("jsapi_callback_json_special_key");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            for (java.lang.String str2 : map.keySet()) {
                if (str2 != null && !str2.equals("jsapi_callback_json_special_key")) {
                    if (str == null || !str2.equals(str)) {
                        jSONObject.put(str2, map.get(str2));
                    } else {
                        jSONObject.put(str, new org.json.JSONArray((java.lang.String) map.get(str)));
                    }
                }
            }
            return jSONObject;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgWrapper", "convertMapToJSON fail, exception = " + e17.getMessage());
            return null;
        }
    }

    public static java.lang.String c(java.lang.String str, java.util.Map map, boolean z17, java.lang.String str2) {
        return e("event", str, map, null, z17, str2);
    }

    public static java.lang.String d(java.lang.String str, org.json.JSONObject jSONObject, boolean z17, java.lang.String str2) {
        return e("event", str, null, jSONObject, z17, str2);
    }

    public static java.lang.String e(java.lang.String str, java.lang.String str2, java.util.Map map, org.json.JSONObject jSONObject, boolean z17, java.lang.String str3) {
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("__msg_type", str);
            if (str.equals("callback")) {
                jSONObject2.put("__callback_id", str2);
            } else if (str.equals("event")) {
                jSONObject2.put("__event_id", str2);
            }
            if (jSONObject == null) {
                jSONObject2.put("__params", b(map));
            } else {
                jSONObject2.put("__params", jSONObject);
            }
            if (!z17) {
                return jSONObject2.toString();
            }
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("__json_message", jSONObject2);
                java.lang.String replaceAll = jSONObject2.toString().replaceAll("\\\\/", "/");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgWrapper", "js digest verification contentStr = %s", replaceAll);
                java.lang.String b17 = kk.r.b(replaceAll + str3);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgWrapper", "js digest verification shaStr = %s", b17);
                jSONObject3.put("__sha_key", b17);
                return jSONObject3.toString();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgWrapper", "build fail, exception = " + e17.getMessage());
                return null;
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgWrapper", "build fail, exception = " + e18.getMessage());
            return null;
        }
    }
}

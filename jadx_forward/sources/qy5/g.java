package qy5;

/* loaded from: classes13.dex */
public abstract class g {
    public static java.lang.Object a(org.json.JSONArray jSONArray, int i17) {
        if (jSONArray != null && i17 < jSONArray.length() && i17 >= 0) {
            try {
                return jSONArray.get(i17);
            } catch (java.lang.Exception unused) {
            }
        }
        return null;
    }

    public static java.lang.String b(org.json.JSONObject jSONObject, java.lang.String str) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return jSONObject.getString(str);
            } catch (java.lang.Exception unused) {
                qy5.g.class.toString();
            }
        }
        return "";
    }
}

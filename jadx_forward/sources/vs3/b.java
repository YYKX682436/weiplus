package vs3;

/* loaded from: classes9.dex */
public abstract class b {
    public static java.lang.String a(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.lang.String replaceAll = str.replaceAll("\\D", "");
        return replaceAll.startsWith("86") ? replaceAll.substring(2) : replaceAll;
    }

    public static java.lang.String b(java.lang.String str) {
        if (str == null) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str.replaceAll(" ", ""));
        int length = sb6.length();
        if (length < 4) {
            return sb6.toString();
        }
        sb6.insert(3, ' ');
        if (length >= 8) {
            sb6.insert(8, ' ');
        }
        return sb6.toString();
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.p1979x633fb29.C16957xf1da7b74 c(java.lang.String str, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.p1979x633fb29.C16957xf1da7b74 c16957xf1da7b74 = new com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.p1979x633fb29.C16957xf1da7b74(jSONObject.optInt("need_getlatestinfo", 1) == 1);
        c16957xf1da7b74.f236603d = str;
        c16957xf1da7b74.f236605f = jSONObject.getString("product_id");
        c16957xf1da7b74.f236606g = jSONObject.getString("product_name");
        c16957xf1da7b74.f236607h = jSONObject.optString("product_desc");
        c16957xf1da7b74.f236608i = jSONObject.getInt("product_min_price") / 100.0f;
        c16957xf1da7b74.f236609m = jSONObject.getInt("product_max_price") / 100.0f;
        c16957xf1da7b74.f236604e = jSONObject.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd);
        c16957xf1da7b74.f236610n = jSONObject.getInt("is_infinite") == 1;
        c16957xf1da7b74.f236611o = jSONObject.getInt("left_count");
        c16957xf1da7b74.f236612p = jSONObject.getInt("discount");
        c16957xf1da7b74.f236613q = jSONObject.optInt("is_default_choose", 0) == 1;
        c16957xf1da7b74.f236614r = jSONObject.optInt("product_type", 0);
        return c16957xf1da7b74;
    }

    public static java.util.ArrayList d(java.lang.String str, org.json.JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                arrayList.add(c(str, jSONArray.getJSONObject(i17)));
            }
            return arrayList;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MallLogic", e17, "", new java.lang.Object[0]);
            return null;
        }
    }
}

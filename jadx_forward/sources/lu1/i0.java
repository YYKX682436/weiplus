package lu1;

/* loaded from: classes15.dex */
public abstract class i0 {
    public static java.util.LinkedList a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareCardLayoutDataParser", "parseShareCardIcons jsonContent is null");
            return null;
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(str);
            if (jSONArray.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareCardLayoutDataParser", "parseShareCardIcons itemListJson is null");
                return null;
            }
            java.util.LinkedList linkedList = new java.util.LinkedList();
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                linkedList.add(jSONArray.optString(i17));
            }
            return linkedList;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ShareCardLayoutDataParser", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    public static fu1.j b(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareCardLayoutDataParser", "parseShareCardLayoutData jsonContent is null");
            return null;
        }
        try {
            org.json.JSONObject optJSONObject = new org.json.JSONObject(str).optJSONObject("list");
            if (optJSONObject == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareCardLayoutDataParser", "parseShareCardLayoutData resultJson is null");
                return null;
            }
            fu1.j jVar = new fu1.j();
            jVar.f348381c = optJSONObject.optString("local_city");
            jVar.f348379a = c(optJSONObject.optString("local_city_list"));
            jVar.f348380b = c(optJSONObject.optString("other_city_list"));
            jVar.f348382d = optJSONObject.optBoolean("local_end");
            jVar.f348383e = optJSONObject.optBoolean("other_end");
            jVar.f348384f = optJSONObject.optBoolean("show_red_dot");
            jVar.f348385g = optJSONObject.optBoolean("show_new");
            jVar.f348387i = optJSONObject.optString("tips");
            jVar.f348386h = a(optJSONObject.optString("icons"));
            optJSONObject.optInt("newest_sharecard_time_second");
            java.lang.Object[] objArr = new java.lang.Object[5];
            int i17 = 1;
            objArr[0] = java.lang.Integer.valueOf(jVar.f348382d ? 1 : 0);
            objArr[1] = java.lang.Integer.valueOf(jVar.f348383e ? 1 : 0);
            objArr[2] = java.lang.Integer.valueOf(jVar.f348384f ? 1 : 0);
            if (!jVar.f348385g) {
                i17 = 0;
            }
            objArr[3] = java.lang.Integer.valueOf(i17);
            objArr[4] = jVar.f348387i;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardLayoutDataParser", "localEnd:%d, otherEnd:%d, showRedDot:%d, showNew:%d, tips:%s", objArr);
            return jVar;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ShareCardLayoutDataParser", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    public static java.util.LinkedList c(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareCardLayoutDataParser", "parseShareCardLayoutItem jsonContent is null");
            return null;
        }
        try {
            org.json.JSONArray optJSONArray = new org.json.JSONObject(str).optJSONArray(ya.b.f77483x2837e24a);
            if (optJSONArray != null && optJSONArray.length() != 0) {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                    org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
                    fu1.k kVar = new fu1.k();
                    kVar.f348388a = optJSONObject.optString("card_id");
                    kVar.f348389b = optJSONObject.optString("card_tp_id");
                    kVar.f348390c = optJSONObject.optString("announcement");
                    optJSONObject.optInt("end_time", 0);
                    optJSONObject.optInt("update_time", 0);
                    optJSONObject.optInt("item_type", 0);
                    kVar.f348391d = optJSONObject.optInt("top", 0);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardLayoutDataParser", "ljd: card_tp_id:" + kVar.f348389b + " top:" + kVar.f348391d);
                    linkedList.add(kVar);
                }
                return linkedList;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareCardLayoutDataParser", "parseShareCardLayoutItem itemListJson is null");
            return null;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ShareCardLayoutDataParser", e17, "", new java.lang.Object[0]);
            return null;
        }
    }
}

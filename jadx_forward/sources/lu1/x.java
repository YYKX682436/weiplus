package lu1;

/* loaded from: classes11.dex */
public abstract class x {
    public static java.util.LinkedList a(java.lang.String str, int i17, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardTpInfoItemParser", "parseCardTpInfoItemArray jsonContent is null");
            return null;
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(str);
            if (jSONArray.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardTpInfoItemParser", "parseCardTpInfoItemArray cardItemListJson is null");
                return null;
            }
            java.util.LinkedList linkedList = new java.util.LinkedList();
            for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i18);
                if (optJSONObject == null) {
                    if (i17 == 26 && (jSONArray.opt(i18) instanceof java.lang.String)) {
                        try {
                            optJSONObject = new org.json.JSONObject(jSONArray.optString(i18));
                        } catch (org.json.JSONException e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CardTpInfoItemParser", e17, "protect itemJSON for AppBrand", new java.lang.Object[0]);
                        }
                    }
                }
                r45.wu wuVar = new r45.wu();
                wuVar.f470991d = optJSONObject.optString(i17 == 26 ? "cardId" : "card_id");
                wuVar.f470992e = optJSONObject.optString("code");
                wuVar.f470993f = optJSONObject.optString("openCardParams");
                wuVar.f470994g = str2;
                wuVar.f470995h = optJSONObject.optString("userCardId");
                linkedList.add(wuVar);
            }
            return linkedList;
        } catch (org.json.JSONException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CardTpInfoItemParser", e18, "", new java.lang.Object[0]);
            return null;
        }
    }
}

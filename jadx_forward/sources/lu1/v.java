package lu1;

/* loaded from: classes8.dex */
public abstract class v {
    public static java.util.ArrayList a(java.lang.String str, int i17) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardListItemParser", "parseCardListItemArray jsonContent is null");
            return null;
        }
        try {
            org.json.JSONArray optJSONArray = (i17 == 8 || i17 == 0) ? new org.json.JSONObject(str).optJSONArray("card_list") : i17 == 26 ? new org.json.JSONArray(str) : new org.json.JSONArray(str);
            if (optJSONArray != null && optJSONArray.length() != 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i18 = 0; i18 < optJSONArray.length(); i18++) {
                    org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i18);
                    if (optJSONObject == null) {
                        if (i17 == 26 && (optJSONArray.opt(i18) instanceof java.lang.String)) {
                            try {
                                optJSONObject = new org.json.JSONObject(optJSONArray.optString(i18));
                            } catch (org.json.JSONException e17) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CardListItemParser", e17, "protect itemJSON for AppBrand", new java.lang.Object[0]);
                            }
                        }
                    }
                    r45.hu huVar = new r45.hu();
                    huVar.f457979d = optJSONObject.optString(i17 == 26 ? "cardId" : "card_id");
                    huVar.f457980e = optJSONObject.optString(i17 == 26 ? "cardExt" : "card_ext");
                    arrayList.add(huVar);
                }
                return arrayList;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardListItemParser", "parseCardListItemArray cardItemListJson is null");
            return null;
        } catch (org.json.JSONException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CardListItemParser", e18, "", new java.lang.Object[0]);
            return null;
        }
    }

    public static java.lang.String b(java.util.LinkedList linkedList, boolean z17, int i17) {
        if (linkedList == null || linkedList.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardListItemParser", "parseCardListItemToJson list == null || list.size() == 0");
            return "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardListItemParser", "parseCardListItemToJson is_succ:" + z17 + " scene:" + i17);
        org.json.JSONStringer jSONStringer = new org.json.JSONStringer();
        if (i17 == 8) {
            try {
                jSONStringer.object();
                jSONStringer.key("card_list");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CardListItemParser", e17, "", new java.lang.Object[0]);
                return "";
            }
        }
        jSONStringer.array();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            xt1.g gVar = (xt1.g) it.next();
            jSONStringer.object();
            jSONStringer.key(i17 == 26 ? "cardId" : "card_id");
            jSONStringer.value(gVar.f457979d);
            jSONStringer.key(i17 == 26 ? "cardExt" : "card_ext");
            java.lang.String str = gVar.f457980e;
            if (str == null) {
                str = "";
            }
            jSONStringer.value(str);
            jSONStringer.key(i17 == 26 ? "isSuccess" : "is_succ");
            if (z17) {
                jSONStringer.value(i17 == 26 ? java.lang.Boolean.TRUE : 1);
            } else {
                jSONStringer.value(i17 == 26 ? java.lang.Boolean.FALSE : 0);
            }
            jSONStringer.key("code");
            java.lang.String str2 = gVar.f538010f;
            if (str2 == null) {
                str2 = "";
            }
            jSONStringer.value(str2);
            jSONStringer.endObject();
        }
        jSONStringer.endArray();
        if (i17 == 8) {
            jSONStringer.endObject();
        }
        return jSONStringer.toString();
    }

    public static java.lang.String c(java.lang.String str, int i17) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardListItemParser", "parseCardListItemArray jsonContent is null");
            return null;
        }
        try {
            org.json.JSONArray optJSONArray = new org.json.JSONObject(str).optJSONArray("card_list");
            if (optJSONArray != null && optJSONArray.length() != 0) {
                org.json.JSONStringer jSONStringer = new org.json.JSONStringer();
                jSONStringer.array();
                for (int i18 = 0; i18 < optJSONArray.length(); i18++) {
                    org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i18);
                    jSONStringer.object();
                    jSONStringer.key(i17 == 26 ? "cardId" : "card_id");
                    jSONStringer.value(optJSONObject.optString("card_id"));
                    jSONStringer.key(i17 == 26 ? "cardExt" : "card_ext");
                    jSONStringer.value(optJSONObject.optString("card_ext"));
                    java.lang.String str2 = "isSuccess";
                    jSONStringer.key(i17 == 26 ? "isSuccess" : "is_succ");
                    if (i17 != 26) {
                        jSONStringer.value(optJSONObject.optInt("is_succ"));
                    } else if (optJSONObject.optInt("is_succ") == 1) {
                        jSONStringer.value(true);
                    } else {
                        jSONStringer.value(false);
                    }
                    jSONStringer.key("code");
                    if (android.text.TextUtils.isEmpty(optJSONObject.optString("encrypt_code"))) {
                        jSONStringer.value(optJSONObject.optString("code"));
                    } else {
                        jSONStringer.value(optJSONObject.optString("encrypt_code"));
                    }
                    jSONStringer.endObject();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append("parseJsonToArray item");
                    sb6.append(i18);
                    sb6.append("  is_succ:");
                    if (i17 != 26) {
                        str2 = "is_succ";
                    }
                    sb6.append(optJSONObject.optInt(str2));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardListItemParser", sb6.toString());
                }
                jSONStringer.endArray();
                return jSONStringer.toString();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardListItemParser", "parseCardListItemArray cardItemListJson is null");
            return null;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CardListItemParser", e17, "", new java.lang.Object[0]);
            return "";
        }
    }
}

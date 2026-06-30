package bt4;

/* loaded from: classes9.dex */
public abstract class d {
    public static java.lang.String a() {
        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("phone");
        return telephonyManager != null ? telephonyManager.getNetworkCountryIso() : "";
    }

    public static java.util.ArrayList b(int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList linkedList = d(i17).f382048d;
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.o53 o53Var = (r45.o53) it.next();
                if (o53Var != null) {
                    java.util.Iterator it6 = o53Var.f381941e.iterator();
                    while (it6.hasNext()) {
                        r45.n53 n53Var = (r45.n53) it6.next();
                        if (n53Var != null) {
                            n53Var.f381089n = o53Var.f381940d.f384581d;
                            arrayList.add(n53Var);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static android.util.SparseArray c(int i17) {
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        java.util.LinkedList linkedList = d(i17).f382048d;
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.o53 o53Var = (r45.o53) it.next();
                if (o53Var != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator it6 = o53Var.f381941e.iterator();
                    while (it6.hasNext()) {
                        r45.n53 n53Var = (r45.n53) it6.next();
                        if (n53Var != null) {
                            arrayList.add(java.lang.Integer.valueOf(n53Var.f381082d.f381996d));
                        }
                    }
                    sparseArray.put(o53Var.f381940d.f384581d, arrayList);
                }
            }
        }
        return sparseArray;
    }

    public static r45.o93 d(int i17) {
        r45.o93 o93Var = new r45.o93();
        java.lang.String str = (java.lang.String) ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().i(f(i17), null);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MallLogic", "getMallNewFunctionListRespone is null");
        } else {
            try {
                o93Var.parseFrom(ot5.e.c(str));
                com.tencent.mars.xlog.Log.i("MicroMsg.MallLogic", "getMallNewFunctionListRespone success");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MallLogic", "getMallNewFunctionListRespone fail, " + e17.getLocalizedMessage());
            }
        }
        return o93Var;
    }

    public static android.util.SparseArray e(int i17) {
        r45.r67 r67Var;
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        java.util.LinkedList linkedList = d(i17).f382048d;
        if (linkedList != null) {
            for (int i18 = 0; i18 < linkedList.size(); i18++) {
                r45.o53 o53Var = (r45.o53) linkedList.get(i18);
                if (o53Var != null && (r67Var = o53Var.f381940d) != null) {
                    sparseArray.put(r67Var.f384581d, java.lang.Integer.valueOf(i18 + 1));
                }
            }
        }
        return sparseArray;
    }

    public static com.tencent.mm.storage.u3 f(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MallLogic", "getStoreInfoKey walletRegion：%s", java.lang.Integer.valueOf(i17));
        return i17 != 2 ? i17 != 4 ? i17 != 8 ? com.tencent.mm.storage.u3.WALLET_MALL_FUNCTION_LIST_RESPONE_NEW_STRING_SYNC : com.tencent.mm.storage.u3.WALLET_MALL_FUNCTION_LIST_RESPONE_NEW_HK_STRING_SYNC : com.tencent.mm.storage.u3.WALLET_MALL_FUNCTION_LIST_RESPONE_NEW_ZA_STRING_SYNC : com.tencent.mm.storage.u3.WALLET_MALL_FUNCTION_LIST_RESPONE_NEW_MY_STRING_SYNC;
    }

    public static java.util.ArrayList g(org.json.JSONArray jSONArray) {
        if (jSONArray == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MallLogic", "func[parseBannerActList], jsonArr null");
            return null;
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                bt4.a aVar = new bt4.a();
                aVar.f24466a = jSONObject.optInt("banner_id");
                aVar.f24467b = jSONObject.optString("banner_title");
                aVar.f24468c = jSONObject.optString("banner_link");
                arrayList.add(aVar);
            }
            return arrayList;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MallLogic", "func[parseBannerActList], exp:" + e17.getMessage());
            return null;
        }
    }

    public static java.util.ArrayList h(org.json.JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                com.tencent.mm.plugin.wallet_core.model.mall.MallFunction mallFunction = new com.tencent.mm.plugin.wallet_core.model.mall.MallFunction();
                mallFunction.f179819d = jSONObject.getString("func_id");
                mallFunction.f179820e = jSONObject.getString("func_name");
                mallFunction.f179821f = jSONObject.optString("func_icon_url");
                mallFunction.f179822g = jSONObject.optString("hd_icon_url");
                mallFunction.f179823h = jSONObject.optString("func_foregroud_icon_url");
                mallFunction.f179824i = jSONObject.optString("native_url");
                mallFunction.f179825m = jSONObject.optString("h5_url");
                mallFunction.f179828p = jSONObject.optInt("property_type", 0);
                mallFunction.f179829q = jSONObject.optString("third_party_disclaimer");
                mallFunction.f179830r = jSONObject.optInt("download_restrict", 0);
                org.json.JSONArray optJSONArray = jSONObject.optJSONArray("remark_name_list");
                if (optJSONArray != null) {
                    mallFunction.f179826n = new java.util.ArrayList();
                    int length2 = optJSONArray.length();
                    for (int i18 = 0; i18 < length2; i18++) {
                        mallFunction.f179826n.add(optJSONArray.getString(i18));
                    }
                }
                org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("activity_info_list");
                if (optJSONArray2 != null && optJSONArray2.length() != 0) {
                    mallFunction.f179827o = j(mallFunction.f179819d, optJSONArray2.getJSONObject(0));
                }
                arrayList.add(mallFunction);
            }
            return arrayList;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MallLogic", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    public static java.util.ArrayList i(org.json.JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int length = jSONArray.length();
                for (int i17 = 0; i17 < length; i17++) {
                    org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                    com.tencent.mm.plugin.wallet_core.model.mall.MallNews mallNews = new com.tencent.mm.plugin.wallet_core.model.mall.MallNews(jSONObject.optString("activity_jump_funcid"));
                    mallNews.f179838n = jSONObject.optString("activity_icon_link");
                    mallNews.f179836i = jSONObject.optString("activity_msg_content");
                    mallNews.f179840p = jSONObject.optString("activity_tips");
                    arrayList.add(mallNews);
                }
                return arrayList;
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MallLogic", e17, "", new java.lang.Object[0]);
            }
        }
        return null;
    }

    public static com.tencent.mm.plugin.wallet_core.model.mall.MallNews j(java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.wallet_core.model.mall.MallNews mallNews = new com.tencent.mm.plugin.wallet_core.model.mall.MallNews(str);
        mallNews.f179834g = jSONObject.optString(com.tencent.mm.opensdk.constants.ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID);
        mallNews.f179835h = jSONObject.optString("activity_ticket");
        mallNews.f179836i = jSONObject.optString("activity_msg_content");
        mallNews.f179837m = jSONObject.optString("activity_link");
        mallNews.f179838n = jSONObject.optString("activity_icon_link");
        mallNews.f179839o = jSONObject.optInt("activity_expired_time");
        mallNews.f179840p = jSONObject.optString("activity_tips");
        mallNews.f179843s = jSONObject.optInt("activity_type");
        mallNews.f179844t = jSONObject.optString("activity_url");
        mallNews.f179841q = jSONObject.optInt("is_msg_reserved");
        return mallNews;
    }

    public static android.util.SparseArray k(org.json.JSONArray jSONArray) {
        if (jSONArray == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MallLogic", "func[parseTypeNameMap], jsonArr null");
            return null;
        }
        try {
            android.util.SparseArray sparseArray = new android.util.SparseArray();
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                int optInt = jSONObject.optInt("type_id", 0);
                if (optInt != 0) {
                    sparseArray.put(optInt, jSONObject.optString("type_name"));
                }
            }
            return sparseArray;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MallLogic", "func[parseBannerActList], exp:" + e17.getMessage());
            return null;
        }
    }
}

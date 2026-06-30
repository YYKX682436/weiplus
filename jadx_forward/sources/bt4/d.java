package bt4;

/* loaded from: classes9.dex */
public abstract class d {
    public static java.lang.String a() {
        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("phone");
        return telephonyManager != null ? telephonyManager.getNetworkCountryIso() : "";
    }

    public static java.util.ArrayList b(int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList linkedList = d(i17).f463581d;
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.o53 o53Var = (r45.o53) it.next();
                if (o53Var != null) {
                    java.util.Iterator it6 = o53Var.f463474e.iterator();
                    while (it6.hasNext()) {
                        r45.n53 n53Var = (r45.n53) it6.next();
                        if (n53Var != null) {
                            n53Var.f462622n = o53Var.f463473d.f466114d;
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
        java.util.LinkedList linkedList = d(i17).f463581d;
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.o53 o53Var = (r45.o53) it.next();
                if (o53Var != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator it6 = o53Var.f463474e.iterator();
                    while (it6.hasNext()) {
                        r45.n53 n53Var = (r45.n53) it6.next();
                        if (n53Var != null) {
                            arrayList.add(java.lang.Integer.valueOf(n53Var.f462615d.f463529d));
                        }
                    }
                    sparseArray.put(o53Var.f463473d.f466114d, arrayList);
                }
            }
        }
        return sparseArray;
    }

    public static r45.o93 d(int i17) {
        r45.o93 o93Var = new r45.o93();
        java.lang.String str = (java.lang.String) ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().i(f(i17), null);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallLogic", "getMallNewFunctionListRespone is null");
        } else {
            try {
                o93Var.mo11468x92b714fd(ot5.e.c(str));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallLogic", "getMallNewFunctionListRespone success");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MallLogic", "getMallNewFunctionListRespone fail, " + e17.getLocalizedMessage());
            }
        }
        return o93Var;
    }

    public static android.util.SparseArray e(int i17) {
        r45.r67 r67Var;
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        java.util.LinkedList linkedList = d(i17).f463581d;
        if (linkedList != null) {
            for (int i18 = 0; i18 < linkedList.size(); i18++) {
                r45.o53 o53Var = (r45.o53) linkedList.get(i18);
                if (o53Var != null && (r67Var = o53Var.f463473d) != null) {
                    sparseArray.put(r67Var.f466114d, java.lang.Integer.valueOf(i18 + 1));
                }
            }
        }
        return sparseArray;
    }

    public static com.p314xaae8f345.mm.p2621x8fb0427b.u3 f(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallLogic", "getStoreInfoKey walletRegion：%s", java.lang.Integer.valueOf(i17));
        return i17 != 2 ? i17 != 4 ? i17 != 8 ? com.p314xaae8f345.mm.p2621x8fb0427b.u3.WALLET_MALL_FUNCTION_LIST_RESPONE_NEW_STRING_SYNC : com.p314xaae8f345.mm.p2621x8fb0427b.u3.WALLET_MALL_FUNCTION_LIST_RESPONE_NEW_HK_STRING_SYNC : com.p314xaae8f345.mm.p2621x8fb0427b.u3.WALLET_MALL_FUNCTION_LIST_RESPONE_NEW_ZA_STRING_SYNC : com.p314xaae8f345.mm.p2621x8fb0427b.u3.WALLET_MALL_FUNCTION_LIST_RESPONE_NEW_MY_STRING_SYNC;
    }

    public static java.util.ArrayList g(org.json.JSONArray jSONArray) {
        if (jSONArray == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MallLogic", "func[parseBannerActList], jsonArr null");
            return null;
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                bt4.a aVar = new bt4.a();
                aVar.f105999a = jSONObject.optInt("banner_id");
                aVar.f106000b = jSONObject.optString("banner_title");
                aVar.f106001c = jSONObject.optString("banner_link");
                arrayList.add(aVar);
            }
            return arrayList;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MallLogic", "func[parseBannerActList], exp:" + e17.getMessage());
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
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c c19100xad1ade2c = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c();
                c19100xad1ade2c.f261352d = jSONObject.getString("func_id");
                c19100xad1ade2c.f261353e = jSONObject.getString("func_name");
                c19100xad1ade2c.f261354f = jSONObject.optString("func_icon_url");
                c19100xad1ade2c.f261355g = jSONObject.optString("hd_icon_url");
                c19100xad1ade2c.f261356h = jSONObject.optString("func_foregroud_icon_url");
                c19100xad1ade2c.f261357i = jSONObject.optString("native_url");
                c19100xad1ade2c.f261358m = jSONObject.optString("h5_url");
                c19100xad1ade2c.f261361p = jSONObject.optInt("property_type", 0);
                c19100xad1ade2c.f261362q = jSONObject.optString("third_party_disclaimer");
                c19100xad1ade2c.f261363r = jSONObject.optInt("download_restrict", 0);
                org.json.JSONArray optJSONArray = jSONObject.optJSONArray("remark_name_list");
                if (optJSONArray != null) {
                    c19100xad1ade2c.f261359n = new java.util.ArrayList();
                    int length2 = optJSONArray.length();
                    for (int i18 = 0; i18 < length2; i18++) {
                        c19100xad1ade2c.f261359n.add(optJSONArray.getString(i18));
                    }
                }
                org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("activity_info_list");
                if (optJSONArray2 != null && optJSONArray2.length() != 0) {
                    c19100xad1ade2c.f261360o = j(c19100xad1ade2c.f261352d, optJSONArray2.getJSONObject(0));
                }
                arrayList.add(c19100xad1ade2c);
            }
            return arrayList;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MallLogic", e17, "", new java.lang.Object[0]);
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
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27 c19101x8593f27 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27(jSONObject.optString("activity_jump_funcid"));
                    c19101x8593f27.f261371n = jSONObject.optString("activity_icon_link");
                    c19101x8593f27.f261369i = jSONObject.optString("activity_msg_content");
                    c19101x8593f27.f261373p = jSONObject.optString("activity_tips");
                    arrayList.add(c19101x8593f27);
                }
                return arrayList;
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MallLogic", e17, "", new java.lang.Object[0]);
            }
        }
        return null;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27 j(java.lang.String str, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27 c19101x8593f27 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27(str);
        c19101x8593f27.f261367g = jSONObject.optString(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.WXWebPage.f32847x4430964b);
        c19101x8593f27.f261368h = jSONObject.optString("activity_ticket");
        c19101x8593f27.f261369i = jSONObject.optString("activity_msg_content");
        c19101x8593f27.f261370m = jSONObject.optString("activity_link");
        c19101x8593f27.f261371n = jSONObject.optString("activity_icon_link");
        c19101x8593f27.f261372o = jSONObject.optInt("activity_expired_time");
        c19101x8593f27.f261373p = jSONObject.optString("activity_tips");
        c19101x8593f27.f261376s = jSONObject.optInt("activity_type");
        c19101x8593f27.f261377t = jSONObject.optString("activity_url");
        c19101x8593f27.f261374q = jSONObject.optInt("is_msg_reserved");
        return c19101x8593f27;
    }

    public static android.util.SparseArray k(org.json.JSONArray jSONArray) {
        if (jSONArray == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MallLogic", "func[parseTypeNameMap], jsonArr null");
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MallLogic", "func[parseBannerActList], exp:" + e17.getMessage());
            return null;
        }
    }
}

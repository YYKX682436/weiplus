package ss4;

/* loaded from: classes8.dex */
public class g extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {
    public g() {
        ((pg0.a3) i95.n0.c(pg0.a3.class)).hj().f324770d.A("WalletBulletin", "delete from WalletBulletin");
        m83032xb4c13117(new java.util.HashMap());
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        return 1679;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 1679;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        return "/cgi-bin/mmpay-bin/tenpay/getbannerinfo";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        r45.tw4 tw4Var;
        org.json.JSONArray jSONArray;
        int i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetBannerInfo", "NetSceneGetBannerInfo errCode = " + i17 + " " + jSONObject);
        if (i17 == 0) {
            l75.e0 e0Var = at4.c1.D;
            dt4.e hj6 = ((pg0.a3) i95.n0.c(pg0.a3.class)).hj();
            if (jSONObject == null || hj6 == null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("json==null?");
                sb6.append(jSONObject == null);
                sb6.append("  stg==null?");
                sb6.append(hj6 == null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletBulletin", sb6.toString());
            } else {
                org.json.JSONArray optJSONArray = jSONObject.optJSONArray("banner_map");
                org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("banner_content_array");
                org.json.JSONArray optJSONArray3 = jSONObject.optJSONArray("notice_item_array");
                java.util.HashMap hashMap = new java.util.HashMap();
                java.util.HashMap hashMap2 = new java.util.HashMap();
                java.util.HashMap hashMap3 = new java.util.HashMap();
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    int i19 = 0;
                    while (i19 < length) {
                        org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i19);
                        if (optJSONObject != null) {
                            java.lang.String optString = optJSONObject.optString("banner_type");
                            java.lang.String optString2 = optJSONObject.optString("banner_template_id");
                            jSONArray = optJSONArray;
                            i18 = length;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBulletin", "sceneid=" + optString + "; contentid=" + optString2);
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
                                hashMap.put(optString, optString2);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBulletin", "sceneid:" + optString + " map contentid:" + optString2);
                            }
                        } else {
                            jSONArray = optJSONArray;
                            i18 = length;
                        }
                        i19++;
                        optJSONArray = jSONArray;
                        length = i18;
                    }
                }
                if (optJSONArray2 != null) {
                    int length2 = optJSONArray2.length();
                    for (int i27 = 0; i27 < length2; i27++) {
                        org.json.JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i27);
                        if (optJSONObject2 != null) {
                            hashMap2.put(optJSONObject2.optString("banner_template_id"), java.lang.Integer.valueOf(i27));
                        }
                    }
                }
                if (optJSONArray3 != null) {
                    for (int i28 = 0; i28 < optJSONArray3.length(); i28++) {
                        r45.tw4 m07 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.m0(optJSONArray3.optJSONObject(i28));
                        if (m07 != null) {
                            hashMap3.put(m07.f468368h, m07);
                        }
                    }
                }
                if (hashMap.size() > 0) {
                    for (java.lang.String str2 : hashMap.keySet()) {
                        java.lang.String str3 = (java.lang.String) hashMap.get(str2);
                        at4.c1 c1Var = new at4.c1();
                        c1Var.f65939xc71715d9 = str2;
                        if (hashMap3.containsKey(str3) && (tw4Var = (r45.tw4) hashMap3.get(str3)) != null) {
                            c1Var.f65941x6b1e48aa = tw4Var.f468364d;
                            c1Var.f65946xcf77aa53 = tw4Var.f468365e;
                            c1Var.f65942xe902b83 = tw4Var.f468367g;
                            c1Var.f65943x26d6cac = tw4Var.f468366f;
                            c1Var.f65944xbca76dd = tw4Var.f468368h;
                            c1Var.f65945x2262335f = 2;
                        }
                        if (hashMap2.containsKey(str3)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBulletin", "find contentid:" + str3 + "in contentMap");
                            org.json.JSONObject optJSONObject3 = optJSONArray2.optJSONObject(((java.lang.Integer) hashMap2.get(str3)).intValue());
                            c1Var.f65938x24411286 = optJSONObject3.optString("content");
                            c1Var.f65940x541eb1fc = optJSONObject3.optString("url");
                            hj6.mo880xb970c2b9(c1Var);
                        }
                    }
                }
            }
            long optLong = jSONObject.optLong("banner_update_interval", 0L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetBannerInfo", "update_interval=" + optLong);
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_BULLETIN_UPDATE_INTERVAL_LONG, java.lang.Long.valueOf(optLong));
            org.json.JSONObject optJSONObject4 = jSONObject.optJSONObject("lbs_info");
            if (optJSONObject4 != null) {
                org.json.JSONArray optJSONArray4 = optJSONObject4.optJSONArray("config_array");
                if (optJSONArray4 != null && optJSONArray4.length() > 0) {
                    if (at4.g0.f95390a == null) {
                        at4.g0.f95390a = new at4.g0();
                    }
                    at4.g0.f95390a.getClass();
                    optJSONArray4.toString();
                    gm0.j1.i();
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_LBS_REPORT_CONFIG_STRING_SYNC, optJSONArray4.toString());
                }
                gm0.j1.i();
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_LBS_REPORT_DIALOG_TITLE_STRING_SYNC, optJSONObject4.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28));
                gm0.j1.i();
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_LBS_REPORT_DIALOG_CONTENT_STRING_SYNC, optJSONObject4.optString("content"));
            }
            org.json.JSONObject optJSONObject5 = jSONObject.optJSONObject("realname_info");
            if (optJSONObject5 != null) {
                java.lang.String optString3 = optJSONObject5.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
                java.lang.String optString4 = optJSONObject5.optString("balance_title");
                gm0.j1.i();
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_RELEAY_NAME_TIP_CONTENT_STRING_SYNC, optString3);
                gm0.j1.i();
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_RELEAY_NAME_BALANCE_CONTENT_STRING_SYNC, optString4);
            }
        }
    }
}

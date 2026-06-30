package at4;

/* loaded from: classes9.dex */
public abstract class r1 {
    /* JADX WARN: Multi-variable type inference failed */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c a(org.json.JSONObject jSONObject, int i17) {
        int i18;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = jSONObject == null ? "" : jSONObject;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletQueryBankcardParser", "Bankcard getBalance %s", objArr);
        if (jSONObject == null || jSONObject.length() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletQueryBankcardParser", "getBalance() json == null or json.length() == 0");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c(1);
        at4.q1 q1Var = new at4.q1(jSONObject.optLong("time_out", 7200L), jSONObject.optLong("balance_version", -1L), jSONObject.optInt("avail_balance"), c19091x9511676c);
        java.util.regex.Pattern pattern = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.f295755a;
        gm0.j1.i();
        gm0.j1.n().f354821b.g(new c01.ra(new com.p314xaae8f345.mm.p2802xd031a825.ui.i1(new java.lang.String[]{"wallet_balance_version", "wallet_balance_last_update_time", "wallet_balance"}, q1Var), null));
        c19091x9511676c.O2 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.j(jSONObject.optString("avail_balance", "0"), "100", 2, java.math.RoundingMode.HALF_UP);
        c19091x9511676c.P2 = jSONObject.optString("balance_show_wording");
        c19091x9511676c.U2 = jSONObject.optString("max_fetch_wording");
        c19091x9511676c.V2 = jSONObject.optString("avail_fetch_wording");
        c19091x9511676c.Q2 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.j(jSONObject.optString("fetch_balance", "0"), "100", 2, java.math.RoundingMode.HALF_UP);
        c19091x9511676c.f69227x1d45800f |= 8;
        c19091x9511676c.f69223x58802fcb = jSONObject.optString("balance_bank_type");
        c19091x9511676c.f69225xed6d60f6 = jSONObject.optString("balance_bind_serial");
        int optInt = jSONObject.optInt("default_card_state", 0);
        c19091x9511676c.f69232xff761ac5 = optInt;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletQueryBankcardParser", "balance default stats：%s", java.lang.Integer.valueOf(optInt));
        java.lang.String optString = jSONObject.optString("balance_forbid_word");
        c19091x9511676c.f69239x93565523 = optString;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            i18 = 0;
            c19091x9511676c.f69220xb7753620 = 0;
        } else {
            c19091x9511676c.f69220xb7753620 = 8;
            i18 = 0;
        }
        c19091x9511676c.f69235x94607f59 = jSONObject.optLong("fetch_arrive_time");
        c19091x9511676c.f69249x61dbf87 = jSONObject.optString("mobile");
        c19091x9511676c.f69260x2a326a79 = jSONObject.optInt("support_micropay", i18) != 1 ? i18 : 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletQueryBankcardParser", "getBalance() support_micropay:" + jSONObject.optInt("support_micropay", i18));
        java.lang.String optString2 = jSONObject.optString("balance_list_url");
        c19091x9511676c.R2 = optString2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletQueryBankcardParser", "carson balance_list_url: %s", optString2);
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ked);
        c19091x9511676c.f69233x225aa2b6 = string;
        c19091x9511676c.f69217xaef0808c = string;
        c19091x9511676c.f69222x587fd4e1 = "10000";
        c19091x9511676c.f69240x24ff0512 = jSONObject.optString("forbid_title");
        c19091x9511676c.f69241x935a0ea9 = jSONObject.optString("forbid_url");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("prompt_info");
        if (optJSONObject != null) {
            c19091x9511676c.f69255xfd79664d = optJSONObject.optString("prompt_text");
            c19091x9511676c.f69253xe8447f03 = optJSONObject.optString("jump_text");
            c19091x9511676c.f69254xf6f9f8d9 = optJSONObject.optString("jump_url");
        }
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("balance_menu_info");
        if (optJSONObject2 != null) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_BALANCE_MENU_INFO_STRING_SYNC, optJSONObject2.toString());
        } else {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_BALANCE_MENU_INFO_STRING_SYNC, "");
        }
        if (i17 == 10) {
            org.json.JSONObject optJSONObject3 = jSONObject.optJSONObject("lqp_entrance_info");
            if (optJSONObject3 != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_BALANCE_ENTRANCE_INFO_STRING_SYNC, optJSONObject3.toString());
            } else {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_BALANCE_ENTRANCE_INFO_STRING_SYNC, "");
            }
        }
        return c19091x9511676c;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c b(r45.gd gdVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletQueryBankcardParser", "Bankcard getBalance from balance info %s", gdVar);
        if (gdVar == null) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c(1);
        at4.q1 q1Var = new at4.q1(gdVar.f456657u, gdVar.f456656t, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(gdVar.f456648i, 0L), c19091x9511676c);
        java.util.regex.Pattern pattern = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.f295755a;
        gm0.j1.i();
        gm0.j1.n().f354821b.g(new c01.ra(new com.p314xaae8f345.mm.p2802xd031a825.ui.i1(new java.lang.String[]{"wallet_balance_version", "wallet_balance_last_update_time", "wallet_balance"}, q1Var), null));
        c19091x9511676c.O2 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.j(gdVar.f456648i, "100", 2, java.math.RoundingMode.HALF_UP);
        c19091x9511676c.P2 = gdVar.f456661y;
        c19091x9511676c.U2 = gdVar.f456655s;
        c19091x9511676c.V2 = gdVar.f456654r;
        c19091x9511676c.Q2 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.j(gdVar.f456650n, "100", 2, java.math.RoundingMode.HALF_UP);
        c19091x9511676c.f69227x1d45800f |= 8;
        c19091x9511676c.f69223x58802fcb = gdVar.f456644e;
        c19091x9511676c.f69225xed6d60f6 = gdVar.f456645f;
        java.lang.String str = gdVar.f456646g;
        c19091x9511676c.f69239x93565523 = str;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            c19091x9511676c.f69220xb7753620 = 0;
        } else {
            c19091x9511676c.f69220xb7753620 = 8;
        }
        c19091x9511676c.f69249x61dbf87 = gdVar.f456651o;
        c19091x9511676c.f69260x2a326a79 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(gdVar.f456652p, 0) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletQueryBankcardParser", "getBalance() support_micropay:" + gdVar.f456652p);
        c19091x9511676c.R2 = gdVar.f456653q;
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ked);
        c19091x9511676c.f69233x225aa2b6 = string;
        c19091x9511676c.f69217xaef0808c = string;
        c19091x9511676c.f69222x587fd4e1 = "10000";
        c19091x9511676c.f69240x24ff0512 = gdVar.f456659w;
        c19091x9511676c.f69241x935a0ea9 = gdVar.f456660x;
        r45.ae5 ae5Var = gdVar.B;
        if (ae5Var != null) {
            c19091x9511676c.f69255xfd79664d = ae5Var.f451502d;
            c19091x9511676c.f69253xe8447f03 = ae5Var.f451503e;
            c19091x9511676c.f69254xf6f9f8d9 = ae5Var.f451504f;
        }
        r45.hd hdVar = gdVar.A;
        if (hdVar != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("is_show_menu", hdVar.f457593d);
                java.util.LinkedList<r45.id> linkedList = hdVar.f457594e;
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                for (r45.id idVar : linkedList) {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, idVar.f458474d);
                    jSONObject2.put("jump_type", idVar.f458475e);
                    jSONObject2.put("jump_h5_url", idVar.f458476f);
                    jSONObject2.put("tinyapp_username", idVar.f458477g);
                    jSONObject2.put("tinyapp_path", idVar.f458478h);
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("balance_menu_item", jSONArray);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletQueryBankcardParser", e17, "Bankcard getBalance from balance, assemble menuInfoJson error: %s", e17.getMessage());
            }
            jSONObject.toString();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_BALANCE_MENU_INFO_STRING_SYNC, jSONObject.toString());
        } else {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_BALANCE_MENU_INFO_STRING_SYNC, "");
        }
        return c19091x9511676c;
    }

    public static at4.f c(org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletQueryBankcardParser", "getBalanceFetchInfo(), json is null");
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletQueryBankcardParser", "getBalanceFetchInfo(), json is valid");
        at4.f fVar = new at4.f();
        fVar.f95366a = jSONObject.optString("fetch_charge_title");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletQueryBankcardParser", "fetch_charge_title:" + fVar.f95366a);
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletQueryBankcardParser", "isBindQuery true");
            fVar.f95369d = jSONObject.optInt("is_cal_charge", 0);
            fVar.f95368c = jSONObject.optInt("is_show_charge", 0);
            fVar.f95370e = jSONObject.optInt("is_full_fetch_direct", 0);
            fVar.f95372g = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.j(jSONObject.optString("min_charge_fee", "0"), "100", 2, java.math.RoundingMode.HALF_UP);
            fVar.f95371f = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.j(jSONObject.optString("remain_fee", "0"), "100", 2, java.math.RoundingMode.HALF_UP);
            fVar.f95373h = jSONObject.optString("card_list_wording_title", "");
            fVar.f95374i = jSONObject.optString("card_list_wording_content", "");
            if (jSONObject.has("withdraw_sector")) {
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject("withdraw_sector");
                at4.c cVar = new at4.c();
                if (optJSONObject != null) {
                    try {
                        optJSONObject.optString("sector_title", "");
                        org.json.JSONArray optJSONArray = optJSONObject.optJSONArray("label");
                        if (optJSONArray != null) {
                            cVar.f95348a = new at4.e[optJSONArray.length()];
                            for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                                org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i17);
                                at4.e eVar = new at4.e();
                                eVar.f95358a = jSONObject2.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "");
                                eVar.f95359b = jSONObject2.optString("desc", "");
                                jSONObject2.optString("logo_url", "");
                                eVar.f95360c = jSONObject2.optInt("jump_type");
                                eVar.f95361d = jSONObject2.optString("jump_url", "");
                                eVar.f95362e = jSONObject2.optString(dm.i4.f66875xa013b0d5, "");
                                eVar.f95363f = jSONObject2.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, "");
                                cVar.f95348a[i17] = eVar;
                            }
                        }
                    } catch (org.json.JSONException unused) {
                    }
                }
                fVar.f95375j = cVar;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletQueryBankcardParser", " is_cal_charge:" + fVar.f95369d + " is_show_charge:" + fVar.f95368c + " min_charge_fee:" + fVar.f95372g + " remain_fee:" + fVar.f95371f + " is_full_fetch_direct:" + fVar.f95370e);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletQueryBankcardParser", "isBindQuery false");
        }
        org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("item");
        if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletQueryBankcardParser", "getBalanceFetchInfo(), itemJsonArray is null");
        } else {
            fVar.f95367b = new java.util.LinkedList();
            for (int i18 = 0; i18 < optJSONArray2.length(); i18++) {
                org.json.JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i18);
                if (optJSONObject2 != null) {
                    at4.d dVar = new at4.d();
                    dVar.f95351a = optJSONObject2.optString("key");
                    dVar.f95352b = optJSONObject2.optString("value");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletQueryBankcardParser", "feeItem.key is " + dVar.f95351a + " , feeItem.value is " + dVar.f95352b);
                    if (!android.text.TextUtils.isEmpty(dVar.f95351a) && !android.text.TextUtils.isEmpty(dVar.f95352b)) {
                        fVar.f95367b.add(dVar);
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletQueryBankcardParser", "item index " + i18 + " is empty");
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletQueryBankcardParser", "itemsList size is " + fVar.f95367b.size());
        }
        return fVar;
    }

    public static at4.k0 d(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletQueryBankcardParser", "getLoanEntryInfo json is null");
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletQueryBankcardParser", "getLoanEntryInfo()");
        at4.k0 k0Var = new at4.k0();
        k0Var.f67920x29dd02d3 = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        k0Var.f67917xc70051c8 = jSONObject.optString("loan_jump_url");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletQueryBankcardParser", "getLoanEntryInfo() field_loan_jump_url:" + k0Var.f67917xc70051c8);
        k0Var.f67916x4505d460 = jSONObject.optInt("is_show_entry", 0);
        k0Var.f67919x2261f75d = jSONObject.optString("tips");
        k0Var.f67915xd18846f0 = jSONObject.optInt("is_overdue", 0);
        if (jSONObject.has("available_otb")) {
            k0Var.f67914xe8f41222 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.n(jSONObject.optDouble("available_otb") / 100.0d, "CNY");
        }
        if (jSONObject.has(ya.b.f77479x42930b2)) {
            k0Var.f67918x1f185da9 = jSONObject.optInt(ya.b.f77479x42930b2);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletQueryBankcardParser", "getLoanEntryInfo() field_index:" + k0Var.f67918x1f185da9 + "  field_is_overdue:" + k0Var.f67915xd18846f0 + "  field_is_show_entry:" + k0Var.f67916x4505d460);
        return k0Var;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c e(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletQueryBankcardParser", "getLqtInfo, json object is null!");
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletQueryBankcardParser", "now get getLqtInfo: %s", jSONObject.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c(1);
        c19091x9511676c.f69223x58802fcb = jSONObject.optString("lqt_bank_type");
        c19091x9511676c.f69225xed6d60f6 = jSONObject.optString("lqt_bind_serial");
        int optInt = jSONObject.optInt("default_card_state", 0);
        c19091x9511676c.f69232xff761ac5 = optInt;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletQueryBankcardParser", "lqt default stats：%s", java.lang.Integer.valueOf(optInt));
        c19091x9511676c.f69217xaef0808c = jSONObject.optString("lqt_bank_name");
        c19091x9511676c.O2 = jSONObject.optLong("total_balance") / 100.0d;
        c19091x9511676c.Q2 = jSONObject.optLong("avail_balance") / 100.0d;
        at4.k kVar = new at4.k();
        c19091x9511676c.f261095a3 = kVar;
        kVar.f95411a = jSONObject.optString("lqt_logo_url");
        c19091x9511676c.f69239x93565523 = jSONObject.optString("lqt_forbid_word");
        c19091x9511676c.f69240x24ff0512 = jSONObject.optString("forbid_title");
        c19091x9511676c.f69241x935a0ea9 = jSONObject.optString("forbid_url");
        c19091x9511676c.P2 = jSONObject.optString("lqt_show_wording");
        c19091x9511676c.f69249x61dbf87 = jSONObject.optString("mobile");
        c19091x9511676c.f69260x2a326a79 = jSONObject.optInt("support_micropay", 0) == 1;
        c19091x9511676c.f69227x1d45800f |= 64;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19091x9511676c.f69217xaef0808c)) {
            c19091x9511676c.f69217xaef0808c = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575100kr3);
        }
        c19091x9511676c.f69233x225aa2b6 = c19091x9511676c.f69217xaef0808c;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19091x9511676c.f69239x93565523)) {
            c19091x9511676c.f69220xb7753620 = 0;
        } else {
            c19091x9511676c.f69220xb7753620 = 8;
        }
        return c19091x9511676c;
    }

    public static at4.v1 f(org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletQueryBankcardParser", "getUserInfo()");
        at4.v1 v1Var = new at4.v1();
        if (jSONObject == null || jSONObject.length() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletQueryBankcardParser", "getUserInfo() json == null or json.length() == 0");
            return null;
        }
        v1Var.f67049xff817ee4 = jSONObject.getInt("is_reg");
        v1Var.f67066xeae73197 = jSONObject.optString("true_name");
        v1Var.f67042x8a2885a8 = jSONObject.optInt("cre_type", -1);
        java.lang.String optString = jSONObject.optString("last_card_bind_serialno");
        v1Var.f67061x82927589 = optString;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletQueryBankcardParser", "mUserInfo.field_main_card_bind_serialno ：%s", optString);
        v1Var.f67041x8a2570f9 = jSONObject.optString("cre_name");
        v1Var.f67045xe10fc5ac = jSONObject.optString("transfer_url");
        v1Var.f67063x4856f578 = jSONObject.optString("reset_passwd_flag");
        v1Var.f67043xcbe8ad4f = jSONObject.optString("reset_passwd_url");
        v1Var.f67044xaf3d15db = jSONObject.optString("forget_passwd_url");
        ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().D(v1Var.f67061x82927589);
        v1Var.f67046xf0b0ce38 = "2".equals(jSONObject.optString("icard_user_flag", "2"));
        v1Var.f67038x27ae1475 = jSONObject.optInt("authen_account_type", -1);
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("touch_info");
        if (optJSONObject != null) {
            v1Var.f67048x2bf388ba = optJSONObject.optInt("is_open_touch", 0);
            v1Var.f67064x95279ff9 = optJSONObject.optInt("soter_pay_open_type", 0);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletQueryBankcardParser", "touch_info is null ");
            v1Var.f67048x2bf388ba = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().v() ? 1 : 0;
            v1Var.f67064x95279ff9 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().G();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletQueryBankcardParser", "old field_is_open_touch is " + v1Var.f67048x2bf388ba);
        }
        v1Var.f67052xcb187071 = jSONObject.optString("lct_wording");
        v1Var.f67051x75330dc8 = jSONObject.optString("lct_url");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletQueryBankcardParser", "field_lct_wording: " + v1Var.f67052xcb187071 + ", field_lct_url:" + v1Var.f67051x75330dc8);
        v1Var.f67060xa2dbcedc = jSONObject.optInt("lqt_state", -1);
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("lqb_show_info");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletQueryBankcardParser", "field_lqt_state: %s, lqb_show_info: %s", java.lang.Integer.valueOf(v1Var.f67060xa2dbcedc), optJSONObject2);
        if (optJSONObject2 != null) {
            v1Var.f67050x2bc292eb = optJSONObject2.optInt("is_show_lqb");
            v1Var.f67047x21e06fb8 = optJSONObject2.optInt("is_open_lqb");
            v1Var.f67053x6f83bfa1 = optJSONObject2.optString("lqb_open_url");
        }
        org.json.JSONObject optJSONObject3 = jSONObject.optJSONObject("lqt_cell_info");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletQueryBankcardParser", "lqt_cell_info: %s", optJSONObject3);
        if (optJSONObject3 != null) {
            v1Var.f67056xadbbba6a = optJSONObject3.optInt("is_show_cell");
            v1Var.f67054xfe02e601 = optJSONObject3.optString("cell_icon");
            v1Var.f67055x916f2507 = optJSONObject3.optInt("is_open_lqt");
            v1Var.f67057x1ef5a632 = optJSONObject3.optString("lqt_open_url");
            v1Var.f67058x502a0d20 = optJSONObject3.optString("lqt_title");
            v1Var.f67059x96ab5560 = optJSONObject3.optString("lqt_wording");
        }
        if (h(i17) || i17 == 3 || i17 == 4) {
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_LQT_OPEN_FLAG_INT_SYNC, java.lang.Integer.valueOf(v1Var.f67060xa2dbcedc));
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_LQT_ENTRY_WORDING_STRING_SYNC, v1Var.f67052xcb187071);
        }
        return v1Var;
    }

    public static java.util.ArrayList g(org.json.JSONArray jSONArray) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (jSONArray != null && jSONArray.length() > 0) {
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c();
                c19091x9511676c.f69227x1d45800f |= 4;
                c19091x9511676c.f69217xaef0808c = jSONObject.getString("bank_name");
                c19091x9511676c.f69223x58802fcb = jSONObject.getString("bank_type");
                c19091x9511676c.f69224xba2240f6 = jSONObject.optString("bankacc_type_name");
                c19091x9511676c.J2 = jSONObject.getString("card_id");
                c19091x9511676c.f69226x3a0bff44 = jSONObject.getString("app_username");
                int i18 = jSONObject.getInt("card_status");
                c19091x9511676c.f69263xe0badd12 = i18;
                if (i18 != 2) {
                    c19091x9511676c.f69220xb7753620 = 9;
                } else {
                    c19091x9511676c.f69220xb7753620 = 0;
                }
                c19091x9511676c.f69233x225aa2b6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l28, c19091x9511676c.f69217xaef0808c, c19091x9511676c.f69222x587fd4e1);
                at4.k kVar = new at4.k();
                c19091x9511676c.f261095a3 = kVar;
                kVar.f95411a = jSONObject.getString("logo_url");
                c19091x9511676c.f261095a3.f95412b = jSONObject.getString("background_logo_url");
                c19091x9511676c.f261095a3.f95413c = jSONObject.getString("big_logo_url");
                arrayList.add(c19091x9511676c);
            }
        }
        return arrayList;
    }

    public static boolean h(int i17) {
        return i17 == 9 || i17 == 10 || i17 == 11 || i17 == 12 || i17 == 13 || i17 == 14 || i17 == 15 || i17 == 16 || i17 == 17 || i17 == 18 || i17 == 19 || i17 == 20 || i17 == 21 || i17 == 22 || i17 == 23;
    }

    public static java.util.List i(org.json.JSONObject jSONObject) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (jSONObject != null) {
            try {
                org.json.JSONArray optJSONArray = jSONObject.optJSONArray("bankinfo_array");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i17 = 0; i17 < length; i17++) {
                        at4.g gVar = new at4.g();
                        org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i17);
                        gVar.f95388a = jSONObject2.optString("bind_serial");
                        gVar.f95389b = jSONObject2.optString("polling_forbid_word");
                        arrayList.add(gVar);
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletQueryBankcardParser", e17, "", new java.lang.Object[0]);
            }
        }
        return arrayList;
    }

    public static r45.ey4 j(org.json.JSONObject jSONObject) {
        if (jSONObject.has("guide_bar")) {
            try {
                r45.ey4 ey4Var = new r45.ey4();
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject("guide_bar");
                ey4Var.f455343d = optJSONObject.optInt("guide_type");
                if (optJSONObject.has("guide_data")) {
                    ey4Var.f455344e = new r45.fy4();
                    org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("guide_data");
                    ey4Var.f455344e.f456263d = optJSONObject2.optString("bind_serial");
                }
                ey4Var.f455345f = optJSONObject.optInt("is_show_guide");
                ey4Var.f455346g = optJSONObject.optString("guide_content");
                ey4Var.f455347h = optJSONObject.optString("guide_content_color");
                ey4Var.f455348i = optJSONObject.optString("guide_btn_text");
                ey4Var.f455349m = optJSONObject.optString("guide_btn_text_color");
                ey4Var.f455350n = optJSONObject.optString("guide_btn_bg_color");
                ey4Var.f455351o = optJSONObject.optString("guide_logo");
                ey4Var.f455352p = optJSONObject.optString("background_color");
                ey4Var.f455353q = optJSONObject.optString("attach_info_left_wording");
                ey4Var.f455354r = optJSONObject.optString("attach_info_right_wording");
                ey4Var.f455355s = optJSONObject.optInt("btn_jump_mode");
                ey4Var.f455356t = optJSONObject.optString("btn_jump_h5");
                ey4Var.f455357u = optJSONObject.optString("btn_jump_tinyapp_username");
                ey4Var.f455358v = optJSONObject.optString("btn_jump_tinyapp_path");
                ey4Var.f455359w = optJSONObject.optString("dark_guide_btn_text_color");
                ey4Var.f455360x = optJSONObject.optString("dark_guide_btn_bg_color");
                ey4Var.f455361y = optJSONObject.optString("dark_background_color");
                return ey4Var;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletQueryBankcardParser", "parseOfflineGuideBar Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
            }
        }
        return null;
    }

    public static void k(org.json.JSONObject jSONObject, int i17, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletQueryBankcardParser", "parseQueryBankcard(): %s, %s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        try {
            long optLong = jSONObject.optLong("time_stamp");
            if (optLong > 0) {
                com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.f1.b("" + optLong);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletQueryBankcardParser", "no time_stamp at WalletQueryBankcardParser.");
            }
            at4.v1 f17 = f(jSONObject.getJSONObject("user_info"), i17);
            if (z17) {
                f17.f67065x3aaa9ebb = jSONObject.getJSONObject("switch_info").getInt("switch_bit");
            } else {
                f17.f67065x3aaa9ebb = ((pg0.a3) i95.n0.c(pg0.a3.class)).cj().y0().f67065x3aaa9ebb;
            }
            int optInt = jSONObject.optInt("paymenu_use_new");
            f17.f67062x33fe276b = optInt;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletQueryBankcardParser", "parseQueryBankcard, paymenu_use_new: %s", java.lang.Integer.valueOf(optInt));
            java.lang.String optString = jSONObject.optString("support_bank_word");
            gm0.j1.i();
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_SUPPORT_BANK_WORD_STRING;
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (optString == null) {
                optString = "";
            }
            c17.x(u3Var, optString);
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("Array");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletQueryBankcardParser", "getBankcards()：%s", optJSONArray);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (optJSONArray != null && optJSONArray.length() > 0) {
                int length = optJSONArray.length();
                for (int i18 = 0; i18 < length; i18++) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c18 = at4.i.a().c(optJSONArray.getJSONObject(i18));
                    if (c18 != null) {
                        at4.i.f(c18);
                        arrayList.add(c18);
                    }
                }
            }
            java.util.ArrayList g17 = g(jSONObject.optJSONArray("virtual_card_array"));
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c a17 = a(jSONObject.optJSONObject("balance_info"), i17);
            if (a17 != null && i17 == 10) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletQueryBankcardParser", "carson: entry_url: %s、entry_word：%s", a17.S2, a17.T2);
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject("bill_entry");
                if (optJSONObject != null) {
                    a17.S2 = optJSONObject.optString("entry_url");
                    a17.T2 = optJSONObject.optString("entry_word");
                }
            }
            int optInt2 = jSONObject.optInt("query_cache_time");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletQueryBankcardParser", "hy: cache time: %d", java.lang.Integer.valueOf(optInt2));
            org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("complex_switch_info");
            if (optJSONObject2 != null) {
                org.json.JSONObject optJSONObject3 = optJSONObject2.optJSONObject("bind_newcard_switch");
                optJSONObject3.optInt("forbid_bind_card");
                optJSONObject3.optString("forbid_word");
            }
            at4.n.a().c(optJSONObject2);
            org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("history_card_array");
            if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletQueryBankcardParser", "getHistroyBankcard() json == null or json.length() == 0");
                c19091x9511676c = null;
            } else {
                c19091x9511676c = at4.i.a().c(optJSONArray2.getJSONObject(0));
                int i19 = c19091x9511676c.f69227x1d45800f;
                l75.e0 e0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c.A3;
                c19091x9511676c.f69227x1d45800f = i19 | 16;
            }
            m(jSONObject);
            org.json.JSONObject optJSONObject4 = jSONObject.optJSONObject("bank_priority");
            if (optJSONObject4 != null) {
                f17.f67039x86a71dc2 = optJSONObject4.toString();
            }
            java.util.List i27 = i(optJSONObject4);
            f17.f67068xfdb08bbe = jSONObject.optInt("unipayorderstate", 0);
            l(jSONObject, f17, z17);
            if (z18) {
                ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().F(j(jSONObject));
            }
            jSONObject.optString("query_order_time");
            at4.k0 d17 = d(jSONObject.optJSONObject("loan_entry_info"));
            org.json.JSONObject optJSONObject5 = jSONObject.optJSONObject("fetch_info");
            at4.f fVar = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f95535k;
            if (optJSONObject5 != null) {
                fVar = c(optJSONObject5, true);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletQueryBankcardParser", "parseQueryBankcard() fetch_info is null");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c e17 = e(jSONObject.optJSONObject("lqt_info"));
            if (i17 == 4) {
                at4.x1 fj6 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj();
                jSONObject.optInt("is_use_dynamic_free_fee");
                fj6.getClass();
                at4.x1 fj7 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj();
                jSONObject.optInt("dynamic_free_fee_hold_time");
                fj7.getClass();
            }
            ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().C(f17, arrayList, g17, a17, c19091x9511676c, d17, fVar, e17, optInt2, i17, i27);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletQueryBankcardParser", "parseQueryBankcard Exception :" + e18.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletQueryBankcardParser", e18, "", new java.lang.Object[0]);
        }
    }

    public static void l(org.json.JSONObject jSONObject, at4.v1 v1Var, boolean z17) {
        if (!z17) {
            v1Var.f67069x257bda7b = ((pg0.a3) i95.n0.c(pg0.a3.class)).cj().y0().f67069x257bda7b;
            v1Var.f67070x94698091 = ((pg0.a3) i95.n0.c(pg0.a3.class)).cj().y0().f67070x94698091;
            return;
        }
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("wallet_info");
        if (optJSONObject != null) {
            v1Var.f67069x257bda7b = optJSONObject.optLong("wallet_balance", -1L);
            v1Var.f67070x94698091 = optJSONObject.optInt("wallet_entrance_balance_switch_state", -1);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_NEW_BALANCE_LONG_SYNC, java.lang.Long.valueOf(v1Var.f67069x257bda7b));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r0 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m(org.json.JSONObject r4) {
        /*
            java.lang.String r0 = "balance_notice"
            org.json.JSONArray r0 = r4.optJSONArray(r0)
            java.lang.String r1 = "fetch_notice"
            org.json.JSONArray r4 = r4.optJSONArray(r1)
            java.lang.String r1 = ""
            if (r0 == 0) goto L18
            java.lang.String r0 = r0.toString()
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            if (r0 != 0) goto L19
        L18:
            r0 = r1
        L19:
            if (r4 == 0) goto L25
            java.lang.String r4 = r4.toString()
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            if (r4 != 0) goto L24
            goto L25
        L24:
            r1 = r4
        L25:
            java.lang.String r4 = "hy: balance notice: %s, fetchNotice: %s"
            java.lang.Object[] r2 = new java.lang.Object[]{r0, r1}
            java.lang.String r3 = "MicroMsg.WalletQueryBankcardParser"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r4, r2)
            gm0.j1.i()
            gm0.b0 r4 = gm0.j1.u()
            com.tencent.mm.storage.n3 r4 = r4.c()
            com.tencent.mm.storage.u3 r2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_BALANCE_NOTICE_STRING
            r4.x(r2, r0)
            gm0.j1.i()
            gm0.b0 r4 = gm0.j1.u()
            com.tencent.mm.storage.n3 r4 = r4.c()
            com.tencent.mm.storage.u3 r0 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_FETCH_NOTICE_STRING
            r4.x(r0, r1)
            gm0.j1.i()
            gm0.b0 r4 = gm0.j1.u()
            com.tencent.mm.storage.n3 r4 = r4.c()
            r0 = 1
            r4.i(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: at4.r1.m(org.json.JSONObject):void");
    }
}

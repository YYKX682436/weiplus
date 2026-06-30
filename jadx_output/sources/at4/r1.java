package at4;

/* loaded from: classes9.dex */
public abstract class r1 {
    /* JADX WARN: Multi-variable type inference failed */
    public static com.tencent.mm.plugin.wallet_core.model.Bankcard a(org.json.JSONObject jSONObject, int i17) {
        int i18;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = jSONObject == null ? "" : jSONObject;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletQueryBankcardParser", "Bankcard getBalance %s", objArr);
        if (jSONObject == null || jSONObject.length() <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletQueryBankcardParser", "getBalance() json == null or json.length() == 0");
            return null;
        }
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = new com.tencent.mm.plugin.wallet_core.model.Bankcard(1);
        at4.q1 q1Var = new at4.q1(jSONObject.optLong("time_out", 7200L), jSONObject.optLong("balance_version", -1L), jSONObject.optInt("avail_balance"), bankcard);
        java.util.regex.Pattern pattern = com.tencent.mm.wallet_core.ui.r1.f214222a;
        gm0.j1.i();
        gm0.j1.n().f273288b.g(new c01.ra(new com.tencent.mm.wallet_core.ui.i1(new java.lang.String[]{"wallet_balance_version", "wallet_balance_last_update_time", "wallet_balance"}, q1Var), null));
        bankcard.O2 = com.tencent.mm.wallet_core.ui.r1.j(jSONObject.optString("avail_balance", "0"), "100", 2, java.math.RoundingMode.HALF_UP);
        bankcard.P2 = jSONObject.optString("balance_show_wording");
        bankcard.U2 = jSONObject.optString("max_fetch_wording");
        bankcard.V2 = jSONObject.optString("avail_fetch_wording");
        bankcard.Q2 = com.tencent.mm.wallet_core.ui.r1.j(jSONObject.optString("fetch_balance", "0"), "100", 2, java.math.RoundingMode.HALF_UP);
        bankcard.field_cardType |= 8;
        bankcard.field_bankcardType = jSONObject.optString("balance_bank_type");
        bankcard.field_bindSerial = jSONObject.optString("balance_bind_serial");
        int optInt = jSONObject.optInt("default_card_state", 0);
        bankcard.field_defaultCardState = optInt;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletQueryBankcardParser", "balance default stats：%s", java.lang.Integer.valueOf(optInt));
        java.lang.String optString = jSONObject.optString("balance_forbid_word");
        bankcard.field_forbidWord = optString;
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            i18 = 0;
            bankcard.field_bankcardState = 0;
        } else {
            bankcard.field_bankcardState = 8;
            i18 = 0;
        }
        bankcard.field_fetchArriveTime = jSONObject.optLong("fetch_arrive_time");
        bankcard.field_mobile = jSONObject.optString("mobile");
        bankcard.field_support_micropay = jSONObject.optInt("support_micropay", i18) != 1 ? i18 : 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletQueryBankcardParser", "getBalance() support_micropay:" + jSONObject.optInt("support_micropay", i18));
        java.lang.String optString2 = jSONObject.optString("balance_list_url");
        bankcard.R2 = optString2;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletQueryBankcardParser", "carson balance_list_url: %s", optString2);
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.ked);
        bankcard.field_desc = string;
        bankcard.field_bankName = string;
        bankcard.field_bankcardTail = "10000";
        bankcard.field_forbid_title = jSONObject.optString("forbid_title");
        bankcard.field_forbid_url = jSONObject.optString("forbid_url");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("prompt_info");
        if (optJSONObject != null) {
            bankcard.field_prompt_info_prompt_text = optJSONObject.optString("prompt_text");
            bankcard.field_prompt_info_jump_text = optJSONObject.optString("jump_text");
            bankcard.field_prompt_info_jump_url = optJSONObject.optString("jump_url");
        }
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("balance_menu_info");
        if (optJSONObject2 != null) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_BALANCE_MENU_INFO_STRING_SYNC, optJSONObject2.toString());
        } else {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_BALANCE_MENU_INFO_STRING_SYNC, "");
        }
        if (i17 == 10) {
            org.json.JSONObject optJSONObject3 = jSONObject.optJSONObject("lqp_entrance_info");
            if (optJSONObject3 != null) {
                ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.tencent.mm.storage.u3.USERINFO_WALLET_BALANCE_ENTRANCE_INFO_STRING_SYNC, optJSONObject3.toString());
            } else {
                ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.tencent.mm.storage.u3.USERINFO_WALLET_BALANCE_ENTRANCE_INFO_STRING_SYNC, "");
            }
        }
        return bankcard;
    }

    public static com.tencent.mm.plugin.wallet_core.model.Bankcard b(r45.gd gdVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletQueryBankcardParser", "Bankcard getBalance from balance info %s", gdVar);
        if (gdVar == null) {
            return null;
        }
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = new com.tencent.mm.plugin.wallet_core.model.Bankcard(1);
        at4.q1 q1Var = new at4.q1(gdVar.f375124u, gdVar.f375123t, com.tencent.mm.sdk.platformtools.t8.V(gdVar.f375115i, 0L), bankcard);
        java.util.regex.Pattern pattern = com.tencent.mm.wallet_core.ui.r1.f214222a;
        gm0.j1.i();
        gm0.j1.n().f273288b.g(new c01.ra(new com.tencent.mm.wallet_core.ui.i1(new java.lang.String[]{"wallet_balance_version", "wallet_balance_last_update_time", "wallet_balance"}, q1Var), null));
        bankcard.O2 = com.tencent.mm.wallet_core.ui.r1.j(gdVar.f375115i, "100", 2, java.math.RoundingMode.HALF_UP);
        bankcard.P2 = gdVar.f375128y;
        bankcard.U2 = gdVar.f375122s;
        bankcard.V2 = gdVar.f375121r;
        bankcard.Q2 = com.tencent.mm.wallet_core.ui.r1.j(gdVar.f375117n, "100", 2, java.math.RoundingMode.HALF_UP);
        bankcard.field_cardType |= 8;
        bankcard.field_bankcardType = gdVar.f375111e;
        bankcard.field_bindSerial = gdVar.f375112f;
        java.lang.String str = gdVar.f375113g;
        bankcard.field_forbidWord = str;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            bankcard.field_bankcardState = 0;
        } else {
            bankcard.field_bankcardState = 8;
        }
        bankcard.field_mobile = gdVar.f375118o;
        bankcard.field_support_micropay = com.tencent.mm.sdk.platformtools.t8.P(gdVar.f375119p, 0) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletQueryBankcardParser", "getBalance() support_micropay:" + gdVar.f375119p);
        bankcard.R2 = gdVar.f375120q;
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.ked);
        bankcard.field_desc = string;
        bankcard.field_bankName = string;
        bankcard.field_bankcardTail = "10000";
        bankcard.field_forbid_title = gdVar.f375126w;
        bankcard.field_forbid_url = gdVar.f375127x;
        r45.ae5 ae5Var = gdVar.B;
        if (ae5Var != null) {
            bankcard.field_prompt_info_prompt_text = ae5Var.f369969d;
            bankcard.field_prompt_info_jump_text = ae5Var.f369970e;
            bankcard.field_prompt_info_jump_url = ae5Var.f369971f;
        }
        r45.hd hdVar = gdVar.A;
        if (hdVar != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("is_show_menu", hdVar.f376060d);
                java.util.LinkedList<r45.id> linkedList = hdVar.f376061e;
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                for (r45.id idVar : linkedList) {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, idVar.f376941d);
                    jSONObject2.put("jump_type", idVar.f376942e);
                    jSONObject2.put("jump_h5_url", idVar.f376943f);
                    jSONObject2.put("tinyapp_username", idVar.f376944g);
                    jSONObject2.put("tinyapp_path", idVar.f376945h);
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("balance_menu_item", jSONArray);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletQueryBankcardParser", e17, "Bankcard getBalance from balance, assemble menuInfoJson error: %s", e17.getMessage());
            }
            jSONObject.toString();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_BALANCE_MENU_INFO_STRING_SYNC, jSONObject.toString());
        } else {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_BALANCE_MENU_INFO_STRING_SYNC, "");
        }
        return bankcard;
    }

    public static at4.f c(org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletQueryBankcardParser", "getBalanceFetchInfo(), json is null");
            return null;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WalletQueryBankcardParser", "getBalanceFetchInfo(), json is valid");
        at4.f fVar = new at4.f();
        fVar.f13833a = jSONObject.optString("fetch_charge_title");
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletQueryBankcardParser", "fetch_charge_title:" + fVar.f13833a);
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletQueryBankcardParser", "isBindQuery true");
            fVar.f13836d = jSONObject.optInt("is_cal_charge", 0);
            fVar.f13835c = jSONObject.optInt("is_show_charge", 0);
            fVar.f13837e = jSONObject.optInt("is_full_fetch_direct", 0);
            fVar.f13839g = com.tencent.mm.wallet_core.ui.r1.j(jSONObject.optString("min_charge_fee", "0"), "100", 2, java.math.RoundingMode.HALF_UP);
            fVar.f13838f = com.tencent.mm.wallet_core.ui.r1.j(jSONObject.optString("remain_fee", "0"), "100", 2, java.math.RoundingMode.HALF_UP);
            fVar.f13840h = jSONObject.optString("card_list_wording_title", "");
            fVar.f13841i = jSONObject.optString("card_list_wording_content", "");
            if (jSONObject.has("withdraw_sector")) {
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject("withdraw_sector");
                at4.c cVar = new at4.c();
                if (optJSONObject != null) {
                    try {
                        optJSONObject.optString("sector_title", "");
                        org.json.JSONArray optJSONArray = optJSONObject.optJSONArray("label");
                        if (optJSONArray != null) {
                            cVar.f13815a = new at4.e[optJSONArray.length()];
                            for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                                org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i17);
                                at4.e eVar = new at4.e();
                                eVar.f13825a = jSONObject2.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
                                eVar.f13826b = jSONObject2.optString("desc", "");
                                jSONObject2.optString("logo_url", "");
                                eVar.f13827c = jSONObject2.optInt("jump_type");
                                eVar.f13828d = jSONObject2.optString("jump_url", "");
                                eVar.f13829e = jSONObject2.optString(dm.i4.COL_USERNAME, "");
                                eVar.f13830f = jSONObject2.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "");
                                cVar.f13815a[i17] = eVar;
                            }
                        }
                    } catch (org.json.JSONException unused) {
                    }
                }
                fVar.f13842j = cVar;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletQueryBankcardParser", " is_cal_charge:" + fVar.f13836d + " is_show_charge:" + fVar.f13835c + " min_charge_fee:" + fVar.f13839g + " remain_fee:" + fVar.f13838f + " is_full_fetch_direct:" + fVar.f13837e);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletQueryBankcardParser", "isBindQuery false");
        }
        org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("item");
        if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletQueryBankcardParser", "getBalanceFetchInfo(), itemJsonArray is null");
        } else {
            fVar.f13834b = new java.util.LinkedList();
            for (int i18 = 0; i18 < optJSONArray2.length(); i18++) {
                org.json.JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i18);
                if (optJSONObject2 != null) {
                    at4.d dVar = new at4.d();
                    dVar.f13818a = optJSONObject2.optString("key");
                    dVar.f13819b = optJSONObject2.optString("value");
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletQueryBankcardParser", "feeItem.key is " + dVar.f13818a + " , feeItem.value is " + dVar.f13819b);
                    if (!android.text.TextUtils.isEmpty(dVar.f13818a) && !android.text.TextUtils.isEmpty(dVar.f13819b)) {
                        fVar.f13834b.add(dVar);
                    }
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WalletQueryBankcardParser", "item index " + i18 + " is empty");
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletQueryBankcardParser", "itemsList size is " + fVar.f13834b.size());
        }
        return fVar;
    }

    public static at4.k0 d(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletQueryBankcardParser", "getLoanEntryInfo json is null");
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletQueryBankcardParser", "getLoanEntryInfo()");
        at4.k0 k0Var = new at4.k0();
        k0Var.field_title = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        k0Var.field_loan_jump_url = jSONObject.optString("loan_jump_url");
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletQueryBankcardParser", "getLoanEntryInfo() field_loan_jump_url:" + k0Var.field_loan_jump_url);
        k0Var.field_is_show_entry = jSONObject.optInt("is_show_entry", 0);
        k0Var.field_tips = jSONObject.optString("tips");
        k0Var.field_is_overdue = jSONObject.optInt("is_overdue", 0);
        if (jSONObject.has("available_otb")) {
            k0Var.field_available_otb = com.tencent.mm.wallet_core.ui.r1.n(jSONObject.optDouble("available_otb") / 100.0d, "CNY");
        }
        if (jSONObject.has(ya.b.INDEX)) {
            k0Var.field_red_dot_index = jSONObject.optInt(ya.b.INDEX);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletQueryBankcardParser", "getLoanEntryInfo() field_index:" + k0Var.field_red_dot_index + "  field_is_overdue:" + k0Var.field_is_overdue + "  field_is_show_entry:" + k0Var.field_is_show_entry);
        return k0Var;
    }

    public static com.tencent.mm.plugin.wallet_core.model.Bankcard e(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletQueryBankcardParser", "getLqtInfo, json object is null!");
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletQueryBankcardParser", "now get getLqtInfo: %s", jSONObject.toString());
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = new com.tencent.mm.plugin.wallet_core.model.Bankcard(1);
        bankcard.field_bankcardType = jSONObject.optString("lqt_bank_type");
        bankcard.field_bindSerial = jSONObject.optString("lqt_bind_serial");
        int optInt = jSONObject.optInt("default_card_state", 0);
        bankcard.field_defaultCardState = optInt;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletQueryBankcardParser", "lqt default stats：%s", java.lang.Integer.valueOf(optInt));
        bankcard.field_bankName = jSONObject.optString("lqt_bank_name");
        bankcard.O2 = jSONObject.optLong("total_balance") / 100.0d;
        bankcard.Q2 = jSONObject.optLong("avail_balance") / 100.0d;
        at4.k kVar = new at4.k();
        bankcard.f179562a3 = kVar;
        kVar.f13878a = jSONObject.optString("lqt_logo_url");
        bankcard.field_forbidWord = jSONObject.optString("lqt_forbid_word");
        bankcard.field_forbid_title = jSONObject.optString("forbid_title");
        bankcard.field_forbid_url = jSONObject.optString("forbid_url");
        bankcard.P2 = jSONObject.optString("lqt_show_wording");
        bankcard.field_mobile = jSONObject.optString("mobile");
        bankcard.field_support_micropay = jSONObject.optInt("support_micropay", 0) == 1;
        bankcard.field_cardType |= 64;
        if (com.tencent.mm.sdk.platformtools.t8.K0(bankcard.field_bankName)) {
            bankcard.field_bankName = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f493567kr3);
        }
        bankcard.field_desc = bankcard.field_bankName;
        if (com.tencent.mm.sdk.platformtools.t8.K0(bankcard.field_forbidWord)) {
            bankcard.field_bankcardState = 0;
        } else {
            bankcard.field_bankcardState = 8;
        }
        return bankcard;
    }

    public static at4.v1 f(org.json.JSONObject jSONObject, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletQueryBankcardParser", "getUserInfo()");
        at4.v1 v1Var = new at4.v1();
        if (jSONObject == null || jSONObject.length() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletQueryBankcardParser", "getUserInfo() json == null or json.length() == 0");
            return null;
        }
        v1Var.field_is_reg = jSONObject.getInt("is_reg");
        v1Var.field_true_name = jSONObject.optString("true_name");
        v1Var.field_cre_type = jSONObject.optInt("cre_type", -1);
        java.lang.String optString = jSONObject.optString("last_card_bind_serialno");
        v1Var.field_main_card_bind_serialno = optString;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletQueryBankcardParser", "mUserInfo.field_main_card_bind_serialno ：%s", optString);
        v1Var.field_cre_name = jSONObject.optString("cre_name");
        v1Var.field_ftf_pay_url = jSONObject.optString("transfer_url");
        v1Var.field_reset_passwd_flag = jSONObject.optString("reset_passwd_flag");
        v1Var.field_find_passwd_url = jSONObject.optString("reset_passwd_url");
        v1Var.field_forget_passwd_url = jSONObject.optString("forget_passwd_url");
        ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().D(v1Var.field_main_card_bind_serialno);
        v1Var.field_isDomesticUser = "2".equals(jSONObject.optString("icard_user_flag", "2"));
        v1Var.field_authen_account_type = jSONObject.optInt("authen_account_type", -1);
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("touch_info");
        if (optJSONObject != null) {
            v1Var.field_is_open_touch = optJSONObject.optInt("is_open_touch", 0);
            v1Var.field_soter_pay_open_type = optJSONObject.optInt("soter_pay_open_type", 0);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletQueryBankcardParser", "touch_info is null ");
            v1Var.field_is_open_touch = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().v() ? 1 : 0;
            v1Var.field_soter_pay_open_type = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().G();
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletQueryBankcardParser", "old field_is_open_touch is " + v1Var.field_is_open_touch);
        }
        v1Var.field_lct_wording = jSONObject.optString("lct_wording");
        v1Var.field_lct_url = jSONObject.optString("lct_url");
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletQueryBankcardParser", "field_lct_wording: " + v1Var.field_lct_wording + ", field_lct_url:" + v1Var.field_lct_url);
        v1Var.field_lqt_state = jSONObject.optInt("lqt_state", -1);
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("lqb_show_info");
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletQueryBankcardParser", "field_lqt_state: %s, lqb_show_info: %s", java.lang.Integer.valueOf(v1Var.field_lqt_state), optJSONObject2);
        if (optJSONObject2 != null) {
            v1Var.field_is_show_lqb = optJSONObject2.optInt("is_show_lqb");
            v1Var.field_is_open_lqb = optJSONObject2.optInt("is_open_lqb");
            v1Var.field_lqb_open_url = optJSONObject2.optString("lqb_open_url");
        }
        org.json.JSONObject optJSONObject3 = jSONObject.optJSONObject("lqt_cell_info");
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletQueryBankcardParser", "lqt_cell_info: %s", optJSONObject3);
        if (optJSONObject3 != null) {
            v1Var.field_lqt_cell_is_show = optJSONObject3.optInt("is_show_cell");
            v1Var.field_lqt_cell_icon = optJSONObject3.optString("cell_icon");
            v1Var.field_lqt_cell_is_open_lqt = optJSONObject3.optInt("is_open_lqt");
            v1Var.field_lqt_cell_lqt_open_url = optJSONObject3.optString("lqt_open_url");
            v1Var.field_lqt_cell_lqt_title = optJSONObject3.optString("lqt_title");
            v1Var.field_lqt_cell_lqt_wording = optJSONObject3.optString("lqt_wording");
        }
        if (h(i17) || i17 == 3 || i17 == 4) {
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_LQT_OPEN_FLAG_INT_SYNC, java.lang.Integer.valueOf(v1Var.field_lqt_state));
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_LQT_ENTRY_WORDING_STRING_SYNC, v1Var.field_lct_wording);
        }
        return v1Var;
    }

    public static java.util.ArrayList g(org.json.JSONArray jSONArray) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (jSONArray != null && jSONArray.length() > 0) {
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = new com.tencent.mm.plugin.wallet_core.model.Bankcard();
                bankcard.field_cardType |= 4;
                bankcard.field_bankName = jSONObject.getString("bank_name");
                bankcard.field_bankcardType = jSONObject.getString("bank_type");
                bankcard.field_bankcardTypeName = jSONObject.optString("bankacc_type_name");
                bankcard.J2 = jSONObject.getString("card_id");
                bankcard.field_bizUsername = jSONObject.getString("app_username");
                int i18 = jSONObject.getInt("card_status");
                bankcard.field_wxcreditState = i18;
                if (i18 != 2) {
                    bankcard.field_bankcardState = 9;
                } else {
                    bankcard.field_bankcardState = 0;
                }
                bankcard.field_desc = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.l28, bankcard.field_bankName, bankcard.field_bankcardTail);
                at4.k kVar = new at4.k();
                bankcard.f179562a3 = kVar;
                kVar.f13878a = jSONObject.getString("logo_url");
                bankcard.f179562a3.f13879b = jSONObject.getString("background_logo_url");
                bankcard.f179562a3.f13880c = jSONObject.getString("big_logo_url");
                arrayList.add(bankcard);
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
                        gVar.f13855a = jSONObject2.optString("bind_serial");
                        gVar.f13856b = jSONObject2.optString("polling_forbid_word");
                        arrayList.add(gVar);
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletQueryBankcardParser", e17, "", new java.lang.Object[0]);
            }
        }
        return arrayList;
    }

    public static r45.ey4 j(org.json.JSONObject jSONObject) {
        if (jSONObject.has("guide_bar")) {
            try {
                r45.ey4 ey4Var = new r45.ey4();
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject("guide_bar");
                ey4Var.f373810d = optJSONObject.optInt("guide_type");
                if (optJSONObject.has("guide_data")) {
                    ey4Var.f373811e = new r45.fy4();
                    org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("guide_data");
                    ey4Var.f373811e.f374730d = optJSONObject2.optString("bind_serial");
                }
                ey4Var.f373812f = optJSONObject.optInt("is_show_guide");
                ey4Var.f373813g = optJSONObject.optString("guide_content");
                ey4Var.f373814h = optJSONObject.optString("guide_content_color");
                ey4Var.f373815i = optJSONObject.optString("guide_btn_text");
                ey4Var.f373816m = optJSONObject.optString("guide_btn_text_color");
                ey4Var.f373817n = optJSONObject.optString("guide_btn_bg_color");
                ey4Var.f373818o = optJSONObject.optString("guide_logo");
                ey4Var.f373819p = optJSONObject.optString("background_color");
                ey4Var.f373820q = optJSONObject.optString("attach_info_left_wording");
                ey4Var.f373821r = optJSONObject.optString("attach_info_right_wording");
                ey4Var.f373822s = optJSONObject.optInt("btn_jump_mode");
                ey4Var.f373823t = optJSONObject.optString("btn_jump_h5");
                ey4Var.f373824u = optJSONObject.optString("btn_jump_tinyapp_username");
                ey4Var.f373825v = optJSONObject.optString("btn_jump_tinyapp_path");
                ey4Var.f373826w = optJSONObject.optString("dark_guide_btn_text_color");
                ey4Var.f373827x = optJSONObject.optString("dark_guide_btn_bg_color");
                ey4Var.f373828y = optJSONObject.optString("dark_background_color");
                return ey4Var;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletQueryBankcardParser", "parseOfflineGuideBar Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
            }
        }
        return null;
    }

    public static void k(org.json.JSONObject jSONObject, int i17, boolean z17, boolean z18) {
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletQueryBankcardParser", "parseQueryBankcard(): %s, %s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        try {
            long optLong = jSONObject.optLong("time_stamp");
            if (optLong > 0) {
                com.tencent.mm.wallet_core.model.f1.b("" + optLong);
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.WalletQueryBankcardParser", "no time_stamp at WalletQueryBankcardParser.");
            }
            at4.v1 f17 = f(jSONObject.getJSONObject("user_info"), i17);
            if (z17) {
                f17.field_switchConfig = jSONObject.getJSONObject("switch_info").getInt("switch_bit");
            } else {
                f17.field_switchConfig = ((pg0.a3) i95.n0.c(pg0.a3.class)).cj().y0().field_switchConfig;
            }
            int optInt = jSONObject.optInt("paymenu_use_new");
            f17.field_paymenu_use_new = optInt;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletQueryBankcardParser", "parseQueryBankcard, paymenu_use_new: %s", java.lang.Integer.valueOf(optInt));
            java.lang.String optString = jSONObject.optString("support_bank_word");
            gm0.j1.i();
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_WALLET_SUPPORT_BANK_WORD_STRING;
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (optString == null) {
                optString = "";
            }
            c17.x(u3Var, optString);
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("Array");
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletQueryBankcardParser", "getBankcards()：%s", optJSONArray);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (optJSONArray != null && optJSONArray.length() > 0) {
                int length = optJSONArray.length();
                for (int i18 = 0; i18 < length; i18++) {
                    com.tencent.mm.plugin.wallet_core.model.Bankcard c18 = at4.i.a().c(optJSONArray.getJSONObject(i18));
                    if (c18 != null) {
                        at4.i.f(c18);
                        arrayList.add(c18);
                    }
                }
            }
            java.util.ArrayList g17 = g(jSONObject.optJSONArray("virtual_card_array"));
            com.tencent.mm.plugin.wallet_core.model.Bankcard a17 = a(jSONObject.optJSONObject("balance_info"), i17);
            if (a17 != null && i17 == 10) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletQueryBankcardParser", "carson: entry_url: %s、entry_word：%s", a17.S2, a17.T2);
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject("bill_entry");
                if (optJSONObject != null) {
                    a17.S2 = optJSONObject.optString("entry_url");
                    a17.T2 = optJSONObject.optString("entry_word");
                }
            }
            int optInt2 = jSONObject.optInt("query_cache_time");
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletQueryBankcardParser", "hy: cache time: %d", java.lang.Integer.valueOf(optInt2));
            org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("complex_switch_info");
            if (optJSONObject2 != null) {
                org.json.JSONObject optJSONObject3 = optJSONObject2.optJSONObject("bind_newcard_switch");
                optJSONObject3.optInt("forbid_bind_card");
                optJSONObject3.optString("forbid_word");
            }
            at4.n.a().c(optJSONObject2);
            org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("history_card_array");
            if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletQueryBankcardParser", "getHistroyBankcard() json == null or json.length() == 0");
                bankcard = null;
            } else {
                bankcard = at4.i.a().c(optJSONArray2.getJSONObject(0));
                int i19 = bankcard.field_cardType;
                l75.e0 e0Var = com.tencent.mm.plugin.wallet_core.model.Bankcard.A3;
                bankcard.field_cardType = i19 | 16;
            }
            m(jSONObject);
            org.json.JSONObject optJSONObject4 = jSONObject.optJSONObject("bank_priority");
            if (optJSONObject4 != null) {
                f17.field_bank_priority = optJSONObject4.toString();
            }
            java.util.List i27 = i(optJSONObject4);
            f17.field_unipay_order_state = jSONObject.optInt("unipayorderstate", 0);
            l(jSONObject, f17, z17);
            if (z18) {
                ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().F(j(jSONObject));
            }
            jSONObject.optString("query_order_time");
            at4.k0 d17 = d(jSONObject.optJSONObject("loan_entry_info"));
            org.json.JSONObject optJSONObject5 = jSONObject.optJSONObject("fetch_info");
            at4.f fVar = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f14002k;
            if (optJSONObject5 != null) {
                fVar = c(optJSONObject5, true);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletQueryBankcardParser", "parseQueryBankcard() fetch_info is null");
            }
            com.tencent.mm.plugin.wallet_core.model.Bankcard e17 = e(jSONObject.optJSONObject("lqt_info"));
            if (i17 == 4) {
                at4.x1 fj6 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj();
                jSONObject.optInt("is_use_dynamic_free_fee");
                fj6.getClass();
                at4.x1 fj7 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj();
                jSONObject.optInt("dynamic_free_fee_hold_time");
                fj7.getClass();
            }
            ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().C(f17, arrayList, g17, a17, bankcard, d17, fVar, e17, optInt2, i17, i27);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletQueryBankcardParser", "parseQueryBankcard Exception :" + e18.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletQueryBankcardParser", e18, "", new java.lang.Object[0]);
        }
    }

    public static void l(org.json.JSONObject jSONObject, at4.v1 v1Var, boolean z17) {
        if (!z17) {
            v1Var.field_wallet_balance = ((pg0.a3) i95.n0.c(pg0.a3.class)).cj().y0().field_wallet_balance;
            v1Var.field_wallet_entrance_balance_switch_state = ((pg0.a3) i95.n0.c(pg0.a3.class)).cj().y0().field_wallet_entrance_balance_switch_state;
            return;
        }
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("wallet_info");
        if (optJSONObject != null) {
            v1Var.field_wallet_balance = optJSONObject.optLong("wallet_balance", -1L);
            v1Var.field_wallet_entrance_balance_switch_state = optJSONObject.optInt("wallet_entrance_balance_switch_state", -1);
            ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.tencent.mm.storage.u3.USERINFO_NEW_BALANCE_LONG_SYNC, java.lang.Long.valueOf(v1Var.field_wallet_balance));
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
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.f192989a
            if (r0 != 0) goto L19
        L18:
            r0 = r1
        L19:
            if (r4 == 0) goto L25
            java.lang.String r4 = r4.toString()
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.f192989a
            if (r4 != 0) goto L24
            goto L25
        L24:
            r1 = r4
        L25:
            java.lang.String r4 = "hy: balance notice: %s, fetchNotice: %s"
            java.lang.Object[] r2 = new java.lang.Object[]{r0, r1}
            java.lang.String r3 = "MicroMsg.WalletQueryBankcardParser"
            com.tencent.mars.xlog.Log.i(r3, r4, r2)
            gm0.j1.i()
            gm0.b0 r4 = gm0.j1.u()
            com.tencent.mm.storage.n3 r4 = r4.c()
            com.tencent.mm.storage.u3 r2 = com.tencent.mm.storage.u3.USERINFO_WALLET_BALANCE_NOTICE_STRING
            r4.x(r2, r0)
            gm0.j1.i()
            gm0.b0 r4 = gm0.j1.u()
            com.tencent.mm.storage.n3 r4 = r4.c()
            com.tencent.mm.storage.u3 r0 = com.tencent.mm.storage.u3.USERINFO_WALLET_FETCH_NOTICE_STRING
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

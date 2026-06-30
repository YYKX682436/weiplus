package lu1;

/* loaded from: classes15.dex */
public abstract class t {
    public static java.lang.String a(java.lang.String str) {
        return (android.text.TextUtils.isEmpty(str) || "null".equals(str)) ? "" : str;
    }

    public static r45.gn b(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardInfoParser", "parseBluetoothInfo json is null");
            return null;
        }
        r45.gn gnVar = new r45.gn();
        gnVar.f456900d = jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
        gnVar.f456901e = jSONObject.optInt("report_time_interval", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardInfoParser", "blueToothInfo.name:%s", gnVar.f456900d);
        return gnVar;
    }

    public static java.util.ArrayList c(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardInfoParser", "parseCardArray jsonContent is null");
            return null;
        }
        try {
            org.json.JSONArray optJSONArray = new org.json.JSONObject(str).optJSONArray("card_array");
            if (optJSONArray != null && optJSONArray.length() != 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                    org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe c13038x357affe = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe();
                    j(c13038x357affe, optJSONObject);
                    arrayList.add(c13038x357affe);
                }
                return arrayList;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardInfoParser", "parseCardArray cardItemListJson is null");
            return null;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CardInfoParser", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    public static java.util.LinkedList d(org.json.JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
            r45.lv lvVar = new r45.lv();
            lvVar.f461376d = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            lvVar.f461377e = jSONObject.optString("sub_title");
            lvVar.f461378f = jSONObject.optString("tips");
            lvVar.f461379g = jSONObject.optString("url");
            lvVar.f461380h = jSONObject.optLong("show_flag");
            lvVar.f461381i = jSONObject.optString("primary_color");
            lvVar.f461382m = jSONObject.optString("secondary_color");
            lvVar.f461383n = jSONObject.optString("icon_url");
            lvVar.f461384o = jSONObject.optString("app_brand_user_name");
            lvVar.f461385p = jSONObject.optString("app_brand_pass");
            lvVar.f461386q = jSONObject.optString("finder_username");
            lvVar.f461387r = jSONObject.optString("feed_id");
            lvVar.f461388s = jSONObject.optString("nonce_id");
            linkedList.add(lvVar);
        }
        return linkedList;
    }

    public static java.util.LinkedList e(org.json.JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            r45.w50 l17 = l(jSONArray.getJSONObject(i17));
            if (l17 != null) {
                linkedList.add(l17);
            }
        }
        return linkedList;
    }

    public static java.util.LinkedList f(org.json.JSONArray jSONArray) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (jSONArray != null) {
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                try {
                    r45.s1 s1Var = new r45.s1();
                    org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                    s1Var.f466907d = jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24);
                    s1Var.f466908e = jSONObject.optString("url");
                    s1Var.f466910g = jSONObject.optString("tinyapp_path");
                    s1Var.f466909f = jSONObject.optString("tinyapp_username");
                    linkedList.add(s1Var);
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CardInfoParser", e17, "", new java.lang.Object[0]);
                }
            }
        }
        return linkedList;
    }

    public static r45.ju g(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardInfoParser", "parserannoucement json is null");
            return null;
        }
        r45.ju juVar = new r45.ju();
        juVar.f459636d = jSONObject.optInt("type");
        juVar.f459637e = jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24);
        juVar.f459638f = jSONObject.optString("url");
        juVar.f459639g = jSONObject.optInt("endtime");
        juVar.f459640h = jSONObject.optInt("create_time");
        juVar.f459641i = jSONObject.optString("thumb_url");
        return juVar;
    }

    public static r45.rt h(org.json.JSONObject jSONObject) {
        java.util.LinkedList linkedList = null;
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardInfoParser", "parserCardDataInfo json is null");
            return null;
        }
        r45.rt rtVar = new r45.rt();
        try {
            rtVar.f466714d = jSONObject.optInt("status");
            rtVar.f466715e = jSONObject.optInt("init_balance");
            rtVar.f466716f = jSONObject.optInt("init_bonus");
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("cell_list0");
            if (optJSONArray != null) {
                rtVar.f466717g = d(optJSONArray);
            }
            org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("cell_list1");
            if (optJSONArray2 != null) {
                rtVar.f466718h = d(optJSONArray2);
            }
            org.json.JSONArray optJSONArray3 = jSONObject.optJSONArray("cell_list2");
            if (optJSONArray3 != null) {
                rtVar.f466719i = d(optJSONArray3);
            }
            org.json.JSONArray optJSONArray4 = jSONObject.optJSONArray("acceptors");
            if (optJSONArray4 != null) {
                if (optJSONArray4.length() != 0) {
                    linkedList = new java.util.LinkedList();
                    for (int i17 = 0; i17 < optJSONArray4.length(); i17++) {
                        linkedList.add((java.lang.String) optJSONArray4.get(i17));
                    }
                }
                rtVar.f466720m = linkedList;
            }
            rtVar.f466721n = jSONObject.optInt("avail_num");
            rtVar.f466723p = jSONObject.optInt("code_type");
            rtVar.f466722o = jSONObject.optString("code");
            org.json.JSONArray optJSONArray5 = jSONObject.optJSONArray("secondary_fields");
            if (optJSONArray5 != null) {
                rtVar.f466724q = e(optJSONArray5);
            }
            rtVar.f466725r = jSONObject.optLong("stock_num");
            rtVar.f466726s = jSONObject.optInt("limit_num");
            rtVar.f466727t = jSONObject.optString("user_report_url");
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("third_field");
            if (optJSONObject != null) {
                rtVar.f466728u = l(optJSONObject);
            }
            rtVar.f466729v = f(jSONObject.optJSONArray("action_sheets"));
            org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("card_list_field");
            if (optJSONObject2 != null) {
                rtVar.f466730w = l(optJSONObject2);
            }
            org.json.JSONObject optJSONObject3 = jSONObject.optJSONObject("operate_field");
            if (optJSONObject3 != null) {
                rtVar.f466731x = l(optJSONObject3);
            }
            org.json.JSONObject optJSONObject4 = jSONObject.optJSONObject("limit_field");
            if (optJSONObject4 != null) {
                rtVar.f466732y = l(optJSONObject4);
            }
            org.json.JSONObject optJSONObject5 = jSONObject.optJSONObject("detail_table");
            if (optJSONObject5 != null) {
                rtVar.f466733z = n(optJSONObject5);
            }
            rtVar.A = jSONObject.optString("background_pic_url");
            org.json.JSONObject optJSONObject6 = jSONObject.optJSONObject("gifting_info_cell");
            if (optJSONObject6 != null) {
                rtVar.B = l(optJSONObject6);
            }
            rtVar.C = jSONObject.optString("sign_number");
            org.json.JSONObject optJSONObject7 = jSONObject.optJSONObject("unavailable_qrcode_field");
            if (optJSONObject7 != null) {
                rtVar.D = l(optJSONObject7);
            }
            rtVar.E = jSONObject.optBoolean("is_commom_card");
            rtVar.F = jSONObject.optBoolean("is_location_authorized");
            rtVar.G = l(jSONObject.optJSONObject("finder_field"));
            rtVar.H = l(jSONObject.optJSONObject("feed_field"));
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CardInfoParser", e17, "", new java.lang.Object[0]);
        }
        return rtVar;
    }

    public static void i(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe c13038x357affe, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardInfoParser", "parserCardItemJson jsonContent is null");
            return;
        }
        try {
            j(c13038x357affe, new org.json.JSONObject(str));
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CardInfoParser", e17, "", new java.lang.Object[0]);
        }
    }

    public static void j(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe c13038x357affe, org.json.JSONObject jSONObject) {
        r45.j46 j46Var;
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardInfoParser", "parserCardItemJson json is null");
            return;
        }
        c13038x357affe.f67736x95970a65 = a(jSONObject.optString("card_id"));
        c13038x357affe.f67737xf4648834 = a(jSONObject.optString("card_tp_id"));
        c13038x357affe.f67741x8ba24d69 = jSONObject.optInt("state_flag");
        c13038x357affe.f67754xa783a79b = jSONObject.optInt("update_time");
        c13038x357affe.f67753x266f95d1 = jSONObject.optLong("sequence");
        c13038x357affe.f67743x7697d746 = jSONObject.optString("from_username");
        c13038x357affe.f67733xfb71c908 = jSONObject.optLong("begin_time", 0L);
        c13038x357affe.f67742x849cdd56 = jSONObject.optLong("end_time", 0L);
        c13038x357affe.A1 = jSONObject.optString("encrypt_code");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("card_data_info");
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("card_tp_info");
        org.json.JSONObject optJSONObject3 = jSONObject.optJSONObject("share_info");
        c13038x357affe.f176209x1 = h(optJSONObject);
        c13038x357affe.f176208p1 = k(optJSONObject2);
        if (optJSONObject3 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardInfoParser", "parserShareInfo json is null");
            j46Var = null;
        } else {
            r45.j46 j46Var2 = new r45.j46();
            j46Var2.f459113d = optJSONObject3.optString("gift_msg_title");
            j46Var = j46Var2;
        }
        c13038x357affe.f176210y1 = j46Var;
        r45.vu vuVar = c13038x357affe.f176208p1;
        if (vuVar != null) {
            c13038x357affe.f176208p1 = vuVar;
            try {
                c13038x357affe.f67735x13503529 = vuVar.mo14344x5f01b1f6();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardInfo", "setCardTpInfo fail, ex = %s", e17.getMessage());
            }
            c13038x357affe.f67734x5d2ffc3 = java.lang.Integer.toString(c13038x357affe.f176208p1.B);
            c13038x357affe.f67738x8c036204 = c13038x357affe.f176208p1.f470083i;
            if (android.text.TextUtils.isEmpty(c13038x357affe.f67737xf4648834)) {
                c13038x357affe.f67737xf4648834 = c13038x357affe.f176208p1.f470078d;
            }
            if (c13038x357affe.f67733xfb71c908 == 0 && optJSONObject2 != null) {
                c13038x357affe.f67733xfb71c908 = optJSONObject2.optLong("begin_time");
            }
            if (c13038x357affe.f67742x849cdd56 == 0 && optJSONObject2 != null) {
                c13038x357affe.f67742x849cdd56 = optJSONObject2.optLong("end_time");
            }
            r45.eg0 eg0Var = c13038x357affe.f176208p1.f470089p0;
            if (eg0Var != null) {
                c13038x357affe.f67744x91397e8f = eg0Var.f454959d;
            }
        }
        r45.rt rtVar = c13038x357affe.f176209x1;
        if (rtVar != null) {
            c13038x357affe.G(rtVar);
            c13038x357affe.f67749x10a0fed7 = c13038x357affe.f176209x1.f466714d;
        }
        r45.j46 j46Var3 = c13038x357affe.f176210y1;
        if (j46Var3 != null) {
            c13038x357affe.f176210y1 = j46Var3;
            try {
                c13038x357affe.f67747x7f1b5bf2 = j46Var3.mo14344x5f01b1f6();
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardInfo", "setShareInfo fail, ex = %s", e18.getMessage());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CardInfo", e18, "", new java.lang.Object[0]);
            }
        }
        c13038x357affe.f67746xe9093d2f = (int) (java.lang.System.currentTimeMillis() / 1000);
    }

    public static r45.vu k(org.json.JSONObject jSONObject) {
        r45.s1 s1Var = null;
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardInfoParser", "parserCardTpInfo json is null");
            return null;
        }
        r45.vu vuVar = new r45.vu();
        try {
            vuVar.f470078d = jSONObject.optString("card_tp_id");
            vuVar.f470079e = jSONObject.optString("logo_url");
            vuVar.f470080f = jSONObject.optString("appid");
            vuVar.f470081g = jSONObject.optString("app_username");
            vuVar.f470082h = jSONObject.optInt("card_category");
            vuVar.f470083i = jSONObject.optInt("card_type");
            vuVar.f470085m = jSONObject.optString("brand_name");
            vuVar.f470086n = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            vuVar.f470087o = jSONObject.optString("sub_title");
            vuVar.f470088p = jSONObject.optString("color");
            vuVar.f470091q = jSONObject.optString("notice");
            vuVar.f470092r = jSONObject.optString("service_phone");
            vuVar.f470095u = jSONObject.optString("image_text_url");
            vuVar.f470096v = jSONObject.optString("source_icon");
            vuVar.f470097w = jSONObject.optString(ya.b.f77502x92235c1b);
            vuVar.A1 = jSONObject.optString("brand_icon_url");
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("primary_fields");
            if (optJSONArray != null) {
                vuVar.f470093s = e(optJSONArray);
            }
            org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("introduce_fields");
            if (optJSONArray2 != null) {
                vuVar.f470094t = e(optJSONArray2);
            }
            vuVar.f470098x = jSONObject.optInt("shop_count");
            vuVar.f470104z = jSONObject.optString("limit_wording");
            vuVar.f470101y = jSONObject.optString("card_type_name");
            vuVar.A = jSONObject.optString("h5_show_url");
            vuVar.B = jSONObject.optInt("block_mask");
            vuVar.C = jSONObject.optString("middle_icon");
            vuVar.D = jSONObject.optString("accept_wording");
            vuVar.E = jSONObject.optLong("control_flag");
            vuVar.F = jSONObject.optString("advertise_wording");
            vuVar.G = jSONObject.optString("advertise_url");
            vuVar.H = jSONObject.optString("public_service_name");
            vuVar.I = g(jSONObject.optJSONObject("announcement"));
            vuVar.f470077J = jSONObject.optString("public_service_tip");
            vuVar.K = jSONObject.optString("primary_sub_title");
            vuVar.L = jSONObject.optInt("gen_type");
            vuVar.M = m(jSONObject.optJSONObject("detail_struct"));
            vuVar.N = s(jSONObject.optJSONObject("use_condition"));
            vuVar.P = p(jSONObject.optJSONObject("follow_box"));
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("guidance");
            if (optJSONObject == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardInfoParser", "parserActionSheet json is null");
            } else {
                s1Var = new r45.s1();
                s1Var.f466907d = optJSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24);
                s1Var.f466908e = optJSONObject.optString("url");
            }
            vuVar.Q = s1Var;
            vuVar.R = jSONObject.optInt("need_direct_jump", 0);
            vuVar.S = jSONObject.optInt("is_acceptable", 0);
            vuVar.T = jSONObject.optString("unacceptable_wording");
            vuVar.U = jSONObject.optInt("has_hongbao", 0);
            vuVar.V = jSONObject.optString("accept_ui_title");
            vuVar.W = jSONObject.optInt("show_accept_view", 0);
            org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("brand_field");
            if (optJSONObject2 != null) {
                vuVar.X = l(optJSONObject2);
            }
            vuVar.Y = jSONObject.optString("shop_name");
            org.json.JSONObject optJSONObject3 = jSONObject.optJSONObject("pay_and_qrcode_field");
            if (optJSONObject3 != null) {
                vuVar.Z = l(optJSONObject3);
            }
            org.json.JSONObject optJSONObject4 = jSONObject.optJSONObject("dynamic_qr_code_info");
            if (optJSONObject4 != null) {
                vuVar.f470089p0 = o(optJSONObject4);
            }
            vuVar.f470099x0 = jSONObject.optBoolean("is_card_code_exposed");
            vuVar.f470102y0 = jSONObject.optInt("qrcode_correct_level");
            vuVar.f470084l1 = jSONObject.optBoolean("dismiss_qrcode_icon_on_card");
            vuVar.f470090p1 = jSONObject.optBoolean("need_location");
            org.json.JSONObject optJSONObject5 = jSONObject.optJSONObject("bluetooth_info");
            if (optJSONObject5 != null) {
                vuVar.f470100x1 = b(optJSONObject5);
            }
            vuVar.f470103y1 = jSONObject.optString("biz_nickname");
            vuVar.f470105z1 = jSONObject.optString("gift_title");
            vuVar.A1 = jSONObject.optString("brand_icon_url");
            vuVar.C1 = jSONObject.optString("advertise_tinyapp_path");
            vuVar.B1 = jSONObject.optString("advertise_tinyapp_username");
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CardInfoParser", e17, "", new java.lang.Object[0]);
        }
        return vuVar;
    }

    public static r45.w50 l(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardInfoParser", "parserThirdFiled json is null");
            return null;
        }
        r45.w50 w50Var = new r45.w50();
        w50Var.f470411d = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        w50Var.f470413f = jSONObject.optString("aux_title");
        w50Var.f470412e = jSONObject.optString("sub_title");
        w50Var.f470414g = jSONObject.optString("url");
        w50Var.f470415h = jSONObject.optLong("show_flag");
        w50Var.f470416i = jSONObject.optString("primary_color");
        w50Var.f470417m = jSONObject.optString("secondary_color");
        w50Var.f470418n = jSONObject.optString("icon_url");
        w50Var.f470422r = jSONObject.optString("cell_icon_url");
        w50Var.f470423s = jSONObject.optString("cell_link_icon_url");
        w50Var.f470424t = jSONObject.optString("finder_username");
        w50Var.f470425u = jSONObject.optString("cell_cover_url");
        w50Var.f470426v = jSONObject.optString("cell_center_icon_url");
        w50Var.f470427w = jSONObject.optString("feed_id");
        w50Var.f470428x = jSONObject.optString("nonce_id");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("gifting_info");
        if (optJSONObject != null) {
            r45.qt3 qt3Var = new r45.qt3();
            qt3Var.f465787d = kk.v.b(optJSONObject.optString("biz_uin"));
            qt3Var.f465788e = optJSONObject.optString("order_id");
            w50Var.f470419o = qt3Var;
        }
        w50Var.f470420p = jSONObject.optString("app_brand_user_name");
        w50Var.f470421q = jSONObject.optString("app_brand_pass");
        return w50Var;
    }

    public static r45.de0 m(org.json.JSONObject jSONObject) {
        java.lang.String str;
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardInfoParser", "parserDetailStruct json is null");
            return null;
        }
        r45.de0 de0Var = new r45.de0();
        de0Var.f453873d = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        de0Var.f453874e = jSONObject.optString("url");
        de0Var.f453875f = jSONObject.optString("abstract");
        de0Var.f453877h = jSONObject.optString("detail");
        de0Var.f453878i = jSONObject.optString("ad_title");
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("icon_url_list");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardInfoParser", "parserDetailStruct icon_url_list is null");
        } else {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                try {
                    str = optJSONArray.getString(i17);
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CardInfoParser", e17, "", new java.lang.Object[0]);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardInfoParser", "getMessage:" + e17.getMessage());
                    str = "";
                }
                linkedList.add(str);
            }
            de0Var.f453876g = linkedList;
        }
        return de0Var;
    }

    public static r45.ee0 n(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardInfoParser", "parserDetailTable json is null");
            return null;
        }
        r45.ee0 ee0Var = new r45.ee0();
        ee0Var.f454886d = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        ee0Var.f454887e = jSONObject.optString("sub_title");
        ee0Var.f454888f = jSONObject.optInt("show_num", 0);
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("rows");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardInfoParser", "parserDetailTable jsonArray is  null");
        } else {
            try {
                ee0Var.f454889g = e(optJSONArray);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CardInfoParser", e17, "", new java.lang.Object[0]);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardInfoParser", e17.getMessage());
            }
        }
        return ee0Var;
    }

    public static r45.eg0 o(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardInfoParser", "parserDynamicQrCodeInfo json is null");
            return null;
        }
        r45.eg0 eg0Var = new r45.eg0();
        eg0Var.f454959d = jSONObject.optBoolean("is_dynamic");
        eg0Var.f454960e = jSONObject.optBoolean("can_refresh");
        eg0Var.f454961f = jSONObject.optString("refresh_wording");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardInfoParser", "is_dynamic:" + eg0Var.f454959d + "\u3000can_refresh:" + eg0Var.f454960e + "\u3000refresh_wording:" + eg0Var.f454961f);
        return eg0Var;
    }

    public static r45.g43 p(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardInfoParser", "parserFollowBox json is null");
            return null;
        }
        r45.g43 g43Var = new r45.g43();
        g43Var.f456400d = jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24);
        g43Var.f456401e = jSONObject.optInt("follow");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardInfoParser", "follow:" + g43Var.f456401e + "\u3000text:" + g43Var.f456400d);
        return g43Var;
    }

    public static void q(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.p1313x633fb29.C13039x2a59e0bd c13039x2a59e0bd, java.lang.String str) {
        r45.j46 j46Var;
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardInfoParser", "parserShareCardItemJson jsonContent is null");
            return;
        }
        try {
            org.json.JSONObject optJSONObject = new org.json.JSONObject(str).optJSONObject("share_card");
            if (optJSONObject == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardInfoParser", "parserShareCardItemJson json is null");
                return;
            }
            c13039x2a59e0bd.f66675x95970a65 = a(optJSONObject.optString("card_id"));
            c13039x2a59e0bd.f66676xf4648834 = a(optJSONObject.optString("card_tp_id"));
            c13039x2a59e0bd.f66671xf1b7e6de = optJSONObject.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd);
            c13039x2a59e0bd.f66678xfbeb8d9b = optJSONObject.optString("consumer");
            c13039x2a59e0bd.f66685x4e950392 = optJSONObject.optInt("share_time");
            c13039x2a59e0bd.f66689xa783a79b = optJSONObject.optInt("update_time");
            c13039x2a59e0bd.f66687x10a0fed7 = optJSONObject.optInt("state_flag");
            c13039x2a59e0bd.f66688x266f95d1 = optJSONObject.optLong("sequence");
            c13039x2a59e0bd.f66681x7697d746 = optJSONObject.optString("from_user_name");
            c13039x2a59e0bd.f66672xfb71c908 = optJSONObject.optLong("begin_time");
            c13039x2a59e0bd.f66680x849cdd56 = optJSONObject.optInt("end_time");
            org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("card_data_info");
            org.json.JSONObject optJSONObject3 = optJSONObject.optJSONObject("card_tp_info");
            org.json.JSONObject optJSONObject4 = optJSONObject.optJSONObject("share_info");
            c13039x2a59e0bd.Z = h(optJSONObject2);
            c13039x2a59e0bd.Y = k(optJSONObject3);
            if (optJSONObject4 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardInfoParser", "parserShareInfo json is null");
                j46Var = null;
            } else {
                r45.j46 j46Var2 = new r45.j46();
                j46Var2.f459113d = optJSONObject4.optString("gift_msg_title");
                j46Var = j46Var2;
            }
            c13039x2a59e0bd.f176213p0 = j46Var;
            r45.rt rtVar = c13039x2a59e0bd.Z;
            if (rtVar != null) {
                c13039x2a59e0bd.G(rtVar);
            }
            r45.vu vuVar = c13039x2a59e0bd.Y;
            if (vuVar != null) {
                c13039x2a59e0bd.Y = vuVar;
                try {
                    c13039x2a59e0bd.f66674x13503529 = vuVar.mo14344x5f01b1f6();
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareCardInfo", "setCardTpInfo fail, ex = %s", e17.getMessage());
                }
                c13039x2a59e0bd.f66680x849cdd56 = optJSONObject3.optInt("end_time");
                c13039x2a59e0bd.f66672xfb71c908 = optJSONObject3.optInt("begin_time");
            }
            r45.j46 j46Var3 = c13039x2a59e0bd.f176213p0;
            if (j46Var3 != null) {
                c13039x2a59e0bd.f176213p0 = j46Var3;
                try {
                    c13039x2a59e0bd.f66684x7f1b5bf2 = j46Var3.mo14344x5f01b1f6();
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareCardInfo", "setShareInfo fail, ex = %s", e18.getMessage());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ShareCardInfo", e18, "", new java.lang.Object[0]);
                }
            }
            c13039x2a59e0bd.f66683xe9093d2f = (int) (java.lang.System.currentTimeMillis() / 1000);
        } catch (org.json.JSONException e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CardInfoParser", e19, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardInfoParser", e19.getMessage());
        }
    }

    public static r45.bk6 r(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardInfoParser", "parserUseCondition json is null");
            return null;
        }
        r45.bk6 bk6Var = new r45.bk6();
        bk6Var.f452360d = jSONObject.optString("tag");
        bk6Var.f452361e = jSONObject.optString("color");
        return bk6Var;
    }

    public static r45.jv6 s(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardInfoParser", "parserUseCondition json is null");
            return null;
        }
        r45.jv6 jv6Var = new r45.jv6();
        jv6Var.f459671d = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("outer_tag_list");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardInfoParser", "parserUseCondition outer_tag_list is null");
        } else {
            jv6Var.f459672e = new java.util.LinkedList();
            for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                r45.bk6 r17 = r(optJSONArray.optJSONObject(i17));
                if (r17 != null) {
                    jv6Var.f459672e.add(r17);
                }
            }
        }
        org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("inner_tag_list");
        if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardInfoParser", "parserUseCondition inner_tag_list is null");
        } else {
            jv6Var.f459673f = new java.util.LinkedList();
            for (int i18 = 0; i18 < optJSONArray2.length(); i18++) {
                r45.bk6 r18 = r(optJSONArray2.optJSONObject(i18));
                if (r18 != null) {
                    jv6Var.f459673f.add(r18);
                }
            }
        }
        org.json.JSONArray optJSONArray3 = jSONObject.optJSONArray("detail_field");
        if (optJSONArray3 == null || optJSONArray3.length() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardInfoParser", "parserUseCondition detail_field is null");
        } else {
            jv6Var.f459674g = e(optJSONArray3);
        }
        return jv6Var;
    }
}

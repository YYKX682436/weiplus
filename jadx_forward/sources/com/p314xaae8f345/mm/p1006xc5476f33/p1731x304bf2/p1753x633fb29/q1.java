package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

/* loaded from: classes8.dex */
public class q1 {

    /* renamed from: a, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.q1 f221957a;

    public final void a(java.util.Map map, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var) {
        e1Var.f221810c2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.entrance.entrance_red_dot_type"), -1) > -1;
        java.lang.String str = (java.lang.String) map.get(".sysmsg.gamecenter.entrance.entrance_icon_url");
        if (str == null) {
            str = "";
        }
        e1Var.f221812d2.f221944b = str;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) map.get(".sysmsg.gamecenter.msg_bubble_info.bubble_icon_url")) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) map.get(".sysmsg.gamecenter.msg_bubble_info.bubble_desc"))) {
            e1Var.f221813e2 = false;
        } else {
            e1Var.f221813e2 = true;
        }
    }

    public final float b(java.util.List list, float f17, float f18) {
        float f19;
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                f19 = 1.0f;
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.i0) it.next();
            if (i0Var.f221866b <= f17 && i0Var.f221865a > f17) {
                f19 = i0Var.f221867c;
                break;
            }
        }
        return f19 * f18;
    }

    public final java.util.List c(java.lang.String str, java.util.Map map) {
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String str3 = str + ".arg_list";
        int i17 = 0;
        while (true) {
            if (i17 == 0) {
                str2 = str3;
            } else {
                str2 = str3 + i17;
            }
            if (!map.containsKey(str2)) {
                return arrayList;
            }
            i17++;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.i0 i0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.i0();
            i0Var.f221865a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str2 + ".up_bound"), 0);
            i0Var.f221866b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str2 + ".low_bound"), 0);
            i0Var.f221867c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str2 + ".arg_value"), 1);
            arrayList.add(i0Var);
        }
    }

    public final java.util.List d(java.lang.String str, java.util.Map map) {
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        while (true) {
            if (i17 == 0) {
                str2 = str;
            } else {
                str2 = str + i17;
            }
            if (!map.containsKey(str2)) {
                return arrayList;
            }
            i17++;
            java.lang.String str3 = (java.lang.String) map.get(str2 + ".$pkg_id");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                arrayList.add(str3);
            }
        }
    }

    public final void e(java.util.Map map, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.o0 o0Var = e1Var.G2;
        java.lang.String str = (java.lang.String) map.get(".sysmsg.gamecenter.banner.$banner_id");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        o0Var.f221922a = str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.o0 o0Var2 = e1Var.G2;
        ((java.util.ArrayList) o0Var2.f221923b).clear();
        ((java.util.ArrayList) o0Var2.f221923b).addAll(d(".sysmsg.gamecenter.banner.load_with_wepkg.wepkg", map));
    }

    public final void f(java.util.Map map, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var) {
        e1Var.f221812d2.f221943a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.entrance.entrance_red_dot_type"), -1);
        java.lang.String str = (java.lang.String) map.get(".sysmsg.gamecenter.entrance.entrance_icon_url");
        if (str == null) {
            str = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.q0 q0Var = e1Var.f221812d2;
        q0Var.f221944b = str;
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.gamecenter.entrance.entrance_text");
        if (str2 == null) {
            str2 = "";
        }
        q0Var.f221945c = str2;
        java.lang.String str3 = (java.lang.String) map.get(".sysmsg.gamecenter.entrance.jump_liveinfo_json");
        if (str3 == null) {
            str3 = "";
        }
        q0Var.f221948f = str3;
        java.lang.String str4 = (java.lang.String) map.get(".sysmsg.gamecenter.entrance.click_open_url");
        if (str4 == null) {
            str4 = "";
        }
        q0Var.f221949g = str4;
        boolean z17 = false;
        q0Var.f221950h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.entrance.click_open_type"), 0);
        q0Var.f221951i = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.entrance.icon_type"), 2);
        java.lang.String str5 = (java.lang.String) map.get(".sysmsg.gamecenter.entrance.colored_text");
        if (str5 == null) {
            str5 = "";
        }
        q0Var.f221946d = str5;
        java.lang.String str6 = (java.lang.String) map.get(".sysmsg.gamecenter.entrance.outer_colored_text");
        if (str6 == null) {
            str6 = "";
        }
        q0Var.f221947e = str6;
        q0Var.f221952j = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.entrance.entrance_icon_width"), 0) / 2;
        q0Var.f221953k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.entrance.entrance_icon_height"), 0) / 2;
        q0Var.f221954l = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.entrance.entrance_icon_rounded_corner"), 0) == 1;
        q0Var.f221955m = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.entrance.entrance_show_control.basic_type"), -1);
        q0Var.f221956n = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.entrance.entrance_show_control.ignore_local_control"), 0) == 1;
        try {
            z17 = new org.json.JSONObject(((kj0.i) ((kj0.l) i95.n0.c(kj0.l.class))).Ai(e42.d0.clicfg_game_center_friends_ui_reddot_special_android, "")).optBoolean("gamecenter");
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GameABConfig", e17.getMessage());
        }
        if (!z17 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(q0Var.f221947e)) {
            return;
        }
        q0Var.f221943a = 6;
    }

    public final void g(java.util.Map map, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.l0 l0Var = e1Var.N2;
        java.lang.String str = (java.lang.String) map.get(".sysmsg.gamecenter.extra_data.preload");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        l0Var.f221889a = u46.k.g(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.l0 l0Var2 = e1Var.N2;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l0Var2.f221889a) || l0Var2.f221889a.getBytes().length <= 204800) {
            return;
        }
        l0Var2.f221889a = "";
    }

    public final void h(java.util.Map map, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.h0 h0Var = e1Var.f221824p2;
        java.lang.String str = (java.lang.String) map.get(".sysmsg.gamecenter.float_layer.open_url");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        h0Var.f221856a = str;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.float_layer.full_screen"), 0) == 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.h0 h0Var2 = e1Var.f221824p2;
        h0Var2.f221857b = z18;
        h0Var2.f221858c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.float_layer.orientation"), 0);
        h0Var2.f221859d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.float_layer.is_transparent"), 0) == 1;
        ((java.util.ArrayList) h0Var2.f221860e).clear();
        ((java.util.ArrayList) h0Var2.f221860e).addAll(d(".sysmsg.gamecenter.float_layer.load_with_wepkg.wepkg", map));
    }

    public final void i(java.util.Map map, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var) {
        e1Var.L2.f221903a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.gamelife.replace_notice"), 0) == 1;
        java.lang.Object obj = map.get(".sysmsg.gamecenter.gamelife.chatmsg");
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.n0 n0Var = e1Var.L2;
        if (obj != null) {
            n0Var.getClass();
        } else {
            n0Var.getClass();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.g0 g0Var = n0Var.f221904b;
        java.lang.String str = (java.lang.String) map.get(".sysmsg.gamecenter.gamelife.chatroom.top_chatroom_name");
        if (str == null) {
            str = "";
        }
        g0Var.f221849a = str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.g0 g0Var2 = n0Var.f221904b;
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.gamecenter.gamelife.chatroom.entrance_open_chatroom_name");
        g0Var2.f221850b = str2 != null ? str2 : "";
    }

    public final void j(java.util.Map map, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.y0 y0Var = e1Var.M2;
        java.lang.String str = (java.lang.String) map.get(".sysmsg.gamecenter.tab_info.default_key");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        y0Var.f222056a = str;
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.gamecenter.tab_info.red_dot.key");
        java.lang.String str3 = str2 != null ? str2 : "";
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.y0 y0Var2 = e1Var.M2;
        y0Var2.f222057b = str3;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y0Var2.f222057b)) {
            return;
        }
        y0Var2.f222058c = e1Var.f68454xac3be4e + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) map.get(".sysmsg.gamecenter.tab_info.red_dot.expire_time"), 86400L);
    }

    public final void k(java.util.Map map, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.z0 z0Var = e1Var.K2;
        java.lang.String str = (java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.$jump_id");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        z0Var.f222076a = str;
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.show_type"), 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.z0 z0Var2 = e1Var.K2;
        z0Var2.f222077b = P;
        z0Var2.f222078c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.not_in_msg_center"), 0);
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.msg_sender.sender_icon");
        if (str2 == null) {
            str2 = "";
        }
        z0Var2.f222079d = str2;
        java.lang.String str3 = (java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.msg_sender.sender_name");
        if (str3 == null) {
            str3 = "";
        }
        z0Var2.f222080e = str3;
        java.lang.String str4 = (java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.msg_sender.$jump_id");
        if (str4 == null) {
            str4 = "";
        }
        z0Var2.f222081f = str4;
        java.lang.String str5 = (java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.msg_sender.remark");
        if (str5 == null) {
            str5 = "";
        }
        z0Var2.f222082g = str5;
        z0Var2.f222083h.f221760a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.msg_sender.remark_style.remark_type"), 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b1 b1Var = z0Var2.f222083h;
        java.lang.String str6 = (java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.msg_sender.remark_style.text_color");
        if (str6 == null) {
            str6 = "";
        }
        b1Var.f221761b = str6;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b1 b1Var2 = z0Var2.f222083h;
        java.lang.String str7 = (java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.msg_sender.remark_style.background_color");
        if (str7 == null) {
            str7 = "";
        }
        b1Var2.f221762c = str7;
        java.lang.String str8 = (java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.notify_msg_content.content_pic");
        if (str8 == null) {
            str8 = "";
        }
        z0Var2.f222084i = str8;
        java.lang.String str9 = (java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.notify_msg_content.first_line_text");
        if (str9 == null) {
            str9 = "";
        }
        z0Var2.f222085j = str9;
        java.lang.String str10 = (java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.notify_msg_content.second_line_text");
        if (str10 == null) {
            str10 = "";
        }
        z0Var2.f222086k = str10;
        java.lang.String str11 = (java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.interactive_msg_content.merge_id");
        if (str11 == null) {
            str11 = "";
        }
        z0Var2.f222087l = str11;
        z0Var2.f222088m = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.interactive_msg_content.merge_count"), 0);
        java.lang.String str12 = (java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.interactive_msg_content.body_text");
        if (str12 == null) {
            str12 = "";
        }
        z0Var2.f222089n = str12;
        java.lang.String str13 = (java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.interactive_msg_content.action_desc");
        if (str13 == null) {
            str13 = "";
        }
        z0Var2.f222095t = str13;
        java.lang.String str14 = (java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.interactive_msg_content.action_text");
        if (str14 == null) {
            str14 = "";
        }
        z0Var2.f222096u = str14;
        java.lang.String str15 = (java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.interactive_msg_content.quick_response_content_id");
        if (str15 == null) {
            str15 = "";
        }
        z0Var2.f222098w = str15;
        java.lang.String str16 = (java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.interactive_msg_content.quota_text");
        if (str16 == null) {
            str16 = "";
        }
        z0Var2.f222097v = str16;
        z0Var2.f222099x = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.interactive_msg_content.support_quick_response_flag"), 0);
        java.lang.String str17 = (java.lang.String) map.get(".sysmsg.gamecenter.msg_center.second_line.second_line_content");
        if (str17 == null) {
            str17 = "";
        }
        z0Var2.f222090o = str17;
        java.lang.String str18 = (java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.interactive_msg_content.right_pic");
        if (str18 == null) {
            str18 = "";
        }
        z0Var2.f222091p = str18;
        java.lang.String str19 = (java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.interactive_msg_content.right_text");
        if (str19 == null) {
            str19 = "";
        }
        z0Var2.f222092q = str19;
        java.lang.String str20 = (java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.interactive_msg_content.source_name");
        if (str20 == null) {
            str20 = "";
        }
        z0Var2.f222093r = str20;
        java.lang.String str21 = (java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.interactive_msg_content.related_id");
        if (str21 == null) {
            str21 = "";
        }
        z0Var2.f222094s = str21;
        java.lang.String str22 = (java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.interactive_msg_content.$merge_jump_id");
        if (str22 == null) {
            str22 = "";
        }
        z0Var2.f222101z = str22;
        java.lang.String str23 = (java.lang.String) map.get(".sysmsg.gamecenter.msg_center_v2.interactive_msg_content.$comment_jump_id");
        z0Var2.f222100y = str23 != null ? str23 : "";
    }

    public final void l(java.util.Map map, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var) {
        if (e1Var == null || map == null) {
            return;
        }
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.exposure_strategy.exposure_count"), 4);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.k0 k0Var = e1Var.O2;
        k0Var.f221880a = P;
        ((java.util.ArrayList) k0Var.f221881b.f221876a).clear();
        ((java.util.ArrayList) k0Var.f221881b.f221876a).addAll(c(".sysmsg.gamecenter.exposure_strategy.wifi_strategy", map));
        k0Var.f221881b.f221877b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.exposure_strategy.wifi_strategy.enabled"), 0) == 1;
        ((java.util.ArrayList) k0Var.f221882c.f221876a).clear();
        ((java.util.ArrayList) k0Var.f221882c.f221876a).addAll(c(".sysmsg.gamecenter.exposure_strategy.expire_time_strategy", map));
        k0Var.f221882c.f221877b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.exposure_strategy.expire_time_strategy.enabled"), 0) == 1;
        ((java.util.ArrayList) k0Var.f221883d.f221876a).clear();
        ((java.util.ArrayList) k0Var.f221883d.f221876a).addAll(c(".sysmsg.gamecenter.exposure_strategy.battery_strategy", map));
        k0Var.f221883d.f221877b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.exposure_strategy.battery_strategy.enabled"), 0) == 1;
        java.util.List list = e1Var.P2;
        ((java.util.ArrayList) list).clear();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        while (true) {
            java.lang.String str = ".sysmsg.gamecenter.exposure_strategy.history_message_list";
            if (i17 != 0) {
                str = ".sysmsg.gamecenter.exposure_strategy.history_message_list" + i17;
            }
            if (!map.containsKey(str)) {
                break;
            }
            i17++;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.m0 m0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.m0();
            java.lang.String str2 = (java.lang.String) map.get(str + ".msg_id");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str2 == null) {
                str2 = "";
            }
            m0Var.f221898a = str2;
            m0Var.f221899b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L((java.lang.String) map.get(str + ".click_score"), 0.5f);
            arrayList.add(m0Var);
        }
        ((java.util.ArrayList) list).addAll(arrayList);
        float f17 = e1Var.f68451x8a27f24f;
        if (k0Var.f221881b.f221877b) {
            f17 = b(k0Var.f221881b.f221876a, com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? 1.0f : 0.0f, f17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.j0 j0Var = k0Var.f221883d;
        if (j0Var.f221877b) {
            f17 = b(j0Var.f221876a, ph.t.k().c().b(), f17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.j0 j0Var2 = k0Var.f221882c;
        if (j0Var2.f221877b) {
            f17 = b(j0Var2.f221876a, ((float) (e1Var.f68456x876650f1 - com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1())) / 3600.0f, f17);
        }
        e1Var.X2 = f17;
        e1Var.Y2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.exposure_strategy.ignore_exceed_exposure"), 0) == 1;
    }

    public final void m(java.util.Map map, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.x0 x0Var = e1Var.Q2;
        if (x0Var == null) {
            return;
        }
        java.lang.String str = (java.lang.String) map.get(".sysmsg.gamecenter.verify_info.signature");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        x0Var.f222044a = str;
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.gamecenter.verify_info.nonce");
        if (str2 == null) {
            str2 = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.x0 x0Var2 = e1Var.Q2;
        x0Var2.f222045b = str2;
        java.lang.String str3 = (java.lang.String) map.get(".sysmsg.gamecenter.verify_info.timestamp");
        x0Var2.f222046c = str3 != null ? str3 : "";
        x0Var2.f222047d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.verify_info.version"), 0);
    }

    public final void n(java.util.Map map, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var) {
        e1Var.S2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.report.msg_subtype"), 0);
        java.lang.String str = (java.lang.String) map.get(".sysmsg.gamecenter.report.noticeid");
        if (str == null) {
            str = "";
        }
        e1Var.T2 = str;
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.gamecenter.report.ext_data");
        if (str2 == null) {
            str2 = "";
        }
        e1Var.U2 = str2;
        java.lang.String str3 = (java.lang.String) map.get(".sysmsg.gamecenter.report.business_data");
        if (str3 == null) {
            str3 = "";
        }
        e1Var.V2 = str3;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e1Var.U2)) {
            return;
        }
        try {
            e1Var.f68453x825a2e6f = new org.json.JSONObject(e1Var.U2).optString("content_id", "");
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GameNewMessageParser", e17, "gamelog.srv_msg, parser, parseReportInfo, gameMsgId:%s", e1Var.f68458xd54c6aa5);
        }
    }
}

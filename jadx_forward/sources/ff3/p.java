package ff3;

/* loaded from: classes9.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f343185d;

    public p(ff3.q qVar, java.lang.String str) {
        this.f343185d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Map d17;
        java.util.Map map;
        java.util.Iterator it;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.util.Map map2;
        java.util.Iterator it6;
        java.lang.String str5;
        java.lang.String str6;
        bt4.f.b().getClass();
        java.lang.String str7 = this.f343185d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str7) || (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str7, "sysmsg", null)) == null) {
            return;
        }
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.paymsg.PayMsgType"), -1);
        if (P == 31) {
            java.lang.String str8 = (java.lang.String) d17.get(".sysmsg.paymsg.WalletRedDotWording");
            int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.paymsg.WalletRedDot"), -1);
            int P3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.paymsg.BalanceRedDot"), -1);
            int P4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.paymsg.LQTRedDot"), -1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallNewsManager", "walletEntryWording: %s, balanceRedDot: %s, lqtRedDot: %s", str8, java.lang.Integer.valueOf(P3), java.lang.Integer.valueOf(P4));
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LQT_WALLET_RED_DOT_WORDING_STRING, str8);
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LQT_WALLET_RED_DOT_INT, java.lang.Integer.valueOf(P2));
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LQT_BALANCE_RED_DOT_INT, java.lang.Integer.valueOf(P3));
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LQT_LINK_RED_DOT_INT, java.lang.Integer.valueOf(P4));
            bt4.f.a();
            return;
        }
        java.lang.String str9 = "%s_expiretime";
        java.lang.String str10 = "put redDotConfig json failed: %s";
        java.lang.String str11 = ".$expire_time";
        java.lang.String str12 = ".$wording";
        java.lang.String str13 = ".sysmsg.paymsg.reddot.item";
        if (P == 34) {
            java.util.Set keySet = d17.keySet();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallNewsManager", "receive menu ui reddot msg: %s, keys: %s", str7, keySet.toString());
            if (keySet.size() > 0) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                java.util.Iterator it7 = keySet.iterator();
                while (it7.hasNext()) {
                    java.lang.String str14 = (java.lang.String) it7.next();
                    if (str14.startsWith(".sysmsg.paymsg.reddot.item")) {
                        java.lang.String str15 = (java.lang.String) d17.get(str14);
                        java.lang.String concat = str14.concat(str12);
                        java.lang.String concat2 = str14.concat(str11);
                        java.lang.String str16 = (java.lang.String) d17.get(concat);
                        str5 = str11;
                        str6 = str12;
                        map2 = d17;
                        it6 = it7;
                        long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) d17.get(concat2), 0L) * 1000;
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str15)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallNewsManager", "mall menu ui, %s has reddot, wording: %s, expireTime: %s", str15, str16, java.lang.Long.valueOf(V));
                            if ("mainentry_me".equals(str15)) {
                                gm0.j1.i();
                                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_MY_ENTRY_TAB_REDDOT_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
                                if (V > 0) {
                                    gm0.j1.i();
                                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_MY_ENTRY_TAB_REDDOT_EXPIRETIME_LONG_SYNC, java.lang.Long.valueOf(V));
                                }
                            } else if ("entry_wxpay_wallet".equals(str15)) {
                                gm0.j1.i();
                                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_MY_ENTRY_REDDOT_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
                                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str16)) {
                                    gm0.j1.i();
                                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_ENTRY_WORDING_STRING_SYNC, "");
                                } else {
                                    gm0.j1.i();
                                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_ENTRY_WORDING_STRING_SYNC, str16);
                                }
                                if (V > 0) {
                                    gm0.j1.i();
                                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_MY_ENTRY_REDDOT_EXPIRETIME_LONG_SYNC, java.lang.Long.valueOf(V));
                                }
                            } else if ("entry_wxpay_paycenter".equals(str15)) {
                                gm0.j1.i();
                                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_MALL_MENU_UI_REDDOT_CONFIG_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
                                if (V > 0) {
                                    gm0.j1.i();
                                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_MALL_MENU_UI_REDDOT_CONFIG_EXPIRETIME_LONG_SYNC, java.lang.Long.valueOf(V));
                                }
                            } else {
                                try {
                                    jSONObject.put(str15, 1);
                                    if (V > 0) {
                                        jSONObject.put(java.lang.String.format("%s_expiretime", str15), V);
                                    }
                                } catch (java.lang.Exception e17) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MallNewsManager", e17, "put redDotConfig json failed: %s", e17.getMessage());
                                }
                            }
                        }
                    } else {
                        map2 = d17;
                        it6 = it7;
                        str5 = str11;
                        str6 = str12;
                    }
                    it7 = it6;
                    str11 = str5;
                    str12 = str6;
                    d17 = map2;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallNewsManager", "redDotConfig: %s", jSONObject.toString());
                if (jSONObject.length() > 0) {
                    gm0.j1.i();
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_MENU_UI_REDDOT_CONFIG_STRING_SYNC, jSONObject.toString());
                    gm0.j1.i();
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_MALL_MENU_UI_REDDOT_CONFIG_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
                    return;
                }
                return;
            }
            return;
        }
        java.lang.String str17 = ".$expire_time";
        if (P == 36) {
            java.lang.String str18 = (java.lang.String) d17.get(".sysmsg.paymsg.WalletRedDotWording");
            int P5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.paymsg.WalletRedDot"), -1);
            int P6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.paymsg.LQBRedDot"), -1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallNewsManager", "walletEntryWording: %s, walletRedDot: %s, lqbRedDot: %s", str18, java.lang.Integer.valueOf(P5), java.lang.Integer.valueOf(P6));
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LQT_WALLET_RED_DOT_WORDING_STRING, str18);
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LQT_WALLET_RED_DOT_INT, java.lang.Integer.valueOf(P5));
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LQB_MALL_ENTRY_RED_DOT_INT, java.lang.Integer.valueOf(P6));
            bt4.f.a();
            return;
        }
        java.util.Map map3 = d17;
        if (P == 38) {
            java.util.Set keySet2 = map3.keySet();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallNewsManager", "receive menu ui reddot msg: %s, keys: %s", str7, keySet2.toString());
            if (keySet2.size() > 0) {
                int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, -1)).intValue();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallNewsManager", "offline shorcut walletRegion : %s", java.lang.Integer.valueOf(intValue));
                if (intValue == 0 || intValue == 1) {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    java.util.Iterator it8 = keySet2.iterator();
                    boolean z17 = false;
                    boolean z18 = false;
                    while (it8.hasNext()) {
                        java.lang.String str19 = (java.lang.String) it8.next();
                        if (str19.startsWith(str13)) {
                            it = it8;
                            if (str19.substring(str19.lastIndexOf(46)).startsWith(".item")) {
                                java.lang.String str20 = (java.lang.String) map3.get(str19);
                                str = str13;
                                java.lang.String concat3 = str19.concat(".$wording");
                                str4 = str17;
                                java.lang.String concat4 = str19.concat(str4);
                                java.lang.String str21 = (java.lang.String) map3.get(concat3);
                                java.lang.String str22 = str9;
                                java.lang.String str23 = str10;
                                long V2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) map3.get(concat4), 0L) * 1000;
                                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str20)) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallNewsManager", "mall menu ui, %s has reddot, wording: %s, expireTime: %s", str20, str21, java.lang.Long.valueOf(V2));
                                    if ("mainentry_me".equals(str20)) {
                                        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
                                        bk0.a.g().q(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_New_MY_ENTRY_TAB_REDDOT_STRING_SYNC, true);
                                        gm0.j1.i();
                                        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_New_MY_ENTRY_TAB_REDDOT_EXPIRETIME_LONG_SYNC, java.lang.Long.valueOf(V2));
                                        z18 = true;
                                    } else if ("entry_wxpay_pay".equals(str20)) {
                                        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
                                        bk0.a.g().q(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_New_MY_ENTRY_TAB_REDDOT_STRING_SYNC, true);
                                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str21)) {
                                            gm0.j1.i();
                                            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_New_MY_ENTRY_WORDING_STRING_SYNC, "");
                                        } else {
                                            gm0.j1.i();
                                            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_New_MY_ENTRY_WORDING_STRING_SYNC, str21);
                                        }
                                        gm0.j1.i();
                                        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_New_MY_ENTRY_REDDOT_EXPIRETIME_LONG_SYNC, java.lang.Long.valueOf(V2));
                                        z17 = true;
                                    } else if ("entry_wxpay_pay_wallet".equals(str20)) {
                                        gm0.j1.i();
                                        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_New_MALL_UI_REDDOT_CONFIG_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
                                        gm0.j1.i();
                                        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_New_MALL_UI_REDDOT_CONFIG_EXPIRETIME_LONG_SYNC, java.lang.Long.valueOf(V2));
                                    } else if (str20.startsWith("bind_serial_")) {
                                        java.lang.String substring = str20.substring(12);
                                        gm0.j1.i();
                                        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
                                        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_BANKCARD_SERIAL_STRING_SYNC;
                                        java.lang.String str24 = (java.lang.String) c17.m(u3Var, "");
                                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str24)) {
                                            substring = str24 + "," + substring;
                                        }
                                        gm0.j1.i();
                                        gm0.j1.u().c().x(u3Var, substring);
                                    } else {
                                        try {
                                            jSONObject2.put(str20, 1);
                                            map = map3;
                                            str2 = str22;
                                        } catch (java.lang.Exception e18) {
                                            e = e18;
                                            map = map3;
                                            str2 = str22;
                                        }
                                        try {
                                            jSONObject2.put(java.lang.String.format(str2, str20), V2);
                                            jSONObject2.put(java.lang.String.format("%s_wording", str20), str21);
                                            str3 = str23;
                                        } catch (java.lang.Exception e19) {
                                            e = e19;
                                            str3 = str23;
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MallNewsManager", e, str3, e.getMessage());
                                            str9 = str2;
                                            str17 = str4;
                                            str10 = str3;
                                            it8 = it;
                                            map3 = map;
                                            str13 = str;
                                        }
                                        str9 = str2;
                                        str17 = str4;
                                        str10 = str3;
                                        it8 = it;
                                        map3 = map;
                                        str13 = str;
                                    }
                                }
                                map = map3;
                                str2 = str22;
                                str3 = str23;
                                str9 = str2;
                                str17 = str4;
                                str10 = str3;
                                it8 = it;
                                map3 = map;
                                str13 = str;
                            } else {
                                map = map3;
                            }
                        } else {
                            map = map3;
                            it = it8;
                        }
                        str = str13;
                        str2 = str9;
                        str3 = str10;
                        str4 = str17;
                        str9 = str2;
                        str17 = str4;
                        str10 = str3;
                        it8 = it;
                        map3 = map;
                        str13 = str;
                    }
                    if (!z18) {
                        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
                        bk0.a.g().j(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_New_MY_ENTRY_TAB_REDDOT_STRING_SYNC, com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_NEW_BANDAGE_WATCHER_ME_TAB_STRING_SYNC);
                    }
                    if (!z17) {
                        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
                        bk0.a.g().j(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_New_MY_ENTRY_TAB_REDDOT_STRING_SYNC, com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_NEW_BANDAGE_WATCHER_PAY_ENTRANCE_STRING_SYNC);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallNewsManager", "redDotConfig: %s", jSONObject2.toString());
                    if (jSONObject2.length() > 0) {
                        gm0.j1.i();
                        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_New_MALL_UI_ITEM_REDDOT_CONFIG_STRING_SYNC, jSONObject2.toString());
                    }
                }
            }
        }
    }
}

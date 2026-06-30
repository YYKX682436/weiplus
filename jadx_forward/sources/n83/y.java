package n83;

/* loaded from: classes8.dex */
public class y implements c01.yc {
    @Override // c01.yc
    public void O0(com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        int i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeChatOutListener", "WeChatOut onRecieveMsg");
        java.lang.String g17 = x51.j1.g(p0Var.f152259a.f459094h);
        if (g17 == null || g17.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WeChatOutListener", "WeChatOut onReceiveMsg, msgContent is null");
            return;
        }
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(g17, "sysmsg", null);
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WeChatOutListener", "WeChatOut onReceiveMsg, values is null");
            return;
        }
        if (d17.containsKey(".sysmsg.WeChatOut.AccountRedDotType")) {
            i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.WeChatOut.AccountRedDotType"), -1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeChatOutListener", "WeChatOut AccountRedDotType: %d", java.lang.Integer.valueOf(i17));
            c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERFINO_IPCALL_ADDRESS_ACCOUNT_SHOW_REDDOT_TYPE_INT, java.lang.Integer.valueOf(i17));
        } else {
            i17 = -1;
        }
        if (d17.containsKey(".sysmsg.WeChatOut.AcctRD")) {
            int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.WeChatOut.AcctRD"), 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeChatOutListener", "WeChatOut AcctRD: %d", java.lang.Integer.valueOf(P));
            if (P != 0) {
                c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_IPCALL_ADDRESS_ACCOUNT_SHOW_REDDOT_BOOLEAN, java.lang.Boolean.TRUE);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13254, 2, 0, 0, java.lang.Integer.valueOf(i17), -1, -1);
            } else {
                c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_IPCALL_ADDRESS_ACCOUNT_SHOW_REDDOT_BOOLEAN, java.lang.Boolean.FALSE);
            }
        }
        if (d17.containsKey(".sysmsg.WeChatOut.TabRD")) {
            int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.WeChatOut.TabRD"), 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeChatOutListener", "WeChatOut TabRD: %d", java.lang.Integer.valueOf(P2));
            if (P2 != 0) {
                c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERFINO_IPCALL_HAS_ENTRY_FIND_REDDOT_NEWXML_BOOLEAN, java.lang.Boolean.TRUE);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13254, 1, 0, 0, -1, -1, -1);
            } else {
                c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERFINO_IPCALL_HAS_ENTRY_FIND_REDDOT_NEWXML_BOOLEAN, java.lang.Boolean.FALSE);
            }
        }
        if (d17.containsKey(".sysmsg.WeChatOut.RechargeRD")) {
            int P3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.WeChatOut.RechargeRD"), 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeChatOutListener", "WeChatOut RechargeRD: %d", java.lang.Integer.valueOf(P3));
            if (P3 != 0) {
                c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_IPCALL_RECHARGE_SHOW_REDDOT_BOOLEAN, java.lang.Boolean.TRUE);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13254, 3, 0, 0, -1, -1, -1);
            } else {
                c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_IPCALL_RECHARGE_SHOW_REDDOT_BOOLEAN, java.lang.Boolean.FALSE);
            }
        }
        if (d17.containsKey(".sysmsg.WeChatOut.RechargeWording")) {
            java.lang.String str = (java.lang.String) d17.get(".sysmsg.WeChatOut.RechargeWording");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeChatOutListener", "WeChatOut RechargeWording: %s", str);
            c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERFINO_IPCALL_RECHARGE_STRING, str);
        }
        if (d17.containsKey(".sysmsg.WeChatOut.PackagePurchaseWording")) {
            java.lang.String str2 = (java.lang.String) d17.get(".sysmsg.WeChatOut.PackagePurchaseWording");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeChatOutListener", "WeChatOut PackagePurchaseWording: %s", str2);
            c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_IPCALL_PACKAGE_PURCHASE_STRING, str2);
        }
        if (d17.containsKey(".sysmsg.WeChatOut.AccountWording")) {
            java.lang.String str3 = (java.lang.String) d17.get(".sysmsg.WeChatOut.AccountWording");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeChatOutListener", "WeChatOut AccountWording: %s", str3);
            c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERFINO_IPCALL_ADDRESS_ACCOUNT_STRING, str3);
        }
        if (d17.containsKey(".sysmsg.WeChatOut.RechargeWordingVersion")) {
            int P4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.WeChatOut.RechargeWordingVersion"), 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeChatOutListener", "WeChatOut RechargeWordingVersion: %d", java.lang.Integer.valueOf(P4));
            c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERFINO_IPCALL_REDDOT_RECHARGE_VERSION_INT, java.lang.Integer.valueOf(P4));
        }
        if (d17.containsKey(".sysmsg.WeChatOut.TabWording")) {
            java.lang.String str4 = (java.lang.String) d17.get(".sysmsg.WeChatOut.TabWording");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeChatOutListener", "WeChatOut TabWording: %s", str4);
            c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERFINO_IPCALL_HAS_ENTRY_FIND_WORDING_STRING, str4);
        }
        if (d17.containsKey(".sysmsg.WeChatOut.AccountActivityWording")) {
            java.lang.String str5 = (java.lang.String) d17.get(".sysmsg.WeChatOut.AccountActivityWording");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeChatOutListener", "WeChatOut AccountActivityWording: %s", str5);
            c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERFINO_IPCALL_ADDRESS_ACCOUNT_ACTIVITY_STRING, str5);
        }
        if (d17.containsKey(".sysmsg.WeChatOut.AccountActivityWordingClearType")) {
            int P5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.WeChatOut.AccountActivityWordingClearType"), 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeChatOutListener", "WeChatOut AccountActivityWordingClearType : %d", java.lang.Integer.valueOf(P5));
            c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_IPCALL_ADDRESS_ACCOUNT_ACTIVITY_CLEAR_TYPE_INT, java.lang.Integer.valueOf(P5));
        }
        if (d17.containsKey(".sysmsg.WeChatOut.AccountActivityWordingVersion")) {
            int P6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.WeChatOut.AccountActivityWordingVersion"), 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeChatOutListener", "WeChatOut AccountActivityWordingVersion: %d", java.lang.Integer.valueOf(P6));
            c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_IPCALL_ADDRESS_ACCOUNT_ACTIVITY_TYPE_VERSION_INT, java.lang.Integer.valueOf(P6));
        }
        if (d17.containsKey(".sysmsg.WeChatOut.TabRedDotType")) {
            int P7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.WeChatOut.TabRedDotType"), 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeChatOutListener", "WeChatOut TabRedDotType: %d", java.lang.Integer.valueOf(P7));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13254, 0, 0, 0, -1, -1, java.lang.Integer.valueOf(P7));
            c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERFINO_IPCALL_HAS_ENTRY_FIND_REDDOT_TYPE_INT, java.lang.Integer.valueOf(P7));
        }
        int indexOf = g17.indexOf("<ActivityInfo>");
        int indexOf2 = g17.indexOf("</ActivityInfo>");
        if (indexOf > 0 && indexOf2 > 0 && indexOf2 > indexOf) {
            java.lang.String substring = g17.substring(indexOf, indexOf2 + 15);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeChatOutListener", "WeChatOut ActivityInfo: %s", substring);
            s83.a a17 = s83.a.a(substring);
            if (a17 != null && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17.f486394a) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17.f486395b)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeChatOutListener", "clear activity");
                c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERFINO_IPCALL_HAS_ACTIVITY_BOOLEAN, java.lang.Boolean.FALSE);
                c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERFINO_IPCALL_ACTIVITY_STRING, "");
            } else if (a17 != null) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17.f486396c)) {
                    ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Ai(a17.f486396c, null);
                }
                c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERFINO_IPCALL_HAS_ACTIVITY_BOOLEAN, java.lang.Boolean.TRUE);
                c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERFINO_IPCALL_ACTIVITY_STRING, substring);
            }
        }
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5645xbd38c0().e();
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6186x35b2dd7b().e();
    }

    @Override // c01.yc
    public void g1(com.p314xaae8f345.mm.p944x882e457a.r0 r0Var) {
    }
}

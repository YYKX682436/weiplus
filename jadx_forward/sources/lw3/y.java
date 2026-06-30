package lw3;

/* loaded from: classes9.dex */
public class y implements c01.yc {
    @Override // c01.yc
    public void O0(com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        java.lang.String h17;
        rw3.c y07;
        rw3.a aVar;
        long j17;
        kw3.p Ai = kw3.p.Ai();
        Ai.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreRemittance", "hy: received AddMsg");
        r45.j4 j4Var = p0Var.f152259a;
        if (j4Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubCoreRemittance", "recieve a null msg");
            return;
        }
        java.lang.String g17 = x51.j1.g(j4Var.f459094h);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubCoreRemittance", "msg illegal,content is null");
            return;
        }
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(g17, "sysmsg", null);
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubCoreRemittance", "Resolve msg error");
            return;
        }
        java.lang.String str = (java.lang.String) d17.get(".sysmsg.paymsg.PayMsgType");
        boolean z17 = false;
        if (java.lang.String.valueOf(15).equals(str)) {
            java.lang.String decode = java.net.URLDecoder.decode((java.lang.String) d17.get(".sysmsg.paymsg.appmsgcontent"));
            if (android.text.TextUtils.isEmpty(decode)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubCoreRemittance", "appmsgcontent is null");
                return;
            }
            java.util.Map d18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(decode, "msg", null);
            if (d18 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubCoreRemittance", "Resolve appmsgcontent error");
                return;
            }
            java.lang.String str2 = (java.lang.String) d18.get(".msg.appmsg.wcpayinfo.transferid");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubCoreRemittance", "paymsgid is null");
                return;
            }
            java.lang.String str3 = (java.lang.String) d17.get(".sysmsg.paymsg.msgsvrid");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubCoreRemittance", "remittance msgSvrId is illegal");
                j17 = 0;
            } else {
                j17 = java.lang.Long.parseLong(str3);
                if (j17 <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubCoreRemittance", "remittance msgSvrId is illegal");
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.t1 Di = Ai.Di();
            synchronized (Di.f238557a) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    z17 = ((java.util.ArrayList) Di.b()).contains(str2);
                }
            }
            if (z17) {
                Ai.Zi(str2, j17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubCoreRemittance", "it is a duplicate msg");
                return;
            }
            java.lang.String str4 = (java.lang.String) d17.get(".sysmsg.paymsg.tousername");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(decode) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubCoreRemittance", "onRecieveMsg get a illegal msg,which content or toUserName is null");
                return;
            }
            com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
            m27539xaf65a0fc.mo27566xe4673800("notifyType", "WPHKReceivePaySuccMsg");
            m27539xaf65a0fc.mo27566xe4673800("biz_id", str2);
            ((h45.q) i95.n0.c(h45.q.class)).mo24783x40cf7c9f(m27539xaf65a0fc);
            Ai.Di().c(str2, decode, str4, (java.lang.String) d17.get("msg.appmsg.wcpayinfo.receiver_username"));
            if (j17 > 0) {
                Ai.Zi(str2, j17);
                return;
            }
            return;
        }
        if (java.lang.String.valueOf(22).equals(str)) {
            java.lang.String str5 = (java.lang.String) d17.get(".sysmsg.paymsg.tousername");
            java.lang.String str6 = (java.lang.String) d17.get(".sysmsg.paymsg.fromusername");
            try {
                java.lang.String decode2 = java.net.URLDecoder.decode((java.lang.String) d17.get(".sysmsg.paymsg.appmsgcontent"), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(decode2)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubCoreRemittance", "appmsgcontent is null");
                    return;
                }
                java.util.Map d19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(decode2, "msg", null);
                if (d19 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubCoreRemittance", "Resolve appmsgcontent error");
                    return;
                }
                java.lang.String str7 = (java.lang.String) d19.get(".msg.appmsg.wcpayinfo.transferid");
                int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d19.get(".msg.appmsg.wcpayinfo.paysubtype"), -1);
                java.lang.String str8 = (java.lang.String) d19.get(".msg.appmsg.wcpayinfo.receiver_name");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreRemittance", "receive delay transfer newxml, fromusername: %s, tousername: %s, transferId: %s, paysubtype: %d", str6, str5, str7, java.lang.Integer.valueOf(P));
                try {
                    aVar = kw3.p.Ai().Bi().y0(str7);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SubCoreRemittance", e17, "", new java.lang.Object[0]);
                    aVar = null;
                }
                if (aVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreRemittance", "empty record");
                    return;
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6) && !str6.equals(c01.z1.r())) {
                    str5 = str6;
                }
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(str5, aVar.f67195x297eb4f7);
                if (Li.m124847x74d37ac6() <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreRemittance", "has delete msg");
                    kw3.p.Ai().Bi().mo9951xb06685ab(aVar, new java.lang.String[0]);
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreRemittance", "update msg: %s", java.lang.Long.valueOf(Li.m124847x74d37ac6()));
                Li.d1(decode2);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(Li.m124847x74d37ac6(), Li, true);
                rw3.c y08 = Ai.Ni().y0(str7);
                if (y08 != null) {
                    y08.f68618xd3086e30 = P;
                    Ai.Ni().mo11260x413cb2b4(y08);
                } else if (!Li.Q0().equals(c01.z1.r())) {
                    rw3.c cVar = new rw3.c();
                    cVar.f68617x512156d6 = Li.m124847x74d37ac6();
                    cVar.f68622x5231a6cb = str7;
                    cVar.f68618xd3086e30 = P;
                    cVar.f68616xff7bdab7 = false;
                    cVar.f68621x114ef53e = Li.Q0();
                    cVar.f68620xdf27f83f = str8;
                    cVar.f68619xee5f688b = Li.mo78012x3fdd41df();
                    Ai.Ni().mo11260x413cb2b4(cVar);
                }
                Ai.Vi(Li.Q0(), Li, null);
                return;
            } catch (java.io.UnsupportedEncodingException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SubCoreRemittance", e18, "", new java.lang.Object[0]);
                return;
            }
        }
        if (java.lang.String.valueOf(25).equals(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreRemittance", "parse transfer outtime msg");
            java.lang.String str9 = (java.lang.String) d17.get(".sysmsg.paymsg.transferid");
            if (str9 == null) {
                str9 = "";
            }
            java.lang.String str10 = (java.lang.String) d17.get(".sysmsg.paymsg.fromusername");
            if (str10 == null) {
                str10 = "";
            }
            rw3.c z07 = Ai.Ni().z0(str9);
            if (z07 != null) {
                int i17 = z07.f68618xd3086e30;
                if (i17 == -1 || i17 == 1 || i17 == 21 || i17 == 7 || i17 == 27 || i17 == 0 || i17 == 20) {
                    z07.f68618xd3086e30 = 2;
                    Ai.Ni().mo11260x413cb2b4(z07);
                    Ai.Vi(str10, null, z07);
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li2 = pt0.f0.Li(z07.f68621x114ef53e, z07.f68617x512156d6);
                    if (Li2.m124847x74d37ac6() <= 0 || (Li2.F & 4) == 4 || Li2.mo78013xfb85f7b0() == 10000 || Li2.mo78013xfb85f7b0() == 268445456) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreRemittance", " msg is delete or revoked");
                        return;
                    }
                    java.lang.String str11 = (java.lang.String) d17.get(".sysmsg.paymsg.content");
                    if (str11 == null) {
                        str11 = "";
                    }
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str11)) {
                        return;
                    }
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                    f9Var.j1(0);
                    f9Var.u1(str10);
                    f9Var.d1(str11);
                    f9Var.e1(c01.w9.m(str10, j4Var.f459098o));
                    f9Var.m124850x7650bebc(10000);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var);
                    return;
                }
                return;
            }
            return;
        }
        if (java.lang.String.valueOf(33).equals(str)) {
            int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.paymsg.opentransferbankcard"), 0);
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            c17.x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_BANK_REMIT_OPEN_INT_SYNC, java.lang.Integer.valueOf(P2));
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_BANK_REMIT_HAS_SHOWN_RED_DOT_INT_SYNC;
            int intValue = ((java.lang.Integer) c17.m(u3Var, 0)).intValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreRemittance", "receive open bank remit: %s, %s", java.lang.Integer.valueOf(P2), java.lang.Integer.valueOf(intValue));
            if (intValue == 0) {
                ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
                bk0.a.g().q(com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_DATASOURCE_BANK_REMIT_STRING_SYNC, true);
                c17.x(u3Var, 1);
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PAY_OR_RECV_HAS_SHOW_RED_DOT_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
                return;
            }
            return;
        }
        if (!java.lang.String.valueOf(45).equals(str)) {
            if (java.lang.String.valueOf(46).equals(str)) {
                java.lang.String str12 = (java.lang.String) d17.get(".sysmsg.paymsg.pos_id");
                if (str12 == null) {
                    str12 = "";
                }
                java.lang.String str13 = (java.lang.String) d17.get(".sysmsg.paymsg.version");
                if (str13 == null) {
                    str13 = "";
                }
                java.lang.String str14 = (java.lang.String) d17.get(".sysmsg.paymsg.url");
                if (str14 == null) {
                    str14 = "";
                }
                java.lang.String str15 = (java.lang.String) d17.get(".sysmsg.paymsg.md5");
                if (str15 == null) {
                    str15 = "";
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreRemittance", "parse voice update msg，pos_id：%s,version ：%s, resourceUrl:%s, md5:%s", str12, str13, str14, str15);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str12) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str13)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreRemittance", "pos_id is null || version is null");
                    return;
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str12, "0")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.m.d();
                    h17 = com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.m.h("0-1");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.m.d();
                    h17 = com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.m.h(str12);
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreRemittance", "need insert new config");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.m.d();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.m.c(str12, str14, str13, str15);
                    return;
                }
                double parseDouble = java.lang.Double.parseDouble(str13);
                double parseDouble2 = java.lang.Double.parseDouble(h17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreRemittance", "voice resource file - version： %s ，versionLocal:%s", str13, h17);
                if (parseDouble <= parseDouble2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreRemittance", "version < versionLocal,do not update voice resource");
                    return;
                } else {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str14)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreRemittance", "resourceUrl is null");
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreRemittance", "need update voice resource config");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.m.d();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.m.c(str12, str14, str13, str15);
                    return;
                }
            }
            return;
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_remittance_remind_msg_switch, 1) == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreRemittance", "needOpenSwitch is close ");
            return;
        }
        java.lang.String str16 = (java.lang.String) d17.get(".sysmsg.paymsg.transferid");
        if (str16 == null) {
            str16 = "";
        }
        java.lang.String str17 = (java.lang.String) d17.get(".sysmsg.paymsg.fromusername");
        if (str17 == null) {
            str17 = "";
        }
        java.lang.String str18 = (java.lang.String) d17.get(".sysmsg.paymsg.content");
        if (str18 == null) {
            str18 = "";
        }
        java.lang.String str19 = (java.lang.String) d17.get(".sysmsg.paymsg.transfer_msg_type");
        if (str19 == null) {
            str19 = "";
        }
        int P3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.paymsg.trans_status"), 0);
        long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) d17.get(".sysmsg.paymsg.trans_timestamp"), 0L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreRemittance", "parse transfer remind receive msg：transferid：%s,msgType ：%s status:%s", str16, str19, java.lang.Integer.valueOf(P3));
        if (P3 > 0 && (y07 = Ai.Ni().y0(str16)) != null) {
            if (P3 == 2001) {
                y07.f68618xd3086e30 = 3;
                if (V < 10000000000L) {
                    V *= 1000;
                }
                y07.f68619xee5f688b = V;
            } else if (P3 == 2002) {
                y07.f68618xd3086e30 = 4;
            }
            Ai.Ni().mo11260x413cb2b4(y07);
        }
        rw3.c z08 = Ai.Ni().z0(str16);
        if (z08 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(20467, "transfer_to_change", "dont show message", "", "", "", "", 2, str16, str19);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreRemittance", "remittanceRecord is null, dont insert remind msg");
            return;
        }
        java.lang.String str20 = str19;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li3 = pt0.f0.Li(z08.f68621x114ef53e, z08.f68617x512156d6);
        if (Li3.m124847x74d37ac6() <= 0 || (Li3.F & 4) == 4 || Li3.mo78013xfb85f7b0() == 10000 || Li3.mo78013xfb85f7b0() == 268445456) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreRemittance", " msg has delete，dont insert remind msg");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(20467, "transfer_to_change", "dont show message", "", "", "", "", 2, str16, str20);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreRemittance", "insert new remind msg");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        f9Var2.j1(0);
        f9Var2.u1(str17);
        f9Var2.d1(str18);
        f9Var2.e1(c01.w9.m(str17, j4Var.f459098o));
        f9Var2.m124850x7650bebc(10000);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var2);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(20467, "transfer_to_change", "show message", "", "", "", "", 1, str16, str20);
    }

    @Override // c01.yc
    public void g1(com.p314xaae8f345.mm.p944x882e457a.r0 r0Var) {
        kw3.p.Ai().getClass();
    }
}

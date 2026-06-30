package bt3;

/* loaded from: classes9.dex */
public abstract class h2 {
    public static long a(r45.gp0 gp0Var) {
        long j17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.M1)) {
            return 0L;
        }
        try {
            j17 = new java.text.SimpleDateFormat(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS).parse(gp0Var.M1).getTime() / 1000;
        } catch (java.text.ParseException unused) {
            j17 = 0;
        }
        if (j17 != 0) {
            return j17;
        }
        try {
            return new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm").parse(gp0Var.M1).getTime() / 1000;
        } catch (java.text.ParseException unused2) {
            return j17;
        }
    }

    public static void b(java.lang.String str, java.util.Map map, r45.hp0 hp0Var) {
        java.lang.String str2 = str + ".photoAccountShareNameCard";
        if (map.containsKey(str2)) {
            r45.wp0 wp0Var = new r45.wp0();
            wp0Var.f389359d = (java.lang.String) map.get(str2 + ".username");
            wp0Var.f389360e = (java.lang.String) map.get(str2 + ".nickname");
            wp0Var.f389361f = (java.lang.String) map.get(str2 + ".brandIconUrl");
            wp0Var.f389362g = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str2 + ".certFlag"), 0);
            wp0Var.f389363h = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str2 + ".brandType"), 0);
            hp0Var.K = wp0Var;
        }
    }

    public static r45.gp0 c(java.util.Map map, java.lang.String str, int i17) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        if (map == null) {
            return null;
        }
        r45.gp0 gp0Var = new r45.gp0();
        gp0Var.h0(com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".dataitem.$datatype"), 0));
        gp0Var.g0((java.lang.String) map.get(".dataitem.$datasourceid"));
        gp0Var.F1 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".dataitem.$datastatus"), 0);
        gp0Var.G1 = true;
        gp0Var.i0((java.lang.String) map.get(".dataitem.datafmt"));
        gp0Var.O0((java.lang.String) map.get(".dataitem.datatitle"));
        gp0Var.m0((java.lang.String) map.get(".dataitem.datadesc"));
        gp0Var.d0((java.lang.String) map.get(".dataitem.cdnthumburl"));
        gp0Var.c0((java.lang.String) map.get(".dataitem.cdnthumbkey"));
        gp0Var.f375424o = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".dataitem.thumbwidth"), 0);
        gp0Var.f375426p = true;
        gp0Var.f375430q = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".dataitem.thumbheight"), 0);
        gp0Var.f375432r = true;
        gp0Var.b0((java.lang.String) map.get(".dataitem.cdndataurl"));
        gp0Var.a0((java.lang.String) map.get(".dataitem.cdndatakey"));
        gp0Var.f375405d2 = (java.lang.String) map.get(".dataitem.tpthumburl");
        gp0Var.f375407e2 = (java.lang.String) map.get(".dataitem.tpaeskey");
        gp0Var.f375409f2 = (java.lang.String) map.get(".dataitem.tpauthkey");
        gp0Var.f375411g2 = (java.lang.String) map.get(".dataitem.tpdataurl");
        gp0Var.f375413h2 = (java.lang.String) map.get(".dataitem.tpthumbaeskey");
        java.lang.String str6 = (java.lang.String) map.get(".dataitem.duration");
        if (str6 != null && str6.length() > 0) {
            gp0Var.n0(com.tencent.mm.sdk.platformtools.t8.P(str6, 0));
        }
        gp0Var.I0((java.lang.String) map.get(".dataitem.streamdataurl"));
        gp0Var.J0((java.lang.String) map.get(".dataitem.streamlowbandurl"));
        gp0Var.K0((java.lang.String) map.get(".dataitem.streamweburl"));
        gp0Var.p0((java.lang.String) map.get(".dataitem.fullmd5"));
        gp0Var.r0((java.lang.String) map.get(".dataitem.head256md5"));
        java.lang.String str7 = (java.lang.String) map.get(".dataitem.datasize");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str7)) {
            gp0Var.q0(com.tencent.mm.sdk.platformtools.t8.V(str7, 0L));
        }
        gp0Var.o0((java.lang.String) map.get(".dataitem.dataext"));
        gp0Var.N0((java.lang.String) map.get(".dataitem.thumbfullmd5"));
        gp0Var.M0((java.lang.String) map.get(".dataitem.thumbhead256md5"));
        if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) map.get(".dataitem.thumbsize"))) {
            gp0Var.L0(com.tencent.mm.sdk.platformtools.t8.P(r6, 0));
        }
        gp0Var.T0((java.lang.String) map.get(".dataitem.streamvideoid"));
        java.lang.String str8 = (java.lang.String) map.get(".dataitem.$dataid");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str8)) {
            str8 = java.lang.String.valueOf(i17);
        }
        gp0Var.e0(str8);
        java.lang.String str9 = (java.lang.String) map.get(".dataitem.$htmlid");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str9)) {
            gp0Var.t0(str9);
        }
        gp0Var.j0(com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".dataitem.$dataillegaltype"), 0));
        gp0Var.H1 = (java.lang.String) map.get(".dataitem.sourcetitle");
        gp0Var.I1 = true;
        gp0Var.k0((java.lang.String) map.get(".dataitem.sourcename"));
        gp0Var.G0((java.lang.String) map.get(".dataitem.sourcedesc"));
        gp0Var.f375417k2 = (java.lang.String) map.get(".dataitem.sourceheadurl");
        gp0Var.f375419l2 = true;
        gp0Var.l0((java.lang.String) map.get(".dataitem.sourcetime"));
        gp0Var.H0((java.lang.String) map.get(".dataitem.statextstr"));
        if (str != null) {
            gp0Var.C0(str);
            gp0Var.f375451y2 = ((com.tencent.mm.pluginsdk.model.v1) ((o72.t4) i95.n0.c(o72.t4.class))).Ai(str);
        }
        gp0Var.D0((java.lang.String) map.get(".dataitem.songalbumurl"));
        gp0Var.E0((java.lang.String) map.get(".dataitem.songlyric"));
        gp0Var.w0((java.lang.String) map.get(".dataitem.messageuuid"));
        gp0Var.v0(com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) map.get(".dataitem.fromnewmsgid"), 0L));
        gp0Var.f375439u2 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".dataitem.thumbfiletype"), 0);
        gp0Var.f375441v2 = true;
        gp0Var.f375443w2 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".dataitem.filetype"), 0);
        gp0Var.f375447x2 = true;
        r45.hp0 hp0Var = new r45.hp0();
        r45.ip0 ip0Var = new r45.ip0();
        ip0Var.l(com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".dataitem.$sourcetype"), 0));
        java.lang.String str10 = (java.lang.String) map.get(".dataitem.dataitemsource.fromusr");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str10)) {
            ip0Var.i(str10);
        }
        java.lang.String str11 = (java.lang.String) map.get(".dataitem.dataitemsource.realchatname");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str11)) {
            ip0Var.k(str11);
        }
        ip0Var.f((java.lang.String) map.get(".dataitem.appid"));
        ip0Var.j((java.lang.String) map.get(".dataitem.link"));
        ip0Var.g((java.lang.String) map.get(".dataitem.brandid"));
        ip0Var.D = (java.lang.String) map.get(".dataitem.dataitemsource.hashusername");
        ip0Var.E = true;
        hp0Var.f376353d = ip0Var;
        if (map.containsKey(".dataitem.locitem")) {
            r45.pp0 pp0Var = new r45.pp0();
            if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) map.get(".dataitem.locitem.label"))) {
                pp0Var.t((java.lang.String) map.get(".dataitem.locitem.label"));
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) map.get(".dataitem.locitem.poiname"))) {
                pp0Var.C((java.lang.String) map.get(".dataitem.locitem.poiname"));
            }
            java.lang.String str12 = (java.lang.String) map.get(".dataitem.locitem.lng");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str12)) {
                pp0Var.w(com.tencent.mm.sdk.platformtools.t8.F(str12, 0.0d));
            }
            java.lang.String str13 = (java.lang.String) map.get(".dataitem.locitem.lat");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str13)) {
                pp0Var.u(com.tencent.mm.sdk.platformtools.t8.F(str13, 0.0d));
            }
            java.lang.String str14 = (java.lang.String) map.get(".dataitem.locitem.scale");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str14)) {
                if (str14.indexOf(46) != -1) {
                    pp0Var.E(com.tencent.mm.sdk.platformtools.t8.P(str14.substring(0, str14.indexOf(46)), -1));
                } else {
                    pp0Var.E(com.tencent.mm.sdk.platformtools.t8.P(str14, -1));
                }
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) map.get(".dataitem.locitem.poiid"))) {
                pp0Var.B((java.lang.String) map.get(".dataitem.locitem.poiid"));
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) map.get(".dataitem.locitem.poiCategoryTips"))) {
                pp0Var.y((java.lang.String) map.get(".dataitem.locitem.poiCategoryTips"));
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) map.get(".dataitem.locitem.poiBusinessHour"))) {
                pp0Var.x((java.lang.String) map.get(".dataitem.locitem.poiBusinessHour"));
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) map.get(".dataitem.locitem.poiPhone"))) {
                pp0Var.z((java.lang.String) map.get(".dataitem.locitem.poiPhone"));
            }
            java.lang.String str15 = (java.lang.String) map.get(".dataitem.locitem.poiPriceTips");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str15)) {
                pp0Var.A(com.tencent.mm.sdk.platformtools.t8.L(str15, 0.0f));
            }
            java.lang.String str16 = (java.lang.String) map.get(".dataitem.locitem.isFromPoiList");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str16)) {
                pp0Var.s(com.tencent.mm.sdk.platformtools.t8.y(str16, false));
            }
            pp0Var.q((java.lang.String) map.get(".dataitem.locitem.buildingId"));
            pp0Var.r((java.lang.String) map.get(".dataitem.locitem.floorName"));
            hp0Var.f376354e = pp0Var;
        }
        if (map.containsKey(".dataitem.weburlitem")) {
            r45.tq0 tq0Var = new r45.tq0();
            tq0Var.p((java.lang.String) map.get(".dataitem.weburlitem.title"));
            tq0Var.j((java.lang.String) map.get(".dataitem.weburlitem.desc"));
            tq0Var.o((java.lang.String) map.get(".dataitem.weburlitem.thumburl"));
            tq0Var.i((java.lang.String) map.get(".dataitem.weburlitem.link"));
            tq0Var.n(com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".dataitem.weburlitem.opencache"), 0));
            tq0Var.l(com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".dataitem.weburlitem.forwardflag"), 0));
            tq0Var.k((java.lang.String) map.get(".dataitem.weburlitem.extraparam"));
            hp0Var.f376355f = tq0Var;
        }
        hp0Var.f376371y = zy2.d5.j(".dataitem", map);
        hp0Var.f376372z = zy2.d5.l(".dataitem", map);
        hp0Var.F = b00.e0.f16662a.a(".dataitem", map);
        hp0Var.I = zy2.d5.r(".dataitem", map);
        hp0Var.E = zy2.d5.p(".dataitem", map);
        hp0Var.D = zy2.d5.p(".dataitem", map);
        r45.jv2 jv2Var = new r45.jv2();
        if (map.isEmpty()) {
            jv2Var.set(0, "");
            jv2Var.set(1, "");
            jv2Var.set(2, "");
            jv2Var.set(3, "");
            jv2Var.set(4, -1);
        } else {
            java.lang.String str17 = (java.lang.String) map.get(".dataitem.finderShareNameCard.username");
            if (str17 == null) {
                str17 = "";
            }
            jv2Var.set(0, str17);
            java.lang.String str18 = (java.lang.String) map.get(".dataitem.finderShareNameCard.nickname");
            if (str18 == null) {
                str18 = "";
            }
            jv2Var.set(1, str18);
            java.lang.String str19 = (java.lang.String) map.get(".dataitem.finderShareNameCard.avatar");
            if (str19 == null) {
                str19 = "";
            }
            jv2Var.set(2, str19);
            java.lang.String str20 = (java.lang.String) map.get(".dataitem.finderShareNameCard.authJob");
            if (str20 == null) {
                str20 = "";
            }
            jv2Var.set(3, str20);
            jv2Var.set(4, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".dataitem.finderShareNameCard.authIcon"), -1)));
            java.lang.String str21 = (java.lang.String) map.get(".dataitem.finderShareNameCard.lastGMsgID");
            if (str21 == null) {
                str21 = "";
            }
            jv2Var.set(7, str21);
        }
        hp0Var.A = jv2Var;
        r45.dv2 dv2Var = new r45.dv2();
        if (map.isEmpty()) {
            dv2Var.set(0, "");
            dv2Var.set(1, "");
            dv2Var.set(2, "");
            dv2Var.set(5, null);
        } else {
            java.lang.String str22 = (java.lang.String) map.get(".dataitem.finderContentColumnSharedItem.cardbuffer");
            if (str22 == null) {
                str22 = "";
            }
            dv2Var.set(5, new com.tencent.mm.protobuf.g(android.util.Base64.decode(str22, 0)));
            java.lang.String str23 = (java.lang.String) map.get(".dataitem.finderContentColumnSharedItem.iconUrl");
            if (str23 == null) {
                str23 = "";
            }
            java.lang.String str24 = (java.lang.String) map.get(".dataitem.finderContentColumnSharedItem.iconUrl_1");
            if (str24 == null) {
                str24 = "";
            }
            java.lang.String str25 = (java.lang.String) map.get(".dataitem.finderContentColumnSharedItem.iconUrl_2");
            if (str25 == null) {
                str25 = "";
            }
            java.lang.String str26 = (java.lang.String) map.get(".dataitem.finderContentColumnSharedItem.iconUrl_3");
            if (str26 == null) {
                str26 = "";
            }
            java.lang.String[] split = str23.split("&token");
            dv2Var.getList(3).add(split[0]);
            java.util.LinkedList list = dv2Var.getList(4);
            if (split.length > 1) {
                str2 = "&token" + split[1];
            } else {
                str2 = "";
            }
            list.add(str2);
            java.lang.String[] split2 = str24.split("&token");
            dv2Var.getList(3).add(split2[0]);
            java.util.LinkedList list2 = dv2Var.getList(4);
            if (split2.length > 1) {
                str3 = "&token" + split2[1];
            } else {
                str3 = "";
            }
            list2.add(str3);
            java.lang.String[] split3 = str25.split("&token");
            dv2Var.getList(3).add(split3[0]);
            java.util.LinkedList list3 = dv2Var.getList(4);
            if (split3.length > 1) {
                str4 = "&token" + split3[1];
            } else {
                str4 = "";
            }
            list3.add(str4);
            java.lang.String[] split4 = str26.split("&token");
            dv2Var.getList(3).add(split4[0]);
            java.util.LinkedList list4 = dv2Var.getList(4);
            if (split4.length > 1) {
                str5 = "&token" + split4[1];
            } else {
                str5 = "";
            }
            list4.add(str5);
            java.lang.String str27 = (java.lang.String) map.get(".dataitem.finderContentColumnSharedItem.cardId");
            if (str27 == null) {
                str27 = "";
            }
            dv2Var.set(0, str27);
            java.lang.String str28 = (java.lang.String) map.get(".dataitem.finderContentColumnSharedItem.title");
            if (str28 == null) {
                str28 = "";
            }
            dv2Var.set(1, str28);
            java.lang.String str29 = (java.lang.String) map.get(".dataitem.finderContentColumnSharedItem.secondTitle");
            dv2Var.set(2, str29 != null ? str29 : "");
        }
        hp0Var.B = dv2Var;
        if (map.containsKey(".dataitem.productitem")) {
            r45.aq0 aq0Var = new r45.aq0();
            aq0Var.g((java.lang.String) map.get(".dataitem.productitem.title"));
            aq0Var.d((java.lang.String) map.get(".dataitem.productitem.desc"));
            aq0Var.f((java.lang.String) map.get(".dataitem.productitem.thumburl"));
            aq0Var.e((java.lang.String) map.get(".dataitem.productitem.productinfo"));
            aq0Var.i(com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".dataitem.productitem.$type"), 0));
            hp0Var.f376356g = aq0Var;
        }
        if (map.containsKey(".dataitem.tvitem")) {
            r45.mq0 mq0Var = new r45.mq0();
            mq0Var.g((java.lang.String) map.get(".dataitem.tvitem.title"));
            mq0Var.d((java.lang.String) map.get(".dataitem.tvitem.desc"));
            mq0Var.f((java.lang.String) map.get(".dataitem.tvitem.thumburl"));
            mq0Var.e((java.lang.String) map.get(".dataitem.tvitem.tvinfo"));
            hp0Var.f376357h = mq0Var;
        }
        if (map.containsKey(".dataitem.appbranditem")) {
            r45.dp0 dp0Var = new r45.dp0();
            dp0Var.f372634d = (java.lang.String) map.get(".dataitem.appbranditem.username");
            dp0Var.f372635e = (java.lang.String) map.get(".dataitem.appbranditem.appid");
            dp0Var.f372636f = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".dataitem.appbranditem.pkgtype"), 0);
            dp0Var.f372637g = (java.lang.String) map.get(".dataitem.appbranditem.iconurl");
            dp0Var.f372638h = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".dataitem.appbranditem.type"), 0);
            dp0Var.f372639i = (java.lang.String) map.get(".dataitem.appbranditem.pagepath");
            dp0Var.f372640m = (java.lang.String) map.get(".dataitem.appbranditem.sourcedisplayname");
            dp0Var.f372641n = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".dataitem.appbranditem.version"), 0);
            dp0Var.f372642o = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".dataitem.appbranditem.disableforward"), 0);
            dp0Var.f372646s = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".dataitem.appbranditem.showRelievedBuyFlag"), 0);
            dp0Var.f372644q = (java.lang.String) map.get(".dataitem.appbranditem.messageextradata");
            dp0Var.f372645r = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".dataitem.appbranditem.subtype"), 0);
            hp0Var.f376368v = dp0Var;
        }
        if (map.containsKey(".dataitem.weburlitem.appmsgshareitem")) {
            hp0Var.f376369w = q72.b.a(".dataitem.weburlitem.appmsgshareitem", map);
        }
        if (map.containsKey(".dataitem.favbrandmpvideo")) {
            hp0Var.f376370x = q72.b.b(".dataitem.favbrandmpvideo", map);
        }
        hp0Var.C = zy2.pc.b(".dataitem", map);
        hp0Var.G = ((ef0.l4) ((qk.i9) i95.n0.c(qk.i9.class))).Zi(".dataitem", map);
        if (map.containsKey(".dataitem.liteappshareditem")) {
            r45.op0 op0Var = new r45.op0();
            op0Var.f382417q = (java.lang.String) map.get(".dataitem.liteappshareditem.appId");
            op0Var.f382416p = (java.lang.String) map.get(".dataitem.liteappshareditem.query");
            op0Var.f382415o = (java.lang.String) map.get(".dataitem.liteappshareditem.path");
            op0Var.f382418r = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".dataitem.liteappshareditem.source"), 0);
            op0Var.f382419s = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".dataitem.liteappshareditem.isTransparent"), 0) == 1;
            op0Var.f382420t = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".dataitem.liteappshareditem.forbidForward"), 0) == 1;
            hp0Var.H = op0Var;
        }
        hp0Var.f376352J = zy2.d5.n(".dataitem", map);
        b(".dataitem", map, hp0Var);
        gp0Var.J1 = hp0Var;
        return gp0Var;
    }
}

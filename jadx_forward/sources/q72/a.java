package q72;

/* loaded from: classes9.dex */
public abstract class a {
    public static void a(java.lang.String str, java.util.Map map, r45.hp0 hp0Var) {
        java.lang.String str2 = str + ".appbranditem";
        if (map.containsKey(str2)) {
            r45.dp0 dp0Var = new r45.dp0();
            dp0Var.f454167d = (java.lang.String) map.get(str2 + ".username");
            dp0Var.f454168e = (java.lang.String) map.get(str2 + ".appid");
            dp0Var.f454169f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str2 + ".pkgtype"), 0);
            dp0Var.f454170g = (java.lang.String) map.get(str2 + ".iconurl");
            dp0Var.f454171h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str2 + ".type"), 0);
            dp0Var.f454172i = (java.lang.String) map.get(str2 + ".pagepath");
            dp0Var.f454173m = (java.lang.String) map.get(str2 + ".sourcedisplayname");
            dp0Var.f454174n = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str2 + ".version"), 0);
            dp0Var.f454175o = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str2 + ".disableforward"), 0);
            dp0Var.f454176p = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str2 + ".tradingguaranteeflag"), 0);
            dp0Var.f454179s = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str2 + ".showRelievedBuyFlag"), 0);
            dp0Var.f454177q = (java.lang.String) map.get(str2 + ".messageextradata");
            dp0Var.f454178r = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str2 + ".subtype"), 0);
            hp0Var.f457901v = dp0Var;
        }
    }

    public static void b(r45.hp0 hp0Var, java.lang.StringBuffer stringBuffer) {
        r45.dp0 dp0Var;
        if (hp0Var == null || (dp0Var = hp0Var.f457901v) == null || dp0Var == null) {
            return;
        }
        stringBuffer.append("<appbranditem>");
        stringBuffer.append("<username>");
        stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(dp0Var.f454167d));
        stringBuffer.append("</username>");
        stringBuffer.append("<appid>");
        stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(dp0Var.f454168e));
        stringBuffer.append("</appid>");
        stringBuffer.append("<pkgtype>");
        stringBuffer.append(dp0Var.f454169f);
        stringBuffer.append("</pkgtype>");
        stringBuffer.append("<iconurl>");
        stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(dp0Var.f454170g));
        stringBuffer.append("</iconurl>");
        stringBuffer.append("<type>");
        stringBuffer.append(dp0Var.f454171h);
        stringBuffer.append("</type>");
        stringBuffer.append("<pagepath>");
        stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(dp0Var.f454172i));
        stringBuffer.append("</pagepath>");
        stringBuffer.append("<sourcedisplayname>");
        stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(dp0Var.f454173m));
        stringBuffer.append("</sourcedisplayname>");
        stringBuffer.append("<version>");
        stringBuffer.append(dp0Var.f454174n);
        stringBuffer.append("</version>");
        stringBuffer.append("<disableforward>");
        stringBuffer.append(dp0Var.f454175o);
        stringBuffer.append("</disableforward>");
        stringBuffer.append("<tradingguaranteeflag>");
        stringBuffer.append(dp0Var.f454176p);
        stringBuffer.append("</tradingguaranteeflag>");
        stringBuffer.append("<showRelievedBuyFlag>");
        stringBuffer.append(dp0Var.f454179s);
        stringBuffer.append("</showRelievedBuyFlag>");
        stringBuffer.append("<messageextradata>");
        stringBuffer.append(java.lang.String.format("<![CDATA[%s]]>", dp0Var.f454177q));
        stringBuffer.append("</messageextradata>");
        stringBuffer.append("<subtype>");
        stringBuffer.append(dp0Var.f454178r);
        stringBuffer.append("</subtype>");
        stringBuffer.append("</appbranditem>");
    }

    public static void c(java.lang.String str, java.util.Map map, r45.hp0 hp0Var) {
        java.lang.String str2 = str + ".liteappitem";
        if (map.containsKey(str2)) {
            r45.op0 op0Var = new r45.op0();
            op0Var.f463950q = (java.lang.String) map.get(str2 + ".appid");
            java.lang.String str3 = (java.lang.String) map.get(str2 + ".pagepath");
            if (str3 == null) {
                str3 = (java.lang.String) map.get(str2 + ".page");
            }
            op0Var.f463948o = str3;
            op0Var.f463949p = (java.lang.String) map.get(str2 + ".query");
            op0Var.f463951r = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str2 + ".source"), 0);
            java.lang.String str4 = (java.lang.String) map.get(str2 + ".istransparent");
            if (str4 != null) {
                op0Var.f463952s = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str4, 0) == 1;
            }
            java.lang.String str5 = (java.lang.String) map.get(str2 + ".forbidforward");
            if (str5 != null) {
                op0Var.f463953t = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str5, 0) == 1;
            }
            hp0Var.H = op0Var;
        }
    }

    public static void d(r45.hp0 hp0Var, java.lang.StringBuffer stringBuffer) {
        r45.op0 op0Var;
        if (hp0Var == null || (op0Var = hp0Var.H) == null) {
            return;
        }
        stringBuffer.append("<liteappitem>");
        if (op0Var.f463950q != null) {
            stringBuffer.append("<appid>");
            stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(op0Var.f463950q));
            stringBuffer.append("</appid>");
        }
        if (op0Var.f463948o != null) {
            stringBuffer.append("<pagepath>");
            stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(op0Var.f463948o));
            stringBuffer.append("</pagepath>");
        }
        if (op0Var.f463949p != null) {
            stringBuffer.append("<query>");
            stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(op0Var.f463949p));
            stringBuffer.append("</query>");
        }
        stringBuffer.append("<source>");
        stringBuffer.append(op0Var.f463951r);
        stringBuffer.append("</source>");
        stringBuffer.append("<istransparent>");
        stringBuffer.append(op0Var.f463952s ? 1 : 0);
        stringBuffer.append("</istransparent>");
        stringBuffer.append("<forbidforward>");
        stringBuffer.append(op0Var.f463953t ? 1 : 0);
        stringBuffer.append("</forbidforward>");
        stringBuffer.append("</liteappitem>");
    }

    public static void e(r45.hp0 hp0Var, java.lang.StringBuffer stringBuffer) {
        r45.wp0 wp0Var;
        if (hp0Var == null || (wp0Var = hp0Var.K) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavDataItemParser", "toXml, photo account item empty");
            return;
        }
        stringBuffer.append("<photoAccountShareNameCard>");
        stringBuffer.append("<username>");
        stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(wp0Var.f470892d));
        stringBuffer.append("</username>");
        stringBuffer.append("<nickname>");
        stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(wp0Var.f470893e));
        stringBuffer.append("</nickname>");
        stringBuffer.append("<brandIconUrl>");
        stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(wp0Var.f470894f));
        stringBuffer.append("</brandIconUrl>");
        stringBuffer.append("<certFlag>");
        stringBuffer.append(wp0Var.f470895g);
        stringBuffer.append("</certFlag>");
        stringBuffer.append("<brandType>");
        stringBuffer.append(wp0Var.f470896h);
        stringBuffer.append("</brandType>");
        stringBuffer.append("</photoAccountShareNameCard>");
    }

    public static java.lang.String f(java.util.List list) {
        r45.mq0 mq0Var;
        r45.aq0 aq0Var;
        r45.qp0 qp0Var;
        r45.mv2 mv2Var;
        r45.mv2 mv2Var2;
        r45.g92 g92Var;
        r45.km6 km6Var;
        r45.xs4 xs4Var;
        r45.ev2 ev2Var;
        r45.kv2 kv2Var;
        r45.tq0 tq0Var;
        java.util.LinkedList linkedList;
        r45.pp0 pp0Var;
        r45.ip0 ip0Var;
        r45.hp0 hp0Var;
        r45.tq0 tq0Var2;
        if (list == null || list.size() == 0) {
            return "";
        }
        int size = list.size();
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append("<datalist count='");
        stringBuffer.append(size);
        stringBuffer.append("'>");
        for (int i17 = 0; i17 < size; i17++) {
            r45.gp0 gp0Var = (r45.gp0) list.get(i17);
            stringBuffer.append("<dataitem ");
            if (gp0Var.f456933J) {
                stringBuffer.append("datatype='");
                stringBuffer.append(gp0Var.I);
                stringBuffer.append("'");
            }
            if (gp0Var.G1) {
                stringBuffer.append(" datastatus='");
                stringBuffer.append(gp0Var.F1);
                stringBuffer.append("'");
            }
            if (gp0Var.U && gp0Var.T != null) {
                stringBuffer.append(" dataid='");
                stringBuffer.append(gp0Var.T);
                stringBuffer.append("'");
            }
            if (gp0Var.Q1 && gp0Var.P1 != null) {
                stringBuffer.append(" htmlid='");
                stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(gp0Var.P1));
                stringBuffer.append("'");
            }
            if (gp0Var.Y1) {
                stringBuffer.append(" dataillegaltype='");
                stringBuffer.append(gp0Var.X1);
                stringBuffer.append("'");
            }
            if (gp0Var.f456983y1 && gp0Var.f456979x1 != null) {
                stringBuffer.append(" datasourceid='");
                stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(gp0Var.f456979x1));
                stringBuffer.append("'");
            }
            stringBuffer.append(">");
            if (gp0Var.L && gp0Var.K != null) {
                stringBuffer.append("<datafmt>");
                stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(gp0Var.K));
                stringBuffer.append("</datafmt>");
            }
            if (gp0Var.f456939e && gp0Var.f456937d != null) {
                stringBuffer.append("<datatitle>");
                stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(gp0Var.f456937d));
                stringBuffer.append("</datatitle>");
            }
            if (gp0Var.f456943g && gp0Var.f456941f != null) {
                stringBuffer.append("<datadesc>");
                stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(gp0Var.f456941f));
                stringBuffer.append("</datadesc>");
            }
            if (gp0Var.f456947i && gp0Var.f456945h != null) {
                stringBuffer.append("<cdn_thumburl>");
                stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(gp0Var.f456945h));
                stringBuffer.append("</cdn_thumburl>");
            }
            if (gp0Var.f456959p) {
                stringBuffer.append("<thumb_width>");
                stringBuffer.append(gp0Var.f456957o);
                stringBuffer.append("</thumb_width>");
            }
            if (gp0Var.f456965r) {
                stringBuffer.append("<thumb_height>");
                stringBuffer.append(gp0Var.f456963q);
                stringBuffer.append("</thumb_height>");
            }
            if (gp0Var.f456969t && gp0Var.f456967s != null) {
                stringBuffer.append("<cdn_dataurl>");
                stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(gp0Var.f456967s));
                stringBuffer.append("</cdn_dataurl>");
            }
            if (gp0Var.f456955n && gp0Var.f456953m != null) {
                stringBuffer.append("<cdn_thumbkey>");
                stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(gp0Var.f456953m));
                stringBuffer.append("</cdn_thumbkey>");
            }
            if (gp0Var.f456973v && gp0Var.f456971u != null) {
                stringBuffer.append("<cdn_datakey>");
                stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(gp0Var.f456971u));
                stringBuffer.append("</cdn_datakey>");
            }
            if (gp0Var.f456977x) {
                stringBuffer.append("<cdn_encryver>");
                stringBuffer.append(gp0Var.f456975w);
                stringBuffer.append("</cdn_encryver>");
            }
            if (gp0Var.f456985z) {
                stringBuffer.append("<duration>");
                stringBuffer.append(gp0Var.f456981y);
                stringBuffer.append("</duration>");
            }
            if (gp0Var.B && gp0Var.A != null) {
                stringBuffer.append("<stream_weburl>");
                stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(gp0Var.A));
                stringBuffer.append("</stream_weburl>");
            }
            if (gp0Var.f456956n2 && gp0Var.f456954m2 != null) {
                stringBuffer.append("<songalbumurl>");
                stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(gp0Var.f456954m2));
                stringBuffer.append("</songalbumurl>");
            }
            if (gp0Var.f456962p2 && gp0Var.f456958o2 != null) {
                stringBuffer.append("<songlyric>");
                stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(gp0Var.f456958o2));
                stringBuffer.append("</songlyric>");
            }
            if (gp0Var.D && gp0Var.C != null) {
                stringBuffer.append("<stream_dataurl>");
                stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(gp0Var.C));
                stringBuffer.append("</stream_dataurl>");
            }
            if (gp0Var.F && gp0Var.E != null) {
                stringBuffer.append("<stream_lowbandurl>");
                stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(gp0Var.E));
                stringBuffer.append("</stream_lowbandurl>");
            }
            if (gp0Var.H && gp0Var.G != null) {
                stringBuffer.append("<dataext>");
                stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(gp0Var.G));
                stringBuffer.append("</dataext>");
            }
            if (gp0Var.N && gp0Var.M != null) {
                stringBuffer.append("<fullmd5>");
                stringBuffer.append(gp0Var.M);
                stringBuffer.append("</fullmd5>");
            }
            if (gp0Var.Q && gp0Var.P != null) {
                stringBuffer.append("<head256md5>");
                stringBuffer.append(gp0Var.P);
                stringBuffer.append("</head256md5>");
            }
            if (gp0Var.S) {
                stringBuffer.append("<fullsize>");
                stringBuffer.append(gp0Var.R);
                stringBuffer.append("</fullsize>");
            }
            if (gp0Var.f456960p0 && gp0Var.Z != null) {
                stringBuffer.append("<thumbfullmd5>");
                stringBuffer.append(gp0Var.Z);
                stringBuffer.append("</thumbfullmd5>");
            }
            if (gp0Var.f456982y0 && gp0Var.f456978x0 != null) {
                stringBuffer.append("<thumbhead256md5>");
                stringBuffer.append(gp0Var.f456978x0);
                stringBuffer.append("</thumbhead256md5>");
            }
            if (gp0Var.f456961p1) {
                stringBuffer.append("<thumbfullsize>");
                stringBuffer.append(gp0Var.f456951l1);
                stringBuffer.append("</thumbfullsize>");
            }
            if (gp0Var.A1 && gp0Var.f456986z1 != null) {
                stringBuffer.append("<stream_videoid>");
                stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(gp0Var.f456986z1));
                stringBuffer.append("</stream_videoid>");
            }
            if (gp0Var.I1 && gp0Var.H1 != null) {
                stringBuffer.append("<datasrctitle>");
                stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(gp0Var.H1));
                stringBuffer.append("</datasrctitle>");
            }
            if (gp0Var.L1 && gp0Var.K1 != null) {
                stringBuffer.append("<datasrcname>");
                stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(gp0Var.K1));
                stringBuffer.append("</datasrcname>");
            }
            if (gp0Var.N1 && gp0Var.M1 != null) {
                stringBuffer.append("<datasrctime>");
                stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(gp0Var.M1));
                stringBuffer.append("</datasrctime>");
            }
            if (gp0Var.U1 && gp0Var.T1 != null && ((hp0Var = gp0Var.J1) == null || (tq0Var2 = hp0Var.f457888f) == null || tq0Var2.mo75928xcd1e8d8() == 0)) {
                stringBuffer.append("<canvasPageXml>");
                stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(gp0Var.T1));
                stringBuffer.append("</canvasPageXml>");
            }
            if (gp0Var.S1 && gp0Var.R1 != null) {
                stringBuffer.append("<statextstr>");
                stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(gp0Var.R1));
                stringBuffer.append("</statextstr>");
            }
            if (gp0Var.f456934a2 && gp0Var.Z1 != null) {
                stringBuffer.append("<recordxml>");
                stringBuffer.append(gp0Var.Z1);
                stringBuffer.append("</recordxml>");
            }
            if (gp0Var.f456966r2 && gp0Var.f456964q2 != null) {
                stringBuffer.append("<messageuuid>");
                stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(gp0Var.f456964q2));
                stringBuffer.append("</messageuuid>");
            }
            if (gp0Var.f456970t2) {
                stringBuffer.append("<fromnewmsgid>");
                stringBuffer.append(gp0Var.f456968s2);
                stringBuffer.append("</fromnewmsgid>");
            }
            if (gp0Var.f456952l2) {
                stringBuffer.append("<sourceheadurl>");
                stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(gp0Var.f456950k2));
                stringBuffer.append("</sourceheadurl>");
            }
            if (gp0Var.f456980x2) {
                stringBuffer.append("<filetype>");
                stringBuffer.append(gp0Var.f456976w2);
                stringBuffer.append("</filetype>");
            }
            if (gp0Var.f456974v2) {
                stringBuffer.append("<thumbfiletype>");
                stringBuffer.append(gp0Var.f456972u2);
                stringBuffer.append("</thumbfiletype>");
            }
            if (gp0Var.f456949j2) {
                stringBuffer.append("<datasrcnamepost>");
                stringBuffer.append(gp0Var.f456948i2);
                stringBuffer.append("</datasrcnamepost>");
            }
            if (gp0Var.E2) {
                stringBuffer.append("<ishighqualityresources>");
                stringBuffer.append(gp0Var.D2 ? 1 : 0);
                stringBuffer.append("</ishighqualityresources>");
            }
            r45.jp0 jp0Var = gp0Var.O1;
            if (jp0Var != null) {
                stringBuffer.append("<streamvideo>");
                stringBuffer.append("<streamvideourl>");
                stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(jp0Var.f459531d));
                stringBuffer.append("</streamvideourl>");
                stringBuffer.append("<streamvideototaltime>");
                stringBuffer.append(jp0Var.f459532e);
                stringBuffer.append("</streamvideototaltime>");
                stringBuffer.append("<streamvideotitle>");
                stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(jp0Var.f459535h));
                stringBuffer.append("</streamvideotitle>");
                stringBuffer.append("<streamvideowording>");
                stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(jp0Var.f459533f));
                stringBuffer.append("</streamvideowording>");
                stringBuffer.append("<streamvideoweburl>");
                stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(jp0Var.f459534g));
                stringBuffer.append("</streamvideoweburl>");
                stringBuffer.append("<streamvideoaduxinfo>");
                stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(jp0Var.f459537m));
                stringBuffer.append("</streamvideoaduxinfo>");
                stringBuffer.append("<streamvideopublishid>");
                stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(jp0Var.f459538n));
                stringBuffer.append("</streamvideopublishid>");
                stringBuffer.append("</streamvideo>");
            }
            r45.hp0 hp0Var2 = gp0Var.J1;
            if (hp0Var2 != null && (ip0Var = hp0Var2.f457886d) != null && ip0Var.mo75928xcd1e8d8() != 0) {
                r45.ip0 ip0Var2 = hp0Var2.f457886d;
                stringBuffer.append("<dataitemsource");
                if (ip0Var2.f458763e) {
                    stringBuffer.append(" sourcetype='");
                    stringBuffer.append(ip0Var2.f458762d);
                    stringBuffer.append("'");
                }
                if (ip0Var2.f458769n) {
                    stringBuffer.append(" sourceid='");
                    stringBuffer.append(ip0Var2.f458768m);
                    stringBuffer.append("'");
                }
                stringBuffer.append(">");
                if (ip0Var2.f458765g) {
                    stringBuffer.append("<fromusr>");
                    stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(ip0Var2.f458764f));
                    stringBuffer.append("</fromusr>");
                }
                if (ip0Var2.f458767i) {
                    stringBuffer.append("<tousr>");
                    stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(ip0Var2.f458766h));
                    stringBuffer.append("</tousr>");
                }
                if (ip0Var2.f458771p) {
                    stringBuffer.append("<realchatname>");
                    stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(ip0Var2.f458770o));
                    stringBuffer.append("</realchatname>");
                }
                if (ip0Var2.f458775t) {
                    stringBuffer.append("<msgid>");
                    stringBuffer.append(ip0Var2.f458774s);
                    stringBuffer.append("</msgid>");
                }
                if (ip0Var2.f458777v) {
                    stringBuffer.append("<eventid>");
                    stringBuffer.append(ip0Var2.f458776u);
                    stringBuffer.append("</eventid>");
                }
                if (ip0Var2.f458779x) {
                    stringBuffer.append("<appid>");
                    stringBuffer.append(ip0Var2.f458778w);
                    stringBuffer.append("</appid>");
                }
                if (ip0Var2.f458781z) {
                    stringBuffer.append("<link>");
                    stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(ip0Var2.f458780y));
                    stringBuffer.append("</link>");
                }
                if (ip0Var2.C) {
                    stringBuffer.append("<brandid>");
                    stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(ip0Var2.B));
                    stringBuffer.append("</brandid>");
                }
                stringBuffer.append("</dataitemsource>");
            }
            r45.hp0 hp0Var3 = gp0Var.J1;
            if (hp0Var3 != null && (pp0Var = hp0Var3.f457887e) != null && pp0Var.mo75928xcd1e8d8() != 0) {
                r45.pp0 pp0Var2 = hp0Var3.f457887e;
                stringBuffer.append("<locitem>");
                if (pp0Var2.f464806n) {
                    stringBuffer.append("<label>");
                    stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(pp0Var2.f464805m));
                    stringBuffer.append("</label>");
                }
                if (pp0Var2.f464802g) {
                    stringBuffer.append("<lat>");
                    stringBuffer.append(pp0Var2.f464801f);
                    stringBuffer.append("</lat>");
                }
                if (pp0Var2.f464800e) {
                    stringBuffer.append("<lng>");
                    stringBuffer.append(pp0Var2.f464799d);
                    stringBuffer.append("</lng>");
                }
                if (pp0Var2.f464804i) {
                    stringBuffer.append("<scale>");
                    stringBuffer.append(pp0Var2.f464803h);
                    stringBuffer.append("</scale>");
                }
                if (pp0Var2.f464808p) {
                    stringBuffer.append("<poiname>");
                    stringBuffer.append(pp0Var2.f464807o);
                    stringBuffer.append("</poiname>");
                }
                if (pp0Var2.f464810r) {
                    stringBuffer.append("<poiid>");
                    stringBuffer.append(pp0Var2.f464809q);
                    stringBuffer.append("</poiid>");
                }
                if (pp0Var2.f464812t) {
                    stringBuffer.append("<poiCategoryTips>");
                    stringBuffer.append(pp0Var2.f464811s);
                    stringBuffer.append("</poiCategoryTips>");
                }
                if (pp0Var2.f464814v) {
                    stringBuffer.append("<poiBusinessHour>");
                    stringBuffer.append(pp0Var2.f464813u);
                    stringBuffer.append("</poiBusinessHour>");
                }
                if (pp0Var2.f464816x) {
                    stringBuffer.append("<poiPhone>");
                    stringBuffer.append(pp0Var2.f464815w);
                    stringBuffer.append("</poiPhone>");
                }
                if (pp0Var2.f464818z) {
                    stringBuffer.append("<poiPriceTips>");
                    stringBuffer.append(pp0Var2.f464817y);
                    stringBuffer.append("</poiPriceTips>");
                }
                if (pp0Var2.B) {
                    stringBuffer.append("<isfrompoilist>");
                    stringBuffer.append(pp0Var2.A ? "1" : "0");
                    stringBuffer.append("</isfrompoilist>");
                }
                if (pp0Var2.D) {
                    stringBuffer.append("<buildingId>");
                    stringBuffer.append(pp0Var2.C);
                    stringBuffer.append("</buildingId>");
                }
                if (pp0Var2.F) {
                    stringBuffer.append("<floorName>");
                    stringBuffer.append(pp0Var2.E);
                    stringBuffer.append("</floorName>");
                }
                stringBuffer.append("</locitem>");
            }
            r45.hp0 hp0Var4 = gp0Var.J1;
            if (hp0Var4 != null && (tq0Var = hp0Var4.f457888f) != null && tq0Var.mo75928xcd1e8d8() != 0) {
                r45.tq0 tq0Var3 = hp0Var4.f457888f;
                stringBuffer.append("<weburlitem>");
                if (tq0Var3.f468202i) {
                    stringBuffer.append("<clean_url>");
                    stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(tq0Var3.f468201h));
                    stringBuffer.append("</clean_url>");
                }
                if (tq0Var3.f468200g) {
                    stringBuffer.append("<pagedesc>");
                    stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(tq0Var3.f468199f));
                    stringBuffer.append("</pagedesc>");
                }
                if (tq0Var3.f468204n) {
                    stringBuffer.append("<pagethumb_url>");
                    stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(tq0Var3.f468203m));
                    stringBuffer.append("</pagethumb_url>");
                }
                if (tq0Var3.f468198e) {
                    stringBuffer.append("<pagetitle>");
                    stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(tq0Var3.f468197d));
                    stringBuffer.append("</pagetitle>");
                }
                if (tq0Var3.f468206p) {
                    stringBuffer.append("<opencache>");
                    stringBuffer.append(tq0Var3.f468205o);
                    stringBuffer.append("</opencache>");
                }
                if (tq0Var3.f468208r) {
                    stringBuffer.append("<contentattr>");
                    stringBuffer.append(tq0Var3.f468207q);
                    stringBuffer.append("</contentattr>");
                }
                if (tq0Var3.f468210t) {
                    stringBuffer.append("<canvasPageXml>");
                    stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(tq0Var3.f468209s));
                    stringBuffer.append("</canvasPageXml>");
                }
                if (tq0Var3.B) {
                    stringBuffer.append("<extraparam>");
                    stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(tq0Var3.A));
                    stringBuffer.append("</extraparam>");
                }
                if (tq0Var3.f468212v) {
                    stringBuffer.append("<wsVideoFlowXml>");
                    stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(tq0Var3.f468211u));
                    stringBuffer.append("</wsVideoFlowXml>");
                }
                stringBuffer.append("<forwardflag>");
                stringBuffer.append(tq0Var3.f468213w);
                stringBuffer.append("</forwardflag>");
                if (tq0Var3.f468216z && (linkedList = tq0Var3.f468215y) != null && linkedList.size() != 0) {
                    stringBuffer.append("<excerptlist>");
                    for (int i18 = 0; i18 < tq0Var3.f468215y.size(); i18++) {
                        r45.np0 np0Var = (r45.np0) tq0Var3.f468215y.get(i18);
                        stringBuffer.append("<excerptitem>");
                        stringBuffer.append("<content>");
                        stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(np0Var.f463098e));
                        stringBuffer.append("</content>");
                        stringBuffer.append("<excerptkey>");
                        stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(np0Var.f463097d));
                        stringBuffer.append("</excerptkey>");
                        stringBuffer.append("<excerpturl>");
                        stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(np0Var.f463099f));
                        stringBuffer.append("</excerpturl>");
                        stringBuffer.append("</excerptitem>");
                    }
                    stringBuffer.append("</excerptlist>");
                }
                r45.qp0 qp0Var2 = hp0Var4.f457902w;
                if (qp0Var2 != null) {
                    stringBuffer.append(q72.b.c(qp0Var2));
                }
                stringBuffer.append("</weburlitem>");
            }
            r45.hp0 hp0Var5 = gp0Var.J1;
            if (hp0Var5 != null && (kv2Var = hp0Var5.f457904y) != null) {
                stringBuffer.append(zy2.d5.f(kv2Var));
            }
            r45.hp0 hp0Var6 = gp0Var.J1;
            if (hp0Var6 != null && (ev2Var = hp0Var6.f457885J) != null) {
                stringBuffer.append(zy2.d5.e(ev2Var));
            }
            r45.hp0 hp0Var7 = gp0Var.J1;
            if (hp0Var7 != null && (xs4Var = hp0Var7.C) != null) {
                stringBuffer.append(zy2.pc.a(xs4Var));
            }
            r45.hp0 hp0Var8 = gp0Var.J1;
            if (hp0Var8 != null && (km6Var = hp0Var8.G) != null) {
                ((ef0.l4) ((qk.i9) i95.n0.c(qk.i9.class))).getClass();
                stringBuffer.append(cl4.g.a(km6Var));
            }
            r45.hp0 hp0Var9 = gp0Var.J1;
            if (hp0Var9 != null && (g92Var = hp0Var9.f457905z) != null) {
                stringBuffer.append(zy2.d5.c(g92Var));
            }
            r45.hp0 hp0Var10 = gp0Var.J1;
            if (hp0Var10 != null && (mv2Var2 = hp0Var10.E) != null) {
                stringBuffer.append(zy2.d5.h(mv2Var2));
            }
            r45.hp0 hp0Var11 = gp0Var.J1;
            if (hp0Var11 != null && (mv2Var = hp0Var11.D) != null) {
                stringBuffer.append(zy2.d5.h(mv2Var));
            }
            r45.hp0 hp0Var12 = gp0Var.J1;
            if (hp0Var12 != null && (qp0Var = hp0Var12.f457903x) != null) {
                java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer("<favbrandmpvideo><vid>");
                stringBuffer2.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(qp0Var.f465701m));
                stringBuffer2.append("</vid><videourl>");
                stringBuffer2.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(qp0Var.f465708t));
                stringBuffer2.append("</videourl><mpurl>");
                stringBuffer2.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(qp0Var.f465707s));
                stringBuffer2.append("</mpurl><bizusrname>");
                stringBuffer2.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(qp0Var.f465702n));
                stringBuffer2.append("</bizusrname><biznickname>");
                stringBuffer2.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(qp0Var.f465703o));
                stringBuffer2.append("</biznickname><thumburl>");
                stringBuffer2.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(qp0Var.f465706r));
                stringBuffer2.append("</thumburl><thumbwidth>");
                stringBuffer2.append(qp0Var.f465697f);
                stringBuffer2.append("</thumbwidth><thumbheight>");
                stringBuffer2.append(qp0Var.f465698g);
                stringBuffer2.append("</thumbheight><duration>");
                stringBuffer2.append(qp0Var.f465700i);
                stringBuffer2.append("</duration></favbrandmpvideo>");
                stringBuffer.append(stringBuffer2.toString());
            }
            r45.hp0 hp0Var13 = gp0Var.J1;
            if (hp0Var13 != null && (aq0Var = hp0Var13.f457889g) != null && aq0Var.mo75928xcd1e8d8() != 0) {
                r45.aq0 aq0Var2 = hp0Var13.f457889g;
                stringBuffer.append("<productitem");
                if (aq0Var2.f451730p) {
                    stringBuffer.append(" type='");
                    stringBuffer.append(aq0Var2.f451729o);
                    stringBuffer.append("'");
                }
                stringBuffer.append(">");
                if (aq0Var2.f451722e) {
                    stringBuffer.append("<producttitle>");
                    stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(aq0Var2.f451721d));
                    stringBuffer.append("</producttitle>");
                }
                if (aq0Var2.f451724g) {
                    stringBuffer.append("<productdesc>");
                    stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(aq0Var2.f451723f));
                    stringBuffer.append("</productdesc>");
                }
                if (aq0Var2.f451726i) {
                    stringBuffer.append("<productthumb_url>");
                    stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(aq0Var2.f451725h));
                    stringBuffer.append("</productthumb_url>");
                }
                if (aq0Var2.f451728n) {
                    stringBuffer.append("<productinfo>");
                    stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(aq0Var2.f451727m));
                    stringBuffer.append("</productinfo>");
                }
                stringBuffer.append("</productitem>");
            }
            r45.hp0 hp0Var14 = gp0Var.J1;
            if (hp0Var14 != null && (mq0Var = hp0Var14.f457890h) != null && mq0Var.mo75928xcd1e8d8() != 0) {
                r45.mq0 mq0Var2 = hp0Var14.f457890h;
                stringBuffer.append("<tvitem>");
                if (mq0Var2.f462269e) {
                    stringBuffer.append("<tvtitle>");
                    stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(mq0Var2.f462268d));
                    stringBuffer.append("</tvtitle>");
                }
                if (mq0Var2.f462271g) {
                    stringBuffer.append("<tvdesc>");
                    stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(mq0Var2.f462270f));
                    stringBuffer.append("</tvdesc>");
                }
                if (mq0Var2.f462273i) {
                    stringBuffer.append("<tvthumb_url>");
                    stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(mq0Var2.f462272h));
                    stringBuffer.append("</tvthumb_url>");
                }
                if (mq0Var2.f462275n) {
                    stringBuffer.append("<tvinfo>");
                    stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(mq0Var2.f462274m));
                    stringBuffer.append("</tvinfo>");
                }
                stringBuffer.append("</tvitem>");
            }
            b(gp0Var.J1, stringBuffer);
            e(gp0Var.J1, stringBuffer);
            d(gp0Var.J1, stringBuffer);
            stringBuffer.append("</dataitem>");
        }
        stringBuffer.append("</datalist>");
        return stringBuffer.toString();
    }

    public static r45.gp0 g(java.lang.String str, java.util.Map map, java.lang.String str2) {
        r45.gp0 gp0Var = new r45.gp0();
        gp0Var.h0(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".dataitem.$datatype"), 0));
        gp0Var.g0((java.lang.String) map.get(".dataitem.$datasourceid"));
        gp0Var.F1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".dataitem.$datastatus"), 0);
        gp0Var.G1 = true;
        gp0Var.i0((java.lang.String) map.get(".dataitem.datafmt"));
        gp0Var.O0((java.lang.String) map.get(".dataitem.datatitle"));
        gp0Var.m0((java.lang.String) map.get(".dataitem.datadesc"));
        gp0Var.d0((java.lang.String) map.get(".dataitem.cdn_thumburl"));
        gp0Var.c0((java.lang.String) map.get(".dataitem.cdn_thumbkey"));
        gp0Var.f456957o = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".dataitem.thumb_width"), 0);
        gp0Var.f456959p = true;
        gp0Var.f456963q = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".dataitem.thumb_height"), 0);
        gp0Var.f456965r = true;
        gp0Var.b0((java.lang.String) map.get(".dataitem.cdn_dataurl"));
        gp0Var.a0((java.lang.String) map.get(".dataitem.cdn_datakey"));
        java.lang.String str3 = (java.lang.String) map.get(".dataitem.duration");
        if (str3 != null && str3.length() > 0) {
            gp0Var.n0(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str3, 0));
        }
        gp0Var.I0((java.lang.String) map.get(".dataitem.stream_dataurl"));
        gp0Var.J0((java.lang.String) map.get(".dataitem.stream_lowbandurl"));
        gp0Var.K0((java.lang.String) map.get(".dataitem.stream_weburl"));
        gp0Var.D0((java.lang.String) map.get(".dataitem.songalbumurl"));
        gp0Var.E0((java.lang.String) map.get(".dataitem.songlyric"));
        gp0Var.Z((java.lang.String) map.get(".dataitem.canvasPageXml"));
        gp0Var.p0((java.lang.String) map.get(".dataitem.fullmd5"));
        gp0Var.r0((java.lang.String) map.get(".dataitem.head256md5"));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) map.get(".dataitem.fullsize"))) {
            gp0Var.q0(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(r5, 0));
        }
        gp0Var.o0((java.lang.String) map.get(".dataitem.dataext"));
        gp0Var.N0((java.lang.String) map.get(".dataitem.thumbfullmd5"));
        gp0Var.M0((java.lang.String) map.get(".dataitem.thumbhead256md5"));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) map.get(".dataitem.thumbfullsize"))) {
            gp0Var.L0(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(r5, 0));
        }
        gp0Var.T0((java.lang.String) map.get(".dataitem.stream_videoid"));
        java.lang.String str4 = (java.lang.String) map.get(".dataitem.$dataid");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4) || str4.length() < 32) {
            java.lang.String obj = gp0Var.toString();
            int i17 = gp0Var.I;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = o72.x1.f425048a;
            str4 = o72.d2.d(obj, i17);
        }
        gp0Var.e0(str4);
        gp0Var.H1 = (java.lang.String) map.get(".dataitem.datasrctitle");
        gp0Var.I1 = true;
        gp0Var.k0((java.lang.String) map.get(".dataitem.datasrcname"));
        gp0Var.l0((java.lang.String) map.get(".dataitem.datasrctime"));
        gp0Var.H0((java.lang.String) map.get(".dataitem.statextstr"));
        gp0Var.t0((java.lang.String) map.get(".dataitem.$htmlid"));
        gp0Var.j0(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".dataitem.$dataillegaltype"), 0));
        gp0Var.w0((java.lang.String) map.get(".dataitem.messageuuid"));
        gp0Var.v0(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) map.get(".dataitem.fromnewmsgid"), 0L));
        gp0Var.f456950k2 = (java.lang.String) map.get(".dataitem.sourceheadurl");
        gp0Var.f456952l2 = true;
        gp0Var.f456976w2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".dataitem.filetype"), 0);
        gp0Var.f456980x2 = true;
        gp0Var.f456972u2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".dataitem.thumbfiletype"), 0);
        gp0Var.f456974v2 = true;
        gp0Var.G0((java.lang.String) map.get(".dataitem.datasrcnamepost"));
        gp0Var.u0(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".dataitem.ishighqualityresources"), 0) == 1);
        if (str2 != null) {
            gp0Var.C0(str2);
            gp0Var.f456984y2 = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.v1) ((o72.t4) i95.n0.c(o72.t4.class))).Ai(str2);
        }
        if (map.containsKey(".dataitem.streamvideo")) {
            r45.jp0 jp0Var = new r45.jp0();
            java.lang.String str5 = (java.lang.String) map.get(".dataitem.streamvideo.streamvideourl");
            if (str5 == null) {
                str5 = "";
            }
            jp0Var.f459531d = str5;
            jp0Var.f459532e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(".dataitem.streamvideo.streamvideototaltime"), 0);
            java.lang.String str6 = (java.lang.String) map.get(".dataitem.streamvideo.streamvideotitle");
            if (str6 == null) {
                str6 = "";
            }
            jp0Var.f459535h = str6;
            java.lang.String str7 = (java.lang.String) map.get(".dataitem.streamvideo.streamvideowording");
            if (str7 == null) {
                str7 = "";
            }
            jp0Var.f459533f = str7;
            java.lang.String str8 = (java.lang.String) map.get(".dataitem.streamvideo.streamvideoweburl");
            if (str8 == null) {
                str8 = "";
            }
            jp0Var.f459534g = str8;
            java.lang.String str9 = (java.lang.String) map.get(".dataitem.streamvideo.streamvideoaduxinfo");
            if (str9 == null) {
                str9 = "";
            }
            jp0Var.f459537m = str9;
            java.lang.String str10 = (java.lang.String) map.get(".dataitem.streamvideo.streamvideopublishid");
            jp0Var.f459538n = str10 != null ? str10 : "";
            gp0Var.O1 = jp0Var;
        }
        r45.hp0 hp0Var = new r45.hp0();
        if (map.containsKey(".dataitem.dataitemsource")) {
            r45.ip0 ip0Var = new r45.ip0();
            ip0Var.l(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".dataitem.dataitemsource.$sourcetype"), 0));
            ip0Var.f458768m = (java.lang.String) map.get(".dataitem.dataitemsource.$sourceid");
            ip0Var.f458769n = true;
            ip0Var.i((java.lang.String) map.get(".dataitem.dataitemsource.fromusr"));
            ip0Var.n((java.lang.String) map.get(".dataitem.dataitemsource.tousr"));
            ip0Var.k((java.lang.String) map.get(".dataitem.dataitemsource.realchatname"));
            ip0Var.f458772q = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) map.get(".dataitem.dataitemsource.createtime"), 0L);
            ip0Var.f458773r = true;
            ip0Var.f458774s = (java.lang.String) map.get(".dataitem.dataitemsource.msgid");
            ip0Var.f458775t = true;
            ip0Var.f458776u = (java.lang.String) map.get(".dataitem.dataitemsource.eventid");
            ip0Var.f458777v = true;
            ip0Var.f((java.lang.String) map.get(".dataitem.dataitemsource.appid"));
            ip0Var.j((java.lang.String) map.get(".dataitem.dataitemsource.link"));
            ip0Var.g((java.lang.String) map.get(".dataitem.dataitemsource.brandid"));
            ip0Var.D = (java.lang.String) map.get(".dataitem.dataitemsource.hashusername");
            ip0Var.E = true;
            hp0Var.f457886d = ip0Var;
        }
        if (map.containsKey(".dataitem.locitem")) {
            r45.pp0 pp0Var = new r45.pp0();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) map.get(".dataitem.locitem.label"))) {
                pp0Var.t((java.lang.String) map.get(".dataitem.locitem.label"));
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) map.get(".dataitem.locitem.poiname"))) {
                pp0Var.C((java.lang.String) map.get(".dataitem.locitem.poiname"));
            }
            java.lang.String str11 = (java.lang.String) map.get(".dataitem.locitem.lng");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str11)) {
                pp0Var.w(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(str11, 0.0d));
            }
            java.lang.String str12 = (java.lang.String) map.get(".dataitem.locitem.lat");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str12)) {
                pp0Var.u(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(str12, 0.0d));
            }
            java.lang.String str13 = (java.lang.String) map.get(".dataitem.locitem.scale");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str13)) {
                if (str13.indexOf(46) != -1) {
                    pp0Var.E(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str13.substring(0, str13.indexOf(46)), -1));
                } else {
                    pp0Var.E(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str13, -1));
                }
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) map.get(".dataitem.locitem.poiid"))) {
                pp0Var.B((java.lang.String) map.get(".dataitem.locitem.poiid"));
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) map.get(".dataitem.locitem.poiCategoryTips"))) {
                pp0Var.y((java.lang.String) map.get(".dataitem.locitem.poiCategoryTips"));
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) map.get(".dataitem.locitem.poiBusinessHour"))) {
                pp0Var.x((java.lang.String) map.get(".dataitem.locitem.poiBusinessHour"));
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) map.get(".dataitem.locitem.poiPhone"))) {
                pp0Var.z((java.lang.String) map.get(".dataitem.locitem.poiPhone"));
            }
            java.lang.String str14 = (java.lang.String) map.get(".dataitem.locitem.poiPriceTips");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str14)) {
                pp0Var.A(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L(str14, 0.0f));
            }
            java.lang.String str15 = (java.lang.String) map.get(".dataitem.locitem.isfrompoilist");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str15)) {
                pp0Var.s(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str15, 0) == 1);
            }
            pp0Var.q((java.lang.String) map.get(".dataitem.locitem.buildingId"));
            pp0Var.r((java.lang.String) map.get(".dataitem.locitem.floorName"));
            hp0Var.f457887e = pp0Var;
        }
        if (map.containsKey(".dataitem.weburlitem")) {
            r45.tq0 tq0Var = new r45.tq0();
            tq0Var.i((java.lang.String) map.get(".dataitem.weburlitem.clean_url"));
            tq0Var.j((java.lang.String) map.get(".dataitem.weburlitem.pagedesc"));
            tq0Var.o((java.lang.String) map.get(".dataitem.weburlitem.pagethumb_url"));
            tq0Var.p((java.lang.String) map.get(".dataitem.weburlitem.pagetitle"));
            tq0Var.n(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".dataitem.weburlitem.opencache"), 0));
            tq0Var.f468207q = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".dataitem.weburlitem.contentattr"), 0);
            tq0Var.f468208r = true;
            tq0Var.f468209s = (java.lang.String) map.get(".dataitem.weburlitem.canvasPageXml");
            tq0Var.f468210t = true;
            tq0Var.q((java.lang.String) map.get(".dataitem.weburlitem.wsVideoFlowXml"));
            tq0Var.l(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".dataitem.weburlitem.forwardflag"), 0));
            tq0Var.k((java.lang.String) map.get(".dataitem.weburlitem.extraparam"));
            hp0Var.f457888f = tq0Var;
            javax.xml.parsers.DocumentBuilderFactory newInstance = javax.xml.parsers.DocumentBuilderFactory.newInstance();
            try {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                org.w3c.dom.Document parse = newInstance.newDocumentBuilder().parse(new org.xml.sax.InputSource(new java.io.ByteArrayInputStream(str.getBytes())));
                parse.normalize();
                org.w3c.dom.NodeList elementsByTagName = parse.getDocumentElement().getElementsByTagName("excerptlist");
                if (elementsByTagName != null && elementsByTagName.getLength() > 0 && elementsByTagName.item(0) != null) {
                    org.w3c.dom.NodeList childNodes = elementsByTagName.item(0).getChildNodes();
                    int length = childNodes.getLength();
                    for (int i18 = 0; i18 < length; i18++) {
                        try {
                            org.w3c.dom.Node item = childNodes.item(i18);
                            java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.c(item);
                            if (item instanceof org.w3c.dom.Element) {
                                java.util.Map d17 = c17.trim().startsWith("<excerptitem") ? com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(c17, "excerptitem", null) : null;
                                if (d17 != null) {
                                    r45.np0 np0Var = new r45.np0();
                                    np0Var.f463098e = (java.lang.String) d17.get(".excerptitem.content");
                                    np0Var.f463097d = (java.lang.String) d17.get(".excerptitem.excerptkey");
                                    np0Var.f463099f = (java.lang.String) d17.get(".excerptitem.excerpturl");
                                    linkedList.add(np0Var);
                                }
                            }
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FavDataItemParser", e17, null, new java.lang.Object[0]);
                        }
                    }
                }
                tq0Var.f468215y = linkedList;
                tq0Var.f468216z = true;
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavDataItemParser", "[setUrlItem] parseXML exception:%s", e18.toString());
            }
        }
        hp0Var.f457904y = zy2.d5.j(".dataitem", map);
        if (map.containsKey(".dataitem.musicShareItem") || map.containsKey(".dataitem.tingListenItem")) {
            hp0Var.C = zy2.pc.b(".dataitem", map);
        }
        if (map.containsKey(".dataitem.tingCategoryItem")) {
            hp0Var.G = ((ef0.l4) ((qk.i9) i95.n0.c(qk.i9.class))).Zi(".dataitem", map);
        }
        hp0Var.f457905z = zy2.d5.l(".dataitem", map);
        hp0Var.E = zy2.d5.o(".dataitem", map);
        hp0Var.D = zy2.d5.o(".dataitem", map);
        if (map.containsKey(".dataitem.productitem")) {
            r45.aq0 aq0Var = new r45.aq0();
            aq0Var.g((java.lang.String) map.get(".dataitem.productitem.producttitle"));
            aq0Var.d((java.lang.String) map.get(".dataitem.productitem.productdesc"));
            aq0Var.f((java.lang.String) map.get(".dataitem.productitem.productthumb_url"));
            aq0Var.e((java.lang.String) map.get(".dataitem.productitem.productinfo"));
            aq0Var.i(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".dataitem.productitem.$type"), 0));
            hp0Var.f457889g = aq0Var;
        }
        if (map.containsKey(".dataitem.tvitem")) {
            r45.mq0 mq0Var = new r45.mq0();
            mq0Var.g((java.lang.String) map.get(".dataitem.tvitem.tvtitle"));
            mq0Var.d((java.lang.String) map.get(".dataitem.tvitem.tvdesc"));
            mq0Var.f((java.lang.String) map.get(".dataitem.tvitem.tvthumb_url"));
            mq0Var.e((java.lang.String) map.get(".dataitem.tvitem.tvinfo"));
            hp0Var.f457890h = mq0Var;
        }
        a(".dataitem", map, hp0Var);
        r45.qp0 a17 = q72.b.a(".dataitem.weburlitem.appmsgshareitem", map);
        if (a17 != null) {
            hp0Var.f457902w = a17;
        }
        r45.qp0 b17 = q72.b.b(".dataitem.favbrandmpvideo", map);
        if (b17 != null) {
            hp0Var.f457903x = b17;
        }
        if (map.containsKey(".dataitem.photoAccountShareNameCard")) {
            r45.wp0 wp0Var = new r45.wp0();
            wp0Var.f470892d = (java.lang.String) map.get(".dataitem.photoAccountShareNameCard.username");
            wp0Var.f470893e = (java.lang.String) map.get(".dataitem.photoAccountShareNameCard.nickname");
            wp0Var.f470894f = (java.lang.String) map.get(".dataitem.photoAccountShareNameCard.brandIconUrl");
            wp0Var.f470895g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".dataitem.photoAccountShareNameCard.certFlag"), 0);
            wp0Var.f470896h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".dataitem.photoAccountShareNameCard.brandType"), 0);
            hp0Var.K = wp0Var;
        }
        c(".dataitem", map, hp0Var);
        gp0Var.J1 = hp0Var;
        return gp0Var;
    }
}

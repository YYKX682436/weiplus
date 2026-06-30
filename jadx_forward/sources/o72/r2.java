package o72;

/* loaded from: classes9.dex */
public class r2 extends dm.n3 implements z30.v {
    public static final l75.e0 F1 = dm.n3.m125333x3593deb(o72.r2.class);
    public static final o72.q2 G1 = new o72.o2();
    public static final o72.q2 H1 = new o72.p2();
    public boolean B1 = false;
    public o72.r2 C1 = null;
    public java.lang.String D1 = "";
    public java.lang.String E1 = "";

    public r2() {
        this.f67641x225ba391 = -1;
        this.f67642xd3939c3a = "";
        this.f67655x1209e7cb = "";
        this.f67643xc8a07680 = -1;
        this.f67647xadb904e6 = "";
        this.f67651x76e81a5a = -1;
        this.f67659xa783a79b = -1L;
        this.f67657x2262335f = -1;
        this.f67658x266f95d1 = -1;
        this.f67660x4b6e9352 = "";
        this.f67644x3059914a = 0;
        W0();
    }

    public static void A0(java.lang.String str, o72.q2 q2Var, r45.aq0 aq0Var) {
        if (aq0Var == null) {
            return;
        }
        q2Var.a(str + " ----product item----");
        q2Var.a(str + "  title: " + aq0Var.f451721d);
        q2Var.a(str + "  desc: " + aq0Var.f451723f);
        q2Var.a(str + "  thumbUrl: " + aq0Var.f451725h);
        q2Var.a(str + "  type: " + aq0Var.f451729o);
    }

    public static void D0(java.lang.String str, o72.q2 q2Var, r45.mq0 mq0Var) {
        if (mq0Var == null) {
            return;
        }
        q2Var.a(str + " ----tv item----");
        q2Var.a(str + "  title: " + mq0Var.f462268d);
        q2Var.a(str + "  desc: " + mq0Var.f462270f);
        q2Var.a(str + "  thumbUrl: " + mq0Var.f462272h);
    }

    public static void F0(java.lang.String str, o72.q2 q2Var, r45.tq0 tq0Var) {
        if (tq0Var == null) {
            return;
        }
        q2Var.a(str + " ----url item----");
        q2Var.a(str + "  title: " + tq0Var.f468197d);
        q2Var.a(str + "  desc: " + tq0Var.f468199f);
        q2Var.a(str + "  cleanUrl: " + tq0Var.f468201h);
        q2Var.a(str + "  thumbUrl: " + tq0Var.f468203m);
        q2Var.a(str + "  opencache: " + tq0Var.f468205o);
        q2Var.a(str + "  topstory: " + tq0Var.f468211u);
    }

    public static java.lang.String G0(o72.r2 r2Var) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String sb6;
        java.util.List<r45.np0> list;
        java.util.LinkedList linkedList;
        java.lang.String str9;
        o72.d3 d3Var = o72.d3.f424854a;
        if (o72.d3.f424855b) {
            r72.k kVar = new r72.k();
            r72.l.a(kVar, r2Var);
            java.lang.String m126747x696739c = kVar.m126747x696739c();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavItemInfo", "[getXml] newXml = " + m126747x696739c);
            return m126747x696739c;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavItemInfo", "[getXml] old xml serial logic");
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("<favitem type='");
        stringBuffer.append(r2Var.f67657x2262335f);
        stringBuffer.append("'>");
        r45.bq0 bq0Var = r2Var.f67640x5ab01132;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        if (bq0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavProtoItemParser", "FavProtoItem null, info localid:" + r2Var.f67645x88be67a1 + ", type:" + r2Var.f67657x2262335f);
            jx3.f.INSTANCE.d(22021, 20251031, java.lang.Integer.valueOf(r2Var.f67657x2262335f), "FavProtoItem null");
            sb6 = "";
            str3 = sb6;
        } else {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bq0Var.f452505q)) {
                sb7.append("<title>");
                sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(bq0Var.f452505q));
                sb7.append("</title>");
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bq0Var.f452507s)) {
                sb7.append("<desc>");
                sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(bq0Var.f452507s));
                sb7.append("</desc>");
            }
            if (bq0Var.A > 0) {
                sb7.append("<edittime>");
                sb7.append(bq0Var.A);
                sb7.append("</edittime>");
            }
            r45.sp0 sp0Var = bq0Var.G;
            if (sp0Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(sp0Var.f467425e)) {
                sb7.append("<editusr>");
                sb7.append(bq0Var.G.f467425e);
                sb7.append("</editusr>");
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bq0Var.f452503o)) {
                sb7.append("<remark ");
                if (bq0Var.f452509u > 0) {
                    sb7.append(" time ='");
                    sb7.append(bq0Var.f452509u);
                    sb7.append("'");
                }
                sb7.append(">");
                sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(bq0Var.f452503o));
                sb7.append("</remark>");
            }
            if (bq0Var.f452512x) {
                sb7.append("<ctrlflag>");
                sb7.append(bq0Var.f452511w);
                sb7.append("</ctrlflag>");
            }
            if (bq0Var.F) {
                sb7.append("<version>");
                sb7.append(bq0Var.E);
                sb7.append("</version>");
            } else if (r2Var.f67657x2262335f == 18) {
                sb7.append("<version>1</version>");
            }
            if (bq0Var.S && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bq0Var.R)) {
                sb7.append("<deviceid>");
                sb7.append(bq0Var.R);
                sb7.append("</deviceid>");
            }
            r45.jq0 jq0Var = bq0Var.f452495d;
            if (jq0Var == null || jq0Var.mo75928xcd1e8d8() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavSourceItemParser", "klem toXml, source item empty");
                str = "";
            } else {
                java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer("<source");
                if (jq0Var.f459568e) {
                    stringBuffer2.append(" sourcetype='");
                    stringBuffer2.append(jq0Var.f459567d);
                    stringBuffer2.append("'");
                }
                if (jq0Var.f459574n) {
                    stringBuffer2.append(" sourceid='");
                    stringBuffer2.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(jq0Var.f459573m));
                    stringBuffer2.append("'");
                }
                stringBuffer2.append(">");
                if (jq0Var.f459570g) {
                    stringBuffer2.append("<fromusr>");
                    stringBuffer2.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(jq0Var.f459569f));
                    stringBuffer2.append("</fromusr>");
                }
                if (jq0Var.f459572i) {
                    stringBuffer2.append("<tousr>");
                    stringBuffer2.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(jq0Var.f459571h));
                    stringBuffer2.append("</tousr>");
                }
                if (jq0Var.f459576p) {
                    stringBuffer2.append("<realchatname>");
                    stringBuffer2.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(jq0Var.f459575o));
                    stringBuffer2.append("</realchatname>");
                }
                if (jq0Var.f459580t) {
                    stringBuffer2.append("<msgid>");
                    stringBuffer2.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(jq0Var.f459579s));
                    stringBuffer2.append("</msgid>");
                }
                if (jq0Var.f459582v) {
                    stringBuffer2.append("<eventid>");
                    stringBuffer2.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(jq0Var.f459581u));
                    stringBuffer2.append("</eventid>");
                }
                if (jq0Var.f459584x) {
                    stringBuffer2.append("<appid>");
                    stringBuffer2.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(jq0Var.f459583w));
                    stringBuffer2.append("</appid>");
                }
                if (jq0Var.f459574n) {
                    stringBuffer2.append("<sourceid>");
                    stringBuffer2.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(jq0Var.f459573m));
                    stringBuffer2.append("</sourceid>");
                }
                if (jq0Var.f459586z) {
                    stringBuffer2.append("<link>");
                    stringBuffer2.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(jq0Var.f459585y));
                    stringBuffer2.append("</link>");
                }
                if (jq0Var.C) {
                    stringBuffer2.append("<brandid>");
                    stringBuffer2.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(jq0Var.B));
                    stringBuffer2.append("</brandid>");
                }
                stringBuffer2.append("</source>");
                str = stringBuffer2.toString();
            }
            sb7.append(str);
            sb7.append(q72.a.f(bq0Var.f452497f));
            r45.pp0 pp0Var = r2Var.f67640x5ab01132.f452499h;
            if (pp0Var == null || pp0Var.mo75928xcd1e8d8() == 0) {
                str2 = "";
            } else {
                java.lang.StringBuffer stringBuffer3 = new java.lang.StringBuffer("<locitem>");
                if (pp0Var.f464806n) {
                    stringBuffer3.append("<label>");
                    stringBuffer3.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(pp0Var.f464805m));
                    stringBuffer3.append("</label>");
                }
                if (pp0Var.f464802g) {
                    stringBuffer3.append("<lat>");
                    stringBuffer3.append(pp0Var.f464801f);
                    stringBuffer3.append("</lat>");
                }
                if (pp0Var.f464800e) {
                    stringBuffer3.append("<lng>");
                    stringBuffer3.append(pp0Var.f464799d);
                    stringBuffer3.append("</lng>");
                }
                if (pp0Var.f464804i) {
                    stringBuffer3.append("<scale>");
                    stringBuffer3.append(pp0Var.f464803h);
                    stringBuffer3.append("</scale>");
                }
                if (pp0Var.f464808p) {
                    stringBuffer3.append("<poiname>");
                    stringBuffer3.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(pp0Var.f464807o));
                    stringBuffer3.append("</poiname>");
                }
                if (pp0Var.f464810r) {
                    stringBuffer3.append("<poiid>");
                    stringBuffer3.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(pp0Var.f464809q));
                    stringBuffer3.append("</poiid>");
                }
                if (pp0Var.f464812t) {
                    stringBuffer3.append("<poiCategoryTips>");
                    stringBuffer3.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(pp0Var.f464811s));
                    stringBuffer3.append("</poiCategoryTips>");
                }
                if (pp0Var.f464814v) {
                    stringBuffer3.append("<poiBusinessHour>");
                    stringBuffer3.append(pp0Var.f464813u);
                    stringBuffer3.append("</poiBusinessHour>");
                }
                if (pp0Var.f464816x) {
                    stringBuffer3.append("<poiPhone>");
                    stringBuffer3.append(pp0Var.f464815w);
                    stringBuffer3.append("</poiPhone>");
                }
                if (pp0Var.f464818z) {
                    stringBuffer3.append("<poiPriceTips>");
                    stringBuffer3.append(pp0Var.f464817y);
                    stringBuffer3.append("</poiPriceTips>");
                }
                if (pp0Var.B) {
                    stringBuffer3.append("<isfrompoilist>");
                    stringBuffer3.append(pp0Var.A ? "1" : "0");
                    stringBuffer3.append("</isfrompoilist>");
                }
                if (pp0Var.D) {
                    stringBuffer3.append("<buildingId>");
                    stringBuffer3.append(pp0Var.C);
                    stringBuffer3.append("</buildingId>");
                }
                if (pp0Var.F) {
                    stringBuffer3.append("<floorName>");
                    stringBuffer3.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(pp0Var.E));
                    stringBuffer3.append("</floorName>");
                }
                stringBuffer3.append("</locitem>");
                str2 = stringBuffer3.toString();
            }
            sb7.append(str2);
            r45.tq0 tq0Var = r2Var.f67640x5ab01132.f452501m;
            if (tq0Var == null || tq0Var.mo75928xcd1e8d8() == 0) {
                str3 = "";
                str4 = str3;
            } else {
                java.lang.StringBuffer stringBuffer4 = new java.lang.StringBuffer("<weburlitem>");
                if (tq0Var.f468202i) {
                    stringBuffer4.append("<clean_url>");
                    stringBuffer4.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(tq0Var.f468201h));
                    stringBuffer4.append("</clean_url>");
                }
                if (tq0Var.f468200g) {
                    stringBuffer4.append("<pagedesc>");
                    stringBuffer4.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(tq0Var.f468199f));
                    stringBuffer4.append("</pagedesc>");
                }
                if (tq0Var.f468204n) {
                    stringBuffer4.append("<pagethumb_url>");
                    stringBuffer4.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(tq0Var.f468203m));
                    stringBuffer4.append("</pagethumb_url>");
                }
                if (tq0Var.f468198e) {
                    stringBuffer4.append("<pagetitle>");
                    stringBuffer4.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(tq0Var.f468197d));
                    stringBuffer4.append("</pagetitle>");
                }
                if (tq0Var.f468206p) {
                    stringBuffer4.append("<opencache>");
                    stringBuffer4.append(tq0Var.f468205o);
                    stringBuffer4.append("</opencache>");
                }
                if (tq0Var.f468208r) {
                    stringBuffer4.append("<contentattr>");
                    stringBuffer4.append(tq0Var.f468207q);
                    stringBuffer4.append("</contentattr>");
                }
                if (tq0Var.f468210t) {
                    stringBuffer4.append("<canvasPageXml>");
                    stringBuffer4.append(tq0Var.f468209s);
                    stringBuffer4.append("</canvasPageXml>");
                }
                if (tq0Var.B) {
                    stringBuffer4.append("<extraparam>");
                    stringBuffer4.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(tq0Var.A));
                    stringBuffer4.append("</extraparam>");
                }
                if (tq0Var.f468212v) {
                    stringBuffer4.append("<wsVideoFlowXml>");
                    stringBuffer4.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(tq0Var.f468211u));
                    stringBuffer4.append("</wsVideoFlowXml>");
                }
                stringBuffer4.append("<forwardflag>");
                stringBuffer4.append(tq0Var.f468213w);
                stringBuffer4.append("</forwardflag>");
                if (!tq0Var.f468216z || (linkedList = tq0Var.f468215y) == null || linkedList.size() == 0) {
                    str3 = "";
                } else {
                    stringBuffer4.append("<excerptlist>");
                    str3 = "";
                    int i17 = 0;
                    while (i17 < tq0Var.f468215y.size()) {
                        r45.np0 np0Var = (r45.np0) tq0Var.f468215y.get(i17);
                        stringBuffer4.append("<excerptitem><content>");
                        stringBuffer4.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(np0Var.f463098e));
                        stringBuffer4.append("</content><excerptkey>");
                        stringBuffer4.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(np0Var.f463097d));
                        stringBuffer4.append("</excerptkey><excerpturl>");
                        stringBuffer4.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(np0Var.f463099f));
                        stringBuffer4.append("</excerpturl></excerptitem>");
                        i17++;
                        tq0Var = tq0Var;
                    }
                    stringBuffer4.append("</excerptlist>");
                }
                stringBuffer4.append(q72.b.c(r2Var.f67640x5ab01132.K));
                stringBuffer4.append("</weburlitem>");
                str4 = stringBuffer4.toString();
            }
            sb7.append(str4);
            r45.aq0 aq0Var = r2Var.f67640x5ab01132.f452513y;
            if (aq0Var == null || aq0Var.mo75928xcd1e8d8() == 0) {
                str5 = str3;
            } else {
                java.lang.StringBuffer stringBuffer5 = new java.lang.StringBuffer("<productitem");
                if (aq0Var.f451730p) {
                    stringBuffer5.append(" type='");
                    stringBuffer5.append(aq0Var.f451729o);
                    stringBuffer5.append("'");
                }
                stringBuffer5.append(">");
                if (aq0Var.f451722e) {
                    stringBuffer5.append("<producttitle>");
                    stringBuffer5.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(aq0Var.f451721d));
                    stringBuffer5.append("</producttitle>");
                }
                if (aq0Var.f451724g) {
                    stringBuffer5.append("<productdesc>");
                    stringBuffer5.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(aq0Var.f451723f));
                    stringBuffer5.append("</productdesc>");
                }
                if (aq0Var.f451726i) {
                    stringBuffer5.append("<productthumb_url>");
                    stringBuffer5.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(aq0Var.f451725h));
                    stringBuffer5.append("</productthumb_url>");
                }
                if (aq0Var.f451728n) {
                    stringBuffer5.append("<productinfo>");
                    stringBuffer5.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(aq0Var.f451727m));
                    stringBuffer5.append("</productinfo>");
                }
                stringBuffer5.append("</productitem>");
                str5 = stringBuffer5.toString();
            }
            sb7.append(str5);
            r45.mq0 mq0Var = r2Var.f67640x5ab01132.C;
            if (mq0Var == null || mq0Var.mo75928xcd1e8d8() == 0) {
                str6 = str3;
            } else {
                java.lang.StringBuffer stringBuffer6 = new java.lang.StringBuffer("<tvitem>");
                if (mq0Var.f462269e) {
                    stringBuffer6.append("<tvtitle>");
                    stringBuffer6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(mq0Var.f462268d));
                    stringBuffer6.append("</tvtitle>");
                }
                if (mq0Var.f462271g) {
                    stringBuffer6.append("<tvdesc>");
                    stringBuffer6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(mq0Var.f462270f));
                    stringBuffer6.append("</tvdesc>");
                }
                if (mq0Var.f462273i) {
                    stringBuffer6.append("<tvthumb_url>");
                    stringBuffer6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(mq0Var.f462272h));
                    stringBuffer6.append("</tvthumb_url>");
                }
                if (mq0Var.f462275n) {
                    stringBuffer6.append("<tvinfo>");
                    stringBuffer6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(mq0Var.f462274m));
                    stringBuffer6.append("</tvinfo>");
                }
                stringBuffer6.append("</tvitem>");
                str6 = stringBuffer6.toString();
            }
            sb7.append(str6);
            r45.sp0 sp0Var2 = bq0Var.G;
            if (sp0Var2 == null || sp0Var2.mo75928xcd1e8d8() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavNoteInfoItemParser", "klem toXml, source item empty");
                str7 = str3;
            } else {
                java.lang.StringBuffer stringBuffer7 = new java.lang.StringBuffer("<noteinfo><noteauthor>");
                stringBuffer7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(sp0Var2.f467424d));
                stringBuffer7.append("</noteauthor><noteeditor>");
                stringBuffer7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(sp0Var2.f467425e));
                stringBuffer7.append("</noteeditor></noteinfo>");
                str7 = stringBuffer7.toString();
            }
            sb7.append(str7);
            sb7.append(zy2.d5.f(bq0Var.M));
            sb7.append(zy2.d5.e(bq0Var.Q));
            r45.dp0 dp0Var = r2Var.f67640x5ab01132.I;
            sb7.append(dp0Var == null ? str3 : "<appbranditem><username>" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(dp0Var.f454167d) + "</username><appid>" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(dp0Var.f454168e) + "</appid><pkgtype>" + dp0Var.f454169f + "</pkgtype><iconurl>" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(dp0Var.f454170g) + "</iconurl><type>" + dp0Var.f454171h + "</type><pagepath>" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(dp0Var.f454172i) + "</pagepath><sourcedisplayname>" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(dp0Var.f454173m) + "</sourcedisplayname><version>" + dp0Var.f454174n + "</version><disableforward>" + dp0Var.f454175o + "</disableforward><tradingguaranteeflag>" + dp0Var.f454176p + "</tradingguaranteeflag><showRelievedBuyFlag>" + dp0Var.f454179s + "</showRelievedBuyFlag><messageextradata>" + java.lang.String.format("<![CDATA[%s]]>", dp0Var.f454177q) + "</messageextradata><subtype>" + dp0Var.f454178r + "</subtype></appbranditem>");
            r45.op0 op0Var = r2Var.f67640x5ab01132.P;
            if (op0Var == null || op0Var.mo75928xcd1e8d8() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavAskItemParser", "klem toXml, ask item empty");
                str8 = str3;
            } else {
                java.lang.StringBuffer stringBuffer8 = new java.lang.StringBuffer("<liteappitem><fallbackurl>");
                stringBuffer8.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(op0Var.f463940d));
                stringBuffer8.append("</fallbackurl><subtype>");
                stringBuffer8.append(op0Var.f463941e);
                stringBuffer8.append("</subtype><nickname>");
                stringBuffer8.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(op0Var.f463943g));
                stringBuffer8.append("</nickname><des>");
                stringBuffer8.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(op0Var.f463946m));
                stringBuffer8.append("</des><title>");
                stringBuffer8.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(op0Var.f463945i));
                stringBuffer8.append("</title><jumptype>");
                stringBuffer8.append(op0Var.f463947n);
                stringBuffer8.append("</jumptype><mediatype>");
                stringBuffer8.append(op0Var.f463944h);
                stringBuffer8.append("</mediatype><query>");
                stringBuffer8.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(op0Var.f463949p));
                stringBuffer8.append("</query><pagepath>");
                stringBuffer8.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(op0Var.f463948o));
                stringBuffer8.append("</pagepath><appid>");
                stringBuffer8.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(op0Var.f463950q));
                stringBuffer8.append("</appid><istransparent>");
                stringBuffer8.append(op0Var.f463952s ? 1 : 0);
                stringBuffer8.append("</istransparent><forbidforward>");
                stringBuffer8.append(op0Var.f463953t ? 1 : 0);
                stringBuffer8.append("</forbidforward>");
                java.lang.String str10 = op0Var.f463942f;
                if (str10 != null && str10.length() > 0) {
                    stringBuffer8.append("<thumburl>");
                    stringBuffer8.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(op0Var.f463942f));
                    stringBuffer8.append("</thumburl>");
                }
                java.util.LinkedList favLineExcerptList = op0Var.f463954u;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(favLineExcerptList, "favLineExcerptList");
                if (favLineExcerptList.isEmpty()) {
                    list = kz5.p0.f395529d;
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : favLineExcerptList) {
                        r45.np0 np0Var2 = (r45.np0) obj;
                        if ((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(np0Var2.f463097d) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(np0Var2.f463098e) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(np0Var2.f463099f)) ? false : true) {
                            arrayList.add(obj);
                        }
                    }
                    list = arrayList;
                }
                if (!list.isEmpty()) {
                    stringBuffer8.append("<excerptlist>");
                    for (r45.np0 np0Var3 : list) {
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(np0Var3.f463097d) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(np0Var3.f463098e) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(np0Var3.f463099f)) {
                            stringBuffer8.append("<excerptitem><excerptkey>");
                            stringBuffer8.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(np0Var3.f463097d));
                            stringBuffer8.append("</excerptkey><excerpturl>");
                            stringBuffer8.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(np0Var3.f463099f));
                            stringBuffer8.append("</excerpturl><content>");
                            stringBuffer8.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(np0Var3.f463098e));
                            stringBuffer8.append("</content></excerptitem>");
                        }
                    }
                    stringBuffer8.append("</excerptlist>");
                }
                stringBuffer8.append("</liteappitem>");
                str8 = stringBuffer8.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str8, "toString(...)");
            }
            sb7.append(str8);
            sb6 = sb7.toString();
        }
        stringBuffer.append(sb6);
        r45.rq0 rq0Var = r2Var.f67653xef67d413;
        if (rq0Var != null) {
            java.util.LinkedList linkedList2 = rq0Var.f466629e;
            boolean isEmpty = linkedList2.isEmpty();
            java.util.LinkedList linkedList3 = rq0Var.f466628d;
            if (!isEmpty || !linkedList3.isEmpty()) {
                java.lang.StringBuffer stringBuffer9 = new java.lang.StringBuffer("<taglist count='");
                int size = linkedList2.size();
                stringBuffer9.append(size);
                stringBuffer9.append("'>");
                for (int i18 = 0; i18 < size; i18++) {
                    stringBuffer9.append("<tag>");
                    stringBuffer9.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p((java.lang.String) linkedList2.get(i18)));
                    stringBuffer9.append("</tag>");
                }
                stringBuffer9.append("</taglist><recommendtaglist count='");
                int size2 = linkedList3.size();
                stringBuffer9.append(size2);
                stringBuffer9.append("'>");
                for (int i19 = 0; i19 < size2; i19++) {
                    stringBuffer9.append("<tag>");
                    stringBuffer9.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p((java.lang.String) linkedList3.get(i19)));
                    stringBuffer9.append("</tag>");
                }
                stringBuffer9.append("</recommendtaglist>");
                str9 = stringBuffer9.toString();
                stringBuffer.append(str9);
                stringBuffer.append("</favitem>");
                java.lang.String stringBuffer10 = stringBuffer.toString();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavItemInfo", "[getXml] oldXml = " + stringBuffer10);
                return stringBuffer10;
            }
        }
        str9 = str3;
        stringBuffer.append(str9);
        stringBuffer.append("</favitem>");
        java.lang.String stringBuffer102 = stringBuffer.toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavItemInfo", "[getXml] oldXml = " + stringBuffer102);
        return stringBuffer102;
    }

    public static void y0(java.lang.String str, o72.q2 q2Var, r45.pp0 pp0Var) {
        if (pp0Var == null) {
            return;
        }
        q2Var.a(str + " ----loc item----");
        q2Var.a(str + "  lng: " + pp0Var.f464799d);
        q2Var.a(str + "  lat: " + pp0Var.f464801f);
        q2Var.a(str + "  scale: " + pp0Var.f464803h);
        q2Var.a(str + "  label: " + pp0Var.f464805m);
        q2Var.a(str + "  poiname: " + pp0Var.f464807o);
    }

    public static void z0(java.lang.String str, o72.q2 q2Var, r45.sp0 sp0Var) {
        if (sp0Var == null) {
            return;
        }
        q2Var.a(str + " ----noteInfoItem item----");
        q2Var.a(str + "  author: " + sp0Var.f467424d);
        q2Var.a(str + "  editor: " + sp0Var.f467425e);
    }

    public boolean I0() {
        return this.f67644x3059914a == 10;
    }

    public boolean J0() {
        return this.f67644x3059914a == 7;
    }

    public boolean L0() {
        int i17 = this.f67644x3059914a;
        return i17 == 15 || i17 == 16;
    }

    public boolean P0() {
        int i17 = this.f67644x3059914a;
        return i17 == 3 || i17 == 6 || i17 == 11 || i17 == 14 || i17 == 16 || i17 == 18;
    }

    public boolean Q0() {
        int i17 = this.f67644x3059914a;
        return i17 == 1 || i17 == 4 || i17 == 9 || i17 == 12 || i17 == 13 || i17 == 15 || i17 == 17;
    }

    public boolean R0() {
        int i17 = this.f67644x3059914a;
        return i17 == 12 || i17 == 13 || i17 == 14;
    }

    public java.util.Set T0(java.util.Collection collection) {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.addAll(this.f67653xef67d413.f466629e);
        this.f67653xef67d413.f466629e.clear();
        if (collection != null && !collection.isEmpty()) {
            this.f67653xef67d413.f466629e.addAll(collection);
            hashSet.removeAll(collection);
        }
        return hashSet;
    }

    public boolean U0(java.lang.String str) {
        if (str == null || str.equals("")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavItemInfo", "klem, FavItemInfo xml null");
            return false;
        }
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "favitem", null);
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavItemInfo", "klem, FavItemInfo maps null");
            return false;
        }
        o72.d3 d3Var = o72.d3.f424854a;
        if (o72.d3.f424855b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavItemInfo", "open new xml serial logic");
            r72.k kVar = new r72.k();
            kVar.m126728xdc93280d(str);
            r72.l.b(kVar, this);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavItemInfo", "use old version xml serial logic");
        try {
            W0();
            boolean c17 = q72.c.c(str, d17, this.f67640x5ab01132);
            r45.bq0 bq0Var = this.f67640x5ab01132;
            r45.jq0 jq0Var = bq0Var.f452495d;
            if (jq0Var != null) {
                this.f67650x85d9e03b = jq0Var.f459573m;
                this.f67651x76e81a5a = jq0Var.f459567d;
                this.f67642xd3939c3a = jq0Var.f459569f;
                this.f67655x1209e7cb = jq0Var.f459571h;
                this.f67647xadb904e6 = jq0Var.f459575o;
            }
            this.f67638x7d4eb57c = bq0Var.A;
            q72.d.a(d17, this.f67653xef67d413);
            return c17;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FavItemInfo", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavItemInfo", "klem , FavItemInfo exception:+%s", e17.toString());
            return false;
        }
    }

    public void W0() {
        this.f67640x5ab01132 = new r45.bq0();
        r45.jq0 jq0Var = new r45.jq0();
        jq0Var.g(1);
        this.f67640x5ab01132.o(jq0Var);
        this.f67640x5ab01132.r(new r45.tq0());
        this.f67640x5ab01132.k(new r45.qp0());
        this.f67640x5ab01132.j(new r45.pp0());
        this.f67640x5ab01132.n(new r45.aq0());
        this.f67640x5ab01132.q(new r45.mq0());
        this.f67640x5ab01132.i(new r45.kv2());
        this.f67640x5ab01132.Q = new r45.ev2();
        this.f67640x5ab01132.c(-1);
        this.f67640x5ab01132.P = new r45.op0();
        this.f67653xef67d413 = new r45.rq0();
        this.f67640x5ab01132.l(new r45.sp0());
    }

    @Override // dm.n3, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return F1;
    }

    /* renamed from: getLocalId */
    public long m150782x51f8f5b0() {
        return this.f67645x88be67a1;
    }

    /* renamed from: getType */
    public int m150783xfb85f7b0() {
        return this.f67657x2262335f;
    }

    public boolean t0() {
        return (this.f67640x5ab01132.f452511w & 1) != 0;
    }

    public boolean u0() {
        return (this.f67640x5ab01132.f452511w & 2) != 0;
    }

    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public o72.r2 m150781x5a5dd5d() {
        o72.r2 r2Var = new o72.r2();
        r2Var.f67640x5ab01132 = this.f67640x5ab01132;
        r2Var.f67650x85d9e03b = this.f67650x85d9e03b;
        r2Var.f67638x7d4eb57c = this.f67638x7d4eb57c;
        r2Var.f67639x4b6e4d5c = this.f67639x4b6e4d5c;
        r2Var.f67641x225ba391 = this.f67641x225ba391;
        r2Var.f67642xd3939c3a = this.f67642xd3939c3a;
        r2Var.f67643xc8a07680 = this.f67643xc8a07680;
        r2Var.f67644x3059914a = this.f67644x3059914a;
        r2Var.f67645x88be67a1 = this.f67645x88be67a1;
        r2Var.f67646x8f0eb299 = this.f67646x8f0eb299;
        r2Var.f67647xadb904e6 = this.f67647xadb904e6;
        r2Var.f67653xef67d413 = this.f67653xef67d413;
        r2Var.f67649xde813d09 = this.f67649xde813d09;
        r2Var.f67658x266f95d1 = this.f67658x266f95d1;
        r2Var.f67655x1209e7cb = this.f67655x1209e7cb;
        r2Var.f67659xa783a79b = this.f67659xa783a79b;
        r2Var.f67657x2262335f = this.f67657x2262335f;
        r2Var.f67660x4b6e9352 = this.f67660x4b6e9352;
        r2Var.f67637x73e2be56 = this.f67637x73e2be56;
        r2Var.B1 = this.B1;
        r2Var.C1 = this.C1;
        r2Var.D1 = this.D1;
        return r2Var;
    }

    public final void w0(java.lang.String str, o72.q2 q2Var) {
        q2Var.a("----dump favitem from[" + str + "] beg----");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("type: ");
        sb6.append(this.f67657x2262335f);
        q2Var.a(sb6.toString());
        q2Var.a("favId: " + this.f67643xc8a07680);
        q2Var.a("localId: " + this.f67645x88be67a1);
        q2Var.a("itemStatus: " + this.f67644x3059914a);
        q2Var.a("localSeq: " + this.f67646x8f0eb299);
        q2Var.a("updateSeq: " + this.f67658x266f95d1);
        q2Var.a("ctrlFlag: " + this.f67641x225ba391);
        q2Var.a("sourceId: " + this.f67650x85d9e03b);
        q2Var.a("sourceType: " + this.f67651x76e81a5a);
        q2Var.a("sourceCreateTime: " + this.f67649xde813d09);
        q2Var.a("updateTime: " + this.f67659xa783a79b);
        q2Var.a("editTime: " + this.f67638x7d4eb57c);
        q2Var.a("fromuser: " + this.f67642xd3939c3a);
        q2Var.a("toUser: " + this.f67655x1209e7cb);
        q2Var.a("realChatName: " + this.f67647xadb904e6);
        if (this.f67640x5ab01132 != null) {
            q2Var.a("remarktime: " + this.f67640x5ab01132.f452509u);
            q2Var.a("dataitemCount: " + this.f67640x5ab01132.f452497f.size());
            if (this.f67640x5ab01132.f452495d != null) {
                q2Var.a(" ----source item----");
                r45.jq0 jq0Var = this.f67640x5ab01132.f452495d;
                q2Var.a("  sourceType: " + jq0Var.f459567d);
                q2Var.a("  fromUser: " + jq0Var.f459569f);
                q2Var.a("  toUser: " + jq0Var.f459571h);
                q2Var.a("  sourceId: " + jq0Var.f459573m);
                q2Var.a("  realChatName: " + jq0Var.f459575o);
                q2Var.a("  createTime: " + jq0Var.f459577q);
                q2Var.a("  msgId: " + jq0Var.f459579s);
                q2Var.a("  eventId: " + jq0Var.f459581u);
                q2Var.a("  appId: " + jq0Var.f459583w);
                q2Var.a("  link: " + jq0Var.f459585y);
                q2Var.a("  mediaId: " + jq0Var.A);
                q2Var.a("  brandId: " + jq0Var.B);
            }
            java.util.Iterator it = this.f67640x5ab01132.f452497f.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                r45.gp0 gp0Var = (r45.gp0) it.next();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder(" ----data item ");
                int i18 = i17 + 1;
                sb7.append(i17);
                sb7.append("----");
                q2Var.a(sb7.toString());
                q2Var.a("  dataId: " + gp0Var.T);
                q2Var.a("  dataType: " + gp0Var.I);
                q2Var.a("  dataSouceId: " + gp0Var.f456979x1);
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("  desc: ");
                boolean b17 = q2Var.b();
                java.lang.String str2 = gp0Var.f456941f;
                if (!com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349() && b17) {
                    str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(str2);
                }
                sb8.append(str2);
                q2Var.a(sb8.toString());
                q2Var.a("  svrDataStatus: " + gp0Var.F1);
                q2Var.a("  notCheckThumbCDN: " + gp0Var.D1);
                q2Var.a("  cdnThumbUrl: " + gp0Var.f456945h);
                q2Var.a("  cdnThumbKey: " + gp0Var.f456953m);
                q2Var.a("  notCheckDataCDN: " + gp0Var.B1);
                q2Var.a("  cdnDataUrl: " + gp0Var.f456967s);
                q2Var.a("  cdnDataKey: " + gp0Var.f456971u);
                q2Var.a("  cdnEncryVer: " + gp0Var.f456975w);
                q2Var.a("  fullmd5: " + gp0Var.M);
                q2Var.a("  head256md5: " + gp0Var.P);
                q2Var.a("  fullsize: " + gp0Var.R);
                q2Var.a("  thumbMd5: " + gp0Var.Z);
                q2Var.a("  thumbHead256md5: " + gp0Var.f456978x0);
                q2Var.a("  thumbfullsize: " + gp0Var.f456951l1);
                q2Var.a("  duration: " + gp0Var.f456981y);
                q2Var.a("  datafmt: " + gp0Var.K);
                q2Var.a("  streamWebUrl: " + gp0Var.A);
                q2Var.a("  streamDataUrl: " + gp0Var.C);
                q2Var.a("  streamLowBandUrl: " + gp0Var.E);
                q2Var.a("  ext: " + gp0Var.G);
                q2Var.a("  msgUuid: " + gp0Var.f456964q2);
                if (gp0Var.J1 != null) {
                    q2Var.a("  remarktime: " + gp0Var.J1.f457894o);
                    q2Var.a("  ctrlflag: " + gp0Var.J1.f457896q);
                    q2Var.a("  edittime: " + gp0Var.J1.f457898s);
                    if (gp0Var.J1.f457886d != null) {
                        q2Var.a("   ----data source item----");
                        r45.ip0 ip0Var = gp0Var.J1.f457886d;
                        q2Var.a("    sourceType: " + ip0Var.f458762d);
                        q2Var.a("    fromUser: " + ip0Var.f458764f);
                        q2Var.a("    toUser: " + ip0Var.f458766h);
                        q2Var.a("    realChatName: " + ip0Var.f458770o);
                        q2Var.a("    createTime: " + ip0Var.f458772q);
                        q2Var.a("    msgId: " + ip0Var.f458774s);
                        q2Var.a("    eventId: " + ip0Var.f458776u);
                        q2Var.a("    appId: " + ip0Var.f458778w);
                        q2Var.a("    link: " + ip0Var.f458780y);
                        q2Var.a("    mediaId: " + ip0Var.A);
                        q2Var.a("    brandId: " + ip0Var.B);
                    }
                    y0("  ", q2Var, gp0Var.J1.f457887e);
                    F0("  ", q2Var, gp0Var.J1.f457888f);
                    A0("  ", q2Var, gp0Var.J1.f457889g);
                    D0("  ", q2Var, gp0Var.J1.f457890h);
                    z0("  ", q2Var, gp0Var.J1.f457900u);
                }
                i17 = i18;
            }
            y0("", q2Var, this.f67640x5ab01132.f452499h);
            F0("", q2Var, this.f67640x5ab01132.f452501m);
            A0("", q2Var, this.f67640x5ab01132.f452513y);
            D0("", q2Var, this.f67640x5ab01132.C);
            z0("  ", q2Var, this.f67640x5ab01132.G);
        }
        q2Var.a("----dump favitem end----");
    }
}
